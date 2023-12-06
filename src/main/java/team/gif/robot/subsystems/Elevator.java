// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class Elevator extends SubsystemBase {
  public TalonSRX CIM_motor = new TalonSRX(RobotMap.Elevator_Cim);
  /** Creates a new ExampleSubsystem. */
  public Elevator()  {
    CIM_motor.configFactoryDefault();
    CIM_motor.setNeutralMode(NeutralMode.Brake);
    CIM_motor.setSensorPhase(true);
    CIM_motor.setInverted(true);
    CIM_motor.configSelectedFeedbackSensor(TalonSRXFeedbackDevice.CTRE_MagEncoder_Absolute.toFeedbackDevice());
    CIM_motor.configMotionCruiseVelocity(500*10);
    CIM_motor.configMotionAcceleration(10000);
    CIM_motor.setSelectedSensorPosition(0.0);
  }


  public double Get_Encoder_Position(){
    return CIM_motor.getSelectedSensorPosition();
  }
  public void turnPercent(double output) {
    double pos = Get_Encoder_Position();
    /** if elevator position is above max and trying to go up, set output to 0
        or if elevator position is below min trying to go down, set output to 0
      */
    if ((Constants.Elevator.ELEVATOR_MAX < pos && 0 < output) || (pos < Constants.Elevator.ELEVATOR_MIN && output < 0)) output = 0;
    CIM_motor.set(ControlMode.PercentOutput, output);
  }

  public void moveToPosition(double position) {
    CIM_motor.set(ControlMode.Position, position);
  }
}

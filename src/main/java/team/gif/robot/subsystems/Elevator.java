// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Elevator extends SubsystemBase {
  public TalonSRX CIM_motor = new TalonSRX(RobotMap.Elevator_Cim);
  /** Creates a new ExampleSubsystem. */

private final double MAX = 10;
private final double MIN = 0;

  public Elevator()  {
    CIM_motor.configFactoryDefault();
    CIM_motor.setNeutralMode(NeutralMode.Brake);
    CIM_motor.setSensorPhase(true);
    CIM_motor.configSelectedFeedbackSensor(TalonSRXFeedbackDevice.CTRE_MagEncoder_Absolute.toFeedbackDevice());
  }


  public double Get_Encoder_Position(){
    return CIM_motor.getSelectedSensorPosition();
  }
  public void Motor_Turn(double output) {
    double pos = Get_Encoder_Position();
    if (pos < MAX && pos > MIN){
      CIM_motor.set(TalonSRXControlMode.PercentOutput,output);
    }



  }
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

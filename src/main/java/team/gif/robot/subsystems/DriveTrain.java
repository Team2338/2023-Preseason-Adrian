// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
  private TalonSRX Motor_L = new TalonSRX(RobotMap.Drive_Cim_L);
  private TalonSRX Motor_R = new TalonSRX(RobotMap.Drive_Cim_R);

  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {

  }

  public void Drive(double left, double right) {
    Motor_L.set(TalonSRXControlMode.PercentOutput, left);
    Motor_R.set(TalonSRXControlMode.PercentOutput, right);
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
  private WPI_TalonSRX Motor_L = new WPI_TalonSRX(RobotMap.Drive_Cim_L);
  private WPI_TalonSRX Motor_R = new WPI_TalonSRX(RobotMap.Drive_Cim_R);

  private DifferentialDrive drive = new DifferentialDrive(Motor_L,Motor_R);
  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {}

  public void tankDrive(double left, double right) {
    drive.tankDrive(left,right);
  }
  public void arcadeDrive(double left,double right) {
    drive.arcadeDrive(right,left);
  }
}

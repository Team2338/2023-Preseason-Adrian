// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class DriveTrain extends SubsystemBase {
  public static WPI_TalonSRX Motor_L = new WPI_TalonSRX(RobotMap.DRIVE_CIM_L);
  public static WPI_TalonSRX Motor_R = new WPI_TalonSRX(RobotMap.DRIVE_CIM_R);
  private static DifferentialDrive drive;

  /** Creates a new ExampleSubsystem. */
  public DriveTrain() {
    drive = new DifferentialDrive(Motor_L,Motor_R);
    Motor_L.configFactoryDefault();
    Motor_R.configFactoryDefault();

    Motor_L.setNeutralMode(NeutralMode.Brake);
    Motor_R.setNeutralMode(NeutralMode.Brake);

    // turn off the drive train watchdog - otherwise it outputs unnecessary errors on the console
    drive.setSafetyEnabled(false);

    Robot.pigeon.resetPigeonPosition();
  }
  public void Arcade(double sp,double ro){
    drive.arcadeDrive(sp,ro);
  }
  public void Tank(double left, double right) {
    //Motor_L.set(TalonSRXControlMode.PercentOutput, left);
    //Motor_R.set(TalonSRXControlMode.PercentOutput, right);
    drive.tankDrive(left,right);
  }
}

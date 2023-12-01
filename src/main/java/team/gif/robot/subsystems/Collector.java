// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Collector extends SubsystemBase {
  public TalonSRX Bag_Motor = new TalonSRX(RobotMap.Collector_Bags);

  /** Creates a new ExampleSubsystem. */
  public Collector() {

  }

  public void Turn(Double Output){
    Bag_Motor.set(TalonSRXControlMode.PercentOutput,Output);
  }

}

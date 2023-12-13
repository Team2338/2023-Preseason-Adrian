package team.gif.robot.commands.Autos.Drive;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.commands.drivetrain.TankDrive;

public class DriveSequence extends SequentialCommandGroup {
    public DriveSequence(){
       addCommands(
               new TankForTime(0.2,0.2,3),
               new TankForTime(-0.2,0.2,5),
               new TankForTime(-0.2,-0.2,3)
       );
    }
}

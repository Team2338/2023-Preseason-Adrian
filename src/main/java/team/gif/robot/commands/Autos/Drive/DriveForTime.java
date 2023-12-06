package team.gif.robot.commands.Autos.Drive;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class DriveForTime extends SequentialCommandGroup {
    public DriveForTime(double time){
        if (Timer.getMatchTime() <= time) {
            new Drive();
        }
    }
}

package team.gif.robot.commands.Autos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.Constants;
import team.gif.robot.commands.Autos.Collect.CollectOut;
import team.gif.robot.commands.Autos.Drive.Forward;
import team.gif.robot.commands.elevator.SetElevatorPosition;

public class PlaceCrate extends SequentialCommandGroup {

    public PlaceCrate() {
        addCommands(
                new SetElevatorPosition(Constants.Elevator.MAX),
                new Forward(10),
                new CollectOut()
        );
    }
}

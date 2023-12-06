package team.gif.robot.commands.Autos;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class CollectorPlace extends CommandBase {
    double target;
    public CollectorPlace() {
        super();
        addRequirements(Robot.elevator);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        //System.out.println("run");
        Robot.elevator.moveToPosition(Constants.Elevator.ELEVATOR_MAX);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }
    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
}

package team.gif.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Globals;
import team.gif.robot.OI;
import team.gif.robot.Robot;

public class Tank_Drive extends CommandBase {

    public Tank_Drive() {
        super();
        addRequirements(Robot.drivetrain);//addRequirements(Robot.climber); // uncomment
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {


        if(Globals.ArcadeDrive){
            Robot.drivetrain.Arcade(OI.driver.getRightY(),OI.driver.getLeftX());
        }else{
            Robot.drivetrain.Tank(-OI.driver.getRightY(),OI.driver.getLeftY());
        }
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

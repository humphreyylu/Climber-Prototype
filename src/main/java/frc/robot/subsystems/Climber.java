package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase{
    private CANSparkMax climberSpark;

    public Climber() {
        climberSpark = new CANSparkMax(0, MotorType.kBrushless);
        
    }

    public CANSparkMax getClimberSpark() {
        return climberSpark;
    }
}

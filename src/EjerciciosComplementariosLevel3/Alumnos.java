package EjerciciosComplementariosLevel3;

import java.time.LocalDate;

public class Alumnos {
    private String name;
    private String surname;
    private LocalDate birthday;

    public Alumnos(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public LocalDate getBirthday() {
        return birthday;
    }}
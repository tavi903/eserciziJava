package model;

import java.util.Optional;

public class StudenteOptional {

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<< ATTRIBUTES >>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private Optional<Integer> matricola;
    private boolean isMale;

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<< CONSTRUCTORS >>>>>>>>>>>>>>>>>>>>>>>>>>


    public StudenteOptional() {
        this.matricola = Optional.empty();
        this.isMale = false;
    }

    public StudenteOptional(Optional<Integer> matricola, boolean isMale) {
        this.matricola = matricola;
        this.isMale = isMale;
    }


    // <<<<<<<<<<<<<<<<<<<<<<<<<<<< METHODS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public Optional<Integer> getMatricola() {
        return matricola;
    }

    public void setMatricola(Optional<Integer> matricola) {
        this.matricola = matricola;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}

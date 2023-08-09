package org.example.core.control;

import org.example.core.model.Model;

public class Vers implements Control{

    @Override
    public void execute(String input) {
        new Model(input);
    }
}

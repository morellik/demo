package com.example.demo.Command;

import lombok.Data;

@Data
public class FormCommand {

    String textField;

    String textareaField;

    String datetimeField;

    String colorField;

    boolean singleCheckboxField;

    String[] multiCheckboxSelectedValues;

    String radioButtonSelectedValue;
    String dropdownSelectedValue;
}

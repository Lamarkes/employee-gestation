package Enums;

public enum MessageEnum {

    EMPLOYEE_UPDATE_SUCESS_MESSAGE("Employee updated successfully!"),
    EMPLOYEE_NOT_FOUND_MESSAGE("Employee not found!"),
    EMPLOYEE_REMOVED_SUCESS_MESSAGE("Employee removed successfully."),

    FAILED_ADD_EMPLOYEE("Failed to add employee to the list!"),
    INDEX_ERROR_MESSAGE("Invalid index."),
    EMPTY_LIST_MESSAGE("The list is empty.");

    private final String mensage;

    MessageEnum(String mesage){
        this.mensage = mesage;
    }

    public String getMensage(){
        return mensage;
    }
}

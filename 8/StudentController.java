@RequestMapping(method = RequestMethod.POST)
public String submitForm(@ModelAttribute("student") StudentVO studentVO,
                        BindingResult result, SessionStatus status) 
{
    //Validation code start
    boolean error = false;
     
    System.out.println(studentVO); //Verifying if information is same as input by user
     
    if(studentVO.getFirstName().isEmpty()){
        result.rejectValue("firstName", "error.firstName");
        error = true;
    }
     
    if(studentVO.getLastName().isEmpty()){
        result.rejectValue("lastName", "error.lastName");
        error = true;
    }
     
    if(studentVO.getEmail().isEmpty()){
        result.rejectValue("email", "error.email");
        error = true;
    }
     
    if(error) {
        return "addStudent";
    }
    status.setComplete();
    return "redirect:addNew/success";
}
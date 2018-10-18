package com.fdmgroup;

public class LoginController {
	
	private View view;
	private Validator validator;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginController(View view, Validator validator) {
		super();
		this.view = view;
		this.validator = validator;
	}
	
	public void handle(){
		String input = view.getUserInput();
		boolean result = validator.validate(input);
		System.out.println(input + " ----------------->" + result);
	}
}

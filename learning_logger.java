@GetMapping("/logins")
	
	public List<Login> getLogins(){
		
		log.info("Geting all the login details of all");
		//running
		return this.loginService.getLogins();
	}
	
	@GetMapping("/logins/{loginId}")
	public Login getLogin(@PathVariable String loginId) {
		
		//logger entry
		log.info("Geting details of "+ loginId);
		//doubt edited and running
		
		return this.loginService.getLogin(Long.parseLong(loginId));
	}
	
	@PostMapping("/logins")
	public Login addLogin(@Valid @RequestBody Login login) {
		
		log.info("Posting new details which are"+ login );
		//running
		return this.loginService.addLogin(login);
	}
	
	@PutMapping("/logins")
	public Login updateLogin(@RequestBody Login login) {
		log.info("Editing the details of an login "+ login );
		//running

		
		return this.loginService.updateLogin(login);
	}
	
	@DeleteMapping("logins/{loginId}")
	public ResponseEntity<HttpStatus> deleteLogin(@PathVariable String loginId){
		log.info("Deleted Endpoint of id number " + loginId+" is being deleted ");
		//running
		try {
			this.loginService.deleteLogin(Long.parseLong(loginId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

package com.kangdonghun.app;

import com.kangdonghun.app.entity.*;
import com.kangdonghun.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private PersonRepository personRepository;
	private SocialMediaRepository socialMediaRepository;
	private InterestsRepository interestsRepository;
	private SkillRepository skillRepository;
	private WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	public AppApplication(InterestsRepository interestsRepository){
		this.interestsRepository=interestsRepository;
	}
	public AppApplication(SocialMediaRepository socialMediaRepository){
		this.socialMediaRepository=socialMediaRepository;
	}
	public AppApplication(SkillRepository skillRepository){
		this.skillRepository=skillRepository;
	}
	public AppApplication(WorkRepository workRepository) {
		this.workRepository=workRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("강동훈", "데이터 분석", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous","anonymous"));
		interestsRepository.save(new Interests("컴퓨터"));
		//skillRepository.save(new Skill("English"));
		workRepository.save(new Work("web","kakao","8","??"));
	}
}
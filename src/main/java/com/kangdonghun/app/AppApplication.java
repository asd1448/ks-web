package com.kangdonghun.app;
import com.kangdonghun.app.entity.*;
import com.kangdonghun.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository,InterestsRepository interestsRepository,SkillRepository skillRepository,WorkRepository workRepository){
		this.personRepository=personRepository;
		this.socialMediaRepository=socialMediaRepository;
		this.interestsRepository=interestsRepository;
		this.skillRepository=skillRepository;
		this.workRepository=workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("강동훈","웹프로그래밍","hello@test.com","010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("https://www.github.com/anonymous","https://www.twitter.com/anonymous"));
		interestsRepository.save(new Interests("독서,컴퓨터"));
		skillRepository.save(new Skill("Skill",80));
		workRepository.save(new Work("position","company","time","desc"));
	}
}
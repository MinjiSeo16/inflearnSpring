package hello.hello_spring;

import hello.hello_spring.Service.MemberService;
import hello.hello_spring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    // private DataSource dataSource;
    // private EntityManager em;

    /*
    @Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }
     */

    /*
    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
     */

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    /*
    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }
    */

    /*
    @Bean
    public MemberRepository memberRepository(){
        // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource);
        // return new JdbcTemplateMemberRespository(dataSource);
        // return new JpaMemberRepository(em);

    }
     */

}

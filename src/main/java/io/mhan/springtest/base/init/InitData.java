package io.mhan.springtest.base.init;

import io.mhan.springtest.post.Post;
import io.mhan.springtest.post.PostRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class InitData {

    @Bean
    @Profile({"default", "dev"})
    public ApplicationRunner devData(PostRepository postRepository) {
        return args -> {
            Post post = new Post();
            postRepository.save(post);
        };
    }
}

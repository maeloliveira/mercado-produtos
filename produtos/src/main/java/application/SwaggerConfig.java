package application;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiUtil() {
        return new OpenAPI().info(new Info().title("Mercado de produtos API").version("1.0.0"));
    }

//    @Bean
//    public Docket docket() {
//        return new Docket(DocumentationType.SWAGGER_2);
//    }
//
//    private ApiInfo apiInfo() {
//       return new ApiInfoBuilder()
//                .title("Mercado de produtos")
//                .description("Venda de produtos")
//                .version("1.0.0")
//                .contact(contact())
//                .build();
//    }
//
//    private Contact contact() {
//        return new Contact("Ismael Oliveira",
//                "www.mael-mkt.com.br",
//                "ismael.oliveira@mael-mkt.com.br");
//    }


}

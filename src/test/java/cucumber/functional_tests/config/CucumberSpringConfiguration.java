package cucumber.functional_tests.config;

import fr.insee.genesis.GenesisApi;
import fr.insee.genesis.infrastructure.repository.DataProcessingContextMongoDBRepository;
import fr.insee.genesis.infrastructure.repository.EditedExternalResponseMongoDBRepository;
import fr.insee.genesis.infrastructure.repository.EditedPreviousResponseMongoDBRepository;
import fr.insee.genesis.infrastructure.repository.LunaticJsonMongoDBRepository;
import fr.insee.genesis.infrastructure.repository.LunaticModelMongoDBRepository;
import fr.insee.genesis.infrastructure.repository.RundeckExecutionDBRepository;
import fr.insee.genesis.infrastructure.repository.SurveyUnitMongoDBRepository;
import fr.insee.genesis.infrastructure.repository.VariableTypeMongoDBRepository;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@CucumberContextConfiguration
@SpringBootTest(classes = GenesisApi.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test-cucumber")
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class CucumberSpringConfiguration {
    @MockitoBean
    private MongoTemplate mongoTemplate;
    @MockitoBean
    private SurveyUnitMongoDBRepository surveyUnitMongoDBRepository;
    @MockitoBean
    private LunaticJsonMongoDBRepository lunaticJsonMongoDBRepository;
    @MockitoBean
    private RundeckExecutionDBRepository rundeckExecutionDBRepository;
    @MockitoBean
    private VariableTypeMongoDBRepository variableTypeMongoDBRepository;
    @MockitoBean
    private LunaticModelMongoDBRepository lunaticModelMongoDBRepository;
    @MockitoBean
    private DataProcessingContextMongoDBRepository dataProcessingContextMongoDBRepository;
    @MockitoBean
    private EditedPreviousResponseMongoDBRepository editedPreviousResponseMongoDBRepository;
    @MockitoBean
    private EditedExternalResponseMongoDBRepository editedExternalResponseMongoDBRepository;
}


# Andorid_Mockito_Test

Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications. Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing. This tutorial should help you learn how to create unit tests with Mockito as well as how to use its APIs in a simple and intuitive way.

### JUnit:
It is the test rule swaps the background executor used by the architecture components with a different one which executes each task synchronously.

Mock objects do the mocking of the real service. A mock objects returns a dummy data corresponding to some dummy input passed to it.

We have 2 methods mock() and spy() that can be sued to create mock methods or fields. Mock is the fack or dummy objects. Spy is the real objects.

@Mock is used for mock creation. It makes the test class more readable. @Spy is used to create a spy instance. we can used it instead of spy(object) method.

@InjectMocks is used to instantiate the tested object automatically and inject all the @Mock or @Spy annotated field dependencies into it.

@Captor is used to create an argument captor.

MockitoAnnotations.initMocks(test class) It must be used to atlease once. To process annotations we can use the built-in runner MockitoJUnitRunner or rule MockitoRule. The code as below
     
     @Runwith(MockitoJunitRunner.class)

 when(): It is used to configure simple return behaviour for a mock or spy object.
 
 doReturn(): It is used when we want to retrun a specific value when calling a method on a mock object.The mock mehtod is called in case of both mock & spy objects. doReturn() also be used with method that dont return any value
 
 thenReturn(): This method lets you define the return value when a particular method of the mocked object is been called.
 
    @RunWith(MockitoJUnitRunner.class)
    public class RealRepositoryTest {

    @Spy
    RealRepository realRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Test
    public void getRealData() {

        doReturn(realRepository.getRealData()).when(realRepository).getRealData();

        System.out.println(realRepository.getRealData());
    }

    @Test
    public void getMutableLiveData()
    {
        when(realRepository.getMutableLiveData("kathir ","kathir@gmail.com")).thenReturn(realRepository.mutableLiveData);
        System.out.println(realRepository.mutableLiveData.getValue());
    }

    }

Starting Gradle Daemon...
Gradle Daemon started in 3 s 955 ms

> Task :compileJava UP-TO-DATE
> Task :processResources UP-TO-DATE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
09:44:36.145 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
09:44:36.209 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
09:44:36.354 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.praveen.persistance.repository.PlanetRepositoryTest] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
09:44:36.675 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.praveen.persistance.repository.PlanetRepositoryTest], using SpringBootContextLoader
09:44:36.683 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.praveen.persistance.repository.PlanetRepositoryTest]: class path resource [com/praveen/persistance/repository/PlanetRepositoryTest-context.xml] does not exist
09:44:36.684 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.praveen.persistance.repository.PlanetRepositoryTest]: class path resource [com/praveen/persistance/repository/PlanetRepositoryTestContext.groovy] does not exist
09:44:36.685 [Test worker] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.praveen.persistance.repository.PlanetRepositoryTest]: no resource found for suffixes {-context.xml, Context.groovy}.
09:44:36.686 [Test worker] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.praveen.persistance.repository.PlanetRepositoryTest]: PlanetRepositoryTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
09:44:36.897 [Test worker] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.praveen.persistance.repository.PlanetRepositoryTest]
09:44:37.087 [Test worker] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/praveen/IdeaProjects/jpaconverters/build/classes/java/main/com/praveen/persistance/JpaConvertersApplication.class]
09:44:37.089 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.praveen.persistance.JpaConvertersApplication for test class com.praveen.persistance.repository.PlanetRepositoryTest
09:44:37.451 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.praveen.persistance.repository.PlanetRepositoryTest]: using defaults.
09:44:37.452 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
09:44:37.727 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@5bd1ceca, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@30c31dd7, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@499b2a5c, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@596df867, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@c1fca1e, org.springframework.test.context.support.DirtiesContextTestExecutionListener@241a53ef, org.springframework.test.context.transaction.TransactionalTestExecutionListener@344344fa, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@2db2cd5, org.springframework.test.context.event.EventPublishingTestExecutionListener@70e659aa, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@615f972, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@285f09de, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@73393584, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@31500940, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@1827a871, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@48e64352]
09:44:37.734 [Test worker] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@1734f68 testClass = PlanetRepositoryTest, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@77b7ffa4 testClass = PlanetRepositoryTest, locations = '{}', classes = '{class com.praveen.persistance.JpaConvertersApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@57ac5227, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@a4ca3f6, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@b6b1987, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@66b7550d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@77a98a6a, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@415b0b49], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v2.6.4)

2022-03-14 09:44:39.668  INFO 5576 --- [    Test worker] c.p.p.repository.PlanetRepositoryTest    : Starting PlanetRepositoryTest using Java 11.0.12 on localhost.localdomain with PID 5576 (started by praveen in /home/praveen/IdeaProjects/jpaconverters)
2022-03-14 09:44:39.670  INFO 5576 --- [    Test worker] c.p.p.repository.PlanetRepositoryTest    : No active profile set, falling back to 1 default profile: "default"
2022-03-14 09:44:45.263  INFO 5576 --- [    Test worker] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-03-14 09:44:45.477  INFO 5576 --- [    Test worker] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 200 ms. Found 1 JPA repository interfaces.
2022-03-14 09:44:47.159  INFO 5576 --- [    Test worker] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-03-14 09:44:50.034  INFO 5576 --- [    Test worker] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-03-14 09:44:50.316  INFO 5576 --- [    Test worker] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-03-14 09:44:50.602  INFO 5576 --- [    Test worker] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.5.Final
2022-03-14 09:44:51.226  INFO 5576 --- [    Test worker] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2022-03-14 09:44:51.916  INFO 5576 --- [    Test worker] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.PostgreSQL10Dialect
2022-03-14 09:44:53.505  INFO 5576 --- [    Test worker] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-03-14 09:44:53.530  INFO 5576 --- [    Test worker] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-03-14 09:44:54.225  WARN 5576 --- [    Test worker] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-03-14 09:44:56.557  INFO 5576 --- [    Test worker] c.p.p.repository.PlanetRepositoryTest    : Started PlanetRepositoryTest in 18.517 seconds (JVM running for 25.757)
Hibernate:
select
nextval ('hibernate_sequence')

No enum constant com.praveen.persistance.constants.Planet.[VENUS; nested exception is java.lang.IllegalArgumentException: No enum constant com.praveen.persistance.constants.Planet.[VENUS
org.springframework.dao.InvalidDataAccessApiUsageException: No enum constant com.praveen.persistance.constants.Planet.[VENUS; nested exception is java.lang.IllegalArgumentException: No enum constant com.praveen.persistance.constants.Planet.[VENUS
at app//org.springframework.orm.jpa.EntityManagerFactoryUtils.convertJpaAccessExceptionIfPossible(EntityManagerFactoryUtils.java:374)
at app//org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:235)
at app//org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)
at app//org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)
at app//org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)
at app//org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)
at app//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at app//org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:174)
at app//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at app//org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)
at app//org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at app//org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)
at app//com.praveen.persistance.repository.$Proxy114.saveAll(Unknown Source)
at app//com.praveen.persistance.repository.PlanetRepositoryTest.savePlanets(PlanetRepositoryTest.java:31)
at java.base@11.0.12/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base@11.0.12/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base@11.0.12/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base@11.0.12/java.lang.reflect.Method.invoke(Method.java:566)
at app//org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)
at app//org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
at app//org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
at app//org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
at app//org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
at app//org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
at app//org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
at app//org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
at app//org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
at app//org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
at app//org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
at app//org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
at app//org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
at app//org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
at app//org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)
at app//org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)
at app//org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
at app//org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
at java.base@11.0.12/java.util.ArrayList.forEach(ArrayList.java:1541)
at app//org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
at app//org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
at java.base@11.0.12/java.util.ArrayList.forEach(ArrayList.java:1541)
at app//org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
at app//org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
at app//org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
at app//org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
at app//org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
at app//org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
at app//org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:108)
at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:96)
at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:75)
at org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor$CollectAllTestClassesExecutor.processAllTestClasses(JUnitPlatformTestClassProcessor.java:99)
at org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor$CollectAllTestClassesExecutor.access$000(JUnitPlatformTestClassProcessor.java:79)
at org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestClassProcessor.stop(JUnitPlatformTestClassProcessor.java:75)
at org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.stop(SuiteTestClassProcessor.java:61)
at java.base@11.0.12/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base@11.0.12/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base@11.0.12/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base@11.0.12/java.lang.reflect.Method.invoke(Method.java:566)
at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:36)
at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
at org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:33)
at org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:94)
at com.sun.proxy.$Proxy2.stop(Unknown Source)
at org.gradle.api.internal.tasks.testing.worker.TestWorker$3.run(TestWorker.java:193)
at org.gradle.api.internal.tasks.testing.worker.TestWorker.executeAndMaintainThreadName(TestWorker.java:129)
at org.gradle.api.internal.tasks.testing.worker.TestWorker.execute(TestWorker.java:100)
at org.gradle.api.internal.tasks.testing.worker.TestWorker.execute(TestWorker.java:60)
at org.gradle.process.internal.worker.child.ActionExecutionWorker.execute(ActionExecutionWorker.java:56)
at org.gradle.process.internal.worker.child.SystemApplicationClassLoaderWorker.call(SystemApplicationClassLoaderWorker.java:133)
at org.gradle.process.internal.worker.child.SystemApplicationClassLoaderWorker.call(SystemApplicationClassLoaderWorker.java:71)
at app//worker.org.gradle.process.internal.worker.GradleWorkerMain.run(GradleWorkerMain.java:69)
at app//worker.org.gradle.process.internal.worker.GradleWorkerMain.main(GradleWorkerMain.java:74)
Caused by: java.lang.IllegalArgumentException: No enum constant com.praveen.persistance.constants.Planet.[VENUS
at java.base/java.lang.Enum.valueOf(Enum.java:240)
at com.praveen.persistance.constants.Planet.valueOf(Planet.java:6)
at com.praveen.persistance.entity.PlanetConverter.lambda$convertToEntityAttribute$0(PlanetConverter.java:24)
at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)
at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
at com.praveen.persistance.entity.PlanetConverter.convertToEntityAttribute(PlanetConverter.java:25)
at com.praveen.persistance.entity.PlanetConverter.convertToEntityAttribute(PlanetConverter.java:12)
at org.hibernate.metamodel.model.convert.internal.JpaAttributeConverterImpl.toDomainValue(JpaAttributeConverterImpl.java:45)
at org.hibernate.type.descriptor.converter.AttributeConverterMutabilityPlanImpl.deepCopyNotNull(AttributeConverterMutabilityPlanImpl.java:33)
at org.hibernate.type.descriptor.java.MutableMutabilityPlan.deepCopy(MutableMutabilityPlan.java:35)
at org.hibernate.type.AbstractStandardBasicType.deepCopy(AbstractStandardBasicType.java:308)
at org.hibernate.type.AbstractStandardBasicType.deepCopy(AbstractStandardBasicType.java:304)
at org.hibernate.type.TypeHelper.deepCopy(TypeHelper.java:55)
at org.hibernate.event.internal.AbstractSaveEventListener.performSaveOrReplicate(AbstractSaveEventListener.java:279)
at org.hibernate.event.internal.AbstractSaveEventListener.performSave(AbstractSaveEventListener.java:193)
at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:135)
at org.hibernate.event.internal.DefaultPersistEventListener.entityIsTransient(DefaultPersistEventListener.java:185)
at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:128)
at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:55)
at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:107)
at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:760)
at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:746)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:566)
at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:311)
at com.sun.proxy.$Proxy111.persist(Unknown Source)
at org.springframework.data.jpa.repository.support.SimpleJpaRepository.save(SimpleJpaRepository.java:637)
at org.springframework.data.jpa.repository.support.SimpleJpaRepository.saveAll(SimpleJpaRepository.java:671)
at org.springframework.data.jpa.repository.support.SimpleJpaRepository.saveAll(SimpleJpaRepository.java:84)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.base/java.lang.reflect.Method.invoke(Method.java:566)
at org.springframework.data.repository.core.support.RepositoryMethodInvoker$RepositoryFragmentMethodInvoker.lambda$new$0(RepositoryMethodInvoker.java:289)
at org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:137)
at org.springframework.data.repository.core.support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:121)
at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:529)
at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:285)
at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:639)
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:163)
at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:138)
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:80)
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123)
at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:388)
at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119)
at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)
... 91 more


2022-03-14 09:44:58.697  INFO 5576 --- [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2022-03-14 09:44:58.704  INFO 5576 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2022-03-14 09:44:58.865  INFO 5576 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
PlanetRepositoryTest > savePlanets() FAILED
org.springframework.dao.InvalidDataAccessApiUsageException at PlanetRepositoryTest.java:31
Caused by: java.lang.IllegalArgumentException at PlanetRepositoryTest.java:31
1 test completed, 1 failed
> Task :test FAILED
FAILURE: Build failed with an exception.
* What went wrong:
  Execution failed for task ':test'.
> There were failing tests. See the report at: file:///home/praveen/IdeaProjects/jpaconverters/build/reports/tests/test/index.html
* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
* Get more help at https://help.gradle.org
  BUILD FAILED in 1m 2s
  4 actionable tasks: 1 executed, 3 up-to-date

for commit on 26 April 2025:
added the new pom to adjust the stable spring boot version instead M2
--------------------------------------------------------------- modalMapper --------------------------------------------------------------------------------------
step 1 -> visit official site of modalMapper
step 2 -> copy the dependency and paste to your classpath i.e pom
step 3 -> in Service class we can include modalMapper object using new keyword to use this library methods but instead define modalmapper bean in main sprinboot class 
          so that we can call without using new spring will take care.
step 4 -> inject modalMapper object to Service class.
          * if we have only one parameterized constructor in class then we can omit using @Autowired *
step 5 -> make use of this library.

------------------- ------------------------------------------- mapStruct ----------------------------------------------------------------------------------------
step 1 -> visit mapStruct official site -> documentation
step 2 -> copy dependency -> copy version and paste in properties section in pom 
          * always choose Final version ex 1.5.5.Final to work correctly and not break in intellije as in official site recent version might be there without 
          Final tag as these version still are in development intellije might break and give error in AutoMapper interface (in @Mapper annotations).
          1.6.3 is the latest version on Maven Central but it 
          ⚠️ It’s not a stable Final release.
           MapStruct doesn’t use -RC, -M1 tags like Spring — but the fact that there is no 1.6.3.Final, and it’s frequently updated with breaking changes, means
           it’s under active development.
step 3 -> we also need to copy the plugin but as we are using lombok in our application we need to add mode config as to support lombok.
          go to Examples -> mapStruct lombok -> copy all this plugin i.e under maven compiler plugin ---> change the version of sorce and target to 17 from 1.8
          paste this in your pom's plugin tag.
step 4 -> create the AutoMapper interface and define the methods, no need to provide implementation of those methods as mapStruct lib will take care of this
          it will generate a code for us.
step 5 -> make use of this library.


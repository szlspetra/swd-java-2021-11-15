# Selenium Java oktatás
## POM.XML 
* dependencies: https://search.maven.org/
	* selenium-java: Selenium function-ök
	* org.junit.jupiter: junit
	* webdrivermanager: driverek (kezeli a verziókat)
	* rerunner jupiter: teszteseteket újra tudja futtatni
	* slf4j-api: logolás
 	* logback-classic: logolás
	* jul-to-slf4j: logolás
	* lombok: logolás
	* rerunner-jupiter: teszteset automatikus újrafuttatása

## Módszertanok
* clean code könyv
* Annotációk
	* Egy böngészőben fusson le az osztály metódusa: @BeforeAll-ba driver hívás
	* Minden tesztesethez külön böngésző: @BeforeEach

## Github
* github authentikáció: jelszó helyett tokent kell generálni: github/Settings/Personal access token

## Plugins
* Surfire: junit teszteseteket (v5) automatikusan újra tudja futtatni, ha assert/exception jön
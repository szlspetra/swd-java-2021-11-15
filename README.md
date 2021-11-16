# Selenium Java oktatás
## POM.XML 
* dependencies: https://search.maven.org/
	* rerunner jupiter: teszteseteket újra tudja futtatni

## Módszertanok
* clean code könyv
* Annotációk
	* Egy böngészőben fusson le az osztály metódusa: @BeforeAll-ba driver hívás
	* Minden tesztesethez külön böngésző: @BeforeEach

## Github
* github authentikáció: jelszó helyett tokent kell generálni: github/Settings/Personal access token

##Plugins
* Surfire: junit teszteseteket (v5) automatikusan újra tudja futtatni, ha assert/exception jön
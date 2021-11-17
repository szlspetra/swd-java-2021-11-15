# Selenium Java oktatás
## Git repo létrehozása
C:\Users\Training>cd C:\training\swd-java-2021-11-15

C:\training\swd-java-2021-11-15>git init
Initialized empty Git repository in C:/training/swd-java-2021-11-15/.git/

C:\training\swd-java-2021-11-15>git add .

C:\training\swd-java-2021-11-15> git config --global user.email szls.petra@gmail.com

C:\training\swd-java-2021-11-15> git config --global user.name "szlspetra"

C:\training\swd-java-2021-11-15>git commit -m "First commit with index.html"
[master (root-commit) 6c2406f] First commit with index.html
 1 file changed, 5 insertions(+)
 create mode 100644 docs/index.html

C:\training\swd-java-2021-11-15>git remote add origin https://github.com/szlspetra/swd-java-2021-11-15.git

C:\training\swd-java-2021-11-15>git push origin master

## **Files**
**docs**
* A mappában lévő *index.html* megnyitható a github repo/settings/pages-nél látható URL-en keresztül
* Pl.: https://szlspetra.github.io/swd-java-2021-11-15/welcome/index.html URL azért jön létre, mert a docs könyvtárban létezik /welcome/index.html állomány

**src**
*forráskódok
* main almappa: prod kód
* test aémappa: teszt kód

**.gitignore**
* Az itt lévő állományokat nem veszi figyelembe a git

**POM.XML**
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

**/src/test/resources/logback.xml**
* logolási szintet és tartalmat konfigurálhatunk
* <logger .../> tagbe bele kell írni a page-eket

**locations/docker-compose.yml**
*docker compose up paranccsal futtatható
*program telepítése lehetséges egy parancssorból

## Módszertanok
* clean code könyv
* Annotációk
	* Egy böngészőben fusson le az osztály metódusa: @BeforeAll-ba driver hívás
	* Minden tesztesethez külön böngésző: @BeforeEach

## Github
* github authentikáció: jelszó helyett tokent kell generálni: github/Settings/Personal access token

## Plugins
* Surfire: junit teszteseteket (v5) automatikusan újra tudja futtatni, ha assert/exception jön
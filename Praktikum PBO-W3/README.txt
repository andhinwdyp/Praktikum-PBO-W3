Tugas 2 - Pengelolaan Tugas Harian Mahasiswa (Packages, static, relations)

Struktur project (source):
/mnt/data/Tugas02_Polban_Package/src/id/ac/polban/model/*.java
/mnt/data/Tugas02_Polban_Package/src/id/ac/polban/service/*.java

Cara compile (dari root folder of project):
1) Compile sources to classes:
   cd /mnt/data/Tugas02_Polban_Package
   javac -d out src/id/ac/polban/model/*.java src/id/ac/polban/service/*.java

2) Buat JAR (tugas-harian.jar) dari folder out:
   cd out
   jar cvf tugas-harian.jar id/ac/polban/model/*.class id/ac/polban/service/*.class
   (atau: jar cvf tugas-harian.jar -C out .)

3) Jalankan aplikasi dari jar:
   java -cp tugas-harian.jar id.ac.polban.service.App

Alternatif (compile & run in one go):
   javac -d out src/id/ac/polban/model/*.java src/id/ac/polban/service/*.java && java -cp out id.ac.polban.service.App

Catatan: Pastikan JDK (javac, jar) tersedia di PATH.

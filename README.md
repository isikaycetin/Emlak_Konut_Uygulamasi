# Emlak_Konut_Uygulamas-


## Kodun Amacı

Bu Java projesi, çeşitli konut türlerini temsil eden sınıflar içermektedir. Projede, "Daire", "Bina", "EvSahibi" ve "Kiraci" adında sınıflar bulunmaktadır. Her bir sınıf, belirli bir konut türünü temsil etmekte ve bu konutlara ait bilgileri içermektedir. "Daire" sınıfı, bir apartman dairesini temsil eder ve apartman numarasına göre sıralanabilir. "Bina" sınıfı ise bir binayı temsil eder ve binanın adı ile kat sayısını içerir. "EvSahibi" sınıfı, bir ev sahibinin adı ve soyadını taşırken, "Kiraci" sınıfı, bir kiracının adı ve soyadını yanı sıra kiraladığı ev sahibinin bilgilerini içerir.Bu proje, Java dilinde sınıf ve arayüz kullanımını örneklemek amacıyla oluşturulmuştur. Daire sınıfı, "Comparable" arayüzünü kullanarak doğal bir sıralama düzenine sahip olup, projenin genel amacı, farklı konut türlerini temsil eden sınıflar aracılığıyla bilgi yönetimini sağlamaktadır.

##  Nasıl Kullanacağız

Bu proje, Java programlama dilinde yazılmıştır ve bir konsol uygulaması olarak çalışmaktadır. Proje içerisindeki sınıflar, çeşitli konut türlerini temsil eder ve bu konutlara ait bilgileri yönetir.Projeyi çalıştırdığınızda, kullanıcıdan bir daire, bir bina, bir ev sahibi ve bir kiracı oluşturmasını isteyecek bir konsol arayüzü ile karşılaşacaksınız. Örneğin:
Daire daire = new Daire("Örnek Adres", 5);
Bina bina = new Bina("Örnek Bina", 3);
EvSahibi evSahibi = new EvSahibi("Ahmet", "Yılmaz");
Kiraci kiraci = new Kiraci("Mehmet", "Demir", evSahibi);
Daha sonra main kısmında bilgileri göster başlığı altında girilmiş olan bilgileri çağıran metodlar çalışır ve kod çıktısı verilir.

## Algoritması-Çalışma Mantığı

Konut soyut sınıfı, display interface ini implement eder.Daire sınıfı, Konut sınıfından türemiş ve Comparable<Daire> interface'ini implement etmiştir.displayInfo metodunu implement eder ve compareTo metodu, daire numaralarını karşılaştırarak sıralama için kullanılır Bina sınıfı, Konut sınıfından türemiş ve display interface'ini implement eder. EvSahibi sınıfı, display interface'ini implement eder ve displayInfo metodunu implement eder. Kullanıcıdan alınan bilgilerle Daire, Bina, EvSahibi ve Kiraci nesneleri oluşturulur.
Nesnelerin bilgileri ekrana yazdırılır.

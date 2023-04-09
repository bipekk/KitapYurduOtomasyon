package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TheTest extends BaseTest {

    @Test
    public void theTest()
    {
        Methods methods = new Methods();

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"), "bipekk12@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"), "berkaytest");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(3);

        //login test bitti

        Assert.assertTrue(methods.findElement(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/ul/li/a/b")).getText().contains("berkay ipek"));
        methods.waitBySeconds(1);
        //login olundu mu sorgusu

        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        //oyuncak yazıldı

        methods.scrollWithAction(By.xpath("//div[@id='product-395206']"));
        methods.waitBySeconds(3);
        //scroll yapıldı

        methods.click(By.xpath("//*[@id=\"product-636820\"]/div[2]/div[3]/a[4]"));
        Assert.assertTrue(methods.findElement(By.xpath("//*[@id='swal2-title']")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//*[@id=\"product-639887\"]/div[2]/div[3]/a[4]"));
        Assert.assertTrue(methods.findElement(By.xpath("//*[@id='swal2-title']")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//*[@id=\"product-395206\"]/div[2]/div[3]/a[5]"));
        Assert.assertTrue(methods.findElement(By.xpath("//*[@id='swal2-title']")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi"));
        methods.waitBySeconds(1);

        methods.click(By.xpath("//*[@id=\"product-440988\"]/div[2]/div[3]/a[4]"));
        Assert.assertTrue(methods.findElement(By.xpath("//*[@id='swal2-title']")).getText().contains("Ürün başarılı bir şekilde favorilerinize eklendi"));
        methods.waitBySeconds(3);

        //fav eklendi check edildi

        methods.click(By.xpath("//div[@class='logo-icon']"));
        methods.waitBySeconds(2);

        //ana sayfaya gidildi

        methods.click(By.xpath("//div[@class='lvl1catalog']"));
        methods.waitBySeconds(2);

        //puan kataloğuna tıklandı


        methods.scrollWithAction(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));
        methods.waitBySeconds(2);
        //türk klasiklerine scroll edildi
        methods.click(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));
        methods.waitBySeconds(2);
        //türk klasiklerine tıklandı

        methods.selectByText(By.xpath("//*[@id='content']/div/div/div[1]/div/div[1]/select"),"Yüksek Oylama");
        //Yüksek Oylama seçildi

        methods.scrollWithAction(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        methods.waitBySeconds(3);
        //tüm kitaplar'ın üzerine gelindi

        methods.click(By.xpath("//*[@id='mainNav']/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        //hobiye tıklandı

        int random = methods.random();

        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])["+random+"]"));
        methods.click(By.xpath("(//*[@class='product-cr'])["+random+"]//*[@class='hover-menu']//*[@class='add-to-cart']"));
        methods.waitBySeconds(2);
        //random ürün sepete eklendi

        methods.scrollWithAction(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.click(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        methods.waitBySeconds(2);
        //listelerim-favorilere gidildi


        methods.click(By.xpath("//*[@id='product-639887']/div[2]/div[3]/a[3]"));
        methods.waitBySeconds(3);
        //favlardaki 3. ürün silindi

        methods.click(By.xpath("/html/body/div[1]/div[3]/div/div[4]"));
        methods.waitBySeconds(3);
        //sepetime tıklandı

        methods.click(By.xpath("//*[@id='js-cart']"));
        methods.waitBySeconds(2);
        //sepete git ' e tıklandı

        methods.findElement(By.xpath("//*[@id='cart_module']/div[1]/table/tbody/tr/td[4]/form/input[1]")).clear();
        methods.waitBySeconds(1);
        //ürün adedi kısmı temizlendi
        methods.findElement(By.xpath("//*[@id='cart_module']/div[1]/table/tbody/tr/td[4]/form/input[1]")).sendKeys("3");
        methods.waitBySeconds(1);
        //yeni ürün adedi girildi
        methods.click(By.xpath("//*[@id='cart_module']/div[1]/table/tbody/tr/td[4]/form/i"));
        methods.waitBySeconds(1);
        //ürün adedi artırılıp refresh tıklandı

        methods.click(By.xpath("//*[@id='cart_module']/div[4]/div[1]/a"));
        methods.waitBySeconds(1);
        //kırmızı renkli satın al butonuna tıklandı

        methods.click(By.xpath("//*[@id='shipping-tabs']/a[2]"));
        //yeni adres girmek istiyorum butonu

        //----***---Adres Bilgileri Doldurma Başladı---***---
        methods.findElement(By.xpath("//*[@id='address-firstname-companyname']")).sendKeys("berkay");
        methods.waitBySeconds(1);
        //isim text-box'una xpath'ten gidip ismi send key'ledik

        methods.findElement(By.xpath("//*[@id='address-lastname-title']")).sendKeys("ipek");
        methods.waitBySeconds(1);
        //isimdeki gibi soyisim send edildi

        //Assert.assertTrue(methods.findElement(By.xpath("//*[@id='address-country-id']")).getText().contains("TÜRKİYE"));
        //methods.selectByText(By.xpath("//*[@id='address-country-id']"), "TÜRKİYE");
        //methods.waitBySeconds(1);
        //tıklanıp seçilen ülke bilgisini xpath'inden bulup selectByText ile seçmek istediğimiz ülkeyi yazdık

        methods.selectByText(By.xpath("//*[@id='address-zone-id']"), "İstanbul");
        methods.waitBySeconds(1);
        //ülke gibi şehir yazdık

        methods.selectByText(By.xpath("//*[@id='address-county-id']"), "KÜÇÜKÇEKMECE");
        methods.waitBySeconds(1);
        //ülke gibi ilçe yazdık

        methods.findElement(By.xpath("//*[@id='district']")).sendKeys("A Mahallesi");
        methods.waitBySeconds(1);
        //mahalle inputu

        methods.findElement(By.xpath("//*[@id='address-address-text']")).sendKeys("uydurmasyon caddesi bilmemne sokak filan apartmanı bina 10 daire 10");
        methods.waitBySeconds(1);
        //adres inputu

        methods.findElement(By.xpath("//*[@id='address-postcode']")).sendKeys("121212");
        methods.waitBySeconds(1);
        //posta kodu

        methods.findElement(By.xpath("//*[@id='address-mobile-telephone']")).sendKeys("5381230000");
        methods.waitBySeconds(1);
        //cep telefonu

        methods.findElement(By.xpath("//*[@id='address-telephone']")).sendKeys("2121230000");
        methods.waitBySeconds(1);
        //sabit telefon

        methods.findElement(By.xpath("//*[@id='address-tax-id']")).sendKeys("45448601822");
        methods.waitBySeconds(1);
        //tcinput

        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySeconds(1);
        //Turuncu Devam butonuna tıklandı

        //----****** ADRES DOLDURMA BİTTİ ****------//


        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySeconds(3);
        //kargo metodu kısmında sağdaki turuncu devam butonuna basıldı

        //  /html/body/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[3]/td/input

        methods.findElement(By.xpath("//*[@id='credit-card-owner']")).sendKeys("İsimovski Soyadovski");
        //kart isim soyisim text doldurma

        methods.findElement(By.xpath("//*[@id='credit_card_number_1']")).sendKeys("0000111122223333");
        methods.waitBySeconds(1);
        //kredi kart no

        methods.selectByText(By.xpath("//*[@id='credit-card-expire-date-month']"),"10");
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//*[@id='credit-card-expire-date-year']"),"2031");
        methods.waitBySeconds(1);
        //kart ay ve yıl bilgisi seçildi

        methods.findElement(By.xpath("//*[@id='credit-card-security-code']")).sendKeys("000");
        methods.waitBySeconds(1);
        //ccv bilgisi girildi

        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        //kart bilgileri bitti sağdaki turuncu devam butonuna tıklandı

        Assert.assertTrue(methods.findElement(By.xpath("//*[@id='form-credit-card']/div[2]/table/tbody/tr[5]/td/span")).getText().contains("Kart numarası geçersiz. Kontrol ediniz!"));
        methods.waitBySeconds(1);
        //yanlış kart bildiriminin geldiği doğrulanması

        methods.click(By.xpath("//*[@id='logo']/a/img"));
        //ana sayfaya tıklanır

        methods.scrollWithAction(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/ul/li/a"));
        methods.waitBySeconds(2);
        //çıkış yapılan isim soyisim olan yere mouse getirilir

        methods.click(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        //çıkış'a basılarak logout olunur

        //Assert.assertTrue(methods.findElement(By.xpath("//*[@id='notification']/div/text()")).getText().contains("Oturumunuz güvenli bir şekilde kapatıldı"));
        //başarılı logout bildirimi teyit edildi

    }

}
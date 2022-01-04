package com.example.e_commerce;

import com.example.e_commerce.models.Product;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Product> getProducts() {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(
                "Mieago",
                17000,
                2000,
                "https://img-global.cpcdn.com/recipes/95487d523ab41222/680x482cq70/mieago-mie-ayam-goreng-foto-resep-utama.jpg",
                "Mieago adalah singkatan dari Mie Ayam Goreng dimana dia memiliki bahan seperti mie ayam tetapi dengan kuah yang diberi hanya sebagian dikit, terlihat menjadi mirip mie goreng dengan topping bakso dan pangsit"));
        products.add(new Product(
                "Zuppa Sup",
                20000,
                4000,
                "https://www.unileverfoodsolutions.co.id/dam/global-ufs/mcos/SEA/calcmenu/recipes/ID-recipes/soups/sup-krim-zuppa/main-header.jpg",
                "Zuppa soup adalah sup kental dengan pastry ala croissant yang ditaruh diatasnya seperti topi dan disebut sup bertopi atau zuppa soup, soup yang terkenal dari Italia."));
        products.add(new Product(
                "Steak Sapi",
                30000,
                0,
                "https://cdn1-production-images-kly.akamaized.net/2Jt_qrYuG_z4g6R9gCgRSyyUZm0=/640x640/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3487097/original/034262800_1624082165-WhatsApp_Image_2021-06-18_at_13.28.41.jpeg",
                "Steak adalah sepotong besar daging, biasanya daging sapi. Daging merah, dada ayam, dan ikan sering kali dipotong menjadi steik. Kebanyakan steik dipotong tegak lurus dengan serat otot, menambah kelegitan daging."));
        products.add(new Product(
                "Karage Roll",
                26000,
                0,
                "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1607830999/ximu4apmsoabcwwticzh.jpg",
                "Karage Roll merupakan sajian makanan yang sangat enak. Dari namanya kita sudah bisa membayangkan sajian ala jepang yang digulung dengan nori atau rumput laut dan diisi dengan ayam yang renyah. Rasa segar dari ketimun dan mayones yang ada di dalamnya membuat sajian ini terasa nikmat dan istimewa."));
        products.add(new Product(
                "Spicy Wings",
                24000,
                2000,
                "https://wholelottayum.com/wp-content/uploads/2021/06/whole-chicken-wings-in-air-fryer-720x720.jpg",
                "Spicy chicken wings adalah makanan ringan terpopuler. Rasanya yang pedas, bisa bikin penikmatnya berkeringat ketagihan. Warnanya yang kuning keemasan digoreng hingga terlihat berair (juicy) dari dagingnya."));
        products.add(new Product(
                "Bubur Ayam",
                15000,
                0,
                "https://www.masakapahariini.com/wp-content/uploads/2019/01/bubur-ayam-kuning.jpg",
                "Bubur ayam adalah salah satu jenis makanan bubur dari Indonesia. Bubur nasi adalah beras yang dimasak dengan air yang banyak sehingga memiliki tekstur yang lembut dan berair. Bubur biasanya disajikan dalam suhu panas atau hangat."));
        products.add(new Product(
                "Es Teh",
                5000,
                0,
                "https://awsimages.detik.net.id/community/media/visual/2020/05/14/0af32d8b-36b7-4555-8e79-4fd54c98f795.jpeg?w=700&q=90",
                "Es teh adalah adalah minuman populer yang paling sering ditemukan di restoran, warung luar ruangan, mamak dan kopitiam di negara-negara Asia Tenggara seperti Malaysia, Indonesia dan Singapura"));
        products.add(new Product(
                "Coca-Cola",
                12000,
                3000,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLTCDbA65YsJRZoLsc53fkT1ALGL8UNkegAA&usqp=CAU",
                "Coca-Cola, atau Coke, adalah minuman ringan berkarbonasi yang diproduksi oleh The Coca-Cola Company. Awalnya dipasarkan sebagai minuman kesederhanaan dan dimaksudkan sebagai obat paten"));
        return products;
    }
}

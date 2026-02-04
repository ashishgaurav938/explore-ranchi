package com.exploreranchi.explore_ranchi.config;

import com.exploreranchi.explore_ranchi.model.Attraction;
import com.exploreranchi.explore_ranchi.repository.AttractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadAttractions(AttractionRepository repository) {
        return args -> {

            List<Attraction> attractions = List.of(

                    // 🌊 WATERFALLS
                    new Attraction(
                            "Jonha Falls",
                            "Spectacular waterfall near Ranchi.",
                            "Waterfall",
                            "/images/jonha-cover.jpg",
                            List.of("/images/jonha.jpg", "/images/jonha2.jpg"),
                            "https://www.google.com/maps?q=Jonha+Falls&output=embed",
                            "Formed by the North Koel River."
                    ),

                    new Attraction(
                            "Hundru Falls",
                            "One of the highest waterfalls in Jharkhand.",
                            "Waterfall",
                            "/images/hundru2.jpg",
                            List.of("/images/hundru2.jpg", "/images/hundru3.jpg"),
                            "https://www.google.com/maps?q=Hundru+Falls&output=embed",
                            "Created by the Subarnarekha River."
                    ),

                    new Attraction(
                            "Dassam Falls",
                            "Powerful waterfall on the Kanchi River.",
                            "Waterfall",
                            "/images/dassam.jpg",
                            List.of("/images/dassam.jpg", "/images/dassam2.jpg"),
                            "https://www.google.com/maps?q=Dassam+Falls&output=embed",
                            "Popular during monsoon season."
                    ),

                    new Attraction(
                            "Panchghagh Falls",
                            "Series of five cascading waterfalls on Banai River.",
                            "Waterfall",
                            "/images/panchghagh.jpg",
                            List.of("/images/panchghagh.jpg", "/images/panchghagh2.jpg"),
                            "https://www.google.com/maps?q=Panchghagh+Falls&output=embed",
                            "Ideal picnic spot during monsoon."
                    ),

                    new Attraction(
                            "Sadni Falls",
                            "Beautiful waterfall formed by Sankh River.",
                            "Waterfall",
                            "/images/sadni.jpg",
                            List.of("/images/sadni.jpg", "/images/sadni2.jpg"),
                            "https://www.google.com/maps?q=Sadni+Falls&output=embed",
                            "Wide flow during rainy season."
                    ),

                    new Attraction(
                            "Lodh Falls",
                            "Highest waterfall in Jharkhand with breathtaking views.",
                            "Waterfall",
                            "/images/lodh.jpg",
                            List.of("/images/lodh.jpg", "/images/lodh1.jpg"),
                            "https://www.google.com/maps?q=Lodh+Falls+Jharkhand&output=embed",
                            "Best viewed from the observation point."
                    ),

                    new Attraction(
                            "Rajrappa Chhata Falls",
                            "Sacred waterfall at the confluence of rivers.",
                            "Waterfall",
                            "/images/rajrappafall.jpg",
                            List.of("/images/rajrappafall.jpg", "/images/rajrappa2.jpg"),
                            "https://www.google.com/maps?q=Rajrappa+Chhata+Falls&output=embed",
                            "Near Chhinnamasta Temple."
                    ),

                    new Attraction(
                            "Hirni Falls",
                            "Peaceful waterfall surrounded by forest.",
                            "Waterfall",
                            "/images/hirni.jpg",
                            List.of("/images/hirni.jpg"),
                            "https://www.google.com/maps?q=Hirni+Falls&output=embed",
                            "Located near Bundu."
                    ),

                    // 🌳 GARDENS
                    new Attraction(
                            "Rock Garden",
                            "Unique rock formations offering panoramic city views.",
                            "Garden",
                            "/images/rockgarden.jpg",
                            List.of("/images/rockgarden.jpg", "/images/rockgarden2.jpg"),
                            "https://www.google.com/maps?q=Rock+Garden+Ranchi&output=embed",
                            "Built from Jharkhand Assembly rock remains."
                    ),

                    new Attraction(
                            "Birsa Zoological Park",
                            "Large zoological park with natural enclosures.",
                            "Garden",
                            "/images/birsazoo.jpg",
                            List.of("/images/birsa-zoo.jpg"),
                            "https://www.google.com/maps?q=Birsa+Zoological+Park&output=embed",
                            "One of the largest zoos in India."
                    ),

                    new Attraction(
                            "Sidhu Kanhu Park",
                            "Popular city park for relaxation.",
                            "Garden",
                            "/images/sidhukanhu.jpg",
                            List.of("/images/sidhu-kanhu.jpg"),
                            "https://www.google.com/maps?q=Sidhu+Kanhu+Park+Ranchi&output=embed",
                            "Named after tribal freedom fighters."
                    ),

                    new Attraction(
                            "Oxygen Park, Morabadi",
                            "Eco-friendly urban park with walking tracks and greenery.",
                            "Garden",
                            "/images/oxygenpark.jpg",
                            List.of(
                                    "/images/oxygenpark.jpg",
                                    "/images/oxygenpark2.jpg"
                            ),
                            "https://www.google.com/maps?q=Oxygen+Park+Morabadi+Ranchi&output=embed",
                            "Designed to promote clean air and healthy lifestyle."
                    ),
                    new Attraction(
                            "Nakshatra Van",
                            "Themed garden based on zodiac signs and astrology.",
                            "Garden",
                            "/images/nakshatravan.jpg",
                            List.of(
                                    "/images/nakshatravan.jpg",
                                    "/images/nakshatravan2.jpg"
                            ),
                            "https://www.google.com/maps?q=Nakshatra+Van+Ranchi&output=embed",
                            "Unique concept garden ideal for families and kids."
                    ),

                    // 🛕 TEMPLES
                    new Attraction(
                            "Rajrappa Chhinnamasta Temple",
                            "Sacred temple at the river confluence.",
                            "Temple",
                            "/images/rajrappafall.jpg",
                            List.of("/images/rajrappafall.jpg"),
                            "https://www.google.com/maps?q=Rajrappa+Temple&output=embed",
                            "Located at Damodar–Bhairavi sangam."
                    ),

                    new Attraction(
                            "Jagannath Temple",
                            "Hilltop temple with city views.",
                            "Temple",
                            "/images/jagannath.jpg",
                            List.of("/images/jagannath.jpg"),
                            "https://www.google.com/maps?q=Jagannath+Temple+Ranchi&output=embed",
                            "Dedicated to Lord Jagannath."
                    ),

                    new Attraction(
                            "Deori Temple",
                            "Ancient temple with 16-armed deity.",
                            "Temple",
                            "/images/deori.jpg",
                            List.of("/images/deori.jpg"),
                            "https://www.google.com/maps?q=Deori+Temple+Ranchi&output=embed",
                            "Over 700 years old."
                    ),

                    // 🌄 VIEWS
                    new Attraction(
                            "Tagore Hill",
                            "Peaceful hilltop with sunset views.",
                            "View",
                            "/images/tagore.jpg",
                            List.of("/images/tagore.jpg"),
                            "https://www.google.com/maps?q=Tagore+Hill+Ranchi&output=embed",
                            "Inspired Rabindranath Tagore."
                    ),

                    new Attraction(
                            "Patratu Valley & Dam",
                            "Scenic road with breathtaking views.",
                            "View",
                            "/images/patratu.jpg",
                            List.of("/images/patratu.jpg"),
                            "https://www.google.com/maps?q=Patratu+Dam&output=embed",
                            "One of Jharkhand’s most scenic drives."
                    ),

                    new Attraction(
                            "Birsa Dhyan Mandir",
                            "Meditation center on a hilltop.",
                            "View",
                            "/images/birsadhyan.jpg",
                            List.of("/images/birsadhyan.jpg"),
                            "https://www.google.com/maps?q=Birsa+Dhyan+Mandir&output=embed",
                            "Spiritual and peaceful location."
                    ),
                    new Attraction(
                            "Pahari Mandir",
                            "Ancient Shiva temple situated on a hilltop.",
                            "Temple",
                            "/images/paharimandir.jpg",
                            List.of(
                                    "/images/paharimandir.jpg",
                                    "/images/paharimandir2.jpg",
                                    "/images/paharimandir3.jpg"
                            ),
                            "https://www.google.com/maps?q=Pahari+Mandir+Ranchi&output=embed",
                            "National flag is hoisted here on Independence Day and Republic Day."
                    ),
                    new Attraction(
                            "Sun Temple, Bundu",
                            "Chariot-shaped temple dedicated to the Sun God.",
                            "Temple",
                            "/images/suntemple.jpg",
                            List.of(
                                    "/images/suntemple.jpg",
                                    "/images/suntemple2.jpg",
                                    "/images/suntemple3.jpg"
                            ),
                            "https://www.google.com/maps?q=Sun+Temple+Bundu+Ranchi&output=embed",
                            "Scenic location surrounded by hills."
                    ),
                    new Attraction(
                            "Kali Mandir, Ratu Road",
                            "Popular city temple dedicated to Goddess Kali.",
                            "Temple",
                            "/images/kalimandir.jpg",
                            List.of(
                                    "/images/kalimandir.jpg"
                            ),
                            "https://www.google.com/maps?q=Kali+Mandir+Ratu+Road+Ranchi&output=embed",
                            "Crowded during Navratri."
                    ),
                    new Attraction(
                            "ISKCON Temple, Ranchi",
                            "Spiritual center dedicated to Lord Krishna.",
                            "Temple",
                            "/images/iskcon.jpg",
                            List.of(
                                    "/images/iskcon.jpg",
                                    "/images/iskcon2.jpg"
                            ),
                            "https://www.google.com/maps?q=ISKCON+Temple+Ranchi&output=embed",
                            "Well-known for kirtans and festivals."
                    )
                    );

            // ✅ Insert only missing attractions
            for (Attraction attraction : attractions) {
                if (!repository.existsByNameIgnoreCase(attraction.getName())) {
                    repository.save(attraction);
                }
            }

        };
    }
}

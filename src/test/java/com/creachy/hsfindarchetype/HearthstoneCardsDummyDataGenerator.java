package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HearthstoneCardsDummyDataGenerator {
    public static Card[] dummyCardsResponse() {
        String responseJSON =
                "[\n" +
                        "    {\n" +
                        "        \"attack\": 0,\n" +
                        "        \"cardClass\": \"NEUTRAL\",\n" +
                        "        \"cost\": 0,\n" +
                        "        \"dbfId\": 52424,\n" +
                        "        \"faction\": \"ALLIANCE\",\n" +
                        "        \"health\": 0,\n" +
                        "        \"id\": \"ART_BOT_Bundle_001\",\n" +
                        "        \"name\": \"Golden Legendary\",\n" +
                        "        \"rarity\": \"LEGENDARY\",\n" +
                        "        \"set\": \"TB\",\n" +
                        "        \"type\": \"MINION\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"artist\": \"Nutthapon Petchthai\",\n" +
                        "        \"cardClass\": \"MAGE\",\n" +
                        "        \"collectible\": true,\n" +
                        "        \"cost\": 5,\n" +
                        "        \"dbfId\": 2539,\n" +
                        "        \"flavor\": \"It's on the rack next to ice lance, acid lance, and English muffin lance.\",\n" +
                        "        \"id\": \"AT_001\",\n" +
                        "        \"name\": \"Flame Lance\",\n" +
                        "        \"rarity\": \"COMMON\",\n" +
                        "        \"set\": \"TGT\",\n" +
                        "        \"spellSchool\": \"FIRE\",\n" +
                        "        \"text\": \"Deal $8 damage to a minion.\",\n" +
                        "        \"type\": \"SPELL\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"artist\": \"Tooth\",\n" +
                        "        \"cardClass\": \"MAGE\",\n" +
                        "        \"collectible\": true,\n" +
                        "        \"cost\": 3,\n" +
                        "        \"dbfId\": 2541,\n" +
                        "        \"flavor\": \"Burning man, brah.\",\n" +
                        "        \"id\": \"AT_002\",\n" +
                        "        \"mechanics\": [\n" +
                        "            \"SECRET\"\n" +
                        "        ],\n" +
                        "        \"name\": \"Effigy\",\n" +
                        "        \"rarity\": \"RARE\",\n" +
                        "        \"set\": \"TGT\",\n" +
                        "        \"spellSchool\": \"FIRE\",\n" +
                        "        \"text\": \"<b>Secret:</b> When a friendly minion dies, summon a random minion with the same Cost.\",\n" +
                        "        \"type\": \"SPELL\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"artist\": \"Arthur Bozonnet\",\n" +
                        "        \"attack\": 3,\n" +
                        "        \"cardClass\": \"MAGE\",\n" +
                        "        \"collectible\": true,\n" +
                        "        \"cost\": 2,\n" +
                        "        \"dbfId\": 2545,\n" +
                        "        \"flavor\": \"And he can't get up.\",\n" +
                        "        \"health\": 2,\n" +
                        "        \"id\": \"AT_003\",\n" +
                        "        \"mechanics\": [\n" +
                        "            \"HEROPOWER_DAMAGE\"\n" +
                        "        ],\n" +
                        "        \"name\": \"Fallen Hero\",\n" +
                        "        \"rarity\": \"RARE\",\n" +
                        "        \"set\": \"TGT\",\n" +
                        "        \"text\": \"Your Hero Power deals 1 extra damage.\",\n" +
                        "        \"type\": \"MINION\"\n" +
                        "    },\n" +
                        "    {\n" +
                        "        \"artist\": \"Gabor Szikszai\",\n" +
                        "        \"cardClass\": \"MAGE\",\n" +
                        "        \"collectible\": true,\n" +
                        "        \"cost\": 1,\n" +
                        "        \"dbfId\": 2572,\n" +
                        "        \"flavor\": \"Now with 100% more blast!\",\n" +
                        "        \"id\": \"AT_004\",\n" +
                        "        \"mechanics\": [\n" +
                        "            \"RECEIVES_DOUBLE_SPELLDAMAGE_BONUS\"\n" +
                        "        ],\n" +
                        "        \"name\": \"Arcane Blast\",\n" +
                        "        \"rarity\": \"EPIC\",\n" +
                        "        \"referencedTags\": [\n" +
                        "            \"SPELLPOWER\"\n" +
                        "        ],\n" +
                        "        \"set\": \"TGT\",\n" +
                        "        \"spellSchool\": \"ARCANE\",\n" +
                        "        \"text\": \"Deal $2 damage to a minion. This spell gets double bonus from <b>Spell Damage</b>.\",\n" +
                        "        \"type\": \"SPELL\"\n" +
                        "    }" +
                        "]";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(responseJSON, Card[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static Card dummyCardResponse() {
        String cardJSON = "    {\n" +
                "        \"artist\": \"Gabor Szikszai\",\n" +
                "        \"cardClass\": \"MAGE\",\n" +
                "        \"collectible\": true,\n" +
                "        \"cost\": 1,\n" +
                "        \"dbfId\": 2572,\n" +
                "        \"fl" +
                "avor\": \"Now with 100% more blast!\",\n" +
                "        \"id\": \"AT_004\",\n" +
                "        \"mechanics\": [\n" +
                "            \"RECEIVES_DOUBLE_SPELLDAMAGE_BONUS\"\n" +
                "        ],\n" +
                "        \"name\": \"Arcane Blast\",\n" +
                "        \"rarity\": \"EPIC\",\n" +
                "        \"referencedTags\": [\n" +
                "            \"SPELLPOWER\"\n" +
                "        ],\n" +
                "        \"set\": \"TGT\",\n" +
                "        \"spellSchool\": \"ARCANE\",\n" +
                "        \"text\": \"Deal $2 damage to a minion. This spell gets double bonus from <b>Spell Damage</b>.\",\n" +
                "        \"type\": \"SPELL\"\n" +
                "    }";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(cardJSON, Card.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

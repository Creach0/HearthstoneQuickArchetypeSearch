package com.creachy.hsfindarchetype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HSReplayDummyDataGenerator {
    static DecksResponseContainer dummyDecksResponse() {
        String responseJSON =
                "{\n" +
                "    \"render_as\": \"table\",\n" +
                "    \"series\": {\n" +
                "        \"metadata\": {\n" +
                "            \"DEMONHUNTER\": {},\n" +
                "            \"DRUID\": {},\n" +
                "            \"HUNTER\": {},\n" +
                "            \"MAGE\": {},\n" +
                "            \"PALADIN\": {},\n" +
                "            \"PRIEST\": {},\n" +
                "            \"ROGUE\": {},\n" +
                "            \"SHAMAN\": {},\n" +
                "            \"WARLOCK\": {},\n" +
                "            \"WARRIOR\": {}\n" +
                "        },\n" +
                "        \"data\": {\n" +
                "            \"DEMONHUNTER\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"Ujig9oZVO6Tgr0RHVMpjDc\",\n" +
                "                    \"deck_list\": \"[[69577,2],[71944,2],[64720,1],[72117,1],[63591,1],[71694,2],[69684,2],[63682,2],[72984,2],[72583,2],[69558,2],[69507,1],[66875,1],[71690,2],[66951,1],[67204,2],[64393,2],[65608,2]]\",\n" +
                "                    \"archetype_id\": 522,\n" +
                "                    \"digest\": \"51294c74270af8b9f68e6134fc1c7b9c\",\n" +
                "                    \"total_games\": 249,\n" +
                "                    \"win_rate\": 65.46,\n" +
                "                    \"avg_game_length_seconds\": 409.0,\n" +
                "                    \"avg_num_player_turns\": 7.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"jwKgzucrnYKXhawkYQ5zo\",\n" +
                "                    \"deck_list\": \"[[71239,1],[69577,2],[71944,2],[72117,1],[63591,1],[71694,2],[69684,2],[63682,2],[72984,2],[72583,2],[69558,2],[66875,1],[71690,2],[73723,1],[66951,1],[67204,2],[64393,2],[65608,2]]\",\n" +
                "                    \"archetype_id\": 522,\n" +
                "                    \"digest\": \"07a4142990add261bc601e88f4e163cd\",\n" +
                "                    \"total_games\": 8191,\n" +
                "                    \"win_rate\": 64.88,\n" +
                "                    \"avg_game_length_seconds\": 378.0,\n" +
                "                    \"avg_num_player_turns\": 7.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"2MB5RzdrGOfE9bpD3225Ne\",\n" +
                "                    \"deck_list\": \"[[69586,2],[69577,2],[64720,1],[72117,1],[63591,1],[71694,2],[69684,2],[63682,2],[72984,2],[72583,2],[69558,2],[66875,1],[71690,2],[73723,1],[66951,1],[67204,2],[64393,2],[65608,2]]\",\n" +
                "                    \"archetype_id\": 522,\n" +
                "                    \"digest\": \"989718d87d77cd9b3cc71b675398bfde\",\n" +
                "                    \"total_games\": 1726,\n" +
                "                    \"win_rate\": 64.13,\n" +
                "                    \"avg_game_length_seconds\": 402.0,\n" +
                "                    \"avg_num_player_turns\": 7.5\n" +
                "                }\n" +
                "            ],\n" +
                "            \"DRUID\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"LxSxgEiOtcPXGwSzMIwmAe\",\n" +
                "                    \"deck_list\": \"[[86234,2],[71247,2],[64711,1],[73471,2],[71949,2],[66953,1],[73774,2],[72333,1],[72923,1],[64201,2],[65584,1],[71333,1],[65580,2],[70257,1],[67237,1],[69513,2],[69594,2],[69550,2],[65583,2]]\",\n" +
                "                    \"archetype_id\": 512,\n" +
                "                    \"digest\": \"914fd1214b80150dd1440564b2a1bc4f\",\n" +
                "                    \"total_games\": 217,\n" +
                "                    \"win_rate\": 58.06,\n" +
                "                    \"avg_game_length_seconds\": 519.0,\n" +
                "                    \"avg_num_player_turns\": 9.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"NYXEoaVVgfQYKgpza6tNn\",\n" +
                "                    \"deck_list\": \"[[71684,1],[86234,2],[73712,2],[71247,2],[66869,1],[73471,1],[71949,2],[66953,1],[73774,2],[72333,1],[64201,1],[73906,2],[65584,2],[71333,1],[70257,1],[69513,2],[69594,2],[69550,2],[65583,2]]\",\n" +
                "                    \"archetype_id\": 512,\n" +
                "                    \"digest\": \"0739b6b7a8ee4447f5df768e6bf45e37\",\n" +
                "                    \"total_games\": 307,\n" +
                "                    \"win_rate\": 55.37,\n" +
                "                    \"avg_game_length_seconds\": 570.0,\n" +
                "                    \"avg_num_player_turns\": 9.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"HUqHtBsRIXjT45H4Ot5zDh\",\n" +
                "                    \"deck_list\": \"[[71684,1],[86234,2],[73712,2],[71247,2],[73471,2],[71949,2],[66953,1],[73774,2],[64201,1],[73906,2],[65584,1],[71333,1],[65580,2],[70257,1],[69513,2],[69594,2],[69550,2],[65583,2]]\",\n" +
                "                    \"archetype_id\": 512,\n" +
                "                    \"digest\": \"f5968e608487a21bba0b77a2cab6ba4d\",\n" +
                "                    \"total_games\": 1073,\n" +
                "                    \"win_rate\": 55.26,\n" +
                "                    \"avg_game_length_seconds\": 545.0,\n" +
                "                    \"avg_num_player_turns\": 9.0\n" +
                "                }\n" +
                "            ],\n" +
                "            \"HUNTER\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"7dR4vJOitJSKGHfwlUDrB\",\n" +
                "                    \"deck_list\": \"[[67803,1],[62812,2],[64720,2],[71233,2],[74886,1],[69691,2],[69545,2],[72583,2],[76300,2],[66875,1],[69546,2],[64631,2],[63195,2],[64637,1],[69603,2],[71709,2],[71231,2]]\",\n" +
                "                    \"archetype_id\": 211,\n" +
                "                    \"digest\": \"0e75421de24102d960076be04a8300d1\",\n" +
                "                    \"total_games\": 375,\n" +
                "                    \"win_rate\": 63.46,\n" +
                "                    \"avg_game_length_seconds\": 467.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"27Ckya96uE5BZhSkEyszTd\",\n" +
                "                    \"deck_list\": \"[[62812,2],[64720,2],[71233,2],[86543,1],[74886,1],[69691,2],[69545,2],[72583,2],[76300,2],[66875,1],[69546,2],[64631,2],[63195,2],[64637,1],[69603,2],[71709,2],[71231,2]]\",\n" +
                "                    \"archetype_id\": 211,\n" +
                "                    \"digest\": \"7aa26f3f2aecb85eace7a0fbe47be860\",\n" +
                "                    \"total_games\": 2916,\n" +
                "                    \"win_rate\": 63.03,\n" +
                "                    \"avg_game_length_seconds\": 438.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"lXzXgleAr8tktfLaw82C\",\n" +
                "                    \"deck_list\": \"[[72648,1],[62812,2],[64720,2],[71233,2],[86543,1],[69691,2],[69545,2],[72583,2],[76300,2],[66875,1],[69546,2],[64631,2],[63195,2],[64637,1],[69603,2],[71709,2],[71231,2]]\",\n" +
                "                    \"archetype_id\": 211,\n" +
                "                    \"digest\": \"003f358bcb0f67a44fc19461027958c5\",\n" +
                "                    \"total_games\": 205,\n" +
                "                    \"win_rate\": 62.92,\n" +
                "                    \"avg_game_length_seconds\": 449.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                }\n" +
                "            ],\n" +
                "            \"MAGE\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"FmAgNGuapFMCxMyT9RVpGd\",\n" +
                "                    \"deck_list\": \"[[72649,2],[72925,2],[73068,1],[71841,1],[72417,2],[77016,2],[72338,2],[72650,2],[72931,2],[70241,2],[73906,2],[63058,2],[64707,2],[76312,1],[69718,2],[72007,1],[86548,2]]\",\n" +
                "                    \"archetype_id\": 77,\n" +
                "                    \"digest\": \"73a9ea8a0fc5a501626910c5f0eedfaf\",\n" +
                "                    \"total_games\": 232,\n" +
                "                    \"win_rate\": 61.63,\n" +
                "                    \"avg_game_length_seconds\": 446.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"QfFapIjhRBFV6hRERCQKxh\",\n" +
                "                    \"deck_list\": \"[[72649,2],[72925,2],[73068,1],[72417,2],[71841,1],[77016,2],[72338,2],[72650,2],[72931,2],[73906,2],[63058,1],[64707,2],[64372,2],[69718,2],[72007,1],[86548,2],[72932,2]]\",\n" +
                "                    \"archetype_id\": 77,\n" +
                "                    \"digest\": \"f280198a0bda7958a70c51bb9b43174c\",\n" +
                "                    \"total_games\": 365,\n" +
                "                    \"win_rate\": 61.09,\n" +
                "                    \"avg_game_length_seconds\": 421.0,\n" +
                "                    \"avg_num_player_turns\": 7.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"x4ynNtnBPfTbjoIaV0VUKh\",\n" +
                "                    \"deck_list\": \"[[72649,2],[72925,2],[73068,1],[71841,1],[72417,2],[77016,2],[72338,2],[72650,2],[72931,2],[73906,2],[64707,2],[63056,2],[69718,2],[69501,2],[86548,2],[72932,2]]\",\n" +
                "                    \"archetype_id\": 77,\n" +
                "                    \"digest\": \"f979d7c98bb911c3193873fcc552316f\",\n" +
                "                    \"total_games\": 884,\n" +
                "                    \"win_rate\": 60.29,\n" +
                "                    \"avg_game_length_seconds\": 421.0,\n" +
                "                    \"avg_num_player_turns\": 7.5\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PALADIN\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"lyLhmx9OkfyIXeoihajd6d\",\n" +
                "                    \"deck_list\": \"[[73068,1],[72417,2],[72338,2],[69705,2],[72931,2],[77018,2],[73906,2],[73428,2],[72926,2],[64554,2],[69718,2],[86548,2],[64368,2],[71984,1],[76250,2],[67040,1],[70265,1]]\",\n" +
                "                    \"archetype_id\": 249,\n" +
                "                    \"digest\": \"8155a26522b5643d46cf3d2fbc10bb57\",\n" +
                "                    \"total_games\": 534,\n" +
                "                    \"win_rate\": 61.79,\n" +
                "                    \"avg_game_length_seconds\": 471.0,\n" +
                "                    \"avg_num_player_turns\": 8.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"ZJJEHJQuQV2vBdF9uOliSb\",\n" +
                "                    \"deck_list\": \"[[72417,2],[72338,2],[69705,2],[72931,2],[77018,2],[73906,2],[73428,2],[72926,2],[64554,2],[69718,2],[86548,2],[64368,2],[62587,1],[71984,1],[76250,2],[67040,1],[70265,1]]\",\n" +
                "                    \"archetype_id\": 249,\n" +
                "                    \"digest\": \"383e9ed26c52b7ee37511e6019698d79\",\n" +
                "                    \"total_games\": 2957,\n" +
                "                    \"win_rate\": 59.95,\n" +
                "                    \"avg_game_length_seconds\": 498.0,\n" +
                "                    \"avg_num_player_turns\": 8.5\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PRIEST\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"rEjXAFnvOUVBoe9eNNycyb\",\n" +
                "                    \"deck_list\": \"[[63188,1],[64390,2],[62486,2],[66861,1],[70258,1],[64416,1],[69616,2],[64707,2],[71252,2],[70024,2],[63821,2],[62873,2],[62878,2],[62874,2],[64349,1],[63398,1],[64391,2],[67048,1],[72488,1]]\",\n" +
                "                    \"archetype_id\": 36,\n" +
                "                    \"digest\": \"2d989c01d362d33829976054ffabe271\",\n" +
                "                    \"total_games\": 636,\n" +
                "                    \"win_rate\": 52.2,\n" +
                "                    \"avg_game_length_seconds\": 604.0,\n" +
                "                    \"avg_num_player_turns\": 10.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"K2oJheKk7mvQOXbzYPUg0b\",\n" +
                "                    \"deck_list\": \"[[70025,2],[69728,2],[70020,2],[66861,2],[64416,1],[72482,2],[72583,2],[86552,2],[66875,1],[62878,2],[70026,2],[62872,2],[77374,2],[66860,2],[64391,2],[80118,2]]\",\n" +
                "                    \"archetype_id\": -6,\n" +
                "                    \"digest\": \"3c78d0f7a6560fce26a3f842e3dcaa48\",\n" +
                "                    \"total_games\": 347,\n" +
                "                    \"win_rate\": 50.43,\n" +
                "                    \"avg_game_length_seconds\": 388.0,\n" +
                "                    \"avg_num_player_turns\": 7.5\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"r2JiIHOmWf5zZlpiDYTvkg\",\n" +
                "                    \"deck_list\": \"[[72484,2],[63464,2],[72483,2],[63188,1],[72504,2],[69569,1],[66861,2],[72482,2],[65676,2],[71252,2],[62873,2],[62878,1],[70026,2],[77374,2],[64391,2],[67048,1],[80118,2]]\",\n" +
                "                    \"archetype_id\": 526,\n" +
                "                    \"digest\": \"caa05e7d7fe16e85543002afc5188a71\",\n" +
                "                    \"total_games\": 2470,\n" +
                "                    \"win_rate\": 50.32,\n" +
                "                    \"avg_game_length_seconds\": 570.0,\n" +
                "                    \"avg_num_player_turns\": 9.5\n" +
                "                }\n" +
                "            ],\n" +
                "            \"ROGUE\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"u2VmwLM4fXC60hTeB7XFPg\",\n" +
                "                    \"deck_list\": \"[[72536,1],[72111,2],[62890,2],[71944,2],[77210,2],[69623,2],[76285,2],[77208,2],[69521,2],[73906,2],[72007,1],[71690,2],[72119,2],[65599,1],[74890,2],[65645,1],[65597,2]]\",\n" +
                "                    \"archetype_id\": 154,\n" +
                "                    \"digest\": \"db24131e3595f1c9a4d64052e82613c4\",\n" +
                "                    \"total_games\": 346,\n" +
                "                    \"win_rate\": 58.38,\n" +
                "                    \"avg_game_length_seconds\": 398.0,\n" +
                "                    \"avg_num_player_turns\": 7.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"3EkLwK0vWI2QvCQFC7T13d\",\n" +
                "                    \"deck_list\": \"[[72536,1],[72111,2],[62890,2],[77210,2],[69623,2],[76285,2],[77208,2],[69521,2],[73906,2],[71690,2],[72119,2],[66854,1],[65599,1],[74890,2],[72495,1],[65645,1],[65597,2],[72105,1]]\",\n" +
                "                    \"archetype_id\": 154,\n" +
                "                    \"digest\": \"802d58b5f07a841f84187b69dd2e7edb\",\n" +
                "                    \"total_games\": 249,\n" +
                "                    \"win_rate\": 57.42,\n" +
                "                    \"avg_game_length_seconds\": 400.0,\n" +
                "                    \"avg_num_player_turns\": 7.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"XLhr2m9YG7Cwt1EpUEN4Nh\",\n" +
                "                    \"deck_list\": \"[[69742,2],[64033,2],[72536,1],[72111,2],[62890,2],[77210,2],[72480,2],[69623,2],[77208,2],[71690,2],[72119,2],[65599,1],[74890,2],[72495,1],[65645,1],[65597,2],[72105,2]]\",\n" +
                "                    \"archetype_id\": 154,\n" +
                "                    \"digest\": \"fb266e4d8c29b75112b979c6e8aaa6db\",\n" +
                "                    \"total_games\": 328,\n" +
                "                    \"win_rate\": 55.18,\n" +
                "                    \"avg_game_length_seconds\": 433.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                }\n" +
                "            ],\n" +
                "            \"SHAMAN\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"A8VWno7DUD8gdsmaHmsm7b\",\n" +
                "                    \"deck_list\": \"[[67779,1],[76295,2],[67932,2],[64774,1],[72508,2],[72923,1],[72316,2],[68187,2],[63331,2],[65619,2],[72598,2],[76312,1],[67833,2],[67861,2],[67769,2],[65704,2],[69625,2]]\",\n" +
                "                    \"archetype_id\": 511,\n" +
                "                    \"digest\": \"403a9c0dd3dcaa56ebae34635be0122e\",\n" +
                "                    \"total_games\": 1716,\n" +
                "                    \"win_rate\": 56.75,\n" +
                "                    \"avg_game_length_seconds\": 504.0,\n" +
                "                    \"avg_num_player_turns\": 9.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"iGMp19qsHuCxQwG3dqyYLd\",\n" +
                "                    \"deck_list\": \"[[67779,1],[76295,2],[67932,2],[64720,1],[64774,1],[72508,2],[70241,1],[72316,2],[68187,2],[65619,2],[72598,2],[67833,2],[67861,2],[72423,1],[65700,1],[67769,2],[65704,2],[69625,2]]\",\n" +
                "                    \"archetype_id\": 511,\n" +
                "                    \"digest\": \"769c028423970b4dd27e6697720f5298\",\n" +
                "                    \"total_games\": 539,\n" +
                "                    \"win_rate\": 54.91,\n" +
                "                    \"avg_game_length_seconds\": 510.0,\n" +
                "                    \"avg_num_player_turns\": 9.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"qinYCpK9vtKMesATU07PSc\",\n" +
                "                    \"deck_list\": \"[[67779,1],[76295,2],[64720,1],[64774,1],[72508,2],[72923,1],[72316,2],[68187,2],[63331,2],[65619,2],[72598,2],[76312,1],[67833,2],[67861,2],[65700,1],[67769,2],[72973,2],[69625,2]]\",\n" +
                "                    \"archetype_id\": 511,\n" +
                "                    \"digest\": \"5963e2ee515daa86a17ea6102226cf04\",\n" +
                "                    \"total_games\": 253,\n" +
                "                    \"win_rate\": 53.75,\n" +
                "                    \"avg_game_length_seconds\": 517.0,\n" +
                "                    \"avg_num_player_turns\": 9.0\n" +
                "                }\n" +
                "            ],\n" +
                "            \"WARLOCK\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"vMJDR2FygmHWkciqaGNsLg\",\n" +
                "                    \"deck_list\": \"[[62483,2],[62484,2],[69723,2],[74652,2],[72021,2],[73906,2],[71924,2],[74741,1],[72320,2],[73443,2],[72254,2],[76926,2],[69666,2],[71781,1],[76270,2],[69675,2]]\",\n" +
                "                    \"archetype_id\": 62,\n" +
                "                    \"digest\": \"d8e8977d38f166c747018c5c8d23e69d\",\n" +
                "                    \"total_games\": 1124,\n" +
                "                    \"win_rate\": 53.55,\n" +
                "                    \"avg_game_length_seconds\": 374.0,\n" +
                "                    \"avg_num_player_turns\": 7.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"88y8D5rcgCCuw5iXcKkc0\",\n" +
                "                    \"deck_list\": \"[[62483,2],[62484,2],[74652,2],[69557,2],[72021,2],[71924,2],[73906,2],[74741,1],[72320,2],[73443,2],[72254,2],[76926,2],[69666,2],[71781,1],[76270,2],[69675,2]]\",\n" +
                "                    \"archetype_id\": 62,\n" +
                "                    \"digest\": \"1b936f4769cc96e65295c5d49168c134\",\n" +
                "                    \"total_games\": 235,\n" +
                "                    \"win_rate\": 51.91,\n" +
                "                    \"avg_game_length_seconds\": 377.0,\n" +
                "                    \"avg_num_player_turns\": 7.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"WJhxUrPx27xUtFRRYzubAb\",\n" +
                "                    \"deck_list\": \"[[64704,2],[76315,2],[69635,1],[69735,2],[71688,2],[63191,1],[67825,1],[64710,2],[64899,2],[69553,1],[63218,1],[63677,2],[65605,2],[69519,2],[64898,2],[62744,2],[67760,1],[70107,2]]\",\n" +
                "                    \"archetype_id\": 527,\n" +
                "                    \"digest\": \"2ea59b317615bd7db2b759ab5e8a558e\",\n" +
                "                    \"total_games\": 221,\n" +
                "                    \"win_rate\": 50.67,\n" +
                "                    \"avg_game_length_seconds\": 578.0,\n" +
                "                    \"avg_num_player_turns\": 10.0\n" +
                "                }\n" +
                "            ],\n" +
                "            \"WARRIOR\": [\n" +
                "                {\n" +
                "                    \"deck_id\": \"Dvaf3xavICCQ2BvGBydlDf\",\n" +
                "                    \"deck_list\": \"[[64280,1],[63701,2],[69677,2],[62462,2],[73906,2],[65692,2],[69679,2],[63374,1],[64279,2],[64277,2],[71690,2],[66854,2],[64278,2],[72105,2],[72592,2],[64975,2]]\",\n" +
                "                    \"archetype_id\": 162,\n" +
                "                    \"digest\": \"b3bf4ef7ef39fe3a6456457f7087381b\",\n" +
                "                    \"total_games\": 272,\n" +
                "                    \"win_rate\": 63.6,\n" +
                "                    \"avg_game_length_seconds\": 450.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"npTbSE3pMDZCvUueGpUEnb\",\n" +
                "                    \"deck_list\": \"[[64280,1],[63701,1],[69677,2],[62462,2],[73906,2],[69679,2],[65692,2],[63374,1],[64279,2],[64277,2],[74894,1],[71690,2],[66854,2],[65599,1],[64278,2],[72105,1],[72592,2],[64975,2]]\",\n" +
                "                    \"archetype_id\": 162,\n" +
                "                    \"digest\": \"28024dcd781293cd8920ad5bd5cb2f9b\",\n" +
                "                    \"total_games\": 746,\n" +
                "                    \"win_rate\": 62.06,\n" +
                "                    \"avg_game_length_seconds\": 441.0,\n" +
                "                    \"avg_num_player_turns\": 8.0\n" +
                "                },\n" +
                "                {\n" +
                "                    \"deck_id\": \"c4qvMn1VCn5ZoMpFRbFvr\",\n" +
                "                    \"deck_list\": \"[[64280,1],[69677,1],[62462,2],[73906,2],[69679,2],[65692,2],[63374,2],[64279,2],[64277,2],[74894,1],[71690,2],[66854,2],[65599,1],[64278,2],[72105,2],[72592,2],[64975,2]]\",\n" +
                "                    \"archetype_id\": 162,\n" +
                "                    \"digest\": \"093162d5e02510c702a474f78e5eb4aa\",\n" +
                "                    \"total_games\": 209,\n" +
                "                    \"win_rate\": 61.72,\n" +
                "                    \"avg_game_length_seconds\": 411.0,\n" +
                "                    \"avg_num_player_turns\": 7.5\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    },\n" +
                "    \"as_of\": \"2022-05-10T00:58:12Z\"\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(responseJSON, DecksResponseContainer.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Archetype[] dummyArchetypesResponse() {
        String responseJSON =
                "[\n" +
                "    {\n" +
                "        \"id\": 7,\n" +
                "        \"name\": \"Token Druid\",\n" +
                "        \"player_class\": 2,\n" +
                "        \"player_class_name\": \"DRUID\",\n" +
                "        \"url\": \"/archetypes/7/token-druid\",\n" +
                "        \"standard_ccp_signature_core\": {\n" +
                "            \"as_of\": \"2021-06-15T19:51:02.276Z\",\n" +
                "            \"format\": 2,\n" +
                "            \"components\": [\n" +
                "                63030,\n" +
                "                63502,\n" +
                "                56684,\n" +
                "                56687,\n" +
                "                69591,\n" +
                "                61450,\n" +
                "                56677,\n" +
                "                61964,\n" +
                "                61449,\n" +
                "                56686\n" +
                "            ]\n" +
                "        },\n" +
                "        \"wild_ccp_signature_core\": null\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 18,\n" +
                "        \"name\": \"Astral Druid\",\n" +
                "        \"player_class\": 2,\n" +
                "        \"player_class_name\": \"DRUID\",\n" +
                "        \"url\": \"/archetypes/18/astral-druid\",\n" +
                "        \"standard_ccp_signature_core\": null,\n" +
                "        \"wild_ccp_signature_core\": null\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 21,\n" +
                "        \"name\": \"Patron Warrior\",\n" +
                "        \"player_class\": 10,\n" +
                "        \"player_class_name\": \"WARRIOR\",\n" +
                "        \"url\": \"/archetypes/21/patron-warrior\",\n" +
                "        \"standard_ccp_signature_core\": {\n" +
                "            \"as_of\": \"2021-03-31T14:16:43.785Z\",\n" +
                "            \"format\": 2,\n" +
                "            \"components\": [\n" +
                "                62549,\n" +
                "                69549,\n" +
                "                69639,\n" +
                "                69556,\n" +
                "                69643,\n" +
                "                59029,\n" +
                "                56507,\n" +
                "                63126,\n" +
                "                63117,\n" +
                "                66856\n" +
                "            ]\n" +
                "        },\n" +
                "        \"wild_ccp_signature_core\": null\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 35,\n" +
                "        \"name\": \"N'Zoth Priest\",\n" +
                "        \"player_class\": 6,\n" +
                "        \"player_class_name\": \"PRIEST\",\n" +
                "        \"url\": \"/archetypes/35/nzoth-priest\",\n" +
                "        \"standard_ccp_signature_core\": null,\n" +
                "        \"wild_ccp_signature_core\": null\n" +
                "    }\n" +
                "]";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(responseJSON, Archetype[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Archetype dummyArchetypeResponse() {
        String responseJSON =
                "    {\n" +
                "        \"id\": 7,\n" +
                "        \"name\": \"Token Druid\",\n" +
                "        \"player_class\": 2,\n" +
                "        \"player_class_name\": \"DRUID\",\n" +
                "        \"url\": \"/archetypes/7/token-druid\",\n" +
                "        \"standard_ccp_signature_core\": {\n" +
                "            \"as_of\": \"2021-06-15T19:51:02.276Z\",\n" +
                "            \"format\": 2,\n" +
                "            \"components\": [\n" +
                "                63030,\n" +
                "                63502,\n" +
                "                56684,\n" +
                "                56687,\n" +
                "                69591,\n" +
                "                61450,\n" +
                "                56677,\n" +
                "                61964,\n" +
                "                61449,\n" +
                "                56686\n" +
                "            ]\n" +
                "        },\n" +
                "        \"wild_ccp_signature_core\": null\n" +
                "    }";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(responseJSON, Archetype.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

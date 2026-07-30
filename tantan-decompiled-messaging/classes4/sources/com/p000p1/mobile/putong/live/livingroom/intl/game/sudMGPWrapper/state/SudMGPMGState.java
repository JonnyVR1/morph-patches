package com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SudMGPMGState implements Serializable {
    public static final String MG_BASEBALL_DEFUALT_STATE = "mg_baseball_defualt_state";
    public static final String MG_BASEBALL_HIDE_GAME_SCENE = "mg_baseball_hide_game_scene";
    public static final String MG_BASEBALL_MY_RANKING = "mg_baseball_my_ranking";
    public static final String MG_BASEBALL_PREPARE_FINISH = "mg_baseball_prepare_finish";
    public static final String MG_BASEBALL_RANGE_INFO = "mg_baseball_range_info";
    public static final String MG_BASEBALL_RANKING = "mg_baseball_ranking";
    public static final String MG_BASEBALL_SEND_DISTANCE = "mg_baseball_send_distance";
    public static final String MG_BASEBALL_SET_CLICK_RECT = "mg_baseball_set_click_rect";
    public static final String MG_BASEBALL_SHOW_GAME_SCENE = "mg_baseball_show_game_scene";
    public static final String MG_BASEBALL_TEXT_CONFIG = "mg_baseball_text_config";
    public static final String MG_COMMON_ALERT = "mg_common_alert";
    public static final String MG_COMMON_APP_COMMON_SELF_X_RESP = "mg_common_app_common_self_x_resp";
    public static final String MG_COMMON_DESTROY_GAME_SCENE = "mg_common_destroy_game_scene";
    public static final String MG_COMMON_GAME_ADD_AI_PLAYERS = "mg_common_game_add_ai_players";
    public static final String MG_COMMON_GAME_ASR = "mg_common_game_asr";
    public static final String MG_COMMON_GAME_BG_MUSIC_STATE = "mg_common_game_bg_music_state";
    public static final String MG_COMMON_GAME_COUNTDOWN_TIME = "mg_common_game_countdown_time";
    public static final String MG_COMMON_GAME_CREATE_ORDER = "mg_common_game_create_order";
    public static final String MG_COMMON_GAME_DISCO_ACTION = "mg_common_game_disco_action";
    public static final String MG_COMMON_GAME_DISCO_ACTION_END = "mg_common_game_disco_action_end";
    public static final String MG_COMMON_GAME_FPS = "mg_common_game_fps";
    public static final String MG_COMMON_GAME_GET_SCORE = "mg_common_game_get_score";
    public static final String MG_COMMON_GAME_IS_APP_CHIP = "mg_common_game_is_app_chip";
    public static final String MG_COMMON_GAME_MONEY_NOT_ENOUGH = "mg_common_game_money_not_enough";
    public static final String MG_COMMON_GAME_NETWORK_STATE = "mg_common_game_network_state";
    public static final String MG_COMMON_GAME_OVER_TIP = "mg_common_game_over_tip";
    public static final String MG_COMMON_GAME_PIECE_ARRIVE_END = "mg_common_game_piece_arrive_end";
    public static final String MG_COMMON_GAME_PLAYER_COLOR = "mg_common_game_player_color";
    public static final String MG_COMMON_GAME_PLAYER_ICON_POSITION = "mg_common_game_player_icon_position";
    public static final String MG_COMMON_GAME_PLAYER_MANAGED_STATE = "mg_common_game_player_managed_state";
    public static final String MG_COMMON_GAME_PLAYER_MONOPOLY_CARDS = "mg_common_game_player_monopoly_cards";
    public static final String MG_COMMON_GAME_PLAYER_PAIR_SINGULAR = "mg_common_game_player_pair_singular";
    public static final String MG_COMMON_GAME_PLAYER_RANKS = "mg_common_game_player_ranks";
    public static final String MG_COMMON_GAME_PLAYER_SCORES = "mg_common_game_player_scores";
    public static final String MG_COMMON_GAME_PREPARE_FINISH = "mg_common_game_prepare_finish";
    public static final String MG_COMMON_GAME_RULE = "mg_common_game_rule";
    public static final String MG_COMMON_GAME_SEND_BURST_WORD = "mg_common_game_send_burst_word";
    public static final String MG_COMMON_GAME_SETTINGS = "mg_common_game_settings";
    public static final String MG_COMMON_GAME_SETTLE = "mg_common_game_settle";
    public static final String MG_COMMON_GAME_SET_SCORE = "mg_common_game_set_score";
    public static final String MG_COMMON_GAME_SOUND = "mg_common_game_sound";
    public static final String MG_COMMON_GAME_SOUND_LIST = "mg_common_game_sound_list";
    public static final String MG_COMMON_GAME_SOUND_STATE = "mg_common_game_sound_state";
    public static final String MG_COMMON_GAME_STATE = "mg_common_game_state";
    public static final String MG_COMMON_GAME_UI_CUSTOM_CONFIG = "mg_common_game_ui_custom_config";
    public static final String MG_COMMON_HIDE_GAME_SCENE = "mg_common_hide_game_scene";
    public static final String MG_COMMON_KEY_WORD_TO_HIT = "mg_common_key_word_to_hit";
    public static final String MG_COMMON_PLAYER_CAPTAIN = "mg_common_player_captain";
    public static final String MG_COMMON_PLAYER_CHANGE_SEAT = "mg_common_player_change_seat";
    public static final String MG_COMMON_PLAYER_IN = "mg_common_player_in";
    public static final String MG_COMMON_PLAYER_ONLINE = "mg_common_player_online";
    public static final String MG_COMMON_PLAYER_PLAYING = "mg_common_player_playing";
    public static final String MG_COMMON_PLAYER_READY = "mg_common_player_ready";
    public static final String MG_COMMON_PLAYER_ROLE_ID = "mg_common_player_role_id";
    public static final String MG_COMMON_PUBLIC_MESSAGE = "mg_common_public_message";
    public static final String MG_COMMON_SELF_CLICK_CANCEL_JOIN_BTN = "mg_common_self_click_cancel_join_btn";
    public static final String MG_COMMON_SELF_CLICK_CANCEL_READY_BTN = "mg_common_self_click_cancel_ready_btn";
    public static final String MG_COMMON_SELF_CLICK_EXIT_GAME_BTN = "mg_common_self_click_exit_game_btn";
    public static final String MG_COMMON_SELF_CLICK_GAME_PLAYER_ICON = "mg_common_self_click_game_player_icon";
    public static final String MG_COMMON_SELF_CLICK_GAME_SETTLE_AGAIN_BTN = "mg_common_self_click_game_settle_again_btn";
    public static final String MG_COMMON_SELF_CLICK_GAME_SETTLE_CLOSE_BTN = "mg_common_self_click_game_settle_close_btn";
    public static final String MG_COMMON_SELF_CLICK_GOLD_BTN = "mg_common_self_click_gold_btn";
    public static final String MG_COMMON_SELF_CLICK_GOOD = "mg_common_self_click_good";
    public static final String MG_COMMON_SELF_CLICK_JOIN_BTN = "mg_common_self_click_join_btn";
    public static final String MG_COMMON_SELF_CLICK_POOP = "mg_common_self_click_poop";
    public static final String MG_COMMON_SELF_CLICK_READY_BTN = "mg_common_self_click_ready_btn";
    public static final String MG_COMMON_SELF_CLICK_SHARE_BTN = "mg_common_self_click_share_btn";
    public static final String MG_COMMON_SELF_CLICK_START_BTN = "mg_common_self_click_start_btn";
    public static final String MG_COMMON_SELF_DIE_STATUS = "mg_common_self_die_status";
    public static final String MG_COMMON_SELF_HEADPHONE = "mg_common_self_headphone";
    public static final String MG_COMMON_SELF_MICROPHONE = "mg_common_self_microphone";
    public static final String MG_COMMON_SELF_OB_STATUS = "mg_common_self_ob_status";
    public static final String MG_COMMON_SELF_SELECT_STATUS = "mg_common_self_select_status";
    public static final String MG_COMMON_SELF_TURN_STATUS = "mg_common_self_turn_status";
    public static final String MG_COMMON_SET_CLICK_RECT = "mg_common_set_click_rect";
    public static final String MG_COMMON_SHOW_GAME_SCENE = "mg_common_show_game_scene";
    public static final String MG_COMMON_USERS_INFO = "mg_common_users_info";
    public static final String MG_COMMON_WORST_TEAMMATE = "mg_common_worst_teammate";
    public static final String MG_CUSTOM_CR_CLICK_SEAT = "mg_custom_cr_click_seat";
    public static final String MG_CUSTOM_CR_ROOM_INIT_DATA = "mg_custom_cr_room_init_data";
    public static final String MG_CUSTOM_ROCKET_BUY_COMPONENT = "mg_custom_rocket_buy_component";
    public static final String MG_CUSTOM_ROCKET_CLICK_LOCK_COMPONENT = "mg_custom_rocket_click_lock_component";
    public static final String MG_CUSTOM_ROCKET_COMPONENT_LIST = "mg_custom_rocket_component_list";
    public static final String MG_CUSTOM_ROCKET_CONFIG = "mg_custom_rocket_config";
    public static final String MG_CUSTOM_ROCKET_CREATE_MODEL = "mg_custom_rocket_create_model";
    public static final String MG_CUSTOM_ROCKET_DYNAMIC_FIRE_PRICE = "mg_custom_rocket_dynamic_fire_price";
    public static final String MG_CUSTOM_ROCKET_FIRE_MODEL = "mg_custom_rocket_fire_model";
    public static final String MG_CUSTOM_ROCKET_FLY_CLICK = "mg_custom_rocket_fly_click";
    public static final String MG_CUSTOM_ROCKET_FLY_END = "mg_custom_rocket_fly_end";
    public static final String MG_CUSTOM_ROCKET_HIDE_GAME_SCENE = "mg_custom_rocket_hide_game_scene";
    public static final String MG_CUSTOM_ROCKET_MODEL_LIST = "mg_custom_rocket_model_list";
    public static final String MG_CUSTOM_ROCKET_ORDER_RECORD_LIST = "mg_custom_rocket_order_record_list";
    public static final String MG_CUSTOM_ROCKET_PLAY_EFFECT_FINISH = "mg_custom_rocket_play_effect_finish";
    public static final String MG_CUSTOM_ROCKET_PLAY_EFFECT_START = "mg_custom_rocket_play_effect_start";
    public static final String MG_CUSTOM_ROCKET_PREPARE_FINISH = "mg_custom_rocket_prepare_finish";
    public static final String MG_CUSTOM_ROCKET_REPLACE_COMPONENT = "mg_custom_rocket_replace_component";
    public static final String MG_CUSTOM_ROCKET_ROOM_RECORD_LIST = "mg_custom_rocket_room_record_list";
    public static final String MG_CUSTOM_ROCKET_SAVE_SIGN_COLOR = "mg_custom_rocket_save_sign_color";
    public static final String MG_CUSTOM_ROCKET_SET_CLICK_RECT = "mg_custom_rocket_set_click_rect";
    public static final String MG_CUSTOM_ROCKET_SET_DEFAULT_MODEL = "mg_custom_rocket_set_default_model";
    public static final String MG_CUSTOM_ROCKET_SHOW_GAME_SCENE = "mg_custom_rocket_show_game_scene";
    public static final String MG_CUSTOM_ROCKET_UPLOAD_MODEL_ICON = "mg_custom_rocket_upload_model_icon";
    public static final String MG_CUSTOM_ROCKET_USER_INFO = "mg_custom_rocket_user_info";
    public static final String MG_CUSTOM_ROCKET_USER_RECORD_LIST = "mg_custom_rocket_user_record_list";
    public static final String MG_CUSTOM_ROCKET_VERIFY_SIGN = "mg_custom_rocket_verify_sign";
    public static final String MG_DG_ERRORANSWER = "mg_dg_erroranswer";
    public static final String MG_DG_PAINTING = "mg_dg_painting";
    public static final String MG_DG_SCORE = "mg_dg_score";
    public static final String MG_DG_SELECTING = "mg_dg_selecting";
    public static final String MG_DG_TOTALSCORE = "mg_dg_totalscore";

    public static class InteractionClickRect {
        public float height;
        public float width;

        /* JADX INFO: renamed from: x */
        public float f7042x;

        /* JADX INFO: renamed from: y */
        public float f7043y;
    }

    public static final class MGBaseballDefaultState implements Serializable {
    }

    public static final class MGBaseballHideGameScene implements Serializable {
    }

    public static final class MGBaseballMyRanking implements Serializable {
    }

    public static final class MGBaseballPrepareFinish implements Serializable {
    }

    public static final class MGBaseballRangeInfo implements Serializable {
        public long distance;
    }

    public static final class MGBaseballRanking implements Serializable {
        public int page;
        public int size;
    }

    public static final class MGBaseballSendDistance implements Serializable {
        public int[] distances;
    }

    public static final class MGBaseballSetClickRect implements Serializable {
        public List<InteractionClickRect> list;
    }

    public static final class MGBaseballShowGameScene implements Serializable {
    }

    public static final class MGBaseballTextConfig implements Serializable {
    }

    public static class MGCommonAPPCommonSelfXResp implements Serializable {
        public String curCaptainUID;
        public boolean isIn;
        public boolean isPlaying;
        public boolean isReady;
        public String kickedUID;
        public String reportGameInfoExtras;
        public int resultCode;
        public String state;
    }

    public static class MGCommonAlert implements Serializable {
        public String state;
    }

    public static class MGCommonGameASR implements Serializable {
        public boolean isOpen;
    }

    public static class MGCommonGameAddAIPlayers implements Serializable {
        public int resultCode;
        public List<String> userIds;
    }

    public static class MGCommonGameBgMusicState implements Serializable {
        public boolean state;
    }

    public static class MGCommonGameCountdownTime implements Serializable {
        public int countdown;
    }

    public static class MGCommonGameCreateOrder implements Serializable {
        public String cmd;
        public String fromUid;
        public String payload;
        public String toUid;
        public long value;
    }

    public static final class MGCommonGameDiscoAction implements Serializable {
        public int actionId;
        public boolean isSuccess;
    }

    public static final class MGCommonGameDiscoActionEnd implements Serializable {
        public int actionId;
        public String playerId;
    }

    public static class MGCommonGameFps implements Serializable {
        public int fps;
    }

    public static class MGCommonGameGetScore implements Serializable {
    }

    public static class MGCommonGameIsAppChip implements Serializable {
        public int isAppChip;
    }

    public static class MGCommonGameMoneyNotEnough implements Serializable {
    }

    public static class MGCommonGameNetworkState implements Serializable {
        public int state;
    }

    public static class MGCommonGameOverTip implements Serializable {
        public List<String> uids;
    }

    public static class MGCommonGamePieceArriveEnd implements Serializable {
    }

    public static class MGCommonGamePlayerColor implements Serializable {
        public List<PlayerColorModel> players;

        public static class PlayerColorModel {
            public int color;
            public String uid;
        }
    }

    public static class MGCommonGamePlayerIconPosition implements Serializable {
        public PlayerIconPositionModel position;
        public String uid;

        public static class PlayerIconPositionModel {
            public double height;
            public double width;

            /* JADX INFO: renamed from: x */
            public double f7044x;

            /* JADX INFO: renamed from: y */
            public double f7045y;
        }
    }

    public static class MGCommonGamePlayerManagedState implements Serializable {
    }

    public static class MGCommonGamePlayerMonopolyCards implements Serializable {
    }

    public static class MGCommonGamePlayerPairSingular implements Serializable {
        public List<SingularModel> pairs;

        public static class SingularModel implements Serializable {
            public int pair;
            public String uid;
        }
    }

    public static class MGCommonGamePlayerRanks implements Serializable {
        public List<RanksModel> ranks;

        public static class RanksModel implements Serializable {
            public int rank;
            public String uid;
        }
    }

    public static class MGCommonGamePlayerScores implements Serializable {
        public List<ScoresModel> scores;

        public static class ScoresModel implements Serializable {
            public int score;
            public String uid;
        }
    }

    public static class MGCommonGamePrepareFinish implements Serializable {
    }

    public static class MGCommonGameRule implements Serializable {
        public GameRuleModel gameMode;

        public static class GameRuleModel {
            public Integer ante;
            public Integer bBuyIn;
            public Integer darkCard;
            public Integer isAutoStart;
            public Integer isStraddle;
            public Integer potLimit;
            public Integer round;
            public Integer sBuyIn;
            public Integer singleLimit;
            public Integer smallBlind;
            public Double tableDuration;
            public Integer thinkTime;
        }
    }

    public static class MGCommonGameSendBurstWord implements Serializable {
        public String text;
    }

    public static class MGCommonGameSetScore implements Serializable {
        public long incrementalScore;
        public long lastRoundScore;
        public String roundId;
        public long totalScore;
    }

    public static class MGCommonGameSettings implements Serializable {
    }

    public static class MGCommonGameSettle implements Serializable {
        public int gameMode;
        public String gameRoundId;
        public List<PlayerResult> results;

        public static class PlayerResult implements Serializable {
            public int award;
            public int isAI;
            public int isEscaped;
            public String killerId;
            public int rank;
            public int score;
            public String uid;
        }
    }

    public static class MGCommonGameSound implements Serializable {
        public boolean isPlay;
        public String name;
        public String times;
        public String type;
        public String url;
    }

    public static class MGCommonGameSoundList implements Serializable {
        public List<MGCommonGameSound> list;

        public static class MGCommonGameSound implements Serializable {
            public String name;
            public String type;
            public String url;
        }
    }

    public static class MGCommonGameSoundState implements Serializable {
        public boolean state;
    }

    public static class MGCommonGameState implements Serializable {
        public static final int IDLE = 0;
        public static final int LOADING = 1;
        public static final int PLAYING = 2;
        public static final int UNKNOW = -1;
        public int gameState;
    }

    public static class MGCommonGameUiCustomConfig implements Serializable {
    }

    public static class MGCommonHideGameScene implements Serializable {
    }

    public static class MGCommonKeyWordToHit implements Serializable {
        public String realWord;
        public String word;
        public String wordLanguage;
        public List<String> wordList;
        public String wordType;
    }

    public static class MGCommonPlayerCaptain implements Serializable {
        public boolean isCaptain;
    }

    public static class MGCommonPlayerChangeSeat implements Serializable {
        public int currentSeatIndex;
        public int preSeatIndex;
    }

    public static class MGCommonPlayerIn implements Serializable {
        public boolean isIn;
        public String kickUID;
        public int reason;
        public int teamId;
    }

    public static class MGCommonPlayerOnline implements Serializable {
        public boolean isOnline;
    }

    public static class MGCommonPlayerPlaying implements Serializable {
        public String gameRoundId;
        public boolean isPlaying;
        public int reason;
        public Boolean spaceMax;
    }

    public static class MGCommonPlayerReady implements Serializable {
        public boolean isReady;
    }

    public static class MGCommonPlayerRoleId implements Serializable {
        public List<MGCommonPlayerModel> playersRoleId;

        public static class MGCommonPlayerModel implements Serializable {
            public int roleId;
            public String uid;
        }
    }

    public static class MGCommonPublicMessage implements Serializable {
        public List<MGCommonPublicMessageMsg> msg;
        public int type;

        public static class MGCommonPublicMessageMsg implements Serializable {
            public int phrase;
            public MGCommonPublicMessageMsgText text;
            public MGCommonPublicMessageMsgUser user;
        }

        public static class MGCommonPublicMessageMsgText implements Serializable {

            @SerializedName("ar-SA")
            public String ar_SA;

            @SerializedName("default")
            public String defaultStr;

            @SerializedName("en-GB")
            public String en_GB;

            @SerializedName("en-US")
            public String en_US;

            @SerializedName("es-ES")
            public String es_ES;

            @SerializedName("id-ID")
            public String id_ID;

            @SerializedName("ja-JP")
            public String ja_JP;

            @SerializedName("ko-KR")
            public String ko_KR;

            @SerializedName("ms-BN")
            public String ms_BN;

            @SerializedName("ms-MY")
            public String ms_MY;

            @SerializedName("th-TH")
            public String th_TH;

            @SerializedName("tr-TR")
            public String tr_TR;

            @SerializedName("ur-PK")
            public String ur_PK;

            @SerializedName("vi-VN")
            public String vi_VN;

            @SerializedName("zh-CN")
            public String zh_CN;

            @SerializedName("zh-HK")
            public String zh_HK;

            @SerializedName("zh-MO")
            public String zh_MO;

            @SerializedName("zh-SG")
            public String zh_SG;

            @SerializedName("zh-TW")
            public String zh_TW;
        }

        public static class MGCommonPublicMessageMsgUser implements Serializable {
            public String color;
            public String defaultStr;
            public String name;
            public String uid;
        }
    }

    public static class MGCommonSelfClickCancelJoinBtn implements Serializable {
    }

    public static class MGCommonSelfClickCancelReadyBtn implements Serializable {
    }

    public static class MGCommonSelfClickExitGameBtn implements Serializable {
    }

    public static class MGCommonSelfClickGamePlayerIcon implements Serializable {
        public String uid;
    }

    public static class MGCommonSelfClickGameSettleAgainBtn implements Serializable {
    }

    public static class MGCommonSelfClickGameSettleCloseBtn implements Serializable {
    }

    public static class MGCommonSelfClickGoldBtn implements Serializable {
    }

    public static class MGCommonSelfClickGood implements Serializable {
    }

    public static class MGCommonSelfClickJoinBtn implements Serializable {
        public int seatIndex;
    }

    public static class MGCommonSelfClickPoop implements Serializable {
    }

    public static class MGCommonSelfClickReadyBtn implements Serializable {
    }

    public static class MGCommonSelfClickShareBtn implements Serializable {
    }

    public static class MGCommonSelfClickStartBtn implements Serializable {
    }

    public static class MGCommonSelfDieStatus implements Serializable {
        public boolean isDeath;
        public String uid;
    }

    public static class MGCommonSelfHeadphone implements Serializable {
        public boolean isOn;
    }

    public static class MGCommonSelfMicrophone implements Serializable {
        public boolean isOn;
    }

    public static class MGCommonSelfObStatus implements Serializable {
        public boolean isOb;
    }

    public static class MGCommonSelfSelectStatus implements Serializable {
        public boolean isSelected;
        public String uid;
    }

    public static class MGCommonSelfTurnStatus implements Serializable {
        public boolean isTurn;
        public String uid;
    }

    public static class MGCommonSetClickRect implements Serializable {
        public List<InteractionClickRect> list;
    }

    public static class MGCommonShowGameScene implements Serializable {
    }

    public static class MGCommonUsersInfo implements Serializable {
        public List<String> uids;
    }

    public static class MGCommonWorstTeammate implements Serializable {
        public String uid;
    }

    public static final class MGCustomCrClickSeat implements Serializable {
        public int seatIndex;
    }

    public static final class MGCustomCrRoomInitData implements Serializable {
    }

    public static final class MGCustomRocketBuyComponent implements Serializable {
        public List<ComponentModel> componentList;

        public static class ComponentModel {
            public String componentId;
            public String value;
        }
    }

    public static final class MGCustomRocketClickLockComponent implements Serializable {
        public String componentId;
        public int type;
    }

    public static final class MGCustomRocketComponentList implements Serializable {
    }

    public static final class MGCustomRocketConfig implements Serializable {
    }

    public static final class MGCustomRocketCreateModel implements Serializable {
        public List<ComponentModel> componentList;

        public static class ComponentModel {
            public String itemId;
        }
    }

    public static final class MGCustomRocketDynamicFirePrice implements Serializable {
        public List<ComponentModel> componentList;

        public static class ComponentModel {
            public String itemId;
        }
    }

    public static final class MGCustomRocketFireModel implements Serializable {
        public List<ComponentModel> componentList;

        public static class ComponentModel {
            public String itemId;
            public int type;
        }
    }

    public static final class MGCustomRocketFlyClick implements Serializable {
    }

    public static final class MGCustomRocketFlyEnd implements Serializable {
        public long clickNumber;
        public long flyNumber;
    }

    public static final class MGCustomRocketHideGameScene implements Serializable {
    }

    public static final class MGCustomRocketModelList implements Serializable {
    }

    public static final class MGCustomRocketOrderRecordList implements Serializable {
        public int pageIndex;
        public int pageSize;
    }

    public static final class MGCustomRocketPlayEffectFinish implements Serializable {
    }

    public static final class MGCustomRocketPlayEffectStart implements Serializable {
    }

    public static final class MGCustomRocketPrepareFinish implements Serializable {
    }

    public static final class MGCustomRocketReplaceComponent implements Serializable {
        public List<ComponentModel> componentList;
        public String modelId;

        public static class ComponentModel {
            public String itemId;
        }
    }

    public static final class MGCustomRocketRoomRecordList implements Serializable {
        public int pageIndex;
        public int pageSize;
    }

    public static final class MGCustomRocketSaveSignColor implements Serializable {
        public List<ComponentModel> componentList;

        public static class ComponentModel {
            public String componentId;
            public String modelId;
            public String value;
        }
    }

    public static final class MGCustomRocketSetClickRect implements Serializable {
        public List<InteractionClickRect> list;
    }

    public static final class MGCustomRocketSetDefaultModel implements Serializable {
        public String modelId;
    }

    public static final class MGCustomRocketShowGameScene implements Serializable {
    }

    public static final class MGCustomRocketUploadModelIcon implements Serializable {
        public String data;
    }

    public static final class MGCustomRocketUserInfo implements Serializable {
        public List<String> userIdList;
    }

    public static final class MGCustomRocketUserRecordList implements Serializable {
        public int pageIndex;
        public int pageSize;
        public String userId;
    }

    public static final class MGCustomRocketVerifySign implements Serializable {
        public String sign;
    }

    public static class MGDGErroranswer implements Serializable {
        public String msg;
    }

    public static class MGDGPainting implements Serializable {
        public boolean isPainting;
    }

    public static final class MGDGScore implements Serializable {
        public String msg;
    }

    public static class MGDGSelecting implements Serializable {
        public boolean isSelecting;
    }

    public static class MGDGTotalscore implements Serializable {
        public String msg;
    }
}

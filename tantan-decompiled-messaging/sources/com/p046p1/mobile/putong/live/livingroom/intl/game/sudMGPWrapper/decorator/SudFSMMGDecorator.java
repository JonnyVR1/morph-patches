package com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator;

import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.ISudFSMStateHandleUtils;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.SudJsonUtils;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.math.p131ec.Tnaf;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: classes4.dex */
public class SudFSMMGDecorator implements ISudFSMMG {
    private final SudFSMMGCache sudFSMMGCache = new SudFSMMGCache();
    private SudFSMMGListener sudFSMMGListener;

    public void destroyMG() {
        this.sudFSMMGCache.destroyMG();
        this.sudFSMMGListener = null;
    }

    public String getCaptainUserId() {
        return this.sudFSMMGCache.getCaptainUserId();
    }

    public int getGameState() {
        return this.sudFSMMGCache.getGameState();
    }

    public int getPlayerInNumber() {
        return this.sudFSMMGCache.getPlayerInNumber();
    }

    public SudFSMMGCache getSudFSMMGCache() {
        return this.sudFSMMGCache;
    }

    public boolean isHitBomb() {
        return this.sudFSMMGCache.isHitBomb();
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onExpireCode(iSudFSMStateHandle, str);
        }
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGameDestroyed() {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameDestroyed();
        }
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGameLoadingProgress(int i, int i2, int i3) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameLoadingProgress(i, i2, i3);
        }
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGameLog(String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameLog(str);
        }
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGameStarted() {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameStarted();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGameStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener == null || !sudFSMMGListener.onGameStateChange(iSudFSMStateHandle, str, str2)) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2118673438:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_ASR)) {
                        b = 0;
                    }
                    break;
                case -2118668725:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_FPS)) {
                        b = 1;
                    }
                    break;
                case -2069568135:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_DISCO_ACTION)) {
                        b = 2;
                    }
                    break;
                case -2023077693:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SOUND_STATE)) {
                        b = 3;
                    }
                    break;
                case -1992822984:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_PLAY_EFFECT_FINISH)) {
                        b = 4;
                    }
                    break;
                case -1864332851:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_PREPARE_FINISH)) {
                        b = 5;
                    }
                    break;
                case -1812197903:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_CANCEL_JOIN_BTN)) {
                        b = 6;
                    }
                    break;
                case -1809949382:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_SET_CLICK_RECT)) {
                        b = 7;
                    }
                    break;
                case -1628413997:
                    if (str.equals(SudMGPMGState.MG_COMMON_DESTROY_GAME_SCENE)) {
                        b = 8;
                    }
                    break;
                case -1602173366:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_HEADPHONE)) {
                        b = 9;
                    }
                    break;
                case -1411738428:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_START_BTN)) {
                        b = 10;
                    }
                    break;
                case -1396115934:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_NETWORK_STATE)) {
                        b = 11;
                    }
                    break;
                case -1359655285:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_UPLOAD_MODEL_ICON)) {
                        b = 12;
                    }
                    break;
                case -1253858854:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_RULE)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1216469555:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_MY_RANKING)) {
                        b = 14;
                    }
                    break;
                case -1189063208:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_GOOD)) {
                        b = 15;
                    }
                    break;
                case -1188795077:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_POOP)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1146281537:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_SHOW_GAME_SCENE)) {
                        b = 17;
                    }
                    break;
                case -1133601021:
                    if (str.equals(SudMGPMGState.MG_COMMON_APP_COMMON_SELF_X_RESP)) {
                        b = 18;
                    }
                    break;
                case -1077772147:
                    if (str.equals(SudMGPMGState.MG_COMMON_ALERT)) {
                        b = 19;
                    }
                    break;
                case -994374560:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_USER_INFO)) {
                        b = 20;
                    }
                    break;
                case -989429003:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_PREPARE_FINISH)) {
                        b = 21;
                    }
                    break;
                case -982131123:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_FLY_END)) {
                        b = 22;
                    }
                    break;
                case -966306398:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_COMPONENT_LIST)) {
                        b = 23;
                    }
                    break;
                case -965513184:
                    if (str.equals(SudMGPMGState.MG_COMMON_PUBLIC_MESSAGE)) {
                        b = 24;
                    }
                    break;
                case -939009322:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_CANCEL_READY_BTN)) {
                        b = 25;
                    }
                    break;
                case -935045534:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_SET_CLICK_RECT)) {
                        b = 26;
                    }
                    break;
                case -864478783:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_SHARE_BTN)) {
                        b = 27;
                    }
                    break;
                case -807856060:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_CONFIG)) {
                        b = 28;
                    }
                    break;
                case -690928683:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_EXIT_GAME_BTN)) {
                        b = 29;
                    }
                    break;
                case -581417994:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_MODEL_LIST)) {
                        b = 30;
                    }
                    break;
                case -572535400:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_GOLD_BTN)) {
                        b = 31;
                    }
                    break;
                case -473500139:
                    if (str.equals(SudMGPMGState.MG_COMMON_PLAYER_ROLE_ID)) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case -389544267:
                    if (str.equals(SudMGPMGState.MG_COMMON_KEY_WORD_TO_HIT)) {
                        b = 33;
                    }
                    break;
                case -372825723:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_READY_BTN)) {
                        b = 34;
                    }
                    break;
                case -329058019:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_PLAY_EFFECT_START)) {
                        b = 35;
                    }
                    break;
                case -285257195:
                    if (str.equals(SudMGPMGState.MG_COMMON_WORST_TEAMMATE)) {
                        b = 36;
                    }
                    break;
                case -266215845:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_BG_MUSIC_STATE)) {
                        b = 37;
                    }
                    break;
                case -251682319:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_MANAGED_STATE)) {
                        b = 38;
                    }
                    break;
                case -214165007:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SOUND)) {
                        b = 39;
                    }
                    break;
                case -214035085:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_STATE)) {
                        b = 40;
                    }
                    break;
                case -151096742:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_HIDE_GAME_SCENE)) {
                        b = 41;
                    }
                    break;
                case -145921380:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_CR_ROOM_INIT_DATA)) {
                        b = 42;
                    }
                    break;
                case -100255749:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_GAME_SETTLE_AGAIN_BTN)) {
                        b = 43;
                    }
                    break;
                case -65479124:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SOUND_LIST)) {
                        b = 44;
                    }
                    break;
                case 39615015:
                    if (str.equals(SudMGPMGState.MG_COMMON_SET_CLICK_RECT)) {
                        b = 45;
                    }
                    break;
                case 48534186:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_TEXT_CONFIG)) {
                        b = 46;
                    }
                    break;
                case 109255767:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SET_SCORE)) {
                        b = 47;
                    }
                    break;
                case 188550499:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_COLOR)) {
                        b = 48;
                    }
                    break;
                case 188616609:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_SAVE_SIGN_COLOR)) {
                        b = 49;
                    }
                    break;
                case 197610850:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_SEND_DISTANCE)) {
                        b = 50;
                    }
                    break;
                case 200827714:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PIECE_ARRIVE_END)) {
                        b = 51;
                    }
                    break;
                case 201988039:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_RANKS)) {
                        b = 52;
                    }
                    break;
                case 205933975:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_SHOW_GAME_SCENE)) {
                        b = 53;
                    }
                    break;
                case 272905218:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_CLICK_LOCK_COMPONENT)) {
                        b = 54;
                    }
                    break;
                case 284276066:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_JOIN_BTN)) {
                        b = 55;
                    }
                    break;
                case 323872843:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_GET_SCORE)) {
                        b = 56;
                    }
                    break;
                case 355639922:
                    if (str.equals(SudMGPMGState.MG_COMMON_SHOW_GAME_SCENE)) {
                        b = 57;
                    }
                    break;
                case 375966530:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_BUY_COMPONENT)) {
                        b = HttpTokens.COLON;
                    }
                    break;
                case 428773104:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_REPLACE_COMPONENT)) {
                        b = HttpTokens.SEMI_COLON;
                    }
                    break;
                case 435942017:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_IS_APP_CHIP)) {
                        b = 60;
                    }
                    break;
                case 442579031:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_ADD_AI_PLAYERS)) {
                        b = 61;
                    }
                    break;
                case 522049171:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_GAME_SETTLE_CLOSE_BTN)) {
                        b = 62;
                    }
                    break;
                case 600926786:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SEND_BURST_WORD)) {
                        b = Utf8.REPLACEMENT_BYTE;
                    }
                    break;
                case 677686785:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_VERIFY_SIGN)) {
                        b = 64;
                    }
                    break;
                case 749777882:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_USER_RECORD_LIST)) {
                        b = 65;
                    }
                    break;
                case 755301913:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_ORDER_RECORD_LIST)) {
                        b = 66;
                    }
                    break;
                case 766039042:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_DYNAMIC_FIRE_PRICE)) {
                        b = 67;
                    }
                    break;
                case 790960641:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_DEFUALT_STATE)) {
                        b = 68;
                    }
                    break;
                case 880818453:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_DISCO_ACTION_END)) {
                        b = 69;
                    }
                    break;
                case 918556302:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_OVER_TIP)) {
                        b = 70;
                    }
                    break;
                case 927974169:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_MONEY_NOT_ENOUGH)) {
                        b = 71;
                    }
                    break;
                case 959137262:
                    if (str.equals(SudMGPMGState.MG_COMMON_SELF_MICROPHONE)) {
                        b = 72;
                    }
                    break;
                case 982389212:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_PAIR_SINGULAR)) {
                        b = 73;
                    }
                    break;
                case 993850963:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_MONOPOLY_CARDS)) {
                        b = 74;
                    }
                    break;
                case 1008767052:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_SET_DEFAULT_MODEL)) {
                        b = 75;
                    }
                    break;
                case 1062897274:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_FLY_CLICK)) {
                        b = 76;
                    }
                    break;
                case 1201118770:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_HIDE_GAME_SCENE)) {
                        b = 77;
                    }
                    break;
                case 1252536554:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_ROOM_RECORD_LIST)) {
                        b = 78;
                    }
                    break;
                case 1291082572:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_RANKING)) {
                        b = 79;
                    }
                    break;
                case 1304163316:
                    if (str.equals(SudMGPMGState.MG_COMMON_USERS_INFO)) {
                        b = 80;
                    }
                    break;
                case 1319344098:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_FIRE_MODEL)) {
                        b = 81;
                    }
                    break;
                case 1350824717:
                    if (str.equals(SudMGPMGState.MG_COMMON_HIDE_GAME_SCENE)) {
                        b = 82;
                    }
                    break;
                case 1673698728:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_ROCKET_CREATE_MODEL)) {
                        b = 83;
                    }
                    break;
                case 1694475305:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PREPARE_FINISH)) {
                        b = 84;
                    }
                    break;
                case 1823746049:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SETTINGS)) {
                        b = 85;
                    }
                    break;
                case 1825518490:
                    if (str.equals(SudMGPMGState.MG_BASEBALL_RANGE_INFO)) {
                        b = 86;
                    }
                    break;
                case 1861544291:
                    if (str.equals(SudMGPMGState.MG_CUSTOM_CR_CLICK_SEAT)) {
                        b = 87;
                    }
                    break;
                case 1912659779:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_UI_CUSTOM_CONFIG)) {
                        b = 88;
                    }
                    break;
                case 1941560489:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_SETTLE)) {
                        b = 89;
                    }
                    break;
                case 1987717929:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_CREATE_ORDER)) {
                        b = 90;
                    }
                    break;
                case 1997174305:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_SCORES)) {
                        b = 91;
                    }
                    break;
                case 2130207791:
                    if (str.equals(SudMGPMGState.MG_COMMON_GAME_PLAYER_ICON_POSITION)) {
                        b = 92;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    SudMGPMGState.MGCommonGameASR mGCommonGameASR = (SudMGPMGState.MGCommonGameASR) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameASR.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameASR(iSudFSMStateHandle, mGCommonGameASR);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 1:
                    SudMGPMGState.MGCommonGameFps mGCommonGameFps = (SudMGPMGState.MGCommonGameFps) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameFps.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameFps(iSudFSMStateHandle, mGCommonGameFps);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 2:
                    SudMGPMGState.MGCommonGameDiscoAction mGCommonGameDiscoAction = (SudMGPMGState.MGCommonGameDiscoAction) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameDiscoAction.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameDiscoAction(iSudFSMStateHandle, mGCommonGameDiscoAction);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 3:
                    SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState = (SudMGPMGState.MGCommonGameSoundState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSoundState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSoundState(iSudFSMStateHandle, mGCommonGameSoundState);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 4:
                    SudMGPMGState.MGCustomRocketPlayEffectFinish mGCustomRocketPlayEffectFinish = (SudMGPMGState.MGCustomRocketPlayEffectFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketPlayEffectFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketPlayEffectFinish(iSudFSMStateHandle, mGCustomRocketPlayEffectFinish);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 5:
                    SudMGPMGState.MGCustomRocketPrepareFinish mGCustomRocketPrepareFinish = (SudMGPMGState.MGCustomRocketPrepareFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketPrepareFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketPrepareFinish(iSudFSMStateHandle, mGCustomRocketPrepareFinish);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 6:
                    SudMGPMGState.MGCommonSelfClickCancelJoinBtn mGCommonSelfClickCancelJoinBtn = (SudMGPMGState.MGCommonSelfClickCancelJoinBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickCancelJoinBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickCancelJoinBtn(iSudFSMStateHandle, mGCommonSelfClickCancelJoinBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 7:
                    SudMGPMGState.MGCustomRocketSetClickRect mGCustomRocketSetClickRect = (SudMGPMGState.MGCustomRocketSetClickRect) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketSetClickRect.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketSetClickRect(iSudFSMStateHandle, mGCustomRocketSetClickRect);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 8:
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonDestroyGameScene(iSudFSMStateHandle);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 9:
                    SudMGPMGState.MGCommonSelfHeadphone mGCommonSelfHeadphone = (SudMGPMGState.MGCommonSelfHeadphone) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfHeadphone.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfHeadphone(iSudFSMStateHandle, mGCommonSelfHeadphone);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 10:
                    SudMGPMGState.MGCommonSelfClickStartBtn mGCommonSelfClickStartBtn = (SudMGPMGState.MGCommonSelfClickStartBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickStartBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickStartBtn(iSudFSMStateHandle, mGCommonSelfClickStartBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 11:
                    SudMGPMGState.MGCommonGameNetworkState mGCommonGameNetworkState = (SudMGPMGState.MGCommonGameNetworkState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameNetworkState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameNetworkState(iSudFSMStateHandle, mGCommonGameNetworkState);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 12:
                    SudMGPMGState.MGCustomRocketUploadModelIcon mGCustomRocketUploadModelIcon = (SudMGPMGState.MGCustomRocketUploadModelIcon) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketUploadModelIcon.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketUploadModelIcon(iSudFSMStateHandle, mGCustomRocketUploadModelIcon);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 13:
                    SudMGPMGState.MGCommonGameRule mGCommonGameRule = (SudMGPMGState.MGCommonGameRule) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameRule.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameRule(iSudFSMStateHandle, mGCommonGameRule);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 14:
                    SudMGPMGState.MGBaseballMyRanking mGBaseballMyRanking = (SudMGPMGState.MGBaseballMyRanking) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballMyRanking.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballMyRanking(iSudFSMStateHandle, mGBaseballMyRanking);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 15:
                    SudMGPMGState.MGCommonSelfClickGood mGCommonSelfClickGood = (SudMGPMGState.MGCommonSelfClickGood) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGood.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGood(iSudFSMStateHandle, mGCommonSelfClickGood);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 16:
                    SudMGPMGState.MGCommonSelfClickPoop mGCommonSelfClickPoop = (SudMGPMGState.MGCommonSelfClickPoop) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickPoop.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickPoop(iSudFSMStateHandle, mGCommonSelfClickPoop);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 17:
                    SudMGPMGState.MGCustomRocketShowGameScene mGCustomRocketShowGameScene = (SudMGPMGState.MGCustomRocketShowGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketShowGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketShowGameScene(iSudFSMStateHandle, mGCustomRocketShowGameScene);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 18:
                    SudMGPMGState.MGCommonAPPCommonSelfXResp mGCommonAPPCommonSelfXResp = (SudMGPMGState.MGCommonAPPCommonSelfXResp) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonAPPCommonSelfXResp.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonAPPCommonSelfXResp(iSudFSMStateHandle, mGCommonAPPCommonSelfXResp);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 19:
                    SudMGPMGState.MGCommonAlert mGCommonAlert = (SudMGPMGState.MGCommonAlert) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonAlert.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonAlert(iSudFSMStateHandle, mGCommonAlert);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 20:
                    SudMGPMGState.MGCustomRocketUserInfo mGCustomRocketUserInfo = (SudMGPMGState.MGCustomRocketUserInfo) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketUserInfo.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketUserInfo(iSudFSMStateHandle, mGCustomRocketUserInfo);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 21:
                    SudMGPMGState.MGBaseballPrepareFinish mGBaseballPrepareFinish = (SudMGPMGState.MGBaseballPrepareFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballPrepareFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballPrepareFinish(iSudFSMStateHandle, mGBaseballPrepareFinish);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 22:
                    SudMGPMGState.MGCustomRocketFlyEnd mGCustomRocketFlyEnd = (SudMGPMGState.MGCustomRocketFlyEnd) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketFlyEnd.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketFlyEnd(iSudFSMStateHandle, mGCustomRocketFlyEnd);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 23:
                    SudMGPMGState.MGCustomRocketComponentList mGCustomRocketComponentList = (SudMGPMGState.MGCustomRocketComponentList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketComponentList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketComponentList(iSudFSMStateHandle, mGCustomRocketComponentList);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 24:
                    SudMGPMGState.MGCommonPublicMessage mGCommonPublicMessage = (SudMGPMGState.MGCommonPublicMessage) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonPublicMessage.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonPublicMessage(iSudFSMStateHandle, mGCommonPublicMessage);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 25:
                    SudMGPMGState.MGCommonSelfClickCancelReadyBtn mGCommonSelfClickCancelReadyBtn = (SudMGPMGState.MGCommonSelfClickCancelReadyBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickCancelReadyBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickCancelReadyBtn(iSudFSMStateHandle, mGCommonSelfClickCancelReadyBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 26:
                    SudMGPMGState.MGBaseballSetClickRect mGBaseballSetClickRect = (SudMGPMGState.MGBaseballSetClickRect) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballSetClickRect.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballSetClickRect(iSudFSMStateHandle, mGBaseballSetClickRect);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 27:
                    SudMGPMGState.MGCommonSelfClickShareBtn mGCommonSelfClickShareBtn = (SudMGPMGState.MGCommonSelfClickShareBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickShareBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickShareBtn(iSudFSMStateHandle, mGCommonSelfClickShareBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 28:
                    SudMGPMGState.MGCustomRocketConfig mGCustomRocketConfig = (SudMGPMGState.MGCustomRocketConfig) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketConfig.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketConfig(iSudFSMStateHandle, mGCustomRocketConfig);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 29:
                    SudMGPMGState.MGCommonSelfClickExitGameBtn mGCommonSelfClickExitGameBtn = (SudMGPMGState.MGCommonSelfClickExitGameBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickExitGameBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickExitGameBtn(iSudFSMStateHandle, mGCommonSelfClickExitGameBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 30:
                    SudMGPMGState.MGCustomRocketModelList mGCustomRocketModelList = (SudMGPMGState.MGCustomRocketModelList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketModelList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketModelList(iSudFSMStateHandle, mGCustomRocketModelList);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 31:
                    SudMGPMGState.MGCommonSelfClickGoldBtn mGCommonSelfClickGoldBtn = (SudMGPMGState.MGCommonSelfClickGoldBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGoldBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGoldBtn(iSudFSMStateHandle, mGCommonSelfClickGoldBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 32:
                    SudMGPMGState.MGCommonPlayerRoleId mGCommonPlayerRoleId = (SudMGPMGState.MGCommonPlayerRoleId) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonPlayerRoleId.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonPlayerRoleId(iSudFSMStateHandle, mGCommonPlayerRoleId);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 33:
                    SudMGPMGState.MGCommonKeyWordToHit mGCommonKeyWordToHit = (SudMGPMGState.MGCommonKeyWordToHit) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonKeyWordToHit.class);
                    this.sudFSMMGCache.onGameMGCommonKeyWordToHit(mGCommonKeyWordToHit);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonKeyWordToHit(iSudFSMStateHandle, mGCommonKeyWordToHit);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 34:
                    SudMGPMGState.MGCommonSelfClickReadyBtn mGCommonSelfClickReadyBtn = (SudMGPMGState.MGCommonSelfClickReadyBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickReadyBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickReadyBtn(iSudFSMStateHandle, mGCommonSelfClickReadyBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 35:
                    SudMGPMGState.MGCustomRocketPlayEffectStart mGCustomRocketPlayEffectStart = (SudMGPMGState.MGCustomRocketPlayEffectStart) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketPlayEffectStart.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketPlayEffectStart(iSudFSMStateHandle, mGCustomRocketPlayEffectStart);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 36:
                    SudMGPMGState.MGCommonWorstTeammate mGCommonWorstTeammate = (SudMGPMGState.MGCommonWorstTeammate) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonWorstTeammate.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonWorstTeammate(iSudFSMStateHandle, mGCommonWorstTeammate);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 37:
                    SudMGPMGState.MGCommonGameBgMusicState mGCommonGameBgMusicState = (SudMGPMGState.MGCommonGameBgMusicState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameBgMusicState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameBgMusicState(iSudFSMStateHandle, mGCommonGameBgMusicState);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 38:
                    SudMGPMGState.MGCommonGamePlayerManagedState mGCommonGamePlayerManagedState = (SudMGPMGState.MGCommonGamePlayerManagedState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerManagedState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerManagedState(iSudFSMStateHandle, mGCommonGamePlayerManagedState);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 39:
                    SudMGPMGState.MGCommonGameSound mGCommonGameSound = (SudMGPMGState.MGCommonGameSound) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSound.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSound(iSudFSMStateHandle, mGCommonGameSound);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 40:
                    SudMGPMGState.MGCommonGameState mGCommonGameState = (SudMGPMGState.MGCommonGameState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameState.class);
                    this.sudFSMMGCache.onGameMGCommonGameState(mGCommonGameState);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameState(iSudFSMStateHandle, mGCommonGameState);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 41:
                    SudMGPMGState.MGCustomRocketHideGameScene mGCustomRocketHideGameScene = (SudMGPMGState.MGCustomRocketHideGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketHideGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketHideGameScene(iSudFSMStateHandle, mGCustomRocketHideGameScene);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 42:
                    SudMGPMGState.MGCustomCrRoomInitData mGCustomCrRoomInitData = (SudMGPMGState.MGCustomCrRoomInitData) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomCrRoomInitData.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomCrRoomInitData(iSudFSMStateHandle, mGCustomCrRoomInitData);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 43:
                    SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn mGCommonSelfClickGameSettleAgainBtn = (SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGameSettleAgainBtn(iSudFSMStateHandle, mGCommonSelfClickGameSettleAgainBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 44:
                    SudMGPMGState.MGCommonGameSoundList mGCommonGameSoundList = (SudMGPMGState.MGCommonGameSoundList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSoundList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSoundList(iSudFSMStateHandle, mGCommonGameSoundList);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 45:
                    SudMGPMGState.MGCommonSetClickRect mGCommonSetClickRect = (SudMGPMGState.MGCommonSetClickRect) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSetClickRect.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSetClickRect(iSudFSMStateHandle, mGCommonSetClickRect);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 46:
                    SudMGPMGState.MGBaseballTextConfig mGBaseballTextConfig = (SudMGPMGState.MGBaseballTextConfig) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballTextConfig.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballTextConfig(iSudFSMStateHandle, mGBaseballTextConfig);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 47:
                    SudMGPMGState.MGCommonGameSetScore mGCommonGameSetScore = (SudMGPMGState.MGCommonGameSetScore) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSetScore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSetScore(iSudFSMStateHandle, mGCommonGameSetScore);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 48:
                    SudMGPMGState.MGCommonGamePlayerColor mGCommonGamePlayerColor = (SudMGPMGState.MGCommonGamePlayerColor) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerColor.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerColor(iSudFSMStateHandle, mGCommonGamePlayerColor);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 49:
                    SudMGPMGState.MGCustomRocketSaveSignColor mGCustomRocketSaveSignColor = (SudMGPMGState.MGCustomRocketSaveSignColor) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketSaveSignColor.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketSaveSignColor(iSudFSMStateHandle, mGCustomRocketSaveSignColor);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 50:
                    SudMGPMGState.MGBaseballSendDistance mGBaseballSendDistance = (SudMGPMGState.MGBaseballSendDistance) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballSendDistance.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballSendDistance(iSudFSMStateHandle, mGBaseballSendDistance);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 51:
                    SudMGPMGState.MGCommonGamePieceArriveEnd mGCommonGamePieceArriveEnd = (SudMGPMGState.MGCommonGamePieceArriveEnd) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePieceArriveEnd.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePieceArriveEnd(iSudFSMStateHandle, mGCommonGamePieceArriveEnd);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 52:
                    SudMGPMGState.MGCommonGamePlayerRanks mGCommonGamePlayerRanks = (SudMGPMGState.MGCommonGamePlayerRanks) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerRanks.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerRanks(iSudFSMStateHandle, mGCommonGamePlayerRanks);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 53:
                    SudMGPMGState.MGBaseballShowGameScene mGBaseballShowGameScene = (SudMGPMGState.MGBaseballShowGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballShowGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballShowGameScene(iSudFSMStateHandle, mGBaseballShowGameScene);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 54:
                    SudMGPMGState.MGCustomRocketClickLockComponent mGCustomRocketClickLockComponent = (SudMGPMGState.MGCustomRocketClickLockComponent) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketClickLockComponent.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketClickLockComponent(iSudFSMStateHandle, mGCustomRocketClickLockComponent);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 55:
                    SudMGPMGState.MGCommonSelfClickJoinBtn mGCommonSelfClickJoinBtn = (SudMGPMGState.MGCommonSelfClickJoinBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickJoinBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickJoinBtn(iSudFSMStateHandle, mGCommonSelfClickJoinBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 56:
                    SudMGPMGState.MGCommonGameGetScore mGCommonGameGetScore = (SudMGPMGState.MGCommonGameGetScore) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameGetScore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameGetScore(iSudFSMStateHandle, mGCommonGameGetScore);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 57:
                    SudMGPMGState.MGCommonShowGameScene mGCommonShowGameScene = (SudMGPMGState.MGCommonShowGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonShowGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonShowGameScene(iSudFSMStateHandle, mGCommonShowGameScene);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 58:
                    SudMGPMGState.MGCustomRocketBuyComponent mGCustomRocketBuyComponent = (SudMGPMGState.MGCustomRocketBuyComponent) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketBuyComponent.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketBuyComponent(iSudFSMStateHandle, mGCustomRocketBuyComponent);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 59:
                    SudMGPMGState.MGCustomRocketReplaceComponent mGCustomRocketReplaceComponent = (SudMGPMGState.MGCustomRocketReplaceComponent) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketReplaceComponent.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketReplaceComponent(iSudFSMStateHandle, mGCustomRocketReplaceComponent);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 60:
                    SudMGPMGState.MGCommonGameIsAppChip mGCommonGameIsAppChip = (SudMGPMGState.MGCommonGameIsAppChip) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameIsAppChip.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameIsAppChip(iSudFSMStateHandle, mGCommonGameIsAppChip);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 61:
                    SudMGPMGState.MGCommonGameAddAIPlayers mGCommonGameAddAIPlayers = (SudMGPMGState.MGCommonGameAddAIPlayers) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameAddAIPlayers.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameAddAIPlayers(iSudFSMStateHandle, mGCommonGameAddAIPlayers);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 62:
                    SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn mGCommonSelfClickGameSettleCloseBtn = (SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGameSettleCloseBtn(iSudFSMStateHandle, mGCommonSelfClickGameSettleCloseBtn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 63:
                    SudMGPMGState.MGCommonGameSendBurstWord mGCommonGameSendBurstWord = (SudMGPMGState.MGCommonGameSendBurstWord) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSendBurstWord.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSendBurstWord(iSudFSMStateHandle, mGCommonGameSendBurstWord);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 64:
                    SudMGPMGState.MGCustomRocketVerifySign mGCustomRocketVerifySign = (SudMGPMGState.MGCustomRocketVerifySign) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketVerifySign.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketVerifySign(iSudFSMStateHandle, mGCustomRocketVerifySign);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 65:
                    SudMGPMGState.MGCustomRocketUserRecordList mGCustomRocketUserRecordList = (SudMGPMGState.MGCustomRocketUserRecordList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketUserRecordList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketUserRecordList(iSudFSMStateHandle, mGCustomRocketUserRecordList);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 66:
                    SudMGPMGState.MGCustomRocketOrderRecordList mGCustomRocketOrderRecordList = (SudMGPMGState.MGCustomRocketOrderRecordList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketOrderRecordList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketOrderRecordList(iSudFSMStateHandle, mGCustomRocketOrderRecordList);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 67:
                    SudMGPMGState.MGCustomRocketDynamicFirePrice mGCustomRocketDynamicFirePrice = (SudMGPMGState.MGCustomRocketDynamicFirePrice) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketDynamicFirePrice.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketDynamicFirePrice(iSudFSMStateHandle, mGCustomRocketDynamicFirePrice);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 68:
                    SudMGPMGState.MGBaseballDefaultState mGBaseballDefaultState = (SudMGPMGState.MGBaseballDefaultState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballDefaultState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballDefaultState(iSudFSMStateHandle, mGBaseballDefaultState);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 69:
                    SudMGPMGState.MGCommonGameDiscoActionEnd mGCommonGameDiscoActionEnd = (SudMGPMGState.MGCommonGameDiscoActionEnd) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameDiscoActionEnd.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameDiscoActionEnd(iSudFSMStateHandle, mGCommonGameDiscoActionEnd);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 70:
                    SudMGPMGState.MGCommonGameOverTip mGCommonGameOverTip = (SudMGPMGState.MGCommonGameOverTip) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameOverTip.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameOverTip(iSudFSMStateHandle, mGCommonGameOverTip);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 71:
                    SudMGPMGState.MGCommonGameMoneyNotEnough mGCommonGameMoneyNotEnough = (SudMGPMGState.MGCommonGameMoneyNotEnough) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameMoneyNotEnough.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameMoneyNotEnough(iSudFSMStateHandle, mGCommonGameMoneyNotEnough);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 72:
                    SudMGPMGState.MGCommonSelfMicrophone mGCommonSelfMicrophone = (SudMGPMGState.MGCommonSelfMicrophone) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfMicrophone.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfMicrophone(iSudFSMStateHandle, mGCommonSelfMicrophone);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                    SudMGPMGState.MGCommonGamePlayerPairSingular mGCommonGamePlayerPairSingular = (SudMGPMGState.MGCommonGamePlayerPairSingular) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerPairSingular.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerPairSingular(iSudFSMStateHandle, mGCommonGamePlayerPairSingular);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 74:
                    SudMGPMGState.MGCommonGamePlayerMonopolyCards mGCommonGamePlayerMonopolyCards = (SudMGPMGState.MGCommonGamePlayerMonopolyCards) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerMonopolyCards.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerMonopolyCards(iSudFSMStateHandle, mGCommonGamePlayerMonopolyCards);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 75:
                    SudMGPMGState.MGCustomRocketSetDefaultModel mGCustomRocketSetDefaultModel = (SudMGPMGState.MGCustomRocketSetDefaultModel) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketSetDefaultModel.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketSetDefaultModel(iSudFSMStateHandle, mGCustomRocketSetDefaultModel);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 76:
                    SudMGPMGState.MGCustomRocketFlyClick mGCustomRocketFlyClick = (SudMGPMGState.MGCustomRocketFlyClick) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketFlyClick.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketFlyClick(iSudFSMStateHandle, mGCustomRocketFlyClick);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 77:
                    SudMGPMGState.MGBaseballHideGameScene mGBaseballHideGameScene = (SudMGPMGState.MGBaseballHideGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballHideGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballHideGameScene(iSudFSMStateHandle, mGBaseballHideGameScene);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 78:
                    SudMGPMGState.MGCustomRocketRoomRecordList mGCustomRocketRoomRecordList = (SudMGPMGState.MGCustomRocketRoomRecordList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketRoomRecordList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketRoomRecordList(iSudFSMStateHandle, mGCustomRocketRoomRecordList);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 79:
                    SudMGPMGState.MGBaseballRanking mGBaseballRanking = (SudMGPMGState.MGBaseballRanking) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballRanking.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballRanking(iSudFSMStateHandle, mGBaseballRanking);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 80:
                    SudMGPMGState.MGCommonUsersInfo mGCommonUsersInfo = (SudMGPMGState.MGCommonUsersInfo) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonUsersInfo.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonUsersInfo(iSudFSMStateHandle, mGCommonUsersInfo);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.FILE_REFERENCE /* 81 */:
                    SudMGPMGState.MGCustomRocketFireModel mGCustomRocketFireModel = (SudMGPMGState.MGCustomRocketFireModel) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketFireModel.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketFireModel(iSudFSMStateHandle, mGCustomRocketFireModel);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.COMMAND_TO_PERFORM /* 82 */:
                    SudMGPMGState.MGCommonHideGameScene mGCommonHideGameScene = (SudMGPMGState.MGCommonHideGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonHideGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonHideGameScene(iSudFSMStateHandle, mGCommonHideGameScene);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.DISCRETIONARY_DATA /* 83 */:
                    SudMGPMGState.MGCustomRocketCreateModel mGCustomRocketCreateModel = (SudMGPMGState.MGCustomRocketCreateModel) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketCreateModel.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketCreateModel(iSudFSMStateHandle, mGCustomRocketCreateModel);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                    SudMGPMGState.MGCommonGamePrepareFinish mGCommonGamePrepareFinish = (SudMGPMGState.MGCommonGamePrepareFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePrepareFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePrepareFinish(iSudFSMStateHandle, mGCommonGamePrepareFinish);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 85:
                    SudMGPMGState.MGCommonGameSettings mGCommonGameSettings = (SudMGPMGState.MGCommonGameSettings) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSettings.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSettings(iSudFSMStateHandle, mGCommonGameSettings);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.TRACK1_APPLICATION /* 86 */:
                    SudMGPMGState.MGBaseballRangeInfo mGBaseballRangeInfo = (SudMGPMGState.MGBaseballRangeInfo) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballRangeInfo.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballRangeInfo(iSudFSMStateHandle, mGBaseballRangeInfo);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 87:
                    SudMGPMGState.MGCustomCrClickSeat mGCustomCrClickSeat = (SudMGPMGState.MGCustomCrClickSeat) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomCrClickSeat.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomCrClickSeat(iSudFSMStateHandle, mGCustomCrClickSeat);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 88:
                    SudMGPMGState.MGCommonGameUiCustomConfig mGCommonGameUiCustomConfig = (SudMGPMGState.MGCommonGameUiCustomConfig) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameUiCustomConfig.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameUiCustomConfig(iSudFSMStateHandle, mGCommonGameUiCustomConfig);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 89:
                    SudMGPMGState.MGCommonGameSettle mGCommonGameSettle = (SudMGPMGState.MGCommonGameSettle) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSettle.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSettle(iSudFSMStateHandle, mGCommonGameSettle);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 90:
                    SudMGPMGState.MGCommonGameCreateOrder mGCommonGameCreateOrder = (SudMGPMGState.MGCommonGameCreateOrder) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameCreateOrder.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameCreateOrder(iSudFSMStateHandle, mGCommonGameCreateOrder);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.NAME /* 91 */:
                    SudMGPMGState.MGCommonGamePlayerScores mGCommonGamePlayerScores = (SudMGPMGState.MGCommonGamePlayerScores) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerScores.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerScores(iSudFSMStateHandle, mGCommonGamePlayerScores);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case EACTags.TAG_LIST /* 92 */:
                    SudMGPMGState.MGCommonGamePlayerIconPosition mGCommonGamePlayerIconPosition = (SudMGPMGState.MGCommonGamePlayerIconPosition) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerIconPosition.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerIconPosition(iSudFSMStateHandle, mGCommonGamePlayerIconPosition);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                default:
                    ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    break;
            }
        }
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGetGameCfg(iSudFSMStateHandle, str);
        }
    }

    @Override // tech.sud.gip.core.ISudFSMMG
    public void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGetGameViewInfo(iSudFSMStateHandle, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // tech.sud.gip.core.ISudFSMMG
    public void onPlayerStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2, String str3) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener == null || !sudFSMMGListener.onPlayerStateChange(iSudFSMStateHandle, str, str2, str3)) {
            str2.getClass();
            byte b = -1;
            switch (str2.hashCode()) {
                case -1984464519:
                    if (str2.equals(SudMGPMGState.MG_COMMON_GAME_COUNTDOWN_TIME)) {
                        b = 0;
                    }
                    break;
                case -1941248683:
                    if (str2.equals(SudMGPMGState.MG_COMMON_SELF_DIE_STATUS)) {
                        b = 1;
                    }
                    break;
                case -1654460091:
                    if (str2.equals(SudMGPMGState.MG_COMMON_PLAYER_CHANGE_SEAT)) {
                        b = 2;
                    }
                    break;
                case -1400129573:
                    if (str2.equals(SudMGPMGState.MG_DG_PAINTING)) {
                        b = 3;
                    }
                    break;
                case -1297818699:
                    if (str2.equals(SudMGPMGState.MG_COMMON_PLAYER_CAPTAIN)) {
                        b = 4;
                    }
                    break;
                case -810961105:
                    if (str2.equals(SudMGPMGState.MG_DG_SELECTING)) {
                        b = 5;
                    }
                    break;
                case -155635375:
                    if (str2.equals(SudMGPMGState.MG_COMMON_SELF_SELECT_STATUS)) {
                        b = 6;
                    }
                    break;
                case 8137332:
                    if (str2.equals(SudMGPMGState.MG_COMMON_PLAYER_READY)) {
                        b = 7;
                    }
                    break;
                case 96096997:
                    if (str2.equals(SudMGPMGState.MG_COMMON_SELF_CLICK_GAME_PLAYER_ICON)) {
                        b = 8;
                    }
                    break;
                case 167958004:
                    if (str2.equals(SudMGPMGState.MG_COMMON_PLAYER_IN)) {
                        b = 9;
                    }
                    break;
                case 175013794:
                    if (str2.equals(SudMGPMGState.MG_COMMON_PLAYER_ONLINE)) {
                        b = 10;
                    }
                    break;
                case 649971354:
                    if (str2.equals(SudMGPMGState.MG_COMMON_SELF_OB_STATUS)) {
                        b = 11;
                    }
                    break;
                case 965267675:
                    if (str2.equals(SudMGPMGState.MG_DG_SCORE)) {
                        b = 12;
                    }
                    break;
                case 969613744:
                    if (str2.equals(SudMGPMGState.MG_COMMON_SELF_TURN_STATUS)) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1360159567:
                    if (str2.equals(SudMGPMGState.MG_DG_ERRORANSWER)) {
                        b = 14;
                    }
                    break;
                case 1597915429:
                    if (str2.equals(SudMGPMGState.MG_DG_TOTALSCORE)) {
                        b = 15;
                    }
                    break;
                case 1951019199:
                    if (str2.equals(SudMGPMGState.MG_COMMON_PLAYER_PLAYING)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    SudMGPMGState.MGCommonGameCountdownTime mGCommonGameCountdownTime = (SudMGPMGState.MGCommonGameCountdownTime) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonGameCountdownTime.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonGameCountdownTime(iSudFSMStateHandle, str, mGCommonGameCountdownTime);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 1:
                    SudMGPMGState.MGCommonSelfDieStatus mGCommonSelfDieStatus = (SudMGPMGState.MGCommonSelfDieStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfDieStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfDieStatus(iSudFSMStateHandle, str, mGCommonSelfDieStatus);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 2:
                    SudMGPMGState.MGCommonPlayerChangeSeat mGCommonPlayerChangeSeat = (SudMGPMGState.MGCommonPlayerChangeSeat) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerChangeSeat.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerChangeSeat(iSudFSMStateHandle, str, mGCommonPlayerChangeSeat);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 3:
                    SudMGPMGState.MGDGPainting mGDGPainting = (SudMGPMGState.MGDGPainting) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGPainting.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGPainting(iSudFSMStateHandle, str, mGDGPainting);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 4:
                    SudMGPMGState.MGCommonPlayerCaptain mGCommonPlayerCaptain = (SudMGPMGState.MGCommonPlayerCaptain) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerCaptain.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerCaptain(str, mGCommonPlayerCaptain);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerCaptain(iSudFSMStateHandle, str, mGCommonPlayerCaptain);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 5:
                    SudMGPMGState.MGDGSelecting mGDGSelecting = (SudMGPMGState.MGDGSelecting) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGSelecting.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGSelecting(iSudFSMStateHandle, str, mGDGSelecting);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 6:
                    SudMGPMGState.MGCommonSelfSelectStatus mGCommonSelfSelectStatus = (SudMGPMGState.MGCommonSelfSelectStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfSelectStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfSelectStatus(iSudFSMStateHandle, str, mGCommonSelfSelectStatus);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 7:
                    SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady = (SudMGPMGState.MGCommonPlayerReady) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerReady.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerReady(str, mGCommonPlayerReady);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerReady(iSudFSMStateHandle, str, mGCommonPlayerReady);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 8:
                    SudMGPMGState.MGCommonSelfClickGamePlayerIcon mGCommonSelfClickGamePlayerIcon = (SudMGPMGState.MGCommonSelfClickGamePlayerIcon) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfClickGamePlayerIcon.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfClickGamePlayerIcon(iSudFSMStateHandle, str, mGCommonSelfClickGamePlayerIcon);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 9:
                    SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn = (SudMGPMGState.MGCommonPlayerIn) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerIn.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerIn(str, mGCommonPlayerIn);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerIn(iSudFSMStateHandle, str, mGCommonPlayerIn);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 10:
                    SudMGPMGState.MGCommonPlayerOnline mGCommonPlayerOnline = (SudMGPMGState.MGCommonPlayerOnline) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerOnline.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerOnline(iSudFSMStateHandle, str, mGCommonPlayerOnline);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 11:
                    SudMGPMGState.MGCommonSelfObStatus mGCommonSelfObStatus = (SudMGPMGState.MGCommonSelfObStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfObStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfObStatus(iSudFSMStateHandle, str, mGCommonSelfObStatus);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 12:
                    SudMGPMGState.MGDGScore mGDGScore = (SudMGPMGState.MGDGScore) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGScore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGScore(iSudFSMStateHandle, str, mGDGScore);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 13:
                    SudMGPMGState.MGCommonSelfTurnStatus mGCommonSelfTurnStatus = (SudMGPMGState.MGCommonSelfTurnStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfTurnStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfTurnStatus(iSudFSMStateHandle, str, mGCommonSelfTurnStatus);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 14:
                    SudMGPMGState.MGDGErroranswer mGDGErroranswer = (SudMGPMGState.MGDGErroranswer) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGErroranswer.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGErroranswer(iSudFSMStateHandle, str, mGDGErroranswer);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 15:
                    SudMGPMGState.MGDGTotalscore mGDGTotalscore = (SudMGPMGState.MGDGTotalscore) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGTotalscore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGTotalscore(iSudFSMStateHandle, str, mGDGTotalscore);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                case 16:
                    SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying = (SudMGPMGState.MGCommonPlayerPlaying) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerPlaying.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerPlaying(str, mGCommonPlayerPlaying);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerPlaying(iSudFSMStateHandle, str, mGCommonPlayerPlaying);
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    }
                    break;
                default:
                    ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    break;
            }
        }
    }

    public boolean playerIsIn(String str) {
        return this.sudFSMMGCache.playerIsIn(str);
    }

    public boolean playerIsPlaying(String str) {
        return this.sudFSMMGCache.playerIsPlaying(str);
    }

    public boolean playerIsReady(String str) {
        return this.sudFSMMGCache.playerIsReady(str);
    }

    public void setSudFSMMGListener(SudFSMMGListener sudFSMMGListener) {
        this.sudFSMMGListener = sudFSMMGListener;
    }
}

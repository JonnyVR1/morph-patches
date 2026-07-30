package com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator;

import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPAPPState;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.SudJsonUtils;
import java.nio.ByteBuffer;
import java.util.List;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerNotifyStateChange;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SudFSTAPPDecorator {
    private ISudFSTAPP iSudFSTAPP;
    private OnNotifyStateChangeListener onNotifyStateChangeListener;

    public interface OnNotifyStateChangeListener {
        void onNotifyStateChange(String str, String str2);
    }

    public void destroyMG() {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.destroyMG();
            this.iSudFSTAPP = null;
        }
    }

    public void notifyAPPCommonGameAddAIPlayers(List<SudMGPAPPState.AIPlayers> list, int i) {
        SudMGPAPPState.APPCommonGameAddAIPlayers aPPCommonGameAddAIPlayers = new SudMGPAPPState.APPCommonGameAddAIPlayers();
        aPPCommonGameAddAIPlayers.aiPlayers = list;
        aPPCommonGameAddAIPlayers.isReady = i;
        notifyStateChange(SudMGPAPPState.APP_COMMON_GAME_ADD_AI_PLAYERS, aPPCommonGameAddAIPlayers);
    }

    public void notifyAPPCommonGameReconnect() {
        notifyStateChange(SudMGPAPPState.APP_COMMON_GAME_RECONNECT, new SudMGPAPPState.APPCommonGameReconnect());
    }

    public void notifyAPPCommonGameScore(long j) {
        SudMGPAPPState.APPCommonGameScore aPPCommonGameScore = new SudMGPAPPState.APPCommonGameScore();
        aPPCommonGameScore.score = j;
        notifyStateChange(SudMGPAPPState.APP_COMMON_GAME_SCORE, aPPCommonGameScore);
    }

    public void notifyAPPCommonGameSettingSelectInfo(SudMGPAPPState.Ludo ludo) {
        SudMGPAPPState.APPCommonGameSettingSelectInfo aPPCommonGameSettingSelectInfo = new SudMGPAPPState.APPCommonGameSettingSelectInfo();
        aPPCommonGameSettingSelectInfo.ludo = ludo;
        notifyStateChange(SudMGPAPPState.APP_COMMON_GAME_SETTING_SELECT_INFO, aPPCommonGameSettingSelectInfo);
    }

    public void notifyAPPCommonGameSoundVolume(int i) {
        SudMGPAPPState.APPCommonGameSoundVolume aPPCommonGameSoundVolume = new SudMGPAPPState.APPCommonGameSoundVolume();
        aPPCommonGameSoundVolume.volume = i;
        notifyStateChange(SudMGPAPPState.APP_COMMON_GAME_SOUND_VOLUME, aPPCommonGameSoundVolume);
    }

    public void notifyAPPCommonOpenBgMusic(boolean z) {
        SudMGPAPPState.APPCommonOpenBgMusic aPPCommonOpenBgMusic = new SudMGPAPPState.APPCommonOpenBgMusic();
        aPPCommonOpenBgMusic.isOpen = z;
        notifyStateChange(SudMGPAPPState.APP_COMMON_OPEN_BG_MUSIC, aPPCommonOpenBgMusic);
    }

    public void notifyAPPCommonOpenSound(boolean z) {
        SudMGPAPPState.APPCommonOpenSound aPPCommonOpenSound = new SudMGPAPPState.APPCommonOpenSound();
        aPPCommonOpenSound.isOpen = z;
        notifyStateChange(SudMGPAPPState.APP_COMMON_OPEN_SOUND, aPPCommonOpenSound);
    }

    public void notifyAPPCommonOpenVibrate(boolean z) {
        SudMGPAPPState.APPCommonOpenVibrate aPPCommonOpenVibrate = new SudMGPAPPState.APPCommonOpenVibrate();
        aPPCommonOpenVibrate.isOpen = z;
        notifyStateChange(SudMGPAPPState.APP_COMMON_OPEN_VIBRATE, aPPCommonOpenVibrate);
    }

    public void notifyAPPCommonSelfCaptain(String str) {
        SudMGPAPPState.APPCommonSelfCaptain aPPCommonSelfCaptain = new SudMGPAPPState.APPCommonSelfCaptain();
        aPPCommonSelfCaptain.curCaptainUID = str;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_CAPTAIN, aPPCommonSelfCaptain);
    }

    public void notifyAPPCommonSelfEnd() {
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_END, new SudMGPAPPState.APPCommonSelfEnd());
    }

    public void notifyAPPCommonSelfIn(boolean z, int i, boolean z2, int i2) {
        SudMGPAPPState.APPCommonSelfIn aPPCommonSelfIn = new SudMGPAPPState.APPCommonSelfIn();
        aPPCommonSelfIn.isIn = z;
        aPPCommonSelfIn.seatIndex = i;
        aPPCommonSelfIn.isSeatRandom = z2;
        aPPCommonSelfIn.teamId = i2;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_IN, aPPCommonSelfIn);
    }

    public void notifyAPPCommonSelfKick(String str) {
        SudMGPAPPState.APPCommonSelfKick aPPCommonSelfKick = new SudMGPAPPState.APPCommonSelfKick();
        aPPCommonSelfKick.kickedUID = str;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_KICK, aPPCommonSelfKick);
    }

    public void notifyAPPCommonSelfMicrophone(boolean z, boolean z2) {
        SudMGPAPPState.APPCommonSelfMicrophone aPPCommonSelfMicrophone = new SudMGPAPPState.APPCommonSelfMicrophone();
        aPPCommonSelfMicrophone.isOn = z;
        aPPCommonSelfMicrophone.isDisabled = z2;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_MICROPHONE, aPPCommonSelfMicrophone);
    }

    public void notifyAPPCommonSelfPlaying(boolean z, String str, String str2) {
        SudMGPAPPState.APPCommonSelfPlaying aPPCommonSelfPlaying = new SudMGPAPPState.APPCommonSelfPlaying();
        aPPCommonSelfPlaying.isPlaying = z;
        aPPCommonSelfPlaying.reportGameInfoExtras = str;
        aPPCommonSelfPlaying.reportGameInfoKey = str2;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_PLAYING, aPPCommonSelfPlaying);
    }

    public void notifyAPPCommonSelfReady(boolean z) {
        SudMGPAPPState.APPCommonSelfReady aPPCommonSelfReady = new SudMGPAPPState.APPCommonSelfReady();
        aPPCommonSelfReady.isReady = z;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_READY, aPPCommonSelfReady);
    }

    public void notifyAPPCommonSelfTextHitState(boolean z, String str, String str2, String str3, List<String> list, List<Integer> list2) {
        SudMGPAPPState.APPCommonSelfTextHitState aPPCommonSelfTextHitState = new SudMGPAPPState.APPCommonSelfTextHitState();
        aPPCommonSelfTextHitState.isHit = z;
        aPPCommonSelfTextHitState.keyWord = str;
        aPPCommonSelfTextHitState.text = str2;
        aPPCommonSelfTextHitState.wordType = str3;
        aPPCommonSelfTextHitState.keyWordList = list;
        aPPCommonSelfTextHitState.numberList = list2;
        notifyStateChange(SudMGPAPPState.APP_COMMON_SELF_TEXT_HIT, aPPCommonSelfTextHitState);
    }

    public void notifyAppCommonGameDiscoAction(int i, Integer num, Boolean bool, String str, String str2) {
        SudMGPAPPState.AppCommonGameDiscoAction appCommonGameDiscoAction = new SudMGPAPPState.AppCommonGameDiscoAction();
        appCommonGameDiscoAction.actionId = i;
        appCommonGameDiscoAction.cooldown = num;
        appCommonGameDiscoAction.isTop = bool;
        appCommonGameDiscoAction.field1 = str;
        appCommonGameDiscoAction.field2 = str2;
        notifyStateChange(SudMGPAPPState.APP_COMMON_GAME_DISCO_ACTION, appCommonGameDiscoAction);
    }

    public void notifyStateChange(String str, String str2, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.notifyStateChange(str, str2, iSudListenerNotifyStateChange);
            OnNotifyStateChangeListener onNotifyStateChangeListener = this.onNotifyStateChangeListener;
            if (onNotifyStateChangeListener != null) {
                onNotifyStateChangeListener.onNotifyStateChange(str, str2);
            }
        }
    }

    public void pauseMG() {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.pauseMG();
        }
    }

    public void playMG() {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.playMG();
        }
    }

    public void pushAudio(ByteBuffer byteBuffer, int i) {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.pushAudio(byteBuffer, i);
        }
    }

    public void reloadMG() {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.reloadMG();
        }
    }

    public void setISudFSTAPP(ISudFSTAPP iSudFSTAPP) {
        this.iSudFSTAPP = iSudFSTAPP;
    }

    public void setOnNotifyStateChangeListener(OnNotifyStateChangeListener onNotifyStateChangeListener) {
        this.onNotifyStateChangeListener = onNotifyStateChangeListener;
    }

    public void startMG() {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.startMG();
        }
    }

    public void stopMG() {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.stopMG();
        }
    }

    public void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        ISudFSTAPP iSudFSTAPP = this.iSudFSTAPP;
        if (iSudFSTAPP != null) {
            iSudFSTAPP.updateCode(str, iSudListenerNotifyStateChange);
        }
    }

    public void notifyStateChange(String str, String str2) {
        notifyStateChange(str, str2, null);
    }

    public void notifyStateChange(String str, Object obj) {
        notifyStateChange(str, SudJsonUtils.toJson(obj), null);
    }
}

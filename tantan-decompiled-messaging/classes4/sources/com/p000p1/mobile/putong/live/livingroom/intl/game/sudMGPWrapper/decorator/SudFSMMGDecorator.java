package com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator;

import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.ISudFSMStateHandleUtils;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.SudJsonUtils;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
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

    public void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onExpireCode(iSudFSMStateHandle, str);
        }
    }

    public void onGameDestroyed() {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameDestroyed();
        }
    }

    public void onGameLoadingProgress(int i, int i2, int i3) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameLoadingProgress(i, i2, i3);
        }
    }

    public void onGameLog(String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameLog(str);
        }
    }

    public void onGameStarted() {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGameStarted();
        }
    }

    public void onGameStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener == null || !sudFSMMGListener.onGameStateChange(iSudFSMStateHandle, str, str2)) {
            str.getClass();
            switch (str) {
                case "mg_common_game_asr":
                    SudMGPMGState.MGCommonGameASR mGCommonGameASR = (SudMGPMGState.MGCommonGameASR) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameASR.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameASR(iSudFSMStateHandle, mGCommonGameASR);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_fps":
                    SudMGPMGState.MGCommonGameFps mGCommonGameFps = (SudMGPMGState.MGCommonGameFps) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameFps.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameFps(iSudFSMStateHandle, mGCommonGameFps);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_disco_action":
                    SudMGPMGState.MGCommonGameDiscoAction mGCommonGameDiscoAction = (SudMGPMGState.MGCommonGameDiscoAction) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameDiscoAction.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameDiscoAction(iSudFSMStateHandle, mGCommonGameDiscoAction);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_sound_state":
                    SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState = (SudMGPMGState.MGCommonGameSoundState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSoundState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSoundState(iSudFSMStateHandle, mGCommonGameSoundState);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_play_effect_finish":
                    SudMGPMGState.MGCustomRocketPlayEffectFinish mGCustomRocketPlayEffectFinish = (SudMGPMGState.MGCustomRocketPlayEffectFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketPlayEffectFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketPlayEffectFinish(iSudFSMStateHandle, mGCustomRocketPlayEffectFinish);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_prepare_finish":
                    SudMGPMGState.MGCustomRocketPrepareFinish mGCustomRocketPrepareFinish = (SudMGPMGState.MGCustomRocketPrepareFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketPrepareFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketPrepareFinish(iSudFSMStateHandle, mGCustomRocketPrepareFinish);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_cancel_join_btn":
                    SudMGPMGState.MGCommonSelfClickCancelJoinBtn mGCommonSelfClickCancelJoinBtn = (SudMGPMGState.MGCommonSelfClickCancelJoinBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickCancelJoinBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickCancelJoinBtn(iSudFSMStateHandle, mGCommonSelfClickCancelJoinBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_set_click_rect":
                    SudMGPMGState.MGCustomRocketSetClickRect mGCustomRocketSetClickRect = (SudMGPMGState.MGCustomRocketSetClickRect) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketSetClickRect.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketSetClickRect(iSudFSMStateHandle, mGCustomRocketSetClickRect);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_destroy_game_scene":
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonDestroyGameScene(iSudFSMStateHandle);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_headphone":
                    SudMGPMGState.MGCommonSelfHeadphone mGCommonSelfHeadphone = (SudMGPMGState.MGCommonSelfHeadphone) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfHeadphone.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfHeadphone(iSudFSMStateHandle, mGCommonSelfHeadphone);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_start_btn":
                    SudMGPMGState.MGCommonSelfClickStartBtn mGCommonSelfClickStartBtn = (SudMGPMGState.MGCommonSelfClickStartBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickStartBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickStartBtn(iSudFSMStateHandle, mGCommonSelfClickStartBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_network_state":
                    SudMGPMGState.MGCommonGameNetworkState mGCommonGameNetworkState = (SudMGPMGState.MGCommonGameNetworkState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameNetworkState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameNetworkState(iSudFSMStateHandle, mGCommonGameNetworkState);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_upload_model_icon":
                    SudMGPMGState.MGCustomRocketUploadModelIcon mGCustomRocketUploadModelIcon = (SudMGPMGState.MGCustomRocketUploadModelIcon) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketUploadModelIcon.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketUploadModelIcon(iSudFSMStateHandle, mGCustomRocketUploadModelIcon);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_rule":
                    SudMGPMGState.MGCommonGameRule mGCommonGameRule = (SudMGPMGState.MGCommonGameRule) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameRule.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameRule(iSudFSMStateHandle, mGCommonGameRule);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_my_ranking":
                    SudMGPMGState.MGBaseballMyRanking mGBaseballMyRanking = (SudMGPMGState.MGBaseballMyRanking) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballMyRanking.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballMyRanking(iSudFSMStateHandle, mGBaseballMyRanking);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_good":
                    SudMGPMGState.MGCommonSelfClickGood mGCommonSelfClickGood = (SudMGPMGState.MGCommonSelfClickGood) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGood.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGood(iSudFSMStateHandle, mGCommonSelfClickGood);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_poop":
                    SudMGPMGState.MGCommonSelfClickPoop mGCommonSelfClickPoop = (SudMGPMGState.MGCommonSelfClickPoop) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickPoop.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickPoop(iSudFSMStateHandle, mGCommonSelfClickPoop);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_show_game_scene":
                    SudMGPMGState.MGCustomRocketShowGameScene mGCustomRocketShowGameScene = (SudMGPMGState.MGCustomRocketShowGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketShowGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketShowGameScene(iSudFSMStateHandle, mGCustomRocketShowGameScene);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_app_common_self_x_resp":
                    SudMGPMGState.MGCommonAPPCommonSelfXResp mGCommonAPPCommonSelfXResp = (SudMGPMGState.MGCommonAPPCommonSelfXResp) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonAPPCommonSelfXResp.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonAPPCommonSelfXResp(iSudFSMStateHandle, mGCommonAPPCommonSelfXResp);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_alert":
                    SudMGPMGState.MGCommonAlert mGCommonAlert = (SudMGPMGState.MGCommonAlert) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonAlert.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonAlert(iSudFSMStateHandle, mGCommonAlert);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_user_info":
                    SudMGPMGState.MGCustomRocketUserInfo mGCustomRocketUserInfo = (SudMGPMGState.MGCustomRocketUserInfo) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketUserInfo.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketUserInfo(iSudFSMStateHandle, mGCustomRocketUserInfo);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_prepare_finish":
                    SudMGPMGState.MGBaseballPrepareFinish mGBaseballPrepareFinish = (SudMGPMGState.MGBaseballPrepareFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballPrepareFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballPrepareFinish(iSudFSMStateHandle, mGBaseballPrepareFinish);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_fly_end":
                    SudMGPMGState.MGCustomRocketFlyEnd mGCustomRocketFlyEnd = (SudMGPMGState.MGCustomRocketFlyEnd) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketFlyEnd.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketFlyEnd(iSudFSMStateHandle, mGCustomRocketFlyEnd);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_component_list":
                    SudMGPMGState.MGCustomRocketComponentList mGCustomRocketComponentList = (SudMGPMGState.MGCustomRocketComponentList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketComponentList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketComponentList(iSudFSMStateHandle, mGCustomRocketComponentList);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_public_message":
                    SudMGPMGState.MGCommonPublicMessage mGCommonPublicMessage = (SudMGPMGState.MGCommonPublicMessage) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonPublicMessage.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonPublicMessage(iSudFSMStateHandle, mGCommonPublicMessage);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_cancel_ready_btn":
                    SudMGPMGState.MGCommonSelfClickCancelReadyBtn mGCommonSelfClickCancelReadyBtn = (SudMGPMGState.MGCommonSelfClickCancelReadyBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickCancelReadyBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickCancelReadyBtn(iSudFSMStateHandle, mGCommonSelfClickCancelReadyBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_set_click_rect":
                    SudMGPMGState.MGBaseballSetClickRect mGBaseballSetClickRect = (SudMGPMGState.MGBaseballSetClickRect) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballSetClickRect.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballSetClickRect(iSudFSMStateHandle, mGBaseballSetClickRect);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_share_btn":
                    SudMGPMGState.MGCommonSelfClickShareBtn mGCommonSelfClickShareBtn = (SudMGPMGState.MGCommonSelfClickShareBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickShareBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickShareBtn(iSudFSMStateHandle, mGCommonSelfClickShareBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_config":
                    SudMGPMGState.MGCustomRocketConfig mGCustomRocketConfig = (SudMGPMGState.MGCustomRocketConfig) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketConfig.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketConfig(iSudFSMStateHandle, mGCustomRocketConfig);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_exit_game_btn":
                    SudMGPMGState.MGCommonSelfClickExitGameBtn mGCommonSelfClickExitGameBtn = (SudMGPMGState.MGCommonSelfClickExitGameBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickExitGameBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickExitGameBtn(iSudFSMStateHandle, mGCommonSelfClickExitGameBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_model_list":
                    SudMGPMGState.MGCustomRocketModelList mGCustomRocketModelList = (SudMGPMGState.MGCustomRocketModelList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketModelList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketModelList(iSudFSMStateHandle, mGCustomRocketModelList);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_gold_btn":
                    SudMGPMGState.MGCommonSelfClickGoldBtn mGCommonSelfClickGoldBtn = (SudMGPMGState.MGCommonSelfClickGoldBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGoldBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGoldBtn(iSudFSMStateHandle, mGCommonSelfClickGoldBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_role_id":
                    SudMGPMGState.MGCommonPlayerRoleId mGCommonPlayerRoleId = (SudMGPMGState.MGCommonPlayerRoleId) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonPlayerRoleId.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonPlayerRoleId(iSudFSMStateHandle, mGCommonPlayerRoleId);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_key_word_to_hit":
                    SudMGPMGState.MGCommonKeyWordToHit mGCommonKeyWordToHit = (SudMGPMGState.MGCommonKeyWordToHit) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonKeyWordToHit.class);
                    this.sudFSMMGCache.onGameMGCommonKeyWordToHit(mGCommonKeyWordToHit);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonKeyWordToHit(iSudFSMStateHandle, mGCommonKeyWordToHit);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_ready_btn":
                    SudMGPMGState.MGCommonSelfClickReadyBtn mGCommonSelfClickReadyBtn = (SudMGPMGState.MGCommonSelfClickReadyBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickReadyBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickReadyBtn(iSudFSMStateHandle, mGCommonSelfClickReadyBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_play_effect_start":
                    SudMGPMGState.MGCustomRocketPlayEffectStart mGCustomRocketPlayEffectStart = (SudMGPMGState.MGCustomRocketPlayEffectStart) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketPlayEffectStart.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketPlayEffectStart(iSudFSMStateHandle, mGCustomRocketPlayEffectStart);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_worst_teammate":
                    SudMGPMGState.MGCommonWorstTeammate mGCommonWorstTeammate = (SudMGPMGState.MGCommonWorstTeammate) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonWorstTeammate.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonWorstTeammate(iSudFSMStateHandle, mGCommonWorstTeammate);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_bg_music_state":
                    SudMGPMGState.MGCommonGameBgMusicState mGCommonGameBgMusicState = (SudMGPMGState.MGCommonGameBgMusicState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameBgMusicState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameBgMusicState(iSudFSMStateHandle, mGCommonGameBgMusicState);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_managed_state":
                    SudMGPMGState.MGCommonGamePlayerManagedState mGCommonGamePlayerManagedState = (SudMGPMGState.MGCommonGamePlayerManagedState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerManagedState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerManagedState(iSudFSMStateHandle, mGCommonGamePlayerManagedState);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_sound":
                    SudMGPMGState.MGCommonGameSound mGCommonGameSound = (SudMGPMGState.MGCommonGameSound) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSound.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSound(iSudFSMStateHandle, mGCommonGameSound);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_state":
                    SudMGPMGState.MGCommonGameState mGCommonGameState = (SudMGPMGState.MGCommonGameState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameState.class);
                    this.sudFSMMGCache.onGameMGCommonGameState(mGCommonGameState);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameState(iSudFSMStateHandle, mGCommonGameState);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_hide_game_scene":
                    SudMGPMGState.MGCustomRocketHideGameScene mGCustomRocketHideGameScene = (SudMGPMGState.MGCustomRocketHideGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketHideGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketHideGameScene(iSudFSMStateHandle, mGCustomRocketHideGameScene);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_cr_room_init_data":
                    SudMGPMGState.MGCustomCrRoomInitData mGCustomCrRoomInitData = (SudMGPMGState.MGCustomCrRoomInitData) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomCrRoomInitData.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomCrRoomInitData(iSudFSMStateHandle, mGCustomCrRoomInitData);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_game_settle_again_btn":
                    SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn mGCommonSelfClickGameSettleAgainBtn = (SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGameSettleAgainBtn(iSudFSMStateHandle, mGCommonSelfClickGameSettleAgainBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_sound_list":
                    SudMGPMGState.MGCommonGameSoundList mGCommonGameSoundList = (SudMGPMGState.MGCommonGameSoundList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSoundList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSoundList(iSudFSMStateHandle, mGCommonGameSoundList);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_set_click_rect":
                    SudMGPMGState.MGCommonSetClickRect mGCommonSetClickRect = (SudMGPMGState.MGCommonSetClickRect) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSetClickRect.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSetClickRect(iSudFSMStateHandle, mGCommonSetClickRect);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_text_config":
                    SudMGPMGState.MGBaseballTextConfig mGBaseballTextConfig = (SudMGPMGState.MGBaseballTextConfig) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballTextConfig.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballTextConfig(iSudFSMStateHandle, mGBaseballTextConfig);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_set_score":
                    SudMGPMGState.MGCommonGameSetScore mGCommonGameSetScore = (SudMGPMGState.MGCommonGameSetScore) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSetScore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSetScore(iSudFSMStateHandle, mGCommonGameSetScore);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_color":
                    SudMGPMGState.MGCommonGamePlayerColor mGCommonGamePlayerColor = (SudMGPMGState.MGCommonGamePlayerColor) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerColor.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerColor(iSudFSMStateHandle, mGCommonGamePlayerColor);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_save_sign_color":
                    SudMGPMGState.MGCustomRocketSaveSignColor mGCustomRocketSaveSignColor = (SudMGPMGState.MGCustomRocketSaveSignColor) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketSaveSignColor.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketSaveSignColor(iSudFSMStateHandle, mGCustomRocketSaveSignColor);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_send_distance":
                    SudMGPMGState.MGBaseballSendDistance mGBaseballSendDistance = (SudMGPMGState.MGBaseballSendDistance) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballSendDistance.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballSendDistance(iSudFSMStateHandle, mGBaseballSendDistance);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_piece_arrive_end":
                    SudMGPMGState.MGCommonGamePieceArriveEnd mGCommonGamePieceArriveEnd = (SudMGPMGState.MGCommonGamePieceArriveEnd) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePieceArriveEnd.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePieceArriveEnd(iSudFSMStateHandle, mGCommonGamePieceArriveEnd);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_ranks":
                    SudMGPMGState.MGCommonGamePlayerRanks mGCommonGamePlayerRanks = (SudMGPMGState.MGCommonGamePlayerRanks) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerRanks.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerRanks(iSudFSMStateHandle, mGCommonGamePlayerRanks);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_show_game_scene":
                    SudMGPMGState.MGBaseballShowGameScene mGBaseballShowGameScene = (SudMGPMGState.MGBaseballShowGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballShowGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballShowGameScene(iSudFSMStateHandle, mGBaseballShowGameScene);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_click_lock_component":
                    SudMGPMGState.MGCustomRocketClickLockComponent mGCustomRocketClickLockComponent = (SudMGPMGState.MGCustomRocketClickLockComponent) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketClickLockComponent.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketClickLockComponent(iSudFSMStateHandle, mGCustomRocketClickLockComponent);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_join_btn":
                    SudMGPMGState.MGCommonSelfClickJoinBtn mGCommonSelfClickJoinBtn = (SudMGPMGState.MGCommonSelfClickJoinBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickJoinBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickJoinBtn(iSudFSMStateHandle, mGCommonSelfClickJoinBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_get_score":
                    SudMGPMGState.MGCommonGameGetScore mGCommonGameGetScore = (SudMGPMGState.MGCommonGameGetScore) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameGetScore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameGetScore(iSudFSMStateHandle, mGCommonGameGetScore);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_show_game_scene":
                    SudMGPMGState.MGCommonShowGameScene mGCommonShowGameScene = (SudMGPMGState.MGCommonShowGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonShowGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonShowGameScene(iSudFSMStateHandle, mGCommonShowGameScene);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_buy_component":
                    SudMGPMGState.MGCustomRocketBuyComponent mGCustomRocketBuyComponent = (SudMGPMGState.MGCustomRocketBuyComponent) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketBuyComponent.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketBuyComponent(iSudFSMStateHandle, mGCustomRocketBuyComponent);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_replace_component":
                    SudMGPMGState.MGCustomRocketReplaceComponent mGCustomRocketReplaceComponent = (SudMGPMGState.MGCustomRocketReplaceComponent) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketReplaceComponent.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketReplaceComponent(iSudFSMStateHandle, mGCustomRocketReplaceComponent);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_is_app_chip":
                    SudMGPMGState.MGCommonGameIsAppChip mGCommonGameIsAppChip = (SudMGPMGState.MGCommonGameIsAppChip) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameIsAppChip.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameIsAppChip(iSudFSMStateHandle, mGCommonGameIsAppChip);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_add_ai_players":
                    SudMGPMGState.MGCommonGameAddAIPlayers mGCommonGameAddAIPlayers = (SudMGPMGState.MGCommonGameAddAIPlayers) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameAddAIPlayers.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameAddAIPlayers(iSudFSMStateHandle, mGCommonGameAddAIPlayers);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_game_settle_close_btn":
                    SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn mGCommonSelfClickGameSettleCloseBtn = (SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfClickGameSettleCloseBtn(iSudFSMStateHandle, mGCommonSelfClickGameSettleCloseBtn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_send_burst_word":
                    SudMGPMGState.MGCommonGameSendBurstWord mGCommonGameSendBurstWord = (SudMGPMGState.MGCommonGameSendBurstWord) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSendBurstWord.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSendBurstWord(iSudFSMStateHandle, mGCommonGameSendBurstWord);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_verify_sign":
                    SudMGPMGState.MGCustomRocketVerifySign mGCustomRocketVerifySign = (SudMGPMGState.MGCustomRocketVerifySign) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketVerifySign.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketVerifySign(iSudFSMStateHandle, mGCustomRocketVerifySign);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_user_record_list":
                    SudMGPMGState.MGCustomRocketUserRecordList mGCustomRocketUserRecordList = (SudMGPMGState.MGCustomRocketUserRecordList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketUserRecordList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketUserRecordList(iSudFSMStateHandle, mGCustomRocketUserRecordList);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_order_record_list":
                    SudMGPMGState.MGCustomRocketOrderRecordList mGCustomRocketOrderRecordList = (SudMGPMGState.MGCustomRocketOrderRecordList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketOrderRecordList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketOrderRecordList(iSudFSMStateHandle, mGCustomRocketOrderRecordList);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_dynamic_fire_price":
                    SudMGPMGState.MGCustomRocketDynamicFirePrice mGCustomRocketDynamicFirePrice = (SudMGPMGState.MGCustomRocketDynamicFirePrice) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketDynamicFirePrice.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketDynamicFirePrice(iSudFSMStateHandle, mGCustomRocketDynamicFirePrice);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_defualt_state":
                    SudMGPMGState.MGBaseballDefaultState mGBaseballDefaultState = (SudMGPMGState.MGBaseballDefaultState) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballDefaultState.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballDefaultState(iSudFSMStateHandle, mGBaseballDefaultState);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_disco_action_end":
                    SudMGPMGState.MGCommonGameDiscoActionEnd mGCommonGameDiscoActionEnd = (SudMGPMGState.MGCommonGameDiscoActionEnd) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameDiscoActionEnd.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameDiscoActionEnd(iSudFSMStateHandle, mGCommonGameDiscoActionEnd);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_over_tip":
                    SudMGPMGState.MGCommonGameOverTip mGCommonGameOverTip = (SudMGPMGState.MGCommonGameOverTip) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameOverTip.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameOverTip(iSudFSMStateHandle, mGCommonGameOverTip);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_money_not_enough":
                    SudMGPMGState.MGCommonGameMoneyNotEnough mGCommonGameMoneyNotEnough = (SudMGPMGState.MGCommonGameMoneyNotEnough) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameMoneyNotEnough.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameMoneyNotEnough(iSudFSMStateHandle, mGCommonGameMoneyNotEnough);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_microphone":
                    SudMGPMGState.MGCommonSelfMicrophone mGCommonSelfMicrophone = (SudMGPMGState.MGCommonSelfMicrophone) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonSelfMicrophone.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonSelfMicrophone(iSudFSMStateHandle, mGCommonSelfMicrophone);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_pair_singular":
                    SudMGPMGState.MGCommonGamePlayerPairSingular mGCommonGamePlayerPairSingular = (SudMGPMGState.MGCommonGamePlayerPairSingular) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerPairSingular.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerPairSingular(iSudFSMStateHandle, mGCommonGamePlayerPairSingular);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_monopoly_cards":
                    SudMGPMGState.MGCommonGamePlayerMonopolyCards mGCommonGamePlayerMonopolyCards = (SudMGPMGState.MGCommonGamePlayerMonopolyCards) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerMonopolyCards.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerMonopolyCards(iSudFSMStateHandle, mGCommonGamePlayerMonopolyCards);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_set_default_model":
                    SudMGPMGState.MGCustomRocketSetDefaultModel mGCustomRocketSetDefaultModel = (SudMGPMGState.MGCustomRocketSetDefaultModel) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketSetDefaultModel.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketSetDefaultModel(iSudFSMStateHandle, mGCustomRocketSetDefaultModel);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_fly_click":
                    SudMGPMGState.MGCustomRocketFlyClick mGCustomRocketFlyClick = (SudMGPMGState.MGCustomRocketFlyClick) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketFlyClick.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketFlyClick(iSudFSMStateHandle, mGCustomRocketFlyClick);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_hide_game_scene":
                    SudMGPMGState.MGBaseballHideGameScene mGBaseballHideGameScene = (SudMGPMGState.MGBaseballHideGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballHideGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballHideGameScene(iSudFSMStateHandle, mGBaseballHideGameScene);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_room_record_list":
                    SudMGPMGState.MGCustomRocketRoomRecordList mGCustomRocketRoomRecordList = (SudMGPMGState.MGCustomRocketRoomRecordList) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketRoomRecordList.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketRoomRecordList(iSudFSMStateHandle, mGCustomRocketRoomRecordList);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_ranking":
                    SudMGPMGState.MGBaseballRanking mGBaseballRanking = (SudMGPMGState.MGBaseballRanking) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballRanking.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballRanking(iSudFSMStateHandle, mGBaseballRanking);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_users_info":
                    SudMGPMGState.MGCommonUsersInfo mGCommonUsersInfo = (SudMGPMGState.MGCommonUsersInfo) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonUsersInfo.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonUsersInfo(iSudFSMStateHandle, mGCommonUsersInfo);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_fire_model":
                    SudMGPMGState.MGCustomRocketFireModel mGCustomRocketFireModel = (SudMGPMGState.MGCustomRocketFireModel) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketFireModel.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketFireModel(iSudFSMStateHandle, mGCustomRocketFireModel);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_hide_game_scene":
                    SudMGPMGState.MGCommonHideGameScene mGCommonHideGameScene = (SudMGPMGState.MGCommonHideGameScene) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonHideGameScene.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonHideGameScene(iSudFSMStateHandle, mGCommonHideGameScene);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_rocket_create_model":
                    SudMGPMGState.MGCustomRocketCreateModel mGCustomRocketCreateModel = (SudMGPMGState.MGCustomRocketCreateModel) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomRocketCreateModel.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomRocketCreateModel(iSudFSMStateHandle, mGCustomRocketCreateModel);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_prepare_finish":
                    SudMGPMGState.MGCommonGamePrepareFinish mGCommonGamePrepareFinish = (SudMGPMGState.MGCommonGamePrepareFinish) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePrepareFinish.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePrepareFinish(iSudFSMStateHandle, mGCommonGamePrepareFinish);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_settings":
                    SudMGPMGState.MGCommonGameSettings mGCommonGameSettings = (SudMGPMGState.MGCommonGameSettings) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSettings.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSettings(iSudFSMStateHandle, mGCommonGameSettings);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_baseball_range_info":
                    SudMGPMGState.MGBaseballRangeInfo mGBaseballRangeInfo = (SudMGPMGState.MGBaseballRangeInfo) SudJsonUtils.fromJson(str2, SudMGPMGState.MGBaseballRangeInfo.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGBaseballRangeInfo(iSudFSMStateHandle, mGBaseballRangeInfo);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_custom_cr_click_seat":
                    SudMGPMGState.MGCustomCrClickSeat mGCustomCrClickSeat = (SudMGPMGState.MGCustomCrClickSeat) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCustomCrClickSeat.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCustomCrClickSeat(iSudFSMStateHandle, mGCustomCrClickSeat);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_ui_custom_config":
                    SudMGPMGState.MGCommonGameUiCustomConfig mGCommonGameUiCustomConfig = (SudMGPMGState.MGCommonGameUiCustomConfig) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameUiCustomConfig.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameUiCustomConfig(iSudFSMStateHandle, mGCommonGameUiCustomConfig);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_settle":
                    SudMGPMGState.MGCommonGameSettle mGCommonGameSettle = (SudMGPMGState.MGCommonGameSettle) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameSettle.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameSettle(iSudFSMStateHandle, mGCommonGameSettle);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_create_order":
                    SudMGPMGState.MGCommonGameCreateOrder mGCommonGameCreateOrder = (SudMGPMGState.MGCommonGameCreateOrder) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGameCreateOrder.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGameCreateOrder(iSudFSMStateHandle, mGCommonGameCreateOrder);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_scores":
                    SudMGPMGState.MGCommonGamePlayerScores mGCommonGamePlayerScores = (SudMGPMGState.MGCommonGamePlayerScores) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerScores.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerScores(iSudFSMStateHandle, mGCommonGamePlayerScores);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_game_player_icon_position":
                    SudMGPMGState.MGCommonGamePlayerIconPosition mGCommonGamePlayerIconPosition = (SudMGPMGState.MGCommonGamePlayerIconPosition) SudJsonUtils.fromJson(str2, SudMGPMGState.MGCommonGamePlayerIconPosition.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onGameMGCommonGamePlayerIconPosition(iSudFSMStateHandle, mGCommonGamePlayerIconPosition);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                default:
                    ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                    break;
            }
        }
    }

    public void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGetGameCfg(iSudFSMStateHandle, str);
        }
    }

    public void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener != null) {
            sudFSMMGListener.onGetGameViewInfo(iSudFSMStateHandle, str);
        }
    }

    public void onPlayerStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2, String str3) {
        SudFSMMGListener sudFSMMGListener = this.sudFSMMGListener;
        if (sudFSMMGListener == null || !sudFSMMGListener.onPlayerStateChange(iSudFSMStateHandle, str, str2, str3)) {
            str2.getClass();
            switch (str2) {
                case "mg_common_game_countdown_time":
                    SudMGPMGState.MGCommonGameCountdownTime mGCommonGameCountdownTime = (SudMGPMGState.MGCommonGameCountdownTime) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonGameCountdownTime.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonGameCountdownTime(iSudFSMStateHandle, str, mGCommonGameCountdownTime);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_die_status":
                    SudMGPMGState.MGCommonSelfDieStatus mGCommonSelfDieStatus = (SudMGPMGState.MGCommonSelfDieStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfDieStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfDieStatus(iSudFSMStateHandle, str, mGCommonSelfDieStatus);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_change_seat":
                    SudMGPMGState.MGCommonPlayerChangeSeat mGCommonPlayerChangeSeat = (SudMGPMGState.MGCommonPlayerChangeSeat) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerChangeSeat.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerChangeSeat(iSudFSMStateHandle, str, mGCommonPlayerChangeSeat);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_dg_painting":
                    SudMGPMGState.MGDGPainting mGDGPainting = (SudMGPMGState.MGDGPainting) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGPainting.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGPainting(iSudFSMStateHandle, str, mGDGPainting);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_captain":
                    SudMGPMGState.MGCommonPlayerCaptain mGCommonPlayerCaptain = (SudMGPMGState.MGCommonPlayerCaptain) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerCaptain.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerCaptain(str, mGCommonPlayerCaptain);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerCaptain(iSudFSMStateHandle, str, mGCommonPlayerCaptain);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_dg_selecting":
                    SudMGPMGState.MGDGSelecting mGDGSelecting = (SudMGPMGState.MGDGSelecting) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGSelecting.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGSelecting(iSudFSMStateHandle, str, mGDGSelecting);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_select_status":
                    SudMGPMGState.MGCommonSelfSelectStatus mGCommonSelfSelectStatus = (SudMGPMGState.MGCommonSelfSelectStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfSelectStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfSelectStatus(iSudFSMStateHandle, str, mGCommonSelfSelectStatus);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_ready":
                    SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady = (SudMGPMGState.MGCommonPlayerReady) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerReady.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerReady(str, mGCommonPlayerReady);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerReady(iSudFSMStateHandle, str, mGCommonPlayerReady);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_click_game_player_icon":
                    SudMGPMGState.MGCommonSelfClickGamePlayerIcon mGCommonSelfClickGamePlayerIcon = (SudMGPMGState.MGCommonSelfClickGamePlayerIcon) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfClickGamePlayerIcon.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfClickGamePlayerIcon(iSudFSMStateHandle, str, mGCommonSelfClickGamePlayerIcon);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_in":
                    SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn = (SudMGPMGState.MGCommonPlayerIn) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerIn.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerIn(str, mGCommonPlayerIn);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerIn(iSudFSMStateHandle, str, mGCommonPlayerIn);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_online":
                    SudMGPMGState.MGCommonPlayerOnline mGCommonPlayerOnline = (SudMGPMGState.MGCommonPlayerOnline) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerOnline.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerOnline(iSudFSMStateHandle, str, mGCommonPlayerOnline);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_ob_status":
                    SudMGPMGState.MGCommonSelfObStatus mGCommonSelfObStatus = (SudMGPMGState.MGCommonSelfObStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfObStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfObStatus(iSudFSMStateHandle, str, mGCommonSelfObStatus);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_dg_score":
                    SudMGPMGState.MGDGScore mGDGScore = (SudMGPMGState.MGDGScore) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGScore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGScore(iSudFSMStateHandle, str, mGDGScore);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_self_turn_status":
                    SudMGPMGState.MGCommonSelfTurnStatus mGCommonSelfTurnStatus = (SudMGPMGState.MGCommonSelfTurnStatus) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonSelfTurnStatus.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonSelfTurnStatus(iSudFSMStateHandle, str, mGCommonSelfTurnStatus);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_dg_erroranswer":
                    SudMGPMGState.MGDGErroranswer mGDGErroranswer = (SudMGPMGState.MGDGErroranswer) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGErroranswer.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGErroranswer(iSudFSMStateHandle, str, mGDGErroranswer);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_dg_totalscore":
                    SudMGPMGState.MGDGTotalscore mGDGTotalscore = (SudMGPMGState.MGDGTotalscore) SudJsonUtils.fromJson(str3, SudMGPMGState.MGDGTotalscore.class);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGDGTotalscore(iSudFSMStateHandle, str, mGDGTotalscore);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
                    }
                    break;
                case "mg_common_player_playing":
                    SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying = (SudMGPMGState.MGCommonPlayerPlaying) SudJsonUtils.fromJson(str3, SudMGPMGState.MGCommonPlayerPlaying.class);
                    this.sudFSMMGCache.onPlayerMGCommonPlayerPlaying(str, mGCommonPlayerPlaying);
                    if (sudFSMMGListener != null) {
                        sudFSMMGListener.onPlayerMGCommonPlayerPlaying(iSudFSMStateHandle, str, mGCommonPlayerPlaying);
                        break;
                    } else {
                        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
                        break;
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

package com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator;

import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils.ISudFSMStateHandleUtils;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: loaded from: classes4.dex */
public interface SudFSMMGListener {
    void onExpireCode(ISudFSMStateHandle iSudFSMStateHandle, String str);

    void onGameDestroyed();

    default void onGameLoadingProgress(int i, int i2, int i3) {
    }

    default void onGameLog(String str) {
    }

    default void onGameMGBaseballDefaultState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballDefaultState mGBaseballDefaultState) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballHideGameScene(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballHideGameScene mGBaseballHideGameScene) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballMyRanking(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballMyRanking mGBaseballMyRanking) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballPrepareFinish(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballPrepareFinish mGBaseballPrepareFinish) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballRangeInfo(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballRangeInfo mGBaseballRangeInfo) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballRanking(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballRanking mGBaseballRanking) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballSendDistance(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballSendDistance mGBaseballSendDistance) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballSetClickRect(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballSetClickRect mGBaseballSetClickRect) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballShowGameScene(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballShowGameScene mGBaseballShowGameScene) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGBaseballTextConfig(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGBaseballTextConfig mGBaseballTextConfig) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonAPPCommonSelfXResp(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonAPPCommonSelfXResp mGCommonAPPCommonSelfXResp) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonAlert(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonAlert mGCommonAlert) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonDestroyGameScene(ISudFSMStateHandle iSudFSMStateHandle) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameASR(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameASR mGCommonGameASR) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameAddAIPlayers(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameAddAIPlayers mGCommonGameAddAIPlayers) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameBgMusicState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameBgMusicState mGCommonGameBgMusicState) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameCreateOrder(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameCreateOrder mGCommonGameCreateOrder) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameDiscoAction(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameDiscoAction mGCommonGameDiscoAction) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameDiscoActionEnd(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameDiscoActionEnd mGCommonGameDiscoActionEnd) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameFps(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameFps mGCommonGameFps) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameGetScore(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameGetScore mGCommonGameGetScore) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameIsAppChip(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameIsAppChip mGCommonGameIsAppChip) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameMoneyNotEnough(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameMoneyNotEnough mGCommonGameMoneyNotEnough) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameNetworkState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameNetworkState mGCommonGameNetworkState) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameOverTip(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameOverTip mGCommonGameOverTip) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePieceArriveEnd(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePieceArriveEnd mGCommonGamePieceArriveEnd) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerColor(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerColor mGCommonGamePlayerColor) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerIconPosition(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerIconPosition mGCommonGamePlayerIconPosition) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerManagedState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerManagedState mGCommonGamePlayerManagedState) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerMonopolyCards(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerMonopolyCards mGCommonGamePlayerMonopolyCards) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerPairSingular(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerPairSingular mGCommonGamePlayerPairSingular) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerRanks(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerRanks mGCommonGamePlayerRanks) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePlayerScores(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePlayerScores mGCommonGamePlayerScores) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGamePrepareFinish(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGamePrepareFinish mGCommonGamePrepareFinish) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameRule(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameRule mGCommonGameRule) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSendBurstWord(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSendBurstWord mGCommonGameSendBurstWord) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSetScore(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSetScore mGCommonGameSetScore) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSettings(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSettings mGCommonGameSettings) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSettle(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSettle mGCommonGameSettle) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSound(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSoundList(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSoundList mGCommonGameSoundList) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameSoundState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameState mGCommonGameState) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonGameUiCustomConfig(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameUiCustomConfig mGCommonGameUiCustomConfig) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonHideGameScene(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonHideGameScene mGCommonHideGameScene) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonKeyWordToHit(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonKeyWordToHit mGCommonKeyWordToHit) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonPlayerRoleId(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonPlayerRoleId mGCommonPlayerRoleId) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonPublicMessage(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonPublicMessage mGCommonPublicMessage) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickCancelJoinBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickCancelJoinBtn mGCommonSelfClickCancelJoinBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickCancelReadyBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickCancelReadyBtn mGCommonSelfClickCancelReadyBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickExitGameBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickExitGameBtn mGCommonSelfClickExitGameBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickGameSettleAgainBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickGameSettleAgainBtn mGCommonSelfClickGameSettleAgainBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickGameSettleCloseBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickGameSettleCloseBtn mGCommonSelfClickGameSettleCloseBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickGoldBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickGoldBtn mGCommonSelfClickGoldBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickGood(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickGood mGCommonSelfClickGood) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickJoinBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickJoinBtn mGCommonSelfClickJoinBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickPoop(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickPoop mGCommonSelfClickPoop) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickReadyBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickReadyBtn mGCommonSelfClickReadyBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickShareBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickShareBtn mGCommonSelfClickShareBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfClickStartBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickStartBtn mGCommonSelfClickStartBtn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfHeadphone(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfHeadphone mGCommonSelfHeadphone) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSelfMicrophone(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfMicrophone mGCommonSelfMicrophone) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonSetClickRect(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSetClickRect mGCommonSetClickRect) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonShowGameScene(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonShowGameScene mGCommonShowGameScene) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonUsersInfo(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonUsersInfo mGCommonUsersInfo) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCommonWorstTeammate(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonWorstTeammate mGCommonWorstTeammate) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomCrClickSeat(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomCrClickSeat mGCustomCrClickSeat) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomCrRoomInitData(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomCrRoomInitData mGCustomCrRoomInitData) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketBuyComponent(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketBuyComponent mGCustomRocketBuyComponent) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketClickLockComponent(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketClickLockComponent mGCustomRocketClickLockComponent) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketComponentList(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketComponentList mGCustomRocketComponentList) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketConfig(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketConfig mGCustomRocketConfig) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketCreateModel(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketCreateModel mGCustomRocketCreateModel) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketDynamicFirePrice(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketDynamicFirePrice mGCustomRocketDynamicFirePrice) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketFireModel(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketFireModel mGCustomRocketFireModel) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketFlyClick(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketFlyClick mGCustomRocketFlyClick) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketFlyEnd(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketFlyEnd mGCustomRocketFlyEnd) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketHideGameScene(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketHideGameScene mGCustomRocketHideGameScene) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketModelList(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketModelList mGCustomRocketModelList) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketOrderRecordList(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketOrderRecordList mGCustomRocketOrderRecordList) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketPlayEffectFinish(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketPlayEffectFinish mGCustomRocketPlayEffectFinish) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketPlayEffectStart(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketPlayEffectStart mGCustomRocketPlayEffectStart) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketPrepareFinish(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketPrepareFinish mGCustomRocketPrepareFinish) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketReplaceComponent(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketReplaceComponent mGCustomRocketReplaceComponent) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketRoomRecordList(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketRoomRecordList mGCustomRocketRoomRecordList) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketSaveSignColor(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketSaveSignColor mGCustomRocketSaveSignColor) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketSetClickRect(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketSetClickRect mGCustomRocketSetClickRect) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketSetDefaultModel(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketSetDefaultModel mGCustomRocketSetDefaultModel) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketShowGameScene(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketShowGameScene mGCustomRocketShowGameScene) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketUploadModelIcon(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketUploadModelIcon mGCustomRocketUploadModelIcon) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketUserInfo(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketUserInfo mGCustomRocketUserInfo) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketUserRecordList(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketUserRecordList mGCustomRocketUserRecordList) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onGameMGCustomRocketVerifySign(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCustomRocketVerifySign mGCustomRocketVerifySign) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    void onGameStarted();

    default boolean onGameStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2) {
        return false;
    }

    void onGetGameCfg(ISudFSMStateHandle iSudFSMStateHandle, String str);

    void onGetGameViewInfo(ISudFSMStateHandle iSudFSMStateHandle, String str);

    default void onPlayerMGCommonGameCountdownTime(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonGameCountdownTime mGCommonGameCountdownTime) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonPlayerCaptain(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerCaptain mGCommonPlayerCaptain) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonPlayerChangeSeat(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerChangeSeat mGCommonPlayerChangeSeat) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonPlayerIn(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonPlayerOnline(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerOnline mGCommonPlayerOnline) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonPlayerPlaying(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonPlayerReady(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonSelfClickGamePlayerIcon(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonSelfClickGamePlayerIcon mGCommonSelfClickGamePlayerIcon) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonSelfDieStatus(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonSelfDieStatus mGCommonSelfDieStatus) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonSelfObStatus(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonSelfObStatus mGCommonSelfObStatus) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonSelfSelectStatus(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonSelfSelectStatus mGCommonSelfSelectStatus) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGCommonSelfTurnStatus(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonSelfTurnStatus mGCommonSelfTurnStatus) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGDGErroranswer(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGDGErroranswer mGDGErroranswer) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGDGPainting(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGDGPainting mGDGPainting) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGDGScore(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGDGScore mGDGScore) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGDGSelecting(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGDGSelecting mGDGSelecting) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default void onPlayerMGDGTotalscore(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGDGTotalscore mGDGTotalscore) {
        ISudFSMStateHandleUtils.handleSuccess(iSudFSMStateHandle);
    }

    default boolean onPlayerStateChange(ISudFSMStateHandle iSudFSMStateHandle, String str, String str2, String str3) {
        return false;
    }
}

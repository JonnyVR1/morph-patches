package com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator;

import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class SudFSMMGCache {
    private String captainUserId;
    private SudMGPMGState.MGCommonGameState mgCommonGameStateModel;
    private boolean isHitBomb = false;
    private final HashSet<String> playerInSet = new HashSet<>();
    private final HashSet<String> playerReadySet = new HashSet<>();
    private final HashMap<String, SudMGPMGState.MGCommonPlayerPlaying> playerPlayingMap = new HashMap<>();

    public void destroyMG() {
        this.captainUserId = null;
        this.mgCommonGameStateModel = null;
        this.isHitBomb = false;
        this.playerInSet.clear();
        this.playerReadySet.clear();
        this.playerPlayingMap.clear();
    }

    public String getCaptainUserId() {
        return this.captainUserId;
    }

    public int getGameState() {
        SudMGPMGState.MGCommonGameState mGCommonGameState = this.mgCommonGameStateModel;
        if (mGCommonGameState != null) {
            return mGCommonGameState.gameState;
        }
        return -1;
    }

    public int getPlayerInNumber() {
        return this.playerInSet.size();
    }

    public HashSet<String> getPlayerInSet() {
        return new HashSet<>(this.playerInSet);
    }

    public HashMap<String, SudMGPMGState.MGCommonPlayerPlaying> getPlayerPlayingMap() {
        return new HashMap<>(this.playerPlayingMap);
    }

    public HashSet<String> getPlayerReadySet() {
        return new HashSet<>(this.playerReadySet);
    }

    public boolean isHitBomb() {
        return this.isHitBomb;
    }

    public void onGameMGCommonGameState(SudMGPMGState.MGCommonGameState mGCommonGameState) {
        this.mgCommonGameStateModel = mGCommonGameState;
    }

    public void onGameMGCommonKeyWordToHit(SudMGPMGState.MGCommonKeyWordToHit mGCommonKeyWordToHit) {
        if (mGCommonKeyWordToHit != null) {
            this.isHitBomb = mGCommonKeyWordToHit.wordType.equals("number");
        }
    }

    public void onPlayerMGCommonPlayerCaptain(String str, SudMGPMGState.MGCommonPlayerCaptain mGCommonPlayerCaptain) {
        if (mGCommonPlayerCaptain != null) {
            if (mGCommonPlayerCaptain.isCaptain) {
                this.captainUserId = str;
            } else if (Objects.equals(this.captainUserId, str)) {
                this.captainUserId = null;
            }
        }
    }

    public void onPlayerMGCommonPlayerIn(String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        if (mGCommonPlayerIn != null) {
            boolean z = mGCommonPlayerIn.isIn;
            HashSet<String> hashSet = this.playerInSet;
            if (z) {
                hashSet.add(str);
            } else {
                hashSet.remove(str);
                this.playerReadySet.remove(str);
            }
        }
    }

    public void onPlayerMGCommonPlayerPlaying(String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        if (mGCommonPlayerPlaying != null) {
            this.playerPlayingMap.put(str, mGCommonPlayerPlaying);
        }
    }

    public void onPlayerMGCommonPlayerReady(String str, SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady) {
        if (mGCommonPlayerReady != null) {
            boolean z = mGCommonPlayerReady.isReady;
            HashSet<String> hashSet = this.playerReadySet;
            if (z) {
                hashSet.add(str);
            } else {
                hashSet.remove(str);
            }
        }
    }

    public boolean playerIsIn(String str) {
        return this.playerInSet.contains(str);
    }

    public boolean playerIsPlaying(String str) {
        SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying = this.playerPlayingMap.get(str);
        if (mGCommonPlayerPlaying != null) {
            return mGCommonPlayerPlaying.isPlaying;
        }
        return false;
    }

    public boolean playerIsReady(String str) {
        return this.playerReadySet.contains(str);
    }
}

package com.momo.mcamera.mask;

import android.content.Context;
import com.momo.mcamera.mask.delegate.GameScoreListener;

/* JADX INFO: loaded from: classes8.dex */
public class StickerGameItem extends StickerItem {
    public float downVelocity;
    public GameScoreListener gameScoreListener;
    public boolean isGameLive;

    public StickerGameItem(Sticker sticker, Context context) {
        super(sticker, context);
        this.downVelocity = 0.25f;
        this.isDraw = true;
        if (this.sticker.getObjectTriggerType().equals("game_live")) {
            this.isGameLive = true;
        } else {
            this.isGameLive = false;
        }
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
    }

    public void setGameScoreListener(GameScoreListener gameScoreListener) {
        this.gameScoreListener = gameScoreListener;
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void startPlay() {
        if (this.stickerStateChangeListener == null || this.sticker.getSoundId() <= 0) {
            return;
        }
        this.stickerStateChangeListener.playStateChanged(this.sticker.getSoundId(), true);
    }
}

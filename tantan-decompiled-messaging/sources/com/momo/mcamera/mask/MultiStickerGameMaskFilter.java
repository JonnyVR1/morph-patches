package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import com.momo.mcamera.mask.bean.AbsolutePosition;
import com.momo.mcamera.mask.bean.ObjectRegion;
import com.momo.mcamera.mask.delegate.GameScoreListener;
import p149l.mcj;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class MultiStickerGameMaskFilter extends MultiStickerMaskFilter {
    private static int INDEX_MOUSE_DOWNBOTTOM = 57;
    private static int INDEX_MOUSE_LEFT = 48;
    private static int INDEX_MOUSE_RIGHT = 54;
    private static int INDEX_MOUSE_UPTOP = 51;
    public static final int POINTS_LENGTH = 68;
    private long curTimeStamp;
    private boolean isGameOver;
    private boolean isMouthOpen;
    private boolean lastOpenState;
    StickerGameEngine mStickerGameEngine;
    private int triggerRegionOffset;

    public MultiStickerGameMaskFilter(Context context) {
        super(context);
        this.triggerRegionOffset = 0;
        this.curTimeStamp = 0L;
        this.isGameOver = false;
        this.mStickerGameEngine = new StickerGameEngine();
    }

    private void updateFaceStatus(pjw pjwVar) {
        FilterTriggerManager filterTriggerManager = this.filterTriggerManager;
        if (filterTriggerManager != null) {
            boolean z = filterTriggerManager.mouseOpenState == 0;
            this.isMouthOpen = z;
            if (!z && this.lastOpenState && pjwVar.m169950n() > 0) {
                float[] fArrM220018l = pjwVar.m169946j(0).m220018l();
                float f = fArrM220018l[INDEX_MOUSE_UPTOP + 68];
                int i = this.triggerRegionOffset;
                float f2 = f - i;
                float f3 = fArrM220018l[INDEX_MOUSE_LEFT] - i;
                float f4 = fArrM220018l[INDEX_MOUSE_RIGHT] + i;
                float f5 = fArrM220018l[INDEX_MOUSE_DOWNBOTTOM + 68] + i;
                float fAbs = Math.abs(f3 - f4);
                float fAbs2 = Math.abs(f2 - f5);
                if (fAbs2 < fAbs) {
                    float f6 = (fAbs - fAbs2) / 2.0f;
                    f2 -= f6;
                    f5 += f6;
                } else {
                    float f7 = (fAbs2 - fAbs) / 2.0f;
                    f3 -= f7;
                    f4 += f7;
                }
                StickerGameEngine stickerGameEngine = this.mStickerGameEngine;
                if (stickerGameEngine != null && !this.isGameOver) {
                    stickerGameEngine.updateTriggerStatus(f3, f2, f4, f5);
                }
            }
            this.lastOpenState = this.isMouthOpen;
        }
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter
    public void addSticker(StickerItem stickerItem) {
        super.addSticker(stickerItem);
        if (stickerItem == null || !(stickerItem instanceof StickerGameItem)) {
            return;
        }
        this.mStickerGameEngine.addSticker((StickerGameItem) stickerItem);
    }

    public void initGameFixStickerItem(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        int width = bitmap.getWidth() - bitmap2.getWidth();
        Sticker sticker = new Sticker();
        sticker.setDuration(StickerAdjustFilter.DEFAULT_LONG_DURATION);
        sticker.setFrameRate(20);
        sticker.setType(5);
        sticker.setStickerType("STICKER_TYPE_GAME_FIX_TYPE");
        sticker.setLayerType("default");
        sticker.setAlwaysShow(true);
        sticker.setObjectTriggerType("");
        sticker.setImageWidth(bitmap2.getWidth());
        sticker.setImageHeight(bitmap2.getHeight());
        AbsolutePosition absolutePosition = new AbsolutePosition();
        ObjectRegion objectRegion = new ObjectRegion();
        bitmap2.getWidth();
        float f = i;
        float f2 = f * 1.0f;
        bitmap2.getHeight();
        float f3 = i2;
        float f4 = f3 * 1.0f;
        float width2 = (width > 0 ? (bitmap2.getWidth() / 2) + width : bitmap2.getWidth() / 2) / f2;
        float height = (bitmap2.getHeight() / 2) / f4;
        objectRegion.f14252x = (1.0f - width2) - 0.05f;
        objectRegion.f14253y = height + 0.05f;
        objectRegion.f14251w = f;
        objectRegion.f14250h = f3;
        absolutePosition.setCenter(objectRegion);
        sticker.setAbsolutePos(absolutePosition);
        StickerFixItem stickerFixItem = new StickerFixItem(sticker, null);
        stickerFixItem.setBitmap(bitmap2);
        stickerFixItem.sticker.setImageWidth(bitmap2.getWidth());
        stickerFixItem.sticker.setImageHeight(bitmap2.getHeight());
        stickerFixItem.fixStickerType = StickerFixItem.FIX_STICKER_TYPE_ICON;
        super.addSticker(stickerFixItem);
        Sticker sticker2 = new Sticker();
        sticker2.setDuration(StickerAdjustFilter.DEFAULT_LONG_DURATION);
        sticker2.setFrameRate(20);
        sticker2.setType(5);
        sticker2.setStickerType("STICKER_TYPE_GAME_FIX_TYPE");
        sticker2.setLayerType("default");
        sticker2.setAlwaysShow(true);
        sticker2.setObjectTriggerType("");
        sticker2.setImageWidth(bitmap.getWidth());
        sticker2.setImageHeight(bitmap.getHeight());
        AbsolutePosition absolutePosition2 = new AbsolutePosition();
        ObjectRegion objectRegion2 = new ObjectRegion();
        float width3 = (width > 0 ? bitmap.getWidth() / 2 : (bitmap.getWidth() / 2) + width) / f2;
        float height2 = ((bitmap.getHeight() / 2) + bitmap2.getHeight()) / f4;
        objectRegion2.f14252x = (1.0f - width3) - 0.05f;
        objectRegion2.f14253y = height2 + 0.05f + 0.01f;
        objectRegion2.f14251w = f;
        objectRegion2.f14250h = f3;
        absolutePosition2.setCenter(objectRegion2);
        sticker2.setAbsolutePos(absolutePosition2);
        StickerFixItem stickerFixItem2 = new StickerFixItem(sticker2, null);
        stickerFixItem2.setBitmap(bitmap);
        stickerFixItem2.sticker.setImageWidth(bitmap.getWidth());
        stickerFixItem2.sticker.setImageHeight(bitmap.getHeight());
        stickerFixItem2.fixStickerType = StickerFixItem.FIX_STICKER_TYPE_SCORE;
        super.addSticker(stickerFixItem2);
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        StickerGameEngine stickerGameEngine = this.mStickerGameEngine;
        if (stickerGameEngine != null) {
            stickerGameEngine.setImageHeight(getHeight());
            this.mStickerGameEngine.setImageWidth(getWidth());
            this.mStickerGameEngine.setSrcImageWidthScaleRatio(this.scaleWidthRatio);
            this.mStickerGameEngine.setSrcImageHeightScaleRatio(this.scaleHeightRatio);
        }
        StickerGameEngine stickerGameEngine2 = this.mStickerGameEngine;
        if (stickerGameEngine2 != null) {
            stickerGameEngine2.setTimeStamp(this.curTimeStamp);
        }
        super.newTextureReady(i, mcjVar, z);
    }

    public void playingTailMoving() {
        this.isGameOver = true;
        for (StickerItem stickerItem : this.stickerItemList) {
            stickerItem.isDraw = false;
            stickerItem.isTriggered = true;
            if (stickerItem.sticker.getObjectTriggerType() != null && stickerItem.sticker.getObjectTriggerType().equals("game_over")) {
                stickerItem.startPlay();
            }
        }
    }

    public void setGameScoreListener(GameScoreListener gameScoreListener) {
        this.mStickerGameEngine.setGameScoreListener(gameScoreListener);
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        super.setMMCVInfo(pjwVar);
        updateFaceStatus(pjwVar);
    }

    @Override // com.momo.mcamera.mask.MultiStickerMaskFilter, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        this.curTimeStamp = j;
    }

    public void updateGameFixStickerScore(Bitmap bitmap) {
        for (StickerItem stickerItem : this.stickerItemList) {
            if (stickerItem instanceof StickerFixItem) {
                StickerFixItem stickerFixItem = (StickerFixItem) stickerItem;
                if (stickerFixItem.fixStickerType == StickerFixItem.FIX_STICKER_TYPE_SCORE) {
                    stickerFixItem.setBitmap(bitmap);
                }
            }
        }
    }
}

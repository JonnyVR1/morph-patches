package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.mask.MmcvImageLoader;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.StickerItem;
import com.momo.mcamera.util.MDLogTag;
import p149l.vjw;

/* JADX INFO: loaded from: classes6.dex */
public class StickerItemGeomeAttrInfo extends MMFrameGeomeAttrInfo {
    Context context;
    int count;
    Sticker sticker;
    StickerItem stickerItem;
    MmcvImageLoader stickerLoader;

    public StickerItemGeomeAttrInfo(Sticker sticker, Context context) {
        super(null);
        this.count = 0;
        this.sticker = sticker;
        MmcvImageLoader mmcvImageLoader = new MmcvImageLoader(sticker);
        this.stickerLoader = mmcvImageLoader;
        mmcvImageLoader.setFrameDuration(40L);
        this.context = context;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public int[] getFrameTexture() {
        vjw mmcvImageByIndex = this.stickerLoader.getMmcvImageByIndex(this.count);
        this.frameInfo = mmcvImageByIndex;
        this.count++;
        if (mmcvImageByIndex.m198692e() <= 0) {
            MDLog.m7391e(MDLogTag.FILTER_TAG, "cur count = " + this.count + " total number =" + this.sticker.getFrameNumber());
        }
        if (this.count >= this.sticker.getFrameNumber()) {
            int loopStart = this.sticker.getLoopStart();
            this.count = loopStart;
            if (loopStart < 0) {
                this.count = this.sticker.getFrameNumber();
            }
        }
        updateBitmapInfo(this.frameInfo.m198692e(), this.frameInfo.m198690c());
        this.needReload = true;
        return super.getFrameTexture();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p149l.igm
    public void recycleResourceInGlThread() {
        super.recycleResourceInGlThread();
        StickerItem stickerItem = this.stickerItem;
        if (stickerItem != null) {
            stickerItem.releaseFrameBuffer();
            this.stickerLoader.cancel();
        }
        this.context = null;
        this.stickerItem = null;
        this.stickerLoader = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo
    public void resetStatus() {
        super.resetStatus();
        this.count = 0;
    }
}

package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class StickerFixItem extends StickerItem {
    public static final String FIX_STICKER_TYPE_ICON = "FIX_STICKER_TYPE_ICON";
    public static final String FIX_STICKER_TYPE_SCORE = "FIX_STICKER_TYPE_SCORE";
    private Bitmap curBitmap;
    public String fixStickerType;

    public StickerFixItem(Sticker sticker, Context context) {
        super(sticker, context);
        this.isDraw = true;
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public synchronized Bitmap getBitmap() {
        return this.curBitmap;
    }

    public synchronized void setBitmap(Bitmap bitmap) {
        this.curBitmap = bitmap;
    }
}

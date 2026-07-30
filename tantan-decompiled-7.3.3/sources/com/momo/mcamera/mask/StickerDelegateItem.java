package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class StickerDelegateItem extends StickerItem {
    private int stickerHeight;
    private int stickerWidth;

    public StickerDelegateItem(Sticker sticker, Context context) {
        super(sticker, context);
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public Bitmap getBitmap() {
        if (this.sticker.getImageProvider() == null) {
            return null;
        }
        Bitmap realBitmap = this.sticker.getImageProvider().getRealBitmap();
        if (realBitmap.getWidth() == this.stickerWidth && realBitmap.getHeight() == this.stickerHeight) {
            return realBitmap;
        }
        this.stickerHeight = realBitmap.getHeight();
        this.stickerWidth = realBitmap.getWidth();
        initCoordinate();
        return realBitmap;
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public umw getMmcvImage(Context context) {
        return null;
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void initCoordinate() {
        float imageHeight = this.sticker.getImageHeight() / this.sticker.getImageWidth();
        this.stickerScale = imageHeight;
        float[] fArr = {-0.5f, imageHeight * 0.5f, -0.5f, (-0.5f) * imageHeight, 0.5f, (-0.5f) * imageHeight, 0.5f, imageHeight * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.vertexBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.vertexBuffer2 = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr);
        this.vertexBuffer2.position(0);
        float f = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.mViewMatrix, 0);
        this.mViewMatrix[0] = -1.0f;
    }

    public void replaceSticker(Sticker sticker) {
        synchronized (getLockObject()) {
            this.sticker = sticker;
        }
        initCoordinate();
        this.mStickerDuration = sticker.getDuration();
        this.startTime = -1L;
    }
}

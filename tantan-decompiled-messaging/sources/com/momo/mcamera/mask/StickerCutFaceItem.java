package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import com.core.glcore.util.Log4Cam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class StickerCutFaceItem extends StickerItem {
    private vjw mBitmap;
    public List<float[]> mCutFaceList;
    public List<FacePositions> mFacePositions;
    float mStickerScale;
    float realWidth;
    int renderHeight;
    int renderWidth;
    float[] texData1;

    public StickerCutFaceItem(Sticker sticker, Context context) {
        super(sticker, context);
        this.mCutFaceList = Collections.synchronizedList(new ArrayList());
        this.realWidth = 0.5f;
        this.mStickerScale = 1.7777778f;
        this.renderWidth = 0;
        this.renderHeight = 0;
        this.texData1 = new float[]{-0.5f, -(0.5f * 1.7777778f), 0.0f, 1.0f, 0.5f, (-0.5f) * 1.7777778f, 0.0f, 1.0f, -0.5f, 0.5f * 1.7777778f, 0.0f, 1.0f, 0.5f, 1.7777778f * 0.5f, 0.0f, 1.0f};
        this.mBitmap = null;
        this.isDraw = true;
        this.mFacePositions = sticker.getAdditionalInfo().getFacePositions();
    }

    public void calculateCutFaceMatrix(float f, float f2, PointF pointF, float f3, float[] fArr) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        fArr4[0] = -1.0f;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.translateM(fArr3, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr2, 0, fArr4, 0, this.mProjectionMatrix, 0);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, this.mProjectionMatrix, 0);
        Matrix.rotateM(fArr2, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr2, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        this.mCutFaceList.add(new float[]{fArr3[0], fArr3[1], fArr3[4], fArr3[5], fArr3[8], fArr3[9], fArr3[12], fArr3[13]});
    }

    public void clearCutFacePoints() {
        synchronized (this.maskLock) {
            try {
                List<float[]> list = this.mCutFaceList;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void clearPoints() {
        super.clearPoints();
        List<float[]> list = this.mCutFaceList;
        if (list != null) {
            list.clear();
        }
    }

    public int getImageIndexByPath(String str) {
        String[] strArrSplit = str.split("_");
        return Integer.parseInt(strArrSplit[strArrSplit.length - 1].replace(".png", ""));
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public MmcvImageLoader getMMcvImageLoader() {
        return new MmcvImageCacheLoader(this.sticker, this.context);
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public vjw getMmcvImage(Context context) {
        return this.mBitmap;
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        super.setDetectParam(faceDetectParam);
        if (this.renderWidth == 0 || this.renderHeight == 0) {
            return;
        }
        this.mBitmap = this.mmcvImageLoader.getMmcvImage(this.context);
        List<float[]> list = this.mvpLists;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mCutFaceList.clear();
        List<StickerFacePosition> stickerFacePositions = this.mFacePositions.get(getImageIndexByPath(this.mmcvImageLoader.imagePath)).getStickerFacePositions();
        Log4Cam.m7326i("huli", "in " + this.sticker.curIndex);
        if (stickerFacePositions == null || stickerFacePositions.size() <= 0) {
            return;
        }
        for (StickerFacePosition stickerFacePosition : stickerFacePositions) {
            int facex = stickerFacePosition.getFacex();
            int facey = stickerFacePosition.getFacey();
            int radius = (int) (((double) stickerFacePosition.getRadius()) * 1.1d);
            int angle = stickerFacePosition.getAngle();
            float imageHeight = (this.renderWidth * this.sticker.getImageHeight()) / this.renderHeight;
            float imageWidth = (facex + ((imageHeight - this.sticker.getImageWidth()) / 2.0f)) / imageHeight;
            float imageHeight2 = facey / this.sticker.getImageHeight();
            float imageWidth2 = radius * 2 * (faceDetectParam.scaleW / this.sticker.getImageWidth());
            calculateCutFaceMatrix(imageWidth2, (imageWidth2 / 16.0f) * 9.0f, new PointF(imageWidth, imageHeight2), faceDetectParam.angle + angle, this.texData1);
        }
    }

    public void setRenderSize(int i, int i2) {
        this.renderWidth = i;
        this.renderHeight = i2;
    }
}

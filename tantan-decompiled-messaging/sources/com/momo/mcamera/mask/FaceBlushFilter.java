package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.skin.AIFaceTriangulation;
import p149l.etf;
import p149l.mcj;
import p149l.pjw;
import p149l.ts2;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class FaceBlushFilter extends ts2 implements etf {
    private GLFaceBlendProgram glFaceBlendProgram;
    private int maskTexture = 0;
    private String mImagePath = null;
    private pjw mMmcvInfo = null;
    private boolean bitMapChanged = false;

    public FaceBlushFilter() {
        GLFaceBlendProgram gLFaceBlendProgram = new GLFaceBlendProgram();
        this.glFaceBlendProgram = gLFaceBlendProgram;
        gLFaceBlendProgram.setDrawType(4);
        this.glFaceBlendProgram.setBlendType("Normal");
    }

    private float[] landMark104ToPoint(float[] fArr, float f, float f2) {
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        int i = 0;
        while (true) {
            int i2 = length / 2;
            if (i >= i2) {
                return fArr2;
            }
            fArr2[i] = fArr[i] / f;
            int i3 = i2 + i;
            fArr2[i3] = fArr[i3] / f2;
            i++;
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.maskTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.maskTexture = 0;
        }
    }

    @Override // p149l.mcj
    public void drawSub() {
        int i;
        super.drawSub();
        synchronized (getLockObject()) {
            try {
                pjw pjwVar = this.mMmcvInfo;
                if (pjwVar != null && pjwVar.m169950n() > 0) {
                    for (int i2 = 0; i2 < this.mMmcvInfo.m169950n(); i2++) {
                        if (this.glFaceBlendProgram != null && (i = this.maskTexture) != 0) {
                            this.glFaceBlendProgram.drawFrame(AIFaceTriangulation.getFaceTriangulation(landMark104ToPoint(this.mMmcvInfo.m169946j(i2).m220024r(), getWidth(), getHeight())), new int[]{this.texture_in, i});
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        synchronized (getLockObject()) {
            try {
                if (this.maskTexture == 0 || this.bitMapChanged) {
                    if (!TextUtils.isEmpty(this.mImagePath)) {
                        vjw vjwVar = new vjw();
                        ImageUtils.decodeMMCVImage(vjwVar, this.mImagePath);
                        if (vjwVar.m198688a() != null && vjwVar.m198692e() > 0 && vjwVar.m198690c() > 0) {
                            int i2 = this.maskTexture;
                            if (i2 == 0) {
                                this.maskTexture = TextureHelper.bitmapToTexture(vjwVar);
                            } else {
                                this.maskTexture = TextureHelper.loadDataToTexture(i2, vjwVar);
                            }
                        }
                        this.bitMapChanged = false;
                    }
                }
                super.newTextureReady(i, mcjVar, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setImagePath(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.mImagePath = str;
        this.bitMapChanged = true;
    }

    public void setIntensity(float f) {
        GLFaceBlendProgram gLFaceBlendProgram = this.glFaceBlendProgram;
        if (gLFaceBlendProgram != null) {
            gLFaceBlendProgram.setIntensity(f);
        }
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        synchronized (getLockObject()) {
            try {
                if (pjwVar == null) {
                    return;
                }
                this.mMmcvInfo = pjwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.momo.mcamera.mask;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.skin.AIFaceTriangulation;
import p153l.gfj;
import p153l.jt2;
import p153l.omw;
import p153l.suf;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class FaceBlushFilter extends jt2 implements suf {
    private GLFaceBlendProgram glFaceBlendProgram;
    private int maskTexture = 0;
    private String mImagePath = null;
    private omw mMmcvInfo = null;
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

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.maskTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.maskTexture = 0;
        }
    }

    @Override // p153l.gfj
    public void drawSub() {
        int i;
        super.drawSub();
        synchronized (getLockObject()) {
            try {
                omw omwVar = this.mMmcvInfo;
                if (omwVar != null && omwVar.m168299n() > 0) {
                    for (int i2 = 0; i2 < this.mMmcvInfo.m168299n(); i2++) {
                        if (this.glFaceBlendProgram != null && (i = this.maskTexture) != 0) {
                            this.glFaceBlendProgram.drawFrame(AIFaceTriangulation.getFaceTriangulation(landMark104ToPoint(this.mMmcvInfo.m168295j(i2).m164787r(), getWidth(), getHeight())), new int[]{this.texture_in, i});
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        synchronized (getLockObject()) {
            try {
                if (this.maskTexture == 0 || this.bitMapChanged) {
                    if (!TextUtils.isEmpty(this.mImagePath)) {
                        umw umwVar = new umw();
                        ImageUtils.decodeMMCVImage(umwVar, this.mImagePath);
                        if (umwVar.m196795a() != null && umwVar.m196799e() > 0 && umwVar.m196797c() > 0) {
                            int i2 = this.maskTexture;
                            if (i2 == 0) {
                                this.maskTexture = TextureHelper.bitmapToTexture(umwVar);
                            } else {
                                this.maskTexture = TextureHelper.loadDataToTexture(i2, umwVar);
                            }
                        }
                        this.bitMapChanged = false;
                    }
                }
                super.newTextureReady(i, gfjVar, z);
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

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        synchronized (getLockObject()) {
            try {
                if (omwVar == null) {
                    return;
                }
                this.mMmcvInfo = omwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

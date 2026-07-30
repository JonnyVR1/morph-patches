package com.momo.mcamera.ThirdPartEffect.Pott.filter;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram.MMFramRenderProgram;
import com.momo.mcamera.util.MDLogTag;
import java.nio.IntBuffer;
import p153l.d33;
import p153l.gam;
import p153l.jt2;
import p153l.lej;
import p153l.lim;
import p153l.muf;

/* JADX INFO: loaded from: classes6.dex */
class PottMVFilter extends jt2 implements gam {
    protected long curTimeStamp = 0;
    protected long firstTimestamp = -1;
    MMFramRenderProgram normal = new MMFramRenderProgram();
    protected long totalDuration;
    protected long totalFrameCount;

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.curTimeStamp = 0L;
        this.firstTimestamp = -1L;
        this.totalFrameCount = 0L;
        this.totalDuration = 0L;
        MMFramRenderProgram mMFramRenderProgram = this.normal;
        if (mMFramRenderProgram != null) {
            mMFramRenderProgram.destroy();
            this.normal = null;
        }
    }

    @Override // p153l.gfj
    public void drawSub() {
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        onDrawPrograms();
        this.glFrameBuffer.m153906m(getWidth(), getHeight());
        GLES20.glDisable(3042);
    }

    public void drawTexture(d33 d33Var, MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo) {
        if (d33Var == null || mMFrameGeomeAttrInfo == null) {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
            return;
        }
        int[] frameTexture = mMFrameGeomeAttrInfo.getFrameTexture();
        if (frameTexture != null) {
            d33Var.updateGeomtryInfo(mMFrameGeomeAttrInfo);
            d33Var.drawFrame(frameTexture);
        }
    }

    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        lej lejVar2 = new lej(getWidth(), getHeight());
        this.glFrameBuffer = lejVar2;
        lejVar2.m153897d(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    public void onDrawPrograms() {
    }

    public void setTimeStamp(long j) {
        this.curTimeStamp = j;
        if (this.firstTimestamp < 0) {
            this.firstTimestamp = j;
        }
    }

    public void setTotalFrameCount(long j) {
        this.totalFrameCount = j;
        this.totalDuration = j * 40;
    }

    public Bitmap snapPicture(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        IntBuffer intBufferAllocate = IntBuffer.allocate(i * i2);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, intBufferAllocate);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(intBufferAllocate);
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        matrix.postRotate(0.0f);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, i, i2, matrix, true);
    }

    public void drawTexture(d33 d33Var, lim limVar, int i) {
        if (d33Var != null && limVar != null && i != 0) {
            d33Var.updateGeomtryInfo(limVar);
            d33Var.drawFrame(new int[]{i});
        } else {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
        }
    }
}

package com.momo.mcamera.ThirdPartEffect.Pott.filter;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram.MMFramRenderProgram;
import com.momo.mcamera.util.MDLogTag;
import java.nio.IntBuffer;
import p149l.igm;
import p149l.n23;
import p149l.q7m;
import p149l.rbj;
import p149l.ts2;
import p149l.ysf;

/* JADX INFO: loaded from: classes6.dex */
class PottMVFilter extends ts2 implements q7m {
    protected long curTimeStamp = 0;
    protected long firstTimestamp = -1;
    MMFramRenderProgram normal = new MMFramRenderProgram();
    protected long totalDuration;
    protected long totalFrameCount;

    @Override // p149l.mcj, p149l.ccj
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

    @Override // p149l.mcj
    public void drawSub() {
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        onDrawPrograms();
        this.glFrameBuffer.m178614m(getWidth(), getHeight());
        GLES20.glDisable(3042);
    }

    public void drawTexture(n23 n23Var, MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo) {
        if (n23Var == null || mMFrameGeomeAttrInfo == null) {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
            return;
        }
        int[] frameTexture = mMFrameGeomeAttrInfo.getFrameTexture();
        if (frameTexture != null) {
            n23Var.updateGeomtryInfo(mMFrameGeomeAttrInfo);
            n23Var.drawFrame(frameTexture);
        }
    }

    @Override // p149l.mcj
    public void initFBO() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m178606e();
        }
        rbj rbjVar2 = new rbj(getWidth(), getHeight());
        this.glFrameBuffer = rbjVar2;
        rbjVar2.m178605d(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
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

    public void drawTexture(n23 n23Var, igm igmVar, int i) {
        if (n23Var != null && igmVar != null && i != 0) {
            n23Var.updateGeomtryInfo(igmVar);
            n23Var.drawFrame(new int[]{i});
        } else {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
        }
    }
}

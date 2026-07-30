package com.momo.mcamera.mask.facewarp;

import android.opengl.GLES20;
import com.google.android.gms.common.api.Api;
import com.momocv.SingleFaceInfo;
import com.momocv.beauty.BeautyWarpInfo;
import com.momocv.beauty.BeautyWarpParams;
import com.momocv.videoprocessor.FaceAttribute;
import com.momocv.videoprocessor.VideoInfo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import p153l.jt2;
import p153l.lej;
import p153l.omw;
import p153l.suf;
import p153l.tuf;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseFaceWarpFilter extends jt2 implements suf, IFaceWarp {
    protected omw mmcvInfo;
    private FloatBuffer texCoordBuffer;
    private FloatBuffer vertexBuffer;
    private lej warpFrameBuffer;
    private int maxFaces = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    protected BeautyWarpParams warpParams = new BeautyWarpParams();
    protected BeautyWarpInfo warpInfo = new BeautyWarpInfo();
    protected WarpPoint warpPoint = new WarpPoint();
    protected boolean isWarpFailed = false;
    protected int warpType = getDefaultWarpType();

    public static class WarpPoint {
        float[] dstPoints;
        float[] srcPoints;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                WarpPoint warpPoint = (WarpPoint) obj;
                if (Arrays.equals(this.srcPoints, warpPoint.srcPoints) && Arrays.equals(this.dstPoints, warpPoint.dstPoints)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.srcPoints) * 31) + Arrays.hashCode(this.dstPoints);
        }
    }

    private void copyToFrameBuffer(int i) {
        GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m153901h()[0]);
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glUseProgram(this.programHandle);
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
        GLES20.glBindFramebuffer(36160, 0);
    }

    private void drawMultiFace() {
        float[] fArr;
        float[] fArr2;
        int iM168299n = this.mmcvInfo.m168299n();
        VideoInfo videoInfoM168304s = this.mmcvInfo.m168304s();
        int i = 0;
        for (int i2 = 0; i2 < iM168299n; i2++) {
            SingleFaceInfo singleFaceInfo = videoInfoM168304s.facesinfo_[i2];
            FaceAttribute faceAttribute = videoInfoM168304s.faces_attributes_[i2];
            WarpPoint warpPointProcessSingleWarpPoint = processSingleWarpPoint(singleFaceInfo);
            if (warpPointProcessSingleWarpPoint != null && (fArr = warpPointProcessSingleWarpPoint.srcPoints) != null && (fArr2 = warpPointProcessSingleWarpPoint.dstPoints) != null && fArr.length > 0 && fArr2.length > 0) {
                drawWarpFrame(i == 0 ? this.texture_in : getTextOutID(), warpPointProcessSingleWarpPoint);
                copyToFrameBuffer(this.warpFrameBuffer.m153902i()[0]);
                i++;
                clearPoints();
                setLandmarks(singleFaceInfo, faceAttribute);
                this.isWarpFailed = false;
            }
        }
        if (i == 0) {
            this.isWarpFailed = true;
            super.drawSub();
        }
    }

    private void drawSingleFace() {
        float[] fArr;
        float[] fArr2;
        SingleFaceInfo singleFaceInfo = this.mmcvInfo.m168304s().facesinfo_[0];
        FaceAttribute faceAttribute = this.mmcvInfo.m168304s().faces_attributes_[0];
        WarpPoint warpPointProcessSingleWarpPoint = processSingleWarpPoint(singleFaceInfo);
        if (warpPointProcessSingleWarpPoint == null || (fArr = warpPointProcessSingleWarpPoint.srcPoints) == null || (fArr2 = warpPointProcessSingleWarpPoint.dstPoints) == null || fArr.length <= 0 || fArr2.length <= 0) {
            this.isWarpFailed = true;
            super.drawSub();
        } else {
            drawWarpSub(this.texture_in, warpPointProcessSingleWarpPoint);
            clearPoints();
            setLandmarks(singleFaceInfo, faceAttribute);
            this.isWarpFailed = false;
        }
    }

    private void drawWarpFrame(int i, WarpPoint warpPoint) {
        lej lejVar = this.warpFrameBuffer;
        if (lejVar == null || lejVar.m153901h() == null || this.warpFrameBuffer.m153900g() != getWidth() || this.warpFrameBuffer.m153899f() != getHeight()) {
            if (getWidth() == 0 || getHeight() == 0) {
                return;
            } else {
                initWarpFBO();
            }
        }
        GLES20.glBindFramebuffer(36160, this.warpFrameBuffer.m153901h()[0]);
        drawWarpSub(i, warpPoint);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private void drawWarpSub(int i, WarpPoint warpPoint) {
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glUseProgram(this.programHandle);
        float[] fArr = warpPoint.srcPoints;
        float[] fArr2 = warpPoint.dstPoints;
        int length = fArr2.length / 2;
        FloatBuffer floatBuffer = this.vertexBuffer;
        if (floatBuffer == null || floatBuffer.capacity() != fArr2.length * 4) {
            this.vertexBuffer = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2);
        }
        this.vertexBuffer.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        FloatBuffer floatBuffer2 = this.texCoordBuffer;
        if (floatBuffer2 == null || floatBuffer2.capacity() != fArr.length * 4) {
            this.texCoordBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        }
        this.texCoordBuffer.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.texCoordBuffer);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glDrawArrays(4, 0, length);
        disableDrawArray();
    }

    private void initWarpFBO() {
        lej lejVar = this.warpFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        lej lejVar2 = new lej(getWidth(), getHeight());
        this.warpFrameBuffer = lejVar2;
        lejVar2.m153895b(getWidth(), getHeight());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        throw new RuntimeException(toString() + ": Failed to set up render buffer with status " + iGlCheckFramebufferStatus + " and error " + GLES20.glGetError());
    }

    private void setLandmarks(SingleFaceInfo singleFaceInfo, FaceAttribute faceAttribute) {
        float[][] fArr;
        float[][] fArr2;
        BeautyWarpInfo beautyWarpInfo = this.warpInfo;
        float[][] fArr3 = beautyWarpInfo.warped_landmarks68_;
        if (fArr3 == null || (fArr = beautyWarpInfo.warped_landmarks96_) == null || (fArr2 = beautyWarpInfo.warped_landmarks104_) == null) {
            return;
        }
        float[] fArr4 = fArr3[0];
        singleFaceInfo.landmarks_68_ = fArr4;
        float[] fArr5 = fArr[0];
        singleFaceInfo.landmarks_96_ = fArr5;
        float[] fArr6 = fArr2[0];
        singleFaceInfo.landmarks_104_ = fArr6;
        faceAttribute.warped_landmarks68_ = fArr4;
        faceAttribute.warped_landmarks96_ = fArr5;
        faceAttribute.warped_landmarks104_ = fArr6;
    }

    public abstract BeautyWarpParams buildParams(omw omwVar, SingleFaceInfo singleFaceInfo);

    public void clearPoints() {
        WarpPoint warpPoint = this.warpPoint;
        warpPoint.srcPoints = null;
        warpPoint.dstPoints = null;
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        tuf.m192743a().m192746d();
    }

    @Override // p153l.gfj
    public void drawSub() {
        if (notWarp()) {
            super.drawSub();
        } else if (this.maxFaces > 1) {
            drawMultiFace();
        } else {
            drawSingleFace();
        }
    }

    public abstract int getDefaultWarpType();

    public abstract boolean notWarp();

    public WarpPoint processSingleWarpPoint(SingleFaceInfo singleFaceInfo) {
        if (tuf.m192743a().m192744b(buildParams(this.mmcvInfo, singleFaceInfo), this.warpInfo)) {
            WarpPoint warpPoint = this.warpPoint;
            BeautyWarpInfo beautyWarpInfo = this.warpInfo;
            warpPoint.srcPoints = beautyWarpInfo.src_warp_points_;
            warpPoint.dstPoints = beautyWarpInfo.dst_warp_points_;
        }
        return this.warpPoint;
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        lej lejVar = this.warpFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
            this.warpFrameBuffer = null;
        }
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        this.mmcvInfo = omwVar;
    }

    public void setMaxFaces(int i) {
        this.maxFaces = i;
    }

    public void setScaleFactor(float f) {
        this.warpParams.scale_factor_ = f;
    }

    public void setWarpType(int i) {
        this.warpType = i;
    }
}

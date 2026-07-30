package com.momo.mcamera.mask;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class BodyWarpFilter extends FaceDetectFilter {
    private List<omw> mvpLists = Collections.synchronizedList(new ArrayList());

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
        this.mvpLists.clear();
    }

    @Override // p153l.gfj
    public void drawSub() {
        if (this.mvpLists.size() <= 0 || !this.mvpLists.get(0).m168306u()) {
            System.currentTimeMillis();
            GLES20.glViewport(0, 0, getWidth(), getHeight());
            GLES20.glClear(16640);
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glUseProgram(this.programHandle);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
            floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            floatBufferAsFloatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
            floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
            floatBufferAsFloatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer2);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.texture_in);
            GLES20.glUniform1i(this.textureHandle, 0);
            GLES20.glDrawArrays(5, 0, 4);
            disableDrawArray();
        } else {
            System.currentTimeMillis();
            GLES20.glViewport(0, 0, getWidth(), getHeight());
            GLES20.glClear(16640);
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.texture_in);
            GLES20.glUniform1i(this.textureHandle, 0);
            GLES20.glUseProgram(this.programHandle);
            float[] fArr = this.mvpLists.get(0).m168292d().src_warp_points_;
            int length = fArr.length;
            int length2 = fArr.length / 6;
            float[] fArr2 = this.mvpLists.get(0).m168292d().dst_warp_points_;
            ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(fArr2.length * 4);
            byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer3 = byteBufferAllocateDirect3.asFloatBuffer();
            floatBufferAsFloatBuffer3.put(fArr2);
            floatBufferAsFloatBuffer3.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer3);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            ByteBuffer byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect4.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer4 = byteBufferAllocateDirect4.asFloatBuffer();
            floatBufferAsFloatBuffer4.put(fArr);
            floatBufferAsFloatBuffer4.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer4);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glDrawArrays(4, 0, length2 * 3);
            disableDrawArray();
        }
        clearPoints();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return super.getFragmentShader();
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return super.getVertexShader();
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p153l.wej
    public void passShaderValues() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (omwVar != null) {
            this.mvpLists.add(omwVar);
        }
    }
}

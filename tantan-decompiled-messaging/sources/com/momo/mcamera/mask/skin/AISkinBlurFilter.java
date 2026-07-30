package com.momo.mcamera.mask.skin;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import p149l.etf;
import p149l.mcj;
import p149l.pdj0;
import p149l.pjw;
import p149l.sij;

/* JADX INFO: loaded from: classes7.dex */
public class AISkinBlurFilter extends pdj0 implements etf {
    private float mBlurSize;
    private pjw mMmcvInfo;
    private int textureId = -1;
    private int textureInId = -1;
    private int textureBeforeId = -1;
    private boolean isDiscard = false;

    public AISkinBlurFilter(float f) {
        this.mBlurSize = 0.0f;
        if (f >= 0.0f) {
            double d = f;
            float fFloor = (float) Math.floor(Math.sqrt(Math.pow(d, 2.0d) * (-2.0d) * Math.log(0.00390625d * Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d))));
            this.mBlurSize = fFloor + (fFloor % 2.0f);
        }
    }

    @Override // p149l.mcj
    public void drawSub() {
        pjw pjwVar;
        super.drawSub();
        if (this.isDiscard) {
            return;
        }
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        pjw pjwVar2 = this.mMmcvInfo;
        if (pjwVar2 != null && pjwVar2.m169950n() > 0) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int iM169950n = this.mMmcvInfo.m169950n();
                pjwVar = this.mMmcvInfo;
                if (i >= iM169950n) {
                    break;
                }
                arrayList.add(pjwVar.m169946j(i).m220024r());
                i++;
            }
            float[][] faceTriangulationBoundingBox = AIFaceTriangulation.getFaceTriangulationBoundingBox((float[][]) arrayList.toArray(new float[pjwVar.m169950n()][]), getWidth(), getHeight());
            float[] fArr = faceTriangulationBoundingBox[0];
            float[] fArr2 = faceTriangulationBoundingBox[1];
            passShaderValues();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
            floatBufferAsFloatBuffer.put(fArr);
            floatBufferAsFloatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
            floatBufferAsFloatBuffer2.put(fArr2);
            floatBufferAsFloatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer2);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (getCurrentPass() == 2) {
            disableDrawArray();
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        float f = this.mBlurSize;
        return sij.m184341Q1(f, f);
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        float f = this.mBlurSize;
        return sij.m184342R1(f, f);
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        int i2;
        int i3;
        if (this.textureInId != -1 && (i2 = this.textureId) != -1 && (i3 = this.textureBeforeId) != -1 && (i != i2 || i3 != i)) {
            this.isDiscard = true;
        }
        this.textureBeforeId = this.textureId;
        this.textureId = i;
        this.textureInId = this.texture_in;
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mMmcvInfo = pjwVar;
    }
}

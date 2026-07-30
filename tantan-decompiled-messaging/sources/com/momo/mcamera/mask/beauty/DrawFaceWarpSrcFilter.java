package com.momo.mcamera.mask.beauty;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.etf;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class DrawFaceWarpSrcFilter extends ts2 implements etf {
    FloatBuffer floatBufFace222;
    FloatBuffer floatBuffer;
    float[] faceRec = null;
    float[][] facePos222 = null;
    private int colorHandle = 0;

    private void adjustCoordnate(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length <= 0 || fArr2 == null || fArr2.length <= 0) {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "No face Info or buffer is empty");
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (fArr2[i] - 0.5f) * 2.0f;
        }
    }

    private FloatBuffer putDataToFloatBuffer(FloatBuffer floatBuffer, float[][] fArr) {
        if (fArr.length <= 0) {
            floatBuffer.position(0);
            return floatBuffer;
        }
        if (floatBuffer == null) {
            floatBuffer = ByteBuffer.allocateDirect(fArr.length * 4 * fArr[0].length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr2 = fArr[i];
            if (fArr2 != null && fArr2.length > 0) {
                floatBuffer.put(fArr2, fArr2.length * i, fArr2.length);
            }
        }
        floatBuffer.position(0);
        return floatBuffer;
    }

    private void updateFaceInfo(pjw pjwVar) {
        int iM169950n = pjwVar.m169950n();
        if (iM169950n <= 0) {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "No face");
            return;
        }
        float[][] fArr = this.facePos222;
        if (fArr == null || iM169950n != fArr.length) {
            this.facePos222 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, iM169950n, 444);
        }
        for (int i = 0; i < iM169950n; i++) {
            if (pjwVar.m169946j(i) != null) {
                handCoord(i, pjwVar);
            }
        }
    }

    @Override // p149l.mcj
    public void drawSub() {
        super.drawSub();
        GLES20.glUniform1i(this.colorHandle, 0);
        float[] fArr = this.faceRec;
        if (fArr == null || fArr.length <= 0) {
            MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Render no face!");
            return;
        }
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        float width = ((this.faceRec[0] / getWidth()) - 0.5f) * 2.0f;
        float height = ((this.faceRec[1] / getHeight()) - 0.5f) * (-2.0f);
        float width2 = ((this.faceRec[2] / getWidth()) - 0.5f) * 2.0f;
        float height2 = ((this.faceRec[3] / getHeight()) - 0.5f) * (-2.0f);
        float[] fArr2 = {width, height, width, height2, width, height2, width2, height2, width2, height2, width2, height, width, height, width2, height};
        FloatBuffer floatBuffer = this.floatBuffer;
        if (floatBuffer == null || floatBuffer.capacity() != 16) {
            this.floatBuffer = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.floatBuffer.put(fArr2);
        this.floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.floatBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glLineWidth(2.0f);
        GLES20.glDrawArrays(1, 0, 8);
        FloatBuffer floatBufferPutDataToFloatBuffer = putDataToFloatBuffer(this.floatBufFace222, this.facePos222);
        this.floatBufFace222 = floatBufferPutDataToFloatBuffer;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) floatBufferPutDataToFloatBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glDrawArrays(0, 0, floatBufferPutDataToFloatBuffer.capacity() / 2);
        disableDrawArray();
    }

    public String getColor() {
        return "vec4(0.0, 1.0, 0.0, 1.0)";
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform int color;\nvarying vec2 textureCoordinate;\nvoid main(){\n if(color == 1){   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n }else{   gl_FragColor = " + getColor() + ";\n }}\n";
    }

    public String getPointSize() {
        return "5.0";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n gl_PointSize = " + getPointSize() + ";   gl_Position = position;\n}\n";
    }

    public void handCoord(int i, pjw pjwVar) {
        float[][] fArr = pjwVar.f149910q;
        if (fArr == null || fArr[i] == null) {
            return;
        }
        float[] fArr2 = this.facePos222[i];
        adjustCoordnate(fArr2, fArr2);
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.colorHandle = GLES20.glGetUniformLocation(this.programHandle, "color");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1i(this.colorHandle, 1);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        float[] fArr;
        if (pjwVar != null) {
            float[][] fArrM169947k = pjwVar.m169947k();
            if (fArrM169947k != null && fArrM169947k.length > 0 && (fArr = fArrM169947k[0]) != null) {
                this.faceRec = fArr;
            }
            updateFaceInfo(pjwVar);
        }
    }
}

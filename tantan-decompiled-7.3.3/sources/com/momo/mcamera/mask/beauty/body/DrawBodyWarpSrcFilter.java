package com.momo.mcamera.mask.beauty.body;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.momocv.beauty.BodyWarpInfo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.jt2;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class DrawBodyWarpSrcFilter extends jt2 implements suf {
    protected FloatBuffer floatBuffer;
    protected float[] data = null;
    protected int colorHandle = 0;

    private FloatBuffer putDataToFloatBuffer(FloatBuffer floatBuffer, float[] fArr) {
        if (fArr.length <= 0) {
            floatBuffer.position(0);
            return floatBuffer;
        }
        if (floatBuffer == null) {
            floatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        floatBuffer.put(fArr);
        floatBuffer.position(0);
        return floatBuffer;
    }

    public void adjustCoordnate(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length <= 0 || fArr2 == null || fArr2.length <= 0) {
            MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "No face Info or buffer is empty");
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (fArr2[i] - 0.5f) * 2.0f;
        }
    }

    @Override // p153l.gfj
    public void drawSub() {
        super.drawSub();
        float[] fArr = this.data;
        if (fArr == null || fArr.length <= 0) {
            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Render no body!");
            return;
        }
        GLES20.glUniform1i(this.colorHandle, 0);
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        FloatBuffer floatBufferPutDataToFloatBuffer = putDataToFloatBuffer(this.floatBuffer, this.data);
        this.floatBuffer = floatBufferPutDataToFloatBuffer;
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) floatBufferPutDataToFloatBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glDrawArrays(0, 0, floatBufferPutDataToFloatBuffer.capacity() / 2);
        disableDrawArray();
    }

    public String getColor() {
        return "vec4(1.0, 0.0, 0.0, 1.0)";
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform int color;\nvarying vec2 textureCoordinate;\nvoid main(){\n if(color == 1){   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n }else{   gl_FragColor = " + getColor() + ";\n }}\n";
    }

    public String getPointSize() {
        return "5.0";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n gl_PointSize = " + getPointSize() + ";   gl_Position = position;\n}\n";
    }

    public void handCoord(int i, omw omwVar) {
        adjustCoordnate(this.data, omwVar.f148026m.src_warp_points_);
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.colorHandle = GLES20.glGetUniformLocation(this.programHandle, "color");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1i(this.colorHandle, 1);
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (omwVar != null) {
            updateFaceInfo(omwVar);
        }
    }

    public void updateFaceInfo(omw omwVar) {
        float[] fArr;
        int iM168299n = omwVar.m168299n();
        if (iM168299n <= 0) {
            MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "No face");
            return;
        }
        for (int i = 0; i < iM168299n; i++) {
            BodyWarpInfo bodyWarpInfo = omwVar.f148026m;
            if (bodyWarpInfo != null && (fArr = bodyWarpInfo.src_warp_points_) != null) {
                float[] fArr2 = this.data;
                if (fArr2 == null || fArr2.length != fArr.length) {
                    this.data = new float[fArr.length];
                }
                handCoord(i, omwVar);
            }
        }
    }
}

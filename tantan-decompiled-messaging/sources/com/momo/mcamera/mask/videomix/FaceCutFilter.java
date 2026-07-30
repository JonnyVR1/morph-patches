package com.momo.mcamera.mask.videomix;

import android.graphics.PointF;
import android.opengl.GLES20;
import com.momo.mcamera.mask.BigEyeFilter;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.etf;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class FaceCutFilter extends ts2 implements etf {
    private static final int NO_TIME_STAMPS = -1;
    private float[][] faceData;
    private OnFaceUpdateListener listener;
    private pjw mmcvInfo;
    private int offsetHandle;
    private int rollHandle;
    private int textureSizeHandle;
    private float[] timestamps;
    private float[] vertexCoordinate = new float[8];
    private float[] textureCoordinate = new float[8];
    private float[] videoVertexCoordinate = new float[8];
    private long lastTimestamp = 0;
    private long timestamp = 0;
    private int startIndex = 0;
    private PointF offset = new PointF();
    private float videoFaceRoll = 0.0f;
    private float cameraFaceRoll = 0.0f;

    private void buildTextureCoordinate() {
        if (!canCutFace()) {
            float[] fArr = this.textureCoordinate;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 1.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 1.0f;
            fArr[6] = 1.0f;
            fArr[7] = 1.0f;
            return;
        }
        float[] fArrM220016j = this.mmcvInfo.m169946j(0).m220016j();
        float fMin = Math.min(fArrM220016j[0], fArrM220016j[3]) / this.width;
        float fMin2 = Math.min(fArrM220016j[203], fArrM220016j[204]) / this.height;
        float fMax = Math.max(fArrM220016j[18], fArrM220016j[15]) / this.width;
        float f = fArrM220016j[113] / this.height;
        float[] fArr2 = this.textureCoordinate;
        fArr2[0] = fMin;
        float f2 = 1.0f - f;
        fArr2[1] = f2;
        fArr2[2] = fMax;
        fArr2[3] = f2;
        fArr2[4] = fMin;
        float f3 = 1.0f - fMin2;
        fArr2[5] = f3;
        fArr2[6] = fMax;
        fArr2[7] = f3;
    }

    private void buildVertexCoordinate() {
        float[][] fArr;
        int iFindNearestIndex = findNearestIndex();
        if (canCutFace() && iFindNearestIndex > -1) {
            float[][] fArr2 = this.faceData;
            if (iFindNearestIndex < fArr2.length) {
                float[] fArr3 = fArr2[iFindNearestIndex];
                float f = fArr3[0];
                float f2 = fArr3[1];
                float f3 = fArr3[2];
                float f4 = fArr3[3];
                float[] fArr4 = this.vertexCoordinate;
                float f5 = (f2 * 2.0f) - 1.0f;
                fArr4[0] = f5;
                float f6 = -((f3 * 2.0f) - 1.0f);
                fArr4[1] = f6;
                float f7 = (f4 * 2.0f) - 1.0f;
                fArr4[2] = f7;
                fArr4[3] = f6;
                fArr4[4] = f5;
                float f8 = -((f * 2.0f) - 1.0f);
                fArr4[5] = f8;
                fArr4[6] = f7;
                fArr4[7] = f8;
                float[] fArr5 = this.videoVertexCoordinate;
                fArr5[0] = f5;
                fArr5[1] = f6;
                fArr5[2] = f7;
                fArr5[3] = f6;
                fArr5[4] = f5;
                fArr5[5] = f8;
                fArr5[6] = f7;
                fArr5[7] = f8;
                this.offset.x = this.mmcvInfo.m169946j(0).m220016j()[75] / this.width;
                this.offset.y = 1.0f - (this.mmcvInfo.m169946j(0).m220016j()[179] / this.height);
                this.videoFaceRoll = (float) (((double) (fArr3[4] / 360.0f)) * 3.141592653589793d * 2.0d);
                this.cameraFaceRoll = (float) (((double) (this.mmcvInfo.m169946j(0).m220012c()[2] / 360.0f)) * 3.141592653589793d * 2.0d);
                return;
            }
        }
        if (iFindNearestIndex <= -1 || (fArr = this.faceData) == null || iFindNearestIndex >= fArr.length) {
            float[] fArr6 = this.vertexCoordinate;
            fArr6[0] = -1.0f;
            fArr6[1] = -1.0f;
            fArr6[2] = 1.0f;
            fArr6[3] = -1.0f;
            fArr6[4] = -1.0f;
            fArr6[5] = 1.0f;
            fArr6[6] = 1.0f;
            fArr6[7] = 1.0f;
            float[] fArr7 = this.videoVertexCoordinate;
            fArr7[0] = -1.0f;
            fArr7[1] = -1.0f;
            fArr7[2] = 1.0f;
            fArr7[3] = -1.0f;
            fArr7[4] = -1.0f;
            fArr7[5] = 1.0f;
            fArr7[6] = 1.0f;
            fArr7[7] = 1.0f;
            PointF pointF = this.offset;
            pointF.x = 0.5f;
            pointF.y = 0.5f;
            this.videoFaceRoll = 0.0f;
            this.cameraFaceRoll = 0.0f;
            return;
        }
        float[] fArr8 = fArr[iFindNearestIndex];
        float f9 = fArr8[0];
        float f10 = fArr8[1];
        float f11 = fArr8[2];
        float f12 = fArr8[3];
        float[] fArr9 = this.vertexCoordinate;
        fArr9[0] = -1.0f;
        fArr9[1] = -1.0f;
        fArr9[2] = 1.0f;
        fArr9[3] = -1.0f;
        fArr9[4] = -1.0f;
        fArr9[5] = 1.0f;
        fArr9[6] = 1.0f;
        fArr9[7] = 1.0f;
        float[] fArr10 = this.videoVertexCoordinate;
        float f13 = (f10 * 2.0f) - 1.0f;
        fArr10[0] = f13;
        float f14 = -((f11 * 2.0f) - 1.0f);
        fArr10[1] = f14;
        float f15 = (f12 * 2.0f) - 1.0f;
        fArr10[2] = f15;
        fArr10[3] = f14;
        fArr10[4] = f13;
        float f16 = -((f9 * 2.0f) - 1.0f);
        fArr10[5] = f16;
        fArr10[6] = f15;
        fArr10[7] = f16;
        PointF pointF2 = this.offset;
        pointF2.x = 0.5f;
        pointF2.y = 0.5f;
        this.videoFaceRoll = 0.0f;
        this.cameraFaceRoll = 0.0f;
    }

    private boolean canCutFace() {
        pjw pjwVar = this.mmcvInfo;
        return (pjwVar == null || pjwVar.m169950n() <= 0 || this.timestamps == null || this.faceData == null) ? false : true;
    }

    private int findNearestIndex() {
        float[] fArr = this.timestamps;
        if (fArr == null) {
            return -1;
        }
        int length = fArr.length - 1;
        int i = 0;
        while (true) {
            float[] fArr2 = this.timestamps;
            if (i > length) {
                if (i == fArr2.length) {
                    return fArr2.length - 1;
                }
                int i2 = i - 1;
                return Math.abs(fArr2[i] - ((float) this.timestamp)) >= Math.abs(this.timestamps[i2] - ((float) this.timestamp)) ? i2 : i;
            }
            int i3 = (i + length) >>> 1;
            float f = fArr2[i3];
            long j = this.timestamp;
            if (f < j) {
                i = i3 + 1;
            } else {
                if (f <= j) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
    }

    private String transformedCoordinate() {
        return "vec2 transformedCoordinate(vec2 originCoordinate, vec2 offset, mat2 transformMatrix, vec2 textureSize) {\n        vec2 centered = originCoordinate * textureSize - offset * textureSize;\n        vec2 trans = transformMatrix * centered;\n        vec2 result = trans.xy + offset * textureSize;\n        return result / textureSize;\n    }";
    }

    @Override // p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
        this.faceData = null;
        this.timestamps = null;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float roll;\nuniform vec2 textureSize;\nuniform vec2 offset;\n\n" + transformedCoordinate() + "\nvoid main() {\n    vec2 textureCoordinate = transformedCoordinate(textureCoordinate, offset, mat2(vec2(cos(roll), -sin(roll)), vec2(sin(roll), cos(roll))), textureSize);\n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.rollHandle = GLES20.glGetUniformLocation(this.programHandle, "roll");
        this.textureSizeHandle = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_TEXTURE_SIZE);
        this.offsetHandle = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        if (this.renderVertices == null) {
            this.renderVertices = ByteBuffer.allocateDirect(this.vertexCoordinate.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.renderVertices.clear();
        this.renderVertices.put(this.vertexCoordinate).position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        FloatBuffer[] floatBufferArr = this.textureVertices;
        int i = this.curRotation;
        if (floatBufferArr[i] == null) {
            floatBufferArr[i] = ByteBuffer.allocateDirect(this.textureCoordinate.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.textureVertices[this.curRotation].clear();
        this.textureVertices[this.curRotation].put(this.textureCoordinate).position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.rollHandle, this.cameraFaceRoll - this.videoFaceRoll);
        GLES20.glUniform2f(this.textureSizeHandle, this.width, this.height);
        int i2 = this.offsetHandle;
        PointF pointF = this.offset;
        GLES20.glUniform2f(i2, pointF.x, pointF.y);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
        buildVertexCoordinate();
        buildTextureCoordinate();
        OnFaceUpdateListener onFaceUpdateListener = this.listener;
        if (onFaceUpdateListener != null) {
            onFaceUpdateListener.onFaceUpdate(this.videoVertexCoordinate, this.videoFaceRoll);
        }
    }

    public void setOnVertexCoordinateUpdateListener(OnFaceUpdateListener onFaceUpdateListener) {
        this.listener = onFaceUpdateListener;
    }

    public void setVideoFileConfig(float[] fArr, float[][] fArr2) {
        this.timestamps = fArr;
        this.faceData = fArr2;
    }

    public void updateTimestamp(long j) {
        this.timestamp = j;
    }
}

package com.momo.mcamera.mask.videomix;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.BigEyeFilter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.mcj;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class VideoMaskFilter extends ts2 {
    private String maskPath;
    private float roll;
    private int rollHandle;
    private int textureSizeHandle;
    private int maskTexture = 0;
    private float[] vertexCoordinate = new float[8];
    private float[] textureCoordinate = new float[8];

    public VideoMaskFilter() {
        updateVertexCoordinate(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        updateTextureCoordinate(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    private String transformedCoordinate() {
        return "vec2 transformedCoordinate(vec2 originCoordinate, vec2 offset, mat2 transformMatrix, vec2 textureSize) {\n        vec2 centered = originCoordinate * textureSize - offset * textureSize;\n        vec2 trans = transformMatrix * centered;\n        vec2 result = trans.xy + offset * textureSize;\n        return result / textureSize;\n    }";
    }

    @Override // p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
        this.vertexCoordinate = null;
        this.textureCoordinate = null;
        int i = this.maskTexture;
        if (i != 0) {
            TextureHelper.destroyTexture(new int[]{i});
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float roll;\nuniform vec2 textureSize;\n\n" + transformedCoordinate() + "\nvoid main() {\n    vec2 textureCoordinate = transformedCoordinate(textureCoordinate, vec2(0.5, 0.5), mat2(vec2(cos(roll), -sin(roll)), vec2(sin(roll), cos(roll))), textureSize);\n    gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.rollHandle = GLES20.glGetUniformLocation(this.programHandle, "roll");
        this.textureSizeHandle = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_TEXTURE_SIZE);
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        if (this.maskTexture != 0 || TextUtils.isEmpty(this.maskPath)) {
            return;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.maskPath);
        this.maskTexture = TextureHelper.bitmapToTexture(bitmapDecodeFile);
        bitmapDecodeFile.recycle();
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
        GLES20.glBindTexture(3553, this.maskTexture);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform2f(this.textureSizeHandle, this.width, this.height);
        GLES20.glUniform1f(this.rollHandle, -this.roll);
    }

    public void setVideoFileConfig(RectF rectF, String str) {
        this.maskPath = str;
        float f = rectF.left;
        float f2 = rectF.bottom;
        float f3 = rectF.right;
        float f4 = rectF.top;
        updateTextureCoordinate(new float[]{f, 1.0f - f2, f3, 1.0f - f2, f, 1.0f - f4, f3, 1.0f - f4});
    }

    public void updateMaskRoll(float f) {
        this.roll = f;
    }

    public void updateTextureCoordinate(float[] fArr) {
        float[] fArr2 = this.textureCoordinate;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
    }

    public void updateVertexCoordinate(float[] fArr) {
        float[] fArr2 = this.vertexCoordinate;
        fArr2[0] = fArr[6];
        fArr2[1] = fArr[7];
        fArr2[2] = fArr[4];
        fArr2[3] = fArr[5];
        fArr2[4] = fArr[2];
        fArr2[5] = fArr[3];
        fArr2[6] = fArr[0];
        fArr2[7] = fArr[1];
    }
}

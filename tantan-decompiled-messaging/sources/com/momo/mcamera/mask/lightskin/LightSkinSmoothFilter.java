package com.momo.mcamera.mask.lightskin;

import android.opengl.GLES20;
import com.momo.mcamera.mask.skin.AIFaceTriangulation;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p149l.etf;
import p149l.mcj;
import p149l.pjw;
import p149l.xj10;

/* JADX INFO: loaded from: classes7.dex */
public class LightSkinSmoothFilter extends xj10 implements etf {
    private float bgBlur;
    private int blurAlphaHandle;
    private int freqRangeBlurHandle;
    private int freqRangeValueHandle;
    private float heightOffset;
    private int heightOffsetHandle;
    private pjw mmcvInfo;
    private float sharpen;
    private int sharpenHandle;
    private float smoothLevel;
    private FloatBuffer texCoordBuffer;
    private FloatBuffer verticesBuffer;
    private float widthOffset;
    private int widthOffsetHandle;

    public LightSkinSmoothFilter() {
        super(3);
        this.sharpen = 0.5f;
    }

    @Override // p149l.mcj
    public void drawSub() {
        super.drawSub();
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || pjwVar.m169950n() == 0) {
            return;
        }
        GLES20.glUseProgram(this.programHandle);
        for (int i = 0; i < this.mmcvInfo.m169950n(); i++) {
            facePassShaderValues();
            float[][] faceTriangulation = AIFaceTriangulation.getFaceTriangulation(this.mmcvInfo.m169946j(i).m220024r(), getWidth(), getHeight(), null);
            float[] fArr = faceTriangulation[0];
            float[] fArr2 = faceTriangulation[1];
            if (this.verticesBuffer == null) {
                this.verticesBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            }
            this.verticesBuffer.rewind();
            this.verticesBuffer.put(fArr);
            this.verticesBuffer.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            if (this.texCoordBuffer == null) {
                this.texCoordBuffer = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            }
            this.texCoordBuffer.rewind();
            this.texCoordBuffer.put(fArr2);
            this.texCoordBuffer.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) this.texCoordBuffer);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glDrawArrays(4, 0, fArr2.length / 2);
        }
        disableDrawArray();
    }

    public void facePassShaderValues() {
        passTextureValues();
        GLES20.glUniform3f(this.blurAlphaHandle, this.smoothLevel, 0.0f, 0.0f);
        GLES20.glUniform1f(this.widthOffsetHandle, this.widthOffset);
        GLES20.glUniform1f(this.heightOffsetHandle, this.heightOffset);
        GLES20.glUniform1f(this.sharpenHandle, this.sharpen);
        GLES20.glUniform4f(this.freqRangeValueHandle, 0.2f, 0.5f, 0.9f, 0.9f);
        GLES20.glUniform4f(this.freqRangeBlurHandle, 1.0f, 0.9f, 0.5f, 0.08f);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nvarying highp vec2 textureCoordinate; \nuniform sampler2D inputImageTexture0; //原图\nuniform sampler2D inputImageTexture1;  \nuniform sampler2D inputImageTexture2;  \nuniform lowp vec3 blurAlpha; //0.59   1.0\nuniform highp float widthOffset; //0.0018519 即 1/w\nuniform highp float heightOffset; //0.0010417 即1/h\nuniform highp float sharpen;//0.05\n\nuniform  vec4 frequencyRangeValue; \nuniform  vec4 frequencyRangeBlur;\n\nvoid main() \n{ \n    lowp vec4 iColor = texture2D(inputImageTexture0, textureCoordinate); \n    lowp vec4 meanColor = texture2D(inputImageTexture1, textureCoordinate); \n    lowp vec4 varColor = texture2D(inputImageTexture2, textureCoordinate); \n    lowp float theta = 0.1; \n    mediump float p = clamp((min(iColor.r, meanColor.r - 0.1) - 0.2) * 4.0, 0.0, 1.0); \n    mediump float meanVar = (varColor.r + varColor.g + varColor.b) / 3.0; \n    mediump float kMin; \n    lowp vec3 resultColor; \n    lowp float intensity = blurAlpha.r; \n    kMin = (1.0 - meanVar / (meanVar + theta)) * p * intensity; \n\n    ////////////////////////////////////////////////////////\n    //分频\n    if(kMin > 1.0 - frequencyRangeValue.x)\n    {\n        kMin = kMin * frequencyRangeBlur.x ; //低频\n    }\n    else if(kMin > 1.0 - frequencyRangeValue.y)\n    {\n        kMin = kMin * frequencyRangeBlur.y; //低中频\n    }\n    else if(kMin > 1.0 - frequencyRangeValue.z)\n    {\n        kMin = kMin * frequencyRangeBlur.z; //中频\n    }\n    else\n    {\n        kMin = kMin * frequencyRangeBlur.w; //高频        \n    }    \n\n    ////////////////////////////////////////////////////////\n\n    resultColor = mix(iColor.rgb, meanColor.rgb, kMin); \n     \n    highp float sum = 0.25*iColor.g;\n    sum += 0.125*texture2D(inputImageTexture0,textureCoordinate+vec2(-widthOffset,0.0)).g;\n    sum += 0.125*texture2D(inputImageTexture0,textureCoordinate+vec2(widthOffset,0.0)).g;\n    sum += 0.125*texture2D(inputImageTexture0,textureCoordinate+vec2(0.0,-heightOffset)).g;\n    sum += 0.125*texture2D(inputImageTexture0,textureCoordinate+vec2(0.0,heightOffset)).g;\n    sum += 0.0625*texture2D(inputImageTexture0,textureCoordinate+vec2(widthOffset,heightOffset)).g;\n    sum += 0.0625*texture2D(inputImageTexture0,textureCoordinate+vec2(-widthOffset,-heightOffset)).g;\n    sum += 0.0625*texture2D(inputImageTexture0,textureCoordinate+vec2(-widthOffset,heightOffset)).g;\n    sum += 0.0625*texture2D(inputImageTexture0,textureCoordinate+vec2(widthOffset,-heightOffset)).g;\n\n\n    float hPass = iColor.g-sum+0.5;\n    float flag = step(0.5, hPass);\n    highp vec3 color = mix(max(vec3(0.0), (2.0*hPass + resultColor - 1.0)), min(vec3(1.0), (resultColor + 2.0*hPass - 1.0)), flag);\n    color = mix(resultColor.rgb, color.rgb, sharpen);\n\n    gl_FragColor = vec4(color, 1.0);\n}";
    }

    public float getSmoothLevel() {
        return this.smoothLevel;
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.blurAlphaHandle = GLES20.glGetUniformLocation(this.programHandle, "blurAlpha");
        this.widthOffsetHandle = GLES20.glGetUniformLocation(this.programHandle, "widthOffset");
        this.heightOffsetHandle = GLES20.glGetUniformLocation(this.programHandle, "heightOffset");
        this.sharpenHandle = GLES20.glGetUniformLocation(this.programHandle, "sharpen");
        this.freqRangeValueHandle = GLES20.glGetUniformLocation(this.programHandle, "frequencyRangeValue");
        this.freqRangeBlurHandle = GLES20.glGetUniformLocation(this.programHandle, "frequencyRangeBlur");
    }

    @Override // p149l.xj10, p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        setWidth(getWidth());
        setHeight(getHeight());
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        this.widthOffset = 1.0f / getWidth();
        this.heightOffset = 1.0f / getHeight();
        pjw pjwVar = this.mmcvInfo;
        GLES20.glUniform3f(this.blurAlphaHandle, (pjwVar == null || pjwVar.m169950n() <= 0) ? this.smoothLevel : this.bgBlur, 0.0f, 0.0f);
        GLES20.glUniform1f(this.widthOffsetHandle, this.widthOffset);
        GLES20.glUniform1f(this.heightOffsetHandle, this.heightOffset);
        GLES20.glUniform1f(this.sharpenHandle, 0.2f);
        GLES20.glUniform4f(this.freqRangeValueHandle, 0.2f, 0.5f, 0.9f, 0.9f);
        GLES20.glUniform4f(this.freqRangeBlurHandle, 1.0f, 0.9f, 0.5f, 0.08f);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
    }

    public void setSmoothLevel(float f) {
        synchronized (getLockObject()) {
            this.smoothLevel = f;
            this.bgBlur = Math.min(f, 0.3f);
        }
    }
}

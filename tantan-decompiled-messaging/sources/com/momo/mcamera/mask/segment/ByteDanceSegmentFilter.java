package com.momo.mcamera.mask.segment;

import android.opengl.GLES20;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import java.nio.ByteBuffer;
import p149l.mcj;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class ByteDanceSegmentFilter extends AbsSegmentFilter {
    private static final String UNIFORM_TEXTURE_ALPHA = "inputImageTexture2";
    protected int alphaHandler;
    protected int alphaTexture = 0;
    protected pjw mmcvInfo;
    private int notSampleHandler;

    public static int byteToLuminanceTexture(byte[] bArr, int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, ByteBuffer.wrap(bArr));
        return iArr[0];
    }

    public static int byteToLuminanceTextureBytextureId(int i, byte[] bArr, int i2, int i3) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, ByteBuffer.wrap(bArr));
        return i;
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
        super.destroy();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nuniform float notSampler;\nvoid main(){\n   vec4 whiteColor = vec4(1.0, 1.0, 1.0, 1.0);\n   vec4 colorAlpha = texture2D(inputImageTexture2, vec2(textureCoordinate.x, 1.0 - textureCoordinate.y));\n   gl_FragColor = mix(colorAlpha, whiteColor, notSampler);\n}\n";
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.alphaHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXTURE_ALPHA);
        this.notSampleHandler = GLES20.glGetUniformLocation(this.programHandle, "notSampler");
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        super.newTextureReady(i, this, z);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        processSegment();
    }

    public void processSegment() {
        byte[] bArr;
        pjw pjwVar = this.mmcvInfo;
        if (pjwVar == null || (bArr = pjwVar.f149900g) == null) {
            GLES20.glUniform1f(this.notSampleHandler, 1.0f);
            return;
        }
        int iM169949m = pjwVar.m169949m();
        int iM169956t = this.mmcvInfo.m169956t();
        pjw pjwVar2 = this.mmcvInfo;
        PortraitMatting.MattingMask mattingMaskProcess = ByteDanceSegmentHelper.process(bArr, iM169949m, iM169956t, pjwVar2.f149897d, pjwVar2.f149894a);
        if (mattingMaskProcess == null || mattingMaskProcess.getBuffer() == null || mattingMaskProcess.getWidth() <= 0 || mattingMaskProcess.getHeight() <= 0) {
            GLES20.glUniform1f(this.notSampleHandler, 1.0f);
            return;
        }
        GLES20.glActiveTexture(33987);
        int i = this.alphaTexture;
        if (i == 0) {
            this.alphaTexture = byteToLuminanceTexture(mattingMaskProcess.getBuffer(), mattingMaskProcess.getWidth(), mattingMaskProcess.getHeight());
        } else {
            byteToLuminanceTextureBytextureId(i, mattingMaskProcess.getBuffer(), mattingMaskProcess.getWidth(), mattingMaskProcess.getHeight());
        }
        GLES20.glUniform1i(this.alphaHandler, 3);
        GLES20.glUniform1f(this.notSampleHandler, 0.0f);
    }

    @Override // com.momo.mcamera.mask.segment.AbsSegmentFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mmcvInfo = pjwVar;
    }
}

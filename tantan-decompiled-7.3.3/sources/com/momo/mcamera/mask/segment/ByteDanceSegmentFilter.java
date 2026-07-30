package com.momo.mcamera.mask.segment;

import android.opengl.GLES20;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import java.nio.ByteBuffer;
import p153l.gfj;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class ByteDanceSegmentFilter extends AbsSegmentFilter {
    private static final String UNIFORM_TEXTURE_ALPHA = "inputImageTexture2";
    protected int alphaHandler;
    protected int alphaTexture = 0;
    protected omw mmcvInfo;
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

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
        super.destroy();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nuniform float notSampler;\nvoid main(){\n   vec4 whiteColor = vec4(1.0, 1.0, 1.0, 1.0);\n   vec4 colorAlpha = texture2D(inputImageTexture2, vec2(textureCoordinate.x, 1.0 - textureCoordinate.y));\n   gl_FragColor = mix(colorAlpha, whiteColor, notSampler);\n}\n";
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        int i = this.alphaTexture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.alphaTexture = 0;
        }
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.alphaHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXTURE_ALPHA);
        this.notSampleHandler = GLES20.glGetUniformLocation(this.programHandle, "notSampler");
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        super.newTextureReady(i, this, z);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        processSegment();
    }

    public void processSegment() {
        byte[] bArr;
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || (bArr = omwVar.f148020g) == null) {
            GLES20.glUniform1f(this.notSampleHandler, 1.0f);
            return;
        }
        int iM168298m = omwVar.m168298m();
        int iM168305t = this.mmcvInfo.m168305t();
        omw omwVar2 = this.mmcvInfo;
        PortraitMatting.MattingMask mattingMaskProcess = ByteDanceSegmentHelper.process(bArr, iM168298m, iM168305t, omwVar2.f148017d, omwVar2.f148014a);
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

    @Override // com.momo.mcamera.mask.segment.AbsSegmentFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        this.mmcvInfo = omwVar;
    }
}

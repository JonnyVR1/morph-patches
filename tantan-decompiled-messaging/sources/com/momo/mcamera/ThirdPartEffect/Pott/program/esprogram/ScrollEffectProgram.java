package com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram;

import android.opengl.GLES20;
import p149l.n23;

/* JADX INFO: loaded from: classes6.dex */
public class ScrollEffectProgram extends n23 {
    public static final String UNIFORM_TEXTURE1 = "inputImageTexture1";
    public float texturedVerticalOffset = 0.0f;
    public float texturedHorrizonOffset = 0.0f;
    private int texOffsetHandle = 0;
    private int textureHandle1 = 0;

    @Override // p149l.n23, p149l.zs2
    public String getSubFrameShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\n uniform vec2 texOffset;varying vec2 textureCoordinate;\nvoid main(){\n vec2 newCoord = textureCoordinate+ texOffset; if(newCoord.y >= 1.0){  newCoord.y = newCoord.y - 1.0;   gl_FragColor = texture2D(inputImageTexture1, newCoord);\n }else{   gl_FragColor = texture2D(inputImageTexture0, newCoord);\n }}\n";
    }

    @Override // p149l.n23, p149l.zs2
    public void initShaderHandles() {
        super.initShaderHandles();
        this.texOffsetHandle = GLES20.glGetUniformLocation(this.programHandle, "texOffset");
        this.textureHandle1 = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
    }

    @Override // p149l.n23, p149l.zs2
    public synchronized void passShaderValues(int[] iArr) {
        try {
            super.passShaderValues(iArr);
            GLES20.glUniform2f(this.texOffsetHandle, this.texturedHorrizonOffset, this.texturedVerticalOffset);
            GLES20.glActiveTexture(33985);
            if (iArr.length >= 2) {
                GLES20.glBindTexture(3553, iArr[1]);
            } else {
                GLES20.glBindTexture(3553, iArr[0]);
            }
            GLES20.glUniform1i(this.textureHandle1, 1);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setTexturedHorrizonOffset(float f) {
        this.texturedHorrizonOffset = f;
    }

    public void setTexturedVerticalOffset(float f) {
        this.texturedVerticalOffset = f;
    }
}

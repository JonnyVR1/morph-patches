package com.tencent.liteav.basic.p093c;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14179i extends C14178h {

    /* JADX INFO: renamed from: r */
    public boolean f59054r;

    /* JADX INFO: renamed from: s */
    private float[] f59055s;

    /* JADX INFO: renamed from: t */
    private int f59056t;

    public C14179i() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59055s = new float[16];
        this.f59054r = false;
        this.f59030o = true;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83972a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f59016a);
        m83996k();
        if (!m83998m() || this.f59055s == null) {
            return;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.f59017b, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f59017b);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f59019d, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f59019d);
        GLES20.glUniformMatrix4fv(this.f59056t, 1, false, this.f59055s, 0);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f59018c, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f59017b);
        GLES20.glDisableVertexAttribArray(this.f59019d);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        this.f59056t = GLES20.glGetUniformLocation(this.f59016a, "textureTransform");
        return zMo83986b && GLES20.glGetError() == 0;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83977a(float[] fArr) {
        this.f59055s = fArr;
    }
}

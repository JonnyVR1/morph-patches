package com.tencent.liteav.basic.p088c;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14016i extends C14015h {

    /* JADX INFO: renamed from: r */
    public boolean f58206r;

    /* JADX INFO: renamed from: s */
    private float[] f58207s;

    /* JADX INFO: renamed from: t */
    private int f58208t;

    public C14016i() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58207s = new float[16];
        this.f58206r = false;
        this.f58182o = true;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82789a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f58168a);
        m82813k();
        if (!m82815m() || this.f58207s == null) {
            return;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.f58169b, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f58169b);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f58171d, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f58171d);
        GLES20.glUniformMatrix4fv(this.f58208t, 1, false, this.f58207s, 0);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(this.f58170c, 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f58169b);
        GLES20.glDisableVertexAttribArray(this.f58171d);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        this.f58208t = GLES20.glGetUniformLocation(this.f58168a, "textureTransform");
        return zMo82803b && GLES20.glGetError() == 0;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82794a(float[] fArr) {
        this.f58207s = fArr;
    }
}

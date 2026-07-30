package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14019l;
import com.tencent.liteav.basic.p088c.EnumC14018k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.t */
/* JADX INFO: loaded from: classes2.dex */
public class C14092t extends C14015h {

    /* JADX INFO: renamed from: r */
    public int f58782r;

    /* JADX INFO: renamed from: s */
    public int f58783s;

    /* JADX INFO: renamed from: t */
    public int f58784t;

    /* JADX INFO: renamed from: u */
    public int f58785u;

    /* JADX INFO: renamed from: v */
    public int f58786v;

    /* JADX INFO: renamed from: w */
    public int f58787w;

    /* JADX INFO: renamed from: x */
    private ByteBuffer f58788x;

    /* JADX INFO: renamed from: y */
    private ByteBuffer f58789y;

    public C14092t(String str, String str2) {
        super(str, str2);
        this.f58784t = -1;
        this.f58787w = -1;
        m83155a(EnumC14018k.NORMAL, false, true);
    }

    /* JADX INFO: renamed from: a */
    public void m83155a(EnumC14018k enumC14018k, boolean z, boolean z2) {
        float[] fArrM82837a = C14019l.m82837a(enumC14018k, z, z2);
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrM82837a);
        floatBufferAsFloatBuffer.flip();
        this.f58788x = byteBufferOrder;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferOrder2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArrM82837a);
        floatBufferAsFloatBuffer2.flip();
        this.f58789y = byteBufferOrder2;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        GLES20.glUseProgram(m82818p());
        this.f58782r = GLES20.glGetAttribLocation(m82818p(), "inputTextureCoordinate2");
        this.f58785u = GLES20.glGetAttribLocation(m82818p(), "inputTextureCoordinate3");
        this.f58783s = GLES20.glGetUniformLocation(m82818p(), "inputImageTexture2");
        this.f58786v = GLES20.glGetUniformLocation(m82818p(), "inputImageTexture3");
        GLES20.glEnableVertexAttribArray(this.f58782r);
        GLES20.glEnableVertexAttribArray(this.f58785u);
        return zMo82803b;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: i */
    public void mo82811i() {
        GLES20.glEnableVertexAttribArray(this.f58782r);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.f58784t);
        GLES20.glUniform1i(this.f58783s, 3);
        this.f58788x.position(0);
        GLES20.glVertexAttribPointer(this.f58782r, 2, 5126, false, 0, (Buffer) this.f58788x);
        GLES20.glEnableVertexAttribArray(this.f58785u);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, this.f58787w);
        GLES20.glUniform1i(this.f58786v, 4);
        this.f58789y.position(0);
        GLES20.glVertexAttribPointer(this.f58785u, 2, 5126, false, 0, (Buffer) this.f58789y);
    }

    public C14092t(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", str);
        m83155a(EnumC14018k.NORMAL, false, true);
    }

    /* JADX INFO: renamed from: a */
    public int m83154a(int i, int i2, int i3, int i4, int i5) {
        this.f58784t = i2;
        this.f58787w = i3;
        return super.mo82784a(i, i4, i5);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public int mo82784a(int i, int i2, int i3) {
        return m83154a(i, i2, i3, this.f58180m, this.f58181n);
    }
}

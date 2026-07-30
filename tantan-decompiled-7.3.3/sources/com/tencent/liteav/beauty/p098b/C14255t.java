package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14182l;
import com.tencent.liteav.basic.p093c.EnumC14181k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.t */
/* JADX INFO: loaded from: classes2.dex */
public class C14255t extends C14178h {

    /* JADX INFO: renamed from: r */
    public int f59630r;

    /* JADX INFO: renamed from: s */
    public int f59631s;

    /* JADX INFO: renamed from: t */
    public int f59632t;

    /* JADX INFO: renamed from: u */
    public int f59633u;

    /* JADX INFO: renamed from: v */
    public int f59634v;

    /* JADX INFO: renamed from: w */
    public int f59635w;

    /* JADX INFO: renamed from: x */
    private ByteBuffer f59636x;

    /* JADX INFO: renamed from: y */
    private ByteBuffer f59637y;

    public C14255t(String str, String str2) {
        super(str, str2);
        this.f59632t = -1;
        this.f59635w = -1;
        m84338a(EnumC14181k.NORMAL, false, true);
    }

    /* JADX INFO: renamed from: a */
    public void m84338a(EnumC14181k enumC14181k, boolean z, boolean z2) {
        float[] fArrM84020a = C14182l.m84020a(enumC14181k, z, z2);
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrM84020a);
        floatBufferAsFloatBuffer.flip();
        this.f59636x = byteBufferOrder;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferOrder2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArrM84020a);
        floatBufferAsFloatBuffer2.flip();
        this.f59637y = byteBufferOrder2;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        GLES20.glUseProgram(m84001p());
        this.f59630r = GLES20.glGetAttribLocation(m84001p(), "inputTextureCoordinate2");
        this.f59633u = GLES20.glGetAttribLocation(m84001p(), "inputTextureCoordinate3");
        this.f59631s = GLES20.glGetUniformLocation(m84001p(), "inputImageTexture2");
        this.f59634v = GLES20.glGetUniformLocation(m84001p(), "inputImageTexture3");
        GLES20.glEnableVertexAttribArray(this.f59630r);
        GLES20.glEnableVertexAttribArray(this.f59633u);
        return zMo83986b;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: i */
    public void mo83994i() {
        GLES20.glEnableVertexAttribArray(this.f59630r);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.f59632t);
        GLES20.glUniform1i(this.f59631s, 3);
        this.f59636x.position(0);
        GLES20.glVertexAttribPointer(this.f59630r, 2, 5126, false, 0, (Buffer) this.f59636x);
        GLES20.glEnableVertexAttribArray(this.f59633u);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, this.f59635w);
        GLES20.glUniform1i(this.f59634v, 4);
        this.f59637y.position(0);
        GLES20.glVertexAttribPointer(this.f59633u, 2, 5126, false, 0, (Buffer) this.f59637y);
    }

    public C14255t(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", str);
        m84338a(EnumC14181k.NORMAL, false, true);
    }

    /* JADX INFO: renamed from: a */
    public int m84337a(int i, int i2, int i3, int i4, int i5) {
        this.f59632t = i2;
        this.f59635w = i3;
        return super.mo83967a(i, i4, i5);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public int mo83967a(int i, int i2, int i3) {
        return m84337a(i, i2, i3, this.f59028m, this.f59029n);
    }
}

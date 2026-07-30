package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14019l;
import com.tencent.liteav.basic.p088c.EnumC14018k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.u */
/* JADX INFO: loaded from: classes2.dex */
public class C14093u extends C14015h {

    /* JADX INFO: renamed from: r */
    private ByteBuffer f58790r;

    /* JADX INFO: renamed from: u */
    public int f58791u;

    /* JADX INFO: renamed from: v */
    public int f58792v;

    /* JADX INFO: renamed from: w */
    public int f58793w;

    public C14093u(String str, String str2) {
        super(str, str2);
        this.f58791u = -1;
        this.f58793w = -1;
        m83157a(EnumC14018k.NORMAL, false, true);
    }

    /* JADX INFO: renamed from: a */
    public void m83157a(EnumC14018k enumC14018k, boolean z, boolean z2) {
        float[] fArrM82837a = C14019l.m82837a(enumC14018k, z, z2);
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrM82837a);
        floatBufferAsFloatBuffer.flip();
        this.f58790r = byteBufferOrder;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        if (zMo82803b) {
            this.f58791u = GLES20.glGetAttribLocation(m82818p(), "inputTextureCoordinate2");
            this.f58792v = GLES20.glGetUniformLocation(m82818p(), "inputImageTexture2");
            GLES20.glEnableVertexAttribArray(this.f58791u);
        }
        return zMo82803b;
    }

    /* JADX INFO: renamed from: c */
    public int m83158c(int i, int i2) {
        this.f58793w = i2;
        return mo82784a(i, this.f58180m, this.f58181n);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: i */
    public void mo82811i() {
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.f58793w);
        GLES20.glUniform1i(this.f58792v, 3);
        int i = this.f58791u;
        if (i != -1) {
            GLES20.glEnableVertexAttribArray(i);
            this.f58790r.position(0);
            GLES20.glVertexAttribPointer(this.f58791u, 2, 5126, false, 0, (Buffer) this.f58790r);
        }
    }

    public C14093u(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", str);
    }

    /* JADX INFO: renamed from: a */
    public int m83156a(int i, int i2, int i3, int i4) {
        this.f58793w = i2;
        return mo82784a(i, i3, i4);
    }
}

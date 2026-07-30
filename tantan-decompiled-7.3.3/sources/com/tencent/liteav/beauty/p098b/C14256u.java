package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14182l;
import com.tencent.liteav.basic.p093c.EnumC14181k;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.u */
/* JADX INFO: loaded from: classes2.dex */
public class C14256u extends C14178h {

    /* JADX INFO: renamed from: r */
    private ByteBuffer f59638r;

    /* JADX INFO: renamed from: u */
    public int f59639u;

    /* JADX INFO: renamed from: v */
    public int f59640v;

    /* JADX INFO: renamed from: w */
    public int f59641w;

    public C14256u(String str, String str2) {
        super(str, str2);
        this.f59639u = -1;
        this.f59641w = -1;
        m84340a(EnumC14181k.NORMAL, false, true);
    }

    /* JADX INFO: renamed from: a */
    public void m84340a(EnumC14181k enumC14181k, boolean z, boolean z2) {
        float[] fArrM84020a = C14182l.m84020a(enumC14181k, z, z2);
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrM84020a);
        floatBufferAsFloatBuffer.flip();
        this.f59638r = byteBufferOrder;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        if (zMo83986b) {
            this.f59639u = GLES20.glGetAttribLocation(m84001p(), "inputTextureCoordinate2");
            this.f59640v = GLES20.glGetUniformLocation(m84001p(), "inputImageTexture2");
            GLES20.glEnableVertexAttribArray(this.f59639u);
        }
        return zMo83986b;
    }

    /* JADX INFO: renamed from: c */
    public int m84341c(int i, int i2) {
        this.f59641w = i2;
        return mo83967a(i, this.f59028m, this.f59029n);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: i */
    public void mo83994i() {
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.f59641w);
        GLES20.glUniform1i(this.f59640v, 3);
        int i = this.f59639u;
        if (i != -1) {
            GLES20.glEnableVertexAttribArray(i);
            this.f59638r.position(0);
            GLES20.glVertexAttribPointer(this.f59639u, 2, 5126, false, 0, (Buffer) this.f59638r);
        }
    }

    public C14256u(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", str);
    }

    /* JADX INFO: renamed from: a */
    public int m84339a(int i, int i2, int i3, int i4) {
        this.f59641w = i2;
        return mo83967a(i, i3, i4);
    }
}

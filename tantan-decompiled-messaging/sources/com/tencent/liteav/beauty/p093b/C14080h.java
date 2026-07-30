package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14080h extends C14015h {

    /* JADX INFO: renamed from: r */
    private int f58715r;

    /* JADX INFO: renamed from: s */
    private float f58716s;

    public C14080h(float f) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }");
        this.f58716s = f;
    }

    /* JADX INFO: renamed from: a */
    public void m83127a(float f) {
        this.f58716s = f;
        m82785a(this.f58715r, f);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        this.f58715r = GLES20.glGetUniformLocation(m82818p(), "gamma");
        return zMo82803b;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: c */
    public void mo82804c() {
        super.mo82804c();
        m83127a(this.f58716s);
    }

    public C14080h() {
        this(1.2f);
    }
}

package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14243h extends C14178h {

    /* JADX INFO: renamed from: r */
    private int f59563r;

    /* JADX INFO: renamed from: s */
    private float f59564s;

    public C14243h(float f) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float gamma;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n }");
        this.f59564s = f;
    }

    /* JADX INFO: renamed from: a */
    public void m84310a(float f) {
        this.f59564s = f;
        m83968a(this.f59563r, f);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        this.f59563r = GLES20.glGetUniformLocation(m84001p(), "gamma");
        return zMo83986b;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: c */
    public void mo83987c() {
        super.mo83987c();
        m84310a(this.f59564s);
    }

    public C14243h() {
        this(1.2f);
    }
}

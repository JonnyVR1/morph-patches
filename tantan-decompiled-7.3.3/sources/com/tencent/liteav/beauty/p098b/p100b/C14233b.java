package com.tencent.liteav.beauty.p098b.p100b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14233b extends C14178h {

    /* JADX INFO: renamed from: r */
    private int f59494r;

    /* JADX INFO: renamed from: s */
    private int f59495s;

    /* JADX INFO: renamed from: t */
    private float[] f59496t;

    /* JADX INFO: renamed from: u */
    private String f59497u;

    public C14233b() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59494r = -1;
        this.f59495s = -1;
        this.f59496t = new float[4];
        this.f59497u = "Beauty3Filter";
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(14);
        this.f59016a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram == 0 || !mo83986b()) {
            this.f59022g = false;
        } else {
            this.f59022g = true;
        }
        mo83987c();
        return this.f59022g;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        this.f59494r = GLES20.glGetUniformLocation(m84001p(), "singleStepOffset");
        this.f59495s = GLES20.glGetUniformLocation(m84001p(), "beautyParams");
        m84290a(5.0f);
        return zMo83986b;
    }

    /* JADX INFO: renamed from: c */
    public void m84293c(int i, int i2) {
        m83973a(this.f59494r, new float[]{2.0f / i, 2.0f / i2});
    }

    /* JADX INFO: renamed from: c */
    public void m84292c(float f) {
        float[] fArr = this.f59496t;
        fArr[2] = f;
        m84289b(fArr);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        m84293c(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m84290a(float f) {
        float[] fArr = this.f59496t;
        fArr[0] = f;
        m84289b(fArr);
    }

    /* JADX INFO: renamed from: b */
    public void m84291b(float f) {
        float[] fArr = this.f59496t;
        fArr[1] = f;
        m84289b(fArr);
    }

    /* JADX INFO: renamed from: b */
    private void m84289b(float[] fArr) {
        m83988c(this.f59495s, fArr);
    }
}

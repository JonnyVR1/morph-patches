package com.tencent.liteav.beauty.p093b.p095b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14070b extends C14015h {

    /* JADX INFO: renamed from: r */
    private int f58646r;

    /* JADX INFO: renamed from: s */
    private int f58647s;

    /* JADX INFO: renamed from: t */
    private float[] f58648t;

    /* JADX INFO: renamed from: u */
    private String f58649u;

    public C14070b() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58646r = -1;
        this.f58647s = -1;
        this.f58648t = new float[4];
        this.f58649u = "Beauty3Filter";
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(14);
        this.f58168a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram == 0 || !mo82803b()) {
            this.f58174g = false;
        } else {
            this.f58174g = true;
        }
        mo82804c();
        return this.f58174g;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        this.f58646r = GLES20.glGetUniformLocation(m82818p(), "singleStepOffset");
        this.f58647s = GLES20.glGetUniformLocation(m82818p(), "beautyParams");
        m83107a(5.0f);
        return zMo82803b;
    }

    /* JADX INFO: renamed from: c */
    public void m83110c(int i, int i2) {
        m82790a(this.f58646r, new float[]{2.0f / i, 2.0f / i2});
    }

    /* JADX INFO: renamed from: c */
    public void m83109c(float f) {
        float[] fArr = this.f58648t;
        fArr[2] = f;
        m83106b(fArr);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        m83110c(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m83107a(float f) {
        float[] fArr = this.f58648t;
        fArr[0] = f;
        m83106b(fArr);
    }

    /* JADX INFO: renamed from: b */
    public void m83108b(float f) {
        float[] fArr = this.f58648t;
        fArr[1] = f;
        m83106b(fArr);
    }

    /* JADX INFO: renamed from: b */
    private void m83106b(float[] fArr) {
        m82805c(this.f58647s, fArr);
    }
}

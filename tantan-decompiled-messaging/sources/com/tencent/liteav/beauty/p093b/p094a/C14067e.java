package com.tencent.liteav.beauty.p093b.p094a;

import android.opengl.GLES20;
import android.os.Build;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.p093b.C14093u;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14067e extends C14093u {

    /* JADX INFO: renamed from: A */
    private String f58632A;

    /* JADX INFO: renamed from: r */
    private int f58633r;

    /* JADX INFO: renamed from: s */
    private int f58634s;

    /* JADX INFO: renamed from: t */
    private int f58635t;

    /* JADX INFO: renamed from: x */
    private int f58636x;

    /* JADX INFO: renamed from: y */
    private float f58637y;

    /* JADX INFO: renamed from: z */
    private float f58638z;

    public C14067e() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58633r = -1;
        this.f58634s = -1;
        this.f58635t = -1;
        this.f58636x = -1;
        this.f58637y = 2.0f;
        this.f58638z = 0.5f;
        this.f58632A = "SmoothVertical";
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        if (Build.BRAND.equals("samsung") && Build.MODEL.equals("GT-I9500") && Build.VERSION.RELEASE.equals("4.3")) {
            NativeLoad.getInstance();
            this.f58168a = NativeLoad.nativeLoadGLProgram(15);
        } else {
            NativeLoad.getInstance();
            this.f58168a = NativeLoad.nativeLoadGLProgram(5);
        }
        if (this.f58168a == 0 || !mo82803b()) {
            this.f58174g = false;
        } else {
            this.f58174g = true;
        }
        mo82804c();
        return this.f58174g;
    }

    @Override // com.tencent.liteav.beauty.p093b.C14093u, com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        super.mo82803b();
        m83103q();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m83103q() {
        this.f58633r = GLES20.glGetUniformLocation(m82818p(), "texelWidthOffset");
        this.f58634s = GLES20.glGetUniformLocation(m82818p(), "texelHeightOffset");
        this.f58635t = GLES20.glGetUniformLocation(m82818p(), "smoothDegree");
    }

    /* JADX INFO: renamed from: a */
    public void m83102a(float f) {
        this.f58638z = f;
        TXCLog.m82969i(this.f58632A, "setBeautyLevel " + f);
        m82785a(this.f58635t, f);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        if (i > i2) {
            if (i2 < 540) {
                this.f58637y = 2.0f;
            } else {
                this.f58637y = 4.0f;
            }
        } else if (i < 540) {
            this.f58637y = 2.0f;
        } else {
            this.f58637y = 4.0f;
        }
        TXCLog.m82969i(this.f58632A, "m_textureRation " + this.f58637y);
        m82785a(this.f58633r, this.f58637y / ((float) i));
        m82785a(this.f58634s, this.f58637y / ((float) i2));
    }
}

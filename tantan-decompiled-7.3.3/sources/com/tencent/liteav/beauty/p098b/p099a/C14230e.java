package com.tencent.liteav.beauty.p098b.p099a;

import android.opengl.GLES20;
import android.os.Build;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.p098b.C14256u;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.e */
/* JADX INFO: loaded from: classes2.dex */
public class C14230e extends C14256u {

    /* JADX INFO: renamed from: A */
    private String f59480A;

    /* JADX INFO: renamed from: r */
    private int f59481r;

    /* JADX INFO: renamed from: s */
    private int f59482s;

    /* JADX INFO: renamed from: t */
    private int f59483t;

    /* JADX INFO: renamed from: x */
    private int f59484x;

    /* JADX INFO: renamed from: y */
    private float f59485y;

    /* JADX INFO: renamed from: z */
    private float f59486z;

    public C14230e() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59481r = -1;
        this.f59482s = -1;
        this.f59483t = -1;
        this.f59484x = -1;
        this.f59485y = 2.0f;
        this.f59486z = 0.5f;
        this.f59480A = "SmoothVertical";
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        if (Build.BRAND.equals("samsung") && Build.MODEL.equals("GT-I9500") && Build.VERSION.RELEASE.equals("4.3")) {
            NativeLoad.getInstance();
            this.f59016a = NativeLoad.nativeLoadGLProgram(15);
        } else {
            NativeLoad.getInstance();
            this.f59016a = NativeLoad.nativeLoadGLProgram(5);
        }
        if (this.f59016a == 0 || !mo83986b()) {
            this.f59022g = false;
        } else {
            this.f59022g = true;
        }
        mo83987c();
        return this.f59022g;
    }

    @Override // com.tencent.liteav.beauty.p098b.C14256u, com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        super.mo83986b();
        m84286q();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m84286q() {
        this.f59481r = GLES20.glGetUniformLocation(m84001p(), "texelWidthOffset");
        this.f59482s = GLES20.glGetUniformLocation(m84001p(), "texelHeightOffset");
        this.f59483t = GLES20.glGetUniformLocation(m84001p(), "smoothDegree");
    }

    /* JADX INFO: renamed from: a */
    public void m84285a(float f) {
        this.f59486z = f;
        TXCLog.m84152i(this.f59480A, "setBeautyLevel " + f);
        m83968a(this.f59483t, f);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        if (i > i2) {
            if (i2 < 540) {
                this.f59485y = 2.0f;
            } else {
                this.f59485y = 4.0f;
            }
        } else if (i < 540) {
            this.f59485y = 2.0f;
        } else {
            this.f59485y = 4.0f;
        }
        TXCLog.m84152i(this.f59480A, "m_textureRation " + this.f59485y);
        m83968a(this.f59481r, this.f59485y / ((float) i));
        m83968a(this.f59482s, this.f59485y / ((float) i2));
    }
}

package com.tencent.liteav.beauty.p098b.p099a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.p098b.C14256u;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14227b extends C14256u {

    /* JADX INFO: renamed from: r */
    private int f59472r;

    /* JADX INFO: renamed from: s */
    private int f59473s;

    /* JADX INFO: renamed from: t */
    private int f59474t;

    /* JADX INFO: renamed from: x */
    private final String f59475x;

    public C14227b() {
        super("varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59472r = -1;
        this.f59473s = -1;
        this.f59474t = -1;
        this.f59475x = "BeautyBlend";
    }

    /* JADX INFO: renamed from: q */
    private void m84281q() {
        this.f59473s = GLES20.glGetUniformLocation(m84001p(), "whiteDegree");
        this.f59472r = GLES20.glGetUniformLocation(m84001p(), "contrast");
        this.f59474t = GLES20.glGetUniformLocation(m84001p(), "ruddyDegree");
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(12);
        this.f59016a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram == 0 || !mo83986b()) {
            this.f59022g = false;
        } else {
            this.f59022g = true;
        }
        mo83987c();
        return this.f59022g;
    }

    /* JADX INFO: renamed from: b */
    public void m84283b(float f) {
        m83968a(this.f59474t, f / 2.0f);
    }

    @Override // com.tencent.liteav.beauty.p098b.C14256u, com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        super.mo83986b();
        m84281q();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m84282a(float f) {
        TXCLog.m84152i("BeautyBlend", "setBrightLevel " + f);
        m83968a(this.f59473s, f);
    }
}

package com.tencent.liteav.beauty.p093b.p094a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.p093b.C14093u;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14064b extends C14093u {

    /* JADX INFO: renamed from: r */
    private int f58624r;

    /* JADX INFO: renamed from: s */
    private int f58625s;

    /* JADX INFO: renamed from: t */
    private int f58626t;

    /* JADX INFO: renamed from: x */
    private final String f58627x;

    public C14064b() {
        super("varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58624r = -1;
        this.f58625s = -1;
        this.f58626t = -1;
        this.f58627x = "BeautyBlend";
    }

    /* JADX INFO: renamed from: q */
    private void m83098q() {
        this.f58625s = GLES20.glGetUniformLocation(m82818p(), "whiteDegree");
        this.f58624r = GLES20.glGetUniformLocation(m82818p(), "contrast");
        this.f58626t = GLES20.glGetUniformLocation(m82818p(), "ruddyDegree");
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(12);
        this.f58168a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram == 0 || !mo82803b()) {
            this.f58174g = false;
        } else {
            this.f58174g = true;
        }
        mo82804c();
        return this.f58174g;
    }

    /* JADX INFO: renamed from: b */
    public void m83100b(float f) {
        m82785a(this.f58626t, f / 2.0f);
    }

    @Override // com.tencent.liteav.beauty.p093b.C14093u, com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        super.mo82803b();
        m83098q();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m83099a(float f) {
        TXCLog.m82969i("BeautyBlend", "setBrightLevel " + f);
        m82785a(this.f58625s, f);
    }
}

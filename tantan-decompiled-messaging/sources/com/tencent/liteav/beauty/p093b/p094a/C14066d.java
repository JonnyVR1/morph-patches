package com.tencent.liteav.beauty.p093b.p094a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14066d extends C14015h {

    /* JADX INFO: renamed from: r */
    private int f58628r;

    /* JADX INFO: renamed from: s */
    private int f58629s;

    /* JADX INFO: renamed from: t */
    private float f58630t;

    /* JADX INFO: renamed from: u */
    private String f58631u;

    public C14066d() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58628r = -1;
        this.f58629s = -1;
        this.f58630t = 4.0f;
        this.f58631u = "SmoothHorizontal";
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        super.mo82786a(i, i2);
        if (i > i2) {
            if (i2 < 540) {
                this.f58630t = 2.0f;
            } else {
                this.f58630t = 4.0f;
            }
        } else if (i < 540) {
            this.f58630t = 2.0f;
        } else {
            this.f58630t = 4.0f;
        }
        TXCLog.m82969i(this.f58631u, "m_textureRation " + this.f58630t);
        m82785a(this.f58628r, this.f58630t / ((float) i));
        m82785a(this.f58629s, this.f58630t / ((float) i2));
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        super.mo82803b();
        m83101q();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m83101q() {
        this.f58628r = GLES20.glGetUniformLocation(m82818p(), "texelWidthOffset");
        this.f58629s = GLES20.glGetUniformLocation(m82818p(), "texelHeightOffset");
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(13);
        this.f58168a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram != 0 && mo82803b()) {
            this.f58174g = true;
        } else {
            this.f58174g = false;
        }
        mo82804c();
        return this.f58174g;
    }
}

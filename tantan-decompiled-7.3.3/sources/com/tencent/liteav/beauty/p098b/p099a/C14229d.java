package com.tencent.liteav.beauty.p098b.p099a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.a.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14229d extends C14178h {

    /* JADX INFO: renamed from: r */
    private int f59476r;

    /* JADX INFO: renamed from: s */
    private int f59477s;

    /* JADX INFO: renamed from: t */
    private float f59478t;

    /* JADX INFO: renamed from: u */
    private String f59479u;

    public C14229d() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59476r = -1;
        this.f59477s = -1;
        this.f59478t = 4.0f;
        this.f59479u = "SmoothHorizontal";
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        if (i > i2) {
            if (i2 < 540) {
                this.f59478t = 2.0f;
            } else {
                this.f59478t = 4.0f;
            }
        } else if (i < 540) {
            this.f59478t = 2.0f;
        } else {
            this.f59478t = 4.0f;
        }
        TXCLog.m84152i(this.f59479u, "m_textureRation " + this.f59478t);
        m83968a(this.f59476r, this.f59478t / ((float) i));
        m83968a(this.f59477s, this.f59478t / ((float) i2));
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        super.mo83986b();
        m84284q();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m84284q() {
        this.f59476r = GLES20.glGetUniformLocation(m84001p(), "texelWidthOffset");
        this.f59477s = GLES20.glGetUniformLocation(m84001p(), "texelHeightOffset");
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        NativeLoad.getInstance();
        int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(13);
        this.f59016a = iNativeLoadGLProgram;
        if (iNativeLoadGLProgram != 0 && mo83986b()) {
            this.f59022g = true;
        } else {
            this.f59022g = false;
        }
        mo83987c();
        return this.f59022g;
    }
}

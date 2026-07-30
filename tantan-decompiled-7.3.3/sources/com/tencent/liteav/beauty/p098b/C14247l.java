package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14247l extends C14178h {

    /* JADX INFO: renamed from: r */
    private static String f59585r = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform int  bTransform;\nuniform mat4 textureTransform;\n\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n     gl_Position = position;\n    if (0 != bTransform){\n        textureCoordinate =  (textureTransform * inputTextureCoordinate).xy;\n    }else{\n        textureCoordinate = inputTextureCoordinate.xy;\n    }\n}\n";

    /* JADX INFO: renamed from: s */
    private int f59586s;

    /* JADX INFO: renamed from: t */
    private boolean f59587t;

    public C14247l(String str, String str2, boolean z) {
        super(str, str2, z);
        this.f59586s = -1;
        this.f59587t = false;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83977a(float[] fArr) {
        int i = this.f59586s;
        if (fArr != null) {
            m83983b(i, 1);
        } else {
            m83983b(i, 0);
        }
        super.mo83977a(fArr);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f59016a, "bTransform");
        this.f59586s = iGlGetUniformLocation;
        m83983b(iGlGetUniformLocation, 0);
        return zMo83986b;
    }

    /* JADX INFO: renamed from: c */
    public void m84322c(boolean z) {
        if (z != this.f59587t) {
            this.f59587t = z;
            m83993h();
        }
    }

    public C14247l() {
        this(f59585r, "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }
}

package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14084l extends C14015h {

    /* JADX INFO: renamed from: r */
    private static String f58737r = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform int  bTransform;\nuniform mat4 textureTransform;\n\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n     gl_Position = position;\n    if (0 != bTransform){\n        textureCoordinate =  (textureTransform * inputTextureCoordinate).xy;\n    }else{\n        textureCoordinate = inputTextureCoordinate.xy;\n    }\n}\n";

    /* JADX INFO: renamed from: s */
    private int f58738s;

    /* JADX INFO: renamed from: t */
    private boolean f58739t;

    public C14084l(String str, String str2, boolean z) {
        super(str, str2, z);
        this.f58738s = -1;
        this.f58739t = false;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82794a(float[] fArr) {
        int i = this.f58738s;
        if (fArr != null) {
            m82800b(i, 1);
        } else {
            m82800b(i, 0);
        }
        super.mo82794a(fArr);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f58168a, "bTransform");
        this.f58738s = iGlGetUniformLocation;
        m82800b(iGlGetUniformLocation, 0);
        return zMo82803b;
    }

    /* JADX INFO: renamed from: c */
    public void m83139c(boolean z) {
        if (z != this.f58739t) {
            this.f58739t = z;
            m82810h();
        }
    }

    public C14084l() {
        this(f58737r, "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", false);
    }
}

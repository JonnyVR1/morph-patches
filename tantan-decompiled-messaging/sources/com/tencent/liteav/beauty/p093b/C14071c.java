package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14071c extends C14068b {

    /* JADX INFO: renamed from: r */
    private static final String f58650r = "c";

    /* JADX INFO: renamed from: s */
    private C14078f f58652s;

    /* JADX INFO: renamed from: t */
    private a f58653t;

    /* JADX INFO: renamed from: u */
    private C14091s f58654u = null;

    /* JADX INFO: renamed from: v */
    private int f58655v = -1;

    /* JADX INFO: renamed from: w */
    private int f58656w = -1;

    /* JADX INFO: renamed from: x */
    private float f58657x = 0.0f;

    /* JADX INFO: renamed from: y */
    private float f58658y = 0.0f;

    /* JADX INFO: renamed from: z */
    private float f58659z = 0.0f;

    /* JADX INFO: renamed from: A */
    private float f58651A = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static float m83113b(float f) {
        if (f <= 1.0f) {
            return 0.1f;
        }
        double d = f;
        if (d < 2.5d) {
            f = m83112a((f - 1.0f) / 1.5f, 1.0f, 4.1f);
        } else if (f < 4.0f) {
            f = m83112a((f - 2.5f) / 1.5f, 4.1f, 5.6f);
        } else if (d < 5.5d) {
            f = m83112a((f - 4.0f) / 1.5f, 5.6f, 6.8f);
        } else if (d <= 7.0d) {
            f = m83112a((f - 5.5f) / 1.5f, 6.8f, 7.0f);
        }
        return f / 10.0f;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (this.f58655v == i && this.f58656w == i2) {
            return;
        }
        this.f58655v = i;
        this.f58656w = i2;
        mo83093c(i, i2);
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public boolean mo83093c(int i, int i2) {
        this.f58655v = i;
        this.f58656w = i2;
        if (this.f58652s == null) {
            C14078f c14078f = new C14078f();
            this.f58652s = c14078f;
            c14078f.m82793a(true);
            if (!this.f58652s.mo82796a()) {
                Log.e(f58650r, "mNewFaceFilter init Failed");
                return false;
            }
        }
        this.f58652s.mo82786a(this.f58655v, this.f58656w);
        if (this.f58653t == null) {
            a aVar = new a();
            this.f58653t = aVar;
            aVar.m82793a(true);
            if (!this.f58653t.mo82796a()) {
                Log.e(f58650r, "mBeautyCoreFilter init Failed");
                return false;
            }
        }
        this.f58653t.mo82786a(this.f58655v, this.f58656w);
        if (this.f58654u == null) {
            C14091s c14091s = new C14091s();
            this.f58654u = c14091s;
            c14091s.m82793a(true);
            if (!this.f58654u.mo82796a()) {
                Log.e(f58650r, "mSharpenessFilter init Failed");
                return false;
            }
        }
        this.f58654u.mo82786a(this.f58655v, this.f58656w);
        return true;
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: d */
    public void mo83094d(int i) {
        float f = i;
        this.f58658y = f;
        a aVar = this.f58653t;
        if (aVar != null) {
            aVar.m83115b(f);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        a aVar = this.f58653t;
        if (aVar != null) {
            aVar.mo82806d();
            this.f58653t = null;
        }
        C14078f c14078f = this.f58652s;
        if (c14078f != null) {
            c14078f.mo82806d();
            this.f58652s = null;
        }
        C14091s c14091s = this.f58654u;
        if (c14091s != null) {
            c14091s.mo82806d();
            this.f58654u = null;
        }
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: f */
    public void mo83096f(int i) {
        float f = i / 15.0f;
        if (Math.abs(this.f58651A - f) < 0.001d) {
            return;
        }
        this.f58651A = f;
        C14091s c14091s = this.f58654u;
        if (c14091s != null) {
            c14091s.m83153a(f);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c$a */
    public static class a extends C14092t {

        /* JADX INFO: renamed from: x */
        private int f58660x;

        /* JADX INFO: renamed from: y */
        private int f58661y;

        /* JADX INFO: renamed from: z */
        private int f58662z;

        public a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
            this.f58660x = -1;
            this.f58661y = -1;
            this.f58662z = -1;
        }

        @Override // com.tencent.liteav.beauty.p093b.C14092t, com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: a */
        public void mo82786a(int i, int i2) {
            if (this.f58173f == i2 && this.f58172e == i) {
                return;
            }
            super.mo82786a(i, i2);
            this.f58660x = GLES20.glGetUniformLocation(m82818p(), "smoothDegree");
            this.f58661y = GLES20.glGetUniformLocation(m82818p(), "brightDegree");
            this.f58662z = GLES20.glGetUniformLocation(m82818p(), "ruddyDegree");
        }

        /* JADX INFO: renamed from: b */
        public void m83115b(float f) {
            m82785a(this.f58661y, f / 3.0f);
        }

        /* JADX INFO: renamed from: c */
        public void m83116c(float f) {
            m82785a(this.f58662z, (f / 10.0f) / 2.0f);
        }

        @Override // com.tencent.liteav.beauty.p093b.C14092t, com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: b */
        public boolean mo82803b() {
            return super.mo82803b();
        }

        @Override // com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: a */
        public boolean mo82796a() {
            NativeLoad.getInstance();
            int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(1);
            this.f58168a = iNativeLoadGLProgram;
            if (iNativeLoadGLProgram != 0 && mo82803b()) {
                this.f58174g = true;
            } else {
                this.f58174g = false;
            }
            mo82804c();
            return this.f58174g;
        }

        /* JADX INFO: renamed from: a */
        public void m83114a(float f) {
            m82785a(this.f58660x, C14071c.m83113b(f));
        }
    }

    /* JADX INFO: renamed from: a */
    private static float m83112a(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: e */
    public void mo83095e(int i) {
        float f = i;
        this.f58659z = f;
        a aVar = this.f58653t;
        if (aVar != null) {
            aVar.m83116c(f);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        float f = this.f58657x;
        if (f > 0.0f || this.f58658y > 0.0f || this.f58659z > 0.0f) {
            i = this.f58653t.mo82784a(f != 0.0f ? this.f58652s.mo82798b(i) : i, i, i);
        }
        return this.f58651A > 0.0f ? this.f58654u.mo82798b(i) : i;
    }

    @Override // com.tencent.liteav.beauty.p093b.C14068b
    /* JADX INFO: renamed from: c */
    public void mo83092c(int i) {
        float f = i;
        this.f58657x = f;
        a aVar = this.f58653t;
        if (aVar != null) {
            aVar.m83114a(f);
        }
    }
}

package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import android.util.Log;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14234c extends C14231b {

    /* JADX INFO: renamed from: r */
    private static final String f59498r = "c";

    /* JADX INFO: renamed from: s */
    private C14241f f59500s;

    /* JADX INFO: renamed from: t */
    private a f59501t;

    /* JADX INFO: renamed from: u */
    private C14254s f59502u = null;

    /* JADX INFO: renamed from: v */
    private int f59503v = -1;

    /* JADX INFO: renamed from: w */
    private int f59504w = -1;

    /* JADX INFO: renamed from: x */
    private float f59505x = 0.0f;

    /* JADX INFO: renamed from: y */
    private float f59506y = 0.0f;

    /* JADX INFO: renamed from: z */
    private float f59507z = 0.0f;

    /* JADX INFO: renamed from: A */
    private float f59499A = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static float m84296b(float f) {
        if (f <= 1.0f) {
            return 0.1f;
        }
        double d = f;
        if (d < 2.5d) {
            f = m84295a((f - 1.0f) / 1.5f, 1.0f, 4.1f);
        } else if (f < 4.0f) {
            f = m84295a((f - 2.5f) / 1.5f, 4.1f, 5.6f);
        } else if (d < 5.5d) {
            f = m84295a((f - 4.0f) / 1.5f, 5.6f, 6.8f);
        } else if (d <= 7.0d) {
            f = m84295a((f - 5.5f) / 1.5f, 6.8f, 7.0f);
        }
        return f / 10.0f;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        if (this.f59503v == i && this.f59504w == i2) {
            return;
        }
        this.f59503v = i;
        this.f59504w = i2;
        mo84276c(i, i2);
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public boolean mo84276c(int i, int i2) {
        this.f59503v = i;
        this.f59504w = i2;
        if (this.f59500s == null) {
            C14241f c14241f = new C14241f();
            this.f59500s = c14241f;
            c14241f.m83976a(true);
            if (!this.f59500s.mo83979a()) {
                Log.e(f59498r, "mNewFaceFilter init Failed");
                return false;
            }
        }
        this.f59500s.mo83969a(this.f59503v, this.f59504w);
        if (this.f59501t == null) {
            a aVar = new a();
            this.f59501t = aVar;
            aVar.m83976a(true);
            if (!this.f59501t.mo83979a()) {
                Log.e(f59498r, "mBeautyCoreFilter init Failed");
                return false;
            }
        }
        this.f59501t.mo83969a(this.f59503v, this.f59504w);
        if (this.f59502u == null) {
            C14254s c14254s = new C14254s();
            this.f59502u = c14254s;
            c14254s.m83976a(true);
            if (!this.f59502u.mo83979a()) {
                Log.e(f59498r, "mSharpenessFilter init Failed");
                return false;
            }
        }
        this.f59502u.mo83969a(this.f59503v, this.f59504w);
        return true;
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: d */
    public void mo84277d(int i) {
        float f = i;
        this.f59506y = f;
        a aVar = this.f59501t;
        if (aVar != null) {
            aVar.m84298b(f);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        a aVar = this.f59501t;
        if (aVar != null) {
            aVar.mo83989d();
            this.f59501t = null;
        }
        C14241f c14241f = this.f59500s;
        if (c14241f != null) {
            c14241f.mo83989d();
            this.f59500s = null;
        }
        C14254s c14254s = this.f59502u;
        if (c14254s != null) {
            c14254s.mo83989d();
            this.f59502u = null;
        }
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: f */
    public void mo84279f(int i) {
        float f = i / 15.0f;
        if (Math.abs(this.f59499A - f) < 0.001d) {
            return;
        }
        this.f59499A = f;
        C14254s c14254s = this.f59502u;
        if (c14254s != null) {
            c14254s.m84336a(f);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.c$a */
    public static class a extends C14255t {

        /* JADX INFO: renamed from: x */
        private int f59508x;

        /* JADX INFO: renamed from: y */
        private int f59509y;

        /* JADX INFO: renamed from: z */
        private int f59510z;

        public a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
            this.f59508x = -1;
            this.f59509y = -1;
            this.f59510z = -1;
        }

        @Override // com.tencent.liteav.beauty.p098b.C14255t, com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: a */
        public void mo83969a(int i, int i2) {
            if (this.f59021f == i2 && this.f59020e == i) {
                return;
            }
            super.mo83969a(i, i2);
            this.f59508x = GLES20.glGetUniformLocation(m84001p(), "smoothDegree");
            this.f59509y = GLES20.glGetUniformLocation(m84001p(), "brightDegree");
            this.f59510z = GLES20.glGetUniformLocation(m84001p(), "ruddyDegree");
        }

        /* JADX INFO: renamed from: b */
        public void m84298b(float f) {
            m83968a(this.f59509y, f / 3.0f);
        }

        /* JADX INFO: renamed from: c */
        public void m84299c(float f) {
            m83968a(this.f59510z, (f / 10.0f) / 2.0f);
        }

        @Override // com.tencent.liteav.beauty.p098b.C14255t, com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: b */
        public boolean mo83986b() {
            return super.mo83986b();
        }

        @Override // com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: a */
        public boolean mo83979a() {
            NativeLoad.getInstance();
            int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(1);
            this.f59016a = iNativeLoadGLProgram;
            if (iNativeLoadGLProgram != 0 && mo83986b()) {
                this.f59022g = true;
            } else {
                this.f59022g = false;
            }
            mo83987c();
            return this.f59022g;
        }

        /* JADX INFO: renamed from: a */
        public void m84297a(float f) {
            m83968a(this.f59508x, C14234c.m84296b(f));
        }
    }

    /* JADX INFO: renamed from: a */
    private static float m84295a(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: e */
    public void mo84278e(int i) {
        float f = i;
        this.f59507z = f;
        a aVar = this.f59501t;
        if (aVar != null) {
            aVar.m84299c(f);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        float f = this.f59505x;
        if (f > 0.0f || this.f59506y > 0.0f || this.f59507z > 0.0f) {
            i = this.f59501t.mo83967a(f != 0.0f ? this.f59500s.mo83981b(i) : i, i, i);
        }
        return this.f59499A > 0.0f ? this.f59502u.mo83981b(i) : i;
    }

    @Override // com.tencent.liteav.beauty.p098b.C14231b
    /* JADX INFO: renamed from: c */
    public void mo84275c(int i) {
        float f = i;
        this.f59505x = f;
        a aVar = this.f59501t;
        if (aVar != null) {
            aVar.m84297a(f);
        }
    }
}

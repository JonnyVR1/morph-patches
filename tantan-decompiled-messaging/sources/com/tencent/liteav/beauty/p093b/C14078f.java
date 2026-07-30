package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14078f extends C14015h {

    /* JADX INFO: renamed from: A */
    private int[] f58696A;

    /* JADX INFO: renamed from: B */
    private float f58697B = 4.0f;

    /* JADX INFO: renamed from: r */
    int f58698r;

    /* JADX INFO: renamed from: s */
    int f58699s;

    /* JADX INFO: renamed from: t */
    boolean f58700t;

    /* JADX INFO: renamed from: u */
    private C14076d f58701u;

    /* JADX INFO: renamed from: v */
    private C14015h f58702v;

    /* JADX INFO: renamed from: w */
    private c f58703w;

    /* JADX INFO: renamed from: x */
    private a f58704x;

    /* JADX INFO: renamed from: y */
    private b f58705y;

    /* JADX INFO: renamed from: z */
    private int[] f58706z;

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f$a */
    public static class a extends C14093u {
        public a(String str) {
            super(str);
        }

        @Override // com.tencent.liteav.beauty.p093b.C14093u, com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: b */
        public boolean mo82803b() {
            return super.mo82803b();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f$b */
    public static class b extends C14092t {
        public b(String str) {
            super(str);
        }

        @Override // com.tencent.liteav.beauty.p093b.C14092t, com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: b */
        public boolean mo82803b() {
            return super.mo82803b();
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (this.f58173f == i2 && this.f58172e == i) {
            return;
        }
        super.mo82786a(i, i2);
        if (!this.f58700t) {
            if (i < i2) {
                if (i < 540) {
                    this.f58697B = 1.0f;
                } else {
                    this.f58697B = 4.0f;
                }
            } else if (i2 < 540) {
                this.f58697B = 1.0f;
            } else {
                this.f58697B = 4.0f;
            }
        }
        float f = this.f58697B;
        int i3 = (int) (i / f);
        this.f58698r = i3;
        int i4 = (int) (i2 / f);
        this.f58699s = i4;
        this.f58702v.mo82786a(i3, i4);
        this.f58703w.mo82786a(this.f58698r, this.f58699s);
        this.f58704x.mo82786a(this.f58698r, this.f58699s);
        this.f58705y.mo82786a(i, i2);
        this.f58701u.mo82786a(this.f58698r, this.f58699s);
        int[] iArr = this.f58706z;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
            GLES20.glDeleteTextures(this.f58706z.length, this.f58696A, 0);
            this.f58706z = null;
            this.f58696A = null;
        }
        int[] iArr2 = new int[8];
        this.f58706z = iArr2;
        this.f58696A = new int[iArr2.length];
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        GLES20.glGenTextures(this.f58706z.length, this.f58696A, 0);
        for (int i5 = 0; i5 < this.f58706z.length; i5++) {
            GLES20.glBindTexture(3553, this.f58696A[i5]);
            if (i5 >= 5) {
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            } else {
                GLES20.glTexImage2D(3553, 0, 6408, this.f58698r, this.f58699s, 0, 6408, 5121, null);
            }
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.f58706z[i5]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f58696A[i5], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public int mo82798b(int i) {
        int iMo82798b;
        if (this.f58697B != 1.0f) {
            GLES20.glViewport(0, 0, this.f58698r, this.f58699s);
            iMo82798b = this.f58702v.mo82798b(i);
        } else {
            iMo82798b = i;
        }
        int iMo82784a = this.f58701u.mo82784a(iMo82798b, this.f58706z[4], this.f58696A[4]);
        int iM83156a = this.f58703w.m83156a(iMo82798b, iMo82784a, this.f58706z[0], this.f58696A[0]);
        int iM83156a2 = this.f58704x.m83156a(iM83156a, iMo82784a, this.f58706z[1], this.f58696A[1]);
        int iMo82784a2 = this.f58701u.mo82784a(iM83156a, this.f58706z[2], this.f58696A[2]);
        int iMo82784a3 = this.f58701u.mo82784a(iM83156a2, this.f58706z[3], this.f58696A[3]);
        if (this.f58697B != 1.0f) {
            GLES20.glViewport(0, 0, this.f58172e, this.f58173f);
            iMo82784a2 = this.f58702v.mo82784a(iMo82784a2, this.f58706z[5], this.f58696A[5]);
            iMo82784a3 = this.f58702v.mo82784a(iMo82784a3, this.f58706z[6], this.f58696A[6]);
        }
        return this.f58705y.m83154a(iMo82784a2, iMo82784a3, i, this.f58706z[7], this.f58696A[7]);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        if (this.f58174g) {
            super.mo82807e();
            this.f58701u.mo82806d();
            this.f58703w.mo82806d();
            this.f58704x.mo82806d();
            this.f58705y.mo82806d();
            this.f58702v.mo82806d();
            int[] iArr = this.f58706z;
            if (iArr != null) {
                GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
                GLES20.glDeleteTextures(this.f58706z.length, this.f58696A, 0);
                this.f58706z = null;
            }
            this.f58696A = null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f$c */
    public static class c extends C14093u {

        /* JADX INFO: renamed from: r */
        int f58707r;

        /* JADX INFO: renamed from: s */
        int f58708s;

        /* JADX INFO: renamed from: t */
        float f58709t;

        public c() {
            super(null, null);
            this.f58709t = 1.5f;
        }

        @Override // com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: a */
        public boolean mo82796a() {
            NativeLoad.getInstance();
            int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(2);
            this.f58168a = iNativeLoadGLProgram;
            if (iNativeLoadGLProgram == 0 || !mo82803b()) {
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
            if (!super.mo82803b()) {
                return false;
            }
            this.f58707r = GLES20.glGetUniformLocation(this.f58168a, "texelWidthOffset");
            this.f58708s = GLES20.glGetUniformLocation(this.f58168a, "texelHeightOffset");
            return true;
        }

        /* JADX INFO: renamed from: a */
        public void m83126a(float f) {
            this.f58709t = f;
            m82785a(this.f58707r, f / this.f58172e);
            m82785a(this.f58708s, this.f58709t / this.f58173f);
        }

        @Override // com.tencent.liteav.basic.p088c.C14015h
        /* JADX INFO: renamed from: a */
        public void mo82786a(int i, int i2) {
            super.mo82786a(i, i2);
            m83126a(this.f58709t);
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        if (zMo82803b) {
            C14076d c14076d = new C14076d();
            this.f58701u = c14076d;
            if (zMo82803b) {
                zMo82803b = c14076d.mo82796a();
            }
            c cVar = new c();
            this.f58703w = cVar;
            if (zMo82803b) {
                zMo82803b = cVar.mo82796a();
            }
            a aVar = new a("precision highp float;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvarying vec2 textureCoordinate;  \nvarying vec2 textureCoordinate2;  \nvoid main()  \n{  \n\tgl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);  \n}  \n");
            this.f58704x = aVar;
            if (zMo82803b) {
                zMo82803b = aVar.mo82796a();
            }
            b bVar = new b("precision highp float;   \nuniform sampler2D inputImageTexture;   \nuniform sampler2D inputImageTexture2;  \nuniform sampler2D inputImageTexture3;   \nvarying vec2 textureCoordinate;   \nvarying vec2 textureCoordinate2;  \nvarying vec2 textureCoordinate3;    \nvoid main()   \n{   \n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);   \n}   \n");
            this.f58705y = bVar;
            if (zMo82803b) {
                zMo82803b = bVar.mo82796a();
            }
            C14015h c14015h = new C14015h();
            this.f58702v = c14015h;
            c14015h.m82793a(true);
            if (zMo82803b) {
                zMo82803b = this.f58702v.mo82796a();
            }
            if (zMo82803b) {
                return true;
            }
        }
        mo82806d();
        return false;
    }
}

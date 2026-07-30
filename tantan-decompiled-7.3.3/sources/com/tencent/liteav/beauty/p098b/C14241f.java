package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14241f extends C14178h {

    /* JADX INFO: renamed from: A */
    private int[] f59544A;

    /* JADX INFO: renamed from: B */
    private float f59545B = 4.0f;

    /* JADX INFO: renamed from: r */
    int f59546r;

    /* JADX INFO: renamed from: s */
    int f59547s;

    /* JADX INFO: renamed from: t */
    boolean f59548t;

    /* JADX INFO: renamed from: u */
    private C14239d f59549u;

    /* JADX INFO: renamed from: v */
    private C14178h f59550v;

    /* JADX INFO: renamed from: w */
    private c f59551w;

    /* JADX INFO: renamed from: x */
    private a f59552x;

    /* JADX INFO: renamed from: y */
    private b f59553y;

    /* JADX INFO: renamed from: z */
    private int[] f59554z;

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f$a */
    public static class a extends C14256u {
        public a(String str) {
            super(str);
        }

        @Override // com.tencent.liteav.beauty.p098b.C14256u, com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: b */
        public boolean mo83986b() {
            return super.mo83986b();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f$b */
    public static class b extends C14255t {
        public b(String str) {
            super(str);
        }

        @Override // com.tencent.liteav.beauty.p098b.C14255t, com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: b */
        public boolean mo83986b() {
            return super.mo83986b();
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        if (this.f59021f == i2 && this.f59020e == i) {
            return;
        }
        super.mo83969a(i, i2);
        if (!this.f59548t) {
            if (i < i2) {
                if (i < 540) {
                    this.f59545B = 1.0f;
                } else {
                    this.f59545B = 4.0f;
                }
            } else if (i2 < 540) {
                this.f59545B = 1.0f;
            } else {
                this.f59545B = 4.0f;
            }
        }
        float f = this.f59545B;
        int i3 = (int) (i / f);
        this.f59546r = i3;
        int i4 = (int) (i2 / f);
        this.f59547s = i4;
        this.f59550v.mo83969a(i3, i4);
        this.f59551w.mo83969a(this.f59546r, this.f59547s);
        this.f59552x.mo83969a(this.f59546r, this.f59547s);
        this.f59553y.mo83969a(i, i2);
        this.f59549u.mo83969a(this.f59546r, this.f59547s);
        int[] iArr = this.f59554z;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
            GLES20.glDeleteTextures(this.f59554z.length, this.f59544A, 0);
            this.f59554z = null;
            this.f59544A = null;
        }
        int[] iArr2 = new int[8];
        this.f59554z = iArr2;
        this.f59544A = new int[iArr2.length];
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        GLES20.glGenTextures(this.f59554z.length, this.f59544A, 0);
        for (int i5 = 0; i5 < this.f59554z.length; i5++) {
            GLES20.glBindTexture(3553, this.f59544A[i5]);
            if (i5 >= 5) {
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            } else {
                GLES20.glTexImage2D(3553, 0, 6408, this.f59546r, this.f59547s, 0, 6408, 5121, null);
            }
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.f59554z[i5]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f59544A[i5], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public int mo83981b(int i) {
        int iMo83981b;
        if (this.f59545B != 1.0f) {
            GLES20.glViewport(0, 0, this.f59546r, this.f59547s);
            iMo83981b = this.f59550v.mo83981b(i);
        } else {
            iMo83981b = i;
        }
        int iMo83967a = this.f59549u.mo83967a(iMo83981b, this.f59554z[4], this.f59544A[4]);
        int iM84339a = this.f59551w.m84339a(iMo83981b, iMo83967a, this.f59554z[0], this.f59544A[0]);
        int iM84339a2 = this.f59552x.m84339a(iM84339a, iMo83967a, this.f59554z[1], this.f59544A[1]);
        int iMo83967a2 = this.f59549u.mo83967a(iM84339a, this.f59554z[2], this.f59544A[2]);
        int iMo83967a3 = this.f59549u.mo83967a(iM84339a2, this.f59554z[3], this.f59544A[3]);
        if (this.f59545B != 1.0f) {
            GLES20.glViewport(0, 0, this.f59020e, this.f59021f);
            iMo83967a2 = this.f59550v.mo83967a(iMo83967a2, this.f59554z[5], this.f59544A[5]);
            iMo83967a3 = this.f59550v.mo83967a(iMo83967a3, this.f59554z[6], this.f59544A[6]);
        }
        return this.f59553y.m84337a(iMo83967a2, iMo83967a3, i, this.f59554z[7], this.f59544A[7]);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        if (this.f59022g) {
            super.mo83990e();
            this.f59549u.mo83989d();
            this.f59551w.mo83989d();
            this.f59552x.mo83989d();
            this.f59553y.mo83989d();
            this.f59550v.mo83989d();
            int[] iArr = this.f59554z;
            if (iArr != null) {
                GLES20.glDeleteFramebuffers(iArr.length, iArr, 0);
                GLES20.glDeleteTextures(this.f59554z.length, this.f59544A, 0);
                this.f59554z = null;
            }
            this.f59544A = null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.f$c */
    public static class c extends C14256u {

        /* JADX INFO: renamed from: r */
        int f59555r;

        /* JADX INFO: renamed from: s */
        int f59556s;

        /* JADX INFO: renamed from: t */
        float f59557t;

        public c() {
            super(null, null);
            this.f59557t = 1.5f;
        }

        @Override // com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: a */
        public boolean mo83979a() {
            NativeLoad.getInstance();
            int iNativeLoadGLProgram = NativeLoad.nativeLoadGLProgram(2);
            this.f59016a = iNativeLoadGLProgram;
            if (iNativeLoadGLProgram == 0 || !mo83986b()) {
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
            if (!super.mo83986b()) {
                return false;
            }
            this.f59555r = GLES20.glGetUniformLocation(this.f59016a, "texelWidthOffset");
            this.f59556s = GLES20.glGetUniformLocation(this.f59016a, "texelHeightOffset");
            return true;
        }

        /* JADX INFO: renamed from: a */
        public void m84309a(float f) {
            this.f59557t = f;
            m83968a(this.f59555r, f / this.f59020e);
            m83968a(this.f59556s, this.f59557t / this.f59021f);
        }

        @Override // com.tencent.liteav.basic.p093c.C14178h
        /* JADX INFO: renamed from: a */
        public void mo83969a(int i, int i2) {
            super.mo83969a(i, i2);
            m84309a(this.f59557t);
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        if (zMo83986b) {
            C14239d c14239d = new C14239d();
            this.f59549u = c14239d;
            if (zMo83986b) {
                zMo83986b = c14239d.mo83979a();
            }
            c cVar = new c();
            this.f59551w = cVar;
            if (zMo83986b) {
                zMo83986b = cVar.mo83979a();
            }
            a aVar = new a("precision highp float;  \nuniform sampler2D inputImageTexture;  \nuniform sampler2D inputImageTexture2;  \nvarying vec2 textureCoordinate;  \nvarying vec2 textureCoordinate2;  \nvoid main()  \n{  \n\tgl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);  \n}  \n");
            this.f59552x = aVar;
            if (zMo83986b) {
                zMo83986b = aVar.mo83979a();
            }
            b bVar = new b("precision highp float;   \nuniform sampler2D inputImageTexture;   \nuniform sampler2D inputImageTexture2;  \nuniform sampler2D inputImageTexture3;   \nvarying vec2 textureCoordinate;   \nvarying vec2 textureCoordinate2;  \nvarying vec2 textureCoordinate3;    \nvoid main()   \n{   \n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);   \n}   \n");
            this.f59553y = bVar;
            if (zMo83986b) {
                zMo83986b = bVar.mo83979a();
            }
            C14178h c14178h = new C14178h();
            this.f59550v = c14178h;
            c14178h.m83976a(true);
            if (zMo83986b) {
                zMo83986b = this.f59550v.mo83979a();
            }
            if (zMo83986b) {
                return true;
            }
        }
        mo83989d();
        return false;
    }
}

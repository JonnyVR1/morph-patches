package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14242g extends C14178h {

    /* JADX INFO: renamed from: r */
    protected List<C14178h> f59558r;

    /* JADX INFO: renamed from: s */
    protected List<C14178h> f59559s;

    /* JADX INFO: renamed from: t */
    private int[] f59560t;

    /* JADX INFO: renamed from: u */
    private int[] f59561u;

    /* JADX INFO: renamed from: v */
    private C14178h f59562v;

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        int i3 = i2;
        if (this.f59020e == i && this.f59021f == i3) {
            return;
        }
        if (this.f59560t != null) {
            mo83991f();
        }
        super.mo83969a(i, i2);
        int size = this.f59559s.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f59559s.get(i4).mo83969a(i, i2);
        }
        this.f59562v.mo83969a(i, i2);
        List<C14178h> list = this.f59559s;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f59559s.size();
        this.f59560t = new int[2];
        this.f59561u = new int[2];
        int i5 = 0;
        while (i5 < 2) {
            GLES20.glGenFramebuffers(1, this.f59560t, i5);
            GLES20.glGenTextures(1, this.f59561u, i5);
            GLES20.glBindTexture(3553, this.f59561u[i5]);
            GLES20.glTexImage2D(3553, 0, 6408, i, i3, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.f59560t[i5]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f59561u[i5], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            i5++;
            i3 = i2;
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        boolean zMo83986b = super.mo83986b();
        if (zMo83986b) {
            for (C14178h c14178h : this.f59558r) {
                c14178h.mo83979a();
                if (!c14178h.m83998m()) {
                    break;
                }
            }
            zMo83986b = this.f59562v.mo83979a();
        }
        return zMo83986b && GLES20.glGetError() == 0;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
        Iterator<C14178h> it = this.f59558r.iterator();
        while (it.hasNext()) {
            it.next().mo83989d();
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: f */
    public void mo83991f() {
        super.mo83991f();
        int[] iArr = this.f59561u;
        if (iArr != null) {
            GLES20.glDeleteTextures(2, iArr, 0);
            this.f59561u = null;
        }
        int[] iArr2 = this.f59560t;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(2, iArr2, 0);
            this.f59560t = null;
        }
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public int mo83967a(int i, int i2, int i3) {
        int size = this.f59559s.size();
        m83996k();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            C14178h c14178h = this.f59559s.get(i4);
            if (z) {
                i = c14178h.mo83967a(i, i2, i3);
            } else {
                i = c14178h.mo83967a(i, this.f59560t[0], this.f59561u[0]);
            }
            z = !z;
        }
        if (z) {
            this.f59562v.mo83967a(i, i2, i3);
        }
        return i3;
    }
}

package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14079g extends C14015h {

    /* JADX INFO: renamed from: r */
    protected List<C14015h> f58710r;

    /* JADX INFO: renamed from: s */
    protected List<C14015h> f58711s;

    /* JADX INFO: renamed from: t */
    private int[] f58712t;

    /* JADX INFO: renamed from: u */
    private int[] f58713u;

    /* JADX INFO: renamed from: v */
    private C14015h f58714v;

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        int i3 = i2;
        if (this.f58172e == i && this.f58173f == i3) {
            return;
        }
        if (this.f58712t != null) {
            mo82808f();
        }
        super.mo82786a(i, i2);
        int size = this.f58711s.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f58711s.get(i4).mo82786a(i, i2);
        }
        this.f58714v.mo82786a(i, i2);
        List<C14015h> list = this.f58711s;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f58711s.size();
        this.f58712t = new int[2];
        this.f58713u = new int[2];
        int i5 = 0;
        while (i5 < 2) {
            GLES20.glGenFramebuffers(1, this.f58712t, i5);
            GLES20.glGenTextures(1, this.f58713u, i5);
            GLES20.glBindTexture(3553, this.f58713u[i5]);
            GLES20.glTexImage2D(3553, 0, 6408, i, i3, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glBindFramebuffer(36160, this.f58712t[i5]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f58713u[i5], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            i5++;
            i3 = i2;
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        boolean zMo82803b = super.mo82803b();
        if (zMo82803b) {
            for (C14015h c14015h : this.f58710r) {
                c14015h.mo82796a();
                if (!c14015h.m82815m()) {
                    break;
                }
            }
            zMo82803b = this.f58714v.mo82796a();
        }
        return zMo82803b && GLES20.glGetError() == 0;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
        Iterator<C14015h> it = this.f58710r.iterator();
        while (it.hasNext()) {
            it.next().mo82806d();
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: f */
    public void mo82808f() {
        super.mo82808f();
        int[] iArr = this.f58713u;
        if (iArr != null) {
            GLES20.glDeleteTextures(2, iArr, 0);
            this.f58713u = null;
        }
        int[] iArr2 = this.f58712t;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(2, iArr2, 0);
            this.f58712t = null;
        }
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public int mo82784a(int i, int i2, int i3) {
        int size = this.f58711s.size();
        m82813k();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            C14015h c14015h = this.f58711s.get(i4);
            if (z) {
                i = c14015h.mo82784a(i, i2, i3);
            } else {
                i = c14015h.mo82784a(i, this.f58712t[0], this.f58713u[0]);
            }
            z = !z;
        }
        if (z) {
            this.f58714v.mo82784a(i, i2, i3);
        }
        return i3;
    }
}

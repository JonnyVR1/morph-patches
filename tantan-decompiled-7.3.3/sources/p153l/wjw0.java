package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class wjw0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f189508a;

    /* JADX INFO: renamed from: b */
    public int f189509b;

    /* JADX INFO: renamed from: c */
    public int f189510c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xjw0 f189511d;

    public /* synthetic */ wjw0(xjw0 xjw0Var, byte[] bArr, vjw0 vjw0Var) {
        this.f189511d = xjw0Var;
        this.f189508a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final wjw0 m206734a(int i) {
        this.f189510c = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final wjw0 m206735b(int i) {
        this.f189509b = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m206736c() {
        try {
            xjw0 xjw0Var = this.f189511d;
            if (xjw0Var.f194655b) {
                xjw0Var.f194654a.mo98631r0(this.f189508a);
                this.f189511d.f194654a.mo98630n(this.f189509b);
                this.f189511d.f194654a.zzg(this.f189510c);
                this.f189511d.f194654a.mo98629k0(null);
                this.f189511d.f194654a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}

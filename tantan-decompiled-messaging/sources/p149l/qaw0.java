package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class qaw0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f153581a;

    /* JADX INFO: renamed from: b */
    public int f153582b;

    /* JADX INFO: renamed from: c */
    public int f153583c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ raw0 f153584d;

    public /* synthetic */ qaw0(raw0 raw0Var, byte[] bArr, paw0 paw0Var) {
        this.f153584d = raw0Var;
        this.f153581a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final qaw0 m173782a(int i) {
        this.f153583c = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final qaw0 m173783b(int i) {
        this.f153582b = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m173784c() {
        try {
            raw0 raw0Var = this.f153584d;
            if (raw0Var.f158567b) {
                raw0Var.f158566a.mo183114r0(this.f153581a);
                this.f153584d.f158566a.mo183113n(this.f153582b);
                this.f153584d.f158566a.zzg(this.f153583c);
                this.f153584d.f158566a.mo183112k0(null);
                this.f153584d.f158566a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}

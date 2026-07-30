package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class kcs0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f125094a;

    /* JADX INFO: renamed from: b */
    public int f125095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lcs0 f125096c;

    public /* synthetic */ kcs0(lcs0 lcs0Var, byte[] bArr, jcs0 jcs0Var) {
        this.f125096c = lcs0Var;
        this.f125094a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final kcs0 m149126a(int i) {
        this.f125095b = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m149127c() {
        this.f125096c.f131381c.execute(new Runnable() { // from class: l.ics0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114437a.m149128d();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m149128d() {
        try {
            lcs0 lcs0Var = this.f125096c;
            if (lcs0Var.f131380b) {
                lcs0Var.f131379a.mo184925r0(this.f125094a);
                this.f125096c.f131379a.mo184924n(0);
                this.f125096c.f131379a.zzg(this.f125095b);
                this.f125096c.f131379a.mo184923k0(null);
                this.f125096c.f131379a.zzf();
            }
        } catch (RemoteException e) {
            dct0.m115294c("Clearcut log failed", e);
        }
    }
}

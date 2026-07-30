package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class aru0 extends mns0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f72986a;

    /* JADX INFO: renamed from: b */
    public final ilu0 f72987b;

    /* JADX INFO: renamed from: c */
    public final ulu0 f72988c;

    /* JADX INFO: renamed from: d */
    public final xwu0 f72989d;

    public aru0(@Nullable String str, ilu0 ilu0Var, ulu0 ulu0Var, xwu0 xwu0Var) {
        this.f72986a = str;
        this.f72987b = ilu0Var;
        this.f72988c = ulu0Var;
        this.f72989d = xwu0Var;
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: L */
    public final boolean mo99769L() {
        return this.f72987b.m140680C();
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: O5 */
    public final void mo99770O5(@Nullable czt0 czt0Var) throws RemoteException {
        this.f72987b.m140705j(czt0Var);
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: O7 */
    public final void mo99771O7() {
        this.f72987b.m140716u();
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: Q5 */
    public final boolean mo99772Q5(Bundle bundle) throws RemoteException {
        return this.f72987b.m140682F(bundle);
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: W4 */
    public final void mo99773W4(ycu0 ycu0Var) throws RemoteException {
        try {
            if (!ycu0Var.zzf()) {
                this.f72989d.m213444e();
            }
        } catch (RemoteException e) {
            dct0.m115294c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f72987b.m140718w(ycu0Var);
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: a */
    public final String mo99774a() throws RemoteException {
        return this.f72988c.m196593b();
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: b */
    public final List mo99775b() throws RemoteException {
        return mo99779o() ? this.f72988c.m196604h() : Collections.EMPTY_LIST;
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: g */
    public final void mo99776g() throws RemoteException {
        this.f72987b.mo127848b();
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: k */
    public final void mo99777k() throws RemoteException {
        this.f72987b.m140697Z();
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: m3 */
    public final void mo99778m3(Bundle bundle) throws RemoteException {
        this.f72987b.m140714s(bundle);
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: o */
    public final boolean mo99779o() throws RemoteException {
        return (this.f72988c.m196604h().isEmpty() || this.f72988c.m196588X() == null) ? false : true;
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: q2 */
    public final void mo99780q2(Bundle bundle) throws RemoteException {
        this.f72987b.m140709n(bundle);
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: t */
    public final void mo99781t() {
        this.f72987b.m140710o();
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: t4 */
    public final void mo99782t4(ytt0 ytt0Var) throws RemoteException {
        this.f72987b.m140717v(ytt0Var);
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: z3 */
    public final void mo99783z3(kns0 kns0Var) throws RemoteException {
        this.f72987b.m140719x(kns0Var);
    }

    @Override // p153l.nns0
    public final double zze() throws RemoteException {
        return this.f72988c.m196572A();
    }

    @Override // p153l.nns0
    public final Bundle zzf() throws RemoteException {
        return this.f72988c.m196581Q();
    }

    @Override // p153l.nns0
    @Nullable
    public final tlu0 zzg() throws RemoteException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168078N6)).booleanValue()) {
            return this.f72987b.m152228d();
        }
        return null;
    }

    @Override // p153l.nns0
    public final lpu0 zzh() throws RemoteException {
        return this.f72988c.m196587W();
    }

    @Override // p153l.nns0
    public final tks0 zzi() throws RemoteException {
        return this.f72988c.m196589Y();
    }

    @Override // p153l.nns0
    public final xks0 zzj() throws RemoteException {
        return this.f72987b.m140691O().m150397a();
    }

    @Override // p153l.nns0
    public final als0 zzk() throws RemoteException {
        return this.f72988c.m196592a0();
    }

    @Override // p153l.nns0
    public final p1m zzl() throws RemoteException {
        return this.f72988c.m196607i0();
    }

    @Override // p153l.nns0
    public final p1m zzm() throws RemoteException {
        return h950.m134038Y2(this.f72987b);
    }

    @Override // p153l.nns0
    public final String zzn() throws RemoteException {
        return this.f72988c.m196611k0();
    }

    @Override // p153l.nns0
    public final String zzo() throws RemoteException {
        return this.f72988c.m196613l0();
    }

    @Override // p153l.nns0
    public final String zzp() throws RemoteException {
        return this.f72988c.m196615m0();
    }

    @Override // p153l.nns0
    public final String zzr() throws RemoteException {
        return this.f72986a;
    }

    @Override // p153l.nns0
    public final String zzs() throws RemoteException {
        return this.f72988c.m196597d();
    }

    @Override // p153l.nns0
    public final String zzt() throws RemoteException {
        return this.f72988c.m196599e();
    }

    @Override // p153l.nns0
    public final List zzu() throws RemoteException {
        return this.f72988c.m196603g();
    }
}

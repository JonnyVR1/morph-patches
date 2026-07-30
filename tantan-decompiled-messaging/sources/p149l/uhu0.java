package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class uhu0 extends ges0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f176595a;

    /* JADX INFO: renamed from: b */
    public final ccu0 f176596b;

    /* JADX INFO: renamed from: c */
    public final ocu0 f176597c;

    /* JADX INFO: renamed from: d */
    public final rnu0 f176598d;

    public uhu0(@Nullable String str, ccu0 ccu0Var, ocu0 ocu0Var, rnu0 rnu0Var) {
        this.f176595a = str;
        this.f176596b = ccu0Var;
        this.f176597c = ocu0Var;
        this.f176598d = rnu0Var;
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: L */
    public final boolean mo130689L() {
        return this.f176596b.m106158C();
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: O5 */
    public final void mo130690O5(@Nullable wpt0 wpt0Var) throws RemoteException {
        this.f176596b.m106184j(wpt0Var);
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: O7 */
    public final void mo130691O7() {
        this.f176596b.m106195u();
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: Q5 */
    public final boolean mo130692Q5(Bundle bundle) throws RemoteException {
        return this.f176596b.m106160F(bundle);
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: W4 */
    public final void mo130693W4(s3u0 s3u0Var) throws RemoteException {
        try {
            if (!s3u0Var.zzf()) {
                this.f176598d.m180209e();
            }
        } catch (RemoteException e) {
            x2t0.m206865c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f176596b.m106197w(s3u0Var);
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: a */
    public final String mo121066a() throws RemoteException {
        return this.f176597c.m163586b();
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: b */
    public final List mo121067b() throws RemoteException {
        return mo130696o() ? this.f176597c.m163597h() : Collections.EMPTY_LIST;
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: g */
    public final void mo121068g() throws RemoteException {
        this.f176596b.mo106177b();
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: k */
    public final void mo130694k() throws RemoteException {
        this.f176596b.m106175Z();
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: m3 */
    public final void mo130695m3(Bundle bundle) throws RemoteException {
        this.f176596b.m106193s(bundle);
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: o */
    public final boolean mo130696o() throws RemoteException {
        return (this.f176597c.m163597h().isEmpty() || this.f176597c.m163581X() == null) ? false : true;
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: q2 */
    public final void mo130697q2(Bundle bundle) throws RemoteException {
        this.f176596b.m106188n(bundle);
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: t */
    public final void mo130698t() {
        this.f176596b.m106189o();
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: t4 */
    public final void mo130699t4(skt0 skt0Var) throws RemoteException {
        this.f176596b.m106196v(skt0Var);
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: z3 */
    public final void mo130700z3(ees0 ees0Var) throws RemoteException {
        this.f176596b.m106198x(ees0Var);
    }

    @Override // p149l.hes0
    public final double zze() throws RemoteException {
        return this.f176597c.m163565A();
    }

    @Override // p149l.hes0
    public final Bundle zzf() throws RemoteException {
        return this.f176597c.m163574Q();
    }

    @Override // p149l.hes0
    @Nullable
    public final ncu0 zzg() throws RemoteException {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132007N6)).booleanValue()) {
            return this.f176596b.m117798d();
        }
        return null;
    }

    @Override // p149l.hes0
    public final fgu0 zzh() throws RemoteException {
        return this.f176597c.m163580W();
    }

    @Override // p149l.hes0
    public final nbs0 zzi() throws RemoteException {
        return this.f176597c.m163582Y();
    }

    @Override // p149l.hes0
    public final rbs0 zzj() throws RemoteException {
        return this.f176596b.m106169O().m115753a();
    }

    @Override // p149l.hes0
    public final ubs0 zzk() throws RemoteException {
        return this.f176597c.m163585a0();
    }

    @Override // p149l.hes0
    public final uyl zzl() throws RemoteException {
        return this.f176597c.m163600i0();
    }

    @Override // p149l.hes0
    public final uyl zzm() throws RemoteException {
        return s050.m181848Y2(this.f176596b);
    }

    @Override // p149l.hes0
    public final String zzn() throws RemoteException {
        return this.f176597c.m163604k0();
    }

    @Override // p149l.hes0
    public final String zzo() throws RemoteException {
        return this.f176597c.m163606l0();
    }

    @Override // p149l.hes0
    public final String zzp() throws RemoteException {
        return this.f176597c.m163608m0();
    }

    @Override // p149l.hes0
    public final String zzr() throws RemoteException {
        return this.f176595a;
    }

    @Override // p149l.hes0
    public final String zzs() throws RemoteException {
        return this.f176597c.m163590d();
    }

    @Override // p149l.hes0
    public final String zzt() throws RemoteException {
        return this.f176597c.m163592e();
    }

    @Override // p149l.hes0
    public final List zzu() throws RemoteException {
        return this.f176597c.m163596g();
    }
}

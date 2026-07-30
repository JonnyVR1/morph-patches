package p153l;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;
import com.p051p1.mobile.putong.core.data.NotificationStatus;

/* JADX INFO: loaded from: classes6.dex */
public class ijv0 extends ixs0 {

    /* JADX INFO: renamed from: a */
    public final g6u0 f115293a;

    /* JADX INFO: renamed from: b */
    public final egu0 f115294b;

    /* JADX INFO: renamed from: c */
    public final h7u0 f115295c;

    /* JADX INFO: renamed from: d */
    public final d8u0 f115296d;

    /* JADX INFO: renamed from: e */
    public final i8u0 f115297e;

    /* JADX INFO: renamed from: f */
    public final jcu0 f115298f;

    /* JADX INFO: renamed from: g */
    public final i9u0 f115299g;

    /* JADX INFO: renamed from: h */
    public final ehu0 f115300h;

    /* JADX INFO: renamed from: i */
    public final fcu0 f115301i;

    /* JADX INFO: renamed from: j */
    public final c7u0 f115302j;

    public ijv0(g6u0 g6u0Var, egu0 egu0Var, h7u0 h7u0Var, d8u0 d8u0Var, i8u0 i8u0Var, jcu0 jcu0Var, i9u0 i9u0Var, ehu0 ehu0Var, fcu0 fcu0Var, c7u0 c7u0Var) {
        this.f115293a = g6u0Var;
        this.f115294b = egu0Var;
        this.f115295c = h7u0Var;
        this.f115296d = d8u0Var;
        this.f115297e = i8u0Var;
        this.f115298f = jcu0Var;
        this.f115299g = i9u0Var;
        this.f115300h = ehu0Var;
        this.f115301i = fcu0Var;
        this.f115302j = c7u0Var;
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: L7 */
    public final void mo118715L7(String str, String str2) {
        this.f115298f.mo99223b(str, str2);
    }

    @Override // p153l.jxs0
    @Deprecated
    /* JADX INFO: renamed from: N1 */
    public final void mo118716N1(int i) throws RemoteException {
        mo118722u5(new zze(i, "", NotificationStatus.undefined, null, null));
    }

    /* JADX INFO: renamed from: b */
    public void mo104529b() {
        this.f115300h.zza();
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: g */
    public final void mo118718g() throws RemoteException {
        this.f115300h.zzc();
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: k */
    public final void mo118720k() {
        this.f115300h.zzb();
    }

    /* JADX INFO: renamed from: r */
    public void mo104530r() {
        this.f115300h.m120854w0();
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: u */
    public final void mo118721u(String str) {
        mo118722u5(new zze(0, str, NotificationStatus.undefined, null, null));
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: u5 */
    public final void mo118722u5(zze zzeVar) {
        this.f115302j.mo102876i(v8w0.m200326c(8, zzeVar));
    }

    @Override // p153l.jxs0
    public final void zze() {
        this.f115293a.onAdClicked();
        this.f115294b.zzs();
    }

    @Override // p153l.jxs0
    public final void zzf() {
        this.f115299g.mo113769m5(4);
    }

    @Override // p153l.jxs0
    public void zzm() {
        this.f115295c.zza();
        this.f115301i.zzb();
    }

    @Override // p153l.jxs0
    public final void zzn() {
        this.f115296d.zzb();
    }

    @Override // p153l.jxs0
    public final void zzo() {
        this.f115297e.zzr();
    }

    @Override // p153l.jxs0
    public final void zzp() {
        this.f115299g.mo113755P2();
        this.f115301i.zza();
    }

    public void zzu() throws RemoteException {
    }

    /* JADX INFO: renamed from: L2 */
    public void mo104528L2(zzcag zzcagVar) {
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: N4 */
    public final void mo118717N4(zze zzeVar) {
    }

    /* JADX INFO: renamed from: v2 */
    public void mo104531v2(i7t0 i7t0Var) throws RemoteException {
    }

    @Override // p153l.jxs0
    public final void zzg(int i) {
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: G0 */
    public final void mo118714G0(int i, String str) {
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: h3 */
    public final void mo118719h3(bms0 bms0Var, String str) {
    }
}

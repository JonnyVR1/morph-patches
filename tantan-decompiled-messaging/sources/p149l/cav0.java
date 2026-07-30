package p149l;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;
import com.p046p1.mobile.putong.core.data.NotificationStatus;

/* JADX INFO: loaded from: classes6.dex */
public class cav0 extends cos0 {

    /* JADX INFO: renamed from: a */
    public final axt0 f80071a;

    /* JADX INFO: renamed from: b */
    public final y6u0 f80072b;

    /* JADX INFO: renamed from: c */
    public final byt0 f80073c;

    /* JADX INFO: renamed from: d */
    public final xyt0 f80074d;

    /* JADX INFO: renamed from: e */
    public final czt0 f80075e;

    /* JADX INFO: renamed from: f */
    public final d3u0 f80076f;

    /* JADX INFO: renamed from: g */
    public final c0u0 f80077g;

    /* JADX INFO: renamed from: h */
    public final y7u0 f80078h;

    /* JADX INFO: renamed from: i */
    public final z2u0 f80079i;

    /* JADX INFO: renamed from: j */
    public final wxt0 f80080j;

    public cav0(axt0 axt0Var, y6u0 y6u0Var, byt0 byt0Var, xyt0 xyt0Var, czt0 czt0Var, d3u0 d3u0Var, c0u0 c0u0Var, y7u0 y7u0Var, z2u0 z2u0Var, wxt0 wxt0Var) {
        this.f80071a = axt0Var;
        this.f80072b = y6u0Var;
        this.f80073c = byt0Var;
        this.f80074d = xyt0Var;
        this.f80075e = czt0Var;
        this.f80076f = d3u0Var;
        this.f80077g = c0u0Var;
        this.f80078h = y7u0Var;
        this.f80079i = z2u0Var;
        this.f80080j = wxt0Var;
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: L7 */
    public final void mo105940L7(String str, String str2) {
        this.f80076f.mo109944b(str, str2);
    }

    @Override // p149l.dos0
    @Deprecated
    /* JADX INFO: renamed from: N1 */
    public final void mo105941N1(int i) throws RemoteException {
        mo105949u5(new zze(i, "", NotificationStatus.undefined, null, null));
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: b */
    public void mo105943b() {
        this.f80078h.zza();
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: g */
    public final void mo105944g() throws RemoteException {
        this.f80078h.zzc();
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: k */
    public final void mo105946k() {
        this.f80078h.zzb();
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: r */
    public void mo105947r() {
        this.f80078h.m213319w0();
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: u */
    public final void mo105948u(String str) {
        mo105949u5(new zze(0, str, NotificationStatus.undefined, null, null));
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: u5 */
    public final void mo105949u5(zze zzeVar) {
        this.f80080j.mo161953i(pzv0.m172255c(8, zzeVar));
    }

    @Override // p149l.dos0
    public final void zze() {
        this.f80071a.onAdClicked();
        this.f80072b.zzs();
    }

    @Override // p149l.dos0
    public final void zzf() {
        this.f80077g.mo102687m5(4);
    }

    @Override // p149l.dos0
    public void zzm() {
        this.f80073c.zza();
        this.f80079i.zzb();
    }

    @Override // p149l.dos0
    public final void zzn() {
        this.f80074d.zzb();
    }

    @Override // p149l.dos0
    public final void zzo() {
        this.f80075e.zzr();
    }

    @Override // p149l.dos0
    public final void zzp() {
        this.f80077g.mo102681P2();
        this.f80079i.zza();
    }

    @Override // p149l.dos0
    public void zzu() throws RemoteException {
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: L2 */
    public void mo105939L2(zzcag zzcagVar) {
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: N4 */
    public final void mo105942N4(zze zzeVar) {
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: v2 */
    public void mo105950v2(cys0 cys0Var) throws RemoteException {
    }

    @Override // p149l.dos0
    public final void zzg(int i) {
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: G0 */
    public final void mo105938G0(int i, String str) {
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: h3 */
    public final void mo105945h3(vcs0 vcs0Var, String str) {
    }
}

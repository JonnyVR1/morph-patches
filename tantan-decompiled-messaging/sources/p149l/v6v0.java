package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfho;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class v6v0 implements o3v0 {

    /* JADX INFO: renamed from: a */
    public final Context f180231a;

    /* JADX INFO: renamed from: b */
    public final kau0 f180232b;

    /* JADX INFO: renamed from: c */
    public final Executor f180233c;

    public v6v0(Context context, kau0 kau0Var, Executor executor) {
        this.f180231a = context;
        this.f180232b = kau0Var;
        this.f180233c = executor;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m197236c(vxv0 vxv0Var, int i) {
        return vxv0Var.f183477a.f166831a.f115497g.contains(Integer.toString(i));
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95161a(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzeml, zzfho {
        ocu0 ocu0VarM163558I;
        hos0 hos0VarM152374d = ((lzv0) m3v0Var.f131187b).m152374d();
        ios0 ios0VarM152375e = ((lzv0) m3v0Var.f131187b).m152375e();
        los0 los0VarM152379i = ((lzv0) m3v0Var.f131187b).m152379i();
        if (los0VarM152379i != null && m197236c(vxv0Var, 6)) {
            ocu0VarM163558I = ocu0.m163564g0(los0VarM152379i);
        } else if (hos0VarM152374d != null && m197236c(vxv0Var, 6)) {
            ocu0VarM163558I = ocu0.m163559J(hos0VarM152374d);
        } else if (hos0VarM152374d != null && m197236c(vxv0Var, 2)) {
            ocu0VarM163558I = ocu0.m163557H(hos0VarM152374d);
        } else if (ios0VarM152375e != null && m197236c(vxv0Var, 6)) {
            ocu0VarM163558I = ocu0.m163560K(ios0VarM152375e);
        } else {
            if (ios0VarM152375e == null || !m197236c(vxv0Var, 1)) {
                throw new zzeml(1, "No native ad mappers");
            }
            ocu0VarM163558I = ocu0.m163558I(ios0VarM152375e);
        }
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        if (!iyv0Var.f115497g.contains(Integer.toString(ocu0VarM163558I.m163573P()))) {
            throw new zzeml(1, "No corresponding native ad listener");
        }
        qcu0 qcu0VarMo145185d = this.f180232b.mo145185d(new uqt0(vxv0Var, kxv0Var, m3v0Var.f131186a), new adu0(ocu0VarM163558I), new dfu0(ios0VarM152375e, hos0VarM152374d, los0VarM152379i));
        ((p5v0) m3v0Var.f131188c).m167520p8(qcu0VarMo145185d.mo96328g());
        qcu0VarMo145185d.mo96325c().m114710q0(new hkt0((lzv0) m3v0Var.f131187b), this.f180233c);
        return qcu0VarMo145185d.mo126223h();
    }

    @Override // p149l.o3v0
    /* JADX INFO: renamed from: b */
    public final void mo95162b(vxv0 vxv0Var, kxv0 kxv0Var, m3v0 m3v0Var) throws zzfho {
        lzv0 lzv0Var = (lzv0) m3v0Var.f131187b;
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        String string = kxv0Var.f125226w.toString();
        String strM171071l = prs0.m171071l(kxv0Var.f125221t);
        dos0 dos0Var = (dos0) m3v0Var.f131188c;
        iyv0 iyv0Var2 = vxv0Var.f183477a.f166831a;
        lzv0Var.m152391u(this.f180231a, iyv0Var.f115494d, string, strM171071l, dos0Var, iyv0Var2.f115499i, iyv0Var2.f115497g);
    }
}

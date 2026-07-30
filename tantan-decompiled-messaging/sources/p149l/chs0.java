package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class chs0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b1r0 f81007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f81008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f81009c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ghs0 f81010d;

    public chs0(ghs0 ghs0Var, b1r0 b1r0Var, Map map, String str) {
        this.f81007a = b1r0Var;
        this.f81008b = map;
        this.f81009c = str;
        this.f81010d = ghs0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        vny0.m199079q().m212290w(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        b1r0 b1r0Var = this.f81007a;
        Map map = this.f81008b;
        String str = this.f81009c;
        this.f81010d.m126216h((String) obj, b1r0Var, map, str);
    }
}

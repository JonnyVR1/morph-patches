package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class iqs0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ har0 f116461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f116462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f116463c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mqs0 f116464d;

    public iqs0(mqs0 mqs0Var, har0 har0Var, Map map, String str) {
        this.f116461a = har0Var;
        this.f116462b = map;
        this.f116463c = str;
        this.f116464d = mqs0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        bxy0.m106933q().m120275w(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        har0 har0Var = this.f116461a;
        Map map = this.f116462b;
        String str = this.f116463c;
        this.f116464d.m159605h((String) obj, har0Var, map, str);
    }
}

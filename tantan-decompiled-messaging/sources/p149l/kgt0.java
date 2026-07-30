package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class kgt0 implements dxv0 {

    /* JADX INFO: renamed from: a */
    public final iet0 f123073a;

    /* JADX INFO: renamed from: b */
    public Context f123074b;

    /* JADX INFO: renamed from: c */
    public String f123075c;

    public /* synthetic */ kgt0(iet0 iet0Var, jgt0 jgt0Var) {
        this.f123073a = iet0Var;
    }

    @Override // p149l.dxv0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dxv0 mo114029a(Context context) {
        context.getClass();
        this.f123074b = context;
        return this;
    }

    @Override // p149l.dxv0
    public final /* synthetic */ dxv0 zza(String str) {
        this.f123075c = str;
        return this;
    }

    @Override // p149l.dxv0
    public final exv0 zzc() {
        wgx0.m203090c(this.f123074b, Context.class);
        return new mgt0(this.f123073a, this.f123074b, this.f123075c, null);
    }
}

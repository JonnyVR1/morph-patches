package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class omv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f144694a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f144695b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f144696c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f144697d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f144698e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f144699f;

    public omv0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6) {
        this.f144694a = ehx0Var;
        this.f144695b = ehx0Var2;
        this.f144696c = ehx0Var3;
        this.f144697d = ehx0Var4;
        this.f144698e = ehx0Var5;
        this.f144699f = ehx0Var6;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        aiw0 aiw0VarZzb = ((bct0) this.f144694a).zzb();
        Context contextM110876a = ((dct0) this.f144695b).m110876a();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new lmv0(aiw0VarZzb, contextM110876a, rmw0Var, (ScheduledExecutorService) this.f144697d.zzb(), ((i3v0) this.f144698e).zzb(), ((twt0) this.f144699f).m190906a());
    }
}

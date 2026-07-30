package p149l;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class rtv0 implements a1w0 {

    /* JADX INFO: renamed from: a */
    public final ruv0 f160999a;

    /* JADX INFO: renamed from: b */
    public final tuv0 f161000b;

    /* JADX INFO: renamed from: c */
    public final zzl f161001c;

    /* JADX INFO: renamed from: d */
    public final String f161002d;

    /* JADX INFO: renamed from: e */
    public final Executor f161003e;

    /* JADX INFO: renamed from: f */
    public final zzw f161004f;

    /* JADX INFO: renamed from: g */
    public final p0w0 f161005g;

    public rtv0(ruv0 ruv0Var, tuv0 tuv0Var, zzl zzlVar, String str, Executor executor, zzw zzwVar, p0w0 p0w0Var) {
        this.f160999a = ruv0Var;
        this.f161000b = tuv0Var;
        this.f161001c = zzlVar;
        this.f161002d = str;
        this.f161003e = executor;
        this.f161004f = zzwVar;
        this.f161005g = p0w0Var;
    }

    @Override // p149l.a1w0
    public final p0w0 zza() {
        return this.f161005g;
    }

    @Override // p149l.a1w0
    public final Executor zzb() {
        return this.f161003e;
    }
}

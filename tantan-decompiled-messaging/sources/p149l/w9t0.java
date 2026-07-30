package p149l;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class w9t0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f185402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f185403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f185404c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aat0 f185405d;

    public w9t0(aat0 aat0Var, List list, String str, Uri uri) {
        this.f185402a = list;
        this.f185403b = str;
        this.f185404c = uri;
        this.f185405d = aat0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        x2t0.m206869g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f185404c)));
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.f185402a;
        String str = this.f185403b;
        this.f185405d.zzQ((Map) obj, list, str);
    }
}

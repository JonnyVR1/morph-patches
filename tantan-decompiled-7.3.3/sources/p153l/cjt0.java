package p153l;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cjt0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f82212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f82213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f82214c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gjt0 f82215d;

    public cjt0(gjt0 gjt0Var, List list, String str, Uri uri) {
        this.f82212a = list;
        this.f82213b = str;
        this.f82214c = uri;
        this.f82215d = gjt0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        dct0.m115298g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f82214c)));
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.f82212a;
        String str = this.f82213b;
        this.f82215d.zzQ((Map) obj, list, str);
    }
}

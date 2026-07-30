package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.measurement.internal.zznt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class hmy0 {

    /* JADX INFO: renamed from: a */
    public long f110681a;

    /* JADX INFO: renamed from: b */
    public zzfy$zzj f110682b;

    /* JADX INFO: renamed from: c */
    public String f110683c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f110684d;

    /* JADX INFO: renamed from: e */
    public zznt f110685e;

    public hmy0(long j, zzfy$zzj zzfy_zzj, String str, Map<String, String> map, zznt zzntVar) {
        this.f110681a = j;
        this.f110682b = zzfy_zzj;
        this.f110683c = str;
        this.f110684d = map;
        this.f110685e = zzntVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m136008a() {
        return this.f110681a;
    }

    /* JADX INFO: renamed from: b */
    public final aky0 m136009b() {
        return new aky0(this.f110683c, this.f110684d, this.f110685e);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final zzfy$zzj m136010c() {
        return this.f110682b;
    }

    /* JADX INFO: renamed from: d */
    public final String m136011d() {
        return this.f110683c;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m136012e() {
        return this.f110684d;
    }
}

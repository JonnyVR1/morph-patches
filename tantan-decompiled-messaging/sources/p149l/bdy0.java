package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.measurement.internal.zznt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bdy0 {

    /* JADX INFO: renamed from: a */
    public long f75083a;

    /* JADX INFO: renamed from: b */
    public zzfy$zzj f75084b;

    /* JADX INFO: renamed from: c */
    public String f75085c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f75086d;

    /* JADX INFO: renamed from: e */
    public zznt f75087e;

    public bdy0(long j, zzfy$zzj zzfy_zzj, String str, Map<String, String> map, zznt zzntVar) {
        this.f75083a = j;
        this.f75084b = zzfy_zzj;
        this.f75085c = str;
        this.f75086d = map;
        this.f75087e = zzntVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m101298a() {
        return this.f75083a;
    }

    /* JADX INFO: renamed from: b */
    public final uay0 m101299b() {
        return new uay0(this.f75085c, this.f75086d, this.f75087e);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final zzfy$zzj m101300c() {
        return this.f75084b;
    }

    /* JADX INFO: renamed from: d */
    public final String m101301d() {
        return this.f75085c;
    }

    /* JADX INFO: renamed from: e */
    public final Map<String, String> m101302e() {
        return this.f75086d;
    }
}

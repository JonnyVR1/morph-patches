package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zznt;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class uay0 {

    /* JADX INFO: renamed from: a */
    public String f175658a;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f175659b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public zznt f175660c;

    public uay0(String str, Map<String, String> map, zznt zzntVar) {
        this.f175658a = str;
        this.f175659b = map;
        this.f175660c = zzntVar;
    }

    /* JADX INFO: renamed from: a */
    public final zznt m192807a() {
        return this.f175660c;
    }

    /* JADX INFO: renamed from: b */
    public final String m192808b() {
        return this.f175658a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final Map<String, String> m192809c() {
        Map<String, String> map = this.f175659b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public uay0(String str, zznt zzntVar) {
        this.f175658a = str;
        this.f175660c = zzntVar;
    }
}

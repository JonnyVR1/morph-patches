package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zznt;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class aky0 {

    /* JADX INFO: renamed from: a */
    public String f72057a;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f72058b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public zznt f72059c;

    public aky0(String str, Map<String, String> map, zznt zzntVar) {
        this.f72057a = str;
        this.f72058b = map;
        this.f72059c = zzntVar;
    }

    /* JADX INFO: renamed from: a */
    public final zznt m98633a() {
        return this.f72059c;
    }

    /* JADX INFO: renamed from: b */
    public final String m98634b() {
        return this.f72057a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final Map<String, String> m98635c() {
        Map<String, String> map = this.f72058b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public aky0(String str, zznt zzntVar) {
        this.f72057a = str;
        this.f72059c = zzntVar;
    }
}

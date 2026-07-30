package p149l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class akl {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f70284a = new HashMap();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Map<String, String> f70285b;

    /* JADX INFO: renamed from: a */
    public synchronized Map<String, String> m97155a() {
        try {
            if (this.f70285b == null) {
                this.f70285b = Collections.unmodifiableMap(new HashMap(this.f70284a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f70285b;
    }
}

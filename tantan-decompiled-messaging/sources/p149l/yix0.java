package p149l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yix0 {

    /* JADX INFO: renamed from: a */
    public final Map f198561a = new HashMap();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Map f198562b;

    /* JADX INFO: renamed from: a */
    public final synchronized Map m215026a() {
        try {
            if (this.f198562b == null) {
                this.f198562b = Collections.unmodifiableMap(new HashMap(this.f198561a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f198562b;
    }
}

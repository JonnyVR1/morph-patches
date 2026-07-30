package p153l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class oml {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f147951a = new HashMap();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Map<String, String> f147952b;

    /* JADX INFO: renamed from: a */
    public synchronized Map<String, String> m168234a() {
        try {
            if (this.f147952b == null) {
                this.f147952b = Collections.unmodifiableMap(new HashMap(this.f147951a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f147952b;
    }
}

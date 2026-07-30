package p153l;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class esx0 {

    /* JADX INFO: renamed from: a */
    public final Map f95666a = new HashMap();

    /* JADX INFO: renamed from: b */
    @Nullable
    public Map f95667b;

    /* JADX INFO: renamed from: a */
    public final synchronized Map m122401a() {
        try {
            if (this.f95667b == null) {
                this.f95667b = Collections.unmodifiableMap(new HashMap(this.f95666a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f95667b;
    }
}

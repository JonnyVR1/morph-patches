package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public abstract class u7r<K, V> {

    /* JADX INFO: renamed from: a */
    @GuardedBy("instances")
    public final Map f175035a = new HashMap();

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public abstract V mo192147a(@NonNull K k);

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public V m192148b(@NonNull K k) {
        synchronized (this.f175035a) {
            try {
                if (this.f175035a.containsKey(k)) {
                    return (V) this.f175035a.get(k);
                }
                V vMo192147a = mo192147a(k);
                this.f175035a.put(k, vMo192147a);
                return vMo192147a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

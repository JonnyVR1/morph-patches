package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public abstract class w9r<K, V> {

    /* JADX INFO: renamed from: a */
    @GuardedBy("instances")
    public final Map f188056a = new HashMap();

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public abstract V mo100722a(@NonNull K k);

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public V m205622b(@NonNull K k) {
        synchronized (this.f188056a) {
            try {
                if (this.f188056a.containsKey(k)) {
                    return (V) this.f188056a.get(k);
                }
                V vMo100722a = mo100722a(k);
                this.f188056a.put(k, vMo100722a);
                return vMo100722a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

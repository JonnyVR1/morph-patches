package p149l;

import android.content.ContentResolver;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzgt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class rvw0 implements asw0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f161275a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    @Nullable
    @GuardedBy("this")
    public HashMap<String, String> f161276b = null;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public final HashMap<String, Boolean> f161277c = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final HashMap<String, Integer> f161278d = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public final HashMap<String, Long> f161279e = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public final HashMap<String, Float> f161280f = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: g */
    @Nullable
    @GuardedBy("this")
    public Object f161281g = null;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    public boolean f161282h = false;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    public String[] f161283i = new String[0];

    /* JADX INFO: renamed from: j */
    public final czw0 f161284j = new yww0();

    @Override // p149l.asw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo98631a(@Nullable ContentResolver contentResolver, String str, @Nullable String str2) {
        if (contentResolver == null) {
            qkq0.m175383a("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
        synchronized (this) {
            try {
                HashMap<String, String> map = this.f161276b;
                AtomicBoolean atomicBoolean = this.f161275a;
                if (map == null) {
                    atomicBoolean.set(false);
                    this.f161276b = new HashMap<>(16, 1.0f);
                    this.f161281g = new Object();
                    contentResolver.registerContentObserver(upw0.f177680a, true, new zxw0(this, null));
                } else if (atomicBoolean.getAndSet(false)) {
                    this.f161276b.clear();
                    this.f161277c.clear();
                    this.f161278d.clear();
                    this.f161279e.clear();
                    this.f161280f.clear();
                    this.f161281g = new Object();
                    this.f161282h = false;
                }
                Object obj = this.f161281g;
                if (this.f161276b.containsKey(str)) {
                    String str3 = this.f161276b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f161283i) {
                    if (str.startsWith(str4)) {
                        if (!this.f161282h) {
                            try {
                                HashMap<String, String> map2 = (HashMap) this.f161284j.mo109445b(contentResolver, this.f161283i, new h0x0() { // from class: l.muw0
                                    @Override // p149l.h0x0
                                    public final Map zza(int i) {
                                        return new HashMap(i, 1.0f);
                                    }
                                });
                                if (!map2.isEmpty()) {
                                    Set<String> setKeySet = map2.keySet();
                                    setKeySet.removeAll(this.f161277c.keySet());
                                    setKeySet.removeAll(this.f161278d.keySet());
                                    setKeySet.removeAll(this.f161279e.keySet());
                                    setKeySet.removeAll(this.f161280f.keySet());
                                }
                                if (!map2.isEmpty()) {
                                    if (this.f161276b.isEmpty()) {
                                        this.f161276b = map2;
                                    } else {
                                        this.f161276b.putAll(map2);
                                    }
                                }
                                this.f161282h = true;
                            } catch (zzgt unused) {
                            }
                            if (this.f161276b.containsKey(str)) {
                                String str5 = this.f161276b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String strMo109444a = this.f161284j.mo109444a(contentResolver, str);
                    if (strMo109444a != null && strMo109444a.equals(null)) {
                        strMo109444a = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f161281g) {
                                this.f161276b.put(str, strMo109444a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (strMo109444a != null) {
                        return strMo109444a;
                    }
                    return null;
                } catch (zzgt unused2) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

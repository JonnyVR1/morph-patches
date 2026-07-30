package p153l;

import android.content.ContentResolver;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzgt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class x4x0 implements g1x0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f192434a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    @Nullable
    @GuardedBy("this")
    public HashMap<String, String> f192435b = null;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public final HashMap<String, Boolean> f192436c = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final HashMap<String, Integer> f192437d = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public final HashMap<String, Long> f192438e = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public final HashMap<String, Float> f192439f = new HashMap<>(16, 1.0f);

    /* JADX INFO: renamed from: g */
    @Nullable
    @GuardedBy("this")
    public Object f192440g = null;

    /* JADX INFO: renamed from: h */
    @GuardedBy("this")
    public boolean f192441h = false;

    /* JADX INFO: renamed from: i */
    @GuardedBy("this")
    public String[] f192442i = new String[0];

    /* JADX INFO: renamed from: j */
    public final i8x0 f192443j = new e6x0();

    @Override // p153l.g1x0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo128573a(@Nullable ContentResolver contentResolver, String str, @Nullable String str2) {
        if (contentResolver == null) {
            wtq0.m207906a("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
        synchronized (this) {
            try {
                HashMap<String, String> map = this.f192435b;
                AtomicBoolean atomicBoolean = this.f192434a;
                if (map == null) {
                    atomicBoolean.set(false);
                    this.f192435b = new HashMap<>(16, 1.0f);
                    this.f192440g = new Object();
                    contentResolver.registerContentObserver(azw0.f74194a, true, new f7x0(this, null));
                } else if (atomicBoolean.getAndSet(false)) {
                    this.f192435b.clear();
                    this.f192436c.clear();
                    this.f192437d.clear();
                    this.f192438e.clear();
                    this.f192439f.clear();
                    this.f192440g = new Object();
                    this.f192441h = false;
                }
                Object obj = this.f192440g;
                if (this.f192435b.containsKey(str)) {
                    String str3 = this.f192435b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f192442i) {
                    if (str.startsWith(str4)) {
                        if (!this.f192441h) {
                            try {
                                HashMap<String, String> map2 = (HashMap) this.f192443j.mo119681b(contentResolver, this.f192442i, new n9x0() { // from class: l.s3x0
                                    @Override // p153l.n9x0
                                    public final Map zza(int i) {
                                        return new HashMap(i, 1.0f);
                                    }
                                });
                                if (!map2.isEmpty()) {
                                    Set<String> setKeySet = map2.keySet();
                                    setKeySet.removeAll(this.f192436c.keySet());
                                    setKeySet.removeAll(this.f192437d.keySet());
                                    setKeySet.removeAll(this.f192438e.keySet());
                                    setKeySet.removeAll(this.f192439f.keySet());
                                }
                                if (!map2.isEmpty()) {
                                    if (this.f192435b.isEmpty()) {
                                        this.f192435b = map2;
                                    } else {
                                        this.f192435b.putAll(map2);
                                    }
                                }
                                this.f192441h = true;
                            } catch (zzgt unused) {
                            }
                            if (this.f192435b.containsKey(str)) {
                                String str5 = this.f192435b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String strMo119680a = this.f192443j.mo119680a(contentResolver, str);
                    if (strMo119680a != null && strMo119680a.equals(null)) {
                        strMo119680a = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f192440g) {
                                this.f192435b.put(str, strMo119680a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (strMo119680a != null) {
                        return strMo119680a;
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

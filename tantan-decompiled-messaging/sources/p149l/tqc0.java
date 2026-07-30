package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class tqc0 {

    /* JADX INFO: renamed from: a */
    public final Map f171570a = new HashMap();

    /* JADX INFO: renamed from: l.tqc0$a */
    @KeepForSdk
    public static class C20246a {

        /* JADX INFO: renamed from: a */
        public final Class f171571a;

        /* JADX INFO: renamed from: b */
        public final Provider f171572b;

        @KeepForSdk
        public <RemoteT extends sqc0> C20246a(@NonNull Class<RemoteT> cls, @NonNull Provider<Object> provider) {
            this.f171571a = cls;
            this.f171572b = provider;
        }

        /* JADX INFO: renamed from: a */
        public final Provider m190089a() {
            return this.f171572b;
        }

        /* JADX INFO: renamed from: b */
        public final Class m190090b() {
            return this.f171571a;
        }
    }

    @KeepForSdk
    public tqc0(@NonNull Set<C20246a> set) {
        for (C20246a c20246a : set) {
            this.f171570a.put(c20246a.m190090b(), c20246a.m190089a());
        }
    }
}

package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class yyc0 {

    /* JADX INFO: renamed from: a */
    public final Map f202096a = new HashMap();

    /* JADX INFO: renamed from: l.yyc0$a */
    @KeepForSdk
    public static class C21722a {

        /* JADX INFO: renamed from: a */
        public final Class f202097a;

        /* JADX INFO: renamed from: b */
        public final Provider f202098b;

        @KeepForSdk
        public <RemoteT extends xyc0> C21722a(@NonNull Class<RemoteT> cls, @NonNull Provider<Object> provider) {
            this.f202097a = cls;
            this.f202098b = provider;
        }

        /* JADX INFO: renamed from: a */
        public final Provider m217959a() {
            return this.f202098b;
        }

        /* JADX INFO: renamed from: b */
        public final Class m217960b() {
            return this.f202097a;
        }
    }

    @KeepForSdk
    public yyc0(@NonNull Set<C21722a> set) {
        for (C21722a c21722a : set) {
            this.f202096a.put(c21722a.m217960b(), c21722a.m217959a());
        }
    }
}

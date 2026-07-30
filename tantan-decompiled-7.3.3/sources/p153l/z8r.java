package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class z8r {

    /* JADX INFO: renamed from: c */
    @NonNull
    public static final z8r f203411c = new C21779a().m219023a();

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Float f203412a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Executor f203413b;

    /* JADX INFO: renamed from: l.z8r$a */
    public static class C21779a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Float f203414a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Executor f203415b;

        @NonNull
        /* JADX INFO: renamed from: a */
        public z8r m219023a() {
            return new z8r(this.f203414a, this.f203415b, null);
        }
    }

    public /* synthetic */ z8r(Float f, Executor executor, ear0 ear0Var) {
        this.f203412a = f;
        this.f203413b = executor;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public Float m219021a() {
        return this.f203412a;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public Executor m219022b() {
        return this.f203413b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8r)) {
            return false;
        }
        z8r z8rVar = (z8r) obj;
        return Objects.equal(z8rVar.f203412a, this.f203412a) && Objects.equal(z8rVar.f203413b, this.f203413b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f203412a, this.f203413b);
    }
}

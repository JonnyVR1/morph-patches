package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class y6r {

    /* JADX INFO: renamed from: c */
    @NonNull
    public static final y6r f196633c = new C21328a().m213240a();

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Float f196634a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Executor f196635b;

    /* JADX INFO: renamed from: l.y6r$a */
    public static class C21328a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public Float f196636a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Executor f196637b;

        @NonNull
        /* JADX INFO: renamed from: a */
        public y6r m213240a() {
            return new y6r(this.f196636a, this.f196637b, null);
        }
    }

    public /* synthetic */ y6r(Float f, Executor executor, y0r0 y0r0Var) {
        this.f196634a = f;
        this.f196635b = executor;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public Float m213238a() {
        return this.f196634a;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public Executor m213239b() {
        return this.f196635b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6r)) {
            return false;
        }
        y6r y6rVar = (y6r) obj;
        return Objects.equal(y6rVar.f196634a, this.f196634a) && Objects.equal(y6rVar.f196635b, this.f196635b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f196634a, this.f196635b);
    }
}

package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaqj;

/* JADX INFO: loaded from: classes6.dex */
public final class jnr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f118881a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final emr0 f118882b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final zzaqj f118883c;

    /* JADX INFO: renamed from: d */
    public boolean f118884d;

    public jnr0(zzaqj zzaqjVar) {
        this.f118884d = false;
        this.f118881a = null;
        this.f118882b = null;
        this.f118883c = zzaqjVar;
    }

    /* JADX INFO: renamed from: a */
    public static jnr0 m142386a(zzaqj zzaqjVar) {
        return new jnr0(zzaqjVar);
    }

    /* JADX INFO: renamed from: b */
    public static jnr0 m142387b(@Nullable Object obj, @Nullable emr0 emr0Var) {
        return new jnr0(obj, emr0Var);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m142388c() {
        return this.f118883c == null;
    }

    public jnr0(@Nullable Object obj, @Nullable emr0 emr0Var) {
        this.f118884d = false;
        this.f118881a = obj;
        this.f118882b = emr0Var;
        this.f118883c = null;
    }
}

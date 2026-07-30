package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaqj;

/* JADX INFO: loaded from: classes6.dex */
public final class pwr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f154433a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final kvr0 f154434b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final zzaqj f154435c;

    /* JADX INFO: renamed from: d */
    public boolean f154436d;

    public pwr0(zzaqj zzaqjVar) {
        this.f154436d = false;
        this.f154433a = null;
        this.f154434b = null;
        this.f154435c = zzaqjVar;
    }

    /* JADX INFO: renamed from: a */
    public static pwr0 m174087a(zzaqj zzaqjVar) {
        return new pwr0(zzaqjVar);
    }

    /* JADX INFO: renamed from: b */
    public static pwr0 m174088b(@Nullable Object obj, @Nullable kvr0 kvr0Var) {
        return new pwr0(obj, kvr0Var);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m174089c() {
        return this.f154435c == null;
    }

    public pwr0(@Nullable Object obj, @Nullable kvr0 kvr0Var) {
        this.f154436d = false;
        this.f154433a = obj;
        this.f154434b = kvr0Var;
        this.f154435c = null;
    }
}

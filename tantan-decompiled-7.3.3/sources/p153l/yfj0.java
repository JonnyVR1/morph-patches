package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yfj0 implements InterfaceC1886e {

    /* JADX INFO: renamed from: c */
    public static final String f199530c = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: d */
    public static final String f199531d = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1886e.a<yfj0> f199532e = new InterfaceC1886e.a() { // from class: l.xfj0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return yfj0.m215615a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final dfj0 f199533a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<Integer> f199534b;

    public yfj0(dfj0 dfj0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= dfj0Var.f88159a)) {
            onl.m168333a();
            throw null;
        }
        this.f199533a = dfj0Var;
        this.f199534b = ImmutableList.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ yfj0 m215615a(Bundle bundle) {
        return new yfj0((dfj0) dfj0.f88158h.mo10034a((Bundle) w11.m204369e(bundle.getBundle(f199530c))), Ints.m16513c((int[]) w11.m204369e(bundle.getIntArray(f199531d))));
    }

    /* JADX INFO: renamed from: b */
    public int m215616b() {
        return this.f199533a.f88161c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yfj0.class == obj.getClass()) {
            yfj0 yfj0Var = (yfj0) obj;
            if (this.f199533a.equals(yfj0Var.f199533a) && this.f199534b.equals(yfj0Var.f199534b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f199533a.hashCode() + (this.f199534b.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f199530c, this.f199533a.toBundle());
        bundle.putIntArray(f199531d, Ints.m16524n(this.f199534b));
        return bundle;
    }
}

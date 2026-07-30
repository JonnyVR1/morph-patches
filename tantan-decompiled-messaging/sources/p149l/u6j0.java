package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class u6j0 implements InterfaceC1863e {

    /* JADX INFO: renamed from: c */
    public static final String f174842c = vck0.m197903z0(0);

    /* JADX INFO: renamed from: d */
    public static final String f174843d = vck0.m197903z0(1);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC1863e.a<u6j0> f174844e = new InterfaceC1863e.a() { // from class: l.t6j0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return u6j0.m191978a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final z5j0 f174845a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<Integer> f174846b;

    public u6j0(z5j0 z5j0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= z5j0Var.f201817a)) {
            zkl.m219192a();
            throw null;
        }
        this.f174845a = z5j0Var;
        this.f174846b = ImmutableList.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ u6j0 m191978a(Bundle bundle) {
        return new u6j0((z5j0) z5j0.f201816h.mo9980a((Bundle) p11.m167011e(bundle.getBundle(f174842c))), Ints.m16458c((int[]) p11.m167011e(bundle.getIntArray(f174843d))));
    }

    /* JADX INFO: renamed from: b */
    public int m191979b() {
        return this.f174845a.f201819c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u6j0.class == obj.getClass()) {
            u6j0 u6j0Var = (u6j0) obj;
            if (this.f174845a.equals(u6j0Var.f174845a) && this.f174846b.equals(u6j0Var.f174846b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f174845a.hashCode() + (this.f174846b.hashCode() * 31);
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f174842c, this.f174845a.toBundle());
        bundle.putIntArray(f174843d, Ints.m16469n(this.f174846b));
        return bundle;
    }
}

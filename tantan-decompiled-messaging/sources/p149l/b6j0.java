package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class b6j0 implements InterfaceC1863e {

    /* JADX INFO: renamed from: d */
    public static final b6j0 f73823d = new b6j0(new z5j0[0]);

    /* JADX INFO: renamed from: e */
    public static final String f73824e = vck0.m197903z0(0);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC1863e.a<b6j0> f73825f = new InterfaceC1863e.a() { // from class: l.a6j0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return b6j0.m100408a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f73826a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<z5j0> f73827b;

    /* JADX INFO: renamed from: c */
    public int f73828c;

    public b6j0(z5j0... z5j0VarArr) {
        this.f73827b = ImmutableList.copyOf(z5j0VarArr);
        this.f73826a = z5j0VarArr.length;
        m100409d();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ b6j0 m100408a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f73824e);
        return parcelableArrayList == null ? new b6j0(new z5j0[0]) : new b6j0((z5j0[]) oi3.m164495d(z5j0.f201816h, parcelableArrayList).toArray(new z5j0[0]));
    }

    /* JADX INFO: renamed from: d */
    private void m100409d() {
        int i = 0;
        while (i < this.f73827b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f73827b.size(); i3++) {
                if (this.f73827b.get(i).equals(this.f73827b.get(i3))) {
                    jwv.m143684d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public z5j0 m100410b(int i) {
        return this.f73827b.get(i);
    }

    /* JADX INFO: renamed from: c */
    public int m100411c(z5j0 z5j0Var) {
        int iIndexOf = this.f73827b.indexOf(z5j0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b6j0.class == obj.getClass()) {
            b6j0 b6j0Var = (b6j0) obj;
            if (this.f73826a == b6j0Var.f73826a && this.f73827b.equals(b6j0Var.f73827b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f73828c == 0) {
            this.f73828c = this.f73827b.hashCode();
        }
        return this.f73828c;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f73824e, oi3.m164500i(this.f73827b));
        return bundle;
    }
}

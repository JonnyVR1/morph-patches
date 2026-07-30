package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ffj0 implements InterfaceC1886e {

    /* JADX INFO: renamed from: d */
    public static final ffj0 f98782d = new ffj0(new dfj0[0]);

    /* JADX INFO: renamed from: e */
    public static final String f98783e = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC1886e.a<ffj0> f98784f = new InterfaceC1886e.a() { // from class: l.efj0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return ffj0.m125385a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f98785a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<dfj0> f98786b;

    /* JADX INFO: renamed from: c */
    public int f98787c;

    public ffj0(dfj0... dfj0VarArr) {
        this.f98786b = ImmutableList.copyOf(dfj0VarArr);
        this.f98785a = dfj0VarArr.length;
        m125386d();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ffj0 m125385a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f98783e);
        return parcelableArrayList == null ? new ffj0(new dfj0[0]) : new ffj0((dfj0[]) cj3.m110054d(dfj0.f88158h, parcelableArrayList).toArray(new dfj0[0]));
    }

    /* JADX INFO: renamed from: d */
    private void m125386d() {
        int i = 0;
        while (i < this.f98786b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f98786b.size(); i3++) {
                if (this.f98786b.get(i).equals(this.f98786b.get(i3))) {
                    kyv.m152146d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public dfj0 m125387b(int i) {
        return this.f98786b.get(i);
    }

    /* JADX INFO: renamed from: c */
    public int m125388c(dfj0 dfj0Var) {
        int iIndexOf = this.f98786b.indexOf(dfj0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ffj0.class == obj.getClass()) {
            ffj0 ffj0Var = (ffj0) obj;
            if (this.f98785a == ffj0Var.f98785a && this.f98786b.equals(ffj0Var.f98786b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f98787c == 0) {
            this.f98787c = this.f98786b.hashCode();
        }
        return this.f98787c;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f98783e, cj3.m110059i(this.f98786b));
        return bundle;
    }
}

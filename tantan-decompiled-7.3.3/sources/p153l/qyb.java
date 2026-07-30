package p153l;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qyb implements InterfaceC1886e {

    /* JADX INFO: renamed from: c */
    public static final qyb f160127c = new qyb(ImmutableList.m15739of(), 0);

    /* JADX INFO: renamed from: d */
    public static final String f160128d = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: e */
    public static final String f160129e = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC1886e.a<qyb> f160130f = new InterfaceC1886e.a() { // from class: l.pyb
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return qyb.m178630c(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final ImmutableList<myb> f160131a;

    /* JADX INFO: renamed from: b */
    public final long f160132b;

    public qyb(List<myb> list, long j) {
        this.f160131a = ImmutableList.copyOf((Collection) list);
        this.f160132b = j;
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList<myb> m178629b(List<myb> list) {
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f139370d == null) {
                c2804aBuilder.mo15737a(list.get(i));
            }
        }
        return c2804aBuilder.m15756m();
    }

    /* JADX INFO: renamed from: c */
    public static final qyb m178630c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f160128d);
        return new qyb(parcelableArrayList == null ? ImmutableList.m15739of() : cj3.m110054d(myb.f139357J, parcelableArrayList), bundle.getLong(f160129e));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f160128d, cj3.m110059i(m178629b(this.f160131a)));
        bundle.putLong(f160129e, this.f160132b);
        return bundle;
    }
}

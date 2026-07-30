package p149l;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cxb implements InterfaceC1863e {

    /* JADX INFO: renamed from: c */
    public static final cxb f82862c = new cxb(ImmutableList.m15685of(), 0);

    /* JADX INFO: renamed from: d */
    public static final String f82863d = vck0.m197903z0(0);

    /* JADX INFO: renamed from: e */
    public static final String f82864e = vck0.m197903z0(1);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC1863e.a<cxb> f82865f = new InterfaceC1863e.a() { // from class: l.bxb
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return cxb.m109090c(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final ImmutableList<ywb> f82866a;

    /* JADX INFO: renamed from: b */
    public final long f82867b;

    public cxb(List<ywb> list, long j) {
        this.f82866a = ImmutableList.copyOf((Collection) list);
        this.f82867b = j;
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList<ywb> m109089b(List<ywb> list) {
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f200434d == null) {
                c2781aBuilder.mo15683a(list.get(i));
            }
        }
        return c2781aBuilder.m15702m();
    }

    /* JADX INFO: renamed from: c */
    public static final cxb m109090c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f82863d);
        return new cxb(parcelableArrayList == null ? ImmutableList.m15685of() : oi3.m164495d(ywb.f200421J, parcelableArrayList), bundle.getLong(f82864e));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f82863d, oi3.m164500i(m109089b(this.f82866a)));
        bundle.putLong(f82864e, this.f82867b);
        return bundle;
    }
}

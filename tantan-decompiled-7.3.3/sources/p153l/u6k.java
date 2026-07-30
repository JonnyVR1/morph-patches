package p153l;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
public class u6k extends fmj {

    /* JADX INFO: renamed from: a */
    public final Geocoder f177792a;

    public u6k(Context context) {
        this.f177792a = new Geocoder(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ j6k m194715g(double d, double d2, List list) {
        if (!jyb.m147479J(list)) {
            return new j6k(d, d2, (Address) list.get(0));
        }
        gzi0.m133102a("Failed to found any address from(%s,%s)", new Object[]{Double.valueOf(d), Double.valueOf(d2)});
        return null;
    }

    @Override // p153l.fmj
    /* JADX INFO: renamed from: d */
    public C22421c<z80> m126237b(final double d, final double d2) {
        C22507a c22507aM222758b = C22507a.m222758b();
        C22421c.fromCallable(new Callable() { // from class: l.s6k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f166582a.m194716h(d, d2);
            }
        }).map(new qcj() { // from class: l.t6k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u6k.m194715g(d, d2, (List) obj);
            }
        }).compose(psd0.m173592C()).subscribe(c22507aM222758b);
        return c22507aM222758b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List m194716h(double d, double d2) throws Exception {
        return this.f177792a.getFromLocation(d, d2, 1);
    }
}

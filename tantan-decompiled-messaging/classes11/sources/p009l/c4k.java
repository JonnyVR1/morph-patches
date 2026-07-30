package p009l;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.concurrent.Callable;
import l.dqi0;
import l.mkd0;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class c4k extends mjj {

    /* JADX INFO: renamed from: a */
    public final Geocoder f10432a;

    public c4k(Context context) {
        this.f10432a = new Geocoder(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ r3k m12355g(double d, double d2, List list) {
        if (!vwb.J(list)) {
            return new r3k(d, d2, (Address) list.get(0));
        }
        dqi0.a("Failed to found any address from(%s,%s)", new Object[]{Double.valueOf(d), Double.valueOf(d2)});
        return null;
    }

    @Override // p009l.mjj
    /* JADX INFO: renamed from: d */
    public c<d90> m18516b(final double d, final double d2) {
        a aVarB = a.b();
        c.fromCallable(new Callable() { // from class: l.a4k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9206a.m12357h(d, d2);
            }
        }).map(new w9j() { // from class: l.b4k
            public final Object call(Object obj) {
                return c4k.m12355g(d, d2, (List) obj);
            }
        }).compose(mkd0.C()).subscribe(aVarB);
        return aVarB;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List m12357h(double d, double d2) throws Exception {
        return this.f10432a.getFromLocation(d, d2, 1);
    }
}

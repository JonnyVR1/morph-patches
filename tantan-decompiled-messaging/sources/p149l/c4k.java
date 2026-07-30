package p149l;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class c4k extends mjj {

    /* JADX INFO: renamed from: a */
    public final Geocoder f79277a;

    public c4k(Context context) {
        this.f79277a = new Geocoder(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ r3k m105222g(double d, double d2, List list) {
        if (!vwb.m200296J(list)) {
            return new r3k(d, d2, (Address) list.get(0));
        }
        dqi0.m113073a("Failed to found any address from(%s,%s)", new Object[]{Double.valueOf(d), Double.valueOf(d2)});
        return null;
    }

    @Override // p149l.mjj
    /* JADX INFO: renamed from: d */
    public C22306c<d90> m154843b(final double d, final double d2) {
        C22392a c22392aM221512b = C22392a.m221512b();
        C22306c.fromCallable(new Callable() { // from class: l.a4k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67538a.m105224h(d, d2);
            }
        }).map(new w9j() { // from class: l.b4k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return c4k.m105222g(d, d2, (List) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(c22392aM221512b);
        return c22392aM221512b;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List m105224h(double d, double d2) throws Exception {
        return this.f79277a.getFromLocation(d, d2, 1);
    }
}

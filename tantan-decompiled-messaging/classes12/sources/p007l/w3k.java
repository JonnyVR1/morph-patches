package p007l;

import android.location.Address;
import android.location.Geocoder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import l.e30;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w3k implements eml {

    /* JADX INFO: renamed from: a */
    public eml.InterfaceC2379a f14391a;

    public w3k(eml.InterfaceC2379a interfaceC2379a) {
        this.f14391a = interfaceC2379a;
    }

    @Override // p007l.eml
    /* JADX INFO: renamed from: a */
    public void mo9600a(final Location location, final Act act) {
        act.duringCreated(c.fromCallable(new Callable() { // from class: l.s3k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Act act2 = act;
                Location location2 = location;
                return new Geocoder(act2).getFromLocation(location2.u(), location2.x(), 10);
            }
        }).compose(mkd0.C())).subscribe(mkd0.H(new e30() { // from class: l.t3k
            public final void call(Object obj) {
                this.f13181a.m15688g(location, (List) obj);
            }
        }, new e30() { // from class: l.u3k
            public final void call(Object obj) {
                this.f13524a.m15689h((Throwable) obj);
            }
        }));
    }

    @Override // p007l.eml
    /* JADX INFO: renamed from: b */
    public boolean mo9601b() {
        return qib0.v;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m15688g(Location location, List list) {
        if (vwb.J(list)) {
            this.f14391a.onError(new IllegalArgumentException(String.format("No address found at location(%s,%s)", Double.valueOf(location.u()), Double.valueOf(location.x()))));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Address address = (Address) it.next();
            if (address.getFeatureName() != null && vwb.r(arrayList, new w9j() { // from class: l.v3k
                public final Object call(Object obj) {
                    return Boolean.valueOf(address.getFeatureName().equals(((k90) obj).m11398c()));
                }
            }) == null) {
                if (!address.hasLatitude() || !address.hasLongitude()) {
                    address.setLatitude(location.u());
                    address.setLongitude(location.x());
                }
                arrayList.add(new k90(address));
            }
        }
        arrayList.add(0, new k90());
        if (NullChecker.a(this.f14391a)) {
            this.f14391a.mo9933a(arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m15689h(Throwable th) {
        this.f14391a.onError(th);
        CrashHelper.c(new Throwable("GoogleAddressProvider: tr" + th.getMessage(), th));
    }

    @Override // p007l.eml
    public void destroy() {
    }

    @Override // p007l.eml
    public void init() {
    }
}

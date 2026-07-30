package p153l;

import android.location.Address;
import android.location.Geocoder;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class o6k implements qol {

    /* JADX INFO: renamed from: a */
    public qol.InterfaceC19615a f145190a;

    public o6k(qol.InterfaceC19615a interfaceC19615a) {
        this.f145190a = interfaceC19615a;
    }

    @Override // p153l.qol
    /* JADX INFO: renamed from: a */
    public void mo119236a(final Location location, final Act act) {
        act.duringCreated(C22421c.fromCallable(new Callable() { // from class: l.k6k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Act act2 = act;
                Location location2 = location;
                return new Geocoder(act2).getFromLocation(location2.m80014u(), location2.m80016x(), 10);
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173597H(new y20() { // from class: l.l6k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130265a.m166264g(location, (List) obj);
            }
        }, new y20() { // from class: l.m6k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135013a.m166265h((Throwable) obj);
            }
        }));
    }

    @Override // p153l.qol
    /* JADX INFO: renamed from: b */
    public boolean mo119237b() {
        return uqb0.f180419v;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m166264g(Location location, List list) {
        if (jyb.m147479J(list)) {
            this.f145190a.onError(new IllegalArgumentException(String.format("No address found at location(%s,%s)", Double.valueOf(location.m80014u()), Double.valueOf(location.m80016x()))));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Address address = (Address) it.next();
            if (address.getFeatureName() != null && jyb.m147529r(arrayList, new qcj() { // from class: l.n6k
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(address.getFeatureName().equals(((g90) obj).m129468c()));
                }
            }) == null) {
                if (!address.hasLatitude() || !address.hasLongitude()) {
                    address.setLatitude(location.m80014u());
                    address.setLongitude(location.m80016x());
                }
                arrayList.add(new g90(address));
            }
        }
        arrayList.add(0, new g90());
        if (NullChecker.m82486a(this.f145190a)) {
            this.f145190a.mo146707a(arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m166265h(Throwable th) {
        this.f145190a.onError(th);
        CrashHelper.m82479c(new Throwable("GoogleAddressProvider: tr" + th.getMessage(), th));
    }

    @Override // p153l.qol
    public void destroy() {
    }

    @Override // p153l.qol
    public void init() {
    }
}

package p149l;

import android.location.Address;
import android.location.Geocoder;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class w3k implements eml {

    /* JADX INFO: renamed from: a */
    public eml.InterfaceC16646a f184400a;

    public w3k(eml.InterfaceC16646a interfaceC16646a) {
        this.f184400a = interfaceC16646a;
    }

    @Override // p149l.eml
    /* JADX INFO: renamed from: a */
    public void mo114573a(final Location location, final Act act) {
        act.duringCreated(C22306c.fromCallable(new Callable() { // from class: l.s3k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Act act2 = act;
                Location location2 = location;
                return new Geocoder(act2).getFromLocation(location2.m78831u(), location2.m78833x(), 10);
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154956H(new e30() { // from class: l.t3k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167641a.m201323g(location, (List) obj);
            }
        }, new e30() { // from class: l.u3k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173624a.m201324h((Throwable) obj);
            }
        }));
    }

    @Override // p149l.eml
    /* JADX INFO: renamed from: b */
    public boolean mo114574b() {
        return qib0.f154736v;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m201323g(Location location, List list) {
        if (vwb.m200296J(list)) {
            this.f184400a.onError(new IllegalArgumentException(String.format("No address found at location(%s,%s)", Double.valueOf(location.m78831u()), Double.valueOf(location.m78833x()))));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Address address = (Address) it.next();
            if (address.getFeatureName() != null && vwb.m200346r(arrayList, new w9j() { // from class: l.v3k
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(address.getFeatureName().equals(((k90) obj).m144984c()));
                }
            }) == null) {
                if (!address.hasLatitude() || !address.hasLongitude()) {
                    address.setLatitude(location.m78831u());
                    address.setLongitude(location.m78833x());
                }
                arrayList.add(new k90(address));
            }
        }
        arrayList.add(0, new k90());
        if (NullChecker.m81303a(this.f184400a)) {
            this.f184400a.mo117206a(arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m201324h(Throwable th) {
        this.f184400a.onError(th);
        CrashHelper.m81296c(new Throwable("GoogleAddressProvider: tr" + th.getMessage(), th));
    }

    @Override // p149l.eml
    public void destroy() {
    }

    @Override // p149l.eml
    public void init() {
    }
}

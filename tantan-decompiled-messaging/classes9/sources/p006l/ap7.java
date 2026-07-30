package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.Contact;
import com.tantanapp.common.data.JsonAdapter;
import java.util.List;
import l.mkd0;
import l.roj0;
import l.utc0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ap7 extends ax6 {
    public ap7(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: c3 */
    public static c<roj0> m12176c3() {
        return new ka20(new v9j() { // from class: l.yo7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/contacts")).d().b();
            }
        }, JsonAdapter.UNIT_ADAPTER).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: d3 */
    public static c<roj0> m12177d3(List<Contact> list) {
        final CoreData coreData = new CoreData();
        coreData.contacts = list;
        return new ka20(new v9j() { // from class: l.zo7
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/contacts")).l(utc0.create(Network.JSON, coreData.toJson())).b();
            }
        }, JsonAdapter.UNIT_ADAPTER);
    }
}

package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Contact;
import com.tantanapp.common.data.JsonAdapter;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class eq7 extends dy6 {
    public eq7(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22421c<uxj0> m121900c3() {
        return new si20(new pcj() { // from class: l.cq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/contacts")).m209030d().m209028b();
            }
        }, JsonAdapter.UNIT_ADAPTER).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: d3 */
    public static C22421c<uxj0> m121901d3(List<Contact> list) {
        final CoreData coreData = new CoreData();
        coreData.contacts = list;
        return new si20(new pcj() { // from class: l.dq7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/contacts")).m209038l(z1d0.create(Network.JSON, coreData.toJson())).m209028b();
            }
        }, JsonAdapter.UNIT_ADAPTER);
    }
}

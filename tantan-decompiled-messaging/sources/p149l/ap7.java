package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Contact;
import com.tantanapp.common.data.JsonAdapter;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ap7 extends ax6 {
    public ap7(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: c3 */
    public static C22306c<roj0> m98031c3() {
        return new ka20(new v9j() { // from class: l.yo7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/contacts")).m185885d().m185883b();
            }
        }, JsonAdapter.UNIT_ADAPTER).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: d3 */
    public static C22306c<roj0> m98032d3(List<Contact> list) {
        final CoreData coreData = new CoreData();
        coreData.contacts = list;
        return new ka20(new v9j() { // from class: l.zo7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/contacts")).m185893l(utc0.create(Network.JSON, coreData.toJson())).m185883b();
            }
        }, JsonAdapter.UNIT_ADAPTER);
    }
}

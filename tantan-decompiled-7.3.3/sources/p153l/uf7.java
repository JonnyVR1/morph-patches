package p153l;

import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.TacitTestProfileCard;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class uf7 extends dy6 {
    public uf7(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public C22421c<TacitTestProfileCard> m195827d3(String str, String str2) {
        final String str3 = "/tacitTest/bothSidesState?userId=" + str + "&otherUserId=" + str2;
        return this.f91137Q.scheduled(str3, 0, new pcj() { // from class: l.rf7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.sf7
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(xi5.m211107i(str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.tf7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).tacitTest;
                    }
                });
            }
        });
    }
}

package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Surveys;
import com.p051p1.mobile.putong.data.Envelope;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class q7b extends dy6 {
    public q7b(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22421c m175635d3(String str, final String str2) {
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, str);
        return new ti20(new pcj() { // from class: l.o7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32372x1("/" + str2)).m209038l(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.p7b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).surveys;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: g3 */
    public C22421c<List<Surveys>> m175638g3(final String str) {
        return this.f91137Q.scheduled("loadSurveysData", 0, new pcj() { // from class: l.k7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.l7b
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32349r2("/" + str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.m7b
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).surveys;
                    }
                }).compose(psd0.m173592C());
            }
        }, false);
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<List<Surveys>> m175639h3(final String str, final String str2) {
        return this.f91137Q.scheduled("postSurveys", -1, new pcj() { // from class: l.n7b
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return q7b.m175635d3(str, str2);
            }
        });
    }
}

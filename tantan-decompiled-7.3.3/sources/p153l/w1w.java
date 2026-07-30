package p153l;

import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Connector;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class w1w extends xi5 {
    public w1w(xi5 xi5Var) {
        super(xi5Var);
    }

    /* JADX INFO: renamed from: A */
    public static String m204472A() {
        return xi5.m211107i("/metadata");
    }

    /* JADX INFO: renamed from: B */
    public static String m204473B() {
        return xi5.m211107i("/live-metadata");
    }

    /* JADX INFO: renamed from: C */
    public C22421c<Connector> m204477C(int i) {
        final String strM204472A = i != 2 ? m204472A() : m204473B();
        return scheduled("longlink/dispatcher" + i, 0, new pcj() { // from class: l.t1w
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.u1w
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return xi5.network.auth().m209043q(str).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.v1w
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CommonData) ((Envelope) obj).getModuleData(CommonData.class)).connector;
                    }
                }).compose(psd0.m173592C());
            }
        });
    }
}

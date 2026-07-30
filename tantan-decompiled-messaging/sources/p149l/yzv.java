package p149l;

import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Connector;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class yzv extends xh5 {
    public yzv(xh5 xh5Var) {
        super(xh5Var);
    }

    /* JADX INFO: renamed from: A */
    public static String m216698A() {
        return xh5.m208761i("/metadata");
    }

    /* JADX INFO: renamed from: B */
    public static String m216699B() {
        return xh5.m208761i("/live-metadata");
    }

    /* JADX INFO: renamed from: C */
    public C22306c<Connector> m216703C(int i) {
        final String strM216698A = i != 2 ? m216698A() : m216699B();
        return scheduled("longlink/dispatcher" + i, 0, new v9j() { // from class: l.vzv
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.wzv
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xh5.network.auth().m185898q(str).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.xzv
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CommonData) ((Envelope) obj).getModuleData(CommonData.class)).connector;
                    }
                }).compose(mkd0.m154951C());
            }
        });
    }
}

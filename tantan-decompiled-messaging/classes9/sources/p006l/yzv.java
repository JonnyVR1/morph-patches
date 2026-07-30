package p006l;

import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Connector;
import com.p1.mobile.putong.data.Envelope;
import l.mkd0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yzv extends xh5 {
    public yzv(xh5 xh5Var) {
        super(xh5Var);
    }

    /* JADX INFO: renamed from: A */
    public static String m28518A() {
        return xh5.m27250i("/metadata");
    }

    /* JADX INFO: renamed from: B */
    public static String m28519B() {
        return xh5.m27250i("/live-metadata");
    }

    /* JADX INFO: renamed from: C */
    public c<Connector> m28523C(int i) {
        final String strM28518A = i != 2 ? m28518A() : m28519B();
        return scheduled("longlink/dispatcher" + i, 0, new v9j() { // from class: l.vzv
            public final Object call() {
                return new la20(new v9j() { // from class: l.wzv
                    public final Object call() {
                        return xh5.network.auth().q(str).f().b();
                    }
                }).map(new w9j() { // from class: l.xzv
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CommonData.class).connector;
                    }
                }).compose(mkd0.C());
            }
        });
    }
}

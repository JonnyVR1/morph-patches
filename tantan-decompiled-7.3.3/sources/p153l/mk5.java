package p153l;

import com.p051p1.mobile.putong.data.MiniWidgetEnvelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class mk5 extends xi5 {
    public mk5(xi5 xi5Var) {
        super(xi5Var);
    }

    /* JADX INFO: renamed from: z */
    public C22421c<MiniWidgetEnvelope> m158703z(final String str) {
        final pcj pcjVar = new pcj() { // from class: l.kk5
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(xi5.m211112n("/module/tietie/info?user_id=") + str).m209032f().m209028b();
            }
        };
        return scheduled("get_widget_status" + str, 0, new pcj() { // from class: l.lk5
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, MiniWidgetEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
            }
        }, false);
    }
}

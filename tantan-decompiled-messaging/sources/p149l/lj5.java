package p149l;

import com.p046p1.mobile.putong.data.MiniWidgetEnvelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class lj5 extends xh5 {
    public lj5(xh5 xh5Var) {
        super(xh5Var);
    }

    /* JADX INFO: renamed from: z */
    public C22306c<MiniWidgetEnvelope> m149957z(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.jj5
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(xh5.m208766n("/module/tietie/info?user_id=") + str).m185887f().m185883b();
            }
        };
        return scheduled("get_widget_status" + str, 0, new v9j() { // from class: l.kj5
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, MiniWidgetEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        }, false);
    }
}

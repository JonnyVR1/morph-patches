package p006l;

import com.p1.mobile.putong.data.MiniWidgetEnvelope;
import l.mkd0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lj5 extends xh5 {
    public lj5(xh5 xh5Var) {
        super(xh5Var);
    }

    /* JADX INFO: renamed from: z */
    public c<MiniWidgetEnvelope> m18799z(final String str) {
        final v9j v9jVar = new v9j() { // from class: l.jj5
            public final Object call() {
                return qib0.f19784H.auth().q(xh5.m27255n("/module/tietie/info?user_id=") + str).f().b();
            }
        };
        return scheduled("get_widget_status" + str, 0, new v9j() { // from class: l.kj5
            public final Object call() {
                return new ka20(v9jVar, MiniWidgetEnvelope.JSON_ADAPTER).compose(mkd0.C());
            }
        }, false);
    }
}

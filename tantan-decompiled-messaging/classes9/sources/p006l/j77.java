package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.hpd0;
import l.jo0;
import l.roj0;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j77 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final hpd0 f15041R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f15042S;

    public j77(C0158c c0158c) {
        super(c0158c);
        String str = "need_refresh_ai_1v1_conversation_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.TRUE;
        this.f15041R = new hpd0(str, bool);
        this.f15042S = new hpd0("need_del_local_ai_1v1_conversation_" + CoreModule.m1850H().userId(), bool);
    }

    /* JADX INFO: renamed from: c3 */
    public c<Boolean> m17329c3() {
        return c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.h77
            public final Object call(Object obj) {
                return this.f13724a.m17330d3((roj0) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m17330d3(roj0 roj0Var) {
        if (!NullChecker.a(CoreModule.f1534c.f3631f0.m4665Mo("-10025"))) {
            return Boolean.FALSE;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.i77
            public final void call() {
                CoreModule.f1534c.f3631f0.m4658Mh("-10025");
            }
        });
        return Boolean.TRUE;
    }
}

package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.du2;
import l.jo0;
import l.roj0;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qw6 extends ax6 {
    public qw6(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: c3 */
    public c<Boolean> m22428c3() {
        du2.a("DbCheck", "deleteAiStory step 1");
        return c.just(roj0.a).observeOn(Schedulers.io()).map(new w9j() { // from class: l.ow6
            public final Object call(Object obj) {
                return this.f18413a.m22429d3((roj0) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m22429d3(roj0 roj0Var) {
        du2.a("DbCheck", "deleteAiStory step 2");
        if (!NullChecker.a(CoreModule.f1534c.f3631f0.m4665Mo("-10021"))) {
            return Boolean.FALSE;
        }
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.pw6
            public final void call() {
                CoreModule.f1534c.f3631f0.m4658Mh("-10021");
            }
        });
        return Boolean.TRUE;
    }
}

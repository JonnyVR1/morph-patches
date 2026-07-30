package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class qw6 extends ax6 {
    public qw6(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<Boolean> m176776c3() {
        du2.m113670a("DbCheck", "deleteAiStory step 1");
        return C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.ow6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145963a.m176777d3((roj0) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m176777d3(roj0 roj0Var) {
        du2.m113670a("DbCheck", "deleteAiStory step 2");
        if (!NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32735Mo(User.ID_AI_STORY))) {
            return Boolean.FALSE;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.pw6
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32728Mh(User.ID_AI_STORY);
            }
        });
        return Boolean.TRUE;
    }
}

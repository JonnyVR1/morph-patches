package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class tx6 extends dy6 {
    public tx6(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<Boolean> m193484c3() {
        tu2.m192703a("DbCheck", "deleteAiStory step 1");
        return C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.rx6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165298a.m193485d3((uxj0) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m193485d3(uxj0 uxj0Var) {
        tu2.m192703a("DbCheck", "deleteAiStory step 2");
        if (!NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33738Mo(User.ID_AI_STORY))) {
            return Boolean.FALSE;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.sx6
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33731Mh(User.ID_AI_STORY);
            }
        });
        return Boolean.TRUE;
    }
}

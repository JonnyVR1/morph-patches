package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class j77 extends ax6 {

    /* JADX INFO: renamed from: R */
    public final hpd0 f116566R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f116567S;

    public j77(C4732c c4732c) {
        super(c4732c);
        String str = "need_refresh_ai_1v1_conversation_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.TRUE;
        this.f116566R = new hpd0(str, bool);
        this.f116567S = new hpd0("need_del_local_ai_1v1_conversation_" + CoreModule.m29931H().userId(), bool);
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<Boolean> m140079c3() {
        return C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.h77
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106198a.m140080d3((roj0) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m140080d3(roj0 roj0Var) {
        if (!NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32735Mo(User.ID_AI_1V1))) {
            return Boolean.FALSE;
        }
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.i77
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32728Mh(User.ID_AI_1V1);
            }
        });
        return Boolean.TRUE;
    }
}

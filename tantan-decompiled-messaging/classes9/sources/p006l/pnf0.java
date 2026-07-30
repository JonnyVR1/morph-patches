package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.card.SpeedUpCardAct;
import com.p1.mobile.putong.core.data.Note;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pnf0 extends jq2<jof0> {

    /* JADX INFO: renamed from: a */
    public SpeedUpCardAct f19226a;

    public pnf0(SpeedUpCardAct speedUpCardAct) {
        super(speedUpCardAct);
        this.f19226a = speedUpCardAct;
    }

    /* JADX INFO: renamed from: a0 */
    public void m21621a0() {
        super.a0();
        duringCreated(CoreModule.f1534c.f3547D0.m6788n4()).subscribe(mkd0.G(new e30() { // from class: l.jnf0
            public final void call(Object obj) {
                this.f15287a.m21624m0((Note) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("quickchatSpeedUpNum")).distinctUntilChanged(new x9j() { // from class: l.knf0
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.remaining == ((UserPrivilege) obj2).content.remaining);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.lnf0
            public final void call(Object obj) {
                this.f16531a.m21625n0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public c<roj0> m21622k0(String str) {
        return duringCreated(CoreModule.f1534c.f3559H0.m27562x5(str, SummarizedPrivilegesId.get("quickchatSpeedUpNum"), "coin", 0).flatMap(new w9j() { // from class: l.nnf0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3544C0.m27420u4();
            }
        })).map(new w9j() { // from class: l.onf0
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public c<roj0> m21623l0() {
        return duringCreated(CoreModule.f1534c.f3547D0.m6787m4(!"on".equals(NullChecker.a(CoreModule.f1534c.f3547D0.m6789o4()) ? CoreModule.f1534c.f3547D0.m6789o4().status : "off")).flatMap(new w9j() { // from class: l.mnf0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3547D0.m6769H4();
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m21624m0(Note note) {
        ((jof0) ((jq2) this).viewModel).m17704P("on".equals(note.status));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m21625n0(UserPrivilege userPrivilege) {
        ((jof0) ((jq2) this).viewModel).m17703O();
    }

    public void destroy() {
    }
}

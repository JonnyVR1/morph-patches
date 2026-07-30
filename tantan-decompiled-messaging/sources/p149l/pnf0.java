package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Note;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.card.SpeedUpCardAct;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class pnf0 extends jq2<jof0> {

    /* JADX INFO: renamed from: a */
    public SpeedUpCardAct f150390a;

    public pnf0(SpeedUpCardAct speedUpCardAct) {
        super(speedUpCardAct);
        this.f150390a = speedUpCardAct;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19558D0.m34851n4()).subscribe(mkd0.m154955G(new e30() { // from class: l.jnf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118852a.m170415m0((Note) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNum)).distinctUntilChanged(new x9j() { // from class: l.knf0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.remaining == ((UserPrivilege) obj2).content.remaining);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.lnf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128989a.m170416n0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public C22306c<roj0> m170413k0(String str) {
        return duringCreated((C22306c) CoreModule.f17545c.f19570H0.m210387x5(str, SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNum), "coin", 0).flatMap(new w9j() { // from class: l.nnf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19555C0.m210112u4();
            }
        })).map(new w9j() { // from class: l.onf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public C22306c<roj0> m170414l0() {
        return duringCreated((C22306c) CoreModule.f17545c.f19558D0.m34850m4(!"on".equals(NullChecker.m81303a(CoreModule.f17545c.f19558D0.m34852o4()) ? CoreModule.f17545c.f19558D0.m34852o4().status : BLiveOperationTitleShowType.off)).flatMap(new w9j() { // from class: l.mnf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19558D0.m34832H4();
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m170415m0(Note note) {
        ((jof0) this.viewModel).m142491P("on".equals(note.status));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m170416n0(UserPrivilege userPrivilege) {
        ((jof0) this.viewModel).m142490O();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

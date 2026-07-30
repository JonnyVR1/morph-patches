package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Note;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.card.SpeedUpCardAct;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class yvf0 extends ar2<swf0> {

    /* JADX INFO: renamed from: a */
    public SpeedUpCardAct f201705a;

    public yvf0(SpeedUpCardAct speedUpCardAct) {
        super(speedUpCardAct);
        this.f201705a = speedUpCardAct;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20300D0.m35854n4()).subscribe(psd0.m173596G(new y20() { // from class: l.svf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170837a.m217497m0((Note) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNum)).distinctUntilChanged(new rcj() { // from class: l.tvf0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.remaining == ((UserPrivilege) obj2).content.remaining);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.uvf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181140a.m217498n0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public C22421c<uxj0> m217495k0(String str) {
        return duringCreated((C22421c) CoreModule.f18264c.f20312H0.m155475x5(str, SummarizedPrivilegesId.get(SummarizedPrivilegesId.quickchatSpeedUpNum), "coin", 0).flatMap(new qcj() { // from class: l.wvf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20297C0.m146425v4();
            }
        })).map(new qcj() { // from class: l.xvf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public C22421c<uxj0> m217496l0() {
        return duringCreated((C22421c) CoreModule.f18264c.f20300D0.m35853m4(!"on".equals(NullChecker.m82486a(CoreModule.f18264c.f20300D0.m35855o4()) ? CoreModule.f18264c.f20300D0.m35855o4().status : BLiveOperationTitleShowType.off)).flatMap(new qcj() { // from class: l.vvf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20300D0.m35835H4();
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m217497m0(Note note) {
        ((swf0) this.viewModel).m188314P("on".equals(note.status));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m217498n0(UserPrivilege userPrivilege) {
        ((swf0) this.viewModel).m188313O();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

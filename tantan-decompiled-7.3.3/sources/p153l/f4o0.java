package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.IntlVoiceBgPagerView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class f4o0 extends t4o0 {

    /* JADX INFO: renamed from: j */
    public List<IntlVoiceBgPagerView> f97123j;

    /* JADX INFO: renamed from: k */
    public erp f97124k;

    /* JADX INFO: renamed from: l */
    public rrp f97125l;

    public f4o0(dum<? extends jlm0> dumVar, VoiceBackgroundView voiceBackgroundView) {
        super(dumVar, voiceBackgroundView);
        this.f97123j = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m124019P3(vxj0 vxj0Var) {
        m124023S3();
    }

    private void init() {
        this.f97123j.clear();
        mo52715C(new v4o0());
        urp urpVar = new urp();
        hrp hrpVar = new hrp();
        this.f97124k = (erp) m153103z2(new erp(this.f196918e, hrpVar));
        this.f97125l = (rrp) m153103z2(new rrp(this.f196918e, urpVar));
        this.f97123j.add(urpVar.m197642d());
        this.f97123j.add(hrpVar.m136915d());
    }

    @Override // p153l.t4o0
    /* JADX INFO: renamed from: K3 */
    public List<IntlVoiceBgPagerView> mo124020K3() {
        return this.f97123j;
    }

    @Override // p153l.t4o0
    /* JADX INFO: renamed from: M3 */
    public void mo124021M3(int i) {
        if (i == 0) {
            this.f97125l.m182801U3();
        } else {
            this.f97124k.m122240R3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m124022R3() {
        ((v4o0) this.viewModel).m199728i();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m124023S3() {
        if (this.viewModel == 0) {
            init();
        }
        ((v4o0) this.viewModel).m199733q();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    @Override // p153l.t4o0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VoiceRoomBgEvent.openVoiceRoomBgDialog(), new y20() { // from class: l.d4o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85059a.m124019P3((vxj0) obj);
            }
        });
        m138862g3(m213811F2().VoiceRoomBgEvent.changeMeTab(), new x20() { // from class: l.e4o0
            @Override // p153l.x20
            public final void call() {
                this.f92136a.m124022R3();
            }
        });
    }
}

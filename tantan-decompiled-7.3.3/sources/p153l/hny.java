package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import p137rx.C22421c;
import p153l.any;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class hny<D extends rwn0, VM extends any> extends djy<D, VM> {

    /* JADX INFO: renamed from: j */
    public boolean f110842j;

    public hny(dum<D> dumVar, VM vm) {
        super(dumVar);
        this.f110842j = false;
        mo52715C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m136281f4(BLiveVoiceSettle bLiveVoiceSettle) {
        m116162W3(bLiveVoiceSettle.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m136282h4(List list) {
        ((any) this.viewModel).f72398a.m79863l0(jyb.m147479J(list));
        ((any) this.viewModel).m99045e(list);
    }

    /* JADX INFO: renamed from: i4 */
    private void m136283i4() {
        duringCreated(LivingNormalApiProvider.m72548V5(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.fny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99984a.m136282h4((List) obj);
            }
        }, new z2e0()));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.djy
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public sjy mo104941S3() {
        return new sjy("已入驻", ((any) this.viewModel).m99043c(), 1);
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: T3 */
    public int mo104942T3() {
        return 1;
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: V3 */
    public void mo104944V3() {
        m136283i4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m136284c4(final BLiveVoiceSettle bLiveVoiceSettle) {
        eky.m121092e("p_audio_management_panel", m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k(), "management_host");
        duringCreated(LivingNormalApiProvider.m72492P3(zrv.f205799a.m207631D0(), bLiveVoiceSettle.userId, m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.gny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105172a.m136286e4(bLiveVoiceSettle, (BLiveVoiceLivePush) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m136285d4() {
        return this.f110842j;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m136286e4(BLiveVoiceSettle bLiveVoiceSettle, BLiveVoiceLivePush bLiveVoiceLivePush) {
        r1j0.m179420g(bLiveVoiceLivePush.message);
        if (bLiveVoiceLivePush.sendPush) {
            bLiveVoiceSettle.isSelected = true;
            ((any) this.viewModel).m99046f(bLiveVoiceSettle);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m136287g4(Integer num) {
        m136283i4();
    }

    public void init() {
        ((any) this.viewModel).m99044d(this, new y20() { // from class: l.cny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82796a.m136281f4((BLiveVoiceSettle) obj);
            }
        }, new y20() { // from class: l.dny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89849a.m136284c4((BLiveVoiceSettle) obj);
            }
        }, null);
        m214779N3((C22421c) m213811F2().MemberManagerEvent.refreshListData().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.eny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94848a.m136287g4((Integer) obj);
            }
        }));
        m136283i4();
    }

    /* JADX INFO: renamed from: j4 */
    public void m136288j4(boolean z) {
        this.f110842j = z;
    }
}

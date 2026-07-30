package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import p137rx.C22421c;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class tcv extends cyr<wcv> {

    /* JADX INFO: renamed from: a */
    public final nus f173275a;

    public tcv(nus nusVar, VNavigationBar vNavigationBar) {
        super(nusVar.f143738b);
        this.f173275a = nusVar;
        mo52715C(new wcv(vNavigationBar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m190502z2(C4470c c4470c) {
        m190505C2();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m190503A2(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        ((wcv) this.viewModel).m205830i(liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m190504B2(List list) {
        ((wcv) this.viewModel).m205831j(this.f173275a.m164819a(), list);
    }

    /* JADX INFO: renamed from: C2 */
    public void m190505C2() {
        duringCreated(VirtualVoiceRoomApiProvider.getVoiceSquareButtons()).onErrorResumeNext(new qcj() { // from class: l.rcv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.empty();
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.scv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167346a.m190504B2((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m190506w2() {
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.ocv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.pcv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151634a.m190502z2((C4470c) obj);
            }
        }));
        duringCreated(this.f173275a.f143737a.LiveVoiceInternalWidgetEvent.bottomWidget().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.qcv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156625a.m190503A2((LiveVoiceInternalSquareBean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y2 */
    public void m190507y2() {
        ((wcv) this.viewModel).m205828e(this.f173275a.m164819a());
    }
}

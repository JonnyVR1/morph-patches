package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12506b;

/* JADX INFO: loaded from: classes13.dex */
public class vmu extends zeu<mmu> {

    /* JADX INFO: renamed from: f */
    public String f182150f;

    public vmu(jlu jluVar) {
        super(jluVar);
        mo51532C(new mmu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public void m198990V2(String str) {
        if (slk0.m184830f(m218409H2().m203901A())) {
            ((mmu) this.viewModel).m155496d();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.rmu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160119a.m198990V2((String) obj);
            }
        }));
        m218410I2(m218411K2().LiveVideoChatEvent.m69197g(), new e30() { // from class: l.smu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165380a.m198991W2((C12506b.a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m198992X2(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall) {
        m218411K2().LiveVideoChatEvent.m69195e().mo172463j(bLiveVideoChatAnchorCall);
        ((mmu) this.viewModel).m155496d();
    }

    /* JADX INFO: renamed from: Y2 */
    public void m198993Y2(BLiveVideoChatMissedCall bLiveVideoChatMissedCall) {
        if (!bLiveVideoChatMissedCall.canCallUser) {
            lsi0.m151595y("无法呼叫，请选择其它用户");
        } else {
            zvf0.m220399u(aru.f71351e, "p_live_anchor_video_quickchat_calling", new j760("receiver_id", bLiveVideoChatMissedCall.userId));
            duringCreated(iuu.m138458S(bLiveVideoChatMissedCall.userId, this.f182150f)).subscribe(ffw.m121194e(new e30() { // from class: l.tmu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171175a.m198992X2((BLiveVideoChatAnchorCall) obj);
                }
            }, new e30() { // from class: l.umu
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151580j(xtr.m211021a((Throwable) obj));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final void m198991W2(C12506b.a aVar) {
        this.f182150f = aVar.f45068b;
        ((mmu) this.viewModel).m155500k(act(), aVar.f45067a);
        zvf0.m220402x(aru.f71349c, "p_live_anchor_video_quickchat_calling");
    }
}

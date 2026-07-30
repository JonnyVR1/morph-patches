package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12669b;

/* JADX INFO: loaded from: classes9.dex */
public class wou extends ahu<nou> {

    /* JADX INFO: renamed from: f */
    public String f190193f;

    public wou(knu knuVar) {
        super(knuVar);
        mo52715C(new nou());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public void m207355V2(String str) {
        if (yuk0.m217440f(m97926H2().m212308A())) {
            ((nou) this.viewModel).m164200d();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m113231o2(m97926H2().m212355z(), false).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.sou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169921a.m207355V2((String) obj);
            }
        }));
        m97927I2(m97928K2().LiveVideoChatEvent.m70380g(), new y20() { // from class: l.tou
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175438a.m207356W2((C12669b.a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m207357X2(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall) {
        m97928K2().LiveVideoChatEvent.m70378e().mo199273j(bLiveVideoChatAnchorCall);
        ((nou) this.viewModel).m164200d();
    }

    /* JADX INFO: renamed from: Y2 */
    public void m207358Y2(BLiveVideoChatMissedCall bLiveVideoChatMissedCall) {
        if (!bLiveVideoChatMissedCall.canCallUser) {
            o1j0.m165651y("无法呼叫，请选择其它用户");
        } else {
            i4g0.m138523u(btu.f78404e, "p_live_anchor_video_quickchat_calling", new pf60("receiver_id", bLiveVideoChatMissedCall.userId));
            duringCreated(jwu.m147244S(bLiveVideoChatMissedCall.userId, this.f190193f)).subscribe(dhw.m115826e(new y20() { // from class: l.uou
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180150a.m207357X2((BLiveVideoChatAnchorCall) obj);
                }
            }, new y20() { // from class: l.vou
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165636j(yvr.m217555a((Throwable) obj));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final void m207356W2(C12669b.a aVar) {
        this.f190193f = aVar.f45916b;
        ((nou) this.viewModel).m164204k(act(), aVar.f45915a);
        i4g0.m138526x(btu.f78402c, "p_live_anchor_video_quickchat_calling");
    }
}

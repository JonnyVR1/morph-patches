package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction.AuctionView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/p81;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/auction/AuctionView;", "Ll/dum;", "curInfo", "auctionView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/auction/AuctionView;)V", "", "L3", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class p81 extends i6t<rwn0, AuctionView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(@NotNull dum<? extends rwn0> dumVar, @NotNull AuctionView auctionView) {
        super(dumVar);
        dumVar.getClass();
        auctionView.getClass();
        mo52715C(auctionView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m171174J3(p81 p81Var, BLiveEnvelope bLiveEnvelope) {
        p81Var.m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(-1);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m171175K3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m171176L3() {
        ahn0.m97862d(this, "auction");
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(VoiceVirtualApi.switchTemplate(strM202191k, "auction")).subscribe(dhw.m115826e(new y20() { // from class: l.k71
            @Override // p153l.y20
            public final void call(Object obj) {
                p81.m171174J3(this.f124233a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.w71
            @Override // p153l.y20
            public final void call(Object obj) {
                p81.m171175K3((Throwable) obj);
            }
        }));
    }
}

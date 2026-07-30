package p153l;

import com.p051p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;

/* JADX INFO: loaded from: classes5.dex */
public class z1t extends qct<dw40> {
    public z1t(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m218368J3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m218372N3(String str) {
        if (m213815L2()) {
            duringCreated(LivingNormalApiProvider.m72477N6(str, 0, "official-show-refresh-stream-address")).subscribe(dhw.m115826e(new y20() { // from class: l.x1t
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192093a.m218373O3((BLive) obj);
                }
            }, new y20() { // from class: l.y1t
                @Override // p153l.y20
                public final void call(Object obj) {
                    z1t.m218368J3((Throwable) obj);
                }
            }));
            return;
        }
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f45171id = str;
        bLiveNew_.type = "officialShow";
        bLiveNew_.liveMode = "officialShow";
        m213811F2().FragProxyEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74209o(bLiveNew_).m74215u(m138867n3()).m74208n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m74207m());
    }

    /* JADX INFO: renamed from: O3 */
    public final void m218373O3(BLive bLive) {
        if (act() instanceof LiveAct) {
            ((LiveAct) act()).m72847u2(AudienceStartData.getBuilder().m68776D(bLive).m68787O("officialShow").m68781I(true).m68780H("officialShow").m68794u());
        }
        m213811F2().FragProxyEvent.finish().m199277p();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m218374P3(OfficialShowMessage.OfficialShowJump officialShowJump) {
        m218372N3(officialShowJump.getOfficialShowLiveId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((dw40) m213810E2()).m168545q1().m98252S()).subscribe(dhw.m115825d(new y20() { // from class: l.v1t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182016a.m218374P3((OfficialShowMessage.OfficialShowJump) obj);
            }
        }));
        duringCreated(m213811F2().OfficialShowEvent.recoverOfficialShow().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.w1t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186839a.m218372N3((String) obj);
            }
        }));
    }
}

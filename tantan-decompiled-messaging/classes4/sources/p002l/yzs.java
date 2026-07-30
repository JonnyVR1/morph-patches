package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.e30;
import l.ffw;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yzs extends pat<pn40> {
    public yzs(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m27015J3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m27019N3(String str) {
        if (m25552L2()) {
            duringCreated(LivingNormalApiProvider.m4660N6(str, 0, "official-show-refresh-stream-address")).subscribe(ffw.e(new e30() { // from class: l.wzs
                public final void call(Object obj) {
                    this.f22055a.m27020O3((BLive) obj);
                }
            }, new e30() { // from class: l.xzs
                public final void call(Object obj) {
                    yzs.m27015J3((Throwable) obj);
                }
            }));
            return;
        }
        BLiveAbsData bLiveAbsDataNew_ = BLive.new_();
        bLiveAbsDataNew_.id = str;
        bLiveAbsDataNew_.type = "officialShow";
        bLiveAbsDataNew_.liveMode = "officialShow";
        m25548F2().FragProxyEvent.jumpRoom().j(new JumpRoomData.C0350a().m6549o(bLiveAbsDataNew_).m6555u(m14195n3()).m6548n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m6547m());
    }

    /* JADX INFO: renamed from: O3 */
    public final void m27020O3(BLive bLive) {
        if (act() instanceof LiveAct) {
            act().m5030s2(AudienceStartData.getBuilder().D(bLive).O("officialShow").I(true).H("officialShow").u());
        }
        m25548F2().FragProxyEvent.finish().p();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m27021P3(OfficialShowMessage.OfficialShowJump officialShowJump) {
        m27019N3(officialShowJump.getOfficialShowLiveId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m27022T() {
        super.T();
        duringCreated(((pn40) m25547E2()).m14596q1().S()).subscribe(ffw.d(new e30() { // from class: l.uzs
            public final void call(Object obj) {
                this.f20903a.m27021P3((OfficialShowMessage.OfficialShowJump) obj);
            }
        }));
        duringCreated((c) m25548F2().OfficialShowEvent.recoverOfficialShow().g()).subscribe(ffw.d(new e30() { // from class: l.vzs
            public final void call(Object obj) {
                this.f21395a.m27019N3((String) obj);
            }
        }));
    }
}

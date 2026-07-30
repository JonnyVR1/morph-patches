package p149l;

import com.p046p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;

/* JADX INFO: loaded from: classes4.dex */
public class yzs extends pat<pn40> {
    public yzs(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m216689J3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m216693N3(String str) {
        if (m206032L2()) {
            duringCreated(LivingNormalApiProvider.m71294N6(str, 0, "official-show-refresh-stream-address")).subscribe(ffw.m121194e(new e30() { // from class: l.wzs
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188759a.m216694O3((BLive) obj);
                }
            }, new e30() { // from class: l.xzs
                @Override // p149l.e30
                public final void call(Object obj) {
                    yzs.m216689J3((Throwable) obj);
                }
            }));
            return;
        }
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f44323id = str;
        bLiveNew_.type = "officialShow";
        bLiveNew_.liveMode = "officialShow";
        m206028F2().FragProxyEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73026o(bLiveNew_).m73032u(m129308n3()).m73025n(JumpRoomType.CHANGE_SOURCE_NO_BACK).m73024m());
    }

    /* JADX INFO: renamed from: O3 */
    public final void m216694O3(BLive bLive) {
        if (act() instanceof LiveAct) {
            ((LiveAct) act()).m71664s2(AudienceStartData.getBuilder().m67593D(bLive).m67604O("officialShow").m67598I(true).m67597H("officialShow").m67611u());
        }
        m206028F2().FragProxyEvent.finish().m172467p();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m216695P3(OfficialShowMessage.OfficialShowJump officialShowJump) {
        m216693N3(officialShowJump.getOfficialShowLiveId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((pn40) m206027E2()).m132160q1().m189070S()).subscribe(ffw.m121193d(new e30() { // from class: l.uzs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179031a.m216695P3((OfficialShowMessage.OfficialShowJump) obj);
            }
        }));
        duringCreated(m206028F2().OfficialShowEvent.recoverOfficialShow().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vzs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183662a.m216693N3((String) obj);
            }
        }));
    }
}

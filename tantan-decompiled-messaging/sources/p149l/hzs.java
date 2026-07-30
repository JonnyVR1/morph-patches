package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;

/* JADX INFO: loaded from: classes4.dex */
public class hzs extends pat<ho2> {
    public hzs(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m133718K3(JumpRoomData jumpRoomData) {
        String toLiveId = jumpRoomData.getToLiveId();
        String source = jumpRoomData.getSource();
        String liveType = jumpRoomData.getLiveType();
        act().startActivity(s91.m182688a(act(), AudienceStartData.getBuilder().m67606Q(BLiveAbsData.VOICE_LIVE.equals(liveType)).m67594E(toLiveId).m67604O(source).m67615y(null).m67597H(liveType).m67611u()));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m133719L3(JumpRoomData jumpRoomData) {
        if (m206032L2()) {
            lsi0.m151593w(R$string.f47165c7);
            return;
        }
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            lsi0.m151593w(R$string.f46966T);
            return;
        }
        if (TextUtils.equals(m206027E2().m149818o(), jumpRoomData.getToRoomId())) {
            lsi0.m151593w(R$string.f47139b3);
            return;
        }
        if ((m206027E2().mo149813j().isVoiceLive() && BLiveAbsData.VOICE_LIVE.equals(jumpRoomData.getLiveType())) || (m206027E2().mo149813j().isNormalLive() && "live".equals(jumpRoomData.getLiveType()))) {
            m206028F2().FragProxyEvent.jumpRoom().mo172463j(jumpRoomData);
        } else {
            m133718K3(jumpRoomData);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().JumpRoomEvent.jumpRoom().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.gzs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105169a.m133719L3((JumpRoomData) obj);
            }
        }));
    }
}

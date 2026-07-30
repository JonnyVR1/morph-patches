package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;

/* JADX INFO: loaded from: classes4.dex */
public class i1t extends qct<oo2> {
    public i1t(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m138148K3(JumpRoomData jumpRoomData) {
        String toLiveId = jumpRoomData.getToLiveId();
        String source = jumpRoomData.getSource();
        String liveType = jumpRoomData.getLiveType();
        act().startActivity(z91.m219041a(act(), AudienceStartData.getBuilder().m68789Q(BLiveAbsData.VOICE_LIVE.equals(liveType)).m68777E(toLiveId).m68787O(source).m68798y(null).m68780H(liveType).m68794u()));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m138149L3(JumpRoomData jumpRoomData) {
        if (m213815L2()) {
            o1j0.m165649w(R$string.f48013c7);
            return;
        }
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            o1j0.m165649w(R$string.f47814T);
            return;
        }
        if (TextUtils.equals(m213810E2().m202194o(), jumpRoomData.getToRoomId())) {
            o1j0.m165649w(R$string.f47987b3);
            return;
        }
        if ((m213810E2().mo183435j().isVoiceLive() && BLiveAbsData.VOICE_LIVE.equals(jumpRoomData.getLiveType())) || (m213810E2().mo183435j().isNormalLive() && "live".equals(jumpRoomData.getLiveType()))) {
            m213811F2().FragProxyEvent.jumpRoom().mo199273j(jumpRoomData);
        } else {
            m138148K3(jumpRoomData);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().JumpRoomEvent.jumpRoom().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.h1t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107479a.m138149L3((JumpRoomData) obj);
            }
        }));
    }
}

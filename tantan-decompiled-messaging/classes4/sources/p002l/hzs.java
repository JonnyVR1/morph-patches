package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import l.e30;
import l.ffw;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hzs extends pat<ho2> {
    public hzs(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m14969K3(JumpRoomData jumpRoomData) {
        String toLiveId = jumpRoomData.getToLiveId();
        String source = jumpRoomData.getSource();
        String liveType = jumpRoomData.getLiveType();
        act().startActivity(s91.m22252a(act(), AudienceStartData.getBuilder().Q("voice-live".equals(liveType)).E(toLiveId).O(source).y((String) null).H(liveType).u()));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m14970L3(JumpRoomData jumpRoomData) {
        if (m25552L2()) {
            lsi0.w(R$string.f3207c7);
            return;
        }
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            lsi0.w(R$string.f3008T);
            return;
        }
        if (TextUtils.equals(m25547E2().m17239o(), jumpRoomData.getToRoomId())) {
            lsi0.w(R$string.f3181b3);
            return;
        }
        if ((m25547E2().m17234j().isVoiceLive() && "voice-live".equals(jumpRoomData.getLiveType())) || (m25547E2().m17234j().isNormalLive() && "live".equals(jumpRoomData.getLiveType()))) {
            m25548F2().FragProxyEvent.jumpRoom().j(jumpRoomData);
        } else {
            m14969K3(jumpRoomData);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m14971T() {
        super.T();
        duringCreated((c) m25548F2().JumpRoomEvent.jumpRoom().g()).subscribe(ffw.d(new e30() { // from class: l.gzs
            public final void call(Object obj) {
                this.f11707a.m14970L3((JumpRoomData) obj);
            }
        }));
    }
}

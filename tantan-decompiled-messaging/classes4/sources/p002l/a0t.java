package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import l.e30;
import l.ffw;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a0t extends pat<ho2> {
    public a0t(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m9264K3(JumpRoomData jumpRoomData) {
        if (m25552L2()) {
            lsi0.w(R$string.f3207c7);
            return;
        }
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            lsi0.w(R$string.f3008T);
        } else if (m25547E2().m17234j().isVoiceLive()) {
            m25548F2().FragProxyEvent.jumpRoom().j(jumpRoomData);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m9265T() {
        super.T();
        duringCreated((c) m25548F2().JumpRoomEvent.jumpRoom().g()).subscribe(ffw.d(new e30() { // from class: l.zzs
            public final void call(Object obj) {
                this.f23682a.m9264K3((JumpRoomData) obj);
            }
        }));
    }
}

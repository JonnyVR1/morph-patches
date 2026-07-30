package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;

/* JADX INFO: loaded from: classes4.dex */
public class a0t extends pat<ho2> {
    public a0t(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m94485K3(JumpRoomData jumpRoomData) {
        if (m206032L2()) {
            lsi0.m151593w(R$string.f47165c7);
            return;
        }
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            lsi0.m151593w(R$string.f46966T);
        } else if (m206027E2().mo149813j().isVoiceLive()) {
            m206028F2().FragProxyEvent.jumpRoom().mo172463j(jumpRoomData);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().JumpRoomEvent.jumpRoom().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zzs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205821a.m94485K3((JumpRoomData) obj);
            }
        }));
    }
}

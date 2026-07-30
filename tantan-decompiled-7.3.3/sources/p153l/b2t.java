package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;

/* JADX INFO: loaded from: classes4.dex */
public class b2t extends qct<oo2> {
    public b2t(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m102249K3(JumpRoomData jumpRoomData) {
        if (m213815L2()) {
            o1j0.m165649w(R$string.f48013c7);
            return;
        }
        if (TextUtils.isEmpty(jumpRoomData.getToLiveId()) || TextUtils.isEmpty(jumpRoomData.getToRoomId())) {
            o1j0.m165649w(R$string.f47814T);
        } else if (m213810E2().mo183435j().isVoiceLive()) {
            m213811F2().FragProxyEvent.jumpRoom().mo199273j(jumpRoomData);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().JumpRoomEvent.jumpRoom().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a2t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68215a.m102249K3((JumpRoomData) obj);
            }
        }));
    }
}

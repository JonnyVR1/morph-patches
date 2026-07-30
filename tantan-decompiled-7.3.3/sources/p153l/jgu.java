package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;

/* JADX INFO: loaded from: classes9.dex */
public class jgu extends ahu<jgu> implements iam<jgu> {
    public jgu(knu knuVar) {
        super(knuVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m97930M2().f127639b.m70354i2(this);
    }

    /* JADX INFO: renamed from: T2 */
    public void m144794T2(PushMessageCustom pushMessageCustom) {
        if (m97926H2().m212353w().randomMatch == null || !TextUtils.equals(pushMessageCustom.f39653id, m97926H2().m212353w().randomMatch.f45325id)) {
            return;
        }
        duringCreated(jwu.m147231F(pushMessageCustom.videoChatId)).subscribe(dhw.m115825d(new y20() { // from class: l.igu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114814a.m144795U2((BLiveVideoChat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m144795U2(BLiveVideoChat bLiveVideoChat) {
        m97926H2().m212331X(bLiveVideoChat.roomId);
        m97926H2().m212341h0(bLiveVideoChat, false);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jgu jguVar) {
    }
}

package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;

/* JADX INFO: loaded from: classes13.dex */
public class ieu extends zeu<ieu> implements s7m<ieu> {
    public ieu(jlu jluVar) {
        super(jluVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m218413M2().f118585b.m69171h2(this);
    }

    /* JADX INFO: renamed from: T2 */
    public void m135818T2(PushMessageCustom pushMessageCustom) {
        if (m218409H2().m203946w().randomMatch == null || !TextUtils.equals(pushMessageCustom.f38805id, m218409H2().m203946w().randomMatch.f44477id)) {
            return;
        }
        duringCreated(iuu.m138445F(pushMessageCustom.videoChatId)).subscribe(ffw.m121193d(new e30() { // from class: l.heu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107407a.m135819U2((BLiveVideoChat) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m135819U2(BLiveVideoChat bLiveVideoChat) {
        m218409H2().m203924X(bLiveVideoChat.roomId);
        m218409H2().m203934h0(bLiveVideoChat, false);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ieu ieuVar) {
    }
}

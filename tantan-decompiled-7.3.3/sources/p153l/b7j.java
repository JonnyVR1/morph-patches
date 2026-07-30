package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p051p1.mobile.putong.data.VoiceLiveState;

/* JADX INFO: loaded from: classes11.dex */
public class b7j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomLiveView) {
            CardBottomLiveView cardBottomLiveView = (CardBottomLiveView) view;
            view.setVisibility(4);
            m121321k(cardBottomLiveView.f24261c, c8021d, i);
            m121323m(cardBottomLiveView.f24263e, c8021d, i);
            boolean z = c8021d.f22779j.f22782a == CardBottomFrame.LIVE;
            bnl0.m105524M(cardBottomLiveView.f24261c, z);
            bnl0.m105524M(cardBottomLiveView.f24263e, z);
            cardBottomLiveView.m39935Z(c8021d);
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = qa00.m175859d(16.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        super.mo96367j(c8021d, qk4Var, i);
        if (qk4Var.m176921c() instanceof CardBottomLiveView) {
            ((CardBottomLiveView) qk4Var.m176921c()).m39934Y(c8021d, c8021d.f22779j.f22783b, i);
        }
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (gra.m131770x1() && c8021d != null && c8021d.getUser() != null && !TextUtils.isEmpty(c8021d.getUser().f56859id)) {
            VoiceLiveState voiceLiveStateMo68435Zl = CoreModule.m30934Q().mo68435Zl(c8021d.getUserInfo().f20214id);
            if (CoreModule.f18264c.f20405m0.m31995E6(voiceLiveStateMo68435Zl)) {
                c8021d.f22779j.f22783b = voiceLiveStateMo68435Zl;
                c8021d.m38498w(cardBottomFrame, qa00.m175859d(162.0f));
                return true;
            }
        }
        return false;
    }
}

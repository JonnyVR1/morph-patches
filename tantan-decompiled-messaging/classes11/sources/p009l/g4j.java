package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.data.DbObject;
import l.t100;
import l.upa;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g4j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomLiveView) {
            CardBottomLiveView cardBottomLiveView = (CardBottomLiveView) view;
            view.setVisibility(4);
            m24310k(cardBottomLiveView.f2297c, c0034d, i);
            m24312m(cardBottomLiveView.f2299e, c0034d, i);
            boolean z = c0034d.f815j.f818a == CardBottomFrame.LIVE;
            xdl0.M(cardBottomLiveView.f2297c, z);
            xdl0.M(cardBottomLiveView.f2299e, z);
            cardBottomLiveView.m2939Z(c0034d);
        }
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(16.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        super.mo13735j(c0034d, rj4Var, i);
        if (rj4Var.m21680c() instanceof CardBottomLiveView) {
            ((CardBottomLiveView) rj4Var.m21680c()).m2938Y(c0034d, c0034d.f815j.f819b, i);
        }
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (upa.x1() && c0034d != null && c0034d.getUser() != null && !TextUtils.isEmpty(((DbObject) c0034d.getUser()).id)) {
            VoiceLiveState voiceLiveStateM9037Zl = CoreModule.Q().m9037Zl(c0034d.getUserInfo().id);
            if (CoreModule.c.m0.E6(voiceLiveStateM9037Zl)) {
                c0034d.f815j.f819b = voiceLiveStateM9037Zl;
                c0034d.m1466w(cardBottomFrame, t100.d(162.0f));
                return true;
            }
        }
        return false;
    }
}

package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p046p1.mobile.putong.data.VoiceLiveState;

/* JADX INFO: loaded from: classes11.dex */
public class g4j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomLiveView) {
            CardBottomLiveView cardBottomLiveView = (CardBottomLiveView) view;
            view.setVisibility(4);
            m203741k(cardBottomLiveView.f23519c, c7870d, i);
            m203743m(cardBottomLiveView.f23521e, c7870d, i);
            boolean z = c7870d.f22037j.f22040a == CardBottomFrame.LIVE;
            xdl0.m208344M(cardBottomLiveView.f23519c, z);
            xdl0.m208344M(cardBottomLiveView.f23521e, z);
            cardBottomLiveView.m38932Z(c7870d);
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = t100.m186890d(16.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        super.mo114808j(c7870d, rj4Var, i);
        if (rj4Var.m179548c() instanceof CardBottomLiveView) {
            ((CardBottomLiveView) rj4Var.m179548c()).m38931Y(c7870d, c7870d.f22037j.f22041b, i);
        }
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (upa.m194839x1() && c7870d != null && c7870d.getUser() != null && !TextUtils.isEmpty(c7870d.getUser().f56011id)) {
            VoiceLiveState voiceLiveStateMo67252Zl = CoreModule.m29936Q().mo67252Zl(c7870d.getUserInfo().f19472id);
            if (CoreModule.f17545c.f19663m0.m30992E6(voiceLiveStateMo67252Zl)) {
                c7870d.f22037j.f22041b = voiceLiveStateMo67252Zl;
                c7870d.m37495w(cardBottomFrame, t100.m186890d(162.0f));
                return true;
            }
        }
        return false;
    }
}

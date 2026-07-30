package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomThemeAnswerView;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f5j extends wl2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        CardBottomThemeAnswerView cardBottomThemeAnswerView = (CardBottomThemeAnswerView) view;
        m24310k(cardBottomThemeAnswerView.f2363c, c0034d, i);
        m24312m(cardBottomThemeAnswerView.f2365e, c0034d, i);
        boolean z = c0034d.f815j.f818a == CardBottomFrame.THEME_CARD;
        xdl0.M(cardBottomThemeAnswerView.f2363c, z);
        xdl0.M(cardBottomThemeAnswerView.f2365e, z);
        cardBottomThemeAnswerView.m2962Q(c0034d);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: d */
    public void mo11839d(FrameLayout.LayoutParams layoutParams) {
        super.mo11839d(layoutParams);
        layoutParams.leftMargin = t100.d(16.0f);
        layoutParams.rightMargin = t100.d(16.0f);
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (!yki0.m25445b().m25454h()) {
            return false;
        }
        yki0 yki0VarM25445b = yki0.m25445b();
        if (!NullChecker.a(yki0VarM25445b) || !NullChecker.a(yki0VarM25445b.m25448a()) || c0034d.getUserInfo() == null) {
            return false;
        }
        if (!yki0VarM25445b.m25454h() && !c0034d.getUserInfo().isThemeCard && !((Boolean) CoreModule.c.z0.W.get()).booleanValue()) {
            return false;
        }
        boolean z = c0034d.getUserInfo().isThemeCard;
        if (z) {
            C0034d.a aVar = c0034d.f815j;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.THEME_CARD;
            aVar.f818a = cardBottomFrame2;
            if (yki0.m25445b().m25454h() && NullChecker.a(c0034d.getUser()) && NullChecker.a(c0034d.getUser().settings) && NullChecker.a(c0034d.getUser().settings.omsSetting) && NullChecker.a(c0034d.getUser().settings.omsSetting.themeView) && !TextUtils.isEmpty(c0034d.getUser().settings.omsSetting.themeView.icon)) {
                c0034d.m1466w(cardBottomFrame2, t100.d(162.0f));
                return z;
            }
            c0034d.m1466w(cardBottomFrame2, t100.d(80.0f));
        }
        return z;
    }
}

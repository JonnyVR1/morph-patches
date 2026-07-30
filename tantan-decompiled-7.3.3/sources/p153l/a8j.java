package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomThemeAnswerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class a8j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        CardBottomThemeAnswerView cardBottomThemeAnswerView = (CardBottomThemeAnswerView) view;
        m121321k(cardBottomThemeAnswerView.f24327c, c8021d, i);
        m121323m(cardBottomThemeAnswerView.f24329e, c8021d, i);
        boolean z = c8021d.f22779j.f22782a == CardBottomFrame.THEME_CARD;
        bnl0.m105524M(cardBottomThemeAnswerView.f24327c, z);
        bnl0.m105524M(cardBottomThemeAnswerView.f24329e, z);
        cardBottomThemeAnswerView.m39958Q(c8021d);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: d */
    public void mo96471d(FrameLayout.LayoutParams layoutParams) {
        super.mo96471d(layoutParams);
        layoutParams.leftMargin = qa00.m175859d(16.0f);
        layoutParams.rightMargin = qa00.m175859d(16.0f);
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (!yti0.m217322b().m217331h()) {
            return false;
        }
        yti0 yti0VarM217322b = yti0.m217322b();
        if (!NullChecker.m82486a(yti0VarM217322b) || !NullChecker.m82486a(yti0VarM217322b.m217325a()) || c8021d.getUserInfo() == null) {
            return false;
        }
        if (!yti0VarM217322b.m217331h() && !c8021d.getUserInfo().isThemeCard && !CoreModule.f18264c.f20444z0.f178195W.get().booleanValue()) {
            return false;
        }
        boolean z = c8021d.getUserInfo().isThemeCard;
        if (z) {
            C8021d.a aVar = c8021d.f22779j;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.THEME_CARD;
            aVar.f22782a = cardBottomFrame2;
            if (yti0.m217322b().m217331h() && NullChecker.m82486a(c8021d.getUser()) && NullChecker.m82486a(c8021d.getUser().settings) && NullChecker.m82486a(c8021d.getUser().settings.omsSetting) && NullChecker.m82486a(c8021d.getUser().settings.omsSetting.themeView) && !TextUtils.isEmpty(c8021d.getUser().settings.omsSetting.themeView.icon)) {
                c8021d.m38498w(cardBottomFrame2, qa00.m175859d(162.0f));
                return z;
            }
            c8021d.m38498w(cardBottomFrame2, qa00.m175859d(80.0f));
        }
        return z;
    }
}

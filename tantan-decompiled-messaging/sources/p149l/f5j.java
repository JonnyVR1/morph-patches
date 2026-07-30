package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomThemeAnswerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class f5j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        CardBottomThemeAnswerView cardBottomThemeAnswerView = (CardBottomThemeAnswerView) view;
        m203741k(cardBottomThemeAnswerView.f23585c, c7870d, i);
        m203743m(cardBottomThemeAnswerView.f23587e, c7870d, i);
        boolean z = c7870d.f22037j.f22040a == CardBottomFrame.THEME_CARD;
        xdl0.m208344M(cardBottomThemeAnswerView.f23585c, z);
        xdl0.m208344M(cardBottomThemeAnswerView.f23587e, z);
        cardBottomThemeAnswerView.m38955Q(c7870d);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: d */
    public void mo100262d(FrameLayout.LayoutParams layoutParams) {
        super.mo100262d(layoutParams);
        layoutParams.leftMargin = t100.m186890d(16.0f);
        layoutParams.rightMargin = t100.m186890d(16.0f);
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (!yki0.m215127b().m215136h()) {
            return false;
        }
        yki0 yki0VarM215127b = yki0.m215127b();
        if (!NullChecker.m81303a(yki0VarM215127b) || !NullChecker.m81303a(yki0VarM215127b.m215130a()) || c7870d.getUserInfo() == null) {
            return false;
        }
        if (!yki0VarM215127b.m215136h() && !c7870d.getUserInfo().isThemeCard && !CoreModule.f17545c.f19702z0.f106530W.get().booleanValue()) {
            return false;
        }
        boolean z = c7870d.getUserInfo().isThemeCard;
        if (z) {
            C7870d.a aVar = c7870d.f22037j;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.THEME_CARD;
            aVar.f22040a = cardBottomFrame2;
            if (yki0.m215127b().m215136h() && NullChecker.m81303a(c7870d.getUser()) && NullChecker.m81303a(c7870d.getUser().settings) && NullChecker.m81303a(c7870d.getUser().settings.omsSetting) && NullChecker.m81303a(c7870d.getUser().settings.omsSetting.themeView) && !TextUtils.isEmpty(c7870d.getUser().settings.omsSetting.themeView.icon)) {
                c7870d.m37495w(cardBottomFrame2, t100.m186890d(162.0f));
                return z;
            }
            c7870d.m37495w(cardBottomFrame2, t100.m186890d(80.0f));
        }
        return z;
    }
}

package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class j6j extends em2 {
    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof RecentBookMoviesDramas) {
            RecentBookMoviesDramas recentBookMoviesDramas = (RecentBookMoviesDramas) view;
            m121321k(recentBookMoviesDramas.f24732a, c8021d, i);
            CardBottomFrame cardBottomFrame = c8021d.f22779j.f22782a;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.BOOK_MOVIE_DREAM;
            CardUserContentView cardUserContentView = recentBookMoviesDramas.f24734c;
            if (cardBottomFrame == cardBottomFrame2) {
                bnl0.m105524M(cardUserContentView, true);
                m121323m(recentBookMoviesDramas.f24734c, c8021d, i);
                c8021d.f22779j.m38499a(recentBookMoviesDramas.f24734c.m40125V());
            } else {
                bnl0.m105524M(cardUserContentView, false);
            }
            if (NullChecker.m82486a(c8021d) && NullChecker.m82486a(c8021d.getUser()) && NullChecker.m82486a(c8021d.getUserInfo()) && NullChecker.m82486a(c8021d.getUserInfo().literaturesComments) && c8021d.getUserInfo().literaturesComments.size() > 0) {
                recentBookMoviesDramas.m40200f(c8021d.getUser().gender, c8021d.getUser().f56859id, c8021d.getUserInfo().literaturesComments, c8021d.mo38481f());
            }
            recentBookMoviesDramas.m40202h();
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
    /* JADX INFO: renamed from: i */
    public boolean mo96366i() {
        return true;
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: j */
    public void mo96367j(C8021d c8021d, qk4 qk4Var, int i) {
        super.mo96367j(c8021d, qk4Var, i);
        if (qk4Var.m176921c() instanceof RecentBookMoviesDramas) {
            ((RecentBookMoviesDramas) qk4Var.m176921c()).m40199e(c8021d);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m143667o(C8021d c8021d) {
        return (c8021d.getUser().localRelationship == null || c8021d.getUser().localRelationship.status == null || c8021d.getUser().localRelationship.status.size() == 0 || c8021d.getUser().localRelationship.relationshipExtensions == null || !TEnum.equals(c8021d.getUser().localRelationship.status.get(0), "literature") || TextUtils.isEmpty(c8021d.getUser().localRelationship.relationshipExtensions.otherLetter)) ? false : true;
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        boolean z = false;
        if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "unknown_")) {
            return false;
        }
        CoreSuggested.UserInfo userInfo = c8021d.getUserInfo();
        if (m143667o(c8021d)) {
            return false;
        }
        if (userInfo != null && userInfo.literaturesComments != null && c8021d.getUser() != null) {
            int size = userInfo.literaturesComments.size();
            int size2 = c8021d.getUser().pictures.size();
            if (size >= 1 && size2 >= 1) {
                z = true;
            }
            if (z) {
                C8021d.a aVar = c8021d.f22779j;
                if (aVar.f22782a == null) {
                    aVar.f22782a = cardBottomFrame;
                    c8021d.m38498w(cardBottomFrame, qa00.m175859d(162.0f));
                } else {
                    c8021d.m38498w(cardBottomFrame, qa00.m175859d(172.0f));
                }
                c8021d.m38497v(cardBottomFrame, qa00.m175859d(170.0f));
            }
        }
        return z;
    }
}

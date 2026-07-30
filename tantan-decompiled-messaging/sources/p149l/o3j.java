package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class o3j extends wl2 {
    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof RecentBookMoviesDramas) {
            RecentBookMoviesDramas recentBookMoviesDramas = (RecentBookMoviesDramas) view;
            m203741k(recentBookMoviesDramas.f23990a, c7870d, i);
            CardBottomFrame cardBottomFrame = c7870d.f22037j.f22040a;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.BOOK_MOVIE_DREAM;
            CardUserContentView cardUserContentView = recentBookMoviesDramas.f23992c;
            if (cardBottomFrame == cardBottomFrame2) {
                xdl0.m208344M(cardUserContentView, true);
                m203743m(recentBookMoviesDramas.f23992c, c7870d, i);
                c7870d.f22037j.m37496a(recentBookMoviesDramas.f23992c.m39122V());
            } else {
                xdl0.m208344M(cardUserContentView, false);
            }
            if (NullChecker.m81303a(c7870d) && NullChecker.m81303a(c7870d.getUser()) && NullChecker.m81303a(c7870d.getUserInfo()) && NullChecker.m81303a(c7870d.getUserInfo().literaturesComments) && c7870d.getUserInfo().literaturesComments.size() > 0) {
                recentBookMoviesDramas.m39197f(c7870d.getUser().gender, c7870d.getUser().f56011id, c7870d.getUserInfo().literaturesComments, c7870d.mo37478f());
            }
            recentBookMoviesDramas.m39199h();
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
    /* JADX INFO: renamed from: i */
    public boolean mo100265i() {
        return true;
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: j */
    public void mo114808j(C7870d c7870d, rj4 rj4Var, int i) {
        super.mo114808j(c7870d, rj4Var, i);
        if (rj4Var.m179548c() instanceof RecentBookMoviesDramas) {
            ((RecentBookMoviesDramas) rj4Var.m179548c()).m39196e(c7870d);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m162436o(C7870d c7870d) {
        return (c7870d.getUser().localRelationship == null || c7870d.getUser().localRelationship.status == null || c7870d.getUser().localRelationship.status.size() == 0 || c7870d.getUser().localRelationship.relationshipExtensions == null || !TEnum.equals(c7870d.getUser().localRelationship.status.get(0), "literature") || TextUtils.isEmpty(c7870d.getUser().localRelationship.relationshipExtensions.otherLetter)) ? false : true;
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        boolean z = false;
        if (TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "unknown_")) {
            return false;
        }
        CoreSuggested.UserInfo userInfo = c7870d.getUserInfo();
        if (m162436o(c7870d)) {
            return false;
        }
        if (userInfo != null && userInfo.literaturesComments != null && c7870d.getUser() != null) {
            int size = userInfo.literaturesComments.size();
            int size2 = c7870d.getUser().pictures.size();
            if (size >= 1 && size2 >= 1) {
                z = true;
            }
            if (z) {
                C7870d.a aVar = c7870d.f22037j;
                if (aVar.f22040a == null) {
                    aVar.f22040a = cardBottomFrame;
                    c7870d.m37495w(cardBottomFrame, t100.m186890d(162.0f));
                } else {
                    c7870d.m37495w(cardBottomFrame, t100.m186890d(172.0f));
                }
                c7870d.m37494v(cardBottomFrame, t100.m186890d(170.0f));
            }
        }
        return z;
    }
}

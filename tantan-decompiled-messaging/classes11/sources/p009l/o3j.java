package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.RecentBookMoviesDramas;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.xdl0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o3j extends wl2 {
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof RecentBookMoviesDramas) {
            RecentBookMoviesDramas recentBookMoviesDramas = (RecentBookMoviesDramas) view;
            m24310k(recentBookMoviesDramas.f2768a, c0034d, i);
            CardBottomFrame cardBottomFrame = c0034d.f815j.f818a;
            CardBottomFrame cardBottomFrame2 = CardBottomFrame.BOOK_MOVIE_DREAM;
            VLinear vLinear = recentBookMoviesDramas.f2770c;
            if (cardBottomFrame == cardBottomFrame2) {
                xdl0.M(vLinear, true);
                m24312m(recentBookMoviesDramas.f2770c, c0034d, i);
                c0034d.f815j.m1467a(recentBookMoviesDramas.f2770c.m3137V());
            } else {
                xdl0.M(vLinear, false);
            }
            if (NullChecker.a(c0034d) && NullChecker.a(c0034d.getUser()) && NullChecker.a(c0034d.getUserInfo()) && NullChecker.a(c0034d.getUserInfo().literaturesComments) && c0034d.getUserInfo().literaturesComments.size() > 0) {
                recentBookMoviesDramas.m3215f(c0034d.getUser().gender, ((DbObject) c0034d.getUser()).id, c0034d.getUserInfo().literaturesComments, c0034d.mo1449f());
            }
            recentBookMoviesDramas.m3217h();
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
    /* JADX INFO: renamed from: i */
    public boolean mo11842i() {
        return true;
    }

    @Override // p009l.wl2
    /* JADX INFO: renamed from: j */
    public void mo13735j(C0034d c0034d, rj4 rj4Var, int i) {
        super.mo13735j(c0034d, rj4Var, i);
        if (rj4Var.m21680c() instanceof RecentBookMoviesDramas) {
            ((RecentBookMoviesDramas) rj4Var.m21680c()).m3214e(c0034d);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m19605o(C0034d c0034d) {
        return (c0034d.getUser().localRelationship == null || c0034d.getUser().localRelationship.status == null || c0034d.getUser().localRelationship.status.size() == 0 || c0034d.getUser().localRelationship.relationshipExtensions == null || !TEnum.equals((MatchFrom) c0034d.getUser().localRelationship.status.get(0), "literature") || TextUtils.isEmpty(c0034d.getUser().localRelationship.relationshipExtensions.otherLetter)) ? false : true;
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        boolean z = false;
        if (TEnum.equals(CoreModule.c.e0.p9().gender, "unknown_")) {
            return false;
        }
        CoreSuggested.UserInfo userInfo = c0034d.getUserInfo();
        if (m19605o(c0034d)) {
            return false;
        }
        if (userInfo != null && userInfo.literaturesComments != null && c0034d.getUser() != null) {
            int size = userInfo.literaturesComments.size();
            int size2 = c0034d.getUser().pictures.size();
            if (size >= 1 && size2 >= 1) {
                z = true;
            }
            if (z) {
                C0034d.a aVar = c0034d.f815j;
                if (aVar.f818a == null) {
                    aVar.f818a = cardBottomFrame;
                    c0034d.m1466w(cardBottomFrame, t100.d(162.0f));
                } else {
                    c0034d.m1466w(cardBottomFrame, t100.d(172.0f));
                }
                c0034d.m1465v(cardBottomFrame, t100.d(170.0f));
            }
        }
        return z;
    }
}

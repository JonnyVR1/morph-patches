package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.DatingGuideData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.upa;
import l.v7c;
import l.vwb;
import p009l.mqi0;
import p009l.wn90;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0077o extends AbstractC0035a {
    /* JADX INFO: renamed from: r */
    public static void m1672r(Act act, User user) {
        DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
        datingGuideDataNew_.titles.add("丰富个人资料\n为你推荐更多合适的人");
        datingGuideDataNew_.subTitles.add("个人资料越完善，匹配越精准");
        datingGuideDataNew_.button = "立即完善";
        datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=dating&from=left_swipe_complete_profile";
        datingGuideDataNew_.pageId = "p_left_swipe_complete_profile";
        datingGuideDataNew_.pictures.add(user.isFemale() ? "https://auto.tancdn.com/v1/raw/4bb88ee6-8f5e-47fe-9ff3-2d2affccb71914.webp" : "https://auto.tancdn.com/v1/raw/51590443-bac6-4a24-8a3e-13e55a4bfaa014.webp");
        if (upa.z()) {
            datingGuideDataNew_.pictures = vwb.M("https://auto.tancdn.com/v1/images/eyJpZCI6IkxNM042TTU3VTUyNkY2MlpaTEY3TUw1UVNGVklOVjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODUzMjgzMTUyNjkxMzN9.png");
        }
        datingGuideDataNew_.buttonId = "e_complete_profile";
        new v7c.b(act).c(datingGuideDataNew_).d(140, 110).a().show();
        CoreModule.c.r2.U.a(1);
        CoreModule.c.r2.T.put(Long.valueOf(mqi0.m18550o()));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!NullChecker.b(m1485n()) || mqi0.m18535D((long) m1485n().createdTime)) {
            return false;
        }
        if ((m1485n().pictures.size() >= 3 && !TextUtils.isEmpty(m1485n().description) && wn90.m24355j0(m1485n()) >= 5) || CoreModule.c.m0.P1 < upa.T0() - 1 || !wn90.m24339F().m24385S() || CoreModule.c.r2.r3(1)) {
            return false;
        }
        m1672r(aVar.f872a.m19361T4(), m1485n());
        return false;
    }
}

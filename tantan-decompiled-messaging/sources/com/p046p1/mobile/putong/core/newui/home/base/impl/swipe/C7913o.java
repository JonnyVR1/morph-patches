package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.mqi0;
import p149l.upa;
import p149l.v7c;
import p149l.vwb;
import p149l.wn90;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o */
/* JADX INFO: loaded from: classes11.dex */
public class C7913o extends AbstractC7871a {
    /* JADX INFO: renamed from: r */
    public static void m37701r(Act act, User user) {
        DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
        datingGuideDataNew_.titles.add("丰富个人资料\n为你推荐更多合适的人");
        datingGuideDataNew_.subTitles.add("个人资料越完善，匹配越精准");
        datingGuideDataNew_.button = "立即完善";
        datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=dating&from=left_swipe_complete_profile";
        datingGuideDataNew_.pageId = "p_left_swipe_complete_profile";
        datingGuideDataNew_.pictures.add(user.isFemale() ? "https://auto.tancdn.com/v1/raw/4bb88ee6-8f5e-47fe-9ff3-2d2affccb71914.webp" : "https://auto.tancdn.com/v1/raw/51590443-bac6-4a24-8a3e-13e55a4bfaa014.webp");
        if (upa.m194847z()) {
            datingGuideDataNew_.pictures = vwb.m200299M("https://auto.tancdn.com/v1/images/eyJpZCI6IkxNM042TTU3VTUyNkY2MlpaTEY3TUw1UVNGVklOVjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODUzMjgzMTUyNjkxMzN9.png");
        }
        datingGuideDataNew_.buttonId = "e_complete_profile";
        new v7c.C20593b(act).m197375c(datingGuideDataNew_).m197376d(140, 110).m197373a().show();
        CoreModule.f17545c.f19680r2.f113514U.m189988a(1);
        CoreModule.f17545c.f19680r2.f113513T.put(Long.valueOf(mqi0.m155944o()));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!NullChecker.m81304b(m37514n()) || mqi0.m155929D((long) m37514n().createdTime)) {
            return false;
        }
        if ((m37514n().pictures.size() >= 3 && !TextUtils.isEmpty(m37514n().description) && wn90.m204618j0(m37514n()) >= 5) || CoreModule.f17545c.f19663m0.f19364P1 < upa.m194697T0() - 1 || !wn90.m204602F().m204648S() || CoreModule.f17545c.f19680r2.m136528r3(1)) {
            return false;
        }
        m37701r(aVar.f22094a.m161157T4(), m37514n());
        return false;
    }
}

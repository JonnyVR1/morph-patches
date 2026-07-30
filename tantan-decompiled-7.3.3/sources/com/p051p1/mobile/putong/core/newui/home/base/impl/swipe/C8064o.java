package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.DatingGuideData;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.aw90;
import p153l.b9c;
import p153l.gra;
import p153l.jyb;
import p153l.pzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.o */
/* JADX INFO: loaded from: classes11.dex */
public class C8064o extends AbstractC8022a {
    /* JADX INFO: renamed from: r */
    public static void m38704r(Act act, User user) {
        DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
        datingGuideDataNew_.titles.add("丰富个人资料\n为你推荐更多合适的人");
        datingGuideDataNew_.subTitles.add("个人资料越完善，匹配越精准");
        datingGuideDataNew_.button = "立即完善";
        datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=dating&from=left_swipe_complete_profile";
        datingGuideDataNew_.pageId = "p_left_swipe_complete_profile";
        datingGuideDataNew_.pictures.add(user.isFemale() ? "https://auto.tancdn.com/v1/raw/4bb88ee6-8f5e-47fe-9ff3-2d2affccb71914.webp" : "https://auto.tancdn.com/v1/raw/51590443-bac6-4a24-8a3e-13e55a4bfaa014.webp");
        if (gra.m131778z()) {
            datingGuideDataNew_.pictures = jyb.m147482M("https://auto.tancdn.com/v1/images/eyJpZCI6IkxNM042TTU3VTUyNkY2MlpaTEY3TUw1UVNGVklOVjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODUzMjgzMTUyNjkxMzN9.png");
        }
        datingGuideDataNew_.buttonId = "e_complete_profile";
        new b9c.C15951b(act).m103090c(datingGuideDataNew_).m103091d(140, 110).m103088a().show();
        CoreModule.f18264c.f20422r2.f137252U.m203841a(1);
        CoreModule.f18264c.f20422r2.f137251T.put(Long.valueOf(pzi0.m174454o()));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!NullChecker.m82487b(m38517n()) || pzi0.m174439D((long) m38517n().createdTime)) {
            return false;
        }
        if ((m38517n().pictures.size() >= 3 && !TextUtils.isEmpty(m38517n().description) && aw90.m100578j0(m38517n()) >= 5) || CoreModule.f18264c.f20405m0.f20106P1 < gra.m131628T0() - 1 || !aw90.m100562F().m100608S() || CoreModule.f18264c.f20422r2.m158743r3(1)) {
            return false;
        }
        m38704r(aVar.f22836a.m101951T4(), m38517n());
        return false;
    }
}

package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class kuh {
    /* JADX INFO: renamed from: a */
    public static void m151538a(int i, MyTabPostGuide myTabPostGuide, String str) {
        pf60 pf60VarM172085a = pf60.m172085a("post_guide_type", Integer.valueOf(i));
        String str2 = myTabPostGuide.topicId;
        if (str2 == null) {
            str2 = "";
        }
        pf60 pf60VarM172085a2 = pf60.m172085a("topic_id", str2);
        String str3 = myTabPostGuide.title;
        tfj0.m190940c("e_moment_post", str, pf60VarM172085a, pf60VarM172085a2, pf60.m172085a("guide_text", str3 != null ? str3 : ""));
    }

    /* JADX INFO: renamed from: b */
    public static void m151539b(Act act, TopicMoment topicMoment) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            m151540c(act, topicMoment);
        } else if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            o1j0.m165649w(R$string.f39730D2);
        } else {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m151540c(Act act, TopicMoment topicMoment) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
        } else if (topicMoment == null) {
            cn40.m111396k0(act, jyb.m147507f0(new Media[0]), true, "mine");
        } else {
            cn40.m111400m0(act, jyb.m147507f0(new Media[0]), true, "mine", null, null, topicMoment);
        }
    }
}

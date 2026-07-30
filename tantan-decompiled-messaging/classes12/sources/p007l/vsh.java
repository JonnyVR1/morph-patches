package p007l;

import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import l.ib1;
import l.j760;
import l.lsi0;
import l.osi0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vsh {
    /* JADX INFO: renamed from: a */
    public static void m15575a(int i, MyTabPostGuide myTabPostGuide, String str) {
        j760 j760VarA = j760.a("post_guide_type", Integer.valueOf(i));
        String str2 = myTabPostGuide.topicId;
        if (str2 == null) {
            str2 = "";
        }
        j760 j760VarA2 = j760.a("topic_id", str2);
        String str3 = myTabPostGuide.title;
        p6j0.m12913c("e_moment_post", str, j760VarA, j760VarA2, j760.a("guide_text", str3 != null ? str3 : ""));
    }

    /* JADX INFO: renamed from: b */
    public static void m15576b(Act act, TopicMoment topicMoment) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!NullChecker.a(audioBusinessTypeC)) {
            m15577c(act, topicMoment);
        } else if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.w(R$string.f343D2);
        } else {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15577c(Act act, TopicMoment topicMoment) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
        } else if (topicMoment == null) {
            oe40.m12583k0(act, vwb.f0(new Media[0]), true, "mine");
        } else {
            oe40.m12587m0(act, vwb.f0(new Media[0]), true, "mine", null, null, topicMoment);
        }
    }
}

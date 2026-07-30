package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MyTabPostGuide;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class vsh {
    /* JADX INFO: renamed from: a */
    public static void m199867a(int i, MyTabPostGuide myTabPostGuide, String str) {
        j760 j760VarM140076a = j760.m140076a("post_guide_type", Integer.valueOf(i));
        String str2 = myTabPostGuide.topicId;
        if (str2 == null) {
            str2 = "";
        }
        j760 j760VarM140076a2 = j760.m140076a("topic_id", str2);
        String str3 = myTabPostGuide.title;
        p6j0.m167669c("e_moment_post", str, j760VarM140076a, j760VarM140076a2, j760.m140076a("guide_text", str3 != null ? str3 : ""));
    }

    /* JADX INFO: renamed from: b */
    public static void m199868b(Act act, TopicMoment topicMoment) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            m199869c(act, topicMoment);
        } else if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.m151593w(R$string.f38882D2);
        } else {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m199869c(Act act, TopicMoment topicMoment) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
        } else if (topicMoment == null) {
            oe40.m163846k0(act, vwb.m200324f0(new Media[0]), true, "mine");
        } else {
            oe40.m163850m0(act, vwb.m200324f0(new Media[0]), true, "mine", null, null, topicMoment);
        }
    }
}

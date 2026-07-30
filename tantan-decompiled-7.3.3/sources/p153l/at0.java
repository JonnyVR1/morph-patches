package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class at0 {
    /* JADX INFO: renamed from: a */
    public static String m100007a(Moment moment, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!m100010d(moment)) {
            return str;
        }
        if (str.length() == 1) {
            return str.concat("***");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1));
        int iMin = Math.min(str.length(), 7);
        for (int i = 1; i < iMin; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static Intent m100008b(Act act, String str, String str2) {
        return orb0.m168891h(act, str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m100009c(Act act, String str, String str2) {
        return PhotoAlbumFeedAct.m65538X1(act, str, str2, -1, 2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m100010d(Moment moment) {
        return moment != null && moment.isAnonymousMoment();
    }

    /* JADX INFO: renamed from: e */
    public static void m100011e(Moment moment, VDraweeView vDraweeView, User user) {
        if (m100010d(moment)) {
            vDraweeView.setImageResource(TEnum.equals(user.gender, "male") ? lbc0.f131166w : lbc0.f131158v);
        } else {
            uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m100012f(TopicMoment topicMoment, VDraweeView vDraweeView, User user) {
        if (topicMoment.isTopicAnonymousType()) {
            vDraweeView.setImageResource(TEnum.equals(user.gender, "male") ? lbc0.f131166w : lbc0.f131158v);
        } else {
            uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m100013g(Act act, Moment moment, String str, String str2) {
        m100014h(act, moment, str, str2, true);
    }

    /* JADX INFO: renamed from: h */
    public static void m100014h(Act act, Moment moment, String str, String str2, boolean z) {
        if (!m100010d(moment)) {
            act.startActivity(m100008b(act, str, str2));
        } else if (z) {
            o1j0.m165651y("Ta发布了匿名动态，无法追踪到Ta~");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m100015i(Act act, Moment moment, String str, String str2) {
        m100016j(act, moment, str, str2, true);
    }

    /* JADX INFO: renamed from: j */
    public static void m100016j(Act act, Moment moment, String str, String str2, boolean z) {
        if (!m100010d(moment)) {
            act.startActivity(m100009c(act, str, str2));
        } else if (z) {
            o1j0.m165651y("Ta发布了匿名动态，无法追踪到Ta~");
        }
    }
}

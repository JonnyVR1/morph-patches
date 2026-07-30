package p007l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.Act;
import l.lsi0;
import l.qib0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vs0 {
    /* JADX INFO: renamed from: a */
    public static String m15563a(Moment moment, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!m15566d(moment)) {
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
    public static Intent m15564b(Act act, String str, String str2) {
        return kjb0.m11456h(act, str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m15565c(Act act, String str, String str2) {
        return PhotoAlbumFeedAct.m5428V1(act, str, str2, -1, 2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15566d(Moment moment) {
        return moment != null && moment.isAnonymousMoment();
    }

    /* JADX INFO: renamed from: e */
    public static void m15567e(Moment moment, VDraweeView vDraweeView, User user) {
        if (m15566d(moment)) {
            vDraweeView.setImageResource(TEnum.equals(user.gender, "male") ? f3c0.f7931w : f3c0.f7923v);
        } else {
            qib0.G.Q0(vDraweeView, user.m1042fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m15568f(TopicMoment topicMoment, VDraweeView vDraweeView, User user) {
        if (topicMoment.isTopicAnonymousType()) {
            vDraweeView.setImageResource(TEnum.equals(user.gender, "male") ? f3c0.f7931w : f3c0.f7923v);
        } else {
            qib0.G.Q0(vDraweeView, user.m1042fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15569g(Act act, Moment moment, String str, String str2) {
        m15570h(act, moment, str, str2, true);
    }

    /* JADX INFO: renamed from: h */
    public static void m15570h(Act act, Moment moment, String str, String str2, boolean z) {
        if (!m15566d(moment)) {
            act.startActivity(m15564b(act, str, str2));
        } else if (z) {
            lsi0.y("Ta发布了匿名动态，无法追踪到Ta~");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m15571i(Act act, Moment moment, String str, String str2) {
        m15572j(act, moment, str, str2, true);
    }

    /* JADX INFO: renamed from: j */
    public static void m15572j(Act act, Moment moment, String str, String str2, boolean z) {
        if (!m15566d(moment)) {
            act.startActivity(m15565c(act, str, str2));
        } else if (z) {
            lsi0.y("Ta发布了匿名动态，无法追踪到Ta~");
        }
    }
}

package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class vs0 {
    /* JADX INFO: renamed from: a */
    public static String m199795a(Moment moment, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!m199798d(moment)) {
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
    public static Intent m199796b(Act act, String str, String str2) {
        return kjb0.m146197h(act, str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m199797c(Act act, String str, String str2) {
        return PhotoAlbumFeedAct.m64355V1(act, str, str2, -1, 2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m199798d(Moment moment) {
        return moment != null && moment.isAnonymousMoment();
    }

    /* JADX INFO: renamed from: e */
    public static void m199799e(Moment moment, VDraweeView vDraweeView, User user) {
        if (m199798d(moment)) {
            vDraweeView.setImageResource(TEnum.equals(user.gender, "male") ? f3c0.f94648w : f3c0.f94640v);
        } else {
            qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m199800f(TopicMoment topicMoment, VDraweeView vDraweeView, User user) {
        if (topicMoment.isTopicAnonymousType()) {
            vDraweeView.setImageResource(TEnum.equals(user.gender, "male") ? f3c0.f94648w : f3c0.f94640v);
        } else {
            qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m199801g(Act act, Moment moment, String str, String str2) {
        m199802h(act, moment, str, str2, true);
    }

    /* JADX INFO: renamed from: h */
    public static void m199802h(Act act, Moment moment, String str, String str2, boolean z) {
        if (!m199798d(moment)) {
            act.startActivity(m199796b(act, str, str2));
        } else if (z) {
            lsi0.m151595y("Ta发布了匿名动态，无法追踪到Ta~");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m199803i(Act act, Moment moment, String str, String str2) {
        m199804j(act, moment, str, str2, true);
    }

    /* JADX INFO: renamed from: j */
    public static void m199804j(Act act, Moment moment, String str, String str2, boolean z) {
        if (!m199798d(moment)) {
            act.startActivity(m199797c(act, str, str2));
        } else if (z) {
            lsi0.m151595y("Ta发布了匿名动态，无法追踪到Ta~");
        }
    }
}

package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class b9i {

    /* JADX INFO: renamed from: a */
    public Set<Integer> f74580a = new HashSet();

    /* JADX INFO: renamed from: b */
    public Map<Integer, Long> f74581b = new HashMap();

    /* JADX INFO: renamed from: c */
    public List<Long> f74582c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<Integer> f74583d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Act f74584e;

    public b9i(Act act) {
        this.f74584e = act;
    }

    /* JADX INFO: renamed from: a */
    public void m100800a(String str, int i) {
        if (m100813n(str)) {
            if (this.f74582c.size() == 0) {
                if (i == 0) {
                    this.f74582c.add(Long.valueOf(System.currentTimeMillis()));
                    this.f74583d.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            List<Integer> list = this.f74583d;
            Integer num = list.get(list.size() - 1);
            if (NullChecker.m81303a(num)) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    if (i != 1 && i != 2) {
                        return;
                    }
                } else if (iIntValue != 1 && iIntValue != 2) {
                    if (iIntValue != 3) {
                        return;
                    }
                    if (i != 1) {
                        return;
                    }
                } else if (i != 3) {
                    return;
                }
                this.f74582c.add(Long.valueOf(System.currentTimeMillis()));
                this.f74583d.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m100801b(boolean z) {
        int iLongValue = 0;
        for (Integer num : this.f74581b.keySet()) {
            if (!z || num.intValue() != 0) {
                if (NullChecker.m81303a(this.f74581b.get(num))) {
                    iLongValue = (int) (((long) iLongValue) + this.f74581b.get(num).longValue());
                }
            }
        }
        return iLongValue;
    }

    /* JADX INFO: renamed from: c */
    public final long m100802c() {
        long jLongValue = 0;
        int i = 1;
        while (i < this.f74582c.size() - 1) {
            long jLongValue2 = this.f74582c.get(i).longValue();
            int i2 = i + 1;
            if (i2 < this.f74582c.size()) {
                jLongValue += this.f74582c.get(i2).longValue() - jLongValue2;
                i = i2;
            }
            i++;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: d */
    public final long m100803d(int i) {
        long jM100804e = m100804e();
        if (jM100804e == -1) {
            return jM100804e;
        }
        Long l2 = this.f74581b.get(Integer.valueOf(i));
        Map<Integer, Long> map = this.f74581b;
        if (l2 == null) {
            map.put(Integer.valueOf(i), Long.valueOf(jM100804e));
            return jM100804e;
        }
        map.put(Integer.valueOf(i), Long.valueOf(this.f74581b.get(Integer.valueOf(i)).longValue() + jM100804e));
        return jM100804e;
    }

    /* JADX INFO: renamed from: e */
    public final long m100804e() {
        if (this.f74582c.size() <= 1) {
            return -1L;
        }
        long jLongValue = this.f74582c.get(0).longValue();
        List<Long> list = this.f74582c;
        return Math.max((list.get(list.size() - 1).longValue() - jLongValue) - m100802c(), 0L);
    }

    /* JADX INFO: renamed from: f */
    public final String m100805f() {
        if (!NullChecker.m81303a(this.f74584e)) {
            return "";
        }
        Act act = this.f74584e;
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m66189b2() : "";
    }

    /* JADX INFO: renamed from: g */
    public final float m100806g(Moment moment) {
        if (moment.media.size() <= 0) {
            return 0.0f;
        }
        Media media = moment.media.get(0);
        if (media instanceof Video) {
            return ((Video) media).duration;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public void m100807h() {
        p6j0.m167672f("e_video_recommend_over", "p_video_recommend", p6j0.C19147a.m167677f("video_amount", this.f74580a.size()), p6j0.C19147a.m167678g("all_video_time", String.format("%.1f", Float.valueOf(m100801b(true) / 1000.0f))));
    }

    /* JADX INFO: renamed from: i */
    public void m100808i() {
        if ((this.f74584e instanceof PhotoAlbumFeedPreviewAct) && NullChecker.m81303a(PhotoAlbumFeedPreviewAct.f42597l) && this.f74582c.size() != 0) {
            m100800a(PhotoAlbumFeedPreviewAct.f42597l, 2);
            m100803d(0);
            p6j0.m167672f("e_video_recommend_over", "p_moment_preview", p6j0.C19147a.m167678g("play_time", String.format("%.1f", Float.valueOf(m100801b(false) / 1000.0f))));
        } else if (this.f74584e instanceof FeedVideoFlowAct) {
            m100807h();
        }
        this.f74581b.clear();
        this.f74580a.clear();
        m100812m();
    }

    /* JADX INFO: renamed from: j */
    public void m100809j(int i) {
        this.f74580a.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public void m100810k(Moment moment, int i) {
        if (moment == null) {
            m100812m();
            return;
        }
        long jM100803d = m100803d(i);
        if (jM100803d == -1) {
            return;
        }
        p6j0.m167672f("e_moment_over", "p_video_recommend", p6j0.C19147a.m167678g("video_time", String.format("%.1f", Float.valueOf(m100806g(moment)))), p6j0.C19147a.m167678g("play_time", String.format("%.1f", Double.valueOf(jM100803d / 1000.0d))), p6j0.C19147a.m167678g("moment_id", moment.f56011id), p6j0.C19147a.m167678g("owner_id", moment.owner), p6j0.C19147a.m167677f("order", i));
        m100812m();
    }

    /* JADX INFO: renamed from: l */
    public void m100811l(Moment moment, int i) {
        if (NullChecker.m81303a(moment)) {
            j760 j760VarM140076a = j760.m140076a("qa_optional", moment.shareMyVote ? "1" : "0");
            List<TopicMomentIdBox> list = moment.topics;
            p6j0.m167671e("e_moment", "p_video_recommend", j760VarM140076a, j760.m140076a("topic_id", (list == null || list.size() == 0) ? "" : moment.topics.get(0).f38824id), j760.m140076a("moment_id", moment.f56011id), j760.m140076a("owner_id", moment.owner), j760.m140076a("order", Integer.valueOf(i)), j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(moment))), j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(moment))), j760.m140076a("report", moment.report), j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(moment.owner)))));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m100812m() {
        this.f74582c.clear();
        this.f74583d.clear();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m100813n(String str) {
        return str.equals(m100805f()) || str.equals(PhotoAlbumFeedPreviewAct.f42597l);
    }

    public b9i() {
    }
}

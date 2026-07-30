package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class qai {

    /* JADX INFO: renamed from: a */
    public Set<Integer> f156385a = new HashSet();

    /* JADX INFO: renamed from: b */
    public Map<Integer, Long> f156386b = new HashMap();

    /* JADX INFO: renamed from: c */
    public List<Long> f156387c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<Integer> f156388d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Act f156389e;

    public qai(Act act) {
        this.f156389e = act;
    }

    /* JADX INFO: renamed from: a */
    public void m175928a(String str, int i) {
        if (m175941n(str)) {
            if (this.f156387c.size() == 0) {
                if (i == 0) {
                    this.f156387c.add(Long.valueOf(System.currentTimeMillis()));
                    this.f156388d.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            List<Integer> list = this.f156388d;
            Integer num = list.get(list.size() - 1);
            if (NullChecker.m82486a(num)) {
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
                this.f156387c.add(Long.valueOf(System.currentTimeMillis()));
                this.f156388d.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m175929b(boolean z) {
        int iLongValue = 0;
        for (Integer num : this.f156386b.keySet()) {
            if (!z || num.intValue() != 0) {
                if (NullChecker.m82486a(this.f156386b.get(num))) {
                    iLongValue = (int) (((long) iLongValue) + this.f156386b.get(num).longValue());
                }
            }
        }
        return iLongValue;
    }

    /* JADX INFO: renamed from: c */
    public final long m175930c() {
        long jLongValue = 0;
        int i = 1;
        while (i < this.f156387c.size() - 1) {
            long jLongValue2 = this.f156387c.get(i).longValue();
            int i2 = i + 1;
            if (i2 < this.f156387c.size()) {
                jLongValue += this.f156387c.get(i2).longValue() - jLongValue2;
                i = i2;
            }
            i++;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: d */
    public final long m175931d(int i) {
        long jM175932e = m175932e();
        if (jM175932e == -1) {
            return jM175932e;
        }
        Long l2 = this.f156386b.get(Integer.valueOf(i));
        Map<Integer, Long> map = this.f156386b;
        if (l2 == null) {
            map.put(Integer.valueOf(i), Long.valueOf(jM175932e));
            return jM175932e;
        }
        map.put(Integer.valueOf(i), Long.valueOf(this.f156386b.get(Integer.valueOf(i)).longValue() + jM175932e));
        return jM175932e;
    }

    /* JADX INFO: renamed from: e */
    public final long m175932e() {
        if (this.f156387c.size() <= 1) {
            return -1L;
        }
        long jLongValue = this.f156387c.get(0).longValue();
        List<Long> list = this.f156387c;
        return Math.max((list.get(list.size() - 1).longValue() - jLongValue) - m175930c(), 0L);
    }

    /* JADX INFO: renamed from: f */
    public final String m175933f() {
        if (!NullChecker.m82486a(this.f156389e)) {
            return "";
        }
        Act act = this.f156389e;
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m67372c2() : "";
    }

    /* JADX INFO: renamed from: g */
    public final float m175934g(Moment moment) {
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
    public void m175935h() {
        tfj0.m190943f("e_video_recommend_over", "p_video_recommend", tfj0.C20302a.m190948f("video_amount", this.f156385a.size()), tfj0.C20302a.m190949g("all_video_time", String.format("%.1f", Float.valueOf(m175929b(true) / 1000.0f))));
    }

    /* JADX INFO: renamed from: i */
    public void m175936i() {
        if ((this.f156389e instanceof PhotoAlbumFeedPreviewAct) && NullChecker.m82486a(PhotoAlbumFeedPreviewAct.f43445l) && this.f156387c.size() != 0) {
            m175928a(PhotoAlbumFeedPreviewAct.f43445l, 2);
            m175931d(0);
            tfj0.m190943f("e_video_recommend_over", "p_moment_preview", tfj0.C20302a.m190949g("play_time", String.format("%.1f", Float.valueOf(m175929b(false) / 1000.0f))));
        } else if (this.f156389e instanceof FeedVideoFlowAct) {
            m175935h();
        }
        this.f156386b.clear();
        this.f156385a.clear();
        m175940m();
    }

    /* JADX INFO: renamed from: j */
    public void m175937j(int i) {
        this.f156385a.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public void m175938k(Moment moment, int i) {
        if (moment == null) {
            m175940m();
            return;
        }
        long jM175931d = m175931d(i);
        if (jM175931d == -1) {
            return;
        }
        tfj0.m190943f("e_moment_over", "p_video_recommend", tfj0.C20302a.m190949g("video_time", String.format("%.1f", Float.valueOf(m175934g(moment)))), tfj0.C20302a.m190949g("play_time", String.format("%.1f", Double.valueOf(jM175931d / 1000.0d))), tfj0.C20302a.m190949g("moment_id", moment.f56859id), tfj0.C20302a.m190949g("owner_id", moment.owner), tfj0.C20302a.m190948f("order", i));
        m175940m();
    }

    /* JADX INFO: renamed from: l */
    public void m175939l(Moment moment, int i) {
        if (NullChecker.m82486a(moment)) {
            pf60 pf60VarM172085a = pf60.m172085a("qa_optional", moment.shareMyVote ? "1" : "0");
            List<TopicMomentIdBox> list = moment.topics;
            tfj0.m190942e("e_moment", "p_video_recommend", pf60VarM172085a, pf60.m172085a("topic_id", (list == null || list.size() == 0) ? "" : moment.topics.get(0).f39672id), pf60.m172085a("moment_id", moment.f56859id), pf60.m172085a("owner_id", moment.owner), pf60.m172085a("order", Integer.valueOf(i)), pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(moment))), pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(moment))), pf60.m172085a("report", moment.report), pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(moment.owner)))));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m175940m() {
        this.f156387c.clear();
        this.f156388d.clear();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m175941n(String str) {
        return str.equals(m175933f()) || str.equals(PhotoAlbumFeedPreviewAct.f43445l);
    }

    public qai() {
    }
}

package p007l;

import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Order;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b9i {

    /* JADX INFO: renamed from: a */
    public Set<Integer> f6192a = new HashSet();

    /* JADX INFO: renamed from: b */
    public Map<Integer, Long> f6193b = new HashMap();

    /* JADX INFO: renamed from: c */
    public List<Long> f6194c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<Integer> f6195d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Act f6196e;

    public b9i(Act act) {
        this.f6196e = act;
    }

    /* JADX INFO: renamed from: a */
    public void m8766a(String str, int i) {
        if (m8779n(str)) {
            if (this.f6194c.size() == 0) {
                if (i == 0) {
                    this.f6194c.add(Long.valueOf(System.currentTimeMillis()));
                    this.f6195d.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            List<Integer> list = this.f6195d;
            Integer num = list.get(list.size() - 1);
            if (NullChecker.a(num)) {
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
                this.f6194c.add(Long.valueOf(System.currentTimeMillis()));
                this.f6195d.add(Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m8767b(boolean z) {
        int iLongValue = 0;
        for (Integer num : this.f6193b.keySet()) {
            if (!z || num.intValue() != 0) {
                if (NullChecker.a(this.f6193b.get(num))) {
                    iLongValue = (int) (((long) iLongValue) + this.f6193b.get(num).longValue());
                }
            }
        }
        return iLongValue;
    }

    /* JADX INFO: renamed from: c */
    public final long m8768c() {
        long jLongValue = 0;
        int i = 1;
        while (i < this.f6194c.size() - 1) {
            long jLongValue2 = this.f6194c.get(i).longValue();
            int i2 = i + 1;
            if (i2 < this.f6194c.size()) {
                jLongValue += this.f6194c.get(i2).longValue() - jLongValue2;
                i = i2;
            }
            i++;
        }
        return jLongValue;
    }

    /* JADX INFO: renamed from: d */
    public final long m8769d(int i) {
        long jM8770e = m8770e();
        if (jM8770e == -1) {
            return jM8770e;
        }
        Long l2 = this.f6193b.get(Integer.valueOf(i));
        Map<Integer, Long> map = this.f6193b;
        if (l2 == null) {
            map.put(Integer.valueOf(i), Long.valueOf(jM8770e));
            return jM8770e;
        }
        map.put(Integer.valueOf(i), Long.valueOf(this.f6193b.get(Integer.valueOf(i)).longValue() + jM8770e));
        return jM8770e;
    }

    /* JADX INFO: renamed from: e */
    public final long m8770e() {
        if (this.f6194c.size() <= 1) {
            return -1L;
        }
        long jLongValue = this.f6194c.get(0).longValue();
        List<Long> list = this.f6194c;
        return Math.max((list.get(list.size() - 1).longValue() - jLongValue) - m8768c(), 0L);
    }

    /* JADX INFO: renamed from: f */
    public final String m8771f() {
        if (!NullChecker.a(this.f6196e)) {
            return "";
        }
        FeedVideoFlowAct feedVideoFlowAct = this.f6196e;
        return feedVideoFlowAct instanceof FeedVideoFlowAct ? feedVideoFlowAct.m7347b2() : "";
    }

    /* JADX INFO: renamed from: g */
    public final float m8772g(Moment moment) {
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
    public void m8773h() {
        p6j0.m12916f("e_video_recommend_over", "p_video_recommend", p6j0.C2456a.m12921f("video_amount", this.f6192a.size()), p6j0.C2456a.m12922g("all_video_time", String.format("%.1f", Float.valueOf(m8767b(true) / 1000.0f))));
    }

    /* JADX INFO: renamed from: i */
    public void m8774i() {
        if ((this.f6196e instanceof PhotoAlbumFeedPreviewAct) && NullChecker.a(PhotoAlbumFeedPreviewAct.f4058l) && this.f6194c.size() != 0) {
            m8766a(PhotoAlbumFeedPreviewAct.f4058l, 2);
            m8769d(0);
            p6j0.m12916f("e_video_recommend_over", "p_moment_preview", p6j0.C2456a.m12922g("play_time", String.format("%.1f", Float.valueOf(m8767b(false) / 1000.0f))));
        } else if (this.f6196e instanceof FeedVideoFlowAct) {
            m8773h();
        }
        this.f6193b.clear();
        this.f6192a.clear();
        m8778m();
    }

    /* JADX INFO: renamed from: j */
    public void m8775j(int i) {
        this.f6192a.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public void m8776k(Moment moment, int i) {
        if (moment == null) {
            m8778m();
            return;
        }
        long jM8769d = m8769d(i);
        if (jM8769d == -1) {
            return;
        }
        p6j0.m12916f("e_moment_over", "p_video_recommend", p6j0.C2456a.m12922g("video_time", String.format("%.1f", Float.valueOf(m8772g(moment)))), p6j0.C2456a.m12922g("play_time", String.format("%.1f", Double.valueOf(jM8769d / 1000.0d))), p6j0.C2456a.m12922g("moment_id", ((DbObject) moment).id), p6j0.C2456a.m12922g("owner_id", moment.owner), p6j0.C2456a.m12921f(Order.TYPE, i));
        m8778m();
    }

    /* JADX INFO: renamed from: l */
    public void m8777l(Moment moment, int i) {
        if (NullChecker.a(moment)) {
            j760 j760VarA = j760.a("qa_optional", moment.shareMyVote ? "1" : "0");
            List<TopicMomentIdBox> list = moment.topics;
            p6j0.m12915e("e_moment", "p_video_recommend", j760VarA, j760.a("topic_id", (list == null || list.size() == 0) ? "" : moment.topics.get(0).f285id), j760.a("moment_id", ((DbObject) moment).id), j760.a("owner_id", moment.owner), j760.a(Order.TYPE, Integer.valueOf(i)), j760.a("moment_distance", Long.valueOf(vqg.m15477G(moment))), j760.a("moment_create_time", Long.valueOf(vqg.m15475F(moment))), j760.a("report", moment.report), j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(moment.owner)))));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8778m() {
        this.f6194c.clear();
        this.f6195d.clear();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8779n(String str) {
        return str.equals(m8771f()) || str.equals(PhotoAlbumFeedPreviewAct.f4058l);
    }

    public b9i() {
    }
}

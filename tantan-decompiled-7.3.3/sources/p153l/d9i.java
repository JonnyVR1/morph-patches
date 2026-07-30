package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class d9i extends ar2<e9i> {

    /* JADX INFO: renamed from: a */
    public String f85777a;

    /* JADX INFO: renamed from: b */
    public int f85778b;

    /* JADX INFO: renamed from: c */
    public FeedTopicMomentFragment f85779c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedBaseFrag f85780d;

    /* JADX INFO: renamed from: e */
    public String f85781e;

    /* JADX INFO: renamed from: f */
    public TopicMoment f85782f;

    /* JADX INFO: renamed from: g */
    public String f85783g;

    /* JADX INFO: renamed from: h */
    public Moment f85784h;

    /* JADX INFO: renamed from: i */
    public C22507a<List<TopicMoment>> f85785i;

    /* JADX INFO: renamed from: j */
    public C22507a<Boolean> f85786j;

    /* JADX INFO: renamed from: k */
    public boolean f85787k;

    public d9i(ner nerVar) {
        super(nerVar);
        this.f85785i = C22507a.m222758b();
        this.f85786j = C22507a.m222758b();
        this.f85779c = (FeedTopicMomentFragment) nerVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m115068g0(Moment moment) {
        if (!NullChecker.m82487b(moment.topics) || moment.topics.size() <= 0 || m115074m0()) {
            return;
        }
        Iterator<TopicMomentIdBox> it = moment.topics.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f39672id, this.f85781e)) {
                m115070i0().m200014Q0(moment);
                if (!this.f85787k && !moment.f56859id.startsWith("fake_id_")) {
                    m115070i0().m200007F1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public PhotoAlbumFeedBaseFrag m115069h0() {
        if (this.f85780d == null) {
            this.f85780d = this.f85779c.m67346Q4();
        }
        return this.f85780d;
    }

    /* JADX INFO: renamed from: i0 */
    public v670 m115070i0() {
        return m115069h0().f42299A;
    }

    /* JADX INFO: renamed from: j0 */
    public final String m115071j0() {
        return m115074m0() ? "recommend" : "latest";
    }

    /* JADX INFO: renamed from: k0 */
    public n570 m115072k0() {
        return new p7j0(this.f85779c, m115071j0());
    }

    /* JADX INFO: renamed from: l0 */
    public void m115073l0() {
        this.f85781e = this.f85779c.getArguments().getString("topic_id");
        this.f85777a = this.f85779c.getArguments().getString("from");
        this.f85778b = this.f85779c.getArguments().getInt("page_type", -1);
        this.f85783g = this.f85779c.getArguments().getString("user_id");
        this.f85787k = this.f85778b == 8;
        this.f85784h = (Moment) this.f85779c.getArguments().getSerializable("single_topic_moment");
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m115074m0() {
        return "qa_recommend".equals(this.f85777a) || "topic_recommend".equals(this.f85777a);
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m115075n0() {
        TopicMoment topicMoment = this.f85782f;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m115076o0(Moment moment) {
        return Boolean.valueOf(moment.f56859id.equals(this.f85784h.f56859id));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Boolean m115077p0(TopicMoment topicMoment) {
        return Boolean.valueOf(TextUtils.equals(topicMoment.f40095id, this.f85781e));
    }

    /* JADX INFO: renamed from: q0 */
    public C22421c<List<TopicMoment>> m115078q0() {
        return this.f85785i;
    }

    /* JADX INFO: renamed from: r0 */
    public void m115079r0(bkj0<Links, List<Moment>, List<TopicMoment>> bkj0Var) {
        boolean z;
        if (NullChecker.m82486a(this.f85784h)) {
            if (jyb.m147479J(bkj0Var.f77082b)) {
                z = false;
            } else {
                User userM145688e8 = FeedModule.f39703d.m145688e8(bkj0Var.f77082b.get(0).owner);
                z = NullChecker.m82486a(userM145688e8) && userM145688e8.isTeamAccount();
                Moment moment = (Moment) jyb.m147529r(bkj0Var.f77082b, new qcj() { // from class: l.b9i
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f75583a.m115076o0((Moment) obj);
                    }
                });
                if (NullChecker.m82486a(moment) && !z) {
                    bkj0Var.f77082b.remove(moment);
                }
            }
            if (!z) {
                bkj0Var.f77082b.add(0, this.f85784h);
            }
        }
        ((e9i) this.viewModel).m119894k(false);
        this.f85782f = (TopicMoment) jyb.m147529r(bkj0Var.f77083c, new qcj() { // from class: l.c9i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80487a.m115077p0((TopicMoment) obj);
            }
        });
        this.f85785i.onNext(bkj0Var.f77083c);
        if (m115075n0()) {
            m115070i0().mo149177L1(pf60.m172085a(Links.new_(), new ArrayList()));
        } else {
            m115070i0().mo149177L1(new pf60<>(bkj0Var.f77081a, bkj0Var.f77082b));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

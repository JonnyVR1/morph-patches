package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.j760;
import l.jq2;
import l.mcr;
import l.vwb;
import l.w9j;
import l.xaj0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o7i extends jq2<p7i> {

    /* JADX INFO: renamed from: a */
    public String f11364a;

    /* JADX INFO: renamed from: b */
    public int f11365b;

    /* JADX INFO: renamed from: c */
    public FeedTopicMomentFragment f11366c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedBaseFrag f11367d;

    /* JADX INFO: renamed from: e */
    public String f11368e;

    /* JADX INFO: renamed from: f */
    public TopicMoment f11369f;

    /* JADX INFO: renamed from: g */
    public String f11370g;

    /* JADX INFO: renamed from: h */
    public Moment f11371h;

    /* JADX INFO: renamed from: i */
    public a<List<TopicMoment>> f11372i;

    /* JADX INFO: renamed from: j */
    public a<Boolean> f11373j;

    /* JADX INFO: renamed from: k */
    public boolean f11374k;

    public o7i(mcr mcrVar) {
        super(mcrVar);
        this.f11372i = a.b();
        this.f11373j = a.b();
        this.f11366c = (FeedTopicMomentFragment) mcrVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m12451g0(Moment moment) {
        if (!NullChecker.b(moment.topics) || moment.topics.size() <= 0 || m12457m0()) {
            return;
        }
        Iterator<TopicMomentIdBox> it = moment.topics.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f285id, this.f11368e)) {
                m12453i0().m13318Q0(moment);
                if (!this.f11374k && !((DbObject) moment).id.startsWith("fake_id_")) {
                    m12453i0().m13311F1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public PhotoAlbumFeedBaseFrag m12452h0() {
        if (this.f11367d == null) {
            this.f11367d = this.f11366c.m7315Q4();
        }
        return this.f11367d;
    }

    /* JADX INFO: renamed from: i0 */
    public py60 m12453i0() {
        return m12452h0().f2912A;
    }

    /* JADX INFO: renamed from: j0 */
    public final String m12454j0() {
        return m12457m0() ? "recommend" : "latest";
    }

    /* JADX INFO: renamed from: k0 */
    public hx60 m12455k0() {
        return new lyi0(this.f11366c, m12454j0());
    }

    /* JADX INFO: renamed from: l0 */
    public void m12456l0() {
        this.f11368e = this.f11366c.getArguments().getString("topic_id");
        this.f11364a = this.f11366c.getArguments().getString("from");
        this.f11365b = this.f11366c.getArguments().getInt("page_type", -1);
        this.f11370g = this.f11366c.getArguments().getString("user_id");
        this.f11374k = this.f11365b == 8;
        this.f11371h = (Moment) this.f11366c.getArguments().getSerializable("single_topic_moment");
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m12457m0() {
        return "qa_recommend".equals(this.f11364a) || "topic_recommend".equals(this.f11364a);
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m12458n0() {
        TopicMoment topicMoment = this.f11369f;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m12459o0(Moment moment) {
        return Boolean.valueOf(((DbObject) moment).id.equals(((DbObject) this.f11371h).id));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Boolean m12460p0(TopicMoment topicMoment) {
        return Boolean.valueOf(TextUtils.equals(topicMoment.f708id, this.f11368e));
    }

    /* JADX INFO: renamed from: q0 */
    public c<List<TopicMoment>> m12461q0() {
        return this.f11372i;
    }

    /* JADX INFO: renamed from: r0 */
    public void m12462r0(xaj0<Links, List<Moment>, List<TopicMoment>> xaj0Var) {
        boolean z;
        if (NullChecker.a(this.f11371h)) {
            if (vwb.J((Collection) xaj0Var.b)) {
                z = false;
            } else {
                User userM16628e8 = FeedModule.f316d.m16628e8(((Moment) ((List) xaj0Var.b).get(0)).owner);
                z = NullChecker.a(userM16628e8) && userM16628e8.isTeamAccount();
                Moment moment = (Moment) vwb.r((Collection) xaj0Var.b, new w9j() { // from class: l.m7i
                    public final Object call(Object obj) {
                        return this.f10250a.m12459o0((Moment) obj);
                    }
                });
                if (NullChecker.a(moment) && !z) {
                    ((List) xaj0Var.b).remove(moment);
                }
            }
            if (!z) {
                ((List) xaj0Var.b).add(0, this.f11371h);
            }
        }
        ((p7i) ((jq2) this).viewModel).m12939k(false);
        this.f11369f = (TopicMoment) vwb.r((Collection) xaj0Var.c, new w9j() { // from class: l.n7i
            public final Object call(Object obj) {
                return this.f10694a.m12460p0((TopicMoment) obj);
            }
        });
        this.f11372i.onNext((List) xaj0Var.c);
        if (m12458n0()) {
            m12453i0().mo9613L1(j760.a(Links.new_(), new ArrayList()));
        } else {
            m12453i0().mo9613L1(new j760<>((Links) xaj0Var.a, (List) xaj0Var.b));
        }
    }

    public void destroy() {
    }
}

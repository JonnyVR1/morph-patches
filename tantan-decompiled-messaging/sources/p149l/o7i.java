package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicMomentFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class o7i extends jq2<p7i> {

    /* JADX INFO: renamed from: a */
    public String f142492a;

    /* JADX INFO: renamed from: b */
    public int f142493b;

    /* JADX INFO: renamed from: c */
    public FeedTopicMomentFragment f142494c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedBaseFrag f142495d;

    /* JADX INFO: renamed from: e */
    public String f142496e;

    /* JADX INFO: renamed from: f */
    public TopicMoment f142497f;

    /* JADX INFO: renamed from: g */
    public String f142498g;

    /* JADX INFO: renamed from: h */
    public Moment f142499h;

    /* JADX INFO: renamed from: i */
    public C22392a<List<TopicMoment>> f142500i;

    /* JADX INFO: renamed from: j */
    public C22392a<Boolean> f142501j;

    /* JADX INFO: renamed from: k */
    public boolean f142502k;

    public o7i(mcr mcrVar) {
        super(mcrVar);
        this.f142500i = C22392a.m221512b();
        this.f142501j = C22392a.m221512b();
        this.f142494c = (FeedTopicMomentFragment) mcrVar;
    }

    /* JADX INFO: renamed from: g0 */
    public void m162985g0(Moment moment) {
        if (!NullChecker.m81304b(moment.topics) || moment.topics.size() <= 0 || m162991m0()) {
            return;
        }
        Iterator<TopicMomentIdBox> it = moment.topics.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f38824id, this.f142496e)) {
                m162987i0().m172060Q0(moment);
                if (!this.f142502k && !moment.f56011id.startsWith("fake_id_")) {
                    m162987i0().m172053F1();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public PhotoAlbumFeedBaseFrag m162986h0() {
        if (this.f142495d == null) {
            this.f142495d = this.f142494c.m66163Q4();
        }
        return this.f142495d;
    }

    /* JADX INFO: renamed from: i0 */
    public py60 m162987i0() {
        return m162986h0().f41451A;
    }

    /* JADX INFO: renamed from: j0 */
    public final String m162988j0() {
        return m162991m0() ? "recommend" : "latest";
    }

    /* JADX INFO: renamed from: k0 */
    public hx60 m162989k0() {
        return new lyi0(this.f142494c, m162988j0());
    }

    /* JADX INFO: renamed from: l0 */
    public void m162990l0() {
        this.f142496e = this.f142494c.getArguments().getString("topic_id");
        this.f142492a = this.f142494c.getArguments().getString("from");
        this.f142493b = this.f142494c.getArguments().getInt("page_type", -1);
        this.f142498g = this.f142494c.getArguments().getString("user_id");
        this.f142502k = this.f142493b == 8;
        this.f142499h = (Moment) this.f142494c.getArguments().getSerializable("single_topic_moment");
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m162991m0() {
        return "qa_recommend".equals(this.f142492a) || "topic_recommend".equals(this.f142492a);
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m162992n0() {
        TopicMoment topicMoment = this.f142497f;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m162993o0(Moment moment) {
        return Boolean.valueOf(moment.f56011id.equals(this.f142499h.f56011id));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Boolean m162994p0(TopicMoment topicMoment) {
        return Boolean.valueOf(TextUtils.equals(topicMoment.f39247id, this.f142496e));
    }

    /* JADX INFO: renamed from: q0 */
    public C22306c<List<TopicMoment>> m162995q0() {
        return this.f142500i;
    }

    /* JADX INFO: renamed from: r0 */
    public void m162996r0(xaj0<Links, List<Moment>, List<TopicMoment>> xaj0Var) {
        boolean z;
        if (NullChecker.m81303a(this.f142499h)) {
            if (vwb.m200296J(xaj0Var.f191752b)) {
                z = false;
            } else {
                User userM209447e8 = FeedModule.f38855d.m209447e8(xaj0Var.f191752b.get(0).owner);
                z = NullChecker.m81303a(userM209447e8) && userM209447e8.isTeamAccount();
                Moment moment = (Moment) vwb.m200346r(xaj0Var.f191752b, new w9j() { // from class: l.m7i
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f131827a.m162993o0((Moment) obj);
                    }
                });
                if (NullChecker.m81303a(moment) && !z) {
                    xaj0Var.f191752b.remove(moment);
                }
            }
            if (!z) {
                xaj0Var.f191752b.add(0, this.f142499h);
            }
        }
        ((p7i) this.viewModel).m167759k(false);
        this.f142497f = (TopicMoment) vwb.m200346r(xaj0Var.f191753c, new w9j() { // from class: l.n7i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137531a.m162994p0((TopicMoment) obj);
            }
        });
        this.f142500i.onNext(xaj0Var.f191753c);
        if (m162992n0()) {
            m162987i0().mo114782L1(j760.m140076a(Links.new_(), new ArrayList()));
        } else {
            m162987i0().mo114782L1(new j760<>(xaj0Var.f191751a, xaj0Var.f191752b));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.item.FeedVideoViewFlowItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r8i extends dac0<Moment> {

    /* JADX INFO: renamed from: d */
    public Act f12547d;

    /* JADX INFO: renamed from: e */
    public boolean f12548e;

    /* JADX INFO: renamed from: f */
    public boolean f12549f;

    /* JADX INFO: renamed from: g */
    public boolean f12550g;

    /* JADX INFO: renamed from: h */
    public int f12551h;

    /* JADX INFO: renamed from: i */
    public String f12552i;

    /* JADX INFO: renamed from: j */
    public FeedVideoViewFlowItemView f12553j;

    /* JADX INFO: renamed from: k */
    public FeedVideoViewFlowItemView f12554k;

    /* JADX INFO: renamed from: o */
    public Moment f12558o;

    /* JADX INFO: renamed from: p */
    public String f12559p;

    /* JADX INFO: renamed from: q */
    public d30 f12560q;

    /* JADX INFO: renamed from: c */
    public List<Moment> f12546c = new ArrayList();

    /* JADX INFO: renamed from: l */
    public e30<Integer> f12555l = null;

    /* JADX INFO: renamed from: m */
    public List<FeedVideoViewFlowItemView> f12556m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public lqv f12557n = new lqv();

    public r8i(Act act, String str, boolean z, boolean z2, boolean z3) {
        this.f12547d = act;
        this.f12559p = str;
        this.f12548e = z;
        this.f12549f = z2;
        this.f12550g = z3;
        if (act instanceof FeedVideoFlowAct) {
            m13883X(act.getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID"));
        }
        String stringExtra = act.getIntent().getStringExtra("VIDEO_LIVE_AUTHOR_ID");
        String stringExtra2 = act.getIntent().getStringExtra("VIDEO_LIVE_ROOM_ID");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        this.f12557n.m11698c(stringExtra, stringExtra2);
    }

    /* JADX INFO: renamed from: O */
    private b9i m13862O() {
        FeedVideoFlowAct feedVideoFlowAct = this.f12547d;
        return feedVideoFlowAct instanceof FeedVideoFlowAct ? feedVideoFlowAct.m7345Z1() : new b9i();
    }

    /* JADX INFO: renamed from: C */
    public int m13864C() {
        List<Moment> list = this.f12546c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public View m13865D(ViewGroup viewGroup, int i) {
        FeedVideoViewFlowItemView feedVideoViewFlowItemView = new FeedVideoViewFlowItemView(this.f12547d, this.f12559p, viewGroup.getHeight(), this.f12548e, this.f12549f, this.f12550g);
        feedVideoViewFlowItemView.setAutoNextVideo(this.f12560q);
        feedVideoViewFlowItemView.setLivingStore(this.f12557n);
        this.f12556m.add(feedVideoViewFlowItemView);
        feedVideoViewFlowItemView.setBackgroundColor(0);
        return feedVideoViewFlowItemView;
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m13863A(View view, Moment moment, int i, int i2) {
        if (view instanceof FeedVideoViewFlowItemView) {
            FeedVideoViewFlowItemView feedVideoViewFlowItemView = (FeedVideoViewFlowItemView) view;
            if (i2 == 0) {
                this.f12553j = feedVideoViewFlowItemView;
                this.f12554k = feedVideoViewFlowItemView;
            }
            feedVideoViewFlowItemView.setShowInVideoFlowPosition(i2);
            feedVideoViewFlowItemView.m7362f(m13874N(moment), i2);
            if (i2 == this.f12551h) {
                feedVideoViewFlowItemView.m7361e();
            }
            m13862O().m8775j(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m13867G(List<Moment> list) {
        int size = this.f12546c.size();
        this.f12546c.clear();
        this.f12546c.addAll(list);
        notifyItemRangeInserted(size, list.size() - size);
    }

    /* JADX INFO: renamed from: H */
    public final void m13868H(int i) {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f12556m) {
            if (NullChecker.a(feedVideoViewFlowItemView)) {
                if (i != feedVideoViewFlowItemView.getShowInVideoFlowPosition() || i == this.f12551h) {
                    feedVideoViewFlowItemView.m7365i();
                } else {
                    feedVideoViewFlowItemView.m7361e();
                }
                if (i == feedVideoViewFlowItemView.getShowInVideoFlowPosition()) {
                    feedVideoViewFlowItemView.m7363g();
                } else {
                    feedVideoViewFlowItemView.m7364h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m13869I(int i) {
        if (i != 0) {
            this.f12554k = null;
        } else {
            this.f12554k = this.f12553j;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m13870J() {
        m13862O().m8766a(this.f12552i, 2);
        m13862O().m8776k(this.f12558o, this.f12551h);
    }

    /* JADX INFO: renamed from: K */
    public void m13871K(int i) {
        m13862O().m8777l(this.f12546c.size() > i ? this.f12546c.get(i) : null, i);
        m13870J();
        m13862O().m8775j(i);
    }

    /* JADX INFO: renamed from: L */
    public final Media m13872L(Moment moment) {
        List<Media> list;
        if (moment == null || (list = moment.media) == null || list.size() <= 0) {
            return null;
        }
        return moment.media.get(0);
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Moment getItem(int i) {
        return this.f12546c.get(i);
    }

    /* JADX INFO: renamed from: N */
    public final Moment m13874N(Moment moment) {
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(((DbObject) moment).id);
        Media mediaM13872L = m13872L(moment);
        if (moment != momentM16753w7 && NullChecker.a(mediaM13872L) && (mediaM13872L instanceof Video)) {
            Video video = (Video) mediaM13872L;
            Media mediaM13872L2 = m13872L(momentM16753w7);
            if (NullChecker.a(mediaM13872L2) && (mediaM13872L2 instanceof Video)) {
                ((Video) mediaM13872L2).music = video.music;
            }
        }
        return momentM16753w7;
    }

    /* JADX INFO: renamed from: P */
    public String m13875P() {
        return this.f12552i;
    }

    /* JADX INFO: renamed from: Q */
    public int m13876Q() {
        return this.f12551h;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m13877R(Live live) {
        this.f12557n.m11698c(live.anchor.f264id, live.f228id);
    }

    /* JADX INFO: renamed from: S */
    public void m13878S(int i) {
        m13869I(i);
        m13871K(i);
        m13868H(i);
        this.f12551h = i;
        m13883X(((DbObject) this.f12546c.get(i)).id);
        this.f12558o = this.f12546c.get(i);
    }

    /* JADX INFO: renamed from: T */
    public void m13879T() {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f12556m) {
            if (NullChecker.a(feedVideoViewFlowItemView) && this.f12551h == feedVideoViewFlowItemView.getShowInVideoFlowPosition()) {
                feedVideoViewFlowItemView.m7363g();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m13880U(Music music) {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f12556m) {
            if (NullChecker.a(feedVideoViewFlowItemView) && feedVideoViewFlowItemView.getShowInVideoFlowPosition() == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m13881V(d30 d30Var) {
        this.f12560q = d30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m13882W(e30<Integer> e30Var) {
        this.f12555l = e30Var;
    }

    /* JADX INFO: renamed from: X */
    public final void m13883X(String str) {
        this.f12552i = str;
    }

    /* JADX INFO: renamed from: Y */
    public void m13884Y(List<Live> list) {
        if (vwb.J(list)) {
            return;
        }
        vwb.z(list, new e30() { // from class: l.q8i
            public final void call(Object obj) {
                this.f12153a.m13877R((Live) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m13885e(int i) {
        super.e(i);
        if (NullChecker.a(this.f12555l)) {
            this.f12555l.call(Integer.valueOf(i));
        }
    }
}

package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.feed.newui.videoflow.item.FeedVideoViewFlowItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class r8i extends dac0<Moment> {

    /* JADX INFO: renamed from: d */
    public Act f158222d;

    /* JADX INFO: renamed from: e */
    public boolean f158223e;

    /* JADX INFO: renamed from: f */
    public boolean f158224f;

    /* JADX INFO: renamed from: g */
    public boolean f158225g;

    /* JADX INFO: renamed from: h */
    public int f158226h;

    /* JADX INFO: renamed from: i */
    public String f158227i;

    /* JADX INFO: renamed from: j */
    public FeedVideoViewFlowItemView f158228j;

    /* JADX INFO: renamed from: k */
    public FeedVideoViewFlowItemView f158229k;

    /* JADX INFO: renamed from: o */
    public Moment f158233o;

    /* JADX INFO: renamed from: p */
    public String f158234p;

    /* JADX INFO: renamed from: q */
    public d30 f158235q;

    /* JADX INFO: renamed from: c */
    public List<Moment> f158221c = new ArrayList();

    /* JADX INFO: renamed from: l */
    public e30<Integer> f158230l = null;

    /* JADX INFO: renamed from: m */
    public List<FeedVideoViewFlowItemView> f158231m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public lqv f158232n = new lqv();

    public r8i(Act act, String str, boolean z, boolean z2, boolean z3) {
        this.f158222d = act;
        this.f158234p = str;
        this.f158223e = z;
        this.f158224f = z2;
        this.f158225g = z3;
        if (act instanceof FeedVideoFlowAct) {
            m178277X(act.getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID"));
        }
        String stringExtra = act.getIntent().getStringExtra("VIDEO_LIVE_AUTHOR_ID");
        String stringExtra2 = act.getIntent().getStringExtra("VIDEO_LIVE_ROOM_ID");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        this.f158232n.m151095c(stringExtra, stringExtra2);
    }

    /* JADX INFO: renamed from: O */
    private b9i m178259O() {
        Act act = this.f158222d;
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m66187Z1() : new b9i();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<Moment> list = this.f158221c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        FeedVideoViewFlowItemView feedVideoViewFlowItemView = new FeedVideoViewFlowItemView(this.f158222d, this.f158234p, viewGroup.getHeight(), this.f158223e, this.f158224f, this.f158225g);
        feedVideoViewFlowItemView.setAutoNextVideo(this.f158235q);
        feedVideoViewFlowItemView.setLivingStore(this.f158232n);
        this.f158231m.add(feedVideoViewFlowItemView);
        feedVideoViewFlowItemView.setBackgroundColor(0);
        return feedVideoViewFlowItemView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Moment moment, int i, int i2) {
        if (view instanceof FeedVideoViewFlowItemView) {
            FeedVideoViewFlowItemView feedVideoViewFlowItemView = (FeedVideoViewFlowItemView) view;
            if (i2 == 0) {
                this.f158228j = feedVideoViewFlowItemView;
                this.f158229k = feedVideoViewFlowItemView;
            }
            feedVideoViewFlowItemView.setShowInVideoFlowPosition(i2);
            feedVideoViewFlowItemView.m66204f(m178268N(moment), i2);
            if (i2 == this.f158226h) {
                feedVideoViewFlowItemView.m66203e();
            }
            m178259O().m100809j(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m178261G(List<Moment> list) {
        int size = this.f158221c.size();
        this.f158221c.clear();
        this.f158221c.addAll(list);
        notifyItemRangeInserted(size, list.size() - size);
    }

    /* JADX INFO: renamed from: H */
    public final void m178262H(int i) {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f158231m) {
            if (NullChecker.m81303a(feedVideoViewFlowItemView)) {
                if (i != feedVideoViewFlowItemView.getShowInVideoFlowPosition() || i == this.f158226h) {
                    feedVideoViewFlowItemView.m66207i();
                } else {
                    feedVideoViewFlowItemView.m66203e();
                }
                if (i == feedVideoViewFlowItemView.getShowInVideoFlowPosition()) {
                    feedVideoViewFlowItemView.m66205g();
                } else {
                    feedVideoViewFlowItemView.m66206h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m178263I(int i) {
        if (i != 0) {
            this.f158229k = null;
        } else {
            this.f158229k = this.f158228j;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m178264J() {
        m178259O().m100800a(this.f158227i, 2);
        m178259O().m100810k(this.f158233o, this.f158226h);
    }

    /* JADX INFO: renamed from: K */
    public void m178265K(int i) {
        m178259O().m100811l(this.f158221c.size() > i ? this.f158221c.get(i) : null, i);
        m178264J();
        m178259O().m100809j(i);
    }

    /* JADX INFO: renamed from: L */
    public final Media m178266L(Moment moment) {
        List<Media> list;
        if (moment == null || (list = moment.media) == null || list.size() <= 0) {
            return null;
        }
        return moment.media.get(0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Moment getItem(int i) {
        return this.f158221c.get(i);
    }

    /* JADX INFO: renamed from: N */
    public final Moment m178268N(Moment moment) {
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(moment.f56011id);
        Media mediaM178266L = m178266L(moment);
        if (moment != momentM209572w7 && NullChecker.m81303a(mediaM178266L) && (mediaM178266L instanceof Video)) {
            Video video = (Video) mediaM178266L;
            Media mediaM178266L2 = m178266L(momentM209572w7);
            if (NullChecker.m81303a(mediaM178266L2) && (mediaM178266L2 instanceof Video)) {
                ((Video) mediaM178266L2).music = video.music;
            }
        }
        return momentM209572w7;
    }

    /* JADX INFO: renamed from: P */
    public String m178269P() {
        return this.f158227i;
    }

    /* JADX INFO: renamed from: Q */
    public int m178270Q() {
        return this.f158226h;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m178271R(Live live) {
        this.f158232n.m151095c(live.anchor.f38803id, live.f38767id);
    }

    /* JADX INFO: renamed from: S */
    public void m178272S(int i) {
        m178263I(i);
        m178265K(i);
        m178262H(i);
        this.f158226h = i;
        m178277X(this.f158221c.get(i).f56011id);
        this.f158233o = this.f158221c.get(i);
    }

    /* JADX INFO: renamed from: T */
    public void m178273T() {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f158231m) {
            if (NullChecker.m81303a(feedVideoViewFlowItemView) && this.f158226h == feedVideoViewFlowItemView.getShowInVideoFlowPosition()) {
                feedVideoViewFlowItemView.m66205g();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m178274U(Music music) {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f158231m) {
            if (NullChecker.m81303a(feedVideoViewFlowItemView) && feedVideoViewFlowItemView.getShowInVideoFlowPosition() == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m178275V(d30 d30Var) {
        this.f158235q = d30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m178276W(e30<Integer> e30Var) {
        this.f158230l = e30Var;
    }

    /* JADX INFO: renamed from: X */
    public final void m178277X(String str) {
        this.f158227i = str;
    }

    /* JADX INFO: renamed from: Y */
    public void m178278Y(List<Live> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.q8i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153194a.m178271R((Live) obj);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        super.mo47327e(i);
        if (NullChecker.m81303a(this.f158230l)) {
            this.f158230l.call(Integer.valueOf(i));
        }
    }
}

package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.feed.newui.videoflow.item.FeedVideoViewFlowItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class gai extends jic0<Moment> {

    /* JADX INFO: renamed from: d */
    public Act f102987d;

    /* JADX INFO: renamed from: e */
    public boolean f102988e;

    /* JADX INFO: renamed from: f */
    public boolean f102989f;

    /* JADX INFO: renamed from: g */
    public boolean f102990g;

    /* JADX INFO: renamed from: h */
    public int f102991h;

    /* JADX INFO: renamed from: i */
    public String f102992i;

    /* JADX INFO: renamed from: j */
    public FeedVideoViewFlowItemView f102993j;

    /* JADX INFO: renamed from: k */
    public FeedVideoViewFlowItemView f102994k;

    /* JADX INFO: renamed from: o */
    public Moment f102998o;

    /* JADX INFO: renamed from: p */
    public String f102999p;

    /* JADX INFO: renamed from: q */
    public x20 f103000q;

    /* JADX INFO: renamed from: c */
    public List<Moment> f102986c = new ArrayList();

    /* JADX INFO: renamed from: l */
    public y20<Integer> f102995l = null;

    /* JADX INFO: renamed from: m */
    public List<FeedVideoViewFlowItemView> f102996m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public msv f102997n = new msv();

    public gai(Act act, String str, boolean z, boolean z2, boolean z3) {
        this.f102987d = act;
        this.f102999p = str;
        this.f102988e = z;
        this.f102989f = z2;
        this.f102990g = z3;
        if (act instanceof FeedVideoFlowAct) {
            m129729X(act.getIntent().getStringExtra("VIDEO_FLOW_MOMENT_ID"));
        }
        String stringExtra = act.getIntent().getStringExtra("VIDEO_LIVE_AUTHOR_ID");
        String stringExtra2 = act.getIntent().getStringExtra("VIDEO_LIVE_ROOM_ID");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        this.f102997n.m159939c(stringExtra, stringExtra2);
    }

    /* JADX INFO: renamed from: O */
    private qai m129711O() {
        Act act = this.f102987d;
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m67370a2() : new qai();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        List<Moment> list = this.f102986c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        FeedVideoViewFlowItemView feedVideoViewFlowItemView = new FeedVideoViewFlowItemView(this.f102987d, this.f102999p, viewGroup.getHeight(), this.f102988e, this.f102989f, this.f102990g);
        feedVideoViewFlowItemView.setAutoNextVideo(this.f103000q);
        feedVideoViewFlowItemView.setLivingStore(this.f102997n);
        this.f102996m.add(feedVideoViewFlowItemView);
        feedVideoViewFlowItemView.setBackgroundColor(0);
        return feedVideoViewFlowItemView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Moment moment, int i, int i2) {
        if (view instanceof FeedVideoViewFlowItemView) {
            FeedVideoViewFlowItemView feedVideoViewFlowItemView = (FeedVideoViewFlowItemView) view;
            if (i2 == 0) {
                this.f102993j = feedVideoViewFlowItemView;
                this.f102994k = feedVideoViewFlowItemView;
            }
            feedVideoViewFlowItemView.setShowInVideoFlowPosition(i2);
            feedVideoViewFlowItemView.m67387f(m129720N(moment), i2);
            if (i2 == this.f102991h) {
                feedVideoViewFlowItemView.m67386e();
            }
            m129711O().m175937j(0);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m129713G(List<Moment> list) {
        int size = this.f102986c.size();
        this.f102986c.clear();
        this.f102986c.addAll(list);
        notifyItemRangeInserted(size, list.size() - size);
    }

    /* JADX INFO: renamed from: H */
    public final void m129714H(int i) {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f102996m) {
            if (NullChecker.m82486a(feedVideoViewFlowItemView)) {
                if (i != feedVideoViewFlowItemView.getShowInVideoFlowPosition() || i == this.f102991h) {
                    feedVideoViewFlowItemView.m67390i();
                } else {
                    feedVideoViewFlowItemView.m67386e();
                }
                if (i == feedVideoViewFlowItemView.getShowInVideoFlowPosition()) {
                    feedVideoViewFlowItemView.m67388g();
                } else {
                    feedVideoViewFlowItemView.m67389h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m129715I(int i) {
        if (i != 0) {
            this.f102994k = null;
        } else {
            this.f102994k = this.f102993j;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m129716J() {
        m129711O().m175928a(this.f102992i, 2);
        m129711O().m175938k(this.f102998o, this.f102991h);
    }

    /* JADX INFO: renamed from: K */
    public void m129717K(int i) {
        m129711O().m175939l(this.f102986c.size() > i ? this.f102986c.get(i) : null, i);
        m129716J();
        m129711O().m175937j(i);
    }

    /* JADX INFO: renamed from: L */
    public final Media m129718L(Moment moment) {
        List<Media> list;
        if (moment == null || (list = moment.media) == null || list.size() <= 0) {
            return null;
        }
        return moment.media.get(0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Moment getItem(int i) {
        return this.f102986c.get(i);
    }

    /* JADX INFO: renamed from: N */
    public final Moment m129720N(Moment moment) {
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(moment.f56859id);
        Media mediaM129718L = m129718L(moment);
        if (moment != momentM145813w7 && NullChecker.m82486a(mediaM129718L) && (mediaM129718L instanceof Video)) {
            Video video = (Video) mediaM129718L;
            Media mediaM129718L2 = m129718L(momentM145813w7);
            if (NullChecker.m82486a(mediaM129718L2) && (mediaM129718L2 instanceof Video)) {
                ((Video) mediaM129718L2).music = video.music;
            }
        }
        return momentM145813w7;
    }

    /* JADX INFO: renamed from: P */
    public String m129721P() {
        return this.f102992i;
    }

    /* JADX INFO: renamed from: Q */
    public int m129722Q() {
        return this.f102991h;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m129723R(Live live) {
        this.f102997n.m159939c(live.anchor.f39651id, live.f39615id);
    }

    /* JADX INFO: renamed from: S */
    public void m129724S(int i) {
        m129715I(i);
        m129717K(i);
        m129714H(i);
        this.f102991h = i;
        m129729X(this.f102986c.get(i).f56859id);
        this.f102998o = this.f102986c.get(i);
    }

    /* JADX INFO: renamed from: T */
    public void m129725T() {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f102996m) {
            if (NullChecker.m82486a(feedVideoViewFlowItemView) && this.f102991h == feedVideoViewFlowItemView.getShowInVideoFlowPosition()) {
                feedVideoViewFlowItemView.m67388g();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m129726U(Music music) {
        for (FeedVideoViewFlowItemView feedVideoViewFlowItemView : this.f102996m) {
            if (NullChecker.m82486a(feedVideoViewFlowItemView) && feedVideoViewFlowItemView.getShowInVideoFlowPosition() == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m129727V(x20 x20Var) {
        this.f103000q = x20Var;
    }

    /* JADX INFO: renamed from: W */
    public void m129728W(y20<Integer> y20Var) {
        this.f102995l = y20Var;
    }

    /* JADX INFO: renamed from: X */
    public final void m129729X(String str) {
        this.f102992i = str;
    }

    /* JADX INFO: renamed from: Y */
    public void m129730Y(List<Live> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.fai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97983a.m129723R((Live) obj);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        super.mo48510e(i);
        if (NullChecker.m82486a(this.f102995l)) {
            this.f102995l.call(Integer.valueOf(i));
        }
    }
}

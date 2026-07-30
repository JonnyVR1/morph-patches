package p007l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.bookmovie.BookMovieTopicHeaderView;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.MultiTabTopicPhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.lsi0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLine;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vl10 extends i7i<y6i> {

    /* JADX INFO: renamed from: E0 */
    public VImage f14189E0;

    /* JADX INFO: renamed from: F0 */
    public ConstraintLayout f14190F0;

    /* JADX INFO: renamed from: G0 */
    public FeedUserHeaderView f14191G0;

    /* JADX INFO: renamed from: H0 */
    public VText f14192H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f14193I;

    /* JADX INFO: renamed from: I0 */
    public VImage f14194I0;

    /* JADX INFO: renamed from: J */
    public CoordinatorLayout f14195J;

    /* JADX INFO: renamed from: J0 */
    public VRelative f14196J0;

    /* JADX INFO: renamed from: K */
    public AppBarLayout f14197K;

    /* JADX INFO: renamed from: K0 */
    public VLine f14198K0;

    /* JADX INFO: renamed from: L */
    public CollapsingToolbarLayout f14199L;

    /* JADX INFO: renamed from: L0 */
    public FeedTopicContentWithPluginView f14200L0;

    /* JADX INFO: renamed from: M */
    public Toolbar f14201M;

    /* JADX INFO: renamed from: M0 */
    public VFrame f14202M0;

    /* JADX INFO: renamed from: N */
    public VImage f14203N;

    /* JADX INFO: renamed from: N0 */
    public TextView f14204N0;

    /* JADX INFO: renamed from: O */
    public TextView f14205O;

    /* JADX INFO: renamed from: O0 */
    public RelativeLayout f14206O0;

    /* JADX INFO: renamed from: P */
    public VLinear f14207P;

    /* JADX INFO: renamed from: P0 */
    public FrameLayout f14208P0;

    /* JADX INFO: renamed from: Q */
    public VRelative f14209Q;

    /* JADX INFO: renamed from: Q0 */
    public VImage f14210Q0;

    /* JADX INFO: renamed from: R */
    public VRelative f14211R;

    /* JADX INFO: renamed from: R0 */
    public LinearLayout f14212R0;

    /* JADX INFO: renamed from: S */
    public VLinear f14213S;

    /* JADX INFO: renamed from: S0 */
    public VText f14214S0;

    /* JADX INFO: renamed from: T */
    public VDraweeView f14215T;

    /* JADX INFO: renamed from: T0 */
    public TopicMoment f14216T0;

    /* JADX INFO: renamed from: U */
    public TextView f14217U;

    /* JADX INFO: renamed from: U0 */
    public BookMovieTopicHeaderView f14218U0;

    /* JADX INFO: renamed from: V */
    public TextView f14219V;

    /* JADX INFO: renamed from: W */
    public VExpandableTextContainer f14220W;

    /* JADX INFO: renamed from: X */
    public VFrame f14221X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f14222Y;

    /* JADX INFO: renamed from: Z */
    public ConstraintLayout f14223Z;

    /* JADX INFO: renamed from: k0 */
    public VImage f14224k0;

    /* JADX INFO: renamed from: p0 */
    public VText f14225p0;

    public vl10(MultiTabTopicPhotoAlbumFeedFrag multiTabTopicPhotoAlbumFeedFrag) {
        super(multiTabTopicPhotoAlbumFeedFrag);
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: A */
    public void mo10792A() {
        this.f8929a = this.f14195J;
        this.f8930b = this.f14197K;
        this.f8931c = this.f14199L;
        this.f8932d = this.f14201M;
        this.f8933e = this.f14203N;
        this.f8934f = this.f14205O;
        this.f8935g = this.f14207P;
        this.f8936h = this.f14209Q;
        this.f8938j = this.f14215T;
        this.f8939k = this.f14217U;
        this.f8941m = this.f14220W;
        this.f8940l = this.f14219V;
        this.f8942n = this.f14200L0;
        this.f8943o = this.f14202M0;
        this.f8944p = this.f14206O0;
        this.f8945q = this.f14208P0;
        this.f8946r = this.f14210Q0;
        this.f8947s = this.f14212R0;
        this.f8948t = this.f14214S0;
        this.f8949u = this.f14223Z;
        this.f8950v = this.f14225p0;
        this.f8937i = this.f14198K0;
        this.f8951w = this.f14190F0;
        this.f8953y = this.f14192H0;
        this.f8952x = this.f14191G0;
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: E */
    public void mo10795E(Bundle bundle) {
        super.mo10795E(bundle);
        this.f14221X.setVisibility(8);
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: T */
    public void mo10806T() {
        TopicMoment topicMoment = this.f8923C.f15277e;
        this.f14216T0 = topicMoment;
        if (NullChecker.a(topicMoment) && this.f14216T0.isTopicAnonymousType()) {
            this.f14204N0.setText("匿名参与");
        } else {
            this.f14204N0.setText(R$string.f558l2);
        }
        if (!this.f8923C.m16960o0()) {
            xdl0.M(this.f14202M0, false);
            return;
        }
        xdl0.M(this.f14204N0, true);
        xdl0.M(this.f14202M0, true);
        xdl0.E0(this.f14204N0, new View.OnClickListener() { // from class: l.ul10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13853a.m15434f0(view);
            }
        });
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: V */
    public void mo10808V(TopicMoment topicMoment) {
        super.mo10808V(topicMoment);
        this.f14215T.setDrawingCacheEnabled(true);
        this.f14215T.buildDrawingCache();
        if (nkg.m12261r() && topicMoment.isBookMovieDramaTopic()) {
            if (this.f14218U0 == null) {
                xdl0.M(this.f14211R, false);
                xdl0.M(this.f14196J0, true);
                this.f14218U0 = (BookMovieTopicHeaderView) LayoutInflater.from(act()).inflate(o6c0.f11093N, (ViewGroup) this.f14196J0, true).findViewById(b5c0.f6058j);
                this.f14200L0.m7307m0();
            }
            this.f14218U0.m5096R(act(), topicMoment, this);
            if (NullChecker.a(this.f14198K0)) {
                xdl0.X(this.f14198K0, t100.d(0.0f));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public View m15431c0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wl10.m15828b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d0 */
    public void m15432d0() {
        wl10.m15829c(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m15433e0() {
        return this.f14200L0.getCurrentPosition() == 0 ? "topic_recommend" : "topic_latest";
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m15434f0(View view) {
        m15435g0(this.f14216T0);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15435g0(TopicMoment topicMoment) {
        boolean z = topicMoment != null && topicMoment.isAudioTopicType();
        if (z && !vqg.m15528m0()) {
            lsi0.h(R$string.f634x1);
            return;
        }
        zvf0.u("e_topic_detail_post", m10822x(), new j760[]{j760.a("topic_id", this.f8923C.f15276d)});
        zvf0.r("e_moment_post", m10822x());
        oe40.m12581j0(act(), vwb.f0(new Media[0]), true, this.f8923C.f15277e, m15433e0(), z);
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: p */
    public void mo10814i1(y6i y6iVar) {
        this.f8923C = y6iVar;
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: u */
    public View mo10819u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM15431c0 = m15431c0(layoutInflater, viewGroup);
        viewM15431c0.setBackgroundColor(-1);
        return viewM15431c0;
    }
}

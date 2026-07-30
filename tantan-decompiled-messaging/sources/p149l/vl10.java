package p149l;

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
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.bookmovie.BookMovieTopicHeaderView;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.MultiTabTopicPhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class vl10 extends i7i<y6i> {

    /* JADX INFO: renamed from: E0 */
    public VImage f181875E0;

    /* JADX INFO: renamed from: F0 */
    public ConstraintLayout f181876F0;

    /* JADX INFO: renamed from: G0 */
    public FeedUserHeaderView f181877G0;

    /* JADX INFO: renamed from: H0 */
    public VText f181878H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f181879I;

    /* JADX INFO: renamed from: I0 */
    public VImage f181880I0;

    /* JADX INFO: renamed from: J */
    public CoordinatorLayout f181881J;

    /* JADX INFO: renamed from: J0 */
    public VRelative f181882J0;

    /* JADX INFO: renamed from: K */
    public AppBarLayout f181883K;

    /* JADX INFO: renamed from: K0 */
    public VLine f181884K0;

    /* JADX INFO: renamed from: L */
    public CollapsingToolbarLayout f181885L;

    /* JADX INFO: renamed from: L0 */
    public FeedTopicContentWithPluginView f181886L0;

    /* JADX INFO: renamed from: M */
    public Toolbar f181887M;

    /* JADX INFO: renamed from: M0 */
    public VFrame f181888M0;

    /* JADX INFO: renamed from: N */
    public VImage f181889N;

    /* JADX INFO: renamed from: N0 */
    public TextView f181890N0;

    /* JADX INFO: renamed from: O */
    public TextView f181891O;

    /* JADX INFO: renamed from: O0 */
    public RelativeLayout f181892O0;

    /* JADX INFO: renamed from: P */
    public VLinear f181893P;

    /* JADX INFO: renamed from: P0 */
    public FrameLayout f181894P0;

    /* JADX INFO: renamed from: Q */
    public VRelative f181895Q;

    /* JADX INFO: renamed from: Q0 */
    public VImage f181896Q0;

    /* JADX INFO: renamed from: R */
    public VRelative f181897R;

    /* JADX INFO: renamed from: R0 */
    public LinearLayout f181898R0;

    /* JADX INFO: renamed from: S */
    public VLinear f181899S;

    /* JADX INFO: renamed from: S0 */
    public VText f181900S0;

    /* JADX INFO: renamed from: T */
    public VDraweeView f181901T;

    /* JADX INFO: renamed from: T0 */
    public TopicMoment f181902T0;

    /* JADX INFO: renamed from: U */
    public TextView f181903U;

    /* JADX INFO: renamed from: U0 */
    public BookMovieTopicHeaderView f181904U0;

    /* JADX INFO: renamed from: V */
    public TextView f181905V;

    /* JADX INFO: renamed from: W */
    public VExpandableTextContainer f181906W;

    /* JADX INFO: renamed from: X */
    public VFrame f181907X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f181908Y;

    /* JADX INFO: renamed from: Z */
    public ConstraintLayout f181909Z;

    /* JADX INFO: renamed from: k0 */
    public VImage f181910k0;

    /* JADX INFO: renamed from: p0 */
    public VText f181911p0;

    public vl10(MultiTabTopicPhotoAlbumFeedFrag multiTabTopicPhotoAlbumFeedFrag) {
        super(multiTabTopicPhotoAlbumFeedFrag);
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: A */
    public void mo134873A() {
        this.f111893a = this.f181881J;
        this.f111894b = this.f181883K;
        this.f111895c = this.f181885L;
        this.f111896d = this.f181887M;
        this.f111897e = this.f181889N;
        this.f111898f = this.f181891O;
        this.f111899g = this.f181893P;
        this.f111900h = this.f181895Q;
        this.f111902j = this.f181901T;
        this.f111903k = this.f181903U;
        this.f111905m = this.f181906W;
        this.f111904l = this.f181905V;
        this.f111906n = this.f181886L0;
        this.f111907o = this.f181888M0;
        this.f111908p = this.f181892O0;
        this.f111909q = this.f181894P0;
        this.f111910r = this.f181896Q0;
        this.f111911s = this.f181898R0;
        this.f111912t = this.f181900S0;
        this.f111913u = this.f181909Z;
        this.f111914v = this.f181911p0;
        this.f111901i = this.f181884K0;
        this.f111915w = this.f181876F0;
        this.f111917y = this.f181878H0;
        this.f111916x = this.f181877G0;
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: E */
    public void mo134875E(Bundle bundle) {
        super.mo134875E(bundle);
        this.f181907X.setVisibility(8);
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: T */
    public void mo134886T() {
        TopicMoment topicMoment = this.f111887C.f196566e;
        this.f181902T0 = topicMoment;
        if (NullChecker.m81303a(topicMoment) && this.f181902T0.isTopicAnonymousType()) {
            this.f181890N0.setText("匿名参与");
        } else {
            this.f181890N0.setText(R$string.f39097l2);
        }
        if (!this.f111887C.m213140o0()) {
            xdl0.m208344M(this.f181888M0, false);
            return;
        }
        xdl0.m208344M(this.f181890N0, true);
        xdl0.m208344M(this.f181888M0, true);
        xdl0.m208329E0(this.f181890N0, new View.OnClickListener() { // from class: l.ul10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177007a.m198760f0(view);
            }
        });
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: V */
    public void mo134888V(TopicMoment topicMoment) {
        super.mo134888V(topicMoment);
        this.f181901T.setDrawingCacheEnabled(true);
        this.f181901T.buildDrawingCache();
        if (nkg.m159902r() && topicMoment.isBookMovieDramaTopic()) {
            if (this.f181904U0 == null) {
                xdl0.m208344M(this.f181897R, false);
                xdl0.m208344M(this.f181882J0, true);
                this.f181904U0 = (BookMovieTopicHeaderView) LayoutInflater.from(getAct()).inflate(o6c0.f142074N, (ViewGroup) this.f181882J0, true).findViewById(b5c0.f73577j);
                this.f181886L0.m66155m0();
            }
            this.f181904U0.m64049R(getAct(), topicMoment, this);
            if (NullChecker.m81303a(this.f181884K0)) {
                xdl0.m208360X(this.f181884K0, t100.m186890d(0.0f));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public View m198757c0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wl10.m203736b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d0 */
    public void m198758d0() {
        wl10.m203737c(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m198759e0() {
        return this.f181886L0.getCurrentPosition() == 0 ? "topic_recommend" : "topic_latest";
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m198760f0(View view) {
        m198761g0(this.f181902T0);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m198761g0(TopicMoment topicMoment) {
        boolean z = topicMoment != null && topicMoment.isAudioTopicType();
        if (z && !vqg.m199558m0()) {
            lsi0.m151578h(R$string.f39173x1);
            return;
        }
        zvf0.m220399u("e_topic_detail_post", m134901x(), j760.m140076a("topic_id", this.f111887C.f196565d));
        zvf0.m220396r("e_moment_post", m134901x());
        oe40.m163844j0(getAct(), vwb.m200324f0(new Media[0]), true, this.f111887C.f196566e, m198759e0(), z);
    }

    @Override // p149l.i7i, p149l.s7m
    /* JADX INFO: renamed from: p */
    public void mo21065i1(y6i y6iVar) {
        this.f111887C = y6iVar;
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: u */
    public View mo134898u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM198757c0 = m198757c0(layoutInflater, viewGroup);
        viewM198757c0.setBackgroundColor(-1);
        return viewM198757c0;
    }
}

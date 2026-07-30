package p153l;

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
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.bookmovie.BookMovieTopicHeaderView;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.MultiTabTopicPhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class fu10 extends x8i<n8i> {

    /* JADX INFO: renamed from: E0 */
    public VImage f100833E0;

    /* JADX INFO: renamed from: F0 */
    public ConstraintLayout f100834F0;

    /* JADX INFO: renamed from: G0 */
    public FeedUserHeaderView f100835G0;

    /* JADX INFO: renamed from: H0 */
    public VText f100836H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f100837I;

    /* JADX INFO: renamed from: I0 */
    public VImage f100838I0;

    /* JADX INFO: renamed from: J */
    public CoordinatorLayout f100839J;

    /* JADX INFO: renamed from: J0 */
    public VRelative f100840J0;

    /* JADX INFO: renamed from: K */
    public AppBarLayout f100841K;

    /* JADX INFO: renamed from: K0 */
    public VLine f100842K0;

    /* JADX INFO: renamed from: L */
    public CollapsingToolbarLayout f100843L;

    /* JADX INFO: renamed from: L0 */
    public FeedTopicContentWithPluginView f100844L0;

    /* JADX INFO: renamed from: M */
    public Toolbar f100845M;

    /* JADX INFO: renamed from: M0 */
    public VFrame f100846M0;

    /* JADX INFO: renamed from: N */
    public VImage f100847N;

    /* JADX INFO: renamed from: N0 */
    public TextView f100848N0;

    /* JADX INFO: renamed from: O */
    public TextView f100849O;

    /* JADX INFO: renamed from: O0 */
    public RelativeLayout f100850O0;

    /* JADX INFO: renamed from: P */
    public VLinear f100851P;

    /* JADX INFO: renamed from: P0 */
    public FrameLayout f100852P0;

    /* JADX INFO: renamed from: Q */
    public VRelative f100853Q;

    /* JADX INFO: renamed from: Q0 */
    public VImage f100854Q0;

    /* JADX INFO: renamed from: R */
    public VRelative f100855R;

    /* JADX INFO: renamed from: R0 */
    public LinearLayout f100856R0;

    /* JADX INFO: renamed from: S */
    public VLinear f100857S;

    /* JADX INFO: renamed from: S0 */
    public VText f100858S0;

    /* JADX INFO: renamed from: T */
    public VDraweeView f100859T;

    /* JADX INFO: renamed from: T0 */
    public TopicMoment f100860T0;

    /* JADX INFO: renamed from: U */
    public TextView f100861U;

    /* JADX INFO: renamed from: U0 */
    public BookMovieTopicHeaderView f100862U0;

    /* JADX INFO: renamed from: V */
    public TextView f100863V;

    /* JADX INFO: renamed from: W */
    public VExpandableTextContainer f100864W;

    /* JADX INFO: renamed from: X */
    public VFrame f100865X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f100866Y;

    /* JADX INFO: renamed from: Z */
    public ConstraintLayout f100867Z;

    /* JADX INFO: renamed from: k0 */
    public VImage f100868k0;

    /* JADX INFO: renamed from: p0 */
    public VText f100869p0;

    public fu10(MultiTabTopicPhotoAlbumFeedFrag multiTabTopicPhotoAlbumFeedFrag) {
        super(multiTabTopicPhotoAlbumFeedFrag);
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: A */
    public void mo127412A() {
        this.f192825a = this.f100839J;
        this.f192826b = this.f100841K;
        this.f192827c = this.f100843L;
        this.f192828d = this.f100845M;
        this.f192829e = this.f100847N;
        this.f192830f = this.f100849O;
        this.f192831g = this.f100851P;
        this.f192832h = this.f100853Q;
        this.f192834j = this.f100859T;
        this.f192835k = this.f100861U;
        this.f192837m = this.f100864W;
        this.f192836l = this.f100863V;
        this.f192838n = this.f100844L0;
        this.f192839o = this.f100846M0;
        this.f192840p = this.f100850O0;
        this.f192841q = this.f100852P0;
        this.f192842r = this.f100854Q0;
        this.f192843s = this.f100856R0;
        this.f192844t = this.f100858S0;
        this.f192845u = this.f100867Z;
        this.f192846v = this.f100869p0;
        this.f192833i = this.f100842K0;
        this.f192847w = this.f100834F0;
        this.f192849y = this.f100836H0;
        this.f192848x = this.f100835G0;
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: E */
    public void mo127413E(Bundle bundle) {
        super.mo127413E(bundle);
        this.f100865X.setVisibility(8);
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: T */
    public void mo127414T() {
        TopicMoment topicMoment = this.f192819C.f140687e;
        this.f100860T0 = topicMoment;
        if (NullChecker.m82486a(topicMoment) && this.f100860T0.isTopicAnonymousType()) {
            this.f100848N0.setText("匿名参与");
        } else {
            this.f100848N0.setText(R$string.f39945l2);
        }
        if (!this.f192819C.m161937o0()) {
            bnl0.m105524M(this.f100846M0, false);
            return;
        }
        bnl0.m105524M(this.f100848N0, true);
        bnl0.m105524M(this.f100846M0, true);
        bnl0.m105509E0(this.f100848N0, new View.OnClickListener() { // from class: l.eu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95835a.m127419f0(view);
            }
        });
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: V */
    public void mo127415V(TopicMoment topicMoment) {
        super.mo127415V(topicMoment);
        this.f100859T.setDrawingCacheEnabled(true);
        this.f100859T.buildDrawingCache();
        if (cmg.m111231r() && topicMoment.isBookMovieDramaTopic()) {
            if (this.f100862U0 == null) {
                bnl0.m105524M(this.f100855R, false);
                bnl0.m105524M(this.f100840J0, true);
                this.f100862U0 = (BookMovieTopicHeaderView) LayoutInflater.from(getAct()).inflate(tec0.f173543N, (ViewGroup) this.f100840J0, true).findViewById(hdc0.f108930j);
                this.f100844L0.m67338m0();
            }
            this.f100862U0.m65232R(getAct(), topicMoment, this);
            if (NullChecker.m82486a(this.f100842K0)) {
                bnl0.m105540X(this.f100842K0, qa00.m175859d(0.0f));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public View m127416c0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gu10.m132262b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d0 */
    public void m127417d0() {
        gu10.m132263c(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m127418e0() {
        return this.f100844L0.getCurrentPosition() == 0 ? "topic_recommend" : "topic_latest";
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m127419f0(View view) {
        m127420g0(this.f100860T0);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m127420g0(TopicMoment topicMoment) {
        boolean z = topicMoment != null && topicMoment.isAudioTopicType();
        if (z && !ksg.m151217m0()) {
            o1j0.m165634h(R$string.f40021x1);
            return;
        }
        i4g0.m138523u("e_topic_detail_post", m209729x(), pf60.m172085a("topic_id", this.f192819C.f140686d));
        i4g0.m138520r("e_moment_post", m209729x());
        cn40.m111394j0(getAct(), jyb.m147507f0(new Media[0]), true, this.f192819C.f140687e, m127418e0(), z);
    }

    @Override // p153l.x8i, p153l.iam
    /* JADX INFO: renamed from: p */
    public void mo22064i1(n8i n8iVar) {
        this.f192819C = n8iVar;
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: u */
    public View mo127422u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM127416c0 = m127416c0(layoutInflater, viewGroup);
        viewM127416c0.setBackgroundColor(-1);
        return viewM127416c0;
    }
}

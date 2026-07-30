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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ilb0 extends i7i<zkb0> {

    /* JADX INFO: renamed from: E0 */
    public ConstraintLayout f113781E0;

    /* JADX INFO: renamed from: F0 */
    public FeedUserHeaderView f113782F0;

    /* JADX INFO: renamed from: G0 */
    public VText f113783G0;

    /* JADX INFO: renamed from: H0 */
    public VImage f113784H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f113785I;

    /* JADX INFO: renamed from: I0 */
    public VLine f113786I0;

    /* JADX INFO: renamed from: J */
    public CoordinatorLayout f113787J;

    /* JADX INFO: renamed from: J0 */
    public FeedTopicContentWithPluginView f113788J0;

    /* JADX INFO: renamed from: K */
    public AppBarLayout f113789K;

    /* JADX INFO: renamed from: K0 */
    public VFrame f113790K0;

    /* JADX INFO: renamed from: L */
    public CollapsingToolbarLayout f113791L;

    /* JADX INFO: renamed from: L0 */
    public TextView f113792L0;

    /* JADX INFO: renamed from: M */
    public Toolbar f113793M;

    /* JADX INFO: renamed from: M0 */
    public FeedQATopicInputJoinView f113794M0;

    /* JADX INFO: renamed from: N */
    public VImage f113795N;

    /* JADX INFO: renamed from: N0 */
    public FeedChangeQATopicInputJoinView f113796N0;

    /* JADX INFO: renamed from: O */
    public TextView f113797O;

    /* JADX INFO: renamed from: O0 */
    public QAMomentPostBar f113798O0;

    /* JADX INFO: renamed from: P */
    public VLinear f113799P;

    /* JADX INFO: renamed from: P0 */
    public RelativeLayout f113800P0;

    /* JADX INFO: renamed from: Q */
    public VRelative f113801Q;

    /* JADX INFO: renamed from: Q0 */
    public FrameLayout f113802Q0;

    /* JADX INFO: renamed from: R */
    public VLinear f113803R;

    /* JADX INFO: renamed from: R0 */
    public VImage f113804R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f113805S;

    /* JADX INFO: renamed from: S0 */
    public LinearLayout f113806S0;

    /* JADX INFO: renamed from: T */
    public TextView f113807T;

    /* JADX INFO: renamed from: T0 */
    public VText f113808T0;

    /* JADX INFO: renamed from: U */
    public TextView f113809U;

    /* JADX INFO: renamed from: V */
    public VExpandableTextContainer f113810V;

    /* JADX INFO: renamed from: W */
    public FeedVoteContainer f113811W;

    /* JADX INFO: renamed from: X */
    public ConstraintLayout f113812X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f113813Y;

    /* JADX INFO: renamed from: Z */
    public VImage f113814Z;

    /* JADX INFO: renamed from: k0 */
    public VText f113815k0;

    /* JADX INFO: renamed from: p0 */
    public VImage f113816p0;

    public ilb0(QATopicPhotoAlbumFeedFrag qATopicPhotoAlbumFeedFrag) {
        super(qATopicPhotoAlbumFeedFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m136969o0() {
        xdl0.m208344M(this.f113790K0, true);
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: A */
    public void mo134873A() {
        this.f111893a = this.f113787J;
        this.f111894b = this.f113789K;
        this.f111895c = this.f113791L;
        this.f111896d = this.f113793M;
        this.f111897e = this.f113795N;
        this.f111898f = this.f113797O;
        this.f111899g = this.f113799P;
        this.f111900h = this.f113801Q;
        this.f111902j = this.f113805S;
        this.f111903k = this.f113807T;
        this.f111905m = this.f113810V;
        this.f111904l = this.f113809U;
        this.f111906n = this.f113788J0;
        this.f111907o = this.f113790K0;
        this.f111908p = this.f113800P0;
        this.f111909q = this.f113802Q0;
        this.f111910r = this.f113804R0;
        this.f111911s = this.f113806S0;
        this.f111912t = this.f113808T0;
        this.f111913u = this.f113813Y;
        this.f111914v = this.f113815k0;
        this.f111901i = this.f113786I0;
        this.f111915w = this.f113781E0;
        this.f111917y = this.f113783G0;
        this.f111916x = this.f113782F0;
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: E */
    public void mo134875E(Bundle bundle) {
        super.mo134875E(bundle);
        this.f113798O0.mo63243o(this.f111887C.f196563b);
        this.f113798O0.m63234E(new e30() { // from class: l.alb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70423a.m136974m0((Moment) obj);
            }
        }, new e30() { // from class: l.blb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76176a.m136975n0((Moment) obj);
            }
        });
        ((zkb0) this.f111887C).m219171C0();
        m136973l0().setCloseAction(new d30() { // from class: l.clb0
            @Override // p149l.d30
            public final void call() {
                this.f81382a.m136969o0();
            }
        });
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: T */
    public void mo134886T() {
        this.f113792L0.setText(R$string.f38941N1);
        if (!this.f111887C.m213140o0()) {
            xdl0.m208344M(this.f113790K0, false);
            return;
        }
        xdl0.m208344M(this.f113792L0, true);
        xdl0.m208344M(this.f113790K0, true);
        xdl0.m208329E0(this.f113792L0, new View.OnClickListener() { // from class: l.flb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98145a.m136977q0(view);
            }
        });
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: U */
    public void mo134887U(TopicMoment topicMoment) {
        int i = topicMoment.voteCounter;
        String str = i == 1 ? String.format(getAct().getString(R$string.f38906H2), i0g0.m133881u(i)) : String.format(getAct().getString(R$string.f38912I2), i0g0.m133881u(i));
        this.f113809U.setText(String.format(getAct().getResources().getString(R$string.f39090k2), i0g0.m133881u(topicMoment.momentCounter)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
    }

    /* JADX INFO: renamed from: i0 */
    public View m136970i0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jlb0.m142051b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m136971j0() {
        jlb0.m142052c(this);
    }

    @Override // p149l.i7i, p149l.s7m
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zkb0 zkb0Var) {
        this.f111887C = zkb0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final FeedAbstractInputMomentTextToJoinTopicView m136973l0() {
        return nkg.m159893m0() ? this.f113796N0 : this.f113794M0;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m136974m0(Moment moment) {
        m136979s0(moment, m134901x());
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m136975n0(Moment moment) {
        this.f113788J0.m66149d0(moment);
        this.f113790K0.setVisibility(0);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m136977q0(View view) {
        if (nkg.m159893m0() && !nkg.m159895n0()) {
            this.f111887C.f196566e.mo223809clone().options = null;
            oe40.m163811M(getAct(), new NewPostAct.C11244a(getAct()).m62702m(this.f111887C.f196566e).m62699j(false).m62696g(true).m62691b("分享你的观点，可以获得更大曝光…"));
            return;
        }
        zvf0.m220396r("e_moment_post", m134901x());
        zvf0.m220399u("e_topic_detail_post", m134901x(), j760.m140076a("topic_id", this.f111887C.f196565d));
        if (sti.m185955a()) {
            v1h.m196580P0(getAct(), new d30() { // from class: l.glb0
                @Override // p149l.d30
                public final void call() {
                    lsi0.m151593w(R$string.f38983U1);
                }
            }, false, new d30() { // from class: l.hlb0
                @Override // p149l.d30
                public final void call() {
                    this.f108337a.m136976p0();
                }
            }, w1h.f184003a);
        } else {
            m136976p0();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m136978r0() {
        getAct().postDelayed(new Runnable() { // from class: l.elb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92088a.m136976p0();
            }
        }, this.f113811W.getItemAnimTime());
    }

    /* JADX INFO: renamed from: s0 */
    public void m136979s0(Moment moment, String str) {
        this.f113798O0.mo63252y(moment);
        this.f113788J0.m66156n0(moment);
    }

    /* JADX INFO: renamed from: t0 */
    public void m136980t0(j760<Integer, Moment> j760Var) {
        int iIntValue = j760Var.f116564a.intValue();
        if (iIntValue == 4) {
            xdl0.m208344M(this.f113790K0, true);
        } else {
            if (iIntValue != 5) {
                return;
            }
            xdl0.m208344M(this.f113790K0, false);
        }
    }

    @Override // p149l.i7i
    /* JADX INFO: renamed from: u */
    public View mo134898u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m136970i0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u0 */
    public void m136981u0(TopicMoment topicMoment) {
        FeedVoteContainer feedVoteContainer = this.f113811W;
        if (feedVoteContainer == null) {
            return;
        }
        feedVoteContainer.m65974b(topicMoment, false, this.f111887C.f196562a);
        if (this.f113811W.getShowVoteListView() != null && nkg.m159893m0()) {
            this.f113811W.getShowVoteListView().setVoteSuccess(new d30() { // from class: l.dlb0
                @Override // p149l.d30
                public final void call() {
                    this.f86792a.m136978r0();
                }
            });
        }
        m136973l0().setTopicMoment(topicMoment);
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m136976p0() {
        xdl0.m208344M(this.f113790K0, false);
        m136973l0().setFrom(this.f111887C.f196562a);
        m136973l0().mo65921E();
    }

    /* JADX INFO: renamed from: w0 */
    public void m136983w0() {
        this.f113798O0.m63872J();
    }
}

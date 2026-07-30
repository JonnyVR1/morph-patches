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
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import l.d30;
import l.e30;
import l.i0g0;
import l.j760;
import l.lsi0;
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
public class ilb0 extends i7i<zkb0> {

    /* JADX INFO: renamed from: E0 */
    public ConstraintLayout f9051E0;

    /* JADX INFO: renamed from: F0 */
    public FeedUserHeaderView f9052F0;

    /* JADX INFO: renamed from: G0 */
    public VText f9053G0;

    /* JADX INFO: renamed from: H0 */
    public VImage f9054H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f9055I;

    /* JADX INFO: renamed from: I0 */
    public VLine f9056I0;

    /* JADX INFO: renamed from: J */
    public CoordinatorLayout f9057J;

    /* JADX INFO: renamed from: J0 */
    public FeedTopicContentWithPluginView f9058J0;

    /* JADX INFO: renamed from: K */
    public AppBarLayout f9059K;

    /* JADX INFO: renamed from: K0 */
    public VFrame f9060K0;

    /* JADX INFO: renamed from: L */
    public CollapsingToolbarLayout f9061L;

    /* JADX INFO: renamed from: L0 */
    public TextView f9062L0;

    /* JADX INFO: renamed from: M */
    public Toolbar f9063M;

    /* JADX INFO: renamed from: M0 */
    public FeedQATopicInputJoinView f9064M0;

    /* JADX INFO: renamed from: N */
    public VImage f9065N;

    /* JADX INFO: renamed from: N0 */
    public FeedChangeQATopicInputJoinView f9066N0;

    /* JADX INFO: renamed from: O */
    public TextView f9067O;

    /* JADX INFO: renamed from: O0 */
    public QAMomentPostBar f9068O0;

    /* JADX INFO: renamed from: P */
    public VLinear f9069P;

    /* JADX INFO: renamed from: P0 */
    public RelativeLayout f9070P0;

    /* JADX INFO: renamed from: Q */
    public VRelative f9071Q;

    /* JADX INFO: renamed from: Q0 */
    public FrameLayout f9072Q0;

    /* JADX INFO: renamed from: R */
    public VLinear f9073R;

    /* JADX INFO: renamed from: R0 */
    public VImage f9074R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f9075S;

    /* JADX INFO: renamed from: S0 */
    public LinearLayout f9076S0;

    /* JADX INFO: renamed from: T */
    public TextView f9077T;

    /* JADX INFO: renamed from: T0 */
    public VText f9078T0;

    /* JADX INFO: renamed from: U */
    public TextView f9079U;

    /* JADX INFO: renamed from: V */
    public VExpandableTextContainer f9080V;

    /* JADX INFO: renamed from: W */
    public FeedVoteContainer f9081W;

    /* JADX INFO: renamed from: X */
    public ConstraintLayout f9082X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f9083Y;

    /* JADX INFO: renamed from: Z */
    public VImage f9084Z;

    /* JADX INFO: renamed from: k0 */
    public VText f9085k0;

    /* JADX INFO: renamed from: p0 */
    public VImage f9086p0;

    public ilb0(QATopicPhotoAlbumFeedFrag qATopicPhotoAlbumFeedFrag) {
        super(qATopicPhotoAlbumFeedFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m10966o0() {
        xdl0.M(this.f9060K0, true);
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: A */
    public void mo10792A() {
        this.f8929a = this.f9057J;
        this.f8930b = this.f9059K;
        this.f8931c = this.f9061L;
        this.f8932d = this.f9063M;
        this.f8933e = this.f9065N;
        this.f8934f = this.f9067O;
        this.f8935g = this.f9069P;
        this.f8936h = this.f9071Q;
        this.f8938j = this.f9075S;
        this.f8939k = this.f9077T;
        this.f8941m = this.f9080V;
        this.f8940l = this.f9079U;
        this.f8942n = this.f9058J0;
        this.f8943o = this.f9060K0;
        this.f8944p = this.f9070P0;
        this.f8945q = this.f9072Q0;
        this.f8946r = this.f9074R0;
        this.f8947s = this.f9076S0;
        this.f8948t = this.f9078T0;
        this.f8949u = this.f9083Y;
        this.f8950v = this.f9085k0;
        this.f8937i = this.f9056I0;
        this.f8951w = this.f9051E0;
        this.f8953y = this.f9053G0;
        this.f8952x = this.f9052F0;
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: E */
    public void mo10795E(Bundle bundle) {
        super.mo10795E(bundle);
        this.f9068O0.mo4260o(this.f8923C.f15274b);
        this.f9068O0.m4251E(new e30() { // from class: l.alb0
            public final void call(Object obj) {
                this.f5773a.m10971m0((Moment) obj);
            }
        }, new e30() { // from class: l.blb0
            public final void call(Object obj) {
                this.f6363a.m10972n0((Moment) obj);
            }
        });
        ((zkb0) this.f8923C).m17507C0();
        m10970l0().setCloseAction(new d30() { // from class: l.clb0
            public final void call() {
                this.f6669a.m10966o0();
            }
        });
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: T */
    public void mo10806T() {
        this.f9062L0.setText(R$string.f402N1);
        if (!this.f8923C.m16960o0()) {
            xdl0.M(this.f9060K0, false);
            return;
        }
        xdl0.M(this.f9062L0, true);
        xdl0.M(this.f9060K0, true);
        xdl0.E0(this.f9062L0, new View.OnClickListener() { // from class: l.flb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8126a.m10974q0(view);
            }
        });
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: U */
    public void mo10807U(TopicMoment topicMoment) {
        int i = topicMoment.voteCounter;
        String str = i == 1 ? String.format(act().getString(R$string.f367H2), i0g0.u(i)) : String.format(act().getString(R$string.f373I2), i0g0.u(i));
        this.f9079U.setText(String.format(act().getResources().getString(R$string.f551k2), i0g0.u(topicMoment.momentCounter)) + " " + str);
    }

    /* JADX INFO: renamed from: i0 */
    public View m10967i0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jlb0.m11179b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m10968j0() {
        jlb0.m11180c(this);
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo10814i1(zkb0 zkb0Var) {
        this.f8923C = zkb0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final FeedAbstractInputMomentTextToJoinTopicView m10970l0() {
        return nkg.m12252m0() ? this.f9066N0 : this.f9064M0;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m10971m0(Moment moment) {
        m10976s0(moment, m10822x());
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m10972n0(Moment moment) {
        this.f9058J0.m7301d0(moment);
        this.f9060K0.setVisibility(0);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m10974q0(View view) {
        if (nkg.m12252m0() && !nkg.m12254n0()) {
            this.f8923C.f15277e.m19794clone().options = null;
            oe40.m12548M(act(), new NewPostAct.C2088a(act()).m3707m(this.f8923C.f15277e).m3704j(false).m3701g(true).m3696b("分享你的观点，可以获得更大曝光…"));
            return;
        }
        zvf0.r("e_moment_post", m10822x());
        zvf0.u("e_topic_detail_post", m10822x(), new j760[]{j760.a("topic_id", this.f8923C.f15276d)});
        if (sti.m14315a()) {
            v1h.m15219P0(act(), new d30() { // from class: l.glb0
                public final void call() {
                    lsi0.w(R$string.f444U1);
                }
            }, false, new d30() { // from class: l.hlb0
                public final void call() {
                    this.f8761a.m10973p0();
                }
            }, w1h.f14361a);
        } else {
            m10973p0();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m10975r0() {
        act().postDelayed(new Runnable() { // from class: l.elb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7418a.m10973p0();
            }
        }, this.f9081W.getItemAnimTime());
    }

    /* JADX INFO: renamed from: s0 */
    public void m10976s0(Moment moment, String str) {
        this.f9068O0.mo4269y(moment);
        this.f9058J0.m7308n0(moment);
    }

    /* JADX INFO: renamed from: t0 */
    public void m10977t0(j760<Integer, Moment> j760Var) {
        int iIntValue = ((Integer) j760Var.a).intValue();
        if (iIntValue == 4) {
            xdl0.M(this.f9060K0, true);
        } else {
            if (iIntValue != 5) {
                return;
            }
            xdl0.M(this.f9060K0, false);
        }
    }

    @Override // p007l.i7i
    /* JADX INFO: renamed from: u */
    public View mo10819u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10967i0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u0 */
    public void m10978u0(TopicMoment topicMoment) {
        FeedVoteContainer feedVoteContainer = this.f9081W;
        if (feedVoteContainer == null) {
            return;
        }
        feedVoteContainer.m7126b(topicMoment, false, this.f8923C.f15273a);
        if (this.f9081W.getShowVoteListView() != null && nkg.m12252m0()) {
            this.f9081W.getShowVoteListView().setVoteSuccess(new d30() { // from class: l.dlb0
                public final void call() {
                    this.f6988a.m10975r0();
                }
            });
        }
        m10970l0().setTopicMoment(topicMoment);
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m10973p0() {
        xdl0.M(this.f9060K0, false);
        m10970l0().setFrom(this.f8923C.f15273a);
        m10970l0().mo7073E();
    }

    /* JADX INFO: renamed from: w0 */
    public void m10980w0() {
        this.f9068O0.m4906J();
    }
}

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.QAMomentPostBar;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedVoteContainer;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mtb0 extends x8i<dtb0> {

    /* JADX INFO: renamed from: E0 */
    public ConstraintLayout f138561E0;

    /* JADX INFO: renamed from: F0 */
    public FeedUserHeaderView f138562F0;

    /* JADX INFO: renamed from: G0 */
    public VText f138563G0;

    /* JADX INFO: renamed from: H0 */
    public VImage f138564H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f138565I;

    /* JADX INFO: renamed from: I0 */
    public VLine f138566I0;

    /* JADX INFO: renamed from: J */
    public CoordinatorLayout f138567J;

    /* JADX INFO: renamed from: J0 */
    public FeedTopicContentWithPluginView f138568J0;

    /* JADX INFO: renamed from: K */
    public AppBarLayout f138569K;

    /* JADX INFO: renamed from: K0 */
    public VFrame f138570K0;

    /* JADX INFO: renamed from: L */
    public CollapsingToolbarLayout f138571L;

    /* JADX INFO: renamed from: L0 */
    public TextView f138572L0;

    /* JADX INFO: renamed from: M */
    public Toolbar f138573M;

    /* JADX INFO: renamed from: M0 */
    public FeedQATopicInputJoinView f138574M0;

    /* JADX INFO: renamed from: N */
    public VImage f138575N;

    /* JADX INFO: renamed from: N0 */
    public FeedChangeQATopicInputJoinView f138576N0;

    /* JADX INFO: renamed from: O */
    public TextView f138577O;

    /* JADX INFO: renamed from: O0 */
    public QAMomentPostBar f138578O0;

    /* JADX INFO: renamed from: P */
    public VLinear f138579P;

    /* JADX INFO: renamed from: P0 */
    public RelativeLayout f138580P0;

    /* JADX INFO: renamed from: Q */
    public VRelative f138581Q;

    /* JADX INFO: renamed from: Q0 */
    public FrameLayout f138582Q0;

    /* JADX INFO: renamed from: R */
    public VLinear f138583R;

    /* JADX INFO: renamed from: R0 */
    public VImage f138584R0;

    /* JADX INFO: renamed from: S */
    public VDraweeView f138585S;

    /* JADX INFO: renamed from: S0 */
    public LinearLayout f138586S0;

    /* JADX INFO: renamed from: T */
    public TextView f138587T;

    /* JADX INFO: renamed from: T0 */
    public VText f138588T0;

    /* JADX INFO: renamed from: U */
    public TextView f138589U;

    /* JADX INFO: renamed from: V */
    public VExpandableTextContainer f138590V;

    /* JADX INFO: renamed from: W */
    public FeedVoteContainer f138591W;

    /* JADX INFO: renamed from: X */
    public ConstraintLayout f138592X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f138593Y;

    /* JADX INFO: renamed from: Z */
    public VImage f138594Z;

    /* JADX INFO: renamed from: k0 */
    public VText f138595k0;

    /* JADX INFO: renamed from: p0 */
    public VImage f138596p0;

    public mtb0(QATopicPhotoAlbumFeedFrag qATopicPhotoAlbumFeedFrag) {
        super(qATopicPhotoAlbumFeedFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m159967o0() {
        bnl0.m105524M(this.f138570K0, true);
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: A */
    public void mo127412A() {
        this.f192825a = this.f138567J;
        this.f192826b = this.f138569K;
        this.f192827c = this.f138571L;
        this.f192828d = this.f138573M;
        this.f192829e = this.f138575N;
        this.f192830f = this.f138577O;
        this.f192831g = this.f138579P;
        this.f192832h = this.f138581Q;
        this.f192834j = this.f138585S;
        this.f192835k = this.f138587T;
        this.f192837m = this.f138590V;
        this.f192836l = this.f138589U;
        this.f192838n = this.f138568J0;
        this.f192839o = this.f138570K0;
        this.f192840p = this.f138580P0;
        this.f192841q = this.f138582Q0;
        this.f192842r = this.f138584R0;
        this.f192843s = this.f138586S0;
        this.f192844t = this.f138588T0;
        this.f192845u = this.f138593Y;
        this.f192846v = this.f138595k0;
        this.f192833i = this.f138566I0;
        this.f192847w = this.f138561E0;
        this.f192849y = this.f138563G0;
        this.f192848x = this.f138562F0;
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: E */
    public void mo127413E(Bundle bundle) {
        super.mo127413E(bundle);
        this.f138578O0.mo64426o(this.f192819C.f140684b);
        this.f138578O0.m64417E(new y20() { // from class: l.etb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95710a.m159973m0((Moment) obj);
            }
        }, new y20() { // from class: l.ftb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100729a.m159974n0((Moment) obj);
            }
        });
        ((dtb0) this.f192819C).m117845C0();
        m159972l0().setCloseAction(new x20() { // from class: l.gtb0
            @Override // p153l.x20
            public final void call() {
                this.f106397a.m159967o0();
            }
        });
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: T */
    public void mo127414T() {
        this.f138572L0.setText(R$string.f39789N1);
        if (!this.f192819C.m161937o0()) {
            bnl0.m105524M(this.f138570K0, false);
            return;
        }
        bnl0.m105524M(this.f138572L0, true);
        bnl0.m105524M(this.f138570K0, true);
        bnl0.m105509E0(this.f138572L0, new View.OnClickListener() { // from class: l.jtb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122574a.m159976q0(view);
            }
        });
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: U */
    public void mo159968U(TopicMoment topicMoment) {
        int i = topicMoment.voteCounter;
        String str = i == 1 ? String.format(getAct().getString(R$string.f39754H2), q8g0.m175816u(i)) : String.format(getAct().getString(R$string.f39760I2), q8g0.m175816u(i));
        this.f138589U.setText(String.format(getAct().getResources().getString(R$string.f39938k2), q8g0.m175816u(topicMoment.momentCounter)) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
    }

    /* JADX INFO: renamed from: i0 */
    public View m159969i0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ntb0.m164726b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m159970j0() {
        ntb0.m164727c(this);
    }

    @Override // p153l.x8i, p153l.iam
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dtb0 dtb0Var) {
        this.f192819C = dtb0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final FeedAbstractInputMomentTextToJoinTopicView m159972l0() {
        return cmg.m111222m0() ? this.f138576N0 : this.f138574M0;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m159973m0(Moment moment) {
        m159978s0(moment, m209729x());
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m159974n0(Moment moment) {
        this.f138568J0.m67332d0(moment);
        this.f138570K0.setVisibility(0);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m159976q0(View view) {
        if (cmg.m111222m0() && !cmg.m111224n0()) {
            this.f192819C.f140687e.mo225055clone().options = null;
            cn40.m111361M(getAct(), new NewPostAct.C11407a(getAct()).m63885m(this.f192819C.f140687e).m63882j(false).m63879g(true).m63874b("分享你的观点，可以获得更大曝光…"));
            return;
        }
        i4g0.m138520r("e_moment_post", m209729x());
        i4g0.m138523u("e_topic_detail_post", m209729x(), pf60.m172085a("topic_id", this.f192819C.f140686d));
        if (owi.m169565a()) {
            k3h.m148057P0(getAct(), new x20() { // from class: l.ktb0
                @Override // p153l.x20
                public final void call() {
                    o1j0.m165649w(R$string.f39831U1);
                }
            }, false, new x20() { // from class: l.ltb0
                @Override // p153l.x20
                public final void call() {
                    this.f133534a.m159975p0();
                }
            }, l3h.f129875a);
        } else {
            m159975p0();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m159977r0() {
        getAct().postDelayed(new Runnable() { // from class: l.itb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116816a.m159975p0();
            }
        }, this.f138591W.getItemAnimTime());
    }

    /* JADX INFO: renamed from: s0 */
    public void m159978s0(Moment moment, String str) {
        this.f138578O0.mo64435y(moment);
        this.f138568J0.m67339n0(moment);
    }

    /* JADX INFO: renamed from: t0 */
    public void m159979t0(pf60<Integer, Moment> pf60Var) {
        int iIntValue = pf60Var.f152156a.intValue();
        if (iIntValue == 4) {
            bnl0.m105524M(this.f138570K0, true);
        } else {
            if (iIntValue != 5) {
                return;
            }
            bnl0.m105524M(this.f138570K0, false);
        }
    }

    @Override // p153l.x8i
    /* JADX INFO: renamed from: u */
    public View mo127422u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m159969i0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u0 */
    public void m159980u0(TopicMoment topicMoment) {
        FeedVoteContainer feedVoteContainer = this.f138591W;
        if (feedVoteContainer == null) {
            return;
        }
        feedVoteContainer.m67157b(topicMoment, false, this.f192819C.f140683a);
        if (this.f138591W.getShowVoteListView() != null && cmg.m111222m0()) {
            this.f138591W.getShowVoteListView().setVoteSuccess(new x20() { // from class: l.htb0
                @Override // p153l.x20
                public final void call() {
                    this.f111519a.m159977r0();
                }
            });
        }
        m159972l0().setTopicMoment(topicMoment);
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m159975p0() {
        bnl0.m105524M(this.f138570K0, false);
        m159972l0().setFrom(this.f192819C.f140683a);
        m159972l0().mo67104E();
    }

    /* JADX INFO: renamed from: w0 */
    public void m159982w0() {
        this.f138578O0.m65055J();
    }
}

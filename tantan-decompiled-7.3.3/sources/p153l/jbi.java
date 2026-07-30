package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentForwards;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p051p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p051p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p051p1.mobile.putong.feed.p065ui.PreviewVideoLikeImageView;
import com.p051p1.mobile.putong.newui.view.InnerClickSpanTextView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jbi extends yqg {

    /* JADX INFO: renamed from: E0 */
    public VText f119877E0;

    /* JADX INFO: renamed from: F0 */
    public VText f119878F0;

    /* JADX INFO: renamed from: G0 */
    public VImage f119879G0;

    /* JADX INFO: renamed from: H0 */
    public View f119880H0;

    /* JADX INFO: renamed from: I0 */
    public VText f119881I0;

    /* JADX INFO: renamed from: J */
    public ConstraintLayout f119882J;

    /* JADX INFO: renamed from: J0 */
    public VImage f119883J0;

    /* JADX INFO: renamed from: K */
    public View f119884K;

    /* JADX INFO: renamed from: K0 */
    public View f119885K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f119886L;

    /* JADX INFO: renamed from: L0 */
    public VText f119887L0;

    /* JADX INFO: renamed from: M */
    public VImage f119888M;

    /* JADX INFO: renamed from: M0 */
    public VImage f119889M0;

    /* JADX INFO: renamed from: N */
    public VText f119890N;

    /* JADX INFO: renamed from: N0 */
    public VText f119891N0;

    /* JADX INFO: renamed from: O */
    public VImage f119892O;

    /* JADX INFO: renamed from: O0 */
    public VImage f119893O0;

    /* JADX INFO: renamed from: P */
    public VImage f119894P;

    /* JADX INFO: renamed from: P0 */
    public VDraweeView f119895P0;

    /* JADX INFO: renamed from: Q */
    public View f119896Q;

    /* JADX INFO: renamed from: Q0 */
    public VDraweeView f119897Q0;

    /* JADX INFO: renamed from: R */
    public ConstraintLayout f119898R;

    /* JADX INFO: renamed from: R0 */
    public LiveHeadAnimView f119899R0;

    /* JADX INFO: renamed from: S */
    public View f119900S;

    /* JADX INFO: renamed from: S0 */
    public View f119901S0;

    /* JADX INFO: renamed from: T */
    public InnerClickSpanTextView f119902T;

    /* JADX INFO: renamed from: T0 */
    public VText f119903T0;

    /* JADX INFO: renamed from: U */
    public FrameLayout f119904U;

    /* JADX INFO: renamed from: U0 */
    public VImage f119905U0;

    /* JADX INFO: renamed from: V */
    public VText f119906V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f119907V0;

    /* JADX INFO: renamed from: W */
    public LinearLayout f119908W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f119909W0;

    /* JADX INFO: renamed from: X */
    public VText f119910X;

    /* JADX INFO: renamed from: X0 */
    public View f119911X0;

    /* JADX INFO: renamed from: Y */
    public VText f119912Y;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f119913Y0;

    /* JADX INFO: renamed from: Z */
    public LinearLayout f119914Z;

    /* JADX INFO: renamed from: Z0 */
    public VEditText f119915Z0;

    /* JADX INFO: renamed from: a1 */
    public TextView f119916a1;

    /* JADX INFO: renamed from: b1 */
    public VLinear f119917b1;

    /* JADX INFO: renamed from: c1 */
    public RotatingDiscView f119918c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f119919d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f119920e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f119921f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f119922g1;

    /* JADX INFO: renamed from: h1 */
    public mxh f119923h1;

    /* JADX INFO: renamed from: i1 */
    public qai f119924i1;

    /* JADX INFO: renamed from: j1 */
    public x20 f119925j1;

    /* JADX INFO: renamed from: k0 */
    public VText f119926k0;

    /* JADX INFO: renamed from: k1 */
    public boolean f119927k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f119928l1;

    /* JADX INFO: renamed from: m1 */
    public int f119929m1;

    /* JADX INFO: renamed from: n1 */
    public ArrayList<PreviewVideoLikeImageView> f119930n1;

    /* JADX INFO: renamed from: p0 */
    public VText f119931p0;

    /* JADX INFO: renamed from: l.jbi$b */
    public class C17917b extends AnimatorListenerAdapter {
        public C17917b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            jbi.this.f119905U0.setImageDrawable(null);
            jbi.this.m144262d1(4);
            jbi.this.f119921f1 = false;
        }
    }

    /* JADX INFO: renamed from: l.jbi$c */
    public class C17918c extends ie80.C17711c {
        public C17918c() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            super.mo45233a(exc);
            jbi.this.m144280s1(false);
            jbi.this.m144249Q0().m175928a(jbi.this.f201178A.f56859id, 2);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            super.mo45236d();
            jbi.this.f119922g1 = true;
            jbi.this.m144280s1(false);
            jbi.this.m144249Q0().m175928a(jbi.this.f201178A.f56859id, 2);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m82486a(jbi.this.f201178A) && !jbi.this.f201180C.isFinishing()) {
                jbi jbiVar = jbi.this;
                tfj0.m190943f("e_video_play_over", jbiVar.f201185H.f147264h, tfj0.C20302a.m190949g("moment_id", jbiVar.f201178A.f56859id), tfj0.C20302a.m190949g("owner_id", jbi.this.f201178A.owner));
            }
            if (cmg.m111248z0() && NullChecker.m82486a(jbi.this.f119925j1) && jbi.this.f201180C.lifecycle_() == C4470c.f16267i) {
                jbi.this.f119925j1.call();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onPause() {
            super.onPause();
            jbi.this.m144280s1(false);
            jbi.this.m144249Q0().m175928a(jbi.this.f201178A.f56859id, 1);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            super.onResume();
            jbi.this.m144280s1(true);
            jbi.this.m144249Q0().m175928a(jbi.this.f201178A.f56859id, 3);
            if (jbi.this.f119922g1) {
                jbi jbiVar = jbi.this;
                tfj0.m190943f("e_video_play_start", jbiVar.f201185H.f147264h, tfj0.C20302a.m190949g("moment_id", jbiVar.f201178A.f56859id), tfj0.C20302a.m190949g("owner_id", jbi.this.f201178A.owner));
                jbi.this.f119922g1 = false;
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            jbi.this.m144249Q0().m175928a(jbi.this.f201178A.f56859id, 0);
            super.onStart();
            jbi jbiVar = jbi.this;
            tfj0.m190943f("e_video_play_start", jbiVar.f201185H.f147264h, tfj0.C20302a.m190949g("moment_id", jbiVar.f201178A.f56859id), tfj0.C20302a.m190949g("owner_id", jbi.this.f201178A.owner));
        }
    }

    public jbi(Moment moment, boolean z, boolean z2, Act act, mxh mxhVar) {
        super(act);
        this.f119929m1 = -1;
        this.f119930n1 = new ArrayList<>();
        this.f201178A = moment;
        this.f119927k1 = z;
        this.f119928l1 = z2;
        this.f201210x = "video";
        this.f119923h1 = mxhVar;
        if (NullChecker.m82486a(moment)) {
            this.f201179B = FeedModule.f39703d.m145688e8(moment.owner);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m144233R0() {
        if (at0.m100010d(this.f201178A) || cmg.m111229q()) {
            this.f119903T0.setVisibility(8);
            this.f119901S0.setVisibility(8);
            this.f119904U.setVisibility(8);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: D */
    public void mo144240D() {
        if (this.f201185H == null || this.f201178A == null) {
            return;
        }
        if (!cmg.m111188P()) {
            super.mo144240D();
        } else {
            m217127r0();
            ksg.m151171I0(this.f201180C, this.f201185H.f147264h, this.f201178A.f56859id);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: H */
    public View mo144241H() {
        View viewM144242L0 = m144242L0(LayoutInflater.from(this.f201180C), null);
        m144244N0();
        m144243M0();
        if (cmg.m111190R()) {
            m144277p1();
            this.f119906V.setTextSize(16.0f);
            this.f119902T.setTextSize(14.0f);
        }
        if (cmg.m111225o()) {
            m144276o1(false);
            bnl0.m105524M(this.f119900S, false);
            bnl0.m105537U(this.f119898R, qa00.m175859d(24.0f));
        }
        if (j4h.m143424h()) {
            this.f119910X.setBackgroundResource(lbc0.f130965W2);
        }
        return viewM144242L0;
    }

    /* JADX INFO: renamed from: L0 */
    public View m144242L0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kbi.m149060b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M0 */
    public void m144243M0() {
        this.f201188b = this.f119895P0;
        this.f201189c = this.f119897Q0;
        this.f201190d = this.f119899R0;
        this.f201191e = this.f119906V;
        this.f201192f = this.f119903T0;
        this.f201193g = this.f119902T;
        this.f201194h = this.f119893O0;
        this.f201195i = this.f119891N0;
        this.f201197k = this.f119887L0;
        this.f201196j = this.f119889M0;
        this.f201198l = this.f119907V0;
        this.f201199m = this.f119909W0;
        this.f201200n = this.f119915Z0;
        this.f201201o = this.f119916a1;
        this.f201187a = this.f119884K;
        this.f201202p = this.f119886L;
        this.f201206t = this.f119898R;
        this.f201204r = this.f119890N;
        this.f201203q = this.f119888M;
        this.f201205s = this.f119894P;
        this.f201207u = this.f119896Q;
        this.f201208v = this.f119913Y0;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m144244N0() {
        if (NullChecker.m82486a(this.f201179B)) {
            kyi.m151972a(this.f201179B.f56859id);
        }
        m144275n1(false);
        if (j4h.m143424h()) {
            this.f119889M0.setImageResource(lbc0.f130844F5);
            this.f119883J0.setImageResource(TextUtils.equals(m217104A().getString(R$string.f39962n5), this.f119881I0.getText()) ? lbc0.f131051h4 : lbc0.f131075k4);
        }
        FeedModule.m61406H().mo31745a().mo192243I5();
    }

    /* JADX INFO: renamed from: O0 */
    public qai m144245O0() {
        if (this.f119924i1 == null) {
            this.f119924i1 = new qai(this.f201180C);
        }
        return this.f119924i1;
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: P */
    public void mo144246P(Moment moment) {
        super.mo144246P(moment);
        m144251T0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m144247P0(final Music music) {
        if (this.f119918c1 == null) {
            this.f119904U.removeAllViews();
            RotatingDiscView rotatingDiscView = (RotatingDiscView) this.f201180C.inflater().inflate(tec0.f173795y5, (ViewGroup) null);
            this.f119918c1 = rotatingDiscView;
            this.f119904U.addView(rotatingDiscView);
            this.f119918c1.m62887d(new x20() { // from class: l.abi
                @Override // p153l.x20
                public final void call() {
                    this.f69627a.m144252U0(music);
                }
            });
        }
        this.f119918c1.m62888e(music.cover);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: Q */
    public void mo144248Q(User user) {
        super.mo144248Q(user);
        this.f119906V.setText(String.format("@%s", at0.m100007a(this.f201178A, user.name)));
    }

    /* JADX INFO: renamed from: Q0 */
    public final qai m144249Q0() {
        Act act = this.f201180C;
        if (act instanceof PhotoAlbumFeedPreviewAct) {
            return ((PhotoAlbumFeedPreviewAct) act).m66492c2();
        }
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m67370a2() : m144245O0();
    }

    /* JADX INFO: renamed from: S0 */
    public PreviewVideoLikeImageView m144250S0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        PreviewVideoLikeImageView previewVideoLikeImageView = new PreviewVideoLikeImageView(this.f201180C);
        previewVideoLikeImageView.setBackgroundResource(lbc0.f130966W3);
        previewVideoLikeImageView.setLayoutParams(layoutParams);
        previewVideoLikeImageView.setVisibility(8);
        return previewVideoLikeImageView;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m144251T0() {
        if (this.f201181D.size() <= 0 || !(this.f201181D.get(0) instanceof Video)) {
            return;
        }
        m144264f1(((Video) this.f201181D.get(0)).music);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m144252U0(Music music) {
        Act act = this.f201180C;
        act.startActivity(MusicAggregateAct.m62236l2(act, music));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m144253V0(View view) {
        if (TextUtils.equals(this.f119881I0.getText().toString(), m217104A().getString(R$string.f39806Q0)) || TextUtils.equals(this.f119881I0.getText().toString(), "抢先告白")) {
            er60.m122104w().m122130s(this.f201178A, this.f201185H.f147264h, true, false);
            FeedModule.f39702c.m61908f3(this.f201180C, this.f201179B, this.f201178A, this.f201185H.f147264h, this.f119928l1);
        } else {
            er60.m122104w().m122130s(this.f201178A, this.f201185H.f147264h, false, false);
            if (NullChecker.m82486a(this.f201179B)) {
                m217104A().startActivity(orb0.m168886c(m217104A(), this.f201179B.f56859id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m144254W0(View view) {
        ksg.m151167G0(view, new View.OnClickListener() { // from class: l.fbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98112a.m144253V0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m144255X0(View view) {
        tfj0.m190940c("e_forwarding", this.f201185H.f147264h, new pf60("moment_id", this.f201178A.f56859id), new pf60("video_moment_preview_showfrom", er60.m122103D(this.f201185H.f147268l)));
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        if ((ksg.m151225q0(FeedModule.f39703d.m145688e8(this.f201178A.owner)) && !ksg.m151227r0(this.f201178A.owner)) || ksg.m151201e0(this.f201178A)) {
            o1j0.m165651y("作者已禁止转发此条视频");
        } else if (ksg.m151205g0(this.f201178A)) {
            o1j0.m165651y("视频审核中无法转发");
        } else {
            ksg.m151169H0(this.f201180C, this.f201185H.f147264h, this.f201178A.f56859id);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m144256Y0(View view) {
        ksg.m151167G0(view, new View.OnClickListener() { // from class: l.ebi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f92927a.m144255X0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m144257Z0(FeedVideoLikeContainerView feedVideoLikeContainerView) {
        PreviewVideoLikeImageView previewVideoLikeImageViewM144250S0 = m144250S0();
        feedVideoLikeContainerView.addView(previewVideoLikeImageViewM144250S0, feedVideoLikeContainerView.getChildCount());
        this.f119930n1.add(previewVideoLikeImageViewM144250S0);
        previewVideoLikeImageViewM144250S0.setRotation((int) (Math.random() * ((double) (Math.random() > 0.5d ? 1 : -1)) * 20.0d));
        previewVideoLikeImageViewM144250S0.setScaleX(1.5f);
        previewVideoLikeImageViewM144250S0.setScaleY(1.5f);
        previewVideoLikeImageViewM144250S0.setY(feedVideoLikeContainerView.f44285c - qa00.m175859d(30.0f));
        previewVideoLikeImageViewM144250S0.setX(feedVideoLikeContainerView.f44284b - qa00.m175859d(27.0f));
        previewVideoLikeImageViewM144250S0.setVisibility(0);
        m144266g1(feedVideoLikeContainerView);
        if (this.f201178A.haveLiked || !NullChecker.m82486a(this.f201185H)) {
            return;
        }
        this.f201185H.m167623B(this.f201178A, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m144258a1(ValueAnimator valueAnimator) {
        m144263e1(Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue());
    }

    @Override // p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: b */
    public void mo107410b(cf60 cf60Var) {
        if (cf60Var instanceof wf70) {
            ((wf70) cf60Var).m206094m0(this.f119892O);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m144259b1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f119905U0.setAlpha(fFloatValue);
        this.f119901S0.setAlpha(fFloatValue);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: c0 */
    public void mo144260c0() {
        if (this.f119921f1) {
            return;
        }
        super.mo144260c0();
        this.f119919d1 = true;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m144261c1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ibi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f114219a.m144259b1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C17917b());
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m144262d1(int i) {
        this.f119903T0.setVisibility(i);
        this.f119901S0.setVisibility(i);
        this.f119903T0.setAlpha(1.0f);
    }

    @Override // p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: e */
    public ie80.C17711c mo107412e() {
        return new C17918c();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m144263e1(int i) {
        ViewGroup.LayoutParams layoutParams = this.f119901S0.getLayoutParams();
        layoutParams.width = i;
        this.f119901S0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: f1 */
    public void m144264f1(Music music) {
        if (at0.m100010d(this.f201178A) || !NullChecker.m82486a(music)) {
            return;
        }
        this.f119904U.setVisibility(0);
        m144247P0(music);
        m144280s1(true);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: g0 */
    public void mo144265g0(User user) {
        this.f201179B = user;
        if (cmg.m111225o()) {
            m144262d1(4);
            return;
        }
        m144262d1(0);
        if (user.f56859id.equals(uqb0.f180396b0.f170324a.userId()) || (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched"))) {
            m144262d1(4);
        } else {
            this.f119903T0.setSelected(false);
            this.f119901S0.setAlpha(1.0f);
            if (cmg.m111183K()) {
                if (!hyh.m137732i(user)) {
                    m144281t1();
                } else if (this.f119919d1) {
                    m144282u1();
                    this.f119919d1 = false;
                } else {
                    m144262d1(4);
                }
            } else if (NullChecker.m82486a(user.localFollowship)) {
                FollowshipStatus followshipStatus = user.localFollowship.state;
                if (!TEnum.equals(followshipStatus, FollowshipStatus.following) && !TEnum.equals(followshipStatus, "matched")) {
                    this.f201185H.m167645X();
                    m144262d1(0);
                    this.f119903T0.setTextColor(Color.parseColor("#ffffff"));
                    this.f119903T0.setText(R$string.f39814R2);
                    this.f119901S0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
                    m144263e1(0);
                } else if (this.f119919d1) {
                    m144282u1();
                    this.f119919d1 = false;
                } else {
                    m144262d1(4);
                }
            } else {
                this.f201185H.m167645X();
                m144262d1(0);
                this.f119903T0.setTextColor(Color.parseColor("#ffffff"));
                this.f119903T0.setText(R$string.f39814R2);
                this.f119901S0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
            }
        }
        m144233R0();
    }

    /* JADX INFO: renamed from: g1 */
    public void m144266g1(ViewGroup viewGroup) {
        for (int size = this.f119930n1.size() - 1; size > 0; size--) {
            PreviewVideoLikeImageView previewVideoLikeImageView = this.f119930n1.get(size);
            if (previewVideoLikeImageView.getVisibility() == 8) {
                viewGroup.removeView(previewVideoLikeImageView);
                this.f119930n1.remove(previewVideoLikeImageView);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m144267h1(Moment moment) {
        String locationName = !TextUtils.isEmpty(moment.getLocationName()) ? moment.getLocationName() : "";
        boolean zIsEmpty = TextUtils.isEmpty(locationName);
        LinearLayout linearLayout = this.f119908W;
        if (zIsEmpty) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.f119912Y.setText(locationName);
        }
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: i0 */
    public void mo134158i0(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f201178A = moment;
        boolean z = moment.haveLiked;
        VText vText = this.f201195i;
        if (z) {
            vText.setTextColor(m217104A().getResources().getColor(j4h.m143424h() ? k9c0.f124511i : k9c0.f124521n));
            this.f201194h.setImageResource(j4h.m143424h() ? lbc0.f130852G5 : lbc0.f130860H5);
        } else {
            vText.setTextColor(m217104A().getResources().getColor(k9c0.f124526p0));
            this.f201194h.setImageResource(j4h.m143424h() ? lbc0.f130868I5 : lbc0.f130876J5);
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (iMax > 0) {
            this.f201195i.setText(q8g0.m175802h0(iMax));
        } else if (iMax == 0) {
            this.f201195i.setText(R$string.f39935k);
        }
        if (!cmg.m111190R()) {
            this.f119908W.setVisibility(8);
            this.f119931p0.setVisibility(8);
            this.f119877E0.setVisibility(8);
        } else {
            if (!cmg.m111190R()) {
                m144269j1(moment);
                m144267h1(moment);
                return;
            }
            if (!NullChecker.m82486a(this.f201179B) || this.f201179B.isMe()) {
                this.f119908W.setVisibility(8);
            } else {
                m144268i1(moment);
            }
            m144271k1(moment);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m144268i1(Moment moment) {
        String strM166228a = o6i.m166228a(moment, this.f201179B, this.f201182E);
        this.f119912Y.setText(TextUtils.isEmpty(strM166228a) ? "" : strM166228a);
        bnl0.m105524M(this.f119908W, !TextUtils.isEmpty(strM166228a));
    }

    @Override // p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: j */
    public void mo107416j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        super.mo107416j(i, photoAlbumPlayerView);
        if (NullChecker.m82486a(this.f119923h1) && this.f119923h1.mo67384b(i, photoAlbumPlayerView)) {
            photoAlbumPlayerView.setLoopMode(true);
        }
        if (NullChecker.m82486a(this.f119923h1)) {
            if (this.f119923h1.mo67383a(i, photoAlbumPlayerView)) {
                if (photoAlbumPlayerView.m66614y()) {
                    return;
                }
                photoAlbumPlayerView.m66601F();
            } else if (photoAlbumPlayerView.m66614y()) {
                photoAlbumPlayerView.m66605J();
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m144269j1(Moment moment) {
        long j = (long) moment.createdTime;
        User user = this.f201179B;
        String strM151168H = ksg.m151168H(j, user == null ? 0L : user.getLastActiveTimeMillis());
        this.f119931p0.setText(strM151168H);
        bnl0.m105524M(this.f119931p0, !TextUtils.isEmpty(strM151168H));
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: k0 */
    public void mo144270k0(Moment moment) {
        if (!cmg.m111190R()) {
            m144278q1(false);
            return;
        }
        m144278q1(true);
        MomentForwards momentForwards = moment.forwards;
        int i = momentForwards != null ? momentForwards.count : 0;
        if (i > 0) {
            this.f119878F0.setText(i > 0 ? Integer.toString(i) : "转发");
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m144271k1(Moment moment) {
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m82486a(this.f201179B) && !this.f201179B.isMe()) {
            sb.append(o6i.m166229b(moment, this.f201179B, this.f201182E));
        }
        if (moment.views > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(q8g0.m175815t(moment.views));
            sb.append("次播放");
        }
        this.f119877E0.setText(sb.toString());
        int length = sb.length();
        VText vText = this.f119877E0;
        if (length > 0) {
            bnl0.m105524M(vText, true);
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f119906V.getLayoutParams();
            c0221a.f1255j = this.f119877E0.getId();
            ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = qa00.f156317d;
            c0221a.f1272w = 0;
            this.f119906V.setLayoutParams(c0221a);
            return;
        }
        bnl0.m105524M(vText, false);
        ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f119906V.getLayoutParams();
        c0221a2.f1255j = this.f119902T.getId();
        ((ViewGroup.MarginLayoutParams) c0221a2).bottomMargin = qa00.f156321h;
        c0221a2.f1272w = qa00.f156326m;
        this.f119906V.setLayoutParams(c0221a2);
    }

    @Override // p153l.yqg, p153l.jxh
    /* JADX INFO: renamed from: l */
    public void mo107418l(FeedVideoLikeContainerView feedVideoLikeContainerView) {
        super.mo107418l(feedVideoLikeContainerView);
        m144279r1(feedVideoLikeContainerView);
    }

    @Override // p153l.yqg
    /* JADX INFO: renamed from: l0 */
    public void mo144272l0(RawFeed rawFeed) {
        if (NullChecker.m82486a(rawFeed)) {
            this.f119927k1 = rawFeed.canGreeting;
        }
        m144244N0();
        m144274m1();
    }

    /* JADX INFO: renamed from: l1 */
    public void m144273l1(x20 x20Var) {
        this.f119925j1 = x20Var;
    }

    @Override // p153l.yqg, p153l.kxh
    /* JADX INFO: renamed from: m */
    public void mo107419m(Moment moment, RawFeed rawFeed, Music music) {
        super.mo107419m(moment, rawFeed, music);
        m144264f1(music);
    }

    /* JADX INFO: renamed from: m1 */
    public void m144274m1() {
        jyb.m147537z(jyb.m147507f0(this.f119881I0, this.f119883J0), new y20() { // from class: l.cbi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80823a.m144254W0((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public void m144275n1(boolean z) {
        this.f119881I0.setVisibility(z ? 0 : 8);
        this.f119883J0.setVisibility(z ? 0 : 8);
        this.f119885K0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: o1 */
    public void m144276o1(boolean z) {
        this.f119889M0.setVisibility(z ? 0 : 8);
        this.f119887L0.setVisibility(z ? 0 : 8);
        bnl0.m105537U(this.f119891N0, z ? qa00.m175859d(20.0f) : 0);
    }

    @Override // p153l.yqg, p153l.kxh
    public void onDestroy() {
        super.onDestroy();
        m144280s1(false);
    }

    /* JADX INFO: renamed from: p1 */
    public void m144277p1() {
        jyb.m147537z(jyb.m147507f0(this.f119878F0, this.f119879G0), new y20() { // from class: l.dbi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87673a.m144256Y0((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m144278q1(boolean z) {
        if (z && !bnl0.m105529O0(this.f119878F0)) {
            tfj0.m190942e("e_forwarding", this.f201185H.f147264h, new pf60("moment_id", this.f201178A.f56859id), new pf60("video_moment_preview_showfrom", er60.m122103D(this.f201185H.f147268l)));
        }
        this.f119878F0.setVisibility(z ? 0 : 8);
        this.f119879G0.setVisibility(z ? 0 : 8);
        this.f119880H0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: r1 */
    public void m144279r1(final FeedVideoLikeContainerView feedVideoLikeContainerView) {
        if (NullChecker.m82486a(feedVideoLikeContainerView)) {
            feedVideoLikeContainerView.setOnClick(new Runnable() { // from class: l.bbi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75957a.m144257Z0(feedVideoLikeContainerView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m144280s1(boolean z) {
        if (NullChecker.m82486a(this.f119918c1)) {
            boolean z2 = this.f119920e1;
            if (z) {
                if (z2) {
                    return;
                }
                this.f119918c1.m62889f();
                this.f119920e1 = true;
                return;
            }
            if (z2) {
                this.f119918c1.m62890g();
                this.f119920e1 = false;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m144281t1() {
        int i = this.f119929m1;
        if (i != -1) {
            m144263e1(i);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f119903T0.getLayoutParams();
        marginLayoutParams.width = qa00.m175859d(41.0f);
        marginLayoutParams.height = qa00.m175859d(20.0f);
        this.f119903T0.setLayoutParams(marginLayoutParams);
        this.f119903T0.setPadding(0, 0, 0, 0);
        this.f119903T0.setTextSize(12.0f);
        this.f119903T0.setCompoundDrawables(null, null, null, null);
        this.f119903T0.setText("喜欢");
        this.f201185H.m167645X();
        m144262d1(0);
        this.f119903T0.setTextColor(Color.parseColor("#ffffff"));
        this.f119901S0.setBackgroundResource(j4h.m143424h() ? lbc0.f131107o4 : lbc0.f131099n4);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m144282u1() {
        this.f119921f1 = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f119903T0, "alpha", 1.0f, 0.0f);
        this.f119929m1 = this.f119901S0.getMeasuredWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f119901S0.getWidth(), this.f119901S0.getHeight());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gbi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f103471a.m144258a1(valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
        animatorSet.addListener(new C17916a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: v1 */
    public final void m144283v1() {
        this.f119905U0.setAlpha(1.0f);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) j26.m143192e(this.f201180C, lbc0.f130959V3);
        this.f119905U0.setImageDrawable(animatedVectorDrawable);
        if (NullChecker.m82486a(animatedVectorDrawable)) {
            animatedVectorDrawable.start();
        }
        l51.m152888H(this.f201180C, new Runnable() { // from class: l.hbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f108592a.m144261c1();
            }
        }, 1200L);
    }

    /* JADX INFO: renamed from: l.jbi$a */
    public class C17916a implements Animator.AnimatorListener {
        public C17916a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            jbi.this.m144283v1();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}

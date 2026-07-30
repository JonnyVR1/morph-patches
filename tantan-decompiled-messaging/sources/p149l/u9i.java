package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentForwards;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p046p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p046p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p046p1.mobile.putong.feed.p060ui.PreviewVideoLikeImageView;
import com.p046p1.mobile.putong.newui.view.InnerClickSpanTextView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class u9i extends jpg {

    /* JADX INFO: renamed from: E0 */
    public VText f175272E0;

    /* JADX INFO: renamed from: F0 */
    public VText f175273F0;

    /* JADX INFO: renamed from: G0 */
    public VImage f175274G0;

    /* JADX INFO: renamed from: H0 */
    public View f175275H0;

    /* JADX INFO: renamed from: I0 */
    public VText f175276I0;

    /* JADX INFO: renamed from: J */
    public ConstraintLayout f175277J;

    /* JADX INFO: renamed from: J0 */
    public VImage f175278J0;

    /* JADX INFO: renamed from: K */
    public View f175279K;

    /* JADX INFO: renamed from: K0 */
    public View f175280K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f175281L;

    /* JADX INFO: renamed from: L0 */
    public VText f175282L0;

    /* JADX INFO: renamed from: M */
    public VImage f175283M;

    /* JADX INFO: renamed from: M0 */
    public VImage f175284M0;

    /* JADX INFO: renamed from: N */
    public VText f175285N;

    /* JADX INFO: renamed from: N0 */
    public VText f175286N0;

    /* JADX INFO: renamed from: O */
    public VImage f175287O;

    /* JADX INFO: renamed from: O0 */
    public VImage f175288O0;

    /* JADX INFO: renamed from: P */
    public VImage f175289P;

    /* JADX INFO: renamed from: P0 */
    public VDraweeView f175290P0;

    /* JADX INFO: renamed from: Q */
    public View f175291Q;

    /* JADX INFO: renamed from: Q0 */
    public VDraweeView f175292Q0;

    /* JADX INFO: renamed from: R */
    public ConstraintLayout f175293R;

    /* JADX INFO: renamed from: R0 */
    public LiveHeadAnimView f175294R0;

    /* JADX INFO: renamed from: S */
    public View f175295S;

    /* JADX INFO: renamed from: S0 */
    public View f175296S0;

    /* JADX INFO: renamed from: T */
    public InnerClickSpanTextView f175297T;

    /* JADX INFO: renamed from: T0 */
    public VText f175298T0;

    /* JADX INFO: renamed from: U */
    public FrameLayout f175299U;

    /* JADX INFO: renamed from: U0 */
    public VImage f175300U0;

    /* JADX INFO: renamed from: V */
    public VText f175301V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f175302V0;

    /* JADX INFO: renamed from: W */
    public LinearLayout f175303W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f175304W0;

    /* JADX INFO: renamed from: X */
    public VText f175305X;

    /* JADX INFO: renamed from: X0 */
    public View f175306X0;

    /* JADX INFO: renamed from: Y */
    public VText f175307Y;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f175308Y0;

    /* JADX INFO: renamed from: Z */
    public LinearLayout f175309Z;

    /* JADX INFO: renamed from: Z0 */
    public VEditText f175310Z0;

    /* JADX INFO: renamed from: a1 */
    public TextView f175311a1;

    /* JADX INFO: renamed from: b1 */
    public VLinear f175312b1;

    /* JADX INFO: renamed from: c1 */
    public RotatingDiscView f175313c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f175314d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f175315e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f175316f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f175317g1;

    /* JADX INFO: renamed from: h1 */
    public xvh f175318h1;

    /* JADX INFO: renamed from: i1 */
    public b9i f175319i1;

    /* JADX INFO: renamed from: j1 */
    public d30 f175320j1;

    /* JADX INFO: renamed from: k0 */
    public VText f175321k0;

    /* JADX INFO: renamed from: k1 */
    public boolean f175322k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f175323l1;

    /* JADX INFO: renamed from: m1 */
    public int f175324m1;

    /* JADX INFO: renamed from: n1 */
    public ArrayList<PreviewVideoLikeImageView> f175325n1;

    /* JADX INFO: renamed from: p0 */
    public VText f175326p0;

    /* JADX INFO: renamed from: l.u9i$b */
    public class C20382b extends AnimatorListenerAdapter {
        public C20382b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            u9i.this.f175300U0.setImageDrawable(null);
            u9i.this.m192307d1(4);
            u9i.this.f175316f1 = false;
        }
    }

    /* JADX INFO: renamed from: l.u9i$c */
    public class C20383c extends c680.C16085c {
        public C20383c() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            super.mo44050a(exc);
            u9i.this.m192322s1(false);
            u9i.this.m192295Q0().m100800a(u9i.this.f119151A.f56011id, 2);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            super.mo44053d();
            u9i.this.f175317g1 = true;
            u9i.this.m192322s1(false);
            u9i.this.m192295Q0().m100800a(u9i.this.f119151A.f56011id, 2);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m81303a(u9i.this.f119151A) && !u9i.this.f119153C.isFinishing()) {
                u9i u9iVar = u9i.this;
                p6j0.m167672f("e_video_play_over", u9iVar.f119158H.f202822h, p6j0.C19147a.m167678g("moment_id", u9iVar.f119151A.f56011id), p6j0.C19147a.m167678g("owner_id", u9i.this.f119151A.owner));
            }
            if (nkg.m159919z0() && NullChecker.m81303a(u9i.this.f175320j1) && u9i.this.f119153C.lifecycle_() == C4319c.f15548i) {
                u9i.this.f175320j1.call();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onPause() {
            super.onPause();
            u9i.this.m192322s1(false);
            u9i.this.m192295Q0().m100800a(u9i.this.f119151A.f56011id, 1);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            super.onResume();
            u9i.this.m192322s1(true);
            u9i.this.m192295Q0().m100800a(u9i.this.f119151A.f56011id, 3);
            if (u9i.this.f175317g1) {
                u9i u9iVar = u9i.this;
                p6j0.m167672f("e_video_play_start", u9iVar.f119158H.f202822h, p6j0.C19147a.m167678g("moment_id", u9iVar.f119151A.f56011id), p6j0.C19147a.m167678g("owner_id", u9i.this.f119151A.owner));
                u9i.this.f175317g1 = false;
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            u9i.this.m192295Q0().m100800a(u9i.this.f119151A.f56011id, 0);
            super.onStart();
            u9i u9iVar = u9i.this;
            p6j0.m167672f("e_video_play_start", u9iVar.f119158H.f202822h, p6j0.C19147a.m167678g("moment_id", u9iVar.f119151A.f56011id), p6j0.C19147a.m167678g("owner_id", u9i.this.f119151A.owner));
        }
    }

    public u9i(Moment moment, boolean z, boolean z2, Act act, xvh xvhVar) {
        super(act);
        this.f175324m1 = -1;
        this.f175325n1 = new ArrayList<>();
        this.f119151A = moment;
        this.f175322k1 = z;
        this.f175323l1 = z2;
        this.f119183x = "video";
        this.f175318h1 = xvhVar;
        if (NullChecker.m81303a(moment)) {
            this.f119152B = FeedModule.f38855d.m209447e8(moment.owner);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m192283R0() {
        if (vs0.m199798d(this.f119151A) || nkg.m159900q()) {
            this.f175298T0.setVisibility(8);
            this.f175296S0.setVisibility(8);
            this.f175299U.setVisibility(8);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: D */
    public void mo142700D() {
        if (this.f119158H == null || this.f119151A == null) {
            return;
        }
        if (!nkg.m159859P()) {
            super.mo142700D();
        } else {
            m142734r0();
            vqg.m199512I0(this.f119153C, this.f119158H.f202822h, this.f119151A.f56011id);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: H */
    public View mo142197H() {
        View viewM192290L0 = m192290L0(LayoutInflater.from(this.f119153C), null);
        m192292N0();
        m192291M0();
        if (nkg.m159861R()) {
            m192319p1();
            this.f175301V.setTextSize(16.0f);
            this.f175297T.setTextSize(14.0f);
        }
        if (nkg.m159896o()) {
            m192318o1(false);
            xdl0.m208344M(this.f175295S, false);
            xdl0.m208357U(this.f175293R, t100.m186890d(24.0f));
        }
        if (u2h.m191499h()) {
            this.f175305X.setBackgroundResource(f3c0.f94447W2);
        }
        return viewM192290L0;
    }

    /* JADX INFO: renamed from: L0 */
    public View m192290L0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v9i.m197575b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M0 */
    public void m192291M0() {
        this.f119161b = this.f175290P0;
        this.f119162c = this.f175292Q0;
        this.f119163d = this.f175294R0;
        this.f119164e = this.f175301V;
        this.f119165f = this.f175298T0;
        this.f119166g = this.f175297T;
        this.f119167h = this.f175288O0;
        this.f119168i = this.f175286N0;
        this.f119170k = this.f175282L0;
        this.f119169j = this.f175284M0;
        this.f119171l = this.f175302V0;
        this.f119172m = this.f175304W0;
        this.f119173n = this.f175310Z0;
        this.f119174o = this.f175311a1;
        this.f119160a = this.f175279K;
        this.f119175p = this.f175281L;
        this.f119179t = this.f175293R;
        this.f119177r = this.f175285N;
        this.f119176q = this.f175283M;
        this.f119178s = this.f175289P;
        this.f119180u = this.f175291Q;
        this.f119181v = this.f175308Y0;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m192292N0() {
        if (NullChecker.m81303a(this.f119152B)) {
            ovi.m166194a(this.f119152B.f56011id);
        }
        m192317n1(false);
        if (u2h.m191499h()) {
            this.f175284M0.setImageResource(f3c0.f94326F5);
            this.f175278J0.setImageResource(TextUtils.equals(m142697A().getString(R$string.f39114n5), this.f175276I0.getText()) ? f3c0.f94533h4 : f3c0.f94557k4);
        }
        FeedModule.m60222H().mo30742a().mo165300I5();
    }

    /* JADX INFO: renamed from: O0 */
    public b9i m192293O0() {
        if (this.f175319i1 == null) {
            this.f175319i1 = new b9i(this.f119153C);
        }
        return this.f175319i1;
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: P */
    public void mo142206P(Moment moment) {
        super.mo142206P(moment);
        m192297T0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m192294P0(final Music music) {
        if (this.f175313c1 == null) {
            this.f175299U.removeAllViews();
            RotatingDiscView rotatingDiscView = (RotatingDiscView) this.f119153C.inflater().inflate(o6c0.f142326y5, (ViewGroup) null);
            this.f175313c1 = rotatingDiscView;
            this.f175299U.addView(rotatingDiscView);
            this.f175313c1.m61703d(new d30() { // from class: l.l9i
                @Override // p149l.d30
                public final void call() {
                    this.f127122a.m192298U0(music);
                }
            });
        }
        this.f175313c1.m61704e(music.cover);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: Q */
    public void mo142207Q(User user) {
        super.mo142207Q(user);
        this.f175301V.setText(String.format("@%s", vs0.m199795a(this.f119151A, user.name)));
    }

    /* JADX INFO: renamed from: Q0 */
    public final b9i m192295Q0() {
        Act act = this.f119153C;
        if (act instanceof PhotoAlbumFeedPreviewAct) {
            return ((PhotoAlbumFeedPreviewAct) act).m65309b2();
        }
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m66187Z1() : m192293O0();
    }

    /* JADX INFO: renamed from: S0 */
    public PreviewVideoLikeImageView m192296S0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        PreviewVideoLikeImageView previewVideoLikeImageView = new PreviewVideoLikeImageView(this.f119153C);
        previewVideoLikeImageView.setBackgroundResource(f3c0.f94448W3);
        previewVideoLikeImageView.setLayoutParams(layoutParams);
        previewVideoLikeImageView.setVisibility(8);
        return previewVideoLikeImageView;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m192297T0() {
        if (this.f119154D.size() <= 0 || !(this.f119154D.get(0) instanceof Video)) {
            return;
        }
        m192309f1(((Video) this.f119154D.get(0)).music);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m192298U0(Music music) {
        Act act = this.f119153C;
        act.startActivity(MusicAggregateAct.m61052k2(act, music));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m192299V0(View view) {
        if (TextUtils.equals(this.f175276I0.getText().toString(), m142697A().getString(R$string.f38958Q0)) || TextUtils.equals(this.f175276I0.getText().toString(), "抢先告白")) {
            zi60.m218961w().m218987s(this.f119151A, this.f119158H.f202822h, true, false);
            FeedModule.f38854c.m60724f3(this.f119153C, this.f119152B, this.f119151A, this.f119158H.f202822h, this.f175323l1);
        } else {
            zi60.m218961w().m218987s(this.f119151A, this.f119158H.f202822h, false, false);
            if (NullChecker.m81303a(this.f119152B)) {
                m142697A().startActivity(kjb0.m146192c(m142697A(), this.f119152B.f56011id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m192300W0(View view) {
        vqg.m199508G0(view, new View.OnClickListener() { // from class: l.q9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f153436a.m192299V0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m192301X0(View view) {
        p6j0.m167669c("e_forwarding", this.f119158H.f202822h, new j760("moment_id", this.f119151A.f56011id), new j760("video_moment_preview_showfrom", zi60.m218960D(this.f119158H.f202826l)));
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        if ((vqg.m199566q0(FeedModule.f38855d.m209447e8(this.f119151A.owner)) && !vqg.m199568r0(this.f119151A.owner)) || vqg.m199542e0(this.f119151A)) {
            lsi0.m151595y("作者已禁止转发此条视频");
        } else if (vqg.m199546g0(this.f119151A)) {
            lsi0.m151595y("视频审核中无法转发");
        } else {
            vqg.m199510H0(this.f119153C, this.f119158H.f202822h, this.f119151A.f56011id);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m192302Y0(View view) {
        vqg.m199508G0(view, new View.OnClickListener() { // from class: l.p9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f147769a.m192301X0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m192303Z0(FeedVideoLikeContainerView feedVideoLikeContainerView) {
        PreviewVideoLikeImageView previewVideoLikeImageViewM192296S0 = m192296S0();
        feedVideoLikeContainerView.addView(previewVideoLikeImageViewM192296S0, feedVideoLikeContainerView.getChildCount());
        this.f175325n1.add(previewVideoLikeImageViewM192296S0);
        previewVideoLikeImageViewM192296S0.setRotation((int) (Math.random() * ((double) (Math.random() > 0.5d ? 1 : -1)) * 20.0d));
        previewVideoLikeImageViewM192296S0.setScaleX(1.5f);
        previewVideoLikeImageViewM192296S0.setScaleY(1.5f);
        previewVideoLikeImageViewM192296S0.setY(feedVideoLikeContainerView.f43437c - t100.m186890d(30.0f));
        previewVideoLikeImageViewM192296S0.setX(feedVideoLikeContainerView.f43436b - t100.m186890d(27.0f));
        previewVideoLikeImageViewM192296S0.setVisibility(0);
        m192310g1(feedVideoLikeContainerView);
        if (this.f119151A.haveLiked || !NullChecker.m81303a(this.f119158H)) {
            return;
        }
        this.f119158H.m218306B(this.f119151A, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m192304a1(ValueAnimator valueAnimator) {
        m192308e1(Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue());
    }

    @Override // p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: b */
    public void mo142717b(w660 w660Var) {
        if (w660Var instanceof q770) {
            ((q770) w660Var).m173231m0(this.f175287O);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m192305b1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f175300U0.setAlpha(fFloatValue);
        this.f175296S0.setAlpha(fFloatValue);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: c0 */
    public void mo142720c0() {
        if (this.f175316f1) {
            return;
        }
        super.mo142720c0();
        this.f175314d1 = true;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m192306c1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t9i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f169033a.m192305b1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C20382b());
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m192307d1(int i) {
        this.f175298T0.setVisibility(i);
        this.f175296S0.setVisibility(i);
        this.f175298T0.setAlpha(1.0f);
    }

    @Override // p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: e */
    public c680.C16085c mo142722e() {
        return new C20383c();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m192308e1(int i) {
        ViewGroup.LayoutParams layoutParams = this.f175296S0.getLayoutParams();
        layoutParams.width = i;
        this.f175296S0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: f1 */
    public void m192309f1(Music music) {
        if (vs0.m199798d(this.f119151A) || !NullChecker.m81303a(music)) {
            return;
        }
        this.f175299U.setVisibility(0);
        m192294P0(music);
        m192322s1(true);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: g0 */
    public void mo142211g0(User user) {
        this.f119152B = user;
        if (nkg.m159896o()) {
            m192307d1(4);
            return;
        }
        m192307d1(0);
        if (user.f56011id.equals(qib0.f154713b0.f139230a.userId()) || (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched"))) {
            m192307d1(4);
        } else {
            this.f175298T0.setSelected(false);
            this.f175296S0.setAlpha(1.0f);
            if (nkg.m159854K()) {
                if (!swh.m186172i(user)) {
                    m192323t1();
                } else if (this.f175314d1) {
                    m192324u1();
                    this.f175314d1 = false;
                } else {
                    m192307d1(4);
                }
            } else if (NullChecker.m81303a(user.localFollowship)) {
                FollowshipStatus followshipStatus = user.localFollowship.state;
                if (!TEnum.equals(followshipStatus, FollowshipStatus.following) && !TEnum.equals(followshipStatus, "matched")) {
                    this.f119158H.m218328X();
                    m192307d1(0);
                    this.f175298T0.setTextColor(Color.parseColor("#ffffff"));
                    this.f175298T0.setText(R$string.f38966R2);
                    this.f175296S0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
                    m192308e1(0);
                } else if (this.f175314d1) {
                    m192324u1();
                    this.f175314d1 = false;
                } else {
                    m192307d1(4);
                }
            } else {
                this.f119158H.m218328X();
                m192307d1(0);
                this.f175298T0.setTextColor(Color.parseColor("#ffffff"));
                this.f175298T0.setText(R$string.f38966R2);
                this.f175296S0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
            }
        }
        m192283R0();
    }

    /* JADX INFO: renamed from: g1 */
    public void m192310g1(ViewGroup viewGroup) {
        for (int size = this.f175325n1.size() - 1; size > 0; size--) {
            PreviewVideoLikeImageView previewVideoLikeImageView = this.f175325n1.get(size);
            if (previewVideoLikeImageView.getVisibility() == 8) {
                viewGroup.removeView(previewVideoLikeImageView);
                this.f175325n1.remove(previewVideoLikeImageView);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m192311h1(Moment moment) {
        String locationName = !TextUtils.isEmpty(moment.getLocationName()) ? moment.getLocationName() : "";
        boolean zIsEmpty = TextUtils.isEmpty(locationName);
        LinearLayout linearLayout = this.f175303W;
        if (zIsEmpty) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.f175307Y.setText(locationName);
        }
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: i0 */
    public void mo142212i0(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f119151A = moment;
        boolean z = moment.haveLiked;
        VText vText = this.f119168i;
        if (z) {
            vText.setTextColor(m142697A().getResources().getColor(u2h.m191499h() ? e1c0.f88788i : e1c0.f88798n));
            this.f119167h.setImageResource(u2h.m191499h() ? f3c0.f94334G5 : f3c0.f94342H5);
        } else {
            vText.setTextColor(m142697A().getResources().getColor(e1c0.f88803p0));
            this.f119167h.setImageResource(u2h.m191499h() ? f3c0.f94350I5 : f3c0.f94358J5);
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (iMax > 0) {
            this.f119168i.setText(i0g0.m133867h0(iMax));
        } else if (iMax == 0) {
            this.f119168i.setText(R$string.f39087k);
        }
        if (!nkg.m159861R()) {
            this.f175303W.setVisibility(8);
            this.f175326p0.setVisibility(8);
            this.f175272E0.setVisibility(8);
        } else {
            if (!nkg.m159861R()) {
                m192313j1(moment);
                m192311h1(moment);
                return;
            }
            if (!NullChecker.m81303a(this.f119152B) || this.f119152B.isMe()) {
                this.f175303W.setVisibility(8);
            } else {
                m192312i1(moment);
            }
            m192314k1(moment);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m192312i1(Moment moment) {
        String strM217093a = z4i.m217093a(moment, this.f119152B, this.f119155E);
        this.f175307Y.setText(TextUtils.isEmpty(strM217093a) ? "" : strM217093a);
        xdl0.m208344M(this.f175303W, !TextUtils.isEmpty(strM217093a));
    }

    @Override // p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: j */
    public void mo142726j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        super.mo142726j(i, photoAlbumPlayerView);
        if (NullChecker.m81303a(this.f175318h1) && this.f175318h1.mo66201b(i, photoAlbumPlayerView)) {
            photoAlbumPlayerView.setLoopMode(true);
        }
        if (NullChecker.m81303a(this.f175318h1)) {
            if (this.f175318h1.mo66200a(i, photoAlbumPlayerView)) {
                if (photoAlbumPlayerView.m65431y()) {
                    return;
                }
                photoAlbumPlayerView.m65418F();
            } else if (photoAlbumPlayerView.m65431y()) {
                photoAlbumPlayerView.m65422J();
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m192313j1(Moment moment) {
        long j = (long) moment.createdTime;
        User user = this.f119152B;
        String strM199509H = vqg.m199509H(j, user == null ? 0L : user.getLastActiveTimeMillis());
        this.f175326p0.setText(strM199509H);
        xdl0.m208344M(this.f175326p0, !TextUtils.isEmpty(strM199509H));
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: k0 */
    public void mo142729k0(Moment moment) {
        if (!nkg.m159861R()) {
            m192320q1(false);
            return;
        }
        m192320q1(true);
        MomentForwards momentForwards = moment.forwards;
        int i = momentForwards != null ? momentForwards.count : 0;
        if (i > 0) {
            this.f175273F0.setText(i > 0 ? Integer.toString(i) : "转发");
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m192314k1(Moment moment) {
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m81303a(this.f119152B) && !this.f119152B.isMe()) {
            sb.append(z4i.m217094b(moment, this.f119152B, this.f119155E));
        }
        if (moment.views > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(i0g0.m133880t(moment.views));
            sb.append("次播放");
        }
        this.f175272E0.setText(sb.toString());
        int length = sb.length();
        VText vText = this.f175272E0;
        if (length > 0) {
            xdl0.m208344M(vText, true);
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f175301V.getLayoutParams();
            c0220a.f1255j = this.f175272E0.getId();
            ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = t100.f167255d;
            c0220a.f1272w = 0;
            this.f175301V.setLayoutParams(c0220a);
            return;
        }
        xdl0.m208344M(vText, false);
        ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f175301V.getLayoutParams();
        c0220a2.f1255j = this.f175297T.getId();
        ((ViewGroup.MarginLayoutParams) c0220a2).bottomMargin = t100.f167259h;
        c0220a2.f1272w = t100.f167264m;
        this.f175301V.setLayoutParams(c0220a2);
    }

    @Override // p149l.jpg, p149l.uvh
    /* JADX INFO: renamed from: l */
    public void mo142730l(FeedVideoLikeContainerView feedVideoLikeContainerView) {
        super.mo142730l(feedVideoLikeContainerView);
        m192321r1(feedVideoLikeContainerView);
    }

    @Override // p149l.jpg
    /* JADX INFO: renamed from: l0 */
    public void mo142213l0(RawFeed rawFeed) {
        if (NullChecker.m81303a(rawFeed)) {
            this.f175322k1 = rawFeed.canGreeting;
        }
        m192292N0();
        m192316m1();
    }

    /* JADX INFO: renamed from: l1 */
    public void m192315l1(d30 d30Var) {
        this.f175320j1 = d30Var;
    }

    @Override // p149l.jpg, p149l.vvh
    /* JADX INFO: renamed from: m */
    public void mo142214m(Moment moment, RawFeed rawFeed, Music music) {
        super.mo142214m(moment, rawFeed, music);
        m192309f1(music);
    }

    /* JADX INFO: renamed from: m1 */
    public void m192316m1() {
        vwb.m200354z(vwb.m200324f0(this.f175276I0, this.f175278J0), new e30() { // from class: l.n9i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137808a.m192300W0((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public void m192317n1(boolean z) {
        this.f175276I0.setVisibility(z ? 0 : 8);
        this.f175278J0.setVisibility(z ? 0 : 8);
        this.f175280K0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: o1 */
    public void m192318o1(boolean z) {
        this.f175284M0.setVisibility(z ? 0 : 8);
        this.f175282L0.setVisibility(z ? 0 : 8);
        xdl0.m208357U(this.f175286N0, z ? t100.m186890d(20.0f) : 0);
    }

    @Override // p149l.jpg, p149l.vvh
    public void onDestroy() {
        super.onDestroy();
        m192322s1(false);
    }

    /* JADX INFO: renamed from: p1 */
    public void m192319p1() {
        vwb.m200354z(vwb.m200324f0(this.f175273F0, this.f175274G0), new e30() { // from class: l.o9i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142720a.m192302Y0((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m192320q1(boolean z) {
        if (z && !xdl0.m208349O0(this.f175273F0)) {
            p6j0.m167671e("e_forwarding", this.f119158H.f202822h, new j760("moment_id", this.f119151A.f56011id), new j760("video_moment_preview_showfrom", zi60.m218960D(this.f119158H.f202826l)));
        }
        this.f175273F0.setVisibility(z ? 0 : 8);
        this.f175274G0.setVisibility(z ? 0 : 8);
        this.f175275H0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: r1 */
    public void m192321r1(final FeedVideoLikeContainerView feedVideoLikeContainerView) {
        if (NullChecker.m81303a(feedVideoLikeContainerView)) {
            feedVideoLikeContainerView.setOnClick(new Runnable() { // from class: l.m9i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132778a.m192303Z0(feedVideoLikeContainerView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m192322s1(boolean z) {
        if (NullChecker.m81303a(this.f175313c1)) {
            boolean z2 = this.f175315e1;
            if (z) {
                if (z2) {
                    return;
                }
                this.f175313c1.m61705f();
                this.f175315e1 = true;
                return;
            }
            if (z2) {
                this.f175313c1.m61706g();
                this.f175315e1 = false;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m192323t1() {
        int i = this.f175324m1;
        if (i != -1) {
            m192308e1(i);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f175298T0.getLayoutParams();
        marginLayoutParams.width = t100.m186890d(41.0f);
        marginLayoutParams.height = t100.m186890d(20.0f);
        this.f175298T0.setLayoutParams(marginLayoutParams);
        this.f175298T0.setPadding(0, 0, 0, 0);
        this.f175298T0.setTextSize(12.0f);
        this.f175298T0.setCompoundDrawables(null, null, null, null);
        this.f175298T0.setText("喜欢");
        this.f119158H.m218328X();
        m192307d1(0);
        this.f175298T0.setTextColor(Color.parseColor("#ffffff"));
        this.f175296S0.setBackgroundResource(u2h.m191499h() ? f3c0.f94589o4 : f3c0.f94581n4);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m192324u1() {
        this.f175316f1 = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f175298T0, "alpha", 1.0f, 0.0f);
        this.f175324m1 = this.f175296S0.getMeasuredWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f175296S0.getWidth(), this.f175296S0.getHeight());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r9i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f158379a.m192304a1(valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
        animatorSet.addListener(new C20381a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: v1 */
    public final void m192325v1() {
        this.f175300U0.setAlpha(1.0f);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) e16.m114377e(this.f119153C, f3c0.f94441V3);
        this.f175300U0.setImageDrawable(animatedVectorDrawable);
        if (NullChecker.m81303a(animatedVectorDrawable)) {
            animatedVectorDrawable.start();
        }
        e51.m114743H(this.f119153C, new Runnable() { // from class: l.s9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f163187a.m192306c1();
            }
        }, 1200L);
    }

    /* JADX INFO: renamed from: l.u9i$a */
    public class C20381a implements Animator.AnimatorListener {
        public C20381a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u9i.this.m192325v1();
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

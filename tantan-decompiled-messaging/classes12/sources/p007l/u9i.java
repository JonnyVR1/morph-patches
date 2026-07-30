package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentForwards;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p000p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p000p1.mobile.putong.feed.newui.view.LiveHeadAnimView;
import com.p000p1.mobile.putong.feed.p005ui.PreviewVideoLikeImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.newui.view.InnerClickSpanTextView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c680;
import l.d30;
import l.e16;
import l.e30;
import l.e51;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w660;
import l.xdl0;
import v.VDraweeView;
import v.VEditText;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u9i extends jpg {

    /* JADX INFO: renamed from: E0 */
    public VText f13603E0;

    /* JADX INFO: renamed from: F0 */
    public VText f13604F0;

    /* JADX INFO: renamed from: G0 */
    public VImage f13605G0;

    /* JADX INFO: renamed from: H0 */
    public View f13606H0;

    /* JADX INFO: renamed from: I0 */
    public VText f13607I0;

    /* JADX INFO: renamed from: J */
    public ConstraintLayout f13608J;

    /* JADX INFO: renamed from: J0 */
    public VImage f13609J0;

    /* JADX INFO: renamed from: K */
    public View f13610K;

    /* JADX INFO: renamed from: K0 */
    public View f13611K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f13612L;

    /* JADX INFO: renamed from: L0 */
    public VText f13613L0;

    /* JADX INFO: renamed from: M */
    public VImage f13614M;

    /* JADX INFO: renamed from: M0 */
    public VImage f13615M0;

    /* JADX INFO: renamed from: N */
    public VText f13616N;

    /* JADX INFO: renamed from: N0 */
    public VText f13617N0;

    /* JADX INFO: renamed from: O */
    public VImage f13618O;

    /* JADX INFO: renamed from: O0 */
    public VImage f13619O0;

    /* JADX INFO: renamed from: P */
    public VImage f13620P;

    /* JADX INFO: renamed from: P0 */
    public VDraweeView f13621P0;

    /* JADX INFO: renamed from: Q */
    public View f13622Q;

    /* JADX INFO: renamed from: Q0 */
    public VDraweeView f13623Q0;

    /* JADX INFO: renamed from: R */
    public ConstraintLayout f13624R;

    /* JADX INFO: renamed from: R0 */
    public LiveHeadAnimView f13625R0;

    /* JADX INFO: renamed from: S */
    public View f13626S;

    /* JADX INFO: renamed from: S0 */
    public View f13627S0;

    /* JADX INFO: renamed from: T */
    public InnerClickSpanTextView f13628T;

    /* JADX INFO: renamed from: T0 */
    public VText f13629T0;

    /* JADX INFO: renamed from: U */
    public FrameLayout f13630U;

    /* JADX INFO: renamed from: U0 */
    public VImage f13631U0;

    /* JADX INFO: renamed from: V */
    public VText f13632V;

    /* JADX INFO: renamed from: V0 */
    public LinearLayout f13633V0;

    /* JADX INFO: renamed from: W */
    public LinearLayout f13634W;

    /* JADX INFO: renamed from: W0 */
    public LinearLayout f13635W0;

    /* JADX INFO: renamed from: X */
    public VText f13636X;

    /* JADX INFO: renamed from: X0 */
    public View f13637X0;

    /* JADX INFO: renamed from: Y */
    public VText f13638Y;

    /* JADX INFO: renamed from: Y0 */
    public LinearLayout f13639Y0;

    /* JADX INFO: renamed from: Z */
    public LinearLayout f13640Z;

    /* JADX INFO: renamed from: Z0 */
    public VEditText f13641Z0;

    /* JADX INFO: renamed from: a1 */
    public TextView f13642a1;

    /* JADX INFO: renamed from: b1 */
    public VLinear f13643b1;

    /* JADX INFO: renamed from: c1 */
    public RotatingDiscView f13644c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f13645d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f13646e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f13647f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f13648g1;

    /* JADX INFO: renamed from: h1 */
    public xvh f13649h1;

    /* JADX INFO: renamed from: i1 */
    public b9i f13650i1;

    /* JADX INFO: renamed from: j1 */
    public d30 f13651j1;

    /* JADX INFO: renamed from: k0 */
    public VText f13652k0;

    /* JADX INFO: renamed from: k1 */
    public boolean f13653k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f13654l1;

    /* JADX INFO: renamed from: m1 */
    public int f13655m1;

    /* JADX INFO: renamed from: n1 */
    public ArrayList<PreviewVideoLikeImageView> f13656n1;

    /* JADX INFO: renamed from: p0 */
    public VText f13657p0;

    /* JADX INFO: renamed from: l.u9i$b */
    public class C2506b extends AnimatorListenerAdapter {
        public C2506b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            u9i.this.f13631U0.setImageDrawable((Drawable) null);
            u9i.this.m14827d1(4);
            u9i.this.f13647f1 = false;
        }
    }

    /* JADX INFO: renamed from: l.u9i$c */
    public class C2507c extends c680.c {
        public C2507c() {
        }

        /* JADX INFO: renamed from: a */
        public void m14846a(Exception exc) {
            super.a(exc);
            u9i.this.m14842s1(false);
            u9i.this.m14815Q0().m8766a(((DbObject) u9i.this.f9466A).id, 2);
        }

        /* JADX INFO: renamed from: d */
        public void m14847d() {
            super.d();
            u9i.this.f13648g1 = true;
            u9i.this.m14842s1(false);
            u9i.this.m14815Q0().m8766a(((DbObject) u9i.this.f9466A).id, 2);
        }

        public void onComplete() {
            super.onComplete();
            if (NullChecker.a(u9i.this.f9466A) && !u9i.this.f9468C.isFinishing()) {
                u9i u9iVar = u9i.this;
                p6j0.m12916f("e_video_play_over", u9iVar.f9473H.f15713h, p6j0.C2456a.m12922g("moment_id", ((DbObject) u9iVar.f9466A).id), p6j0.C2456a.m12922g("owner_id", u9i.this.f9466A.owner));
            }
            if (nkg.m12278z0() && NullChecker.a(u9i.this.f13651j1) && u9i.this.f9468C.lifecycle_() == c.i) {
                u9i.this.f13651j1.call();
            }
        }

        public void onPause() {
            super.onPause();
            u9i.this.m14842s1(false);
            u9i.this.m14815Q0().m8766a(((DbObject) u9i.this.f9466A).id, 1);
        }

        public void onResume() {
            super.onResume();
            u9i.this.m14842s1(true);
            u9i.this.m14815Q0().m8766a(((DbObject) u9i.this.f9466A).id, 3);
            if (u9i.this.f13648g1) {
                u9i u9iVar = u9i.this;
                p6j0.m12916f("e_video_play_start", u9iVar.f9473H.f15713h, p6j0.C2456a.m12922g("moment_id", ((DbObject) u9iVar.f9466A).id), p6j0.C2456a.m12922g("owner_id", u9i.this.f9466A.owner));
                u9i.this.f13648g1 = false;
            }
        }

        public void onStart() {
            u9i.this.m14815Q0().m8766a(((DbObject) u9i.this.f9466A).id, 0);
            super.onStart();
            u9i u9iVar = u9i.this;
            p6j0.m12916f("e_video_play_start", u9iVar.f9473H.f15713h, p6j0.C2456a.m12922g("moment_id", ((DbObject) u9iVar.f9466A).id), p6j0.C2456a.m12922g("owner_id", u9i.this.f9466A.owner));
        }
    }

    public u9i(Moment moment, boolean z, boolean z2, Act act, xvh xvhVar) {
        super(act);
        this.f13655m1 = -1;
        this.f13656n1 = new ArrayList<>();
        this.f9466A = moment;
        this.f13653k1 = z;
        this.f13654l1 = z2;
        this.f9498x = "video";
        this.f13649h1 = xvhVar;
        if (NullChecker.a(moment)) {
            this.f9467B = FeedModule.f316d.m16628e8(moment.owner);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private void m14803R0() {
        if (vs0.m15566d(this.f9466A) || nkg.m12259q()) {
            this.f13629T0.setVisibility(8);
            this.f13627S0.setVisibility(8);
            this.f13630U.setVisibility(8);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: D */
    public void mo11283D() {
        if (this.f9473H == null || this.f9466A == null) {
            return;
        }
        if (!nkg.m12218P()) {
            super.mo11283D();
        } else {
            m11318r0();
            vqg.m15482I0(this.f9468C, this.f9473H.f15713h, ((DbObject) this.f9466A).id);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: H */
    public View mo11215H() {
        View viewM14810L0 = m14810L0(LayoutInflater.from(this.f9468C), null);
        m14812N0();
        m14811M0();
        if (nkg.m12220R()) {
            m14839p1();
            this.f13632V.setTextSize(16.0f);
            this.f13628T.setTextSize(14.0f);
        }
        if (nkg.m12255o()) {
            m14838o1(false);
            xdl0.M(this.f13626S, false);
            xdl0.U(this.f13624R, t100.d(24.0f));
        }
        if (u2h.m14723h()) {
            this.f13636X.setBackgroundResource(f3c0.f7730W2);
        }
        return viewM14810L0;
    }

    /* JADX INFO: renamed from: L0 */
    public View m14810L0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v9i.m15398b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M0 */
    public void m14811M0() {
        this.f9476b = this.f13621P0;
        this.f9477c = this.f13623Q0;
        this.f9478d = this.f13625R0;
        this.f9479e = this.f13632V;
        this.f9480f = this.f13629T0;
        this.f9481g = this.f13628T;
        this.f9482h = this.f13619O0;
        this.f9483i = this.f13617N0;
        this.f9485k = this.f13613L0;
        this.f9484j = this.f13615M0;
        this.f9486l = this.f13633V0;
        this.f9487m = this.f13635W0;
        this.f9488n = this.f13641Z0;
        this.f9489o = this.f13642a1;
        this.f9475a = this.f13610K;
        this.f9490p = this.f13612L;
        this.f9494t = this.f13624R;
        this.f9492r = this.f13616N;
        this.f9491q = this.f13614M;
        this.f9493s = this.f13620P;
        this.f9495u = this.f13622Q;
        this.f9496v = this.f13639Y0;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m14812N0() {
        if (NullChecker.a(this.f9467B)) {
            ovi.m12868a(((DbObject) this.f9467B).id);
        }
        m14837n1(false);
        if (u2h.m14723h()) {
            this.f13615M0.setImageResource(f3c0.f7609F5);
            this.f13609J0.setImageResource(TextUtils.equals(m11280A().getString(R$string.f575n5), this.f13607I0.getText()) ? f3c0.f7816h4 : f3c0.f7840k4);
        }
        FeedModule.m1140H().a().I5();
    }

    /* JADX INFO: renamed from: O0 */
    public b9i m14813O0() {
        if (this.f13650i1 == null) {
            this.f13650i1 = new b9i(this.f9468C);
        }
        return this.f13650i1;
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: P */
    public void mo11224P(Moment moment) {
        super.mo11224P(moment);
        m14817T0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m14814P0(final Music music) {
        if (this.f13644c1 == null) {
            this.f13630U.removeAllViews();
            RotatingDiscView rotatingDiscView = (RotatingDiscView) this.f9468C.inflater().inflate(o6c0.f11345y5, (ViewGroup) null);
            this.f13644c1 = rotatingDiscView;
            this.f13630U.addView(rotatingDiscView);
            this.f13644c1.m2655d(new d30() { // from class: l.l9i
                public final void call() {
                    this.f9964a.m14818U0(music);
                }
            });
        }
        this.f13644c1.m2656e(music.cover);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: Q */
    public void mo11225Q(User user) {
        super.mo11225Q(user);
        this.f13632V.setText(String.format("@%s", vs0.m15563a(this.f9466A, user.name)));
    }

    /* JADX INFO: renamed from: Q0 */
    public final b9i m14815Q0() {
        Act act = this.f9468C;
        if (act instanceof PhotoAlbumFeedPreviewAct) {
            return ((PhotoAlbumFeedPreviewAct) act).m6410b2();
        }
        return act instanceof FeedVideoFlowAct ? ((FeedVideoFlowAct) act).m7345Z1() : m14813O0();
    }

    /* JADX INFO: renamed from: S0 */
    public PreviewVideoLikeImageView m14816S0() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        AppCompatImageView previewVideoLikeImageView = new PreviewVideoLikeImageView(this.f9468C);
        previewVideoLikeImageView.setBackgroundResource(f3c0.f7731W3);
        previewVideoLikeImageView.setLayoutParams(layoutParams);
        previewVideoLikeImageView.setVisibility(8);
        return previewVideoLikeImageView;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m14817T0() {
        if (this.f9469D.size() <= 0 || !(this.f9469D.get(0) instanceof Video)) {
            return;
        }
        m14829f1(((Video) this.f9469D.get(0)).music);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m14818U0(Music music) {
        Act act = this.f9468C;
        act.startActivity(MusicAggregateAct.m1982k2(act, music));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m14819V0(View view) {
        if (TextUtils.equals(this.f13607I0.getText().toString(), m11280A().getString(R$string.f419Q0)) || TextUtils.equals(this.f13607I0.getText().toString(), "抢先告白")) {
            zi60.m17436w().m17462s(this.f9466A, this.f9473H.f15713h, true, false);
            FeedModule.f315c.m1650f3(this.f9468C, this.f9467B, this.f9466A, this.f9473H.f15713h, this.f13654l1);
        } else {
            zi60.m17436w().m17462s(this.f9466A, this.f9473H.f15713h, false, false);
            if (NullChecker.a(this.f9467B)) {
                m11280A().startActivity(kjb0.m11451c(m11280A(), ((DbObject) this.f9467B).id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m14820W0(View view) {
        vqg.m15478G0(view, new View.OnClickListener() { // from class: l.q9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12167a.m14819V0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m14821X0(View view) {
        p6j0.m12913c("e_forwarding", this.f9473H.f15713h, new j760("moment_id", ((DbObject) this.f9466A).id), new j760("video_moment_preview_showfrom", zi60.m17435D(this.f9473H.f15717l)));
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        if ((vqg.m15536q0(FeedModule.f316d.m16628e8(this.f9466A.owner)) && !vqg.m15538r0(this.f9466A.owner)) || vqg.m15512e0(this.f9466A)) {
            lsi0.y("作者已禁止转发此条视频");
        } else if (vqg.m15516g0(this.f9466A)) {
            lsi0.y("视频审核中无法转发");
        } else {
            vqg.m15480H0(this.f9468C, this.f9473H.f15713h, ((DbObject) this.f9466A).id);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m14822Y0(View view) {
        vqg.m15478G0(view, new View.OnClickListener() { // from class: l.p9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11739a.m14821X0(view2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.feed.ui.PreviewVideoLikeImageView, java.lang.Object] */
    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m14823Z0(FeedVideoLikeContainerView feedVideoLikeContainerView) {
        ?? M14816S0 = m14816S0();
        feedVideoLikeContainerView.addView((View) M14816S0, feedVideoLikeContainerView.getChildCount());
        this.f13656n1.add((PreviewVideoLikeImageView) M14816S0);
        M14816S0.setRotation((int) (Math.random() * ((double) (Math.random() > 0.5d ? 1 : -1)) * 20.0d));
        M14816S0.setScaleX(1.5f);
        M14816S0.setScaleY(1.5f);
        M14816S0.setY(feedVideoLikeContainerView.f4898c - t100.d(30.0f));
        M14816S0.setX(feedVideoLikeContainerView.f4897b - t100.d(27.0f));
        M14816S0.setVisibility(0);
        m14830g1(feedVideoLikeContainerView);
        if (this.f9466A.haveLiked || !NullChecker.a(this.f9473H)) {
            return;
        }
        this.f9473H.m17343B(this.f9466A, true);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m14824a1(ValueAnimator valueAnimator) {
        m14828e1(Float.valueOf(valueAnimator.getAnimatedValue() + "").intValue());
    }

    @Override // p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: b */
    public void mo11300b(w660 w660Var) {
        if (w660Var instanceof q770) {
            ((q770) w660Var).m13475m0(this.f13618O);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m14825b1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f13631U0.setAlpha(fFloatValue);
        this.f13627S0.setAlpha(fFloatValue);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: c0 */
    public void mo11303c0() {
        if (this.f13647f1) {
            return;
        }
        super.mo11303c0();
        this.f13645d1 = true;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m14826c1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t9i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13238a.m14825b1(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C2506b());
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m14827d1(int i) {
        this.f13629T0.setVisibility(i);
        this.f13627S0.setVisibility(i);
        this.f13629T0.setAlpha(1.0f);
    }

    @Override // p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: e */
    public c680.c mo11305e() {
        return new C2507c();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m14828e1(int i) {
        ViewGroup.LayoutParams layoutParams = this.f13627S0.getLayoutParams();
        layoutParams.width = i;
        this.f13627S0.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: f1 */
    public void m14829f1(Music music) {
        if (vs0.m15566d(this.f9466A) || !NullChecker.a(music)) {
            return;
        }
        this.f13630U.setVisibility(0);
        m14814P0(music);
        m14842s1(true);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: g0 */
    public void mo11229g0(User user) {
        this.f9467B = user;
        if (nkg.m12255o()) {
            m14827d1(4);
            return;
        }
        m14827d1(0);
        if (((DbObject) user).id.equals(qib0.b0.a.userId()) || (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched"))) {
            m14827d1(4);
        } else {
            this.f13629T0.setSelected(false);
            this.f13627S0.setAlpha(1.0f);
            if (nkg.m12213K()) {
                if (!swh.m14341i(user)) {
                    m14843t1();
                } else if (this.f13645d1) {
                    m14844u1();
                    this.f13645d1 = false;
                } else {
                    m14827d1(4);
                }
            } else if (NullChecker.a(user.localFollowship)) {
                FollowshipStatus followshipStatus = user.localFollowship.state;
                if (!TEnum.equals(followshipStatus, FollowshipStatus.following) && !TEnum.equals(followshipStatus, "matched")) {
                    this.f9473H.m17365X();
                    m14827d1(0);
                    this.f13629T0.setTextColor(Color.parseColor("#ffffff"));
                    this.f13629T0.setText(R$string.f427R2);
                    this.f13627S0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
                    m14828e1(0);
                } else if (this.f13645d1) {
                    m14844u1();
                    this.f13645d1 = false;
                } else {
                    m14827d1(4);
                }
            } else {
                this.f9473H.m17365X();
                m14827d1(0);
                this.f13629T0.setTextColor(Color.parseColor("#ffffff"));
                this.f13629T0.setText(R$string.f427R2);
                this.f13627S0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
            }
        }
        m14803R0();
    }

    /* JADX INFO: renamed from: g1 */
    public void m14830g1(ViewGroup viewGroup) {
        for (int size = this.f13656n1.size() - 1; size > 0; size--) {
            VImage vImage = (PreviewVideoLikeImageView) this.f13656n1.get(size);
            if (vImage.getVisibility() == 8) {
                viewGroup.removeView(vImage);
                this.f13656n1.remove(vImage);
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m14831h1(Moment moment) {
        String locationName = !TextUtils.isEmpty(moment.getLocationName()) ? moment.getLocationName() : "";
        boolean zIsEmpty = TextUtils.isEmpty(locationName);
        LinearLayout linearLayout = this.f13634W;
        if (zIsEmpty) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.f13638Y.setText(locationName);
        }
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: i0 */
    public void mo11230i0(Moment moment) {
        if (moment == null) {
            return;
        }
        this.f9466A = moment;
        boolean z = moment.haveLiked;
        VText vText = this.f9483i;
        if (z) {
            vText.setTextColor(m11280A().getResources().getColor(u2h.m14723h() ? e1c0.f7144i : e1c0.f7154n));
            this.f9482h.setImageResource(u2h.m14723h() ? f3c0.f7617G5 : f3c0.f7625H5);
        } else {
            vText.setTextColor(m11280A().getResources().getColor(e1c0.f7159p0));
            this.f9482h.setImageResource(u2h.m14723h() ? f3c0.f7633I5 : f3c0.f7641J5);
        }
        PartialIdList partialIdList = moment.likes;
        int iMax = Math.max(partialIdList.count, partialIdList.ids.size());
        if (iMax > 0) {
            this.f9483i.setText(i0g0.h0(iMax));
        } else if (iMax == 0) {
            this.f9483i.setText(R$string.f548k);
        }
        if (!nkg.m12220R()) {
            this.f13634W.setVisibility(8);
            this.f13657p0.setVisibility(8);
            this.f13603E0.setVisibility(8);
        } else {
            if (!nkg.m12220R()) {
                m14833j1(moment);
                m14831h1(moment);
                return;
            }
            if (!NullChecker.a(this.f9467B) || this.f9467B.isMe()) {
                this.f13634W.setVisibility(8);
            } else {
                m14832i1(moment);
            }
            m14834k1(moment);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m14832i1(Moment moment) {
        String strM17222a = z4i.m17222a(moment, this.f9467B, this.f9470E);
        this.f13638Y.setText(TextUtils.isEmpty(strM17222a) ? "" : strM17222a);
        xdl0.M(this.f13634W, !TextUtils.isEmpty(strM17222a));
    }

    @Override // p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: j */
    public void mo11310j(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        super.mo11310j(i, photoAlbumPlayerView);
        if (NullChecker.a(this.f13649h1) && this.f13649h1.mo7359b(i, photoAlbumPlayerView)) {
            photoAlbumPlayerView.setLoopMode(true);
        }
        if (NullChecker.a(this.f13649h1)) {
            if (this.f13649h1.mo7358a(i, photoAlbumPlayerView)) {
                if (photoAlbumPlayerView.m6550y()) {
                    return;
                }
                photoAlbumPlayerView.m6537F();
            } else if (photoAlbumPlayerView.m6550y()) {
                photoAlbumPlayerView.m6541J();
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m14833j1(Moment moment) {
        long j = (long) moment.createdTime;
        User user = this.f9467B;
        String strM15479H = vqg.m15479H(j, user == null ? 0L : user.getLastActiveTimeMillis());
        this.f13657p0.setText(strM15479H);
        xdl0.M(this.f13657p0, !TextUtils.isEmpty(strM15479H));
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: k0 */
    public void mo11313k0(Moment moment) {
        if (!nkg.m12220R()) {
            m14840q1(false);
            return;
        }
        m14840q1(true);
        MomentForwards momentForwards = moment.forwards;
        int i = momentForwards != null ? momentForwards.count : 0;
        if (i > 0) {
            this.f13604F0.setText(i > 0 ? Integer.toString(i) : "转发");
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m14834k1(Moment moment) {
        StringBuilder sb = new StringBuilder();
        if (NullChecker.a(this.f9467B) && !this.f9467B.isMe()) {
            sb.append(z4i.m17223b(moment, this.f9467B, this.f9470E));
        }
        if (moment.views > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(i0g0.t(moment.views));
            sb.append("次播放");
        }
        this.f13603E0.setText(sb.toString());
        int length = sb.length();
        VText vText = this.f13603E0;
        if (length > 0) {
            xdl0.M(vText, true);
            ConstraintLayout.a layoutParams = this.f13632V.getLayoutParams();
            layoutParams.j = this.f13603E0.getId();
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = t100.d;
            layoutParams.w = 0;
            this.f13632V.setLayoutParams(layoutParams);
            return;
        }
        xdl0.M(vText, false);
        ConstraintLayout.a layoutParams2 = this.f13632V.getLayoutParams();
        layoutParams2.j = this.f13628T.getId();
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = t100.h;
        layoutParams2.w = t100.m;
        this.f13632V.setLayoutParams(layoutParams2);
    }

    @Override // p007l.jpg, p007l.uvh
    /* JADX INFO: renamed from: l */
    public void mo11314l(FeedVideoLikeContainerView feedVideoLikeContainerView) {
        super.mo11314l(feedVideoLikeContainerView);
        m14841r1(feedVideoLikeContainerView);
    }

    @Override // p007l.jpg
    /* JADX INFO: renamed from: l0 */
    public void mo11231l0(RawFeed rawFeed) {
        if (NullChecker.a(rawFeed)) {
            this.f13653k1 = rawFeed.canGreeting;
        }
        m14812N0();
        m14836m1();
    }

    /* JADX INFO: renamed from: l1 */
    public void m14835l1(d30 d30Var) {
        this.f13651j1 = d30Var;
    }

    @Override // p007l.jpg, p007l.vvh
    /* JADX INFO: renamed from: m */
    public void mo11232m(Moment moment, RawFeed rawFeed, Music music) {
        super.mo11232m(moment, rawFeed, music);
        m14829f1(music);
    }

    /* JADX INFO: renamed from: m1 */
    public void m14836m1() {
        vwb.z(vwb.f0(new View[]{this.f13607I0, this.f13609J0}), new e30() { // from class: l.n9i
            public final void call(Object obj) {
                this.f10717a.m14820W0((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public void m14837n1(boolean z) {
        this.f13607I0.setVisibility(z ? 0 : 8);
        this.f13609J0.setVisibility(z ? 0 : 8);
        this.f13611K0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: o1 */
    public void m14838o1(boolean z) {
        this.f13615M0.setVisibility(z ? 0 : 8);
        this.f13613L0.setVisibility(z ? 0 : 8);
        xdl0.U(this.f13617N0, z ? t100.d(20.0f) : 0);
    }

    @Override // p007l.jpg, p007l.vvh
    public void onDestroy() {
        super.onDestroy();
        m14842s1(false);
    }

    /* JADX INFO: renamed from: p1 */
    public void m14839p1() {
        vwb.z(vwb.f0(new View[]{this.f13604F0, this.f13605G0}), new e30() { // from class: l.o9i
            public final void call(Object obj) {
                this.f11396a.m14822Y0((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m14840q1(boolean z) {
        if (z && !xdl0.O0(this.f13604F0)) {
            p6j0.m12915e("e_forwarding", this.f9473H.f15713h, new j760("moment_id", ((DbObject) this.f9466A).id), new j760("video_moment_preview_showfrom", zi60.m17435D(this.f9473H.f15717l)));
        }
        this.f13604F0.setVisibility(z ? 0 : 8);
        this.f13605G0.setVisibility(z ? 0 : 8);
        this.f13606H0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: r1 */
    public void m14841r1(final FeedVideoLikeContainerView feedVideoLikeContainerView) {
        if (NullChecker.a(feedVideoLikeContainerView)) {
            feedVideoLikeContainerView.setOnClick(new Runnable() { // from class: l.m9i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10362a.m14823Z0(feedVideoLikeContainerView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m14842s1(boolean z) {
        if (NullChecker.a(this.f13644c1)) {
            boolean z2 = this.f13646e1;
            if (z) {
                if (z2) {
                    return;
                }
                this.f13644c1.m2657f();
                this.f13646e1 = true;
                return;
            }
            if (z2) {
                this.f13644c1.m2658g();
                this.f13646e1 = false;
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public void m14843t1() {
        int i = this.f13655m1;
        if (i != -1) {
            m14828e1(i);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13629T0.getLayoutParams();
        marginLayoutParams.width = t100.d(41.0f);
        marginLayoutParams.height = t100.d(20.0f);
        this.f13629T0.setLayoutParams(marginLayoutParams);
        this.f13629T0.setPadding(0, 0, 0, 0);
        this.f13629T0.setTextSize(12.0f);
        this.f13629T0.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f13629T0.setText("喜欢");
        this.f9473H.m17365X();
        m14827d1(0);
        this.f13629T0.setTextColor(Color.parseColor("#ffffff"));
        this.f13627S0.setBackgroundResource(u2h.m14723h() ? f3c0.f7872o4 : f3c0.f7864n4);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m14844u1() {
        this.f13647f1 = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f13629T0, "alpha", 1.0f, 0.0f);
        this.f13655m1 = this.f13627S0.getMeasuredWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f13627S0.getWidth(), this.f13627S0.getHeight());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.r9i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12566a.m14824a1(valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
        animatorSet.addListener(new C2505a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: v1 */
    public final void m14845v1() {
        this.f13631U0.setAlpha(1.0f);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) e16.e(this.f9468C, f3c0.f7724V3);
        this.f13631U0.setImageDrawable(animatedVectorDrawable);
        if (NullChecker.a(animatedVectorDrawable)) {
            animatedVectorDrawable.start();
        }
        e51.H(this.f9468C, new Runnable() { // from class: l.s9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f12845a.m14826c1();
            }
        }, 1200L);
    }

    /* JADX INFO: renamed from: l.u9i$a */
    public class C2505a implements Animator.AnimatorListener {
        public C2505a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u9i.this.m14845v1();
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

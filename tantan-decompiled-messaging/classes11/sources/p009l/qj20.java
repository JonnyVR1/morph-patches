package p009l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.match.a;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.p1.mobile.putong.core.ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.fap;
import l.j760;
import l.mep0;
import l.nkp;
import l.o6j0;
import l.ogl0;
import l.qib0;
import l.qp8;
import l.t100;
import l.tpd0;
import l.u59;
import l.upa;
import l.vwb;
import l.x0m;
import l.x2c0;
import l.xdl0;
import l.xij0;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import v.VFrame_ColorFilter;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qj20 extends Act.w<Act, ProfileAct> {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static tpd0 f19298i = new tpd0("super_like_bubble_show_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static zpd0 f19299j = new zpd0("super_like_bubble_show_date_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: k */
    public static final int f19300k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f19301l = 360;

    /* JADX INFO: renamed from: m */
    public static final int f19302m = 275;

    /* JADX INFO: renamed from: n */
    public static final int f19303n = 220;

    /* JADX INFO: renamed from: o */
    public static final int f19304o = 150;

    /* JADX INFO: renamed from: p */
    public static final int f19305p = 400;

    /* JADX INFO: renamed from: q */
    public static final int f19306q = 235;

    /* JADX INFO: renamed from: r */
    public static final int f19307r = 15;

    /* JADX INFO: renamed from: b */
    public am4<znl> f19309b;

    /* JADX INFO: renamed from: g */
    public float f19314g;

    /* JADX INFO: renamed from: a */
    public final boolean f19308a = upa.h3();

    /* JADX INFO: renamed from: c */
    public boolean f19310c = true;

    /* JADX INFO: renamed from: d */
    public boolean f19311d = true;

    /* JADX INFO: renamed from: e */
    public boolean f19312e = ((Boolean) CoreModule.c.e0.W0.get()).booleanValue();

    /* JADX INFO: renamed from: f */
    public boolean f19313f = false;

    /* JADX INFO: renamed from: h */
    public float f19315h = -1.0f;

    /* JADX INFO: renamed from: l.qj20$a */
    public class C1147a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f19316a = false;

        /* JADX INFO: renamed from: b */
        public int f19317b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f19318c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f19319d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f19320e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f19321f;

        public C1147a(int i, int i2, j760 j760Var, Animator animator) {
            this.f19318c = i;
            this.f19319d = i2;
            this.f19320e = j760Var;
            this.f19321f = animator;
            this.f19317b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f19319d;
            RecyclerView recyclerViewW = ((x0m) this.f19320e.b).W();
            if (this.f19316a) {
                return;
            }
            recyclerViewW.scrollBy(0, (-this.f19317b) + iIntValue);
            this.f19317b = iIntValue;
            if (i <= this.f19319d) {
                Animator animatorM21022W = qj20.this.m21022W(this.f19320e);
                Animator animator = this.f19321f;
                Objects.requireNonNull(animator);
                bt0.f(animatorM21022W, new hug0(animator));
                animatorM21022W.start();
                this.f19316a = true;
            }
        }
    }

    public qj20(am4<znl> am4Var) {
        this.f19309b = am4Var;
    }

    /* JADX INFO: renamed from: A */
    private int m21017A() {
        int i = f19302m;
        if (this.f19310c) {
            i = f19303n;
        }
        float f = this.f19315h;
        return f != -1.0f ? (int) (f * i) : i;
    }

    /* JADX INFO: renamed from: C */
    private int m21018C() {
        float f = this.f19315h;
        return f != -1.0f ? (int) (f * f19307r) : f19307r;
    }

    /* JADX INFO: renamed from: D */
    private int m21019D() {
        float f = this.f19315h;
        return f != -1.0f ? (int) (f * f19306q) : f19306q;
    }

    /* JADX INFO: renamed from: E */
    private int m21020E() {
        float f = this.f19315h;
        return f != -1.0f ? (int) (f * f19305p) : f19305p;
    }

    /* JADX INFO: renamed from: I */
    public static PictureView m21021I(PictureView pictureView, PictureView pictureView2) {
        pictureView2.m.setText(pictureView.m.getText());
        pictureView2.m.setVisibility(pictureView.m.getVisibility());
        pictureView2.n.setVisibility(pictureView.n.getVisibility());
        pictureView2.o.setText(pictureView.o.getText());
        pictureView2.o.setVisibility(pictureView.o.getVisibility());
        return pictureView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: W */
    public Animator m21022W(final j760<NewNewProfileCard, x0m> j760Var) {
        int i;
        xdl0.g gVar;
        ObjectAnimator objectAnimatorM21061x;
        int i2;
        Animator animatorN;
        int iC0 = ((x0m) j760Var.b).c0();
        ((x0m) j760Var.b).e2();
        xdl0.u(((x0m) j760Var.b).W());
        if (((x0m) j760Var.b).u2() == null) {
            return null;
        }
        xdl0.v(((x0m) j760Var.b).u2());
        PictureView pictureViewU0 = ((x0m) j760Var.b).U0();
        int iM21017A = m21017A();
        if (pictureViewU0 == null) {
            CrashHelper.c(new RuntimeException(String.format(Locale.CHINA, "卡片切换动画异常：用户ID：%s, 图片数量：%d, 当前索引：%d", NullChecker.a(((NewNewProfileCard) j760Var.a).f578v2) ? ((DbObject) ((NewNewProfileCard) j760Var.a).f578v2).id : "null", Integer.valueOf(NullChecker.a(((NewNewProfileCard) j760Var.a).f578v2) ? ((NewNewProfileCard) j760Var.a).f578v2.pictures.size() : 0), Integer.valueOf(iC0))));
            return bt0.j(iM21017A);
        }
        if (((NewNewProfileCard) j760Var.a).f578v2.pictures.size() <= iC0) {
            iC0 = ((NewNewProfileCard) j760Var.a).f578v2.pictures.size() - 1;
        }
        final Media media = ((NewNewProfileCard) j760Var.a).f578v2.media(iC0);
        ((NewNewProfileCard) j760Var.a).m908v3(media);
        ((NewNewProfileCard) j760Var.a).post(new Runnable() { // from class: l.jj20
            @Override // java.lang.Runnable
            public final void run() {
                this.f15191a.m21046R(j760Var, media);
            }
        });
        xdl0.g gVarI0 = xdl0.i0(((NewNewProfileCard) j760Var.a).f515T);
        xdl0.g gVarI1 = xdl0.i0(pictureViewU0);
        xdl0.g gVarI2 = xdl0.i0(((NewNewProfileCard) j760Var.a).f515T.b);
        int i3 = gVarI0.b;
        int i4 = gVarI1.b;
        Animator animatorJ = null;
        int i5 = i3 - i4;
        if (this.f19310c) {
            animatorJ = (ObjectAnimator) bt0.p(pictureViewU0, "translationY", 0L, iM21017A, (Interpolator) null, new float[]{i3 - i4});
            Object obj = j760Var.a;
            User user = ((NewNewProfileCard) obj).f578v2;
            PictureView pictureView = ((NewNewProfileCard) obj).f515T;
            NewNewProfileCard newNewProfileCard = (NewNewProfileCard) obj;
            gVar = gVarI0;
            pictureViewU0 = pictureViewU0;
            i = iM21017A;
            objectAnimatorM21061x = m21061x(user, pictureViewU0, media, gVar, gVarI1, gVarI2, i5, pictureView, newNewProfileCard);
        } else {
            i = iM21017A;
            gVar = gVarI0;
            objectAnimatorM21061x = null;
        }
        xdl0.g gVarI3 = xdl0.i0(((x0m) j760Var.b).p());
        xdl0.g gVarU = ((x0m) j760Var.b).U();
        xdl0.g gVarI4 = xdl0.i0(((NewNewProfileCard) j760Var.a).f472F0);
        xdl0.g gVarI5 = xdl0.i0(((x0m) j760Var.b).R2());
        int iD = (gVarI3.d - (gVarU.b - gVarI3.b)) + t100.d(30.0f);
        int i6 = xdl0.i0(((x0m) j760Var.b).o0()).a;
        PictureView pictureViewM21021I = m21021I(((NewNewProfileCard) j760Var.a).f515T, pictureViewU0);
        long j = i;
        Animator animatorM21037H = m21037H(pictureViewU0, pictureViewM21021I);
        Animator animatorM21036G = m21036G((x0m) j760Var.b, i, iD);
        Animator animatorM21035F = m21035F((x0m) j760Var.b, i, iD);
        ObjectAnimator objectAnimator = objectAnimatorM21061x;
        Animator animatorP = bt0.p(((x0m) j760Var.b).B2(), "alpha", 0L, j, (Interpolator) null, new float[]{0.0f});
        Animator animatorP2 = bt0.p(((x0m) j760Var.b).S1(), "alpha", 0L, j, (Interpolator) null, new float[]{0.0f});
        Animator animatorP3 = bt0.p(((x0m) j760Var.b).h2(), "alpha", 0L, j, (Interpolator) null, new float[]{0.0f});
        Animator animatorP4 = bt0.p(((x0m) j760Var.b).o0(), "alpha", 0L, j, bt0.f, new float[]{0.0f});
        Animator animatorP5 = bt0.p(((x0m) j760Var.b).J(), "alpha", 0L, j, (Interpolator) null, new float[]{0.0f});
        Animator animatorJ2 = (this.f19311d || och0.m19663f()) ? bt0.j(0) : bt0.p(((x0m) j760Var.b).Q2(), "alpha", 0L, m21019D(), (Interpolator) null, new float[]{0.0f});
        Animator animatorM17991e = lra0.m17991e((x0m) j760Var.b, 0, m21019D(), null, 0, iD);
        Animator animator = animatorJ2;
        Animator animatorP6 = bt0.p(((x0m) j760Var.b).y1(), "alpha", 0L, m21019D(), (Interpolator) null, new float[]{0.0f});
        Animator animatorP7 = bt0.p(((x0m) j760Var.b).q2(), "alpha", 0L, m21019D(), (Interpolator) null, new float[]{0.0f});
        Animator animatorP8 = bt0.p(pictureViewM21021I.k, "alpha", 0L, j, (Interpolator) null, new float[]{1.0f});
        if (this.f19310c) {
            animatorN = bt0.j(0);
            i2 = 1;
        } else {
            i2 = 1;
            animatorN = bt0.n(pictureViewU0, bt0.i, new float[]{(gVar.c * 1.0f) / gVarI1.c});
        }
        Animator animator2 = animatorN;
        VText vText = pictureViewM21021I.o;
        float[] fArr = new float[i2];
        fArr[0] = 1.0f;
        Animator animatorP9 = bt0.p(vText, "alpha", 0L, j, (Interpolator) null, fArr);
        Animator animatorJ3 = this.f19310c ? bt0.j(0) : bt0.q(pictureViewU0, "translationX", new float[]{gVar.a - gVarI1.a});
        Animator animatorJ4 = this.f19310c ? bt0.j(0) : bt0.q(pictureViewU0, "translationY", new float[]{gVar.b - gVarI1.b});
        Animator animatorJ5 = this.f19310c ? objectAnimator : bt0.j(0);
        if (!this.f19310c) {
            animatorJ = bt0.j(0);
        }
        Animator animatorX = bt0.x(j, new Animator[]{animatorM21037H, animatorM21036G, animatorM21035F, animatorP, animatorP2, animatorP3, animatorP4, animatorP5, animator, animatorM17991e, animatorP6, animatorP7, animatorP8, animator2, animatorP9, animatorJ3, animatorJ4, animatorJ5, animatorJ, bt0.q(((x0m) j760Var.b).o3(), "alpha", new float[]{0.0f}), bt0.q(((x0m) j760Var.b).N3(), "alpha", new float[]{0.0f}), bt0.q(((x0m) j760Var.b).R2(), "translationX", new float[]{gVarI4.a - gVarI5.a}), bt0.q(((x0m) j760Var.b).R2(), "translationY", new float[]{gVarI4.b - gVarI5.b})});
        pictureViewU0.C.setVisibility(8);
        x0m x0mVar = (x0m) j760Var.b;
        Objects.requireNonNull(x0mVar);
        bt0.v(animatorX, new gug0(x0mVar));
        final PictureView pictureView2 = pictureViewU0;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f19311d) {
            bt0.p(((x0m) j760Var.b).Q2(), "alpha", 0L, m21019D() / 2, (Interpolator) null, new float[]{0.0f}).start();
        }
        if (och0.m19663f()) {
            bt0.p(((x0m) j760Var.b).H1(), "alpha", 0L, m21019D() / 2, (Interpolator) null, new float[]{0.0f}).start();
        }
        if (NullChecker.a(((x0m) j760Var.b).C3())) {
            bt0.p(((x0m) j760Var.b).C3(), "alpha", 0L, m21019D() / 2, (Interpolator) null, new float[]{0.0f}).start();
        }
        return bt0.s(new Animator[]{bt0.f(animatorX, new Runnable() { // from class: l.kj20
            @Override // java.lang.Runnable
            public final void run() {
                this.f15726a.m21048T(jElapsedRealtime, j760Var, media, pictureView2);
            }
        }), bt0.j(10)});
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m21023i() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m21027m(j760 j760Var, Act act, int[] iArr) {
        int iY0 = xdl0.y0() - t100.d(60.0f);
        if (fap.y() || u59.U()) {
            int[] iArr2 = new int[2];
            ((x0m) j760Var.b).S1().getLocationOnScreen(iArr2);
            iY0 = ((iArr2[0] + t100.d(38.0f)) * 2) - t100.d(20.0f);
        }
        mep0.b1(((x0m) j760Var.b).p(), ((x0m) j760Var.b).S1(), act.drawable(x2c0.e), act.string(R.string.zk), -1, 14, 17, 3000, 0, 0, 0, 0, iY0, 17, 0, false, new d30() { // from class: l.gj20
            public final void call() {
                qj20.m21023i();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final x0m m21034B(ProfileAct profileAct) {
        return profileAct.Y2();
    }

    /* JADX INFO: renamed from: F */
    public final Animator m21035F(x0m x0mVar, int i, int i2) {
        return fap.y() ? bt0.p(x0mVar.W2(), "translationY", f19307r, i, bt0.f, new float[]{i2}) : bt0.j(0);
    }

    /* JADX INFO: renamed from: G */
    public final Animator m21036G(x0m x0mVar, int i, int i2) {
        Animator animatorJ = bt0.j(0);
        if (NullChecker.a(x0mVar.F())) {
            if (x0mVar.F().getAlpha() < 1.0f) {
                xdl0.M(x0mVar.F(), false);
                return bt0.j(0);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = x0mVar.F().animate();
            if (NullChecker.a(viewPropertyAnimatorAnimate)) {
                viewPropertyAnimatorAnimate.cancel();
            }
        }
        NullChecker.a(x0mVar.F());
        return animatorJ;
    }

    /* JADX INFO: renamed from: H */
    public final Animator m21037H(PictureView pictureView, PictureView pictureView2) {
        Animator animatorJ = bt0.j(0);
        if (!this.f19310c) {
            return animatorJ;
        }
        View videoDisplayView = pictureView.getVideoDisplayView();
        if (!NullChecker.a(videoDisplayView) || !xdl0.O0(videoDisplayView)) {
            return animatorJ;
        }
        pictureView.U();
        long jM21020E = m21020E();
        Interpolator interpolator = bt0.f;
        return bt0.z(new Animator[]{bt0.p(videoDisplayView, "alpha", 0L, jM21020E, interpolator, new float[]{1.0f, 0.0f}), bt0.p(pictureView2.a, "alpha", 0L, m21020E(), interpolator, new float[]{0.0f, 1.0f})});
    }

    /* JADX INFO: renamed from: J */
    public final j760<NewNewProfileCard, x0m> m21038J(ProfileAct profileAct) {
        x0m x0mVarM21034B = m21034B(profileAct);
        if (NullChecker.b(this.f19309b) && NullChecker.a(this.f19309b.mo11522d()) && (this.f19309b.mo11522d() instanceof NewNewProfileCard) && NullChecker.b(x0mVarM21034B) && NullChecker.a(x0mVarM21034B.K2())) {
            return vwb.Y((NewNewProfileCard) this.f19309b.mo11522d(), x0mVarM21034B);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m21039K(NewNewProfileCard newNewProfileCard, Media media) {
        m21040L(newNewProfileCard, media, true);
    }

    /* JADX INFO: renamed from: L */
    public final void m21040L(NewNewProfileCard newNewProfileCard, Media media, boolean z) {
        qib0.G.o(newNewProfileCard.f515T.a);
        if (qp8.b()) {
            xdl0.M0(newNewProfileCard.f472F0, false);
        }
        if (media instanceof Video) {
            newNewProfileCard.f515T.g.setVisibility(4);
            newNewProfileCard.f515T.x(false);
        }
        xdl0.M0(newNewProfileCard.f515T.p, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m21041M(PictureView pictureView, xdl0.g gVar, xdl0.g gVar2, boolean z, float f, float f2, boolean z2, float[] fArr, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = pictureView.a.getLayoutParams();
        int i = gVar.c;
        layoutParams.width = (int) (i + ((gVar2.c - i) * animatedFraction));
        int i2 = gVar.d;
        layoutParams.height = (int) (i2 + ((gVar2.d - i2) * animatedFraction));
        pictureView.a.setLayoutParams(layoutParams);
        float f3 = 1.0f - animatedFraction;
        pictureView.setY((gVar.b - gVar2.b) * f3);
        ViewGroup.LayoutParams layoutParams2 = pictureView.getLayoutParams();
        layoutParams2.height = layoutParams.height;
        pictureView.setLayoutParams(layoutParams2);
        if (z) {
            pictureView.s.setTranslationX(f * f3);
            pictureView.s.setTranslationY(f2 * f3);
        }
        if (z2 && this.f19308a) {
            VFrame_ColorFilter vFrame_ColorFilter = pictureView.g;
            vFrame_ColorFilter.setTranslationY(vFrame_ColorFilter.getTranslationY() * f3 * f3);
        } else if (z2) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) pictureView.g.getLayoutParams();
            layoutParams3.bottomMargin = t100.d(32.0f) - ((int) ((gVar.d - gVar2.d) * f3));
            pictureView.g.setLayoutParams(layoutParams3);
        }
        PointF pointF = new PointF();
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        pictureView.a.getHierarchy().v(pointF);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m21042N(PictureView pictureView, xdl0.g gVar, xdl0.g gVar2, boolean z, float f, float f2, boolean z2, float[] fArr, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = pictureView.a.getLayoutParams();
        int i = gVar.c;
        layoutParams.width = (int) (i + ((gVar2.c - i) * animatedFraction));
        int i2 = gVar.d;
        layoutParams.height = (int) (i2 + ((gVar2.d - i2) * animatedFraction));
        pictureView.a.setLayoutParams(layoutParams);
        if (z) {
            pictureView.s.setTranslationX(f * animatedFraction);
            pictureView.s.setTranslationY(f2 * animatedFraction);
        }
        if (z2 && this.f19308a) {
            pictureView.g.setTranslationY(this.f19314g * animatedFraction * animatedFraction);
        } else if (z2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pictureView.g.getLayoutParams();
            layoutParams2.bottomMargin = t100.d(32.0f) - ((int) ((gVar2.d - gVar.d) * animatedFraction));
            pictureView.g.setLayoutParams(layoutParams2);
        }
        PointF pointF = new PointF();
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        pictureView.a.getHierarchy().v(pointF);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m21043O(j760 j760Var, Media media) {
        m21039K((NewNewProfileCard) j760Var.a, media);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m21044P(final j760 j760Var, Media media, PictureView pictureView, final Act act) {
        m21051X((NewNewProfileCard) j760Var.a, media, pictureView);
        if (NullChecker.a(((x0m) j760Var.b).o3()) && xdl0.O0(((x0m) j760Var.b).o3())) {
            ((x0m) j760Var.b).o3().setAlpha(1.0f);
        }
        if ((media instanceof Video) && xij0.d0() && ((!och0.m19663f() || ((NewNewProfileCard) j760Var.a).f578v2.pictures.size() < 2 || this.f19312e) && (((!upa.u2() && !upa.y2()) || !xdl0.O0(pictureView.s)) && !((NewNewProfileCard) j760Var.a).m25877h()))) {
            pictureView.V();
        }
        User userNa = CoreModule.c.e0.na();
        if (userNa == null || !TEnum.equals(userNa.gender, "male") || !TEnum.equals(((NewNewProfileCard) j760Var.a).f578v2.gender, "female") || ((NewNewProfileCard) j760Var.a).f578v2.popLevel <= 0.675d || !nkp.e() || a.w().N() || a.w().a || !NullChecker.a(((x0m) j760Var.b).S1())) {
            return;
        }
        if (!mqi0.m18535D(((Long) f19299j.get()).longValue())) {
            f19298i.put(0);
            f19299j.put(Long.valueOf(mqi0.m18550o()));
        }
        if (((Integer) f19298i.get()).intValue() >= 3) {
            return;
        }
        tpd0 tpd0Var = f19298i;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        o6j0.h("e_superlike_usage_guide", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        xdl0.Q0(((x0m) j760Var.b).S1(), new e30() { // from class: l.mj20
            public final void call(Object obj) {
                qj20.m21027m(j760Var, act, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m21045Q(final j760 j760Var, final Media media, final PictureView pictureView, final Act act) {
        ((NewNewProfileCard) j760Var.a).post(new Runnable() { // from class: l.lj20
            @Override // java.lang.Runnable
            public final void run() {
                this.f16183a.m21044P(j760Var, media, pictureView, act);
            }
        });
        ((x0m) j760Var.b).o2();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m21046R(j760 j760Var, Media media) {
        m21040L((NewNewProfileCard) j760Var.a, media, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m21047S(j760 j760Var, Media media, PictureView pictureView) {
        m21051X((NewNewProfileCard) j760Var.a, media, pictureView);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m21048T(long j, final j760 j760Var, final Media media, final PictureView pictureView) {
        if (SystemClock.elapsedRealtime() - j < 30) {
            e51.G(new Runnable() { // from class: l.nj20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17494a.m21047S(j760Var, media, pictureView);
                }
            });
        }
        m21051X((NewNewProfileCard) j760Var.a, media, pictureView);
        if (((upa.u2() || upa.y2()) && xdl0.O0(pictureView.s)) || ((NewNewProfileCard) j760Var.a).m25877h()) {
            return;
        }
        m21049U(((NewNewProfileCard) j760Var.a).f515T);
    }

    /* JADX INFO: renamed from: U */
    public final void m21049U(@Nullable final PictureView pictureView) {
        if (NullChecker.b(pictureView) && (pictureView.G instanceof Video) && xij0.d0() && !pictureView.k0 && pictureView.K) {
            pictureView.post(new Runnable() { // from class: l.pj20
                @Override // java.lang.Runnable
                public final void run() {
                    pictureView.V();
                }
            });
        }
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void m21056h(Act act, ProfileAct profileAct) {
        int i;
        j760<NewNewProfileCard, x0m> j760VarM21038J = m21038J(profileAct);
        if (NullChecker.a(j760VarM21038J) && NullChecker.a(j760VarM21038J.a) && NullChecker.a(j760VarM21038J.b)) {
            Object obj = j760VarM21038J.a;
            if (((NewNewProfileCard) obj).f534a2 && NullChecker.a(((NewNewProfileCard) obj).f578v2)) {
                Object obj2 = j760VarM21038J.b;
                if (obj2 instanceof ProfileListFrag) {
                    ((ProfileListFrag) obj2).t2 = (Media) ((NewNewProfileCard) j760VarM21038J.a).f578v2.pictures.get(0);
                }
            }
            Object obj3 = j760VarM21038J.a;
            Media media = ((NewNewProfileCard) obj3).f515T.G;
            if (!NullChecker.a(((NewNewProfileCard) obj3).f578v2)) {
                i = 0;
                break;
            }
            i = 0;
            while (true) {
                if (i >= ((NewNewProfileCard) j760VarM21038J.a).f578v2.pictures.size()) {
                    i = 0;
                    break;
                } else if (TextUtils.equals(((Media) ((NewNewProfileCard) j760VarM21038J.a).f578v2.pictures.get(i)).url, media.url)) {
                    break;
                } else {
                    i++;
                }
            }
            ((x0m) j760VarM21038J.b).m2(i, false);
            ((x0m) j760VarM21038J.b).V0(true);
            ((x0m) j760VarM21038J.b).y3(new j760(Integer.valueOf(((NewNewProfileCard) j760VarM21038J.a).f515T.getWidth()), Integer.valueOf(((NewNewProfileCard) j760VarM21038J.a).f515T.getHeight())));
            if (xdl0.O0(((NewNewProfileCard) j760VarM21038J.a).f515T.o)) {
                ((x0m) j760VarM21038J.b).u3(((NewNewProfileCard) j760VarM21038J.a).f515T.o.getWidth());
                ((x0m) j760VarM21038J.b).l2(((NewNewProfileCard) j760VarM21038J.a).f482I1);
            }
            ((x0m) j760VarM21038J.b).H0(i);
            if (xdl0.O0(((NewNewProfileCard) j760VarM21038J.a).f515T.m)) {
                ((x0m) j760VarM21038J.b).p1(true);
            }
            if (xdl0.O0(((NewNewProfileCard) j760VarM21038J.a).f515T.n)) {
                ((x0m) j760VarM21038J.b).S2(true);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m21051X(NewNewProfileCard newNewProfileCard, Media media, PictureView pictureView) {
        xdl0.M0(newNewProfileCard.f583y1, false);
        if (NullChecker.a(media)) {
            newNewProfileCard.f515T.Z(media, -1, newNewProfileCard.m25877h());
        }
        if ((media instanceof Video) && !newNewProfileCard.m25877h()) {
            newNewProfileCard.f515T.g.setVisibility(0);
        }
        newNewProfileCard.m916y3(media);
        newNewProfileCard.m822X1();
        if (NullChecker.a(newNewProfileCard.f578v2) && NullChecker.a(newNewProfileCard.f561n2)) {
            xdl0.M0(newNewProfileCard.f545g1, false);
            newNewProfileCard.m871l3(newNewProfileCard.f578v2, 0, newNewProfileCard.f561n2);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m21053b() {
        return false;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public View m21052a(ProfileAct profileAct) {
        x0m x0mVarM21034B = m21034B(profileAct);
        if (NullChecker.b(x0mVarM21034B)) {
            return x0mVarM21034B.p();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final Animator m21058u(x0m x0mVar) {
        if (NullChecker.a(x0mVar.N3()) && xdl0.O0(x0mVar.N3())) {
            bt0.p(x0mVar.N3(), "translationY", m21018C(), m21020E(), bt0.d, new float[]{0.0f});
        }
        return bt0.j(0);
    }

    /* JADX INFO: renamed from: v */
    public final Animator m21059v(x0m x0mVar) {
        return fap.y() ? bt0.p(x0mVar.W2(), "translationY", f19307r, f19305p, bt0.d, new float[]{0.0f}) : bt0.j(0);
    }

    /* JADX INFO: renamed from: w */
    public final ObjectAnimator m21060w(User user, final PictureView pictureView, Media media, final xdl0.g gVar, final xdl0.g gVar2, xdl0.g gVar3, PictureView pictureView2, NewNewProfileCard newNewProfileCard) {
        boolean z;
        if (upa.y2() && xdl0.O0(pictureView.s) && xdl0.O0(pictureView.u)) {
            xdl0.g gVarI0 = xdl0.i0(newNewProfileCard.f583y1);
            xdl0.g gVarI1 = xdl0.i0(pictureView.s);
            pictureView.s.setTranslationX(-gVar.a);
            pictureView.s.setTranslationY((gVarI0.b - gVar.b) - (gVarI1.b - gVar2.b));
            z = true;
        } else {
            z = false;
        }
        final float translationX = pictureView.s.getTranslationX();
        final float translationY = pictureView.s.getTranslationY();
        final float[] fArr = new float[2];
        Media.setFocusPoint(media, fArr);
        pictureView.setY(gVar.b - gVar2.b);
        pictureView.setX(gVar.a);
        final boolean z2 = media instanceof Video;
        if (z2) {
            pictureView.U();
        }
        int iM21017A = m21017A();
        if (this.f19308a) {
            xdl0.K0(pictureView.g, xdl0.i0(pictureView2.g), xdl0.i0(pictureView.g));
            this.f19314g = pictureView.g.getTranslationY();
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.p(pictureView, "translationX", 0L, iM21017A, (Interpolator) null, new float[]{-gVar2.a});
        final boolean z3 = z;
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ij20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14661a.m21041M(pictureView, gVar, gVar2, z3, translationX, translationY, z2, fArr, valueAnimator);
            }
        });
        return objectAnimator;
    }

    /* JADX INFO: renamed from: x */
    public final ObjectAnimator m21061x(User user, final PictureView pictureView, Media media, final xdl0.g gVar, xdl0.g gVar2, xdl0.g gVar3, int i, PictureView pictureView2, NewNewProfileCard newNewProfileCard) {
        xdl0.g gVar4;
        boolean z;
        float f;
        float f2;
        xdl0.i0(pictureView.b);
        final float[] fArr = new float[2];
        Media.setFocusPoint(media, fArr);
        final boolean z2 = media instanceof Video;
        if (z2) {
            pictureView.U();
        }
        if (upa.y2() && xdl0.O0(pictureView.s) && xdl0.O0(pictureView.u)) {
            xdl0.g gVarI0 = xdl0.i0(newNewProfileCard.f583y1);
            xdl0.g gVarI1 = xdl0.i0(pictureView.s);
            float f3 = -gVar.a;
            gVar4 = gVar2;
            f = (gVarI0.b - gVar.b) - (gVarI1.b - gVar4.b);
            z = true;
            f2 = f3;
        } else {
            gVar4 = gVar2;
            z = false;
            f = 0.0f;
            f2 = 0.0f;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.p(pictureView, "translationX", 0L, m21017A(), (Interpolator) null, new float[]{gVar.a});
        final xdl0.g gVar5 = gVar4;
        final float f4 = f;
        final float f5 = f2;
        final boolean z3 = z;
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oj20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18077a.m21042N(pictureView, gVar5, gVar, z3, f5, f4, z2, fArr, valueAnimator);
            }
        });
        return objectAnimator;
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Animator m21054c(final Act act, ProfileAct profileAct) {
        int i;
        float f;
        Animator animatorP;
        View view;
        Animator animatorL;
        final j760<NewNewProfileCard, x0m> j760VarM21038J = m21038J(profileAct);
        ObjectAnimator objectAnimatorM21060w = null;
        if (NullChecker.a(j760VarM21038J)) {
            Object obj = j760VarM21038J.a;
            final Media media = ((NewNewProfileCard) obj).f515T.G;
            if (!NullChecker.a(((NewNewProfileCard) obj).f578v2)) {
                i = 0;
                break;
            }
            i = 0;
            while (true) {
                if (i >= ((NewNewProfileCard) j760VarM21038J.a).f578v2.pictures.size()) {
                    i = 0;
                    break;
                }
                if (TextUtils.equals(((Media) ((NewNewProfileCard) j760VarM21038J.a).f578v2.pictures.get(i)).url, media.url)) {
                    break;
                }
                i++;
            }
            View viewR3 = ((x0m) j760VarM21038J.b).r3(i);
            if (NullChecker.a(viewR3)) {
                ((NewNewProfileCard) j760VarM21038J.a).post(new Runnable() { // from class: l.fj20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13052a.m21043O(j760VarM21038J, media);
                    }
                });
                xdl0.g gVarI0 = xdl0.i0(((NewNewProfileCard) j760VarM21038J.a).f515T);
                xdl0.g gVarI1 = xdl0.i0(viewR3);
                xdl0.g gVarI2 = xdl0.i0(((NewNewProfileCard) j760VarM21038J.a).f515T.b);
                if (this.f19310c) {
                    Object obj2 = j760VarM21038J.a;
                    objectAnimatorM21060w = m21060w(((NewNewProfileCard) obj2).f578v2, viewR3, media, gVarI0, gVarI1, gVarI2, ((NewNewProfileCard) obj2).f515T, (NewNewProfileCard) obj2);
                } else {
                    xdl0.K0(viewR3, gVarI0, gVarI1);
                }
                if (qp8.b()) {
                    xdl0.K0(((x0m) j760VarM21038J.b).R2(), xdl0.i0(((NewNewProfileCard) j760VarM21038J.a).f472F0), xdl0.i0(((x0m) j760VarM21038J.b).R2()));
                }
                if (ogl0.a0()) {
                    ((NewNewProfileCard) j760VarM21038J.a).m831a2();
                }
                xdl0.g gVarI3 = xdl0.i0(((x0m) j760VarM21038J.b).p());
                xdl0.g gVarU = ((x0m) j760VarM21038J.b).U();
                xdl0.a0(viewR3);
                int iD = (gVarI3.d - (gVarU.b - gVarI3.b)) + t100.d(30.0f);
                int i2 = xdl0.i0(((x0m) j760VarM21038J.b).o0()).a;
                Iterator it = ((x0m) j760VarM21038J.b).B1().iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setTranslationY(iD);
                }
                bt0.z(new Animator[]{bt0.p(((x0m) j760VarM21038J.b).S1(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(((x0m) j760VarM21038J.b).F(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(((x0m) j760VarM21038J.b).J(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(((x0m) j760VarM21038J.b).h2(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(((x0m) j760VarM21038J.b).o0(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(((x0m) j760VarM21038J.b).y1(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(((x0m) j760VarM21038J.b).q2(), "alpha", 0L, m21017A(), (Interpolator) null, new float[]{0.0f, 1.0f})}).start();
                ((x0m) j760VarM21038J.b).Q2().setAlpha(0.0f);
                if (och0.m19663f()) {
                    ((x0m) j760VarM21038J.b).H1().setAlpha(0.0f);
                }
                if (NullChecker.a(((x0m) j760VarM21038J.b).C3())) {
                    bt0.p(((x0m) j760VarM21038J.b).C3(), "alpha", 0L, m21019D(), (Interpolator) null, new float[]{0.0f, 1.0f}).start();
                }
                if (fap.y()) {
                    ((x0m) j760VarM21038J.b).W2().setTranslationY(iD);
                }
                PictureView pictureViewM21021I = m21021I(((NewNewProfileCard) j760VarM21038J.a).f515T, viewR3);
                int iM21017A = m21017A();
                if (NullChecker.a(((x0m) j760VarM21038J.b).o3()) && xdl0.O0(((x0m) j760VarM21038J.b).o3())) {
                    ((x0m) j760VarM21038J.b).o3().setAlpha(0.0f);
                }
                if (och0.m19663f()) {
                    f = 0.0f;
                    animatorP = bt0.p(((x0m) j760VarM21038J.b).H1(), "alpha", m21019D(), m21019D() / 2, (Interpolator) null, new float[]{1.0f});
                } else {
                    f = 0.0f;
                    boolean z = this.f19311d;
                    Object obj3 = j760VarM21038J.b;
                    animatorP = z ? bt0.p(((x0m) obj3).Q2(), "alpha", m21019D(), m21019D() / 2, (Interpolator) null, new float[]{1.0f}) : bt0.q(((x0m) obj3).Q2(), "alpha", new float[]{1.0f});
                }
                Animator animator = animatorP;
                View viewS1 = ((x0m) j760VarM21038J.b).S1();
                long jM21018C = m21018C();
                long jM21020E = m21020E();
                Interpolator interpolator = bt0.d;
                Animator animatorP2 = bt0.p(viewS1, "translationY", jM21018C, jM21020E, interpolator, new float[]{f});
                Animator animatorM21059v = m21059v((x0m) j760VarM21038J.b);
                Animator animatorM21058u = m21058u((x0m) j760VarM21038J.b);
                Animator animatorP3 = bt0.p(((x0m) j760VarM21038J.b).S1(), "rotation", m21018C(), m21020E(), interpolator, new float[]{f});
                Animator animatorP4 = bt0.p(((x0m) j760VarM21038J.b).h2(), "translationY", m21018C(), m21020E(), interpolator, new float[]{f});
                ObjectAnimator objectAnimator = objectAnimatorM21060w;
                Animator animatorP5 = bt0.p(((x0m) j760VarM21038J.b).o0(), "translationX", m21018C(), m21020E(), interpolator, new float[]{f});
                Animator animatorP6 = bt0.p(((x0m) j760VarM21038J.b).o0(), "rotation", m21018C(), m21020E(), interpolator, new float[]{f});
                Animator animatorP7 = bt0.p(((x0m) j760VarM21038J.b).J(), "translationX", m21018C(), m21020E(), interpolator, new float[]{f});
                Animator animatorP8 = bt0.p(((x0m) j760VarM21038J.b).J(), "rotation", m21018C(), m21020E(), interpolator, new float[]{f});
                x0m x0mVar = (x0m) j760VarM21038J.b;
                int iM21018C = m21018C();
                Interpolator interpolator2 = bt0.c;
                Animator animatorM17991e = lra0.m17991e(x0mVar, iM21018C, iM21017A, interpolator2, iD, 0);
                long j = iM21017A;
                Animator animatorP9 = bt0.p(((x0m) j760VarM21038J.b).y1(), "translationY", m21018C(), j, interpolator2, new float[]{f});
                Animator animatorP10 = bt0.p(((x0m) j760VarM21038J.b).q2(), "translationY", m21018C(), j, interpolator2, new float[]{f});
                Animator animatorP11 = bt0.p(pictureViewM21021I.k, "alpha", 0L, j, (Interpolator) null, new float[]{f});
                Animator animatorP12 = bt0.p(pictureViewM21021I.o, "alpha", 0L, j, (Interpolator) null, new float[]{f});
                if (this.f19310c) {
                    animatorL = bt0.j(0);
                    view = viewR3;
                } else {
                    view = viewR3;
                    animatorL = bt0.l(view, bt0.i, 0L, j, bt0.a, new float[]{1.0f});
                }
                Animator animatorJ = this.f19310c ? bt0.j(0) : bt0.p(view, "translationX", 0L, j, bt0.a, new float[]{f});
                Animator animatorJ2 = this.f19310c ? bt0.j(0) : bt0.p(view, "translationY", 0L, j, bt0.a, new float[]{f});
                Animator animatorJ3 = this.f19310c ? objectAnimator : bt0.j(0);
                View viewW3 = ((x0m) j760VarM21038J.b).w3();
                Interpolator interpolator3 = bt0.a;
                Animator animatorZ = bt0.z(new Animator[]{animator, animatorP2, animatorM21059v, animatorM21058u, animatorP3, animatorP4, animatorP5, animatorP6, animatorP7, animatorP8, animatorM17991e, animatorP9, animatorP10, animatorP11, animatorP12, animatorL, animatorJ, animatorJ2, animatorJ3, bt0.p(viewW3, "translationX", 0L, j, interpolator3, new float[]{f}), bt0.p(((x0m) j760VarM21038J.b).w3(), "translationY", 0L, j, interpolator3, new float[]{f}), bt0.p(((x0m) j760VarM21038J.b).R2(), "translationX", 0L, j, interpolator3, new float[]{f}), bt0.p(((x0m) j760VarM21038J.b).R2(), "translationY", 0L, j, interpolator3, new float[]{f}), bt0.p(((x0m) j760VarM21038J.b).R2(), "scaleX", 0L, j, interpolator3, new float[]{1.0f}), bt0.p(((x0m) j760VarM21038J.b).R2(), "scaleY", 0L, j, interpolator3, new float[]{1.0f})});
                final View view2 = view;
                Animator animatorF = bt0.f(animatorZ, new Runnable() { // from class: l.hj20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14143a.m21045Q(j760VarM21038J, media, view2, act);
                    }
                });
                ((x0m) j760VarM21038J.b).k3();
                return animatorF;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Animator m21055d(Act act, ProfileAct profileAct) {
        j760<NewNewProfileCard, x0m> j760VarM21038J = m21038J(profileAct);
        if (j760VarM21038J != null && j760VarM21038J.b != null) {
            this.f19313f = true;
            if (NullChecker.a(j760VarM21038J) && NullChecker.a(j760VarM21038J.a)) {
                ((NewNewProfileCard) j760VarM21038J.a).R0(0);
            }
            if (NullChecker.b(j760VarM21038J) && ((x0m) j760VarM21038J.b).W() != null) {
                LinearLayoutManager layoutManager = ((x0m) j760VarM21038J.b).W().getLayoutManager();
                VPager_SquaredRefactor vPager_SquaredRefactorU2 = ((x0m) j760VarM21038J.b).u2();
                if (vPager_SquaredRefactorU2 == null) {
                    return null;
                }
                if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorU2.isAttachedToWindow() && layoutManager.findFirstVisibleItemPosition() == 0) {
                    return m21022W(j760VarM21038J);
                }
                Animator animatorJ = bt0.j(3000);
                int iY0 = (int) (xdl0.y0() / 0.8f);
                int iI3 = ((x0m) j760VarM21038J.b).i3();
                int i = iY0 + iI3;
                int iM21017A = m21017A();
                float f = iM21017A;
                float f2 = (f - ((int) ((iI3 / i) * f))) / f;
                this.f19315h = f2;
                if (f2 <= 0.01f) {
                    this.f19315h = 0.01f;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
                valueAnimatorOfInt.setDuration(iM21017A);
                valueAnimatorOfInt.setInterpolator(null);
                valueAnimatorOfInt.addUpdateListener(new C1147a(i, iY0, j760VarM21038J, animatorJ));
                bt0.v(animatorJ, new dug0(valueAnimatorOfInt));
                return animatorJ;
            }
        }
        return null;
    }
}

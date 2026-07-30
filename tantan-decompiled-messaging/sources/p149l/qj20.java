package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame_ColorFilter;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class qj20 extends Act.AbstractC4304w<Act, ProfileAct> {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static tpd0 f154832i = new tpd0("super_like_bubble_show_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static zpd0 f154833j = new zpd0("super_like_bubble_show_date_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: k */
    public static final int f154834k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f154835l = 360;

    /* JADX INFO: renamed from: m */
    public static final int f154836m = 275;

    /* JADX INFO: renamed from: n */
    public static final int f154837n = 220;

    /* JADX INFO: renamed from: o */
    public static final int f154838o = 150;

    /* JADX INFO: renamed from: p */
    public static final int f154839p = 400;

    /* JADX INFO: renamed from: q */
    public static final int f154840q = 235;

    /* JADX INFO: renamed from: r */
    public static final int f154841r = 15;

    /* JADX INFO: renamed from: b */
    public am4<znl> f154843b;

    /* JADX INFO: renamed from: g */
    public float f154848g;

    /* JADX INFO: renamed from: a */
    public final boolean f154842a = upa.m194761h3();

    /* JADX INFO: renamed from: c */
    public boolean f154844c = true;

    /* JADX INFO: renamed from: d */
    public boolean f154845d = true;

    /* JADX INFO: renamed from: e */
    public boolean f154846e = CoreModule.f17545c.f19639e0.f149294W0.get().booleanValue();

    /* JADX INFO: renamed from: f */
    public boolean f154847f = false;

    /* JADX INFO: renamed from: h */
    public float f154849h = -1.0f;

    /* JADX INFO: renamed from: l.qj20$a */
    public class C19516a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f154850a = false;

        /* JADX INFO: renamed from: b */
        public int f154851b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f154852c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f154853d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f154854e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f154855f;

        public C19516a(int i, int i2, j760 j760Var, Animator animator) {
            this.f154852c = i;
            this.f154853d = i2;
            this.f154854e = j760Var;
            this.f154855f = animator;
            this.f154851b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f154853d;
            RecyclerView recyclerViewMo52195W = ((x0m) this.f154854e.f116565b).mo52195W();
            if (this.f154850a) {
                return;
            }
            recyclerViewMo52195W.scrollBy(0, (-this.f154851b) + iIntValue);
            this.f154851b = iIntValue;
            if (i <= this.f154853d) {
                Animator animatorM174931W = qj20.this.m174931W(this.f154854e);
                Animator animator = this.f154855f;
                Objects.requireNonNull(animator);
                bt0.m103733f(animatorM174931W, new hug0(animator));
                animatorM174931W.start();
                this.f154850a = true;
            }
        }
    }

    public qj20(am4<znl> am4Var) {
        this.f154843b = am4Var;
    }

    /* JADX INFO: renamed from: A */
    private int m174926A() {
        int i = f154836m;
        if (this.f154844c) {
            i = f154837n;
        }
        float f = this.f154849h;
        return f != -1.0f ? (int) (f * i) : i;
    }

    /* JADX INFO: renamed from: C */
    private int m174927C() {
        float f = this.f154849h;
        return f != -1.0f ? (int) (f * f154841r) : f154841r;
    }

    /* JADX INFO: renamed from: D */
    private int m174928D() {
        float f = this.f154849h;
        return f != -1.0f ? (int) (f * f154840q) : f154840q;
    }

    /* JADX INFO: renamed from: E */
    private int m174929E() {
        float f = this.f154849h;
        return f != -1.0f ? (int) (f * f154839p) : f154839p;
    }

    /* JADX INFO: renamed from: I */
    public static PictureView m174930I(PictureView pictureView, PictureView pictureView2) {
        pictureView2.f28083m.setText(pictureView.f28083m.getText());
        pictureView2.f28083m.setVisibility(pictureView.f28083m.getVisibility());
        pictureView2.f28084n.setVisibility(pictureView.f28084n.getVisibility());
        pictureView2.f28085o.setText(pictureView.f28085o.getText());
        pictureView2.f28085o.setVisibility(pictureView.f28085o.getVisibility());
        return pictureView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: W */
    public Animator m174931W(final j760<NewNewProfileCard, x0m> j760Var) {
        int i;
        xdl0.C21104g c21104g;
        ObjectAnimator objectAnimatorM174965x;
        int i2;
        Animator animatorM103741n;
        int iMo52232c0 = j760Var.f116565b.mo52232c0();
        j760Var.f116565b.mo52245e2();
        xdl0.m208403u(j760Var.f116565b.mo52195W());
        if (j760Var.f116565b.mo52340u2() == null) {
            return null;
        }
        xdl0.m208405v(j760Var.f116565b.mo52340u2());
        PictureView pictureViewMo52179U0 = j760Var.f116565b.mo52179U0();
        int iM174926A = m174926A();
        if (pictureViewMo52179U0 == null) {
            CrashHelper.m81296c(new RuntimeException(String.format(Locale.CHINA, "卡片切换动画异常：用户ID：%s, 图片数量：%d, 当前索引：%d", NullChecker.m81303a(j760Var.f116564a.f21800v2) ? j760Var.f116564a.f21800v2.f56011id : "null", Integer.valueOf(NullChecker.m81303a(j760Var.f116564a.f21800v2) ? j760Var.f116564a.f21800v2.pictures.size() : 0), Integer.valueOf(iMo52232c0))));
            return bt0.m103737j(iM174926A);
        }
        if (j760Var.f116564a.f21800v2.pictures.size() <= iMo52232c0) {
            iMo52232c0 = j760Var.f116564a.f21800v2.pictures.size() - 1;
        }
        final Media media = j760Var.f116564a.f21800v2.media(iMo52232c0);
        j760Var.f116564a.m36941v3(media);
        j760Var.f116564a.post(new Runnable() { // from class: l.jj20
            @Override // java.lang.Runnable
            public final void run() {
                this.f118217a.m174955R(j760Var, media);
            }
        });
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(j760Var.f116564a.f21737T);
        xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(pictureViewMo52179U0);
        xdl0.C21104g c21104gM208380i2 = xdl0.m208380i0(j760Var.f116564a.f21737T.f28071b);
        int i3 = c21104gM208380i0.f192419b;
        int i4 = c21104gM208380i1.f192419b;
        Animator animatorM103737j = null;
        int i5 = i3 - i4;
        if (this.f154844c) {
            animatorM103737j = (ObjectAnimator) bt0.m103743p(pictureViewMo52179U0, "translationY", 0L, iM174926A, null, i3 - i4);
            NewNewProfileCard newNewProfileCard = j760Var.f116564a;
            User user = newNewProfileCard.f21800v2;
            PictureView pictureView = newNewProfileCard.f21737T;
            NewNewProfileCard newNewProfileCard2 = newNewProfileCard;
            c21104g = c21104gM208380i0;
            pictureViewMo52179U0 = pictureViewMo52179U0;
            i = iM174926A;
            objectAnimatorM174965x = m174965x(user, pictureViewMo52179U0, media, c21104g, c21104gM208380i1, c21104gM208380i2, i5, pictureView, newNewProfileCard2);
        } else {
            i = iM174926A;
            c21104g = c21104gM208380i0;
            objectAnimatorM174965x = null;
        }
        xdl0.C21104g c21104gM208380i3 = xdl0.m208380i0(j760Var.f116565b.mo51125p());
        xdl0.C21104g c21104gMo52178U = j760Var.f116565b.mo52178U();
        xdl0.C21104g c21104gM208380i4 = xdl0.m208380i0(j760Var.f116564a.f21694F0);
        xdl0.C21104g c21104gM208380i5 = xdl0.m208380i0(j760Var.f116565b.mo52159R2());
        int iM186890d = (c21104gM208380i3.f192421d - (c21104gMo52178U.f192419b - c21104gM208380i3.f192419b)) + t100.m186890d(30.0f);
        int i6 = xdl0.m208380i0(j760Var.f116565b.mo52300o0()).f192418a;
        PictureView pictureViewM174930I = m174930I(j760Var.f116564a.f21737T, pictureViewMo52179U0);
        long j = i;
        Animator animatorM174946H = m174946H(pictureViewMo52179U0, pictureViewM174930I);
        Animator animatorM174945G = m174945G(j760Var.f116565b, i, iM186890d);
        Animator animatorM174944F = m174944F(j760Var.f116565b, i, iM186890d);
        ObjectAnimator objectAnimator = objectAnimatorM174965x;
        Animator animatorM103743p = bt0.m103743p(j760Var.f116565b.mo52054B2(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM103743p2 = bt0.m103743p(j760Var.f116565b.mo52164S1(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM103743p3 = bt0.m103743p(j760Var.f116565b.mo52261h2(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM103743p4 = bt0.m103743p(j760Var.f116565b.mo52300o0(), "alpha", 0L, j, bt0.f77159f, 0.0f);
        Animator animatorM103743p5 = bt0.m103743p(j760Var.f116565b.mo52103J(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM103737j2 = (this.f154845d || och0.m163518f()) ? bt0.m103737j(0) : bt0.m103743p(j760Var.f116565b.mo52151Q2(), "alpha", 0L, m174928D(), null, 0.0f);
        Animator animatorM151146e = lra0.m151146e(j760Var.f116565b, 0, m174928D(), null, 0, iM186890d);
        Animator animator = animatorM103737j2;
        Animator animatorM103743p6 = bt0.m103743p(j760Var.f116565b.mo52365y1(), "alpha", 0L, m174928D(), null, 0.0f);
        Animator animatorM103743p7 = bt0.m103743p(j760Var.f116565b.mo52315q2(), "alpha", 0L, m174928D(), null, 0.0f);
        Animator animatorM103743p8 = bt0.m103743p(pictureViewM174930I.f28080k, "alpha", 0L, j, null, 1.0f);
        if (this.f154844c) {
            animatorM103741n = bt0.m103737j(0);
            i2 = 1;
        } else {
            i2 = 1;
            animatorM103741n = bt0.m103741n(pictureViewMo52179U0, bt0.f77162i, (c21104g.f192420c * 1.0f) / c21104gM208380i1.f192420c);
        }
        Animator animator2 = animatorM103741n;
        VText vText = pictureViewM174930I.f28085o;
        float[] fArr = new float[i2];
        fArr[0] = 1.0f;
        Animator animatorM103743p9 = bt0.m103743p(vText, "alpha", 0L, j, null, fArr);
        Animator animatorM103737j3 = this.f154844c ? bt0.m103737j(0) : bt0.m103744q(pictureViewMo52179U0, "translationX", c21104g.f192418a - c21104gM208380i1.f192418a);
        Animator animatorM103737j4 = this.f154844c ? bt0.m103737j(0) : bt0.m103744q(pictureViewMo52179U0, "translationY", c21104g.f192419b - c21104gM208380i1.f192419b);
        Animator animatorM103737j5 = this.f154844c ? objectAnimator : bt0.m103737j(0);
        if (!this.f154844c) {
            animatorM103737j = bt0.m103737j(0);
        }
        Animator animatorM103751x = bt0.m103751x(j, animatorM174946H, animatorM174945G, animatorM174944F, animatorM103743p, animatorM103743p2, animatorM103743p3, animatorM103743p4, animatorM103743p5, animator, animatorM151146e, animatorM103743p6, animatorM103743p7, animatorM103743p8, animator2, animatorM103743p9, animatorM103737j3, animatorM103737j4, animatorM103737j5, animatorM103737j, bt0.m103744q(j760Var.f116565b.mo52303o3(), "alpha", 0.0f), bt0.m103744q(j760Var.f116565b.mo52131N3(), "alpha", 0.0f), bt0.m103744q(j760Var.f116565b.mo52159R2(), "translationX", c21104gM208380i4.f192418a - c21104gM208380i5.f192418a), bt0.m103744q(j760Var.f116565b.mo52159R2(), "translationY", c21104gM208380i4.f192419b - c21104gM208380i5.f192419b));
        pictureViewMo52179U0.f28034C.setVisibility(8);
        x0m x0mVar = j760Var.f116565b;
        Objects.requireNonNull(x0mVar);
        bt0.m103749v(animatorM103751x, new gug0(x0mVar));
        final PictureView pictureView2 = pictureViewMo52179U0;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f154845d) {
            bt0.m103743p(j760Var.f116565b.mo52151Q2(), "alpha", 0L, m174928D() / 2, null, 0.0f).start();
        }
        if (och0.m163518f()) {
            bt0.m103743p(j760Var.f116565b.mo52089H1(), "alpha", 0L, m174928D() / 2, null, 0.0f).start();
        }
        if (NullChecker.m81303a(j760Var.f116565b.mo52060C3())) {
            bt0.m103743p(j760Var.f116565b.mo52060C3(), "alpha", 0L, m174928D() / 2, null, 0.0f).start();
        }
        return bt0.m103746s(bt0.m103733f(animatorM103751x, new Runnable() { // from class: l.kj20
            @Override // java.lang.Runnable
            public final void run() {
                this.f123423a.m174957T(jElapsedRealtime, j760Var, media, pictureView2);
            }
        }), bt0.m103737j(10));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m174932i() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m174936m(j760 j760Var, Act act, int[] iArr) {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(60.0f);
        if (fap.m120266y() || u59.m191812U()) {
            int[] iArr2 = new int[2];
            ((x0m) j760Var.f116565b).mo52164S1().getLocationOnScreen(iArr2);
            iM208412y0 = ((iArr2[0] + t100.m186890d(38.0f)) * 2) - t100.m186890d(20.0f);
        }
        mep0.m154300b1(((x0m) j760Var.f116565b).mo51125p(), ((x0m) j760Var.f116565b).mo52164S1(), act.drawable(x2c0.f190092e), act.string(R$string.f19129zk), -1, 14, 17, 3000, 0, 0, 0, 0, iM208412y0, 17, 0, false, new d30() { // from class: l.gj20
            @Override // p149l.d30
            public final void call() {
                qj20.m174932i();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final x0m m174943B(ProfileAct profileAct) {
        return profileAct.m50766Y2();
    }

    /* JADX INFO: renamed from: F */
    public final Animator m174944F(x0m x0mVar, int i, int i2) {
        return fap.m120266y() ? bt0.m103743p(x0mVar.mo52196W2(), "translationY", f154841r, i, bt0.f77159f, i2) : bt0.m103737j(0);
    }

    /* JADX INFO: renamed from: G */
    public final Animator m174945G(x0m x0mVar, int i, int i2) {
        Animator animatorM103737j = bt0.m103737j(0);
        if (NullChecker.m81303a(x0mVar.mo52077F())) {
            if (x0mVar.mo52077F().getAlpha() < 1.0f) {
                xdl0.m208344M(x0mVar.mo52077F(), false);
                return bt0.m103737j(0);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = x0mVar.mo52077F().animate();
            if (NullChecker.m81303a(viewPropertyAnimatorAnimate)) {
                viewPropertyAnimatorAnimate.cancel();
            }
        }
        NullChecker.m81303a(x0mVar.mo52077F());
        return animatorM103737j;
    }

    /* JADX INFO: renamed from: H */
    public final Animator m174946H(PictureView pictureView, PictureView pictureView2) {
        Animator animatorM103737j = bt0.m103737j(0);
        if (!this.f154844c) {
            return animatorM103737j;
        }
        View videoDisplayView = pictureView.getVideoDisplayView();
        if (!NullChecker.m81303a(videoDisplayView) || !xdl0.m208349O0(videoDisplayView)) {
            return animatorM103737j;
        }
        pictureView.m43990U();
        long jM174929E = m174929E();
        Interpolator interpolator = bt0.f77159f;
        return bt0.m103753z(bt0.m103743p(videoDisplayView, "alpha", 0L, jM174929E, interpolator, 1.0f, 0.0f), bt0.m103743p(pictureView2.f28070a, "alpha", 0L, m174929E(), interpolator, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: J */
    public final j760<NewNewProfileCard, x0m> m174947J(ProfileAct profileAct) {
        x0m x0mVarM174943B = m174943B(profileAct);
        if (NullChecker.m81304b(this.f154843b) && NullChecker.m81303a(this.f154843b.mo97474d()) && (this.f154843b.mo97474d() instanceof NewNewProfileCard) && NullChecker.m81304b(x0mVarM174943B) && NullChecker.m81303a(x0mVarM174943B.mo51069K2())) {
            return vwb.m200311Y((NewNewProfileCard) this.f154843b.mo97474d(), x0mVarM174943B);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m174948K(NewNewProfileCard newNewProfileCard, Media media) {
        m174949L(newNewProfileCard, media, true);
    }

    /* JADX INFO: renamed from: L */
    public final void m174949L(NewNewProfileCard newNewProfileCard, Media media, boolean z) {
        qib0.f154691G.m184725o(newNewProfileCard.f21737T.f28070a);
        if (qp8.m175817b()) {
            xdl0.m208345M0(newNewProfileCard.f21694F0, false);
        }
        if (media instanceof Video) {
            newNewProfileCard.f21737T.f28076g.setVisibility(4);
            newNewProfileCard.f21737T.m44011x(false);
        }
        xdl0.m208345M0(newNewProfileCard.f21737T.f28086p, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m174950M(PictureView pictureView, xdl0.C21104g c21104g, xdl0.C21104g c21104g2, boolean z, float f, float f2, boolean z2, float[] fArr, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = pictureView.f28070a.getLayoutParams();
        int i = c21104g.f192420c;
        layoutParams.width = (int) (i + ((c21104g2.f192420c - i) * animatedFraction));
        int i2 = c21104g.f192421d;
        layoutParams.height = (int) (i2 + ((c21104g2.f192421d - i2) * animatedFraction));
        pictureView.f28070a.setLayoutParams(layoutParams);
        float f3 = 1.0f - animatedFraction;
        pictureView.setY((c21104g.f192419b - c21104g2.f192419b) * f3);
        ViewGroup.LayoutParams layoutParams2 = pictureView.getLayoutParams();
        layoutParams2.height = layoutParams.height;
        pictureView.setLayoutParams(layoutParams2);
        if (z) {
            pictureView.f28090s.setTranslationX(f * f3);
            pictureView.f28090s.setTranslationY(f2 * f3);
        }
        if (z2 && this.f154842a) {
            VFrame_ColorFilter vFrame_ColorFilter = pictureView.f28076g;
            vFrame_ColorFilter.setTranslationY(vFrame_ColorFilter.getTranslationY() * f3 * f3);
        } else if (z2) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) pictureView.f28076g.getLayoutParams();
            layoutParams3.bottomMargin = t100.m186890d(32.0f) - ((int) ((c21104g.f192421d - c21104g2.f192421d) * f3));
            pictureView.f28076g.setLayoutParams(layoutParams3);
        }
        PointF pointF = new PointF();
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        pictureView.f28070a.getHierarchy().m112075v(pointF);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m174951N(PictureView pictureView, xdl0.C21104g c21104g, xdl0.C21104g c21104g2, boolean z, float f, float f2, boolean z2, float[] fArr, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = pictureView.f28070a.getLayoutParams();
        int i = c21104g.f192420c;
        layoutParams.width = (int) (i + ((c21104g2.f192420c - i) * animatedFraction));
        int i2 = c21104g.f192421d;
        layoutParams.height = (int) (i2 + ((c21104g2.f192421d - i2) * animatedFraction));
        pictureView.f28070a.setLayoutParams(layoutParams);
        if (z) {
            pictureView.f28090s.setTranslationX(f * animatedFraction);
            pictureView.f28090s.setTranslationY(f2 * animatedFraction);
        }
        if (z2 && this.f154842a) {
            pictureView.f28076g.setTranslationY(this.f154848g * animatedFraction * animatedFraction);
        } else if (z2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pictureView.f28076g.getLayoutParams();
            layoutParams2.bottomMargin = t100.m186890d(32.0f) - ((int) ((c21104g2.f192421d - c21104g.f192421d) * animatedFraction));
            pictureView.f28076g.setLayoutParams(layoutParams2);
        }
        PointF pointF = new PointF();
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        pictureView.f28070a.getHierarchy().m112075v(pointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m174952O(j760 j760Var, Media media) {
        m174948K((NewNewProfileCard) j760Var.f116564a, media);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m174953P(final j760 j760Var, Media media, PictureView pictureView, final Act act) {
        m174960X((NewNewProfileCard) j760Var.f116564a, media, pictureView);
        if (NullChecker.m81303a(((x0m) j760Var.f116565b).mo52303o3()) && xdl0.m208349O0(((x0m) j760Var.f116565b).mo52303o3())) {
            ((x0m) j760Var.f116565b).mo52303o3().setAlpha(1.0f);
        }
        if ((media instanceof Video) && xij0.m209661d0() && ((!och0.m163518f() || ((NewNewProfileCard) j760Var.f116564a).f21800v2.pictures.size() < 2 || this.f154846e) && (((!upa.m194825u2() && !upa.m194845y2()) || !xdl0.m208349O0(pictureView.f28090s)) && !((NewNewProfileCard) j760Var.f116564a).m219460h()))) {
            pictureView.m43991V();
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na == null || !TEnum.equals(userM169520na.gender, "male") || !TEnum.equals(((NewNewProfileCard) j760Var.f116564a).f21800v2.gender, "female") || ((NewNewProfileCard) j760Var.f116564a).f21800v2.popLevel <= 0.675d || !nkp.m159986e() || C8455a.m47588w().m47602N() || C8455a.m47588w().f30475a || !NullChecker.m81303a(((x0m) j760Var.f116565b).mo52164S1())) {
            return;
        }
        if (!mqi0.m155929D(f154833j.get().longValue())) {
            f154832i.put(0);
            f154833j.put(Long.valueOf(mqi0.m155944o()));
        }
        if (f154832i.get().intValue() >= 3) {
            return;
        }
        tpd0 tpd0Var = f154832i;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        o6j0.m162864h("e_superlike_usage_guide", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        xdl0.m208353Q0(((x0m) j760Var.f116565b).mo52164S1(), new e30() { // from class: l.mj20
            @Override // p149l.e30
            public final void call(Object obj) {
                qj20.m174936m(j760Var, act, (int[]) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m174954Q(final j760 j760Var, final Media media, final PictureView pictureView, final Act act) {
        ((NewNewProfileCard) j760Var.f116564a).post(new Runnable() { // from class: l.lj20
            @Override // java.lang.Runnable
            public final void run() {
                this.f128278a.m174953P(j760Var, media, pictureView, act);
            }
        });
        ((x0m) j760Var.f116565b).mo52302o2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m174955R(j760 j760Var, Media media) {
        m174949L((NewNewProfileCard) j760Var.f116564a, media, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m174956S(j760 j760Var, Media media, PictureView pictureView) {
        m174960X((NewNewProfileCard) j760Var.f116564a, media, pictureView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m174957T(long j, final j760 j760Var, final Media media, final PictureView pictureView) {
        if (SystemClock.elapsedRealtime() - j < 30) {
            e51.m114742G(new Runnable() { // from class: l.nj20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139173a.m174956S(j760Var, media, pictureView);
                }
            });
        }
        m174960X((NewNewProfileCard) j760Var.f116564a, media, pictureView);
        if (((upa.m194825u2() || upa.m194845y2()) && xdl0.m208349O0(pictureView.f28090s)) || ((NewNewProfileCard) j760Var.f116564a).m219460h()) {
            return;
        }
        m174958U(((NewNewProfileCard) j760Var.f116564a).f21737T);
    }

    /* JADX INFO: renamed from: U */
    public final void m174958U(@Nullable final PictureView pictureView) {
        if (NullChecker.m81304b(pictureView) && (pictureView.f28040G instanceof Video) && xij0.m209661d0() && !pictureView.f28081k0 && pictureView.f28048K) {
            pictureView.post(new Runnable() { // from class: l.pj20
                @Override // java.lang.Runnable
                public final void run() {
                    pictureView.m43991V();
                }
            });
        }
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo20414h(Act act, ProfileAct profileAct) {
        int i;
        j760<NewNewProfileCard, x0m> j760VarM174947J = m174947J(profileAct);
        if (NullChecker.m81303a(j760VarM174947J) && NullChecker.m81303a(j760VarM174947J.f116564a) && NullChecker.m81303a(j760VarM174947J.f116565b)) {
            NewNewProfileCard newNewProfileCard = j760VarM174947J.f116564a;
            if (newNewProfileCard.f21756a2 && NullChecker.m81303a(newNewProfileCard.f21800v2)) {
                x0m x0mVar = j760VarM174947J.f116565b;
                if (x0mVar instanceof ProfileListFrag) {
                    ((ProfileListFrag) x0mVar).f33822t2 = j760VarM174947J.f116564a.f21800v2.pictures.get(0);
                }
            }
            NewNewProfileCard newNewProfileCard2 = j760VarM174947J.f116564a;
            Media media = newNewProfileCard2.f21737T.f28040G;
            if (!NullChecker.m81303a(newNewProfileCard2.f21800v2)) {
                i = 0;
                break;
            }
            i = 0;
            while (true) {
                if (i >= j760VarM174947J.f116564a.f21800v2.pictures.size()) {
                    i = 0;
                    break;
                } else if (TextUtils.equals(j760VarM174947J.f116564a.f21800v2.pictures.get(i).url, media.url)) {
                    break;
                } else {
                    i++;
                }
            }
            j760VarM174947J.f116565b.mo52288m2(i, false);
            j760VarM174947J.f116565b.mo52187V0(true);
            j760VarM174947J.f116565b.mo52367y3(new j760<>(Integer.valueOf(j760VarM174947J.f116564a.f21737T.getWidth()), Integer.valueOf(j760VarM174947J.f116564a.f21737T.getHeight())));
            if (xdl0.m208349O0(j760VarM174947J.f116564a.f21737T.f28085o)) {
                j760VarM174947J.f116565b.mo52341u3(j760VarM174947J.f116564a.f21737T.f28085o.getWidth());
                j760VarM174947J.f116565b.mo52283l2(j760VarM174947J.f116564a.f21704I1);
            }
            j760VarM174947J.f116565b.mo52088H0(i);
            if (xdl0.m208349O0(j760VarM174947J.f116564a.f21737T.f28083m)) {
                j760VarM174947J.f116565b.mo52309p1(true);
            }
            if (xdl0.m208349O0(j760VarM174947J.f116564a.f21737T.f28084n)) {
                j760VarM174947J.f116565b.mo52165S2(true);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m174960X(NewNewProfileCard newNewProfileCard, Media media, PictureView pictureView) {
        xdl0.m208345M0(newNewProfileCard.f21805y1, false);
        if (NullChecker.m81303a(media)) {
            newNewProfileCard.f21737T.m43995Z(media, -1, newNewProfileCard.m219460h());
        }
        if ((media instanceof Video) && !newNewProfileCard.m219460h()) {
            newNewProfileCard.f21737T.f28076g.setVisibility(0);
        }
        newNewProfileCard.m36949y3(media);
        newNewProfileCard.m36862X1();
        if (NullChecker.m81303a(newNewProfileCard.f21800v2) && NullChecker.m81303a(newNewProfileCard.f21783n2)) {
            xdl0.m208345M0(newNewProfileCard.f21767g1, false);
            newNewProfileCard.m36907l3(newNewProfileCard.f21800v2, 0, newNewProfileCard.f21783n2);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: b */
    public boolean mo20408b() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public View mo20422a(ProfileAct profileAct) {
        x0m x0mVarM174943B = m174943B(profileAct);
        if (NullChecker.m81304b(x0mVarM174943B)) {
            return x0mVarM174943B.mo51125p();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final Animator m174962u(x0m x0mVar) {
        if (NullChecker.m81303a(x0mVar.mo52131N3()) && xdl0.m208349O0(x0mVar.mo52131N3())) {
            bt0.m103743p(x0mVar.mo52131N3(), "translationY", m174927C(), m174929E(), bt0.f77157d, 0.0f);
        }
        return bt0.m103737j(0);
    }

    /* JADX INFO: renamed from: v */
    public final Animator m174963v(x0m x0mVar) {
        return fap.m120266y() ? bt0.m103743p(x0mVar.mo52196W2(), "translationY", f154841r, f154839p, bt0.f77157d, 0.0f) : bt0.m103737j(0);
    }

    /* JADX INFO: renamed from: w */
    public final ObjectAnimator m174964w(User user, final PictureView pictureView, Media media, final xdl0.C21104g c21104g, final xdl0.C21104g c21104g2, xdl0.C21104g c21104g3, PictureView pictureView2, NewNewProfileCard newNewProfileCard) {
        boolean z;
        if (upa.m194845y2() && xdl0.m208349O0(pictureView.f28090s) && xdl0.m208349O0(pictureView.f28092u)) {
            xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(newNewProfileCard.f21805y1);
            xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(pictureView.f28090s);
            pictureView.f28090s.setTranslationX(-c21104g.f192418a);
            pictureView.f28090s.setTranslationY((c21104gM208380i0.f192419b - c21104g.f192419b) - (c21104gM208380i1.f192419b - c21104g2.f192419b));
            z = true;
        } else {
            z = false;
        }
        final float translationX = pictureView.f28090s.getTranslationX();
        final float translationY = pictureView.f28090s.getTranslationY();
        final float[] fArr = new float[2];
        Media.setFocusPoint(media, fArr);
        pictureView.setY(c21104g.f192419b - c21104g2.f192419b);
        pictureView.setX(c21104g.f192418a);
        final boolean z2 = media instanceof Video;
        if (z2) {
            pictureView.m43990U();
        }
        int iM174926A = m174926A();
        if (this.f154842a) {
            xdl0.m208341K0(pictureView.f28076g, xdl0.m208380i0(pictureView2.f28076g), xdl0.m208380i0(pictureView.f28076g));
            this.f154848g = pictureView.f28076g.getTranslationY();
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103743p(pictureView, "translationX", 0L, iM174926A, null, -c21104g2.f192418a);
        final boolean z3 = z;
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ij20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f113487a.m174950M(pictureView, c21104g, c21104g2, z3, translationX, translationY, z2, fArr, valueAnimator);
            }
        });
        return objectAnimator;
    }

    /* JADX INFO: renamed from: x */
    public final ObjectAnimator m174965x(User user, final PictureView pictureView, Media media, final xdl0.C21104g c21104g, xdl0.C21104g c21104g2, xdl0.C21104g c21104g3, int i, PictureView pictureView2, NewNewProfileCard newNewProfileCard) {
        xdl0.C21104g c21104g4;
        boolean z;
        float f;
        float f2;
        xdl0.m208380i0(pictureView.f28071b);
        final float[] fArr = new float[2];
        Media.setFocusPoint(media, fArr);
        final boolean z2 = media instanceof Video;
        if (z2) {
            pictureView.m43990U();
        }
        if (upa.m194845y2() && xdl0.m208349O0(pictureView.f28090s) && xdl0.m208349O0(pictureView.f28092u)) {
            xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(newNewProfileCard.f21805y1);
            xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(pictureView.f28090s);
            float f3 = -c21104g.f192418a;
            c21104g4 = c21104g2;
            f = (c21104gM208380i0.f192419b - c21104g.f192419b) - (c21104gM208380i1.f192419b - c21104g4.f192419b);
            z = true;
            f2 = f3;
        } else {
            c21104g4 = c21104g2;
            z = false;
            f = 0.0f;
            f2 = 0.0f;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103743p(pictureView, "translationX", 0L, m174926A(), null, c21104g.f192418a);
        final xdl0.C21104g c21104g5 = c21104g4;
        final float f4 = f;
        final float f5 = f2;
        final boolean z3 = z;
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oj20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f144224a.m174951N(pictureView, c21104g5, c21104g, z3, f5, f4, z2, fArr, valueAnimator);
            }
        });
        return objectAnimator;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(final Act act, ProfileAct profileAct) {
        int i;
        float f;
        Animator animatorM103743p;
        PictureView pictureView;
        Animator animatorM103739l;
        final j760<NewNewProfileCard, x0m> j760VarM174947J = m174947J(profileAct);
        ObjectAnimator objectAnimatorM174964w = null;
        if (NullChecker.m81303a(j760VarM174947J)) {
            NewNewProfileCard newNewProfileCard = j760VarM174947J.f116564a;
            final Media media = newNewProfileCard.f21737T.f28040G;
            if (!NullChecker.m81303a(newNewProfileCard.f21800v2)) {
                i = 0;
                break;
            }
            i = 0;
            while (true) {
                if (i >= j760VarM174947J.f116564a.f21800v2.pictures.size()) {
                    i = 0;
                    break;
                }
                if (TextUtils.equals(j760VarM174947J.f116564a.f21800v2.pictures.get(i).url, media.url)) {
                    break;
                }
                i++;
            }
            PictureView pictureViewMo52322r3 = j760VarM174947J.f116565b.mo52322r3(i);
            if (NullChecker.m81303a(pictureViewMo52322r3)) {
                j760VarM174947J.f116564a.post(new Runnable() { // from class: l.fj20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97750a.m174952O(j760VarM174947J, media);
                    }
                });
                xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(j760VarM174947J.f116564a.f21737T);
                xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(pictureViewMo52322r3);
                xdl0.C21104g c21104gM208380i2 = xdl0.m208380i0(j760VarM174947J.f116564a.f21737T.f28071b);
                if (this.f154844c) {
                    NewNewProfileCard newNewProfileCard2 = j760VarM174947J.f116564a;
                    objectAnimatorM174964w = m174964w(newNewProfileCard2.f21800v2, pictureViewMo52322r3, media, c21104gM208380i0, c21104gM208380i1, c21104gM208380i2, newNewProfileCard2.f21737T, newNewProfileCard2);
                } else {
                    xdl0.m208341K0(pictureViewMo52322r3, c21104gM208380i0, c21104gM208380i1);
                }
                if (qp8.m175817b()) {
                    xdl0.m208341K0(j760VarM174947J.f116565b.mo52159R2(), xdl0.m208380i0(j760VarM174947J.f116564a.f21694F0), xdl0.m208380i0(j760VarM174947J.f116565b.mo52159R2()));
                }
                if (ogl0.m164248a0()) {
                    j760VarM174947J.f116564a.m36870a2();
                }
                xdl0.C21104g c21104gM208380i3 = xdl0.m208380i0(j760VarM174947J.f116565b.mo51125p());
                xdl0.C21104g c21104gMo52178U = j760VarM174947J.f116565b.mo52178U();
                xdl0.m208364a0(pictureViewMo52322r3);
                int iM186890d = (c21104gM208380i3.f192421d - (c21104gMo52178U.f192419b - c21104gM208380i3.f192419b)) + t100.m186890d(30.0f);
                int i2 = xdl0.m208380i0(j760VarM174947J.f116565b.mo52300o0()).f192418a;
                Iterator<View> it = j760VarM174947J.f116565b.mo52053B1().iterator();
                while (it.hasNext()) {
                    it.next().setTranslationY(iM186890d);
                }
                bt0.m103753z(bt0.m103743p(j760VarM174947J.f116565b.mo52164S1(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52077F(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52103J(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52261h2(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52300o0(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52365y1(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52315q2(), "alpha", 0L, m174926A(), null, 0.0f, 1.0f)).start();
                j760VarM174947J.f116565b.mo52151Q2().setAlpha(0.0f);
                if (och0.m163518f()) {
                    j760VarM174947J.f116565b.mo52089H1().setAlpha(0.0f);
                }
                if (NullChecker.m81303a(j760VarM174947J.f116565b.mo52060C3())) {
                    bt0.m103743p(j760VarM174947J.f116565b.mo52060C3(), "alpha", 0L, m174928D(), null, 0.0f, 1.0f).start();
                }
                if (fap.m120266y()) {
                    j760VarM174947J.f116565b.mo52196W2().setTranslationY(iM186890d);
                }
                PictureView pictureViewM174930I = m174930I(j760VarM174947J.f116564a.f21737T, pictureViewMo52322r3);
                int iM174926A = m174926A();
                if (NullChecker.m81303a(j760VarM174947J.f116565b.mo52303o3()) && xdl0.m208349O0(j760VarM174947J.f116565b.mo52303o3())) {
                    j760VarM174947J.f116565b.mo52303o3().setAlpha(0.0f);
                }
                if (och0.m163518f()) {
                    f = 0.0f;
                    animatorM103743p = bt0.m103743p(j760VarM174947J.f116565b.mo52089H1(), "alpha", m174928D(), m174928D() / 2, null, 1.0f);
                } else {
                    f = 0.0f;
                    boolean z = this.f154845d;
                    x0m x0mVar = j760VarM174947J.f116565b;
                    animatorM103743p = z ? bt0.m103743p(x0mVar.mo52151Q2(), "alpha", m174928D(), m174928D() / 2, null, 1.0f) : bt0.m103744q(x0mVar.mo52151Q2(), "alpha", 1.0f);
                }
                Animator animator = animatorM103743p;
                View viewMo52164S1 = j760VarM174947J.f116565b.mo52164S1();
                long jM174927C = m174927C();
                long jM174929E = m174929E();
                Interpolator interpolator = bt0.f77157d;
                Animator animatorM103743p2 = bt0.m103743p(viewMo52164S1, "translationY", jM174927C, jM174929E, interpolator, f);
                Animator animatorM174963v = m174963v(j760VarM174947J.f116565b);
                Animator animatorM174962u = m174962u(j760VarM174947J.f116565b);
                Animator animatorM103743p3 = bt0.m103743p(j760VarM174947J.f116565b.mo52164S1(), BLiveGiftItem.TYPE_ROTATION, m174927C(), m174929E(), interpolator, f);
                Animator animatorM103743p4 = bt0.m103743p(j760VarM174947J.f116565b.mo52261h2(), "translationY", m174927C(), m174929E(), interpolator, f);
                ObjectAnimator objectAnimator = objectAnimatorM174964w;
                Animator animatorM103743p5 = bt0.m103743p(j760VarM174947J.f116565b.mo52300o0(), "translationX", m174927C(), m174929E(), interpolator, f);
                Animator animatorM103743p6 = bt0.m103743p(j760VarM174947J.f116565b.mo52300o0(), BLiveGiftItem.TYPE_ROTATION, m174927C(), m174929E(), interpolator, f);
                Animator animatorM103743p7 = bt0.m103743p(j760VarM174947J.f116565b.mo52103J(), "translationX", m174927C(), m174929E(), interpolator, f);
                Animator animatorM103743p8 = bt0.m103743p(j760VarM174947J.f116565b.mo52103J(), BLiveGiftItem.TYPE_ROTATION, m174927C(), m174929E(), interpolator, f);
                x0m x0mVar2 = j760VarM174947J.f116565b;
                int iM174927C = m174927C();
                Interpolator interpolator2 = bt0.f77156c;
                Animator animatorM151146e = lra0.m151146e(x0mVar2, iM174927C, iM174926A, interpolator2, iM186890d, 0);
                long j = iM174926A;
                Animator animatorM103743p9 = bt0.m103743p(j760VarM174947J.f116565b.mo52365y1(), "translationY", m174927C(), j, interpolator2, f);
                Animator animatorM103743p10 = bt0.m103743p(j760VarM174947J.f116565b.mo52315q2(), "translationY", m174927C(), j, interpolator2, f);
                Animator animatorM103743p11 = bt0.m103743p(pictureViewM174930I.f28080k, "alpha", 0L, j, null, f);
                Animator animatorM103743p12 = bt0.m103743p(pictureViewM174930I.f28085o, "alpha", 0L, j, null, f);
                if (this.f154844c) {
                    animatorM103739l = bt0.m103737j(0);
                    pictureView = pictureViewMo52322r3;
                } else {
                    pictureView = pictureViewMo52322r3;
                    animatorM103739l = bt0.m103739l(pictureView, bt0.f77162i, 0L, j, bt0.f77154a, 1.0f);
                }
                Animator animatorM103737j = this.f154844c ? bt0.m103737j(0) : bt0.m103743p(pictureView, "translationX", 0L, j, bt0.f77154a, f);
                Animator animatorM103737j2 = this.f154844c ? bt0.m103737j(0) : bt0.m103743p(pictureView, "translationY", 0L, j, bt0.f77154a, f);
                Animator animatorM103737j3 = this.f154844c ? objectAnimator : bt0.m103737j(0);
                View viewMo52354w3 = j760VarM174947J.f116565b.mo52354w3();
                Interpolator interpolator3 = bt0.f77154a;
                Animator animatorM103753z = bt0.m103753z(animator, animatorM103743p2, animatorM174963v, animatorM174962u, animatorM103743p3, animatorM103743p4, animatorM103743p5, animatorM103743p6, animatorM103743p7, animatorM103743p8, animatorM151146e, animatorM103743p9, animatorM103743p10, animatorM103743p11, animatorM103743p12, animatorM103739l, animatorM103737j, animatorM103737j2, animatorM103737j3, bt0.m103743p(viewMo52354w3, "translationX", 0L, j, interpolator3, f), bt0.m103743p(j760VarM174947J.f116565b.mo52354w3(), "translationY", 0L, j, interpolator3, f), bt0.m103743p(j760VarM174947J.f116565b.mo52159R2(), "translationX", 0L, j, interpolator3, f), bt0.m103743p(j760VarM174947J.f116565b.mo52159R2(), "translationY", 0L, j, interpolator3, f), bt0.m103743p(j760VarM174947J.f116565b.mo52159R2(), "scaleX", 0L, j, interpolator3, 1.0f), bt0.m103743p(j760VarM174947J.f116565b.mo52159R2(), "scaleY", 0L, j, interpolator3, 1.0f));
                final PictureView pictureView2 = pictureView;
                Animator animatorM103733f = bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.hj20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f108024a.m174954Q(j760VarM174947J, media, pictureView2, act);
                    }
                });
                j760VarM174947J.f116565b.mo52277k3();
                return animatorM103733f;
            }
        }
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(Act act, ProfileAct profileAct) {
        j760<NewNewProfileCard, x0m> j760VarM174947J = m174947J(profileAct);
        if (j760VarM174947J != null && j760VarM174947J.f116565b != null) {
            this.f154847f = true;
            if (NullChecker.m81303a(j760VarM174947J) && NullChecker.m81303a(j760VarM174947J.f116564a)) {
                j760VarM174947J.f116564a.m35151R0(0);
            }
            if (NullChecker.m81304b(j760VarM174947J) && j760VarM174947J.f116565b.mo52195W() != null) {
                RecyclerView.AbstractC0577o layoutManager = j760VarM174947J.f116565b.mo52195W().getLayoutManager();
                VPager_SquaredRefactor vPager_SquaredRefactorMo52340u2 = j760VarM174947J.f116565b.mo52340u2();
                if (vPager_SquaredRefactorMo52340u2 == null) {
                    return null;
                }
                if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo52340u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
                    return m174931W(j760VarM174947J);
                }
                Animator animatorM103737j = bt0.m103737j(3000);
                int iM208412y0 = (int) (xdl0.m208412y0() / 0.8f);
                int iMo51111i3 = j760VarM174947J.f116565b.mo51111i3();
                int i = iM208412y0 + iMo51111i3;
                int iM174926A = m174926A();
                float f = iM174926A;
                float f2 = (f - ((int) ((iMo51111i3 / i) * f))) / f;
                this.f154849h = f2;
                if (f2 <= 0.01f) {
                    this.f154849h = 0.01f;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
                valueAnimatorOfInt.setDuration(iM174926A);
                valueAnimatorOfInt.setInterpolator(null);
                valueAnimatorOfInt.addUpdateListener(new C19516a(i, iM208412y0, j760VarM174947J, animatorM103737j));
                bt0.m103749v(animatorM103737j, new dug0(valueAnimatorOfInt));
                return animatorM103737j;
            }
        }
        return null;
    }
}

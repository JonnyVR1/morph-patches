package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame_ColorFilter;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class as20 extends Act.AbstractC4455w<Act, ProfileAct> {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static vxd0 f73024i = new vxd0("super_like_bubble_show_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public static byd0 f73025j = new byd0("super_like_bubble_show_date_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: k */
    public static final int f73026k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f73027l = 360;

    /* JADX INFO: renamed from: m */
    public static final int f73028m = 275;

    /* JADX INFO: renamed from: n */
    public static final int f73029n = 220;

    /* JADX INFO: renamed from: o */
    public static final int f73030o = 150;

    /* JADX INFO: renamed from: p */
    public static final int f73031p = 400;

    /* JADX INFO: renamed from: q */
    public static final int f73032q = 235;

    /* JADX INFO: renamed from: r */
    public static final int f73033r = 15;

    /* JADX INFO: renamed from: b */
    public zm4<kql> f73035b;

    /* JADX INFO: renamed from: g */
    public float f73040g;

    /* JADX INFO: renamed from: a */
    public final boolean f73034a = gra.m131692h3();

    /* JADX INFO: renamed from: c */
    public boolean f73036c = true;

    /* JADX INFO: renamed from: d */
    public boolean f73037d = true;

    /* JADX INFO: renamed from: e */
    public boolean f73038e = CoreModule.f18264c.f20381e0.f89151W0.get().booleanValue();

    /* JADX INFO: renamed from: f */
    public boolean f73039f = false;

    /* JADX INFO: renamed from: h */
    public float f73041h = -1.0f;

    /* JADX INFO: renamed from: l.as20$a */
    public class C15816a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f73042a = false;

        /* JADX INFO: renamed from: b */
        public int f73043b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f73044c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f73045d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ pf60 f73046e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f73047f;

        public C15816a(int i, int i2, pf60 pf60Var, Animator animator) {
            this.f73044c = i;
            this.f73045d = i2;
            this.f73046e = pf60Var;
            this.f73047f = animator;
            this.f73043b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f73045d;
            RecyclerView recyclerViewMo53378W = ((q3m) this.f73046e.f152157b).mo53378W();
            if (this.f73042a) {
                return;
            }
            recyclerViewMo53378W.scrollBy(0, (-this.f73043b) + iIntValue);
            this.f73043b = iIntValue;
            if (i <= this.f73045d) {
                Animator animatorM99818W = as20.this.m99818W(this.f73046e);
                Animator animator = this.f73047f;
                Objects.requireNonNull(animator);
                gt0.m132160f(animatorM99818W, new p2h0(animator));
                animatorM99818W.start();
                this.f73042a = true;
            }
        }
    }

    public as20(zm4<kql> zm4Var) {
        this.f73035b = zm4Var;
    }

    /* JADX INFO: renamed from: A */
    private int m99813A() {
        int i = f73028m;
        if (this.f73036c) {
            i = f73029n;
        }
        float f = this.f73041h;
        return f != -1.0f ? (int) (f * i) : i;
    }

    /* JADX INFO: renamed from: C */
    private int m99814C() {
        float f = this.f73041h;
        return f != -1.0f ? (int) (f * f73033r) : f73033r;
    }

    /* JADX INFO: renamed from: D */
    private int m99815D() {
        float f = this.f73041h;
        return f != -1.0f ? (int) (f * f73032q) : f73032q;
    }

    /* JADX INFO: renamed from: E */
    private int m99816E() {
        float f = this.f73041h;
        return f != -1.0f ? (int) (f * f73031p) : f73031p;
    }

    /* JADX INFO: renamed from: I */
    public static PictureView m99817I(PictureView pictureView, PictureView pictureView2) {
        pictureView2.f28931m.setText(pictureView.f28931m.getText());
        pictureView2.f28931m.setVisibility(pictureView.f28931m.getVisibility());
        pictureView2.f28932n.setVisibility(pictureView.f28932n.getVisibility());
        pictureView2.f28933o.setText(pictureView.f28933o.getText());
        pictureView2.f28933o.setVisibility(pictureView.f28933o.getVisibility());
        return pictureView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: W */
    public Animator m99818W(final pf60<NewNewProfileCard, q3m> pf60Var) {
        int i;
        bnl0.C16067g c16067g;
        ObjectAnimator objectAnimatorM99852x;
        int i2;
        Animator animatorM132168n;
        int iMo53415c0 = pf60Var.f152157b.mo53415c0();
        pf60Var.f152157b.mo53428e2();
        bnl0.m105583u(pf60Var.f152157b.mo53378W());
        if (pf60Var.f152157b.mo53523u2() == null) {
            return null;
        }
        bnl0.m105585v(pf60Var.f152157b.mo53523u2());
        PictureView pictureViewMo53362U0 = pf60Var.f152157b.mo53362U0();
        int iM99813A = m99813A();
        if (pictureViewMo53362U0 == null) {
            CrashHelper.m82479c(new RuntimeException(String.format(Locale.CHINA, "卡片切换动画异常：用户ID：%s, 图片数量：%d, 当前索引：%d", NullChecker.m82486a(pf60Var.f152156a.f22542v2) ? pf60Var.f152156a.f22542v2.f56859id : "null", Integer.valueOf(NullChecker.m82486a(pf60Var.f152156a.f22542v2) ? pf60Var.f152156a.f22542v2.pictures.size() : 0), Integer.valueOf(iMo53415c0))));
            return gt0.m132164j(iM99813A);
        }
        if (pf60Var.f152156a.f22542v2.pictures.size() <= iMo53415c0) {
            iMo53415c0 = pf60Var.f152156a.f22542v2.pictures.size() - 1;
        }
        final Media media = pf60Var.f152156a.f22542v2.media(iMo53415c0);
        pf60Var.f152156a.m37944v3(media);
        pf60Var.f152156a.post(new Runnable() { // from class: l.tr20
            @Override // java.lang.Runnable
            public final void run() {
                this.f175799a.m99842R(pf60Var, media);
            }
        });
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(pf60Var.f152156a.f22479T);
        bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureViewMo53362U0);
        bnl0.C16067g c16067gM105560i2 = bnl0.m105560i0(pf60Var.f152156a.f22479T.f28919b);
        int i3 = c16067gM105560i0.f77560b;
        int i4 = c16067gM105560i1.f77560b;
        Animator animatorM132164j = null;
        int i5 = i3 - i4;
        if (this.f73036c) {
            animatorM132164j = (ObjectAnimator) gt0.m132170p(pictureViewMo53362U0, "translationY", 0L, iM99813A, null, i3 - i4);
            NewNewProfileCard newNewProfileCard = pf60Var.f152156a;
            User user = newNewProfileCard.f22542v2;
            PictureView pictureView = newNewProfileCard.f22479T;
            NewNewProfileCard newNewProfileCard2 = newNewProfileCard;
            c16067g = c16067gM105560i0;
            pictureViewMo53362U0 = pictureViewMo53362U0;
            i = iM99813A;
            objectAnimatorM99852x = m99852x(user, pictureViewMo53362U0, media, c16067g, c16067gM105560i1, c16067gM105560i2, i5, pictureView, newNewProfileCard2);
        } else {
            i = iM99813A;
            c16067g = c16067gM105560i0;
            objectAnimatorM99852x = null;
        }
        bnl0.C16067g c16067gM105560i3 = bnl0.m105560i0(pf60Var.f152157b.mo52310q());
        bnl0.C16067g c16067gMo53361U = pf60Var.f152157b.mo53361U();
        bnl0.C16067g c16067gM105560i4 = bnl0.m105560i0(pf60Var.f152156a.f22436F0);
        bnl0.C16067g c16067gM105560i5 = bnl0.m105560i0(pf60Var.f152157b.mo53342R2());
        int iM175859d = (c16067gM105560i3.f77562d - (c16067gMo53361U.f77560b - c16067gM105560i3.f77560b)) + qa00.m175859d(30.0f);
        int i6 = bnl0.m105560i0(pf60Var.f152157b.mo53483o0()).f77559a;
        PictureView pictureViewM99817I = m99817I(pf60Var.f152156a.f22479T, pictureViewMo53362U0);
        long j = i;
        Animator animatorM99833H = m99833H(pictureViewMo53362U0, pictureViewM99817I);
        Animator animatorM99832G = m99832G(pf60Var.f152157b, i, iM175859d);
        Animator animatorM99831F = m99831F(pf60Var.f152157b, i, iM175859d);
        ObjectAnimator objectAnimator = objectAnimatorM99852x;
        Animator animatorM132170p = gt0.m132170p(pf60Var.f152157b.mo53237B2(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM132170p2 = gt0.m132170p(pf60Var.f152157b.mo53347S1(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM132170p3 = gt0.m132170p(pf60Var.f152157b.mo53444h2(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(pf60Var.f152157b.mo53483o0(), "alpha", 0L, j, gt0.f106351f, 0.0f);
        Animator animatorM132170p5 = gt0.m132170p(pf60Var.f152157b.mo53286J(), "alpha", 0L, j, null, 0.0f);
        Animator animatorM132164j2 = (this.f73037d || wkh0.m206820f()) ? gt0.m132164j(0) : gt0.m132170p(pf60Var.f152157b.mo53334Q2(), "alpha", 0L, m99815D(), null, 0.0f);
        Animator animatorM174353e = pza0.m174353e(pf60Var.f152157b, 0, m99815D(), null, 0, iM175859d);
        Animator animator = animatorM132164j2;
        Animator animatorM132170p6 = gt0.m132170p(pf60Var.f152157b.mo53548y1(), "alpha", 0L, m99815D(), null, 0.0f);
        Animator animatorM132170p7 = gt0.m132170p(pf60Var.f152157b.mo53498q2(), "alpha", 0L, m99815D(), null, 0.0f);
        Animator animatorM132170p8 = gt0.m132170p(pictureViewM99817I.f28928k, "alpha", 0L, j, null, 1.0f);
        if (this.f73036c) {
            animatorM132168n = gt0.m132164j(0);
            i2 = 1;
        } else {
            i2 = 1;
            animatorM132168n = gt0.m132168n(pictureViewMo53362U0, gt0.f106354i, (c16067g.f77561c * 1.0f) / c16067gM105560i1.f77561c);
        }
        Animator animator2 = animatorM132168n;
        VText vText = pictureViewM99817I.f28933o;
        float[] fArr = new float[i2];
        fArr[0] = 1.0f;
        Animator animatorM132170p9 = gt0.m132170p(vText, "alpha", 0L, j, null, fArr);
        Animator animatorM132164j3 = this.f73036c ? gt0.m132164j(0) : gt0.m132171q(pictureViewMo53362U0, "translationX", c16067g.f77559a - c16067gM105560i1.f77559a);
        Animator animatorM132164j4 = this.f73036c ? gt0.m132164j(0) : gt0.m132171q(pictureViewMo53362U0, "translationY", c16067g.f77560b - c16067gM105560i1.f77560b);
        Animator animatorM132164j5 = this.f73036c ? objectAnimator : gt0.m132164j(0);
        if (!this.f73036c) {
            animatorM132164j = gt0.m132164j(0);
        }
        Animator animatorM132178x = gt0.m132178x(j, animatorM99833H, animatorM99832G, animatorM99831F, animatorM132170p, animatorM132170p2, animatorM132170p3, animatorM132170p4, animatorM132170p5, animator, animatorM174353e, animatorM132170p6, animatorM132170p7, animatorM132170p8, animator2, animatorM132170p9, animatorM132164j3, animatorM132164j4, animatorM132164j5, animatorM132164j, gt0.m132171q(pf60Var.f152157b.mo53486o3(), "alpha", 0.0f), gt0.m132171q(pf60Var.f152157b.mo53314N3(), "alpha", 0.0f), gt0.m132171q(pf60Var.f152157b.mo53342R2(), "translationX", c16067gM105560i4.f77559a - c16067gM105560i5.f77559a), gt0.m132171q(pf60Var.f152157b.mo53342R2(), "translationY", c16067gM105560i4.f77560b - c16067gM105560i5.f77560b));
        pictureViewMo53362U0.f28882C.setVisibility(8);
        q3m q3mVar = pf60Var.f152157b;
        Objects.requireNonNull(q3mVar);
        gt0.m132176v(animatorM132178x, new o2h0(q3mVar));
        final PictureView pictureView2 = pictureViewMo53362U0;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f73037d) {
            gt0.m132170p(pf60Var.f152157b.mo53334Q2(), "alpha", 0L, m99815D() / 2, null, 0.0f).start();
        }
        if (wkh0.m206820f()) {
            gt0.m132170p(pf60Var.f152157b.mo53272H1(), "alpha", 0L, m99815D() / 2, null, 0.0f).start();
        }
        if (NullChecker.m82486a(pf60Var.f152157b.mo53243C3())) {
            gt0.m132170p(pf60Var.f152157b.mo53243C3(), "alpha", 0L, m99815D() / 2, null, 0.0f).start();
        }
        return gt0.m132173s(gt0.m132160f(animatorM132178x, new Runnable() { // from class: l.ur20
            @Override // java.lang.Runnable
            public final void run() {
                this.f180556a.m99844T(jElapsedRealtime, pf60Var, media, pictureView2);
            }
        }), gt0.m132164j(10));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m99819i() {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m99823m(pf60 pf60Var, Act act, int[] iArr) {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(60.0f);
        if (fcp.m125033y() || d79.m114663V()) {
            int[] iArr2 = new int[2];
            ((q3m) pf60Var.f152157b).mo53347S1().getLocationOnScreen(iArr2);
            iM105592y0 = ((iArr2[0] + qa00.m175859d(38.0f)) * 2) - qa00.m175859d(20.0f);
        }
        qnp0.m177259b1(((q3m) pf60Var.f152157b).mo52310q(), ((q3m) pf60Var.f152157b).mo53347S1(), act.drawable(dbc0.f86972f), act.string(R$string.f18947Vk), -1, 14, 17, 3000, 0, 0, 0, 0, iM105592y0, 17, 0, false, new x20() { // from class: l.qr20
            @Override // p153l.x20
            public final void call() {
                as20.m99819i();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final q3m m99830B(ProfileAct profileAct) {
        return profileAct.m51949a3();
    }

    /* JADX INFO: renamed from: F */
    public final Animator m99831F(q3m q3mVar, int i, int i2) {
        return fcp.m125033y() ? gt0.m132170p(q3mVar.mo53379W2(), "translationY", f73033r, i, gt0.f106351f, i2) : gt0.m132164j(0);
    }

    /* JADX INFO: renamed from: G */
    public final Animator m99832G(q3m q3mVar, int i, int i2) {
        Animator animatorM132164j = gt0.m132164j(0);
        if (NullChecker.m82486a(q3mVar.mo53260F())) {
            if (q3mVar.mo53260F().getAlpha() < 1.0f) {
                bnl0.m105524M(q3mVar.mo53260F(), false);
                return gt0.m132164j(0);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = q3mVar.mo53260F().animate();
            if (NullChecker.m82486a(viewPropertyAnimatorAnimate)) {
                viewPropertyAnimatorAnimate.cancel();
            }
        }
        NullChecker.m82486a(q3mVar.mo53260F());
        return animatorM132164j;
    }

    /* JADX INFO: renamed from: H */
    public final Animator m99833H(PictureView pictureView, PictureView pictureView2) {
        Animator animatorM132164j = gt0.m132164j(0);
        if (!this.f73036c) {
            return animatorM132164j;
        }
        View videoDisplayView = pictureView.getVideoDisplayView();
        if (!NullChecker.m82486a(videoDisplayView) || !bnl0.m105529O0(videoDisplayView)) {
            return animatorM132164j;
        }
        pictureView.m45173U();
        long jM99816E = m99816E();
        Interpolator interpolator = gt0.f106351f;
        return gt0.m132180z(gt0.m132170p(videoDisplayView, "alpha", 0L, jM99816E, interpolator, 1.0f, 0.0f), gt0.m132170p(pictureView2.f28918a, "alpha", 0L, m99816E(), interpolator, 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: J */
    public final pf60<NewNewProfileCard, q3m> m99834J(ProfileAct profileAct) {
        q3m q3mVarM99830B = m99830B(profileAct);
        if (NullChecker.m82487b(this.f73035b) && NullChecker.m82486a(this.f73035b.mo199122d()) && (this.f73035b.mo199122d() instanceof NewNewProfileCard) && NullChecker.m82487b(q3mVarM99830B) && NullChecker.m82486a(q3mVarM99830B.mo52252K2())) {
            return jyb.m147494Y((NewNewProfileCard) this.f73035b.mo199122d(), q3mVarM99830B);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m99835K(NewNewProfileCard newNewProfileCard, Media media) {
        m99836L(newNewProfileCard, media, true);
    }

    /* JADX INFO: renamed from: L */
    public final void m99836L(NewNewProfileCard newNewProfileCard, Media media, boolean z) {
        uqb0.f180374G.m98798o(newNewProfileCard.f22479T.f28918a);
        if (vq8.m202358b()) {
            bnl0.m105525M0(newNewProfileCard.f22436F0, false);
        }
        if (media instanceof Video) {
            newNewProfileCard.f22479T.f28924g.setVisibility(4);
            newNewProfileCard.f22479T.m45194x(false);
        }
        bnl0.m105525M0(newNewProfileCard.f22479T.f28934p, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m99837M(PictureView pictureView, bnl0.C16067g c16067g, bnl0.C16067g c16067g2, boolean z, float f, float f2, boolean z2, float[] fArr, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = pictureView.f28918a.getLayoutParams();
        int i = c16067g.f77561c;
        layoutParams.width = (int) (i + ((c16067g2.f77561c - i) * animatedFraction));
        int i2 = c16067g.f77562d;
        layoutParams.height = (int) (i2 + ((c16067g2.f77562d - i2) * animatedFraction));
        pictureView.f28918a.setLayoutParams(layoutParams);
        float f3 = 1.0f - animatedFraction;
        pictureView.setY((c16067g.f77560b - c16067g2.f77560b) * f3);
        ViewGroup.LayoutParams layoutParams2 = pictureView.getLayoutParams();
        layoutParams2.height = layoutParams.height;
        pictureView.setLayoutParams(layoutParams2);
        if (z) {
            pictureView.f28938s.setTranslationX(f * f3);
            pictureView.f28938s.setTranslationY(f2 * f3);
        }
        if (z2 && this.f73034a) {
            VFrame_ColorFilter vFrame_ColorFilter = pictureView.f28924g;
            vFrame_ColorFilter.setTranslationY(vFrame_ColorFilter.getTranslationY() * f3 * f3);
        } else if (z2) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) pictureView.f28924g.getLayoutParams();
            layoutParams3.bottomMargin = qa00.m175859d(32.0f) - ((int) ((c16067g.f77562d - c16067g2.f77562d) * f3));
            pictureView.f28924g.setLayoutParams(layoutParams3);
        }
        PointF pointF = new PointF();
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        pictureView.f28918a.getHierarchy().m207061v(pointF);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m99838N(PictureView pictureView, bnl0.C16067g c16067g, bnl0.C16067g c16067g2, boolean z, float f, float f2, boolean z2, float[] fArr, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = pictureView.f28918a.getLayoutParams();
        int i = c16067g.f77561c;
        layoutParams.width = (int) (i + ((c16067g2.f77561c - i) * animatedFraction));
        int i2 = c16067g.f77562d;
        layoutParams.height = (int) (i2 + ((c16067g2.f77562d - i2) * animatedFraction));
        pictureView.f28918a.setLayoutParams(layoutParams);
        if (z) {
            pictureView.f28938s.setTranslationX(f * animatedFraction);
            pictureView.f28938s.setTranslationY(f2 * animatedFraction);
        }
        if (z2 && this.f73034a) {
            pictureView.f28924g.setTranslationY(this.f73040g * animatedFraction * animatedFraction);
        } else if (z2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pictureView.f28924g.getLayoutParams();
            layoutParams2.bottomMargin = qa00.m175859d(32.0f) - ((int) ((c16067g2.f77562d - c16067g.f77562d) * animatedFraction));
            pictureView.f28924g.setLayoutParams(layoutParams2);
        }
        PointF pointF = new PointF();
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        pictureView.f28918a.getHierarchy().m207061v(pointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m99839O(pf60 pf60Var, Media media) {
        m99835K((NewNewProfileCard) pf60Var.f152156a, media);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m99840P(final pf60 pf60Var, Media media, PictureView pictureView, final Act act) {
        m99847X((NewNewProfileCard) pf60Var.f152156a, media, pictureView);
        if (NullChecker.m82486a(((q3m) pf60Var.f152157b).mo53486o3()) && bnl0.m105529O0(((q3m) pf60Var.f152157b).mo53486o3())) {
            ((q3m) pf60Var.f152157b).mo53486o3().setAlpha(1.0f);
        }
        if ((media instanceof Video) && asj0.m99935d0() && ((!wkh0.m206820f() || ((NewNewProfileCard) pf60Var.f152156a).f22542v2.pictures.size() < 2 || this.f73038e) && (((!gra.m131756u2() && !gra.m131776y2()) || !bnl0.m105529O0(pictureView.f28938s)) && !((NewNewProfileCard) pf60Var.f152156a).m150923h()))) {
            pictureView.m45174V();
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na == null || !TEnum.equals(userM116593na.gender, "male") || !TEnum.equals(((NewNewProfileCard) pf60Var.f152156a).f22542v2.gender, "female") || ((NewNewProfileCard) pf60Var.f152156a).f22542v2.popLevel <= 0.675d || !nmp.m163836e() || C8618a.m48771w().m48785N() || C8618a.m48771w().f31323a || !NullChecker.m82486a(((q3m) pf60Var.f152157b).mo53347S1())) {
            return;
        }
        if (!pzi0.m174439D(f73025j.get().longValue())) {
            f73024i.put(0);
            f73025j.put(Long.valueOf(pzi0.m174454o()));
        }
        if (f73024i.get().intValue() >= 3) {
            return;
        }
        vxd0 vxd0Var = f73024i;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        sfj0.m185601h("e_superlike_usage_guide", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        bnl0.m105533Q0(((q3m) pf60Var.f152157b).mo53347S1(), new y20() { // from class: l.wr20
            @Override // p153l.y20
            public final void call(Object obj) {
                as20.m99823m(pf60Var, act, (int[]) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m99841Q(final pf60 pf60Var, final Media media, final PictureView pictureView, final Act act) {
        ((NewNewProfileCard) pf60Var.f152156a).post(new Runnable() { // from class: l.vr20
            @Override // java.lang.Runnable
            public final void run() {
                this.f185422a.m99840P(pf60Var, media, pictureView, act);
            }
        });
        ((q3m) pf60Var.f152157b).mo53485o2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m99842R(pf60 pf60Var, Media media) {
        m99836L((NewNewProfileCard) pf60Var.f152156a, media, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m99843S(pf60 pf60Var, Media media, PictureView pictureView) {
        m99847X((NewNewProfileCard) pf60Var.f152156a, media, pictureView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m99844T(long j, final pf60 pf60Var, final Media media, final PictureView pictureView) {
        if (SystemClock.elapsedRealtime() - j < 30) {
            l51.m152887G(new Runnable() { // from class: l.xr20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195875a.m99843S(pf60Var, media, pictureView);
                }
            });
        }
        m99847X((NewNewProfileCard) pf60Var.f152156a, media, pictureView);
        if (((gra.m131756u2() || gra.m131776y2()) && bnl0.m105529O0(pictureView.f28938s)) || ((NewNewProfileCard) pf60Var.f152156a).m150923h()) {
            return;
        }
        m99845U(((NewNewProfileCard) pf60Var.f152156a).f22479T);
    }

    /* JADX INFO: renamed from: U */
    public final void m99845U(@Nullable final PictureView pictureView) {
        if (NullChecker.m82487b(pictureView) && (pictureView.f28888G instanceof Video) && asj0.m99935d0() && !pictureView.f28929k0 && pictureView.f28896K) {
            pictureView.post(new Runnable() { // from class: l.zr20
                @Override // java.lang.Runnable
                public final void run() {
                    pictureView.m45174V();
                }
            });
        }
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo21413h(Act act, ProfileAct profileAct) {
        int i;
        pf60<NewNewProfileCard, q3m> pf60VarM99834J = m99834J(profileAct);
        if (NullChecker.m82486a(pf60VarM99834J) && NullChecker.m82486a(pf60VarM99834J.f152156a) && NullChecker.m82486a(pf60VarM99834J.f152157b)) {
            NewNewProfileCard newNewProfileCard = pf60VarM99834J.f152156a;
            if (newNewProfileCard.f22498a2 && NullChecker.m82486a(newNewProfileCard.f22542v2)) {
                q3m q3mVar = pf60VarM99834J.f152157b;
                if (q3mVar instanceof ProfileListFrag) {
                    ((ProfileListFrag) q3mVar).f34670t2 = pf60VarM99834J.f152156a.f22542v2.pictures.get(0);
                }
            }
            NewNewProfileCard newNewProfileCard2 = pf60VarM99834J.f152156a;
            Media media = newNewProfileCard2.f22479T.f28888G;
            if (!NullChecker.m82486a(newNewProfileCard2.f22542v2)) {
                i = 0;
                break;
            }
            i = 0;
            while (true) {
                if (i >= pf60VarM99834J.f152156a.f22542v2.pictures.size()) {
                    i = 0;
                    break;
                } else if (TextUtils.equals(pf60VarM99834J.f152156a.f22542v2.pictures.get(i).url, media.url)) {
                    break;
                } else {
                    i++;
                }
            }
            pf60VarM99834J.f152157b.mo53471m2(i, false);
            pf60VarM99834J.f152157b.mo53370V0(true);
            pf60VarM99834J.f152157b.mo53550y3(new pf60<>(Integer.valueOf(pf60VarM99834J.f152156a.f22479T.getWidth()), Integer.valueOf(pf60VarM99834J.f152156a.f22479T.getHeight())));
            if (bnl0.m105529O0(pf60VarM99834J.f152156a.f22479T.f28933o)) {
                pf60VarM99834J.f152157b.mo53524u3(pf60VarM99834J.f152156a.f22479T.f28933o.getWidth());
                pf60VarM99834J.f152157b.mo53466l2(pf60VarM99834J.f152156a.f22446I1);
            }
            pf60VarM99834J.f152157b.mo53271H0(i);
            if (bnl0.m105529O0(pf60VarM99834J.f152156a.f22479T.f28931m)) {
                pf60VarM99834J.f152157b.mo53492p1(true);
            }
            if (bnl0.m105529O0(pf60VarM99834J.f152156a.f22479T.f28932n)) {
                pf60VarM99834J.f152157b.mo53348S2(true);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m99847X(NewNewProfileCard newNewProfileCard, Media media, PictureView pictureView) {
        bnl0.m105525M0(newNewProfileCard.f22547y1, false);
        if (NullChecker.m82486a(media)) {
            newNewProfileCard.f22479T.m45178Z(media, -1, newNewProfileCard.m150923h());
        }
        if ((media instanceof Video) && !newNewProfileCard.m150923h()) {
            newNewProfileCard.f22479T.f28924g.setVisibility(0);
        }
        newNewProfileCard.m37952y3(media);
        newNewProfileCard.m37865X1();
        if (NullChecker.m82486a(newNewProfileCard.f22542v2) && NullChecker.m82486a(newNewProfileCard.f22525n2)) {
            bnl0.m105525M0(newNewProfileCard.f22509g1, false);
            newNewProfileCard.m37910l3(newNewProfileCard.f22542v2, 0, newNewProfileCard.f22525n2);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: b */
    public boolean mo21407b() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public View mo21421a(ProfileAct profileAct) {
        q3m q3mVarM99830B = m99830B(profileAct);
        if (NullChecker.m82487b(q3mVarM99830B)) {
            return q3mVarM99830B.mo52310q();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final Animator m99849u(q3m q3mVar) {
        if (NullChecker.m82486a(q3mVar.mo53314N3()) && bnl0.m105529O0(q3mVar.mo53314N3())) {
            gt0.m132170p(q3mVar.mo53314N3(), "translationY", m99814C(), m99816E(), gt0.f106349d, 0.0f);
        }
        return gt0.m132164j(0);
    }

    /* JADX INFO: renamed from: v */
    public final Animator m99850v(q3m q3mVar) {
        return fcp.m125033y() ? gt0.m132170p(q3mVar.mo53379W2(), "translationY", f73033r, f73031p, gt0.f106349d, 0.0f) : gt0.m132164j(0);
    }

    /* JADX INFO: renamed from: w */
    public final ObjectAnimator m99851w(User user, final PictureView pictureView, Media media, final bnl0.C16067g c16067g, final bnl0.C16067g c16067g2, bnl0.C16067g c16067g3, PictureView pictureView2, NewNewProfileCard newNewProfileCard) {
        boolean z;
        if (gra.m131776y2() && bnl0.m105529O0(pictureView.f28938s) && bnl0.m105529O0(pictureView.f28940u)) {
            bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(newNewProfileCard.f22547y1);
            bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureView.f28938s);
            pictureView.f28938s.setTranslationX(-c16067g.f77559a);
            pictureView.f28938s.setTranslationY((c16067gM105560i0.f77560b - c16067g.f77560b) - (c16067gM105560i1.f77560b - c16067g2.f77560b));
            z = true;
        } else {
            z = false;
        }
        final float translationX = pictureView.f28938s.getTranslationX();
        final float translationY = pictureView.f28938s.getTranslationY();
        final float[] fArr = new float[2];
        Media.setFocusPoint(media, fArr);
        pictureView.setY(c16067g.f77560b - c16067g2.f77560b);
        pictureView.setX(c16067g.f77559a);
        final boolean z2 = media instanceof Video;
        if (z2) {
            pictureView.m45173U();
        }
        int iM99813A = m99813A();
        if (this.f73034a) {
            bnl0.m105521K0(pictureView.f28924g, bnl0.m105560i0(pictureView2.f28924g), bnl0.m105560i0(pictureView.f28924g));
            this.f73040g = pictureView.f28924g.getTranslationY();
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132170p(pictureView, "translationX", 0L, iM99813A, null, -c16067g2.f77559a);
        final boolean z3 = z;
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sr20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f170294a.m99837M(pictureView, c16067g, c16067g2, z3, translationX, translationY, z2, fArr, valueAnimator);
            }
        });
        return objectAnimator;
    }

    /* JADX INFO: renamed from: x */
    public final ObjectAnimator m99852x(User user, final PictureView pictureView, Media media, final bnl0.C16067g c16067g, bnl0.C16067g c16067g2, bnl0.C16067g c16067g3, int i, PictureView pictureView2, NewNewProfileCard newNewProfileCard) {
        bnl0.C16067g c16067g4;
        boolean z;
        float f;
        float f2;
        bnl0.m105560i0(pictureView.f28919b);
        final float[] fArr = new float[2];
        Media.setFocusPoint(media, fArr);
        final boolean z2 = media instanceof Video;
        if (z2) {
            pictureView.m45173U();
        }
        if (gra.m131776y2() && bnl0.m105529O0(pictureView.f28938s) && bnl0.m105529O0(pictureView.f28940u)) {
            bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(newNewProfileCard.f22547y1);
            bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureView.f28938s);
            float f3 = -c16067g.f77559a;
            c16067g4 = c16067g2;
            f = (c16067gM105560i0.f77560b - c16067g.f77560b) - (c16067gM105560i1.f77560b - c16067g4.f77560b);
            z = true;
            f2 = f3;
        } else {
            c16067g4 = c16067g2;
            z = false;
            f = 0.0f;
            f2 = 0.0f;
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132170p(pictureView, "translationX", 0L, m99813A(), null, c16067g.f77559a);
        final bnl0.C16067g c16067g5 = c16067g4;
        final float f4 = f;
        final float f5 = f2;
        final boolean z3 = z;
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yr20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f201269a.m99838N(pictureView, c16067g5, c16067g, z3, f5, f4, z2, fArr, valueAnimator);
            }
        });
        return objectAnimator;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(final Act act, ProfileAct profileAct) {
        int i;
        float f;
        Animator animatorM132170p;
        PictureView pictureView;
        Animator animatorM132166l;
        final pf60<NewNewProfileCard, q3m> pf60VarM99834J = m99834J(profileAct);
        ObjectAnimator objectAnimatorM99851w = null;
        if (NullChecker.m82486a(pf60VarM99834J)) {
            NewNewProfileCard newNewProfileCard = pf60VarM99834J.f152156a;
            final Media media = newNewProfileCard.f22479T.f28888G;
            if (!NullChecker.m82486a(newNewProfileCard.f22542v2)) {
                i = 0;
                break;
            }
            i = 0;
            while (true) {
                if (i >= pf60VarM99834J.f152156a.f22542v2.pictures.size()) {
                    i = 0;
                    break;
                }
                if (TextUtils.equals(pf60VarM99834J.f152156a.f22542v2.pictures.get(i).url, media.url)) {
                    break;
                }
                i++;
            }
            PictureView pictureViewMo53505r3 = pf60VarM99834J.f152157b.mo53505r3(i);
            if (NullChecker.m82486a(pictureViewMo53505r3)) {
                pf60VarM99834J.f152156a.post(new Runnable() { // from class: l.pr20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f153719a.m99839O(pf60VarM99834J, media);
                    }
                });
                bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(pf60VarM99834J.f152156a.f22479T);
                bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureViewMo53505r3);
                bnl0.C16067g c16067gM105560i2 = bnl0.m105560i0(pf60VarM99834J.f152156a.f22479T.f28919b);
                if (this.f73036c) {
                    NewNewProfileCard newNewProfileCard2 = pf60VarM99834J.f152156a;
                    objectAnimatorM99851w = m99851w(newNewProfileCard2.f22542v2, pictureViewMo53505r3, media, c16067gM105560i0, c16067gM105560i1, c16067gM105560i2, newNewProfileCard2.f22479T, newNewProfileCard2);
                } else {
                    bnl0.m105521K0(pictureViewMo53505r3, c16067gM105560i0, c16067gM105560i1);
                }
                if (vq8.m202358b()) {
                    bnl0.m105521K0(pf60VarM99834J.f152157b.mo53342R2(), bnl0.m105560i0(pf60VarM99834J.f152156a.f22436F0), bnl0.m105560i0(pf60VarM99834J.f152157b.mo53342R2()));
                }
                if (spl0.m187375a0()) {
                    pf60VarM99834J.f152156a.m37873a2();
                }
                bnl0.C16067g c16067gM105560i3 = bnl0.m105560i0(pf60VarM99834J.f152157b.mo52310q());
                bnl0.C16067g c16067gMo53361U = pf60VarM99834J.f152157b.mo53361U();
                bnl0.m105544a0(pictureViewMo53505r3);
                int iM175859d = (c16067gM105560i3.f77562d - (c16067gMo53361U.f77560b - c16067gM105560i3.f77560b)) + qa00.m175859d(30.0f);
                int i2 = bnl0.m105560i0(pf60VarM99834J.f152157b.mo53483o0()).f77559a;
                Iterator<View> it = pf60VarM99834J.f152157b.mo53236B1().iterator();
                while (it.hasNext()) {
                    it.next().setTranslationY(iM175859d);
                }
                gt0.m132180z(gt0.m132170p(pf60VarM99834J.f152157b.mo53347S1(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53260F(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53286J(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53444h2(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53483o0(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53548y1(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53498q2(), "alpha", 0L, m99813A(), null, 0.0f, 1.0f)).start();
                pf60VarM99834J.f152157b.mo53334Q2().setAlpha(0.0f);
                if (wkh0.m206820f()) {
                    pf60VarM99834J.f152157b.mo53272H1().setAlpha(0.0f);
                }
                if (NullChecker.m82486a(pf60VarM99834J.f152157b.mo53243C3())) {
                    gt0.m132170p(pf60VarM99834J.f152157b.mo53243C3(), "alpha", 0L, m99815D(), null, 0.0f, 1.0f).start();
                }
                if (fcp.m125033y()) {
                    pf60VarM99834J.f152157b.mo53379W2().setTranslationY(iM175859d);
                }
                PictureView pictureViewM99817I = m99817I(pf60VarM99834J.f152156a.f22479T, pictureViewMo53505r3);
                int iM99813A = m99813A();
                if (NullChecker.m82486a(pf60VarM99834J.f152157b.mo53486o3()) && bnl0.m105529O0(pf60VarM99834J.f152157b.mo53486o3())) {
                    pf60VarM99834J.f152157b.mo53486o3().setAlpha(0.0f);
                }
                if (wkh0.m206820f()) {
                    f = 0.0f;
                    animatorM132170p = gt0.m132170p(pf60VarM99834J.f152157b.mo53272H1(), "alpha", m99815D(), m99815D() / 2, null, 1.0f);
                } else {
                    f = 0.0f;
                    boolean z = this.f73037d;
                    q3m q3mVar = pf60VarM99834J.f152157b;
                    animatorM132170p = z ? gt0.m132170p(q3mVar.mo53334Q2(), "alpha", m99815D(), m99815D() / 2, null, 1.0f) : gt0.m132171q(q3mVar.mo53334Q2(), "alpha", 1.0f);
                }
                Animator animator = animatorM132170p;
                View viewMo53347S1 = pf60VarM99834J.f152157b.mo53347S1();
                long jM99814C = m99814C();
                long jM99816E = m99816E();
                Interpolator interpolator = gt0.f106349d;
                Animator animatorM132170p2 = gt0.m132170p(viewMo53347S1, "translationY", jM99814C, jM99816E, interpolator, f);
                Animator animatorM99850v = m99850v(pf60VarM99834J.f152157b);
                Animator animatorM99849u = m99849u(pf60VarM99834J.f152157b);
                Animator animatorM132170p3 = gt0.m132170p(pf60VarM99834J.f152157b.mo53347S1(), BLiveGiftItem.TYPE_ROTATION, m99814C(), m99816E(), interpolator, f);
                Animator animatorM132170p4 = gt0.m132170p(pf60VarM99834J.f152157b.mo53444h2(), "translationY", m99814C(), m99816E(), interpolator, f);
                ObjectAnimator objectAnimator = objectAnimatorM99851w;
                Animator animatorM132170p5 = gt0.m132170p(pf60VarM99834J.f152157b.mo53483o0(), "translationX", m99814C(), m99816E(), interpolator, f);
                Animator animatorM132170p6 = gt0.m132170p(pf60VarM99834J.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m99814C(), m99816E(), interpolator, f);
                Animator animatorM132170p7 = gt0.m132170p(pf60VarM99834J.f152157b.mo53286J(), "translationX", m99814C(), m99816E(), interpolator, f);
                Animator animatorM132170p8 = gt0.m132170p(pf60VarM99834J.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m99814C(), m99816E(), interpolator, f);
                q3m q3mVar2 = pf60VarM99834J.f152157b;
                int iM99814C = m99814C();
                Interpolator interpolator2 = gt0.f106348c;
                Animator animatorM174353e = pza0.m174353e(q3mVar2, iM99814C, iM99813A, interpolator2, iM175859d, 0);
                long j = iM99813A;
                Animator animatorM132170p9 = gt0.m132170p(pf60VarM99834J.f152157b.mo53548y1(), "translationY", m99814C(), j, interpolator2, f);
                Animator animatorM132170p10 = gt0.m132170p(pf60VarM99834J.f152157b.mo53498q2(), "translationY", m99814C(), j, interpolator2, f);
                Animator animatorM132170p11 = gt0.m132170p(pictureViewM99817I.f28928k, "alpha", 0L, j, null, f);
                Animator animatorM132170p12 = gt0.m132170p(pictureViewM99817I.f28933o, "alpha", 0L, j, null, f);
                if (this.f73036c) {
                    animatorM132166l = gt0.m132164j(0);
                    pictureView = pictureViewMo53505r3;
                } else {
                    pictureView = pictureViewMo53505r3;
                    animatorM132166l = gt0.m132166l(pictureView, gt0.f106354i, 0L, j, gt0.f106346a, 1.0f);
                }
                Animator animatorM132164j = this.f73036c ? gt0.m132164j(0) : gt0.m132170p(pictureView, "translationX", 0L, j, gt0.f106346a, f);
                Animator animatorM132164j2 = this.f73036c ? gt0.m132164j(0) : gt0.m132170p(pictureView, "translationY", 0L, j, gt0.f106346a, f);
                Animator animatorM132164j3 = this.f73036c ? objectAnimator : gt0.m132164j(0);
                View viewMo53537w3 = pf60VarM99834J.f152157b.mo53537w3();
                Interpolator interpolator3 = gt0.f106346a;
                Animator animatorM132180z = gt0.m132180z(animator, animatorM132170p2, animatorM99850v, animatorM99849u, animatorM132170p3, animatorM132170p4, animatorM132170p5, animatorM132170p6, animatorM132170p7, animatorM132170p8, animatorM174353e, animatorM132170p9, animatorM132170p10, animatorM132170p11, animatorM132170p12, animatorM132166l, animatorM132164j, animatorM132164j2, animatorM132164j3, gt0.m132170p(viewMo53537w3, "translationX", 0L, j, interpolator3, f), gt0.m132170p(pf60VarM99834J.f152157b.mo53537w3(), "translationY", 0L, j, interpolator3, f), gt0.m132170p(pf60VarM99834J.f152157b.mo53342R2(), "translationX", 0L, j, interpolator3, f), gt0.m132170p(pf60VarM99834J.f152157b.mo53342R2(), "translationY", 0L, j, interpolator3, f), gt0.m132170p(pf60VarM99834J.f152157b.mo53342R2(), "scaleX", 0L, j, interpolator3, 1.0f), gt0.m132170p(pf60VarM99834J.f152157b.mo53342R2(), "scaleY", 0L, j, interpolator3, 1.0f));
                final PictureView pictureView2 = pictureView;
                Animator animatorM132160f = gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.rr20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f164538a.m99841Q(pf60VarM99834J, media, pictureView2, act);
                    }
                });
                pf60VarM99834J.f152157b.mo53460k3();
                return animatorM132160f;
            }
        }
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(Act act, ProfileAct profileAct) {
        pf60<NewNewProfileCard, q3m> pf60VarM99834J = m99834J(profileAct);
        if (pf60VarM99834J != null && pf60VarM99834J.f152157b != null) {
            this.f73039f = true;
            if (NullChecker.m82486a(pf60VarM99834J) && NullChecker.m82486a(pf60VarM99834J.f152156a)) {
                pf60VarM99834J.f152156a.m36154R0(0);
            }
            if (NullChecker.m82487b(pf60VarM99834J) && pf60VarM99834J.f152157b.mo53378W() != null) {
                RecyclerView.AbstractC0579o layoutManager = pf60VarM99834J.f152157b.mo53378W().getLayoutManager();
                VPager_SquaredRefactor vPager_SquaredRefactorMo53523u2 = pf60VarM99834J.f152157b.mo53523u2();
                if (vPager_SquaredRefactorMo53523u2 == null) {
                    return null;
                }
                if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo53523u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
                    return m99818W(pf60VarM99834J);
                }
                Animator animatorM132164j = gt0.m132164j(3000);
                int iM105592y0 = (int) (bnl0.m105592y0() / 0.8f);
                int iMo52294i3 = pf60VarM99834J.f152157b.mo52294i3();
                int i = iM105592y0 + iMo52294i3;
                int iM99813A = m99813A();
                float f = iM99813A;
                float f2 = (f - ((int) ((iMo52294i3 / i) * f))) / f;
                this.f73041h = f2;
                if (f2 <= 0.01f) {
                    this.f73041h = 0.01f;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
                valueAnimatorOfInt.setDuration(iM99813A);
                valueAnimatorOfInt.setInterpolator(null);
                valueAnimatorOfInt.addUpdateListener(new C15816a(i, iM105592y0, pf60VarM99834J, animatorM132164j));
                gt0.m132176v(animatorM132164j, new l2h0(valueAnimatorOfInt));
                return animatorM132164j;
            }
        }
        return null;
    }
}

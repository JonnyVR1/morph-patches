package p009l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.f6c0;
import l.h30;
import l.hm7;
import l.j760;
import l.jig;
import l.mkf;
import l.qib0;
import l.s7m;
import l.soe;
import l.t100;
import l.upa;
import l.ura;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.zvf0;
import v.VEditText;
import v.VFrame;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lkf implements s7m<wjf> {

    /* JADX INFO: renamed from: A */
    public xdl0.g f16205A;

    /* JADX INFO: renamed from: B */
    public xdl0.g f16206B;

    /* JADX INFO: renamed from: C */
    public int f16207C;

    /* JADX INFO: renamed from: D */
    public int f16208D;

    /* JADX INFO: renamed from: E */
    public int f16209E;

    /* JADX INFO: renamed from: F */
    public int f16210F;

    /* JADX INFO: renamed from: G */
    public int f16211G;

    /* JADX INFO: renamed from: H */
    public PopupWindow f16212H;

    /* JADX INFO: renamed from: a */
    public VFrame f16213a;

    /* JADX INFO: renamed from: b */
    public VLinear f16214b;

    /* JADX INFO: renamed from: c */
    public VLinear_FillerMeasure f16215c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f16216d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f16217e;

    /* JADX INFO: renamed from: f */
    public VLinear f16218f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f16219g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f16220h;

    /* JADX INFO: renamed from: i */
    public VFrame f16221i;

    /* JADX INFO: renamed from: j */
    public VLinear f16222j;

    /* JADX INFO: renamed from: k */
    public VText f16223k;

    /* JADX INFO: renamed from: l */
    public ProfileLikeRemainingSwitcherView f16224l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f16225m;

    /* JADX INFO: renamed from: n */
    public VFrame f16226n;

    /* JADX INFO: renamed from: o */
    public VLinear f16227o;

    /* JADX INFO: renamed from: p */
    public VEditText f16228p;

    /* JADX INFO: renamed from: q */
    public VText_Bold f16229q;

    /* JADX INFO: renamed from: r */
    public ExpandProfileLikeAct f16230r;

    /* JADX INFO: renamed from: s */
    public wjf f16231s;

    /* JADX INFO: renamed from: v */
    public User f16234v;

    /* JADX INFO: renamed from: y */
    public ymf f16237y;

    /* JADX INFO: renamed from: t */
    public boolean f16232t = true;

    /* JADX INFO: renamed from: u */
    public boolean f16233u = false;

    /* JADX INFO: renamed from: w */
    public Interpolator f16235w = new jig();

    /* JADX INFO: renamed from: x */
    public boolean f16236x = false;

    /* JADX INFO: renamed from: z */
    public String f16238z = "";

    /* JADX INFO: renamed from: l.lkf$a */
    public class RunnableC1016a implements Runnable {
        public RunnableC1016a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.M(lkf.this.f16228p, true);
            bt0.p(lkf.this.f16228p, "alpha", 0L, 30L, (Interpolator) null, new float[]{0.0f, 1.0f}).start();
        }
    }

    /* JADX INFO: renamed from: l.lkf$b */
    public class RunnableC1017b implements Runnable {
        public RunnableC1017b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bt0.p(lkf.this.f16223k, "alpha", 0L, 30L, (Interpolator) null, new float[]{0.0f, 1.0f}).start();
        }
    }

    /* JADX INFO: renamed from: l.lkf$d */
    public class C1019d extends WindowInsetsAnimation.Callback {
        public C1019d(int i) {
            super(i);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super.onEnd(windowInsetsAnimation);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            xdl0.i0(lkf.this.f16223k);
            super.onPrepare(windowInsetsAnimation);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        @NonNull
        public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
            return null;
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        @NonNull
        public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
            return super.onStart(windowInsetsAnimation, bounds);
        }
    }

    /* JADX INFO: renamed from: l.lkf$e */
    public static /* synthetic */ class C1020e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16243a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f16243a = iArr;
            try {
                iArr[HomeCardExpandedType.ABOUT_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16243a[HomeCardExpandedType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16243a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16243a[HomeCardExpandedType.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public lkf(ExpandProfileLikeAct expandProfileLikeAct) {
        this.f16230r = expandProfileLikeAct;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m17902J(@NonNull Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).getContext().getPackageName();
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m17903Q(View view) {
        this.f16230r.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m17904R(View view) {
        this.f16230r.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m17905S(View view) {
        m17952z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m17906U(View view) {
        xdl0.M0(this.f16227o, false);
        this.f16228p.requestFocus();
        this.f16230r.showInput(this.f16228p, 0);
    }

    /* JADX INFO: renamed from: A */
    public void m17923A() {
        this.f16230r.hideInput(this.f16228p);
    }

    /* JADX INFO: renamed from: B */
    public void m17924B() {
        if (NullChecker.a(this.f16212H) && this.f16212H.isShowing()) {
            this.f16212H.dismiss();
            this.f16212H = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m17925C() {
        boolean z;
        if (this.f16233u) {
            this.f16233u = false;
            final GradientDrawable gradientDrawable = (GradientDrawable) this.f16227o.getBackground();
            final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            Interpolator interpolator = bt0.b;
            duration.setInterpolator(interpolator);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kkf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f15747a.m17933L(duration, gradientDrawable, valueAnimator);
                }
            });
            bt0.v(duration, new Runnable() { // from class: l.yjf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23107a.m17934M();
                }
            });
            boolean zM17931I = m17931I();
            VText_Bold vText_Bold = this.f16229q;
            if (zM17931I) {
                z = true;
                bt0.f(bt0.x(200L, new Animator[]{duration, bt0.p(vText_Bold, "alpha", 0L, 200L, interpolator, new float[]{1.0f, 0.0f}), bt0.p(this.f16224l, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(this.f16225m, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(this.f16219g, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(this.f16220h, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.q(this.f16214b, "translationY", new float[]{0.0f}).setDuration(200L)}), new Runnable() { // from class: l.zjf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23710a.m17935N();
                    }
                }).start();
                bt0.f(bt0.p(this.f16228p, "alpha", 0L, 30L, (Interpolator) null, new float[]{1.0f, 0.0f}), new RunnableC1017b()).start();
            } else {
                z = true;
                bt0.f(bt0.x(200L, new Animator[]{duration, bt0.p(vText_Bold, "alpha", 0L, 200L, interpolator, new float[]{1.0f, 0.0f}), bt0.p(this.f16224l, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(this.f16223k, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.p(this.f16225m, "alpha", 0L, 60L, (Interpolator) null, new float[]{0.0f, 1.0f}), bt0.q(this.f16214b, "translationY", new float[]{0.0f}).setDuration(200L)}), new Runnable() { // from class: l.akf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9557a.m17936O();
                    }
                }).start();
            }
            xdl0.M(this.f16224l, z);
            xdl0.M(this.f16223k, z);
            xdl0.M(this.f16225m, z);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17926C0() {
        return this.f16230r;
    }

    /* JADX INFO: renamed from: E */
    public final void m17927E(String str) {
        int i = C1020e.f16243a[HomeCardExpandedType.getTypeByAlias(str).ordinal()];
        if (i == 1) {
            this.f16237y = new mjf();
        } else if (i == 2) {
            this.f16237y = new rkf();
        } else if (i == 3) {
            this.f16237y = new pkf();
        } else if (i != 4) {
            this.f16230r.finish();
        } else {
            this.f16237y = new nkf();
        }
        this.f16237y.mo18510e(this.f16221i);
    }

    /* JADX INFO: renamed from: F */
    public final void m17928F() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16227o.setWindowInsetsAnimationCallback(new C1019d(0));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m17929G() {
        int iD;
        int i;
        int iZ0 = (int) (((double) xdl0.z0(this.f16230r)) * 0.7866666666666666d);
        if (iZ0 > t100.d(400.0f)) {
            iZ0 = t100.d(400.0f);
        }
        int iZ1 = (xdl0.z0(this.f16230r) - iZ0) / 2;
        this.f16211G = iZ0;
        xdl0.C0(this.f16221i, iZ0);
        xdl0.V(this.f16215c, iZ1);
        xdl0.W(this.f16215c, iZ1);
        xdl0.V(this.f16223k, iZ1);
        xdl0.W(this.f16223k, iZ1);
        xdl0.V(this.f16224l, iZ1);
        xdl0.W(this.f16224l, iZ1);
        ymf ymfVar = this.f16237y;
        if (ymfVar != null) {
            ymfVar.mo18507b(this.f16211G);
        }
        if (m17931I()) {
            iD = t100.d(340.0f);
            i = this.f16211G;
        } else {
            iD = t100.d(300.0f);
            i = this.f16211G;
        }
        int iX0 = ((xdl0.x0(this.f16230r) - (iD + i)) - xdl0.I(this.f16230r)) / 2;
        this.f16210F = iX0;
        xdl0.X(this.f16214b, iX0);
    }

    /* JADX INFO: renamed from: H */
    public void m17930H(String str, CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f16234v = user;
        m17927E(str);
        m17929G();
        if (user == null) {
            return;
        }
        boolean zM17931I = m17931I();
        VLinear_FillerMeasure vLinear_FillerMeasure = this.f16215c;
        if (zM17931I) {
            xdl0.M(vLinear_FillerMeasure, false);
            xdl0.M(this.f16218f, true);
            this.f16219g.setTypeface(Typeface.DEFAULT_BOLD);
            User userPa = CoreModule.c.e0.Pa(userInfo.id);
            String strConcat = userPa.name;
            if (strConcat.length() > 4) {
                strConcat = userPa.name.substring(0, 4).concat("...");
            }
            this.f16223k.setMaxLines(2);
            this.f16223k.setLineSpacing(0.0f, 1.15f);
            this.f16219g.setText("给 " + strConcat + " 留言");
            this.f16220h.setText("让你的喜欢脱颖而出，更容易配对");
            if (!TextUtils.isEmpty(this.f16230r.f5298k)) {
                this.f16223k.setText(this.f16230r.f5298k);
                this.f16228p.setText(this.f16230r.f5298k);
                String str2 = this.f16230r.f5298k;
                this.f16238z = str2;
                m17945b0(str2);
            }
            this.f16224l.setCurrentText(String.format("发送并喜欢%s", user.getPronoun()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.format("发送并喜欢%s", this.f16234v.getPronoun()));
            this.f16224l.setAnimateDirection(false);
            this.f16224l.m7486i();
            this.f16224l.setTextList(arrayList);
            this.f16224l.m7485h();
            this.f16223k.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f16228p.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
        } else {
            xdl0.M(vLinear_FillerMeasure, true);
            xdl0.M(this.f16218f, false);
            xdl0.C0(this.f16223k, t100.d(56.0f));
            this.f16223k.setMaxLines(1);
            this.f16216d.setTypeface(Typeface.DEFAULT_BOLD);
            this.f16216d.setText(user.name);
            xdl0.M(this.f16217e, !CoreModule.c.E0.z3(user));
            this.f16217e.setText(String.valueOf(user.age));
            this.f16223k.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f16228p.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f16224l.setCurrentText(String.format("发送称赞并喜欢%s", user.getPronoun()));
            this.f16228p.setText("");
        }
        xdl0.E0(this.f16225m, new View.OnClickListener() { // from class: l.dkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11890a.m17904R(view);
            }
        });
        this.f16230r.setSwipeBackEnable(false);
        this.f16233u = false;
        this.f16228p.addTextChangedListener(new C1018c());
        xdl0.E0(this.f16229q, new View.OnClickListener() { // from class: l.ekf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12593a.m17905S(view);
            }
        });
        this.f16224l.setOnItemClickListener(new ProfileLikeRemainingSwitcherView.InterfaceC0384b() { // from class: l.fkf
            @Override // com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView.InterfaceC0384b
            /* JADX INFO: renamed from: a */
            public final void mo7488a(int i2) {
                this.f13073a.m17938T(i2);
            }
        });
        xdl0.E0(this.f16223k, new View.OnClickListener() { // from class: l.gkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13637a.m17906U(view);
            }
        });
        xdl0.E0(this.f16226n, new View.OnClickListener() { // from class: l.hkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14164a.m17903Q(view);
            }
        });
        ymf ymfVar = this.f16237y;
        if (ymfVar != null) {
            ymfVar.mo18508c(userInfo, user, i);
        }
        m17928F();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m17931I() {
        return TextUtils.equals(this.f16230r.f5292e, "send_game_guidance") || TextUtils.equals(this.f16230r.f5292e, "send_fitness_guidance") || TextUtils.equals(this.f16230r.f5292e, "send_drinking_guidance") || TextUtils.equals(this.f16230r.f5292e, "send_smoking_guidance");
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m17932K(String str) {
        m17944a0(str, !TextUtils.isEmpty(this.f16238z));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m17933L(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = this.f16227o.getLayoutParams();
        xdl0.g gVar = this.f16205A;
        int i = gVar.c;
        xdl0.g gVar2 = this.f16206B;
        float f = 1.0f - animatedFraction;
        layoutParams.width = (int) (i + ((gVar2.c - i) * f));
        int i2 = gVar.d;
        layoutParams.height = (int) (i2 + ((gVar2.d - i2) * f));
        VLinear vLinear = this.f16227o;
        int i3 = this.f16209E;
        vLinear.setTranslationY(-(i3 + ((this.f16208D - i3) * f)));
        this.f16227o.setLayoutParams(layoutParams);
        gradientDrawable.setCornerRadius(t100.i * animatedFraction);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m17934M() {
        ViewGroup.LayoutParams layoutParams = this.f16227o.getLayoutParams();
        xdl0.g gVar = this.f16205A;
        layoutParams.width = gVar.c;
        layoutParams.height = gVar.d;
        this.f16227o.setLayoutParams(layoutParams);
        this.f16227o.setTranslationY(-this.f16208D);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m17935N() {
        xdl0.M(this.f16227o, false);
        xdl0.M(this.f16226n, false);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m17936O() {
        xdl0.M(this.f16227o, false);
        xdl0.M(this.f16226n, false);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m17937P(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m17941X(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m17938T(int i) {
        m17952z();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m17939V(ValueAnimator valueAnimator, int i, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = this.f16227o.getLayoutParams();
        xdl0.g gVar = this.f16205A;
        int i2 = gVar.c;
        xdl0.g gVar2 = this.f16206B;
        layoutParams.width = (int) (i2 + ((gVar2.c - i2) * animatedFraction));
        int i3 = gVar.d;
        layoutParams.height = (int) (i3 + ((gVar2.d - i3) * animatedFraction));
        this.f16227o.setLayoutParams(layoutParams);
        VLinear vLinear = this.f16227o;
        int i4 = this.f16209E;
        vLinear.setTranslationY(-(i4 + ((i - i4) * animatedFraction)));
        gradientDrawable.setCornerRadius(t100.i * (1.0f - animatedFraction));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m17940W() {
        ViewGroup.LayoutParams layoutParams = this.f16227o.getLayoutParams();
        xdl0.g gVar = this.f16205A;
        layoutParams.width = gVar.c;
        layoutParams.height = gVar.d;
        this.f16227o.setLayoutParams(layoutParams);
        this.f16227o.setTranslationY(-this.f16209E);
        xdl0.M0(this.f16227o, true);
    }

    /* JADX INFO: renamed from: X */
    public void m17941X(int i) {
        if (i == 0 && this.f16233u) {
            m17925C();
        } else if (i > 0) {
            m17946c0(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m17942Y(boolean z) {
        if (z && hm7.b() && NullChecker.a(this.f16212H) && !this.f16212H.isShowing()) {
            this.f16212H.setBackgroundDrawable(new ColorDrawable(0));
            this.f16212H.showAtLocation(this.f16230r.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m17943Z(boolean z) {
        zvf0.u("e_send_profile_like", act().pageId(), new j760[]{vwb.Y("have_comment", Boolean.valueOf(z))});
    }

    /* JADX INFO: renamed from: a0 */
    public final void m17944a0(String str, boolean z) {
        if (this.f16236x) {
            return;
        }
        this.f16236x = true;
        ProfileLikeComment profileLikeCommentMo18506a = this.f16237y.mo18506a(z);
        profileLikeCommentMo18506a.comment = str;
        if (!TextUtils.isEmpty(str)) {
            wjf wjfVar = this.f16231s;
            wjfVar.m24287x0(wjfVar.f22163d, profileLikeCommentMo18506a.toJson(), str, z);
        } else if (TextUtils.isEmpty(str) && m17931I()) {
            this.f16231s.m24286u0("");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m17945b0(String str) {
        float fMeasureText = this.f16223k.getPaint().measureText(str);
        float f = this.f16211G;
        VText vText = this.f16223k;
        if (fMeasureText > f) {
            xdl0.C0(vText, t100.d(82.0f));
        } else {
            xdl0.C0(vText, t100.d(56.0f));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17946c0(final int i) {
        if (this.f16205A == null) {
            this.f16205A = xdl0.i0(this.f16223k);
            this.f16206B = xdl0.i0(this.f16227o);
            boolean zM17931I = m17931I();
            int i2 = this.f16210F;
            if (zM17931I) {
                this.f16207C = i2;
            } else {
                this.f16207C = i2 - t100.d(10.0f);
            }
        }
        this.f16233u = true;
        this.f16208D = i;
        xdl0.M(this.f16226n, true);
        int[] iArr = new int[2];
        this.f16221i.getLocationOnScreen(iArr);
        int iD = (t100.d(78.0f) + i) - (((xdl0.x0(this.f16230r) - this.f16221i.getHeight()) - iArr[1]) - (m17902J(this.f16230r) ? xdl0.I(this.f16230r) : 0));
        if (this.f16207C >= iD) {
            this.f16207C = iD;
        }
        int i3 = this.f16206B.b;
        int i4 = this.f16205A.b;
        if (i3 - i4 < i) {
            this.f16209E = i3 - i4;
        } else {
            this.f16209E = i;
        }
        final GradientDrawable gradientDrawable = (GradientDrawable) this.f16227o.getBackground();
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        Interpolator interpolator = bt0.b;
        duration.setInterpolator(interpolator);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ikf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14679a.m17939V(duration, i, gradientDrawable, valueAnimator);
            }
        });
        bt0.v(duration, new Runnable() { // from class: l.jkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f15218a.m17940W();
            }
        });
        boolean zM17931I2 = m17931I();
        VText_Bold vText_Bold = this.f16229q;
        if (!zM17931I2) {
            bt0.x(200L, new Animator[]{duration, bt0.p(vText_Bold, "alpha", 0L, 200L, interpolator, new float[]{0.0f, 1.0f}), bt0.p(this.f16224l, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(this.f16223k, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(this.f16225m, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.q(this.f16214b, "translationY", new float[]{-this.f16207C}).setDuration(200L)}).start();
            return;
        }
        bt0.x(200L, new Animator[]{duration, bt0.p(vText_Bold, "alpha", 0L, 200L, interpolator, new float[]{0.0f, 1.0f}), bt0.p(this.f16224l, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(this.f16223k, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(this.f16219g, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.p(this.f16220h, "alpha", 0L, 60L, (Interpolator) null, new float[]{1.0f, 0.0f}), bt0.q(this.f16214b, "translationY", new float[]{-this.f16207C}).setDuration(200L)}).start();
        xdl0.M(this.f16228p, false);
        bt0.f(bt0.p(this.f16225m, "alpha", 0L, 30L, (Interpolator) null, new float[]{1.0f, 0.0f}), new RunnableC1016a()).start();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = this.f16230r.setUpKeyboardDetectorLayout(m17948v(layoutInflater, viewGroup), new View(this.f16230r), new h30() { // from class: l.ckf
            /* JADX INFO: renamed from: b */
            public final void m12700b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f10659a.m17937P((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (hm7.b()) {
            m17950x();
        }
        if (upa.z()) {
            this.f16216d.setTextColor(this.f16230r.getResources().getColor(w0c0.x));
            this.f16217e.setTextColor(this.f16230r.getResources().getColor(w0c0.x));
            this.f16219g.setTextColor(this.f16230r.getResources().getColor(w0c0.x));
            this.f16220h.setTextColor(this.f16230r.getResources().getColor(w0c0.z));
            this.f16223k.setTextColor(this.f16230r.getResources().getColor(w0c0.z));
            this.f16225m.setTextColor(this.f16230r.getResources().getColor(w0c0.z));
            this.f16228p.setTextColor(this.f16230r.getResources().getColor(w0c0.x));
            this.f16228p.setHintTextColor(this.f16230r.getResources().getColor(w0c0.z));
            soe.a(this.f16228p);
            this.f16229q.setTextColor(this.f16230r.getResources().getColorStateList(w0c0.T0));
        }
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: v */
    public View m17948v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mkf.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ExpandProfileLikeAct act() {
        return this.f16230r;
    }

    /* JADX INFO: renamed from: x */
    public final void m17950x() {
        PopupWindow popupWindow = new PopupWindow();
        this.f16212H = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(f6c0.te, (ViewGroup) null, false));
        this.f16212H.setInputMethodMode(1);
        this.f16212H.setWidth(0);
        this.f16212H.setHeight(0);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void m17947i1(wjf wjfVar) {
        this.f16231s = wjfVar;
    }

    /* JADX INFO: renamed from: z */
    public final void m17952z() {
        m17943Z(!TextUtils.isEmpty(this.f16238z));
        if (CoreModule.K().me_().isJailedOrRestrict() || CoreModule.K().me_().isBanned()) {
            ura.e().d().Vc();
            return;
        }
        final String strMo18509d = this.f16238z;
        if (TextUtils.isEmpty(strMo18509d)) {
            strMo18509d = this.f16237y.mo18509d();
        }
        if (qib0.Z.K(strMo18509d)) {
            act().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.bkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10150a.m17932K(strMo18509d);
                }
            }).z0();
        } else {
            m17944a0(strMo18509d, !TextUtils.isEmpty(this.f16238z));
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.lkf$c */
    public class C1018c implements TextWatcher {
        public C1018c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            lkf.this.f16238z = editable.toString().trim();
            lkf lkfVar = lkf.this;
            lkfVar.f16223k.setText(lkfVar.f16238z);
            lkf lkfVar2 = lkf.this;
            lkfVar2.m17945b0(lkfVar2.f16238z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

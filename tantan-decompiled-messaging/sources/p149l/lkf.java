package p149l;

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
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class lkf implements s7m<wjf> {

    /* JADX INFO: renamed from: A */
    public xdl0.C21104g f128491A;

    /* JADX INFO: renamed from: B */
    public xdl0.C21104g f128492B;

    /* JADX INFO: renamed from: C */
    public int f128493C;

    /* JADX INFO: renamed from: D */
    public int f128494D;

    /* JADX INFO: renamed from: E */
    public int f128495E;

    /* JADX INFO: renamed from: F */
    public int f128496F;

    /* JADX INFO: renamed from: G */
    public int f128497G;

    /* JADX INFO: renamed from: H */
    public PopupWindow f128498H;

    /* JADX INFO: renamed from: a */
    public VFrame f128499a;

    /* JADX INFO: renamed from: b */
    public VLinear f128500b;

    /* JADX INFO: renamed from: c */
    public VLinear_FillerMeasure f128501c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f128502d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f128503e;

    /* JADX INFO: renamed from: f */
    public VLinear f128504f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f128505g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f128506h;

    /* JADX INFO: renamed from: i */
    public VFrame f128507i;

    /* JADX INFO: renamed from: j */
    public VLinear f128508j;

    /* JADX INFO: renamed from: k */
    public VText f128509k;

    /* JADX INFO: renamed from: l */
    public ProfileLikeRemainingSwitcherView f128510l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f128511m;

    /* JADX INFO: renamed from: n */
    public VFrame f128512n;

    /* JADX INFO: renamed from: o */
    public VLinear f128513o;

    /* JADX INFO: renamed from: p */
    public VEditText f128514p;

    /* JADX INFO: renamed from: q */
    public VText_Bold f128515q;

    /* JADX INFO: renamed from: r */
    public ExpandProfileLikeAct f128516r;

    /* JADX INFO: renamed from: s */
    public wjf f128517s;

    /* JADX INFO: renamed from: v */
    public User f128520v;

    /* JADX INFO: renamed from: y */
    public ymf f128523y;

    /* JADX INFO: renamed from: t */
    public boolean f128518t = true;

    /* JADX INFO: renamed from: u */
    public boolean f128519u = false;

    /* JADX INFO: renamed from: w */
    public Interpolator f128521w = new jig();

    /* JADX INFO: renamed from: x */
    public boolean f128522x = false;

    /* JADX INFO: renamed from: z */
    public String f128524z = "";

    /* JADX INFO: renamed from: l.lkf$a */
    public class RunnableC18242a implements Runnable {
        public RunnableC18242a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.m208344M(lkf.this.f128514p, true);
            bt0.m103743p(lkf.this.f128514p, "alpha", 0L, 30L, null, 0.0f, 1.0f).start();
        }
    }

    /* JADX INFO: renamed from: l.lkf$b */
    public class RunnableC18243b implements Runnable {
        public RunnableC18243b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bt0.m103743p(lkf.this.f128509k, "alpha", 0L, 30L, null, 0.0f, 1.0f).start();
        }
    }

    /* JADX INFO: renamed from: l.lkf$d */
    public class C18245d extends WindowInsetsAnimation$Callback {
        public C18245d(int i) {
            super(i);
        }

        public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super.onEnd(windowInsetsAnimation);
        }

        public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            xdl0.m208380i0(lkf.this.f128509k);
            super.onPrepare(windowInsetsAnimation);
        }

        @NonNull
        public WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
            return null;
        }

        @NonNull
        public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
            return super.onStart(windowInsetsAnimation, bounds);
        }
    }

    /* JADX INFO: renamed from: l.lkf$e */
    public static /* synthetic */ class C18246e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f128529a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f128529a = iArr;
            try {
                iArr[HomeCardExpandedType.ABOUT_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128529a[HomeCardExpandedType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128529a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128529a[HomeCardExpandedType.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public lkf(ExpandProfileLikeAct expandProfileLikeAct) {
        this.f128516r = expandProfileLikeAct;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m150218J(@NonNull Activity activity) {
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
    public /* synthetic */ void m150219Q(View view) {
        this.f128516r.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m150220R(View view) {
        this.f128516r.m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m150221S(View view) {
        m150266z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m150222U(View view) {
        xdl0.m208345M0(this.f128513o, false);
        this.f128514p.requestFocus();
        this.f128516r.showInput(this.f128514p, 0);
    }

    /* JADX INFO: renamed from: A */
    public void m150239A() {
        this.f128516r.hideInput(this.f128514p);
    }

    /* JADX INFO: renamed from: B */
    public void m150240B() {
        if (NullChecker.m81303a(this.f128498H) && this.f128498H.isShowing()) {
            this.f128498H.dismiss();
            this.f128498H = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m150241C() {
        boolean z;
        if (this.f128519u) {
            this.f128519u = false;
            final GradientDrawable gradientDrawable = (GradientDrawable) this.f128513o.getBackground();
            final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            Interpolator interpolator = bt0.f77155b;
            duration.setInterpolator(interpolator);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kkf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f123546a.m150248L(duration, gradientDrawable, valueAnimator);
                }
            });
            bt0.m103749v(duration, new Runnable() { // from class: l.yjf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198627a.m150249M();
                }
            });
            boolean zM150246I = m150246I();
            VText_Bold vText_Bold = this.f128515q;
            if (zM150246I) {
                z = true;
                bt0.m103733f(bt0.m103751x(200L, duration, bt0.m103743p(vText_Bold, "alpha", 0L, 200L, interpolator, 1.0f, 0.0f), bt0.m103743p(this.f128510l, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103743p(this.f128511m, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103743p(this.f128505g, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103743p(this.f128506h, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103744q(this.f128500b, "translationY", 0.0f).setDuration(200L)), new Runnable() { // from class: l.zjf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f203401a.m150250N();
                    }
                }).start();
                bt0.m103733f(bt0.m103743p(this.f128514p, "alpha", 0L, 30L, null, 1.0f, 0.0f), new RunnableC18243b()).start();
            } else {
                z = true;
                bt0.m103733f(bt0.m103751x(200L, duration, bt0.m103743p(vText_Bold, "alpha", 0L, 200L, interpolator, 1.0f, 0.0f), bt0.m103743p(this.f128510l, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103743p(this.f128509k, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103743p(this.f128511m, "alpha", 0L, 60L, null, 0.0f, 1.0f), bt0.m103744q(this.f128500b, "translationY", 0.0f).setDuration(200L)), new Runnable() { // from class: l.akf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70273a.m150251O();
                    }
                }).start();
            }
            xdl0.m208344M(this.f128510l, z);
            xdl0.m208344M(this.f128509k, z);
            xdl0.m208344M(this.f128511m, z);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128516r;
    }

    /* JADX INFO: renamed from: E */
    public final void m150242E(String str) {
        int i = C18246e.f128529a[HomeCardExpandedType.getTypeByAlias(str).ordinal()];
        if (i == 1) {
            this.f128523y = new mjf();
        } else if (i == 2) {
            this.f128523y = new rkf();
        } else if (i == 3) {
            this.f128523y = new pkf();
        } else if (i != 4) {
            this.f128516r.m47815F2();
        } else {
            this.f128523y = new nkf();
        }
        this.f128523y.mo154803e(this.f128507i);
    }

    /* JADX INFO: renamed from: F */
    public final void m150243F() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f128513o.setWindowInsetsAnimationCallback(new C18245d(0));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m150244G() {
        int iM186890d;
        int i;
        int iM208414z0 = (int) (((double) xdl0.m208414z0(this.f128516r)) * 0.7866666666666666d);
        if (iM208414z0 > t100.m186890d(400.0f)) {
            iM208414z0 = t100.m186890d(400.0f);
        }
        int iM208414z1 = (xdl0.m208414z0(this.f128516r) - iM208414z0) / 2;
        this.f128497G = iM208414z0;
        xdl0.m208325C0(this.f128507i, iM208414z0);
        xdl0.m208358V(this.f128501c, iM208414z1);
        xdl0.m208359W(this.f128501c, iM208414z1);
        xdl0.m208358V(this.f128509k, iM208414z1);
        xdl0.m208359W(this.f128509k, iM208414z1);
        xdl0.m208358V(this.f128510l, iM208414z1);
        xdl0.m208359W(this.f128510l, iM208414z1);
        ymf ymfVar = this.f128523y;
        if (ymfVar != null) {
            ymfVar.mo154800b(this.f128497G);
        }
        if (m150246I()) {
            iM186890d = t100.m186890d(340.0f);
            i = this.f128497G;
        } else {
            iM186890d = t100.m186890d(300.0f);
            i = this.f128497G;
        }
        int iM208410x0 = ((xdl0.m208410x0(this.f128516r) - (iM186890d + i)) - xdl0.m208336I(this.f128516r)) / 2;
        this.f128496F = iM208410x0;
        xdl0.m208360X(this.f128500b, iM208410x0);
    }

    /* JADX INFO: renamed from: H */
    public void m150245H(String str, CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f128520v = user;
        m150242E(str);
        m150244G();
        if (user == null) {
            return;
        }
        boolean zM150246I = m150246I();
        VLinear_FillerMeasure vLinear_FillerMeasure = this.f128501c;
        if (zM150246I) {
            xdl0.m208344M(vLinear_FillerMeasure, false);
            xdl0.m208344M(this.f128504f, true);
            this.f128505g.setTypeface(Typeface.DEFAULT_BOLD);
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id);
            String strConcat = userM169430Pa.name;
            if (strConcat.length() > 4) {
                strConcat = userM169430Pa.name.substring(0, 4).concat("...");
            }
            this.f128509k.setMaxLines(2);
            this.f128509k.setLineSpacing(0.0f, 1.15f);
            this.f128505g.setText("给 " + strConcat + " 留言");
            this.f128506h.setText("让你的喜欢脱颖而出，更容易配对");
            if (!TextUtils.isEmpty(this.f128516r.f26520k)) {
                this.f128509k.setText(this.f128516r.f26520k);
                this.f128514p.setText(this.f128516r.f26520k);
                String str2 = this.f128516r.f26520k;
                this.f128524z = str2;
                m150260b0(str2);
            }
            this.f128510l.setCurrentText(String.format("发送并喜欢%s", user.getPronoun()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.format("发送并喜欢%s", this.f128520v.getPronoun()));
            this.f128510l.setAnimateDirection(false);
            this.f128510l.m43265i();
            this.f128510l.setTextList(arrayList);
            this.f128510l.m43264h();
            this.f128509k.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f128514p.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
        } else {
            xdl0.m208344M(vLinear_FillerMeasure, true);
            xdl0.m208344M(this.f128504f, false);
            xdl0.m208325C0(this.f128509k, t100.m186890d(56.0f));
            this.f128509k.setMaxLines(1);
            this.f128502d.setTypeface(Typeface.DEFAULT_BOLD);
            this.f128502d.setText(user.name);
            xdl0.m208344M(this.f128503e, !CoreModule.f17545c.f19561E0.m203803z3(user));
            this.f128503e.setText(String.valueOf(user.age));
            this.f128509k.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f128514p.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f128510l.setCurrentText(String.format("发送称赞并喜欢%s", user.getPronoun()));
            this.f128514p.setText("");
        }
        xdl0.m208329E0(this.f128511m, new View.OnClickListener() { // from class: l.dkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86646a.m150220R(view);
            }
        });
        this.f128516r.setSwipeBackEnable(false);
        this.f128519u = false;
        this.f128514p.addTextChangedListener(new C18244c());
        xdl0.m208329E0(this.f128515q, new View.OnClickListener() { // from class: l.ekf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91969a.m150221S(view);
            }
        });
        this.f128510l.setOnItemClickListener(new ProfileLikeRemainingSwitcherView.InterfaceC8220b() { // from class: l.fkf
            @Override // com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView.InterfaceC8220b
            /* JADX INFO: renamed from: a */
            public final void mo43267a(int i2) {
                this.f98060a.m150253T(i2);
            }
        });
        xdl0.m208329E0(this.f128509k, new View.OnClickListener() { // from class: l.gkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103187a.m150222U(view);
            }
        });
        xdl0.m208329E0(this.f128512n, new View.OnClickListener() { // from class: l.hkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108182a.m150219Q(view);
            }
        });
        ymf ymfVar = this.f128523y;
        if (ymfVar != null) {
            ymfVar.mo154801c(userInfo, user, i);
        }
        m150243F();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m150246I() {
        return TextUtils.equals(this.f128516r.f26514e, "send_game_guidance") || TextUtils.equals(this.f128516r.f26514e, "send_fitness_guidance") || TextUtils.equals(this.f128516r.f26514e, "send_drinking_guidance") || TextUtils.equals(this.f128516r.f26514e, "send_smoking_guidance");
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m150247K(String str) {
        m150259a0(str, !TextUtils.isEmpty(this.f128524z));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m150248L(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = this.f128513o.getLayoutParams();
        xdl0.C21104g c21104g = this.f128491A;
        int i = c21104g.f192420c;
        xdl0.C21104g c21104g2 = this.f128492B;
        float f = 1.0f - animatedFraction;
        layoutParams.width = (int) (i + ((c21104g2.f192420c - i) * f));
        int i2 = c21104g.f192421d;
        layoutParams.height = (int) (i2 + ((c21104g2.f192421d - i2) * f));
        VLinear vLinear = this.f128513o;
        int i3 = this.f128495E;
        vLinear.setTranslationY(-(i3 + ((this.f128494D - i3) * f)));
        this.f128513o.setLayoutParams(layoutParams);
        gradientDrawable.setCornerRadius(t100.f167260i * animatedFraction);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m150249M() {
        ViewGroup.LayoutParams layoutParams = this.f128513o.getLayoutParams();
        xdl0.C21104g c21104g = this.f128491A;
        layoutParams.width = c21104g.f192420c;
        layoutParams.height = c21104g.f192421d;
        this.f128513o.setLayoutParams(layoutParams);
        this.f128513o.setTranslationY(-this.f128494D);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m150250N() {
        xdl0.m208344M(this.f128513o, false);
        xdl0.m208344M(this.f128512n, false);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m150251O() {
        xdl0.m208344M(this.f128513o, false);
        xdl0.m208344M(this.f128512n, false);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m150252P(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m150256X(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m150253T(int i) {
        m150266z();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m150254V(ValueAnimator valueAnimator, int i, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = this.f128513o.getLayoutParams();
        xdl0.C21104g c21104g = this.f128491A;
        int i2 = c21104g.f192420c;
        xdl0.C21104g c21104g2 = this.f128492B;
        layoutParams.width = (int) (i2 + ((c21104g2.f192420c - i2) * animatedFraction));
        int i3 = c21104g.f192421d;
        layoutParams.height = (int) (i3 + ((c21104g2.f192421d - i3) * animatedFraction));
        this.f128513o.setLayoutParams(layoutParams);
        VLinear vLinear = this.f128513o;
        int i4 = this.f128495E;
        vLinear.setTranslationY(-(i4 + ((i - i4) * animatedFraction)));
        gradientDrawable.setCornerRadius(t100.f167260i * (1.0f - animatedFraction));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m150255W() {
        ViewGroup.LayoutParams layoutParams = this.f128513o.getLayoutParams();
        xdl0.C21104g c21104g = this.f128491A;
        layoutParams.width = c21104g.f192420c;
        layoutParams.height = c21104g.f192421d;
        this.f128513o.setLayoutParams(layoutParams);
        this.f128513o.setTranslationY(-this.f128495E);
        xdl0.m208345M0(this.f128513o, true);
    }

    /* JADX INFO: renamed from: X */
    public void m150256X(int i) {
        if (i == 0 && this.f128519u) {
            m150241C();
        } else if (i > 0) {
            m150261c0(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m150257Y(boolean z) {
        if (z && hm7.m131700b() && NullChecker.m81303a(this.f128498H) && !this.f128498H.isShowing()) {
            this.f128498H.setBackgroundDrawable(new ColorDrawable(0));
            this.f128498H.showAtLocation(this.f128516r.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m150258Z(boolean z) {
        zvf0.m220399u("e_send_profile_like", getAct().pageId(), vwb.m200311Y("have_comment", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m150259a0(String str, boolean z) {
        if (this.f128522x) {
            return;
        }
        this.f128522x = true;
        ProfileLikeComment profileLikeCommentMo154799a = this.f128523y.mo154799a(z);
        profileLikeCommentMo154799a.comment = str;
        if (!TextUtils.isEmpty(str)) {
            wjf wjfVar = this.f128517s;
            wjfVar.m203434x0(wjfVar.f186632d, profileLikeCommentMo154799a.toJson(), str, z);
        } else if (TextUtils.isEmpty(str) && m150246I()) {
            this.f128517s.m203433u0("");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m150260b0(String str) {
        float fMeasureText = this.f128509k.getPaint().measureText(str);
        float f = this.f128497G;
        VText vText = this.f128509k;
        if (fMeasureText > f) {
            xdl0.m208325C0(vText, t100.m186890d(82.0f));
        } else {
            xdl0.m208325C0(vText, t100.m186890d(56.0f));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m150261c0(final int i) {
        if (this.f128491A == null) {
            this.f128491A = xdl0.m208380i0(this.f128509k);
            this.f128492B = xdl0.m208380i0(this.f128513o);
            boolean zM150246I = m150246I();
            int i2 = this.f128496F;
            if (zM150246I) {
                this.f128493C = i2;
            } else {
                this.f128493C = i2 - t100.m186890d(10.0f);
            }
        }
        this.f128519u = true;
        this.f128494D = i;
        xdl0.m208344M(this.f128512n, true);
        int[] iArr = new int[2];
        this.f128507i.getLocationOnScreen(iArr);
        int iM186890d = (t100.m186890d(78.0f) + i) - (((xdl0.m208410x0(this.f128516r) - this.f128507i.getHeight()) - iArr[1]) - (m150218J(this.f128516r) ? xdl0.m208336I(this.f128516r) : 0));
        if (this.f128493C >= iM186890d) {
            this.f128493C = iM186890d;
        }
        int i3 = this.f128492B.f192419b;
        int i4 = this.f128491A.f192419b;
        if (i3 - i4 < i) {
            this.f128495E = i3 - i4;
        } else {
            this.f128495E = i;
        }
        final GradientDrawable gradientDrawable = (GradientDrawable) this.f128513o.getBackground();
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        Interpolator interpolator = bt0.f77155b;
        duration.setInterpolator(interpolator);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ikf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f113660a.m150254V(duration, i, gradientDrawable, valueAnimator);
            }
        });
        bt0.m103749v(duration, new Runnable() { // from class: l.jkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f118379a.m150255W();
            }
        });
        boolean zM150246I2 = m150246I();
        VText_Bold vText_Bold = this.f128515q;
        if (!zM150246I2) {
            bt0.m103751x(200L, duration, bt0.m103743p(vText_Bold, "alpha", 0L, 200L, interpolator, 0.0f, 1.0f), bt0.m103743p(this.f128510l, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103743p(this.f128509k, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103743p(this.f128511m, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103744q(this.f128500b, "translationY", -this.f128493C).setDuration(200L)).start();
            return;
        }
        bt0.m103751x(200L, duration, bt0.m103743p(vText_Bold, "alpha", 0L, 200L, interpolator, 0.0f, 1.0f), bt0.m103743p(this.f128510l, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103743p(this.f128509k, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103743p(this.f128505g, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103743p(this.f128506h, "alpha", 0L, 60L, null, 1.0f, 0.0f), bt0.m103744q(this.f128500b, "translationY", -this.f128493C).setDuration(200L)).start();
        xdl0.m208344M(this.f128514p, false);
        bt0.m103733f(bt0.m103743p(this.f128511m, "alpha", 0L, 30L, null, 1.0f, 0.0f), new RunnableC18242a()).start();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = this.f128516r.setUpKeyboardDetectorLayout(m150262v(layoutInflater, viewGroup), new View(this.f128516r), new h30() { // from class: l.ckf
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f81332a.m150252P((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (hm7.m131700b()) {
            m150264x();
        }
        if (upa.m194847z()) {
            this.f128502d.setTextColor(this.f128516r.getResources().getColor(w0c0.f183899x));
            this.f128503e.setTextColor(this.f128516r.getResources().getColor(w0c0.f183899x));
            this.f128505g.setTextColor(this.f128516r.getResources().getColor(w0c0.f183899x));
            this.f128506h.setTextColor(this.f128516r.getResources().getColor(w0c0.f183905z));
            this.f128509k.setTextColor(this.f128516r.getResources().getColor(w0c0.f183905z));
            this.f128511m.setTextColor(this.f128516r.getResources().getColor(w0c0.f183905z));
            this.f128514p.setTextColor(this.f128516r.getResources().getColor(w0c0.f183899x));
            this.f128514p.setHintTextColor(this.f128516r.getResources().getColor(w0c0.f183905z));
            soe.m185291a(this.f128514p);
            this.f128515q.setTextColor(this.f128516r.getResources().getColorStateList(w0c0.f183807T0));
        }
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: v */
    public View m150262v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mkf.m155004b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ExpandProfileLikeAct getAct() {
        return this.f128516r;
    }

    /* JADX INFO: renamed from: x */
    public final void m150264x() {
        PopupWindow popupWindow = new PopupWindow();
        this.f128498H = popupWindow;
        popupWindow.setContentView(getAct().inflater().inflate(f6c0.f96019te, (ViewGroup) null, false));
        this.f128498H.setInputMethodMode(1);
        this.f128498H.setWidth(0);
        this.f128498H.setHeight(0);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wjf wjfVar) {
        this.f128517s = wjfVar;
    }

    /* JADX INFO: renamed from: z */
    public final void m150266z() {
        m150258Z(!TextUtils.isEmpty(this.f128524z));
        if (CoreModule.m29932K().me_().isJailedOrRestrict() || CoreModule.m29932K().me_().isBanned()) {
            ura.m195053e().m195057d().mo33765Vc();
            return;
        }
        final String strMo154802d = this.f128524z;
        if (TextUtils.isEmpty(strMo154802d)) {
            strMo154802d = this.f128523y.mo154802d();
        }
        if (qib0.f154711Z.m119125K(strMo154802d)) {
            getAct().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.bkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76015a.m150247K(strMo154802d);
                }
            }).m20568z0();
        } else {
            m150259a0(strMo154802d, !TextUtils.isEmpty(this.f128524z));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.lkf$c */
    public class C18244c implements TextWatcher {
        public C18244c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            lkf.this.f128524z = editable.toString().trim();
            lkf lkfVar = lkf.this;
            lkfVar.f128509k.setText(lkfVar.f128524z);
            lkf lkfVar2 = lkf.this;
            lkfVar2.m150260b0(lkfVar2.f128524z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class rlf implements iam<clf> {

    /* JADX INFO: renamed from: A */
    public bnl0.C16067g f163720A;

    /* JADX INFO: renamed from: B */
    public bnl0.C16067g f163721B;

    /* JADX INFO: renamed from: C */
    public int f163722C;

    /* JADX INFO: renamed from: D */
    public int f163723D;

    /* JADX INFO: renamed from: E */
    public int f163724E;

    /* JADX INFO: renamed from: F */
    public int f163725F;

    /* JADX INFO: renamed from: G */
    public int f163726G;

    /* JADX INFO: renamed from: H */
    public PopupWindow f163727H;

    /* JADX INFO: renamed from: a */
    public VFrame f163728a;

    /* JADX INFO: renamed from: b */
    public VLinear f163729b;

    /* JADX INFO: renamed from: c */
    public VLinear_FillerMeasure f163730c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f163731d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f163732e;

    /* JADX INFO: renamed from: f */
    public VLinear f163733f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f163734g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f163735h;

    /* JADX INFO: renamed from: i */
    public VFrame f163736i;

    /* JADX INFO: renamed from: j */
    public VLinear f163737j;

    /* JADX INFO: renamed from: k */
    public VText f163738k;

    /* JADX INFO: renamed from: l */
    public ProfileLikeRemainingSwitcherView f163739l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f163740m;

    /* JADX INFO: renamed from: n */
    public VFrame f163741n;

    /* JADX INFO: renamed from: o */
    public VLinear f163742o;

    /* JADX INFO: renamed from: p */
    public VEditText f163743p;

    /* JADX INFO: renamed from: q */
    public VText_Bold f163744q;

    /* JADX INFO: renamed from: r */
    public ExpandProfileLikeAct f163745r;

    /* JADX INFO: renamed from: s */
    public clf f163746s;

    /* JADX INFO: renamed from: v */
    public User f163749v;

    /* JADX INFO: renamed from: y */
    public eof f163752y;

    /* JADX INFO: renamed from: t */
    public boolean f163747t = true;

    /* JADX INFO: renamed from: u */
    public boolean f163748u = false;

    /* JADX INFO: renamed from: w */
    public Interpolator f163750w = new xjg();

    /* JADX INFO: renamed from: x */
    public boolean f163751x = false;

    /* JADX INFO: renamed from: z */
    public String f163753z = "";

    /* JADX INFO: renamed from: l.rlf$a */
    public class RunnableC19865a implements Runnable {
        public RunnableC19865a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.m105524M(rlf.this.f163743p, true);
            gt0.m132170p(rlf.this.f163743p, "alpha", 0L, 30L, null, 0.0f, 1.0f).start();
        }
    }

    /* JADX INFO: renamed from: l.rlf$b */
    public class RunnableC19866b implements Runnable {
        public RunnableC19866b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gt0.m132170p(rlf.this.f163738k, "alpha", 0L, 30L, null, 0.0f, 1.0f).start();
        }
    }

    /* JADX INFO: renamed from: l.rlf$d */
    public class C19868d extends WindowInsetsAnimation$Callback {
        public C19868d(int i) {
            super(i);
        }

        public void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super.onEnd(windowInsetsAnimation);
        }

        public void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            bnl0.m105560i0(rlf.this.f163738k);
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

    /* JADX INFO: renamed from: l.rlf$e */
    public static /* synthetic */ class C19869e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f163758a;

        static {
            int[] iArr = new int[HomeCardExpandedType.values().length];
            f163758a = iArr;
            try {
                iArr[HomeCardExpandedType.ABOUT_ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f163758a[HomeCardExpandedType.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f163758a[HomeCardExpandedType.LIFE_PIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f163758a[HomeCardExpandedType.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public rlf(ExpandProfileLikeAct expandProfileLikeAct) {
        this.f163745r = expandProfileLikeAct;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m181941J(@NonNull Activity activity) {
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
    public /* synthetic */ void m181942Q(View view) {
        this.f163745r.hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m181943R(View view) {
        this.f163745r.m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m181944S(View view) {
        m181989z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m181945U(View view) {
        bnl0.m105525M0(this.f163742o, false);
        this.f163743p.requestFocus();
        this.f163745r.showInput(this.f163743p, 0);
    }

    /* JADX INFO: renamed from: A */
    public void m181962A() {
        this.f163745r.hideInput(this.f163743p);
    }

    /* JADX INFO: renamed from: B */
    public void m181963B() {
        if (NullChecker.m82486a(this.f163727H) && this.f163727H.isShowing()) {
            this.f163727H.dismiss();
            this.f163727H = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m181964C() {
        boolean z;
        if (this.f163748u) {
            this.f163748u = false;
            final GradientDrawable gradientDrawable = (GradientDrawable) this.f163742o.getBackground();
            final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            Interpolator interpolator = gt0.f106347b;
            duration.setInterpolator(interpolator);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qlf
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f158224a.m181971L(duration, gradientDrawable, valueAnimator);
                }
            });
            gt0.m132176v(duration, new Runnable() { // from class: l.elf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94514a.m181972M();
                }
            });
            boolean zM181969I = m181969I();
            VText_Bold vText_Bold = this.f163744q;
            if (zM181969I) {
                z = true;
                gt0.m132160f(gt0.m132178x(200L, duration, gt0.m132170p(vText_Bold, "alpha", 0L, 200L, interpolator, 1.0f, 0.0f), gt0.m132170p(this.f163739l, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132170p(this.f163740m, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132170p(this.f163734g, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132170p(this.f163735h, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132171q(this.f163729b, "translationY", 0.0f).setDuration(200L)), new Runnable() { // from class: l.flf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99642a.m181973N();
                    }
                }).start();
                gt0.m132160f(gt0.m132170p(this.f163743p, "alpha", 0L, 30L, null, 1.0f, 0.0f), new RunnableC19866b()).start();
            } else {
                z = true;
                gt0.m132160f(gt0.m132178x(200L, duration, gt0.m132170p(vText_Bold, "alpha", 0L, 200L, interpolator, 1.0f, 0.0f), gt0.m132170p(this.f163739l, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132170p(this.f163738k, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132170p(this.f163740m, "alpha", 0L, 60L, null, 0.0f, 1.0f), gt0.m132171q(this.f163729b, "translationY", 0.0f).setDuration(200L)), new Runnable() { // from class: l.glf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f104846a.m181974O();
                    }
                }).start();
            }
            bnl0.m105524M(this.f163739l, z);
            bnl0.m105524M(this.f163738k, z);
            bnl0.m105524M(this.f163740m, z);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163745r;
    }

    /* JADX INFO: renamed from: E */
    public final void m181965E(String str) {
        int i = C19869e.f163758a[HomeCardExpandedType.getTypeByAlias(str).ordinal()];
        if (i == 1) {
            this.f163752y = new skf();
        } else if (i == 2) {
            this.f163752y = new xlf();
        } else if (i == 3) {
            this.f163752y = new vlf();
        } else if (i != 4) {
            this.f163745r.m48999H2();
        } else {
            this.f163752y = new tlf();
        }
        this.f163752y.mo121746e(this.f163736i);
    }

    /* JADX INFO: renamed from: F */
    public final void m181966F() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f163742o.setWindowInsetsAnimationCallback(new C19868d(0));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m181967G() {
        int iM175859d;
        int i;
        int iM105594z0 = (int) (((double) bnl0.m105594z0(this.f163745r)) * 0.7866666666666666d);
        if (iM105594z0 > qa00.m175859d(400.0f)) {
            iM105594z0 = qa00.m175859d(400.0f);
        }
        int iM105594z1 = (bnl0.m105594z0(this.f163745r) - iM105594z0) / 2;
        this.f163726G = iM105594z0;
        bnl0.m105505C0(this.f163736i, iM105594z0);
        bnl0.m105538V(this.f163730c, iM105594z1);
        bnl0.m105539W(this.f163730c, iM105594z1);
        bnl0.m105538V(this.f163738k, iM105594z1);
        bnl0.m105539W(this.f163738k, iM105594z1);
        bnl0.m105538V(this.f163739l, iM105594z1);
        bnl0.m105539W(this.f163739l, iM105594z1);
        eof eofVar = this.f163752y;
        if (eofVar != null) {
            eofVar.mo121743b(this.f163726G);
        }
        if (m181969I()) {
            iM175859d = qa00.m175859d(340.0f);
            i = this.f163726G;
        } else {
            iM175859d = qa00.m175859d(300.0f);
            i = this.f163726G;
        }
        int iM105590x0 = ((bnl0.m105590x0(this.f163745r) - (iM175859d + i)) - bnl0.m105516I(this.f163745r)) / 2;
        this.f163725F = iM105590x0;
        bnl0.m105540X(this.f163729b, iM105590x0);
    }

    /* JADX INFO: renamed from: H */
    public void m181968H(String str, CoreSuggested.UserInfo userInfo, User user, int i) {
        this.f163749v = user;
        m181965E(str);
        m181967G();
        if (user == null) {
            return;
        }
        boolean zM181969I = m181969I();
        VLinear_FillerMeasure vLinear_FillerMeasure = this.f163730c;
        if (zM181969I) {
            bnl0.m105524M(vLinear_FillerMeasure, false);
            bnl0.m105524M(this.f163733f, true);
            this.f163734g.setTypeface(Typeface.DEFAULT_BOLD);
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id);
            String strConcat = userM116503Pa.name;
            if (strConcat.length() > 4) {
                strConcat = userM116503Pa.name.substring(0, 4).concat("...");
            }
            this.f163738k.setMaxLines(2);
            this.f163738k.setLineSpacing(0.0f, 1.15f);
            this.f163734g.setText("给 " + strConcat + " 留言");
            this.f163735h.setText("让你的喜欢脱颖而出，更容易配对");
            if (!TextUtils.isEmpty(this.f163745r.f27262k)) {
                this.f163738k.setText(this.f163745r.f27262k);
                this.f163743p.setText(this.f163745r.f27262k);
                String str2 = this.f163745r.f27262k;
                this.f163753z = str2;
                m181983b0(str2);
            }
            this.f163739l.setCurrentText(String.format("发送并喜欢%s", user.getPronoun()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.format("发送并喜欢%s", this.f163749v.getPronoun()));
            this.f163739l.setAnimateDirection(false);
            this.f163739l.m44276i();
            this.f163739l.setTextList(arrayList);
            this.f163739l.m44275h();
            this.f163738k.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f163743p.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
        } else {
            bnl0.m105524M(vLinear_FillerMeasure, true);
            bnl0.m105524M(this.f163733f, false);
            bnl0.m105505C0(this.f163738k, qa00.m175859d(56.0f));
            this.f163738k.setMaxLines(1);
            this.f163731d.setTypeface(Typeface.DEFAULT_BOLD);
            this.f163731d.setText(user.name);
            bnl0.m105524M(this.f163732e, !CoreModule.f18264c.f20303E0.m141091z3(user));
            this.f163732e.setText(String.valueOf(user.age));
            this.f163738k.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f163743p.setHint(String.format("顺便夸夸%s~", user.getPronoun()));
            this.f163739l.setCurrentText(String.format("发送称赞并喜欢%s", user.getPronoun()));
            this.f163743p.setText("");
        }
        bnl0.m105509E0(this.f163740m, new View.OnClickListener() { // from class: l.jlf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121550a.m181943R(view);
            }
        });
        this.f163745r.setSwipeBackEnable(false);
        this.f163748u = false;
        this.f163743p.addTextChangedListener(new C19867c());
        bnl0.m105509E0(this.f163744q, new View.OnClickListener() { // from class: l.klf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127367a.m181944S(view);
            }
        });
        this.f163739l.setOnItemClickListener(new ProfileLikeRemainingSwitcherView.InterfaceC8371b() { // from class: l.llf
            @Override // com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView.InterfaceC8371b
            /* JADX INFO: renamed from: a */
            public final void mo44278a(int i2) {
                this.f132544a.m181976T(i2);
            }
        });
        bnl0.m105509E0(this.f163738k, new View.OnClickListener() { // from class: l.mlf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137393a.m181945U(view);
            }
        });
        bnl0.m105509E0(this.f163741n, new View.OnClickListener() { // from class: l.nlf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142539a.m181942Q(view);
            }
        });
        eof eofVar = this.f163752y;
        if (eofVar != null) {
            eofVar.mo121744c(userInfo, user, i);
        }
        m181966F();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m181969I() {
        return TextUtils.equals(this.f163745r.f27256e, "send_game_guidance") || TextUtils.equals(this.f163745r.f27256e, "send_fitness_guidance") || TextUtils.equals(this.f163745r.f27256e, "send_drinking_guidance") || TextUtils.equals(this.f163745r.f27256e, "send_smoking_guidance");
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m181970K(String str) {
        m181982a0(str, !TextUtils.isEmpty(this.f163753z));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m181971L(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = this.f163742o.getLayoutParams();
        bnl0.C16067g c16067g = this.f163720A;
        int i = c16067g.f77561c;
        bnl0.C16067g c16067g2 = this.f163721B;
        float f = 1.0f - animatedFraction;
        layoutParams.width = (int) (i + ((c16067g2.f77561c - i) * f));
        int i2 = c16067g.f77562d;
        layoutParams.height = (int) (i2 + ((c16067g2.f77562d - i2) * f));
        VLinear vLinear = this.f163742o;
        int i3 = this.f163724E;
        vLinear.setTranslationY(-(i3 + ((this.f163723D - i3) * f)));
        this.f163742o.setLayoutParams(layoutParams);
        gradientDrawable.setCornerRadius(qa00.f156322i * animatedFraction);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m181972M() {
        ViewGroup.LayoutParams layoutParams = this.f163742o.getLayoutParams();
        bnl0.C16067g c16067g = this.f163720A;
        layoutParams.width = c16067g.f77561c;
        layoutParams.height = c16067g.f77562d;
        this.f163742o.setLayoutParams(layoutParams);
        this.f163742o.setTranslationY(-this.f163723D);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m181973N() {
        bnl0.m105524M(this.f163742o, false);
        bnl0.m105524M(this.f163741n, false);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m181974O() {
        bnl0.m105524M(this.f163742o, false);
        bnl0.m105524M(this.f163741n, false);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m181975P(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m181979X(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m181976T(int i) {
        m181989z();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m181977V(ValueAnimator valueAnimator, int i, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ViewGroup.LayoutParams layoutParams = this.f163742o.getLayoutParams();
        bnl0.C16067g c16067g = this.f163720A;
        int i2 = c16067g.f77561c;
        bnl0.C16067g c16067g2 = this.f163721B;
        layoutParams.width = (int) (i2 + ((c16067g2.f77561c - i2) * animatedFraction));
        int i3 = c16067g.f77562d;
        layoutParams.height = (int) (i3 + ((c16067g2.f77562d - i3) * animatedFraction));
        this.f163742o.setLayoutParams(layoutParams);
        VLinear vLinear = this.f163742o;
        int i4 = this.f163724E;
        vLinear.setTranslationY(-(i4 + ((i - i4) * animatedFraction)));
        gradientDrawable.setCornerRadius(qa00.f156322i * (1.0f - animatedFraction));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m181978W() {
        ViewGroup.LayoutParams layoutParams = this.f163742o.getLayoutParams();
        bnl0.C16067g c16067g = this.f163720A;
        layoutParams.width = c16067g.f77561c;
        layoutParams.height = c16067g.f77562d;
        this.f163742o.setLayoutParams(layoutParams);
        this.f163742o.setTranslationY(-this.f163724E);
        bnl0.m105525M0(this.f163742o, true);
    }

    /* JADX INFO: renamed from: X */
    public void m181979X(int i) {
        if (i == 0 && this.f163748u) {
            m181964C();
        } else if (i > 0) {
            m181984c0(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m181980Y(boolean z) {
        if (z && ln7.m154967b() && NullChecker.m82486a(this.f163727H) && !this.f163727H.isShowing()) {
            this.f163727H.setBackgroundDrawable(new ColorDrawable(0));
            this.f163727H.showAtLocation(this.f163745r.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m181981Z(boolean z) {
        i4g0.m138523u("e_send_profile_like", getAct().pageId(), jyb.m147494Y("have_comment", Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m181982a0(String str, boolean z) {
        if (this.f163751x) {
            return;
        }
        this.f163751x = true;
        ProfileLikeComment profileLikeCommentMo121742a = this.f163752y.mo121742a(z);
        profileLikeCommentMo121742a.comment = str;
        if (!TextUtils.isEmpty(str)) {
            clf clfVar = this.f163746s;
            clfVar.m110607x0(clfVar.f82377d, profileLikeCommentMo121742a.toJson(), str, z);
        } else if (TextUtils.isEmpty(str) && m181969I()) {
            this.f163746s.m110606u0("");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m181983b0(String str) {
        float fMeasureText = this.f163738k.getPaint().measureText(str);
        float f = this.f163726G;
        VText vText = this.f163738k;
        if (fMeasureText > f) {
            bnl0.m105505C0(vText, qa00.m175859d(82.0f));
        } else {
            bnl0.m105505C0(vText, qa00.m175859d(56.0f));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m181984c0(final int i) {
        if (this.f163720A == null) {
            this.f163720A = bnl0.m105560i0(this.f163738k);
            this.f163721B = bnl0.m105560i0(this.f163742o);
            boolean zM181969I = m181969I();
            int i2 = this.f163725F;
            if (zM181969I) {
                this.f163722C = i2;
            } else {
                this.f163722C = i2 - qa00.m175859d(10.0f);
            }
        }
        this.f163748u = true;
        this.f163723D = i;
        bnl0.m105524M(this.f163741n, true);
        int[] iArr = new int[2];
        this.f163736i.getLocationOnScreen(iArr);
        int iM175859d = (qa00.m175859d(78.0f) + i) - (((bnl0.m105590x0(this.f163745r) - this.f163736i.getHeight()) - iArr[1]) - (m181941J(this.f163745r) ? bnl0.m105516I(this.f163745r) : 0));
        if (this.f163722C >= iM175859d) {
            this.f163722C = iM175859d;
        }
        int i3 = this.f163721B.f77560b;
        int i4 = this.f163720A.f77560b;
        if (i3 - i4 < i) {
            this.f163724E = i3 - i4;
        } else {
            this.f163724E = i;
        }
        final GradientDrawable gradientDrawable = (GradientDrawable) this.f163742o.getBackground();
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        Interpolator interpolator = gt0.f106347b;
        duration.setInterpolator(interpolator);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.olf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f147827a.m181977V(duration, i, gradientDrawable, valueAnimator);
            }
        });
        gt0.m132176v(duration, new Runnable() { // from class: l.plf
            @Override // java.lang.Runnable
            public final void run() {
                this.f153024a.m181978W();
            }
        });
        boolean zM181969I2 = m181969I();
        VText_Bold vText_Bold = this.f163744q;
        if (!zM181969I2) {
            gt0.m132178x(200L, duration, gt0.m132170p(vText_Bold, "alpha", 0L, 200L, interpolator, 0.0f, 1.0f), gt0.m132170p(this.f163739l, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132170p(this.f163738k, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132170p(this.f163740m, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132171q(this.f163729b, "translationY", -this.f163722C).setDuration(200L)).start();
            return;
        }
        gt0.m132178x(200L, duration, gt0.m132170p(vText_Bold, "alpha", 0L, 200L, interpolator, 0.0f, 1.0f), gt0.m132170p(this.f163739l, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132170p(this.f163738k, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132170p(this.f163734g, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132170p(this.f163735h, "alpha", 0L, 60L, null, 1.0f, 0.0f), gt0.m132171q(this.f163729b, "translationY", -this.f163722C).setDuration(200L)).start();
        bnl0.m105524M(this.f163743p, false);
        gt0.m132160f(gt0.m132170p(this.f163740m, "alpha", 0L, 30L, null, 1.0f, 0.0f), new RunnableC19865a()).start();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = this.f163745r.setUpKeyboardDetectorLayout(m181985v(layoutInflater, viewGroup), new View(this.f163745r), new b30() { // from class: l.ilf
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f115576a.m181975P((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (ln7.m154967b()) {
            m181987x();
        }
        if (gra.m131778z()) {
            this.f163731d.setTextColor(this.f163745r.getResources().getColor(c9c0.f80469x));
            this.f163732e.setTextColor(this.f163745r.getResources().getColor(c9c0.f80469x));
            this.f163734g.setTextColor(this.f163745r.getResources().getColor(c9c0.f80469x));
            this.f163735h.setTextColor(this.f163745r.getResources().getColor(c9c0.f80475z));
            this.f163738k.setTextColor(this.f163745r.getResources().getColor(c9c0.f80475z));
            this.f163740m.setTextColor(this.f163745r.getResources().getColor(c9c0.f80475z));
            this.f163743p.setTextColor(this.f163745r.getResources().getColor(c9c0.f80469x));
            this.f163743p.setHintTextColor(this.f163745r.getResources().getColor(c9c0.f80475z));
            wpe.m207454a(this.f163743p);
            this.f163744q.setTextColor(this.f163745r.getResources().getColorStateList(c9c0.f80379U0));
        }
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: v */
    public View m181985v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return slf.m186563b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ExpandProfileLikeAct getAct() {
        return this.f163745r;
    }

    /* JADX INFO: renamed from: x */
    public final void m181987x() {
        PopupWindow popupWindow = new PopupWindow();
        this.f163727H = popupWindow;
        popupWindow.setContentView(getAct().inflater().inflate(kec0.f125330Ae, (ViewGroup) null, false));
        this.f163727H.setInputMethodMode(1);
        this.f163727H.setWidth(0);
        this.f163727H.setHeight(0);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(clf clfVar) {
        this.f163746s = clfVar;
    }

    /* JADX INFO: renamed from: z */
    public final void m181989z() {
        m181981Z(!TextUtils.isEmpty(this.f163753z));
        if (CoreModule.m30930K().me_().isJailedOrRestrict() || CoreModule.m30930K().me_().isBanned()) {
            gta.m132210e().m132214d().mo34768Vc();
            return;
        }
        final String strMo121745d = this.f163753z;
        if (TextUtils.isEmpty(strMo121745d)) {
            strMo121745d = this.f163752y.mo121745d();
        }
        if (uqb0.f180394Z.m95954K(strMo121745d)) {
            getAct().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.hlf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110498a.m181970K(strMo121745d);
                }
            }).m21567z0();
        } else {
            m181982a0(strMo121745d, !TextUtils.isEmpty(this.f163753z));
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rlf$c */
    public class C19867c implements TextWatcher {
        public C19867c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rlf.this.f163753z = editable.toString().trim();
            rlf rlfVar = rlf.this;
            rlfVar.f163738k.setText(rlfVar.f163753z);
            rlf rlfVar2 = rlf.this;
            rlfVar2.m181983b0(rlfVar2.f163753z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

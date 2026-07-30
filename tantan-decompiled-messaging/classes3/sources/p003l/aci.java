package p003l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.match.view.FemaleMatchSuccessLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bci;
import l.c30;
import l.cwf0;
import l.e51;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.t100;
import l.tz00;
import l.upa;
import l.v930;
import l.x2c0;
import l.xdl0;
import l.xdx;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p028v.VDraweeView;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class aci {

    /* JADX INFO: renamed from: F */
    public static volatile aci f2107F;

    /* JADX INFO: renamed from: a */
    public VRelative f2113a;

    /* JADX INFO: renamed from: b */
    public FemaleMatchSuccessLayout f2114b;

    /* JADX INFO: renamed from: c */
    public View f2115c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f2116d;

    /* JADX INFO: renamed from: e */
    public VText f2117e;

    /* JADX INFO: renamed from: f */
    public TextView f2118f;

    /* JADX INFO: renamed from: g */
    public TextView f2119g;

    /* JADX INFO: renamed from: h */
    public VText f2120h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f2121i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f2122j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f2123k;

    /* JADX INFO: renamed from: l */
    public SVGAnimationView f2124l;

    /* JADX INFO: renamed from: m */
    public Act f2125m;

    /* JADX INFO: renamed from: n */
    public User f2126n;

    /* JADX INFO: renamed from: o */
    public PopupWindow f2127o;

    /* JADX INFO: renamed from: x */
    public cwf0 f2136x;

    /* JADX INFO: renamed from: p */
    public final int f2128p = t100.d * 2;

    /* JADX INFO: renamed from: q */
    public final int f2129q = t100.c * 2;

    /* JADX INFO: renamed from: r */
    public float f2130r = 0.0f;

    /* JADX INFO: renamed from: s */
    public float f2131s = 0.0f;

    /* JADX INFO: renamed from: t */
    public final float f2132t = t100.d(200.0f);

    /* JADX INFO: renamed from: u */
    public float f2133u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f2134v = 0.0f;

    /* JADX INFO: renamed from: w */
    public boolean f2135w = true;

    /* JADX INFO: renamed from: y */
    public boolean f2137y = false;

    /* JADX INFO: renamed from: z */
    public String f2138z = "";

    /* JADX INFO: renamed from: A */
    public int f2108A = 0;

    /* JADX INFO: renamed from: B */
    public int f2109B = 0;

    /* JADX INFO: renamed from: C */
    public final Runnable f2110C = new Runnable() { // from class: l.xbi
        @Override // java.lang.Runnable
        public final void run() {
            this.f8761a.m2816W();
        }
    };

    /* JADX INFO: renamed from: D */
    public final Interpolator f2111D = new PathInterpolator(0.17f, 0.17f, 0.7f, 1.0f);

    /* JADX INFO: renamed from: E */
    public float f2112E = 0.0f;

    /* JADX INFO: renamed from: G */
    public static Act m2768G() {
        Act.r rVarForeground_ = Act.foreground_();
        if (NullChecker.a(rVarForeground_) && NullChecker.a(rVarForeground_.a) && NullChecker.a(rVarForeground_.a.get()) && (rVarForeground_.a.get() instanceof Act)) {
            return (Act) rVarForeground_.a.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m2771b0(Act act, User user, boolean z, String str) {
        m2773c0(act, user, z, str, false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2772c(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    public static void m2773c0(final Act act, final User user, final boolean z, final String str, final boolean z2) {
        act.runOnUiThread(new Runnable() { // from class: l.cbi
            @Override // java.lang.Runnable
            public final void run() {
                aci.m2778g(user, z2, z, str, act);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public static void m2775d0(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Act actM2768G = m2768G();
        if (c30.f(actM2768G)) {
            actM2768G.duringCreated(CoreModule.c.f0.ap(str).map(new w9j() { // from class: l.nbi
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return CoreModule.c.e0.Pa(str);
                }
            })).subscribe((m250) mkd0.H(new e30() { // from class: l.sbi
                @Override // p003l.e30
                public final void call(Object obj) {
                    aci.m2789r(actM2768G, z, (User) obj);
                }
            }, new e30() { // from class: l.tbi
                @Override // p003l.e30
                public final void call(Object obj) {
                    aci.m2772c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2778g(User user, boolean z, boolean z2, String str, Act act) {
        if (user == null) {
            return;
        }
        if (f2107F == null) {
            f2107F = new aci();
        }
        f2107F.f2135w = z;
        f2107F.f2137y = z2;
        f2107F.f2138z = str;
        if (!NullChecker.a(f2107F.f2127o) || !f2107F.f2127o.isShowing()) {
            f2107F.m2820a0(act, user);
        } else {
            if (NullChecker.a(f2107F.f2126n) && TextUtils.equals(((DbObject) user).id, ((DbObject) f2107F.f2126n).id)) {
                return;
            }
            f2107F.m2823z(act, user);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m2786o() {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m2789r(Act act, boolean z, User user) {
        if (c30.f(act) && v930.h() == TabName.Card && (act instanceof NewMainAct) && ((NewMainAct) act).g6()) {
            m2771b0(act, user, z, "");
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m2793v() {
    }

    /* JADX INFO: renamed from: A */
    public void m2795A() {
        this.f2125m.runOnUiThread(new Runnable() { // from class: l.ebi
            @Override // java.lang.Runnable
            public final void run() {
                this.f3240a.m2806M();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m2796B() {
        final int iB = xdx.B(this.f2125m) + t100.O + t100.j;
        final PathInterpolator pathInterpolator = new PathInterpolator(0.26f, 0.0f, 0.6f, 0.57f);
        pa30.m6815k(pa30.m6816l().female_exit_time / 2, new e30() { // from class: l.fbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3485a.m2807N(iB, pathInterpolator, (Float) obj);
            }
        }, new gbi(this));
    }

    /* JADX INFO: renamed from: C */
    public final void m2797C() {
        int i = pa30.m6816l().female_enter_time;
        SVGALoader.with(this.f2125m).from(upa.z() ? "https://auto.tancdn.com/v1/raw/24c3c444-03a1-4520-acd3-043962688f0714.svga" : "core_female_match_success_heart_bg.svga").isCacheable(true).autoPlay(true).repeatCount(-1).into(this.f2116d);
        e51.H(this.f2125m, new Runnable() { // from class: l.jbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f4608a.m2808O();
            }
        }, i - 200);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.34f, 1.6f, 0.61f, 0.96f);
        final int i2 = t100.v;
        final int iB = xdx.B(this.f2125m) + t100.O + t100.j;
        pa30.m6815k(i, new e30() { // from class: l.kbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4888a.m2809P(iB, pathInterpolator, i2, (Float) obj);
            }
        }, new Runnable() { // from class: l.lbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f5239a.m2822y();
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m2798D() {
        float fD = t100.d(200.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2122j.getLayoutParams();
        this.f2130r = fD - ((layoutParams.topMargin + (layoutParams.height / 2.0f)) - (this.f2114b.getHeight() / 2.0f));
        this.f2131s = (this.f2114b.getWidth() / 2.0f) - ((layoutParams.width / 2.0f) + layoutParams.leftMargin);
        this.f2133u = ((((this.f2109B - this.f2108A) - (layoutParams.height / 2.0f)) - layoutParams.topMargin) - this.f2130r) + (this.f2122j.getHeight() / 2.0f);
        pa30.m6815k(pa30.m6816l().female_exit_time, new e30() { // from class: l.mbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5571a.m2810Q((Float) obj);
            }
        }, new gbi(this));
    }

    /* JADX INFO: renamed from: E */
    public final void m2799E(float f) {
        pa30.m6807c(this.f2114b.getWidth(), this.f2122j.getWidth() + this.f2128p, f, new e30() { // from class: l.obi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6079a.m2811R((Float) obj);
            }
        });
        pa30.m6807c(this.f2114b.getHeight(), this.f2122j.getHeight() + this.f2128p, f, new e30() { // from class: l.pbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6346a.m2812S((Float) obj);
            }
        });
        pa30.m6810f(this.f2114b, 0.0f, 10.0f, f);
        pa30.m6814j(this.f2114b, 0.0f, this.f2132t, f);
        pa30.m6813i(this.f2121i, 0.0f, this.f2131s, f);
        pa30.m6814j(this.f2121i, 0.0f, this.f2130r, f);
        pa30.m6809e(this.f2121i, 1.0f, 0.0f, f);
        pa30.m6813i(this.f2122j, 0.0f, this.f2131s, f);
        pa30.m6814j(this.f2122j, 0.0f, this.f2130r, f);
        pa30.m6809e(this.f2117e, 1.0f, 0.0f, f);
        pa30.m6809e(this.f2118f, 1.0f, 0.0f, f);
    }

    /* JADX INFO: renamed from: F */
    public final void m2800F(float f) {
        pa30.m6807c(this.f2122j.getWidth() + this.f2128p, (this.f2122j.getWidth() / 2.0f) + this.f2129q, f, new e30() { // from class: l.qbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6619a.m2813T((Float) obj);
            }
        });
        pa30.m6807c(this.f2122j.getHeight() + this.f2128p, (this.f2122j.getHeight() / 2.0f) + this.f2129q, f, new e30() { // from class: l.rbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6828a.m2814U((Float) obj);
            }
        });
        pa30.m6811g(this.f2122j, 1.0f, 0.5f, f);
        pa30.m6812h(this.f2122j, 1.0f, 0.5f, f);
        float interpolation = this.f2111D.getInterpolation(f);
        SimpleDraweeView simpleDraweeView = this.f2122j;
        float f2 = this.f2130r;
        pa30.m6814j(simpleDraweeView, f2, this.f2133u + f2, interpolation);
        FemaleMatchSuccessLayout femaleMatchSuccessLayout = this.f2114b;
        float f3 = this.f2132t;
        pa30.m6814j(femaleMatchSuccessLayout, f3, this.f2133u + f3, interpolation);
        SimpleDraweeView simpleDraweeView2 = this.f2122j;
        if (f < 0.9f) {
            simpleDraweeView2.setAlpha(1.0f);
            this.f2114b.setAlpha(1.0f);
        } else {
            float f4 = (f * 10.0f) - 9.0f;
            pa30.m6809e(simpleDraweeView2, 1.0f, 0.0f, f4);
            pa30.m6809e(this.f2114b, 1.0f, 0.0f, f4);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2801H(Act act) {
        String str = this.f2137y ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f2138z)) {
            str = this.f2138z;
        }
        zvf0.u("e_matched_push_other_area", "p_successful_match_view", new j760[]{j760.a("matched_received_page_type", str)});
        e51.J(this.f2110C);
        act.startActivity(MessagesAct.m2041p2(act, ((DbObject) this.f2126n).id, false, false, false, false, null, 2, ""));
        m2795A();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I */
    public final void m2802I() {
        final String strM3 = upa.m3();
        if (TextUtils.isEmpty(strM3)) {
            strM3 = "[" + App.e.getString(R.string.g4) + "]";
        }
        final String str = "EMOJI_63";
        xdl0.E0(this.f2120h, new View.OnClickListener() { // from class: l.dbi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2929a.m2815V(str, strM3, view);
            }
        });
        m2819Z(this.f2118f, this.f2126n);
        qib0.G.L0(this.f2122j, this.f2126n.fp().profileBig().formatted());
        qib0.G.L0(this.f2121i, CoreModule.c.e0.na().fp().profileBig().formatted());
        this.f2120h.setText(strM3);
        this.f2117e.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f2114b.getLayoutParams();
        this.f2114b.setPivotX(((t100.c().widthPixels - layoutParams.leftMargin) - layoutParams.rightMargin) / 2.0f);
        this.f2114b.setPivotY(layoutParams.height / 2.0f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f2122j.getLayoutParams();
        this.f2122j.setPivotX(layoutParams2.width / 2.0f);
        this.f2122j.setPivotY(layoutParams2.height / 2.0f);
        this.f2121i.setPivotX(layoutParams2.width / 2.0f);
        this.f2121i.setPivotY(layoutParams2.height / 2.0f);
        m2797C();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m2803J(Act act) {
        SVGALoader.with(act).from("core_female_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1).into(this.f2124l);
        m2822y();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2804K(float f, Interpolator interpolator, float f2, Float f3) {
        pa30.m6809e(this.f2123k, 1.0f, 0.0f, Math.min(f3.floatValue() / 0.6f, 1.0f));
        pa30.m6813i(this.f2122j, f, 0.0f, interpolator.getInterpolation(f3.floatValue()));
        pa30.m6809e(this.f2122j, 0.0f, 1.0f, f3.floatValue());
        pa30.m6809e(this.f2118f, 1.0f, 0.0f, f3.floatValue());
        pa30.m6814j(this.f2118f, 0.0f, -f2, f3.floatValue());
        pa30.m6809e(this.f2119g, 0.0f, 1.0f, f3.floatValue());
        pa30.m6814j(this.f2119g, f2, 0.0f, f3.floatValue());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2805L(User user) {
        xdl0.M(this.f2123k, false);
        xdl0.M(this.f2119g, false);
        m2819Z(this.f2118f, user);
        this.f2118f.setAlpha(1.0f);
        this.f2118f.setTranslationY(0.0f);
        this.f2126n = user;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2806M() {
        if (NullChecker.a(this.f2127o)) {
            this.f2127o.dismiss();
            this.f2127o = null;
            f2107F = null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m2807N(int i, Interpolator interpolator, Float f) {
        pa30.m6814j(this.f2113a, 0.0f, -i, interpolator.getInterpolation(f.floatValue()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m2808O() {
        SVGALoader.SVGARequestBuilder sVGARequestBuilderRepeatCount = SVGALoader.with(this.f2125m).from(upa.z() ? "https://auto.tancdn.com/v1/raw/21a07bab-d71a-48a2-8f84-c161a936051714.svga" : "core_female_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1);
        if (upa.z()) {
            sVGARequestBuilderRepeatCount.frameMode(SVGAnimationView.FrameMode.AFTER);
        }
        sVGARequestBuilderRepeatCount.into(this.f2124l);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m2809P(int i, Interpolator interpolator, int i2, Float f) {
        pa30.m6814j(this.f2113a, -i, 0.0f, Math.min(1.0f, f.floatValue() / 0.6f));
        pa30.m6809e(this.f2113a, 0.0f, 1.0f, Math.min(1.0f, f.floatValue() / 0.6f));
        if (f.floatValue() < 0.3f) {
            this.f2121i.setAlpha(0.0f);
            this.f2122j.setAlpha(0.0f);
            return;
        }
        float fFloatValue = (f.floatValue() - 0.3f) / 0.7f;
        float f2 = fFloatValue / 0.3f;
        this.f2122j.setAlpha(Math.min(1.0f, f2));
        this.f2121i.setAlpha(Math.min(1.0f, f2));
        float interpolation = interpolator.getInterpolation(fFloatValue);
        pa30.m6813i(this.f2121i, -i2, 0.0f, interpolation);
        pa30.m6813i(this.f2122j, i2, 0.0f, interpolation);
        float fMin = Math.min(1.0f, fFloatValue * 2.0f);
        pa30.m6810f(this.f2121i, 0.0f, -10.0f, fMin);
        pa30.m6810f(this.f2122j, 0.0f, 10.0f, fMin);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m2810Q(Float f) {
        if (f.floatValue() <= 0.3f) {
            m2799E(f.floatValue() / 0.3f);
        } else {
            if (this.f2134v <= 0.3f && f.floatValue() > 0.3f) {
                m2799E(1.0f);
            }
            m2800F((f.floatValue() / 0.7f) - 0.42857146f);
        }
        if (f.floatValue() > 0.6f && !CoreModule.c.e0.z7()) {
            CoreModule.c.e0.r9(true);
        }
        this.f2134v = f.floatValue();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m2811R(Float f) {
        this.f2114b.setMoveX(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m2812S(Float f) {
        this.f2114b.setMoveY(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m2813T(Float f) {
        this.f2114b.setMoveX(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m2814U(Float f) {
        this.f2114b.setMoveY(f.floatValue() / 2.0f);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m2815V(String str, String str2, View view) {
        e51.J(this.f2110C);
        pxe.m6948c().m6959l(str);
        tz00.j(this.f2125m, this.f2126n, str2, false, new Runnable() { // from class: l.hbi
            @Override // java.lang.Runnable
            public final void run() {
                aci.m2786o();
            }
        }, new Runnable() { // from class: l.ibi
            @Override // java.lang.Runnable
            public final void run() {
                aci.m2793v();
            }
        }, "");
        if (!this.f2135w) {
            m2796B();
            return;
        }
        NewMainAct newMainAct = this.f2125m;
        if ((newMainAct instanceof NewMainAct) && newMainAct.Z5().U()) {
            m2798D();
        } else {
            m2796B();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m2816W() {
        if (NullChecker.a(this.f2127o) && this.f2127o.isShowing()) {
            m2796B();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean m2817X(int i, Act act, View view, MotionEvent motionEvent) {
        if (((int) motionEvent.getY()) >= i) {
            return act.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f2112E = motionEvent.getY();
            return false;
        }
        if (motionEvent.getAction() != 1 || motionEvent.getX() >= t100.c().widthPixels - t100.d(72.0f)) {
            return false;
        }
        float y = motionEvent.getY() - this.f2112E;
        if (Math.abs(y) < 10.0f) {
            m2801H(act);
            return false;
        }
        if (y >= 0.0f) {
            return false;
        }
        e51.J(this.f2110C);
        m2796B();
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m2818Y() {
        cwf0 cwf0Var = this.f2136x;
        if (cwf0Var == null) {
            return;
        }
        cwf0Var.k();
        this.f2136x.j();
    }

    /* JADX INFO: renamed from: Z */
    public final void m2819Z(@NonNull TextView textView, @NonNull User user) {
        String strConcat = user.name;
        if (strConcat.length() > 6) {
            strConcat = strConcat.substring(0, 6).concat("...");
        }
        if (!upa.O()) {
            textView.setText("轻触和 " + strConcat + " 聊天");
            return;
        }
        long jO = mqi0.o() - user.getLastActiveTimeMillis();
        if (jO < 300000) {
            textView.setCompoundDrawablesWithIntrinsicBounds(App.e.getResources().getDrawable(x2c0.Xd), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(t100.d(1.0f));
            textView.setText("当前在线");
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(t100.d(0.0f));
        if (jO < 3600000) {
            textView.setText(String.format("%s分钟前活跃", Long.valueOf(jO / 60000)));
            return;
        }
        if (jO < 86400000) {
            textView.setText(String.format("%s小时前活跃", Long.valueOf(jO / 3600000)));
            return;
        }
        if (jO < 172800000) {
            textView.setText("昨天活跃");
            return;
        }
        textView.setText("轻触和 " + strConcat + " 聊天");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0092 A[PHI: r7
      0x0092: PHI (r7v7 java.lang.String) = (r7v6 java.lang.String), (r7v13 java.lang.String) binds: [B:7:0x0087, B:9:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a0 */
    public final void m2820a0(final Act act, User user) {
        String str;
        this.f2125m = act;
        this.f2126n = user;
        CoreModule.c.e0.r9(false);
        View viewM2821x = m2821x(act.inflater(), null);
        this.f2108A = xdx.B(act) + t100.j;
        this.f2109B = (xdx.B(act) + t100.c().heightPixels) - t100.d(56.0f);
        xdl0.f0(viewM2821x, this.f2108A);
        PopupWindow popupWindow = new PopupWindow(viewM2821x, -1, this.f2109B, true);
        this.f2127o = popupWindow;
        popupWindow.setClippingEnabled(false);
        final int i = ((RelativeLayout.LayoutParams) this.f2114b.getLayoutParams()).height + this.f2108A;
        this.f2127o.setTouchInterceptor(new View.OnTouchListener() { // from class: l.ybi
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f9044a.m2817X(i, act, view, motionEvent);
            }
        });
        this.f2127o.showAtLocation(act.getWindow().getDecorView(), 49, 0, 0);
        this.f2127o.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.zbi
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f9287a.m2818Y();
            }
        });
        String str2 = this.f2137y ? "fisrt_liked" : "female";
        if (!TextUtils.isEmpty(this.f2138z)) {
            str2 = this.f2138z;
            str = TextUtils.equals(str2, "long_time_no_see") ? "female" : str2;
        }
        this.f2136x = new cwf0("p_successful_match_view", xdx.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("match_source", this.f2137y ? "negative" : "positive");
            jSONObject.put("moments_user_id", ((DbObject) user).id);
            jSONObject.put("matched_received_page_type", str);
            if (upa.r1()) {
                jSONObject.put("is_matched_longtimenosee", TextUtils.equals(this.f2138z, "long_time_no_see") ? 1 : 0);
            }
            this.f2136x.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        this.f2136x.i();
        this.f2136x.l();
        m2802I();
    }

    /* JADX INFO: renamed from: x */
    public View m2821x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bci.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public final void m2822y() {
        e51.H(this.f2125m, this.f2110C, 5000L);
    }

    /* JADX INFO: renamed from: z */
    public final void m2823z(final Act act, final User user) {
        e51.J(this.f2110C);
        int i = pa30.m6816l().female_enter_time;
        final float f = t100.y;
        final float f2 = t100.o;
        qib0.G.L0(this.f2123k, this.f2126n.fp().profileBig().formatted());
        xdl0.M(this.f2123k, true);
        qib0.G.L0(this.f2122j, user.fp().profileBig().formatted());
        xdl0.M(this.f2119g, true);
        m2819Z(this.f2119g, user);
        e51.H(act, new Runnable() { // from class: l.ubi
            @Override // java.lang.Runnable
            public final void run() {
                this.f7947a.m2803J(act);
            }
        }, i - 200);
        final OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
        pa30.m6815k(i, new e30() { // from class: l.vbi
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8268a.m2804K(f, overshootInterpolator, f2, (Float) obj);
            }
        }, new Runnable() { // from class: l.wbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f8529a.m2805L(user);
            }
        });
    }
}

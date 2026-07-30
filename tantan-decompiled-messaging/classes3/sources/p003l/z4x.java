package p003l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p001ui.match.C0038a;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.vip.likers.LikersItemView;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import l.bt0;
import l.dyq;
import l.f6c0;
import l.fyq;
import l.hpd0;
import l.jqf0;
import l.lqf0;
import l.lsi0;
import l.o6j0;
import l.ohf0;
import l.qib0;
import l.roj0;
import l.rs4;
import l.t100;
import l.u4c0;
import l.upa;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zqf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VButton;
import p028v.VButton_FakeShadow;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VImage;
import p028v.VLinear;
import p028v.VLinear_FillerMeasure;
import p028v.VScroll_Horizontal;
import p028v.VText;
import p028v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class z4x implements yvl<i4x> {

    /* JADX INFO: renamed from: A */
    public VButton f9199A;

    /* JADX INFO: renamed from: B */
    public VButton f9200B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f9201C;

    /* JADX INFO: renamed from: D */
    public VButton f9202D;

    /* JADX INFO: renamed from: E */
    public VButton f9203E;

    /* JADX INFO: renamed from: F */
    public VText f9205F;

    /* JADX INFO: renamed from: G */
    public RelativeLayout f9207G;

    /* JADX INFO: renamed from: H */
    public VEditText f9209H;

    /* JADX INFO: renamed from: I */
    public VText f9211I;

    /* JADX INFO: renamed from: I0 */
    public boolean f9212I0;

    /* JADX INFO: renamed from: J */
    public VScroll_Horizontal f9213J;

    /* JADX INFO: renamed from: K */
    public VLinear f9215K;

    /* JADX INFO: renamed from: L */
    public VButton_FakeShadow f9216L;

    /* JADX INFO: renamed from: M */
    public FrameLayout f9217M;

    /* JADX INFO: renamed from: N */
    public VText f9218N;

    /* JADX INFO: renamed from: O */
    public SceneView f9219O;

    /* JADX INFO: renamed from: P */
    public MatchAct f9220P;

    /* JADX INFO: renamed from: Q */
    public i4x f9221Q;

    /* JADX INFO: renamed from: W */
    public boolean f9227W;

    /* JADX INFO: renamed from: X */
    public boolean f9228X;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f9231a;

    /* JADX INFO: renamed from: b */
    public VText f9232b;

    /* JADX INFO: renamed from: c */
    public View f9233c;

    /* JADX INFO: renamed from: d */
    public View f9234d;

    /* JADX INFO: renamed from: e */
    public VButton f9235e;

    /* JADX INFO: renamed from: f */
    public SceneView f9236f;

    /* JADX INFO: renamed from: g */
    public View f9237g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f9238h;

    /* JADX INFO: renamed from: i */
    public VImage f9239i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f9240j;

    /* JADX INFO: renamed from: k */
    public VImage f9241k;

    /* JADX INFO: renamed from: k0 */
    public int f9242k0;

    /* JADX INFO: renamed from: l */
    public VImage f9243l;

    /* JADX INFO: renamed from: m */
    public GradientBgButton f9244m;

    /* JADX INFO: renamed from: n */
    public VLinear_FillerMeasure f9245n;

    /* JADX INFO: renamed from: o */
    public VText f9246o;

    /* JADX INFO: renamed from: p */
    public VText f9247p;

    /* JADX INFO: renamed from: p0 */
    public fyq f9248p0;

    /* JADX INFO: renamed from: q */
    public LinearLayout f9249q;

    /* JADX INFO: renamed from: r */
    public VText f9250r;

    /* JADX INFO: renamed from: s */
    public VText f9251s;

    /* JADX INFO: renamed from: t */
    public VText_AutoFit f9252t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f9253u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f9254v;

    /* JADX INFO: renamed from: w */
    public VButton_FakeShadow f9255w;

    /* JADX INFO: renamed from: x */
    public VButton_FakeShadow f9256x;

    /* JADX INFO: renamed from: y */
    public VButton f9257y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f9258z;

    /* JADX INFO: renamed from: R */
    public boolean f9222R = false;

    /* JADX INFO: renamed from: S */
    public final int f9223S = t100.d(106.0f);

    /* JADX INFO: renamed from: T */
    public final int f9224T = t100.d(327.0f);

    /* JADX INFO: renamed from: U */
    public final int f9225U = xdl0.y0();

    /* JADX INFO: renamed from: V */
    public final int f9226V = 250;

    /* JADX INFO: renamed from: Y */
    public boolean f9229Y = true;

    /* JADX INFO: renamed from: Z */
    public String f9230Z = ServletHandler.__DEFAULT_SERVLET;

    /* JADX INFO: renamed from: E0 */
    public View.OnClickListener f9204E0 = new View.OnClickListener() { // from class: l.j4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f4574a.m9259K0(view);
        }
    };

    /* JADX INFO: renamed from: F0 */
    public View.OnClickListener f9206F0 = new View.OnClickListener() { // from class: l.q4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f6588a.m9261L0(view);
        }
    };

    /* JADX INFO: renamed from: G0 */
    public View.OnClickListener f9208G0 = new View.OnClickListener() { // from class: l.r4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f6778a.m9317M0(view);
        }
    };

    /* JADX INFO: renamed from: H0 */
    public View.OnClickListener f9210H0 = new View.OnClickListener() { // from class: l.s4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f7144a.m9318N0(view);
        }
    };

    /* JADX INFO: renamed from: J0 */
    public hpd0 f9214J0 = new hpd0("has_show_match_tag_guide_view_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: l.z4x$c */
    public class C0674c extends ohf0 {

        /* JADX INFO: renamed from: a */
        public int f9261a = xdl0.y0();

        public C0674c() {
        }

        /* JADX INFO: renamed from: c */
        public void m9340c(jqf0 jqf0Var) {
            float fD = 1.0f - ((float) jqf0Var.d());
            z4x.this.f9256x.setTranslationX(this.f9261a * fD);
            z4x.this.f9255w.setTranslationX((-fD) * this.f9261a);
        }
    }

    /* JADX INFO: renamed from: l.z4x$d */
    public static class C0675d {
        /* JADX INFO: renamed from: b */
        public static void m9342b(z4x z4xVar, View view) {
            z4xVar.f9231a = (RelativeLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            z4xVar.f9232b = (VText) viewGroup.getChildAt(0);
            z4xVar.f9233c = viewGroup.getChildAt(1);
            z4xVar.f9234d = viewGroup.getChildAt(2);
            z4xVar.f9235e = (VButton) viewGroup.getChildAt(3);
            z4xVar.f9236f = viewGroup.getChildAt(4);
            z4xVar.f9237g = viewGroup.getChildAt(5);
            z4xVar.f9238h = (VDraweeView) viewGroup.getChildAt(6);
            z4xVar.f9239i = (VImage) viewGroup.getChildAt(7);
            z4xVar.f9240j = (VDraweeView) viewGroup.getChildAt(8);
            z4xVar.f9241k = (VImage) viewGroup.getChildAt(9);
            z4xVar.f9243l = (VImage) viewGroup.getChildAt(10);
            z4xVar.f9244m = viewGroup.getChildAt(11);
            z4xVar.f9245n = (VLinear_FillerMeasure) viewGroup.getChildAt(12);
            z4xVar.f9246o = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
            z4xVar.f9247p = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
            z4xVar.f9249q = (LinearLayout) viewGroup.getChildAt(13);
            z4xVar.f9250r = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
            z4xVar.f9251s = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(1);
            z4xVar.f9252t = (VText_AutoFit) view.findViewById(u4c0.Pd);
            ViewGroup viewGroup2 = (ViewGroup) view;
            z4xVar.f9253u = (LinearLayout) viewGroup2.getChildAt(15);
            z4xVar.f9254v = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0);
            z4xVar.f9255w = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0)).getChildAt(0);
            z4xVar.f9256x = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0)).getChildAt(1);
            z4xVar.f9257y = (VButton) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(1);
            z4xVar.f9258z = (LinearLayout) viewGroup2.getChildAt(16);
            z4xVar.f9199A = (VButton) ((ViewGroup) viewGroup2.getChildAt(16)).getChildAt(0);
            z4xVar.f9200B = (VButton) ((ViewGroup) viewGroup2.getChildAt(16)).getChildAt(2);
            z4xVar.f9201C = (LinearLayout) viewGroup2.getChildAt(17);
            z4xVar.f9202D = (VButton) ((ViewGroup) viewGroup2.getChildAt(17)).getChildAt(0);
            z4xVar.f9203E = (VButton) ((ViewGroup) viewGroup2.getChildAt(17)).getChildAt(2);
            z4xVar.f9205F = (VText) viewGroup2.getChildAt(18);
            z4xVar.f9207G = (RelativeLayout) viewGroup2.getChildAt(19);
            z4xVar.f9209H = (VEditText) ((ViewGroup) viewGroup2.getChildAt(19)).getChildAt(0);
            z4xVar.f9211I = (VText) ((ViewGroup) viewGroup2.getChildAt(19)).getChildAt(1);
            z4xVar.f9213J = (VScroll_Horizontal) viewGroup2.getChildAt(20);
            z4xVar.f9215K = (VLinear) ((ViewGroup) viewGroup2.getChildAt(20)).getChildAt(0);
            z4xVar.f9216L = (VButton_FakeShadow) viewGroup2.getChildAt(21);
            z4xVar.f9217M = (FrameLayout) viewGroup2.getChildAt(22);
            z4xVar.f9218N = (VText) ((ViewGroup) viewGroup2.getChildAt(22)).getChildAt(0);
            z4xVar.f9219O = viewGroup2.getChildAt(23);
        }

        /* JADX INFO: renamed from: c */
        public static View m9343c(z4x z4xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.Pd, viewGroup, false);
            m9342b(z4xVar, viewInflate);
            return viewInflate;
        }
    }

    public z4x(MatchAct matchAct) {
        this.f9220P = matchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m9246B0(View view) {
        o6j0.c("e_intl_instantmatch_no_ultra_click", act().pageId(), new o6j0.a[0]);
        if (!xma.C3()) {
            this.f9221Q.m5064l1(false);
        } else if (C0038a.m652w().m653A()) {
            final User userPa = CoreModule.c.e0.Pa(this.f9221Q.f5220b);
            C0038a.m652w().m662J(act(), userPa, new d30() { // from class: l.o4x
                @Override // p003l.d30
                public final void call() {
                    this.f6040a.m9316J0(userPa);
                }
            });
        } else {
            lsi0.F(act(), act().getString(R.string.o9));
            act().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m9248D0(View view) {
        o6j0.c("e_intl_instantmatch_no_ultra_giveup", act().pageId(), new o6j0.a[0]);
        this.f9221Q.m5060h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m9250E0() {
        this.f9248p0.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m9253G0(View view) {
        this.f9221Q.m5061i1(this.f9209H.getText().toString().trim(), this.f9222R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m9256I0(View view) {
        o6j0.c("e_intl_match_sayhi", act().pageId(), new o6j0.a[0]);
        this.f9221Q.m5063k1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m9259K0(View view) {
        this.f9221Q.m5065m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m9261L0(View view) {
        if (upa.S1()) {
            o6j0.c("e_matched_later", act().pageId(), new o6j0.a[]{o6j0.a.h("match_source", this.f9221Q.m5986p0(act().f360e))});
        }
        this.f9221Q.m5060h1();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m9300n(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m9313A0(jqf0 jqf0Var) {
        jqf0Var.a(new C0674c());
        jqf0Var.o(1.0d);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9314C0() {
        return this.f9220P;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ boolean m9315H0(View.OnClickListener onClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if (!((Boolean) rs4.e.get()).booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f9209H.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            onClickListener.onClick(this.f9211I);
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m9316J0(User user) {
        C0038a.m652w().m683z(act(), user);
        CoreModule.c.P1.R.onNext(roj0.a);
        act().finish();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m9317M0(View view) {
        if (upa.S1()) {
            o6j0.c("e_matched_later", act().pageId(), new o6j0.a[]{o6j0.a.h("match_source", this.f9221Q.m5986p0(act().f360e))});
        }
        this.f9221Q.m5060h1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m9318N0(View view) {
        this.f9221Q.m5062j1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m9319O0(VText vText, int i) {
        String str;
        if (vText.getLineCount() < 4) {
            return;
        }
        int lineEnd = vText.getLayout().getLineEnd(2);
        String string = act().getString(i);
        if (string.contains("%s")) {
            String strSubstring = string.substring(string.indexOf("%s") + 2, string.length());
            int length = (lineEnd - 3) - strSubstring.length();
            if (length < 0) {
                str = vText.getText().toString().substring(0, lineEnd - 1) + "..." + strSubstring;
            } else {
                str = vText.getText().toString().substring(0, length) + "..." + strSubstring;
            }
            vText.setText(str);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m9320P0() {
        this.f9209H.setHorizontallyScrolling(false);
        this.f9209H.setImeOptions(4);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m9321Q0() {
        this.f9256x.setClickable(false);
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
    /* JADX INFO: renamed from: R0 */
    public void m9322R0(User user, User user2, int i, ArrayList<String> arrayList) {
        if (user == null || user2 == null) {
            NullChecker.b(user);
            NullChecker.b(user2);
            act().finish();
            return;
        }
        if (this.f9229Y && NullChecker.a(user2.localRelationship)) {
            this.f9229Y = false;
            int size = user2.localRelationship.status.size();
            Relationship relationship = user2.localRelationship;
            if (size > 0) {
                this.f9230Z = ((MatchFrom) relationship.status.get(0)).toString();
            } else {
                this.f9230Z = relationship.state.toString();
            }
        }
        qib0.G.J0(this.f9238h, user.fp().profileMiddle(), false);
        qib0.G.J0(this.f9240j, user2.fp().profileMiddle(), false);
        if (i == 15) {
            this.f9252t.setText(R.string.R1);
            return;
        }
        if (i == 0 || i == 12 || i == 11 || i == 13 || i == 39 || i == 37 || i == 38 || i == 10 || i == 45 || i == 47 || i == 36) {
            this.f9252t.setText(act().getString(R.string.Jh, user2.name));
            m9325U0(this.f9252t, R.string.Jh);
            return;
        }
        if (i == 1) {
            AppCompatTextView appCompatTextView = this.f9252t;
            dyq dyqVarAct = act();
            int i2 = R.string.um;
            int size2 = arrayList.size();
            String str = user2.name;
            if (size2 > 0) {
                str = str + " (" + arrayList.get(0) + ")";
            }
            appCompatTextView.setText(dyqVarAct.getString(i2, str));
            m9325U0(this.f9252t, R.string.um);
            return;
        }
        if (i == 26) {
            this.f9252t.setText(act().getString(R.string.Jh, user2.name));
            m9325U0(this.f9252t, R.string.Jh);
            return;
        }
        if (i == 48 || i == 49) {
            this.f9252t.setText(act().getString(R.string.fc, user2.name));
            m9325U0(this.f9252t, R.string.fc);
        } else if (i == 50) {
            this.f9252t.setText(act().getString(R.string.bg, user2.name));
            m9325U0(this.f9252t, R.string.bg);
        } else if (i == 51) {
            this.f9252t.setText(act().getString(R.string.dg, user2.name));
            m9325U0(this.f9252t, R.string.dg);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m9323S0() {
        act();
        ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(act().getTaskId()));
        if (arrayList == null) {
            this.f9221Q.m5052U0();
            return;
        }
        Activity activity = arrayList.size() > 0 ? (Activity) ((Act.r) arrayList.get(0)).a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f9221Q.m5052U0();
        } else {
            mep0.m6385Y0(activity, act());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m9324T0() {
        int i;
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                i = x2c0.T9;
                break;
            case "ja":
                i = x2c0.U9;
                break;
            case "ko":
                i = x2c0.V9;
                break;
            case "th":
                i = x2c0.W9;
                break;
            case "vi":
                i = x2c0.X9;
                break;
            case "zh":
                if (Locale.getDefault().getCountry() != "TW" && Locale.getDefault().getCountry() != "HK" && Locale.getDefault().getCountry() != "MO") {
                    i = x2c0.Y9;
                    break;
                } else {
                    i = x2c0.Z9;
                    break;
                }
                break;
            default:
                i = x2c0.S9;
                break;
        }
        this.f9243l.setBackgroundResource(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final void m9325U0(final VText vText, final int i) {
        vText.post(new Runnable() { // from class: l.m4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f5539a.m9319O0(vText, i);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m9326V0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9207G.getLayoutParams();
        layoutParams.width = this.f9224T;
        layoutParams.bottomMargin = this.f9223S;
        this.f9207G.setLayoutParams(layoutParams);
        this.f9207G.setBackgroundResource(x2c0.sr);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m9327W0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9207G.getLayoutParams();
        layoutParams.width = this.f9225U;
        this.f9207G.setLayoutParams(layoutParams);
        this.f9207G.setBackgroundResource(w0c0.b2);
    }

    /* JADX INFO: renamed from: X0 */
    public void m9328X0() {
        if (xdl0.O0(this.f9213J)) {
            if (this.f9212I0) {
                o6j0.h("e_match_label", act().pageId(), new o6j0.a[]{o6j0.a.h("is_label", "1")});
            } else {
                o6j0.h("e_match_label", act().pageId(), new o6j0.a[]{o6j0.a.h("is_label", "0")});
            }
        }
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        final jqf0 jqf0VarC = zqf0.h().c();
        jqf0VarC.p(new lqf0(300.0d, 13.0d));
        act().postDelayed(new Runnable() { // from class: l.t4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f7408a.m9313A0(jqf0VarC);
            }
        }, 600L);
        AppCompatTextView appCompatTextView = this.f9218N;
        Property property = View.ALPHA;
        ArrayList arrayListF0 = vwb.f0(new Animator[]{bt0.l(appCompatTextView, property, 0L, 600L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f9244m, property, 0L, 600L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f9238h, property, 0L, 480L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f9240j, property, 0L, 480L, (Interpolator) null, new float[]{1.0f}), bt0.l(this.f9238h, bt0.i, 0L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f}), bt0.l(this.f9240j, bt0.i, 0L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f}), bt0.l(this.f9244m, bt0.i, 200L, 800L, new OvershootInterpolator(2.0f), new float[]{1.0f}), bt0.l(this.f9252t, property, 480L, 120L, (Interpolator) null, new float[]{1.0f}), bt0.p(this.f9257y, "translationY", 600L, 200L, new OvershootInterpolator(1.2f), new float[]{0.0f})});
        if (this.f9221Q.m5051S0() == 15) {
            this.f9239i.setVisibility(0);
            this.f9241k.setVisibility(0);
            arrayListF0.add(bt0.l(this.f9239i, bt0.i, 0L, 800L, (Interpolator) null, new float[]{0.5f, 1.0f}));
            arrayListF0.add(bt0.l(this.f9239i, property, 0L, 800L, (Interpolator) null, new float[]{0.0f, 1.0f}));
            arrayListF0.add(bt0.l(this.f9241k, bt0.i, 0L, 800L, (Interpolator) null, new float[]{0.5f, 1.0f}));
            arrayListF0.add(bt0.l(this.f9241k, property, 0L, 800L, (Interpolator) null, new float[]{0.0f, 1.0f}));
        }
        return bt0.b(this.f9238h, bt0.z((Animator[]) arrayListF0.toArray(new Animator[arrayListF0.size()])));
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListF0 = vwb.f0(new Animator[]{bt0.l(this.f9238h, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.l(this.f9244m, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.p(this.f9238h, "alpha", 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.l(this.f9240j, bt0.i, 0L, 500L, anticipateInterpolator, new float[]{0.0f}), bt0.p(this.f9240j, "alpha", 0L, 500L, anticipateInterpolator, new float[]{0.0f})});
        if (this.f9221Q.m5051S0() == 15) {
            arrayListF0.add(bt0.l(this.f9239i, bt0.i, 0L, 500L, (Interpolator) null, new float[]{0.5f}));
            AppCompatImageView appCompatImageView = this.f9239i;
            Property property = View.ALPHA;
            arrayListF0.add(bt0.l(appCompatImageView, property, 0L, 500L, (Interpolator) null, new float[]{0.0f}));
            arrayListF0.add(bt0.l(this.f9241k, bt0.i, 0L, 500L, (Interpolator) null, new float[]{0.5f}));
            arrayListF0.add(bt0.l(this.f9241k, property, 0L, 500L, (Interpolator) null, new float[]{0.0f}));
        }
        LikersItemView.y.onNext(roj0.a);
        return bt0.b(this.f9238h, bt0.z((Animator[]) arrayListF0.toArray(new Animator[arrayListF0.size()])));
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
        m9332s0(i);
        int i3 = this.f9242k0;
        if (i - i3 > 0 || i > 0) {
            if (!this.f9222R) {
                m9334u0();
            }
            this.f9222R = true;
        } else if (i - i3 < 0) {
            if (this.f9222R) {
                m9333t0();
            }
            this.f9222R = false;
        }
        this.f9242k0 = i;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9330q0(layoutInflater, viewGroup);
    }

    @Override // p003l.yvl
    public void initAnimationState() {
        this.f9218N.setAlpha(0.0f);
        this.f9252t.setAlpha(0.0f);
        this.f9238h.setAlpha(0.0f);
        xdl0.t0(this.f9238h, 0.1f);
        this.f9240j.setAlpha(0.0f);
        xdl0.t0(this.f9240j, 0.1f);
        xdl0.t0(this.f9244m, 0.0f);
        int iY0 = xdl0.y0();
        this.f9256x.setTranslationX(iY0);
        this.f9255w.setTranslationX(-iY0);
        this.f9257y.setTranslationY(t100.d(80.0f));
    }

    /* JADX INFO: renamed from: q0 */
    public View m9330q0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0675d.m9343c(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f9220P;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m9332s0(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9207G.getLayoutParams();
        layoutParams.bottomMargin = i;
        int i2 = this.f9223S;
        if (i < i2) {
            layoutParams.bottomMargin = i2;
        }
        this.f9207G.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public void m9333t0() {
        if (this.f9228X) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f9225U, this.f9224T);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new C0673b());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n4x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5832a.m9338y0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m9334u0() {
        if (this.f9227W) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f9224T, this.f9225U);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new C0672a());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p4x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6312a.m9339z0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m9329i1(i4x i4xVar) {
        this.f9221Q = i4xVar;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m9336w0() {
        this.f9236f.setVisibility(0);
        this.f9236f.d(new String[]{"animations/xmas_lanterns/config.xml", "animations/xmas_lanterns/pic"});
        this.f9236f.b(true);
        this.f9219O.setVisibility(0);
        this.f9219O.d(new String[]{"animations/xmas_snowflakes/config.xml", "animations/xmas_snowflakes/pic"});
        this.f9219O.b(true);
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
    /* JADX INFO: renamed from: x0 */
    public void m9337x0(boolean z, int i) {
        if (this.f9248p0 == null) {
            this.f9248p0 = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.u4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f7924a.m9250E0();
            }
        });
        this.f9255w.setOnClickListener(this.f9204E0);
        final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.v4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8207a.m9253G0(view);
            }
        };
        xdl0.E0(this.f9211I, onClickListener);
        this.f9209H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.w4x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f8487a.m9315H0(onClickListener, textView, i2, keyEvent);
            }
        });
        this.f9209H.setOnClickListener(new View.OnClickListener() { // from class: l.x4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z4x.m9300n(view);
            }
        });
        this.f9256x.setOnClickListener(this.f9206F0);
        this.f9216L.setOnClickListener(this.f9206F0);
        this.f9200B.setOnClickListener(this.f9204E0);
        this.f9199A.setOnClickListener(this.f9206F0);
        this.f9202D.setOnClickListener(this.f9206F0);
        this.f9257y.setOnClickListener(this.f9210H0);
        this.f9235e.setOnClickListener(this.f9210H0);
        if (i == 10 || i == 26) {
            this.f9218N.setTypeface(eqh0.m3924c(2));
            this.f9218N.setText(R.string.xh);
            this.f9244m.setVisibility(4);
        } else if (i == 1) {
            this.f9244m.setEmpty(true);
            this.f9244m.setBackgroundResource(x2c0.Gr);
            ((AnimationDrawable) this.f9244m.getBackground()).start();
            this.f9218N.setTypeface(eqh0.m3924c(2));
            this.f9218N.setText(R.string.vm);
        } else if (i == 12 || i == 11 || (i == 13 && vdj.c())) {
            this.f9218N.setTypeface(eqh0.m3924c(2));
            this.f9218N.setText(R.string.xh);
            boolean zV = IntlCountryCodeController.v();
            GradientBgButton gradientBgButton = this.f9244m;
            if (zV) {
                gradientBgButton.setIcon(act().drawable(x2c0.Bp));
            } else {
                gradientBgButton.setIcon(act().drawable(x2c0.Yr));
            }
            this.f9244m.setButtonColorStart(act().color(w0c0.J1));
            this.f9244m.setButtonColorEnd(act().color(w0c0.I1));
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.o(act().color(w0c0.I1), t100.d(3.0f));
            roundingParams.v(true);
            if (i == 12) {
                this.f9238h.getHierarchy().H(roundingParams);
            } else if (i == 11) {
                this.f9240j.getHierarchy().H(roundingParams);
            } else if (i == 13) {
                this.f9238h.getHierarchy().H(roundingParams);
                this.f9240j.getHierarchy().H(roundingParams);
            }
        } else if (i == 39 || i == 37 || i == 38) {
            this.f9218N.setTypeface(eqh0.m3924c(2));
            this.f9218N.setText(R.string.xh);
            this.f9244m.setIcon(act().drawable(x2c0.Lp));
            this.f9244m.setButtonColorStart(act().color(w0c0.J1));
            this.f9244m.setButtonColorEnd(act().color(w0c0.I1));
            RoundingParams roundingParams2 = new RoundingParams();
            roundingParams2.o(act().color(w0c0.I1), t100.d(3.0f));
            roundingParams2.v(true);
            if (i == 39) {
                this.f9238h.getHierarchy().H(roundingParams2);
                this.f9240j.getHierarchy().H(roundingParams2);
            } else if (i == 37) {
                this.f9240j.getHierarchy().H(roundingParams2);
            } else {
                this.f9238h.getHierarchy().H(roundingParams2);
            }
        } else if (i == 14) {
            this.f9218N.setTypeface(eqh0.m3924c(2));
            this.f9218N.setText(R.string.xh);
            this.f9244m.setIcon(act().drawable(x2c0.Xr));
            this.f9244m.setButtonColorStart(act().color(w0c0.X1));
            this.f9244m.setButtonColorEnd(act().color(w0c0.W1));
            RoundingParams roundingParams3 = new RoundingParams();
            roundingParams3.o(act().color(w0c0.F1), t100.d(3.0f));
            roundingParams3.v(true);
            this.f9240j.getHierarchy().H(roundingParams3);
        } else {
            AppCompatTextView appCompatTextView = this.f9218N;
            if (i == 15) {
                appCompatTextView.setTypeface(eqh0.m3924c(2));
                this.f9218N.setText(R.string.xh);
                this.f9244m.setVisibility(4);
                m9336w0();
            } else {
                appCompatTextView.setTypeface(eqh0.m3924c(2));
                this.f9218N.setText(R.string.xh);
                this.f9244m.setVisibility(4);
            }
        }
        if (!IntlCountryCodeController.v()) {
            if (z) {
                m9323S0();
                return;
            }
            return;
        }
        this.f9218N.setTypeface(eqh0.m3924c(2));
        RoundingParams roundingParamsC = RoundingParams.c(30.0f);
        roundingParamsC.v(false);
        this.f9238h.getHierarchy().H(roundingParamsC);
        this.f9240j.getHierarchy().H(roundingParamsC);
        this.f9238h.setRotation(-15.0f);
        this.f9240j.setRotation(15.0f);
        xdl0.M0(this.f9258z, true);
        xdl0.M0(this.f9253u, false);
        if (i == 50 || i == 51) {
            this.f9218N.setTextColor(Color.parseColor("#2E2516"));
            this.f9252t.setTextColor(Color.parseColor("#2E2516"));
            xdl0.o(act(), x2c0.yu);
            this.f9200B.setBackgroundResource(x2c0.zu);
            this.f9200B.setTextColor(Color.parseColor("#F9E7FF"));
            this.f9199A.setBackgroundResource(x2c0.Au);
            this.f9199A.setTextColor(Color.parseColor("#2E2516"));
        } else {
            xdl0.o(act(), x2c0.Bu);
        }
        if (i == 47 || i == 48 || i == 49) {
            xdl0.M(this.f9243l, true);
            m9324T0();
        }
        if (i != 48 && i != 49) {
            if (i == 50) {
                xdl0.E0(this.f9200B, new View.OnClickListener() { // from class: l.k4x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f4804a.m9246B0(view);
                    }
                });
                xdl0.E0(this.f9199A, new View.OnClickListener() { // from class: l.l4x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5212a.m9248D0(view);
                    }
                });
                return;
            }
            return;
        }
        xdl0.M0(this.f9258z, false);
        xdl0.M0(this.f9201C, true);
        this.f9203E.setTypeface(eqh0.m3924c(3), 1);
        this.f9202D.setTypeface(eqh0.m3924c(3), 1);
        xdl0.E0(this.f9203E, new View.OnClickListener() { // from class: l.y4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8918a.m9256I0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m9338y0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9207G.getLayoutParams();
        layoutParams.width = iIntValue;
        this.f9207G.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m9339z0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9207G.getLayoutParams();
        layoutParams.width = iIntValue;
        this.f9207G.setLayoutParams(layoutParams);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.z4x$a */
    public class C0672a implements Animator.AnimatorListener {
        public C0672a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z4x.this.f9227W = false;
            z4x.this.m9327W0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z4x.this.f9227W = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.z4x$b */
    public class C0673b implements Animator.AnimatorListener {
        public C0673b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z4x.this.f9228X = false;
            z4x.this.m9326V0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z4x.this.f9228X = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}

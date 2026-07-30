package p149l;

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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersItemView;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import p147v.VButton;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VScroll_Horizontal;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes3.dex */
public class z4x implements yvl<i4x> {

    /* JADX INFO: renamed from: A */
    public VButton f201645A;

    /* JADX INFO: renamed from: B */
    public VButton f201646B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f201647C;

    /* JADX INFO: renamed from: D */
    public VButton f201648D;

    /* JADX INFO: renamed from: E */
    public VButton f201649E;

    /* JADX INFO: renamed from: F */
    public VText f201651F;

    /* JADX INFO: renamed from: G */
    public RelativeLayout f201653G;

    /* JADX INFO: renamed from: H */
    public VEditText f201655H;

    /* JADX INFO: renamed from: I */
    public VText f201657I;

    /* JADX INFO: renamed from: I0 */
    public boolean f201658I0;

    /* JADX INFO: renamed from: J */
    public VScroll_Horizontal f201659J;

    /* JADX INFO: renamed from: K */
    public VLinear f201661K;

    /* JADX INFO: renamed from: L */
    public VButton_FakeShadow f201662L;

    /* JADX INFO: renamed from: M */
    public FrameLayout f201663M;

    /* JADX INFO: renamed from: N */
    public VText f201664N;

    /* JADX INFO: renamed from: O */
    public SceneView f201665O;

    /* JADX INFO: renamed from: P */
    public MatchAct f201666P;

    /* JADX INFO: renamed from: Q */
    public i4x f201667Q;

    /* JADX INFO: renamed from: W */
    public boolean f201673W;

    /* JADX INFO: renamed from: X */
    public boolean f201674X;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f201677a;

    /* JADX INFO: renamed from: b */
    public VText f201678b;

    /* JADX INFO: renamed from: c */
    public View f201679c;

    /* JADX INFO: renamed from: d */
    public View f201680d;

    /* JADX INFO: renamed from: e */
    public VButton f201681e;

    /* JADX INFO: renamed from: f */
    public SceneView f201682f;

    /* JADX INFO: renamed from: g */
    public View f201683g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f201684h;

    /* JADX INFO: renamed from: i */
    public VImage f201685i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f201686j;

    /* JADX INFO: renamed from: k */
    public VImage f201687k;

    /* JADX INFO: renamed from: k0 */
    public int f201688k0;

    /* JADX INFO: renamed from: l */
    public VImage f201689l;

    /* JADX INFO: renamed from: m */
    public GradientBgButton f201690m;

    /* JADX INFO: renamed from: n */
    public VLinear_FillerMeasure f201691n;

    /* JADX INFO: renamed from: o */
    public VText f201692o;

    /* JADX INFO: renamed from: p */
    public VText f201693p;

    /* JADX INFO: renamed from: p0 */
    public fyq f201694p0;

    /* JADX INFO: renamed from: q */
    public LinearLayout f201695q;

    /* JADX INFO: renamed from: r */
    public VText f201696r;

    /* JADX INFO: renamed from: s */
    public VText f201697s;

    /* JADX INFO: renamed from: t */
    public VText_AutoFit f201698t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f201699u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f201700v;

    /* JADX INFO: renamed from: w */
    public VButton_FakeShadow f201701w;

    /* JADX INFO: renamed from: x */
    public VButton_FakeShadow f201702x;

    /* JADX INFO: renamed from: y */
    public VButton f201703y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f201704z;

    /* JADX INFO: renamed from: R */
    public boolean f201668R = false;

    /* JADX INFO: renamed from: S */
    public final int f201669S = t100.m186890d(106.0f);

    /* JADX INFO: renamed from: T */
    public final int f201670T = t100.m186890d(327.0f);

    /* JADX INFO: renamed from: U */
    public final int f201671U = xdl0.m208412y0();

    /* JADX INFO: renamed from: V */
    public final int f201672V = 250;

    /* JADX INFO: renamed from: Y */
    public boolean f201675Y = true;

    /* JADX INFO: renamed from: Z */
    public String f201676Z = "default";

    /* JADX INFO: renamed from: E0 */
    public View.OnClickListener f201650E0 = new View.OnClickListener() { // from class: l.j4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f116249a.m217148K0(view);
        }
    };

    /* JADX INFO: renamed from: F0 */
    public View.OnClickListener f201652F0 = new View.OnClickListener() { // from class: l.q4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f152680a.m217150L0(view);
        }
    };

    /* JADX INFO: renamed from: G0 */
    public View.OnClickListener f201654G0 = new View.OnClickListener() { // from class: l.r4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f157736a.m217205M0(view);
        }
    };

    /* JADX INFO: renamed from: H0 */
    public View.OnClickListener f201656H0 = new View.OnClickListener() { // from class: l.s4x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f162471a.m217206N0(view);
        }
    };

    /* JADX INFO: renamed from: J0 */
    public hpd0 f201660J0 = new hpd0("has_show_match_tag_guide_view_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: l.z4x$c */
    public class C21626c extends ohf0 {

        /* JADX INFO: renamed from: a */
        public int f201707a = xdl0.m208412y0();

        public C21626c() {
        }

        @Override // p149l.ohf0, p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            float fM142793d = 1.0f - ((float) jqf0Var.m142793d());
            z4x.this.f201702x.setTranslationX(this.f201707a * fM142793d);
            z4x.this.f201701w.setTranslationX((-fM142793d) * this.f201707a);
        }
    }

    /* JADX INFO: renamed from: l.z4x$d */
    public static class C21627d {
        /* JADX INFO: renamed from: b */
        public static void m217228b(z4x z4xVar, View view) {
            z4xVar.f201677a = (RelativeLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            z4xVar.f201678b = (VText) viewGroup.getChildAt(0);
            z4xVar.f201679c = viewGroup.getChildAt(1);
            z4xVar.f201680d = viewGroup.getChildAt(2);
            z4xVar.f201681e = (VButton) viewGroup.getChildAt(3);
            z4xVar.f201682f = (SceneView) viewGroup.getChildAt(4);
            z4xVar.f201683g = viewGroup.getChildAt(5);
            z4xVar.f201684h = (VDraweeView) viewGroup.getChildAt(6);
            z4xVar.f201685i = (VImage) viewGroup.getChildAt(7);
            z4xVar.f201686j = (VDraweeView) viewGroup.getChildAt(8);
            z4xVar.f201687k = (VImage) viewGroup.getChildAt(9);
            z4xVar.f201689l = (VImage) viewGroup.getChildAt(10);
            z4xVar.f201690m = (GradientBgButton) viewGroup.getChildAt(11);
            z4xVar.f201691n = (VLinear_FillerMeasure) viewGroup.getChildAt(12);
            z4xVar.f201692o = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
            z4xVar.f201693p = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
            z4xVar.f201695q = (LinearLayout) viewGroup.getChildAt(13);
            z4xVar.f201696r = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
            z4xVar.f201697s = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(1);
            z4xVar.f201698t = (VText_AutoFit) view.findViewById(u4c0.f173985Pd);
            ViewGroup viewGroup2 = (ViewGroup) view;
            z4xVar.f201699u = (LinearLayout) viewGroup2.getChildAt(15);
            z4xVar.f201700v = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0);
            z4xVar.f201701w = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0)).getChildAt(0);
            z4xVar.f201702x = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0)).getChildAt(1);
            z4xVar.f201703y = (VButton) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(1);
            z4xVar.f201704z = (LinearLayout) viewGroup2.getChildAt(16);
            z4xVar.f201645A = (VButton) ((ViewGroup) viewGroup2.getChildAt(16)).getChildAt(0);
            z4xVar.f201646B = (VButton) ((ViewGroup) viewGroup2.getChildAt(16)).getChildAt(2);
            z4xVar.f201647C = (LinearLayout) viewGroup2.getChildAt(17);
            z4xVar.f201648D = (VButton) ((ViewGroup) viewGroup2.getChildAt(17)).getChildAt(0);
            z4xVar.f201649E = (VButton) ((ViewGroup) viewGroup2.getChildAt(17)).getChildAt(2);
            z4xVar.f201651F = (VText) viewGroup2.getChildAt(18);
            z4xVar.f201653G = (RelativeLayout) viewGroup2.getChildAt(19);
            z4xVar.f201655H = (VEditText) ((ViewGroup) viewGroup2.getChildAt(19)).getChildAt(0);
            z4xVar.f201657I = (VText) ((ViewGroup) viewGroup2.getChildAt(19)).getChildAt(1);
            z4xVar.f201659J = (VScroll_Horizontal) viewGroup2.getChildAt(20);
            z4xVar.f201661K = (VLinear) ((ViewGroup) viewGroup2.getChildAt(20)).getChildAt(0);
            z4xVar.f201662L = (VButton_FakeShadow) viewGroup2.getChildAt(21);
            z4xVar.f201663M = (FrameLayout) viewGroup2.getChildAt(22);
            z4xVar.f201664N = (VText) ((ViewGroup) viewGroup2.getChildAt(22)).getChildAt(0);
            z4xVar.f201665O = (SceneView) viewGroup2.getChildAt(23);
        }

        /* JADX INFO: renamed from: c */
        public static View m217229c(z4x z4xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95520Pd, viewGroup, false);
            m217228b(z4xVar, viewInflate);
            return viewInflate;
        }
    }

    public z4x(MatchAct matchAct) {
        this.f201666P = matchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m217135B0(View view) {
        o6j0.m162859c("e_intl_instantmatch_no_ultra_click", getAct().pageId(), new o6j0.C18854a[0]);
        if (!xma.m210040C3()) {
            this.f201667Q.m134428l1(false);
        } else if (C8455a.m47588w().m47589A()) {
            final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f201667Q.f126211b);
            C8455a.m47588w().m47598J(getAct(), userM169430Pa, new d30() { // from class: l.o4x
                @Override // p149l.d30
                public final void call() {
                    this.f141821a.m217204J0(userM169430Pa);
                }
            });
        } else {
            lsi0.m151568F(getAct(), getAct().getString(R$string.f18787o9));
            getAct().m66873d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m217137D0(View view) {
        o6j0.m162859c("e_intl_instantmatch_no_ultra_giveup", getAct().pageId(), new o6j0.C18854a[0]);
        this.f201667Q.m134424h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m217139E0() {
        this.f201694p0.m123795h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m217142G0(View view) {
        this.f201667Q.m134425i1(this.f201655H.getText().toString().trim(), this.f201668R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m217145I0(View view) {
        o6j0.m162859c("e_intl_match_sayhi", getAct().pageId(), new o6j0.C18854a[0]);
        this.f201667Q.m134427k1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m217148K0(View view) {
        this.f201667Q.m134429m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m217150L0(View view) {
        if (upa.m194694S1()) {
            o6j0.m162859c("e_matched_later", getAct().pageId(), o6j0.C18854a.m162878h("match_source", this.f201667Q.m148672p0(getAct().f30469e)));
        }
        this.f201667Q.m134424h1();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m217189n(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m217202A0(jqf0 jqf0Var) {
        jqf0Var.m142790a(new C21626c());
        jqf0Var.m142804o(1.0d);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f201666P;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ boolean m217203H0(View.OnClickListener onClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if (!rs4.f160804e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f201655H.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m81303a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            onClickListener.onClick(this.f201657I);
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m217204J0(User user) {
        C8455a.m47588w().m47619z(getAct(), user);
        CoreModule.f17545c.f19595P1.f179756R.m132487l(roj0.f160388a);
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m217205M0(View view) {
        if (upa.m194694S1()) {
            o6j0.m162859c("e_matched_later", getAct().pageId(), o6j0.C18854a.m162878h("match_source", this.f201667Q.m148672p0(getAct().f30469e)));
        }
        this.f201667Q.m134424h1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m217206N0(View view) {
        this.f201667Q.m134426j1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m217207O0(VText vText, int i) {
        String str;
        if (vText.getLineCount() < 4) {
            return;
        }
        int lineEnd = vText.getLayout().getLineEnd(2);
        String string = getAct().getString(i);
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
    public void m217208P0() {
        this.f201655H.setHorizontallyScrolling(false);
        this.f201655H.setImeOptions(4);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m217209Q0() {
        this.f201702x.setClickable(false);
    }

    /* JADX INFO: renamed from: R0 */
    public void m217210R0(User user, User user2, int i, ArrayList<String> arrayList) {
        if (user == null || user2 == null) {
            NullChecker.m81304b(user);
            NullChecker.m81304b(user2);
            getAct().m66873d2();
            return;
        }
        if (this.f201675Y && NullChecker.m81303a(user2.localRelationship)) {
            this.f201675Y = false;
            int size = user2.localRelationship.status.size();
            Relationship relationship = user2.localRelationship;
            if (size > 0) {
                this.f201676Z = relationship.status.get(0).toString();
            } else {
                this.f201676Z = relationship.state.toString();
            }
        }
        qib0.f154691G.m102327J0(this.f201684h, user.m60124fp().profileMiddle(), false);
        qib0.f154691G.m102327J0(this.f201686j, user2.m60124fp().profileMiddle(), false);
        if (i == 15) {
            this.f201698t.setText(R$string.f18078R1);
            return;
        }
        if (i == 0 || i == 12 || i == 11 || i == 13 || i == 39 || i == 37 || i == 38 || i == 10 || i == 45 || i == 47 || i == 36) {
            this.f201698t.setText(getAct().getString(R$string.f17854Jh, user2.name));
            m217213U0(this.f201698t, R$string.f17854Jh);
            return;
        }
        if (i == 1) {
            VText_AutoFit vText_AutoFit = this.f201698t;
            MatchAct act = getAct();
            int i2 = R$string.f18981um;
            int size2 = arrayList.size();
            String str = user2.name;
            if (size2 > 0) {
                str = str + " (" + arrayList.get(0) + ")";
            }
            vText_AutoFit.setText(act.getString(i2, str));
            m217213U0(this.f201698t, R$string.f18981um);
            return;
        }
        if (i == 26) {
            this.f201698t.setText(getAct().getString(R$string.f17854Jh, user2.name));
            m217213U0(this.f201698t, R$string.f17854Jh);
            return;
        }
        if (i == 48 || i == 49) {
            this.f201698t.setText(getAct().getString(R$string.f18513fc, user2.name));
            m217213U0(this.f201698t, R$string.f18513fc);
        } else if (i == 50) {
            this.f201698t.setText(getAct().getString(R$string.f18394bg, user2.name));
            m217213U0(this.f201698t, R$string.f18394bg);
        } else if (i == 51) {
            this.f201698t.setText(getAct().getString(R$string.f18456dg, user2.name));
            m217213U0(this.f201698t, R$string.f18456dg);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m217211S0() {
        getAct();
        ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getAct().getTaskId()));
        if (arrayList == null) {
            this.f201667Q.m134417U0();
            return;
        }
        Activity activity = arrayList.size() > 0 ? arrayList.get(0).f15343a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f201667Q.m134417U0();
        } else {
            mep0.m154297Y0(activity, getAct());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m217212T0() {
        int i;
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                i = x2c0.f189758T9;
                break;
            case "ja":
                i = x2c0.f189789U9;
                break;
            case "ko":
                i = x2c0.f189820V9;
                break;
            case "th":
                i = x2c0.f189851W9;
                break;
            case "vi":
                i = x2c0.f189882X9;
                break;
            case "zh":
                if (Locale.getDefault().getCountry() != "TW" && Locale.getDefault().getCountry() != "HK" && Locale.getDefault().getCountry() != "MO") {
                    i = x2c0.f189913Y9;
                    break;
                } else {
                    i = x2c0.f189944Z9;
                    break;
                }
                break;
            default:
                i = x2c0.f189727S9;
                break;
        }
        this.f201689l.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m217213U0(final VText vText, final int i) {
        vText.post(new Runnable() { // from class: l.m4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f131340a.m217207O0(vText, i);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m217214V0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201653G.getLayoutParams();
        layoutParams.width = this.f201670T;
        layoutParams.bottomMargin = this.f201669S;
        this.f201653G.setLayoutParams(layoutParams);
        this.f201653G.setBackgroundResource(x2c0.f190566sr);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m217215W0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201653G.getLayoutParams();
        layoutParams.width = this.f201671U;
        this.f201653G.setLayoutParams(layoutParams);
        this.f201653G.setBackgroundResource(w0c0.f183834b2);
    }

    /* JADX INFO: renamed from: X0 */
    public void m217216X0() {
        if (xdl0.m208349O0(this.f201659J)) {
            if (this.f201658I0) {
                o6j0.m162864h("e_match_label", getAct().pageId(), o6j0.C18854a.m162878h("is_label", "1"));
            } else {
                o6j0.m162864h("e_match_label", getAct().pageId(), o6j0.C18854a.m162878h("is_label", "0"));
            }
        }
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        final jqf0 jqf0VarM108322c = zqf0.m219852h().m108322c();
        jqf0VarM108322c.m142805p(new lqf0(300.0d, 13.0d));
        getAct().postDelayed(new Runnable() { // from class: l.t4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f167758a.m217202A0(jqf0VarM108322c);
            }
        }, 600L);
        VText vText = this.f201664N;
        Property property = View.ALPHA;
        ArrayList arrayListM200324f0 = vwb.m200324f0(bt0.m103739l(vText, property, 0L, 600L, null, 1.0f), bt0.m103739l(this.f201690m, property, 0L, 600L, null, 1.0f), bt0.m103739l(this.f201684h, property, 0L, 480L, null, 1.0f), bt0.m103739l(this.f201686j, property, 0L, 480L, null, 1.0f), bt0.m103739l(this.f201684h, bt0.f77162i, 0L, 800L, new OvershootInterpolator(2.0f), 1.0f), bt0.m103739l(this.f201686j, bt0.f77162i, 0L, 800L, new OvershootInterpolator(2.0f), 1.0f), bt0.m103739l(this.f201690m, bt0.f77162i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f), bt0.m103739l(this.f201698t, property, 480L, 120L, null, 1.0f), bt0.m103743p(this.f201703y, "translationY", 600L, 200L, new OvershootInterpolator(1.2f), 0.0f));
        if (this.f201667Q.m134416S0() == 15) {
            this.f201685i.setVisibility(0);
            this.f201687k.setVisibility(0);
            arrayListM200324f0.add(bt0.m103739l(this.f201685i, bt0.f77162i, 0L, 800L, null, 0.5f, 1.0f));
            arrayListM200324f0.add(bt0.m103739l(this.f201685i, property, 0L, 800L, null, 0.0f, 1.0f));
            arrayListM200324f0.add(bt0.m103739l(this.f201687k, bt0.f77162i, 0L, 800L, null, 0.5f, 1.0f));
            arrayListM200324f0.add(bt0.m103739l(this.f201687k, property, 0L, 800L, null, 0.0f, 1.0f));
        }
        return bt0.m103729b(this.f201684h, bt0.m103753z((Animator[]) arrayListM200324f0.toArray(new Animator[arrayListM200324f0.size()])));
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListM200324f0 = vwb.m200324f0(bt0.m103739l(this.f201684h, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103739l(this.f201690m, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103743p(this.f201684h, "alpha", 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103739l(this.f201686j, bt0.f77162i, 0L, 500L, anticipateInterpolator, 0.0f), bt0.m103743p(this.f201686j, "alpha", 0L, 500L, anticipateInterpolator, 0.0f));
        if (this.f201667Q.m134416S0() == 15) {
            arrayListM200324f0.add(bt0.m103739l(this.f201685i, bt0.f77162i, 0L, 500L, null, 0.5f));
            VImage vImage = this.f201685i;
            Property property = View.ALPHA;
            arrayListM200324f0.add(bt0.m103739l(vImage, property, 0L, 500L, null, 0.0f));
            arrayListM200324f0.add(bt0.m103739l(this.f201687k, bt0.f77162i, 0L, 500L, null, 0.5f));
            arrayListM200324f0.add(bt0.m103739l(this.f201687k, property, 0L, 500L, null, 0.0f));
        }
        LikersItemView.f37292y.m132487l(roj0.f160388a);
        return bt0.m103729b(this.f201684h, bt0.m103753z((Animator[]) arrayListM200324f0.toArray(new Animator[arrayListM200324f0.size()])));
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
        m217219s0(i);
        int i3 = this.f201688k0;
        if (i - i3 > 0 || i > 0) {
            if (!this.f201668R) {
                m217221u0();
            }
            this.f201668R = true;
        } else if (i - i3 < 0) {
            if (this.f201668R) {
                m217220t0();
            }
            this.f201668R = false;
        }
        this.f201688k0 = i;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m217217q0(layoutInflater, viewGroup);
    }

    @Override // p149l.yvl
    public void initAnimationState() {
        this.f201664N.setAlpha(0.0f);
        this.f201698t.setAlpha(0.0f);
        this.f201684h.setAlpha(0.0f);
        xdl0.m208402t0(this.f201684h, 0.1f);
        this.f201686j.setAlpha(0.0f);
        xdl0.m208402t0(this.f201686j, 0.1f);
        xdl0.m208402t0(this.f201690m, 0.0f);
        int iM208412y0 = xdl0.m208412y0();
        this.f201702x.setTranslationX(iM208412y0);
        this.f201701w.setTranslationX(-iM208412y0);
        this.f201703y.setTranslationY(t100.m186890d(80.0f));
    }

    /* JADX INFO: renamed from: q0 */
    public View m217217q0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21627d.m217229c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f201666P;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m217219s0(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201653G.getLayoutParams();
        layoutParams.bottomMargin = i;
        int i2 = this.f201669S;
        if (i < i2) {
            layoutParams.bottomMargin = i2;
        }
        this.f201653G.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public void m217220t0() {
        if (this.f201674X) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f201671U, this.f201670T);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new C21625b());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n4x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f137144a.m217225y0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m217221u0() {
        if (this.f201673W) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f201670T, this.f201671U);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new C21624a());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p4x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f147242a.m217226z0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i4x i4xVar) {
        this.f201667Q = i4xVar;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m217223w0() {
        this.f201682f.setVisibility(0);
        this.f201682f.m80918d("animations/xmas_lanterns/config.xml", "animations/xmas_lanterns/pic");
        this.f201682f.m80916b(true);
        this.f201665O.setVisibility(0);
        this.f201665O.m80918d("animations/xmas_snowflakes/config.xml", "animations/xmas_snowflakes/pic");
        this.f201665O.m80916b(true);
    }

    /* JADX INFO: renamed from: x0 */
    public void m217224x0(boolean z, int i) {
        if (this.f201694p0 == null) {
            this.f201694p0 = new fyq(getAct());
        }
        getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.u4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f174638a.m217139E0();
            }
        });
        this.f201701w.setOnClickListener(this.f201650E0);
        final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.v4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179978a.m217142G0(view);
            }
        };
        xdl0.m208329E0(this.f201657I, onClickListener);
        this.f201655H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.w4x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f184623a.m217203H0(onClickListener, textView, i2, keyEvent);
            }
        });
        this.f201655H.setOnClickListener(new View.OnClickListener() { // from class: l.x4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z4x.m217189n(view);
            }
        });
        this.f201702x.setOnClickListener(this.f201652F0);
        this.f201662L.setOnClickListener(this.f201652F0);
        this.f201646B.setOnClickListener(this.f201650E0);
        this.f201645A.setOnClickListener(this.f201652F0);
        this.f201648D.setOnClickListener(this.f201652F0);
        this.f201703y.setOnClickListener(this.f201656H0);
        this.f201681e.setOnClickListener(this.f201656H0);
        if (i == 10 || i == 26) {
            this.f201664N.setTypeface(eqh0.m117752c(2));
            this.f201664N.setText(R$string.f19066xh);
            this.f201690m.setVisibility(4);
        } else if (i == 1) {
            this.f201690m.setEmpty(true);
            this.f201690m.setBackgroundResource(x2c0.f189373Gr);
            ((AnimationDrawable) this.f201690m.getBackground()).start();
            this.f201664N.setTypeface(eqh0.m117752c(2));
            this.f201664N.setText(R$string.f19011vm);
        } else if (i == 12 || i == 11 || (i == 13 && vdj.m198001c())) {
            this.f201664N.setTypeface(eqh0.m117752c(2));
            this.f201664N.setText(R$string.f19066xh);
            boolean zM28126v = IntlCountryCodeController.m28126v();
            GradientBgButton gradientBgButton = this.f201690m;
            if (zM28126v) {
                gradientBgButton.setIcon(getAct().drawable(x2c0.f189211Bp));
            } else {
                gradientBgButton.setIcon(getAct().drawable(x2c0.f189931Yr));
            }
            this.f201690m.setButtonColorStart(getAct().color(w0c0.f183778J1));
            this.f201690m.setButtonColorEnd(getAct().color(w0c0.f183775I1));
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8261o(getAct().color(w0c0.f183775I1), t100.m186890d(3.0f));
            roundingParams.m8268v(true);
            if (i == 12) {
                this.f201684h.getHierarchy().m112053H(roundingParams);
            } else if (i == 11) {
                this.f201686j.getHierarchy().m112053H(roundingParams);
            } else if (i == 13) {
                this.f201684h.getHierarchy().m112053H(roundingParams);
                this.f201686j.getHierarchy().m112053H(roundingParams);
            }
        } else if (i == 39 || i == 37 || i == 38) {
            this.f201664N.setTypeface(eqh0.m117752c(2));
            this.f201664N.setText(R$string.f19066xh);
            this.f201690m.setIcon(getAct().drawable(x2c0.f189526Lp));
            this.f201690m.setButtonColorStart(getAct().color(w0c0.f183778J1));
            this.f201690m.setButtonColorEnd(getAct().color(w0c0.f183775I1));
            RoundingParams roundingParams2 = new RoundingParams();
            roundingParams2.m8261o(getAct().color(w0c0.f183775I1), t100.m186890d(3.0f));
            roundingParams2.m8268v(true);
            if (i == 39) {
                this.f201684h.getHierarchy().m112053H(roundingParams2);
                this.f201686j.getHierarchy().m112053H(roundingParams2);
            } else if (i == 37) {
                this.f201686j.getHierarchy().m112053H(roundingParams2);
            } else {
                this.f201684h.getHierarchy().m112053H(roundingParams2);
            }
        } else if (i == 14) {
            this.f201664N.setTypeface(eqh0.m117752c(2));
            this.f201664N.setText(R$string.f19066xh);
            this.f201690m.setIcon(getAct().drawable(x2c0.f189900Xr));
            this.f201690m.setButtonColorStart(getAct().color(w0c0.f183820X1));
            this.f201690m.setButtonColorEnd(getAct().color(w0c0.f183817W1));
            RoundingParams roundingParams3 = new RoundingParams();
            roundingParams3.m8261o(getAct().color(w0c0.f183766F1), t100.m186890d(3.0f));
            roundingParams3.m8268v(true);
            this.f201686j.getHierarchy().m112053H(roundingParams3);
        } else {
            VText vText = this.f201664N;
            if (i == 15) {
                vText.setTypeface(eqh0.m117752c(2));
                this.f201664N.setText(R$string.f19066xh);
                this.f201690m.setVisibility(4);
                m217223w0();
            } else {
                vText.setTypeface(eqh0.m117752c(2));
                this.f201664N.setText(R$string.f19066xh);
                this.f201690m.setVisibility(4);
            }
        }
        if (!IntlCountryCodeController.m28126v()) {
            if (z) {
                m217211S0();
                return;
            }
            return;
        }
        this.f201664N.setTypeface(eqh0.m117752c(2));
        RoundingParams roundingParamsM8249c = RoundingParams.m8249c(30.0f);
        roundingParamsM8249c.m8268v(false);
        this.f201684h.getHierarchy().m112053H(roundingParamsM8249c);
        this.f201686j.getHierarchy().m112053H(roundingParamsM8249c);
        this.f201684h.setRotation(-15.0f);
        this.f201686j.setRotation(15.0f);
        xdl0.m208345M0(this.f201704z, true);
        xdl0.m208345M0(this.f201699u, false);
        if (i == 50 || i == 51) {
            this.f201664N.setTextColor(Color.parseColor("#2E2516"));
            this.f201698t.setTextColor(Color.parseColor("#2E2516"));
            xdl0.m208391o(getAct(), x2c0.f190761yu);
            this.f201646B.setBackgroundResource(x2c0.f190793zu);
            this.f201646B.setTextColor(Color.parseColor("#F9E7FF"));
            this.f201645A.setBackgroundResource(x2c0.f189184Au);
            this.f201645A.setTextColor(Color.parseColor("#2E2516"));
        } else {
            xdl0.m208391o(getAct(), x2c0.f189216Bu);
        }
        if (i == 47 || i == 48 || i == 49) {
            xdl0.m208344M(this.f201689l, true);
            m217212T0();
        }
        if (i != 48 && i != 49) {
            if (i == 50) {
                xdl0.m208329E0(this.f201646B, new View.OnClickListener() { // from class: l.k4x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f121131a.m217135B0(view);
                    }
                });
                xdl0.m208329E0(this.f201645A, new View.OnClickListener() { // from class: l.l4x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f126067a.m217137D0(view);
                    }
                });
                return;
            }
            return;
        }
        xdl0.m208345M0(this.f201704z, false);
        xdl0.m208345M0(this.f201647C, true);
        this.f201649E.setTypeface(eqh0.m117752c(3), 1);
        this.f201648D.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(this.f201649E, new View.OnClickListener() { // from class: l.y4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196358a.m217145I0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m217225y0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201653G.getLayoutParams();
        layoutParams.width = iIntValue;
        this.f201653G.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m217226z0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f201653G.getLayoutParams();
        layoutParams.width = iIntValue;
        this.f201653G.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.z4x$a */
    public class C21624a implements Animator.AnimatorListener {
        public C21624a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z4x.this.f201673W = false;
            z4x.this.m217215W0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z4x.this.f201673W = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.z4x$b */
    public class C21625b implements Animator.AnimatorListener {
        public C21625b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z4x.this.f201674X = false;
            z4x.this.m217214V0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z4x.this.f201674X = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}

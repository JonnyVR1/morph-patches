package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersItemView;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Locale;
import p151v.VButton;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VScroll_Horizontal;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes3.dex */
public class y7x implements qyl<h7x> {

    /* JADX INFO: renamed from: A */
    public VButton f197839A;

    /* JADX INFO: renamed from: B */
    public VButton f197840B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f197841C;

    /* JADX INFO: renamed from: D */
    public VButton f197842D;

    /* JADX INFO: renamed from: E */
    public VButton f197843E;

    /* JADX INFO: renamed from: F */
    public VText f197845F;

    /* JADX INFO: renamed from: G */
    public RelativeLayout f197847G;

    /* JADX INFO: renamed from: H */
    public VEditText f197849H;

    /* JADX INFO: renamed from: I */
    public VText f197851I;

    /* JADX INFO: renamed from: I0 */
    public boolean f197852I0;

    /* JADX INFO: renamed from: J */
    public VScroll_Horizontal f197853J;

    /* JADX INFO: renamed from: K */
    public VLinear f197855K;

    /* JADX INFO: renamed from: L */
    public VButton_FakeShadow f197856L;

    /* JADX INFO: renamed from: M */
    public FrameLayout f197857M;

    /* JADX INFO: renamed from: N */
    public VText f197858N;

    /* JADX INFO: renamed from: O */
    public SceneView f197859O;

    /* JADX INFO: renamed from: P */
    public MatchAct f197860P;

    /* JADX INFO: renamed from: Q */
    public h7x f197861Q;

    /* JADX INFO: renamed from: W */
    public boolean f197867W;

    /* JADX INFO: renamed from: X */
    public boolean f197868X;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f197871a;

    /* JADX INFO: renamed from: b */
    public VText f197872b;

    /* JADX INFO: renamed from: c */
    public View f197873c;

    /* JADX INFO: renamed from: d */
    public View f197874d;

    /* JADX INFO: renamed from: e */
    public VButton f197875e;

    /* JADX INFO: renamed from: f */
    public SceneView f197876f;

    /* JADX INFO: renamed from: g */
    public View f197877g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f197878h;

    /* JADX INFO: renamed from: i */
    public VImage f197879i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f197880j;

    /* JADX INFO: renamed from: k */
    public VImage f197881k;

    /* JADX INFO: renamed from: k0 */
    public int f197882k0;

    /* JADX INFO: renamed from: l */
    public VImage f197883l;

    /* JADX INFO: renamed from: m */
    public GradientBgButton f197884m;

    /* JADX INFO: renamed from: n */
    public VLinear_FillerMeasure f197885n;

    /* JADX INFO: renamed from: o */
    public VText f197886o;

    /* JADX INFO: renamed from: p */
    public VText f197887p;

    /* JADX INFO: renamed from: p0 */
    public f0r f197888p0;

    /* JADX INFO: renamed from: q */
    public LinearLayout f197889q;

    /* JADX INFO: renamed from: r */
    public VText f197890r;

    /* JADX INFO: renamed from: s */
    public VText f197891s;

    /* JADX INFO: renamed from: t */
    public VText_AutoFit f197892t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f197893u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f197894v;

    /* JADX INFO: renamed from: w */
    public VButton_FakeShadow f197895w;

    /* JADX INFO: renamed from: x */
    public VButton_FakeShadow f197896x;

    /* JADX INFO: renamed from: y */
    public VButton f197897y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f197898z;

    /* JADX INFO: renamed from: R */
    public boolean f197862R = false;

    /* JADX INFO: renamed from: S */
    public final int f197863S = qa00.m175859d(106.0f);

    /* JADX INFO: renamed from: T */
    public final int f197864T = qa00.m175859d(327.0f);

    /* JADX INFO: renamed from: U */
    public final int f197865U = bnl0.m105592y0();

    /* JADX INFO: renamed from: V */
    public final int f197866V = 250;

    /* JADX INFO: renamed from: Y */
    public boolean f197869Y = true;

    /* JADX INFO: renamed from: Z */
    public String f197870Z = "default";

    /* JADX INFO: renamed from: E0 */
    public View.OnClickListener f197844E0 = new View.OnClickListener() { // from class: l.i7x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f113303a.m214622K0(view);
        }
    };

    /* JADX INFO: renamed from: F0 */
    public View.OnClickListener f197846F0 = new View.OnClickListener() { // from class: l.p7x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f150970a.m214624L0(view);
        }
    };

    /* JADX INFO: renamed from: G0 */
    public View.OnClickListener f197848G0 = new View.OnClickListener() { // from class: l.q7x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f156008a.m214679M0(view);
        }
    };

    /* JADX INFO: renamed from: H0 */
    public View.OnClickListener f197850H0 = new View.OnClickListener() { // from class: l.r7x
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f161649a.m214680N0(view);
        }
    };

    /* JADX INFO: renamed from: J0 */
    public jxd0 f197854J0 = new jxd0("has_show_match_tag_guide_view_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: l.y7x$c */
    public class C21538c extends wpf0 {

        /* JADX INFO: renamed from: a */
        public int f197901a = bnl0.m105592y0();

        public C21538c() {
        }

        @Override // p153l.wpf0, p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            float fM188550d = 1.0f - ((float) syf0Var.m188550d());
            y7x.this.f197896x.setTranslationX(this.f197901a * fM188550d);
            y7x.this.f197895w.setTranslationX((-fM188550d) * this.f197901a);
        }
    }

    /* JADX INFO: renamed from: l.y7x$d */
    public static class C21539d {
        /* JADX INFO: renamed from: b */
        public static void m214702b(y7x y7xVar, View view) {
            y7xVar.f197871a = (RelativeLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            y7xVar.f197872b = (VText) viewGroup.getChildAt(0);
            y7xVar.f197873c = viewGroup.getChildAt(1);
            y7xVar.f197874d = viewGroup.getChildAt(2);
            y7xVar.f197875e = (VButton) viewGroup.getChildAt(3);
            y7xVar.f197876f = (SceneView) viewGroup.getChildAt(4);
            y7xVar.f197877g = viewGroup.getChildAt(5);
            y7xVar.f197878h = (VDraweeView) viewGroup.getChildAt(6);
            y7xVar.f197879i = (VImage) viewGroup.getChildAt(7);
            y7xVar.f197880j = (VDraweeView) viewGroup.getChildAt(8);
            y7xVar.f197881k = (VImage) viewGroup.getChildAt(9);
            y7xVar.f197883l = (VImage) viewGroup.getChildAt(10);
            y7xVar.f197884m = (GradientBgButton) viewGroup.getChildAt(11);
            y7xVar.f197885n = (VLinear_FillerMeasure) viewGroup.getChildAt(12);
            y7xVar.f197886o = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(0);
            y7xVar.f197887p = (VText) ((ViewGroup) viewGroup.getChildAt(12)).getChildAt(1);
            y7xVar.f197889q = (LinearLayout) viewGroup.getChildAt(13);
            y7xVar.f197890r = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(0);
            y7xVar.f197891s = (VText) ((ViewGroup) viewGroup.getChildAt(13)).getChildAt(1);
            y7xVar.f197892t = (VText_AutoFit) view.findViewById(adc0.f70124Sd);
            ViewGroup viewGroup2 = (ViewGroup) view;
            y7xVar.f197893u = (LinearLayout) viewGroup2.getChildAt(15);
            y7xVar.f197894v = (LinearLayout) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0);
            y7xVar.f197895w = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0)).getChildAt(0);
            y7xVar.f197896x = (VButton_FakeShadow) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(0)).getChildAt(1);
            y7xVar.f197897y = (VButton) ((ViewGroup) viewGroup2.getChildAt(15)).getChildAt(1);
            y7xVar.f197898z = (LinearLayout) viewGroup2.getChildAt(16);
            y7xVar.f197839A = (VButton) ((ViewGroup) viewGroup2.getChildAt(16)).getChildAt(0);
            y7xVar.f197840B = (VButton) ((ViewGroup) viewGroup2.getChildAt(16)).getChildAt(2);
            y7xVar.f197841C = (LinearLayout) viewGroup2.getChildAt(17);
            y7xVar.f197842D = (VButton) ((ViewGroup) viewGroup2.getChildAt(17)).getChildAt(0);
            y7xVar.f197843E = (VButton) ((ViewGroup) viewGroup2.getChildAt(17)).getChildAt(2);
            y7xVar.f197845F = (VText) viewGroup2.getChildAt(18);
            y7xVar.f197847G = (RelativeLayout) viewGroup2.getChildAt(19);
            y7xVar.f197849H = (VEditText) ((ViewGroup) viewGroup2.getChildAt(19)).getChildAt(0);
            y7xVar.f197851I = (VText) ((ViewGroup) viewGroup2.getChildAt(19)).getChildAt(1);
            y7xVar.f197853J = (VScroll_Horizontal) viewGroup2.getChildAt(20);
            y7xVar.f197855K = (VLinear) ((ViewGroup) viewGroup2.getChildAt(20)).getChildAt(0);
            y7xVar.f197856L = (VButton_FakeShadow) viewGroup2.getChildAt(21);
            y7xVar.f197857M = (FrameLayout) viewGroup2.getChildAt(22);
            y7xVar.f197858N = (VText) ((ViewGroup) viewGroup2.getChildAt(22)).getChildAt(0);
            y7xVar.f197859O = (SceneView) viewGroup2.getChildAt(23);
        }

        /* JADX INFO: renamed from: c */
        public static View m214703c(y7x y7xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125686Wd, viewGroup, false);
            m214702b(y7xVar, viewInflate);
            return viewInflate;
        }
    }

    public y7x(MatchAct matchAct) {
        this.f197860P = matchAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m214609B0(View view) {
        sfj0.m185596c("e_intl_instantmatch_no_ultra_click", getAct().pageId(), new sfj0.C20032a[0]);
        if (!joa.m146354D3()) {
            this.f197861Q.m133871l1(false);
        } else if (C8618a.m48771w().m48772A()) {
            final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f197861Q.f124421b);
            C8618a.m48771w().m48781J(getAct(), userM116503Pa, new x20() { // from class: l.n7x
                @Override // p153l.x20
                public final void call() {
                    this.f140637a.m214678J0(userM116503Pa);
                }
            });
        } else {
            o1j0.m165624F(getAct(), getAct().getString(R$string.f19703u9));
            getAct().m68056e2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m214611D0(View view) {
        sfj0.m185596c("e_intl_instantmatch_no_ultra_giveup", getAct().pageId(), new sfj0.C20032a[0]);
        this.f197861Q.m133867h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m214613E0() {
        this.f197888p0.m123510h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m214616G0(View view) {
        this.f197861Q.m133868i1(this.f197849H.getText().toString().trim(), this.f197862R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m214619I0(View view) {
        sfj0.m185596c("e_intl_match_sayhi", getAct().pageId(), new sfj0.C20032a[0]);
        this.f197861Q.m133870k1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m214622K0(View view) {
        this.f197861Q.m133872m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m214624L0(View view) {
        if (gra.m131625S1()) {
            sfj0.m185596c("e_matched_later", getAct().pageId(), sfj0.C20032a.m185615h("match_source", this.f197861Q.m148776p0(getAct().f31317e)));
        }
        this.f197861Q.m133867h1();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m214663n(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m214676A0(syf0 syf0Var) {
        syf0Var.m188547a(new C21538c());
        syf0Var.m188561o(1.0d);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197860P;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ boolean m214677H0(View.OnClickListener onClickListener, TextView textView, int i, KeyEvent keyEvent) {
        if (!qt4.f159383e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f197849H.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m82486a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            onClickListener.onClick(this.f197851I);
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m214678J0(User user) {
        C8618a.m48771w().m48802z(getAct(), user);
        CoreModule.f18264c.f20337P1.f92199R.m137019l(uxj0.f181467a);
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m214679M0(View view) {
        if (gra.m131625S1()) {
            sfj0.m185596c("e_matched_later", getAct().pageId(), sfj0.C20032a.m185615h("match_source", this.f197861Q.m148776p0(getAct().f31317e)));
        }
        this.f197861Q.m133867h1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m214680N0(View view) {
        this.f197861Q.m133869j1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m214681O0(VText vText, int i) {
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
    public void m214682P0() {
        this.f197849H.setHorizontallyScrolling(false);
        this.f197849H.setImeOptions(4);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m214683Q0() {
        this.f197896x.setClickable(false);
    }

    /* JADX INFO: renamed from: R0 */
    public void m214684R0(User user, User user2, int i, ArrayList<String> arrayList) {
        if (user == null || user2 == null) {
            NullChecker.m82487b(user);
            NullChecker.m82487b(user2);
            getAct().m68056e2();
            return;
        }
        if (this.f197869Y && NullChecker.m82486a(user2.localRelationship)) {
            this.f197869Y = false;
            int size = user2.localRelationship.status.size();
            Relationship relationship = user2.localRelationship;
            if (size > 0) {
                this.f197870Z = relationship.status.get(0).toString();
            } else {
                this.f197870Z = relationship.state.toString();
            }
        }
        uqb0.f180374G.m127111J0(this.f197878h, user.m61308fp().profileMiddle(), false);
        uqb0.f180374G.m127111J0(this.f197880j, user2.m61308fp().profileMiddle(), false);
        if (i == 15) {
            this.f197892t.setText(R$string.f18808R1);
            return;
        }
        if (i == 0 || i == 12 || i == 11 || i == 13 || i == 39 || i == 37 || i == 38 || i == 10 || i == 45 || i == 47 || i == 36) {
            this.f197892t.setText(getAct().getString(R$string.f19218ei, user2.name));
            m214687U0(this.f197892t, R$string.f19218ei);
            return;
        }
        if (i == 1) {
            VText_AutoFit vText_AutoFit = this.f197892t;
            MatchAct act = getAct();
            int i2 = R$string.f18799Qm;
            int size2 = arrayList.size();
            String str = user2.name;
            if (size2 > 0) {
                str = str + " (" + arrayList.get(0) + ")";
            }
            vText_AutoFit.setText(act.getString(i2, str));
            m214687U0(this.f197892t, R$string.f18799Qm);
            return;
        }
        if (i == 26) {
            this.f197892t.setText(getAct().getString(R$string.f19218ei, user2.name));
            m214687U0(this.f197892t, R$string.f19218ei);
            return;
        }
        if (i == 48 || i == 49) {
            this.f197892t.setText(getAct().getString(R$string.f19706uc, user2.name));
            m214687U0(this.f197892t, R$string.f19706uc);
        } else if (i == 50) {
            this.f197892t.setText(getAct().getString(R$string.f19710ug, user2.name));
            m214687U0(this.f197892t, R$string.f19710ug);
        } else if (i == 51) {
            this.f197892t.setText(getAct().getString(R$string.f19772wg, user2.name));
            m214687U0(this.f197892t, R$string.f19772wg);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m214685S0() {
        getAct();
        ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getAct().getTaskId()));
        if (arrayList == null) {
            this.f197861Q.m133860U0();
            return;
        }
        Activity activity = arrayList.size() > 0 ? arrayList.get(0).f16062a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f197861Q.m133860U0();
        } else {
            qnp0.m177256Y0(activity, getAct());
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m214686T0() {
        int i;
        String language = Locale.getDefault().getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                i = dbc0.f86626U9;
                break;
            case "ja":
                i = dbc0.f86658V9;
                break;
            case "ko":
                i = dbc0.f86690W9;
                break;
            case "th":
                i = dbc0.f86722X9;
                break;
            case "vi":
                i = dbc0.f86754Y9;
                break;
            case "zh":
                if (Locale.getDefault().getCountry() != "TW" && Locale.getDefault().getCountry() != "HK" && Locale.getDefault().getCountry() != "MO") {
                    i = dbc0.f86786Z9;
                    break;
                } else {
                    i = dbc0.f86819aa;
                    break;
                }
                break;
            default:
                i = dbc0.f86594T9;
                break;
        }
        this.f197883l.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m214687U0(final VText vText, final int i) {
        vText.post(new Runnable() { // from class: l.l7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f130392a.m214681O0(vText, i);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m214688V0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f197847G.getLayoutParams();
        layoutParams.width = this.f197864T;
        layoutParams.bottomMargin = this.f197863S;
        this.f197847G.setLayoutParams(layoutParams);
        this.f197847G.setBackgroundResource(dbc0.f87034gs);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m214689W0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f197847G.getLayoutParams();
        layoutParams.width = this.f197865U;
        this.f197847G.setLayoutParams(layoutParams);
        this.f197847G.setBackgroundResource(c9c0.f80407c2);
    }

    /* JADX INFO: renamed from: X0 */
    public void m214690X0() {
        if (bnl0.m105529O0(this.f197853J)) {
            if (this.f197852I0) {
                sfj0.m185601h("e_match_label", getAct().pageId(), sfj0.C20032a.m185615h("is_label", "1"));
            } else {
                sfj0.m185601h("e_match_label", getAct().pageId(), sfj0.C20032a.m185615h("is_label", "0"));
            }
        }
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        final syf0 syf0VarM187585c = izf0.m142800h().m187585c();
        syf0VarM187585c.m188562p(new uyf0(300.0d, 13.0d));
        getAct().postDelayed(new Runnable() { // from class: l.s7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f166715a.m214676A0(syf0VarM187585c);
            }
        }, 600L);
        VText vText = this.f197858N;
        Property property = View.ALPHA;
        ArrayList arrayListM147507f0 = jyb.m147507f0(gt0.m132166l(vText, property, 0L, 600L, null, 1.0f), gt0.m132166l(this.f197884m, property, 0L, 600L, null, 1.0f), gt0.m132166l(this.f197878h, property, 0L, 480L, null, 1.0f), gt0.m132166l(this.f197880j, property, 0L, 480L, null, 1.0f), gt0.m132166l(this.f197878h, gt0.f106354i, 0L, 800L, new OvershootInterpolator(2.0f), 1.0f), gt0.m132166l(this.f197880j, gt0.f106354i, 0L, 800L, new OvershootInterpolator(2.0f), 1.0f), gt0.m132166l(this.f197884m, gt0.f106354i, 200L, 800L, new OvershootInterpolator(2.0f), 1.0f), gt0.m132166l(this.f197892t, property, 480L, 120L, null, 1.0f), gt0.m132170p(this.f197897y, "translationY", 600L, 200L, new OvershootInterpolator(1.2f), 0.0f));
        if (this.f197861Q.m133859S0() == 15) {
            this.f197879i.setVisibility(0);
            this.f197881k.setVisibility(0);
            arrayListM147507f0.add(gt0.m132166l(this.f197879i, gt0.f106354i, 0L, 800L, null, 0.5f, 1.0f));
            arrayListM147507f0.add(gt0.m132166l(this.f197879i, property, 0L, 800L, null, 0.0f, 1.0f));
            arrayListM147507f0.add(gt0.m132166l(this.f197881k, gt0.f106354i, 0L, 800L, null, 0.5f, 1.0f));
            arrayListM147507f0.add(gt0.m132166l(this.f197881k, property, 0L, 800L, null, 0.0f, 1.0f));
        }
        return gt0.m132156b(this.f197878h, gt0.m132180z((Animator[]) arrayListM147507f0.toArray(new Animator[arrayListM147507f0.size()])));
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator();
        ArrayList arrayListM147507f0 = jyb.m147507f0(gt0.m132166l(this.f197878h, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132166l(this.f197884m, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132170p(this.f197878h, "alpha", 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132166l(this.f197880j, gt0.f106354i, 0L, 500L, anticipateInterpolator, 0.0f), gt0.m132170p(this.f197880j, "alpha", 0L, 500L, anticipateInterpolator, 0.0f));
        if (this.f197861Q.m133859S0() == 15) {
            arrayListM147507f0.add(gt0.m132166l(this.f197879i, gt0.f106354i, 0L, 500L, null, 0.5f));
            VImage vImage = this.f197879i;
            Property property = View.ALPHA;
            arrayListM147507f0.add(gt0.m132166l(vImage, property, 0L, 500L, null, 0.0f));
            arrayListM147507f0.add(gt0.m132166l(this.f197881k, gt0.f106354i, 0L, 500L, null, 0.5f));
            arrayListM147507f0.add(gt0.m132166l(this.f197881k, property, 0L, 500L, null, 0.0f));
        }
        LikersItemView.f38140y.m137019l(uxj0.f181467a);
        return gt0.m132156b(this.f197878h, gt0.m132180z((Animator[]) arrayListM147507f0.toArray(new Animator[arrayListM147507f0.size()])));
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
        m214693s0(i);
        int i3 = this.f197882k0;
        if (i - i3 > 0 || i > 0) {
            if (!this.f197862R) {
                m214695u0();
            }
            this.f197862R = true;
        } else if (i - i3 < 0) {
            if (this.f197862R) {
                m214694t0();
            }
            this.f197862R = false;
        }
        this.f197882k0 = i;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m214691q0(layoutInflater, viewGroup);
    }

    @Override // p153l.qyl
    public void initAnimationState() {
        this.f197858N.setAlpha(0.0f);
        this.f197892t.setAlpha(0.0f);
        this.f197878h.setAlpha(0.0f);
        bnl0.m105582t0(this.f197878h, 0.1f);
        this.f197880j.setAlpha(0.0f);
        bnl0.m105582t0(this.f197880j, 0.1f);
        bnl0.m105582t0(this.f197884m, 0.0f);
        int iM105592y0 = bnl0.m105592y0();
        this.f197896x.setTranslationX(iM105592y0);
        this.f197895w.setTranslationX(-iM105592y0);
        this.f197897y.setTranslationY(qa00.m175859d(80.0f));
    }

    /* JADX INFO: renamed from: q0 */
    public View m214691q0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21539d.m214703c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f197860P;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m214693s0(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f197847G.getLayoutParams();
        layoutParams.bottomMargin = i;
        int i2 = this.f197863S;
        if (i < i2) {
            layoutParams.bottomMargin = i2;
        }
        this.f197847G.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t0 */
    public void m214694t0() {
        if (this.f197868X) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f197865U, this.f197864T);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new C21537b());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.m7x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f135132a.m214699y0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m214695u0() {
        if (this.f197867W) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f197864T, this.f197865U);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new C21536a());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.o7x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f145333a.m214700z0(valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(h7x h7xVar) {
        this.f197861Q = h7xVar;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m214697w0() {
        this.f197876f.setVisibility(0);
        this.f197876f.m82101d("animations/xmas_lanterns/config.xml", "animations/xmas_lanterns/pic");
        this.f197876f.m82099b(true);
        this.f197859O.setVisibility(0);
        this.f197859O.m82101d("animations/xmas_snowflakes/config.xml", "animations/xmas_snowflakes/pic");
        this.f197859O.m82099b(true);
    }

    /* JADX INFO: renamed from: x0 */
    public void m214698x0(boolean z, int i) {
        if (this.f197888p0 == null) {
            this.f197888p0 = new f0r(getAct());
        }
        getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.t7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f172477a.m214613E0();
            }
        });
        this.f197895w.setOnClickListener(this.f197844E0);
        final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.u7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177952a.m214616G0(view);
            }
        };
        bnl0.m105509E0(this.f197851I, onClickListener);
        this.f197849H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.v7x
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f182838a.m214677H0(onClickListener, textView, i2, keyEvent);
            }
        });
        this.f197849H.setOnClickListener(new View.OnClickListener() { // from class: l.w7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y7x.m214663n(view);
            }
        });
        this.f197896x.setOnClickListener(this.f197846F0);
        this.f197856L.setOnClickListener(this.f197846F0);
        this.f197840B.setOnClickListener(this.f197844E0);
        this.f197839A.setOnClickListener(this.f197846F0);
        this.f197842D.setOnClickListener(this.f197846F0);
        this.f197897y.setOnClickListener(this.f197850H0);
        this.f197875e.setOnClickListener(this.f197850H0);
        if (i == 10 || i == 26) {
            this.f197858N.setTypeface(lyh0.m156283c(2));
            this.f197858N.setText(R$string.f18854Sh);
            this.f197884m.setVisibility(4);
        } else if (i == 1) {
            this.f197884m.setEmpty(true);
            this.f197884m.setBackgroundResource(dbc0.f87494us);
            ((AnimationDrawable) this.f197884m.getBackground()).start();
            this.f197858N.setTypeface(lyh0.m156283c(2));
            this.f197858N.setText(R$string.f18829Rm);
        } else if (i == 12 || i == 11 || (i == 13 && pgj.m172246c())) {
            this.f197858N.setTypeface(lyh0.m156283c(2));
            this.f197858N.setText(R$string.f18854Sh);
            boolean zM29125v = IntlCountryCodeController.m29125v();
            GradientBgButton gradientBgButton = this.f197884m;
            if (zM29125v) {
                gradientBgButton.setIcon(getAct().drawable(dbc0.f87327pq));
            } else {
                gradientBgButton.setIcon(getAct().drawable(dbc0.f86389Ms));
            }
            this.f197884m.setButtonColorStart(getAct().color(c9c0.f80350K1));
            this.f197884m.setButtonColorEnd(getAct().color(c9c0.f80347J1));
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8315o(getAct().color(c9c0.f80347J1), qa00.m175859d(3.0f));
            roundingParams.m8322v(true);
            if (i == 12) {
                this.f197878h.getHierarchy().m207045H(roundingParams);
            } else if (i == 11) {
                this.f197880j.getHierarchy().m207045H(roundingParams);
            } else if (i == 13) {
                this.f197878h.getHierarchy().m207045H(roundingParams);
                this.f197880j.getHierarchy().m207045H(roundingParams);
            }
        } else if (i == 39 || i == 37 || i == 38) {
            this.f197858N.setTypeface(lyh0.m156283c(2));
            this.f197858N.setText(R$string.f18854Sh);
            this.f197884m.setIcon(getAct().drawable(dbc0.f87652zq));
            this.f197884m.setButtonColorStart(getAct().color(c9c0.f80350K1));
            this.f197884m.setButtonColorEnd(getAct().color(c9c0.f80347J1));
            RoundingParams roundingParams2 = new RoundingParams();
            roundingParams2.m8315o(getAct().color(c9c0.f80347J1), qa00.m175859d(3.0f));
            roundingParams2.m8322v(true);
            if (i == 39) {
                this.f197878h.getHierarchy().m207045H(roundingParams2);
                this.f197880j.getHierarchy().m207045H(roundingParams2);
            } else if (i == 37) {
                this.f197880j.getHierarchy().m207045H(roundingParams2);
            } else {
                this.f197878h.getHierarchy().m207045H(roundingParams2);
            }
        } else if (i == 14) {
            this.f197858N.setTypeface(lyh0.m156283c(2));
            this.f197858N.setText(R$string.f18854Sh);
            this.f197884m.setIcon(getAct().drawable(dbc0.f86357Ls));
            this.f197884m.setButtonColorStart(getAct().color(c9c0.f80392Y1));
            this.f197884m.setButtonColorEnd(getAct().color(c9c0.f80389X1));
            RoundingParams roundingParams3 = new RoundingParams();
            roundingParams3.m8315o(getAct().color(c9c0.f80338G1), qa00.m175859d(3.0f));
            roundingParams3.m8322v(true);
            this.f197880j.getHierarchy().m207045H(roundingParams3);
        } else {
            VText vText = this.f197858N;
            if (i == 15) {
                vText.setTypeface(lyh0.m156283c(2));
                this.f197858N.setText(R$string.f18854Sh);
                this.f197884m.setVisibility(4);
                m214697w0();
            } else {
                vText.setTypeface(lyh0.m156283c(2));
                this.f197858N.setText(R$string.f18854Sh);
                this.f197884m.setVisibility(4);
            }
        }
        if (!IntlCountryCodeController.m29125v()) {
            if (z) {
                m214685S0();
                return;
            }
            return;
        }
        this.f197858N.setTypeface(lyh0.m156283c(2));
        RoundingParams roundingParamsM8303c = RoundingParams.m8303c(30.0f);
        roundingParamsM8303c.m8322v(false);
        this.f197878h.getHierarchy().m207045H(roundingParamsM8303c);
        this.f197880j.getHierarchy().m207045H(roundingParamsM8303c);
        this.f197878h.setRotation(-15.0f);
        this.f197880j.setRotation(15.0f);
        bnl0.m105525M0(this.f197898z, true);
        bnl0.m105525M0(this.f197893u, false);
        if (i == 50 || i == 51) {
            this.f197858N.setTextColor(Color.parseColor("#2E2516"));
            this.f197892t.setTextColor(Color.parseColor("#2E2516"));
            bnl0.m105571o(getAct(), dbc0.f87233mv);
            this.f197840B.setBackgroundResource(dbc0.f87266nv);
            this.f197840B.setTextColor(Color.parseColor("#F9E7FF"));
            this.f197839A.setBackgroundResource(dbc0.f87299ov);
            this.f197839A.setTextColor(Color.parseColor("#2E2516"));
        } else {
            bnl0.m105571o(getAct(), dbc0.f87332pv);
        }
        if (i == 47 || i == 48 || i == 49) {
            bnl0.m105524M(this.f197883l, true);
            m214686T0();
        }
        if (i != 48 && i != 49) {
            if (i == 50) {
                bnl0.m105509E0(this.f197840B, new View.OnClickListener() { // from class: l.j7x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f118739a.m214609B0(view);
                    }
                });
                bnl0.m105509E0(this.f197839A, new View.OnClickListener() { // from class: l.k7x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f124309a.m214611D0(view);
                    }
                });
                return;
            }
            return;
        }
        bnl0.m105525M0(this.f197898z, false);
        bnl0.m105525M0(this.f197841C, true);
        this.f197843E.setTypeface(lyh0.m156283c(3), 1);
        this.f197842D.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(this.f197843E, new View.OnClickListener() { // from class: l.x7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192764a.m214619I0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m214699y0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f197847G.getLayoutParams();
        layoutParams.width = iIntValue;
        this.f197847G.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m214700z0(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f197847G.getLayoutParams();
        layoutParams.width = iIntValue;
        this.f197847G.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.y7x$a */
    public class C21536a implements Animator.AnimatorListener {
        public C21536a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y7x.this.f197867W = false;
            y7x.this.m214689W0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            y7x.this.f197867W = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.y7x$b */
    public class C21537b implements Animator.AnimatorListener {
        public C21537b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            onAnimationEnd(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y7x.this.f197868X = false;
            y7x.this.m214688V0();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            y7x.this.f197868X = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}

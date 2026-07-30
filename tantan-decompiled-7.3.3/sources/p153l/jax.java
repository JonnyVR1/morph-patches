package p153l;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageHalfPageComposerAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class jax implements qyl<v9x> {

    /* JADX INFO: renamed from: A */
    public C17908d f119028A = null;

    /* JADX INFO: renamed from: B */
    public C17906b f119029B = null;

    /* JADX INFO: renamed from: C */
    public final h220 f119030C = new h220();

    /* JADX INFO: renamed from: D */
    public boolean f119031D = false;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f119032a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f119033b;

    /* JADX INFO: renamed from: c */
    public VRelative f119034c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f119035d;

    /* JADX INFO: renamed from: e */
    public VImage f119036e;

    /* JADX INFO: renamed from: f */
    public Guideline f119037f;

    /* JADX INFO: renamed from: g */
    public VRelative f119038g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f119039h;

    /* JADX INFO: renamed from: i */
    public VImage f119040i;

    /* JADX INFO: renamed from: j */
    public VFrame f119041j;

    /* JADX INFO: renamed from: k */
    public VIcon f119042k;

    /* JADX INFO: renamed from: l */
    public VIcon f119043l;

    /* JADX INFO: renamed from: m */
    public View f119044m;

    /* JADX INFO: renamed from: n */
    public TextView f119045n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f119046o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f119047p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f119048q;

    /* JADX INFO: renamed from: r */
    public VImage f119049r;

    /* JADX INFO: renamed from: s */
    public VText f119050s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f119051t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f119052u;

    /* JADX INFO: renamed from: v */
    public VText f119053v;

    /* JADX INFO: renamed from: w */
    public VRecyclerView f119054w;

    /* JADX INFO: renamed from: x */
    public VButton_FakeShadow f119055x;

    /* JADX INFO: renamed from: y */
    public final MatchAct f119056y;

    /* JADX INFO: renamed from: z */
    public v9x f119057z;

    /* JADX INFO: renamed from: l.jax$b */
    public class C17906b extends jic0<String> {

        /* JADX INFO: renamed from: c */
        public final List<String> f119060c;

        public C17906b() {
            this.f119060c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m144152H(String str, int i, View view) {
            jax.this.f119057z.m200492i1(str, true);
            sfj0.m185596c("e_match_emoji", jax.this.getAct().pageId(), sfj0.C20032a.m185613f("select_emoji", i + 1));
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f119060c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(jax.this.getContext()).inflate(kec0.f125880i7, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final String str, int i, final int i2) {
            float fM182965i = ((rsf0.m182965i(bnl0.m105592y0()) - 86.0f) - 24.0f) / 5.0f;
            bnl0.m105507D0(qa00.m175859d(fM182965i), view);
            bnl0.m105505C0(view, qa00.m175859d(fM182965i));
            VText vText = (VText) view.findViewById(adc0.f70551s3);
            vText.setText(str);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.kax
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f124725a.m144152H(str, i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f119060c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m144155I(List<String> list) {
            if (jyb.m147479J(list)) {
                return;
            }
            this.f119060c.clear();
            this.f119060c.addAll(list.subList(0, Math.min(list.size(), 5)));
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.jax$c */
    public static class C17907c {
        /* JADX INFO: renamed from: b */
        public static void m144157b(jax jaxVar, View view) {
            jaxVar.f119032a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            jaxVar.f119033b = (SVGAnimationView) viewGroup.getChildAt(0);
            jaxVar.f119034c = (VRelative) viewGroup.getChildAt(1);
            jaxVar.f119035d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            jaxVar.f119036e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            jaxVar.f119037f = (Guideline) viewGroup.getChildAt(2);
            jaxVar.f119038g = (VRelative) viewGroup.getChildAt(3);
            jaxVar.f119039h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            jaxVar.f119040i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
            jaxVar.f119041j = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
            jaxVar.f119042k = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
            jaxVar.f119043l = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
            jaxVar.f119044m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
            jaxVar.f119045n = (TextView) viewGroup.getChildAt(4);
            jaxVar.f119046o = (LinearLayout) viewGroup.getChildAt(5);
            jaxVar.f119047p = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
            jaxVar.f119048q = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
            jaxVar.f119049r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(0);
            jaxVar.f119050s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            jaxVar.f119051t = (LinearLayout) viewGroup.getChildAt(6);
            jaxVar.f119052u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
            jaxVar.f119053v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
            jaxVar.f119054w = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
            jaxVar.f119055x = (VButton_FakeShadow) viewGroup.getChildAt(7);
        }

        /* JADX INFO: renamed from: c */
        public static View m144158c(jax jaxVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125846g7, viewGroup, false);
            m144157b(jaxVar, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.jax$d */
    public class C17908d extends jic0<BreakIce> {

        /* JADX INFO: renamed from: c */
        public final List<BreakIce> f119062c;

        public C17908d() {
            this.f119062c = new ArrayList();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f119062c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(jax.this.getContext()).inflate(kec0.f125913k7, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final BreakIce breakIce, int i, int i2) {
            VText vText = (VText) view.findViewById(adc0.f70356gb);
            VText vText2 = (VText) view.findViewById(adc0.f70063P3);
            vText.setTextSize(16.0f);
            vText.setText(breakIce.content);
            vText.setTypeface(Typeface.DEFAULT_BOLD);
            if (TextUtils.equals(breakIce.kind, "exclusive")) {
                bnl0.m105524M(vText2, true);
                bnl0.m105540X(vText, qa00.m175859d(12.0f));
                vText.setTextColor(j26.m143190c(jax.this.getContext(), c9c0.f80367Q0));
            } else {
                bnl0.m105524M(vText2, false);
                bnl0.m105540X(vText, qa00.m175859d(0.0f));
                vText.setTextColor(j26.m143190c(jax.this.getContext(), c9c0.f80352L0));
            }
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.lax
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f130743a.m144162H(breakIce, view2);
                }
            });
            if (jax.this.f119030C.m133360a("e_matched_select_question" + breakIce.tipId)) {
                return;
            }
            sfj0.m185601h("e_matched_select_question", jax.this.getAct().pageId(), sfj0.C20032a.m185615h("truth_question", breakIce.content), sfj0.C20032a.m185616i("self_edit_question", TextUtils.equals(breakIce.kind, "exclusive")));
            jax.this.f119030C.m133361b("e_matched_select_question" + breakIce.tipId);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BreakIce getItem(int i) {
            return this.f119062c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m144162H(BreakIce breakIce, View view) {
            jax.this.f119057z.m200492i1(breakIce.content, true);
            sfj0.m185596c("e_matched_select_question", jax.this.getAct().pageId(), sfj0.C20032a.m185615h("truth_question", breakIce.content), sfj0.C20032a.m185616i("self_edit_question", TextUtils.equals(breakIce.kind, "exclusive")));
        }

        /* JADX INFO: renamed from: I */
        public void m144163I(List<BreakIce> list) {
            if (!jyb.m147479J(list)) {
                this.f119062c.clear();
                this.f119062c.addAll(list.subList(0, Math.min(list.size(), 3)));
                notifyDataSetChanged();
            }
            jax.this.m144129W();
        }
    }

    public jax(MatchAct matchAct) {
        this.f119056y = matchAct;
    }

    /* JADX INFO: renamed from: q0 */
    private void m144119q0() {
        getAct();
        ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getAct().getTaskId()));
        if (arrayList == null) {
            this.f119057z.m200480S0();
            return;
        }
        Activity activity = arrayList.size() > 0 ? arrayList.get(0).f16062a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f119057z.m200480S0();
        } else {
            z7x.m218924a(activity, getAct(), 0);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f119056y;
    }

    /* JADX INFO: renamed from: U */
    public View m144127U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C17907c.m144158c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f119056y;
    }

    /* JADX INFO: renamed from: W */
    public final void m144129W() {
        l51.m152888H(getAct(), new Runnable() { // from class: l.z9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f203522a.m144135c0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: X */
    public final Animator m144130X(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f119045n;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return gt0.m132180z(gt0.m132166l(textView, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f119046o, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f119051t, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f119055x, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: Y */
    public final Animator m144131Y() {
        fzf0 fzf0Var = new fzf0(0.4f);
        VRelative vRelative = this.f119034c;
        Property property = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vRelative, property, 200L, 700L, fzf0Var, -qa00.m175859d(108.0f), qa00.m175859d(30.0f));
        Animator animatorM132166l2 = gt0.m132166l(this.f119038g, property, 200L, 700L, fzf0Var, qa00.m175859d(108.0f), -qa00.m175859d(30.0f));
        VRelative vRelative2 = this.f119034c;
        Property property2 = View.ALPHA;
        return gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), gt0.m132166l(this.f119038g, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v9x v9xVar) {
        this.f119057z = v9xVar;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m144133a0(int i) {
        if (i == 12 || i == 11 || (i == 13 && pgj.m172246c())) {
            if (i == 12) {
                m144147o0();
                bnl0.m105524M(this.f119040i, false);
                return;
            } else if (i == 11) {
                m144146n0();
                bnl0.m105524M(this.f119036e, false);
                return;
            } else {
                m144146n0();
                m144147o0();
                return;
            }
        }
        if (i != 39 && i != 37 && i != 38) {
            bnl0.m105524M(this.f119036e, false);
            bnl0.m105524M(this.f119040i, false);
            return;
        }
        if (i == 38) {
            bnl0.m105524M(this.f119036e, true);
            bnl0.m105524M(this.f119040i, false);
            this.f119036e.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
            return;
        }
        VImage vImage = this.f119036e;
        if (i == 37) {
            bnl0.m105524M(vImage, false);
            bnl0.m105524M(this.f119040i, true);
            this.f119040i.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else {
            bnl0.m105524M(vImage, true);
            bnl0.m105524M(this.f119040i, true);
            this.f119036e.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
            this.f119040i.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m144134b0(boolean z) {
        if (!IntlCountryCodeController.m29125v() && z) {
            m144119q0();
        }
        this.f119050s.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m144135c0() {
        float top = this.f119051t.getTop() - this.f119046o.getBottom();
        if (top < 0.0f) {
            float fAbs = Math.abs(top);
            float f = 80.0f - (0.51f * fAbs);
            bnl0.m105540X(this.f119034c, qa00.m175859d(Math.max(f, 0.0f)));
            bnl0.m105540X(this.f119038g, qa00.m175859d(Math.max(f, 0.0f)));
            bnl0.m105537U(this.f119054w, qa00.m175859d(Math.max(30.0f - (0.19f * fAbs), 0.0f)));
            bnl0.m105537U(this.f119055x, qa00.m175859d(Math.max(46.0f - (fAbs * 0.3f), 0.0f)));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m144136d0(User user) {
        this.f119045n.setText(String.format("你和%s可以开始聊天啦", user.isFemale() ? "她" : "他"));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m144137e0(User user, View view) {
        getAct().startActivity(ProfileAct.m51920o2(getAct(), user.f56859id, "from_match", false));
        sfj0.m185596c("e_matched_my_profile", getAct().pageId(), new sfj0.C20032a[0]);
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/bdc20c8c-866e-425c-bbac-6b7e958fd0e212.svga").autoPlay(true).repeatCount(1).into(this.f119033b);
        return gt0.m132180z(m144131Y(), m144150s0(500, qa00.m175859d(40.0f), 0), m144130X(500, 0, 1));
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        return gt0.m132164j(1);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m144138f0(User user, View view) {
        getAct().startActivity(ProfileAct.m51920o2(getAct(), user.f56859id, "from_match", false));
        sfj0.m185596c("e_matched_other_profile", getAct().pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m144139g0(View view) {
        m144149r0();
        sfj0.m185596c("e_matched_edit_question", getAct().pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m144140h0(User user, View view) {
        Intent intentM50069m2 = MessageHalfPageComposerAct.m50069m2(getAct(), user.f56859id, MessageHalfPageComposerAct.f32454q);
        MatchAct act = getAct();
        getAct();
        act.startActivityForResult(intentM50069m2, 144);
        MatchAct act2 = getAct();
        int i = x7c0.f192690e;
        act2.overridePendingTransition(i, i);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m144141i0(View view) {
        sfj0.m185596c("e_matched_later", getAct().pageId(), sfj0.C20032a.m185615h("match_source", this.f119057z.m148776p0(getAct().f31317e)));
        getAct().f31321i = true;
        this.f119057z.m200490g1();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m144127U(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m144142j0(int i, int i2, Intent intent) {
        getAct();
        if (i != 144) {
            return false;
        }
        if (i2 != 100) {
            return true;
        }
        this.f119057z.m200492i1(intent.getStringExtra("input"), false);
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m144143k0(VEditText vEditText, final nqy[] nqyVarArr, View view) {
        String strTrim = vEditText.getText().toString().trim();
        this.f119057z.m200493j1(strTrim, new x20() { // from class: l.y9x
            @Override // p153l.x20
            public final void call() {
                nqyVarArr[0].m164362b();
            }
        });
        sfj0.m185596c("e_matched_edit_question_done", getAct().pageId(), sfj0.C20032a.m185615h("truth_question", strTrim));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m144144l0(VEditText vEditText) {
        vEditText.requestFocus();
        getAct().showInput(vEditText, 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m144145m0(List<BreakIce> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        if (this.f119031D) {
            BreakIce breakIce = null;
            for (BreakIce breakIce2 : list) {
                if (TextUtils.equals(breakIce2.kind, "exclusive")) {
                    breakIce = breakIce2;
                }
            }
            if (NullChecker.m82486a(breakIce)) {
                list.remove(breakIce);
                list.add(0, breakIce);
            }
            this.f119057z.m200494k1(breakIce);
        } else {
            jyb.m147503d0(list, new qcj() { // from class: l.x9x
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BreakIce) obj).kind, "exclusive"));
                }
            });
        }
        list.subList(0, Math.min(list.size(), 3));
        this.f119028A.m144163I(list);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m144146n0() {
        bnl0.m105524M(this.f119040i, true);
        boolean zM114685j0 = d79.m114685j0();
        VImage vImage = this.f119040i;
        if (zM114685j0) {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86856be));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m144147o0() {
        bnl0.m105524M(this.f119036e, true);
        boolean zM114685j0 = d79.m114685j0();
        VImage vImage = this.f119036e;
        if (zM114685j0) {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86889ce));
        } else {
            vImage.setImageDrawable(j26.m143192e(getAct(), dbc0.f86856be));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m144148p0(final User user, final User user2, int i) {
        if (user == null || user2 == null) {
            NullChecker.m82487b(user);
            NullChecker.m82487b(user2);
            getAct().m68056e2();
            return;
        }
        this.f119028A = new C17908d();
        this.f119029B = new C17906b();
        this.f119047p.setAdapter(this.f119028A);
        this.f119054w.setAdapter(this.f119029B);
        m144133a0(i);
        uqb0.f180374G.m127111J0(this.f119035d, user.m61308fp().profileMiddle(), false);
        uqb0.f180374G.m127111J0(this.f119039h, user2.m61308fp().profileMiddle(), false);
        l51.m152888H(getAct(), new Runnable() { // from class: l.w9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f188070a.m144136d0(user2);
            }
        }, 350L);
        List<String> listM131754u0 = gra.m131754u0();
        boolean zM147479J = jyb.m147479J(listM131754u0);
        VRecyclerView vRecyclerView = this.f119054w;
        if (zM147479J) {
            bnl0.m105524M(vRecyclerView, false);
        } else {
            bnl0.m105524M(vRecyclerView, true);
            this.f119029B.m144155I(listM131754u0);
        }
        boolean zEquals = TEnum.equals(user.gender, "female");
        this.f119031D = zEquals;
        VRecyclerView vRecyclerView2 = this.f119047p;
        if (zEquals) {
            bnl0.m105524M(vRecyclerView2, true);
            bnl0.m105524M(this.f119052u, false);
            bnl0.m105524M(this.f119048q, true);
            bnl0.m105524M(this.f119054w, true);
            sfj0.m185601h("e_matched_edit_question", getAct().pageId(), new sfj0.C20032a[0]);
            sfj0.m185601h("e_match_emoji", getAct().pageId(), new sfj0.C20032a[0]);
        } else {
            bnl0.m105524M(vRecyclerView2, true);
            bnl0.m105524M(this.f119048q, false);
            bnl0.m105524M(this.f119054w, false);
            bnl0.m105524M(this.f119052u, true);
        }
        bnl0.m105509E0(this.f119034c, new View.OnClickListener() { // from class: l.aax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69182a.m144137e0(user, view);
            }
        });
        bnl0.m105509E0(this.f119038g, new View.OnClickListener() { // from class: l.bax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75740a.m144138f0(user2, view);
            }
        });
        bnl0.m105509E0(this.f119048q, new View.OnClickListener() { // from class: l.cax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80630a.m144139g0(view);
            }
        });
        bnl0.m105509E0(this.f119052u, new View.OnClickListener() { // from class: l.dax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85941a.m144140h0(user2, view);
            }
        });
        bnl0.m105509E0(this.f119055x, new View.OnClickListener() { // from class: l.eax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92817a.m144141i0(view);
            }
        });
        getAct().registerOnActivityResultListener(new C4468a.a() { // from class: l.fax
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i2, int i3, Intent intent) {
                return this.f98017a.m144142j0(i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m144149r0() {
        final nqy[] nqyVarArr = {null};
        nqy.C18929a c18929a = new nqy.C18929a(getContext());
        View viewInflate = getAct().inflater().inflate(kec0.f125863h7, (ViewGroup) null, false);
        final VEditText vEditText = (VEditText) viewInflate.findViewById(adc0.f70483o3);
        VText vText = (VText) viewInflate.findViewById(adc0.f70279c2);
        BreakIce breakIceM200479R0 = this.f119057z.m200479R0();
        if (NullChecker.m82486a(breakIceM200479R0) && TextUtils.equals(breakIceM200479R0.kind, "exclusive") && !TextUtils.isEmpty(breakIceM200479R0.content)) {
            vEditText.setText(breakIceM200479R0.content);
            vText.setText(String.format("%1$s/30", Integer.valueOf(breakIceM200479R0.content.length())));
        } else {
            vEditText.setHint("用问题拉近彼此的距离~");
        }
        vEditText.setSelection(vEditText.getText().length());
        vEditText.addTextChangedListener(new C17905a(vText));
        c18929a.m164414U(0.7f).m164425f0("设置专属破冰问题").m164417X(dbc0.f86648V).m164416W(new View.OnClickListener() { // from class: l.gax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nqyVarArr[0].m164362b();
            }
        }).m164419Z(R$string.f19383k).m164421b0(j26.m143190c(getContext(), c9c0.f80342I)).m164423d0(16.0f).m164422c0(qa00.m175859d(20.0f)).m164418Y(new View.OnClickListener() { // from class: l.hax
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108538a.m144143k0(vEditText, nqyVarArr, view);
            }
        }).m164409P(viewInflate);
        nqy nqyVarM164407N = c18929a.m164407N();
        nqyVarArr[0] = nqyVarM164407N;
        nqyVarM164407N.m164367g();
        l51.m152888H(getAct(), new Runnable() { // from class: l.iax
            @Override // java.lang.Runnable
            public final void run() {
                this.f113631a.m144144l0(vEditText);
            }
        }, 150L);
        sfj0.m185601h("e_matched_edit_question_textbox", getAct().pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final Animator m144150s0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f119045n;
        Property property = View.TRANSLATION_Y;
        long j = i;
        float f = i2;
        float f2 = i3;
        return gt0.m132180z(gt0.m132166l(textView, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f119046o, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f119051t, property, 0L, j, decelerateInterpolator, f, f2), gt0.m132166l(this.f119055x, property, 0L, j, decelerateInterpolator, f, f2));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.qyl
    public void initAnimationState() {
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
    }

    /* JADX INFO: renamed from: l.jax$a */
    public class C17905a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText f119058a;

        public C17905a(VText vText) {
            this.f119058a = vText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f119058a.setText(String.format("%1$s/30", Integer.valueOf(editable.toString().length())));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

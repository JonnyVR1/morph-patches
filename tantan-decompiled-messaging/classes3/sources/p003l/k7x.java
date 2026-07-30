package p003l;

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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageHalfPageComposerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.e16;
import l.e51;
import l.f6c0;
import l.o6j0;
import l.o7r;
import l.qhy;
import l.qib0;
import l.rzb0;
import l.t100;
import l.u4c0;
import l.u59;
import l.upa;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.wqf0;
import l.x2c0;
import l.xdl0;
import l.zt10;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;
import p028v.VButton_FakeShadow;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VFrame;
import p028v.VIcon;
import p028v.VImage;
import p028v.VRecyclerView;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class k7x implements yvl<w6x> {

    /* JADX INFO: renamed from: A */
    public C0368d f4824A = null;

    /* JADX INFO: renamed from: B */
    public C0366b f4825B = null;

    /* JADX INFO: renamed from: C */
    public final zt10 f4826C = new zt10();

    /* JADX INFO: renamed from: D */
    public boolean f4827D = false;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f4828a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f4829b;

    /* JADX INFO: renamed from: c */
    public VRelative f4830c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4831d;

    /* JADX INFO: renamed from: e */
    public VImage f4832e;

    /* JADX INFO: renamed from: f */
    public Guideline f4833f;

    /* JADX INFO: renamed from: g */
    public VRelative f4834g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4835h;

    /* JADX INFO: renamed from: i */
    public VImage f4836i;

    /* JADX INFO: renamed from: j */
    public VFrame f4837j;

    /* JADX INFO: renamed from: k */
    public VIcon f4838k;

    /* JADX INFO: renamed from: l */
    public VIcon f4839l;

    /* JADX INFO: renamed from: m */
    public View f4840m;

    /* JADX INFO: renamed from: n */
    public TextView f4841n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f4842o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f4843p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f4844q;

    /* JADX INFO: renamed from: r */
    public VImage f4845r;

    /* JADX INFO: renamed from: s */
    public VText f4846s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f4847t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f4848u;

    /* JADX INFO: renamed from: v */
    public VText f4849v;

    /* JADX INFO: renamed from: w */
    public VRecyclerView f4850w;

    /* JADX INFO: renamed from: x */
    public VButton_FakeShadow f4851x;

    /* JADX INFO: renamed from: y */
    public final MatchAct f4852y;

    /* JADX INFO: renamed from: z */
    public w6x f4853z;

    /* JADX INFO: renamed from: l.k7x$b */
    public class C0366b extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public final List<String> f4856c;

        public C0366b() {
            this.f4856c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m5616H(String str, int i, View view) {
            k7x.this.f4853z.m8543i1(str, true);
            o6j0.c("e_match_emoji", k7x.this.act().pageId(), new o6j0.a[]{o6j0.a.f("select_emoji", i + 1)});
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f4856c.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return o7r.a(k7x.this.m5589C0()).inflate(f6c0.h7, viewGroup, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, final String str, int i, final int i2) {
            float fM5152i = ((ikf0.m5152i(xdl0.y0()) - 86.0f) - 24.0f) / 5.0f;
            xdl0.D0(t100.d(fM5152i), new View[]{view});
            xdl0.C0(view, t100.d(fM5152i));
            AppCompatTextView appCompatTextView = (VText) view.findViewById(u4c0.q3);
            appCompatTextView.setText(str);
            xdl0.E0(appCompatTextView, new View.OnClickListener() { // from class: l.l7x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5225a.m5616H(str, i2, view2);
                }
            });
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f4856c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m5619I(List<String> list) {
            if (vwb.J(list)) {
                return;
            }
            this.f4856c.clear();
            this.f4856c.addAll(list.subList(0, Math.min(list.size(), 5)));
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.k7x$c */
    public static class C0367c {
        /* JADX INFO: renamed from: b */
        public static void m5621b(k7x k7xVar, View view) {
            k7xVar.f4828a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            k7xVar.f4829b = viewGroup.getChildAt(0);
            k7xVar.f4830c = (VRelative) viewGroup.getChildAt(1);
            k7xVar.f4831d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            k7xVar.f4832e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            k7xVar.f4833f = viewGroup.getChildAt(2);
            k7xVar.f4834g = (VRelative) viewGroup.getChildAt(3);
            k7xVar.f4835h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            k7xVar.f4836i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
            k7xVar.f4837j = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
            k7xVar.f4838k = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
            k7xVar.f4839l = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
            k7xVar.f4840m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
            k7xVar.f4841n = (TextView) viewGroup.getChildAt(4);
            k7xVar.f4842o = (LinearLayout) viewGroup.getChildAt(5);
            k7xVar.f4843p = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
            k7xVar.f4844q = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
            k7xVar.f4845r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(0);
            k7xVar.f4846s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            k7xVar.f4847t = (LinearLayout) viewGroup.getChildAt(6);
            k7xVar.f4848u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
            k7xVar.f4849v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
            k7xVar.f4850w = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
            k7xVar.f4851x = (VButton_FakeShadow) viewGroup.getChildAt(7);
        }

        /* JADX INFO: renamed from: c */
        public static View m5622c(k7x k7xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f7, viewGroup, false);
            m5621b(k7xVar, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.k7x$d */
    public class C0368d extends dac0<BreakIce> {

        /* JADX INFO: renamed from: c */
        public final List<BreakIce> f4858c;

        public C0368d() {
            this.f4858c = new ArrayList();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f4858c.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return o7r.a(k7x.this.m5589C0()).inflate(f6c0.j7, viewGroup, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, final BreakIce breakIce, int i, int i2) {
            AppCompatTextView appCompatTextView = (VText) view.findViewById(u4c0.eb);
            AppCompatTextView appCompatTextView2 = (VText) view.findViewById(u4c0.N3);
            appCompatTextView.setTextSize(16.0f);
            appCompatTextView.setText(breakIce.content);
            appCompatTextView.setTypeface(Typeface.DEFAULT_BOLD);
            if (TextUtils.equals(breakIce.kind, "exclusive")) {
                xdl0.M(appCompatTextView2, true);
                xdl0.X(appCompatTextView, t100.d(12.0f));
                appCompatTextView.setTextColor(e16.c(k7x.this.m5589C0(), w0c0.P0));
            } else {
                xdl0.M(appCompatTextView2, false);
                xdl0.X(appCompatTextView, t100.d(0.0f));
                appCompatTextView.setTextColor(e16.c(k7x.this.m5589C0(), w0c0.K0));
            }
            xdl0.E0(appCompatTextView, new View.OnClickListener() { // from class: l.m7x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5563a.m5626H(breakIce, view2);
                }
            });
            if (k7x.this.f4826C.a("e_matched_select_question" + breakIce.tipId)) {
                return;
            }
            o6j0.h("e_matched_select_question", k7x.this.act().pageId(), new o6j0.a[]{o6j0.a.h("truth_question", breakIce.content), o6j0.a.i("self_edit_question", TextUtils.equals(breakIce.kind, "exclusive"))});
            k7x.this.f4826C.b("e_matched_select_question" + breakIce.tipId);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BreakIce getItem(int i) {
            return this.f4858c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m5626H(BreakIce breakIce, View view) {
            k7x.this.f4853z.m8543i1(breakIce.content, true);
            o6j0.c("e_matched_select_question", k7x.this.act().pageId(), new o6j0.a[]{o6j0.a.h("truth_question", breakIce.content), o6j0.a.i("self_edit_question", TextUtils.equals(breakIce.kind, "exclusive"))});
        }

        /* JADX INFO: renamed from: I */
        public void m5627I(List<BreakIce> list) {
            if (!vwb.J(list)) {
                this.f4858c.clear();
                this.f4858c.addAll(list.subList(0, Math.min(list.size(), 3)));
                notifyDataSetChanged();
            }
            k7x.this.m5592W();
        }
    }

    public k7x(MatchAct matchAct) {
        this.f4852y = matchAct;
    }

    /* JADX INFO: renamed from: q0 */
    private void m5581q0() {
        act();
        ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(act().getTaskId()));
        if (arrayList == null) {
            this.f4853z.m8530S0();
            return;
        }
        Activity activity = arrayList.size() > 0 ? (Activity) ((Act.r) arrayList.get(0)).a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f4853z.m8530S0();
        } else {
            a5x.m2744a(activity, act(), 0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5589C0() {
        return this.f4852y;
    }

    /* JADX INFO: renamed from: U */
    public View m5590U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0367c.m5622c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f4852y;
    }

    /* JADX INFO: renamed from: W */
    public final void m5592W() {
        e51.H(act(), new Runnable() { // from class: l.a7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f2089a.m5598c0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: X */
    public final Animator m5593X(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f4841n;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.z(new Animator[]{bt0.l(textView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f4842o, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f4847t, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f4851x, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
    }

    /* JADX INFO: renamed from: Y */
    public final Animator m5594Y() {
        wqf0 wqf0Var = new wqf0(0.4f);
        VRelative vRelative = this.f4830c;
        Property property = View.TRANSLATION_X;
        Animator animatorL = bt0.l(vRelative, property, 200L, 700L, wqf0Var, new float[]{-t100.d(108.0f), t100.d(30.0f)});
        Animator animatorL2 = bt0.l(this.f4834g, property, 200L, 700L, wqf0Var, new float[]{t100.d(108.0f), -t100.d(30.0f)});
        VRelative vRelative2 = this.f4830c;
        Property property2 = View.ALPHA;
        return bt0.z(new Animator[]{animatorL, animatorL2, bt0.l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(this.f4834g, property2, 0L, 200L, new AccelerateInterpolator(), new float[]{0.0f, 1.0f})});
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m5605i1(w6x w6xVar) {
        this.f4853z = w6xVar;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5596a0(int i) {
        if (i == 12 || i == 11 || (i == 13 && vdj.c())) {
            if (i == 12) {
                m5611o0();
                xdl0.M(this.f4836i, false);
                return;
            } else if (i == 11) {
                m5610n0();
                xdl0.M(this.f4832e, false);
                return;
            } else {
                m5610n0();
                m5611o0();
                return;
            }
        }
        if (i != 39 && i != 37 && i != 38) {
            xdl0.M(this.f4832e, false);
            xdl0.M(this.f4836i, false);
            return;
        }
        if (i == 38) {
            xdl0.M(this.f4832e, true);
            xdl0.M(this.f4836i, false);
            this.f4832e.setImageDrawable(e16.e(act(), x2c0.be));
            return;
        }
        AppCompatImageView appCompatImageView = this.f4832e;
        if (i == 37) {
            xdl0.M(appCompatImageView, false);
            xdl0.M(this.f4836i, true);
            this.f4836i.setImageDrawable(e16.e(act(), x2c0.be));
        } else {
            xdl0.M(appCompatImageView, true);
            xdl0.M(this.f4836i, true);
            this.f4832e.setImageDrawable(e16.e(act(), x2c0.be));
            this.f4836i.setImageDrawable(e16.e(act(), x2c0.be));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m5597b0(boolean z) {
        if (!IntlCountryCodeController.v() && z) {
            m5581q0();
        }
        this.f4846s.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m5598c0() {
        float top = this.f4847t.getTop() - this.f4842o.getBottom();
        if (top < 0.0f) {
            float fAbs = Math.abs(top);
            float f = 80.0f - (0.51f * fAbs);
            xdl0.X(this.f4830c, t100.d(Math.max(f, 0.0f)));
            xdl0.X(this.f4834g, t100.d(Math.max(f, 0.0f)));
            xdl0.U(this.f4850w, t100.d(Math.max(30.0f - (0.19f * fAbs), 0.0f)));
            xdl0.U(this.f4851x, t100.d(Math.max(46.0f - (fAbs * 0.3f), 0.0f)));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m5599d0(User user) {
        this.f4841n.setText(String.format("你和%s可以开始聊天啦", user.isFemale() ? "她" : "他"));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m5600e0(User user, View view) {
        act().startActivity(ProfileAct.n2(act(), ((DbObject) user).id, "from_match", false));
        o6j0.c("e_matched_my_profile", act().pageId(), new o6j0.a[0]);
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        SVGALoader.with(act()).from("https://auto.tancdn.com/v1/raw/bdc20c8c-866e-425c-bbac-6b7e958fd0e212.svga").autoPlay(true).repeatCount(1).into(this.f4829b);
        return bt0.z(new Animator[]{m5594Y(), m5614s0(HttpStatus.INTERNAL_SERVER_ERROR_500, t100.d(40.0f), 0), m5593X(HttpStatus.INTERNAL_SERVER_ERROR_500, 0, 1)});
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        return bt0.j(1);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m5601f0(User user, View view) {
        act().startActivity(ProfileAct.n2(act(), ((DbObject) user).id, "from_match", false));
        o6j0.c("e_matched_other_profile", act().pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m5602g0(View view) {
        m5613r0();
        o6j0.c("e_matched_edit_question", act().pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m5603h0(User user, View view) {
        Intent intentM1973l2 = MessageHalfPageComposerAct.m1973l2(act(), ((DbObject) user).id, MessageHalfPageComposerAct.f1497q);
        MatchAct matchActAct = act();
        act();
        matchActAct.startActivityForResult(intentM1973l2, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
        MatchAct matchActAct2 = act();
        int i = rzb0.e;
        matchActAct2.overridePendingTransition(i, i);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m5604i0(View view) {
        o6j0.c("e_matched_later", act().pageId(), new o6j0.a[]{o6j0.a.h("match_source", this.f4853z.m5986p0(act().f360e))});
        act().f364i = true;
        this.f4853z.m8541g1();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5590U(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m5606j0(int i, int i2, Intent intent) {
        act();
        if (i != 144) {
            return false;
        }
        if (i2 != 100) {
            return true;
        }
        this.f4853z.m8543i1(intent.getStringExtra("input"), false);
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m5607k0(VEditText vEditText, final qhy[] qhyVarArr, View view) {
        String strTrim = vEditText.getText().toString().trim();
        this.f4853z.m8544j1(strTrim, new d30() { // from class: l.z6x
            @Override // p003l.d30
            public final void call() {
                qhyVarArr[0].b();
            }
        });
        o6j0.c("e_matched_edit_question_done", act().pageId(), new o6j0.a[]{o6j0.a.h("truth_question", strTrim)});
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m5608l0(VEditText vEditText) {
        vEditText.requestFocus();
        act().showInput(vEditText, 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m5609m0(List<BreakIce> list) {
        if (vwb.J(list)) {
            return;
        }
        if (this.f4827D) {
            BreakIce breakIce = null;
            for (BreakIce breakIce2 : list) {
                if (TextUtils.equals(breakIce2.kind, "exclusive")) {
                    breakIce = breakIce2;
                }
            }
            if (NullChecker.a(breakIce)) {
                list.remove(breakIce);
                list.add(0, breakIce);
            }
            this.f4853z.m8545k1(breakIce);
        } else {
            vwb.d0(list, new w9j() { // from class: l.y6x
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BreakIce) obj).kind, "exclusive"));
                }
            });
        }
        list.subList(0, Math.min(list.size(), 3));
        this.f4824A.m5627I(list);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m5610n0() {
        xdl0.M(this.f4836i, true);
        boolean zF0 = u59.f0();
        VImage vImage = this.f4836i;
        if (zF0) {
            vImage.setImageDrawable(e16.e(act(), x2c0.be));
        } else {
            vImage.setImageDrawable(e16.e(act(), x2c0.ae));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m5611o0() {
        xdl0.M(this.f4832e, true);
        boolean zF0 = u59.f0();
        VImage vImage = this.f4832e;
        if (zF0) {
            vImage.setImageDrawable(e16.e(act(), x2c0.be));
        } else {
            vImage.setImageDrawable(e16.e(act(), x2c0.ae));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m5612p0(final User user, final User user2, int i) {
        if (user == null || user2 == null) {
            NullChecker.b(user);
            NullChecker.b(user2);
            act().finish();
            return;
        }
        this.f4824A = new C0368d();
        this.f4825B = new C0366b();
        this.f4843p.setAdapter(this.f4824A);
        this.f4850w.setAdapter(this.f4825B);
        m5596a0(i);
        qib0.G.J0(this.f4831d, user.fp().profileMiddle(), false);
        qib0.G.J0(this.f4835h, user2.fp().profileMiddle(), false);
        e51.H(act(), new Runnable() { // from class: l.x6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f8737a.m5599d0(user2);
            }
        }, 350L);
        List<String> listU0 = upa.u0();
        boolean zJ = vwb.J(listU0);
        RecyclerView recyclerView = this.f4850w;
        if (zJ) {
            xdl0.M(recyclerView, false);
        } else {
            xdl0.M(recyclerView, true);
            this.f4825B.m5619I(listU0);
        }
        boolean zEquals = TEnum.equals(user.gender, "female");
        this.f4827D = zEquals;
        RecyclerView recyclerView2 = this.f4843p;
        if (zEquals) {
            xdl0.M(recyclerView2, true);
            xdl0.M(this.f4848u, false);
            xdl0.M(this.f4844q, true);
            xdl0.M(this.f4850w, true);
            o6j0.h("e_matched_edit_question", act().pageId(), new o6j0.a[0]);
            o6j0.h("e_match_emoji", act().pageId(), new o6j0.a[0]);
        } else {
            xdl0.M(recyclerView2, true);
            xdl0.M(this.f4844q, false);
            xdl0.M(this.f4850w, false);
            xdl0.M(this.f4848u, true);
        }
        xdl0.E0(this.f4830c, new View.OnClickListener() { // from class: l.b7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2350a.m5600e0(user, view);
            }
        });
        xdl0.E0(this.f4834g, new View.OnClickListener() { // from class: l.c7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2587a.m5601f0(user2, view);
            }
        });
        xdl0.E0(this.f4844q, new View.OnClickListener() { // from class: l.d7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2909a.m5602g0(view);
            }
        });
        xdl0.E0(this.f4848u, new View.OnClickListener() { // from class: l.e7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3223a.m5603h0(user2, view);
            }
        });
        xdl0.E0(this.f4851x, new View.OnClickListener() { // from class: l.f7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3463a.m5604i0(view);
            }
        });
        act().registerOnActivityResultListener(new a.a() { // from class: l.g7x
            /* JADX INFO: renamed from: a */
            public final boolean m4519a(int i2, int i3, Intent intent) {
                return this.f3812a.m5606j0(i2, i3, intent);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.TextView, v.VText] */
    /* JADX INFO: renamed from: r0 */
    public final void m5613r0() {
        final qhy[] qhyVarArr = {null};
        qhy.a aVar = new qhy.a(m5589C0());
        View viewInflate = act().inflater().inflate(f6c0.g7, (ViewGroup) null, false);
        final VEditText vEditText = (VEditText) viewInflate.findViewById(u4c0.m3);
        ?? r5 = (VText) viewInflate.findViewById(u4c0.a2);
        BreakIce breakIceM8529R0 = this.f4853z.m8529R0();
        if (NullChecker.a(breakIceM8529R0) && TextUtils.equals(breakIceM8529R0.kind, "exclusive") && !TextUtils.isEmpty(breakIceM8529R0.content)) {
            vEditText.setText(breakIceM8529R0.content);
            r5.setText(String.format("%1$s/30", Integer.valueOf(breakIceM8529R0.content.length())));
        } else {
            vEditText.setHint("用问题拉近彼此的距离~");
        }
        vEditText.setSelection(vEditText.getText().length());
        vEditText.addTextChangedListener(new C0365a(r5));
        aVar.U(0.7f).f0("设置专属破冰问题").X(x2c0.U).W(new View.OnClickListener() { // from class: l.h7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qhyVarArr[0].b();
            }
        }).Z(R.string.k).b0(e16.c(m5589C0(), w0c0.I)).d0(16.0f).c0(t100.d(20.0f)).Y(new View.OnClickListener() { // from class: l.i7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4377a.m5607k0(vEditText, qhyVarArr, view);
            }
        }).P(viewInflate);
        qhy qhyVarN = aVar.N();
        qhyVarArr[0] = qhyVarN;
        qhyVarN.g();
        e51.H(act(), new Runnable() { // from class: l.j7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f4585a.m5608l0(vEditText);
            }
        }, 150L);
        o6j0.h("e_matched_edit_question_textbox", act().pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final Animator m5614s0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f4841n;
        Property property = View.TRANSLATION_Y;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.z(new Animator[]{bt0.l(textView, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f4842o, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f4847t, property, 0L, j, decelerateInterpolator, new float[]{f, f2}), bt0.l(this.f4851x, property, 0L, j, decelerateInterpolator, new float[]{f, f2})});
    }

    public void destroy() {
    }

    @Override // p003l.yvl
    public void initAnimationState() {
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
    }

    /* JADX INFO: renamed from: l.k7x$a */
    public class C0365a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText f4854a;

        public C0365a(VText vText) {
            this.f4854a = vText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f4854a.setText(String.format("%1$s/30", Integer.valueOf(editable.toString().length())));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

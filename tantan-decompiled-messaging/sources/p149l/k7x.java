package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageHalfPageComposerAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class k7x implements yvl<w6x> {

    /* JADX INFO: renamed from: A */
    public C17946d f121652A = null;

    /* JADX INFO: renamed from: B */
    public C17944b f121653B = null;

    /* JADX INFO: renamed from: C */
    public final zt10 f121654C = new zt10();

    /* JADX INFO: renamed from: D */
    public boolean f121655D = false;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f121656a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f121657b;

    /* JADX INFO: renamed from: c */
    public VRelative f121658c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f121659d;

    /* JADX INFO: renamed from: e */
    public VImage f121660e;

    /* JADX INFO: renamed from: f */
    public Guideline f121661f;

    /* JADX INFO: renamed from: g */
    public VRelative f121662g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f121663h;

    /* JADX INFO: renamed from: i */
    public VImage f121664i;

    /* JADX INFO: renamed from: j */
    public VFrame f121665j;

    /* JADX INFO: renamed from: k */
    public VIcon f121666k;

    /* JADX INFO: renamed from: l */
    public VIcon f121667l;

    /* JADX INFO: renamed from: m */
    public View f121668m;

    /* JADX INFO: renamed from: n */
    public TextView f121669n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f121670o;

    /* JADX INFO: renamed from: p */
    public VRecyclerView f121671p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f121672q;

    /* JADX INFO: renamed from: r */
    public VImage f121673r;

    /* JADX INFO: renamed from: s */
    public VText f121674s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f121675t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f121676u;

    /* JADX INFO: renamed from: v */
    public VText f121677v;

    /* JADX INFO: renamed from: w */
    public VRecyclerView f121678w;

    /* JADX INFO: renamed from: x */
    public VButton_FakeShadow f121679x;

    /* JADX INFO: renamed from: y */
    public final MatchAct f121680y;

    /* JADX INFO: renamed from: z */
    public w6x f121681z;

    /* JADX INFO: renamed from: l.k7x$b */
    public class C17944b extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public final List<String> f121684c;

        public C17944b() {
            this.f121684c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m144778H(String str, int i, View view) {
            k7x.this.f121681z.m201987i1(str, true);
            o6j0.m162859c("e_match_emoji", k7x.this.getAct().pageId(), o6j0.C18854a.m162876f("select_emoji", i + 1));
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f121684c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(k7x.this.getContext()).inflate(f6c0.f95809h7, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final String str, int i, final int i2) {
            float fM136795i = ((ikf0.m136795i(xdl0.m208412y0()) - 86.0f) - 24.0f) / 5.0f;
            xdl0.m208327D0(t100.m186890d(fM136795i), view);
            xdl0.m208325C0(view, t100.m186890d(fM136795i));
            VText vText = (VText) view.findViewById(u4c0.f174426q3);
            vText.setText(str);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.l7x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f126754a.m144778H(str, i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f121684c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m144781I(List<String> list) {
            if (vwb.m200296J(list)) {
                return;
            }
            this.f121684c.clear();
            this.f121684c.addAll(list.subList(0, Math.min(list.size(), 5)));
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l.k7x$c */
    public static class C17945c {
        /* JADX INFO: renamed from: b */
        public static void m144783b(k7x k7xVar, View view) {
            k7xVar.f121656a = (ConstraintLayout) view;
            ViewGroup viewGroup = (ViewGroup) view;
            k7xVar.f121657b = (SVGAnimationView) viewGroup.getChildAt(0);
            k7xVar.f121658c = (VRelative) viewGroup.getChildAt(1);
            k7xVar.f121659d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            k7xVar.f121660e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            k7xVar.f121661f = (Guideline) viewGroup.getChildAt(2);
            k7xVar.f121662g = (VRelative) viewGroup.getChildAt(3);
            k7xVar.f121663h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            k7xVar.f121664i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
            k7xVar.f121665j = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
            k7xVar.f121666k = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
            k7xVar.f121667l = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
            k7xVar.f121668m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
            k7xVar.f121669n = (TextView) viewGroup.getChildAt(4);
            k7xVar.f121670o = (LinearLayout) viewGroup.getChildAt(5);
            k7xVar.f121671p = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
            k7xVar.f121672q = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
            k7xVar.f121673r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(0);
            k7xVar.f121674s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            k7xVar.f121675t = (LinearLayout) viewGroup.getChildAt(6);
            k7xVar.f121676u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
            k7xVar.f121677v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
            k7xVar.f121678w = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
            k7xVar.f121679x = (VButton_FakeShadow) viewGroup.getChildAt(7);
        }

        /* JADX INFO: renamed from: c */
        public static View m144784c(k7x k7xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95775f7, viewGroup, false);
            m144783b(k7xVar, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.k7x$d */
    public class C17946d extends dac0<BreakIce> {

        /* JADX INFO: renamed from: c */
        public final List<BreakIce> f121686c;

        public C17946d() {
            this.f121686c = new ArrayList();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f121686c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(k7x.this.getContext()).inflate(f6c0.f95842j7, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final BreakIce breakIce, int i, int i2) {
            VText vText = (VText) view.findViewById(u4c0.f174231eb);
            VText vText2 = (VText) view.findViewById(u4c0.f173941N3);
            vText.setTextSize(16.0f);
            vText.setText(breakIce.content);
            vText.setTypeface(Typeface.DEFAULT_BOLD);
            if (TextUtils.equals(breakIce.kind, "exclusive")) {
                xdl0.m208344M(vText2, true);
                xdl0.m208360X(vText, t100.m186890d(12.0f));
                vText.setTextColor(e16.m114375c(k7x.this.getContext(), w0c0.f183795P0));
            } else {
                xdl0.m208344M(vText2, false);
                xdl0.m208360X(vText, t100.m186890d(0.0f));
                vText.setTextColor(e16.m114375c(k7x.this.getContext(), w0c0.f183780K0));
            }
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.m7x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f132496a.m144788H(breakIce, view2);
                }
            });
            if (k7x.this.f121654C.m220087a("e_matched_select_question" + breakIce.tipId)) {
                return;
            }
            o6j0.m162864h("e_matched_select_question", k7x.this.getAct().pageId(), o6j0.C18854a.m162878h("truth_question", breakIce.content), o6j0.C18854a.m162879i("self_edit_question", TextUtils.equals(breakIce.kind, "exclusive")));
            k7x.this.f121654C.m220088b("e_matched_select_question" + breakIce.tipId);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BreakIce getItem(int i) {
            return this.f121686c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m144788H(BreakIce breakIce, View view) {
            k7x.this.f121681z.m201987i1(breakIce.content, true);
            o6j0.m162859c("e_matched_select_question", k7x.this.getAct().pageId(), o6j0.C18854a.m162878h("truth_question", breakIce.content), o6j0.C18854a.m162879i("self_edit_question", TextUtils.equals(breakIce.kind, "exclusive")));
        }

        /* JADX INFO: renamed from: I */
        public void m144789I(List<BreakIce> list) {
            if (!vwb.m200296J(list)) {
                this.f121686c.clear();
                this.f121686c.addAll(list.subList(0, Math.min(list.size(), 3)));
                notifyDataSetChanged();
            }
            k7x.this.m144755W();
        }
    }

    public k7x(MatchAct matchAct) {
        this.f121680y = matchAct;
    }

    /* JADX INFO: renamed from: q0 */
    private void m144745q0() {
        getAct();
        ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getAct().getTaskId()));
        if (arrayList == null) {
            this.f121681z.m201975S0();
            return;
        }
        Activity activity = arrayList.size() > 0 ? arrayList.get(0).f15343a.get() : null;
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getWidth() <= 0 || activity.getWindow().getDecorView().getHeight() <= 0) {
            this.f121681z.m201975S0();
        } else {
            a5x.m95061a(activity, getAct(), 0);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f121680y;
    }

    /* JADX INFO: renamed from: U */
    public View m144753U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C17945c.m144784c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f121680y;
    }

    /* JADX INFO: renamed from: W */
    public final void m144755W() {
        e51.m114743H(getAct(), new Runnable() { // from class: l.a7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f67963a.m144761c0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: X */
    public final Animator m144756X(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f121669n;
        Property property = View.ALPHA;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.m103753z(bt0.m103739l(textView, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f121670o, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f121675t, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f121679x, property, 0L, j, decelerateInterpolator, f, f2));
    }

    /* JADX INFO: renamed from: Y */
    public final Animator m144757Y() {
        wqf0 wqf0Var = new wqf0(0.4f);
        VRelative vRelative = this.f121658c;
        Property property = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vRelative, property, 200L, 700L, wqf0Var, -t100.m186890d(108.0f), t100.m186890d(30.0f));
        Animator animatorM103739l2 = bt0.m103739l(this.f121662g, property, 200L, 700L, wqf0Var, t100.m186890d(108.0f), -t100.m186890d(30.0f));
        VRelative vRelative2 = this.f121658c;
        Property property2 = View.ALPHA;
        return bt0.m103753z(animatorM103739l, animatorM103739l2, bt0.m103739l(vRelative2, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f), bt0.m103739l(this.f121662g, property2, 0L, 200L, new AccelerateInterpolator(), 0.0f, 1.0f));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(w6x w6xVar) {
        this.f121681z = w6xVar;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m144759a0(int i) {
        if (i == 12 || i == 11 || (i == 13 && vdj.m198001c())) {
            if (i == 12) {
                m144773o0();
                xdl0.m208344M(this.f121664i, false);
                return;
            } else if (i == 11) {
                m144772n0();
                xdl0.m208344M(this.f121660e, false);
                return;
            } else {
                m144772n0();
                m144773o0();
                return;
            }
        }
        if (i != 39 && i != 37 && i != 38) {
            xdl0.m208344M(this.f121660e, false);
            xdl0.m208344M(this.f121664i, false);
            return;
        }
        if (i == 38) {
            xdl0.m208344M(this.f121660e, true);
            xdl0.m208344M(this.f121664i, false);
            this.f121660e.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
            return;
        }
        VImage vImage = this.f121660e;
        if (i == 37) {
            xdl0.m208344M(vImage, false);
            xdl0.m208344M(this.f121664i, true);
            this.f121664i.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else {
            xdl0.m208344M(vImage, true);
            xdl0.m208344M(this.f121664i, true);
            this.f121660e.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
            this.f121664i.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m144760b0(boolean z) {
        if (!IntlCountryCodeController.m28126v() && z) {
            m144745q0();
        }
        this.f121674s.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m144761c0() {
        float top = this.f121675t.getTop() - this.f121670o.getBottom();
        if (top < 0.0f) {
            float fAbs = Math.abs(top);
            float f = 80.0f - (0.51f * fAbs);
            xdl0.m208360X(this.f121658c, t100.m186890d(Math.max(f, 0.0f)));
            xdl0.m208360X(this.f121662g, t100.m186890d(Math.max(f, 0.0f)));
            xdl0.m208357U(this.f121678w, t100.m186890d(Math.max(30.0f - (0.19f * fAbs), 0.0f)));
            xdl0.m208357U(this.f121679x, t100.m186890d(Math.max(46.0f - (fAbs * 0.3f), 0.0f)));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m144762d0(User user) {
        this.f121669n.setText(String.format("你和%s可以开始聊天啦", user.isFemale() ? "她" : "他"));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m144763e0(User user, View view) {
        getAct().startActivity(ProfileAct.m50736n2(getAct(), user.f56011id, "from_match", false));
        o6j0.m162859c("e_matched_my_profile", getAct().pageId(), new o6j0.C18854a[0]);
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/bdc20c8c-866e-425c-bbac-6b7e958fd0e212.svga").autoPlay(true).repeatCount(1).into(this.f121657b);
        return bt0.m103753z(m144757Y(), m144776s0(500, t100.m186890d(40.0f), 0), m144756X(500, 0, 1));
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        return bt0.m103737j(1);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m144764f0(User user, View view) {
        getAct().startActivity(ProfileAct.m50736n2(getAct(), user.f56011id, "from_match", false));
        o6j0.m162859c("e_matched_other_profile", getAct().pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m144765g0(View view) {
        m144775r0();
        o6j0.m162859c("e_matched_edit_question", getAct().pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m144766h0(User user, View view) {
        Intent intentM48886l2 = MessageHalfPageComposerAct.m48886l2(getAct(), user.f56011id, MessageHalfPageComposerAct.f31606q);
        MatchAct act = getAct();
        getAct();
        act.startActivityForResult(intentM48886l2, 144);
        MatchAct act2 = getAct();
        int i = rzb0.f161633e;
        act2.overridePendingTransition(i, i);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m144767i0(View view) {
        o6j0.m162859c("e_matched_later", getAct().pageId(), o6j0.C18854a.m162878h("match_source", this.f121681z.m148672p0(getAct().f30469e)));
        getAct().f30473i = true;
        this.f121681z.m201985g1();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m144753U(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m144768j0(int i, int i2, Intent intent) {
        getAct();
        if (i != 144) {
            return false;
        }
        if (i2 != 100) {
            return true;
        }
        this.f121681z.m201987i1(intent.getStringExtra("input"), false);
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m144769k0(VEditText vEditText, final qhy[] qhyVarArr, View view) {
        String strTrim = vEditText.getText().toString().trim();
        this.f121681z.m201988j1(strTrim, new d30() { // from class: l.z6x
            @Override // p149l.d30
            public final void call() {
                qhyVarArr[0].m174609b();
            }
        });
        o6j0.m162859c("e_matched_edit_question_done", getAct().pageId(), o6j0.C18854a.m162878h("truth_question", strTrim));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m144770l0(VEditText vEditText) {
        vEditText.requestFocus();
        getAct().showInput(vEditText, 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m144771m0(List<BreakIce> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        if (this.f121655D) {
            BreakIce breakIce = null;
            for (BreakIce breakIce2 : list) {
                if (TextUtils.equals(breakIce2.kind, "exclusive")) {
                    breakIce = breakIce2;
                }
            }
            if (NullChecker.m81303a(breakIce)) {
                list.remove(breakIce);
                list.add(0, breakIce);
            }
            this.f121681z.m201989k1(breakIce);
        } else {
            vwb.m200320d0(list, new w9j() { // from class: l.y6x
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BreakIce) obj).kind, "exclusive"));
                }
            });
        }
        list.subList(0, Math.min(list.size(), 3));
        this.f121652A.m144789I(list);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m144772n0() {
        xdl0.m208344M(this.f121664i, true);
        boolean zM191827f0 = u59.m191827f0();
        VImage vImage = this.f121664i;
        if (zM191827f0) {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f189980ae));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m144773o0() {
        xdl0.m208344M(this.f121660e, true);
        boolean zM191827f0 = u59.m191827f0();
        VImage vImage = this.f121660e;
        if (zM191827f0) {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f190012be));
        } else {
            vImage.setImageDrawable(e16.m114377e(getAct(), x2c0.f189980ae));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m144774p0(final User user, final User user2, int i) {
        if (user == null || user2 == null) {
            NullChecker.m81304b(user);
            NullChecker.m81304b(user2);
            getAct().m66873d2();
            return;
        }
        this.f121652A = new C17946d();
        this.f121653B = new C17944b();
        this.f121671p.setAdapter(this.f121652A);
        this.f121678w.setAdapter(this.f121653B);
        m144759a0(i);
        qib0.f154691G.m102327J0(this.f121659d, user.m60124fp().profileMiddle(), false);
        qib0.f154691G.m102327J0(this.f121663h, user2.m60124fp().profileMiddle(), false);
        e51.m114743H(getAct(), new Runnable() { // from class: l.x6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f191291a.m144762d0(user2);
            }
        }, 350L);
        List<String> listM194823u0 = upa.m194823u0();
        boolean zM200296J = vwb.m200296J(listM194823u0);
        VRecyclerView vRecyclerView = this.f121678w;
        if (zM200296J) {
            xdl0.m208344M(vRecyclerView, false);
        } else {
            xdl0.m208344M(vRecyclerView, true);
            this.f121653B.m144781I(listM194823u0);
        }
        boolean zEquals = TEnum.equals(user.gender, "female");
        this.f121655D = zEquals;
        VRecyclerView vRecyclerView2 = this.f121671p;
        if (zEquals) {
            xdl0.m208344M(vRecyclerView2, true);
            xdl0.m208344M(this.f121676u, false);
            xdl0.m208344M(this.f121672q, true);
            xdl0.m208344M(this.f121678w, true);
            o6j0.m162864h("e_matched_edit_question", getAct().pageId(), new o6j0.C18854a[0]);
            o6j0.m162864h("e_match_emoji", getAct().pageId(), new o6j0.C18854a[0]);
        } else {
            xdl0.m208344M(vRecyclerView2, true);
            xdl0.m208344M(this.f121672q, false);
            xdl0.m208344M(this.f121678w, false);
            xdl0.m208344M(this.f121676u, true);
        }
        xdl0.m208329E0(this.f121658c, new View.OnClickListener() { // from class: l.b7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74025a.m144763e0(user, view);
            }
        });
        xdl0.m208329E0(this.f121662g, new View.OnClickListener() { // from class: l.c7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79663a.m144764f0(user2, view);
            }
        });
        xdl0.m208329E0(this.f121672q, new View.OnClickListener() { // from class: l.d7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84802a.m144765g0(view);
            }
        });
        xdl0.m208329E0(this.f121676u, new View.OnClickListener() { // from class: l.e7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89764a.m144766h0(user2, view);
            }
        });
        xdl0.m208329E0(this.f121679x, new View.OnClickListener() { // from class: l.f7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96302a.m144767i0(view);
            }
        });
        getAct().registerOnActivityResultListener(new C4317a.a() { // from class: l.g7x
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i2, int i3, Intent intent) {
                return this.f101458a.m144768j0(i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m144775r0() {
        final qhy[] qhyVarArr = {null};
        qhy.C19502a c19502a = new qhy.C19502a(getContext());
        View viewInflate = getAct().inflater().inflate(f6c0.f95792g7, (ViewGroup) null, false);
        final VEditText vEditText = (VEditText) viewInflate.findViewById(u4c0.f174358m3);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174154a2);
        BreakIce breakIceM201974R0 = this.f121681z.m201974R0();
        if (NullChecker.m81303a(breakIceM201974R0) && TextUtils.equals(breakIceM201974R0.kind, "exclusive") && !TextUtils.isEmpty(breakIceM201974R0.content)) {
            vEditText.setText(breakIceM201974R0.content);
            vText.setText(String.format("%1$s/30", Integer.valueOf(breakIceM201974R0.content.length())));
        } else {
            vEditText.setHint("用问题拉近彼此的距离~");
        }
        vEditText.setSelection(vEditText.getText().length());
        vEditText.addTextChangedListener(new C17943a(vText));
        c19502a.m174661U(0.7f).m174672f0("设置专属破冰问题").m174664X(x2c0.f189779U).m174663W(new View.OnClickListener() { // from class: l.h7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qhyVarArr[0].m174609b();
            }
        }).m174666Z(R$string.f18653k).m174668b0(e16.m114375c(getContext(), w0c0.f183773I)).m174670d0(16.0f).m174669c0(t100.m186890d(20.0f)).m174665Y(new View.OnClickListener() { // from class: l.i7x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111958a.m144769k0(vEditText, qhyVarArr, view);
            }
        }).m174656P(viewInflate);
        qhy qhyVarM174654N = c19502a.m174654N();
        qhyVarArr[0] = qhyVarM174654N;
        qhyVarM174654N.m174614g();
        e51.m114743H(getAct(), new Runnable() { // from class: l.j7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f116660a.m144770l0(vEditText);
            }
        }, 150L);
        o6j0.m162864h("e_matched_edit_question_textbox", getAct().pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final Animator m144776s0(int i, int i2, int i3) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        TextView textView = this.f121669n;
        Property property = View.TRANSLATION_Y;
        long j = i;
        float f = i2;
        float f2 = i3;
        return bt0.m103753z(bt0.m103739l(textView, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f121670o, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f121675t, property, 0L, j, decelerateInterpolator, f, f2), bt0.m103739l(this.f121679x, property, 0L, j, decelerateInterpolator, f, f2));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.yvl
    public void initAnimationState() {
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
    }

    /* JADX INFO: renamed from: l.k7x$a */
    public class C17943a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VText f121682a;

        public C17943a(VText vText) {
            this.f121682a = vText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f121682a.setText(String.format("%1$s/30", Integer.valueOf(editable.toString().length())));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

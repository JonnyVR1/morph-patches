package p003l;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p000p1.mobile.putong.core.p001ui.match.view.MatchBlackShadowView;
import com.p000p1.mobile.putong.core.p001ui.match.view.MatchEdgeTransFrameLayout;
import com.p000p1.mobile.putong.core.p001ui.match.view.MatchPicViewPager;
import com.p000p1.mobile.putong.core.p001ui.match.view.MatchTransView;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.bt0;
import l.dyq;
import l.fyq;
import l.i6x;
import l.j8k0;
import l.o6j0;
import l.t100;
import l.w660;
import l.xdl0;
import l.zvf0;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class h6x implements yvl<w5x> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4121a;

    /* JADX INFO: renamed from: b */
    public MatchPicViewPager f4122b;

    /* JADX INFO: renamed from: c */
    public MatchTransView f4123c;

    /* JADX INFO: renamed from: d */
    public MatchBlackShadowView f4124d;

    /* JADX INFO: renamed from: e */
    public NewPictureContainerIndicator f4125e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f4126f;

    /* JADX INFO: renamed from: g */
    public VText f4127g;

    /* JADX INFO: renamed from: h */
    public View f4128h;

    /* JADX INFO: renamed from: i */
    public MatchEdgeTransFrameLayout f4129i;

    /* JADX INFO: renamed from: j */
    public VText f4130j;

    /* JADX INFO: renamed from: k */
    public EditText f4131k;

    /* JADX INFO: renamed from: l */
    public TextView f4132l;

    /* JADX INFO: renamed from: m */
    public TextView f4133m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f4134n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f4135o;

    /* JADX INFO: renamed from: p */
    public VImage f4136p;

    /* JADX INFO: renamed from: q */
    public VImage f4137q;

    /* JADX INFO: renamed from: r */
    public MatchAct f4138r;

    /* JADX INFO: renamed from: s */
    public w5x f4139s;

    /* JADX INFO: renamed from: t */
    public fyq f4140t;

    /* JADX INFO: renamed from: v */
    public aex f4142v;

    /* JADX INFO: renamed from: u */
    public boolean f4141u = false;

    /* JADX INFO: renamed from: w */
    public int f4143w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f4144x = false;

    /* JADX INFO: renamed from: l.h6x$a */
    public class C0332a implements ViewPager.j {
        public C0332a() {
        }

        public void onPageScrollStateChanged(int i) {
            h6x.this.m4951v();
        }

        public void onPageScrolled(int i, float f, int i2) {
            h6x.this.m4940I(i, (int) (100.0f * f));
            h6x.this.f4125e.onPageScrolled(i, f, i2);
        }

        public void onPageSelected(int i) {
            h6x.this.f4125e.b(i);
            h6x.this.f4139s.m8510l1(i);
            h6x.this.m4940I(i, 0);
        }
    }

    /* JADX INFO: renamed from: l.h6x$c */
    public class RunnableC0334c implements Runnable {
        public RunnableC0334c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h6x.this.m4938G();
        }
    }

    public h6x(MatchAct matchAct) {
        this.f4138r = matchAct;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    private void m4921J(final VText vText, final int i) {
        vText.post(new Runnable() { // from class: l.f6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3458a.m4936E(vText, i);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m4932A() {
        this.f4140t.h();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m4933B(int[] iArr) {
        Rect rect = new Rect();
        this.f4127g.getGlobalVisibleRect(rect);
        m4948q(rect.top);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m4934C() {
        this.f4131k.requestFocus();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m4935C0() {
        return this.f4138r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4936E(VText vText, int i) {
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

    /* JADX INFO: renamed from: F */
    public void m4937F() {
        this.f4133m.setClickable(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m4938G() {
        ArrayList<w5x.C0614b> arrayListM8491S0 = this.f4139s.m8491S0();
        this.f4142v.m2845d(arrayListM8491S0.get(this.f4122b.getCurrentItem()).f8498b, arrayListM8491S0.size() > this.f4122b.getCurrentItem() + 1 ? arrayListM8491S0.get(this.f4122b.getCurrentItem() + 1).f8498b : -2302756);
        this.f4123c.setRenderColor(this.f4142v.m2844c());
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
    /* JADX INFO: renamed from: H */
    public final void m4939H(User user, int i, ArrayList<String> arrayList) {
        String str;
        if (i == 15) {
            this.f4127g.setText(R.string.R1);
            return;
        }
        if (i == 0 || i == 12 || i == 11 || i == 13 || i == 39 || i == 37 || i == 38 || i == 10 || i == 35 || i == 36) {
            this.f4127g.setText(act().getString(R.string.Jh, user.name));
            m4921J(this.f4127g, R.string.Jh);
            return;
        }
        if (i != 1) {
            if (i == 26) {
                this.f4127g.setText(act().getString(R.string.Jh, user.name));
                m4921J(this.f4127g, R.string.Jh);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f4127g;
        dyq dyqVarAct = act();
        int i2 = R.string.um;
        if (arrayList.size() > 0) {
            str = user.name + " (" + arrayList.get(0) + ")";
        } else {
            str = user.name;
        }
        appCompatTextView.setText(dyqVarAct.getString(i2, str));
        m4921J(this.f4127g, R.string.um);
    }

    /* JADX INFO: renamed from: I */
    public void m4940I(int i, int i2) {
        ArrayList<w5x.C0614b> arrayListM8491S0 = this.f4139s.m8491S0();
        int i3 = arrayListM8491S0.get(i).f8498b;
        int i4 = i + 1;
        this.f4142v.m2846e(i2, i3, arrayListM8491S0.size() > i4 ? arrayListM8491S0.get(i4).f8498b : -2302756);
        this.f4123c.setRenderColor(this.f4142v.m2844c());
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
    /* JADX INFO: renamed from: K */
    public void m4941K(int i) {
        float fMin;
        float fMin2;
        float fMin3;
        float f;
        float f2 = 0.0f;
        float fMin4 = 16.0f;
        if (i < 200) {
            f = i / 200.0f;
            fMin3 = 0.0f;
            fMin2 = 0.0f;
            fMin = 1.0f;
        } else {
            float f3 = i;
            float f4 = f3 - 200.0f;
            float f5 = f4 / 500.0f;
            float fMin5 = Math.min(1.0f, f5);
            fMin = 1.0f - Math.min(0.4f, (f4 * 0.4f) / 500.0f);
            fMin2 = Math.min(1.0f, f5);
            if (i < 700) {
                fMin4 = 16.0f - (Math.min(1.0f, f5) * 15.0f);
            } else {
                int i2 = i - 700;
                if (i2 >= 225) {
                    i2 = 450 - i2;
                }
                fMin4 = Math.min(1.0f, 1.0f - ((i2 * 0.15f) / 225.0f));
            }
            fMin3 = i > 450 ? Math.min(1.0f, (f3 - 450.0f) / 250.0f) : 0.0f;
            f = 1.0f;
            f2 = fMin5;
        }
        this.f4137q.setAlpha(f2);
        this.f4136p.setAlpha(fMin);
        this.f4136p.setScaleY(fMin2);
        this.f4136p.setScaleX(fMin2);
        this.f4137q.setScaleY(fMin4);
        this.f4137q.setScaleX(fMin4);
        this.f4125e.setAlpha(fMin3);
        this.f4126f.setAlpha(fMin3);
        float f6 = 3.0f * f;
        this.f4123c.setAlpha(Math.min(1.0f, f6));
        this.f4124d.setAlpha(Math.min(1.0f, f6));
        this.f4122b.setAlpha(f);
    }

    /* JADX INFO: renamed from: L */
    public final void m4942L(boolean z, int i) {
        if (z) {
            this.f4124d.animate().translationY(z ? -(i - t100.d(90.0f)) : 0).setDuration(180L).start();
            return;
        }
        if (this.f4124d.animate() != null) {
            this.f4124d.animate().cancel();
        }
        this.f4124d.setTranslationY(0.0f);
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        return null;
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        return bt0.p(this.f4121a, "alpha", 0L, 350L, new AnticipateInterpolator(), new float[]{1.0f, 0.0f});
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
        int i3 = this.f4143w;
        if (i - i3 > 0 || i > 0) {
            if (!this.f4144x) {
                this.f4134n.setVisibility(0);
                this.f4128h.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.f4134n.getLayoutParams();
                layoutParams.height = i - t100.d(90.0f);
                this.f4134n.setLayoutParams(layoutParams);
                m4942L(true, i);
                m4951v();
                this.f4131k.requestFocus();
            }
            this.f4131k.postDelayed(new Runnable() { // from class: l.z5x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9263a.m4934C();
                }
            }, 180L);
            this.f4144x = true;
        } else if (i - i3 < 0) {
            if (this.f4144x) {
                this.f4134n.setVisibility(8);
                this.f4128h.setVisibility(0);
                m4942L(false, i);
            }
            this.f4144x = false;
        }
        this.f4143w = i;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4945m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m4945m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i6x.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f4138r;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m4944i1(w5x w5xVar) {
        this.f4139s = w5xVar;
    }

    /* JADX INFO: renamed from: q */
    public final void m4948q(final int i) {
        xdl0.Q0(this.f4135o, new e30() { // from class: l.g6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3807a.m4953x(i, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m4949s() {
        this.f4123c.post(new RunnableC0334c());
    }

    /* JADX INFO: renamed from: u */
    public int m4950u() {
        return this.f4122b.getCurrentItem();
    }

    /* JADX INFO: renamed from: v */
    public void m4951v() {
        if (this.f4141u) {
            return;
        }
        this.f4141u = true;
        this.f4135o.animate().alpha(0.0f).setDuration(180L).start();
    }

    /* JADX INFO: renamed from: w */
    public void m4952w(User user, w660 w660Var, int i, ArrayList<String> arrayList) {
        if (user == null) {
            act().finish();
            return;
        }
        this.f4142v = new aex();
        xdl0.X(this.f4125e, xdl0.F0());
        this.f4125e.setIndicatorCount(w660Var.getCount());
        xdl0.M(this.f4125e, w660Var.getCount() > 1);
        this.f4122b.setAdapter(w660Var);
        this.f4122b.d(new C0332a());
        xdl0.E0(this.f4133m, new View.OnClickListener() { // from class: l.a6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2085a.m4954y(view);
            }
        });
        xdl0.E0(this.f4132l, new View.OnClickListener() { // from class: l.b6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2345a.m4955z(view);
            }
        });
        xdl0.E0(this.f4131k, new View.OnClickListener() { // from class: l.c6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.r("e_matched_text_box", "p_successful_match_view");
            }
        });
        this.f4131k.addTextChangedListener(new C0333b());
        this.f4132l.setAlpha(0.5f);
        this.f4132l.setClickable(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(180L);
        this.f4126f.setLayoutTransition(layoutTransition);
        if (this.f4140t == null) {
            this.f4140t = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.d6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f2901a.m4932A();
            }
        });
        m4939H(user, i, arrayList);
        if (TextUtils.isEmpty(user.description)) {
            xdl0.M(this.f4129i, false);
        } else {
            this.f4130j.setText(j8k0.a(user.description));
        }
        xdl0.Q0(this.f4127g, new e30() { // from class: l.e6x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3207a.m4933B((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m4953x(int i, int[] iArr) {
        Rect rect = new Rect();
        this.f4135o.getGlobalVisibleRect(rect);
        xdl0.C0(this.f4128h, t100.d(100.0f) + ((i - t100.d(20.0f)) - rect.bottom));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m4954y(View view) {
        o6j0.c("e_matched_later", act().pageId(), new o6j0.a[]{o6j0.a.h("match_source", this.f4139s.m5986p0(act().f360e))});
        this.f4139s.m8502e1();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m4955z(View view) {
        this.f4139s.m8509k1(this.f4131k.getText().toString().trim(), this.f4144x);
    }

    public void destroy() {
    }

    @Override // p003l.yvl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.h6x$b */
    public class C0333b implements TextWatcher {
        public C0333b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            boolean zIsEmpty = TextUtils.isEmpty(strTrim);
            h6x h6xVar = h6x.this;
            if (zIsEmpty) {
                h6xVar.f4132l.setAlpha(0.5f);
            } else {
                h6xVar.f4132l.setAlpha(1.0f);
            }
            h6x.this.f4132l.setClickable(!TextUtils.isEmpty(strTrim));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

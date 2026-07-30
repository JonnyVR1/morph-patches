package p153l;

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
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchBlackShadowView;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchEdgeTransFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchPicViewPager;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchTransView;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class g9x implements qyl<v8x> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f102901a;

    /* JADX INFO: renamed from: b */
    public MatchPicViewPager f102902b;

    /* JADX INFO: renamed from: c */
    public MatchTransView f102903c;

    /* JADX INFO: renamed from: d */
    public MatchBlackShadowView f102904d;

    /* JADX INFO: renamed from: e */
    public NewPictureContainerIndicator f102905e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f102906f;

    /* JADX INFO: renamed from: g */
    public VText f102907g;

    /* JADX INFO: renamed from: h */
    public View f102908h;

    /* JADX INFO: renamed from: i */
    public MatchEdgeTransFrameLayout f102909i;

    /* JADX INFO: renamed from: j */
    public VText f102910j;

    /* JADX INFO: renamed from: k */
    public EditText f102911k;

    /* JADX INFO: renamed from: l */
    public TextView f102912l;

    /* JADX INFO: renamed from: m */
    public TextView f102913m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f102914n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f102915o;

    /* JADX INFO: renamed from: p */
    public VImage f102916p;

    /* JADX INFO: renamed from: q */
    public VImage f102917q;

    /* JADX INFO: renamed from: r */
    public MatchAct f102918r;

    /* JADX INFO: renamed from: s */
    public v8x f102919s;

    /* JADX INFO: renamed from: t */
    public f0r f102920t;

    /* JADX INFO: renamed from: v */
    public zgx f102922v;

    /* JADX INFO: renamed from: u */
    public boolean f102921u = false;

    /* JADX INFO: renamed from: w */
    public int f102923w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f102924x = false;

    /* JADX INFO: renamed from: l.g9x$a */
    public class C17184a implements ViewPager.InterfaceC0718j {
        public C17184a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            g9x.this.m129670v();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            g9x.this.m129661I(i, (int) (100.0f * f));
            g9x.this.f102905e.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            g9x.this.f102905e.m37958b(i);
            g9x.this.f102919s.m200359l1(i);
            g9x.this.m129661I(i, 0);
        }
    }

    /* JADX INFO: renamed from: l.g9x$c */
    public class RunnableC17186c implements Runnable {
        public RunnableC17186c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g9x.this.m129659G();
        }
    }

    public g9x(MatchAct matchAct) {
        this.f102918r = matchAct;
    }

    /* JADX INFO: renamed from: J */
    private void m129643J(final VText vText, final int i) {
        vText.post(new Runnable() { // from class: l.e9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f92705a.m129657E(vText, i);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m129654A() {
        this.f102920t.m123510h();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m129655B(int[] iArr) {
        Rect rect = new Rect();
        this.f102907g.getGlobalVisibleRect(rect);
        m129667q(rect.top);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m129656C() {
        this.f102911k.requestFocus();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f102918r;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m129657E(VText vText, int i) {
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
    public void m129658F() {
        this.f102913m.setClickable(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m129659G() {
        ArrayList<v8x.C20788b> arrayListM200344S0 = this.f102919s.m200344S0();
        this.f102922v.m219680d(arrayListM200344S0.get(this.f102902b.getCurrentItem()).f182907b, arrayListM200344S0.size() > this.f102902b.getCurrentItem() + 1 ? arrayListM200344S0.get(this.f102902b.getCurrentItem() + 1).f182907b : -2302756);
        this.f102903c.setRenderColor(this.f102922v.m219679c());
    }

    /* JADX INFO: renamed from: H */
    public final void m129660H(User user, int i, ArrayList<String> arrayList) {
        String str;
        if (i == 15) {
            this.f102907g.setText(R$string.f18808R1);
            return;
        }
        if (i == 0 || i == 12 || i == 11 || i == 13 || i == 39 || i == 37 || i == 38 || i == 10 || i == 35 || i == 36) {
            this.f102907g.setText(act().getString(R$string.f19218ei, user.name));
            m129643J(this.f102907g, R$string.f19218ei);
            return;
        }
        if (i != 1) {
            if (i == 26) {
                this.f102907g.setText(act().getString(R$string.f19218ei, user.name));
                m129643J(this.f102907g, R$string.f19218ei);
                return;
            }
            return;
        }
        VText vText = this.f102907g;
        MatchAct matchActAct = act();
        int i2 = R$string.f18799Qm;
        if (arrayList.size() > 0) {
            str = user.name + " (" + arrayList.get(0) + ")";
        } else {
            str = user.name;
        }
        vText.setText(matchActAct.getString(i2, str));
        m129643J(this.f102907g, R$string.f18799Qm);
    }

    /* JADX INFO: renamed from: I */
    public void m129661I(int i, int i2) {
        ArrayList<v8x.C20788b> arrayListM200344S0 = this.f102919s.m200344S0();
        int i3 = arrayListM200344S0.get(i).f182907b;
        int i4 = i + 1;
        this.f102922v.m219681e(i2, i3, arrayListM200344S0.size() > i4 ? arrayListM200344S0.get(i4).f182907b : -2302756);
        this.f102903c.setRenderColor(this.f102922v.m219679c());
    }

    /* JADX INFO: renamed from: K */
    public void m129662K(int i) {
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
        this.f102917q.setAlpha(f2);
        this.f102916p.setAlpha(fMin);
        this.f102916p.setScaleY(fMin2);
        this.f102916p.setScaleX(fMin2);
        this.f102917q.setScaleY(fMin4);
        this.f102917q.setScaleX(fMin4);
        this.f102905e.setAlpha(fMin3);
        this.f102906f.setAlpha(fMin3);
        float f6 = 3.0f * f;
        this.f102903c.setAlpha(Math.min(1.0f, f6));
        this.f102904d.setAlpha(Math.min(1.0f, f6));
        this.f102902b.setAlpha(f);
    }

    /* JADX INFO: renamed from: L */
    public final void m129663L(boolean z, int i) {
        if (z) {
            this.f102904d.animate().translationY(z ? -(i - qa00.m175859d(90.0f)) : 0).setDuration(180L).start();
            return;
        }
        if (this.f102904d.animate() != null) {
            this.f102904d.animate().cancel();
        }
        this.f102904d.setTranslationY(0.0f);
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        return null;
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        return gt0.m132170p(this.f102901a, "alpha", 0L, 350L, new AnticipateInterpolator(), 1.0f, 0.0f);
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
        int i3 = this.f102923w;
        if (i - i3 > 0 || i > 0) {
            if (!this.f102924x) {
                this.f102914n.setVisibility(0);
                this.f102908h.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.f102914n.getLayoutParams();
                layoutParams.height = i - qa00.m175859d(90.0f);
                this.f102914n.setLayoutParams(layoutParams);
                m129663L(true, i);
                m129670v();
                this.f102911k.requestFocus();
            }
            this.f102911k.postDelayed(new Runnable() { // from class: l.y8x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198052a.m129656C();
                }
            }, 180L);
            this.f102924x = true;
        } else if (i - i3 < 0) {
            if (this.f102924x) {
                this.f102914n.setVisibility(8);
                this.f102908h.setVisibility(0);
                m129663L(false, i);
            }
            this.f102924x = false;
        }
        this.f102923w = i;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m129664m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m129664m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h9x.m134092b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f102918r;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v8x v8xVar) {
        this.f102919s = v8xVar;
    }

    /* JADX INFO: renamed from: q */
    public final void m129667q(final int i) {
        bnl0.m105533Q0(this.f102915o, new y20() { // from class: l.f9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97924a.m129672x(i, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m129668s() {
        this.f102903c.post(new RunnableC17186c());
    }

    /* JADX INFO: renamed from: u */
    public int m129669u() {
        return this.f102902b.getCurrentItem();
    }

    /* JADX INFO: renamed from: v */
    public void m129670v() {
        if (this.f102921u) {
            return;
        }
        this.f102921u = true;
        this.f102915o.animate().alpha(0.0f).setDuration(180L).start();
    }

    /* JADX INFO: renamed from: w */
    public void m129671w(User user, cf60 cf60Var, int i, ArrayList<String> arrayList) {
        if (user == null) {
            act().m45660g2();
            return;
        }
        this.f102922v = new zgx();
        bnl0.m105540X(this.f102905e, bnl0.m105511F0());
        this.f102905e.setIndicatorCount(cf60Var.getCount());
        bnl0.m105524M(this.f102905e, cf60Var.getCount() > 1);
        this.f102902b.setAdapter(cf60Var);
        this.f102902b.m4187d(new C17184a());
        bnl0.m105509E0(this.f102913m, new View.OnClickListener() { // from class: l.z8x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203422a.m129673y(view);
            }
        });
        bnl0.m105509E0(this.f102912l, new View.OnClickListener() { // from class: l.a9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69084a.m129674z(view);
            }
        });
        bnl0.m105509E0(this.f102911k, new View.OnClickListener() { // from class: l.b9x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138520r("e_matched_text_box", "p_successful_match_view");
            }
        });
        this.f102911k.addTextChangedListener(new C17185b());
        this.f102912l.setAlpha(0.5f);
        this.f102912l.setClickable(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(180L);
        this.f102906f.setLayoutTransition(layoutTransition);
        if (this.f102920t == null) {
            this.f102920t = new f0r(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.c9x
            @Override // java.lang.Runnable
            public final void run() {
                this.f80533a.m129654A();
            }
        });
        m129660H(user, i, arrayList);
        if (TextUtils.isEmpty(user.description)) {
            bnl0.m105524M(this.f102909i, false);
        } else {
            this.f102910j.setText(phk0.m172327a(user.description));
        }
        bnl0.m105533Q0(this.f102907g, new y20() { // from class: l.d9x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85826a.m129655B((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m129672x(int i, int[] iArr) {
        Rect rect = new Rect();
        this.f102915o.getGlobalVisibleRect(rect);
        bnl0.m105505C0(this.f102908h, qa00.m175859d(100.0f) + ((i - qa00.m175859d(20.0f)) - rect.bottom));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m129673y(View view) {
        sfj0.m185596c("e_matched_later", act().pageId(), sfj0.C20032a.m185615h("match_source", this.f102919s.m148776p0(act().f31317e)));
        this.f102919s.m200352e1();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m129674z(View view) {
        this.f102919s.m200358k1(this.f102911k.getText().toString().trim(), this.f102924x);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.qyl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.g9x$b */
    public class C17185b implements TextWatcher {
        public C17185b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            boolean zIsEmpty = TextUtils.isEmpty(strTrim);
            g9x g9xVar = g9x.this;
            if (zIsEmpty) {
                g9xVar.f102912l.setAlpha(0.5f);
            } else {
                g9xVar.f102912l.setAlpha(1.0f);
            }
            g9x.this.f102912l.setClickable(!TextUtils.isEmpty(strTrim));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

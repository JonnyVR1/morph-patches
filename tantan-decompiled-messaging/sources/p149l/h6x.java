package p149l;

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
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchBlackShadowView;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchEdgeTransFrameLayout;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchPicViewPager;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchTransView;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class h6x implements yvl<w5x> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f106123a;

    /* JADX INFO: renamed from: b */
    public MatchPicViewPager f106124b;

    /* JADX INFO: renamed from: c */
    public MatchTransView f106125c;

    /* JADX INFO: renamed from: d */
    public MatchBlackShadowView f106126d;

    /* JADX INFO: renamed from: e */
    public NewPictureContainerIndicator f106127e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f106128f;

    /* JADX INFO: renamed from: g */
    public VText f106129g;

    /* JADX INFO: renamed from: h */
    public View f106130h;

    /* JADX INFO: renamed from: i */
    public MatchEdgeTransFrameLayout f106131i;

    /* JADX INFO: renamed from: j */
    public VText f106132j;

    /* JADX INFO: renamed from: k */
    public EditText f106133k;

    /* JADX INFO: renamed from: l */
    public TextView f106134l;

    /* JADX INFO: renamed from: m */
    public TextView f106135m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f106136n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f106137o;

    /* JADX INFO: renamed from: p */
    public VImage f106138p;

    /* JADX INFO: renamed from: q */
    public VImage f106139q;

    /* JADX INFO: renamed from: r */
    public MatchAct f106140r;

    /* JADX INFO: renamed from: s */
    public w5x f106141s;

    /* JADX INFO: renamed from: t */
    public fyq f106142t;

    /* JADX INFO: renamed from: v */
    public aex f106144v;

    /* JADX INFO: renamed from: u */
    public boolean f106143u = false;

    /* JADX INFO: renamed from: w */
    public int f106145w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f106146x = false;

    /* JADX INFO: renamed from: l.h6x$a */
    public class C17235a implements ViewPager.InterfaceC0716j {
        public C17235a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            h6x.this.m129564v();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            h6x.this.m129554I(i, (int) (100.0f * f));
            h6x.this.f106127e.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            h6x.this.f106127e.m36955b(i);
            h6x.this.f106141s.m201725l1(i);
            h6x.this.m129554I(i, 0);
        }
    }

    /* JADX INFO: renamed from: l.h6x$c */
    public class RunnableC17237c implements Runnable {
        public RunnableC17237c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h6x.this.m129552G();
        }
    }

    public h6x(MatchAct matchAct) {
        this.f106140r = matchAct;
    }

    /* JADX INFO: renamed from: J */
    private void m129536J(final VText vText, final int i) {
        vText.post(new Runnable() { // from class: l.f6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f96174a.m129550E(vText, i);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m129547A() {
        this.f106142t.m123795h();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m129548B(int[] iArr) {
        Rect rect = new Rect();
        this.f106129g.getGlobalVisibleRect(rect);
        m129561q(rect.top);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m129549C() {
        this.f106133k.requestFocus();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106140r;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m129550E(VText vText, int i) {
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
    public void m129551F() {
        this.f106135m.setClickable(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m129552G() {
        ArrayList<w5x.C20809b> arrayListM201710S0 = this.f106141s.m201710S0();
        this.f106144v.m96150d(arrayListM201710S0.get(this.f106124b.getCurrentItem()).f184784b, arrayListM201710S0.size() > this.f106124b.getCurrentItem() + 1 ? arrayListM201710S0.get(this.f106124b.getCurrentItem() + 1).f184784b : -2302756);
        this.f106125c.setRenderColor(this.f106144v.m96149c());
    }

    /* JADX INFO: renamed from: H */
    public final void m129553H(User user, int i, ArrayList<String> arrayList) {
        String str;
        if (i == 15) {
            this.f106129g.setText(R$string.f18078R1);
            return;
        }
        if (i == 0 || i == 12 || i == 11 || i == 13 || i == 39 || i == 37 || i == 38 || i == 10 || i == 35 || i == 36) {
            this.f106129g.setText(act().getString(R$string.f17854Jh, user.name));
            m129536J(this.f106129g, R$string.f17854Jh);
            return;
        }
        if (i != 1) {
            if (i == 26) {
                this.f106129g.setText(act().getString(R$string.f17854Jh, user.name));
                m129536J(this.f106129g, R$string.f17854Jh);
                return;
            }
            return;
        }
        VText vText = this.f106129g;
        MatchAct matchActAct = act();
        int i2 = R$string.f18981um;
        if (arrayList.size() > 0) {
            str = user.name + " (" + arrayList.get(0) + ")";
        } else {
            str = user.name;
        }
        vText.setText(matchActAct.getString(i2, str));
        m129536J(this.f106129g, R$string.f18981um);
    }

    /* JADX INFO: renamed from: I */
    public void m129554I(int i, int i2) {
        ArrayList<w5x.C20809b> arrayListM201710S0 = this.f106141s.m201710S0();
        int i3 = arrayListM201710S0.get(i).f184784b;
        int i4 = i + 1;
        this.f106144v.m96151e(i2, i3, arrayListM201710S0.size() > i4 ? arrayListM201710S0.get(i4).f184784b : -2302756);
        this.f106125c.setRenderColor(this.f106144v.m96149c());
    }

    /* JADX INFO: renamed from: K */
    public void m129555K(int i) {
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
        this.f106139q.setAlpha(f2);
        this.f106138p.setAlpha(fMin);
        this.f106138p.setScaleY(fMin2);
        this.f106138p.setScaleX(fMin2);
        this.f106139q.setScaleY(fMin4);
        this.f106139q.setScaleX(fMin4);
        this.f106127e.setAlpha(fMin3);
        this.f106128f.setAlpha(fMin3);
        float f6 = 3.0f * f;
        this.f106125c.setAlpha(Math.min(1.0f, f6));
        this.f106126d.setAlpha(Math.min(1.0f, f6));
        this.f106124b.setAlpha(f);
    }

    /* JADX INFO: renamed from: L */
    public final void m129556L(boolean z, int i) {
        if (z) {
            this.f106126d.animate().translationY(z ? -(i - t100.m186890d(90.0f)) : 0).setDuration(180L).start();
            return;
        }
        if (this.f106126d.animate() != null) {
            this.f106126d.animate().cancel();
        }
        this.f106126d.setTranslationY(0.0f);
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        return null;
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        return bt0.m103743p(this.f106123a, "alpha", 0L, 350L, new AnticipateInterpolator(), 1.0f, 0.0f);
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
        int i3 = this.f106145w;
        if (i - i3 > 0 || i > 0) {
            if (!this.f106146x) {
                this.f106136n.setVisibility(0);
                this.f106130h.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = this.f106136n.getLayoutParams();
                layoutParams.height = i - t100.m186890d(90.0f);
                this.f106136n.setLayoutParams(layoutParams);
                m129556L(true, i);
                m129564v();
                this.f106133k.requestFocus();
            }
            this.f106133k.postDelayed(new Runnable() { // from class: l.z5x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201870a.m129549C();
                }
            }, 180L);
            this.f106146x = true;
        } else if (i - i3 < 0) {
            if (this.f106146x) {
                this.f106136n.setVisibility(8);
                this.f106130h.setVisibility(0);
                m129556L(false, i);
            }
            this.f106146x = false;
        }
        this.f106145w = i;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m129558m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m129558m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i6x.m134668b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f106140r;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(w5x w5xVar) {
        this.f106141s = w5xVar;
    }

    /* JADX INFO: renamed from: q */
    public final void m129561q(final int i) {
        xdl0.m208353Q0(this.f106137o, new e30() { // from class: l.g6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101317a.m129566x(i, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m129562s() {
        this.f106125c.post(new RunnableC17237c());
    }

    /* JADX INFO: renamed from: u */
    public int m129563u() {
        return this.f106124b.getCurrentItem();
    }

    /* JADX INFO: renamed from: v */
    public void m129564v() {
        if (this.f106143u) {
            return;
        }
        this.f106143u = true;
        this.f106137o.animate().alpha(0.0f).setDuration(180L).start();
    }

    /* JADX INFO: renamed from: w */
    public void m129565w(User user, w660 w660Var, int i, ArrayList<String> arrayList) {
        if (user == null) {
            act().m44477e2();
            return;
        }
        this.f106144v = new aex();
        xdl0.m208360X(this.f106127e, xdl0.m208331F0());
        this.f106127e.setIndicatorCount(w660Var.getCount());
        xdl0.m208344M(this.f106127e, w660Var.getCount() > 1);
        this.f106124b.setAdapter(w660Var);
        this.f106124b.m4185d(new C17235a());
        xdl0.m208329E0(this.f106135m, new View.OnClickListener() { // from class: l.a6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67810a.m129567y(view);
            }
        });
        xdl0.m208329E0(this.f106134l, new View.OnClickListener() { // from class: l.b6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73888a.m129568z(view);
            }
        });
        xdl0.m208329E0(this.f106133k, new View.OnClickListener() { // from class: l.c6x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220396r("e_matched_text_box", "p_successful_match_view");
            }
        });
        this.f106133k.addTextChangedListener(new C17236b());
        this.f106134l.setAlpha(0.5f);
        this.f106134l.setClickable(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(180L);
        this.f106128f.setLayoutTransition(layoutTransition);
        if (this.f106142t == null) {
            this.f106142t = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.d6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f84684a.m129547A();
            }
        });
        m129553H(user, i, arrayList);
        if (TextUtils.isEmpty(user.description)) {
            xdl0.m208344M(this.f106131i, false);
        } else {
            this.f106132j.setText(j8k0.m140226a(user.description));
        }
        xdl0.m208353Q0(this.f106129g, new e30() { // from class: l.e6x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89652a.m129548B((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m129566x(int i, int[] iArr) {
        Rect rect = new Rect();
        this.f106137o.getGlobalVisibleRect(rect);
        xdl0.m208325C0(this.f106130h, t100.m186890d(100.0f) + ((i - t100.m186890d(20.0f)) - rect.bottom));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m129567y(View view) {
        o6j0.m162859c("e_matched_later", act().pageId(), o6j0.C18854a.m162878h("match_source", this.f106141s.m148672p0(act().f30469e)));
        this.f106141s.m201718e1();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m129568z(View view) {
        this.f106141s.m201724k1(this.f106133k.getText().toString().trim(), this.f106146x);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.yvl
    public void initAnimationState() {
    }

    /* JADX INFO: renamed from: l.h6x$b */
    public class C17236b implements TextWatcher {
        public C17236b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            boolean zIsEmpty = TextUtils.isEmpty(strTrim);
            h6x h6xVar = h6x.this;
            if (zIsEmpty) {
                h6xVar.f106134l.setAlpha(0.5f);
            } else {
                h6xVar.f106134l.setAlpha(1.0f);
            }
            h6x.this.f106134l.setClickable(!TextUtils.isEmpty(strTrim));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

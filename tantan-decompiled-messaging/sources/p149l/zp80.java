package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.FilterSwitchCell;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VSlider;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class zp80 implements s7m<sp80> {

    /* JADX INFO: renamed from: a */
    public VLinear f204185a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f204186b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f204187c;

    /* JADX INFO: renamed from: d */
    public VScroll f204188d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f204189e;

    /* JADX INFO: renamed from: f */
    public VListCell f204190f;

    /* JADX INFO: renamed from: g */
    public FilterSwitchCell f204191g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f204192h;

    /* JADX INFO: renamed from: i */
    public TextView f204193i;

    /* JADX INFO: renamed from: j */
    public VSlider f204194j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f204195k;

    /* JADX INFO: renamed from: l */
    public VLinear f204196l;

    /* JADX INFO: renamed from: m */
    public Act f204197m;

    /* JADX INFO: renamed from: n */
    public Settings f204198n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f204199o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f204200p;

    /* JADX INFO: renamed from: q */
    public sp80 f204201q;

    /* JADX INFO: renamed from: r */
    public int f204202r;

    /* JADX INFO: renamed from: s */
    public boolean f204203s = false;

    /* JADX INFO: renamed from: t */
    public Runnable f204204t = new Runnable() { // from class: l.wp80
        @Override // java.lang.Runnable
        public final void run() {
            this.f187495a.m219649u();
        }
    };

    /* JADX INFO: renamed from: l.zp80$a */
    public class C21745a extends VSlider.AbstractC22568a {
        public C21745a() {
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: c */
        public void mo55416a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            zp80.this.f204202r = (int) f;
            zp80.this.m219645l(f);
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: d */
        public void mo55417b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo55417b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: l.zp80$b */
    public class C21746b implements CompoundButton.OnCheckedChangeListener {
        public C21746b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zp80 zp80Var = zp80.this;
            if (z) {
                zp80Var.m219645l(zp80Var.f204194j.getValue());
            } else {
                zp80Var.f204194j.setValue(0.0f);
                zp80.this.m219645l(0.0f);
            }
            zp80 zp80Var2 = zp80.this;
            if (z) {
                zp80Var2.m219641B();
            } else {
                zp80Var2.m219648p();
            }
        }
    }

    /* JADX INFO: renamed from: l.zp80$c */
    public class C21747c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f204207a;

        public C21747c(int i) {
            this.f204207a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zp80.this.f204192h.getLayoutParams();
            int i = this.f204207a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            zp80.this.m219647n((int) (i * fFloatValue));
            zp80.this.f204192h.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l.zp80$e */
    public class C21749e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f204210a;

        public C21749e(int i) {
            this.f204210a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zp80.this.f204192h.getLayoutParams();
            int i = this.f204210a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            zp80.this.m219647n((int) (i * fFloatValue));
            zp80.this.f204192h.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l.zp80$g */
    public class C21751g extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f204213a;

        public C21751g(int i) {
            this.f204213a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.m186890d(10.0f), this.f204213a, view.getWidth() + t100.m186890d(10.0f), view.getHeight()));
        }
    }

    public zp80(Act act) {
        this.f204197m = act;
    }

    /* JADX INFO: renamed from: k */
    private void m219635k() {
        if (NullChecker.m81303a(this.f204199o) && this.f204199o.isRunning()) {
            this.f204199o.cancel();
        }
        if (NullChecker.m81303a(this.f204200p) && this.f204200p.isRunning()) {
            this.f204200p.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m219636q(View view) {
        this.f204197m.onBackPressed();
    }

    /* JADX INFO: renamed from: r */
    private void m219637r() {
        this.f204186b.setTitle("隐私管理");
        this.f204186b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.up80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177579a.m219636q(view);
            }
        });
        this.f204201q.f165759e.mo137127v(this.f204196l);
        this.f204201q.f165759e.m213075E(this.f204197m.pageId());
        Drawable drawable = this.f204197m.drawable(CoreModule.f17557o.m195057d().mo33706J9());
        drawable.setBounds(0, 0, t100.m186890d(39.0f), t100.m186890d(14.0f));
        this.f204195k.setCompoundDrawables(null, null, drawable, null);
        this.f204195k.setCompoundDrawablePadding(t100.f167256e);
        xdl0.m208329E0(this.f204191g, new View.OnClickListener() { // from class: l.vp80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182459a.m219638s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m219638s(View view) {
        yij0.m214942T(this.f204191g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m219639v(View view) {
        this.f204201q.m185349z0(yij0.m214965u(this.f204190f));
    }

    /* JADX INFO: renamed from: A */
    public void m219640A(Settings settings) {
        this.f204198n = settings;
        boolean z = settings.getSearchInvisibleRadius().intValue() == 0;
        yij0.m214964t(this.f204190f, settings.hideContacts().booleanValue());
        this.f204190f.setOnClickListener(new View.OnClickListener() { // from class: l.xp80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193903a.m219639v(view);
            }
        });
        boolean zM124564m = g6a.m124564m();
        FilterSwitchCell filterSwitchCell = this.f204191g;
        if (zM124564m) {
            xdl0.m208344M(filterSwitchCell, false);
            xdl0.m208344M(this.f204194j, false);
            this.f204201q.f165759e.m213089u(settings);
            return;
        }
        xdl0.m208345M0(filterSwitchCell, true);
        xdl0.m208345M0(this.f204194j, true);
        this.f204194j.setValueTo(15.0f);
        this.f204194j.setValueFrom(0.0f);
        this.f204194j.setLabelFormatter(new iqk0() { // from class: l.yp80
            @Override // p149l.iqk0
            /* JADX INFO: renamed from: a */
            public final String mo55415a(float f) {
                return this.f199402a.m219650w(f);
            }
        });
        int iIntValue = settings.getSearchInvisibleRadius().intValue() / 200;
        this.f204202r = iIntValue;
        this.f204194j.setValue(iIntValue);
        this.f204194j.mo222965f(new C21745a());
        xdl0.m208344M(this.f204192h, !z);
        this.f204191g.getSwitchButton().setChecked(!z);
        this.f204191g.m55370d(new C21746b());
        if (z) {
            return;
        }
        this.f204204t.run();
    }

    /* JADX INFO: renamed from: B */
    public void m219641B() {
        m219635k();
        this.f204199o = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iM186890d = t100.m186890d(77.0f);
        this.f204199o.setDuration(400L);
        this.f204199o.addUpdateListener(new C21747c(iM186890d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f204192h.getLayoutParams();
        marginLayoutParams.topMargin = -iM186890d;
        this.f204192h.setLayoutParams(marginLayoutParams);
        xdl0.m208344M(this.f204192h, true);
        this.f204199o.addListener(new C21748d());
        this.f204199o.start();
    }

    /* JADX INFO: renamed from: C */
    public boolean m219642C() {
        return yij0.m214942T(this.f204190f);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204197m;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f204197m;
    }

    /* JADX INFO: renamed from: i */
    public View m219643i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bq80.m103359b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM219643i = m219643i(layoutInflater, viewGroup);
        m219637r();
        return viewM219643i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sp80 sp80Var) {
        this.f204201q = sp80Var;
    }

    /* JADX INFO: renamed from: l */
    public void m219645l(float f) {
        int i = (int) (f * 200.0f);
        this.f204198n.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f204204t.run();
        if (this.f204198n.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            this.f204198n.getSettingGroup().search.radius = Integer.valueOf(this.f204198n.getRadiusAllowedMinimum().intValue() + Math.min(this.f204198n.getRadiusAllowedMaximum().intValue() - this.f204198n.getRadiusAllowedMinimum().intValue(), Math.max(0, i)));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m219646m(boolean z) {
        yij0.m214964t(this.f204190f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m219647n(int i) {
        this.f204192h.setOutlineProvider(new C21751g(i));
        this.f204192h.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: p */
    public void m219648p() {
        m219635k();
        this.f204200p = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iM186890d = t100.m186890d(73.0f);
        this.f204200p.setDuration(400L);
        this.f204200p.addUpdateListener(new C21749e(iM186890d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f204192h.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f204192h.setLayoutParams(marginLayoutParams);
        this.f204200p.addListener(new C21750f());
        this.f204200p.start();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m219649u() {
        String str;
        String strConcat;
        String str2;
        String str3;
        int iIntValue = this.f204198n.getSearchInvisibleRadius().intValue();
        String string = this.f204197m.getString(R$string.f27824b2);
        String string2 = this.f204197m.getString(R$string.f27842e2);
        if (iIntValue == 0) {
            str3 = "";
            str2 = "";
        } else {
            if (iIntValue < 1000) {
                str = iIntValue + string2;
                strConcat = "<".concat(str);
            } else if (iIntValue % 1000 == 0) {
                str = (iIntValue / 1000) + string;
                strConcat = "<".concat(str);
            } else {
                str = String.format(Locale.CHINA, "%.1f%s", Double.valueOf(((double) iIntValue) / 1000.0d), string);
                strConcat = "<".concat(str);
            }
            String str4 = strConcat;
            str2 = str;
            str3 = str4;
        }
        this.f204193i.setText(str3);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        FilterSwitchCell filterSwitchCell = this.f204191g;
        if (zIsEmpty) {
            filterSwitchCell.setSubTitle("开启后，指定距离以内的熟人和陌生人都滑不到你");
        } else {
            filterSwitchCell.setSubTitle(String.format(Locale.CHINA, "开启后，离你%s以内的熟人和陌生人都滑不到你", str2));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String m219650w(float f) {
        float f2 = f * 200.0f;
        String string = this.f204197m.getString(R$string.f27824b2);
        String string2 = this.f204197m.getString(R$string.f27842e2);
        if (f2 == 0.0f) {
            return "0";
        }
        if (f2 < 1000.0f) {
            return ((int) f2) + string2;
        }
        if (f2 % 1000.0f == 0.0f) {
            return ((int) (f2 / 1000.0f)) + string;
        }
        return String.format("%.1f", Double.valueOf(((double) f2) / 1000.0d)) + string;
    }

    /* JADX INFO: renamed from: x */
    public void m219651x(Throwable th) {
        this.f204197m.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: y */
    public void m219652y() {
        this.f204197m.progressDismiss();
        m219640A(this.f204198n);
    }

    /* JADX INFO: renamed from: z */
    public void m219653z(String str, boolean z) {
        this.f204197m.progress(str, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zp80$d */
    public class C21748d implements Animator.AnimatorListener {
        public C21748d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.zp80$f */
    public class C21750f implements Animator.AnimatorListener {
        public C21750f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(zp80.this.f204192h, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}

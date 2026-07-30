package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.FilterSwitchCell;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VSlider;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class dy80 implements iam<wx80> {

    /* JADX INFO: renamed from: a */
    public VLinear f91141a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f91142b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f91143c;

    /* JADX INFO: renamed from: d */
    public VScroll f91144d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f91145e;

    /* JADX INFO: renamed from: f */
    public VListCell f91146f;

    /* JADX INFO: renamed from: g */
    public FilterSwitchCell f91147g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f91148h;

    /* JADX INFO: renamed from: i */
    public TextView f91149i;

    /* JADX INFO: renamed from: j */
    public VSlider f91150j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f91151k;

    /* JADX INFO: renamed from: l */
    public VLinear f91152l;

    /* JADX INFO: renamed from: m */
    public Act f91153m;

    /* JADX INFO: renamed from: n */
    public Settings f91154n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f91155o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f91156p;

    /* JADX INFO: renamed from: q */
    public wx80 f91157q;

    /* JADX INFO: renamed from: r */
    public int f91158r;

    /* JADX INFO: renamed from: s */
    public boolean f91159s = false;

    /* JADX INFO: renamed from: t */
    public Runnable f91160t = new Runnable() { // from class: l.ay80
        @Override // java.lang.Runnable
        public final void run() {
            this.f73953a.m118639u();
        }
    };

    /* JADX INFO: renamed from: l.dy80$a */
    public class C16650a extends VSlider.AbstractC22683a {
        public C16650a() {
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: c */
        public void mo56599a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            dy80.this.f91158r = (int) f;
            dy80.this.m118635l(f);
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: d */
        public void mo56600b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo56600b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: l.dy80$b */
    public class C16651b implements CompoundButton.OnCheckedChangeListener {
        public C16651b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            dy80 dy80Var = dy80.this;
            if (z) {
                dy80Var.m118635l(dy80Var.f91150j.getValue());
            } else {
                dy80Var.f91150j.setValue(0.0f);
                dy80.this.m118635l(0.0f);
            }
            dy80 dy80Var2 = dy80.this;
            if (z) {
                dy80Var2.m118631B();
            } else {
                dy80Var2.m118638p();
            }
        }
    }

    /* JADX INFO: renamed from: l.dy80$c */
    public class C16652c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f91163a;

        public C16652c(int i) {
            this.f91163a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dy80.this.f91148h.getLayoutParams();
            int i = this.f91163a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            dy80.this.m118637n((int) (i * fFloatValue));
            dy80.this.f91148h.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l.dy80$e */
    public class C16654e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f91166a;

        public C16654e(int i) {
            this.f91166a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dy80.this.f91148h.getLayoutParams();
            int i = this.f91166a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            dy80.this.m118637n((int) (i * fFloatValue));
            dy80.this.f91148h.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l.dy80$g */
    public class C16656g extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f91169a;

        public C16656g(int i) {
            this.f91169a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - qa00.m175859d(10.0f), this.f91169a, view.getWidth() + qa00.m175859d(10.0f), view.getHeight()));
        }
    }

    public dy80(Act act) {
        this.f91153m = act;
    }

    /* JADX INFO: renamed from: k */
    private void m118625k() {
        if (NullChecker.m82486a(this.f91155o) && this.f91155o.isRunning()) {
            this.f91155o.cancel();
        }
        if (NullChecker.m82486a(this.f91156p) && this.f91156p.isRunning()) {
            this.f91156p.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m118626q(View view) {
        this.f91153m.onBackPressed();
    }

    /* JADX INFO: renamed from: r */
    private void m118627r() {
        this.f91142b.setTitle("隐私管理");
        this.f91142b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.yx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201939a.m118626q(view);
            }
        });
        this.f91157q.f191382e.mo158129v(this.f91152l);
        this.f91157q.f191382e.m158113E(this.f91153m.pageId());
        Drawable drawable = this.f91153m.drawable(CoreModule.f18276o.m132214d().mo34709J9());
        drawable.setBounds(0, 0, qa00.m175859d(39.0f), qa00.m175859d(14.0f));
        this.f91151k.setCompoundDrawables(null, null, drawable, null);
        this.f91151k.setCompoundDrawablePadding(qa00.f156318e);
        bnl0.m105509E0(this.f91147g, new View.OnClickListener() { // from class: l.zx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206445a.m118628s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m118628s(View view) {
        bsj0.m106262T(this.f91147g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m118629v(View view) {
        this.f91157q.m208394z0(bsj0.m106285u(this.f91146f));
    }

    /* JADX INFO: renamed from: A */
    public void m118630A(Settings settings) {
        this.f91154n = settings;
        boolean z = settings.getSearchInvisibleRadius().intValue() == 0;
        bsj0.m106284t(this.f91146f, settings.hideContacts().booleanValue());
        this.f91146f.setOnClickListener(new View.OnClickListener() { // from class: l.by80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78995a.m118629v(view);
            }
        });
        boolean zM184984m = s7a.m184984m();
        FilterSwitchCell filterSwitchCell = this.f91147g;
        if (zM184984m) {
            bnl0.m105524M(filterSwitchCell, false);
            bnl0.m105524M(this.f91150j, false);
            this.f91157q.f191382e.m158128u(settings);
            return;
        }
        bnl0.m105525M0(filterSwitchCell, true);
        bnl0.m105525M0(this.f91150j, true);
        this.f91150j.setValueTo(15.0f);
        this.f91150j.setValueFrom(0.0f);
        this.f91150j.setLabelFormatter(new ozk0() { // from class: l.cy80
            @Override // p153l.ozk0
            /* JADX INFO: renamed from: a */
            public final String mo56598a(float f) {
                return this.f84304a.m118640w(f);
            }
        });
        int iIntValue = settings.getSearchInvisibleRadius().intValue() / 200;
        this.f91158r = iIntValue;
        this.f91150j.setValue(iIntValue);
        this.f91150j.mo224211f(new C16650a());
        bnl0.m105524M(this.f91148h, !z);
        this.f91147g.getSwitchButton().setChecked(!z);
        this.f91147g.m56553d(new C16651b());
        if (z) {
            return;
        }
        this.f91160t.run();
    }

    /* JADX INFO: renamed from: B */
    public void m118631B() {
        m118625k();
        this.f91155o = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iM175859d = qa00.m175859d(77.0f);
        this.f91155o.setDuration(400L);
        this.f91155o.addUpdateListener(new C16652c(iM175859d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f91148h.getLayoutParams();
        marginLayoutParams.topMargin = -iM175859d;
        this.f91148h.setLayoutParams(marginLayoutParams);
        bnl0.m105524M(this.f91148h, true);
        this.f91155o.addListener(new C16653d());
        this.f91155o.start();
    }

    /* JADX INFO: renamed from: C */
    public boolean m118632C() {
        return bsj0.m106262T(this.f91146f);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f91153m;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f91153m;
    }

    /* JADX INFO: renamed from: i */
    public View m118633i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fy80.m128076b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM118633i = m118633i(layoutInflater, viewGroup);
        m118627r();
        return viewM118633i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wx80 wx80Var) {
        this.f91157q = wx80Var;
    }

    /* JADX INFO: renamed from: l */
    public void m118635l(float f) {
        int i = (int) (f * 200.0f);
        this.f91154n.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f91160t.run();
        if (this.f91154n.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            this.f91154n.getSettingGroup().search.radius = Integer.valueOf(this.f91154n.getRadiusAllowedMinimum().intValue() + Math.min(this.f91154n.getRadiusAllowedMaximum().intValue() - this.f91154n.getRadiusAllowedMinimum().intValue(), Math.max(0, i)));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m118636m(boolean z) {
        bsj0.m106284t(this.f91146f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m118637n(int i) {
        this.f91148h.setOutlineProvider(new C16656g(i));
        this.f91148h.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: p */
    public void m118638p() {
        m118625k();
        this.f91156p = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iM175859d = qa00.m175859d(73.0f);
        this.f91156p.setDuration(400L);
        this.f91156p.addUpdateListener(new C16654e(iM175859d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f91148h.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f91148h.setLayoutParams(marginLayoutParams);
        this.f91156p.addListener(new C16655f());
        this.f91156p.start();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m118639u() {
        String str;
        String strConcat;
        String str2;
        String str3;
        int iIntValue = this.f91154n.getSearchInvisibleRadius().intValue();
        String string = this.f91153m.getString(R$string.f28672b2);
        String string2 = this.f91153m.getString(R$string.f28690e2);
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
        this.f91149i.setText(str3);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        FilterSwitchCell filterSwitchCell = this.f91147g;
        if (zIsEmpty) {
            filterSwitchCell.setSubTitle("开启后，指定距离以内的熟人和陌生人都滑不到你");
        } else {
            filterSwitchCell.setSubTitle(String.format(Locale.CHINA, "开启后，离你%s以内的熟人和陌生人都滑不到你", str2));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String m118640w(float f) {
        float f2 = f * 200.0f;
        String string = this.f91153m.getString(R$string.f28672b2);
        String string2 = this.f91153m.getString(R$string.f28690e2);
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
    public void m118641x(Throwable th) {
        this.f91153m.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: y */
    public void m118642y() {
        this.f91153m.progressDismiss();
        m118630A(this.f91154n);
    }

    /* JADX INFO: renamed from: z */
    public void m118643z(String str, boolean z) {
        this.f91153m.progress(str, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dy80$d */
    public class C16653d implements Animator.AnimatorListener {
        public C16653d() {
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

    /* JADX INFO: renamed from: l.dy80$f */
    public class C16655f implements Animator.AnimatorListener {
        public C16655f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(dy80.this.f91148h, false);
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

package p006l;

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
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.FilterSwitchCell;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.bq80;
import l.iqk0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.yij0;
import org.jetbrains.annotations.NotNull;
import v.VLinear;
import v.VListCell;
import v.VProgressBar;
import v.VScroll;
import v.VSlider;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zp80 implements s7m<sp80> {

    /* JADX INFO: renamed from: a */
    public VLinear f28872a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f28873b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f28874c;

    /* JADX INFO: renamed from: d */
    public VScroll f28875d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f28876e;

    /* JADX INFO: renamed from: f */
    public VListCell f28877f;

    /* JADX INFO: renamed from: g */
    public FilterSwitchCell f28878g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f28879h;

    /* JADX INFO: renamed from: i */
    public TextView f28880i;

    /* JADX INFO: renamed from: j */
    public VSlider f28881j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f28882k;

    /* JADX INFO: renamed from: l */
    public VLinear f28883l;

    /* JADX INFO: renamed from: m */
    public Act f28884m;

    /* JADX INFO: renamed from: n */
    public Settings f28885n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f28886o;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f28887p;

    /* JADX INFO: renamed from: q */
    public sp80 f28888q;

    /* JADX INFO: renamed from: r */
    public int f28889r;

    /* JADX INFO: renamed from: s */
    public boolean f28890s = false;

    /* JADX INFO: renamed from: t */
    public Runnable f28891t = new Runnable() { // from class: l.wp80
        @Override // java.lang.Runnable
        public final void run() {
            this.f25276a.m28777u();
        }
    };

    /* JADX INFO: renamed from: l.zp80$a */
    public class C1532a extends VSlider.a {
        public C1532a() {
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m28782a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            zp80.this.f28889r = (int) f;
            zp80.this.m28773l(f);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m28783b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.d(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: l.zp80$b */
    public class C1533b implements CompoundButton.OnCheckedChangeListener {
        public C1533b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zp80 zp80Var = zp80.this;
            if (z) {
                zp80Var.m28773l(zp80Var.f28881j.getValue());
            } else {
                zp80Var.f28881j.setValue(0.0f);
                zp80.this.m28773l(0.0f);
            }
            zp80 zp80Var2 = zp80.this;
            if (z) {
                zp80Var2.m28767B();
            } else {
                zp80Var2.m28776p();
            }
        }
    }

    /* JADX INFO: renamed from: l.zp80$c */
    public class C1534c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28894a;

        public C1534c(int i) {
            this.f28894a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zp80.this.f28879h.getLayoutParams();
            int i = this.f28894a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            zp80.this.m28775n((int) (i * fFloatValue));
            zp80.this.f28879h.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l.zp80$e */
    public class C1536e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28897a;

        public C1536e(int i) {
            this.f28897a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zp80.this.f28879h.getLayoutParams();
            int i = this.f28897a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            zp80.this.m28775n((int) (i * fFloatValue));
            zp80.this.f28879h.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: l.zp80$g */
    public class C1538g extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28900a;

        public C1538g(int i) {
            this.f28900a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.d(10.0f), this.f28900a, view.getWidth() + t100.d(10.0f), view.getHeight()));
        }
    }

    public zp80(Act act) {
        this.f28884m = act;
    }

    /* JADX INFO: renamed from: k */
    private void m28761k() {
        if (NullChecker.a(this.f28886o) && this.f28886o.isRunning()) {
            this.f28886o.cancel();
        }
        if (NullChecker.a(this.f28887p) && this.f28887p.isRunning()) {
            this.f28887p.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m28762q(View view) {
        this.f28884m.onBackPressed();
    }

    /* JADX INFO: renamed from: r */
    private void m28763r() {
        this.f28873b.setTitle("隐私管理");
        this.f28873b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.up80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23693a.m28762q(view);
            }
        });
        this.f28888q.f21562e.mo16747v(this.f28883l);
        this.f28888q.f21562e.m28097E(this.f28884m.pageId());
        Drawable drawable = this.f28884m.drawable(CoreModule.f1546o.m25559d().m5643J9());
        drawable.setBounds(0, 0, t100.d(39.0f), t100.d(14.0f));
        this.f28882k.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.f28882k.setCompoundDrawablePadding(t100.e);
        xdl0.E0(this.f28878g, new View.OnClickListener() { // from class: l.vp80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24408a.m28764s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m28764s(View view) {
        yij0.T(this.f28878g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m28765v(View view) {
        this.f28888q.m24026z0(yij0.u(this.f28877f));
    }

    /* JADX INFO: renamed from: A */
    public void m28766A(Settings settings) {
        this.f28885n = settings;
        boolean z = settings.getSearchInvisibleRadius().intValue() == 0;
        yij0.t(this.f28877f, settings.hideContacts().booleanValue());
        this.f28877f.setOnClickListener(new View.OnClickListener() { // from class: l.xp80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27671a.m28765v(view);
            }
        });
        boolean zM15590m = g6a.m15590m();
        VListCell vListCell = this.f28878g;
        if (zM15590m) {
            xdl0.M(vListCell, false);
            xdl0.M(this.f28881j, false);
            this.f28888q.f21562e.m28112u(settings);
            return;
        }
        xdl0.M0(vListCell, true);
        xdl0.M0(this.f28881j, true);
        this.f28881j.setValueTo(15.0f);
        this.f28881j.setValueFrom(0.0f);
        this.f28881j.setLabelFormatter(new iqk0() { // from class: l.yp80
            /* JADX INFO: renamed from: a */
            public final String m28323a(float f) {
                return this.f28334a.m28778w(f);
            }
        });
        int iIntValue = settings.getSearchInvisibleRadius().intValue() / 200;
        this.f28889r = iIntValue;
        this.f28881j.setValue(iIntValue);
        this.f28881j.f(new C1532a());
        xdl0.M(this.f28879h, !z);
        this.f28878g.getSwitchButton().setChecked(!z);
        this.f28878g.m8743d(new C1533b());
        if (z) {
            return;
        }
        this.f28891t.run();
    }

    /* JADX INFO: renamed from: B */
    public void m28767B() {
        m28761k();
        this.f28886o = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iD = t100.d(77.0f);
        this.f28886o.setDuration(400L);
        this.f28886o.addUpdateListener(new C1534c(iD));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28879h.getLayoutParams();
        marginLayoutParams.topMargin = -iD;
        this.f28879h.setLayoutParams(marginLayoutParams);
        xdl0.M(this.f28879h, true);
        this.f28886o.addListener(new C1535d());
        this.f28886o.start();
    }

    /* JADX INFO: renamed from: C */
    public boolean m28768C() {
        return yij0.T(this.f28877f);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m28769C0() {
        return this.f28884m;
    }

    @Nullable
    public Act act() {
        return this.f28884m;
    }

    /* JADX INFO: renamed from: i */
    public View m28770i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bq80.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM28770i = m28770i(layoutInflater, viewGroup);
        m28763r();
        return viewM28770i;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m28771i1(sp80 sp80Var) {
        this.f28888q = sp80Var;
    }

    /* JADX INFO: renamed from: l */
    public void m28773l(float f) {
        int i = (int) (f * 200.0f);
        this.f28885n.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f28891t.run();
        if (this.f28885n.getSearchRadius().intValue() < i) {
            if (i % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO != 0) {
                i = (i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            }
            this.f28885n.getSettingGroup().search.radius = Integer.valueOf(this.f28885n.getRadiusAllowedMinimum().intValue() + Math.min(this.f28885n.getRadiusAllowedMaximum().intValue() - this.f28885n.getRadiusAllowedMinimum().intValue(), Math.max(0, i)));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m28774m(boolean z) {
        yij0.t(this.f28877f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m28775n(int i) {
        this.f28879h.setOutlineProvider(new C1538g(i));
        this.f28879h.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: p */
    public void m28776p() {
        m28761k();
        this.f28887p = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iD = t100.d(73.0f);
        this.f28887p.setDuration(400L);
        this.f28887p.addUpdateListener(new C1536e(iD));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28879h.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f28879h.setLayoutParams(marginLayoutParams);
        this.f28887p.addListener(new C1537f());
        this.f28887p.start();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m28777u() {
        String str;
        String strConcat;
        String str2;
        String str3;
        int iIntValue = this.f28885n.getSearchInvisibleRadius().intValue();
        String string = this.f28884m.getString(R.string.b2);
        String string2 = this.f28884m.getString(R.string.e2);
        if (iIntValue == 0) {
            str3 = "";
            str2 = "";
        } else {
            if (iIntValue < 1000) {
                str = iIntValue + string2;
                strConcat = "<".concat(str);
            } else if (iIntValue % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO == 0) {
                str = (iIntValue / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string;
                strConcat = "<".concat(str);
            } else {
                str = String.format(Locale.CHINA, "%.1f%s", Double.valueOf(((double) iIntValue) / 1000.0d), string);
                strConcat = "<".concat(str);
            }
            String str4 = strConcat;
            str2 = str;
            str3 = str4;
        }
        this.f28880i.setText(str3);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        FilterSwitchCell filterSwitchCell = this.f28878g;
        if (zIsEmpty) {
            filterSwitchCell.setSubTitle("开启后，指定距离以内的熟人和陌生人都滑不到你");
        } else {
            filterSwitchCell.setSubTitle(String.format(Locale.CHINA, "开启后，离你%s以内的熟人和陌生人都滑不到你", str2));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String m28778w(float f) {
        float f2 = f * 200.0f;
        String string = this.f28884m.getString(R.string.b2);
        String string2 = this.f28884m.getString(R.string.e2);
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
    public void m28779x(Throwable th) {
        this.f28884m.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: y */
    public void m28780y() {
        this.f28884m.progressDismiss();
        m28766A(this.f28885n);
    }

    /* JADX INFO: renamed from: z */
    public void m28781z(String str, boolean z) {
        this.f28884m.progress(str, z);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zp80$d */
    public class C1535d implements Animator.AnimatorListener {
        public C1535d() {
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
    public class C1537f implements Animator.AnimatorListener {
        public C1537f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(zp80.this.f28879h, false);
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

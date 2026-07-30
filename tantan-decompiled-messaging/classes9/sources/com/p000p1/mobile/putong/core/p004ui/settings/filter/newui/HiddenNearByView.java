package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.e30;
import l.t100;
import l.vzk;
import l.xdl0;
import l.yij0;
import p006l.xma;
import v.VListCell;
import v.VSlider;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class HiddenNearByView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FilterSwitchCell f5851a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5852b;

    /* JADX INFO: renamed from: c */
    public TextView f5853c;

    /* JADX INFO: renamed from: d */
    public VSlider f5854d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0293g f5855e;

    /* JADX INFO: renamed from: f */
    public Settings f5856f;

    /* JADX INFO: renamed from: g */
    public Act f5857g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f5858h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f5859i;

    /* JADX INFO: renamed from: j */
    public boolean f5860j;

    /* JADX INFO: renamed from: k */
    public final Runnable f5861k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$a */
    public class C0287a implements CompoundButton.OnCheckedChangeListener {
        public C0287a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            HiddenNearByView hiddenNearByView = HiddenNearByView.this;
            if (z) {
                hiddenNearByView.m8751h(hiddenNearByView.f5854d.getValue());
            } else {
                hiddenNearByView.f5854d.setValue(0.0f);
                HiddenNearByView.this.m8751h(0.0f);
            }
            HiddenNearByView hiddenNearByView2 = HiddenNearByView.this;
            if (z) {
                hiddenNearByView2.m8761r();
            } else {
                hiddenNearByView2.m8753j();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$b */
    public class C0288b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5863a;

        public C0288b(int i) {
            this.f5863a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) HiddenNearByView.this.f5852b.getLayoutParams();
            int i = this.f5863a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            HiddenNearByView.this.m8752i((int) (i * fFloatValue));
            HiddenNearByView.this.f5852b.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$c */
    public class C0289c implements Animator.AnimatorListener {
        public C0289c() {
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$d */
    public class C0290d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5866a;

        public C0290d(int i) {
            this.f5866a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) HiddenNearByView.this.f5852b.getLayoutParams();
            int i = this.f5866a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            HiddenNearByView.this.m8752i((int) (i * fFloatValue));
            HiddenNearByView.this.f5852b.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$e */
    public class C0291e implements Animator.AnimatorListener {
        public C0291e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(HiddenNearByView.this.f5852b, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$f */
    public class C0292f extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5869a;

        public C0292f(int i) {
            this.f5869a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.d(10.0f), this.f5869a, view.getWidth() + t100.d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$g */
    public interface InterfaceC0293g {
        /* JADX INFO: renamed from: a */
        void mo8763a(int i);
    }

    public HiddenNearByView(Context context) {
        super(context);
        this.f5860j = false;
        this.f5861k = new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f20955a.m8757n();
            }
        };
        mo8754k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8744a(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: e */
    public View m8748e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vzk.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final void m8749f(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = t100.q;
        layoutParams.height = i;
        layoutParams.width = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m8750g() {
        if (NullChecker.a(this.f5858h) && this.f5858h.isRunning()) {
            this.f5858h.cancel();
        }
        if (NullChecker.a(this.f5859i) && this.f5859i.isRunning()) {
            this.f5859i.cancel();
        }
    }

    public int getHideAimHeight() {
        return t100.d(73.0f);
    }

    public int getShowAnimHeight() {
        return t100.d(77.0f);
    }

    /* JADX INFO: renamed from: h */
    public void m8751h(float f) {
        int i = (int) (f * 200.0f);
        this.f5856f.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f5861k.run();
        if (this.f5856f.getSearchRadius().intValue() < i) {
            if (i % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO != 0) {
                i = (i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            }
            if (NullChecker.a(this.f5855e)) {
                this.f5855e.mo8763a(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m8752i(int i) {
        this.f5852b.setOutlineProvider(new C0292f(i));
        this.f5852b.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: j */
    public void m8753j() {
        m8750g();
        this.f5859i = ValueAnimator.ofFloat(0.0f, 1.0f);
        int hideAimHeight = getHideAimHeight();
        this.f5859i.setDuration(400L);
        this.f5859i.addUpdateListener(new C0290d(hideAimHeight));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5852b.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f5852b.setLayoutParams(marginLayoutParams);
        this.f5859i.addListener(new C0291e());
        this.f5859i.start();
    }

    /* JADX INFO: renamed from: k */
    public void mo8754k(Context context) {
        m8748e(LayoutInflater.from(context), this);
    }

    /* JADX INFO: renamed from: l */
    public void m8755l() {
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            this.f5851a.setTitle("不让距离太近的人看到我");
        }
        m8749f(this.f5851a);
        xdl0.E0(this.f5851a, new View.OnClickListener() { // from class: l.szk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21780a.m8756m(view);
            }
        });
        xdl0.M(this.f5852b, false);
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8756m(View view) {
        if (!CoreModule.m1854P().m11711g().m7021xj() || xma.m27355L3() || CoreModule.f1534c.f3587Q1.m6678f3()) {
            yij0.T(this.f5851a);
        } else {
            m8762s();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m8757n() {
        String str;
        int iIntValue = this.f5856f.getSearchInvisibleRadius().intValue();
        String string = this.f5857g.getString(R.string.b2);
        String string2 = this.f5857g.getString(R.string.e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO == 0) {
            str = "<" + (iIntValue / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f5853c.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m8758o(Boolean bool) {
        this.f5860j = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        m8755l();
    }

    /* JADX INFO: renamed from: p */
    public void m8759p(Act act, Settings settings) {
        this.f5857g = act;
        this.f5856f = settings;
        this.f5861k.run();
        boolean z = settings.getSearchInvisibleRadius().intValue() == 0;
        xdl0.M(this.f5852b, !z);
        this.f5851a.getSwitchButton().setChecked(!z);
        this.f5851a.m8743d(new C0287a());
    }

    /* JADX INFO: renamed from: q */
    public void m8760q() {
        this.f5851a.setSubTitle("开启后，指定距离以内的熟人和陌生人都滑不到你");
    }

    /* JADX INFO: renamed from: r */
    public void m8761r() {
        m8750g();
        this.f5858h = ValueAnimator.ofFloat(1.0f, 0.0f);
        int showAnimHeight = getShowAnimHeight();
        this.f5858h.setDuration(400L);
        this.f5858h.addUpdateListener(new C0288b(showAnimHeight));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5852b.getLayoutParams();
        marginLayoutParams.topMargin = -showAnimHeight;
        this.f5852b.setLayoutParams(marginLayoutParams);
        xdl0.M(this.f5852b, true);
        this.f5858h.addListener(new C0289c());
        this.f5858h.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m8762s() {
        CoreModule.m1854P().m11706a().m5299Lf(this.f5857g, "p_home_filter,hidden_nearby", Privilege.hide_me_from_nearby, new e30() { // from class: l.tzk
            public final void call(Object obj) {
                HiddenNearByView.m8744a((PurchaseType) obj);
            }
        }, new e30() { // from class: l.uzk
            public final void call(Object obj) {
                this.f23828a.m8758o((Boolean) obj);
            }
        });
    }

    public void setHiddenNearByViewListener(InterfaceC0293g interfaceC0293g) {
        this.f5855e = interfaceC0293g;
    }

    public void setSearchValue(float f) {
        this.f5854d.setValue(f);
    }

    public HiddenNearByView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5860j = false;
        this.f5861k = new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f20955a.m8757n();
            }
        };
        mo8754k(context);
    }

    public HiddenNearByView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5860j = false;
        this.f5861k = new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f20955a.m8757n();
            }
        };
        mo8754k(context);
    }
}

package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import p147v.VListCell;
import p147v.VSlider;
import p149l.a5c0;
import p149l.e30;
import p149l.t100;
import p149l.vzk;
import p149l.xdl0;
import p149l.xma;
import p149l.yij0;

/* JADX INFO: loaded from: classes9.dex */
public class HiddenNearByView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FilterSwitchCell f36070a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f36071b;

    /* JADX INFO: renamed from: c */
    public TextView f36072c;

    /* JADX INFO: renamed from: d */
    public VSlider f36073d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8857g f36074e;

    /* JADX INFO: renamed from: f */
    public Settings f36075f;

    /* JADX INFO: renamed from: g */
    public Act f36076g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f36077h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f36078i;

    /* JADX INFO: renamed from: j */
    public boolean f36079j;

    /* JADX INFO: renamed from: k */
    public final Runnable f36080k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$a */
    public class C8851a implements CompoundButton.OnCheckedChangeListener {
        public C8851a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            HiddenNearByView hiddenNearByView = HiddenNearByView.this;
            if (z) {
                hiddenNearByView.m55378h(hiddenNearByView.f36073d.getValue());
            } else {
                hiddenNearByView.f36073d.setValue(0.0f);
                HiddenNearByView.this.m55378h(0.0f);
            }
            HiddenNearByView hiddenNearByView2 = HiddenNearByView.this;
            if (z) {
                hiddenNearByView2.m55388r();
            } else {
                hiddenNearByView2.m55380j();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$b */
    public class C8852b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36082a;

        public C8852b(int i) {
            this.f36082a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) HiddenNearByView.this.f36071b.getLayoutParams();
            int i = this.f36082a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            HiddenNearByView.this.m55379i((int) (i * fFloatValue));
            HiddenNearByView.this.f36071b.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$c */
    public class C8853c implements Animator.AnimatorListener {
        public C8853c() {
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
    public class C8854d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36085a;

        public C8854d(int i) {
            this.f36085a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) HiddenNearByView.this.f36071b.getLayoutParams();
            int i = this.f36085a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            HiddenNearByView.this.m55379i((int) (i * fFloatValue));
            HiddenNearByView.this.f36071b.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$e */
    public class C8855e implements Animator.AnimatorListener {
        public C8855e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(HiddenNearByView.this.f36071b, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$f */
    public class C8856f extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36088a;

        public C8856f(int i) {
            this.f36088a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.m186890d(10.0f), this.f36088a, view.getWidth() + t100.m186890d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$g */
    public interface InterfaceC8857g {
        /* JADX INFO: renamed from: a */
        void mo55390a(int i);
    }

    public HiddenNearByView(Context context) {
        super(context);
        this.f36079j = false;
        this.f36080k = new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f161664a.m55384n();
            }
        };
        mo55381k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m55371a(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: e */
    public View m55375e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vzk.m200765b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final void m55376f(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.f67698u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = t100.f167268q;
        layoutParams.height = i;
        layoutParams.width = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m55377g() {
        if (NullChecker.m81303a(this.f36077h) && this.f36077h.isRunning()) {
            this.f36077h.cancel();
        }
        if (NullChecker.m81303a(this.f36078i) && this.f36078i.isRunning()) {
            this.f36078i.cancel();
        }
    }

    public int getHideAimHeight() {
        return t100.m186890d(73.0f);
    }

    public int getShowAnimHeight() {
        return t100.m186890d(77.0f);
    }

    /* JADX INFO: renamed from: h */
    public void m55378h(float f) {
        int i = (int) (f * 200.0f);
        this.f36075f.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f36080k.run();
        if (this.f36075f.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            if (NullChecker.m81303a(this.f36074e)) {
                this.f36074e.mo55390a(i / 1000);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m55379i(int i) {
        this.f36071b.setOutlineProvider(new C8856f(i));
        this.f36071b.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: j */
    public void m55380j() {
        m55377g();
        this.f36078i = ValueAnimator.ofFloat(0.0f, 1.0f);
        int hideAimHeight = getHideAimHeight();
        this.f36078i.setDuration(400L);
        this.f36078i.addUpdateListener(new C8854d(hideAimHeight));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36071b.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f36071b.setLayoutParams(marginLayoutParams);
        this.f36078i.addListener(new C8855e());
        this.f36078i.start();
    }

    /* JADX INFO: renamed from: k */
    public void mo55381k(Context context) {
        m55375e(LayoutInflater.from(context), this);
    }

    /* JADX INFO: renamed from: l */
    public void m55382l() {
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            this.f36070a.setTitle("不让距离太近的人看到我");
        }
        m55376f(this.f36070a);
        xdl0.m208329E0(this.f36070a, new View.OnClickListener() { // from class: l.szk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167065a.m55383m(view);
            }
        });
        xdl0.m208344M(this.f36071b, false);
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m55383m(View view) {
        if (!CoreModule.m29935P().m94656g().mo35084xj() || xma.m210047L3() || CoreModule.f17545c.f19598Q1.m34741f3()) {
            yij0.m214942T(this.f36070a);
        } else {
            m55389s();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m55384n() {
        String str;
        int iIntValue = this.f36075f.getSearchInvisibleRadius().intValue();
        String string = this.f36076g.getString(R$string.f27824b2);
        String string2 = this.f36076g.getString(R$string.f27842e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % 1000 == 0) {
            str = "<" + (iIntValue / 1000) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f36072c.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m55385o(Boolean bool) {
        this.f36079j = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        m55382l();
    }

    /* JADX INFO: renamed from: p */
    public void m55386p(Act act, Settings settings) {
        this.f36076g = act;
        this.f36075f = settings;
        this.f36080k.run();
        boolean z = settings.getSearchInvisibleRadius().intValue() == 0;
        xdl0.m208344M(this.f36071b, !z);
        this.f36070a.getSwitchButton().setChecked(!z);
        this.f36070a.m55370d(new C8851a());
    }

    /* JADX INFO: renamed from: q */
    public void m55387q() {
        this.f36070a.setSubTitle("开启后，指定距离以内的熟人和陌生人都滑不到你");
    }

    /* JADX INFO: renamed from: r */
    public void m55388r() {
        m55377g();
        this.f36077h = ValueAnimator.ofFloat(1.0f, 0.0f);
        int showAnimHeight = getShowAnimHeight();
        this.f36077h.setDuration(400L);
        this.f36077h.addUpdateListener(new C8852b(showAnimHeight));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36071b.getLayoutParams();
        marginLayoutParams.topMargin = -showAnimHeight;
        this.f36071b.setLayoutParams(marginLayoutParams);
        xdl0.m208344M(this.f36071b, true);
        this.f36077h.addListener(new C8853c());
        this.f36077h.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m55389s() {
        CoreModule.m29935P().m94651a().mo33362Lf(this.f36076g, "p_home_filter,hidden_nearby", Privilege.hide_me_from_nearby, new e30() { // from class: l.tzk
            @Override // p149l.e30
            public final void call(Object obj) {
                HiddenNearByView.m55371a((PurchaseType) obj);
            }
        }, new e30() { // from class: l.uzk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179003a.m55385o((Boolean) obj);
            }
        });
    }

    public void setHiddenNearByViewListener(InterfaceC8857g interfaceC8857g) {
        this.f36074e = interfaceC8857g;
    }

    public void setSearchValue(float f) {
        this.f36073d.setValue(f);
    }

    public HiddenNearByView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36079j = false;
        this.f36080k = new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f161664a.m55384n();
            }
        };
        mo55381k(context);
    }

    public HiddenNearByView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36079j = false;
        this.f36080k = new Runnable() { // from class: l.rzk
            @Override // java.lang.Runnable
            public final void run() {
                this.f161664a.m55384n();
            }
        };
        mo55381k(context);
    }
}

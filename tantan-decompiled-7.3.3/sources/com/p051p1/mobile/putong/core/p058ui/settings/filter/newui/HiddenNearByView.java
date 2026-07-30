package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import p151v.VListCell;
import p151v.VSlider;
import p153l.bnl0;
import p153l.bsj0;
import p153l.gdc0;
import p153l.joa;
import p153l.l2l;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class HiddenNearByView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FilterSwitchCell f36918a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f36919b;

    /* JADX INFO: renamed from: c */
    public TextView f36920c;

    /* JADX INFO: renamed from: d */
    public VSlider f36921d;

    /* JADX INFO: renamed from: e */
    public InterfaceC9020g f36922e;

    /* JADX INFO: renamed from: f */
    public Settings f36923f;

    /* JADX INFO: renamed from: g */
    public Act f36924g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f36925h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f36926i;

    /* JADX INFO: renamed from: j */
    public boolean f36927j;

    /* JADX INFO: renamed from: k */
    public final Runnable f36928k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$a */
    public class C9014a implements CompoundButton.OnCheckedChangeListener {
        public C9014a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            HiddenNearByView hiddenNearByView = HiddenNearByView.this;
            if (z) {
                hiddenNearByView.m56561h(hiddenNearByView.f36921d.getValue());
            } else {
                hiddenNearByView.f36921d.setValue(0.0f);
                HiddenNearByView.this.m56561h(0.0f);
            }
            HiddenNearByView hiddenNearByView2 = HiddenNearByView.this;
            if (z) {
                hiddenNearByView2.m56571r();
            } else {
                hiddenNearByView2.m56563j();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$b */
    public class C9015b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36930a;

        public C9015b(int i) {
            this.f36930a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) HiddenNearByView.this.f36919b.getLayoutParams();
            int i = this.f36930a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            HiddenNearByView.this.m56562i((int) (i * fFloatValue));
            HiddenNearByView.this.f36919b.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$c */
    public class C9016c implements Animator.AnimatorListener {
        public C9016c() {
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
    public class C9017d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36933a;

        public C9017d(int i) {
            this.f36933a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) HiddenNearByView.this.f36919b.getLayoutParams();
            int i = this.f36933a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            HiddenNearByView.this.m56562i((int) (i * fFloatValue));
            HiddenNearByView.this.f36919b.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$e */
    public class C9018e implements Animator.AnimatorListener {
        public C9018e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(HiddenNearByView.this.f36919b, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$f */
    public class C9019f extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36936a;

        public C9019f(int i) {
            this.f36936a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - qa00.m175859d(10.0f), this.f36936a, view.getWidth() + qa00.m175859d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.HiddenNearByView$g */
    public interface InterfaceC9020g {
        /* JADX INFO: renamed from: a */
        void mo56573a(int i);
    }

    public HiddenNearByView(Context context) {
        super(context);
        this.f36927j = false;
        this.f36928k = new Runnable() { // from class: l.h2l
            @Override // java.lang.Runnable
            public final void run() {
                this.f107564a.m56567n();
            }
        };
        mo56564k(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56554a(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: e */
    public View m56558e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l2l.m152627b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final void m56559f(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(gdc0.f103693u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = qa00.f156330q;
        layoutParams.height = i;
        layoutParams.width = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m56560g() {
        if (NullChecker.m82486a(this.f36925h) && this.f36925h.isRunning()) {
            this.f36925h.cancel();
        }
        if (NullChecker.m82486a(this.f36926i) && this.f36926i.isRunning()) {
            this.f36926i.cancel();
        }
    }

    public int getHideAimHeight() {
        return qa00.m175859d(73.0f);
    }

    public int getShowAnimHeight() {
        return qa00.m175859d(77.0f);
    }

    /* JADX INFO: renamed from: h */
    public void m56561h(float f) {
        int i = (int) (f * 200.0f);
        this.f36923f.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f36928k.run();
        if (this.f36923f.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            if (NullChecker.m82486a(this.f36922e)) {
                this.f36922e.mo56573a(i / 1000);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m56562i(int i) {
        this.f36919b.setOutlineProvider(new C9019f(i));
        this.f36919b.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: j */
    public void m56563j() {
        m56560g();
        this.f36926i = ValueAnimator.ofFloat(0.0f, 1.0f);
        int hideAimHeight = getHideAimHeight();
        this.f36926i.setDuration(400L);
        this.f36926i.addUpdateListener(new C9017d(hideAimHeight));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36919b.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f36919b.setLayoutParams(marginLayoutParams);
        this.f36926i.addListener(new C9018e());
        this.f36926i.start();
    }

    /* JADX INFO: renamed from: k */
    public void mo56564k(Context context) {
        m56558e(LayoutInflater.from(context), this);
    }

    /* JADX INFO: renamed from: l */
    public void m56565l() {
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            this.f36918a.setTitle("不让距离太近的人看到我");
        }
        m56559f(this.f36918a);
        bnl0.m105509E0(this.f36918a, new View.OnClickListener() { // from class: l.i2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112653a.m56566m(view);
            }
        });
        bnl0.m105524M(this.f36919b, false);
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m56566m(View view) {
        if (!CoreModule.m30933P().m143410g().mo36087xj() || joa.m146361M3() || CoreModule.f18264c.f20340Q1.m35744f3()) {
            bsj0.m106262T(this.f36918a);
        } else {
            m56572s();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m56567n() {
        String str;
        int iIntValue = this.f36923f.getSearchInvisibleRadius().intValue();
        String string = this.f36924g.getString(R$string.f28672b2);
        String string2 = this.f36924g.getString(R$string.f28690e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % 1000 == 0) {
            str = "<" + (iIntValue / 1000) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f36920c.setText(str);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m56568o(Boolean bool) {
        this.f36927j = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(1);
        m56565l();
    }

    /* JADX INFO: renamed from: p */
    public void m56569p(Act act, Settings settings) {
        this.f36924g = act;
        this.f36923f = settings;
        this.f36928k.run();
        boolean z = settings.getSearchInvisibleRadius().intValue() == 0;
        bnl0.m105524M(this.f36919b, !z);
        this.f36918a.getSwitchButton().setChecked(!z);
        this.f36918a.m56553d(new C9014a());
    }

    /* JADX INFO: renamed from: q */
    public void m56570q() {
        this.f36918a.setSubTitle("开启后，指定距离以内的熟人和陌生人都滑不到你");
    }

    /* JADX INFO: renamed from: r */
    public void m56571r() {
        m56560g();
        this.f36925h = ValueAnimator.ofFloat(1.0f, 0.0f);
        int showAnimHeight = getShowAnimHeight();
        this.f36925h.setDuration(400L);
        this.f36925h.addUpdateListener(new C9015b(showAnimHeight));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36919b.getLayoutParams();
        marginLayoutParams.topMargin = -showAnimHeight;
        this.f36919b.setLayoutParams(marginLayoutParams);
        bnl0.m105524M(this.f36919b, true);
        this.f36925h.addListener(new C9016c());
        this.f36925h.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m56572s() {
        CoreModule.m30933P().m143405a().mo34365Lf(this.f36924g, "p_home_filter,hidden_nearby", Privilege.hide_me_from_nearby, new y20() { // from class: l.j2l
            @Override // p153l.y20
            public final void call(Object obj) {
                HiddenNearByView.m56554a((PurchaseType) obj);
            }
        }, new y20() { // from class: l.k2l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123622a.m56568o((Boolean) obj);
            }
        });
    }

    public void setHiddenNearByViewListener(InterfaceC9020g interfaceC9020g) {
        this.f36922e = interfaceC9020g;
    }

    public void setSearchValue(float f) {
        this.f36921d.setValue(f);
    }

    public HiddenNearByView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36927j = false;
        this.f36928k = new Runnable() { // from class: l.h2l
            @Override // java.lang.Runnable
            public final void run() {
                this.f107564a.m56567n();
            }
        };
        mo56564k(context);
    }

    public HiddenNearByView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36927j = false;
        this.f36928k = new Runnable() { // from class: l.h2l
            @Override // java.lang.Runnable
            public final void run() {
                this.f107564a.m56567n();
            }
        };
        mo56564k(context);
    }
}

package com.p051p1.mobile.putong.core.p058ui.vip.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VPager;
import p153l.bnl0;
import p153l.fo0;
import p153l.jyb;
import p153l.kcg0;
import p153l.lb2;
import p153l.nri;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.x45;
import p153l.y20;
import p153l.y45;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public class SwitchVerticalFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public kcg0 f38904a;

    /* JADX INFO: renamed from: b */
    public VPager f38905b;

    /* JADX INFO: renamed from: c */
    public List<User> f38906c;

    /* JADX INFO: renamed from: d */
    public lb2 f38907d;

    /* JADX INFO: renamed from: e */
    public boolean f38908e;

    /* JADX INFO: renamed from: f */
    public Path f38909f;

    /* JADX INFO: renamed from: g */
    public boolean f38910g;

    /* JADX INFO: renamed from: h */
    public int f38911h;

    /* JADX INFO: renamed from: i */
    public z20<Integer, User> f38912i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout$a */
    public class C9202a implements ViewPager.InterfaceC0719k {
        public C9202a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0719k
        /* JADX INFO: renamed from: a */
        public void mo4205a(View view, float f) {
            if (f < -1.0f) {
                view.setAlpha(0.0f);
            } else {
                if (f > 1.0f) {
                    view.setAlpha(0.0f);
                    return;
                }
                view.setAlpha(1.0f);
                view.setTranslationX(view.getWidth() * (-f));
                view.setTranslationY(f * view.getHeight());
            }
        }
    }

    public SwitchVerticalFrameLayout(@NonNull Context context) {
        super(context);
        this.f38910g = false;
        m58957e();
    }

    /* JADX INFO: renamed from: d */
    public void m58956d(int i) {
        this.f38911h = i;
        if (this.f38908e) {
            return;
        }
        this.f38905b = new VPager(getContext()) { // from class: com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout.1
            @Override // androidx.viewpager.widget.ViewPager, android.view.View
            public void onRestoreInstanceState(Parcelable parcelable) {
                super.onRestoreInstanceState(parcelable);
                SwitchVerticalFrameLayout.this.f38910g = true;
            }
        };
        this.f38905b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f38905b);
        m58958f();
        this.f38908e = true;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            nri nriVar = new nri(this.f38905b.getContext(), new AccelerateDecelerateInterpolator());
            if (i != 0) {
                nriVar.m164490a(i);
            }
            declaredField.set(this.f38905b, nriVar);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f38909f);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m58957e() {
        this.f38909f = new Path();
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m58958f() {
        this.f38906c = new ArrayList();
        this.f38905b.mo4182X(true, new C9202a());
        this.f38905b.setScrollble(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Boolean m58959g(Long l2) {
        boolean z;
        if (bnl0.m105529O0(this)) {
            z = m58962j(1);
        }
        return Boolean.valueOf(z);
    }

    public User getCurrentPageUser() {
        if (!NullChecker.m82486a(this.f38905b) || this.f38906c.size() <= 0) {
            return null;
        }
        int currentItem = this.f38905b.getCurrentItem();
        if (this.f38910g && currentItem >= this.f38906c.size()) {
            this.f38905b.setCurrentItem(0);
            currentItem = 0;
        }
        if (!CoreModule.f18264c.f20429u0.m31378B5() && currentItem < this.f38906c.size()) {
            return this.f38906c.get(currentItem);
        }
        List<User> list = this.f38906c;
        return list.get(currentItem % list.size());
    }

    public int getSize() {
        List<User> list = this.f38906c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m58960h(Long l2) {
        m58963k();
    }

    /* JADX INFO: renamed from: i */
    public void m58961i(List<User> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f38906c.clear();
        this.f38906c.addAll(list);
        boolean zM31378B5 = CoreModule.f18264c.f20429u0.m31378B5();
        List<User> list2 = this.f38906c;
        if (zM31378B5) {
            this.f38907d = new x45(list2, getContext());
        } else {
            this.f38907d = new y45(list2, getContext());
        }
        this.f38905b.setAdapter(this.f38907d);
        z20<Integer, User> z20Var = this.f38912i;
        if (z20Var != null) {
            z20Var.call(0, getCurrentPageUser());
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m58962j(int i) {
        boolean zM31378B5 = CoreModule.f18264c.f20429u0.m31378B5();
        List<User> list = this.f38906c;
        if (zM31378B5) {
            return !jyb.m147479J(list) && this.f38906c.size() > i && this.f38908e;
        }
        return !jyb.m147479J(list) && this.f38906c.size() > i && this.f38908e && this.f38905b.getCurrentItem() < this.f38906c.size() - 1;
    }

    /* JADX INFO: renamed from: k */
    public void m58963k() {
        if (!jyb.m147479J(this.f38906c) && this.f38908e && (this.f38905b.getCurrentItem() < this.f38906c.size() - 1 || CoreModule.f18264c.f20429u0.m31378B5())) {
            VPager vPager = this.f38905b;
            vPager.setCurrentItem(vPager.getCurrentItem() + 1);
        }
        z20<Integer, User> z20Var = this.f38912i;
        if (z20Var != null) {
            z20Var.call(Integer.valueOf(this.f38911h), getCurrentPageUser());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m58964l(int i) {
        if (this.f38904a == null) {
            this.f38904a = C22421c.interval(i, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.doh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f89957a.m58959g((Long) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.eoh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94928a.m58960h((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m58965m() {
        psd0.m173633z(this.f38904a);
        this.f38904a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m58965m();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f38909f.addCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - qa00.f156316c, Path.Direction.CCW);
    }

    public void setOnNext(z20<Integer, User> z20Var) {
        this.f38912i = z20Var;
    }

    public SwitchVerticalFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38910g = false;
        m58957e();
    }

    public SwitchVerticalFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38910g = false;
        m58957e();
    }
}

package com.p000p1.mobile.putong.core.p004ui.vip.widget;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.eb2;
import l.f30;
import l.jo0;
import l.mkd0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import p006l.roi;
import p006l.w35;
import p006l.x35;
import rx.c;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SwitchVerticalFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public c4g0 f7837a;

    /* JADX INFO: renamed from: b */
    public VPager f7838b;

    /* JADX INFO: renamed from: c */
    public List<User> f7839c;

    /* JADX INFO: renamed from: d */
    public eb2 f7840d;

    /* JADX INFO: renamed from: e */
    public boolean f7841e;

    /* JADX INFO: renamed from: f */
    public Path f7842f;

    /* JADX INFO: renamed from: g */
    public boolean f7843g;

    /* JADX INFO: renamed from: h */
    public int f7844h;

    /* JADX INFO: renamed from: i */
    public f30<Integer, User> f7845i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout$a */
    public class C0475a implements ViewPager.k {
        public C0475a() {
        }

        /* JADX INFO: renamed from: a */
        public void m11282a(View view, float f) {
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
        this.f7843g = false;
        m11273e();
    }

    /* JADX INFO: renamed from: d */
    public void m11272d(int i) {
        this.f7844h = i;
        if (this.f7841e) {
            return;
        }
        this.f7838b = new VPager(getContext()) { // from class: com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout.1
            public void onRestoreInstanceState(Parcelable parcelable) {
                super/*androidx.viewpager.widget.ViewPager*/.onRestoreInstanceState(parcelable);
                SwitchVerticalFrameLayout.this.f7843g = true;
            }
        };
        this.f7838b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f7838b);
        m11274f();
        this.f7841e = true;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            roi roiVar = new roi(this.f7838b.getContext(), new AccelerateDecelerateInterpolator());
            if (i != 0) {
                roiVar.m22885a(i);
            }
            declaredField.set(this.f7838b, roiVar);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f7842f);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m11273e() {
        this.f7842f = new Path();
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m11274f() {
        this.f7839c = new ArrayList();
        this.f7838b.X(true, new C0475a());
        this.f7838b.setScrollble(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Boolean m11275g(Long l2) {
        boolean z;
        if (xdl0.O0(this)) {
            z = m11278j(1);
        }
        return Boolean.valueOf(z);
    }

    public User getCurrentPageUser() {
        if (!NullChecker.a(this.f7838b) || this.f7839c.size() <= 0) {
            return null;
        }
        int currentItem = this.f7838b.getCurrentItem();
        if (this.f7843g && currentItem >= this.f7839c.size()) {
            this.f7838b.setCurrentItem(0);
            currentItem = 0;
        }
        if (!CoreModule.f1534c.f3676u0.m2417x5() && currentItem < this.f7839c.size()) {
            return this.f7839c.get(currentItem);
        }
        List<User> list = this.f7839c;
        return list.get(currentItem % list.size());
    }

    public int getSize() {
        List<User> list = this.f7839c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m11276h(Long l2) {
        m11279k();
    }

    /* JADX INFO: renamed from: i */
    public void m11277i(List<User> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f7839c.clear();
        this.f7839c.addAll(list);
        boolean zM2417x5 = CoreModule.f1534c.f3676u0.m2417x5();
        List<User> list2 = this.f7839c;
        if (zM2417x5) {
            this.f7840d = new w35(list2, getContext());
        } else {
            this.f7840d = new x35(list2, getContext());
        }
        this.f7838b.setAdapter(this.f7840d);
        f30<Integer, User> f30Var = this.f7845i;
        if (f30Var != null) {
            f30Var.call(0, getCurrentPageUser());
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11278j(int i) {
        boolean zM2417x5 = CoreModule.f1534c.f3676u0.m2417x5();
        List<User> list = this.f7839c;
        if (zM2417x5) {
            return !vwb.J(list) && this.f7839c.size() > i && this.f7841e;
        }
        return !vwb.J(list) && this.f7839c.size() > i && this.f7841e && this.f7838b.getCurrentItem() < this.f7839c.size() - 1;
    }

    /* JADX INFO: renamed from: k */
    public void m11279k() {
        if (!vwb.J(this.f7839c) && this.f7841e && (this.f7838b.getCurrentItem() < this.f7839c.size() - 1 || CoreModule.f1534c.f3676u0.m2417x5())) {
            VPager vPager = this.f7838b;
            vPager.setCurrentItem(vPager.getCurrentItem() + 1);
        }
        f30<Integer, User> f30Var = this.f7845i;
        if (f30Var != null) {
            f30Var.call(Integer.valueOf(this.f7844h), getCurrentPageUser());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11280l(int i) {
        if (this.f7837a == null) {
            this.f7837a = c.interval(i, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).filter(new w9j() { // from class: l.vfh0
                public final Object call(Object obj) {
                    return this.f24304a.m11275g((Long) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.wfh0
                public final void call(Object obj) {
                    this.f25136a.m11276h((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m11281m() {
        mkd0.z(this.f7837a);
        this.f7837a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11281m();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7842f.addCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - t100.c, Path.Direction.CCW);
    }

    public void setOnNext(f30<Integer, User> f30Var) {
        this.f7845i = f30Var;
    }

    public SwitchVerticalFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7843g = false;
        m11273e();
    }

    public SwitchVerticalFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7843g = false;
        m11273e();
    }
}

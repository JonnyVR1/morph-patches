package com.p046p1.mobile.putong.core.p053ui.vip.widget;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VPager;
import p149l.c4g0;
import p149l.e30;
import p149l.eb2;
import p149l.f30;
import p149l.jo0;
import p149l.mkd0;
import p149l.roi;
import p149l.t100;
import p149l.vwb;
import p149l.w35;
import p149l.w9j;
import p149l.x35;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SwitchVerticalFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public c4g0 f38056a;

    /* JADX INFO: renamed from: b */
    public VPager f38057b;

    /* JADX INFO: renamed from: c */
    public List<User> f38058c;

    /* JADX INFO: renamed from: d */
    public eb2 f38059d;

    /* JADX INFO: renamed from: e */
    public boolean f38060e;

    /* JADX INFO: renamed from: f */
    public Path f38061f;

    /* JADX INFO: renamed from: g */
    public boolean f38062g;

    /* JADX INFO: renamed from: h */
    public int f38063h;

    /* JADX INFO: renamed from: i */
    public f30<Integer, User> f38064i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout$a */
    public class C9039a implements ViewPager.InterfaceC0717k {
        public C9039a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0717k
        /* JADX INFO: renamed from: a */
        public void mo4203a(View view, float f) {
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
        this.f38062g = false;
        m57774e();
    }

    /* JADX INFO: renamed from: d */
    public void m57773d(int i) {
        this.f38063h = i;
        if (this.f38060e) {
            return;
        }
        this.f38057b = new VPager(getContext()) { // from class: com.p1.mobile.putong.core.ui.vip.widget.SwitchVerticalFrameLayout.1
            @Override // androidx.viewpager.widget.ViewPager, android.view.View
            public void onRestoreInstanceState(Parcelable parcelable) {
                super.onRestoreInstanceState(parcelable);
                SwitchVerticalFrameLayout.this.f38062g = true;
            }
        };
        this.f38057b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f38057b);
        m57775f();
        this.f38060e = true;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            roi roiVar = new roi(this.f38057b.getContext(), new AccelerateDecelerateInterpolator());
            if (i != 0) {
                roiVar.m180243a(i);
            }
            declaredField.set(this.f38057b, roiVar);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f38061f);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m57774e() {
        this.f38061f = new Path();
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m57775f() {
        this.f38058c = new ArrayList();
        this.f38057b.mo4180X(true, new C9039a());
        this.f38057b.setScrollble(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Boolean m57776g(Long l2) {
        boolean z;
        if (xdl0.m208349O0(this)) {
            z = m57779j(1);
        }
        return Boolean.valueOf(z);
    }

    public User getCurrentPageUser() {
        if (!NullChecker.m81303a(this.f38057b) || this.f38058c.size() <= 0) {
            return null;
        }
        int currentItem = this.f38057b.getCurrentItem();
        if (this.f38062g && currentItem >= this.f38058c.size()) {
            this.f38057b.setCurrentItem(0);
            currentItem = 0;
        }
        if (!CoreModule.f17545c.f19687u0.m30489x5() && currentItem < this.f38058c.size()) {
            return this.f38058c.get(currentItem);
        }
        List<User> list = this.f38058c;
        return list.get(currentItem % list.size());
    }

    public int getSize() {
        List<User> list = this.f38058c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m57777h(Long l2) {
        m57780k();
    }

    /* JADX INFO: renamed from: i */
    public void m57778i(List<User> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f38058c.clear();
        this.f38058c.addAll(list);
        boolean zM30489x5 = CoreModule.f17545c.f19687u0.m30489x5();
        List<User> list2 = this.f38058c;
        if (zM30489x5) {
            this.f38059d = new w35(list2, getContext());
        } else {
            this.f38059d = new x35(list2, getContext());
        }
        this.f38057b.setAdapter(this.f38059d);
        f30<Integer, User> f30Var = this.f38064i;
        if (f30Var != null) {
            f30Var.call(0, getCurrentPageUser());
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m57779j(int i) {
        boolean zM30489x5 = CoreModule.f17545c.f19687u0.m30489x5();
        List<User> list = this.f38058c;
        if (zM30489x5) {
            return !vwb.m200296J(list) && this.f38058c.size() > i && this.f38060e;
        }
        return !vwb.m200296J(list) && this.f38058c.size() > i && this.f38060e && this.f38057b.getCurrentItem() < this.f38058c.size() - 1;
    }

    /* JADX INFO: renamed from: k */
    public void m57780k() {
        if (!vwb.m200296J(this.f38058c) && this.f38060e && (this.f38057b.getCurrentItem() < this.f38058c.size() - 1 || CoreModule.f17545c.f19687u0.m30489x5())) {
            VPager vPager = this.f38057b;
            vPager.setCurrentItem(vPager.getCurrentItem() + 1);
        }
        f30<Integer, User> f30Var = this.f38064i;
        if (f30Var != null) {
            f30Var.call(Integer.valueOf(this.f38063h), getCurrentPageUser());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m57781l(int i) {
        if (this.f38056a == null) {
            this.f38056a = C22306c.interval(i, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.vfh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f181272a.m57776g((Long) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.wfh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186082a.m57777h((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m57782m() {
        mkd0.m154992z(this.f38056a);
        this.f38056a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m57782m();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f38061f.addCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - t100.f167254c, Path.Direction.CCW);
    }

    public void setOnNext(f30<Integer, User> f30Var) {
        this.f38064i = f30Var;
    }

    public SwitchVerticalFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38062g = false;
        m57774e();
    }

    public SwitchVerticalFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38062g = false;
        m57774e();
    }
}

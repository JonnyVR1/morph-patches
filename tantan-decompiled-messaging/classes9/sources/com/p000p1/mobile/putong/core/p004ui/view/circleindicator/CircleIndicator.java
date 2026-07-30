package com.p000p1.mobile.putong.core.p004ui.view.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import l.jfd0;
import l.w660;
import p006l.nu5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CircleIndicator extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public ViewPager f6713m;

    /* JADX INFO: renamed from: n */
    public final ViewPager.j f6714n;

    /* JADX INFO: renamed from: o */
    public final DataSetObserver f6715o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator$a */
    public class C0374a implements ViewPager.j {
        public C0374a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (CircleIndicator.this.f6713m.getAdapter() == null || CircleIndicator.this.f6713m.getAdapter().getCount() <= 0) {
                return;
            }
            CircleIndicator.this.mo9632b(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator$b */
    public class C0375b extends DataSetObserver {
        public C0375b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator.this.f6713m == null) {
                return;
            }
            w660 adapter = CircleIndicator.this.f6713m.getAdapter();
            int count = adapter != null ? adapter.getCount() : 0;
            if (count == CircleIndicator.this.getChildCount()) {
                return;
            }
            CircleIndicator circleIndicator = CircleIndicator.this;
            if (circleIndicator.f6712l < count) {
                circleIndicator.f6712l = circleIndicator.f6713m.getCurrentItem();
            } else {
                circleIndicator.f6712l = -1;
            }
            CircleIndicator.this.m9644n();
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        this.f6714n = new C0374a();
        this.f6715o = new C0375b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m9644n() {
        w660 adapter = this.f6713m.getAdapter();
        mo9637g(adapter == null ? 0 : adapter.getCount(), this.f6713m.getCurrentItem());
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo9632b(int i) {
        super.mo9632b(i);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo9637g(int i, int i2) {
        super.mo9637g(i, i2);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f6715o;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo9640j(nu5 nu5Var) {
        super.mo9640j(nu5Var);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC0372a interfaceC0372a) {
        super.setIndicatorCreatedListener(interfaceC0372a);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.j jVar) {
        ViewPager viewPager = this.f6713m;
        if (viewPager == null) {
            jfd0.a("can not find Viewpager , setViewPager first");
        } else {
            viewPager.P(jVar);
            this.f6713m.d(jVar);
        }
    }

    public void setViewPager(@Nullable ViewPager viewPager) {
        this.f6713m = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f6712l = -1;
        m9644n();
        this.f6713m.P(this.f6714n);
        this.f6713m.d(this.f6714n);
        this.f6714n.onPageSelected(this.f6713m.getCurrentItem());
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6714n = new C0374a();
        this.f6715o = new C0375b();
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6714n = new C0374a();
        this.f6715o = new C0375b();
    }
}

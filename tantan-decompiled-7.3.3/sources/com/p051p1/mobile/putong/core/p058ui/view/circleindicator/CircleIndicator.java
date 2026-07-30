package com.p051p1.mobile.putong.core.p058ui.view.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import p153l.cf60;
import p153l.mnd0;
import p153l.rv5;

/* JADX INFO: loaded from: classes12.dex */
public class CircleIndicator extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public ViewPager f37780m;

    /* JADX INFO: renamed from: n */
    public final ViewPager.InterfaceC0718j f37781n;

    /* JADX INFO: renamed from: o */
    public final DataSetObserver f37782o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator$a */
    public class C9101a implements ViewPager.InterfaceC0718j {
        public C9101a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (CircleIndicator.this.f37780m.getAdapter() == null || CircleIndicator.this.f37780m.getAdapter().getCount() <= 0) {
                return;
            }
            CircleIndicator.this.mo57382b(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator$b */
    public class C9102b extends DataSetObserver {
        public C9102b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator.this.f37780m == null) {
                return;
            }
            cf60 adapter = CircleIndicator.this.f37780m.getAdapter();
            int count = adapter != null ? adapter.getCount() : 0;
            if (count == CircleIndicator.this.getChildCount()) {
                return;
            }
            CircleIndicator circleIndicator = CircleIndicator.this;
            if (circleIndicator.f37779l < count) {
                circleIndicator.f37779l = circleIndicator.f37780m.getCurrentItem();
            } else {
                circleIndicator.f37779l = -1;
            }
            CircleIndicator.this.m57394n();
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        this.f37781n = new C9101a();
        this.f37782o = new C9102b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m57394n() {
        cf60 adapter = this.f37780m.getAdapter();
        mo57387g(adapter == null ? 0 : adapter.getCount(), this.f37780m.getCurrentItem());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo57382b(int i) {
        super.mo57382b(i);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo57387g(int i, int i2) {
        super.mo57387g(i, i2);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f37782o;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo57390j(rv5 rv5Var) {
        super.mo57390j(rv5Var);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC9099a interfaceC9099a) {
        super.setIndicatorCreatedListener(interfaceC9099a);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.InterfaceC0718j interfaceC0718j) {
        ViewPager viewPager = this.f37780m;
        if (viewPager == null) {
            mnd0.m159157a("can not find Viewpager , setViewPager first");
        } else {
            viewPager.m4177P(interfaceC0718j);
            this.f37780m.m4187d(interfaceC0718j);
        }
    }

    public void setViewPager(@Nullable ViewPager viewPager) {
        this.f37780m = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f37779l = -1;
        m57394n();
        this.f37780m.m4177P(this.f37781n);
        this.f37780m.m4187d(this.f37781n);
        this.f37781n.onPageSelected(this.f37780m.getCurrentItem());
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37781n = new C9101a();
        this.f37782o = new C9102b();
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37781n = new C9101a();
        this.f37782o = new C9102b();
    }
}

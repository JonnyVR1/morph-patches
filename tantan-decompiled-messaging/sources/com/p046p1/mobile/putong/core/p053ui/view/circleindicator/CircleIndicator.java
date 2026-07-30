package com.p046p1.mobile.putong.core.p053ui.view.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import p149l.jfd0;
import p149l.nu5;
import p149l.w660;

/* JADX INFO: loaded from: classes9.dex */
public class CircleIndicator extends BaseCircleIndicator {

    /* JADX INFO: renamed from: m */
    public ViewPager f36932m;

    /* JADX INFO: renamed from: n */
    public final ViewPager.InterfaceC0716j f36933n;

    /* JADX INFO: renamed from: o */
    public final DataSetObserver f36934o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator$a */
    public class C8938a implements ViewPager.InterfaceC0716j {
        public C8938a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (CircleIndicator.this.f36932m.getAdapter() == null || CircleIndicator.this.f36932m.getAdapter().getCount() <= 0) {
                return;
            }
            CircleIndicator.this.mo56199b(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.circleindicator.CircleIndicator$b */
    public class C8939b extends DataSetObserver {
        public C8939b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            if (CircleIndicator.this.f36932m == null) {
                return;
            }
            w660 adapter = CircleIndicator.this.f36932m.getAdapter();
            int count = adapter != null ? adapter.getCount() : 0;
            if (count == CircleIndicator.this.getChildCount()) {
                return;
            }
            CircleIndicator circleIndicator = CircleIndicator.this;
            if (circleIndicator.f36931l < count) {
                circleIndicator.f36931l = circleIndicator.f36932m.getCurrentItem();
            } else {
                circleIndicator.f36931l = -1;
            }
            CircleIndicator.this.m56211n();
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        this.f36933n = new C8938a();
        this.f36934o = new C8939b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m56211n() {
        w660 adapter = this.f36932m.getAdapter();
        mo56204g(adapter == null ? 0 : adapter.getCount(), this.f36932m.getCurrentItem());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo56199b(int i) {
        super.mo56199b(i);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo56204g(int i, int i2) {
        super.mo56204g(i, i2);
    }

    public DataSetObserver getDataSetObserver() {
        return this.f36934o;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo56207j(nu5 nu5Var) {
        super.mo56207j(nu5Var);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable BaseCircleIndicator.InterfaceC8936a interfaceC8936a) {
        super.setIndicatorCreatedListener(interfaceC8936a);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.InterfaceC0716j interfaceC0716j) {
        ViewPager viewPager = this.f36932m;
        if (viewPager == null) {
            jfd0.m141176a("can not find Viewpager , setViewPager first");
        } else {
            viewPager.m4175P(interfaceC0716j);
            this.f36932m.m4185d(interfaceC0716j);
        }
    }

    public void setViewPager(@Nullable ViewPager viewPager) {
        this.f36932m = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f36931l = -1;
        m56211n();
        this.f36932m.m4175P(this.f36933n);
        this.f36932m.m4185d(this.f36933n);
        this.f36933n.onPageSelected(this.f36932m.getCurrentItem());
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36933n = new C8938a();
        this.f36934o = new C8939b();
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36933n = new C8938a();
        this.f36934o = new C8939b();
    }
}

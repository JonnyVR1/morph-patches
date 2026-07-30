package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class FilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C11190g f39698M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC11175b f39699N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC11176c f39700O0;

    /* JADX INFO: renamed from: P0 */
    public int f39701P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$a */
    public class C11174a implements C11190g.a {
        public C11174a() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.C11190g.a
        /* JADX INFO: renamed from: a */
        public void mo61600a(float f) {
            if (NullChecker.m81303a(FilterScrollMoreViewPager.this.f39700O0)) {
                FilterScrollMoreViewPager.this.f39700O0.mo61604a(f / FilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.C11190g.a
        /* JADX INFO: renamed from: b */
        public void mo61601b(float f) {
            if (NullChecker.m81303a(FilterScrollMoreViewPager.this.f39700O0)) {
                FilterScrollMoreViewPager.this.f39700O0.mo61605b(f);
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.C11190g.a
        /* JADX INFO: renamed from: c */
        public void mo61602c(boolean z, float f) {
            if (f * 3.0f <= FilterScrollMoreViewPager.this.getHeight() || !NullChecker.m81303a(FilterScrollMoreViewPager.this.f39700O0)) {
                return;
            }
            FilterScrollMoreViewPager.this.f39700O0.mo61606c(z);
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.C11190g.a
        public void onCancel() {
            if (NullChecker.m81303a(FilterScrollMoreViewPager.this.f39700O0)) {
                FilterScrollMoreViewPager.this.f39700O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$b */
    public interface InterfaceC11175b {
        /* JADX INFO: renamed from: a */
        boolean mo61603a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$c */
    public interface InterfaceC11176c {
        /* JADX INFO: renamed from: a */
        void mo61604a(float f);

        /* JADX INFO: renamed from: b */
        void mo61605b(float f);

        /* JADX INFO: renamed from: c */
        void mo61606c(boolean z);

        void onCancel();
    }

    public FilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61599c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m61599c0(Context context) {
        this.f39701P0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C11190g c11190g = new C11190g();
        this.f39698M0 = c11190g;
        c11190g.m61819g(this.f39701P0);
        this.f39698M0.m61817e(this.f39701P0 * 3);
        this.f39698M0.m61818f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM61815c = this.f39698M0.m61815c(motionEvent);
        if (NullChecker.m81303a(this.f39699N0)) {
            zM61815c = this.f39699N0.mo61603a(motionEvent) || zM61815c;
        }
        return super.onTouchEvent(motionEvent) || zM61815c;
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC11175b interfaceC11175b) {
        this.f39699N0 = interfaceC11175b;
    }

    public void setOnVerticalFlingListener(InterfaceC11176c interfaceC11176c) {
        if (this.f39700O0 == null) {
            this.f39700O0 = interfaceC11176c;
            this.f39698M0.m61816d(new C11174a());
        } else {
            this.f39698M0.m61816d(null);
            this.f39700O0 = null;
        }
    }

    public FilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

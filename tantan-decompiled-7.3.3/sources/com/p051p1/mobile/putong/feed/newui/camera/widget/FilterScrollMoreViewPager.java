package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class FilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C11353g f40546M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC11338b f40547N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC11339c f40548O0;

    /* JADX INFO: renamed from: P0 */
    public int f40549P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$a */
    public class C11337a implements C11353g.a {
        public C11337a() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.C11353g.a
        /* JADX INFO: renamed from: a */
        public void mo62784a(float f) {
            if (NullChecker.m82486a(FilterScrollMoreViewPager.this.f40548O0)) {
                FilterScrollMoreViewPager.this.f40548O0.mo62788a(f / FilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.C11353g.a
        /* JADX INFO: renamed from: b */
        public void mo62785b(float f) {
            if (NullChecker.m82486a(FilterScrollMoreViewPager.this.f40548O0)) {
                FilterScrollMoreViewPager.this.f40548O0.mo62789b(f);
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.C11353g.a
        /* JADX INFO: renamed from: c */
        public void mo62786c(boolean z, float f) {
            if (f * 3.0f <= FilterScrollMoreViewPager.this.getHeight() || !NullChecker.m82486a(FilterScrollMoreViewPager.this.f40548O0)) {
                return;
            }
            FilterScrollMoreViewPager.this.f40548O0.mo62790c(z);
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.C11353g.a
        public void onCancel() {
            if (NullChecker.m82486a(FilterScrollMoreViewPager.this.f40548O0)) {
                FilterScrollMoreViewPager.this.f40548O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$b */
    public interface InterfaceC11338b {
        /* JADX INFO: renamed from: a */
        boolean mo62787a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$c */
    public interface InterfaceC11339c {
        /* JADX INFO: renamed from: a */
        void mo62788a(float f);

        /* JADX INFO: renamed from: b */
        void mo62789b(float f);

        /* JADX INFO: renamed from: c */
        void mo62790c(boolean z);

        void onCancel();
    }

    public FilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62783c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m62783c0(Context context) {
        this.f40549P0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C11353g c11353g = new C11353g();
        this.f40546M0 = c11353g;
        c11353g.m63002g(this.f40549P0);
        this.f40546M0.m63000e(this.f40549P0 * 3);
        this.f40546M0.m63001f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM62998c = this.f40546M0.m62998c(motionEvent);
        if (NullChecker.m82486a(this.f40547N0)) {
            zM62998c = this.f40547N0.mo62787a(motionEvent) || zM62998c;
        }
        return super.onTouchEvent(motionEvent) || zM62998c;
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC11338b interfaceC11338b) {
        this.f40547N0 = interfaceC11338b;
    }

    public void setOnVerticalFlingListener(InterfaceC11339c interfaceC11339c) {
        if (this.f40548O0 == null) {
            this.f40548O0 = interfaceC11339c;
            this.f40546M0.m62999d(new C11337a());
        } else {
            this.f40546M0.m62999d(null);
            this.f40548O0 = null;
        }
    }

    public FilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

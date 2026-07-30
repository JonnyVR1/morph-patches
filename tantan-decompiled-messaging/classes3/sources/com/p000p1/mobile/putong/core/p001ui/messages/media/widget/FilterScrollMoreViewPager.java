package com.p000p1.mobile.putong.core.p001ui.messages.media.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C0121a f1710M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC0115b f1711N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC0117d f1712O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC0116c f1713P0;

    /* JADX INFO: renamed from: Q0 */
    public int f1714Q0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$a */
    public class C0114a implements C0121a.a {
        public C0114a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.C0121a.a
        /* JADX INFO: renamed from: a */
        public void mo2318a(float f) {
            if (NullChecker.a(FilterScrollMoreViewPager.this.f1712O0)) {
                FilterScrollMoreViewPager.this.f1712O0.mo2324a(f / FilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.C0121a.a
        /* JADX INFO: renamed from: b */
        public void mo2319b(float f) {
            if (NullChecker.a(FilterScrollMoreViewPager.this.f1712O0)) {
                FilterScrollMoreViewPager.this.f1712O0.mo2325b(f);
            }
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.C0121a.a
        /* JADX INFO: renamed from: c */
        public void mo2320c(boolean z, float f) {
            if (f * 3.0f <= FilterScrollMoreViewPager.this.getHeight() || FilterScrollMoreViewPager.this.f1712O0 == null) {
                return;
            }
            FilterScrollMoreViewPager.this.f1712O0.mo2326c(z);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.C0121a.a
        /* JADX INFO: renamed from: d */
        public void mo2321d() {
            FilterScrollMoreViewPager.this.f1712O0.mo2327d();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.C0121a.a
        public void onCancel() {
            if (NullChecker.a(FilterScrollMoreViewPager.this.f1712O0)) {
                FilterScrollMoreViewPager.this.f1712O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$b */
    public interface InterfaceC0115b {
        /* JADX INFO: renamed from: a */
        boolean mo2322a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$c */
    public interface InterfaceC0116c {
        /* JADX INFO: renamed from: a */
        boolean mo2323a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$d */
    public interface InterfaceC0117d {
        /* JADX INFO: renamed from: a */
        void mo2324a(float f);

        /* JADX INFO: renamed from: b */
        void mo2325b(float f);

        /* JADX INFO: renamed from: c */
        void mo2326c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo2327d();

        void onCancel();
    }

    public FilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2317c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m2317c0(Context context) {
        this.f1714Q0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C0121a c0121a = new C0121a();
        this.f1710M0 = c0121a;
        c0121a.m2351g(this.f1714Q0);
        this.f1710M0.m2349e(this.f1714Q0 * 3);
        this.f1710M0.m2350f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC0116c interfaceC0116c = this.f1713P0;
        if (interfaceC0116c != null && interfaceC0116c.mo2323a()) {
            return false;
        }
        boolean zM2347c = this.f1710M0.m2347c(motionEvent);
        InterfaceC0115b interfaceC0115b = this.f1711N0;
        if (interfaceC0115b != null) {
            zM2347c = interfaceC0115b.mo2322a(motionEvent) || zM2347c;
        }
        return zM2347c || super.onTouchEvent(motionEvent);
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC0115b interfaceC0115b) {
        this.f1711N0 = interfaceC0115b;
    }

    public void setOnIntercept(InterfaceC0116c interfaceC0116c) {
        this.f1713P0 = interfaceC0116c;
    }

    public void setOnVerticalFlingListener(InterfaceC0117d interfaceC0117d) {
        if (this.f1712O0 == null) {
            this.f1712O0 = interfaceC0117d;
            this.f1710M0.m2348d(new C0114a());
        } else {
            this.f1710M0.m2348d(null);
            this.f1712O0 = null;
        }
    }

    public FilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C2034g f1159M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC2019b f1160N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC2020c f1161O0;

    /* JADX INFO: renamed from: P0 */
    public int f1162P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$a */
    public class C2018a implements C2034g.a {
        public C2018a() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.C2034g.a
        /* JADX INFO: renamed from: a */
        public void mo2552a(float f) {
            if (NullChecker.a(FilterScrollMoreViewPager.this.f1161O0)) {
                FilterScrollMoreViewPager.this.f1161O0.mo2556a(f / FilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.C2034g.a
        /* JADX INFO: renamed from: b */
        public void mo2553b(float f) {
            if (NullChecker.a(FilterScrollMoreViewPager.this.f1161O0)) {
                FilterScrollMoreViewPager.this.f1161O0.mo2557b(f);
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.C2034g.a
        /* JADX INFO: renamed from: c */
        public void mo2554c(boolean z, float f) {
            if (f * 3.0f <= FilterScrollMoreViewPager.this.getHeight() || !NullChecker.a(FilterScrollMoreViewPager.this.f1161O0)) {
                return;
            }
            FilterScrollMoreViewPager.this.f1161O0.mo2558c(z);
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.C2034g.a
        public void onCancel() {
            if (NullChecker.a(FilterScrollMoreViewPager.this.f1161O0)) {
                FilterScrollMoreViewPager.this.f1161O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$b */
    public interface InterfaceC2019b {
        /* JADX INFO: renamed from: a */
        boolean mo2555a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FilterScrollMoreViewPager$c */
    public interface InterfaceC2020c {
        /* JADX INFO: renamed from: a */
        void mo2556a(float f);

        /* JADX INFO: renamed from: b */
        void mo2557b(float f);

        /* JADX INFO: renamed from: c */
        void mo2558c(boolean z);

        void onCancel();
    }

    public FilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2551c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m2551c0(Context context) {
        this.f1162P0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C2034g c2034g = new C2034g();
        this.f1159M0 = c2034g;
        c2034g.m2783g(this.f1162P0);
        this.f1159M0.m2781e(this.f1162P0 * 3);
        this.f1159M0.m2782f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM2779c = this.f1159M0.m2779c(motionEvent);
        if (NullChecker.a(this.f1160N0)) {
            zM2779c = this.f1160N0.mo2555a(motionEvent) || zM2779c;
        }
        return super.onTouchEvent(motionEvent) || zM2779c;
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC2019b interfaceC2019b) {
        this.f1160N0 = interfaceC2019b;
    }

    public void setOnVerticalFlingListener(InterfaceC2020c interfaceC2020c) {
        if (this.f1161O0 == null) {
            this.f1161O0 = interfaceC2020c;
            this.f1159M0.m2780d(new C2018a());
        } else {
            this.f1159M0.m2780d(null);
            this.f1161O0 = null;
        }
    }

    public FilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

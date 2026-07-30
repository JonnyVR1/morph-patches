package com.p046p1.mobile.putong.core.p053ui.messages.media.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class FilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C8538a f31819M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC8532b f31820N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC8534d f31821O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC8533c f31822P0;

    /* JADX INFO: renamed from: Q0 */
    public int f31823Q0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$a */
    public class C8531a implements C8538a.a {
        public C8531a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.C8538a.a
        /* JADX INFO: renamed from: a */
        public void mo49199a(float f) {
            if (NullChecker.m81303a(FilterScrollMoreViewPager.this.f31821O0)) {
                FilterScrollMoreViewPager.this.f31821O0.mo49205a(f / FilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.C8538a.a
        /* JADX INFO: renamed from: b */
        public void mo49200b(float f) {
            if (NullChecker.m81303a(FilterScrollMoreViewPager.this.f31821O0)) {
                FilterScrollMoreViewPager.this.f31821O0.mo49206b(f);
            }
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.C8538a.a
        /* JADX INFO: renamed from: c */
        public void mo49201c(boolean z, float f) {
            if (f * 3.0f <= FilterScrollMoreViewPager.this.getHeight() || FilterScrollMoreViewPager.this.f31821O0 == null) {
                return;
            }
            FilterScrollMoreViewPager.this.f31821O0.mo49207c(z);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.C8538a.a
        /* JADX INFO: renamed from: d */
        public void mo49202d() {
            FilterScrollMoreViewPager.this.f31821O0.mo49208d();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.C8538a.a
        public void onCancel() {
            if (NullChecker.m81303a(FilterScrollMoreViewPager.this.f31821O0)) {
                FilterScrollMoreViewPager.this.f31821O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$b */
    public interface InterfaceC8532b {
        /* JADX INFO: renamed from: a */
        boolean mo49203a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$c */
    public interface InterfaceC8533c {
        /* JADX INFO: renamed from: a */
        boolean mo49204a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$d */
    public interface InterfaceC8534d {
        /* JADX INFO: renamed from: a */
        void mo49205a(float f);

        /* JADX INFO: renamed from: b */
        void mo49206b(float f);

        /* JADX INFO: renamed from: c */
        void mo49207c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo49208d();

        void onCancel();
    }

    public FilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49198c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m49198c0(Context context) {
        this.f31823Q0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C8538a c8538a = new C8538a();
        this.f31819M0 = c8538a;
        c8538a.m49232g(this.f31823Q0);
        this.f31819M0.m49230e(this.f31823Q0 * 3);
        this.f31819M0.m49231f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC8533c interfaceC8533c = this.f31822P0;
        if (interfaceC8533c != null && interfaceC8533c.mo49204a()) {
            return false;
        }
        boolean zM49228c = this.f31819M0.m49228c(motionEvent);
        InterfaceC8532b interfaceC8532b = this.f31820N0;
        if (interfaceC8532b != null) {
            zM49228c = interfaceC8532b.mo49203a(motionEvent) || zM49228c;
        }
        return zM49228c || super.onTouchEvent(motionEvent);
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC8532b interfaceC8532b) {
        this.f31820N0 = interfaceC8532b;
    }

    public void setOnIntercept(InterfaceC8533c interfaceC8533c) {
        this.f31822P0 = interfaceC8533c;
    }

    public void setOnVerticalFlingListener(InterfaceC8534d interfaceC8534d) {
        if (this.f31821O0 == null) {
            this.f31821O0 = interfaceC8534d;
            this.f31819M0.m49229d(new C8531a());
        } else {
            this.f31819M0.m49229d(null);
            this.f31821O0 = null;
        }
    }

    public FilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

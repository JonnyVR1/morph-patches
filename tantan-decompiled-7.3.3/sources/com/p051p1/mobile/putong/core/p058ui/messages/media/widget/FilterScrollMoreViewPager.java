package com.p051p1.mobile.putong.core.p058ui.messages.media.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class FilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C8701a f32667M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC8695b f32668N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC8697d f32669O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC8696c f32670P0;

    /* JADX INFO: renamed from: Q0 */
    public int f32671Q0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$a */
    public class C8694a implements C8701a.a {
        public C8694a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.C8701a.a
        /* JADX INFO: renamed from: a */
        public void mo50382a(float f) {
            if (NullChecker.m82486a(FilterScrollMoreViewPager.this.f32669O0)) {
                FilterScrollMoreViewPager.this.f32669O0.mo50388a(f / FilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.C8701a.a
        /* JADX INFO: renamed from: b */
        public void mo50383b(float f) {
            if (NullChecker.m82486a(FilterScrollMoreViewPager.this.f32669O0)) {
                FilterScrollMoreViewPager.this.f32669O0.mo50389b(f);
            }
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.C8701a.a
        /* JADX INFO: renamed from: c */
        public void mo50384c(boolean z, float f) {
            if (f * 3.0f <= FilterScrollMoreViewPager.this.getHeight() || FilterScrollMoreViewPager.this.f32669O0 == null) {
                return;
            }
            FilterScrollMoreViewPager.this.f32669O0.mo50390c(z);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.C8701a.a
        /* JADX INFO: renamed from: d */
        public void mo50385d() {
            FilterScrollMoreViewPager.this.f32669O0.mo50391d();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.C8701a.a
        public void onCancel() {
            if (NullChecker.m82486a(FilterScrollMoreViewPager.this.f32669O0)) {
                FilterScrollMoreViewPager.this.f32669O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$b */
    public interface InterfaceC8695b {
        /* JADX INFO: renamed from: a */
        boolean mo50386a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$c */
    public interface InterfaceC8696c {
        /* JADX INFO: renamed from: a */
        boolean mo50387a();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.FilterScrollMoreViewPager$d */
    public interface InterfaceC8697d {
        /* JADX INFO: renamed from: a */
        void mo50388a(float f);

        /* JADX INFO: renamed from: b */
        void mo50389b(float f);

        /* JADX INFO: renamed from: c */
        void mo50390c(boolean z);

        /* JADX INFO: renamed from: d */
        void mo50391d();

        void onCancel();
    }

    public FilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50381c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m50381c0(Context context) {
        this.f32671Q0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C8701a c8701a = new C8701a();
        this.f32667M0 = c8701a;
        c8701a.m50415g(this.f32671Q0);
        this.f32667M0.m50413e(this.f32671Q0 * 3);
        this.f32667M0.m50414f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC8696c interfaceC8696c = this.f32670P0;
        if (interfaceC8696c != null && interfaceC8696c.mo50387a()) {
            return false;
        }
        boolean zM50411c = this.f32667M0.m50411c(motionEvent);
        InterfaceC8695b interfaceC8695b = this.f32668N0;
        if (interfaceC8695b != null) {
            zM50411c = interfaceC8695b.mo50386a(motionEvent) || zM50411c;
        }
        return zM50411c || super.onTouchEvent(motionEvent);
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC8695b interfaceC8695b) {
        this.f32668N0 = interfaceC8695b;
    }

    public void setOnIntercept(InterfaceC8696c interfaceC8696c) {
        this.f32670P0 = interfaceC8696c;
    }

    public void setOnVerticalFlingListener(InterfaceC8697d interfaceC8697d) {
        if (this.f32669O0 == null) {
            this.f32669O0 = interfaceC8697d;
            this.f32667M0.m50412d(new C8694a());
        } else {
            this.f32667M0.m50412d(null);
            this.f32669O0 = null;
        }
    }

    public FilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

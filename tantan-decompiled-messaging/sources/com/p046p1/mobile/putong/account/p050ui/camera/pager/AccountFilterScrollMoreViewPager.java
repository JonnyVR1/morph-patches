package com.p046p1.mobile.putong.account.p050ui.camera.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;
import p149l.C20469uo;

/* JADX INFO: loaded from: classes9.dex */
public class AccountFilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C20469uo f16710M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC4654b f16711N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC4655c f16712O0;

    /* JADX INFO: renamed from: P0 */
    public int f16713P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$a */
    public class C4653a implements C20469uo.a {
        public C4653a() {
        }

        @Override // p149l.C20469uo.a
        /* JADX INFO: renamed from: a */
        public void mo28870a(float f) {
            if (NullChecker.m81303a(AccountFilterScrollMoreViewPager.this.f16712O0)) {
                AccountFilterScrollMoreViewPager.this.f16712O0.mo28874a(f / AccountFilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // p149l.C20469uo.a
        /* JADX INFO: renamed from: b */
        public void mo28871b(float f) {
            if (NullChecker.m81303a(AccountFilterScrollMoreViewPager.this.f16712O0)) {
                AccountFilterScrollMoreViewPager.this.f16712O0.mo28875b(f);
            }
        }

        @Override // p149l.C20469uo.a
        /* JADX INFO: renamed from: c */
        public void mo28872c(boolean z, float f) {
            if (f * 3.0f <= AccountFilterScrollMoreViewPager.this.getHeight() || !NullChecker.m81303a(AccountFilterScrollMoreViewPager.this.f16712O0)) {
                return;
            }
            AccountFilterScrollMoreViewPager.this.f16712O0.mo28876c(z);
        }

        @Override // p149l.C20469uo.a
        public void onCancel() {
            if (NullChecker.m81303a(AccountFilterScrollMoreViewPager.this.f16712O0)) {
                AccountFilterScrollMoreViewPager.this.f16712O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$b */
    public interface InterfaceC4654b {
        /* JADX INFO: renamed from: a */
        boolean mo28873a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$c */
    public interface InterfaceC4655c {
        /* JADX INFO: renamed from: a */
        void mo28874a(float f);

        /* JADX INFO: renamed from: b */
        void mo28875b(float f);

        /* JADX INFO: renamed from: c */
        void mo28876c(boolean z);

        void onCancel();
    }

    public AccountFilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28869c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m28869c0(Context context) {
        this.f16713P0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C20469uo c20469uo = new C20469uo();
        this.f16710M0 = c20469uo;
        c20469uo.m194539g(this.f16713P0);
        this.f16710M0.m194537e(this.f16713P0 * 3);
        this.f16710M0.m194538f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM194535c = this.f16710M0.m194535c(motionEvent);
        if (NullChecker.m81303a(this.f16711N0)) {
            zM194535c = this.f16711N0.mo28873a(motionEvent) || zM194535c;
        }
        return super.onTouchEvent(motionEvent) || zM194535c;
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC4654b interfaceC4654b) {
        this.f16711N0 = interfaceC4654b;
    }

    public void setOnVerticalFlingListener(InterfaceC4655c interfaceC4655c) {
        if (this.f16712O0 == null) {
            this.f16712O0 = interfaceC4655c;
            this.f16710M0.m194536d(new C4653a());
        } else {
            this.f16710M0.m194536d(null);
            this.f16712O0 = null;
        }
    }

    public AccountFilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

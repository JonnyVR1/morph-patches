package com.p000p1.mobile.putong.account.p002ui.camera.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;
import p006l.C1352uo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountFilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C1352uo f699M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC0080b f700N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC0081c f701O0;

    /* JADX INFO: renamed from: P0 */
    public int f702P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$a */
    public class C0079a implements C1352uo.a {
        public C0079a() {
        }

        @Override // p006l.C1352uo.a
        /* JADX INFO: renamed from: a */
        public void mo776a(float f) {
            if (NullChecker.a(AccountFilterScrollMoreViewPager.this.f701O0)) {
                AccountFilterScrollMoreViewPager.this.f701O0.mo780a(f / AccountFilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // p006l.C1352uo.a
        /* JADX INFO: renamed from: b */
        public void mo777b(float f) {
            if (NullChecker.a(AccountFilterScrollMoreViewPager.this.f701O0)) {
                AccountFilterScrollMoreViewPager.this.f701O0.mo781b(f);
            }
        }

        @Override // p006l.C1352uo.a
        /* JADX INFO: renamed from: c */
        public void mo778c(boolean z, float f) {
            if (f * 3.0f <= AccountFilterScrollMoreViewPager.this.getHeight() || !NullChecker.a(AccountFilterScrollMoreViewPager.this.f701O0)) {
                return;
            }
            AccountFilterScrollMoreViewPager.this.f701O0.mo782c(z);
        }

        @Override // p006l.C1352uo.a
        public void onCancel() {
            if (NullChecker.a(AccountFilterScrollMoreViewPager.this.f701O0)) {
                AccountFilterScrollMoreViewPager.this.f701O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$b */
    public interface InterfaceC0080b {
        /* JADX INFO: renamed from: a */
        boolean mo779a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$c */
    public interface InterfaceC0081c {
        /* JADX INFO: renamed from: a */
        void mo780a(float f);

        /* JADX INFO: renamed from: b */
        void mo781b(float f);

        /* JADX INFO: renamed from: c */
        void mo782c(boolean z);

        void onCancel();
    }

    public AccountFilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m775c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m775c0(Context context) {
        this.f702P0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C1352uo c1352uo = new C1352uo();
        this.f699M0 = c1352uo;
        c1352uo.m25303g(this.f702P0);
        this.f699M0.m25301e(this.f702P0 * 3);
        this.f699M0.m25302f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM25299c = this.f699M0.m25299c(motionEvent);
        if (NullChecker.a(this.f700N0)) {
            zM25299c = this.f700N0.mo779a(motionEvent) || zM25299c;
        }
        return super.onTouchEvent(motionEvent) || zM25299c;
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC0080b interfaceC0080b) {
        this.f700N0 = interfaceC0080b;
    }

    public void setOnVerticalFlingListener(InterfaceC0081c interfaceC0081c) {
        if (this.f701O0 == null) {
            this.f701O0 = interfaceC0081c;
            this.f699M0.m25300d(new C0079a());
        } else {
            this.f699M0.m25300d(null);
            this.f701O0 = null;
        }
    }

    public AccountFilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

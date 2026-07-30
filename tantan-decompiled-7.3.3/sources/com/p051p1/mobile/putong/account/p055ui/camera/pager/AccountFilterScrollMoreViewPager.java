package com.p051p1.mobile.putong.account.p055ui.camera.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.NullChecker;
import p153l.C19409po;

/* JADX INFO: loaded from: classes9.dex */
public class AccountFilterScrollMoreViewPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public C19409po f17429M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC4805b f17430N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC4806c f17431O0;

    /* JADX INFO: renamed from: P0 */
    public int f17432P0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$a */
    public class C4804a implements C19409po.a {
        public C4804a() {
        }

        @Override // p153l.C19409po.a
        /* JADX INFO: renamed from: a */
        public void mo29869a(float f) {
            if (NullChecker.m82486a(AccountFilterScrollMoreViewPager.this.f17431O0)) {
                AccountFilterScrollMoreViewPager.this.f17431O0.mo29873a(f / AccountFilterScrollMoreViewPager.this.getHeight());
            }
        }

        @Override // p153l.C19409po.a
        /* JADX INFO: renamed from: b */
        public void mo29870b(float f) {
            if (NullChecker.m82486a(AccountFilterScrollMoreViewPager.this.f17431O0)) {
                AccountFilterScrollMoreViewPager.this.f17431O0.mo29874b(f);
            }
        }

        @Override // p153l.C19409po.a
        /* JADX INFO: renamed from: c */
        public void mo29871c(boolean z, float f) {
            if (f * 3.0f <= AccountFilterScrollMoreViewPager.this.getHeight() || !NullChecker.m82486a(AccountFilterScrollMoreViewPager.this.f17431O0)) {
                return;
            }
            AccountFilterScrollMoreViewPager.this.f17431O0.mo29875c(z);
        }

        @Override // p153l.C19409po.a
        public void onCancel() {
            if (NullChecker.m82486a(AccountFilterScrollMoreViewPager.this.f17431O0)) {
                AccountFilterScrollMoreViewPager.this.f17431O0.onCancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$b */
    public interface InterfaceC4805b {
        /* JADX INFO: renamed from: a */
        boolean mo29872a(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.pager.AccountFilterScrollMoreViewPager$c */
    public interface InterfaceC4806c {
        /* JADX INFO: renamed from: a */
        void mo29873a(float f);

        /* JADX INFO: renamed from: b */
        void mo29874b(float f);

        /* JADX INFO: renamed from: c */
        void mo29875c(boolean z);

        void onCancel();
    }

    public AccountFilterScrollMoreViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29868c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m29868c0(Context context) {
        this.f17432P0 = ViewConfiguration.get(context).getScaledTouchSlop();
        C19409po c19409po = new C19409po();
        this.f17429M0 = c19409po;
        c19409po.m173093g(this.f17432P0);
        this.f17429M0.m173091e(this.f17432P0 * 3);
        this.f17429M0.m173092f(context.getResources().getDisplayMetrics().heightPixels / 10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM173089c = this.f17429M0.m173089c(motionEvent);
        if (NullChecker.m82486a(this.f17430N0)) {
            zM173089c = this.f17430N0.mo29872a(motionEvent) || zM173089c;
        }
        return super.onTouchEvent(motionEvent) || zM173089c;
    }

    public void setBeforeCheckEnableTouchListener(InterfaceC4805b interfaceC4805b) {
        this.f17430N0 = interfaceC4805b;
    }

    public void setOnVerticalFlingListener(InterfaceC4806c interfaceC4806c) {
        if (this.f17431O0 == null) {
            this.f17431O0 = interfaceC4806c;
            this.f17429M0.m173090d(new C4804a());
        } else {
            this.f17429M0.m173090d(null);
            this.f17431O0 = null;
        }
    }

    public AccountFilterScrollMoreViewPager(Context context) {
        this(context, null);
    }
}

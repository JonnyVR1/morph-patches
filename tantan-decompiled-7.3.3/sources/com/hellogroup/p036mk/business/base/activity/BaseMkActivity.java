package com.hellogroup.p036mk.business.base.activity;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import p153l.c2j0;
import p153l.ej2;
import p153l.lpj0;
import p153l.q4g0;
import p153l.w9c0;

/* JADX INFO: loaded from: classes7.dex */
public class BaseMkActivity extends AppCompatActivity implements Toolbar.InterfaceC0161f {

    /* JADX INFO: renamed from: c */
    protected c2j0 f12005c;

    /* JADX INFO: renamed from: d */
    protected Toolbar f12006d;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.activity.BaseMkActivity$a */
    public class ViewOnClickListenerC3507a implements View.OnClickListener {
        public ViewOnClickListenerC3507a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMkActivity.this.mo17780Q0();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m17772H0() {
        m17776L0();
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m17773I0() {
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public int m17774J0() {
        return m17778O0() ? getResources().getColor(w9c0.f188002h) : getResources().getColor(0);
    }

    /* JADX INFO: renamed from: K0 */
    public Toolbar m17775K0() {
        return this.f12006d;
    }

    /* JADX INFO: renamed from: L0 */
    public void m17776L0() {
        if (m17773I0()) {
            m17781R0(m17774J0(), m17778O0());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void mo17777N0() {
        c2j0 c2j0VarM107688c = c2j0.m107688c(this, new ViewOnClickListenerC3507a());
        this.f12005c = c2j0VarM107688c;
        this.f12006d = c2j0VarM107688c.m107695g();
        if (mo17779P0() || this.f12006d == null) {
            return;
        }
        this.f12005c.m107699l(0);
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m17778O0() {
        return true;
    }

    /* JADX INFO: renamed from: P0 */
    public boolean mo17779P0() {
        return true;
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo17780Q0() {
        lpj0.m155254j(this);
        onBackPressed();
    }

    /* JADX INFO: renamed from: R0 */
    public void m17781R0(int i, boolean z) {
        if (z) {
            q4g0.m175217e(this, i, 0);
            m17782S0(false);
        } else {
            q4g0.m175217e(this, i, 0);
            m17782S0(true);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m17782S0(boolean z) {
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        }
        m17783T0(z);
    }

    /* JADX INFO: renamed from: T0 */
    public void m17783T0(boolean z) {
        if (z) {
            ej2.m120968m(this, false);
        } else {
            ej2.m120968m(this, true);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public BaseMkActivity m17784U0() {
        return this;
    }

    public void init() {
        mo17777N0();
    }

    @Override // androidx.appcompat.widget.Toolbar.InterfaceC0161f
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        m17772H0();
        super.setContentView(i);
        init();
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        c2j0 c2j0Var = this.f12005c;
        if (c2j0Var != null) {
            c2j0Var.m107702o(charSequence);
        }
        super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m17772H0();
        super.setContentView(view);
        init();
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        c2j0 c2j0Var = this.f12005c;
        if (c2j0Var != null) {
            c2j0Var.m107701n(i);
        }
        super.setTitle(i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m17772H0();
        super.setContentView(view, layoutParams);
        init();
    }
}

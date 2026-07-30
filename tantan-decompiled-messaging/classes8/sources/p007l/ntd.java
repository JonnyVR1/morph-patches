package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import l.otd;
import l.xdl0;
import l.yij0;
import v.VButton_FakeShadow;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ntd implements s7m<mtd> {

    /* JADX INFO: renamed from: a */
    public TextView f3444a;

    /* JADX INFO: renamed from: b */
    public TextView f3445b;

    /* JADX INFO: renamed from: c */
    public TextView f3446c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f3447d;

    /* JADX INFO: renamed from: e */
    public VText f3448e;

    /* JADX INFO: renamed from: f */
    public Act f3449f;

    /* JADX INFO: renamed from: g */
    public mtd f3450g;

    public ntd(Act act) {
        this.f3449f = act;
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f3449f;
    }

    /* JADX INFO: renamed from: a */
    public View m10091a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return otd.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f3449f;
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(mtd mtdVar) {
        this.f3450g = mtdVar;
    }

    /* JADX INFO: renamed from: c */
    public void m10093c(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10091a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m10094r() {
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().w(false);
        xdl0.E0(this.f3447d, this.f3450g.m9939x0());
        xdl0.E0(this.f3448e, this.f3450g.m9938u0());
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}

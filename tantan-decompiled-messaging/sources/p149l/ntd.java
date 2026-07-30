package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import p147v.VButton_FakeShadow;
import p147v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class ntd implements s7m<mtd> {

    /* JADX INFO: renamed from: a */
    public TextView f140461a;

    /* JADX INFO: renamed from: b */
    public TextView f140462b;

    /* JADX INFO: renamed from: c */
    public TextView f140463c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f140464d;

    /* JADX INFO: renamed from: e */
    public VText f140465e;

    /* JADX INFO: renamed from: f */
    public Act f140466f;

    /* JADX INFO: renamed from: g */
    public mtd f140467g;

    public ntd(Act act) {
        this.f140466f = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f140466f;
    }

    /* JADX INFO: renamed from: a */
    public View m161377a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return otd.m165941b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f140466f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mtd mtdVar) {
        this.f140467g = mtdVar;
    }

    /* JADX INFO: renamed from: c */
    public void m161379c(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m161377a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m161380r() {
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().mo134136w(false);
        xdl0.m208329E0(this.f140464d, this.f140467g.m156216x0());
        xdl0.m208329E0(this.f140465e, this.f140467g.m156215u0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

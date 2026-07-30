package p149l;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcfz;

/* JADX INFO: loaded from: classes6.dex */
public final class k5t0 {

    /* JADX INFO: renamed from: a */
    public final Context f121230a;

    /* JADX INFO: renamed from: b */
    public final v5t0 f121231b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f121232c;

    /* JADX INFO: renamed from: d */
    public zzcfz f121233d;

    public k5t0(Context context, ViewGroup viewGroup, q9t0 q9t0Var) {
        this.f121230a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f121232c = viewGroup;
        this.f121231b = q9t0Var;
        this.f121233d = null;
    }

    /* JADX INFO: renamed from: a */
    public final zzcfz m144548a() {
        return this.f121233d;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Integer m144549b() {
        zzcfz zzcfzVar = this.f121233d;
        if (zzcfzVar != null) {
            return zzcfzVar.m13610o();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m144550c(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcfz zzcfzVar = this.f121233d;
        if (zzcfzVar != null) {
            zzcfzVar.m13603h(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m144551d(int i, int i2, int i3, int i4, int i5, boolean z, u5t0 u5t0Var) {
        if (this.f121233d != null) {
            return;
        }
        w7s0.m202071a(this.f121231b.zzm().m105818a(), this.f121231b.zzk(), "vpr2");
        Context context = this.f121230a;
        v5t0 v5t0Var = this.f121231b;
        zzcfz zzcfzVar = new zzcfz(context, v5t0Var, i5, z, v5t0Var.zzm().m105818a(), u5t0Var);
        this.f121233d = zzcfzVar;
        this.f121232c.addView(zzcfzVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f121233d.m13603h(i, i2, i3, i4);
        this.f121231b.mo13712u(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m144552e() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcfz zzcfzVar = this.f121233d;
        if (zzcfzVar != null) {
            zzcfzVar.m13612r();
            this.f121232c.removeView(this.f121233d);
            this.f121233d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m144553f() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcfz zzcfzVar = this.f121233d;
        if (zzcfzVar != null) {
            zzcfzVar.m13618x();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m144554g(int i) {
        zzcfz zzcfzVar = this.f121233d;
        if (zzcfzVar != null) {
            zzcfzVar.m13600e(i);
        }
    }
}

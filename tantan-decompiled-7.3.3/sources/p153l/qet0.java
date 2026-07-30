package p153l;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcfz;

/* JADX INFO: loaded from: classes6.dex */
public final class qet0 {

    /* JADX INFO: renamed from: a */
    public final Context f157211a;

    /* JADX INFO: renamed from: b */
    public final bft0 f157212b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f157213c;

    /* JADX INFO: renamed from: d */
    public zzcfz f157214d;

    public qet0(Context context, ViewGroup viewGroup, wit0 wit0Var) {
        this.f157211a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f157213c = viewGroup;
        this.f157212b = wit0Var;
        this.f157214d = null;
    }

    /* JADX INFO: renamed from: a */
    public final zzcfz m176268a() {
        return this.f157214d;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Integer m176269b() {
        zzcfz zzcfzVar = this.f157214d;
        if (zzcfzVar != null) {
            return zzcfzVar.m13664o();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m176270c(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcfz zzcfzVar = this.f157214d;
        if (zzcfzVar != null) {
            zzcfzVar.m13657h(i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m176271d(int i, int i2, int i3, int i4, int i5, boolean z, aft0 aft0Var) {
        if (this.f157214d != null) {
            return;
        }
        chs0.m109843a(this.f157212b.zzm().m140032a(), this.f157212b.zzk(), "vpr2");
        Context context = this.f157211a;
        bft0 bft0Var = this.f157212b;
        zzcfz zzcfzVar = new zzcfz(context, bft0Var, i5, z, bft0Var.zzm().m140032a(), aft0Var);
        this.f157214d = zzcfzVar;
        this.f157213c.addView(zzcfzVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f157214d.m13657h(i, i2, i3, i4);
        this.f157212b.mo13766u(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m176272e() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcfz zzcfzVar = this.f157214d;
        if (zzcfzVar != null) {
            zzcfzVar.m13666r();
            this.f157213c.removeView(this.f157214d);
            this.f157214d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m176273f() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcfz zzcfzVar = this.f157214d;
        if (zzcfzVar != null) {
            zzcfzVar.m13672x();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m176274g(int i) {
        zzcfz zzcfzVar = this.f157214d;
        if (zzcfzVar != null) {
            zzcfzVar.m13654e(i);
        }
    }
}

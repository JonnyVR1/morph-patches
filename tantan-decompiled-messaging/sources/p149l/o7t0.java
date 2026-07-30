package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o7t0 implements Releasable {

    /* JADX INFO: renamed from: a */
    public final Context f142541a;

    /* JADX INFO: renamed from: b */
    public final String f142542b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f142543c;

    public o7t0(v5t0 v5t0Var) {
        Context context = v5t0Var.getContext();
        this.f142541a = context;
        this.f142542b = vny0.m199080r().m12335E(context, v5t0Var.zzn().zza);
        this.f142543c = new WeakReference(v5t0Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m163062f(o7t0 o7t0Var, String str, Map map) {
        v5t0 v5t0Var = (v5t0) o7t0Var.f142543c.get();
        if (v5t0Var != null) {
            v5t0Var.mo13674Z("onPrecacheEvent", map);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo105821g();

    /* JADX INFO: renamed from: h */
    public final void m163063h(String str, @Nullable String str2, String str3, @Nullable String str4) {
        i2t0.f110583b.post(new n7t0(this, str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: j */
    public final void m163064j(String str, String str2, int i) {
        i2t0.f110583b.post(new l7t0(this, str, str2, i));
    }

    /* JADX INFO: renamed from: m */
    public final void m163065m(String str, String str2, long j) {
        i2t0.f110583b.post(new m7t0(this, str, str2, j));
    }

    /* JADX INFO: renamed from: o */
    public final void m163066o(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        i2t0.f110583b.post(new k7t0(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* JADX INFO: renamed from: p */
    public final void m163067p(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        i2t0.f110583b.post(new j7t0(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo105822u(String str);

    /* JADX INFO: renamed from: v */
    public boolean mo129902v(String str, String[] strArr) {
        return mo105822u(str);
    }

    /* JADX INFO: renamed from: w */
    public boolean mo129903w(String str, String[] strArr, g7t0 g7t0Var) {
        return mo105822u(str);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    /* JADX INFO: renamed from: q */
    public void mo129898q(int i) {
    }

    /* JADX INFO: renamed from: r */
    public void mo129899r(int i) {
    }

    /* JADX INFO: renamed from: s */
    public void mo129900s(int i) {
    }

    /* JADX INFO: renamed from: t */
    public void mo129901t(int i) {
    }
}

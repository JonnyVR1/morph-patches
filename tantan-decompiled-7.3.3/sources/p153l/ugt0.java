package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ugt0 implements Releasable {

    /* JADX INFO: renamed from: a */
    public final Context f178931a;

    /* JADX INFO: renamed from: b */
    public final String f178932b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f178933c;

    public ugt0(bft0 bft0Var) {
        Context context = bft0Var.getContext();
        this.f178931a = context;
        this.f178932b = bxy0.m106934r().m12389E(context, bft0Var.zzn().zza);
        this.f178933c = new WeakReference(bft0Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m195941f(ugt0 ugt0Var, String str, Map map) {
        bft0 bft0Var = (bft0) ugt0Var.f178933c.get();
        if (bft0Var != null) {
            bft0Var.mo13728Z("onPrecacheEvent", map);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo140035g();

    /* JADX INFO: renamed from: h */
    public final void m195942h(String str, @Nullable String str2, String str3, @Nullable String str4) {
        obt0.f146613b.post(new tgt0(this, str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: j */
    public final void m195943j(String str, String str2, int i) {
        obt0.f146613b.post(new rgt0(this, str, str2, i));
    }

    /* JADX INFO: renamed from: m */
    public final void m195944m(String str, String str2, long j) {
        obt0.f146613b.post(new sgt0(this, str, str2, j));
    }

    /* JADX INFO: renamed from: o */
    public final void m195945o(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        obt0.f146613b.post(new qgt0(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* JADX INFO: renamed from: p */
    public final void m195946p(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        obt0.f146613b.post(new pgt0(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo140036u(String str);

    /* JADX INFO: renamed from: v */
    public boolean mo163241v(String str, String[] strArr) {
        return mo140036u(str);
    }

    /* JADX INFO: renamed from: w */
    public boolean mo163242w(String str, String[] strArr, mgt0 mgt0Var) {
        return mo140036u(str);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    /* JADX INFO: renamed from: q */
    public void mo163237q(int i) {
    }

    /* JADX INFO: renamed from: r */
    public void mo163238r(int i) {
    }

    /* JADX INFO: renamed from: s */
    public void mo163239s(int i) {
    }

    /* JADX INFO: renamed from: t */
    public void mo163240t(int i) {
    }
}

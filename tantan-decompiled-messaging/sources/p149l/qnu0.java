package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class qnu0 {

    /* JADX INFO: renamed from: a */
    public final Map f155495a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rnu0 f155496b;

    @VisibleForTesting
    public qnu0(rnu0 rnu0Var) {
        this.f155496b = rnu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ qnu0 m175692a(qnu0 qnu0Var) {
        qnu0Var.f155495a.putAll(qnu0Var.f155496b.f160331c);
        return qnu0Var;
    }

    /* JADX INFO: renamed from: b */
    public final qnu0 m175693b(String str, String str2) {
        this.f155495a.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final qnu0 m175694c(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f155495a.put(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final qnu0 m175695d(kxv0 kxv0Var) {
        this.f155495a.put("aai", kxv0Var.f125227x);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132164a7)).booleanValue()) {
            m175694c("rid", kxv0Var.f125212o0);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final qnu0 m175696e(nxv0 nxv0Var) {
        this.f155495a.put("gqi", nxv0Var.f141055b);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final String m175697f() {
        return this.f155496b.f160329a.m219489b(this.f155495a);
    }

    /* JADX INFO: renamed from: g */
    public final void m175698g() {
        this.f155496b.f160330b.execute(new Runnable() { // from class: l.onu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144822a.m175700i();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m175699h() {
        this.f155496b.f160330b.execute(new Runnable() { // from class: l.pnu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f150415a.m175701j();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m175700i() {
        this.f155496b.f160329a.m219493f(this.f155495a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m175701j() {
        this.f155496b.f160329a.m219492e(this.f155495a);
    }
}

package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class wwu0 {

    /* JADX INFO: renamed from: a */
    public final Map f191331a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xwu0 f191332b;

    @VisibleForTesting
    public wwu0(xwu0 xwu0Var) {
        this.f191332b = xwu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ wwu0 m208306a(wwu0 wwu0Var) {
        wwu0Var.f191331a.putAll(wwu0Var.f191332b.f196560c);
        return wwu0Var;
    }

    /* JADX INFO: renamed from: b */
    public final wwu0 m208307b(String str, String str2) {
        this.f191331a.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final wwu0 m208308c(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f191331a.put(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final wwu0 m208309d(q6w0 q6w0Var) {
        this.f191331a.put("aai", q6w0Var.f155917x);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168235a7)).booleanValue()) {
            m208308c("rid", q6w0Var.f155902o0);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final wwu0 m208310e(t6w0 t6w0Var) {
        this.f191331a.put("gqi", t6w0Var.f172368b);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final String m208311f() {
        return this.f191332b.f196558a.m128024b(this.f191331a);
    }

    /* JADX INFO: renamed from: g */
    public final void m208312g() {
        this.f191332b.f196559b.execute(new Runnable() { // from class: l.uwu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181321a.m208314i();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m208313h() {
        this.f191332b.f196559b.execute(new Runnable() { // from class: l.vwu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186172a.m208315j();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m208314i() {
        this.f191332b.f196558a.m128028f(this.f191331a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m208315j() {
        this.f191332b.f196558a.m128027e(this.f191331a);
    }
}

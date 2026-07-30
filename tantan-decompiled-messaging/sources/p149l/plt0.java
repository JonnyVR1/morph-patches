package p149l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class plt0 {

    /* JADX INFO: renamed from: a */
    public final String f150172a;

    /* JADX INFO: renamed from: b */
    public final zms0 f150173b;

    /* JADX INFO: renamed from: c */
    public final Executor f150174c;

    /* JADX INFO: renamed from: d */
    public bmt0 f150175d;

    /* JADX INFO: renamed from: e */
    public final vgs0 f150176e = new mlt0(this);

    /* JADX INFO: renamed from: f */
    public final vgs0 f150177f = new olt0(this);

    public plt0(String str, zms0 zms0Var, Executor executor) {
        this.f150172a = str;
        this.f150173b = zms0Var;
        this.f150174c = executor;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m170286g(plt0 plt0Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(plt0Var.f150172a);
    }

    /* JADX INFO: renamed from: c */
    public final void m170287c(bmt0 bmt0Var) {
        this.f150173b.m219370b("/updateActiveView", this.f150176e);
        this.f150173b.m219370b("/untrackActiveViewUnit", this.f150177f);
        this.f150175d = bmt0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m170288d(q9t0 q9t0Var) {
        q9t0Var.mo13693j0("/updateActiveView", this.f150176e);
        q9t0Var.mo13693j0("/untrackActiveViewUnit", this.f150177f);
    }

    /* JADX INFO: renamed from: e */
    public final void m170289e() {
        this.f150173b.m219371c("/updateActiveView", this.f150176e);
        this.f150173b.m219371c("/untrackActiveViewUnit", this.f150177f);
    }

    /* JADX INFO: renamed from: f */
    public final void m170290f(q9t0 q9t0Var) {
        q9t0Var.mo13665Q("/updateActiveView", this.f150176e);
        q9t0Var.mo13665Q("/untrackActiveViewUnit", this.f150177f);
    }
}

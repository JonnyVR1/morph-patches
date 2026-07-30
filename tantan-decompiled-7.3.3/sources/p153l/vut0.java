package p153l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class vut0 {

    /* JADX INFO: renamed from: a */
    public final String f185849a;

    /* JADX INFO: renamed from: b */
    public final fws0 f185850b;

    /* JADX INFO: renamed from: c */
    public final Executor f185851c;

    /* JADX INFO: renamed from: d */
    public hvt0 f185852d;

    /* JADX INFO: renamed from: e */
    public final bqs0 f185853e = new sut0(this);

    /* JADX INFO: renamed from: f */
    public final bqs0 f185854f = new uut0(this);

    public vut0(String str, fws0 fws0Var, Executor executor) {
        this.f185849a = str;
        this.f185850b = fws0Var;
        this.f185851c = executor;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m202892g(vut0 vut0Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(vut0Var.f185849a);
    }

    /* JADX INFO: renamed from: c */
    public final void m202893c(hvt0 hvt0Var) {
        this.f185850b.m127845b("/updateActiveView", this.f185853e);
        this.f185850b.m127845b("/untrackActiveViewUnit", this.f185854f);
        this.f185852d = hvt0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m202894d(wit0 wit0Var) {
        wit0Var.mo13747j0("/updateActiveView", this.f185853e);
        wit0Var.mo13747j0("/untrackActiveViewUnit", this.f185854f);
    }

    /* JADX INFO: renamed from: e */
    public final void m202895e() {
        this.f185850b.m127846c("/updateActiveView", this.f185853e);
        this.f185850b.m127846c("/untrackActiveViewUnit", this.f185854f);
    }

    /* JADX INFO: renamed from: f */
    public final void m202896f(wit0 wit0Var) {
        wit0Var.mo13719Q("/updateActiveView", this.f185853e);
        wit0Var.mo13719Q("/untrackActiveViewUnit", this.f185854f);
    }
}

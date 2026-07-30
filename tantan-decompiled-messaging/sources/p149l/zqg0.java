package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zqg0 implements ung0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t6g0 f204382a;

    public zqg0(t6g0 t6g0Var) {
        this.f204382a = t6g0Var;
    }

    @Override // p149l.ung0
    /* JADX INFO: renamed from: a */
    public final void mo136200a(String str) {
        ArrayList arrayList = this.f204382a.f168615b.f180524z;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.f204382a.f168615b.notifyStateChange("a2ms-ai-sse", str, null);
    }

    @Override // p149l.ung0
    public final void onCompleted() {
        ArrayList arrayList = this.f204382a.f168615b.f180524z;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(this);
    }

    @Override // p149l.ung0
    public final void onSseLine(String str) {
        this.f204382a.f168615b.notifyStateChange("a2ms-ai-sse", str, null);
    }
}

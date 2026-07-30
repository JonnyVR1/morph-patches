package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fog0 implements ilg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t6g0 f98557a;

    public fog0(t6g0 t6g0Var) {
        this.f98557a = t6g0Var;
    }

    @Override // p149l.ilg0
    public final void onCompleted(String str) {
        ArrayList arrayList = this.f98557a.f168615b.f180524z;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.f98557a.f168615b.notifyStateChange("a2ms-ai-common", str, null);
    }
}

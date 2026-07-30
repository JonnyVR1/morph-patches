package p153l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nwg0 implements qtg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bfg0 f143958a;

    public nwg0(bfg0 bfg0Var) {
        this.f143958a = bfg0Var;
    }

    @Override // p153l.qtg0
    public final void onCompleted(String str) {
        ArrayList arrayList = this.f143958a.f76491b.f88526z;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.f143958a.f76491b.notifyStateChange("a2ms-ai-common", str, null);
    }
}

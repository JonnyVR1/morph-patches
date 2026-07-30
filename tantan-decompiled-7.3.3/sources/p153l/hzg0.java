package p153l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hzg0 implements cwg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bfg0 f112243a;

    public hzg0(bfg0 bfg0Var) {
        this.f112243a = bfg0Var;
    }

    @Override // p153l.cwg0
    /* JADX INFO: renamed from: a */
    public final void mo112901a(String str) {
        ArrayList arrayList = this.f112243a.f76491b.f88526z;
        if (arrayList != null) {
            arrayList.remove(this);
        }
        this.f112243a.f76491b.notifyStateChange("a2ms-ai-sse", str, null);
    }

    @Override // p153l.cwg0
    public final void onCompleted() {
        ArrayList arrayList = this.f112243a.f76491b.f88526z;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(this);
    }

    @Override // p153l.cwg0
    public final void onSseLine(String str) {
        this.f112243a.f76491b.notifyStateChange("a2ms-ai-sse", str, null);
    }
}

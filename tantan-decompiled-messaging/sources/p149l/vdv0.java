package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class vdv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f181130a;

    public vdv0(boolean z) {
        this.f181130a = z;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f181130a ? "0" : "1");
    }
}

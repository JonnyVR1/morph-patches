package p149l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class bfv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f75370a;

    @VisibleForTesting
    public bfv0(Bundle bundle) {
        this.f75370a = bundle;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f75370a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.f75370a);
    }
}

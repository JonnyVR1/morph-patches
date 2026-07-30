package p153l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class hov0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f110963a;

    @VisibleForTesting
    public hov0(Bundle bundle) {
        this.f110963a = bundle;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f110963a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.f110963a);
    }
}

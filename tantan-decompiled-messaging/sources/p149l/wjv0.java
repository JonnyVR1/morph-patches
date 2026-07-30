package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wjv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Bundle f186686a;

    public wjv0(@Nullable Bundle bundle) {
        this.f186686a = bundle;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f186686a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}

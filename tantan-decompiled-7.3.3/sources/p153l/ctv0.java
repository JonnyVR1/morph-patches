package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ctv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Bundle f83765a;

    public ctv0(@Nullable Bundle bundle) {
        this.f83765a = bundle;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f83765a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}

package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class nnv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f142893a;

    public nnv0(@Nullable String str) {
        this.f142893a = str;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        String str = this.f142893a;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}

package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class hev0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f107412a;

    public hev0(@Nullable String str) {
        this.f107412a = str;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        String str = this.f107412a;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}

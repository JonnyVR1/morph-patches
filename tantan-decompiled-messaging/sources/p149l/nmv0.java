package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class nmv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final String f139668a;

    /* JADX INFO: renamed from: b */
    public final int f139669b;

    public /* synthetic */ nmv0(String str, int i, mmv0 mmv0Var) {
        this.f139668a = str;
        this.f139669b = i;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132094U9)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f139668a)) {
                bundle.putString("topics", this.f139668a);
            }
            int i = this.f139669b;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}

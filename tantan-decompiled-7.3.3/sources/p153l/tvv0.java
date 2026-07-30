package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class tvv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final String f176305a;

    /* JADX INFO: renamed from: b */
    public final int f176306b;

    public /* synthetic */ tvv0(String str, int i, svv0 svv0Var) {
        this.f176305a = str;
        this.f176306b = i;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168165U9)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f176305a)) {
                bundle.putString("topics", this.f176305a);
            }
            int i = this.f176306b;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}

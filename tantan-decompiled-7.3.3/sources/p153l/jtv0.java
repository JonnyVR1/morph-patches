package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class jtv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f122627a;

    /* JADX INFO: renamed from: b */
    public final String f122628b;

    public jtv0(String str, String str2) {
        this.f122627a = str;
        this.f122628b = str2;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168186W6)).booleanValue()) {
            bundle.putString("request_id", this.f122628b);
        } else {
            bundle.putString("request_id", this.f122627a);
        }
    }
}

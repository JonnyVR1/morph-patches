package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class tqv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final String f175782a;

    /* JADX INFO: renamed from: b */
    public final String f175783b;

    /* JADX INFO: renamed from: c */
    public final Bundle f175784c;

    public /* synthetic */ tqv0(String str, String str2, Bundle bundle, sqv0 sqv0Var) {
        this.f175782a = str;
        this.f175783b = str2;
        this.f175784c = bundle;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f175782a);
        bundle.putString("fc_consent", this.f175783b);
        bundle.putBundle("iab_consent_info", this.f175784c);
    }
}

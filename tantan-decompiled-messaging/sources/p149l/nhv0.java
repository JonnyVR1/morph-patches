package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class nhv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final String f139039a;

    /* JADX INFO: renamed from: b */
    public final String f139040b;

    /* JADX INFO: renamed from: c */
    public final Bundle f139041c;

    public /* synthetic */ nhv0(String str, String str2, Bundle bundle, mhv0 mhv0Var) {
        this.f139039a = str;
        this.f139040b = str2;
        this.f139041c = bundle;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f139039a);
        bundle.putString("fc_consent", this.f139040b);
        bundle.putBundle("iab_consent_info", this.f139041c);
    }
}

package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class ndw0 extends ncw0 {

    /* JADX INFO: renamed from: a */
    public final tdw0 f138560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ odw0 f138561b;

    public ndw0(odw0 odw0Var, tdw0 tdw0Var) {
        this.f138561b = odw0Var;
        this.f138560a = tdw0Var;
    }

    @Override // p149l.ocw0
    /* JADX INFO: renamed from: M3 */
    public final void mo159089M3(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        rdw0 rdw0VarM183572c = sdw0.m183572c();
        rdw0VarM183572c.mo179017b(i);
        if (string != null) {
            rdw0VarM183572c.mo179016a(string);
        }
        this.f138560a.mo180747a(rdw0VarM183572c.mo179018c());
        if (i == 8157) {
            this.f138561b.m163729c();
        }
    }
}

package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class tmw0 extends tlw0 {

    /* JADX INFO: renamed from: a */
    public final zmw0 f175199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ umw0 f175200b;

    public tmw0(umw0 umw0Var, zmw0 zmw0Var) {
        this.f175200b = umw0Var;
        this.f175199a = zmw0Var;
    }

    @Override // p153l.ulw0
    /* JADX INFO: renamed from: M3 */
    public final void mo191860M3(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        xmw0 xmw0VarM216740c = ymw0.m216740c();
        xmw0VarM216740c.mo105274b(i);
        if (string != null) {
            xmw0VarM216740c.mo105273a(string);
        }
        this.f175199a.mo209122a(xmw0VarM216740c.mo105275c());
        if (i == 8157) {
            this.f175200b.m196810c();
        }
    }
}

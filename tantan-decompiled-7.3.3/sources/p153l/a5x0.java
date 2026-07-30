package p153l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class a5x0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f68650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68651c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f68652d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f68653e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ d6x0 f68654f;

    public a5x0(d6x0 d6x0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f68649a = i;
        this.f68650b = str;
        this.f68651c = obj;
        this.f68652d = obj2;
        this.f68653e = obj3;
        this.f68654f = d6x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajx0 ajx0VarM100280A = this.f68654f.f202159a.m100280A();
        boolean zM160933m = ajx0VarM100280A.m160933m();
        d6x0 d6x0Var = this.f68654f;
        if (!zM160933m) {
            d6x0Var.m114567s(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (d6x0Var.f85416c == 0) {
            boolean zM98434S = this.f68654f.mo15139a().m98434S();
            d6x0 d6x0Var2 = this.f68654f;
            if (zM98434S) {
                d6x0Var2.f85416c = 'C';
            } else {
                d6x0Var2.f85416c = Constants.INAPP_POSITION_CENTER;
            }
        }
        if (this.f68654f.f85417d < 0) {
            this.f68654f.f85417d = 106000L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.f68649a) + this.f68654f.f85416c + this.f68654f.f85417d + ":" + d6x0.m114553r(true, this.f68650b, this.f68651c, this.f68652d, this.f68653e);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f68650b.substring(0, 1024);
        }
        ymx0 ymx0Var = ajx0VarM100280A.f71899f;
        if (ymx0Var != null) {
            ymx0Var.m216742b(strSubstring, 1L);
        }
    }
}

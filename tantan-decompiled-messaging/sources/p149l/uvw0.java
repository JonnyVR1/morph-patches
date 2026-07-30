package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class uvw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f178568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f178569c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f178570d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f178571e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xww0 f178572f;

    public uvw0(xww0 xww0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f178567a = i;
        this.f178568b = str;
        this.f178569c = obj;
        this.f178570d = obj2;
        this.f178571e = obj3;
        this.f178572f = xww0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u9x0 u9x0VarM194100A = this.f178572f.f165891a.m194100A();
        boolean zM127635m = u9x0VarM194100A.m127635m();
        xww0 xww0Var = this.f178572f;
        if (!zM127635m) {
            xww0Var.m211421s(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (xww0Var.f194774c == 0) {
            boolean zM192642S = this.f178572f.mo15085a().m192642S();
            xww0 xww0Var2 = this.f178572f;
            if (zM192642S) {
                xww0Var2.f194774c = 'C';
            } else {
                xww0Var2.f194774c = Constants.INAPP_POSITION_CENTER;
            }
        }
        if (this.f178572f.f194775d < 0) {
            this.f178572f.f194775d = 106000L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.f178567a) + this.f178572f.f194774c + this.f178572f.f194775d + ":" + xww0.m211407r(true, this.f178568b, this.f178569c, this.f178570d, this.f178571e);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f178568b.substring(0, 1024);
        }
        sdx0 sdx0Var = u9x0VarM194100A.f175518f;
        if (sdx0Var != null) {
            sdx0Var.m183581b(strSubstring, 1L);
        }
    }
}

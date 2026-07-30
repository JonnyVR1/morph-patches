package p149l;

import java.util.Locale;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p137a.InterfaceC22401b;

/* JADX INFO: loaded from: classes.dex */
public final class y5g0 implements InterfaceC22401b {

    /* JADX INFO: renamed from: a */
    public final oag0 f196436a;

    public y5g0(oag0 oag0Var) {
        this.f196436a = oag0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22401b
    /* JADX INFO: renamed from: a */
    public final void mo212985a(int i, int i2, String str, String str2, String str3) {
        ((log0) this.f196436a).getClass();
        Locale locale = Locale.US;
        String str4 = i + ":" + str2 + ":" + str3;
        LogUtils.file(i2, str, str4);
        if (!erg0.f92916m) {
            if (i2 == 6) {
                SudLogger.m221567e(str, str4);
            }
        } else {
            if (i2 == 4) {
                SudLogger.m221569i(str, str4);
                return;
            }
            if (i2 == 5) {
                SudLogger.m221573w(str, str4);
            } else if (i2 != 6) {
                SudLogger.m221573w(str, str4);
            } else {
                SudLogger.m221567e(str, str4);
            }
        }
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22401b
    /* JADX INFO: renamed from: a */
    public final void mo212986a(int i, String str, String str2) {
        ((log0) this.f196436a).getClass();
        LogUtils.file(i, str, str2);
        if (!erg0.f92916m) {
            if (i == 6) {
                SudLogger.m221567e(str, str2);
            }
        } else {
            if (i == 4) {
                SudLogger.m221569i(str, str2);
                return;
            }
            if (i == 5) {
                SudLogger.m221573w(str, str2);
            } else if (i != 6) {
                SudLogger.m221573w(str, str2);
            } else {
                SudLogger.m221567e(str, str2);
            }
        }
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22401b
    /* JADX INFO: renamed from: a */
    public final void mo212987a(int i, String str, String str2, Throwable th) {
        ((log0) this.f196436a).getClass();
        Locale locale = Locale.US;
        String str3 = str2 + ":" + LogUtils.getErrorInfo(th);
        LogUtils.file(i, str, str3);
        if (!erg0.f92916m) {
            if (i == 6) {
                SudLogger.m221567e(str, str3);
            }
        } else {
            if (i == 4) {
                SudLogger.m221569i(str, str3);
                return;
            }
            if (i == 5) {
                SudLogger.m221573w(str, str3);
            } else if (i != 6) {
                SudLogger.m221573w(str, str3);
            } else {
                SudLogger.m221567e(str, str3);
            }
        }
    }
}

package p153l;

import java.util.Locale;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p141a.InterfaceC22516b;

/* JADX INFO: loaded from: classes.dex */
public final class geg0 implements InterfaceC22516b {

    /* JADX INFO: renamed from: a */
    public final wig0 f103834a;

    public geg0(wig0 wig0Var) {
        this.f103834a = wig0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22516b
    /* JADX INFO: renamed from: a */
    public final void mo130009a(int i, int i2, String str, String str2, String str3) {
        ((twg0) this.f103834a).getClass();
        Locale locale = Locale.US;
        String str4 = i + ":" + str2 + ":" + str3;
        LogUtils.file(i2, str, str4);
        if (!mzg0.f139508m) {
            if (i2 == 6) {
                SudLogger.m222813e(str, str4);
            }
        } else {
            if (i2 == 4) {
                SudLogger.m222815i(str, str4);
                return;
            }
            if (i2 == 5) {
                SudLogger.m222819w(str, str4);
            } else if (i2 != 6) {
                SudLogger.m222819w(str, str4);
            } else {
                SudLogger.m222813e(str, str4);
            }
        }
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22516b
    /* JADX INFO: renamed from: a */
    public final void mo130010a(int i, String str, String str2) {
        ((twg0) this.f103834a).getClass();
        LogUtils.file(i, str, str2);
        if (!mzg0.f139508m) {
            if (i == 6) {
                SudLogger.m222813e(str, str2);
            }
        } else {
            if (i == 4) {
                SudLogger.m222815i(str, str2);
                return;
            }
            if (i == 5) {
                SudLogger.m222819w(str, str2);
            } else if (i != 6) {
                SudLogger.m222819w(str, str2);
            } else {
                SudLogger.m222813e(str, str2);
            }
        }
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22516b
    /* JADX INFO: renamed from: a */
    public final void mo130011a(int i, String str, String str2, Throwable th) {
        ((twg0) this.f103834a).getClass();
        Locale locale = Locale.US;
        String str3 = str2 + ":" + LogUtils.getErrorInfo(th);
        LogUtils.file(i, str, str3);
        if (!mzg0.f139508m) {
            if (i == 6) {
                SudLogger.m222813e(str, str3);
            }
        } else {
            if (i == 4) {
                SudLogger.m222815i(str, str3);
                return;
            }
            if (i == 5) {
                SudLogger.m222819w(str, str3);
            } else if (i != 6) {
                SudLogger.m222819w(str, str3);
            } else {
                SudLogger.m222813e(str, str3);
            }
        }
    }
}

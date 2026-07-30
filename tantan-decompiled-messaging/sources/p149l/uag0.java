package p149l;

import android.util.Log;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudLogger;

/* JADX INFO: loaded from: classes.dex */
public final class uag0 implements ISudLogger {

    /* JADX INFO: renamed from: a */
    public int f175602a = 4;

    @Override // tech.sud.gip.core.ISudLogger
    public final void log(int i, String str, String str2) {
        ThreadUtils.checkUIThread();
        if (2 != i || this.f175602a > 2) {
            if (3 != i || this.f175602a > 3) {
                if (4 != i || this.f175602a > 4) {
                    if (5 != i || this.f175602a > 5) {
                        if (6 == i && this.f175602a <= 6) {
                            Log.e(str, str2);
                        } else {
                            if (7 != i || this.f175602a > 7) {
                                return;
                            }
                            Log.e(str, str2);
                        }
                    }
                }
            }
        }
    }

    @Override // tech.sud.gip.core.ISudLogger
    public final void setLogLevel(int i) {
        this.f175602a = i;
    }

    @Override // tech.sud.gip.core.ISudLogger
    public final void log(int i, String str, String str2, Throwable th) {
        if (2 != i || this.f175602a > 2) {
            if (3 != i || this.f175602a > 3) {
                if (4 != i || this.f175602a > 4) {
                    if (5 != i || this.f175602a > 5) {
                        if (6 == i && this.f175602a <= 6) {
                            Log.e(str, str2, th);
                        } else {
                            if (7 != i || this.f175602a > 7) {
                                return;
                            }
                            Log.e(str, str2, th);
                        }
                    }
                }
            }
        }
    }
}

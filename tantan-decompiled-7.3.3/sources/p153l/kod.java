package p153l;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class kod implements vsl {
    @Override // p153l.vsl
    public boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("momoenc", th);
            return true;
        }
    }
}

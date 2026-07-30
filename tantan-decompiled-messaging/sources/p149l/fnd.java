package p149l;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class fnd implements jql {
    @Override // p149l.jql
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

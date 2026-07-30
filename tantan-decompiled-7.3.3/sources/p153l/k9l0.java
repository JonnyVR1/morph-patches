package p153l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class k9l0 extends wr4 {
    public k9l0() {
        this("VerifyMD5Handler");
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) {
        ire0 ire0VarM98369d = ajeVar.m98369d();
        File fileM219731d = zie.m219731d(ajeVar);
        try {
            boolean zEqualsIgnoreCase = ire0VarM98369d.m141814d().equalsIgnoreCase(miw.m158556e(fileM219731d));
            if (zEqualsIgnoreCase) {
                return zEqualsIgnoreCase;
            }
            m207549h(8, "md5 do not matched, local md5: " + miw.m158556e(fileM219731d) + "  file length: " + fileM219731d.length());
            return zEqualsIgnoreCase;
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            m207550i(8, e);
            return false;
        }
    }

    public k9l0(String str) {
        super(str);
    }
}

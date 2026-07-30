package p149l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class f0l0 extends xq4 {
    public f0l0() {
        this("VerifyMD5Handler");
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) {
        dje0 dje0VarM203128d = wheVar.m203128d();
        File fileM198445d = vhe.m198445d(wheVar);
        try {
            boolean zEqualsIgnoreCase = dje0VarM203128d.m112029d().equalsIgnoreCase(ngw.m159358e(fileM198445d));
            if (zEqualsIgnoreCase) {
                return zEqualsIgnoreCase;
            }
            m210550h(8, "md5 do not matched, local md5: " + ngw.m159358e(fileM198445d) + "  file length: " + fileM198445d.length());
            return zEqualsIgnoreCase;
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
            m210551i(8, e);
            return false;
        }
    }

    public f0l0(String str) {
        super(str);
    }
}

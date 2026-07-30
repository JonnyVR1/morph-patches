package p149l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class zqc0 extends xq4 {
    public zqc0() {
        this("RenameFileHandler");
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) {
        File fileM198454m = yhe.m214810m(wheVar.m203128d()) ? vhe.m198454m(wheVar) : vhe.m198445d(wheVar);
        File fileM198451j = vhe.m198451j(wheVar);
        synchronized (r600.f157883d) {
            try {
                if (!vhe.m198442a(fileM198451j)) {
                    m210550h(6, "删除稳定文件失败");
                    return false;
                }
                if (fileM198454m.renameTo(fileM198451j)) {
                    MLog.m19459d("SDKResource", "%s: 完成资源下载", wheVar.m203126b());
                    return true;
                }
                m210550h(6, "保存稳定文件失败");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zqc0(String str) {
        super(str);
    }
}

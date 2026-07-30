package p153l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class ezc0 extends wr4 {
    public ezc0() {
        this("RenameFileHandler");
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) {
        File fileM219740m = cje.m110125m(ajeVar.m98369d()) ? zie.m219740m(ajeVar) : zie.m219731d(ajeVar);
        File fileM219737j = zie.m219737j(ajeVar);
        synchronized (af00.f70838d) {
            try {
                if (!zie.m219728a(fileM219737j)) {
                    m207549h(6, "删除稳定文件失败");
                    return false;
                }
                if (fileM219740m.renameTo(fileM219737j)) {
                    MLog.m20458d("SDKResource", "%s: 完成资源下载", ajeVar.m98367b());
                    return true;
                }
                m207549h(6, "保存稳定文件失败");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ezc0(String str) {
        super(str);
    }
}

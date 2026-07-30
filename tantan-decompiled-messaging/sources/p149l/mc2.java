package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class mc2 extends xq4 {
    public mc2() {
        super("BackupZipHandler");
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) {
        File fileM198445d = vhe.m198445d(wheVar);
        File fileM198444c = vhe.m198444c(wheVar);
        if (!vhe.m198442a(fileM198444c)) {
            m210550h(11, "删除已经存在的备份文件失败");
            return false;
        }
        if (fileM198445d.renameTo(fileM198444c)) {
            return true;
        }
        m210550h(11, "移动到备份文件失败");
        return false;
    }
}

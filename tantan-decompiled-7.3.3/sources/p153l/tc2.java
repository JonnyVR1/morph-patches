package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class tc2 extends wr4 {
    public tc2() {
        super("BackupZipHandler");
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) {
        File fileM219731d = zie.m219731d(ajeVar);
        File fileM219730c = zie.m219730c(ajeVar);
        if (!zie.m219728a(fileM219730c)) {
            m207549h(11, "删除已经存在的备份文件失败");
            return false;
        }
        if (fileM219731d.renameTo(fileM219730c)) {
            return true;
        }
        m207549h(11, "移动到备份文件失败");
        return false;
    }
}

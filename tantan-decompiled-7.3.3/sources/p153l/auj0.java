package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class auj0 extends wr4 {
    public auj0() {
        super("UnZipHandler");
        m207551j(3);
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) {
        File fileM219739l = zie.m219739l();
        File fileM219740m = zie.m219740m(ajeVar);
        if (!zie.m219728a(fileM219740m)) {
            m207549h(9, "删除已经存在的解压文件失败");
            return false;
        }
        if (mki.m158788b(zie.m219731d(ajeVar).getAbsolutePath(), fileM219739l.getAbsolutePath()) && fileM219740m.exists()) {
            return true;
        }
        m207549h(9, "unzip failed");
        return false;
    }
}

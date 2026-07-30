package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class xkj0 extends xq4 {
    public xkj0() {
        super("UnZipHandler");
        m210552j(3);
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) {
        File fileM198453l = vhe.m198453l();
        File fileM198454m = vhe.m198454m(wheVar);
        if (!vhe.m198442a(fileM198454m)) {
            m210550h(9, "删除已经存在的解压文件失败");
            return false;
        }
        if (phi.m168970b(vhe.m198445d(wheVar).getAbsolutePath(), fileM198453l.getAbsolutePath()) && fileM198454m.exists()) {
            return true;
        }
        m210550h(9, "unzip failed");
        return false;
    }
}

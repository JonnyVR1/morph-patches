package p149l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class lc2 extends xq4 {
    public lc2() {
        super("BackupToSDCardHandler");
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) throws Throwable {
        File fileM198450i = vhe.m198450i(wheVar);
        MLog.m19459d("SDKResource", "删除sd卡文件：" + vhe.m198442a(fileM198450i), new Object[0]);
        try {
            phi.m168969a(yhe.m214810m(wheVar.m203128d()) ? vhe.m198444c(wheVar) : vhe.m198451j(wheVar), fileM198450i);
            MLog.m19459d("SDKResource", "备份到sd卡成功", new Object[0]);
            return true;
        } catch (IOException e) {
            m210551i(11, e);
            MLog.m19459d("SDKResource", "备份资源到SD卡失败", new Object[0]);
            return true;
        }
    }
}

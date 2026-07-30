package p153l;

import com.immomo.resdownloader.log.MLog;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class sc2 extends wr4 {
    public sc2() {
        super("BackupToSDCardHandler");
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) throws Throwable {
        File fileM219736i = zie.m219736i(ajeVar);
        MLog.m20458d("SDKResource", "删除sd卡文件：" + zie.m219728a(fileM219736i), new Object[0]);
        try {
            mki.m158787a(cje.m110125m(ajeVar.m98369d()) ? zie.m219730c(ajeVar) : zie.m219737j(ajeVar), fileM219736i);
            MLog.m20458d("SDKResource", "备份到sd卡成功", new Object[0]);
            return true;
        } catch (IOException e) {
            m207550i(11, e);
            MLog.m20458d("SDKResource", "备份资源到SD卡失败", new Object[0]);
            return true;
        }
    }
}

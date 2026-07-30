package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class qxv implements oxv {
    @Override // p149l.oxv
    /* JADX INFO: renamed from: a */
    public void mo166599a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(fkh0.m121855a());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        g5j0.m124527a(sb.toString(), fkh0.m121857c() + str2 + str);
    }

    @Override // p149l.oxv
    public void write(String str, String str2) throws Throwable {
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return;
        }
        g5j0.m124529c(str2.concat("\r\n"), fkh0.m121855a() + File.separator + str);
    }
}

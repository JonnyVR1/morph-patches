package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class nzv implements lzv {
    @Override // p153l.lzv
    /* JADX INFO: renamed from: a */
    public void mo156499a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(msh0.m159786a());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        kej0.m149335a(sb.toString(), msh0.m159788c() + str2 + str);
    }

    @Override // p153l.lzv
    public void write(String str, String str2) throws Throwable {
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return;
        }
        kej0.m149337c(str2.concat("\r\n"), msh0.m159786a() + File.separator + str);
    }
}

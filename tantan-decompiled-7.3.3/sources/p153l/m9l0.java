package p153l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;

/* JADX INFO: loaded from: classes7.dex */
public class m9l0 extends wr4 {
    public m9l0() {
        this("VerifySignHandler");
    }

    @Override // p153l.wr4
    /* JADX INFO: renamed from: e */
    public boolean mo100400e(aje ajeVar) throws Throwable {
        String strM141816f;
        ire0 ire0VarM98369d = ajeVar.m98369d();
        String strM106332e = btd0.m106332e(zie.m219731d(ajeVar));
        if (TextUtils.isEmpty(strM106332e)) {
            m207549h(10, "文件SHA1值为空，可能文件下载失败");
        } else {
            try {
                strM141816f = ire0VarM98369d.m141816f();
                try {
                    boolean zM191325a = tic0.m191325a(strM106332e, strM141816f, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDVl7RSe3IiaSjhyCQzxZLbsBv4OAogEQMYz/FR28eFkNStxFCWn4H063ava2518kuTqh+KCqTwB+5ZAGhnwjUGiM1kgLsMFHwczyxeqYLUYQ1/nZMYuRax5NHUOcryueKu4Q00oHpDca5LPFZUFrL0KVPsgygrMs2S3K3a9nvZQwIDAQAB", "UTF-8");
                    u4d0.m194475a("Event_Resource_Verify", 1, null);
                    if (zM191325a) {
                        return zM191325a;
                    }
                    m207549h(10, "verify sign error");
                    return zM191325a;
                } catch (Exception e) {
                    e = e;
                    MLog.printErrStackTrace("SDKResource", e);
                    u4d0.m194475a("Event_Resource_Verify", 0, null);
                    m207550i(10, e);
                    m207549h(10, String.format("local: %s, server: %s", strM106332e, strM141816f));
                    return false;
                }
            } catch (Exception e2) {
                e = e2;
                strM141816f = null;
            }
        }
        return false;
    }

    public m9l0(String str) {
        super(str);
    }
}

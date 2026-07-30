package p149l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;

/* JADX INFO: loaded from: classes7.dex */
public class h0l0 extends xq4 {
    public h0l0() {
        this("VerifySignHandler");
    }

    @Override // p149l.xq4
    /* JADX INFO: renamed from: e */
    public boolean mo98595e(whe wheVar) throws Throwable {
        String strM112031f;
        dje0 dje0VarM203128d = wheVar.m203128d();
        String strM215125e = ykd0.m215125e(vhe.m198445d(wheVar));
        if (TextUtils.isEmpty(strM215125e)) {
            m210550h(10, "文件SHA1值为空，可能文件下载失败");
        } else {
            try {
                strM112031f = dje0VarM203128d.m112031f();
                try {
                    boolean zM158592a = nac0.m158592a(strM215125e, strM112031f, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDVl7RSe3IiaSjhyCQzxZLbsBv4OAogEQMYz/FR28eFkNStxFCWn4H063ava2518kuTqh+KCqTwB+5ZAGhnwjUGiM1kgLsMFHwczyxeqYLUYQ1/nZMYuRax5NHUOcryueKu4Q00oHpDca5LPFZUFrL0KVPsgygrMs2S3K3a9nvZQwIDAQAB", "UTF-8");
                    rwc0.m181387a("Event_Resource_Verify", 1, null);
                    if (zM158592a) {
                        return zM158592a;
                    }
                    m210550h(10, "verify sign error");
                    return zM158592a;
                } catch (Exception e) {
                    e = e;
                    MLog.printErrStackTrace("SDKResource", e);
                    rwc0.m181387a("Event_Resource_Verify", 0, null);
                    m210551i(10, e);
                    m210550h(10, String.format("local: %s, server: %s", strM215125e, strM112031f));
                    return false;
                }
            } catch (Exception e2) {
                e = e2;
                strM112031f = null;
            }
        }
        return false;
    }

    public h0l0(String str) {
        super(str);
    }
}

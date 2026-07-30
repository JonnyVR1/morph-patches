package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p041mm.mmfile.IMMFileUploader;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class f5e implements IMMFileUploader {

    /* JADX INFO: renamed from: c */
    private static final k850 f95173c;

    /* JADX INFO: renamed from: a */
    private String f95174a;

    /* JADX INFO: renamed from: b */
    private String f95175b;

    static {
        k850.C17954b c17954bM144889j = new k850.C17954b().m144889j(k0c.m144028a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f95173c = c17954bM144889j.m144903x(15L, timeUnit).m144899t(5L, timeUnit).m144882c();
    }

    public f5e(String str, String str2) {
        this.f95175b = str2;
        this.f95174a = str;
    }

    /* JADX INFO: renamed from: a */
    private boolean m119486a(File file) throws Exception {
        if (!TextUtils.isEmpty(this.f95174a) && !TextUtils.isEmpty(this.f95175b)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.DEVICE_ID_TAG, this.f95174a);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f95175b);
            jSONObject.put("timestamp", System.currentTimeMillis());
            String strM198558g = vie.m198558g(16);
            String strM135655b = ie2.m135655b(vie.m198554a(strM198558g.getBytes()));
            String strM198560c = vie.m198555d().m198560c(jSONObject.toString(), strM198558g);
            cm10.C16191a c16191a = new cm10.C16191a("---------------------------7da2137580612");
            c16191a.m107600f(cm10.f81492j);
            exc0 exc0VarExecute = f95173c.mo144849a(new stc0.C20027a().m185898q("https://cosmos-api.immomo.com/v2/log/client/upload").m185893l(c16191a.m107595a("msc", strM135655b).m107595a("mzip", strM198560c).m107596b("logFile", file.getName(), utc0.create(hyx.m133628d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file)).m107599e()).m185883b()).execute();
            if (exc0VarExecute.m118597I() && new JSONObject(new String(exc0VarExecute.m118606k().bytes(), "UTF-8")).optInt("ec", -1) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p041mm.mmfile.IMMFileUploader
    public boolean upload(File file) {
        try {
            return m119486a(file);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

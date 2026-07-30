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
public class xod implements IMMFileUploader {

    /* JADX INFO: renamed from: c */
    private static final k850 f193824c;

    /* JADX INFO: renamed from: a */
    private String f193825a;

    /* JADX INFO: renamed from: b */
    private String f193826b;

    static {
        k850.C17954b c17954b = new k850.C17954b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f193824c = c17954b.m144903x(15L, timeUnit).m144899t(5L, timeUnit).m144882c();
    }

    public xod(String str, String str2) {
        this.f193826b = str2;
        this.f193825a = str;
    }

    /* JADX INFO: renamed from: a */
    private boolean m210403a(File file) throws Exception {
        if (!TextUtils.isEmpty(this.f193825a) && !TextUtils.isEmpty(this.f193826b)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.DEVICE_ID_TAG, this.f193825a);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f193826b);
            jSONObject.put("timestamp", System.currentTimeMillis());
            String strM169753a = piq0.m169753a(16);
            String strM164546b = oiq0.m164546b(piq0.m169756e(strM169753a.getBytes()));
            String strM169757b = piq0.m169755d().m169757b(jSONObject.toString(), strM169753a);
            cm10.C16191a c16191a = new cm10.C16191a("---------------------------7da2137580612");
            c16191a.m107600f(cm10.f81492j);
            exc0 exc0VarExecute = f193824c.mo144849a(new stc0.C20027a().m185898q("https://cosmos-api.immomo.com/v2/log/client/upload").m185893l(c16191a.m107595a("msc", strM164546b).m107595a("mzip", strM169757b).m107596b("logFile", file.getName(), utc0.create(hyx.m133628d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file)).m107599e()).m185883b()).execute();
            if (exc0VarExecute.m118597I() && new JSONObject(new String(exc0VarExecute.m118606k().bytes(), "UTF-8")).optInt("ec", -1) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p041mm.mmfile.IMMFileUploader
    public boolean upload(File file) {
        try {
            return m210403a(file);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046mm.mmfile.IMMFileUploader;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class t6e implements IMMFileUploader {

    /* JADX INFO: renamed from: c */
    private static final rg50 f172328c;

    /* JADX INFO: renamed from: a */
    private String f172329a;

    /* JADX INFO: renamed from: b */
    private String f172330b;

    static {
        rg50.C19837b c19837bM181372j = new rg50.C19837b().m181372j(x1c.m209015a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f172328c = c19837bM181372j.m181387y(15L, timeUnit).m181383u(5L, timeUnit).m181365c();
    }

    public t6e(String str, String str2) {
        this.f172330b = str2;
        this.f172329a = str;
    }

    /* JADX INFO: renamed from: a */
    private boolean m189518a(File file) throws Exception {
        if (!TextUtils.isEmpty(this.f172329a) && !TextUtils.isEmpty(this.f172330b)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.DEVICE_ID_TAG, this.f172329a);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f172330b);
            jSONObject.put("timestamp", System.currentTimeMillis());
            String strM219973g = zje.m219973g(16);
            String strM176219b = qe2.m176219b(zje.m219969a(strM219973g.getBytes()));
            String strM219975c = zje.m219970d().m219975c(jSONObject.toString(), strM219973g);
            ku10.C18260a c18260a = new ku10.C18260a("---------------------------7da2137580612");
            c18260a.m151432f(ku10.f128786j);
            i5d0 i5d0VarExecute = f172328c.mo181341a(new x1d0.C21228a().m209043q("https://cosmos-api.immomo.com/v2/log/client/upload").m209038l(c18260a.m151427a("msc", strM176219b).m151427a("mzip", strM219975c).m151428b("logFile", file.getName(), z1d0.create(e7y.m119773d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), file)).m151431e()).m209028b()).execute();
            if (i5d0VarExecute.m138661I() && new JSONObject(new String(i5d0VarExecute.m138670k().bytes(), "UTF-8")).optInt("ec", -1) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p046mm.mmfile.IMMFileUploader
    public boolean upload(File file) {
        try {
            return m189518a(file);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

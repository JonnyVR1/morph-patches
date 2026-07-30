package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class l1c implements qu2.InterfaceC19667e {
    @Override // p153l.qu2.InterfaceC19667e
    /* JADX INFO: renamed from: a */
    public String mo130575a() {
        return "DB";
    }

    @Override // p153l.qu2.InterfaceC19667e
    /* JADX INFO: renamed from: b */
    public boolean mo130576b(JSONObject jSONObject, long j, y20<String> y20Var) throws JSONException {
        long j2;
        String string = jSONObject.getString("DBSize");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        try {
            j2 = Long.parseLong(string);
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            j2 = 0;
        }
        if (!NullChecker.m82486a(uqb0.f180397c0)) {
            return true;
        }
        String strUserId = uqb0.f180397c0.userId();
        File fileM21431g = App.f16087d.m21431g("core_v2_" + strUserId);
        File file = new File(fileM21431g.getPath() + "-wal");
        long length = fileM21431g.length();
        if (file.exists()) {
            length += file.length();
        }
        if (j2 != 0 && length <= j2) {
            qu2.m178102B(j, Arrays.asList(fileM21431g, file));
            return true;
        }
        y20Var.call("Db文件太大 大小:" + length);
        return true;
    }
}

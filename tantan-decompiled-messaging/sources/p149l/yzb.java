package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class yzb implements au2.InterfaceC15720e {
    @Override // p149l.au2.InterfaceC15720e
    /* JADX INFO: renamed from: a */
    public String mo98945a() {
        return "DB";
    }

    @Override // p149l.au2.InterfaceC15720e
    /* JADX INFO: renamed from: b */
    public boolean mo98946b(JSONObject jSONObject, long j, e30<String> e30Var) throws JSONException {
        long j2;
        String string = jSONObject.getString("DBSize");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        try {
            j2 = Long.parseLong(string);
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            j2 = 0;
        }
        if (!NullChecker.m81303a(qib0.f154714c0)) {
            return true;
        }
        String strUserId = qib0.f154714c0.userId();
        File fileM20432g = App.f15368d.m20432g("core_v2_" + strUserId);
        File file = new File(fileM20432g.getPath() + "-wal");
        long length = fileM20432g.length();
        if (file.exists()) {
            length += file.length();
        }
        if (j2 != 0 && length <= j2) {
            au2.m98909B(j, Arrays.asList(fileM20432g, file));
            return true;
        }
        e30Var.call("Db文件太大 大小:" + length);
        return true;
    }
}

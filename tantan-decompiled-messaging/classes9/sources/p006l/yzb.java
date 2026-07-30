package p006l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.Arrays;
import l.e30;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yzb implements au2.InterfaceC0534e {
    @Override // p006l.au2.InterfaceC0534e
    /* JADX INFO: renamed from: a */
    public String mo12248a() {
        return "DB";
    }

    @Override // p006l.au2.InterfaceC0534e
    /* JADX INFO: renamed from: b */
    public boolean mo12249b(JSONObject jSONObject, long j, e30<String> e30Var) throws JSONException {
        long j2;
        String string = jSONObject.getString("DBSize");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        try {
            j2 = Long.parseLong(string);
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            j2 = 0;
        }
        if (!NullChecker.a(qib0.f19805c0)) {
            return true;
        }
        String strUserId = qib0.f19805c0.userId();
        File fileG = App.d.g("core_v2_" + strUserId);
        File file = new File(fileG.getPath() + "-wal");
        long length = fileG.length();
        if (file.exists()) {
            length += file.length();
        }
        if (j2 != 0 && length <= j2) {
            au2.m12212B(j, Arrays.asList(fileG, file));
            return true;
        }
        e30Var.call("Db文件太大 大小:" + length);
        return true;
    }
}

package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class jhi implements au2.InterfaceC15720e {
    @Override // p149l.au2.InterfaceC15720e
    /* JADX INFO: renamed from: a */
    public String mo98945a() {
        return "FILE";
    }

    @Override // p149l.au2.InterfaceC15720e
    /* JADX INFO: renamed from: b */
    public boolean mo98946b(JSONObject jSONObject, long j, e30<String> e30Var) throws JSONException {
        try {
            String string = jSONObject.getString("PPATH");
            int iHashCode = string.hashCode();
            String parent = null;
            if (iHashCode != -1820761141) {
                if (iHashCode == 3076010 && string.equals("data")) {
                    parent = App.f15369e.getFilesDir().getParent();
                }
            } else if (string.equals("external")) {
                parent = App.f15369e.getExternalFilesDir(null).getParent();
            }
            if (TextUtils.isEmpty(parent)) {
                return false;
            }
            File file = new File(parent, jSONObject.getString("PATH"));
            if (!file.exists()) {
                return true;
            }
            au2.m98909B(j, Arrays.asList(file));
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return true;
        }
    }
}

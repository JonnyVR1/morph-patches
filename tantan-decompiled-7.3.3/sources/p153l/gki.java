package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class gki implements qu2.InterfaceC19667e {
    @Override // p153l.qu2.InterfaceC19667e
    /* JADX INFO: renamed from: a */
    public String mo130575a() {
        return "FILE";
    }

    @Override // p153l.qu2.InterfaceC19667e
    /* JADX INFO: renamed from: b */
    public boolean mo130576b(JSONObject jSONObject, long j, y20<String> y20Var) throws JSONException {
        try {
            String string = jSONObject.getString("PPATH");
            int iHashCode = string.hashCode();
            String parent = null;
            if (iHashCode != -1820761141) {
                if (iHashCode == 3076010 && string.equals("data")) {
                    parent = App.f16088e.getFilesDir().getParent();
                }
            } else if (string.equals("external")) {
                parent = App.f16088e.getExternalFilesDir(null).getParent();
            }
            if (TextUtils.isEmpty(parent)) {
                return false;
            }
            File file = new File(parent, jSONObject.getString("PATH"));
            if (!file.exists()) {
                return true;
            }
            qu2.m178102B(j, Arrays.asList(file));
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return true;
        }
    }
}

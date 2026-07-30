package p006l;

import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.Arrays;
import l.e30;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jhi implements au2.InterfaceC0534e {
    @Override // p006l.au2.InterfaceC0534e
    /* JADX INFO: renamed from: a */
    public String mo12248a() {
        return "FILE";
    }

    @Override // p006l.au2.InterfaceC0534e
    /* JADX INFO: renamed from: b */
    public boolean mo12249b(JSONObject jSONObject, long j, e30<String> e30Var) throws JSONException {
        try {
            String string = jSONObject.getString("PPATH");
            int iHashCode = string.hashCode();
            String parent = null;
            if (iHashCode != -1820761141) {
                if (iHashCode == 3076010 && string.equals("data")) {
                    parent = App.e.getFilesDir().getParent();
                }
            } else if (string.equals("external")) {
                parent = App.e.getExternalFilesDir(null).getParent();
            }
            if (TextUtils.isEmpty(parent)) {
                return false;
            }
            File file = new File(parent, jSONObject.getString("PATH"));
            if (!file.exists()) {
                return true;
            }
            au2.m12212B(j, Arrays.asList(file));
            return true;
        } catch (Exception e) {
            CrashHelper.c(e);
            return true;
        }
    }
}

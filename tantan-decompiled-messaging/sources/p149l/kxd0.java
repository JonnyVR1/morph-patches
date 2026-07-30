package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kxd0 {
    /* JADX INFO: renamed from: b */
    public static String m147736b(@NonNull Map<String, String> map, String str) {
        return map.containsKey(str) ? map.get(str) : "";
    }

    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Intent intentMo94422c = mo94422c(w2e0Var, f30Var);
        String str = w2e0Var.m201098f().get("backurl");
        String str2 = w2e0Var.m201098f().get("btn_name");
        w2e0Var.m201098f().get("backXHS");
        w2e0Var.m201098f().get("backText");
        w2e0Var.m201098f().get("icon");
        if (!NullChecker.m81303a(intentMo94422c)) {
            m147737d(w2e0Var);
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                intentMo94422c.putExtra("backurl", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intentMo94422c.putExtra("btn_name", str2);
            }
            w2e0Var.m201094b().startActivity(intentMo94422c);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m147737d(w2e0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var);

    /* JADX INFO: renamed from: d */
    public final void m147737d(w2e0 w2e0Var) {
        Activity activityM208326D;
        if (!qib0.f154714c0.signedIn_() || j2e0.m139444k() || (activityM208326D = xdl0.m208326D(w2e0Var.m201094b())) == null) {
            return;
        }
        j2e0.m139440g(activityM208326D);
    }
}

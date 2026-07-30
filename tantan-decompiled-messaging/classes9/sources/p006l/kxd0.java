package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.f30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class kxd0 {
    /* JADX INFO: renamed from: b */
    public static String m18317b(@NonNull Map<String, String> map, String str) {
        return map.containsKey(str) ? map.get(str) : "";
    }

    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Intent intentMo11682c = mo11682c(w2e0Var, f30Var);
        String str = w2e0Var.m26160f().get("backurl");
        String str2 = w2e0Var.m26160f().get("btn_name");
        w2e0Var.m26160f().get("backXHS");
        w2e0Var.m26160f().get("backText");
        w2e0Var.m26160f().get("icon");
        if (!NullChecker.a(intentMo11682c)) {
            m18318d(w2e0Var);
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                intentMo11682c.putExtra("backurl", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intentMo11682c.putExtra("btn_name", str2);
            }
            w2e0Var.m26156b().startActivity(intentMo11682c);
        } catch (Exception e) {
            CrashHelper.c(e);
            m18318d(w2e0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var);

    /* JADX INFO: renamed from: d */
    public final void m18318d(w2e0 w2e0Var) {
        Activity activityD;
        if (!qib0.f19805c0.signedIn_() || j2e0.m17246k() || (activityD = xdl0.D(w2e0Var.m26156b())) == null) {
            return;
        }
        j2e0.m17242g(activityD);
    }
}

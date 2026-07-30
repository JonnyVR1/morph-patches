package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o5e0 {
    /* JADX INFO: renamed from: b */
    public static String m166119b(@NonNull Map<String, String> map, String str) {
        return map.containsKey(str) ? map.get(str) : "";
    }

    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Intent intentMo95799c = mo95799c(abe0Var, z20Var);
        String str = abe0Var.m96743f().get("backurl");
        String str2 = abe0Var.m96743f().get("btn_name");
        abe0Var.m96743f().get("backXHS");
        abe0Var.m96743f().get("backText");
        abe0Var.m96743f().get("icon");
        if (!NullChecker.m82486a(intentMo95799c)) {
            m166120d(abe0Var);
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                intentMo95799c.putExtra("backurl", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intentMo95799c.putExtra("btn_name", str2);
            }
            abe0Var.m96739b().startActivity(intentMo95799c);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m166120d(abe0Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var);

    /* JADX INFO: renamed from: d */
    public final void m166120d(abe0 abe0Var) {
        Activity activityM105506D;
        if (!uqb0.f180397c0.signedIn_() || nae0.m162081k() || (activityM105506D = bnl0.m105506D(abe0Var.m96739b())) == null) {
            return;
        }
        nae0.m162077g(activityM105506D);
    }
}

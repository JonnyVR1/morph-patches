package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class j9e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (abe0Var.m96743f().containsKey("path")) {
            String strM166119b = o5e0.m166119b(abe0Var.m96743f(), "path");
            if (("privilege/vip".equals(strM166119b) || "privilege/see".equals(strM166119b)) && NullChecker.m82486a(z20Var)) {
                z20Var.call(abe0Var.m96743f().get("callback"), "permission denied");
            }
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}

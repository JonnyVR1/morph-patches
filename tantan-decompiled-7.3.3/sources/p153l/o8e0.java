package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class o8e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        NavigationIntent navigationIntent = NavigationIntent.get("setting");
        if (!TextUtils.isEmpty(abe0Var.m96744g()) && "chooselocation".equals(abe0Var.m96744g().replaceFirst("/", ""))) {
            navigationIntent = NavigationIntent.get("setting_chooselocation");
        }
        return xwa.m213316k(abe0Var.m96739b(), navigationIntent);
    }
}

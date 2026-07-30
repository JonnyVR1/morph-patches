package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class n4e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (!TextUtils.isEmpty(abe0Var.m96744g()) && "quickchat".equals(abe0Var.m96744g().replaceFirst("/", ""))) {
            return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get("quickchat"));
        }
        if (abe0Var.m96743f().size() > 0 && !TextUtils.isEmpty(abe0Var.m96743f().get("publicId"))) {
            if (!TextUtils.equals(CoreModule.f18264c.f20381e0.m116600p9().publicId, abe0Var.m96743f().get("publicId"))) {
                return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get("cards"));
            }
        }
        return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get(NavigationIntent.menu));
    }
}

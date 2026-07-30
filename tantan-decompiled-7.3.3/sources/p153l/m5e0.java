package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes9.dex */
public class m5e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (SchemeKey.pettune.equals(abe0Var.m96741d()) || SchemeKey.sportsman.equals(abe0Var.m96741d()) || "trip".equals(abe0Var.m96741d())) {
            return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get(NavigationIntent.intl_operating_pet));
        }
        if (SchemeKey.intl520.equals(abe0Var.m96741d())) {
            return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get(NavigationIntent.intl_similar_interests));
        }
        if (SchemeKey.campingactivity.equals(abe0Var.m96741d())) {
            return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get(NavigationIntent.intl_camping));
        }
        if (!"regular_main_popup".equals(abe0Var.m96741d())) {
            return null;
        }
        return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get("regular_main_popup"));
    }
}

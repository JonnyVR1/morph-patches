package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public class d8e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "facebook")) {
            return null;
        }
        return xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get(NavigationIntent.secret_crush));
    }
}

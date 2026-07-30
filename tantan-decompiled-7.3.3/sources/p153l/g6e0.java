package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class g6e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (d79.m114675e0() && TextUtils.equals("jumpTab", abe0Var.m96744g().replaceFirst("/", ""))) {
            return NewMainAct.m40702O5(abe0Var.m96739b(), NavigationIntent.get("loveBuzz"), null, abe0Var.m96743f());
        }
        return null;
    }
}

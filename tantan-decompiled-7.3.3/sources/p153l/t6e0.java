package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class t6e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return rbb0.m180744q() ? xwa.m213316k(abe0Var.m96739b(), NavigationIntent.get("seeLikes")) : LikersAct.m57727Y1(abe0Var.m96739b(), "");
    }
}

package p153l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.LoveRadarSettingAct;

/* JADX INFO: loaded from: classes9.dex */
public class lae0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Context contextM96739b = abe0Var.m96739b();
        if (contextM96739b instanceof Act) {
            contextM96739b.startActivity(LoveRadarSettingAct.m42921a2(contextM96739b));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}

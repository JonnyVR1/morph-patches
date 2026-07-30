package p149l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.LoveRadarSettingAct;

/* JADX INFO: loaded from: classes9.dex */
public class h2e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Context contextM201094b = w2e0Var.m201094b();
        if (contextM201094b instanceof Act) {
            contextM201094b.startActivity(LoveRadarSettingAct.m41910Z1(contextM201094b));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}

package p006l;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.LoveRadarSettingAct;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class h2e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Context contextM26156b = w2e0Var.m26156b();
        if (contextM26156b instanceof Act) {
            contextM26156b.startActivity(LoveRadarSettingAct.Z1(contextM26156b));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}

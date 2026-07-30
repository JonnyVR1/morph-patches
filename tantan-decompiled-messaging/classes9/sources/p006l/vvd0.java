package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CityCBanner;
import com.p1.mobile.putong.core.data.CityCData;
import l.f30;
import l.m45;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vvd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Act actM26156b = w2e0Var.m26156b();
        if (actM26156b instanceof Act) {
            new m45(actM26156b, "").K(5, (CityCData) null, (CityCBanner) null);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}

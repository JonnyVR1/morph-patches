package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import l.ygt;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hen extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, @Nullable x1e0.C0892b c0892b) {
        String strG = ygtVar.g("liveType");
        if (TextUtils.isEmpty(strG)) {
            strG = "live";
        }
        ypv.a.S(c2e0Var.act(), strG);
    }
}

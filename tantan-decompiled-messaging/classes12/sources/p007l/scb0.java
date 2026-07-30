package p007l;

import androidx.annotation.Nullable;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.rcb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class scb0 implements rcb0 {

    /* JADX INFO: renamed from: a */
    public rcb0 f12886a;

    public scb0(rcb0 rcb0Var) {
        this.f12886a = rcb0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m14123a() {
        this.f12886a = null;
    }

    /* JADX INFO: renamed from: d */
    public void m14124d(d dVar, @Nullable List<Purchase> list) {
        if (NullChecker.a(this.f12886a)) {
            this.f12886a.d(dVar, list);
        }
    }
}

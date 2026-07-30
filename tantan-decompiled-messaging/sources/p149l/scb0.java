package p149l;

import androidx.annotation.Nullable;
import com.android.billingclient.api.C0871d;
import com.android.billingclient.api.Purchase;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class scb0 implements rcb0 {

    /* JADX INFO: renamed from: a */
    public rcb0 f163721a;

    public scb0(rcb0 rcb0Var) {
        this.f163721a = rcb0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m183374a() {
        this.f163721a = null;
    }

    @Override // p149l.rcb0
    /* JADX INFO: renamed from: d */
    public void mo5069d(C0871d c0871d, @Nullable List<Purchase> list) {
        if (NullChecker.m81303a(this.f163721a)) {
            this.f163721a.mo5069d(c0871d, list);
        }
    }
}

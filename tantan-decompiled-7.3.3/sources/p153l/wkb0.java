package p153l;

import androidx.annotation.Nullable;
import com.android.billingclient.api.C0875d;
import com.android.billingclient.api.Purchase;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wkb0 implements vkb0 {

    /* JADX INFO: renamed from: a */
    public vkb0 f189534a;

    public wkb0(vkb0 vkb0Var) {
        this.f189534a = vkb0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m206741a() {
        this.f189534a = null;
    }

    @Override // p153l.vkb0
    /* JADX INFO: renamed from: d */
    public void mo5079d(C0875d c0875d, @Nullable List<Purchase> list) {
        if (NullChecker.m82486a(this.f189534a)) {
            this.f189534a.mo5079d(c0875d, list);
        }
    }
}

package p153l;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes6.dex */
public final class bty0 extends quy0 {
    public bty0(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // p153l.quy0
    /* JADX INFO: renamed from: a */
    public final void mo106414a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m178226d(null);
        } else {
            m178225c(new zzt(4, "Invalid response to one way request", null));
        }
    }

    @Override // p153l.quy0
    /* JADX INFO: renamed from: b */
    public final boolean mo106415b() {
        return true;
    }
}

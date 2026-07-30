package p149l;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes6.dex */
public final class vjy0 extends kly0 {
    public vjy0(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // p149l.kly0
    /* JADX INFO: renamed from: a */
    public final void mo127502a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m146439d(null);
        } else {
            m146438c(new zzt(4, "Invalid response to one way request", null));
        }
    }

    @Override // p149l.kly0
    /* JADX INFO: renamed from: b */
    public final boolean mo127503b() {
        return true;
    }
}

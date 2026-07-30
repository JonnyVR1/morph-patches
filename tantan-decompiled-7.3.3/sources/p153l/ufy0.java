package p153l;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ufy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final WifiManager f178847a;

    public ufy0(Context context) {
        this.f178847a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}

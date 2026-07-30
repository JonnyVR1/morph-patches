package p149l;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class o6y0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final WifiManager f142442a;

    public o6y0(Context context) {
        this.f142442a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}

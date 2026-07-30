package p149l;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes11.dex */
public class ht0 implements szl {
    @Override // p149l.szl
    /* JADX INFO: renamed from: a */
    public boolean mo132806a(Context context) {
        return rqi.m180452c(context);
    }

    @Override // p149l.szl
    /* JADX INFO: renamed from: b */
    public boolean mo132807b(Context context) {
        return Settings.canDrawOverlays(context);
    }

    @Override // p149l.szl
    public boolean isSupported() {
        return true;
    }
}

package p009l;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ht0 implements szl {
    @Override // p009l.szl
    /* JADX INFO: renamed from: a */
    public boolean mo15948a(Context context) {
        return rqi.m21777c(context);
    }

    @Override // p009l.szl
    /* JADX INFO: renamed from: b */
    public boolean mo15949b(Context context) {
        return Settings.canDrawOverlays(context);
    }

    @Override // p009l.szl
    public boolean isSupported() {
        return true;
    }
}

package p153l;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes10.dex */
public class nt0 implements m2m {
    @Override // p153l.m2m
    /* JADX INFO: renamed from: a */
    public boolean mo156866a(Context context) {
        return nti.m164729c(context);
    }

    @Override // p153l.m2m
    /* JADX INFO: renamed from: b */
    public boolean mo142398b(Context context) {
        return Settings.canDrawOverlays(context);
    }

    @Override // p153l.m2m
    public boolean isSupported() {
        return true;
    }
}

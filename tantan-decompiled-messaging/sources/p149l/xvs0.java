package p149l;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes6.dex */
public final class xvs0 extends ContextWrapper {
    /* JADX INFO: renamed from: a */
    public static Context m211305a(Context context) {
        if (context instanceof xvs0) {
            return ((xvs0) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}

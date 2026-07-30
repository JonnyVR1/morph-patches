package p153l;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes6.dex */
public final class d5t0 extends ContextWrapper {
    /* JADX INFO: renamed from: a */
    public static Context m114319a(Context context) {
        if (context instanceof d5t0) {
            return ((d5t0) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}

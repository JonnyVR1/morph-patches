package p003l;

import android.content.res.Resources;
import com.p1.mobile.android.app.App;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wwc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m10594a(int i) {
        try {
            App.e.getResources().getResourceEntryName(i);
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}

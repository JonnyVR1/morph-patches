package p149l;

import android.content.res.Resources;
import com.p046p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes10.dex */
public class wwc0 {
    /* JADX INFO: renamed from: a */
    public static boolean m205855a(int i) {
        try {
            App.f15369e.getResources().getResourceEntryName(i);
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}

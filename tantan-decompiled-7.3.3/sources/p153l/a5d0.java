package p153l;

import android.content.res.Resources;
import com.p051p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes12.dex */
public class a5d0 {
    /* JADX INFO: renamed from: a */
    public static boolean m96049a(int i) {
        try {
            App.f16088e.getResources().getResourceEntryName(i);
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}

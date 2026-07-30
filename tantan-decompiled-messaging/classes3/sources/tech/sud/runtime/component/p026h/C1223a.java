package tech.sud.runtime.component.p026h;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: tech.sud.runtime.component.h.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1223a {
    /* JADX INFO: renamed from: a */
    public static boolean m10311a(Context context, String str) throws IOException {
        if (str.startsWith("file:////android_asset/")) {
            str = str.substring(23);
        }
        boolean z = false;
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            z = inputStreamOpen != null;
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
        } catch (IOException | Exception unused) {
        }
        return z;
    }
}

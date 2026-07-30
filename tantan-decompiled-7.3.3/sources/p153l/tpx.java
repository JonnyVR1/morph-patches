package p153l;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class tpx {
    /* JADX INFO: renamed from: a */
    public static boolean m192215a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            return bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m192216b(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        int i4 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i5 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE", -1);
        int i6 = bundle == null ? -1 : bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i7 = bundle2 == null ? -1 : bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        int i8 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i4 == -1 || i6 == -1) {
            i = Integer.MAX_VALUE;
            i2 = 0;
        } else {
            i2 = i4 * i6;
            i = (i6 + i2) - 1;
        }
        if (i5 == -1 || i7 == -1) {
            i3 = 0;
        } else {
            i3 = i5 * i7;
            i8 = (i7 + i3) - 1;
        }
        return i >= i3 && i8 >= i2;
    }
}

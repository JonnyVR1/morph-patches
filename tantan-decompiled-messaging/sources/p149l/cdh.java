package p149l;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class cdh {
    /* JADX INFO: renamed from: a */
    public static boolean m106228a() {
        return Build.BRAND.equals("Meizu") && Build.MODEL.equals("m1 note");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106229b() {
        return (ConnectivityReceiver.m81289l() && (gl5.f103295c.get().booleanValue() || gl5.f103293a.get().booleanValue())) || gl5.f103295c.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static long m106230c(Act act, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long j = -1;
        try {
            mediaMetadataRetriever.setDataSource(act, Uri.fromFile(new File(rhi.m179382z(str))));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(strExtractMetadata)) {
                j = Long.parseLong(strExtractMetadata);
            }
        } catch (Throwable th) {
            try {
                CrashHelper.m81296c(th);
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m106231d() {
        return xdl0.m208412y0() > 720 && !m106228a();
    }
}

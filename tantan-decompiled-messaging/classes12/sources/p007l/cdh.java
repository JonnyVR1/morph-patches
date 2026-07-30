package p007l;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import l.rhi;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cdh {
    /* JADX INFO: renamed from: a */
    public static boolean m9122a() {
        return Build.BRAND.equals("Meizu") && Build.MODEL.equals("m1 note");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9123b() {
        return (ConnectivityReceiver.l() && (((Boolean) gl5.f8474c.get()).booleanValue() || ((Boolean) gl5.f8472a.get()).booleanValue())) || ((Boolean) gl5.f8474c.get()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static long m9124c(Act act, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long j = -1;
        try {
            mediaMetadataRetriever.setDataSource((Context) act, Uri.fromFile(new File(rhi.z(str))));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(strExtractMetadata)) {
                j = Long.parseLong(strExtractMetadata);
            }
        } catch (Throwable th) {
            try {
                CrashHelper.c(th);
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
    public static boolean m9125d() {
        return xdl0.y0() > 720 && !m9122a();
    }
}

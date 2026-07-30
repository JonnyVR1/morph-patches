package p153l;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class reh {
    /* JADX INFO: renamed from: a */
    public static boolean m181026a() {
        return Build.BRAND.equals("Meizu") && Build.MODEL.equals("m1 note");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m181027b() {
        return (ConnectivityReceiver.m82472l() && (jm5.f121640c.get().booleanValue() || jm5.f121638a.get().booleanValue())) || jm5.f121640c.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static long m181028c(Act act, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long j = -1;
        try {
            mediaMetadataRetriever.setDataSource(act, Uri.fromFile(new File(oki.m168038z(str))));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(strExtractMetadata)) {
                j = Long.parseLong(strExtractMetadata);
            }
        } catch (Throwable th) {
            try {
                CrashHelper.m82479c(th);
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
    public static boolean m181029d() {
        return bnl0.m105592y0() > 720 && !m181026a();
    }
}

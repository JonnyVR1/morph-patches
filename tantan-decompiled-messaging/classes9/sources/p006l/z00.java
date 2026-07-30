package p006l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.p000p1.mobile.putong.account.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class z00 {
    /* JADX INFO: renamed from: a */
    public static final boolean m28524a(@NonNull Video video) {
        String str = video.path;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            jfd0.a("Video path cannot be null.");
            return false;
        }
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = new VideoDataRetrieverBySoft();
        try {
            if (videoDataRetrieverBySoft.init(str)) {
                video.length = videoDataRetrieverBySoft.getDuration() / 1000;
                video.width = videoDataRetrieverBySoft.getWidth();
                video.height = videoDataRetrieverBySoft.getHeight();
                z = true;
            }
            videoDataRetrieverBySoft.release();
            return z;
        } catch (Throwable th) {
            try {
                CrashHelper.c(th);
                Log4Android.getInstance().e(th);
                return false;
            } finally {
                videoDataRetrieverBySoft.release();
            }
        }
    }
}

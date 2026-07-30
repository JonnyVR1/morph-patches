package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.p051p1.mobile.putong.account.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;

/* JADX INFO: loaded from: classes9.dex */
public class t00 {
    /* JADX INFO: renamed from: a */
    public static final boolean m188698a(@NonNull Video video) {
        String str = video.path;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            mnd0.m159157a("Video path cannot be null.");
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
                CrashHelper.m82479c(th);
                Log4Android.getInstance().m82583e(th);
                return false;
            } finally {
                videoDataRetrieverBySoft.release();
            }
        }
    }
}

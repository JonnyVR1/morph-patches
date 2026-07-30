package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;

/* JADX INFO: loaded from: classes13.dex */
public class ikl0 {
    /* JADX INFO: renamed from: a */
    public static boolean m140409a(Video video) {
        boolean zM140410b = m140410b(video);
        int i = video.rotate;
        if (i != 90 && i != 270) {
            return zM140410b;
        }
        int i2 = video.width;
        video.width = video.height;
        video.height = i2;
        return zM140410b;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m140410b(@NonNull Video video) {
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
                video.rotate = videoDataRetrieverBySoft.getRotation();
                video.frameRate = videoDataRetrieverBySoft.getFrameRate();
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

    /* JADX INFO: renamed from: c */
    public static final boolean m140411c(@NonNull Video video) {
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

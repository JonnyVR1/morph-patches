package p007l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediautils.log.Log4Android;
import l.jfd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ebl0 {
    /* JADX INFO: renamed from: a */
    public static boolean m9701a(Video video) {
        boolean zM9702b = m9702b(video);
        int i = video.rotate;
        if (i != 90 && i != 270) {
            return zM9702b;
        }
        int i2 = video.width;
        video.width = video.height;
        video.height = i2;
        return zM9702b;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9702b(@NonNull Video video) {
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
                video.rotate = videoDataRetrieverBySoft.getRotation();
                video.frameRate = videoDataRetrieverBySoft.getFrameRate();
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

    /* JADX INFO: renamed from: c */
    public static final boolean m9703c(@NonNull Video video) {
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

package p007l;

import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.List;
import l.l3f;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class r7i extends TrackMediaUploadUtil {
    /* JADX INFO: renamed from: j0 */
    public static void m13852j0(String str, Moment moment, long j) {
        List<Media> list;
        if (moment == null || (list = moment.media) == null || list.size() <= 0) {
            return;
        }
        Media media = moment.media.get(0);
        HashMap map = new HashMap();
        map.put("duration", String.valueOf(j));
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        if (Moments.TYPE.equals(str)) {
            l3fVar.n = "p_moments_view";
        } else if ("nearby".equals(str)) {
            l3fVar.n = OMSDialogPositon.p_nearby;
        } else if ("follow".equals(str)) {
            l3fVar.n = "p_follow";
        }
        if (media instanceof Picture) {
            l3fVar.s = "e_UploadImageDuration_feed";
            map.put("image_size", TrackMediaUploadUtil.z(moment.media));
        } else if (media instanceof Video) {
            l3fVar.s = "e_UploadVideoDuration_feed";
            map.put("video_size", Long.valueOf(TrackMediaUploadUtil.B(media)));
        }
        zvf0.n(l3fVar, map);
    }
}

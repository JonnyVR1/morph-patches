package p153l;

import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class g9i extends TrackMediaUploadUtil {
    /* JADX INFO: renamed from: j0 */
    public static void m129585j0(String str, Moment moment, long j) {
        List<Media> list;
        if (moment == null || (list = moment.media) == null || list.size() <= 0) {
            return;
        }
        Media media = moment.media.get(0);
        HashMap map = new HashMap();
        map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        if (Moments.TYPE.equals(str)) {
            q4fVar.f155576n = "p_moments_view";
        } else if ("nearby".equals(str)) {
            q4fVar.f155576n = OMSDialogPositon.p_nearby;
        } else if ("follow".equals(str)) {
            q4fVar.f155576n = "p_follow";
        }
        if (media instanceof Picture) {
            q4fVar.f155581s = "e_UploadImageDuration_feed";
            map.put("image_size", TrackMediaUploadUtil.m81512z(moment.media));
        } else if (media instanceof Video) {
            q4fVar.f155581s = "e_UploadVideoDuration_feed";
            map.put("video_size", Long.valueOf(TrackMediaUploadUtil.m81453B(media)));
        }
        i4g0.m138516n(q4fVar, map);
    }
}

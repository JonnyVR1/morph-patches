package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class eug extends mug {
    public eug(Act act, hug hugVar, FeedCenterVideoView feedCenterVideoView) {
        super(act, hugVar, feedCenterVideoView);
    }

    @Override // p153l.mug
    /* JADX INFO: renamed from: l */
    public void mo122569l(int i, Moment moment, HashMap<String, Boolean> map) {
        Video video;
        Picture picture;
        Picture pictureCover;
        super.mo122569l(i, moment, map);
        m160146d(this.f138792i, false);
        m160146d(this.f138787d, false);
        m160146d(this.f138798o, false);
        m160146d(this.f138799p, moment.isLive && rtg.m183115a(moment.live) && j4h.m143420d());
        if (j4h.m143420d()) {
            m160146d(this.f138803t, false);
        }
        this.f138802s.stopAnimation();
        if (moment.isLive && !jyb.m147479J(moment.live.specialLabels)) {
            String str = moment.live.specialLabels.get(0).value;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            VText vText = this.f138801r;
            if (zIsEmpty) {
                vText.setText("直播中");
            } else {
                vText.setText(str);
            }
        }
        if (moment.isLive && (moment.live.videoCapture instanceof Video) && j4h.m143420d()) {
            Live live = moment.live;
            Video video2 = (Video) live.videoCapture;
            if (NullChecker.m82486a(live.snapshot) && NullChecker.m82486a(moment.live.snapshot.cover())) {
                pictureCover = moment.live.snapshot.cover();
            } else {
                pictureCover = (NullChecker.m82486a(moment.liveRoom) && NullChecker.m82486a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            if (NullChecker.m82486a(pictureCover)) {
                m160153k(video2, pictureCover);
                return;
            }
        }
        List<Media> list = moment.media;
        if (list.size() != 1) {
            return;
        }
        Media media = list.get(0);
        if ((media instanceof Video) && (picture = (video = (Video) media).cover) != null) {
            m160152j(video, picture);
        }
    }
}

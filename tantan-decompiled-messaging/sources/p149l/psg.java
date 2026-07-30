package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class psg extends xsg {
    public psg(Act act, ssg ssgVar, FeedCenterVideoView feedCenterVideoView) {
        super(act, ssgVar, feedCenterVideoView);
    }

    @Override // p149l.xsg
    /* JADX INFO: renamed from: l */
    public void mo171138l(int i, Moment moment, HashMap<String, Boolean> map) {
        Video video;
        Picture picture;
        Picture pictureCover;
        super.mo171138l(i, moment, map);
        m210747d(this.f194254i, false);
        m210747d(this.f194249d, false);
        m210747d(this.f194260o, false);
        m210747d(this.f194261p, moment.isLive && csg.m108505a(moment.live) && u2h.m191495d());
        if (u2h.m191495d()) {
            m210747d(this.f194265t, false);
        }
        this.f194264s.stopAnimation();
        if (moment.isLive && !vwb.m200296J(moment.live.specialLabels)) {
            String str = moment.live.specialLabels.get(0).value;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            VText vText = this.f194263r;
            if (zIsEmpty) {
                vText.setText("直播中");
            } else {
                vText.setText(str);
            }
        }
        if (moment.isLive && (moment.live.videoCapture instanceof Video) && u2h.m191495d()) {
            Live live = moment.live;
            Video video2 = (Video) live.videoCapture;
            if (NullChecker.m81303a(live.snapshot) && NullChecker.m81303a(moment.live.snapshot.cover())) {
                pictureCover = moment.live.snapshot.cover();
            } else {
                pictureCover = (NullChecker.m81303a(moment.liveRoom) && NullChecker.m81303a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            if (NullChecker.m81303a(pictureCover)) {
                m210754k(video2, pictureCover);
                return;
            }
        }
        List<Media> list = moment.media;
        if (list.size() != 1) {
            return;
        }
        Media media = list.get(0);
        if ((media instanceof Video) && (picture = (video = (Video) media).cover) != null) {
            m210753j(video, picture);
        }
    }
}

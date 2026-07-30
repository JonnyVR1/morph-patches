package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.vwb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class psg extends xsg {
    public psg(Act act, ssg ssgVar, FeedCenterVideoView feedCenterVideoView) {
        super(act, ssgVar, feedCenterVideoView);
    }

    @Override // p007l.xsg
    /* JADX INFO: renamed from: l */
    public void mo13215l(int i, Moment moment, HashMap<String, Boolean> map) {
        Video video;
        Picture picture;
        Picture pictureCover;
        super.mo13215l(i, moment, map);
        m16843d(this.f15127i, false);
        m16843d(this.f15122d, false);
        m16843d(this.f15133o, false);
        m16843d(this.f15134p, moment.isLive && csg.m9236a(moment.live) && u2h.m14719d());
        if (u2h.m14719d()) {
            m16843d(this.f15138t, false);
        }
        this.f15137s.stopAnimation();
        if (moment.isLive && !vwb.J(moment.live.specialLabels)) {
            String str = moment.live.specialLabels.get(0).value;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            VText vText = this.f15136r;
            if (zIsEmpty) {
                vText.setText("直播中");
            } else {
                vText.setText(str);
            }
        }
        if (moment.isLive && (moment.live.videoCapture instanceof Video) && u2h.m14719d()) {
            Live live = moment.live;
            Video video2 = (Video) live.videoCapture;
            if (NullChecker.a(live.snapshot) && NullChecker.a(moment.live.snapshot.cover())) {
                pictureCover = moment.live.snapshot.cover();
            } else {
                pictureCover = (NullChecker.a(moment.liveRoom) && NullChecker.a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
            }
            if (NullChecker.a(pictureCover)) {
                m16850k(video2, pictureCover);
                return;
            }
        }
        List<Media> list = moment.media;
        if (list.size() != 1) {
            return;
        }
        Media media = list.get(0);
        if ((media instanceof Video) && (picture = (video = (Video) media).cover) != null) {
            m16849j(video, picture);
        }
    }
}

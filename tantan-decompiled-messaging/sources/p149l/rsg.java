package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.HashMap;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class rsg extends xsg {

    /* JADX INFO: renamed from: l.rsg$a */
    public class C19772a extends AnimListener {
        public C19772a() {
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    public rsg(Act act, ssg ssgVar, FeedCenterVideoView feedCenterVideoView) {
        super(act, ssgVar, feedCenterVideoView);
    }

    @Override // p149l.xsg
    /* JADX INFO: renamed from: l */
    public void mo171138l(int i, final Moment moment, final HashMap<String, Boolean> map) {
        Picture pictureCover;
        Picture pictureCover2;
        m210747d(this.f194254i, false);
        m210747d(this.f194253h, !TextUtils.isEmpty(moment.value));
        this.f194253h.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.qsg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f156189a.m180660q(map, moment, z);
            }
        }).m79201M(moment.value);
        m210747d(this.f194261p, moment.isLive && csg.m108505a(moment.live));
        this.f194264s.loadAnimWithListener("feed_live_room_icon.svga", -1, new C19772a(), true);
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
        m210747d(this.f194249d, false);
        csg.m108510f(moment, this.f194265t);
        if (moment.isLive) {
            Live live = moment.live;
            Media media = live.videoCapture;
            if (media instanceof Video) {
                Video video = (Video) media;
                if (NullChecker.m81303a(live.snapshot) && NullChecker.m81303a(moment.live.snapshot.cover())) {
                    pictureCover2 = moment.live.snapshot.cover();
                } else {
                    pictureCover2 = (NullChecker.m81303a(moment.liveRoom) && NullChecker.m81303a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
                }
                if (NullChecker.m81303a(pictureCover2)) {
                    m210754k(video, pictureCover2);
                    return;
                }
            }
        }
        Media media2 = moment.live.snapshot;
        if (media2 == null || (pictureCover = media2.cover()) == null) {
            return;
        }
        m210753j((Video) moment.live.snapshot, pictureCover);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m180660q(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        this.f194269x.m64641O(z);
    }
}

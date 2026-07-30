package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.HashMap;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gug extends mug {

    /* JADX INFO: renamed from: l.gug$a */
    public class C17314a extends AnimListener {
        public C17314a() {
        }

        @Override // com.tantanapp.media.ttmediaeffect.anim.AnimListener, com.tantanapp.media.ttmediaeffect.anim.IAnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    public gug(Act act, hug hugVar, FeedCenterVideoView feedCenterVideoView) {
        super(act, hugVar, feedCenterVideoView);
    }

    @Override // p153l.mug
    /* JADX INFO: renamed from: l */
    public void mo122569l(int i, final Moment moment, final HashMap<String, Boolean> map) {
        Picture pictureCover;
        Picture pictureCover2;
        m160146d(this.f138792i, false);
        m160146d(this.f138791h, !TextUtils.isEmpty(moment.value));
        this.f138791h.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.fug
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f100908a.m132292q(map, moment, z);
            }
        }).m80384M(moment.value);
        m160146d(this.f138799p, moment.isLive && rtg.m183115a(moment.live));
        this.f138802s.loadAnimWithListener("feed_live_room_icon.svga", -1, new C17314a(), true);
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
        m160146d(this.f138787d, false);
        rtg.m183120f(moment, this.f138803t);
        if (moment.isLive) {
            Live live = moment.live;
            Media media = live.videoCapture;
            if (media instanceof Video) {
                Video video = (Video) media;
                if (NullChecker.m82486a(live.snapshot) && NullChecker.m82486a(moment.live.snapshot.cover())) {
                    pictureCover2 = moment.live.snapshot.cover();
                } else {
                    pictureCover2 = (NullChecker.m82486a(moment.liveRoom) && NullChecker.m82486a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
                }
                if (NullChecker.m82486a(pictureCover2)) {
                    m160153k(video, pictureCover2);
                    return;
                }
            }
        }
        Media media2 = moment.live.snapshot;
        if (media2 == null || (pictureCover = media2.cover()) == null) {
            return;
        }
        m160152j((Video) moment.live.snapshot, pictureCover);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m132292q(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        this.f138807x.m65824O(z);
    }
}

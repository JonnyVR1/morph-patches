package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.HashMap;
import l.vwb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rsg extends xsg {

    /* JADX INFO: renamed from: l.rsg$a */
    public class C2479a extends AnimListener {
        public C2479a() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    public rsg(Act act, ssg ssgVar, FeedCenterVideoView feedCenterVideoView) {
        super(act, ssgVar, feedCenterVideoView);
    }

    @Override // p007l.xsg
    /* JADX INFO: renamed from: l */
    public void mo13215l(int i, final Moment moment, final HashMap<String, Boolean> map) {
        Picture pictureCover;
        Picture pictureCover2;
        m16843d(this.f15127i, false);
        m16843d(this.f15126h, !TextUtils.isEmpty(moment.value));
        this.f15126h.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.qsg
            /* JADX INFO: renamed from: a */
            public final void m13698a(boolean z) {
                this.f12357a.m13966q(map, moment, z);
            }
        }).M(moment.value);
        m16843d(this.f15134p, moment.isLive && csg.m9236a(moment.live));
        this.f15137s.loadAnimWithListener("feed_live_room_icon.svga", -1, new C2479a(), true);
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
        m16843d(this.f15122d, false);
        csg.m9241f(moment, this.f15138t);
        if (moment.isLive) {
            Live live = moment.live;
            Media media = live.videoCapture;
            if (media instanceof Video) {
                Video video = (Video) media;
                if (NullChecker.a(live.snapshot) && NullChecker.a(moment.live.snapshot.cover())) {
                    pictureCover2 = moment.live.snapshot.cover();
                } else {
                    pictureCover2 = (NullChecker.a(moment.liveRoom) && NullChecker.a(moment.liveRoom.cover)) ? moment.liveRoom.cover.media : null;
                }
                if (NullChecker.a(pictureCover2)) {
                    m16850k(video, pictureCover2);
                    return;
                }
            }
        }
        Media media2 = moment.live.snapshot;
        if (media2 == null || (pictureCover = media2.cover()) == null) {
            return;
        }
        m16849j((Video) moment.live.snapshot, pictureCover);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m13966q(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        this.f15142x.m5735O(z);
    }
}

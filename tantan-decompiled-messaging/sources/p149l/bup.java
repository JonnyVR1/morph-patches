package p149l;

import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;

/* JADX INFO: loaded from: classes13.dex */
public class bup extends z1s {
    private LiveGoAction goAction;
    private boolean isShowRegion;
    private BLiveFrame liveFrame;
    private BLiveVoiceRoomFeed roomFeed;
    private int styleIndex;
    private LiveCardTrackData trackData;
    private LiveCardTrackData whiteMCTrackData;

    public bup(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this.roomFeed = bLiveVoiceRoomFeed;
    }

    /* JADX INFO: renamed from: a */
    public LiveGoAction m103977a() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: b */
    public BLiveFrame m103978b() {
        return this.liveFrame;
    }

    /* JADX INFO: renamed from: c */
    public BLiveVoiceRoomFeed m103979c() {
        return this.roomFeed;
    }

    /* JADX INFO: renamed from: d */
    public int m103980d() {
        return this.styleIndex;
    }

    /* JADX INFO: renamed from: e */
    public LiveCardTrackData m103981e() {
        return this.trackData;
    }

    /* JADX INFO: renamed from: f */
    public LiveCardTrackData m103982f() {
        return this.whiteMCTrackData;
    }

    /* JADX INFO: renamed from: g */
    public boolean m103983g() {
        return this.isShowRegion;
    }

    /* JADX INFO: renamed from: h */
    public void m103984h(LiveGoAction liveGoAction) {
        this.goAction = liveGoAction;
    }

    /* JADX INFO: renamed from: i */
    public void m103985i(BLiveFrame bLiveFrame) {
        this.liveFrame = bLiveFrame;
    }

    /* JADX INFO: renamed from: j */
    public void m103986j(boolean z) {
        this.isShowRegion = z;
    }

    /* JADX INFO: renamed from: k */
    public void m103987k(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }

    /* JADX INFO: renamed from: l */
    public void m103988l(LiveCardTrackData liveCardTrackData) {
        this.whiteMCTrackData = liveCardTrackData;
    }
}

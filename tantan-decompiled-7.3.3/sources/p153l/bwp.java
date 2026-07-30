package p153l;

import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.data.BLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;

/* JADX INFO: loaded from: classes13.dex */
public class bwp extends a4s {
    private LiveGoAction goAction;
    private boolean isShowRegion;
    private BLiveFrame liveFrame;
    private BLiveVoiceRoomFeed roomFeed;
    private int styleIndex;
    private LiveCardTrackData trackData;
    private LiveCardTrackData whiteMCTrackData;

    public bwp(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this.roomFeed = bLiveVoiceRoomFeed;
    }

    /* JADX INFO: renamed from: a */
    public LiveGoAction m106728a() {
        return this.goAction;
    }

    /* JADX INFO: renamed from: b */
    public BLiveFrame m106729b() {
        return this.liveFrame;
    }

    /* JADX INFO: renamed from: c */
    public BLiveVoiceRoomFeed m106730c() {
        return this.roomFeed;
    }

    /* JADX INFO: renamed from: d */
    public int m106731d() {
        return this.styleIndex;
    }

    /* JADX INFO: renamed from: e */
    public LiveCardTrackData m106732e() {
        return this.trackData;
    }

    /* JADX INFO: renamed from: f */
    public LiveCardTrackData m106733f() {
        return this.whiteMCTrackData;
    }

    /* JADX INFO: renamed from: g */
    public boolean m106734g() {
        return this.isShowRegion;
    }

    /* JADX INFO: renamed from: h */
    public void m106735h(LiveGoAction liveGoAction) {
        this.goAction = liveGoAction;
    }

    /* JADX INFO: renamed from: i */
    public void m106736i(BLiveFrame bLiveFrame) {
        this.liveFrame = bLiveFrame;
    }

    /* JADX INFO: renamed from: j */
    public void m106737j(boolean z) {
        this.isShowRegion = z;
    }

    /* JADX INFO: renamed from: k */
    public void m106738k(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }

    /* JADX INFO: renamed from: l */
    public void m106739l(LiveCardTrackData liveCardTrackData) {
        this.whiteMCTrackData = liveCardTrackData;
    }
}

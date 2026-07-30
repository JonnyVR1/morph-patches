package com.p046p1.mobile.putong.live.external.internal.live.square.api;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityDesc;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p149l.gl3;
import p149l.gld0;
import p149l.mqi0;
import p149l.s9s;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesEntry {
    public static final int ORIGIN = 2;
    public static final int READ = 1;
    public static final int SIGN_IN = 3;
    public static final int START_LIVE = 4;
    public static final int UNREAD = 0;
    public static final int VIDEO_CARD = 5;
    private final BLiveActivitySummary liveActivitySummary;

    @Nullable
    private BLiveEntranceSummary liveEntranceSummary;
    private int mState;
    private Throwable throwable;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public LiveActivitiesEntry(BLiveEnvelope bLiveEnvelope) {
        this.liveEntranceSummary = null;
        this.throwable = null;
        this.mState = 2;
        if (vwb.m200296J(bLiveEnvelope.data.liveActivitySummaries)) {
            this.liveActivitySummary = BLiveActivitySummary.new_();
        } else {
            this.liveActivitySummary = bLiveEnvelope.data.liveActivitySummaries.get(0);
        }
        calculateState();
    }

    private LiveActivitiesEntry calculateState() {
        if (vwb.m200296J(this.liveActivitySummary.ongoingLiveIds)) {
            this.mState = 2;
            return this;
        }
        this.mState = this.liveActivitySummary.description.redDotNum > 0 ? 0 : 1;
        return this;
    }

    public LiveActivitiesEntry forceState(int i) {
        this.mState = i;
        return this;
    }

    public BLiveActivitySummary getLiveActivitySummary() {
        return this.liveActivitySummary;
    }

    @Nullable
    public BLiveEntranceSummary getLiveEntranceSummary() {
        return this.liveEntranceSummary;
    }

    public int getState() {
        return this.mState;
    }

    public boolean hasError() {
        return this.throwable != null;
    }

    public boolean hasUnreadCount() {
        BLiveActivitySummary bLiveActivitySummary = this.liveActivitySummary;
        return bLiveActivitySummary != null && bLiveActivitySummary.description.redDotNum > 0;
    }

    public boolean needShowActivitiesRedDot() {
        int iM195919q3;
        BLiveActivitySummary bLiveActivitySummary = this.liveActivitySummary;
        if (bLiveActivitySummary == null) {
            return false;
        }
        BLiveActivityDesc bLiveActivityDesc = bLiveActivitySummary.description;
        return bLiveActivityDesc.redDotNum <= 0 && bLiveActivityDesc.showRedDot && (iM195919q3 = s9s.f163228b.m195919q3()) != 0 && mqi0.m155944o() - ((gl3) s9s.m182763m(gld0.f103315e)).f103280a.get().longValue() >= ((long) iM195919q3) * 86400000;
    }

    public void setEntranceSummary(BLiveEntranceSummary bLiveEntranceSummary) {
        this.liveEntranceSummary = bLiveEntranceSummary;
    }

    public boolean showReddot() {
        return needShowActivitiesRedDot() || hasUnreadCount();
    }

    public LiveActivitiesEntry(Throwable th) {
        this.liveEntranceSummary = null;
        this.throwable = null;
        this.mState = 2;
        this.liveActivitySummary = BLiveActivitySummary.new_();
        this.throwable = th;
        calculateState();
    }
}

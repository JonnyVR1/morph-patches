package com.p051p1.mobile.putong.live.external.internal.live.square.api;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityDesc;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p153l.fm3;
import p153l.itd0;
import p153l.jyb;
import p153l.pzi0;
import p153l.tbs;

/* JADX INFO: loaded from: classes9.dex */
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
        if (jyb.m147479J(bLiveEnvelope.data.liveActivitySummaries)) {
            this.liveActivitySummary = BLiveActivitySummary.new_();
        } else {
            this.liveActivitySummary = bLiveEnvelope.data.liveActivitySummaries.get(0);
        }
        calculateState();
    }

    private LiveActivitiesEntry calculateState() {
        if (jyb.m147479J(this.liveActivitySummary.ongoingLiveIds)) {
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
        int iM203706q3;
        BLiveActivitySummary bLiveActivitySummary = this.liveActivitySummary;
        if (bLiveActivitySummary == null) {
            return false;
        }
        BLiveActivityDesc bLiveActivityDesc = bLiveActivitySummary.description;
        return bLiveActivityDesc.redDotNum <= 0 && bLiveActivityDesc.showRedDot && (iM203706q3 = tbs.f172989b.m203706q3()) != 0 && pzi0.m174454o() - ((fm3) tbs.m190077m(itd0.f116823e)).f99711a.get().longValue() >= ((long) iM203706q3) * 86400000;
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

package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class qrr {

    /* JADX INFO: renamed from: a */
    @Nullable
    public BLiveActivitySummary f159158a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public BLiveEntranceSummary f159159b;

    /* JADX INFO: renamed from: c */
    public Throwable f159160c;

    /* JADX INFO: renamed from: d */
    public int f159161d;

    public qrr(BLiveEnvelope bLiveEnvelope) {
        this.f159158a = null;
        this.f159159b = null;
        this.f159160c = null;
        this.f159161d = 2;
        if (!jyb.m147479J(bLiveEnvelope.data.liveActivitySummaries)) {
            this.f159158a = bLiveEnvelope.data.liveActivitySummaries.get(0);
        }
        if (jyb.m147479J(bLiveEnvelope.data.squareEntranceSummary)) {
            return;
        }
        this.f159159b = bLiveEnvelope.data.squareEntranceSummary.get(0);
    }

    /* JADX INFO: renamed from: a */
    public qrr m177595a() {
        this.f159161d = m177605k();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public qrr m177596b(int i) {
        this.f159161d = i;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public BLiveSquareDetailCounters m177597c() {
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters;
        BLiveActivitySummary bLiveActivitySummary = this.f159158a;
        if (bLiveActivitySummary == null || (bLiveActivitySummaryCounters = bLiveActivitySummary.counters) == null) {
            return null;
        }
        return bLiveActivitySummaryCounters.squareDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public BLiveActivitySummary m177598d() {
        return this.f159158a;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public BLiveEntranceSummary m177599e() {
        return this.f159159b;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m177600f() {
        BLiveActivitySummary bLiveActivitySummary = this.f159158a;
        return bLiveActivitySummary != null ? bLiveActivitySummary.icons : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public int m177601g() {
        return this.f159161d;
    }

    /* JADX INFO: renamed from: h */
    public boolean m177602h() {
        return this.f159160c != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m177603i() {
        return !jyb.m147479J(m177600f());
    }

    /* JADX INFO: renamed from: j */
    public boolean m177604j() {
        BLiveSquareDetailCounters bLiveSquareDetailCountersM177597c = m177597c();
        return bLiveSquareDetailCountersM177597c != null && bLiveSquareDetailCountersM177597c.unreadCount > 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m177605k() {
        BLiveSquareDetailCounters bLiveSquareDetailCountersM177597c = m177597c();
        BLiveActivitySummary bLiveActivitySummary = this.f159158a;
        boolean z = (bLiveActivitySummary == null || jyb.m147479J(bLiveActivitySummary.ongoingLiveIds)) ? false : true;
        if (bLiveSquareDetailCountersM177597c == null || bLiveSquareDetailCountersM177597c.unreadCount <= 0) {
            return z ? 1 : 2;
        }
        return z ? 0 : 2;
    }

    /* JADX INFO: renamed from: l */
    public qrr m177606l(qrr qrrVar) {
        int i;
        if (m177597c() != null && this.f159161d == 0) {
            BLiveSquareDetailCounters bLiveSquareDetailCountersM177597c = m177597c();
            BLiveSquareDetailCounters bLiveSquareDetailCountersM177597c2 = qrrVar.m177597c();
            if (bLiveSquareDetailCountersM177597c2 != null && (i = bLiveSquareDetailCountersM177597c2.unreadCount) < bLiveSquareDetailCountersM177597c.unreadCount) {
                if (i == 0 && qrrVar.m177598d() != null && m177598d() != null) {
                    qrrVar.m177598d().description = m177598d().description;
                }
                bLiveSquareDetailCountersM177597c2.unreadCount = bLiveSquareDetailCountersM177597c.unreadCount;
            }
        }
        return qrrVar;
    }

    public qrr(Throwable th) {
        this.f159158a = null;
        this.f159159b = null;
        this.f159161d = 2;
        this.f159160c = th;
    }
}

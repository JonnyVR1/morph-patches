package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.drm.C1876a;
import com.google.android.exoplayer2.drm.InterfaceC1878c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC1957a;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.source.InterfaceC1989j;
import com.google.android.exoplayer2.source.InterfaceC1990k;
import com.google.android.exoplayer2.source.hls.playlist.C1985a;
import com.google.android.exoplayer2.source.hls.playlist.C1986b;
import com.google.android.exoplayer2.source.hls.playlist.C1987c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2071b;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import java.io.IOException;
import java.util.List;
import p153l.bmk0;
import p153l.epd;
import p153l.et5;
import p153l.g5l;
import p153l.g6c;
import p153l.gpd;
import p153l.h5l;
import p153l.i5l;
import p153l.l5l;
import p153l.lqf0;
import p153l.mni;
import p153l.n5l;
import p153l.oj0;
import p153l.pgj0;
import p153l.snd;
import p153l.t9f;
import p153l.w11;
import p153l.zb5;
import p153l.zde;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class HlsMediaSource extends AbstractC1957a implements HlsPlaylistTracker.InterfaceC1984c {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;

    @Nullable
    private final zb5 cmcdConfiguration;
    private final et5 compositeSequenceableLoaderFactory;
    private final g5l dataSourceFactory;
    private final InterfaceC1878c drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final h5l extractorFactory;
    private C1944n.g liveConfiguration;
    private final InterfaceC2072c loadErrorHandlingPolicy;
    private final C1944n.h localConfiguration;
    private final C1944n mediaItem;

    @Nullable
    private pgj0 mediaTransferListener;
    private final int metadataType;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final boolean useSessionKeys;

    static {
        t9f.m189752a("goog.exo.hls");
    }

    private HlsMediaSource(C1944n c1944n, g5l g5lVar, h5l h5lVar, et5 et5Var, @Nullable zb5 zb5Var, InterfaceC1878c interfaceC1878c, InterfaceC2072c interfaceC2072c, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2, long j2) {
        this.localConfiguration = (C1944n.h) w11.m204369e(c1944n.f7997b);
        this.mediaItem = c1944n;
        this.liveConfiguration = c1944n.f7999d;
        this.dataSourceFactory = g5lVar;
        this.extractorFactory = h5lVar;
        this.compositeSequenceableLoaderFactory = et5Var;
        this.drmSessionManager = interfaceC1878c;
        this.loadErrorHandlingPolicy = interfaceC2072c;
        this.playlistTracker = hlsPlaylistTracker;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.timestampAdjusterInitializationTimeoutMs = j2;
    }

    private lqf0 createTimelineForLive(C1986b c1986b, long j, long j2, i5l i5lVar) {
        long jMo11244b = c1986b.f8625h - this.playlistTracker.mo11244b();
        long j3 = c1986b.f8632o ? jMo11244b + c1986b.f8638u : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(c1986b);
        long j4 = this.liveConfiguration.f8076a;
        updateLiveConfiguration(c1986b, bmk0.m105164r(j4 != -9223372036854775807L ? bmk0.m105084J0(j4) : getTargetLiveOffsetUs(c1986b, liveEdgeOffsetUs), liveEdgeOffsetUs, c1986b.f8638u + liveEdgeOffsetUs));
        return new lqf0(j, j2, -9223372036854775807L, j3, c1986b.f8638u, jMo11244b, getLiveWindowDefaultStartPositionUs(c1986b, liveEdgeOffsetUs), true, !c1986b.f8632o, c1986b.f8621d == 2 && c1986b.f8623f, i5lVar, this.mediaItem, this.liveConfiguration);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    private lqf0 createTimelineForOnDemand(C1986b c1986b, long j, long j2, i5l i5lVar) {
        long j3;
        if (c1986b.f8622e == -9223372036854775807L || c1986b.f8635r.isEmpty()) {
            j3 = 0;
        } else if (c1986b.f8624g) {
            j3 = c1986b.f8622e;
        } else {
            long j4 = c1986b.f8622e;
            if (j4 == c1986b.f8638u) {
                j3 = c1986b.f8622e;
            } else {
                j3 = findClosestPrecedingSegment(c1986b.f8635r, j4).f8651e;
            }
        }
        long j5 = j3;
        long j6 = c1986b.f8638u;
        return new lqf0(j, j2, -9223372036854775807L, j6, j6, 0L, j5, true, false, true, i5lVar, this.mediaItem, null);
    }

    @Nullable
    private static C1986b.b findClosestPrecedingIndependentPart(List<C1986b.b> list, long j) {
        C1986b.b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            C1986b.b bVar2 = list.get(i);
            long j2 = bVar2.f8651e;
            if (j2 > j || !bVar2.f8640l) {
                if (j2 > j) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static C1986b.d findClosestPrecedingSegment(List<C1986b.d> list, long j) {
        return list.get(bmk0.m105132f(list, Long.valueOf(j), true, true));
    }

    private long getLiveEdgeOffsetUs(C1986b c1986b) {
        if (c1986b.f8633p) {
            return bmk0.m105084J0(bmk0.m105130e0(this.elapsedRealTimeOffsetMs)) - c1986b.m11311e();
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(C1986b c1986b, long j) {
        long jM105084J0 = c1986b.f8622e;
        if (jM105084J0 == -9223372036854775807L) {
            jM105084J0 = (c1986b.f8638u + j) - bmk0.m105084J0(this.liveConfiguration.f8076a);
        }
        if (c1986b.f8624g) {
            return jM105084J0;
        }
        C1986b.b bVarFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(c1986b.f8636s, jM105084J0);
        if (bVarFindClosestPrecedingIndependentPart != null) {
            return bVarFindClosestPrecedingIndependentPart.f8651e;
        }
        if (c1986b.f8635r.isEmpty()) {
            return 0L;
        }
        C1986b.d dVarFindClosestPrecedingSegment = findClosestPrecedingSegment(c1986b.f8635r, jM105084J0);
        C1986b.b bVarFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(dVarFindClosestPrecedingSegment.f8646m, jM105084J0);
        return bVarFindClosestPrecedingIndependentPart2 != null ? bVarFindClosestPrecedingIndependentPart2.f8651e : dVarFindClosestPrecedingSegment.f8651e;
    }

    private static long getTargetLiveOffsetUs(C1986b c1986b, long j) {
        long j2;
        C1986b.f fVar = c1986b.f8639v;
        long j3 = c1986b.f8622e;
        if (j3 != -9223372036854775807L) {
            j2 = c1986b.f8638u - j3;
        } else {
            long j4 = fVar.f8661d;
            if (j4 == -9223372036854775807L || c1986b.f8631n == -9223372036854775807L) {
                long j5 = fVar.f8660c;
                j2 = j5 != -9223372036854775807L ? j5 : c1986b.f8630m * 3;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    private void updateLiveConfiguration(C1986b c1986b, long j) {
        boolean z;
        C1944n.g gVar = this.mediaItem.f7999d;
        if (gVar.f8079d == -3.4028235E38f && gVar.f8080e == -3.4028235E38f) {
            C1986b.f fVar = c1986b.f8639v;
            if (fVar.f8660c == -9223372036854775807L && fVar.f8661d == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.liveConfiguration = new C1944n.g.a().m10741k(bmk0.m105152l1(j)).m10740j(z ? 1.0f : this.liveConfiguration.f8079d).m10738h(z ? 1.0f : this.liveConfiguration.f8080e).m10736f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        InterfaceC1989j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        return new l5l(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, null, this.drmSessionManager, createDrmEventDispatcher(bVar), this.loadErrorHandlingPolicy, aVarCreateEventDispatcher, oj0Var, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId(), this.timestampAdjusterInitializationTimeoutMs);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    @Nullable
    public /* bridge */ /* synthetic */ AbstractC1857c0 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.mo11253k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1984c
    public void onPrimaryPlaylistRefreshed(C1986b c1986b) {
        HlsMediaSource hlsMediaSource;
        lqf0 lqf0VarCreateTimelineForOnDemand;
        long jM105152l1 = c1986b.f8633p ? bmk0.m105152l1(c1986b.f8625h) : -9223372036854775807L;
        int i = c1986b.f8621d;
        long j = (i == 2 || i == 1) ? jM105152l1 : -9223372036854775807L;
        i5l i5lVar = new i5l((C1987c) w11.m204369e(this.playlistTracker.mo11247e()), c1986b);
        if (this.playlistTracker.mo11251i()) {
            hlsMediaSource = this;
            lqf0VarCreateTimelineForOnDemand = hlsMediaSource.createTimelineForLive(c1986b, j, jM105152l1, i5lVar);
        } else {
            hlsMediaSource = this;
            lqf0VarCreateTimelineForOnDemand = hlsMediaSource.createTimelineForOnDemand(c1986b, j, jM105152l1, i5lVar);
        }
        hlsMediaSource.refreshSourceInfo(lqf0VarCreateTimelineForOnDemand);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        this.mediaTransferListener = pgj0Var;
        this.drmSessionManager.mo9931d((Looper) w11.m204369e(Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        this.playlistTracker.mo11245c(this.localConfiguration.f8094a, createEventDispatcher(null), this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        ((l5l) interfaceC1976h).m152966A();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        this.playlistTracker.stop();
        this.drmSessionManager.release();
    }

    public static final class Factory implements InterfaceC1990k {

        /* JADX INFO: renamed from: p */
        public static final /* synthetic */ int f8522p = 0;

        /* JADX INFO: renamed from: c */
        public final g5l f8523c;

        /* JADX INFO: renamed from: d */
        public h5l f8524d;

        /* JADX INFO: renamed from: e */
        public n5l f8525e;

        /* JADX INFO: renamed from: f */
        public HlsPlaylistTracker.InterfaceC1982a f8526f;

        /* JADX INFO: renamed from: g */
        public et5 f8527g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public zb5.InterfaceC21789a f8528h;

        /* JADX INFO: renamed from: i */
        public zde f8529i;

        /* JADX INFO: renamed from: j */
        public InterfaceC2072c f8530j;

        /* JADX INFO: renamed from: k */
        public boolean f8531k;

        /* JADX INFO: renamed from: l */
        public int f8532l;

        /* JADX INFO: renamed from: m */
        public boolean f8533m;

        /* JADX INFO: renamed from: n */
        public long f8534n;

        /* JADX INFO: renamed from: o */
        public long f8535o;

        public Factory(g5l g5lVar) {
            this.f8523c = (g5l) w11.m204369e(g5lVar);
            this.f8529i = new C1876a();
            this.f8525e = new gpd();
            this.f8526f = C1985a.f8593p;
            this.f8524d = h5l.f107951a;
            this.f8530j = new C2071b();
            this.f8527g = new snd();
            this.f8532l = 1;
            this.f8534n = -9223372036854775807L;
            this.f8531k = true;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource mo11012c(C1944n c1944n) {
            w11.m204369e(c1944n.f7997b);
            n5l mniVar = this.f8525e;
            List<StreamKey> list = c1944n.f7997b.f8098e;
            if (!list.isEmpty()) {
                mniVar = new mni(mniVar, list);
            }
            zb5.InterfaceC21789a interfaceC21789a = this.f8528h;
            if (interfaceC21789a != null) {
                interfaceC21789a.m219186a(c1944n);
            }
            g5l g5lVar = this.f8523c;
            h5l h5lVar = this.f8524d;
            et5 et5Var = this.f8527g;
            InterfaceC1878c interfaceC1878cMo9964a = this.f8529i.mo9964a(c1944n);
            InterfaceC2072c interfaceC2072c = this.f8530j;
            return new HlsMediaSource(c1944n, g5lVar, h5lVar, et5Var, null, interfaceC1878cMo9964a, interfaceC2072c, this.f8526f.mo11255a(this.f8523c, interfaceC2072c, mniVar), this.f8534n, this.f8531k, this.f8532l, this.f8533m, this.f8535o);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo11013d(zb5.InterfaceC21789a interfaceC21789a) {
            this.f8528h = (zb5.InterfaceC21789a) w11.m204369e(interfaceC21789a);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo11010a(zde zdeVar) {
            this.f8529i = (zde) w11.m204370f(zdeVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo11011b(InterfaceC2072c interfaceC2072c) {
            this.f8530j = (InterfaceC2072c) w11.m204370f(interfaceC2072c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(g6c.InterfaceC17163a interfaceC17163a) {
            this(new epd(interfaceC17163a));
        }
    }
}

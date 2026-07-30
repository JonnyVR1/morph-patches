package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.drm.C1853a;
import com.google.android.exoplayer2.drm.InterfaceC1855c;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.AbstractC1934a;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.source.InterfaceC1966j;
import com.google.android.exoplayer2.source.InterfaceC1967k;
import com.google.android.exoplayer2.source.hls.playlist.C1962a;
import com.google.android.exoplayer2.source.hls.playlist.C1963b;
import com.google.android.exoplayer2.source.hls.playlist.C1964c;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.C2048b;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import java.io.IOException;
import java.util.List;
import p149l.a5c;
import p149l.as5;
import p149l.bod;
import p149l.cif0;
import p149l.l7j0;
import p149l.mmd;
import p149l.n8f;
import p149l.p11;
import p149l.q2l;
import p149l.qki;
import p149l.r2l;
import p149l.s2l;
import p149l.sj0;
import p149l.v2l;
import p149l.vce;
import p149l.vck0;
import p149l.x2l;
import p149l.za5;
import p149l.znd;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class HlsMediaSource extends AbstractC1934a implements HlsPlaylistTracker.InterfaceC1961c {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;

    @Nullable
    private final za5 cmcdConfiguration;
    private final as5 compositeSequenceableLoaderFactory;
    private final q2l dataSourceFactory;
    private final InterfaceC1855c drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final r2l extractorFactory;
    private C1921n.g liveConfiguration;
    private final InterfaceC2049c loadErrorHandlingPolicy;
    private final C1921n.h localConfiguration;
    private final C1921n mediaItem;

    @Nullable
    private l7j0 mediaTransferListener;
    private final int metadataType;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private final boolean useSessionKeys;

    static {
        n8f.m158492a("goog.exo.hls");
    }

    private HlsMediaSource(C1921n c1921n, q2l q2lVar, r2l r2lVar, as5 as5Var, @Nullable za5 za5Var, InterfaceC1855c interfaceC1855c, InterfaceC2049c interfaceC2049c, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2, long j2) {
        this.localConfiguration = (C1921n.h) p11.m167011e(c1921n.f7960b);
        this.mediaItem = c1921n;
        this.liveConfiguration = c1921n.f7962d;
        this.dataSourceFactory = q2lVar;
        this.extractorFactory = r2lVar;
        this.compositeSequenceableLoaderFactory = as5Var;
        this.drmSessionManager = interfaceC1855c;
        this.loadErrorHandlingPolicy = interfaceC2049c;
        this.playlistTracker = hlsPlaylistTracker;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.timestampAdjusterInitializationTimeoutMs = j2;
    }

    private cif0 createTimelineForLive(C1963b c1963b, long j, long j2, s2l s2lVar) {
        long jMo11190b = c1963b.f8588h - this.playlistTracker.mo11190b();
        long j3 = c1963b.f8595o ? jMo11190b + c1963b.f8601u : -9223372036854775807L;
        long liveEdgeOffsetUs = getLiveEdgeOffsetUs(c1963b);
        long j4 = this.liveConfiguration.f8039a;
        updateLiveConfiguration(c1963b, vck0.m197886r(j4 != -9223372036854775807L ? vck0.m197806J0(j4) : getTargetLiveOffsetUs(c1963b, liveEdgeOffsetUs), liveEdgeOffsetUs, c1963b.f8601u + liveEdgeOffsetUs));
        return new cif0(j, j2, -9223372036854775807L, j3, c1963b.f8601u, jMo11190b, getLiveWindowDefaultStartPositionUs(c1963b, liveEdgeOffsetUs), true, !c1963b.f8595o, c1963b.f8584d == 2 && c1963b.f8586f, s2lVar, this.mediaItem, this.liveConfiguration);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    private cif0 createTimelineForOnDemand(C1963b c1963b, long j, long j2, s2l s2lVar) {
        long j3;
        if (c1963b.f8585e == -9223372036854775807L || c1963b.f8598r.isEmpty()) {
            j3 = 0;
        } else if (c1963b.f8587g) {
            j3 = c1963b.f8585e;
        } else {
            long j4 = c1963b.f8585e;
            if (j4 == c1963b.f8601u) {
                j3 = c1963b.f8585e;
            } else {
                j3 = findClosestPrecedingSegment(c1963b.f8598r, j4).f8614e;
            }
        }
        long j5 = j3;
        long j6 = c1963b.f8601u;
        return new cif0(j, j2, -9223372036854775807L, j6, j6, 0L, j5, true, false, true, s2lVar, this.mediaItem, null);
    }

    @Nullable
    private static C1963b.b findClosestPrecedingIndependentPart(List<C1963b.b> list, long j) {
        C1963b.b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            C1963b.b bVar2 = list.get(i);
            long j2 = bVar2.f8614e;
            if (j2 > j || !bVar2.f8603l) {
                if (j2 > j) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    private static C1963b.d findClosestPrecedingSegment(List<C1963b.d> list, long j) {
        return list.get(vck0.m197854f(list, Long.valueOf(j), true, true));
    }

    private long getLiveEdgeOffsetUs(C1963b c1963b) {
        if (c1963b.f8596p) {
            return vck0.m197806J0(vck0.m197852e0(this.elapsedRealTimeOffsetMs)) - c1963b.m11257e();
        }
        return 0L;
    }

    private long getLiveWindowDefaultStartPositionUs(C1963b c1963b, long j) {
        long jM197806J0 = c1963b.f8585e;
        if (jM197806J0 == -9223372036854775807L) {
            jM197806J0 = (c1963b.f8601u + j) - vck0.m197806J0(this.liveConfiguration.f8039a);
        }
        if (c1963b.f8587g) {
            return jM197806J0;
        }
        C1963b.b bVarFindClosestPrecedingIndependentPart = findClosestPrecedingIndependentPart(c1963b.f8599s, jM197806J0);
        if (bVarFindClosestPrecedingIndependentPart != null) {
            return bVarFindClosestPrecedingIndependentPart.f8614e;
        }
        if (c1963b.f8598r.isEmpty()) {
            return 0L;
        }
        C1963b.d dVarFindClosestPrecedingSegment = findClosestPrecedingSegment(c1963b.f8598r, jM197806J0);
        C1963b.b bVarFindClosestPrecedingIndependentPart2 = findClosestPrecedingIndependentPart(dVarFindClosestPrecedingSegment.f8609m, jM197806J0);
        return bVarFindClosestPrecedingIndependentPart2 != null ? bVarFindClosestPrecedingIndependentPart2.f8614e : dVarFindClosestPrecedingSegment.f8614e;
    }

    private static long getTargetLiveOffsetUs(C1963b c1963b, long j) {
        long j2;
        C1963b.f fVar = c1963b.f8602v;
        long j3 = c1963b.f8585e;
        if (j3 != -9223372036854775807L) {
            j2 = c1963b.f8601u - j3;
        } else {
            long j4 = fVar.f8624d;
            if (j4 == -9223372036854775807L || c1963b.f8594n == -9223372036854775807L) {
                long j5 = fVar.f8623c;
                j2 = j5 != -9223372036854775807L ? j5 : c1963b.f8593m * 3;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    private void updateLiveConfiguration(C1963b c1963b, long j) {
        boolean z;
        C1921n.g gVar = this.mediaItem.f7962d;
        if (gVar.f8042d == -3.4028235E38f && gVar.f8043e == -3.4028235E38f) {
            C1963b.f fVar = c1963b.f8602v;
            if (fVar.f8623c == -9223372036854775807L && fVar.f8624d == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.liveConfiguration = new C1921n.g.a().m10687k(vck0.m197874l1(j)).m10686j(z ? 1.0f : this.liveConfiguration.f8042d).m10684h(z ? 1.0f : this.liveConfiguration.f8043e).m10682f();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        InterfaceC1966j.a aVarCreateEventDispatcher = createEventDispatcher(bVar);
        return new v2l(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, null, this.drmSessionManager, createDrmEventDispatcher(bVar), this.loadErrorHandlingPolicy, aVarCreateEventDispatcher, sj0Var, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys, getPlayerId(), this.timestampAdjusterInitializationTimeoutMs);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    @Nullable
    public /* bridge */ /* synthetic */ AbstractC1834c0 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.mediaItem;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.mo11199k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.InterfaceC1961c
    public void onPrimaryPlaylistRefreshed(C1963b c1963b) {
        HlsMediaSource hlsMediaSource;
        cif0 cif0VarCreateTimelineForOnDemand;
        long jM197874l1 = c1963b.f8596p ? vck0.m197874l1(c1963b.f8588h) : -9223372036854775807L;
        int i = c1963b.f8584d;
        long j = (i == 2 || i == 1) ? jM197874l1 : -9223372036854775807L;
        s2l s2lVar = new s2l((C1964c) p11.m167011e(this.playlistTracker.mo11193e()), c1963b);
        if (this.playlistTracker.mo11197i()) {
            hlsMediaSource = this;
            cif0VarCreateTimelineForOnDemand = hlsMediaSource.createTimelineForLive(c1963b, j, jM197874l1, s2lVar);
        } else {
            hlsMediaSource = this;
            cif0VarCreateTimelineForOnDemand = hlsMediaSource.createTimelineForOnDemand(c1963b, j, jM197874l1, s2lVar);
        }
        hlsMediaSource.refreshSourceInfo(cif0VarCreateTimelineForOnDemand);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        this.mediaTransferListener = l7j0Var;
        this.drmSessionManager.mo9877d((Looper) p11.m167011e(Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        this.playlistTracker.mo11191c(this.localConfiguration.f8057a, createEventDispatcher(null), this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        ((v2l) interfaceC1953h).m196801A();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        this.playlistTracker.stop();
        this.drmSessionManager.release();
    }

    public static final class Factory implements InterfaceC1967k {

        /* JADX INFO: renamed from: p */
        public static final /* synthetic */ int f8485p = 0;

        /* JADX INFO: renamed from: c */
        public final q2l f8486c;

        /* JADX INFO: renamed from: d */
        public r2l f8487d;

        /* JADX INFO: renamed from: e */
        public x2l f8488e;

        /* JADX INFO: renamed from: f */
        public HlsPlaylistTracker.InterfaceC1959a f8489f;

        /* JADX INFO: renamed from: g */
        public as5 f8490g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public za5.InterfaceC21651a f8491h;

        /* JADX INFO: renamed from: i */
        public vce f8492i;

        /* JADX INFO: renamed from: j */
        public InterfaceC2049c f8493j;

        /* JADX INFO: renamed from: k */
        public boolean f8494k;

        /* JADX INFO: renamed from: l */
        public int f8495l;

        /* JADX INFO: renamed from: m */
        public boolean f8496m;

        /* JADX INFO: renamed from: n */
        public long f8497n;

        /* JADX INFO: renamed from: o */
        public long f8498o;

        public Factory(q2l q2lVar) {
            this.f8486c = (q2l) p11.m167011e(q2lVar);
            this.f8492i = new C1853a();
            this.f8488e = new bod();
            this.f8489f = C1962a.f8556p;
            this.f8487d = r2l.f157424a;
            this.f8493j = new C2048b();
            this.f8490g = new mmd();
            this.f8495l = 1;
            this.f8497n = -9223372036854775807L;
            this.f8494k = true;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource mo10958c(C1921n c1921n) {
            p11.m167011e(c1921n.f7960b);
            x2l qkiVar = this.f8488e;
            List<StreamKey> list = c1921n.f7960b.f8061e;
            if (!list.isEmpty()) {
                qkiVar = new qki(qkiVar, list);
            }
            za5.InterfaceC21651a interfaceC21651a = this.f8491h;
            if (interfaceC21651a != null) {
                interfaceC21651a.m217721a(c1921n);
            }
            q2l q2lVar = this.f8486c;
            r2l r2lVar = this.f8487d;
            as5 as5Var = this.f8490g;
            InterfaceC1855c interfaceC1855cMo9910a = this.f8492i.mo9910a(c1921n);
            InterfaceC2049c interfaceC2049c = this.f8493j;
            return new HlsMediaSource(c1921n, q2lVar, r2lVar, as5Var, null, interfaceC1855cMo9910a, interfaceC2049c, this.f8489f.mo11201a(this.f8486c, interfaceC2049c, qkiVar), this.f8497n, this.f8494k, this.f8495l, this.f8496m, this.f8498o);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo10959d(za5.InterfaceC21651a interfaceC21651a) {
            this.f8491h = (za5.InterfaceC21651a) p11.m167011e(interfaceC21651a);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo10956a(vce vceVar) {
            this.f8492i = (vce) p11.m167012f(vceVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo10957b(InterfaceC2049c interfaceC2049c) {
            this.f8493j = (InterfaceC2049c) p11.m167012f(interfaceC2049c, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(a5c.InterfaceC15531a interfaceC15531a) {
            this(new znd(interfaceC15531a));
        }
    }
}

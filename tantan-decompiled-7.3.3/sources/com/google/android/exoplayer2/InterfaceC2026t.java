package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.List;
import p153l.agj0;
import p153l.bmk0;
import p153l.k950;
import p153l.myb;
import p153l.qyb;
import p153l.zjl0;
import p153l.zri;

/* JADX INFO: renamed from: com.google.android.exoplayer2.t */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2026t {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$b */
    public static final class b implements InterfaceC1886e {

        /* JADX INFO: renamed from: b */
        public static final b f9128b = new a().m11804e();

        /* JADX INFO: renamed from: c */
        public static final String f9129c = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: d */
        public static final InterfaceC1886e.a<b> f9130d = new InterfaceC1886e.a() { // from class: l.je80
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return InterfaceC2026t.b.m11798d(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final zri f9131a;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.t$b$a */
        public static final class a {

            /* JADX INFO: renamed from: b */
            public static final int[] f9132b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a */
            public final zri.C21871b f9133a = new zri.C21871b();

            /* JADX INFO: renamed from: a */
            public a m11800a(int i) {
                this.f9133a.m221160a(i);
                return this;
            }

            /* JADX INFO: renamed from: b */
            public a m11801b(b bVar) {
                this.f9133a.m221161b(bVar.f9131a);
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m11802c(int... iArr) {
                this.f9133a.m221162c(iArr);
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m11803d(int i, boolean z) {
                this.f9133a.m221163d(i, z);
                return this;
            }

            /* JADX INFO: renamed from: e */
            public b m11804e() {
                return new b(this.f9133a.m221164e());
            }
        }

        public b(zri zriVar) {
            this.f9131a = zriVar;
        }

        /* JADX INFO: renamed from: d */
        public static b m11798d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f9129c);
            if (integerArrayList == null) {
                return f9128b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.m11800a(integerArrayList.get(i).intValue());
            }
            return aVar.m11804e();
        }

        /* JADX INFO: renamed from: c */
        public boolean m11799c(int i) {
            return this.f9131a.m221156a(i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f9131a.equals(((b) obj).f9131a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9131a.hashCode();
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.f9131a.m221159d(); i++) {
                arrayList.add(Integer.valueOf(this.f9131a.m221158c(i)));
            }
            bundle.putIntegerArrayList(f9129c, arrayList);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final zri f9134a;

        public c(zri zriVar) {
            this.f9134a = zriVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11805a(int i) {
            return this.f9134a.m221156a(i);
        }

        /* JADX INFO: renamed from: b */
        public boolean m11806b(int... iArr) {
            return this.f9134a.m221157b(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f9134a.equals(((c) obj).f9134a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9134a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$e */
    public static final class e implements InterfaceC1886e {

        /* JADX INFO: renamed from: k */
        public static final String f9135k = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: l */
        public static final String f9136l = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: m */
        public static final String f9137m = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: n */
        public static final String f9138n = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: o */
        public static final String f9139o = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: p */
        public static final String f9140p = bmk0.m105181z0(5);

        /* JADX INFO: renamed from: q */
        public static final String f9141q = bmk0.m105181z0(6);

        /* JADX INFO: renamed from: r */
        public static final InterfaceC1886e.a<e> f9142r = new InterfaceC1886e.a() { // from class: l.ke80
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return InterfaceC2026t.e.m11842b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Object f9143a;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final int f9144b;

        /* JADX INFO: renamed from: c */
        public final int f9145c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final C1944n f9146d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Object f9147e;

        /* JADX INFO: renamed from: f */
        public final int f9148f;

        /* JADX INFO: renamed from: g */
        public final long f9149g;

        /* JADX INFO: renamed from: h */
        public final long f9150h;

        /* JADX INFO: renamed from: i */
        public final int f9151i;

        /* JADX INFO: renamed from: j */
        public final int f9152j;

        public e(@Nullable Object obj, int i, @Nullable C1944n c1944n, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f9143a = obj;
            this.f9144b = i;
            this.f9145c = i;
            this.f9146d = c1944n;
            this.f9147e = obj2;
            this.f9148f = i2;
            this.f9149g = j;
            this.f9150h = j2;
            this.f9151i = i3;
            this.f9152j = i4;
        }

        /* JADX INFO: renamed from: b */
        public static e m11842b(Bundle bundle) {
            int i = bundle.getInt(f9135k, 0);
            Bundle bundle2 = bundle.getBundle(f9136l);
            return new e(null, i, bundle2 == null ? null : (C1944n) C1944n.f7995p.mo10034a(bundle2), null, bundle.getInt(f9137m, 0), bundle.getLong(f9138n, 0L), bundle.getLong(f9139o, 0L), bundle.getInt(f9140p, -1), bundle.getInt(f9141q, -1));
        }

        /* JADX INFO: renamed from: c */
        public Bundle m11843c(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putInt(f9135k, z2 ? this.f9145c : 0);
            C1944n c1944n = this.f9146d;
            if (c1944n != null && z) {
                bundle.putBundle(f9136l, c1944n.toBundle());
            }
            bundle.putInt(f9137m, z2 ? this.f9148f : 0);
            bundle.putLong(f9138n, z ? this.f9149g : 0L);
            bundle.putLong(f9139o, z ? this.f9150h : 0L);
            bundle.putInt(f9140p, z ? this.f9151i : -1);
            bundle.putInt(f9141q, z ? this.f9152j : -1);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f9145c == eVar.f9145c && this.f9148f == eVar.f9148f && this.f9149g == eVar.f9149g && this.f9150h == eVar.f9150h && this.f9151i == eVar.f9151i && this.f9152j == eVar.f9152j && k950.m148863a(this.f9143a, eVar.f9143a) && k950.m148863a(this.f9147e, eVar.f9147e) && k950.m148863a(this.f9146d, eVar.f9146d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return k950.m148864b(this.f9143a, Integer.valueOf(this.f9145c), this.f9146d, this.f9147e, Integer.valueOf(this.f9148f), Long.valueOf(this.f9149g), Long.valueOf(this.f9150h), Integer.valueOf(this.f9151i), Integer.valueOf(this.f9152j));
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            return m11843c(true, true);
        }
    }

    void addListener(d dVar);

    void addMediaItems(int i, List<C1944n> list);

    void clearMediaItems();

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    Looper getApplicationLooper();

    b getAvailableCommands();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    qyb getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    AbstractC1857c0 getCurrentTimeline();

    C1861d0 getCurrentTracks();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    C1945o getMediaMetadata();

    boolean getPlayWhenReady();

    C1953s getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @Nullable
    PlaybackException getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    agj0 getTrackSelectionParameters();

    zjl0 getVideoSize();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCommandAvailable(int i);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItems(int i, int i2, int i3);

    void pause();

    void play();

    void prepare();

    void removeListener(d dVar);

    void removeMediaItems(int i, int i2);

    void replaceMediaItems(int i, int i2, List<C1944n> list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToNext();

    void seekToPrevious();

    void setMediaItems(List<C1944n> list, int i, long j);

    void setMediaItems(List<C1944n> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(C1953s c1953s);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(agj0 agj0Var);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void stop();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$d */
    public interface d {
        @Deprecated
        /* JADX INFO: renamed from: A */
        default void mo11807A(boolean z) {
        }

        /* JADX INFO: renamed from: C */
        default void mo11808C(AbstractC1857c0 abstractC1857c0, int i) {
        }

        /* JADX INFO: renamed from: D */
        default void mo11809D(int i) {
        }

        /* JADX INFO: renamed from: E */
        default void mo11810E(C1945o c1945o) {
        }

        /* JADX INFO: renamed from: F */
        default void mo11811F(boolean z) {
        }

        /* JADX INFO: renamed from: H */
        default void mo11812H(int i, boolean z) {
        }

        /* JADX INFO: renamed from: I */
        default void mo11813I(@Nullable PlaybackException playbackException) {
        }

        /* JADX INFO: renamed from: J */
        default void mo11814J(PlaybackException playbackException) {
        }

        /* JADX INFO: renamed from: M */
        default void mo11816M(C1841a c1841a) {
        }

        /* JADX INFO: renamed from: O */
        default void mo11817O(boolean z, int i) {
        }

        /* JADX INFO: renamed from: R */
        default void mo11818R(boolean z) {
        }

        /* JADX INFO: renamed from: S */
        default void mo11819S(int i) {
        }

        /* JADX INFO: renamed from: T */
        default void mo11820T(b bVar) {
        }

        /* JADX INFO: renamed from: U */
        default void mo11821U(int i) {
        }

        /* JADX INFO: renamed from: W */
        default void mo11822W(C1891h c1891h) {
        }

        /* JADX INFO: renamed from: a */
        default void mo11823a(boolean z) {
        }

        /* JADX INFO: renamed from: b0 */
        default void mo11824b0() {
        }

        /* JADX INFO: renamed from: f0 */
        default void mo11826f0(int i, int i2) {
        }

        @Deprecated
        /* JADX INFO: renamed from: g0 */
        default void mo11827g0(int i) {
        }

        /* JADX INFO: renamed from: h0 */
        default void mo11828h0(C1861d0 c1861d0) {
        }

        /* JADX INFO: renamed from: i0 */
        default void mo11829i0(boolean z) {
        }

        /* JADX INFO: renamed from: k0 */
        default void mo11830k0(float f) {
        }

        /* JADX INFO: renamed from: l0 */
        default void mo11831l0(InterfaceC2026t interfaceC2026t, c cVar) {
        }

        /* JADX INFO: renamed from: n */
        default void mo11832n(Metadata metadata) {
        }

        @Deprecated
        /* JADX INFO: renamed from: n0 */
        default void mo11833n0(boolean z, int i) {
        }

        /* JADX INFO: renamed from: o0 */
        default void mo11834o0(@Nullable C1944n c1944n, int i) {
        }

        @Deprecated
        /* JADX INFO: renamed from: p */
        default void mo11835p(List<myb> list) {
        }

        /* JADX INFO: renamed from: r0 */
        default void mo11836r0(C1945o c1945o) {
        }

        /* JADX INFO: renamed from: s */
        default void mo11837s(C1953s c1953s) {
        }

        /* JADX INFO: renamed from: u0 */
        default void mo11838u0(int i) {
        }

        /* JADX INFO: renamed from: z */
        default void mo11840z(e eVar, e eVar2, int i) {
        }

        /* JADX INFO: renamed from: K */
        default void mo11815K(agj0 agj0Var) {
        }

        /* JADX INFO: renamed from: d */
        default void mo11825d(qyb qybVar) {
        }

        /* JADX INFO: renamed from: x */
        default void mo11839x(zjl0 zjl0Var) {
        }
    }
}

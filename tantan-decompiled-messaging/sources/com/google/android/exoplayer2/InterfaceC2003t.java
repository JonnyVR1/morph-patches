package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.List;
import p149l.cxb;
import p149l.dpi;
import p149l.v050;
import p149l.val0;
import p149l.vck0;
import p149l.w6j0;
import p149l.ywb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.t */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2003t {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$b */
    public static final class b implements InterfaceC1863e {

        /* JADX INFO: renamed from: b */
        public static final b f9091b = new a().m11750e();

        /* JADX INFO: renamed from: c */
        public static final String f9092c = vck0.m197903z0(0);

        /* JADX INFO: renamed from: d */
        public static final InterfaceC1863e.a<b> f9093d = new InterfaceC1863e.a() { // from class: l.d680
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return InterfaceC2003t.b.m11744d(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final dpi f9094a;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.t$b$a */
        public static final class a {

            /* JADX INFO: renamed from: b */
            public static final int[] f9095b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a */
            public final dpi.C16424b f9096a = new dpi.C16424b();

            /* JADX INFO: renamed from: a */
            public a m11746a(int i) {
                this.f9096a.m112907a(i);
                return this;
            }

            /* JADX INFO: renamed from: b */
            public a m11747b(b bVar) {
                this.f9096a.m112908b(bVar.f9094a);
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m11748c(int... iArr) {
                this.f9096a.m112909c(iArr);
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m11749d(int i, boolean z) {
                this.f9096a.m112910d(i, z);
                return this;
            }

            /* JADX INFO: renamed from: e */
            public b m11750e() {
                return new b(this.f9096a.m112911e());
            }
        }

        public b(dpi dpiVar) {
            this.f9094a = dpiVar;
        }

        /* JADX INFO: renamed from: d */
        public static b m11744d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f9092c);
            if (integerArrayList == null) {
                return f9091b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.m11746a(integerArrayList.get(i).intValue());
            }
            return aVar.m11750e();
        }

        /* JADX INFO: renamed from: c */
        public boolean m11745c(int i) {
            return this.f9094a.m112903a(i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f9094a.equals(((b) obj).f9094a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9094a.hashCode();
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.f9094a.m112906d(); i++) {
                arrayList.add(Integer.valueOf(this.f9094a.m112905c(i)));
            }
            bundle.putIntegerArrayList(f9092c, arrayList);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final dpi f9097a;

        public c(dpi dpiVar) {
            this.f9097a = dpiVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11751a(int i) {
            return this.f9097a.m112903a(i);
        }

        /* JADX INFO: renamed from: b */
        public boolean m11752b(int... iArr) {
            return this.f9097a.m112904b(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f9097a.equals(((c) obj).f9097a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9097a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$e */
    public static final class e implements InterfaceC1863e {

        /* JADX INFO: renamed from: k */
        public static final String f9098k = vck0.m197903z0(0);

        /* JADX INFO: renamed from: l */
        public static final String f9099l = vck0.m197903z0(1);

        /* JADX INFO: renamed from: m */
        public static final String f9100m = vck0.m197903z0(2);

        /* JADX INFO: renamed from: n */
        public static final String f9101n = vck0.m197903z0(3);

        /* JADX INFO: renamed from: o */
        public static final String f9102o = vck0.m197903z0(4);

        /* JADX INFO: renamed from: p */
        public static final String f9103p = vck0.m197903z0(5);

        /* JADX INFO: renamed from: q */
        public static final String f9104q = vck0.m197903z0(6);

        /* JADX INFO: renamed from: r */
        public static final InterfaceC1863e.a<e> f9105r = new InterfaceC1863e.a() { // from class: l.e680
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return InterfaceC2003t.e.m11788b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Object f9106a;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final int f9107b;

        /* JADX INFO: renamed from: c */
        public final int f9108c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final C1921n f9109d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Object f9110e;

        /* JADX INFO: renamed from: f */
        public final int f9111f;

        /* JADX INFO: renamed from: g */
        public final long f9112g;

        /* JADX INFO: renamed from: h */
        public final long f9113h;

        /* JADX INFO: renamed from: i */
        public final int f9114i;

        /* JADX INFO: renamed from: j */
        public final int f9115j;

        public e(@Nullable Object obj, int i, @Nullable C1921n c1921n, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f9106a = obj;
            this.f9107b = i;
            this.f9108c = i;
            this.f9109d = c1921n;
            this.f9110e = obj2;
            this.f9111f = i2;
            this.f9112g = j;
            this.f9113h = j2;
            this.f9114i = i3;
            this.f9115j = i4;
        }

        /* JADX INFO: renamed from: b */
        public static e m11788b(Bundle bundle) {
            int i = bundle.getInt(f9098k, 0);
            Bundle bundle2 = bundle.getBundle(f9099l);
            return new e(null, i, bundle2 == null ? null : (C1921n) C1921n.f7958p.mo9980a(bundle2), null, bundle.getInt(f9100m, 0), bundle.getLong(f9101n, 0L), bundle.getLong(f9102o, 0L), bundle.getInt(f9103p, -1), bundle.getInt(f9104q, -1));
        }

        /* JADX INFO: renamed from: c */
        public Bundle m11789c(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putInt(f9098k, z2 ? this.f9108c : 0);
            C1921n c1921n = this.f9109d;
            if (c1921n != null && z) {
                bundle.putBundle(f9099l, c1921n.toBundle());
            }
            bundle.putInt(f9100m, z2 ? this.f9111f : 0);
            bundle.putLong(f9101n, z ? this.f9112g : 0L);
            bundle.putLong(f9102o, z ? this.f9113h : 0L);
            bundle.putInt(f9103p, z ? this.f9114i : -1);
            bundle.putInt(f9104q, z ? this.f9115j : -1);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f9108c == eVar.f9108c && this.f9111f == eVar.f9111f && this.f9112g == eVar.f9112g && this.f9113h == eVar.f9113h && this.f9114i == eVar.f9114i && this.f9115j == eVar.f9115j && v050.m196470a(this.f9106a, eVar.f9106a) && v050.m196470a(this.f9110e, eVar.f9110e) && v050.m196470a(this.f9109d, eVar.f9109d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return v050.m196471b(this.f9106a, Integer.valueOf(this.f9108c), this.f9109d, this.f9110e, Integer.valueOf(this.f9111f), Long.valueOf(this.f9112g), Long.valueOf(this.f9113h), Integer.valueOf(this.f9114i), Integer.valueOf(this.f9115j));
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            return m11789c(true, true);
        }
    }

    void addListener(d dVar);

    void addMediaItems(int i, List<C1921n> list);

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

    cxb getCurrentCues();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    AbstractC1834c0 getCurrentTimeline();

    C1838d0 getCurrentTracks();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    C1922o getMediaMetadata();

    boolean getPlayWhenReady();

    C1930s getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @Nullable
    PlaybackException getPlayerError();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    w6j0 getTrackSelectionParameters();

    val0 getVideoSize();

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

    void replaceMediaItems(int i, int i2, List<C1921n> list);

    void seekBack();

    void seekForward();

    void seekTo(int i, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void seekToNext();

    void seekToPrevious();

    void setMediaItems(List<C1921n> list, int i, long j);

    void setMediaItems(List<C1921n> list, boolean z);

    void setPlayWhenReady(boolean z);

    void setPlaybackParameters(C1930s c1930s);

    void setRepeatMode(int i);

    void setShuffleModeEnabled(boolean z);

    void setTrackSelectionParameters(w6j0 w6j0Var);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void stop();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.t$d */
    public interface d {
        @Deprecated
        /* JADX INFO: renamed from: A */
        default void mo11753A(boolean z) {
        }

        /* JADX INFO: renamed from: C */
        default void mo11754C(AbstractC1834c0 abstractC1834c0, int i) {
        }

        /* JADX INFO: renamed from: D */
        default void mo11755D(int i) {
        }

        /* JADX INFO: renamed from: E */
        default void mo11756E(C1922o c1922o) {
        }

        /* JADX INFO: renamed from: F */
        default void mo11757F(boolean z) {
        }

        /* JADX INFO: renamed from: H */
        default void mo11758H(int i, boolean z) {
        }

        /* JADX INFO: renamed from: I */
        default void mo11759I(@Nullable PlaybackException playbackException) {
        }

        /* JADX INFO: renamed from: J */
        default void mo11760J(PlaybackException playbackException) {
        }

        /* JADX INFO: renamed from: M */
        default void mo11762M(C1818a c1818a) {
        }

        /* JADX INFO: renamed from: O */
        default void mo11763O(boolean z, int i) {
        }

        /* JADX INFO: renamed from: R */
        default void mo11764R(boolean z) {
        }

        /* JADX INFO: renamed from: S */
        default void mo11765S(int i) {
        }

        /* JADX INFO: renamed from: T */
        default void mo11766T(b bVar) {
        }

        /* JADX INFO: renamed from: U */
        default void mo11767U(int i) {
        }

        /* JADX INFO: renamed from: W */
        default void mo11768W(C1868h c1868h) {
        }

        /* JADX INFO: renamed from: a */
        default void mo11769a(boolean z) {
        }

        /* JADX INFO: renamed from: b0 */
        default void mo11770b0() {
        }

        /* JADX INFO: renamed from: f0 */
        default void mo11772f0(int i, int i2) {
        }

        @Deprecated
        /* JADX INFO: renamed from: g0 */
        default void mo11773g0(int i) {
        }

        /* JADX INFO: renamed from: h0 */
        default void mo11774h0(C1838d0 c1838d0) {
        }

        /* JADX INFO: renamed from: i0 */
        default void mo11775i0(boolean z) {
        }

        /* JADX INFO: renamed from: k0 */
        default void mo11776k0(float f) {
        }

        /* JADX INFO: renamed from: l0 */
        default void mo11777l0(InterfaceC2003t interfaceC2003t, c cVar) {
        }

        /* JADX INFO: renamed from: n */
        default void mo11778n(Metadata metadata) {
        }

        @Deprecated
        /* JADX INFO: renamed from: n0 */
        default void mo11779n0(boolean z, int i) {
        }

        /* JADX INFO: renamed from: o0 */
        default void mo11780o0(@Nullable C1921n c1921n, int i) {
        }

        @Deprecated
        /* JADX INFO: renamed from: p */
        default void mo11781p(List<ywb> list) {
        }

        /* JADX INFO: renamed from: r0 */
        default void mo11782r0(C1922o c1922o) {
        }

        /* JADX INFO: renamed from: s */
        default void mo11783s(C1930s c1930s) {
        }

        /* JADX INFO: renamed from: u0 */
        default void mo11784u0(int i) {
        }

        /* JADX INFO: renamed from: z */
        default void mo11786z(e eVar, e eVar2, int i) {
        }

        /* JADX INFO: renamed from: K */
        default void mo11761K(w6j0 w6j0Var) {
        }

        /* JADX INFO: renamed from: d */
        default void mo11771d(cxb cxbVar) {
        }

        /* JADX INFO: renamed from: x */
        default void mo11785x(val0 val0Var) {
        }
    }
}

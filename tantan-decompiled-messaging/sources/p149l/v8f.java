package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1868h;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C1818a;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.connect.share.QzonePublish;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m87231d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001eH\u0016¢\u0006\u0004\b3\u0010!J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u00101J\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u0010!J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u00101J'\u0010A\u001a\u00020\b2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\rH\u0016¢\u0006\u0004\bH\u00101J\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u001eH\u0016¢\u0006\u0004\bR\u0010!J\u0017\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\b2\u0006\u0010N\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u001eH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\b2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\b2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\rH\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\bH\u0016¢\u0006\u0004\bb\u0010\u0003J\u001d\u0010f\u001a\u00020\b2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0cH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\b2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010o¨\u0006p"}, m87232d2 = {"Ll/v8f;", "Lcom/google/android/exoplayer2/t$d;", "<init>", "()V", "Lcom/google/android/exoplayer2/t;", GameIdentity.player, "Lcom/google/android/exoplayer2/t$c;", "events", "", "l0", "(Lcom/google/android/exoplayer2/t;Lcom/google/android/exoplayer2/t$c;)V", "Lcom/google/android/exoplayer2/c0;", "timeline", "", Reason.TYPE, b2s.C_ZONE, "(Lcom/google/android/exoplayer2/c0;I)V", "Lcom/google/android/exoplayer2/n;", "mediaItem", "o0", "(Lcom/google/android/exoplayer2/n;I)V", "Lcom/google/android/exoplayer2/d0;", "tracks", "h0", "(Lcom/google/android/exoplayer2/d0;)V", "Lcom/google/android/exoplayer2/o;", "mediaMetadata", "E", "(Lcom/google/android/exoplayer2/o;)V", "r0", "", "isLoading", "i0", "(Z)V", "Lcom/google/android/exoplayer2/t$b;", "availableCommands", j6f.GPS_DIRECTION_TRUE, "(Lcom/google/android/exoplayer2/t$b;)V", "Ll/w6j0;", "parameters", "K", "(Ll/w6j0;)V", "playWhenReady", "playbackState", "n0", "(ZI)V", BloodType.f38728O, "playbackSuppressionReason", j6f.LATITUDE_SOUTH, "(I)V", "isPlaying", "R", "repeatMode", "u0", "shuffleModeEnabled", "F", "Lcom/google/android/exoplayer2/PlaybackException;", "error", "J", "(Lcom/google/android/exoplayer2/PlaybackException;)V", "I", "g0", "Lcom/google/android/exoplayer2/t$e;", "oldPosition", "newPosition", BaseSei.f13932Z, "(Lcom/google/android/exoplayer2/t$e;Lcom/google/android/exoplayer2/t$e;I)V", "Lcom/google/android/exoplayer2/s;", "playbackParameters", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/google/android/exoplayer2/s;)V", "audioSessionId", "D", "Lcom/google/android/exoplayer2/audio/a;", "audioAttributes", "M", "(Lcom/google/android/exoplayer2/audio/a;)V", "", "volume", "k0", "(F)V", "skipSilenceEnabled", "a", "Lcom/google/android/exoplayer2/h;", "deviceInfo", "W", "(Lcom/google/android/exoplayer2/h;)V", "muted", "H", "(IZ)V", "Ll/val0;", QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, BaseSei.f13930X, "(Ll/val0;)V", "width", "height", "f0", "(II)V", "b0", "", "Ll/ywb;", "cues", "p", "(Ljava/util/List;)V", "Ll/cxb;", "cueGroup", Constants.INAPP_DATA_TAG, "(Ll/cxb;)V", "Lcom/google/android/exoplayer2/metadata/Metadata;", "metadata", "n", "(Lcom/google/android/exoplayer2/metadata/Metadata;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class v8f implements InterfaceC2003t.d {
    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: C */
    public void mo11754C(@NotNull AbstractC1834c0 timeline, int reason) {
        timeline.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: E */
    public void mo11756E(@NotNull C1922o mediaMetadata) {
        mediaMetadata.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: J */
    public void mo11760J(@NotNull PlaybackException error) {
        error.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: K */
    public void mo11761K(@NotNull w6j0 parameters) {
        parameters.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: M */
    public void mo11762M(@NotNull C1818a audioAttributes) {
        audioAttributes.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: T */
    public void mo11766T(@NotNull InterfaceC2003t.b availableCommands) {
        availableCommands.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: W */
    public void mo11768W(@NotNull C1868h deviceInfo) {
        deviceInfo.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: d */
    public void mo11771d(@NotNull cxb cueGroup) {
        cueGroup.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: h0 */
    public void mo11774h0(@NotNull C1838d0 tracks) {
        tracks.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: l0 */
    public void mo11777l0(@NotNull InterfaceC2003t player, @NotNull InterfaceC2003t.c events) {
        player.getClass();
        events.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: n */
    public void mo11778n(@NotNull com.google.android.exoplayer2.metadata.Metadata metadata) {
        metadata.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: p */
    public void mo11781p(@NotNull List<ywb> cues) {
        cues.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: r0 */
    public void mo11782r0(@NotNull C1922o mediaMetadata) {
        mediaMetadata.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: s */
    public void mo11783s(@NotNull C1930s playbackParameters) {
        playbackParameters.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: x */
    public void mo11785x(@NotNull val0 videoSize) {
        videoSize.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: z */
    public void mo11786z(@NotNull InterfaceC2003t.e oldPosition, @NotNull InterfaceC2003t.e newPosition, int reason) {
        oldPosition.getClass();
        newPosition.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: b0 */
    public void mo11770b0() {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: D */
    public void mo11755D(int audioSessionId) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: F */
    public void mo11757F(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: I */
    public void mo11759I(@Nullable PlaybackException error) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: R */
    public void mo11764R(boolean isPlaying) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: S */
    public void mo11765S(int playbackSuppressionReason) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: a */
    public void mo11769a(boolean skipSilenceEnabled) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: g0 */
    public void mo11773g0(int reason) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: i0 */
    public void mo11775i0(boolean isLoading) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: k0 */
    public void mo11776k0(float volume) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: u0 */
    public void mo11784u0(int repeatMode) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: H */
    public void mo11758H(int volume, boolean muted) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: O */
    public void mo11763O(boolean playWhenReady, int reason) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: f0 */
    public void mo11772f0(int width, int height) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: n0 */
    public void mo11779n0(boolean playWhenReady, int playbackState) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: o0 */
    public void mo11780o0(@Nullable C1921n mediaItem, int reason) {
    }
}

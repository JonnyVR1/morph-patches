package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1891h;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.C1945o;
import com.google.android.exoplayer2.C1953s;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C1841a;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.connect.share.QzonePublish;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m88120d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001eH\u0016¢\u0006\u0004\b3\u0010!J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u00101J\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u0010!J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u00101J'\u0010A\u001a\u00020\b2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\rH\u0016¢\u0006\u0004\bH\u00101J\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u001eH\u0016¢\u0006\u0004\bR\u0010!J\u0017\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010X\u001a\u00020\b2\u0006\u0010N\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u001eH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\b2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\b2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\rH\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\bH\u0016¢\u0006\u0004\bb\u0010\u0003J\u001d\u0010f\u001a\u00020\b2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0cH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\b2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010o¨\u0006p"}, m88121d2 = {"Ll/baf;", "Lcom/google/android/exoplayer2/t$d;", "<init>", "()V", "Lcom/google/android/exoplayer2/t;", GameIdentity.player, "Lcom/google/android/exoplayer2/t$c;", "events", "", "l0", "(Lcom/google/android/exoplayer2/t;Lcom/google/android/exoplayer2/t$c;)V", "Lcom/google/android/exoplayer2/c0;", "timeline", "", Reason.TYPE, c4s.C_ZONE, "(Lcom/google/android/exoplayer2/c0;I)V", "Lcom/google/android/exoplayer2/n;", "mediaItem", "o0", "(Lcom/google/android/exoplayer2/n;I)V", "Lcom/google/android/exoplayer2/d0;", "tracks", "h0", "(Lcom/google/android/exoplayer2/d0;)V", "Lcom/google/android/exoplayer2/o;", "mediaMetadata", "E", "(Lcom/google/android/exoplayer2/o;)V", "r0", "", "isLoading", "i0", "(Z)V", "Lcom/google/android/exoplayer2/t$b;", "availableCommands", p7f.GPS_DIRECTION_TRUE, "(Lcom/google/android/exoplayer2/t$b;)V", "Ll/agj0;", "parameters", "K", "(Ll/agj0;)V", "playWhenReady", "playbackState", "n0", "(ZI)V", BloodType.f39576O, "playbackSuppressionReason", p7f.LATITUDE_SOUTH, "(I)V", "isPlaying", "R", "repeatMode", "u0", "shuffleModeEnabled", "F", "Lcom/google/android/exoplayer2/PlaybackException;", "error", "J", "(Lcom/google/android/exoplayer2/PlaybackException;)V", "I", "g0", "Lcom/google/android/exoplayer2/t$e;", "oldPosition", "newPosition", BaseSei.f14626Z, "(Lcom/google/android/exoplayer2/t$e;Lcom/google/android/exoplayer2/t$e;I)V", "Lcom/google/android/exoplayer2/s;", "playbackParameters", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/google/android/exoplayer2/s;)V", "audioSessionId", "D", "Lcom/google/android/exoplayer2/audio/a;", "audioAttributes", "M", "(Lcom/google/android/exoplayer2/audio/a;)V", "", "volume", "k0", "(F)V", "skipSilenceEnabled", "a", "Lcom/google/android/exoplayer2/h;", "deviceInfo", "W", "(Lcom/google/android/exoplayer2/h;)V", "muted", "H", "(IZ)V", "Ll/zjl0;", QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, BaseSei.f14624X, "(Ll/zjl0;)V", "width", "height", "f0", "(II)V", "b0", "", "Ll/myb;", "cues", "p", "(Ljava/util/List;)V", "Ll/qyb;", "cueGroup", Constants.INAPP_DATA_TAG, "(Ll/qyb;)V", "Lcom/google/android/exoplayer2/metadata/Metadata;", "metadata", "n", "(Lcom/google/android/exoplayer2/metadata/Metadata;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class baf implements InterfaceC2026t.d {
    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: C */
    public void mo11808C(@NotNull AbstractC1857c0 timeline, int reason) {
        timeline.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: E */
    public void mo11810E(@NotNull C1945o mediaMetadata) {
        mediaMetadata.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: J */
    public void mo11814J(@NotNull PlaybackException error) {
        error.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: K */
    public void mo11815K(@NotNull agj0 parameters) {
        parameters.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: M */
    public void mo11816M(@NotNull C1841a audioAttributes) {
        audioAttributes.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: T */
    public void mo11820T(@NotNull InterfaceC2026t.b availableCommands) {
        availableCommands.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: W */
    public void mo11822W(@NotNull C1891h deviceInfo) {
        deviceInfo.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: d */
    public void mo11825d(@NotNull qyb cueGroup) {
        cueGroup.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: h0 */
    public void mo11828h0(@NotNull C1861d0 tracks) {
        tracks.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: l0 */
    public void mo11831l0(@NotNull InterfaceC2026t player, @NotNull InterfaceC2026t.c events) {
        player.getClass();
        events.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: n */
    public void mo11832n(@NotNull com.google.android.exoplayer2.metadata.Metadata metadata) {
        metadata.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: p */
    public void mo11835p(@NotNull List<myb> cues) {
        cues.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: r0 */
    public void mo11836r0(@NotNull C1945o mediaMetadata) {
        mediaMetadata.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: s */
    public void mo11837s(@NotNull C1953s playbackParameters) {
        playbackParameters.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: x */
    public void mo11839x(@NotNull zjl0 videoSize) {
        videoSize.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: z */
    public void mo11840z(@NotNull InterfaceC2026t.e oldPosition, @NotNull InterfaceC2026t.e newPosition, int reason) {
        oldPosition.getClass();
        newPosition.getClass();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: b0 */
    public void mo11824b0() {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: D */
    public void mo11809D(int audioSessionId) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: F */
    public void mo11811F(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: I */
    public void mo11813I(@Nullable PlaybackException error) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: R */
    public void mo11818R(boolean isPlaying) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: S */
    public void mo11819S(int playbackSuppressionReason) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: a */
    public void mo11823a(boolean skipSilenceEnabled) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: g0 */
    public void mo11827g0(int reason) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: i0 */
    public void mo11829i0(boolean isLoading) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: k0 */
    public void mo11830k0(float volume) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: u0 */
    public void mo11838u0(int repeatMode) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: H */
    public void mo11812H(int volume, boolean muted) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: O */
    public void mo11817O(boolean playWhenReady, int reason) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: f0 */
    public void mo11826f0(int width, int height) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: n0 */
    public void mo11833n0(boolean playWhenReady, int playbackState) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: o0 */
    public void mo11834o0(@Nullable C1944n mediaItem, int reason) {
    }
}

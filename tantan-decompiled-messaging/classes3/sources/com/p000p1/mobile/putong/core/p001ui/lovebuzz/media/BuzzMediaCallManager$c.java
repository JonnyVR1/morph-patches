package com.p000p1.mobile.putong.core.p001ui.lovebuzz.media;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.utils.MMLiveErrorInfo;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzCallState;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.fkw;
import l.qa2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\fJ+\u0010\u001a\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020\u00062\u0010\u0010,\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010*2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010)¨\u00061"}, d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c", "Ll/fkw;", "", "uid", "", "data", "", "U", "(I[B)V", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "pushType", "t", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "rtcType", "u", "Lcom/immomo/momomediaext/utils/MMLiveErrorInfo;", "error", "o", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;Lcom/immomo/momomediaext/utils/MMLiveErrorInfo;)V", "r", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;I)V", "p", "q", "", "channel", "", "z", "(Ljava/lang/String;JLcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "reason", "A", "(Ljava/lang/String;ILcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "userid", "Z", "(Ljava/lang/String;Ljava/lang/String;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "Landroid/view/SurfaceView;", "surfaceView", "S", "(Ljava/lang/String;Landroid/view/SurfaceView;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "a0", "routing", "d", "(I)V", "", "Lcom/immomo/mediacore/audio/AudioVolumeWeight;", "speakers", "e0", "([Lcom/immomo/mediacore/audio/AudioVolumeWeight;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "count", "v", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BuzzMediaCallManager$c extends fkw {
    /* JADX INFO: renamed from: A */
    public void m0A(String channel, int reason, MMLiveRoomParams.MMLivePushType rtcType) {
        super.A(channel, reason, rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onLocalLeaveChannel:" + channel + " reason:" + reason);
        BuzzMediaCallManager.INSTANCE.y().onNext(BuzzCallState.LEAVE_STATE);
    }

    /* JADX INFO: renamed from: S */
    public void m1S(String uid, SurfaceView surfaceView, MMLiveRoomParams.MMLivePushType rtcType) {
        uid.getClass();
        super.S(uid, surfaceView, rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onVideoChannelAdded:" + uid);
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        buzzMediaCallManager.J().put(Long.valueOf(Long.parseLong(uid)), surfaceView);
        buzzMediaCallManager.y().onNext(BuzzCallState.PEER_VIDEO_JOIN);
        buzzMediaCallManager.y().onNext(BuzzCallState.RECEIVE_PEER_VIDEO_FIRST);
    }

    /* JADX INFO: renamed from: U */
    public void m2U(int uid, byte[] data) {
        super.U(uid, data);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onStreamMessage uid " + uid + " data " + data);
    }

    /* JADX INFO: renamed from: Z */
    public void m3Z(String channel, String userid, MMLiveRoomParams.MMLivePushType rtcType) {
        super.Z(channel, userid, rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onMemberJoinChannel:" + userid + " channel:" + channel);
        BuzzMediaCallManager.INSTANCE.y().onNext(BuzzCallState.PEER_JOINED_STATE);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4a0(String uid, int reason, MMLiveRoomParams.MMLivePushType rtcType) {
        uid.getClass();
        super.a0(uid, reason, rtcType);
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        buzzMediaCallManager.J().remove(Long.valueOf(Long.parseLong(uid)));
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.a("BuzzMediaCallManager", "onVideoChannelRemove:" + uid);
        buzzMediaCallManager.y().onNext(BuzzCallState.PEER_VIDEO_REMOVE);
        qa2Var.a("BuzzMediaCallManager", "onMemberLeaveChannel:" + uid + " reason:" + reason + " rtc:" + rtcType);
        buzzMediaCallManager.y().onNext(BuzzCallState.MEMBER_LEAVE);
        BuzzMediaCallManager.v(buzzMediaCallManager, 0, 1, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public void m5d(int routing) {
        super.d(routing);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onAudioRouteChanged routing " + routing);
    }

    /* JADX INFO: renamed from: e0 */
    public void m6e0(AudioVolumeWeight[] speakers, MMLiveRoomParams.MMLivePushType rtcType) {
        super.e0(speakers, rtcType);
        if (BuzzMediaCallManager.INSTANCE.B() || speakers == null) {
            return;
        }
        for (AudioVolumeWeight audioVolumeWeight : speakers) {
            if (audioVolumeWeight.voicePitch > 0.0d && audioVolumeWeight.volume > 0.0f && TextUtils.equals(String.valueOf(audioVolumeWeight.uid), CoreModule.H().userId())) {
                BuzzMediaCallManager.INSTANCE.e0(true);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m7o(MMLiveRoomParams.MMLivePushType rtcType, MMLiveErrorInfo error) {
        error.getClass();
        super.o(rtcType, error);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onEngineError:" + rtcType + " what:" + error.what + " extra:" + error.extra);
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        buzzMediaCallManager.y().onNext(BuzzCallState.CONNECTION_LOST);
        buzzMediaCallManager.u(error.what);
    }

    /* JADX INFO: renamed from: p */
    public void m8p(MMLiveRoomParams.MMLivePushType rtcType) {
        super.p(rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onEngineBufferStart");
    }

    /* JADX INFO: renamed from: q */
    public void m9q(MMLiveRoomParams.MMLivePushType rtcType) {
        super.q(rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onEngineBufferStopped");
    }

    /* JADX INFO: renamed from: r */
    public void m10r(MMLiveRoomParams.MMLivePushType rtcType, int error) {
        super.r(rtcType, error);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onEnginePushReplaced");
    }

    /* JADX INFO: renamed from: t */
    public void m11t(MMLiveRoomParams.MMLivePushType pushType) {
        super.t(pushType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onEnginePushStarted");
    }

    /* JADX INFO: renamed from: u */
    public void m12u(MMLiveRoomParams.MMLivePushType rtcType) {
        super.u(rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onEnginePushStopped");
    }

    /* JADX INFO: renamed from: v */
    public void m13v(int count) {
        super.v(count);
        BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
        if (buzzMediaCallManager.I()) {
            buzzMediaCallManager.h0(true);
            buzzMediaCallManager.G().onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m14z(String channel, long uid, MMLiveRoomParams.MMLivePushType rtcType) {
        super.z(channel, uid, rtcType);
        qa2.INSTANCE.a("BuzzMediaCallManager", "onLocalJoinChannel:" + uid + " channel:" + channel);
        if (Intrinsics.d(BuzzMediaCallManager.k(), "voiceBuzz")) {
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.d0(buzzMediaCallManager.H());
        }
        BuzzMediaCallManager.INSTANCE.y().onNext(BuzzCallState.LOCAL_JOINED_STATE);
    }
}

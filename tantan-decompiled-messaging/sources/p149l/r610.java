package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveJsAudienceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveJsAudienceInfoData;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.MultiCallApplyRequestData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\bJ'\u0010\u001f\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0007¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b*\u0010)J!\u0010,\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u000bH\u0007¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00102\u001a\u00020\rH\u0007¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b9\u00101J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u00101J!\u0010;\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b;\u0010<J)\u0010=\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u00102\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b?\u0010<J\u001f\u0010@\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b@\u0010)J%\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100A2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bD\u0010)J\u001f\u0010E\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bE\u0010)J\u001f\u0010F\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bF\u0010/J/\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010H2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bI\u0010JJ'\u0010K\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u0010H\u0007¢\u0006\u0004\bN\u00101J\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bO\u00101J'\u0010P\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u00106J'\u0010Q\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bQ\u00106J/\u0010S\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bU\u0010\bJ\u001f\u0010W\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\r2\u0006\u0010V\u001a\u00020\rH\u0007¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\tH\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u00062\u0006\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\b_\u0010`J\u001f\u0010d\u001a\u00020\u00062\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u000bH\u0007¢\u0006\u0004\bd\u0010eJ!\u0010h\u001a\u00020\r2\u0006\u0010f\u001a\u00020\r2\b\b\u0002\u0010g\u001a\u00020\tH\u0007¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u00020\r2\u0006\u0010f\u001a\u00020\r2\b\b\u0002\u0010g\u001a\u00020\tH\u0007¢\u0006\u0004\bj\u0010iJ[\u0010v\u001a\u00020u2\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020\r2\u0006\u0010n\u001a\u00020\r2\u0006\u0010o\u001a\u00020\r2\u0006\u0010p\u001a\u00020\r2\u0006\u0010q\u001a\u00020\r2\u0006\u0010r\u001a\u00020\t2\b\b\u0002\u0010s\u001a\u00020\r2\b\b\u0002\u0010t\u001a\u00020\rH\u0007¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u000b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0007¢\u0006\u0004\bx\u0010yJ\u000f\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020zH\u0002¢\u0006\u0004\b}\u0010|J\u0018\u0010\u007f\u001a\u00020\r2\u0006\u0010~\u001a\u00020\tH\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0005\b\u0081\u0001\u0010&J#\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J*\u0010\u0085\u0001\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u00102\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J#\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0005\b\u0087\u0001\u0010<J#\u0010\u0088\u0001\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0005\b\u0088\u0001\u0010/¨\u0006\u0089\u0001"}, m87232d2 = {"Ll/r610;", "", "<init>", "()V", "Ll/h4t;", "presenter", "", "f0", "(Ll/h4t;)V", "", "deputyCount", "", "hasLeadRole", "", "u", "(IZ)Ljava/lang/String;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "from", "i0", "(Ll/h4t;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)V", "Ll/bsm;", BaseSei.INFO, "tabType", "a0", "(Ll/h4t;Ll/bsm;II)V", "tryMultiCallUpgradeEntry", "b0", "(Ll/h4t;Ll/bsm;IIZ)V", "k", "callId", "Z", "(Ll/h4t;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAsset;", "multiCallAsset", "G", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAsset;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAsset;", "L", "()Z", BloodType.f38728O, "N", "(Ll/h4t;)Z", "P", "inOwnerRoom", b2s.C_ZONE, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Z)Ljava/lang/String;", "D", "(Ll/h4t;)Ljava/lang/String;", "Q", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "userId", "U", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)Z", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ll/h4t;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "W", "(Ljava/lang/String;)Z", j6f.GPS_DIRECTION_TRUE, j6f.LATITUDE_SOUTH, "B", "(Ll/h4t;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "E", "(Ll/h4t;Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", BaseSei.f13932Z, "M", "", "o", "(Ll/h4t;)Ljava/util/List;", "J", "K", "A", "selfRole", "Landroid/util/Pair;", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)Landroid/util/Pair;", "R", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ll/h4t;)Z", BLiveActivity.TYPE_MULTI_CALL, BLiveStormDanmakuGiftResourceType.f44444l, "e0", "f", "g", "anchorId", "h0", "(Ll/h4t;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)Z", "H", "liveId", "I", "(Ljava/lang/String;Ljava/lang/String;)V", "position", "maxPos", "Y", "(II)Z", "", "error", "j", "(Ljava/lang/Throwable;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "isBlack", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Z)V", AuthenticationTokenClaims.JSON_KEY_NAME, "length", "w", "(Ljava/lang/String;I)Ljava/lang/String;", "g0", "Ll/ho2;", "liveData", "ownerMultiCallOrder", "ownerLiveId", "inviteId", "category", "source", "intendPosition", "enterRoomSource", "ownerCreateSource", "Lcom/p1/mobile/putong/live/base/data/MultiCallApplyRequestData;", "n", "(Ll/ho2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/MultiCallApplyRequestData;", "m", "(Ll/bsm;)Z", "", "p", "()J", ResourceDirection.f38808v, MessageType.operation, BaseSei.f13931Y, "(I)Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/live/base/data/BLiveJsAudienceInfoData;", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/h4t;)Lcom/p1/mobile/putong/live/base/data/BLiveJsAudienceInfoData;", "X", "(Ll/h4t;Ljava/lang/String;)Z", "q", "r", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class r610 {

    @NotNull
    public static final r610 INSTANCE = new r610();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final String m177966A(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        Object objM129297F3 = presenter.m129297F3(new qc10(0));
        objM129297F3.getClass();
        return (String) objM129297F3;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: B */
    public static final BLiveMultiCall m177967B(@NotNull h4t<?, ?> presenter) {
        Object next;
        presenter.getClass();
        Iterator<T> it = m178010o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m177988W(((BLiveMultiCall) next).userId)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: C */
    public static final String m177968C(@Nullable BLiveMultiCall call, boolean inOwnerRoom) {
        if (vg10.m198312d(call)) {
            call.getClass();
            String str = call.role;
            str.getClass();
            return str;
        }
        if (inOwnerRoom) {
            String str2 = s410.f162241g;
            str2.getClass();
            return str2;
        }
        String str3 = s410.f162242h;
        str3.getClass();
        return str3;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: D */
    public static final String m177969D(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        return m177968C(m177967B(presenter), m177978M(presenter));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: E */
    public static final BLiveMultiCall m177970E(@NotNull h4t<?, ?> presenter, @NotNull String userId) {
        Object next;
        presenter.getClass();
        userId.getClass();
        Iterator<T> it = m178010o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.m87488d(userId, ((BLiveMultiCall) next).userId)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: F */
    public static final Pair<String, Boolean> m177971F(@NotNull BLiveMultiCall call, @Nullable String selfRole) {
        String str;
        call.getClass();
        if (m177988W(call.ownerUserId) && ve10.m198128b(call)) {
            str = "OwnerControlAnchorVoice";
        } else if (m177988W(call.ownerUserId) && ve10.m198132f(call)) {
            str = "OwnerControlAudienceVoice";
        } else if (ve10.m198136j(call) && ve10.m198129c(selfRole)) {
            str = "AnchorControlOwnerVoice";
        } else if (m177988W(call.userId) && ve10.m198132f(call)) {
            str = "AudienceControlSelfVoice";
        } else {
            str = (ve10.m198129c(selfRole) && ve10.m198128b(call) && !m177988W(call.userId)) ? "AnchorControlAnchorVoice" : "";
        }
        yi10.m214879a("operate call voice type:".concat(str));
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Pair<>(str, Boolean.valueOf(m177982Q(call)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: G */
    public static final BLiveMultiCallAsset m177972G(@Nullable BLiveMultiCallAsset multiCallAsset) {
        if (multiCallAsset == null) {
            return null;
        }
        ((hdv) ypv.m215673l(fld0.f98150e)).f107298d.put(multiCallAsset);
        return multiCallAsset;
    }

    @JvmStatic
    /* JADX INFO: renamed from: H */
    public static final void m177973H(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        BLiveMultiCall bLiveMultiCallM177967B = m177967B(presenter);
        if (bLiveMultiCallM177967B != null) {
            String strM177968C = m177968C(bLiveMultiCallM177967B, true);
            if (ve10.m198137k(strM177968C)) {
                LivingNormalApiProvider.m71427c4(bLiveMultiCallM177967B.ownerLiveId);
            } else if (ve10.m198129c(strM177968C) || ve10.m198133g(strM177968C)) {
                LivingNormalApiProvider.m71447e6(bLiveMultiCallM177967B.f44400id, "live-stop");
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m177974I(@NotNull String selfRole, @NotNull final String liveId) {
        selfRole.getClass();
        liveId.getClass();
        if (ve10.m198129c(selfRole) || ve10.m198133g(selfRole)) {
            LivingNormalApiProvider.m71185B5(liveId).subscribe(ffw.m121197h(new e30() { // from class: l.p610
                @Override // p149l.e30
                public final void call(Object obj) {
                    r610.m177996c(liveId, (List) obj);
                }
            }));
        } else {
            LivingNormalApiProvider.m71427c4(liveId);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: J */
    public static final boolean m177975J(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        return m178010o(presenter).size() >= ((Number) presenter.m129297F3(new c610())).intValue();
    }

    @JvmStatic
    /* JADX INFO: renamed from: K */
    public static final boolean m177976K(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        return m177975J(presenter) && m177977L();
    }

    @JvmStatic
    /* JADX INFO: renamed from: L */
    public static final boolean m177977L() {
        BLiveMultiCallAsset bLiveMultiCallAsset = ((hdv) ypv.m215673l(fld0.f98150e)).f107298d.get();
        if (bLiveMultiCallAsset != null) {
            return bLiveMultiCallAsset.freeCall;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: M */
    public static final boolean m177978M(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        BLiveMultiCall bLiveMultiCallM178019z = m178019z(presenter);
        if (bLiveMultiCallM178019z != null) {
            return TextUtils.equals(bLiveMultiCallM178019z.ownerRoomId, presenter.m206027E2().m149818o());
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: N */
    public static final boolean m177979N(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        return MotionType.multi_call == presenter.m206034N2();
    }

    @JvmStatic
    /* JADX INFO: renamed from: O */
    public static final boolean m177980O() {
        return ypv.m215672k().m195607D3();
    }

    @JvmStatic
    /* JADX INFO: renamed from: P */
    public static final boolean m177981P(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        return m177979N(presenter) && xi5.m208915b(m177967B(presenter));
    }

    @JvmStatic
    /* JADX INFO: renamed from: Q */
    public static final boolean m177982Q(@NotNull BLiveMultiCall call) {
        call.getClass();
        return call.mutedByUserIds.contains(ypv.f199493a.m199309D0());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: R */
    public static final boolean m177983R(@NotNull BLiveMultiCall call, @NotNull h4t<?, ?> presenter) {
        call.getClass();
        presenter.getClass();
        String strM177969D = m177969D(presenter);
        String str = presenter.m206027E2().m132146l0().f56011id;
        str.getClass();
        if (ve10.m198137k(strM177969D)) {
            return INSTANCE.m178020e0(call);
        }
        if (ve10.m198129c(strM177969D)) {
            return INSTANCE.m178021f(presenter, call);
        }
        if (ve10.m198133g(strM177969D)) {
            return INSTANCE.m178023g(presenter, call);
        }
        if (ve10.m198140n(strM177969D)) {
            return INSTANCE.m178024h0(presenter, call, str);
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: S */
    public static final boolean m177984S(@NotNull BLiveMultiCall call) {
        call.getClass();
        return call.mutedByUserIds.contains(call.ownerUserId);
    }

    @JvmStatic
    /* JADX INFO: renamed from: T */
    public static final boolean m177985T(@NotNull BLiveMultiCall call) {
        call.getClass();
        return call.mutedByUserIds.contains(call.userId);
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final boolean m177986U(@NotNull BLiveMultiCall call, @NotNull String userId) {
        call.getClass();
        userId.getClass();
        return call.mutedByUserIds.contains(userId);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final boolean m177987V(@NotNull h4t<?, ?> presenter, @NotNull BLiveMultiCall call) {
        presenter.getClass();
        call.getClass();
        BLiveMultiCall bLiveMultiCallM178019z = m178019z(presenter);
        if (bLiveMultiCallM178019z != null) {
            String str = presenter.m206027E2().m132146l0().f56011id;
            str.getClass();
            if (m177986U(bLiveMultiCallM178019z, str) && !m177988W(call.userId)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: W */
    public static final boolean m177988W(@Nullable String userId) {
        return TextUtils.equals(userId, ypv.f199493a.m199309D0());
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final boolean m177989X(@NotNull h4t<?, ?> presenter, @NotNull String userId) {
        presenter.getClass();
        userId.getClass();
        return TextUtils.equals(m178012r(presenter), userId);
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y */
    public static final boolean m177990Y(int position, int maxPos) {
        return 1 <= position && position <= maxPos;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m177991Z(@NotNull h4t<?, ?> presenter, @NotNull String callId) {
        presenter.getClass();
        callId.getClass();
    }

    @JvmStatic
    /* JADX INFO: renamed from: a0 */
    public static final void m177993a0(@NotNull h4t<?, ?> presenter, @NotNull bsm<?> info, int tabType, int from) {
        presenter.getClass();
        info.getClass();
        m177995b0(presenter, info, tabType, from, false);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: b0 */
    public static final void m177995b0(@NotNull final h4t<?, ?> presenter, @NotNull bsm<?> info, final int tabType, int from, boolean tryMultiCallUpgradeEntry) {
        presenter.getClass();
        info.getClass();
        if (((Boolean) presenter.m129297F3(new bax(800))).booleanValue()) {
            lsi0.m151578h(R$string.f47429o8);
            return;
        }
        if (info.f77104j.m201577L3(MotionType.multi_connect)) {
            lsi0.m151578h(R$string.f47407n8);
            return;
        }
        BLiveMultiCall bLiveMultiCallM177967B = m177967B(presenter);
        if (bLiveMultiCallM177967B == null) {
            if (tryMultiCallUpgradeEntry && m178002h()) {
                presenter.m206028F2().MultiCallEvent.showMultiCallUpgradeEntryDlg().mo172463j(Boolean.TRUE);
                return;
            } else {
                presenter.duringCreated(LivingNormalApiProvider.m71627y6(presenter.m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.m610
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        r610.m177997c0(tabType, presenter, (BLiveMultiCallAsset) obj);
                    }
                }, new e30() { // from class: l.n610
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        r610.m177999d0((Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (ve10.m198136j(bLiveMultiCallM177967B)) {
            presenter.m206028F2().MultiCallEvent.openManageDialog().mo172463j(Integer.valueOf(tabType));
        } else if (ve10.m198128b(bLiveMultiCallM177967B)) {
            lsi0.m151578h(R$string.f47079Y7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m177996c(String str, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m87488d(((BLiveMultiCall) next).liveId, str));
        BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) next;
        if (bLiveMultiCall != null) {
            LivingNormalApiProvider.m71447e6(bLiveMultiCall.f44400id, "live-stop");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m177997c0(int i, h4t h4tVar, BLiveMultiCallAsset bLiveMultiCallAsset) {
        bLiveMultiCallAsset.getClass();
        String str = s410.f162238d;
        str.getClass();
        String str2 = bLiveMultiCallAsset.multiCallOrder;
        str2.getClass();
        h4tVar.m206028F2().MultiCallEvent.startLiveMultiCall().mo172463j(new ug10(str, str2, m178015u(bLiveMultiCallAsset.maxCallNum, false), i));
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m177999d0(Throwable th) {
        th.getClass();
        m178005j(th);
    }

    /* JADX INFO: renamed from: e */
    public static void m178000e(h4t h4tVar, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        h4tVar.m206028F2().MultiCallEvent.announcementData().mo172464m(bLiveMultiCallAnnouncement);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public static final String m178001g0(@NotNull String name, int length) {
        name.getClass();
        if (name.length() <= length) {
            return name;
        }
        int i = length * 2;
        StringBuilder sb = new StringBuilder();
        char[] charArray = name.toCharArray();
        charArray.getClass();
        int i2 = 0;
        for (char c : charArray) {
            if (i2 >= i) {
                break;
            }
            sb.append(c);
            i2 += (Character.isUpperCase(c) || Character.isLowerCase(c) || Character.isDigit(c)) ? 1 : 2;
        }
        if (sb.length() == charArray.length) {
            return sb.toString();
        }
        return ((Object) sb) + "...";
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m178002h() {
        fld0<hdv> fld0Var = fld0.f98150e;
        Long l2 = ((hdv) ypv.m215673l(fld0Var)).f107302h.get();
        l2.getClass();
        if (!mqi0.m155929D(l2.longValue())) {
            ((hdv) ypv.m215673l(fld0Var)).f107301g.put(0);
            ((hdv) ypv.m215673l(fld0Var)).f107302h.put(Long.valueOf(mqi0.m155944o()));
        }
        BLiveCommonConfig bLiveCommonConfigM195704P4 = ypv.m215672k().m195704P4();
        if (bLiveCommonConfigM195704P4 == null) {
            return false;
        }
        return bLiveCommonConfigM195704P4.f44350on && ((hdv) ypv.m215673l(fld0Var)).f107301g.get().intValue() < bLiveCommonConfigM195704P4.showCountPerDay;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m178003i(@NotNull Act act, boolean isBlack) {
        act.getClass();
        if (isBlack) {
            PutongAct.setLightStatusBar(act.getWindow(), 1024);
        } else {
            act.getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i0 */
    public static final void m178004i0(@NotNull h4t<?, ?> presenter, @NotNull BLiveMultiCall call, @NotNull String from) {
        presenter.getClass();
        call.getClass();
        from.getClass();
        yi10.m214879a("update self call,from:" + from + ",state:" + call.state + ",id:" + call.f44400id);
        presenter.m206028F2().MultiCallEvent.updateSelfCall().mo172463j(call);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m178005j(@NotNull Throwable error) {
        String str;
        error.getClass();
        if (!(error instanceof TantanException.Client.CoreService) || (str = ((TantanException.Client.CoreService) error).metaMessage) == null) {
            lsi0.m151578h(R$string.f46698G9);
        } else {
            lsi0.m151595y(str);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m178006k(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        presenter.m206028F2().MultiCallEvent.closeMultiCallMotion().m172467p();
        presenter.m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
        presenter.m206028F2().MultiCallEvent.openManageDialog().mo172463j(-100);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m178007l(@NotNull BLiveMultiCall multiCall) {
        multiCall.getClass();
        return m177988W(multiCall.userId) && vg10.INSTANCE.m198314f(multiCall);
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m178008m(@NotNull bsm<?> info) {
        info.getClass();
        if (!ve10.m198135i(info)) {
            return false;
        }
        long jM155944o = mqi0.m155944o();
        r610 r610Var = INSTANCE;
        return jM155944o - r610Var.m178025p() < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && !((hdv) ypv.m215673l(fld0.f98150e)).f107300f.get().booleanValue() && mqi0.m155944o() - r610Var.m178026v() > 28800000;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final MultiCallApplyRequestData m178009n(@NotNull ho2 liveData, @NotNull String ownerMultiCallOrder, @NotNull String ownerLiveId, @NotNull String inviteId, @NotNull String category, @NotNull String source, int intendPosition, @NotNull String enterRoomSource, @NotNull String ownerCreateSource) {
        liveData.getClass();
        ownerMultiCallOrder.getClass();
        ownerLiveId.getClass();
        inviteId.getClass();
        category.getClass();
        source.getClass();
        enterRoomSource.getClass();
        ownerCreateSource.getClass();
        MultiCallApplyRequestData multiCallApplyRequestData = new MultiCallApplyRequestData();
        multiCallApplyRequestData.ownerMultiCallOrder = ownerMultiCallOrder;
        multiCallApplyRequestData.ownerLiveId = ownerLiveId;
        multiCallApplyRequestData.inviteId = inviteId;
        multiCallApplyRequestData.category = category;
        multiCallApplyRequestData.source = source;
        multiCallApplyRequestData.intendPosition = intendPosition;
        multiCallApplyRequestData.fakeId = w220.m201014a();
        multiCallApplyRequestData.userId = ypv.f199493a.m199309D0();
        multiCallApplyRequestData.liveId = liveData.m149814k();
        multiCallApplyRequestData.enterRoomSource = enterRoomSource;
        multiCallApplyRequestData.ownerCreateSource = ownerCreateSource;
        return multiCallApplyRequestData;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final List<BLiveMultiCall> m178010o(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        Object objM129297F3 = presenter.m129297F3(new ckj(0));
        objM129297F3.getClass();
        return (List) objM129297F3;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final BLiveMultiCall m178011q(@NotNull h4t<?, ?> presenter) {
        Object next;
        presenter.getClass();
        Iterator<T> it = m178010o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.m87488d("host", ((BLiveMultiCall) next).role)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: r */
    public static final String m178012r(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        BLiveMultiCall bLiveMultiCallM178011q = m178011q(presenter);
        if (bLiveMultiCallM178011q != null) {
            return bLiveMultiCallM178011q.userId;
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final BLiveJsAudienceInfoData m178013s(@NotNull final h4t<?, ?> presenter) {
        presenter.getClass();
        final BLiveJsAudienceInfoData bLiveJsAudienceInfoDataNew_ = BLiveJsAudienceInfoData.new_();
        vwb.m200354z(m178010o(presenter), new e30() { // from class: l.o610
            @Override // p149l.e30
            public final void call(Object obj) {
                r610.m178014t(presenter, bLiveJsAudienceInfoDataNew_, (BLiveMultiCall) obj);
            }
        });
        bLiveJsAudienceInfoDataNew_.getClass();
        return bLiveJsAudienceInfoDataNew_;
    }

    /* JADX INFO: renamed from: t */
    public static final void m178014t(h4t h4tVar, BLiveJsAudienceInfoData bLiveJsAudienceInfoData, BLiveMultiCall bLiveMultiCall) {
        BLiveJsAudienceInfo bLiveJsAudienceInfoNew_ = BLiveJsAudienceInfo.new_();
        String str = bLiveMultiCall.userId;
        str.getClass();
        bLiveJsAudienceInfoNew_.isHost = m177989X(h4tVar, str);
        bLiveJsAudienceInfoNew_.position = bLiveMultiCall.position;
        bLiveJsAudienceInfoNew_.userId = bLiveMultiCall.userId;
        bLiveJsAudienceInfoNew_.userName = bLiveMultiCall.userName;
        bLiveJsAudienceInfoNew_.userImage = bLiveMultiCall.userAvatar;
        bLiveJsAudienceInfoData.audienceList.add(bLiveJsAudienceInfoNew_);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m178015u(int deputyCount, boolean hasLeadRole) {
        if (deputyCount == 4) {
            return "2x2";
        }
        if (deputyCount == 6) {
            return "1plus5";
        }
        if (deputyCount != 9) {
            return "2x2";
        }
        return hasLeadRole ? "1plus8" : "3x3";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m178016w(@NotNull String name, int length) {
        name.getClass();
        return name.length() > length ? name.substring(0, length).concat("...") : name;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m178017x(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return m178016w(str, i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: y */
    public static final String m178018y(int operation) {
        if (operation == 1) {
            return "update_all";
        }
        if (operation == 2) {
            return "update_single";
        }
        if (operation != 3) {
            return operation != 4 ? "" : "add";
        }
        return Action.remove;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: z */
    public static final BLiveMultiCall m178019z(@NotNull h4t<?, ?> presenter) {
        Object next;
        presenter.getClass();
        Iterator<T> it = m178010o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (ve10.m198137k(((BLiveMultiCall) next).role)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m178020e0(BLiveMultiCall call) {
        if (ve10.m198136j(call)) {
            return false;
        }
        if (ve10.m198128b(call)) {
            return m177982Q(call);
        }
        if (ve10.m198132f(call)) {
            return m177985T(call) || m177982Q(call);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m178021f(h4t<?, ?> presenter, BLiveMultiCall call) {
        if (ve10.m198136j(call)) {
            return m177982Q(call);
        }
        if (ve10.m198128b(call)) {
            return !m177988W(call.userId) && m177982Q(call);
        }
        if (ve10.m198132f(call)) {
            return m177985T(call) || m177984S(call) || m177987V(presenter, call);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f0 */
    public final void m178022f0(@NotNull final h4t<?, ?> presenter) {
        presenter.getClass();
        String strM149818o = presenter.m206027E2().m149818o();
        strM149818o.getClass();
        zr0.m219921h(strM149818o).subscribe(ffw.m121197h(new e30() { // from class: l.q610
            @Override // p149l.e30
            public final void call(Object obj) {
                r610.m178000e(presenter, (BLiveMultiCallAnnouncement) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m178023g(h4t<?, ?> presenter, BLiveMultiCall call) {
        if (ve10.m198136j(call)) {
            return false;
        }
        if (ve10.m198128b(call)) {
            return m177984S(call);
        }
        if (ve10.m198132f(call)) {
            return m177985T(call) || m177984S(call) || m177987V(presenter, call);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m178024h0(h4t<?, ?> presenter, BLiveMultiCall call, String anchorId) {
        if (Intrinsics.m87488d(anchorId, call.userId)) {
            return false;
        }
        if (ve10.m198136j(call) || ve10.m198128b(call)) {
            return m177986U(call, anchorId);
        }
        if (ve10.m198132f(call)) {
            return m177985T(call) || m177984S(call) || m177987V(presenter, call);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final long m178025p() {
        Long l2 = ((hdv) ypv.m215673l(fld0.f98150e)).f107296b.get();
        l2.getClass();
        return l2.longValue();
    }

    /* JADX INFO: renamed from: v */
    public final long m178026v() {
        Long l2 = ((hdv) ypv.m215673l(fld0.f98150e)).f107299e.get();
        l2.getClass();
        return l2.longValue();
    }
}

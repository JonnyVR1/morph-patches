package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveJsAudienceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveJsAudienceInfoData;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.MultiCallApplyRequestData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0018\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\bJ'\u0010\u001f\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0007¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b*\u0010)J!\u0010,\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u000bH\u0007¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00102\u001a\u00020\rH\u0007¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b9\u00101J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u00101J!\u0010;\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b;\u0010<J)\u0010=\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u00102\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b?\u0010<J\u001f\u0010@\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b@\u0010)J%\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100A2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bD\u0010)J\u001f\u0010E\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bE\u0010)J\u001f\u0010F\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bF\u0010/J/\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010H2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bI\u0010JJ'\u0010K\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u0010H\u0007¢\u0006\u0004\bN\u00101J\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bO\u00101J'\u0010P\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bP\u00106J'\u0010Q\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bQ\u00106J/\u0010S\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\bU\u0010\bJ\u001f\u0010W\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\r2\u0006\u0010V\u001a\u00020\rH\u0007¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\tH\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u00062\u0006\u0010^\u001a\u00020]H\u0007¢\u0006\u0004\b_\u0010`J\u001f\u0010d\u001a\u00020\u00062\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020\u000bH\u0007¢\u0006\u0004\bd\u0010eJ!\u0010h\u001a\u00020\r2\u0006\u0010f\u001a\u00020\r2\b\b\u0002\u0010g\u001a\u00020\tH\u0007¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u00020\r2\u0006\u0010f\u001a\u00020\r2\b\b\u0002\u0010g\u001a\u00020\tH\u0007¢\u0006\u0004\bj\u0010iJ[\u0010v\u001a\u00020u2\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020\r2\u0006\u0010n\u001a\u00020\r2\u0006\u0010o\u001a\u00020\r2\u0006\u0010p\u001a\u00020\r2\u0006\u0010q\u001a\u00020\r2\u0006\u0010r\u001a\u00020\t2\b\b\u0002\u0010s\u001a\u00020\r2\b\b\u0002\u0010t\u001a\u00020\rH\u0007¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u000b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0007¢\u0006\u0004\bx\u0010yJ\u000f\u0010{\u001a\u00020zH\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020zH\u0002¢\u0006\u0004\b}\u0010|J\u0018\u0010\u007f\u001a\u00020\r2\u0006\u0010~\u001a\u00020\tH\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0005\b\u0081\u0001\u0010&J#\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J*\u0010\u0085\u0001\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u00102\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J#\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0005\b\u0087\u0001\u0010<J#\u0010\u0088\u0001\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0005\b\u0088\u0001\u0010/¨\u0006\u0089\u0001"}, m88121d2 = {"Ll/bf10;", "", "<init>", "()V", "Ll/i6t;", "presenter", "", "f0", "(Ll/i6t;)V", "", "deputyCount", "", "hasLeadRole", "", "u", "(IZ)Ljava/lang/String;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "from", "i0", "(Ll/i6t;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)V", "Ll/dum;", BaseSei.INFO, "tabType", "a0", "(Ll/i6t;Ll/dum;II)V", "tryMultiCallUpgradeEntry", "b0", "(Ll/i6t;Ll/dum;IIZ)V", "k", "callId", "Z", "(Ll/i6t;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAsset;", "multiCallAsset", "G", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAsset;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAsset;", "L", "()Z", BloodType.f39576O, "N", "(Ll/i6t;)Z", "P", "inOwnerRoom", c4s.C_ZONE, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Z)Ljava/lang/String;", "D", "(Ll/i6t;)Ljava/lang/String;", "Q", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "userId", "U", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)Z", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Ll/i6t;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "W", "(Ljava/lang/String;)Z", p7f.GPS_DIRECTION_TRUE, p7f.LATITUDE_SOUTH, "B", "(Ll/i6t;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "E", "(Ll/i6t;Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", BaseSei.f14626Z, "M", "", "o", "(Ll/i6t;)Ljava/util/List;", "J", "K", "A", "selfRole", "Landroid/util/Pair;", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)Landroid/util/Pair;", "R", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ll/i6t;)Z", BLiveActivity.TYPE_MULTI_CALL, BLiveStormDanmakuGiftResourceType.f45292l, "e0", "f", "g", "anchorId", "h0", "(Ll/i6t;Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Ljava/lang/String;)Z", "H", "liveId", "I", "(Ljava/lang/String;Ljava/lang/String;)V", "position", "maxPos", "Y", "(II)Z", "", "error", "j", "(Ljava/lang/Throwable;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "isBlack", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/android/app/Act;Z)V", AuthenticationTokenClaims.JSON_KEY_NAME, "length", "w", "(Ljava/lang/String;I)Ljava/lang/String;", "g0", "Ll/oo2;", "liveData", "ownerMultiCallOrder", "ownerLiveId", "inviteId", "category", "source", "intendPosition", "enterRoomSource", "ownerCreateSource", "Lcom/p1/mobile/putong/live/base/data/MultiCallApplyRequestData;", "n", "(Ll/oo2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/MultiCallApplyRequestData;", "m", "(Ll/dum;)Z", "", "p", "()J", ResourceDirection.f39656v, MessageType.operation, BaseSei.f14625Y, "(I)Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/live/base/data/BLiveJsAudienceInfoData;", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/i6t;)Lcom/p1/mobile/putong/live/base/data/BLiveJsAudienceInfoData;", "X", "(Ll/i6t;Ljava/lang/String;)Z", "q", "r", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bf10 {

    @NotNull
    public static final bf10 INSTANCE = new bf10();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: A */
    public static final String m103795A(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        Object objM138856F3 = presenter.m138856F3(new al10(0));
        objM138856F3.getClass();
        return (String) objM138856F3;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: B */
    public static final BLiveMultiCall m103796B(@NotNull i6t<?, ?> presenter) {
        Object next;
        presenter.getClass();
        Iterator<T> it = m103839o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (m103817W(((BLiveMultiCall) next).userId)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: C */
    public static final String m103797C(@Nullable BLiveMultiCall call, boolean inOwnerRoom) {
        if (fp10.m126517d(call)) {
            call.getClass();
            String str = call.role;
            str.getClass();
            return str;
        }
        if (inOwnerRoom) {
            String str2 = cd10.f81079g;
            str2.getClass();
            return str2;
        }
        String str3 = cd10.f81080h;
        str3.getClass();
        return str3;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: D */
    public static final String m103798D(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        return m103797C(m103796B(presenter), m103807M(presenter));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: E */
    public static final BLiveMultiCall m103799E(@NotNull i6t<?, ?> presenter, @NotNull String userId) {
        Object next;
        presenter.getClass();
        userId.getClass();
        Iterator<T> it = m103839o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.m88377d(userId, ((BLiveMultiCall) next).userId)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: F */
    public static final Pair<String, Boolean> m103800F(@NotNull BLiveMultiCall call, @Nullable String selfRole) {
        String str;
        call.getClass();
        if (m103817W(call.ownerUserId) && fn10.m126334b(call)) {
            str = "OwnerControlAnchorVoice";
        } else if (m103817W(call.ownerUserId) && fn10.m126338f(call)) {
            str = "OwnerControlAudienceVoice";
        } else if (fn10.m126342j(call) && fn10.m126335c(selfRole)) {
            str = "AnchorControlOwnerVoice";
        } else if (m103817W(call.userId) && fn10.m126338f(call)) {
            str = "AudienceControlSelfVoice";
        } else {
            str = (fn10.m126335c(selfRole) && fn10.m126334b(call) && !m103817W(call.userId)) ? "AnchorControlAnchorVoice" : "";
        }
        ir10.m141746a("operate call voice type:".concat(str));
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Pair<>(str, Boolean.valueOf(m103811Q(call)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: G */
    public static final BLiveMultiCallAsset m103801G(@Nullable BLiveMultiCallAsset multiCallAsset) {
        if (multiCallAsset == null) {
            return null;
        }
        ((ifv) zrv.m221194l(htd0.f111523e)).f114695d.put(multiCallAsset);
        return multiCallAsset;
    }

    @JvmStatic
    /* JADX INFO: renamed from: H */
    public static final void m103802H(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        BLiveMultiCall bLiveMultiCallM103796B = m103796B(presenter);
        if (bLiveMultiCallM103796B != null) {
            String strM103797C = m103797C(bLiveMultiCallM103796B, true);
            if (fn10.m126343k(strM103797C)) {
                LivingNormalApiProvider.m72610c4(bLiveMultiCallM103796B.ownerLiveId);
            } else if (fn10.m126335c(strM103797C) || fn10.m126339g(strM103797C)) {
                LivingNormalApiProvider.m72630e6(bLiveMultiCallM103796B.f45248id, "live-stop");
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m103803I(@NotNull String selfRole, @NotNull final String liveId) {
        selfRole.getClass();
        liveId.getClass();
        if (fn10.m126335c(selfRole) || fn10.m126339g(selfRole)) {
            LivingNormalApiProvider.m72368B5(liveId).subscribe(dhw.m115829h(new y20() { // from class: l.ze10
                @Override // p153l.y20
                public final void call(Object obj) {
                    bf10.m103825c(liveId, (List) obj);
                }
            }));
        } else {
            LivingNormalApiProvider.m72610c4(liveId);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: J */
    public static final boolean m103804J(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        return m103839o(presenter).size() >= ((Number) presenter.m138856F3(new me10())).intValue();
    }

    @JvmStatic
    /* JADX INFO: renamed from: K */
    public static final boolean m103805K(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        return m103804J(presenter) && m103806L();
    }

    @JvmStatic
    /* JADX INFO: renamed from: L */
    public static final boolean m103806L() {
        BLiveMultiCallAsset bLiveMultiCallAsset = ((ifv) zrv.m221194l(htd0.f111523e)).f114695d.get();
        if (bLiveMultiCallAsset != null) {
            return bLiveMultiCallAsset.freeCall;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: M */
    public static final boolean m103807M(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        BLiveMultiCall bLiveMultiCallM103848z = m103848z(presenter);
        if (bLiveMultiCallM103848z != null) {
            return TextUtils.equals(bLiveMultiCallM103848z.ownerRoomId, presenter.m213810E2().m202194o());
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: N */
    public static final boolean m103808N(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        return MotionType.multi_call == presenter.m213817N2();
    }

    @JvmStatic
    /* JADX INFO: renamed from: O */
    public static final boolean m103809O() {
        return zrv.m221193k().m203394D3();
    }

    @JvmStatic
    /* JADX INFO: renamed from: P */
    public static final boolean m103810P(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        return m103808N(presenter) && yj5.m216389b(m103796B(presenter));
    }

    @JvmStatic
    /* JADX INFO: renamed from: Q */
    public static final boolean m103811Q(@NotNull BLiveMultiCall call) {
        call.getClass();
        return call.mutedByUserIds.contains(zrv.f205799a.m207631D0());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: R */
    public static final boolean m103812R(@NotNull BLiveMultiCall call, @NotNull i6t<?, ?> presenter) {
        call.getClass();
        presenter.getClass();
        String strM103798D = m103798D(presenter);
        String str = presenter.m213810E2().m168532l0().f56859id;
        str.getClass();
        if (fn10.m126343k(strM103798D)) {
            return INSTANCE.m103849e0(call);
        }
        if (fn10.m126335c(strM103798D)) {
            return INSTANCE.m103850f(presenter, call);
        }
        if (fn10.m126339g(strM103798D)) {
            return INSTANCE.m103852g(presenter, call);
        }
        if (fn10.m126346n(strM103798D)) {
            return INSTANCE.m103853h0(presenter, call, str);
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: S */
    public static final boolean m103813S(@NotNull BLiveMultiCall call) {
        call.getClass();
        return call.mutedByUserIds.contains(call.ownerUserId);
    }

    @JvmStatic
    /* JADX INFO: renamed from: T */
    public static final boolean m103814T(@NotNull BLiveMultiCall call) {
        call.getClass();
        return call.mutedByUserIds.contains(call.userId);
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final boolean m103815U(@NotNull BLiveMultiCall call, @NotNull String userId) {
        call.getClass();
        userId.getClass();
        return call.mutedByUserIds.contains(userId);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final boolean m103816V(@NotNull i6t<?, ?> presenter, @NotNull BLiveMultiCall call) {
        presenter.getClass();
        call.getClass();
        BLiveMultiCall bLiveMultiCallM103848z = m103848z(presenter);
        if (bLiveMultiCallM103848z != null) {
            String str = presenter.m213810E2().m168532l0().f56859id;
            str.getClass();
            if (m103815U(bLiveMultiCallM103848z, str) && !m103817W(call.userId)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: W */
    public static final boolean m103817W(@Nullable String userId) {
        return TextUtils.equals(userId, zrv.f205799a.m207631D0());
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final boolean m103818X(@NotNull i6t<?, ?> presenter, @NotNull String userId) {
        presenter.getClass();
        userId.getClass();
        return TextUtils.equals(m103841r(presenter), userId);
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y */
    public static final boolean m103819Y(int position, int maxPos) {
        return 1 <= position && position <= maxPos;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m103820Z(@NotNull i6t<?, ?> presenter, @NotNull String callId) {
        presenter.getClass();
        callId.getClass();
    }

    @JvmStatic
    /* JADX INFO: renamed from: a0 */
    public static final void m103822a0(@NotNull i6t<?, ?> presenter, @NotNull dum<?> info, int tabType, int from) {
        presenter.getClass();
        info.getClass();
        m103824b0(presenter, info, tabType, from, false);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: b0 */
    public static final void m103824b0(@NotNull final i6t<?, ?> presenter, @NotNull dum<?> info, final int tabType, int from, boolean tryMultiCallUpgradeEntry) {
        presenter.getClass();
        info.getClass();
        if (((Boolean) presenter.m138856F3(new adx(800))).booleanValue()) {
            o1j0.m165634h(R$string.f48277o8);
            return;
        }
        if (info.f90824j.m209548L3(MotionType.multi_connect)) {
            o1j0.m165634h(R$string.f48255n8);
            return;
        }
        BLiveMultiCall bLiveMultiCallM103796B = m103796B(presenter);
        if (bLiveMultiCallM103796B == null) {
            if (tryMultiCallUpgradeEntry && m103831h()) {
                presenter.m213811F2().MultiCallEvent.showMultiCallUpgradeEntryDlg().mo199273j(Boolean.TRUE);
                return;
            } else {
                presenter.duringCreated(LivingNormalApiProvider.m72810y6(presenter.m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.we10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bf10.m103826c0(tabType, presenter, (BLiveMultiCallAsset) obj);
                    }
                }, new y20() { // from class: l.xe10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bf10.m103828d0((Throwable) obj);
                    }
                }));
                return;
            }
        }
        if (fn10.m126342j(bLiveMultiCallM103796B)) {
            presenter.m213811F2().MultiCallEvent.openManageDialog().mo199273j(Integer.valueOf(tabType));
        } else if (fn10.m126334b(bLiveMultiCallM103796B)) {
            o1j0.m165634h(R$string.f47927Y7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m103825c(String str, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m88377d(((BLiveMultiCall) next).liveId, str));
        BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) next;
        if (bLiveMultiCall != null) {
            LivingNormalApiProvider.m72630e6(bLiveMultiCall.f45248id, "live-stop");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m103826c0(int i, i6t i6tVar, BLiveMultiCallAsset bLiveMultiCallAsset) {
        bLiveMultiCallAsset.getClass();
        String str = cd10.f81076d;
        str.getClass();
        String str2 = bLiveMultiCallAsset.multiCallOrder;
        str2.getClass();
        i6tVar.m213811F2().MultiCallEvent.startLiveMultiCall().mo199273j(new ep10(str, str2, m103844u(bLiveMultiCallAsset.maxCallNum, false), i));
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m103828d0(Throwable th) {
        th.getClass();
        m103834j(th);
    }

    /* JADX INFO: renamed from: e */
    public static void m103829e(i6t i6tVar, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        i6tVar.m213811F2().MultiCallEvent.announcementData().mo199274m(bLiveMultiCallAnnouncement);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public static final String m103830g0(@NotNull String name, int length) {
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
    public static final boolean m103831h() {
        htd0<ifv> htd0Var = htd0.f111523e;
        Long l2 = ((ifv) zrv.m221194l(htd0Var)).f114699h.get();
        l2.getClass();
        if (!pzi0.m174439D(l2.longValue())) {
            ((ifv) zrv.m221194l(htd0Var)).f114698g.put(0);
            ((ifv) zrv.m221194l(htd0Var)).f114699h.put(Long.valueOf(pzi0.m174454o()));
        }
        BLiveCommonConfig bLiveCommonConfigM203491P4 = zrv.m221193k().m203491P4();
        if (bLiveCommonConfigM203491P4 == null) {
            return false;
        }
        return bLiveCommonConfigM203491P4.f45198on && ((ifv) zrv.m221194l(htd0Var)).f114698g.get().intValue() < bLiveCommonConfigM203491P4.showCountPerDay;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m103832i(@NotNull Act act, boolean isBlack) {
        act.getClass();
        if (isBlack) {
            PutongAct.setLightStatusBar(act.getWindow(), 1024);
        } else {
            act.getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i0 */
    public static final void m103833i0(@NotNull i6t<?, ?> presenter, @NotNull BLiveMultiCall call, @NotNull String from) {
        presenter.getClass();
        call.getClass();
        from.getClass();
        ir10.m141746a("update self call,from:" + from + ",state:" + call.state + ",id:" + call.f45248id);
        presenter.m213811F2().MultiCallEvent.updateSelfCall().mo199273j(call);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m103834j(@NotNull Throwable error) {
        String str;
        error.getClass();
        if (!(error instanceof TantanException.Client.CoreService) || (str = ((TantanException.Client.CoreService) error).metaMessage) == null) {
            o1j0.m165634h(R$string.f47546G9);
        } else {
            o1j0.m165651y(str);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m103835k(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        presenter.m213811F2().MultiCallEvent.closeMultiCallMotion().m199277p();
        presenter.m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
        presenter.m213811F2().MultiCallEvent.openManageDialog().mo199273j(-100);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m103836l(@NotNull BLiveMultiCall multiCall) {
        multiCall.getClass();
        return m103817W(multiCall.userId) && fp10.INSTANCE.m126519f(multiCall);
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m103837m(@NotNull dum<?> info) {
        info.getClass();
        if (!fn10.m126341i(info)) {
            return false;
        }
        long jM174454o = pzi0.m174454o();
        bf10 bf10Var = INSTANCE;
        return jM174454o - bf10Var.m103854p() < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && !((ifv) zrv.m221194l(htd0.f111523e)).f114697f.get().booleanValue() && pzi0.m174454o() - bf10Var.m103855v() > 28800000;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final MultiCallApplyRequestData m103838n(@NotNull oo2 liveData, @NotNull String ownerMultiCallOrder, @NotNull String ownerLiveId, @NotNull String inviteId, @NotNull String category, @NotNull String source, int intendPosition, @NotNull String enterRoomSource, @NotNull String ownerCreateSource) {
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
        multiCallApplyRequestData.fakeId = eb20.m120148a();
        multiCallApplyRequestData.userId = zrv.f205799a.m207631D0();
        multiCallApplyRequestData.liveId = liveData.m202191k();
        multiCallApplyRequestData.enterRoomSource = enterRoomSource;
        multiCallApplyRequestData.ownerCreateSource = ownerCreateSource;
        return multiCallApplyRequestData;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final List<BLiveMultiCall> m103839o(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        Object objM138856F3 = presenter.m138856F3(new smj(0));
        objM138856F3.getClass();
        return (List) objM138856F3;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final BLiveMultiCall m103840q(@NotNull i6t<?, ?> presenter) {
        Object next;
        presenter.getClass();
        Iterator<T> it = m103839o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.m88377d("host", ((BLiveMultiCall) next).role)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: r */
    public static final String m103841r(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        BLiveMultiCall bLiveMultiCallM103840q = m103840q(presenter);
        if (bLiveMultiCallM103840q != null) {
            return bLiveMultiCallM103840q.userId;
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final BLiveJsAudienceInfoData m103842s(@NotNull final i6t<?, ?> presenter) {
        presenter.getClass();
        final BLiveJsAudienceInfoData bLiveJsAudienceInfoDataNew_ = BLiveJsAudienceInfoData.new_();
        jyb.m147537z(m103839o(presenter), new y20() { // from class: l.ye10
            @Override // p153l.y20
            public final void call(Object obj) {
                bf10.m103843t(presenter, bLiveJsAudienceInfoDataNew_, (BLiveMultiCall) obj);
            }
        });
        bLiveJsAudienceInfoDataNew_.getClass();
        return bLiveJsAudienceInfoDataNew_;
    }

    /* JADX INFO: renamed from: t */
    public static final void m103843t(i6t i6tVar, BLiveJsAudienceInfoData bLiveJsAudienceInfoData, BLiveMultiCall bLiveMultiCall) {
        BLiveJsAudienceInfo bLiveJsAudienceInfoNew_ = BLiveJsAudienceInfo.new_();
        String str = bLiveMultiCall.userId;
        str.getClass();
        bLiveJsAudienceInfoNew_.isHost = m103818X(i6tVar, str);
        bLiveJsAudienceInfoNew_.position = bLiveMultiCall.position;
        bLiveJsAudienceInfoNew_.userId = bLiveMultiCall.userId;
        bLiveJsAudienceInfoNew_.userName = bLiveMultiCall.userName;
        bLiveJsAudienceInfoNew_.userImage = bLiveMultiCall.userAvatar;
        bLiveJsAudienceInfoData.audienceList.add(bLiveJsAudienceInfoNew_);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m103844u(int deputyCount, boolean hasLeadRole) {
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
    public static final String m103845w(@NotNull String name, int length) {
        name.getClass();
        return name.length() > length ? name.substring(0, length).concat("...") : name;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m103846x(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return m103845w(str, i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: y */
    public static final String m103847y(int operation) {
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
    public static final BLiveMultiCall m103848z(@NotNull i6t<?, ?> presenter) {
        Object next;
        presenter.getClass();
        Iterator<T> it = m103839o(presenter).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fn10.m126343k(((BLiveMultiCall) next).role)) {
                return (BLiveMultiCall) next;
            }
        }
        next = null;
        return (BLiveMultiCall) next;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m103849e0(BLiveMultiCall call) {
        if (fn10.m126342j(call)) {
            return false;
        }
        if (fn10.m126334b(call)) {
            return m103811Q(call);
        }
        if (fn10.m126338f(call)) {
            return m103814T(call) || m103811Q(call);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m103850f(i6t<?, ?> presenter, BLiveMultiCall call) {
        if (fn10.m126342j(call)) {
            return m103811Q(call);
        }
        if (fn10.m126334b(call)) {
            return !m103817W(call.userId) && m103811Q(call);
        }
        if (fn10.m126338f(call)) {
            return m103814T(call) || m103813S(call) || m103816V(presenter, call);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: f0 */
    public final void m103851f0(@NotNull final i6t<?, ?> presenter) {
        presenter.getClass();
        String strM202194o = presenter.m213810E2().m202194o();
        strM202194o.getClass();
        es0.m122300h(strM202194o).subscribe(dhw.m115829h(new y20() { // from class: l.af10
            @Override // p153l.y20
            public final void call(Object obj) {
                bf10.m103829e(presenter, (BLiveMultiCallAnnouncement) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m103852g(i6t<?, ?> presenter, BLiveMultiCall call) {
        if (fn10.m126342j(call)) {
            return false;
        }
        if (fn10.m126334b(call)) {
            return m103813S(call);
        }
        if (fn10.m126338f(call)) {
            return m103814T(call) || m103813S(call) || m103816V(presenter, call);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m103853h0(i6t<?, ?> presenter, BLiveMultiCall call, String anchorId) {
        if (Intrinsics.m88377d(anchorId, call.userId)) {
            return false;
        }
        if (fn10.m126342j(call) || fn10.m126334b(call)) {
            return m103815U(call, anchorId);
        }
        if (fn10.m126338f(call)) {
            return m103814T(call) || m103813S(call) || m103816V(presenter, call);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final long m103854p() {
        Long l2 = ((ifv) zrv.m221194l(htd0.f111523e)).f114693b.get();
        l2.getClass();
        return l2.longValue();
    }

    /* JADX INFO: renamed from: v */
    public final long m103855v() {
        Long l2 = ((ifv) zrv.m221194l(htd0.f111523e)).f114696e.get();
        l2.getClass();
        return l2.longValue();
    }
}

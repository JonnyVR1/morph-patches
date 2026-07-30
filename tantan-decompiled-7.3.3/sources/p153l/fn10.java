package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010\fJ\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0017\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0019\u0010\fJ\u001b\u0010\u001c\u001a\u00020\u00062\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/fn10;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "", "role", "c", "(Ljava/lang/String;)Z", "j", "k", "f", "g", "p", "o", "n", "type", BLiveStormDanmakuGiftResourceType.f45292l, "m", "h", "e", Constants.INAPP_DATA_TAG, "Ll/dum;", BaseSei.INFO, RXScreenCaptureService.KEY_INDEX, "(Ll/dum;)Z", BLiveActivity.TYPE_MULTI_CALL, "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fn10 {

    @NotNull
    public static final fn10 INSTANCE = new fn10();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m126334b(@Nullable BLiveMultiCall call) {
        return m126335c(call != null ? call.role : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m126335c(@Nullable String role) {
        return Intrinsics.m88377d(cd10.f81077e, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m126336d(@Nullable String type) {
        return Intrinsics.m88377d("AnchorControlAnchorVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m126337e(@Nullable String type) {
        return Intrinsics.m88377d("AnchorControlOwnerVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m126338f(@Nullable BLiveMultiCall call) {
        return m126339g(call != null ? call.role : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m126339g(@Nullable String role) {
        return Intrinsics.m88377d(cd10.f81078f, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m126340h(@Nullable String type) {
        return Intrinsics.m88377d("AudienceControlSelfVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m126341i(@NotNull dum<?> info) {
        info.getClass();
        String strM98481d = info.f90822h.m168458I0().m98481d();
        return Intrinsics.m88377d("moment-nearby-multi-call-match", strM98481d) || Intrinsics.m88377d("moment-nearby-multi-call-live", strM98481d);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m126342j(@Nullable BLiveMultiCall call) {
        return m126343k(call != null ? call.role : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m126343k(@Nullable String role) {
        return Intrinsics.m88377d(cd10.f81076d, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m126344l(@Nullable String type) {
        return Intrinsics.m88377d("OwnerControlAnchorVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m126345m(@Nullable String type) {
        return Intrinsics.m88377d("OwnerControlAudienceVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final boolean m126346n(@Nullable String role) {
        return m126348p(role) || m126347o(role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m126347o(@Nullable String role) {
        return Intrinsics.m88377d(cd10.f81079g, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m126348p(@Nullable String role) {
        return Intrinsics.m88377d(cd10.f81080h, role);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m126349a(@Nullable BLiveMultiCall multiCall) {
        if (m126342j(multiCall)) {
            return "creator";
        }
        return m126334b(multiCall) ? "anchor_guest" : "viewer_guest";
    }
}

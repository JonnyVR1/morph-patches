package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0013\u0010\fJ\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010\fJ\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0017\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\fJ\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0019\u0010\fJ\u001b\u0010\u001c\u001a\u00020\u00062\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/ve10;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "", "role", "c", "(Ljava/lang/String;)Z", "j", "k", "f", "g", "p", "o", "n", "type", BLiveStormDanmakuGiftResourceType.f44444l, "m", "h", "e", Constants.INAPP_DATA_TAG, "Ll/bsm;", BaseSei.INFO, RXScreenCaptureService.KEY_INDEX, "(Ll/bsm;)Z", BLiveActivity.TYPE_MULTI_CALL, "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ve10 {

    @NotNull
    public static final ve10 INSTANCE = new ve10();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m198128b(@Nullable BLiveMultiCall call) {
        return m198129c(call != null ? call.role : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m198129c(@Nullable String role) {
        return Intrinsics.m87488d(s410.f162239e, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m198130d(@Nullable String type) {
        return Intrinsics.m87488d("AnchorControlAnchorVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m198131e(@Nullable String type) {
        return Intrinsics.m87488d("AnchorControlOwnerVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m198132f(@Nullable BLiveMultiCall call) {
        return m198133g(call != null ? call.role : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m198133g(@Nullable String role) {
        return Intrinsics.m87488d(s410.f162240f, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m198134h(@Nullable String type) {
        return Intrinsics.m87488d("AudienceControlSelfVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m198135i(@NotNull bsm<?> info) {
        info.getClass();
        String strM218717d = info.f77102h.m132069I0().m218717d();
        return Intrinsics.m87488d("moment-nearby-multi-call-match", strM218717d) || Intrinsics.m87488d("moment-nearby-multi-call-live", strM218717d);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m198136j(@Nullable BLiveMultiCall call) {
        return m198137k(call != null ? call.role : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m198137k(@Nullable String role) {
        return Intrinsics.m87488d(s410.f162238d, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m198138l(@Nullable String type) {
        return Intrinsics.m87488d("OwnerControlAnchorVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final boolean m198139m(@Nullable String type) {
        return Intrinsics.m87488d("OwnerControlAudienceVoice", type);
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final boolean m198140n(@Nullable String role) {
        return m198142p(role) || m198141o(role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m198141o(@Nullable String role) {
        return Intrinsics.m87488d(s410.f162241g, role);
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m198142p(@Nullable String role) {
        return Intrinsics.m87488d(s410.f162242h, role);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m198143a(@Nullable BLiveMultiCall multiCall) {
        if (m198136j(multiCall)) {
            return "creator";
        }
        return m198128b(multiCall) ? "anchor_guest" : "viewer_guest";
    }
}

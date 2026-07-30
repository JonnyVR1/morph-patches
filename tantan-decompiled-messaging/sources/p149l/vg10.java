package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\b¨\u0006\u000e"}, m87232d2 = {"Ll/vg10;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "call", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Z", "c", "a", "b", "e", "f", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vg10 {

    @NotNull
    public static final vg10 INSTANCE = new vg10();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m198309a(@Nullable BLiveMultiCall call) {
        return Intrinsics.m87488d(s410.f162248n, call != null ? call.state : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m198310b(@Nullable BLiveMultiCall call) {
        return Intrinsics.m87488d(s410.f162247m, call != null ? call.state : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m198311c(@Nullable BLiveMultiCall call) {
        return Intrinsics.m87488d(s410.f162250p, call != null ? call.state : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m198312d(@Nullable BLiveMultiCall call) {
        return Intrinsics.m87488d(s410.f162249o, call != null ? call.state : null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m198313e(@Nullable BLiveMultiCall call) {
        return Intrinsics.m87488d(s410.f162243i, call != null ? call.category : null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m198314f(@Nullable BLiveMultiCall call) {
        return Intrinsics.m87488d(s410.f162244j, call != null ? call.category : null);
    }
}

package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/j7d0;", "", "<init>", "()V", "", "role", "state", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInfo;", "multiCallInfo", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInfo;Ljava/lang/String;)Ljava/lang/String;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class j7d0 {

    @NotNull
    public static final j7d0 INSTANCE = new j7d0();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m140090a(@Nullable BLiveMultiCallInfo multiCallInfo, @NotNull String state) {
        state.getClass();
        String str = "";
        if (multiCallInfo != null) {
            String str2 = multiCallInfo.onGoing ? multiCallInfo.role : "";
            if (str2 != null) {
                str = str2;
            }
        }
        return m140091b(str, state);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m140091b(@NotNull String role, @NotNull String state) {
        role.getClass();
        state.getClass();
        if (TextUtils.isEmpty(role)) {
            if (Intrinsics.m87488d("onlive", state) || Intrinsics.m87488d("suspended", state)) {
                return "common_live";
            }
            return Intrinsics.m87488d("stopped", state) ? BLiveOperationTitleShowType.off : "NA";
        }
        if (Intrinsics.m87488d(Owner.TYPE, role)) {
            return "video_live_owner";
        }
        if (Intrinsics.m87488d("audience", role)) {
            return "video_live_audience_guest";
        }
        return Intrinsics.m87488d("anchor", role) ? "video_live_anchor_guest" : "video_live";
    }
}

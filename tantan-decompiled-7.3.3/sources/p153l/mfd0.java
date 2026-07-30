package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/mfd0;", "", "<init>", "()V", "", "role", "state", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInfo;", "multiCallInfo", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInfo;Ljava/lang/String;)Ljava/lang/String;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mfd0 {

    @NotNull
    public static final mfd0 INSTANCE = new mfd0();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m158164a(@Nullable BLiveMultiCallInfo multiCallInfo, @NotNull String state) {
        state.getClass();
        String str = "";
        if (multiCallInfo != null) {
            String str2 = multiCallInfo.onGoing ? multiCallInfo.role : "";
            if (str2 != null) {
                str = str2;
            }
        }
        return m158165b(str, state);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m158165b(@NotNull String role, @NotNull String state) {
        role.getClass();
        state.getClass();
        if (TextUtils.isEmpty(role)) {
            if (Intrinsics.m88377d("onlive", state) || Intrinsics.m88377d("suspended", state)) {
                return "common_live";
            }
            return Intrinsics.m88377d("stopped", state) ? BLiveOperationTitleShowType.off : "NA";
        }
        if (Intrinsics.m88377d(Owner.TYPE, role)) {
            return "video_live_owner";
        }
        if (Intrinsics.m88377d("audience", role)) {
            return "video_live_audience_guest";
        }
        return Intrinsics.m88377d("anchor", role) ? "video_live_anchor_guest" : "video_live";
    }
}

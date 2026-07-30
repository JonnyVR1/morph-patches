package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/btl0;", "", "<init>", "()V", "", "Ll/up2;", "list", "", "motionType", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ljava/lang/String;)Ll/up2;", "Ll/bsm;", BaseSei.INFO, "", "c", "(Ll/bsm;)Z", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class btl0 {

    @NotNull
    public static final btl0 INSTANCE = new btl0();

    /* JADX INFO: renamed from: a */
    public static Boolean m103861a(String str, up2 up2Var) {
        up2Var.getClass();
        return Boolean.valueOf(up2Var.m194593l(str) || up2Var.m194590i(str) != null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m103862b(@NotNull bsm<?> info) {
        info.getClass();
        VirtualVoiceMotionType currentMotionType = info.f77108n.getCurrentMotionType();
        if (currentMotionType != null) {
            return currentMotionType.equals("game");
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m103863c(@NotNull bsm<?> info) {
        info.getClass();
        VirtualVoiceMotionType currentMotionType = info.f77108n.getCurrentMotionType();
        if (currentMotionType != null) {
            return currentMotionType.equals(VirtualVoiceMotionType.ktv);
        }
        return false;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final up2<?, ?> m103864d(@NotNull List<? extends up2<?, ?>> list, @NotNull final String motionType) {
        list.getClass();
        motionType.getClass();
        return (up2) vwb.m200346r(list, new w9j() { // from class: l.atl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return btl0.m103861a(motionType, (up2) obj);
            }
        });
    }
}

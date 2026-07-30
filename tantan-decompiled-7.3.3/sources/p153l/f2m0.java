package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/f2m0;", "", "<init>", "()V", "", "Ll/lq2;", "list", "", "motionType", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Ljava/lang/String;)Ll/lq2;", "Ll/dum;", BaseSei.INFO, "", "c", "(Ll/dum;)Z", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f2m0 {

    @NotNull
    public static final f2m0 INSTANCE = new f2m0();

    /* JADX INFO: renamed from: a */
    public static Boolean m123631a(String str, lq2 lq2Var) {
        lq2Var.getClass();
        return Boolean.valueOf(lq2Var.m155311l(str) || lq2Var.m155308i(str) != null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m123632b(@NotNull dum<?> info) {
        info.getClass();
        VirtualVoiceMotionType currentMotionType = info.f90828n.getCurrentMotionType();
        if (currentMotionType != null) {
            return currentMotionType.equals("game");
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m123633c(@NotNull dum<?> info) {
        info.getClass();
        VirtualVoiceMotionType currentMotionType = info.f90828n.getCurrentMotionType();
        if (currentMotionType != null) {
            return currentMotionType.equals(VirtualVoiceMotionType.ktv);
        }
        return false;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final lq2<?, ?> m123634d(@NotNull List<? extends lq2<?, ?>> list, @NotNull final String motionType) {
        list.getClass();
        motionType.getClass();
        return (lq2) jyb.m147529r(list, new qcj() { // from class: l.e2m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f2m0.m123631a(motionType, (lq2) obj);
            }
        });
    }
}

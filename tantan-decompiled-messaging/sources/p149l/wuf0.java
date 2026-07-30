package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m87232d2 = {"Ll/wuf0;", "", "Ll/k9q0;", "id", "Ll/vuf0;", "a", "(Ll/k9q0;)Ll/vuf0;", "e", "", "workSpecId", "", Action.remove, "(Ljava/lang/String;)Ljava/util/List;", "", Constants.INAPP_DATA_TAG, "(Ll/k9q0;)Z", "Ll/haq0;", "spec", "b", "(Ll/haq0;)Ll/vuf0;", "Companion", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface wuf0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f188112a;

    /* JADX INFO: renamed from: l.wuf0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/wuf0$a;", "", "<init>", "()V", "", "synchronized", "Ll/wuf0;", "b", "(Z)Ll/wuf0;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f188112a = new Companion();

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ wuf0 m205624c(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return companion.m205626b(z);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final wuf0 m205625a() {
            return m205624c(this, false, 1, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: b */
        public final wuf0 m205626b(boolean z) {
            xuf0 xuf0Var = new xuf0();
            return z ? new jgh0(xuf0Var) : xuf0Var;
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: c */
    static wuf0 m205622c(boolean z) {
        return INSTANCE.m205626b(z);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static wuf0 create() {
        return INSTANCE.m205625a();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    vuf0 mo141292a(@NotNull k9q0 id);

    @NotNull
    /* JADX INFO: renamed from: b */
    default vuf0 m205623b(@NotNull haq0 spec) {
        spec.getClass();
        return mo141292a(oaq0.m163363a(spec));
    }

    /* JADX INFO: renamed from: d */
    boolean mo141293d(@NotNull k9q0 id);

    @Nullable
    /* JADX INFO: renamed from: e */
    vuf0 mo141294e(@NotNull k9q0 id);

    @NotNull
    List<vuf0> remove(@NotNull String workSpecId);
}

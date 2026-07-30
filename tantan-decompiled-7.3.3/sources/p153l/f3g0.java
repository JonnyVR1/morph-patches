package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m88121d2 = {"Ll/f3g0;", "", "Ll/piq0;", "id", "Ll/e3g0;", "a", "(Ll/piq0;)Ll/e3g0;", "e", "", "workSpecId", "", Action.remove, "(Ljava/lang/String;)Ljava/util/List;", "", Constants.INAPP_DATA_TAG, "(Ll/piq0;)Z", "Ll/mjq0;", "spec", "b", "(Ll/mjq0;)Ll/e3g0;", "Companion", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface f3g0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f96991a;

    /* JADX INFO: renamed from: l.f3g0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/f3g0$a;", "", "<init>", "()V", "", "synchronized", "Ll/f3g0;", "b", "(Z)Ll/f3g0;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f96991a = new Companion();

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ f3g0 m123737c(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return companion.m123739b(z);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final f3g0 m123738a() {
            return m123737c(this, false, 1, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: b */
        public final f3g0 m123739b(boolean z) {
            g3g0 g3g0Var = new g3g0();
            return z ? new qoh0(g3g0Var) : g3g0Var;
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: c */
    static f3g0 m123732c(boolean z) {
        return INSTANCE.m123739b(z);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    static f3g0 create() {
        return INSTANCE.m123738a();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    e3g0 mo123733a(@NotNull piq0 id);

    @NotNull
    /* JADX INFO: renamed from: b */
    default e3g0 m123734b(@NotNull mjq0 spec) {
        spec.getClass();
        return mo123733a(tjq0.m191450a(spec));
    }

    /* JADX INFO: renamed from: d */
    boolean mo123735d(@NotNull piq0 id);

    @Nullable
    /* JADX INFO: renamed from: e */
    e3g0 mo123736e(@NotNull piq0 id);

    @NotNull
    List<e3g0> remove(@NotNull String workSpecId);
}

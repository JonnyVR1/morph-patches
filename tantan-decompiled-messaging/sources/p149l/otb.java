package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b&\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u0015\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0017\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m87232d2 = {"Ll/otb;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "Ll/otb$c;", Constants.KEY_KEY, "a", "(Ll/otb$c;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "extras", "Companion", "c", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public abstract class otb {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<InterfaceC19034c<?>, Object> extras = new LinkedHashMap();

    /* JADX INFO: renamed from: l.otb$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/otb$b;", "Ll/otb;", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, "Ll/otb$c;", Constants.KEY_KEY, "a", "(Ll/otb$c;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C19033b extends otb {

        @NotNull
        public static final C19033b INSTANCE = new C19033b();

        @Override // p149l.otb
        @Nullable
        /* JADX INFO: renamed from: a */
        public <T> T mo143070a(@NotNull InterfaceC19034c<T> key) {
            key.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: l.otb$c */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m87232d2 = {"Ll/otb$c;", j6f.GPS_DIRECTION_TRUE, "", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface InterfaceC19034c<T> {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract <T> T mo143070a(@NotNull InterfaceC19034c<T> key);

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC19034c<?>, Object> m165932b() {
        return this.extras;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof otb) && Intrinsics.m87488d(this.extras, ((otb) other).extras);
    }

    public int hashCode() {
        return this.extras.hashCode();
    }

    @NotNull
    public String toString() {
        return "CreationExtras(extras=" + this.extras + ')';
    }

    /* JADX INFO: renamed from: l.otb$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/otb$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}

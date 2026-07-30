package kotlin.internal.jdk8;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "Lkotlin/random/Random;", "b", "()Lkotlin/random/Random;", "Lkotlin/time/Clock;", "c", "()Lkotlin/time/Clock;", "", WBConstants.AUTH_PARAMS_VERSION, "", Constants.INAPP_DATA_TAG, "(I)Z", "a", "kotlin-stdlib-jdk8"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    /* JADX INFO: renamed from: kotlin.internal.jdk8.JDK8PlatformImplementations$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m87232d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$a;", "", "<init>", "()V", "", "a", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15157a {

        @NotNull
        public static final C15157a INSTANCE = new C15157a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public static final Integer sdkVersion;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            sdkVersion = num2;
        }
    }

    @Override // kotlin.internal.PlatformImplementations
    @NotNull
    /* JADX INFO: renamed from: b */
    public Random mo87387b() {
        return m87400d(34) ? new PlatformThreadLocalRandom() : super.mo87387b();
    }

    @Override // kotlin.internal.PlatformImplementations
    @ExperimentalTime
    @NotNull
    /* JADX INFO: renamed from: c */
    public Clock mo87388c() {
        return m87400d(26) ? new Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$1
        } : new Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$2
        };
    }

    /* JADX INFO: renamed from: d */
    public final boolean m87400d(int version) {
        Integer num = C15157a.sdkVersion;
        return num == null || num.intValue() >= version;
    }
}

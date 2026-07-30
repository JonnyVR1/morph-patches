package kotlin.internal.jdk7;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "<init>", "()V", "", WBConstants.AUTH_PARAMS_VERSION, "", Constants.INAPP_DATA_TAG, "(I)Z", "", "cause", "exception", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib-jdk7"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* JADX INFO: renamed from: kotlin.internal.jdk7.JDK7PlatformImplementations$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m88121d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$a;", "", "<init>", "()V", "", "a", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk7"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15263a {

        @NotNull
        public static final C15263a INSTANCE = new C15263a();

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

    /* JADX INFO: renamed from: d */
    private final boolean m88288d(int version) {
        Integer num = C15263a.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // kotlin.internal.PlatformImplementations
    /* JADX INFO: renamed from: a */
    public void mo88275a(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        cause.getClass();
        exception.getClass();
        if (m88288d(19)) {
            cause.addSuppressed(exception);
        } else {
            super.mo88275a(cause, exception);
        }
    }
}

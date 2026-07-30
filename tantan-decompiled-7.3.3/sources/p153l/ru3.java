package p153l;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/ru3;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/su3;", "c", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Ll/su3;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "executorMap", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ru3 {

    @NotNull
    public static final ru3 INSTANCE = new ru3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<String, su3> executorMap = new ConcurrentHashMap<>();

    private ru3() {
    }

    /* JADX INFO: renamed from: a */
    public static su3 m183184a(Function1 function1, Object obj) {
        function1.getClass();
        return (su3) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static su3 m183185b(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        str.getClass();
        return new su3(cleverTapInstanceConfig);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final su3 m183186c(@Nullable final CleverTapInstanceConfig config) {
        if (config == null) {
            wg3.m206174a("Can't create task for null config");
            return null;
        }
        String accountId = config.getAccountId();
        ConcurrentHashMap<String, su3> concurrentHashMap = executorMap;
        final Function1 function1 = new Function1() { // from class: l.pu3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ru3.m183185b(config, (String) obj);
            }
        };
        su3 su3VarComputeIfAbsent = concurrentHashMap.computeIfAbsent(accountId, new Function() { // from class: l.qu3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ru3.m183184a(function1, obj);
            }
        });
        su3VarComputeIfAbsent.getClass();
        return su3VarComputeIfAbsent;
    }
}

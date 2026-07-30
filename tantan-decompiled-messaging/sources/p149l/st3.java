package p149l;

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
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/st3;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/tt3;", "c", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Ll/tt3;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "executorMap", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class st3 {

    @NotNull
    public static final st3 INSTANCE = new st3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<String, tt3> executorMap = new ConcurrentHashMap<>();

    private st3() {
    }

    /* JADX INFO: renamed from: a */
    public static tt3 m185847a(Function1 function1, Object obj) {
        function1.getClass();
        return (tt3) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static tt3 m185848b(CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        str.getClass();
        return new tt3(cleverTapInstanceConfig);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final tt3 m185849c(@Nullable final CleverTapInstanceConfig config) {
        if (config == null) {
            ig3.m135964a("Can't create task for null config");
            return null;
        }
        String accountId = config.getAccountId();
        ConcurrentHashMap<String, tt3> concurrentHashMap = executorMap;
        final Function1 function1 = new Function1() { // from class: l.qt3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return st3.m185848b(config, (String) obj);
            }
        };
        tt3 tt3VarComputeIfAbsent = concurrentHashMap.computeIfAbsent(accountId, new Function() { // from class: l.rt3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return st3.m185847a(function1, obj);
            }
        });
        tt3VarComputeIfAbsent.getClass();
        return tt3VarComputeIfAbsent;
    }
}

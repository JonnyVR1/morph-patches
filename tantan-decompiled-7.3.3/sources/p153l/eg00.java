package p153l;

import com.facebook.AuthenticationTokenClaims;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, m88121d2 = {"Ll/eg00;", "", "<init>", "()V", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "continuation", "", "b", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/String;", "Ll/eg00$a;", "a", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ll/eg00$a;", "Ll/eg00$a;", "notOnJava9", "cache", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class eg00 {

    @NotNull
    public static final eg00 INSTANCE = new eg00();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final C16769a notOnJava9 = new C16769a(null, null, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static C16769a cache;

    /* JADX INFO: renamed from: l.eg00$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, m88121d2 = {"Ll/eg00$a;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "a", "Ljava/lang/reflect/Method;", "b", "c", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16769a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Method getModuleMethod;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Method getDescriptorMethod;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final Method nameMethod;

        public C16769a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C16769a m120751a(BaseContinuationImpl continuation) {
        try {
            C16769a c16769a = new C16769a(Class.class.getDeclaredMethod("getModule", null), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AuthenticationTokenClaims.JSON_KEY_NAME, null));
            cache = c16769a;
            return c16769a;
        } catch (Exception unused) {
            C16769a c16769a2 = notOnJava9;
            cache = c16769a2;
            return c16769a2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m120752b(@NotNull BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        continuation.getClass();
        C16769a c16769aM120751a = cache;
        if (c16769aM120751a == null) {
            c16769aM120751a = m120751a(continuation);
        }
        if (c16769aM120751a != notOnJava9 && (method = c16769aM120751a.getModuleMethod) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = c16769aM120751a.getDescriptorMethod) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = c16769aM120751a.nameMethod;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}

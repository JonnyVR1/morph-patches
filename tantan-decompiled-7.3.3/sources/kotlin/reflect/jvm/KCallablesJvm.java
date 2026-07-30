package kotlin.reflect.jvm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m88121d2 = {"Lkotlin/reflect/KCallable;", "", "value", "a", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "isAccessible", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmName
public final class KCallablesJvm {
    /* JADX INFO: renamed from: a */
    public static final boolean m88528a(@NotNull KCallable<?> kCallable) {
        Caller<?> callerMo88625S;
        kCallable.getClass();
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field fieldM88533b = ReflectJvmMapping.m88533b(kProperty);
            if (fieldM88533b != null ? fieldM88533b.isAccessible() : true) {
                Method methodM88534c = ReflectJvmMapping.m88534c(kProperty);
                if (methodM88534c != null ? methodM88534c.isAccessible() : true) {
                    Method methodM88536e = ReflectJvmMapping.m88536e((KMutableProperty) kCallable);
                    if (methodM88536e != null ? methodM88536e.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field fieldM88533b2 = ReflectJvmMapping.m88533b(kProperty2);
            if (fieldM88533b2 != null ? fieldM88533b2.isAccessible() : true) {
                Method methodM88534c2 = ReflectJvmMapping.m88534c(kProperty2);
                if (methodM88534c2 != null ? methodM88534c2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (kCallable instanceof KProperty.Getter) {
            Field fieldM88533b3 = ReflectJvmMapping.m88533b(((KProperty.Getter) kCallable).mo88499g());
            if (fieldM88533b3 != null ? fieldM88533b3.isAccessible() : true) {
                Method methodM88535d = ReflectJvmMapping.m88535d((KFunction) kCallable);
                if (methodM88535d != null ? methodM88535d.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (kCallable instanceof KMutableProperty.Setter) {
            Field fieldM88533b4 = ReflectJvmMapping.m88533b(((KMutableProperty.Setter) kCallable).mo88499g());
            if (fieldM88533b4 != null ? fieldM88533b4.isAccessible() : true) {
                Method methodM88535d2 = ReflectJvmMapping.m88535d((KFunction) kCallable);
                if (methodM88535d2 != null ? methodM88535d2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(kCallable instanceof KFunction)) {
            StringBuilder sb = new StringBuilder("Unknown callable: ");
            sb.append(kCallable);
            Class<?> cls = kCallable.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new UnsupportedOperationException(sb.toString());
        }
        KFunction kFunction = (KFunction) kCallable;
        Method methodM88535d3 = ReflectJvmMapping.m88535d(kFunction);
        if (methodM88535d3 != null ? methodM88535d3.isAccessible() : true) {
            KCallableImpl<?> kCallableImplM88930b = UtilKt.m88930b(kCallable);
            Member memberMo88950b = (kCallableImplM88930b == null || (callerMo88625S = kCallableImplM88930b.mo88625S()) == null) ? null : callerMo88625S.mo88950b();
            AccessibleObject accessibleObject = memberMo88950b instanceof AccessibleObject ? (AccessibleObject) memberMo88950b : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorM88532a = ReflectJvmMapping.m88532a(kFunction);
                if (constructorM88532a != null ? constructorM88532a.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}

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
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m87232d2 = {"Lkotlin/reflect/KCallable;", "", "value", "a", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "isAccessible", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
public final class KCallablesJvm {
    /* JADX INFO: renamed from: a */
    public static final boolean m87637a(@NotNull KCallable<?> kCallable) {
        Caller<?> callerMo87734S;
        kCallable.getClass();
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field fieldM87642b = ReflectJvmMapping.m87642b(kProperty);
            if (fieldM87642b != null ? fieldM87642b.isAccessible() : true) {
                Method methodM87643c = ReflectJvmMapping.m87643c(kProperty);
                if (methodM87643c != null ? methodM87643c.isAccessible() : true) {
                    Method methodM87645e = ReflectJvmMapping.m87645e((KMutableProperty) kCallable);
                    if (methodM87645e != null ? methodM87645e.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field fieldM87642b2 = ReflectJvmMapping.m87642b(kProperty2);
            if (fieldM87642b2 != null ? fieldM87642b2.isAccessible() : true) {
                Method methodM87643c2 = ReflectJvmMapping.m87643c(kProperty2);
                if (methodM87643c2 != null ? methodM87643c2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (kCallable instanceof KProperty.Getter) {
            Field fieldM87642b3 = ReflectJvmMapping.m87642b(((KProperty.Getter) kCallable).mo87608g());
            if (fieldM87642b3 != null ? fieldM87642b3.isAccessible() : true) {
                Method methodM87644d = ReflectJvmMapping.m87644d((KFunction) kCallable);
                if (methodM87644d != null ? methodM87644d.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (kCallable instanceof KMutableProperty.Setter) {
            Field fieldM87642b4 = ReflectJvmMapping.m87642b(((KMutableProperty.Setter) kCallable).mo87608g());
            if (fieldM87642b4 != null ? fieldM87642b4.isAccessible() : true) {
                Method methodM87644d2 = ReflectJvmMapping.m87644d((KFunction) kCallable);
                if (methodM87644d2 != null ? methodM87644d2.isAccessible() : true) {
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
        Method methodM87644d3 = ReflectJvmMapping.m87644d(kFunction);
        if (methodM87644d3 != null ? methodM87644d3.isAccessible() : true) {
            KCallableImpl<?> kCallableImplM88039b = UtilKt.m88039b(kCallable);
            Member memberMo88059b = (kCallableImplM88039b == null || (callerMo87734S = kCallableImplM88039b.mo87734S()) == null) ? null : callerMo87734S.mo88059b();
            AccessibleObject accessibleObject = memberMo88059b instanceof AccessibleObject ? (AccessibleObject) memberMo88059b : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorM87641a = ReflectJvmMapping.m87641a(kFunction);
                if (constructorM87641a != null ? constructorM87641a.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}

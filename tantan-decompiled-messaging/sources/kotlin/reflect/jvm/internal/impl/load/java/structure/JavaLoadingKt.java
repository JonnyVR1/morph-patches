package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaLoadingKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m89901a(JavaMethod javaMethod) {
        FqName fqNameMo89032d;
        JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.singleOrNull((List) javaMethod.mo89060g());
        JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
        JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier javaClassifierMo89041i = javaClassifierType.mo89041i();
        return (javaClassifierMo89041i instanceof JavaClass) && (fqNameMo89032d = ((JavaClass) javaClassifierMo89041i).mo89032d()) != null && Intrinsics.m87488d(fqNameMo89032d.m91046a(), "java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m89902b(JavaMethod javaMethod) {
        String strM91082b = javaMethod.getName().m91082b();
        int iHashCode = strM91082b.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strM91082b.equals("equals")) {
                    return m89901a(javaMethod);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strM91082b.equals("hashCode")) {
                return false;
            }
        } else if (!strM91082b.equals("toString")) {
            return false;
        }
        return javaMethod.mo89060g().isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m89903c(@NotNull JavaMember javaMember) {
        javaMember.getClass();
        return javaMember.mo89056x().isInterface() && (javaMember instanceof JavaMethod) && m89902b((JavaMethod) javaMember);
    }
}

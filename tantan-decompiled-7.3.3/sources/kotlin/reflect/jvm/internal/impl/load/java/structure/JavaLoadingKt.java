package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaLoadingKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m90792a(JavaMethod javaMethod) {
        FqName fqNameMo89923d;
        JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.singleOrNull((List) javaMethod.mo89951g());
        JavaType type = javaValueParameter != null ? javaValueParameter.getType() : null;
        JavaClassifierType javaClassifierType = type instanceof JavaClassifierType ? (JavaClassifierType) type : null;
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier javaClassifierMo89932i = javaClassifierType.mo89932i();
        return (javaClassifierMo89932i instanceof JavaClass) && (fqNameMo89923d = ((JavaClass) javaClassifierMo89932i).mo89923d()) != null && Intrinsics.m88377d(fqNameMo89923d.m91937a(), "java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m90793b(JavaMethod javaMethod) {
        String strM91973b = javaMethod.getName().m91973b();
        int iHashCode = strM91973b.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strM91973b.equals("equals")) {
                    return m90792a(javaMethod);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strM91973b.equals("hashCode")) {
                return false;
            }
        } else if (!strM91973b.equals("toString")) {
            return false;
        }
        return javaMethod.mo89951g().isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90794c(@NotNull JavaMember javaMember) {
        javaMember.getClass();
        return javaMember.mo89947x().isInterface() && (javaMember instanceof JavaMethod) && m90793b((JavaMethod) javaMember);
    }
}

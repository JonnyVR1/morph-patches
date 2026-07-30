package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class JavaClassFinder$$Util {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ JavaPackage m90272a(JavaClassFinder javaClassFinder, FqName fqName, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: findPackage");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return javaClassFinder.mo89834c(fqName, z);
    }
}

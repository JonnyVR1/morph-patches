package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class JavaClassFinder$$Util {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ JavaPackage m89381a(JavaClassFinder javaClassFinder, FqName fqName, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: findPackage");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return javaClassFinder.mo88943c(fqName, z);
    }
}

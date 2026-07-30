package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class TypeCheckerProviderContext$$Util {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TypeCheckerState m93017a(TypeCheckerProviderContext typeCheckerProviderContext, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
            return null;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return typeCheckerProviderContext.mo90252e0(z, z2, z3);
    }
}

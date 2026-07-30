package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class TypeCheckerProviderContext$$Util {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TypeCheckerState m93908a(TypeCheckerProviderContext typeCheckerProviderContext, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
            return null;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return typeCheckerProviderContext.mo91143e0(z, z2, z3);
    }
}

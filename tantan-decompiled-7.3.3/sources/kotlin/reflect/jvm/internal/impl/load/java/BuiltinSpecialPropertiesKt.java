package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinSpecialPropertiesKt {
    /* JADX INFO: renamed from: c */
    public static final FqName m90252c(FqName fqName, String str) {
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return fqName.m91938b(nameM91970i);
    }

    /* JADX INFO: renamed from: d */
    public static final FqName m90253d(FqNameUnsafe fqNameUnsafe, String str) {
        Name nameM91970i = Name.m91970i(str);
        nameM91970i.getClass();
        return fqNameUnsafe.m91949b(nameM91970i).m91959m();
    }
}

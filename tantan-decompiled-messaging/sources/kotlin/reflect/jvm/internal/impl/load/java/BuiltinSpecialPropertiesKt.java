package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltinSpecialPropertiesKt {
    /* JADX INFO: renamed from: c */
    public static final FqName m89361c(FqName fqName, String str) {
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return fqName.m91047b(nameM91079i);
    }

    /* JADX INFO: renamed from: d */
    public static final FqName m89362d(FqNameUnsafe fqNameUnsafe, String str) {
        Name nameM91079i = Name.m91079i(str);
        nameM91079i.getClass();
        return fqNameUnsafe.m91058b(nameM91079i).m91068m();
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.CallableId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SuspendFunctionTypeUtilKt {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final FqName f66723a = new FqName("kotlin.suspend");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final CallableId f66724b;

    static {
        FqName fqName = StandardNames.f64473A;
        Name nameM91970i = Name.m91970i("suspend");
        nameM91970i.getClass();
        f66724b = new CallableId(fqName, nameM91970i);
    }
}

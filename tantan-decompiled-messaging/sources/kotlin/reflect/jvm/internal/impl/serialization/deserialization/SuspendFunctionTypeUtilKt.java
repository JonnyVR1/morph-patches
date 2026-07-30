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
    public static final FqName f66049a = new FqName("kotlin.suspend");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final CallableId f66050b;

    static {
        FqName fqName = StandardNames.f63799A;
        Name nameM91079i = Name.m91079i("suspend");
        nameM91079i.getClass();
        f66050b = new CallableId(fqName, nameM91079i);
    }
}

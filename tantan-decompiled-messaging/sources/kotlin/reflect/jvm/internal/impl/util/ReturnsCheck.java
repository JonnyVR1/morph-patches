package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hyc0;
import p149l.iyc0;
import p149l.jyc0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReturnsCheck implements Check {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66427a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<KotlinBuiltIns, KotlinType> f66428b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f66429c;

    public static final class ReturnsBoolean extends ReturnsCheck {

        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", hyc0.INSTANCE, null);
        }

        /* JADX INFO: renamed from: c */
        public static final KotlinType m93157c(KotlinBuiltIns kotlinBuiltIns) {
            kotlinBuiltIns.getClass();
            SimpleType simpleTypeM88238o = kotlinBuiltIns.m88238o();
            simpleTypeM88238o.getClass();
            return simpleTypeM88238o;
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        private ReturnsInt() {
            super("Int", iyc0.INSTANCE, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final KotlinType m93159c(KotlinBuiltIns kotlinBuiltIns) {
            kotlinBuiltIns.getClass();
            SimpleType simpleTypeM88208E = kotlinBuiltIns.m88208E();
            simpleTypeM88208E.getClass();
            return simpleTypeM88208E;
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", jyc0.INSTANCE, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final KotlinType m93161c(KotlinBuiltIns kotlinBuiltIns) {
            kotlinBuiltIns.getClass();
            SimpleType simpleTypeM88228a0 = kotlinBuiltIns.m88228a0();
            simpleTypeM88228a0.getClass();
            return simpleTypeM88228a0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.f66427a = str;
        this.f66428b = function1;
        this.f66429c = "must return " + str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo93133a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m93135a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* JADX INFO: renamed from: b */
    public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        return Intrinsics.m87488d(functionDescriptor.getReturnType(), this.f66428b.invoke(DescriptorUtilsKt.m91980m(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f66429c;
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }
}

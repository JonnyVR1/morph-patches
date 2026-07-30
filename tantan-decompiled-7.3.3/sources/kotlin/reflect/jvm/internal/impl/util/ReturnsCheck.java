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
import p153l.k6d0;
import p153l.l6d0;
import p153l.m6d0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReturnsCheck implements Check {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f67101a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<KotlinBuiltIns, KotlinType> f67102b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f67103c;

    public static final class ReturnsBoolean extends ReturnsCheck {

        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", k6d0.INSTANCE, null);
        }

        /* JADX INFO: renamed from: c */
        public static final KotlinType m94048c(KotlinBuiltIns kotlinBuiltIns) {
            kotlinBuiltIns.getClass();
            SimpleType simpleTypeM89129o = kotlinBuiltIns.m89129o();
            simpleTypeM89129o.getClass();
            return simpleTypeM89129o;
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        private ReturnsInt() {
            super("Int", l6d0.INSTANCE, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final KotlinType m94050c(KotlinBuiltIns kotlinBuiltIns) {
            kotlinBuiltIns.getClass();
            SimpleType simpleTypeM89099E = kotlinBuiltIns.m89099E();
            simpleTypeM89099E.getClass();
            return simpleTypeM89099E;
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", m6d0.INSTANCE, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final KotlinType m94052c(KotlinBuiltIns kotlinBuiltIns) {
            kotlinBuiltIns.getClass();
            SimpleType simpleTypeM89119a0 = kotlinBuiltIns.m89119a0();
            simpleTypeM89119a0.getClass();
            return simpleTypeM89119a0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.f67101a = str;
        this.f67102b = function1;
        this.f67103c = "must return " + str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo94024a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m94026a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* JADX INFO: renamed from: b */
    public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        return Intrinsics.m88377d(functionDescriptor.getReturnType(), this.f67102b.invoke(DescriptorUtilsKt.m92871m(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f67103c;
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }
}

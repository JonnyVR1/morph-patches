package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MemberKindCheck implements Check {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f67037a;

    public static final class Member extends MemberKindCheck {

        @NotNull
        public static final Member INSTANCE = new Member();

        private Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo89335Y() != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {

        @NotNull
        public static final MemberOrExtension INSTANCE = new MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo94025b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return (functionDescriptor.mo89335Y() == null && functionDescriptor.mo89337b0() == null) ? false : true;
        }
    }

    public MemberKindCheck(String str) {
        this.f67037a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo94024a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m94026a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f67037a;
    }

    public /* synthetic */ MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

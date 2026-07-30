package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MemberKindCheck implements Check {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66363a;

    public static final class Member extends MemberKindCheck {

        @NotNull
        public static final Member INSTANCE = new Member();

        private Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* JADX INFO: renamed from: b */
        public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.mo88444Y() != null;
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
        public boolean mo93134b(@NotNull FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return (functionDescriptor.mo88444Y() == null && functionDescriptor.mo88446b0() == null) ? false : true;
        }
    }

    public MemberKindCheck(String str) {
        this.f66363a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* JADX INFO: renamed from: a */
    public /* bridge */ String mo93133a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m93135a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f66363a;
    }

    public /* synthetic */ MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}

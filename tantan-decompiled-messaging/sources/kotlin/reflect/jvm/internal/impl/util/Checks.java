package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Checks {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Name f66358a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Regex f66359b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Collection<Name> f66360c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function1<FunctionDescriptor, String> f66361d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Check[] f66362e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$a */
    public static final class C15351a implements Function1 {
        public static final C15351a INSTANCE = new C15351a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$b */
    public static final class C15352b implements Function1 {
        public static final C15352b INSTANCE = new C15352b();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$c */
    public static final class C15353c implements Function1 {
        public static final C15353c INSTANCE = new C15353c();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Name name, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this(name, (Regex) null, (Collection<Name>) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        name.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CheckResult m93137a(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Check check : this.f66362e) {
            String strMo93133a = check.mo93133a(functionDescriptor);
            if (strMo93133a != null) {
                return new CheckResult.IllegalSignature(strMo93133a);
            }
        }
        String strInvoke = this.f66361d.invoke(functionDescriptor);
        return strInvoke != null ? new CheckResult.IllegalSignature(strInvoke) : CheckResult.SuccessCheck.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93138b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        if (this.f66358a != null && !Intrinsics.m87488d(functionDescriptor.getName(), this.f66358a)) {
            return false;
        }
        if (this.f66359b != null) {
            String strM91082b = functionDescriptor.getName().m91082b();
            strM91082b.getClass();
            if (!this.f66359b.matches(strM91082b)) {
                return false;
            }
        }
        Collection<Name> collection = this.f66360c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? C15351a.INSTANCE : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.f66358a = name;
        this.f66359b = regex;
        this.f66360c = collection;
        this.f66361d = function1;
        this.f66362e = checkArr;
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? C15352b.INSTANCE : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Regex regex, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, regex, (Collection<Name>) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        regex.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? C15353c.INSTANCE : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Collection<Name> collection, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, (Regex) null, collection, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        collection.getClass();
        checkArr.getClass();
        function1.getClass();
    }
}

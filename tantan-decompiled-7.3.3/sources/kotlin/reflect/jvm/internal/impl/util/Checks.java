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
    public final Name f67032a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Regex f67033b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Collection<Name> f67034c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function1<FunctionDescriptor, String> f67035d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Check[] f67036e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$a */
    public static final class C15458a implements Function1 {
        public static final C15458a INSTANCE = new C15458a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$b */
    public static final class C15459b implements Function1 {
        public static final C15459b INSTANCE = new C15459b();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$c */
    public static final class C15460c implements Function1 {
        public static final C15460c INSTANCE = new C15460c();

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
    public final CheckResult m94028a(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        for (Check check : this.f67036e) {
            String strMo94024a = check.mo94024a(functionDescriptor);
            if (strMo94024a != null) {
                return new CheckResult.IllegalSignature(strMo94024a);
            }
        }
        String strInvoke = this.f67035d.invoke(functionDescriptor);
        return strInvoke != null ? new CheckResult.IllegalSignature(strInvoke) : CheckResult.SuccessCheck.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94029b(@NotNull FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        if (this.f67032a != null && !Intrinsics.m88377d(functionDescriptor.getName(), this.f67032a)) {
            return false;
        }
        if (this.f67033b != null) {
            String strM91973b = functionDescriptor.getName().m91973b();
            strM91973b.getClass();
            if (!this.f67033b.matches(strM91973b)) {
                return false;
            }
        }
        Collection<Name> collection = this.f67034c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? C15458a.INSTANCE : function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.f67032a = name;
        this.f67033b = regex;
        this.f67034c = collection;
        this.f67035d = function1;
        this.f67036e = checkArr;
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? C15459b.INSTANCE : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Regex regex, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, regex, (Collection<Name>) null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        regex.getClass();
        checkArr.getClass();
        function1.getClass();
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (Function1<? super FunctionDescriptor, String>) ((i & 4) != 0 ? C15460c.INSTANCE : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Collection<Name> collection, @NotNull Check[] checkArr, @NotNull Function1<? super FunctionDescriptor, String> function1) {
        this((Name) null, (Regex) null, collection, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        collection.getClass();
        checkArr.getClass();
        function1.getClass();
    }
}

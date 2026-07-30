package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SupertypeLoopChecker {

    public static final class EMPTY implements SupertypeLoopChecker {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        @NotNull
        /* JADX INFO: renamed from: a */
        public Collection<KotlinType> mo89486a(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function2) {
            typeConstructor.getClass();
            collection.getClass();
            function1.getClass();
            function2.getClass();
            return collection;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Collection<KotlinType> mo89486a(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function2);
}

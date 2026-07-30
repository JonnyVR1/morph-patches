package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ContractDeserializer {

    @NotNull
    public static final Companion Companion = Companion.f66650a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66650a = new Companion();

        /* JADX INFO: renamed from: b */
        @NotNull
        public static final ContractDeserializer f66651b = new ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            /* JADX INFO: renamed from: a */
            public Pair mo93038a(ProtoBuf.Function function, FunctionDescriptor functionDescriptor, TypeTable typeTable, TypeDeserializer typeDeserializer) {
                function.getClass();
                functionDescriptor.getClass();
                typeTable.getClass();
                typeDeserializer.getClass();
                return null;
            }
        };

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ContractDeserializer m93039a() {
            return f66651b;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Pair<CallableDescriptor.UserDataKey<?>, Object> mo93038a(@NotNull ProtoBuf.Function function, @NotNull FunctionDescriptor functionDescriptor, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer);
}

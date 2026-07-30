package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "msg", "", "<init>", "(Ljava/lang/String;)V", "baseClass", "Lkotlin/reflect/KClass;", "concreteClass", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(@NotNull KClass<?> kClass, @NotNull KClass<?> kClass2) {
        this("Serializer for " + kClass2 + " already registered in the scope of " + kClass);
        kClass.getClass();
        kClass2.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(@NotNull String str) {
        super(str);
        str.getClass();
    }
}

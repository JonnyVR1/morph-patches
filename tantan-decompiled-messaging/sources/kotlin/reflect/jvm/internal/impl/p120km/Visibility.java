package kotlin.reflect.jvm.internal.impl.p120km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p120km.internal.FlagImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum Visibility {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    private final FlagImpl flag;

    Visibility(int i) {
        Flags.FlagField<ProtoBuf.Visibility> flagField = Flags.f65362d;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i);
    }

    @NotNull
    public static EnumEntries<Visibility> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}

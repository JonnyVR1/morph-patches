package kotlin.reflect.jvm.internal.impl.p124km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p124km.internal.FlagImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum Modality {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    @NotNull
    private final FlagImpl flag;

    Modality(int i) {
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.f66037e;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i);
    }

    @NotNull
    public static EnumEntries<Modality> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}

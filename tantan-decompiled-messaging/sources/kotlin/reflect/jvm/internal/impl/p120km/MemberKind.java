package kotlin.reflect.jvm.internal.impl.p120km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.p120km.internal.FlagImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum MemberKind {
    DECLARATION(0),
    FAKE_OVERRIDE(1),
    DELEGATION(2),
    SYNTHESIZED(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    @NotNull
    private final FlagImpl flag;

    MemberKind(int i) {
        Flags.FlagField<ProtoBuf.MemberKind> flagField = Flags.f65375q;
        flagField.getClass();
        this.flag = new FlagImpl(flagField, i);
    }

    @NotNull
    public static EnumEntries<MemberKind> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }
}

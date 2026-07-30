package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFlags {

    @NotNull
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* JADX INFO: renamed from: a */
    public static final Flags.BooleanFlagField f66120a = Flags.FlagField.m91772c();

    /* JADX INFO: renamed from: b */
    public static final Flags.BooleanFlagField f66121b;

    /* JADX INFO: renamed from: c */
    public static final Flags.BooleanFlagField f66122c;

    static {
        Flags.BooleanFlagField booleanFlagFieldM91772c = Flags.FlagField.m91772c();
        f66121b = booleanFlagFieldM91772c;
        f66122c = Flags.FlagField.m91771b(booleanFlagFieldM91772c);
    }

    private JvmFlags() {
    }

    /* JADX INFO: renamed from: a */
    public final Flags.BooleanFlagField m91898a() {
        return f66120a;
    }
}

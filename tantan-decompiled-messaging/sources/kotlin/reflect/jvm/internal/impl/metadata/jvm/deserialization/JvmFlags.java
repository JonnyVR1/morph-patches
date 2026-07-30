package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmFlags {

    @NotNull
    public static final JvmFlags INSTANCE = new JvmFlags();

    /* JADX INFO: renamed from: a */
    public static final Flags.BooleanFlagField f65446a = Flags.FlagField.m90881c();

    /* JADX INFO: renamed from: b */
    public static final Flags.BooleanFlagField f65447b;

    /* JADX INFO: renamed from: c */
    public static final Flags.BooleanFlagField f65448c;

    static {
        Flags.BooleanFlagField booleanFlagFieldM90881c = Flags.FlagField.m90881c();
        f65447b = booleanFlagFieldM90881c;
        f65448c = Flags.FlagField.m90880b(booleanFlagFieldM90881c);
    }

    private JvmFlags() {
    }

    /* JADX INFO: renamed from: a */
    public final Flags.BooleanFlagField m91007a() {
        return f65446a;
    }
}

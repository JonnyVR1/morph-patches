package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Regex f66158a = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f66159b = "$context_receiver";

    private NameUtils() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Name m91977a(int i) {
        Name nameM91970i = Name.m91970i(f66159b + '_' + i);
        nameM91970i.getClass();
        return nameM91970i;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91978b(@NotNull String str) {
        str.getClass();
        return f66158a.replace(str, "_");
    }
}

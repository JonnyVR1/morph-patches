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
    public static final Regex f65484a = new Regex("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f65485b = "$context_receiver";

    private NameUtils() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Name m91086a(int i) {
        Name nameM91079i = Name.m91079i(f65485b + '_' + i);
        nameM91079i.getClass();
        return nameM91079i;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m91087b(@NotNull String str) {
        str.getClass();
        return f65484a.replace(str, "_");
    }
}

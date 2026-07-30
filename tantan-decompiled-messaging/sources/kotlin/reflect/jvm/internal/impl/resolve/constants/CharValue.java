package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c) {
        super(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: c */
    public final String m91911c(char c) {
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return m91913e(c) ? String.valueOf(c) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SimpleType mo91908a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType simpleTypeM88245v = moduleDescriptor.mo88546f().m88245v();
        simpleTypeM88245v.getClass();
        return simpleTypeM88245v;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91913e(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(mo91918b().charValue()), m91911c(mo91918b().charValue())}, 2));
    }
}

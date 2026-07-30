package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a */
    public final String f65872a;

    /* JADX INFO: renamed from: b */
    public FqName f65873b;

    public JvmClassName(@NotNull String str) {
        if (str == null) {
            m92014a(7);
        }
        this.f65872a = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m92014a(int i) {
        String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i != 5) {
            switch (i) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static JvmClassName m92015b(@NotNull ClassId classId) {
        if (classId == null) {
            m92014a(1);
        }
        return new JvmClassName(m92018h(classId));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static JvmClassName m92016c(@NotNull FqName fqName) {
        if (fqName == null) {
            m92014a(4);
        }
        JvmClassName jvmClassName = new JvmClassName(fqName.m91046a().replace('.', '/'));
        jvmClassName.f65873b = fqName;
        return jvmClassName;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static JvmClassName m92017d(@NotNull String str) {
        if (str == null) {
            m92014a(0);
        }
        return new JvmClassName(str);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static String m92018h(@NotNull ClassId classId) {
        if (classId == null) {
            m92014a(2);
        }
        FqName fqNameM91038f = classId.m91038f();
        String strReplace = classId.m91039g().m91046a().replace('.', '$');
        if (!fqNameM91038f.m91048c()) {
            strReplace = fqNameM91038f.m91046a().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            m92014a(3);
        }
        return strReplace;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public FqName m92019e() {
        return new FqName(this.f65872a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f65872a.equals(((JvmClassName) obj).f65872a);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public String m92020f() {
        String str = this.f65872a;
        if (str == null) {
            m92014a(10);
        }
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public FqName m92021g() {
        int iLastIndexOf = this.f65872a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new FqName(this.f65872a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        FqName fqName = FqName.f65472c;
        if (fqName == null) {
            m92014a(9);
        }
        return fqName;
    }

    public int hashCode() {
        return this.f65872a.hashCode();
    }

    public String toString() {
        return this.f65872a;
    }
}

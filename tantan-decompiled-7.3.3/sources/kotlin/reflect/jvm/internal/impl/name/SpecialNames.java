package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class SpecialNames {

    @NotNull
    public static final SpecialNames INSTANCE = new SpecialNames();

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final Name f66160a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Name f66161b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Name f66162c;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final Name f66163d;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final Name f66164e;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final FqName f66165f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final Name f66166g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final Name f66167h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final Name f66168i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final Name f66169j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final Name f66170k;

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final Name f66171l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Name f66172m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final Name f66173n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final Name f66174o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final Name f66175p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final Name f66176q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final Name f66177r;

    static {
        Name nameM91972n = Name.m91972n("<no name provided>");
        nameM91972n.getClass();
        f66160a = nameM91972n;
        Name nameM91972n2 = Name.m91972n("<root package>");
        nameM91972n2.getClass();
        f66161b = nameM91972n2;
        Name nameM91970i = Name.m91970i("Companion");
        nameM91970i.getClass();
        f66162c = nameM91970i;
        Name nameM91970i2 = Name.m91970i("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        nameM91970i2.getClass();
        f66163d = nameM91970i2;
        Name nameM91972n3 = Name.m91972n("<anonymous>");
        nameM91972n3.getClass();
        f66164e = nameM91972n3;
        FqName.Companion companion = FqName.Companion;
        Name nameM91972n4 = Name.m91972n("<anonymous>");
        nameM91972n4.getClass();
        f66165f = companion.m91946a(nameM91972n4);
        Name nameM91972n5 = Name.m91972n("<unary>");
        nameM91972n5.getClass();
        f66166g = nameM91972n5;
        Name nameM91972n6 = Name.m91972n("<this>");
        nameM91972n6.getClass();
        f66167h = nameM91972n6;
        Name nameM91972n7 = Name.m91972n("<init>");
        nameM91972n7.getClass();
        f66168i = nameM91972n7;
        Name nameM91972n8 = Name.m91972n("<when-subject>");
        nameM91972n8.getClass();
        f66169j = nameM91972n8;
        Name nameM91972n9 = Name.m91972n("<iterator>");
        nameM91972n9.getClass();
        f66170k = nameM91972n9;
        Name nameM91972n10 = Name.m91972n("<destruct>");
        nameM91972n10.getClass();
        f66171l = nameM91972n10;
        Name nameM91972n11 = Name.m91972n("<local>");
        nameM91972n11.getClass();
        f66172m = nameM91972n11;
        Name nameM91972n12 = Name.m91972n("<unused var>");
        nameM91972n12.getClass();
        f66173n = nameM91972n12;
        Name nameM91972n13 = Name.m91972n("<set-?>");
        nameM91972n13.getClass();
        f66174o = nameM91972n13;
        Name nameM91972n14 = Name.m91972n("<array>");
        nameM91972n14.getClass();
        f66175p = nameM91972n14;
        Name nameM91972n15 = Name.m91972n("<receiver>");
        nameM91972n15.getClass();
        f66176q = nameM91972n15;
        Name nameM91972n16 = Name.m91972n("<get-entries>");
        nameM91972n16.getClass();
        f66177r = nameM91972n16;
    }

    private SpecialNames() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Name m91979b(@Nullable Name name) {
        return (name == null || name.m91976j()) ? f66163d : name;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91980a(@NotNull Name name) {
        name.getClass();
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        return strM91973b.length() > 0 && !name.m91976j();
    }
}

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
    public static final Name f65486a;

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final Name f65487b;

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Name f65488c;

    /* JADX INFO: renamed from: d */
    @JvmField
    @NotNull
    public static final Name f65489d;

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final Name f65490e;

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static final FqName f65491f;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final Name f65492g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final Name f65493h;

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final Name f65494i;

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final Name f65495j;

    /* JADX INFO: renamed from: k */
    @JvmField
    @NotNull
    public static final Name f65496k;

    /* JADX INFO: renamed from: l */
    @JvmField
    @NotNull
    public static final Name f65497l;

    /* JADX INFO: renamed from: m */
    @JvmField
    @NotNull
    public static final Name f65498m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final Name f65499n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final Name f65500o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final Name f65501p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final Name f65502q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final Name f65503r;

    static {
        Name nameM91081n = Name.m91081n("<no name provided>");
        nameM91081n.getClass();
        f65486a = nameM91081n;
        Name nameM91081n2 = Name.m91081n("<root package>");
        nameM91081n2.getClass();
        f65487b = nameM91081n2;
        Name nameM91079i = Name.m91079i("Companion");
        nameM91079i.getClass();
        f65488c = nameM91079i;
        Name nameM91079i2 = Name.m91079i("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        nameM91079i2.getClass();
        f65489d = nameM91079i2;
        Name nameM91081n3 = Name.m91081n("<anonymous>");
        nameM91081n3.getClass();
        f65490e = nameM91081n3;
        FqName.Companion companion = FqName.Companion;
        Name nameM91081n4 = Name.m91081n("<anonymous>");
        nameM91081n4.getClass();
        f65491f = companion.m91055a(nameM91081n4);
        Name nameM91081n5 = Name.m91081n("<unary>");
        nameM91081n5.getClass();
        f65492g = nameM91081n5;
        Name nameM91081n6 = Name.m91081n("<this>");
        nameM91081n6.getClass();
        f65493h = nameM91081n6;
        Name nameM91081n7 = Name.m91081n("<init>");
        nameM91081n7.getClass();
        f65494i = nameM91081n7;
        Name nameM91081n8 = Name.m91081n("<when-subject>");
        nameM91081n8.getClass();
        f65495j = nameM91081n8;
        Name nameM91081n9 = Name.m91081n("<iterator>");
        nameM91081n9.getClass();
        f65496k = nameM91081n9;
        Name nameM91081n10 = Name.m91081n("<destruct>");
        nameM91081n10.getClass();
        f65497l = nameM91081n10;
        Name nameM91081n11 = Name.m91081n("<local>");
        nameM91081n11.getClass();
        f65498m = nameM91081n11;
        Name nameM91081n12 = Name.m91081n("<unused var>");
        nameM91081n12.getClass();
        f65499n = nameM91081n12;
        Name nameM91081n13 = Name.m91081n("<set-?>");
        nameM91081n13.getClass();
        f65500o = nameM91081n13;
        Name nameM91081n14 = Name.m91081n("<array>");
        nameM91081n14.getClass();
        f65501p = nameM91081n14;
        Name nameM91081n15 = Name.m91081n("<receiver>");
        nameM91081n15.getClass();
        f65502q = nameM91081n15;
        Name nameM91081n16 = Name.m91081n("<get-entries>");
        nameM91081n16.getClass();
        f65503r = nameM91081n16;
    }

    private SpecialNames() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Name m91088b(@Nullable Name name) {
        return (name == null || name.m91085j()) ? f65489d : name;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91089a(@NotNull Name name) {
        name.getClass();
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        return strM91082b.length() > 0 && !name.m91085j();
    }
}

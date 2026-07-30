package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class DescriptorKindFilter {

    @NotNull
    public static final Companion Companion;

    /* JADX INFO: renamed from: c */
    public static int f65881c;

    /* JADX INFO: renamed from: d */
    public static final int f65882d;

    /* JADX INFO: renamed from: e */
    public static final int f65883e;

    /* JADX INFO: renamed from: f */
    public static final int f65884f;

    /* JADX INFO: renamed from: g */
    public static final int f65885g;

    /* JADX INFO: renamed from: h */
    public static final int f65886h;

    /* JADX INFO: renamed from: i */
    public static final int f65887i;

    /* JADX INFO: renamed from: j */
    public static final int f65888j;

    /* JADX INFO: renamed from: k */
    public static final int f65889k;

    /* JADX INFO: renamed from: l */
    public static final int f65890l;

    /* JADX INFO: renamed from: m */
    public static final int f65891m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65892n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65893o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65894p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65895q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65896r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65897s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65898t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65899u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65900v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65901w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final List<Companion.C15314a> f65902x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final List<Companion.C15314a> f65903y;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<DescriptorKindExclude> f65904a;

    /* JADX INFO: renamed from: b */
    public final int f65905b;

    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter$Companion$a */
        public static final class C15314a {

            /* JADX INFO: renamed from: a */
            public final int f65906a;

            /* JADX INFO: renamed from: b */
            @NotNull
            public final String f65907b;

            public C15314a(int i, @NotNull String str) {
                str.getClass();
                this.f65906a = i;
                this.f65907b = str;
            }

            /* JADX INFO: renamed from: a */
            public final int m92053a() {
                return this.f65906a;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final String m92054b() {
                return this.f65907b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m92044b() {
            return DescriptorKindFilter.f65888j;
        }

        /* JADX INFO: renamed from: c */
        public final int m92045c() {
            return DescriptorKindFilter.f65889k;
        }

        /* JADX INFO: renamed from: d */
        public final int m92046d() {
            return DescriptorKindFilter.f65886h;
        }

        /* JADX INFO: renamed from: e */
        public final int m92047e() {
            return DescriptorKindFilter.f65882d;
        }

        /* JADX INFO: renamed from: f */
        public final int m92048f() {
            return DescriptorKindFilter.f65885g;
        }

        /* JADX INFO: renamed from: g */
        public final int m92049g() {
            return DescriptorKindFilter.f65883e;
        }

        /* JADX INFO: renamed from: h */
        public final int m92050h() {
            return DescriptorKindFilter.f65884f;
        }

        /* JADX INFO: renamed from: i */
        public final int m92051i() {
            return DescriptorKindFilter.f65887i;
        }

        /* JADX INFO: renamed from: j */
        public final int m92052j() {
            int i = DescriptorKindFilter.f65881c;
            DescriptorKindFilter.f65881c <<= 1;
            return i;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion.C15314a c15314a;
        Companion.C15314a c15314a2;
        Companion companion = new Companion(null);
        Companion = companion;
        f65881c = 1;
        int iM92052j = companion.m92052j();
        f65882d = iM92052j;
        int iM92052j2 = companion.m92052j();
        f65883e = iM92052j2;
        int iM92052j3 = companion.m92052j();
        f65884f = iM92052j3;
        int iM92052j4 = companion.m92052j();
        f65885g = iM92052j4;
        int iM92052j5 = companion.m92052j();
        f65886h = iM92052j5;
        int iM92052j6 = companion.m92052j();
        f65887i = iM92052j6;
        int iM92052j7 = companion.m92052j() - 1;
        f65888j = iM92052j7;
        int i = iM92052j | iM92052j2 | iM92052j3;
        f65889k = i;
        int i2 = iM92052j2 | iM92052j5 | iM92052j6;
        f65890l = i2;
        int i3 = iM92052j5 | iM92052j6;
        f65891m = i3;
        int i4 = 2;
        f65892n = new DescriptorKindFilter(iM92052j7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65893o = new DescriptorKindFilter(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65894p = new DescriptorKindFilter(iM92052j, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65895q = new DescriptorKindFilter(iM92052j2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65896r = new DescriptorKindFilter(iM92052j3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65897s = new DescriptorKindFilter(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65898t = new DescriptorKindFilter(iM92052j4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65899u = new DescriptorKindFilter(iM92052j5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65900v = new DescriptorKindFilter(iM92052j6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f65901w = new DescriptorKindFilter(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        Field[] fields = DescriptorKindFilter.class.getFields();
        fields.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i5 = descriptorKindFilter.f65905b;
                String name = field2.getName();
                name.getClass();
                c15314a2 = new Companion.C15314a(i5, name);
            } else {
                c15314a2 = null;
            }
            if (c15314a2 != null) {
                arrayList2.add(c15314a2);
            }
        }
        f65902x = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.m87488d(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                c15314a = new Companion.C15314a(iIntValue, name2);
            } else {
                c15314a = null;
            }
            if (c15314a != null) {
                arrayList5.add(c15314a);
            }
        }
        f65903y = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i, @NotNull List<? extends DescriptorKindExclude> list) {
        list.getClass();
        this.f65904a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((DescriptorKindExclude) it.next()).mo92028a();
        }
        this.f65905b = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92039a(int i) {
        return (this.f65905b & i) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m87488d(DescriptorKindFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.m87488d(this.f65904a, descriptorKindFilter.f65904a) && this.f65905b == descriptorKindFilter.f65905b;
    }

    public int hashCode() {
        return (this.f65904a.hashCode() * 31) + this.f65905b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<DescriptorKindExclude> m92040l() {
        return this.f65904a;
    }

    /* JADX INFO: renamed from: m */
    public final int m92041m() {
        return this.f65905b;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final DescriptorKindFilter m92042n(int i) {
        int i2 = i & this.f65905b;
        if (i2 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i2, this.f65904a);
    }

    @NotNull
    public String toString() {
        Object next;
        Iterator<T> it = f65902x.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Companion.C15314a) next).m92053a() != this.f65905b);
        Companion.C15314a c15314a = (Companion.C15314a) next;
        String strM92054b = c15314a != null ? c15314a.m92054b() : null;
        if (strM92054b == null) {
            List<Companion.C15314a> list = f65903y;
            ArrayList arrayList = new ArrayList();
            for (Companion.C15314a c15314a2 : list) {
                String strM92054b2 = m92039a(c15314a2.m92053a()) ? c15314a2.m92054b() : null;
                if (strM92054b2 != null) {
                    arrayList.add(strM92054b2);
                }
            }
            strM92054b = CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strM92054b + ", " + this.f65904a + ')';
    }

    public /* synthetic */ DescriptorKindFilter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}

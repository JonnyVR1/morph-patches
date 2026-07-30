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
    public static int f66555c;

    /* JADX INFO: renamed from: d */
    public static final int f66556d;

    /* JADX INFO: renamed from: e */
    public static final int f66557e;

    /* JADX INFO: renamed from: f */
    public static final int f66558f;

    /* JADX INFO: renamed from: g */
    public static final int f66559g;

    /* JADX INFO: renamed from: h */
    public static final int f66560h;

    /* JADX INFO: renamed from: i */
    public static final int f66561i;

    /* JADX INFO: renamed from: j */
    public static final int f66562j;

    /* JADX INFO: renamed from: k */
    public static final int f66563k;

    /* JADX INFO: renamed from: l */
    public static final int f66564l;

    /* JADX INFO: renamed from: m */
    public static final int f66565m;

    /* JADX INFO: renamed from: n */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66566n;

    /* JADX INFO: renamed from: o */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66567o;

    /* JADX INFO: renamed from: p */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66568p;

    /* JADX INFO: renamed from: q */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66569q;

    /* JADX INFO: renamed from: r */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66570r;

    /* JADX INFO: renamed from: s */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66571s;

    /* JADX INFO: renamed from: t */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66572t;

    /* JADX INFO: renamed from: u */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66573u;

    /* JADX INFO: renamed from: v */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66574v;

    /* JADX INFO: renamed from: w */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f66575w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final List<Companion.C15421a> f66576x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final List<Companion.C15421a> f66577y;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<DescriptorKindExclude> f66578a;

    /* JADX INFO: renamed from: b */
    public final int f66579b;

    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter$Companion$a */
        public static final class C15421a {

            /* JADX INFO: renamed from: a */
            public final int f66580a;

            /* JADX INFO: renamed from: b */
            @NotNull
            public final String f66581b;

            public C15421a(int i, @NotNull String str) {
                str.getClass();
                this.f66580a = i;
                this.f66581b = str;
            }

            /* JADX INFO: renamed from: a */
            public final int m92944a() {
                return this.f66580a;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final String m92945b() {
                return this.f66581b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m92935b() {
            return DescriptorKindFilter.f66562j;
        }

        /* JADX INFO: renamed from: c */
        public final int m92936c() {
            return DescriptorKindFilter.f66563k;
        }

        /* JADX INFO: renamed from: d */
        public final int m92937d() {
            return DescriptorKindFilter.f66560h;
        }

        /* JADX INFO: renamed from: e */
        public final int m92938e() {
            return DescriptorKindFilter.f66556d;
        }

        /* JADX INFO: renamed from: f */
        public final int m92939f() {
            return DescriptorKindFilter.f66559g;
        }

        /* JADX INFO: renamed from: g */
        public final int m92940g() {
            return DescriptorKindFilter.f66557e;
        }

        /* JADX INFO: renamed from: h */
        public final int m92941h() {
            return DescriptorKindFilter.f66558f;
        }

        /* JADX INFO: renamed from: i */
        public final int m92942i() {
            return DescriptorKindFilter.f66561i;
        }

        /* JADX INFO: renamed from: j */
        public final int m92943j() {
            int i = DescriptorKindFilter.f66555c;
            DescriptorKindFilter.f66555c <<= 1;
            return i;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion.C15421a c15421a;
        Companion.C15421a c15421a2;
        Companion companion = new Companion(null);
        Companion = companion;
        f66555c = 1;
        int iM92943j = companion.m92943j();
        f66556d = iM92943j;
        int iM92943j2 = companion.m92943j();
        f66557e = iM92943j2;
        int iM92943j3 = companion.m92943j();
        f66558f = iM92943j3;
        int iM92943j4 = companion.m92943j();
        f66559g = iM92943j4;
        int iM92943j5 = companion.m92943j();
        f66560h = iM92943j5;
        int iM92943j6 = companion.m92943j();
        f66561i = iM92943j6;
        int iM92943j7 = companion.m92943j() - 1;
        f66562j = iM92943j7;
        int i = iM92943j | iM92943j2 | iM92943j3;
        f66563k = i;
        int i2 = iM92943j2 | iM92943j5 | iM92943j6;
        f66564l = i2;
        int i3 = iM92943j5 | iM92943j6;
        f66565m = i3;
        int i4 = 2;
        f66566n = new DescriptorKindFilter(iM92943j7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66567o = new DescriptorKindFilter(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66568p = new DescriptorKindFilter(iM92943j, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66569q = new DescriptorKindFilter(iM92943j2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66570r = new DescriptorKindFilter(iM92943j3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66571s = new DescriptorKindFilter(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66572t = new DescriptorKindFilter(iM92943j4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66573u = new DescriptorKindFilter(iM92943j5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66574v = new DescriptorKindFilter(iM92943j6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        f66575w = new DescriptorKindFilter(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
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
                int i5 = descriptorKindFilter.f66579b;
                String name = field2.getName();
                name.getClass();
                c15421a2 = new Companion.C15421a(i5, name);
            } else {
                c15421a2 = null;
            }
            if (c15421a2 != null) {
                arrayList2.add(c15421a2);
            }
        }
        f66576x = arrayList2;
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
            if (Intrinsics.m88377d(((Field) obj2).getType(), Integer.TYPE)) {
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
                c15421a = new Companion.C15421a(iIntValue, name2);
            } else {
                c15421a = null;
            }
            if (c15421a != null) {
                arrayList5.add(c15421a);
            }
        }
        f66577y = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i, @NotNull List<? extends DescriptorKindExclude> list) {
        list.getClass();
        this.f66578a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((DescriptorKindExclude) it.next()).mo92919a();
        }
        this.f66579b = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92930a(int i) {
        return (this.f66579b & i) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m88377d(DescriptorKindFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.m88377d(this.f66578a, descriptorKindFilter.f66578a) && this.f66579b == descriptorKindFilter.f66579b;
    }

    public int hashCode() {
        return (this.f66578a.hashCode() * 31) + this.f66579b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<DescriptorKindExclude> m92931l() {
        return this.f66578a;
    }

    /* JADX INFO: renamed from: m */
    public final int m92932m() {
        return this.f66579b;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final DescriptorKindFilter m92933n(int i) {
        int i2 = i & this.f66579b;
        if (i2 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i2, this.f66578a);
    }

    @NotNull
    public String toString() {
        Object next;
        Iterator<T> it = f66576x.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Companion.C15421a) next).m92944a() != this.f66579b);
        Companion.C15421a c15421a = (Companion.C15421a) next;
        String strM92945b = c15421a != null ? c15421a.m92945b() : null;
        if (strM92945b == null) {
            List<Companion.C15421a> list = f66577y;
            ArrayList arrayList = new ArrayList();
            for (Companion.C15421a c15421a2 : list) {
                String strM92945b2 = m92930a(c15421a2.m92944a()) ? c15421a2.m92945b() : null;
                if (strM92945b2 != null) {
                    arrayList.add(strM92945b2);
                }
            }
            strM92945b = CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strM92945b + ", " + this.f66578a + ')';
    }

    public /* synthetic */ DescriptorKindFilter(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}

package kotlin.reflect.jvm.internal.impl.p124km.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.p124km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReadContext {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NameResolver f65262a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeTable f65263b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final VersionRequirementTable f65264c;

    /* JADX INFO: renamed from: d */
    public final boolean f65265d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ReadContext f65266e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<Object> f65267f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<Integer, Integer> f65268g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<MetadataExtensions> f65269h;

    public ReadContext(@NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, boolean z, @Nullable ReadContext readContext, @NotNull List<? extends Object> list) {
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        list.getClass();
        this.f65262a = nameResolver;
        this.f65263b = typeTable;
        this.f65264c = versionRequirementTable;
        this.f65265d = z;
        this.f65266e = readContext;
        this.f65267f = list;
        this.f65268g = new LinkedHashMap();
        this.f65269h = MetadataExtensions.Companion.m90174c();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m90113a(int i) {
        return ReadUtilsKt.m90122a(this.f65262a, i);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m90114b(int i) {
        return this.f65262a.getString(i);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<MetadataExtensions> m90115c() {
        return this.f65269h;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90116d() {
        return this.f65265d;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final NameResolver m90117e() {
        return this.f65262a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Integer m90118f(int i) {
        Integer num = this.f65268g.get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        ReadContext readContext = this.f65266e;
        if (readContext != null) {
            return readContext.m90118f(i);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final TypeTable m90119g() {
        return this.f65263b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VersionRequirementTable m90120h() {
        return this.f65264c;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ReadContext m90121i(@NotNull List<ProtoBuf.TypeParameter> list) {
        list.getClass();
        ReadContext readContext = new ReadContext(this.f65262a, this.f65263b, this.f65264c, this.f65265d, this, this.f65267f);
        for (ProtoBuf.TypeParameter typeParameter : list) {
            readContext.f65268g.put(Integer.valueOf(typeParameter.getName()), Integer.valueOf(typeParameter.getId()));
        }
        return readContext;
    }

    public /* synthetic */ ReadContext(NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, boolean z, ReadContext readContext, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, versionRequirementTable, z, (i & 16) != 0 ? null : readContext, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}

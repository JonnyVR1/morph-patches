package kotlin.reflect.jvm.internal.impl.p120km.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.p120km.internal.extensions.MetadataExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReadContext {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final NameResolver f64588a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeTable f64589b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final VersionRequirementTable f64590c;

    /* JADX INFO: renamed from: d */
    public final boolean f64591d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final ReadContext f64592e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final List<Object> f64593f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Map<Integer, Integer> f64594g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final List<MetadataExtensions> f64595h;

    public ReadContext(@NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, boolean z, @Nullable ReadContext readContext, @NotNull List<? extends Object> list) {
        nameResolver.getClass();
        typeTable.getClass();
        versionRequirementTable.getClass();
        list.getClass();
        this.f64588a = nameResolver;
        this.f64589b = typeTable;
        this.f64590c = versionRequirementTable;
        this.f64591d = z;
        this.f64592e = readContext;
        this.f64593f = list;
        this.f64594g = new LinkedHashMap();
        this.f64595h = MetadataExtensions.Companion.m89283c();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m89222a(int i) {
        return ReadUtilsKt.m89231a(this.f64588a, i);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m89223b(int i) {
        return this.f64588a.getString(i);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<MetadataExtensions> m89224c() {
        return this.f64595h;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89225d() {
        return this.f64591d;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final NameResolver m89226e() {
        return this.f64588a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Integer m89227f(int i) {
        Integer num = this.f64594g.get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        ReadContext readContext = this.f64592e;
        if (readContext != null) {
            return readContext.m89227f(i);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final TypeTable m89228g() {
        return this.f64589b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VersionRequirementTable m89229h() {
        return this.f64590c;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ReadContext m89230i(@NotNull List<ProtoBuf.TypeParameter> list) {
        list.getClass();
        ReadContext readContext = new ReadContext(this.f64588a, this.f64589b, this.f64590c, this.f64591d, this, this.f64593f);
        for (ProtoBuf.TypeParameter typeParameter : list) {
            readContext.f64594g.put(Integer.valueOf(typeParameter.getName()), Integer.valueOf(typeParameter.getId()));
        }
        return readContext;
    }

    public /* synthetic */ ReadContext(NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, boolean z, ReadContext readContext, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, versionRequirementTable, z, (i & 16) != 0 ? null : readContext, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}

package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Kind f65775a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MetadataVersion f65776b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String[] f65777c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String[] f65778d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String[] f65779e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f65780f;

    /* JADX INFO: renamed from: g */
    public final int f65781g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f65782h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final byte[] f65783i;

    @SourceDebugExtension
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        @NotNull
        private static final Map<Integer, Kind> entryById;

        /* JADX INFO: renamed from: id */
        private final int f65784id;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final Kind m91315a(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            private Companion() {
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f65784id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i) {
            this.f65784id = i;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i) {
            return Companion.m91315a(i);
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull MetadataVersion metadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i, @Nullable String str2, @Nullable byte[] bArr) {
        kind.getClass();
        metadataVersion.getClass();
        this.f65775a = kind;
        this.f65776b = metadataVersion;
        this.f65777c = strArr;
        this.f65778d = strArr2;
        this.f65779e = strArr3;
        this.f65780f = str;
        this.f65781g = i;
        this.f65782h = str2;
        this.f65783i = bArr;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String[] m91305a() {
        return this.f65777c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String[] m91306b() {
        return this.f65778d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Kind m91307c() {
        return this.f65775a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final MetadataVersion m91308d() {
        return this.f65776b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m91309e() {
        String str = this.f65780f;
        if (this.f65775a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m91310f() {
        String[] strArr = this.f65777c;
        if (this.f65775a != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listAsList = strArr != null ? ArraysKt.asList(strArr) : null;
        return listAsList == null ? CollectionsKt.emptyList() : listAsList;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String[] m91311g() {
        return this.f65779e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m91312h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91313i() {
        return m91312h(this.f65781g, 2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91314j() {
        return m91312h(this.f65781g, 16) && !m91312h(this.f65781g, 32);
    }

    @NotNull
    public String toString() {
        return this.f65775a + " version=" + this.f65776b;
    }
}

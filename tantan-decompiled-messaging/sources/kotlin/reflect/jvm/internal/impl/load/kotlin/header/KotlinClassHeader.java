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
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Kind f65101a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MetadataVersion f65102b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final String[] f65103c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String[] f65104d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String[] f65105e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f65106f;

    /* JADX INFO: renamed from: g */
    public final int f65107g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f65108h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final byte[] f65109i;

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
        private final int f65110id;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final Kind m90424a(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            private Companion() {
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f65110id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i) {
            this.f65110id = i;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i) {
            return Companion.m90424a(i);
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull MetadataVersion metadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i, @Nullable String str2, @Nullable byte[] bArr) {
        kind.getClass();
        metadataVersion.getClass();
        this.f65101a = kind;
        this.f65102b = metadataVersion;
        this.f65103c = strArr;
        this.f65104d = strArr2;
        this.f65105e = strArr3;
        this.f65106f = str;
        this.f65107g = i;
        this.f65108h = str2;
        this.f65109i = bArr;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String[] m90414a() {
        return this.f65103c;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String[] m90415b() {
        return this.f65104d;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Kind m90416c() {
        return this.f65101a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final MetadataVersion m90417d() {
        return this.f65102b;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m90418e() {
        String str = this.f65106f;
        if (this.f65101a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<String> m90419f() {
        String[] strArr = this.f65103c;
        if (this.f65101a != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listAsList = strArr != null ? ArraysKt.asList(strArr) : null;
        return listAsList == null ? CollectionsKt.emptyList() : listAsList;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String[] m90420g() {
        return this.f65105e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m90421h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m90422i() {
        return m90421h(this.f65107g, 2);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m90423j() {
        return m90421h(this.f65107g, 16) && !m90421h(this.f65107g, 32);
    }

    @NotNull
    public String toString() {
        return this.f65101a + " version=" + this.f65102b;
    }
}

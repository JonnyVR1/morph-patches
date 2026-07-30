package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.DeprecationLevel;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionRequirement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Version f65395a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ProtoBuf.VersionRequirement.VersionKind f65396b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeprecationLevel f65397c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Integer f65398d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f65399e;

    @SourceDebugExtension
    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f65400a;

            static {
                int[] iArr = new int[ProtoBuf.VersionRequirement.Level.values().length];
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f65400a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final VersionRequirement m90924a(int i, @NotNull NameResolver nameResolver, @NotNull VersionRequirementTable versionRequirementTable) {
            DeprecationLevel deprecationLevel;
            nameResolver.getClass();
            versionRequirementTable.getClass();
            ProtoBuf.VersionRequirement versionRequirementM90931b = versionRequirementTable.m90931b(i);
            if (versionRequirementM90931b == null) {
                return null;
            }
            Version versionM90929a = Version.Companion.m90929a(versionRequirementM90931b.hasVersion() ? Integer.valueOf(versionRequirementM90931b.getVersion()) : null, versionRequirementM90931b.hasVersionFull() ? Integer.valueOf(versionRequirementM90931b.getVersionFull()) : null);
            ProtoBuf.VersionRequirement.Level level = versionRequirementM90931b.getLevel();
            level.getClass();
            int i2 = WhenMappings.f65400a[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    l9r.m149037a();
                    return null;
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer numValueOf = versionRequirementM90931b.hasErrorCode() ? Integer.valueOf(versionRequirementM90931b.getErrorCode()) : null;
            String string = versionRequirementM90931b.hasMessage() ? nameResolver.getString(versionRequirementM90931b.getMessage()) : null;
            ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirementM90931b.getVersionKind();
            versionKind.getClass();
            return new VersionRequirement(versionM90929a, versionKind, deprecationLevel2, numValueOf, string);
        }

        private Companion() {
        }
    }

    public static final class Version {

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: renamed from: d */
        @JvmField
        @NotNull
        public static final Version f65401d = new Version(256, 256, 256);

        /* JADX INFO: renamed from: a */
        public final int f65402a;

        /* JADX INFO: renamed from: b */
        public final int f65403b;

        /* JADX INFO: renamed from: c */
        public final int f65404c;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Version m90929a(@Nullable Integer num, @Nullable Integer num2) {
                if (num2 != null) {
                    return new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                return num != null ? new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127) : Version.f65401d;
            }

            private Companion() {
            }
        }

        public Version(int i, int i2, int i3) {
            this.f65402a = i;
            this.f65403b = i2;
            this.f65404c = i3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m90925a() {
            StringBuilder sb;
            int i;
            int i2 = this.f65404c;
            int i3 = this.f65402a;
            if (i2 == 0) {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append('.');
                i = this.f65403b;
            } else {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append('.');
                sb.append(this.f65403b);
                sb.append('.');
                i = this.f65404c;
            }
            sb.append(i);
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public final int m90926b() {
            return this.f65402a;
        }

        /* JADX INFO: renamed from: c */
        public final int m90927c() {
            return this.f65403b;
        }

        /* JADX INFO: renamed from: d */
        public final int m90928d() {
            return this.f65404c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return false;
            }
            Version version = (Version) obj;
            return this.f65402a == version.f65402a && this.f65403b == version.f65403b && this.f65404c == version.f65404c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65402a) * 31) + Integer.hashCode(this.f65403b)) * 31) + Integer.hashCode(this.f65404c);
        }

        @NotNull
        public String toString() {
            return m90925a();
        }
    }

    public VersionRequirement(@NotNull Version version, @NotNull ProtoBuf.VersionRequirement.VersionKind versionKind, @NotNull DeprecationLevel deprecationLevel, @Nullable Integer num, @Nullable String str) {
        version.getClass();
        versionKind.getClass();
        deprecationLevel.getClass();
        this.f65395a = version;
        this.f65396b = versionKind;
        this.f65397c = deprecationLevel;
        this.f65398d = num;
        this.f65399e = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m90919a() {
        return this.f65398d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ProtoBuf.VersionRequirement.VersionKind m90920b() {
        return this.f65396b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DeprecationLevel m90921c() {
        return this.f65397c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m90922d() {
        return this.f65399e;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Version m90923e() {
        return this.f65395a;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.f65395a);
        sb.append(' ');
        sb.append(this.f65397c);
        String str2 = "";
        if (this.f65398d != null) {
            str = " error " + this.f65398d.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f65399e != null) {
            str2 = ": " + this.f65399e;
        }
        sb.append(str2);
        return sb.toString();
    }
}

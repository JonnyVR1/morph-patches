package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.DeprecationLevel;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionRequirement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Version f66069a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ProtoBuf.VersionRequirement.VersionKind f66070b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DeprecationLevel f66071c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Integer f66072d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final String f66073e;

    @SourceDebugExtension
    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f66074a;

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
                f66074a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final VersionRequirement m91815a(int i, @NotNull NameResolver nameResolver, @NotNull VersionRequirementTable versionRequirementTable) {
            DeprecationLevel deprecationLevel;
            nameResolver.getClass();
            versionRequirementTable.getClass();
            ProtoBuf.VersionRequirement versionRequirementM91822b = versionRequirementTable.m91822b(i);
            if (versionRequirementM91822b == null) {
                return null;
            }
            Version versionM91820a = Version.Companion.m91820a(versionRequirementM91822b.hasVersion() ? Integer.valueOf(versionRequirementM91822b.getVersion()) : null, versionRequirementM91822b.hasVersionFull() ? Integer.valueOf(versionRequirementM91822b.getVersionFull()) : null);
            ProtoBuf.VersionRequirement.Level level = versionRequirementM91822b.getLevel();
            level.getClass();
            int i2 = WhenMappings.f66074a[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    nbr.m162172a();
                    return null;
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer numValueOf = versionRequirementM91822b.hasErrorCode() ? Integer.valueOf(versionRequirementM91822b.getErrorCode()) : null;
            String string = versionRequirementM91822b.hasMessage() ? nameResolver.getString(versionRequirementM91822b.getMessage()) : null;
            ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirementM91822b.getVersionKind();
            versionKind.getClass();
            return new VersionRequirement(versionM91820a, versionKind, deprecationLevel2, numValueOf, string);
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
        public static final Version f66075d = new Version(256, 256, 256);

        /* JADX INFO: renamed from: a */
        public final int f66076a;

        /* JADX INFO: renamed from: b */
        public final int f66077b;

        /* JADX INFO: renamed from: c */
        public final int f66078c;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Version m91820a(@Nullable Integer num, @Nullable Integer num2) {
                if (num2 != null) {
                    return new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                return num != null ? new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127) : Version.f66075d;
            }

            private Companion() {
            }
        }

        public Version(int i, int i2, int i3) {
            this.f66076a = i;
            this.f66077b = i2;
            this.f66078c = i3;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m91816a() {
            StringBuilder sb;
            int i;
            int i2 = this.f66078c;
            int i3 = this.f66076a;
            if (i2 == 0) {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append('.');
                i = this.f66077b;
            } else {
                sb = new StringBuilder();
                sb.append(i3);
                sb.append('.');
                sb.append(this.f66077b);
                sb.append('.');
                i = this.f66078c;
            }
            sb.append(i);
            return sb.toString();
        }

        /* JADX INFO: renamed from: b */
        public final int m91817b() {
            return this.f66076a;
        }

        /* JADX INFO: renamed from: c */
        public final int m91818c() {
            return this.f66077b;
        }

        /* JADX INFO: renamed from: d */
        public final int m91819d() {
            return this.f66078c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return false;
            }
            Version version = (Version) obj;
            return this.f66076a == version.f66076a && this.f66077b == version.f66077b && this.f66078c == version.f66078c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f66076a) * 31) + Integer.hashCode(this.f66077b)) * 31) + Integer.hashCode(this.f66078c);
        }

        @NotNull
        public String toString() {
            return m91816a();
        }
    }

    public VersionRequirement(@NotNull Version version, @NotNull ProtoBuf.VersionRequirement.VersionKind versionKind, @NotNull DeprecationLevel deprecationLevel, @Nullable Integer num, @Nullable String str) {
        version.getClass();
        versionKind.getClass();
        deprecationLevel.getClass();
        this.f66069a = version;
        this.f66070b = versionKind;
        this.f66071c = deprecationLevel;
        this.f66072d = num;
        this.f66073e = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Integer m91810a() {
        return this.f66072d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ProtoBuf.VersionRequirement.VersionKind m91811b() {
        return this.f66070b;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final DeprecationLevel m91812c() {
        return this.f66071c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m91813d() {
        return this.f66073e;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Version m91814e() {
        return this.f66069a;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("since ");
        sb.append(this.f66069a);
        sb.append(' ');
        sb.append(this.f66071c);
        String str2 = "";
        if (this.f66072d != null) {
            str = " error " + this.f66072d.intValue();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f66073e != null) {
            str2 = ": " + this.f66073e;
        }
        sb.append(str2);
        return sb.toString();
    }
}

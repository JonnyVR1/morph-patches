package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final MetadataVersion INSTANCE;

    /* JADX INFO: renamed from: g */
    @JvmField
    @NotNull
    public static final MetadataVersion f65388g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final MetadataVersion f65389h;

    /* JADX INFO: renamed from: f */
    public final boolean f65390f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        MetadataVersion metadataVersion = new MetadataVersion(2, 2, 0);
        INSTANCE = metadataVersion;
        f65388g = metadataVersion.m90891m();
        f65389h = new MetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f65390f = z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m90886h(@NotNull MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        return m90887i(metadataVersion.m90889k(this.f65390f));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m90887i(MetadataVersion metadataVersion) {
        if ((m90866a() == 1 && m90867b() == 0) || m90866a() == 0) {
            return false;
        }
        return !m90890l(metadataVersion);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m90888j() {
        return this.f65390f;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final MetadataVersion m90889k(boolean z) {
        MetadataVersion metadataVersion = z ? INSTANCE : f65388g;
        return metadataVersion.m90890l(this) ? metadataVersion : this;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m90890l(MetadataVersion metadataVersion) {
        if (m90866a() > metadataVersion.m90866a()) {
            return true;
        }
        return m90866a() >= metadataVersion.m90866a() && m90867b() > metadataVersion.m90867b();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final MetadataVersion m90891m() {
        return (m90866a() == 1 && m90867b() == 9) ? new MetadataVersion(2, 0, 0) : new MetadataVersion(m90866a(), m90867b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}

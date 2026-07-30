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
    public static final MetadataVersion f66062g;

    /* JADX INFO: renamed from: h */
    @JvmField
    @NotNull
    public static final MetadataVersion f66063h;

    /* JADX INFO: renamed from: f */
    public final boolean f66064f;

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
        f66062g = metadataVersion.m91782m();
        f66063h = new MetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f66064f = z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m91777h(@NotNull MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        return m91778i(metadataVersion.m91780k(this.f66064f));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91778i(MetadataVersion metadataVersion) {
        if ((m91757a() == 1 && m91758b() == 0) || m91757a() == 0) {
            return false;
        }
        return !m91781l(metadataVersion);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91779j() {
        return this.f66064f;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final MetadataVersion m91780k(boolean z) {
        MetadataVersion metadataVersion = z ? INSTANCE : f66062g;
        return metadataVersion.m91781l(this) ? metadataVersion : this;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m91781l(MetadataVersion metadataVersion) {
        if (m91757a() > metadataVersion.m91757a()) {
            return true;
        }
        return m91757a() >= metadataVersion.m91757a() && m91758b() > metadataVersion.m91758b();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final MetadataVersion m91782m() {
        return (m91757a() == 1 && m91758b() == 9) ? new MetadataVersion(2, 0, 0) : new MetadataVersion(m91757a(), m91758b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int... iArr) {
        this(iArr, false);
        iArr.getClass();
    }
}

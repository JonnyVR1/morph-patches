package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b#\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u0018\u0010*¨\u0006+"}, m87232d2 = {"Ll/zxf0;", "", "Ll/iqm;", "inAppStore", "Ll/vnm;", "impressionStore", "Ll/lar;", "legacyInAppStore", "Ll/aom;", "inAppAssetsStore", "Ll/dhi;", "filesStore", "<init>", "(Ll/iqm;Ll/vnm;Ll/lar;Ll/aom;Ll/dhi;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/iqm;", Constants.INAPP_DATA_TAG, "()Ll/iqm;", "g", "(Ll/iqm;)V", "b", "Ll/vnm;", "()Ll/vnm;", "f", "(Ll/vnm;)V", "c", "Ll/lar;", "e", "()Ll/lar;", "Ll/aom;", "()Ll/aom;", "Ll/dhi;", "()Ll/dhi;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class zxf0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private iqm inAppStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private vnm impressionStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final lar legacyInAppStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final aom inAppAssetsStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final dhi filesStore;

    public zxf0(@Nullable iqm iqmVar, @Nullable vnm vnmVar, @NotNull lar larVar, @NotNull aom aomVar, @NotNull dhi dhiVar) {
        larVar.getClass();
        aomVar.getClass();
        dhiVar.getClass();
        this.inAppStore = iqmVar;
        this.impressionStore = vnmVar;
        this.legacyInAppStore = larVar;
        this.inAppAssetsStore = aomVar;
        this.filesStore = dhiVar;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final dhi getFilesStore() {
        return this.filesStore;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final vnm getImpressionStore() {
        return this.impressionStore;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final aom getInAppAssetsStore() {
        return this.inAppAssetsStore;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final iqm getInAppStore() {
        return this.inAppStore;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final lar getLegacyInAppStore() {
        return this.legacyInAppStore;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zxf0)) {
            return false;
        }
        zxf0 zxf0Var = (zxf0) other;
        return Intrinsics.m87488d(this.inAppStore, zxf0Var.inAppStore) && Intrinsics.m87488d(this.impressionStore, zxf0Var.impressionStore) && Intrinsics.m87488d(this.legacyInAppStore, zxf0Var.legacyInAppStore) && Intrinsics.m87488d(this.inAppAssetsStore, zxf0Var.inAppAssetsStore) && Intrinsics.m87488d(this.filesStore, zxf0Var.filesStore);
    }

    /* JADX INFO: renamed from: f */
    public final void m220794f(@Nullable vnm vnmVar) {
        this.impressionStore = vnmVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m220795g(@Nullable iqm iqmVar) {
        this.inAppStore = iqmVar;
    }

    public int hashCode() {
        iqm iqmVar = this.inAppStore;
        int iHashCode = (iqmVar == null ? 0 : iqmVar.hashCode()) * 31;
        vnm vnmVar = this.impressionStore;
        return ((((((iHashCode + (vnmVar != null ? vnmVar.hashCode() : 0)) * 31) + this.legacyInAppStore.hashCode()) * 31) + this.inAppAssetsStore.hashCode()) * 31) + this.filesStore.hashCode();
    }

    @NotNull
    public String toString() {
        return "StoreRegistry(inAppStore=" + this.inAppStore + ", impressionStore=" + this.impressionStore + ", legacyInAppStore=" + this.legacyInAppStore + ", inAppAssetsStore=" + this.inAppAssetsStore + ", filesStore=" + this.filesStore + ')';
    }
}

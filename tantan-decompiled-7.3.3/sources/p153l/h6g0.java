package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b#\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u0018\u0010*¨\u0006+"}, m88121d2 = {"Ll/h6g0;", "", "Ll/ksm;", "inAppStore", "Ll/xpm;", "impressionStore", "Ll/ncr;", "legacyInAppStore", "Ll/cqm;", "inAppAssetsStore", "Ll/aki;", "filesStore", "<init>", "(Ll/ksm;Ll/xpm;Ll/ncr;Ll/cqm;Ll/aki;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/ksm;", Constants.INAPP_DATA_TAG, "()Ll/ksm;", "g", "(Ll/ksm;)V", "b", "Ll/xpm;", "()Ll/xpm;", "f", "(Ll/xpm;)V", "c", "Ll/ncr;", "e", "()Ll/ncr;", "Ll/cqm;", "()Ll/cqm;", "Ll/aki;", "()Ll/aki;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class h6g0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ksm inAppStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private xpm impressionStore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ncr legacyInAppStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final cqm inAppAssetsStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final aki filesStore;

    public h6g0(@Nullable ksm ksmVar, @Nullable xpm xpmVar, @NotNull ncr ncrVar, @NotNull cqm cqmVar, @NotNull aki akiVar) {
        ncrVar.getClass();
        cqmVar.getClass();
        akiVar.getClass();
        this.inAppStore = ksmVar;
        this.impressionStore = xpmVar;
        this.legacyInAppStore = ncrVar;
        this.inAppAssetsStore = cqmVar;
        this.filesStore = akiVar;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final aki getFilesStore() {
        return this.filesStore;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final xpm getImpressionStore() {
        return this.impressionStore;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final cqm getInAppAssetsStore() {
        return this.inAppAssetsStore;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ksm getInAppStore() {
        return this.inAppStore;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ncr getLegacyInAppStore() {
        return this.legacyInAppStore;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h6g0)) {
            return false;
        }
        h6g0 h6g0Var = (h6g0) other;
        return Intrinsics.m88377d(this.inAppStore, h6g0Var.inAppStore) && Intrinsics.m88377d(this.impressionStore, h6g0Var.impressionStore) && Intrinsics.m88377d(this.legacyInAppStore, h6g0Var.legacyInAppStore) && Intrinsics.m88377d(this.inAppAssetsStore, h6g0Var.inAppAssetsStore) && Intrinsics.m88377d(this.filesStore, h6g0Var.filesStore);
    }

    /* JADX INFO: renamed from: f */
    public final void m133706f(@Nullable xpm xpmVar) {
        this.impressionStore = xpmVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m133707g(@Nullable ksm ksmVar) {
        this.inAppStore = ksmVar;
    }

    public int hashCode() {
        ksm ksmVar = this.inAppStore;
        int iHashCode = (ksmVar == null ? 0 : ksmVar.hashCode()) * 31;
        xpm xpmVar = this.impressionStore;
        return ((((((iHashCode + (xpmVar != null ? xpmVar.hashCode() : 0)) * 31) + this.legacyInAppStore.hashCode()) * 31) + this.inAppAssetsStore.hashCode()) * 31) + this.filesStore.hashCode();
    }

    @NotNull
    public String toString() {
        return "StoreRegistry(inAppStore=" + this.inAppStore + ", impressionStore=" + this.impressionStore + ", legacyInAppStore=" + this.legacyInAppStore + ", inAppAssetsStore=" + this.inAppAssetsStore + ", filesStore=" + this.filesStore + ')';
    }
}

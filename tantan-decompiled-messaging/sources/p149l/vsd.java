package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/vsd;", "Ll/gqm;", "", "accountId", "Ll/nul;", "logger", "Ll/zsd;", "delayedLegacyInAppStore", "<init>", "(Ljava/lang/String;Ll/nul;Ll/zsd;)V", "", "Lorg/json/JSONObject;", "inApps", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Z", "id", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "a", "(Ljava/lang/String;)V", "b", "()V", "Ljava/lang/String;", "Ll/nul;", "Ll/zsd;", "getDelayedLegacyInAppStore$clevertap_core_release", "()Ll/zsd;", "e", "(Ll/zsd;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class vsd implements gqm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private zsd delayedLegacyInAppStore;

    public vsd(@NotNull String str, @NotNull nul nulVar, @Nullable zsd zsdVar) {
        str.getClass();
        nulVar.getClass();
        this.accountId = str;
        this.logger = nulVar;
        this.delayedLegacyInAppStore = zsdVar;
    }

    @Override // p149l.gqm
    /* JADX INFO: renamed from: a */
    public void mo127607a(@NotNull String id) {
        id.getClass();
        zsd zsdVar = this.delayedLegacyInAppStore;
        if (zsdVar != null) {
            zsdVar.m220004c(id);
        }
    }

    @Override // p149l.gqm
    /* JADX INFO: renamed from: b */
    public void mo127608b() {
        zsd zsdVar = this.delayedLegacyInAppStore;
        if (zsdVar != null) {
            zsdVar.m220003b();
        }
    }

    @Override // p149l.gqm
    @Nullable
    /* JADX INFO: renamed from: c */
    public JSONObject mo127609c(@NotNull String id) {
        id.getClass();
        zsd zsdVar = this.delayedLegacyInAppStore;
        if (zsdVar == null) {
            this.logger.verbose(this.accountId, "DelayedLegacyInAppStore is null, cannot retrieve");
            return null;
        }
        if (zsdVar != null) {
            return zsdVar.m220002a(id);
        }
        return null;
    }

    @Override // p149l.gqm
    /* JADX INFO: renamed from: d */
    public boolean mo127610d(@NotNull List<? extends JSONObject> inApps) {
        inApps.getClass();
        zsd zsdVar = this.delayedLegacyInAppStore;
        if (zsdVar == null) {
            this.logger.verbose(this.accountId, "DelayedLegacyInAppStore is null, cannot prepare");
            return false;
        }
        if (zsdVar != null) {
            return zsdVar.m220005d(inApps);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m199854e(@Nullable zsd zsdVar) {
        this.delayedLegacyInAppStore = zsdVar;
    }
}

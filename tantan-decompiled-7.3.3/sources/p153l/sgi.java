package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J9\u0010+\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0004\b+\u0010,JQ\u0010-\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b-\u0010\u001bJQ\u0010.\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b.\u0010\u001b¨\u0006/"}, m88121d2 = {"Ll/sgi;", "Ll/rgi;", "<init>", "()V", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "", "isLocalData", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "b", "(Lcom/hellogroup/fep/config/core/FepConfigManager;ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "", "message", "", "", "extraInfo", "", "errorCode", "", "throwable", "c", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "configType", Constants.KEY_KEY, "value", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ll/zgi;", BaseSei.INFO, "Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", "newStatus", Constants.INAPP_DATA_TAG, "(Ll/zgi;Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;)V", "bid", "Ll/tgi;", "checkResult", "requestData", "e", "(Ljava/lang/String;Ll/tgi;Ljava/util/Map;)V", "f", "g", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class sgi implements rgi {
    @Override // p153l.bgi
    /* JADX INFO: renamed from: a */
    public void mo17603a(@NotNull String configType, @NotNull String key, @Nullable Object value) {
        configType.getClass();
        key.getClass();
    }

    @Override // p153l.bgi
    /* JADX INFO: renamed from: b */
    public void mo17604b(@NotNull FepConfigManager manager, boolean isLocalData, @NotNull FepConfigFetchType type) {
        manager.getClass();
        type.getClass();
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"serviceWorker", "swBlackList"})) {
            Object objM17621l = FepConfigManager.m17621l(manager, str, null, 2, null);
            if (objM17621l != null) {
                frw.m126988j(str, objM17621l);
            }
        }
    }

    @Override // p153l.bgi
    /* JADX INFO: renamed from: c */
    public void mo17605c(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
    }

    @Override // p153l.ehi
    /* JADX INFO: renamed from: d */
    public void mo17607d(@NotNull zgi info, @NotNull FepPackageStatus newStatus) {
        info.getClass();
        newStatus.getClass();
    }

    @Override // p153l.ehi
    /* JADX INFO: renamed from: e */
    public void mo17608e(@NotNull String bid, @Nullable tgi checkResult, @Nullable Map<String, ? extends Object> requestData) {
        Map<String, Object> mapM191030e;
        bid.getClass();
        hjw.INSTANCE.m135536j(bid, checkResult);
        if (checkResult == null || (mapM191030e = checkResult.m191030e()) == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : mapM191030e.entrySet()) {
            frw.m126989k(bid, entry.getKey(), entry.getValue());
        }
    }

    @Override // p153l.ehi
    /* JADX INFO: renamed from: f */
    public void mo17609f(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
    }

    @Override // p153l.igi
    /* JADX INFO: renamed from: g */
    public void mo17606g(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
    }
}

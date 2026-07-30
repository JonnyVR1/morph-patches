package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J9\u0010%\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b%\u0010&J)\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b*\u0010+JQ\u0010.\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/JQ\u00100\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b0\u0010/JQ\u00101\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b1\u0010/¨\u00063"}, m88121d2 = {"Ll/ss8;", "Ll/rgi;", "<init>", "()V", "", "tagString", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "", "errorCode", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "message", "", "", "extraInfo", "", "h", "(Ljava/lang/String;Lcom/hellogroup/fep/base/FepLogLevel;ILcom/hellogroup/fep/base/FepLogModuleType;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "", "isLocalData", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "b", "(Lcom/hellogroup/fep/config/core/FepConfigManager;ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "Ll/zgi;", BaseSei.INFO, "Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", "newStatus", Constants.INAPP_DATA_TAG, "(Ll/zgi;Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;)V", "bid", "Ll/tgi;", "checkResult", "requestData", "e", "(Ljava/lang/String;Ll/tgi;Ljava/util/Map;)V", "configType", Constants.KEY_KEY, "value", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "throwable", "c", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "g", "f", "Companion", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ss8 implements rgi {
    /* JADX INFO: renamed from: h */
    private final void m187691h(String tagString, FepLogLevel level, int errorCode, FepLogModuleType moduleType, String message, Map<String, ? extends Object> extraInfo) {
        String str = tagString + '=' + errorCode + ',' + level + ',' + moduleType + ',' + message + ',' + extraInfo;
        if (level == FepLogLevel.error) {
            jzv.m147729b("CoreFepObserverImp", str);
        } else {
            jzv.m147734g("CoreFepObserverImp", str);
        }
    }

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
        jzv.m147734g("CoreFepObserverImp", "didUpdate=" + isLocalData + ',' + type);
    }

    @Override // p153l.bgi
    /* JADX INFO: renamed from: c */
    public void mo17605c(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
        m187691h("fepConfigLog", level, errorCode, moduleType, message, extraInfo);
        MKCoreLogManager.m18426d(moduleType, level, message, extraInfo, errorCode, throwable);
    }

    @Override // p153l.ehi
    /* JADX INFO: renamed from: d */
    public void mo17607d(@NotNull zgi info, @NotNull FepPackageStatus newStatus) {
        info.getClass();
        newStatus.getClass();
        jzv.m147729b("CoreFepObserverImp", "statusDidChange=" + newStatus + ',' + info);
    }

    @Override // p153l.ehi
    /* JADX INFO: renamed from: e */
    public void mo17608e(@NotNull String bid, @Nullable tgi checkResult, @Nullable Map<String, ? extends Object> requestData) {
        bid.getClass();
        jzv.m147732e("CoreFepObserverImp", "checkUpdateResponse=" + bid + ',' + checkResult + ',' + requestData);
    }

    @Override // p153l.ehi
    /* JADX INFO: renamed from: f */
    public void mo17609f(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
        m187691h("packageLog", level, errorCode, moduleType, message, extraInfo);
        MKCoreLogManager.m18426d(moduleType, level, message, extraInfo, errorCode, throwable);
    }

    @Override // p153l.igi
    /* JADX INFO: renamed from: g */
    public void mo17606g(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
        m187691h("greyLog", level, errorCode, moduleType, message, extraInfo);
        MKCoreLogManager.m18426d(moduleType, level, message, extraInfo, errorCode, throwable);
    }
}

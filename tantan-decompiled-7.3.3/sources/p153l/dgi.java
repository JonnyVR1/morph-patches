package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.fep.base.FepLogLevel;
import com.hellogroup.fep.base.FepLogModuleType;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJQ\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/dgi;", "Ll/bgi;", "<init>", "()V", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "", "isLocalData", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "b", "(Lcom/hellogroup/fep/config/core/FepConfigManager;ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "Lcom/hellogroup/fep/base/FepLogModuleType;", "moduleType", "Lcom/hellogroup/fep/base/FepLogLevel;", FirebaseAnalytics.Param.LEVEL, "", "message", "", "", "extraInfo", "", "errorCode", "", "throwable", "c", "(Lcom/hellogroup/fep/base/FepLogModuleType;Lcom/hellogroup/fep/base/FepLogLevel;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Throwable;)V", "configType", Constants.KEY_KEY, "value", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class dgi implements bgi {
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
    }

    @Override // p153l.bgi
    /* JADX INFO: renamed from: c */
    public void mo17605c(@NotNull FepLogModuleType moduleType, @NotNull FepLogLevel level, @NotNull String message, @Nullable Map<String, ? extends Object> extraInfo, int errorCode, @Nullable Throwable throwable) {
        moduleType.getClass();
        level.getClass();
        message.getClass();
    }
}

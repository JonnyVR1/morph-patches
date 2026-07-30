package com.tantanapp.sharelib.workmanager.impl;

import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.WorkManager;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/impl/WorkManagerImpl;", "Lcom/tantanapp/sharelib/workmanager/WorkManager;", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", BaseSei.INFO, "", "b", "(Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "", "Ljava/util/UUID;", "Ljava/util/Map;", "getAllWorkInfos", "()Ljava/util/Map;", "allWorkInfos", "Companion", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class WorkManagerImpl extends WorkManager {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Object f56244c = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<UUID, WorkInfo> allWorkInfos;

    /* JADX INFO: renamed from: b */
    public final void m81567b(@NotNull WorkInfo info) {
        info.getClass();
        this.allWorkInfos.put(info.getId(), info);
    }
}

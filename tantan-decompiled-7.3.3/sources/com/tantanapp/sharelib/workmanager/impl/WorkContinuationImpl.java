package com.tantanapp.sharelib.workmanager.impl;

import com.immomo.momomediaext.sei.BaseSei;
import com.tantanapp.sharelib.workmanager.WorkContinuation;
import com.tantanapp.sharelib.workmanager.WorkInfo;
import com.tantanapp.sharelib.workmanager.Worker;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0014"}, m88121d2 = {"Lcom/tantanapp/sharelib/workmanager/impl/WorkContinuationImpl;", "Lcom/tantanapp/sharelib/workmanager/WorkContinuation;", "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", BaseSei.INFO, "", "c", "(Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "Lcom/tantanapp/sharelib/workmanager/impl/WorkManagerImpl;", "a", "Lcom/tantanapp/sharelib/workmanager/impl/WorkManagerImpl;", "getWorkManagerImpl", "()Lcom/tantanapp/sharelib/workmanager/impl/WorkManagerImpl;", "workManagerImpl", "", "Lcom/tantanapp/sharelib/workmanager/Worker;", "b", "Ljava/util/List;", "()Ljava/util/List;", "workerList", "parents", "workmanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class WorkContinuationImpl extends WorkContinuation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkManagerImpl workManagerImpl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Worker> workerList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final List<WorkContinuationImpl> parents;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final List<WorkContinuationImpl> m82747a() {
        return this.parents;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<Worker> m82748b() {
        return this.workerList;
    }

    /* JADX INFO: renamed from: c */
    public final void m82749c(@NotNull WorkInfo info) {
        info.getClass();
        this.workManagerImpl.m82750b(info);
    }
}

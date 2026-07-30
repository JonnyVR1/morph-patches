package com.tantanapp.sharelib.workmanager.utils;

import com.tantanapp.sharelib.workmanager.Worker;
import com.tantanapp.sharelib.workmanager.impl.WorkManagerImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Lcom/tantanapp/sharelib/workmanager/utils/StartWorkRunnable;", "Ljava/lang/Runnable;", "", "run", "()V", "Lcom/tantanapp/sharelib/workmanager/impl/WorkManagerImpl;", "a", "Lcom/tantanapp/sharelib/workmanager/impl/WorkManagerImpl;", "workManagerImpl", "", "Lcom/tantanapp/sharelib/workmanager/Worker;", "b", "Ljava/util/List;", "workerList", "workmanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class StartWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkManagerImpl workManagerImpl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Worker> workerList;

    @Override // java.lang.Runnable
    public void run() {
        for (Worker worker : this.workerList) {
            this.workManagerImpl.m82750b(worker.getInfo());
            worker.startWork();
        }
    }
}

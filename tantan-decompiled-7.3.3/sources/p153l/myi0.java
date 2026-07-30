package p153l;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class myi0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m160795a(Object obj, ThreadPoolExecutor threadPoolExecutor) {
        throw new RejectedExecutionException("Task " + ((Object) obj.toString()) + ((Object) " rejected from ") + ((Object) threadPoolExecutor.toString()));
    }
}

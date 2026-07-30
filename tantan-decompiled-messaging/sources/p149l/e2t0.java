package p149l;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class e2t0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f88942a = new ThreadPoolExecutor(2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new d2t0("ClientDefault"));

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f88943b = Executors.newSingleThreadExecutor(new d2t0("ClientSingle"));
}

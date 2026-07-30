package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001\u000fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u000f\u0010\"¨\u0006%"}, m87232d2 = {"Ll/qld0;", "", "<init>", "()V", "", "url", "", "e", "(Ljava/lang/String;)Z", "resourceUrl", "Ljava/io/File;", "f", "(Ljava/lang/String;)Ljava/io/File;", "", Constants.INAPP_DATA_TAG, "a", "Ljava/io/File;", "svgaResHome", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Runnable;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "()Ljava/util/concurrent/ConcurrentHashMap;", "taskMap", "Ljava/util/concurrent/LinkedBlockingQueue;", "c", "Ljava/util/concurrent/LinkedBlockingQueue;", "()Ljava/util/concurrent/LinkedBlockingQueue;", "taskQueue", "", "I", "availableProcessors", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "()Ljava/util/concurrent/ThreadPoolExecutor;", "executorService", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qld0 {

    /* JADX INFO: renamed from: f */
    public static final String f155219f = qb60.m173822b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public File svgaResHome;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Object, Runnable> taskMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<Runnable> taskQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int availableProcessors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ThreadPoolExecutor executorService;

    public qld0() {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        this.taskQueue = linkedBlockingQueue;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.availableProcessors = iAvailableProcessors;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 5L, TimeUnit.SECONDS, linkedBlockingQueue);
        this.executorService = threadPoolExecutor;
        m175473d();
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ThreadPoolExecutor getExecutorService() {
        return this.executorService;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<Object, Runnable> m175471b() {
        return this.taskMap;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue<Runnable> m175472c() {
        return this.taskQueue;
    }

    /* JADX INFO: renamed from: d */
    public final void m175473d() {
        if (this.svgaResHome == null) {
            String str = f155219f;
            str.getClass();
            this.svgaResHome = new File(str + (!C15386d.m93489w(str, "/", false, 2, null) ? "/TTSVGAS" : "TTSVGAS"), "svgares");
        }
        File file = this.svgaResHome;
        file.getClass();
        if (file.exists()) {
            return;
        }
        File file2 = this.svgaResHome;
        file2.getClass();
        file2.mkdirs();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m175474e(@Nullable String url) {
        if (!TextUtils.isEmpty(url)) {
            url.getClass();
            if (C15386d.m93489w(url, ".svga", false, 2, null) || C15386d.m93489w(url, ".so", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final File m175475f(@Nullable String resourceUrl) {
        return new File(this.svgaResHome, ngw.m159359f(resourceUrl) + ".svga");
    }
}

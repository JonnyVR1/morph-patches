package p149l;

import android.media.MediaDrm;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class pjx {
    /* JADX INFO: renamed from: a */
    public static String m169963a() throws Throwable {
        StringBuilder sb = new StringBuilder();
        MediaDrm mediaDrm = null;
        try {
            MediaDrm mediaDrm2 = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            try {
                byte[] propertyByteArray = mediaDrm2.getPropertyByteArray(rjw.m179664a(new byte[]{84, 3, 71, 94, 2, 3, 101, 8, 88, 70, 20, 3, 121, 2}));
                if (propertyByteArray != null) {
                    sb.append(bgw.m101750b(propertyByteArray));
                }
                mediaDrm2.release();
            } catch (Exception unused) {
                mediaDrm = mediaDrm2;
                if (mediaDrm != null) {
                    mediaDrm.release();
                }
            } catch (Throwable th) {
                th = th;
                mediaDrm = mediaDrm2;
                if (mediaDrm != null) {
                    mediaDrm.release();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m169964b() {
        String str;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: l.ojx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pjx.m169963a();
            }
        });
        try {
            str = (String) futureSubmit.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            str = "";
        } finally {
            futureSubmit.cancel(true);
            executorServiceNewSingleThreadExecutor.shutdownNow();
        }
        return str;
    }
}

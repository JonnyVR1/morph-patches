package p153l;

import android.content.Context;
import android.os.Environment;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.config.internal.FepConfigContext;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/egi;", "", "<init>", "()V", "", Constants.KEY_CONFIG, "", "f", "(Ljava/lang/String;)V", "Ljava/io/File;", "b", "()Ljava/io/File;", "a", "()Ljava/lang/String;", "Ll/zfi;", "data", "e", "(Ll/zfi;)V", "c", "()Ll/zfi;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", JoinPoint.SYNCHRONIZATION_LOCK, "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class egi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: a */
    private final String m120765a() {
        File file;
        if (Intrinsics.m88377d("mounted", Environment.getExternalStorageState()) && (file = j26.m143194g(lv0.m155971a(), null)[0]) != null) {
            return file.getAbsolutePath() + File.separator + "fepConfig.json";
        }
        StringBuilder sb = new StringBuilder();
        Context contextM155971a = lv0.m155971a();
        contextM155971a.getClass();
        File filesDir = contextM155971a.getFilesDir();
        filesDir.getClass();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("fepConfig.json");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private final File m120766b() throws IOException {
        File file = new File(m120765a());
        if (file.exists()) {
            return file;
        }
        file.createNewFile();
        return file;
    }

    /* JADX INFO: renamed from: f */
    private final void m120767f(String config) {
        try {
            Result.Companion companion = Result.INSTANCE;
            FileUtil.m17542z(m120766b(), config);
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final zfi m120768c() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        zfi zfiVar = null;
        try {
            String strM120769d = m120769d();
            if (StringsKt.m94329e0(strM120769d)) {
                pgi.m172233b(FepConfigContext.INSTANCE.m17638e(), "No config file found on disk", null, 2, null);
                return null;
            }
            zfi zfiVarM109690a = cgi.INSTANCE.m109690a(strM120769d);
            pgi.m172235f(FepConfigContext.INSTANCE.m17638e(), "Config loaded from disk, hash: " + zfiVarM109690a.getHashStr(), null, 0, 6, null);
            zfiVarM109690a.m219541f(true);
            zfiVar = zfiVarM109690a;
            return zfiVar;
        } catch (Exception e) {
            pgi pgiVarM17638e = FepConfigContext.INSTANCE.m17638e();
            String str = "Load config failed: " + e.getMessage();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pgi.m172239k(pgiVarM17638e, str, e, 0, MapsKt.mapOf(TuplesKt.m88129a("error", message)), 4, null);
        } finally {
            lock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m120769d() throws Throwable {
        try {
            String strM17534r = FileUtil.m17534r(m120766b());
            strM17534r.getClass();
            return strM17534r;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m120770e(@NotNull zfi data) {
        Object objM225066constructorimpl;
        data.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                String str = data.getCom.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA java.lang.String();
                if (str == null || str.length() == 0) {
                    pgi.m172239k(FepConfigContext.INSTANCE.m17638e(), "Save config failed", null, 0, null, 14, null);
                } else {
                    m120767f(str);
                    pgi.m172235f(FepConfigContext.INSTANCE.m17638e(), "Config saved to disk successfully, hash: " + data.getHashStr(), null, 0, 6, null);
                }
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
            if (thM225069exceptionOrNullimpl != null) {
                pgi pgiVarM17638e = FepConfigContext.INSTANCE.m17638e();
                String str2 = "Save config failed: " + thM225069exceptionOrNullimpl.getMessage();
                String message = thM225069exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                pgi.m172239k(pgiVarM17638e, str2, thM225069exceptionOrNullimpl, 0, MapsKt.mapOf(TuplesKt.m88129a("error", message)), 4, null);
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}

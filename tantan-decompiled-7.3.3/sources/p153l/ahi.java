package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0003R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#¨\u0006%"}, m88121d2 = {"Ll/ahi;", "", "<init>", "()V", "Ll/zgi;", "infoPkg", "Ll/fhi$a;", "parseResult", "a", "(Ll/zgi;Ll/fhi$a;)Ll/zgi;", "b", "", "bid", "baseVersion", "g", "(Ljava/lang/String;Ljava/lang/String;)Ll/zgi;", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", Constants.KEY_CONFIG, "packagePath", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;Ljava/lang/String;)V", "verName", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "f", "(Ll/fhi$a;)Ll/zgi;", "e", "h", "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "infoCache", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", JoinPoint.SYNCHRONIZATION_LOCK, "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ahi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, zgi> infoCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    /* JADX INFO: renamed from: a */
    private final zgi m97837a(zgi infoPkg, fhi.C16975a parseResult) {
        boolean zBooleanValue;
        if (infoPkg.m219623f() == null) {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            File fileM109808j = fepPackageContext.m17684k().m109808j(parseResult.getBid(), parseResult.getBaseVersion());
            if (fileM109808j == null || !fileM109808j.exists()) {
                zBooleanValue = false;
            } else {
                String absolutePath = fileM109808j.getAbsolutePath();
                nhi nhiVarM17694u = fepPackageContext.m17694u();
                String strM125558b = parseResult.getBid();
                String strM125557a = parseResult.getBaseVersion();
                absolutePath.getClass();
                Pair pairM163100m = nhi.m163100m(nhiVarM17694u, strM125558b, strM125557a, absolutePath, false, true, null, 40, null);
                zBooleanValue = ((Boolean) pairM163100m.getFirst()).booleanValue();
                FepPackageConfig fepPackageConfig = (FepPackageConfig) pairM163100m.getSecond();
                if (fepPackageConfig != null) {
                    m97845i(parseResult.getBid(), parseResult.getBaseVersion(), fepPackageConfig, absolutePath);
                    infoPkg.m219638u(FepPackageStatus.Ready);
                }
            }
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            infoPkg.m219638u(FepPackageStatus.None);
        }
        return infoPkg;
    }

    /* JADX INFO: renamed from: b */
    private final zgi m97838b(zgi infoPkg, fhi.C16975a parseResult) {
        File fileM109807i = FepPackageContext.INSTANCE.m17684k().m109807i(parseResult.getBid(), parseResult.getBaseVersion());
        if (fileM109807i == null || !fileM109807i.exists()) {
            infoPkg.m219638u(FepPackageStatus.None);
            return infoPkg;
        }
        String strM125558b = parseResult.getBid();
        String strM125557a = parseResult.getBaseVersion();
        String absolutePath = fileM109807i.getAbsolutePath();
        absolutePath.getClass();
        String name = fileM109807i.getName();
        name.getClass();
        m97839c(strM125558b, strM125557a, absolutePath, name);
        infoPkg.m219638u(FepPackageStatus.Ready);
        return infoPkg;
    }

    /* JADX INFO: renamed from: c */
    public final void m97839c(@NotNull String bid, @NotNull String baseVersion, @NotNull String packagePath, @NotNull String verName) {
        bid.getClass();
        baseVersion.getClass();
        packagePath.getClass();
        verName.getClass();
        zgi zgiVarM97842f = m97842f(new fhi.C16975a(bid, baseVersion, null, 4, null));
        Long lM151325m = kt0.m151325m(verName);
        zgiVarM97842f.m219639v(lM151325m != null ? lM151325m.longValue() : 0L, packagePath, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m97840d() {
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
            this.infoCache.clear();
            Unit unit = Unit.INSTANCE;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final zgi m97841e(@NotNull fhi.C16975a parseResult) {
        parseResult.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            String strM125558b = parseResult.getBid();
            String strM125557a = parseResult.getBaseVersion();
            zgi zgiVar = this.infoCache.get(strM125558b + '#' + strM125557a);
            if (zgiVar == null) {
                zgiVar = new zgi(strM125558b, strM125557a, null, 0L, null, null, null, null, null, 508, null);
                this.infoCache.put(strM125558b + '#' + strM125557a, zgiVar);
            }
            m97838b(zgiVar, parseResult);
            String strM125559c = parseResult.getUrl();
            if (strM125559c != null) {
                if (StringsKt.m94329e0(strM125559c)) {
                    strM125559c = null;
                }
                if (strM125559c != null) {
                    zgiVar.m219637t(strM125559c);
                }
            }
            return zgiVar;
        } finally {
            lock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final zgi m97842f(@NotNull fhi.C16975a parseResult) {
        fhi.C16975a c16975a;
        parseResult.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            String strM125558b = parseResult.getBid();
            String strM125557a = parseResult.getBaseVersion();
            zgi zgiVar = this.infoCache.get(strM125558b + '#' + strM125557a);
            if (zgiVar == null) {
                zgiVar = new zgi(strM125558b, strM125557a, null, 0L, null, null, null, null, null, 508, null);
                this.infoCache.put(strM125558b + '#' + strM125557a, zgiVar);
                c16975a = parseResult;
                m97837a(zgiVar, c16975a);
            } else {
                c16975a = parseResult;
            }
            String strM125559c = c16975a.getUrl();
            if (strM125559c != null) {
                if (StringsKt.m94329e0(strM125559c)) {
                    strM125559c = null;
                }
                if (strM125559c != null) {
                    zgiVar.m219637t(strM125559c);
                }
            }
            return zgiVar;
        } finally {
            lock.unlock();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final zgi m97843g(@NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.infoCache.get(bid + '#' + baseVersion);
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m97844h(@NotNull String bid, @NotNull String baseVersion) {
        bid.getClass();
        baseVersion.getClass();
        String str = bid + '#' + baseVersion;
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
            zgi zgiVar = this.infoCache.get(str);
            if (zgiVar != null) {
                zgiVar.m219619a();
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m97845i(@NotNull String bid, @NotNull String baseVersion, @NotNull FepPackageConfig config, @NotNull String packagePath) {
        bid.getClass();
        baseVersion.getClass();
        config.getClass();
        packagePath.getClass();
        m97842f(new fhi.C16975a(bid, baseVersion, null, 4, null)).m219639v(config.getVersion(), packagePath, config);
    }
}

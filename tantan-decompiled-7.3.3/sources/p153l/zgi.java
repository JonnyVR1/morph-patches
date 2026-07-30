package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.hellogroup.fep.feppkg.model.FepPackageConfig;
import com.hellogroup.fep.feppkg.model.FepPackageStatus;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001c¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u00103Jt\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\"J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u001c2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\bA\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bC\u0010\"R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010@\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010FR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010GR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010HR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010@R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010IR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010JR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010K\u001a\u0004\bL\u00100\"\u0004\bM\u0010N¨\u0006O"}, m88121d2 = {"Ll/zgi;", "", "", "bid", "baseVersion", "pageUrl", "", "fullVersion", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", Constants.KEY_CONFIG, "localPath", "Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", NotificationCompat.CATEGORY_STATUS, "Lorg/json/JSONObject;", "originCheckUpdateData", "Ll/ngi;", "fepGreyState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/hellogroup/fep/feppkg/model/FepPackageConfig;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;Lorg/json/JSONObject;Ll/ngi;)V", "g", "()J", "", ResourceDirection.f39656v, "(JLjava/lang/String;Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;)V", "a", "()V", "m", "()Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", "", "p", "()Z", "u", "(Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;)V", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", "Ljava/io/File;", "h", "()Ljava/io/File;", "f", "()Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "n", "j", "()Lorg/json/JSONObject;", "data", BLiveStormDanmakuGiftResourceType.f45294s, "(Lorg/json/JSONObject;)V", "o", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/ngi;", "url", "q", "(Ljava/lang/String;)Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/hellogroup/fep/feppkg/model/FepPackageConfig;Ljava/lang/String;Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;Lorg/json/JSONObject;Ll/ngi;)Ll/zgi;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/lang/String;", "e", "c", Constants.INAPP_DATA_TAG, "k", Constants.KEY_T, "(Ljava/lang/String;)V", "J", "Lcom/hellogroup/fep/feppkg/model/FepPackageConfig;", "Lcom/hellogroup/fep/feppkg/model/FepPackageStatus;", "Lorg/json/JSONObject;", "Ll/ngi;", "getFepGreyState", "r", "(Ll/ngi;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class zgi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReentrantReadWriteLock lock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String baseVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String pageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long fullVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private FepPackageConfig config;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String localPath;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private FepPackageStatus status;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private JSONObject originCheckUpdateData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ngi fepGreyState;

    public /* synthetic */ zgi(String str, String str2, String str3, long j, FepPackageConfig fepPackageConfig, String str4, FepPackageStatus fepPackageStatus, JSONObject jSONObject, ngi ngiVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : fepPackageConfig, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? FepPackageStatus.None : fepPackageStatus, (i & 128) != 0 ? null : jSONObject, (i & 256) != 0 ? null : ngiVar);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zgi m219618c(zgi zgiVar, String str, String str2, String str3, long j, FepPackageConfig fepPackageConfig, String str4, FepPackageStatus fepPackageStatus, JSONObject jSONObject, ngi ngiVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zgiVar.bid;
        }
        if ((i & 2) != 0) {
            str2 = zgiVar.baseVersion;
        }
        if ((i & 4) != 0) {
            str3 = zgiVar.pageUrl;
        }
        if ((i & 8) != 0) {
            j = zgiVar.fullVersion;
        }
        if ((i & 16) != 0) {
            fepPackageConfig = zgiVar.config;
        }
        if ((i & 32) != 0) {
            str4 = zgiVar.localPath;
        }
        if ((i & 64) != 0) {
            fepPackageStatus = zgiVar.status;
        }
        if ((i & 128) != 0) {
            jSONObject = zgiVar.originCheckUpdateData;
        }
        if ((i & 256) != 0) {
            ngiVar = zgiVar.fepGreyState;
        }
        ngi ngiVar2 = ngiVar;
        FepPackageStatus fepPackageStatus2 = fepPackageStatus;
        FepPackageConfig fepPackageConfig2 = fepPackageConfig;
        long j2 = j;
        String str5 = str3;
        return zgiVar.m219620b(str, str2, str5, j2, fepPackageConfig2, str4, fepPackageStatus2, jSONObject, ngiVar2);
    }

    /* JADX INFO: renamed from: a */
    public final void m219619a() {
        m219639v(0L, null, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final zgi m219620b(@NotNull String bid, @NotNull String baseVersion, @Nullable String pageUrl, long fullVersion, @Nullable FepPackageConfig config, @Nullable String localPath, @NotNull FepPackageStatus status, @Nullable JSONObject originCheckUpdateData, @Nullable ngi fepGreyState) {
        bid.getClass();
        baseVersion.getClass();
        status.getClass();
        return new zgi(bid, baseVersion, pageUrl, fullVersion, config, localPath, status, originCheckUpdateData, fepGreyState);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBaseVersion() {
        return this.baseVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBid() {
        return this.bid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zgi)) {
            return false;
        }
        zgi zgiVar = (zgi) other;
        return Intrinsics.m88377d(this.bid, zgiVar.bid) && Intrinsics.m88377d(this.baseVersion, zgiVar.baseVersion) && Intrinsics.m88377d(this.pageUrl, zgiVar.pageUrl) && this.fullVersion == zgiVar.fullVersion && Intrinsics.m88377d(this.config, zgiVar.config) && Intrinsics.m88377d(this.localPath, zgiVar.localPath) && Intrinsics.m88377d(this.status, zgiVar.status) && Intrinsics.m88377d(this.originCheckUpdateData, zgiVar.originCheckUpdateData) && Intrinsics.m88377d(this.fepGreyState, zgiVar.fepGreyState);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final FepPackageConfig m219623f() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.config;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m219624g() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.fullVersion;
        } finally {
            lock.unlock();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final File m219625h() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            String str = this.localPath;
            return str != null ? new File(str) : null;
        } finally {
            lock.unlock();
        }
    }

    public int hashCode() {
        String str = this.bid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.baseVersion;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.pageUrl;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.fullVersion)) * 31;
        FepPackageConfig fepPackageConfig = this.config;
        int iHashCode4 = (iHashCode3 + (fepPackageConfig != null ? fepPackageConfig.hashCode() : 0)) * 31;
        String str4 = this.localPath;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        FepPackageStatus fepPackageStatus = this.status;
        int iHashCode6 = (iHashCode5 + (fepPackageStatus != null ? fepPackageStatus.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.originCheckUpdateData;
        int iHashCode7 = (iHashCode6 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        ngi ngiVar = this.fepGreyState;
        return iHashCode7 + (ngiVar != null ? ngiVar.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final String m219626i() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.localPath;
        } finally {
            lock.unlock();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final JSONObject m219627j() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.originCheckUpdateData;
        } finally {
            lock.unlock();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ngi getFepGreyState() {
        return this.fepGreyState;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FepPackageStatus m219630m() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return this.status;
        } finally {
            lock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final String m219631n() {
        String versionStr;
        FepPackageConfig fepPackageConfig = this.config;
        return (fepPackageConfig == null || (versionStr = fepPackageConfig.getVersionStr()) == null) ? "" : versionStr;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m219632o() {
        String str = this.localPath;
        return (str == null || StringsKt.m94329e0(str) || this.fullVersion <= 0 || this.config == null) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m219633p() {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return m219630m() == FepPackageStatus.CheckingUpdate || m219630m() == FepPackageStatus.Downloading || m219630m() == FepPackageStatus.Installing;
        } finally {
            lock.unlock();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final String m219634q(@NotNull String url) {
        url.getClass();
        ngi ngiVar = this.fepGreyState;
        if (ngiVar != null && !m219632o() && ngiVar.m162970e()) {
            ngi ngiVar2 = this.fepGreyState;
            if (!(ngiVar2 != null ? ngiVar2.getIsSameVersion() : false)) {
                return hgi.INSTANCE.m134945a().m134942e(url, this.fepGreyState);
            }
        }
        return url;
    }

    /* JADX INFO: renamed from: r */
    public final void m219635r(@Nullable ngi ngiVar) {
        this.fepGreyState = ngiVar;
    }

    /* JADX INFO: renamed from: s */
    public final void m219636s(@Nullable JSONObject data) {
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
            this.originCheckUpdateData = data;
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

    /* JADX INFO: renamed from: t */
    public final void m219637t(@Nullable String str) {
        this.pageUrl = str;
    }

    @NotNull
    public String toString() {
        return "FepPackageInfo(bid=" + this.bid + ", baseVersion=" + this.baseVersion + ", pageUrl=" + this.pageUrl + ", fullVersion=" + this.fullVersion + ", config=" + this.config + ", localPath=" + this.localPath + ", status=" + this.status + ", originCheckUpdateData=" + this.originCheckUpdateData + ", fepGreyState=" + this.fepGreyState + ")";
    }

    /* JADX INFO: renamed from: u */
    public final void m219638u(@NotNull FepPackageStatus status) {
        status.getClass();
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
            this.status = status;
            FepPackageContext.INSTANCE.m17695v(this);
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

    /* JADX INFO: renamed from: v */
    public final void m219639v(long fullVersion, @Nullable String localPath, @Nullable FepPackageConfig config) {
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
            this.fullVersion = fullVersion;
            this.localPath = localPath;
            this.config = config;
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

    public zgi(@NotNull String str, @NotNull String str2, @Nullable String str3, long j, @Nullable FepPackageConfig fepPackageConfig, @Nullable String str4, @NotNull FepPackageStatus fepPackageStatus, @Nullable JSONObject jSONObject, @Nullable ngi ngiVar) {
        str.getClass();
        str2.getClass();
        fepPackageStatus.getClass();
        this.bid = str;
        this.baseVersion = str2;
        this.pageUrl = str3;
        this.fullVersion = j;
        this.config = fepPackageConfig;
        this.localPath = str4;
        this.status = fepPackageStatus;
        this.originCheckUpdateData = jSONObject;
        this.fepGreyState = ngiVar;
        this.lock = new ReentrantReadWriteLock();
    }
}

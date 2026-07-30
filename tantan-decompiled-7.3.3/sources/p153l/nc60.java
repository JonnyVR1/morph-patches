package p153l;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J;\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0016\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/nc60;", "", "<init>", "()V", "", "identity", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "", "e", "(Ljava/lang/String;)V", "a", "zipUrl", "bid", "", "newVersion", "", "recordData", "b", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)Ljava/lang/String;", "patchUrl", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Ll/cae;", "Ljava/util/concurrent/ConcurrentHashMap;", "downloadTaskRecord", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class nc60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, cae> downloadTaskRecord = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    private final void m162503a() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        ConcurrentHashMap<String, cae> concurrentHashMap = this.downloadTaskRecord;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, cae> entry : concurrentHashMap.entrySet()) {
            cae value = entry.getValue();
            if (value.getIsDownloading() && jUptimeMillis - value.getCom.p1.mobile.putong.data.StudentVerRejectedReason.startTime java.lang.String() > Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : linkedHashMap.keySet()) {
            this.downloadTaskRecord.remove(str);
            pgi.m172233b(FepPackageContext.INSTANCE.m17685l(), "Cleaned expired download task: " + str, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m162504d(String identity) {
        boolean z;
        synchronized (this.downloadTaskRecord) {
            try {
                m162503a();
                cae caeVar = this.downloadTaskRecord.get(identity);
                if (caeVar == null || !caeVar.getIsDownloading()) {
                    this.downloadTaskRecord.put(identity, new cae(true, SystemClock.uptimeMillis()));
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    private final void m162505e(String identity) {
        synchronized (this.downloadTaskRecord) {
            this.downloadTaskRecord.remove(identity);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m162506b(@NotNull String zipUrl, @NotNull String bid, long newVersion, @NotNull Map<String, String> recordData) {
        zipUrl.getClass();
        bid.getClass();
        recordData.getClass();
        String str = bid + "_v" + newVersion;
        if (!m162504d(str)) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Download task already in progress: ".concat(str), null, 0, recordData, 6, null);
            return null;
        }
        try {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            File fileM109800h = chi.m109800h(fepPackageContext.m17684k(), bid, null, 2, null);
            if (fileM109800h.exists()) {
                fileM109800h.delete();
            }
            if (!rk20.C19859a.m181777a(fepPackageContext.m17690q().getNetwork(), zipUrl, fileM109800h, null, MapsKt.mapOf(TuplesKt.m88129a("Content-Type", "application/zip")), 4, null)) {
                fileM109800h.delete();
                pgi.m172234d(fepPackageContext.m17685l(), -3004, "Download failed", null, recordData, 4, null);
                m162505e(str);
                return null;
            }
            if (fileM109800h.length() > 0 && fileM109800h.exists()) {
                pgi.m172235f(fepPackageContext.m17685l(), "Download success: " + zipUrl + " -> " + fileM109800h.getAbsolutePath(), recordData, 0, 4, null);
                m162505e(str);
                return fileM109800h.getAbsolutePath();
            }
            pgi.m172234d(fepPackageContext.m17685l(), -3004, "Download failed", null, recordData, 4, null);
            m162505e(str);
            return null;
        } catch (Exception e) {
            FepPackageContext.INSTANCE.m17685l().m172241c(-3004, "Download failed: " + e.getMessage(), e, recordData);
            m162505e(str);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m162507c(@NotNull String patchUrl, @NotNull String bid, long newVersion, @NotNull Map<String, String> recordData) {
        patchUrl.getClass();
        bid.getClass();
        recordData.getClass();
        String str = bid + "_v" + newVersion + "_patch";
        if (!m162504d(str)) {
            pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "Patch download task already in progress: ".concat(str), null, 0, recordData, 6, null);
            return null;
        }
        try {
            FepPackageContext fepPackageContext = FepPackageContext.INSTANCE;
            File fileM109799f = chi.m109799f(fepPackageContext.m17684k(), bid, null, 2, null);
            if (fileM109799f.exists()) {
                fileM109799f.delete();
            }
            if (!rk20.C19859a.m181777a(fepPackageContext.m17690q().getNetwork(), patchUrl, fileM109799f, null, MapsKt.mapOf(TuplesKt.m88129a("Content-Type", "application/zip")), 4, null)) {
                fileM109799f.delete();
                pgi.m172234d(fepPackageContext.m17685l(), -3004, "Download failed", null, recordData, 4, null);
                m162505e(str);
                return null;
            }
            if (fileM109799f.length() > 0 && fileM109799f.exists()) {
                pgi.m172235f(fepPackageContext.m17685l(), "Patch download success: " + patchUrl + " -> " + fileM109799f.getAbsolutePath(), recordData, 0, 4, null);
                m162505e(str);
                return fileM109799f.getAbsolutePath();
            }
            pgi.m172234d(fepPackageContext.m17685l(), -3004, "Download failed", null, recordData, 4, null);
            m162505e(str);
            return null;
        } catch (Exception e) {
            FepPackageContext.INSTANCE.m17685l().m172241c(-3004, "Download failed: " + e.getMessage(), e, recordData);
            m162505e(str);
            return null;
        }
    }
}

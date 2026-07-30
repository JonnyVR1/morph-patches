package tv.danmaku.ijk.media.streamer;

import android.content.IntentFilter;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MediaReportLogManager {

    /* JADX INFO: renamed from: c */
    static MediaReportLogManager f12073c;

    /* JADX INFO: renamed from: a */
    private boolean f12074a = false;

    /* JADX INFO: renamed from: b */
    LogUploadCallBack f12075b;

    public interface LogUploadCallBack {
        /* JADX INFO: renamed from: a */
        void m10850a(String str, String str2);
    }

    public static class ReportLog implements Serializable {
        String body;

        /* JADX INFO: renamed from: id */
        UUID f12076id;
        int provider;
        String publisherType;
        String roomId;
        String sessionTime;
        String type;

        public ReportLog(UUID uuid, String str, String str2, String str3, String str4, int i, String str5) {
            this.f12076id = uuid;
            this.type = str;
            this.roomId = str2;
            this.sessionTime = str3;
            this.body = str4;
            this.provider = i;
            this.publisherType = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m10843a(long j, long j2) {
        if (j2 == 0) {
            return 0L;
        }
        return Math.max(0L, j - j2);
    }

    /* JADX INFO: renamed from: b */
    public static MediaReportLogManager m10844b() {
        if (f12073c == null) {
            synchronized (MediaReportLogManager.class) {
                try {
                    if (f12073c == null) {
                        MediaReportLogManager mediaReportLogManager = new MediaReportLogManager();
                        f12073c = mediaReportLogManager;
                        mediaReportLogManager.m10845c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12073c;
    }

    /* JADX INFO: renamed from: c */
    public void m10845c() {
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* JADX INFO: renamed from: d */
    public String m10846d(Object... objArr) {
        StringBuilder sb = new StringBuilder("{");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                sb.append(objArr[i]);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public void m10847e() {
        this.f12075b = null;
    }

    /* JADX INFO: renamed from: f */
    public void m10848f(String str, String str2, String str3, String str4, int i, String str5) {
        LogUploadCallBack logUploadCallBack = this.f12075b;
        if (logUploadCallBack != null) {
            logUploadCallBack.m10850a(str, str4);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f12075b = null;
    }

    /* JADX INFO: renamed from: g */
    public void m10849g(LogUploadCallBack logUploadCallBack) {
        this.f12075b = logUploadCallBack;
    }
}

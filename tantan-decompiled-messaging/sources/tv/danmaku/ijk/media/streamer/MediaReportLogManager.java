package tv.danmaku.ijk.media.streamer;

import android.content.IntentFilter;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class MediaReportLogManager {

    /* JADX INFO: renamed from: c */
    static MediaReportLogManager f208448c;

    /* JADX INFO: renamed from: a */
    private boolean f208449a = false;

    /* JADX INFO: renamed from: b */
    LogUploadCallBack f208450b;

    public interface LogUploadCallBack {
        /* JADX INFO: renamed from: a */
        void m222379a(String str, String str2);
    }

    public static class ReportLog implements Serializable {
        String body;

        /* JADX INFO: renamed from: id */
        UUID f208451id;
        int provider;
        String publisherType;
        String roomId;
        String sessionTime;
        String type;

        public ReportLog(UUID uuid, String str, String str2, String str3, String str4, int i, String str5) {
            this.f208451id = uuid;
            this.type = str;
            this.roomId = str2;
            this.sessionTime = str3;
            this.body = str4;
            this.provider = i;
            this.publisherType = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m222372a(long j, long j2) {
        if (j2 == 0) {
            return 0L;
        }
        return Math.max(0L, j - j2);
    }

    /* JADX INFO: renamed from: b */
    public static MediaReportLogManager m222373b() {
        if (f208448c == null) {
            synchronized (MediaReportLogManager.class) {
                try {
                    if (f208448c == null) {
                        MediaReportLogManager mediaReportLogManager = new MediaReportLogManager();
                        f208448c = mediaReportLogManager;
                        mediaReportLogManager.m222374c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f208448c;
    }

    /* JADX INFO: renamed from: c */
    public void m222374c() {
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* JADX INFO: renamed from: d */
    public String m222375d(Object... objArr) {
        StringBuilder sb = new StringBuilder("{");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public void m222376e() {
        this.f208450b = null;
    }

    /* JADX INFO: renamed from: f */
    public void m222377f(String str, String str2, String str3, String str4, int i, String str5) {
        LogUploadCallBack logUploadCallBack = this.f208450b;
        if (logUploadCallBack != null) {
            logUploadCallBack.m222379a(str, str4);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f208450b = null;
    }

    /* JADX INFO: renamed from: g */
    public void m222378g(LogUploadCallBack logUploadCallBack) {
        this.f208450b = logUploadCallBack;
    }
}

package tv.danmaku.ijk.media.streamer;

import android.content.IntentFilter;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class MediaReportLogManager {

    /* JADX INFO: renamed from: c */
    static MediaReportLogManager f209370c;

    /* JADX INFO: renamed from: a */
    private boolean f209371a = false;

    /* JADX INFO: renamed from: b */
    LogUploadCallBack f209372b;

    public interface LogUploadCallBack {
        /* JADX INFO: renamed from: a */
        void m223625a(String str, String str2);
    }

    public static class ReportLog implements Serializable {
        String body;

        /* JADX INFO: renamed from: id */
        UUID f209373id;
        int provider;
        String publisherType;
        String roomId;
        String sessionTime;
        String type;

        public ReportLog(UUID uuid, String str, String str2, String str3, String str4, int i, String str5) {
            this.f209373id = uuid;
            this.type = str;
            this.roomId = str2;
            this.sessionTime = str3;
            this.body = str4;
            this.provider = i;
            this.publisherType = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m223618a(long j, long j2) {
        if (j2 == 0) {
            return 0L;
        }
        return Math.max(0L, j - j2);
    }

    /* JADX INFO: renamed from: b */
    public static MediaReportLogManager m223619b() {
        if (f209370c == null) {
            synchronized (MediaReportLogManager.class) {
                try {
                    if (f209370c == null) {
                        MediaReportLogManager mediaReportLogManager = new MediaReportLogManager();
                        f209370c = mediaReportLogManager;
                        mediaReportLogManager.m223620c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f209370c;
    }

    /* JADX INFO: renamed from: c */
    public void m223620c() {
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* JADX INFO: renamed from: d */
    public String m223621d(Object... objArr) {
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
    public void m223622e() {
        this.f209372b = null;
    }

    /* JADX INFO: renamed from: f */
    public void m223623f(String str, String str2, String str3, String str4, int i, String str5) {
        LogUploadCallBack logUploadCallBack = this.f209372b;
        if (logUploadCallBack != null) {
            logUploadCallBack.m223625a(str, str4);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.f209372b = null;
    }

    /* JADX INFO: renamed from: g */
    public void m223624g(LogUploadCallBack logUploadCallBack) {
        this.f209372b = logUploadCallBack;
    }
}

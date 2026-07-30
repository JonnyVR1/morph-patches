package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;
import java.util.List;
import p153l.bmk0;
import p153l.f250;
import p153l.g2e0;
import p153l.g9e;
import p153l.kyv;
import p153l.w11;
import p153l.y9e;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String ACTION_PAUSE_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final String ACTION_REMOVE_DOWNLOAD = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String ACTION_RESUME_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final String ACTION_SET_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final String ACTION_SET_STOP_REASON = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final String KEY_CONTENT_ID = "content_id";
    public static final String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_REQUIREMENTS = "requirements";
    public static final String KEY_STOP_REASON = "stop_reason";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, C1947a> downloadManagerHelpers = new HashMap<>();

    @StringRes
    private final int channelDescriptionResourceId;

    @Nullable
    private final String channelId;

    @StringRes
    private final int channelNameResourceId;
    private C1947a downloadManagerHelper;

    @Nullable
    private final C1948b foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadService$a */
    public static final class C1947a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public DownloadService f8239a;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ y9e m10848a(C1947a c1947a) {
            c1947a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void m10849b(DownloadService downloadService) {
            w11.m204371g(this.f8239a == null);
            this.f8239a = downloadService;
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void m10850c(DownloadService downloadService) {
            w11.m204371g(this.f8239a == downloadService);
            this.f8239a = null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m10851d() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadService$b */
    public final class C1948b {

        /* JADX INFO: renamed from: a */
        public final int f8240a;

        /* JADX INFO: renamed from: b */
        public final long f8241b;

        /* JADX INFO: renamed from: c */
        public final Handler f8242c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d */
        public boolean f8243d;

        /* JADX INFO: renamed from: e */
        public boolean f8244e;

        public C1948b(int i, long j) {
            this.f8240a = i;
            this.f8241b = j;
        }

        /* JADX INFO: renamed from: a */
        public void m10852a() {
            if (this.f8244e) {
                m10856e();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m10853b() {
            if (this.f8244e) {
                return;
            }
            m10856e();
        }

        /* JADX INFO: renamed from: c */
        public void m10854c() {
            this.f8243d = true;
            m10856e();
        }

        /* JADX INFO: renamed from: d */
        public void m10855d() {
            this.f8243d = false;
            this.f8242c.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: renamed from: e */
        public final void m10856e() {
            C1947a.m10848a((C1947a) w11.m204369e(DownloadService.this.downloadManagerHelper));
            throw null;
        }
    }

    public DownloadService(int i, long j, @Nullable String str, @StringRes int i2, @StringRes int i3) {
        if (i == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new C1948b(i, j);
        this.channelId = str;
        this.channelNameResourceId = i2;
        this.channelDescriptionResourceId = i3;
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i);
    }

    public static Intent buildPauseDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z);
    }

    public static Intent buildRemoveAllDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
    }

    public static Intent buildRemoveDownloadIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra(KEY_CONTENT_ID, str);
    }

    public static Intent buildResumeDownloadsIntent(Context context, Class<? extends DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z);
    }

    public static Intent buildSetRequirementsIntent(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static Intent buildSetStopReasonIntent(Context context, Class<? extends DownloadService> cls, @Nullable String str, int i, boolean z) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra(KEY_CONTENT_ID, str).putExtra(KEY_STOP_REASON, i);
    }

    public static void clearDownloadManagerHelpers() {
        downloadManagerHelpers.clear();
    }

    private static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        return getIntent(context, cls, str).putExtra(KEY_FOREGROUND, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsStartedService(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadChanged(g9e g9eVar) {
        if (this.foregroundNotificationUpdater != null) {
            boolean zNeedsStartedService = needsStartedService(g9eVar.f102839a);
            C1948b c1948b = this.foregroundNotificationUpdater;
            if (zNeedsStartedService) {
                c1948b.m10854c();
            } else {
                c1948b.m10852a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved() {
        C1948b c1948b = this.foregroundNotificationUpdater;
        if (c1948b != null) {
            c1948b.m10852a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(List<g9e> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                if (needsStartedService(list.get(i).f102839a)) {
                    this.foregroundNotificationUpdater.m10854c();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdle() {
        C1948b c1948b = this.foregroundNotificationUpdater;
        if (c1948b != null) {
            c1948b.m10855d();
        }
        if (((C1947a) w11.m204369e(this.downloadManagerHelper)).m10851d()) {
            if (bmk0.f77313a >= 28 || !this.taskRemoved) {
                this.isStopped |= stopSelfResult(this.lastStartId);
            } else {
                stopSelf();
                this.isStopped = true;
            }
        }
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
    }

    public static void sendPauseDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildPauseDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveAllDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
    }

    public static void sendRemoveDownload(Context context, Class<? extends DownloadService> cls, String str, boolean z) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z), z);
    }

    public static void sendResumeDownloads(Context context, Class<? extends DownloadService> cls, boolean z) {
        startService(context, buildResumeDownloadsIntent(context, cls, z), z);
    }

    public static void sendSetRequirements(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
    }

    public static void sendSetStopReason(Context context, Class<? extends DownloadService> cls, @Nullable String str, int i, boolean z) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        bmk0.m105128d1(context, getIntent(context, cls, ACTION_INIT, true));
    }

    private static void startService(Context context, Intent intent, boolean z) {
        if (z) {
            bmk0.m105128d1(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public abstract y9e getDownloadManager();

    public abstract Notification getForegroundNotification(List<g9e> list, int i);

    @Nullable
    public abstract g2e0 getScheduler();

    public final void invalidateForegroundNotification() {
        C1948b c1948b = this.foregroundNotificationUpdater;
        if (c1948b == null || this.isDestroyed) {
            return;
        }
        c1948b.m10852a();
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.channelId;
        if (str != null) {
            f250.m123601a(this, str, this.channelNameResourceId, this.channelDescriptionResourceId, 2);
        }
        C1947a c1947a = downloadManagerHelpers.get(getClass());
        if (c1947a != null) {
            this.downloadManagerHelper = c1947a;
            c1947a.m10849b(this);
            return;
        }
        boolean z = this.foregroundNotificationUpdater != null;
        boolean z2 = bmk0.f77313a < 31;
        if (z && z2) {
            getScheduler();
        }
        getDownloadManager();
        throw null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        ((C1947a) w11.m204369e(this.downloadManagerHelper)).m10850c(this);
        C1948b c1948b = this.foregroundNotificationUpdater;
        if (c1948b != null) {
            c1948b.m10855d();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        C1948b c1948b;
        this.lastStartId = i2;
        this.taskRemoved = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra(KEY_CONTENT_ID);
            this.startedInForeground |= intent.getBooleanExtra(KEY_FOREGROUND, false) || ACTION_RESTART.equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = ACTION_INIT;
        }
        C1947a.m10848a((C1947a) w11.m204369e(this.downloadManagerHelper));
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                if (((DownloadRequest) ((Intent) w11.m204369e(intent)).getParcelableExtra(KEY_DOWNLOAD_REQUEST)) != null) {
                    intent.getIntExtra(KEY_STOP_REASON, 0);
                    throw null;
                }
                kyv.m152145c(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                if (((Requirements) ((Intent) w11.m204369e(intent)).getParcelableExtra(KEY_REQUIREMENTS)) != null) {
                    throw null;
                }
                kyv.m152145c(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) w11.m204369e(intent)).hasExtra(KEY_STOP_REASON)) {
                    kyv.m152145c(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra(KEY_STOP_REASON, 0);
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    throw null;
                }
                kyv.m152145c(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            default:
                kyv.m152145c(TAG, "Ignored unrecognized action: ".concat(action));
                break;
        }
        if (bmk0.f77313a >= 26 && this.startedInForeground && (c1948b = this.foregroundNotificationUpdater) != null) {
            c1948b.m10853b();
        }
        this.isStopped = false;
        throw null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.taskRemoved = true;
    }

    public static void sendAddDownload(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent getIntent(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public static Intent buildAddDownloadIntent(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
    }

    public DownloadService(int i, long j) {
        this(i, j, null, 0, 0);
    }

    public DownloadService(int i) {
        this(i, 1000L);
    }
}

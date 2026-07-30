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
import p149l.cud0;
import p149l.jwv;
import p149l.n8e;
import p149l.p11;
import p149l.qt40;
import p149l.r7e;
import p149l.vck0;

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
    private static final HashMap<Class<? extends DownloadService>, C1924a> downloadManagerHelpers = new HashMap<>();

    @StringRes
    private final int channelDescriptionResourceId;

    @Nullable
    private final String channelId;

    @StringRes
    private final int channelNameResourceId;
    private C1924a downloadManagerHelper;

    @Nullable
    private final C1925b foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadService$a */
    public static final class C1924a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public DownloadService f8202a;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ n8e m10794a(C1924a c1924a) {
            c1924a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void m10795b(DownloadService downloadService) {
            p11.m167013g(this.f8202a == null);
            this.f8202a = downloadService;
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void m10796c(DownloadService downloadService) {
            p11.m167013g(this.f8202a == downloadService);
            this.f8202a = null;
        }

        /* JADX INFO: renamed from: d */
        public boolean m10797d() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadService$b */
    public final class C1925b {

        /* JADX INFO: renamed from: a */
        public final int f8203a;

        /* JADX INFO: renamed from: b */
        public final long f8204b;

        /* JADX INFO: renamed from: c */
        public final Handler f8205c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d */
        public boolean f8206d;

        /* JADX INFO: renamed from: e */
        public boolean f8207e;

        public C1925b(int i, long j) {
            this.f8203a = i;
            this.f8204b = j;
        }

        /* JADX INFO: renamed from: a */
        public void m10798a() {
            if (this.f8207e) {
                m10802e();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m10799b() {
            if (this.f8207e) {
                return;
            }
            m10802e();
        }

        /* JADX INFO: renamed from: c */
        public void m10800c() {
            this.f8206d = true;
            m10802e();
        }

        /* JADX INFO: renamed from: d */
        public void m10801d() {
            this.f8206d = false;
            this.f8205c.removeCallbacksAndMessages(null);
        }

        /* JADX INFO: renamed from: e */
        public final void m10802e() {
            C1924a.m10794a((C1924a) p11.m167011e(DownloadService.this.downloadManagerHelper));
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
        this.foregroundNotificationUpdater = new C1925b(i, j);
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
    public void notifyDownloadChanged(r7e r7eVar) {
        if (this.foregroundNotificationUpdater != null) {
            boolean zNeedsStartedService = needsStartedService(r7eVar.f158023a);
            C1925b c1925b = this.foregroundNotificationUpdater;
            if (zNeedsStartedService) {
                c1925b.m10800c();
            } else {
                c1925b.m10798a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved() {
        C1925b c1925b = this.foregroundNotificationUpdater;
        if (c1925b != null) {
            c1925b.m10798a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(List<r7e> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                if (needsStartedService(list.get(i).f158023a)) {
                    this.foregroundNotificationUpdater.m10800c();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdle() {
        C1925b c1925b = this.foregroundNotificationUpdater;
        if (c1925b != null) {
            c1925b.m10801d();
        }
        if (((C1924a) p11.m167011e(this.downloadManagerHelper)).m10797d()) {
            if (vck0.f180948a >= 28 || !this.taskRemoved) {
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
        vck0.m197850d1(context, getIntent(context, cls, ACTION_INIT, true));
    }

    private static void startService(Context context, Intent intent, boolean z) {
        if (z) {
            vck0.m197850d1(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public abstract n8e getDownloadManager();

    public abstract Notification getForegroundNotification(List<r7e> list, int i);

    @Nullable
    public abstract cud0 getScheduler();

    public final void invalidateForegroundNotification() {
        C1925b c1925b = this.foregroundNotificationUpdater;
        if (c1925b == null || this.isDestroyed) {
            return;
        }
        c1925b.m10798a();
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
            qt40.m176389a(this, str, this.channelNameResourceId, this.channelDescriptionResourceId, 2);
        }
        C1924a c1924a = downloadManagerHelpers.get(getClass());
        if (c1924a != null) {
            this.downloadManagerHelper = c1924a;
            c1924a.m10795b(this);
            return;
        }
        boolean z = this.foregroundNotificationUpdater != null;
        boolean z2 = vck0.f180948a < 31;
        if (z && z2) {
            getScheduler();
        }
        getDownloadManager();
        throw null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        ((C1924a) p11.m167011e(this.downloadManagerHelper)).m10796c(this);
        C1925b c1925b = this.foregroundNotificationUpdater;
        if (c1925b != null) {
            c1925b.m10801d();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        C1925b c1925b;
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
        C1924a.m10794a((C1924a) p11.m167011e(this.downloadManagerHelper));
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                if (((DownloadRequest) ((Intent) p11.m167011e(intent)).getParcelableExtra(KEY_DOWNLOAD_REQUEST)) != null) {
                    intent.getIntExtra(KEY_STOP_REASON, 0);
                    throw null;
                }
                jwv.m143683c(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
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
                if (((Requirements) ((Intent) p11.m167011e(intent)).getParcelableExtra(KEY_REQUIREMENTS)) != null) {
                    throw null;
                }
                jwv.m143683c(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) p11.m167011e(intent)).hasExtra(KEY_STOP_REASON)) {
                    jwv.m143683c(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
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
                jwv.m143683c(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            default:
                jwv.m143683c(TAG, "Ignored unrecognized action: ".concat(action));
                break;
        }
        if (vck0.f180948a >= 26 && this.startedInForeground && (c1925b = this.foregroundNotificationUpdater) != null) {
            c1925b.m10799b();
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

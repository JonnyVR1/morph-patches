package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import p149l.abj0;
import p149l.ii5;
import p149l.nr40;
import p149l.pp40;
import p149l.qkq0;
import p149l.u4m;
import p149l.vp40;
import p149l.vsi0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private NotificationManager mNotificationManager;
    int mVerifiedUid = -1;
    private final u4m.AbstractBinderC20354a mBinder = new BinderC0188a();

    /* JADX INFO: renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    public class BinderC0188a extends u4m.AbstractBinderC20354a {
        public BinderC0188a() {
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: A7 */
        public void mo824A7(Bundle bundle) {
            m827O();
            C0189a.b bVarM834a = C0189a.b.m834a(bundle);
            TrustedWebActivityService.this.onCancelNotification(bVarM834a.f947a, bVarM834a.f948b);
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: D6 */
        public Bundle mo825D6() {
            m827O();
            return new C0189a.a(TrustedWebActivityService.this.onGetActiveNotifications()).m833a();
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: L1 */
        public Bundle mo826L1(Bundle bundle) {
            m827O();
            C0189a.d dVarM836a = C0189a.d.m836a(bundle);
            return new C0189a.e(TrustedWebActivityService.this.onNotifyNotificationWithChannel(dVarM836a.f950a, dVarM836a.f951b, dVarM836a.f952c, dVarM836a.f953d)).m837a();
        }

        /* JADX INFO: renamed from: O */
        public final void m827O() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i = trustedWebActivityService.mVerifiedUid;
            if (i != -1) {
                if (i != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.getTokenStore();
                throw null;
            }
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: g5 */
        public Bundle mo828g5(String str, Bundle bundle, IBinder iBinder) {
            m827O();
            return TrustedWebActivityService.this.onExtraCommand(str, bundle, abj0.m95667a(iBinder));
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: s7 */
        public int mo829s7() {
            m827O();
            return TrustedWebActivityService.this.onGetSmallIconId();
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: u7 */
        public Bundle mo830u7(Bundle bundle) {
            m827O();
            return new C0189a.e(TrustedWebActivityService.this.onAreNotificationsEnabled(C0189a.c.m835a(bundle).f949a)).m837a();
        }

        @Override // p149l.u4m
        /* JADX INFO: renamed from: v5 */
        public Bundle mo831v5() {
            m827O();
            return TrustedWebActivityService.this.onGetSmallIconBitmap();
        }
    }

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void ensureOnCreateCalled() {
        if (this.mNotificationManager != null) {
            return;
        }
        qkq0.m175383a("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    @NonNull
    @BinderThread
    public abstract vsi0 getTokenStore();

    @BinderThread
    public boolean onAreNotificationsEnabled(@NonNull String str) {
        ensureOnCreateCalled();
        if (!nr40.m160709e(this).m160712a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return vp40.m199222b(this.mNotificationManager, channelNameToId(str));
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public final IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    @BinderThread
    public void onCancelNotification(@NonNull String str, int i) {
        ensureOnCreateCalled();
        this.mNotificationManager.cancel(str, i);
    }

    @Override // android.app.Service
    @CallSuper
    @MainThread
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (NotificationManager) getSystemService("notification");
    }

    @Nullable
    @BinderThread
    public Bundle onExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable abj0 abj0Var) {
        return null;
    }

    @NonNull
    @BinderThread
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return pp40.m170707a(this.mNotificationManager);
    }

    @NonNull
    @BinderThread
    public Bundle onGetSmallIconBitmap() {
        int iOnGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (iOnGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, BitmapFactory.decodeResource(getResources(), iOnGetSmallIconId));
        return bundle;
    }

    @BinderThread
    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @BinderThread
    public boolean onNotifyNotificationWithChannel(@NonNull String str, int i, @NonNull Notification notification, @NonNull String str2) {
        ensureOnCreateCalled();
        if (!nr40.m160709e(this).m160712a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strChannelNameToId = channelNameToId(str2);
            notification = vp40.m199221a(this, this.mNotificationManager, notification, strChannelNameToId, str2);
            if (!vp40.m199222b(this.mNotificationManager, strChannelNameToId)) {
                return false;
            }
        }
        ii5.m136338h(this.mNotificationManager, str, i, notification);
        return true;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@Nullable Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }
}

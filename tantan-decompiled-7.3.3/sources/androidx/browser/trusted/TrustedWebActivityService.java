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
import p153l.c050;
import p153l.dy40;
import p153l.ekj0;
import p153l.jj5;
import p153l.jy40;
import p153l.k7m;
import p153l.wtq0;
import p153l.y1j0;

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
    private final k7m.AbstractBinderC18114a mBinder = new BinderC0189a();

    /* JADX INFO: renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    public class BinderC0189a extends k7m.AbstractBinderC18114a {
        public BinderC0189a() {
        }

        @Override // p153l.k7m
        /* JADX INFO: renamed from: A7 */
        public void mo825A7(Bundle bundle) {
            m828O();
            C0190a.b bVarM835a = C0190a.b.m835a(bundle);
            TrustedWebActivityService.this.onCancelNotification(bVarM835a.f947a, bVarM835a.f948b);
        }

        @Override // p153l.k7m
        /* JADX INFO: renamed from: D6 */
        public Bundle mo826D6() {
            m828O();
            return new C0190a.a(TrustedWebActivityService.this.onGetActiveNotifications()).m834a();
        }

        @Override // p153l.k7m
        /* JADX INFO: renamed from: L1 */
        public Bundle mo827L1(Bundle bundle) {
            m828O();
            C0190a.d dVarM837a = C0190a.d.m837a(bundle);
            return new C0190a.e(TrustedWebActivityService.this.onNotifyNotificationWithChannel(dVarM837a.f950a, dVarM837a.f951b, dVarM837a.f952c, dVarM837a.f953d)).m838a();
        }

        /* JADX INFO: renamed from: O */
        public final void m828O() {
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

        @Override // p153l.k7m
        /* JADX INFO: renamed from: g5 */
        public Bundle mo829g5(String str, Bundle bundle, IBinder iBinder) {
            m828O();
            return TrustedWebActivityService.this.onExtraCommand(str, bundle, ekj0.m121050a(iBinder));
        }

        @Override // p153l.k7m
        /* JADX INFO: renamed from: s7 */
        public int mo830s7() {
            m828O();
            return TrustedWebActivityService.this.onGetSmallIconId();
        }

        @Override // p153l.k7m
        /* JADX INFO: renamed from: u7 */
        public Bundle mo831u7(Bundle bundle) {
            m828O();
            return new C0190a.e(TrustedWebActivityService.this.onAreNotificationsEnabled(C0190a.c.m836a(bundle).f949a)).m838a();
        }

        @Override // p153l.k7m
        /* JADX INFO: renamed from: v5 */
        public Bundle mo832v5() {
            m828O();
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
        wtq0.m207906a("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    @NonNull
    @BinderThread
    public abstract y1j0 getTokenStore();

    @BinderThread
    public boolean onAreNotificationsEnabled(@NonNull String str) {
        ensureOnCreateCalled();
        if (!c050.m107319e(this).m107322a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return jy40.m147466b(this.mNotificationManager, channelNameToId(str));
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
    public Bundle onExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable ekj0 ekj0Var) {
        return null;
    }

    @NonNull
    @BinderThread
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] onGetActiveNotifications() {
        ensureOnCreateCalled();
        return dy40.m118617a(this.mNotificationManager);
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
        if (!c050.m107319e(this).m107322a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strChannelNameToId = channelNameToId(str2);
            notification = jy40.m147465a(this, this.mNotificationManager, notification, strChannelNameToId, str2);
            if (!jy40.m147466b(this.mNotificationManager, strChannelNameToId)) {
                return false;
            }
        }
        jj5.m145014h(this.mNotificationManager, str, i, notification);
        return true;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@Nullable Intent intent) {
        this.mVerifiedUid = -1;
        return super.onUnbind(intent);
    }
}

package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsService;
import java.util.List;
import java.util.NoSuchElementException;
import p149l.hgf0;
import p149l.ipl;
import p149l.jpl;
import p149l.lyb;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public static final String ACTION_CUSTOM_TABS_CONNECTION = "android.support.customtabs.action.CustomTabsService";
    public static final String CATEGORY_COLOR_SCHEME_CUSTOMIZATION = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String CATEGORY_NAVBAR_COLOR_CUSTOMIZATION = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String CATEGORY_TRUSTED_WEB_ACTIVITY_IMMERSIVE_MODE = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String CATEGORY_WEB_SHARE_TARGET_V2 = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final int FILE_PURPOSE_TRUSTED_WEB_ACTIVITY_SPLASH_IMAGE = 1;
    public static final String KEY_SUCCESS = "androidx.browser.customtabs.SUCCESS";
    public static final String KEY_URL = "android.support.customtabs.otherurls.URL";
    public static final int RELATION_HANDLE_ALL_URLS = 2;
    public static final int RELATION_USE_AS_ORIGIN = 1;
    public static final int RESULT_FAILURE_DISALLOWED = -1;
    public static final int RESULT_FAILURE_MESSAGING_ERROR = -3;
    public static final int RESULT_FAILURE_REMOTE_ERROR = -2;
    public static final int RESULT_SUCCESS = 0;
    public static final String TRUSTED_WEB_ACTIVITY_CATEGORY = "androidx.browser.trusted.category.TrustedWebActivities";
    final hgf0<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new hgf0<>();
    private jpl.AbstractBinderC17841a mBinder = new BinderC0186a();

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class BinderC0186a extends jpl.AbstractBinderC17841a {
        public BinderC0186a() {
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: B1 */
        public boolean mo809B1(@NonNull ipl iplVar, @NonNull Uri uri, int i, @Nullable Bundle bundle) {
            return CustomTabsService.this.receiveFile(new lyb(iplVar, m811P3(bundle)), uri, i, bundle);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: C0 */
        public boolean mo810C0(@NonNull ipl iplVar) {
            return m818m4(iplVar, null);
        }

        @Nullable
        /* JADX INFO: renamed from: P3 */
        public final PendingIntent m811P3(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: Q3 */
        public boolean mo812Q3(@NonNull ipl iplVar, @Nullable Bundle bundle) {
            return m818m4(iplVar, m811P3(bundle));
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: T2 */
        public int mo813T2(@NonNull ipl iplVar, @NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.postMessage(new lyb(iplVar, m811P3(bundle)), str, bundle);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: U5 */
        public boolean mo814U5(@NonNull ipl iplVar, @Nullable Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new lyb(iplVar, m811P3(bundle)), bundle);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: V2 */
        public boolean mo815V2(@NonNull ipl iplVar, @NonNull Uri uri, @NonNull Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new lyb(iplVar, m811P3(bundle)), uri);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: Z4 */
        public Bundle mo816Z4(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: a4 */
        public boolean mo817a4(@NonNull ipl iplVar, int i, @NonNull Uri uri, @Nullable Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new lyb(iplVar, m811P3(bundle)), i, uri, bundle);
        }

        /* JADX INFO: renamed from: m4 */
        public final boolean m818m4(@NonNull ipl iplVar, @Nullable PendingIntent pendingIntent) {
            final lyb lybVar = new lyb(iplVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: l.iyb
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.this.cleanUpSession(lybVar);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    iplVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(iplVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(lybVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: r3 */
        public boolean mo819r3(long j) {
            return CustomTabsService.this.warmup(j);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: u2 */
        public boolean mo820u2(@Nullable ipl iplVar, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new lyb(iplVar, m811P3(bundle)), uri, bundle, list);
        }

        @Override // p149l.jpl
        /* JADX INFO: renamed from: z7 */
        public boolean mo821z7(@NonNull ipl iplVar, @NonNull Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new lyb(iplVar, null), uri);
        }
    }

    public boolean cleanUpSession(@NonNull lyb lybVar) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder iBinderM152230a = lybVar.m152230a();
                    if (iBinderM152230a == null) {
                        return false;
                    }
                    iBinderM152230a.unlinkToDeath(this.mDeathRecipientMap.get(iBinderM152230a), 0);
                    this.mDeathRecipientMap.remove(iBinderM152230a);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @Nullable
    public abstract Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle);

    public abstract boolean mayLaunchUrl(@NonNull lyb lybVar, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    public abstract boolean newSession(@NonNull lyb lybVar);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(@NonNull lyb lybVar, @NonNull String str, @Nullable Bundle bundle);

    public abstract boolean receiveFile(@NonNull lyb lybVar, @NonNull Uri uri, int i, @Nullable Bundle bundle);

    public abstract boolean requestPostMessageChannel(@NonNull lyb lybVar, @NonNull Uri uri);

    public abstract boolean updateVisuals(@NonNull lyb lybVar, @Nullable Bundle bundle);

    public abstract boolean validateRelationship(@NonNull lyb lybVar, int i, @NonNull Uri uri, @Nullable Bundle bundle);

    public abstract boolean warmup(long j);
}

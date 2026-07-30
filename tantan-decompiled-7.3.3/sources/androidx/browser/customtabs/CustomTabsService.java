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
import p153l.oof0;
import p153l.vrl;
import p153l.wrl;
import p153l.zzb;

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
    final oof0<IBinder, IBinder.DeathRecipient> mDeathRecipientMap = new oof0<>();
    private wrl.AbstractBinderC21172a mBinder = new BinderC0187a();

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class BinderC0187a extends wrl.AbstractBinderC21172a {
        public BinderC0187a() {
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: B1 */
        public boolean mo810B1(@NonNull vrl vrlVar, @NonNull Uri uri, int i, @Nullable Bundle bundle) {
            return CustomTabsService.this.receiveFile(new zzb(vrlVar, m812P3(bundle)), uri, i, bundle);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: C0 */
        public boolean mo811C0(@NonNull vrl vrlVar) {
            return m819m4(vrlVar, null);
        }

        @Nullable
        /* JADX INFO: renamed from: P3 */
        public final PendingIntent m812P3(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: Q3 */
        public boolean mo813Q3(@NonNull vrl vrlVar, @Nullable Bundle bundle) {
            return m819m4(vrlVar, m812P3(bundle));
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: T2 */
        public int mo814T2(@NonNull vrl vrlVar, @NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.postMessage(new zzb(vrlVar, m812P3(bundle)), str, bundle);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: U5 */
        public boolean mo815U5(@NonNull vrl vrlVar, @Nullable Bundle bundle) {
            return CustomTabsService.this.updateVisuals(new zzb(vrlVar, m812P3(bundle)), bundle);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: V2 */
        public boolean mo816V2(@NonNull vrl vrlVar, @NonNull Uri uri, @NonNull Bundle bundle) {
            return CustomTabsService.this.requestPostMessageChannel(new zzb(vrlVar, m812P3(bundle)), uri);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: Z4 */
        public Bundle mo817Z4(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.extraCommand(str, bundle);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: a4 */
        public boolean mo818a4(@NonNull vrl vrlVar, int i, @NonNull Uri uri, @Nullable Bundle bundle) {
            return CustomTabsService.this.validateRelationship(new zzb(vrlVar, m812P3(bundle)), i, uri, bundle);
        }

        /* JADX INFO: renamed from: m4 */
        public final boolean m819m4(@NonNull vrl vrlVar, @Nullable PendingIntent pendingIntent) {
            final zzb zzbVar = new zzb(vrlVar, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: l.wzb
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.this.cleanUpSession(zzbVar);
                    }
                };
                synchronized (CustomTabsService.this.mDeathRecipientMap) {
                    vrlVar.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.mDeathRecipientMap.put(vrlVar.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.newSession(zzbVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: r3 */
        public boolean mo820r3(long j) {
            return CustomTabsService.this.warmup(j);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: u2 */
        public boolean mo821u2(@Nullable vrl vrlVar, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return CustomTabsService.this.mayLaunchUrl(new zzb(vrlVar, m812P3(bundle)), uri, bundle, list);
        }

        @Override // p153l.wrl
        /* JADX INFO: renamed from: z7 */
        public boolean mo822z7(@NonNull vrl vrlVar, @NonNull Uri uri) {
            return CustomTabsService.this.requestPostMessageChannel(new zzb(vrlVar, null), uri);
        }
    }

    public boolean cleanUpSession(@NonNull zzb zzbVar) {
        try {
            synchronized (this.mDeathRecipientMap) {
                try {
                    IBinder iBinderM222242a = zzbVar.m222242a();
                    if (iBinderM222242a == null) {
                        return false;
                    }
                    iBinderM222242a.unlinkToDeath(this.mDeathRecipientMap.get(iBinderM222242a), 0);
                    this.mDeathRecipientMap.remove(iBinderM222242a);
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

    public abstract boolean mayLaunchUrl(@NonNull zzb zzbVar, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    public abstract boolean newSession(@NonNull zzb zzbVar);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    public abstract int postMessage(@NonNull zzb zzbVar, @NonNull String str, @Nullable Bundle bundle);

    public abstract boolean receiveFile(@NonNull zzb zzbVar, @NonNull Uri uri, int i, @Nullable Bundle bundle);

    public abstract boolean requestPostMessageChannel(@NonNull zzb zzbVar, @NonNull Uri uri);

    public abstract boolean updateVisuals(@NonNull zzb zzbVar, @Nullable Bundle bundle);

    public abstract boolean validateRelationship(@NonNull zzb zzbVar, int i, @NonNull Uri uri, @Nullable Bundle bundle);

    public abstract boolean warmup(long j);
}

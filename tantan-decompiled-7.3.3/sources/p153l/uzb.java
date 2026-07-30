package p153l;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsService;

/* JADX INFO: loaded from: classes.dex */
public class uzb {

    /* JADX INFO: renamed from: a */
    public final wrl f181717a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f181718b;

    /* JADX INFO: renamed from: c */
    public final Context f181719c;

    /* JADX INFO: renamed from: l.uzb$b */
    public class BinderC20703b extends vrl.AbstractBinderC20917a {

        /* JADX INFO: renamed from: a */
        public Handler f181721a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tzb f181722b;

        /* JADX INFO: renamed from: l.uzb$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f181724a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f181725b;

            public a(int i, Bundle bundle) {
                this.f181724a = i;
                this.f181725b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC20703b.this.f181722b.mo109944d(this.f181724a, this.f181725b);
            }
        }

        /* JADX INFO: renamed from: l.uzb$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f181727a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f181728b;

            public b(String str, Bundle bundle) {
                this.f181727a = str;
                this.f181728b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC20703b.this.f181722b.mo109941a(this.f181727a, this.f181728b);
            }
        }

        /* JADX INFO: renamed from: l.uzb$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f181730a;

            public c(Bundle bundle) {
                this.f181730a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC20703b.this.f181722b.mo109943c(this.f181730a);
            }
        }

        /* JADX INFO: renamed from: l.uzb$b$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f181732a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f181733b;

            public d(String str, Bundle bundle) {
                this.f181732a = str;
                this.f181733b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC20703b.this.f181722b.mo109945e(this.f181732a, this.f181733b);
            }
        }

        /* JADX INFO: renamed from: l.uzb$b$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f181735a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Uri f181736b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f181737c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Bundle f181738d;

            public e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f181735a = i;
                this.f181736b = uri;
                this.f181737c = z;
                this.f181738d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC20703b.this.f181722b.mo109946f(this.f181735a, this.f181736b, this.f181737c, this.f181738d);
            }
        }

        public BinderC20703b(tzb tzbVar) {
            this.f181722b = tzbVar;
        }

        @Override // p153l.vrl
        /* JADX INFO: renamed from: I5 */
        public void mo198725I5(String str, Bundle bundle) throws RemoteException {
            if (this.f181722b == null) {
                return;
            }
            this.f181721a.post(new b(str, bundle));
        }

        @Override // p153l.vrl
        /* JADX INFO: renamed from: U0 */
        public Bundle mo198726U0(@NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            tzb tzbVar = this.f181722b;
            if (tzbVar == null) {
                return null;
            }
            return tzbVar.mo109942b(str, bundle);
        }

        @Override // p153l.vrl
        /* JADX INFO: renamed from: V3 */
        public void mo198727V3(int i, Bundle bundle) {
            if (this.f181722b == null) {
                return;
            }
            this.f181721a.post(new a(i, bundle));
        }

        @Override // p153l.vrl
        /* JADX INFO: renamed from: X7 */
        public void mo198728X7(String str, Bundle bundle) throws RemoteException {
            if (this.f181722b == null) {
                return;
            }
            this.f181721a.post(new d(str, bundle));
        }

        @Override // p153l.vrl
        /* JADX INFO: renamed from: e8 */
        public void mo198729e8(Bundle bundle) throws RemoteException {
            if (this.f181722b == null) {
                return;
            }
            this.f181721a.post(new c(bundle));
        }

        @Override // p153l.vrl
        /* JADX INFO: renamed from: h8 */
        public void mo198730h8(int i, Uri uri, boolean z, @Nullable Bundle bundle) throws RemoteException {
            if (this.f181722b == null) {
                return;
            }
            this.f181721a.post(new e(i, uri, z, bundle));
        }
    }

    public uzb(wrl wrlVar, ComponentName componentName, Context context) {
        this.f181717a = wrlVar;
        this.f181718b = componentName;
        this.f181719c = context;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m198719a(@NonNull Context context, @Nullable String str, @NonNull xzb xzbVar) {
        xzbVar.m213705b(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, xzbVar, 33);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m198720b(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m198719a(applicationContext, str, new C20702a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final vrl.AbstractBinderC20917a m198721c(@Nullable tzb tzbVar) {
        return new BinderC20703b(tzbVar);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public yzb m198722d(@Nullable tzb tzbVar) {
        return m198723e(tzbVar, null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final yzb m198723e(@Nullable tzb tzbVar, @Nullable PendingIntent pendingIntent) {
        boolean zMo811C0;
        vrl.AbstractBinderC20917a abstractBinderC20917aM198721c = m198721c(tzbVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zMo811C0 = this.f181717a.mo813Q3(abstractBinderC20917aM198721c, bundle);
            } else {
                zMo811C0 = this.f181717a.mo811C0(abstractBinderC20917aM198721c);
            }
            if (zMo811C0) {
                return new yzb(this.f181717a, abstractBinderC20917aM198721c, this.f181718b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m198724f(long j) {
        try {
            return this.f181717a.mo820r3(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.uzb$a */
    public class C20702a extends xzb {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f181720b;

        public C20702a(Context context) {
            this.f181720b = context;
        }

        @Override // p153l.xzb
        /* JADX INFO: renamed from: a */
        public final void mo159617a(@NonNull ComponentName componentName, @NonNull uzb uzbVar) {
            uzbVar.m198724f(0L);
            this.f181720b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

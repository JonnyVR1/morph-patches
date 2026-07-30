package p149l;

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
public class gyb {

    /* JADX INFO: renamed from: a */
    public final jpl f104981a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f104982b;

    /* JADX INFO: renamed from: c */
    public final Context f104983c;

    /* JADX INFO: renamed from: l.gyb$b */
    public class BinderC17201b extends ipl.AbstractBinderC17605a {

        /* JADX INFO: renamed from: a */
        public Handler f104985a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fyb f104986b;

        /* JADX INFO: renamed from: l.gyb$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f104988a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f104989b;

            public a(int i, Bundle bundle) {
                this.f104988a = i;
                this.f104989b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC17201b.this.f104986b.mo123734d(this.f104988a, this.f104989b);
            }
        }

        /* JADX INFO: renamed from: l.gyb$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f104991a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f104992b;

            public b(String str, Bundle bundle) {
                this.f104991a = str;
                this.f104992b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC17201b.this.f104986b.mo123731a(this.f104991a, this.f104992b);
            }
        }

        /* JADX INFO: renamed from: l.gyb$b$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f104994a;

            public c(Bundle bundle) {
                this.f104994a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC17201b.this.f104986b.mo123733c(this.f104994a);
            }
        }

        /* JADX INFO: renamed from: l.gyb$b$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f104996a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f104997b;

            public d(String str, Bundle bundle) {
                this.f104996a = str;
                this.f104997b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC17201b.this.f104986b.mo123735e(this.f104996a, this.f104997b);
            }
        }

        /* JADX INFO: renamed from: l.gyb$b$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f104999a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Uri f105000b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f105001c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Bundle f105002d;

            public e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f104999a = i;
                this.f105000b = uri;
                this.f105001c = z;
                this.f105002d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC17201b.this.f104986b.mo123736f(this.f104999a, this.f105000b, this.f105001c, this.f105002d);
            }
        }

        public BinderC17201b(fyb fybVar) {
            this.f104986b = fybVar;
        }

        @Override // p149l.ipl
        /* JADX INFO: renamed from: I5 */
        public void mo128693I5(String str, Bundle bundle) throws RemoteException {
            if (this.f104986b == null) {
                return;
            }
            this.f104985a.post(new b(str, bundle));
        }

        @Override // p149l.ipl
        /* JADX INFO: renamed from: U0 */
        public Bundle mo128694U0(@NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            fyb fybVar = this.f104986b;
            if (fybVar == null) {
                return null;
            }
            return fybVar.mo123732b(str, bundle);
        }

        @Override // p149l.ipl
        /* JADX INFO: renamed from: V3 */
        public void mo128695V3(int i, Bundle bundle) {
            if (this.f104986b == null) {
                return;
            }
            this.f104985a.post(new a(i, bundle));
        }

        @Override // p149l.ipl
        /* JADX INFO: renamed from: X7 */
        public void mo128696X7(String str, Bundle bundle) throws RemoteException {
            if (this.f104986b == null) {
                return;
            }
            this.f104985a.post(new d(str, bundle));
        }

        @Override // p149l.ipl
        /* JADX INFO: renamed from: e8 */
        public void mo128697e8(Bundle bundle) throws RemoteException {
            if (this.f104986b == null) {
                return;
            }
            this.f104985a.post(new c(bundle));
        }

        @Override // p149l.ipl
        /* JADX INFO: renamed from: h8 */
        public void mo128698h8(int i, Uri uri, boolean z, @Nullable Bundle bundle) throws RemoteException {
            if (this.f104986b == null) {
                return;
            }
            this.f104985a.post(new e(i, uri, z, bundle));
        }
    }

    public gyb(jpl jplVar, ComponentName componentName, Context context) {
        this.f104981a = jplVar;
        this.f104982b = componentName;
        this.f104983c = context;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m128687a(@NonNull Context context, @Nullable String str, @NonNull jyb jybVar) {
        jybVar.m143841b(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, jybVar, 33);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m128688b(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m128687a(applicationContext, str, new C17200a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final ipl.AbstractBinderC17605a m128689c(@Nullable fyb fybVar) {
        return new BinderC17201b(fybVar);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public kyb m128690d(@Nullable fyb fybVar) {
        return m128691e(fybVar, null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final kyb m128691e(@Nullable fyb fybVar, @Nullable PendingIntent pendingIntent) {
        boolean zMo810C0;
        ipl.AbstractBinderC17605a abstractBinderC17605aM128689c = m128689c(fybVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zMo810C0 = this.f104981a.mo812Q3(abstractBinderC17605aM128689c, bundle);
            } else {
                zMo810C0 = this.f104981a.mo810C0(abstractBinderC17605aM128689c);
            }
            if (zMo810C0) {
                return new kyb(this.f104981a, abstractBinderC17605aM128689c, this.f104982b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m128692f(long j) {
        try {
            return this.f104981a.mo819r3(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.gyb$a */
    public class C17200a extends jyb {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f104984b;

        public C17200a(Context context) {
            this.f104984b = context;
        }

        @Override // p149l.jyb
        /* JADX INFO: renamed from: a */
        public final void mo114048a(@NonNull ComponentName componentName, @NonNull gyb gybVar) {
            gybVar.m128692f(0L);
            this.f104984b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

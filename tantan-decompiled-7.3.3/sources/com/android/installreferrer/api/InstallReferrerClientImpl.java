package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p153l.azk0;
import p153l.oul;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: a */
    private int f4135a = 0;

    /* JADX INFO: renamed from: b */
    private final Context f4136b;

    /* JADX INFO: renamed from: c */
    private oul f4137c;

    /* JADX INFO: renamed from: d */
    private ServiceConnection f4138d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$b */
    public final class ServiceConnectionC0916b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        private final InstallReferrerStateListener f4139a;

        private ServiceConnectionC0916b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f4139a = installReferrerStateListener;
            } else {
                azk0.m101074a("Please specify a listener to know when setup is done.");
                throw null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f4137c = oul.AbstractBinderC19221a.m169317P2(iBinder);
            InstallReferrerClientImpl.this.f4135a = 2;
            this.f4139a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f4137c = null;
            InstallReferrerClientImpl.this.f4135a = 0;
            this.f4139a.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f4136b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    private boolean m5088c() {
        try {
            return this.f4136b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.f4135a = 3;
        if (this.f4138d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f4136b.unbindService(this.f4138d);
            this.f4138d = null;
        }
        this.f4137c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            wtq0.m207906a("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f4136b.getPackageName());
        try {
            return new ReferrerDetails(this.f4137c.mo169316Z0(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f4135a = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f4135a != 2 || this.f4137c == null || this.f4138d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f4135a;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f4136b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f4135a = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !m5088c()) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f4135a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        ServiceConnectionC0916b serviceConnectionC0916b = new ServiceConnectionC0916b(installReferrerStateListener);
        this.f4138d = serviceConnectionC0916b;
        try {
            if (this.f4136b.bindService(intent2, serviceConnectionC0916b, 1)) {
                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
            this.f4135a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
            this.f4135a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}

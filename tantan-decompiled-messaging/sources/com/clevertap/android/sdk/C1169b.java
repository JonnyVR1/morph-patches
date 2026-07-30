package com.clevertap.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inbox.InboxV2Bridge;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import com.clevertap.android.sdk.task.Task;
import java.util.concurrent.Callable;
import p149l.ak2;
import p149l.mxf0;
import p149l.n95;
import p149l.pg50;
import p149l.qs9;
import p149l.ske0;
import p149l.tt3;
import p149l.vg2;
import p149l.wk0;
import p149l.yfb0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.b */
/* JADX INFO: loaded from: classes.dex */
class C1169b {

    /* JADX INFO: renamed from: a */
    private final wk0 f4837a;

    /* JADX INFO: renamed from: b */
    private final ak2 f4838b;

    /* JADX INFO: renamed from: c */
    private final vg2 f4839c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f4840d;

    /* JADX INFO: renamed from: e */
    private final Context f4841e;

    /* JADX INFO: renamed from: f */
    private final qs9 f4842f;

    /* JADX INFO: renamed from: g */
    private final InAppController f4843g;

    /* JADX INFO: renamed from: h */
    private final yfb0 f4844h;

    /* JADX INFO: renamed from: i */
    private final ske0 f4845i;

    /* JADX INFO: renamed from: j */
    private final tt3 f4846j;

    /* JADX INFO: renamed from: k */
    private final n95 f4847k;

    /* JADX INFO: renamed from: l */
    private final InboxV2Bridge f4848l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.b$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (!C1169b.this.f4842f.m176224v()) {
                return null;
            }
            try {
                mxf0.m156895r(C1169b.this.f4841e, C1169b.this.f4840d.getAccountId(), Constants.LAST_SESSION_EPOCH, iCurrentTimeMillis);
                C1169b.this.f4840d.getLogger().verbose(C1169b.this.f4840d.getAccountId(), "Updated session time: " + iCurrentTimeMillis);
                return null;
            } catch (Throwable th) {
                C1169b.this.f4840d.getLogger().verbose(C1169b.this.f4840d.getAccountId(), "Failed to update session time time: " + th.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.b$b */
    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (C1169b.this.f4842f.m176178E() || !C1169b.this.f4842f.m176176C()) {
                return null;
            }
            C1169b.this.m5937j();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.b$c */
    public class c implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InstallReferrerClient f4851a;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.b$c$a */
        public class a implements Callable<Void> {
            public a() {
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                C1169b.this.m5937j();
                return null;
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.b$c$b */
        public class b implements Callable<Void> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InstallReferrerClient f4854a;

            public b(InstallReferrerClient installReferrerClient) {
                this.f4854a = installReferrerClient;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                this.f4854a.endConnection();
                return null;
            }
        }

        public c(InstallReferrerClient installReferrerClient) {
            this.f4851a = installReferrerClient;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ReferrerDetails m5943a(c cVar, InstallReferrerClient installReferrerClient) {
            cVar.getClass();
            try {
                return installReferrerClient.getInstallReferrer();
            } catch (RemoteException e) {
                C1169b.this.f4840d.getLogger().debug(C1169b.this.f4840d.getAccountId(), "Remote exception caused by Google Play Install Referrer library - " + e.getMessage());
                installReferrerClient.endConnection();
                C1169b.this.f4842f.m176199b0(false);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m5944b(c cVar, InstallReferrerClient installReferrerClient, ReferrerDetails referrerDetails) {
            cVar.getClass();
            try {
                String installReferrer = referrerDetails.getInstallReferrer();
                C1169b.this.f4842f.m176210h0(referrerDetails.getReferrerClickTimestampSeconds());
                C1169b.this.f4842f.m176185N(referrerDetails.getInstallBeginTimestampSeconds());
                C1169b.this.f4837a.m203626K(installReferrer);
                C1169b.this.f4842f.m176199b0(true);
                C1169b.this.f4840d.getLogger().debug(C1169b.this.f4840d.getAccountId(), "Install Referrer data set [Referrer URL-" + installReferrer + Constants.AES_SUFFIX);
            } catch (NullPointerException e) {
                C1169b.this.f4840d.getLogger().debug(C1169b.this.f4840d.getAccountId(), "Install referrer client null pointer exception caused by Google Play Install Referrer library - " + e.getMessage());
                C1169b.this.f4846j.m190590b().m6946g("EndReferrerConnection", cVar.new b(installReferrerClient));
                C1169b.this.f4842f.m176199b0(false);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            if (C1169b.this.f4842f.m176178E()) {
                return;
            }
            C1169b.this.f4846j.m190592d().m6946g("RetryInstallReferrer", new a());
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                Task taskM190592d = C1169b.this.f4846j.m190592d();
                final InstallReferrerClient installReferrerClient = this.f4851a;
                taskM190592d.m6945f(new pg50() { // from class: com.clevertap.android.sdk.c
                    @Override // p149l.pg50
                    public final void onSuccess(Object obj) {
                        C1169b.c.m5944b(this.f4860a, installReferrerClient, (ReferrerDetails) obj);
                    }
                });
                final InstallReferrerClient installReferrerClient2 = this.f4851a;
                taskM190592d.m6946g("ActivityLifeCycleManager#getInstallReferrer", new Callable() { // from class: com.clevertap.android.sdk.d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C1169b.c.m5943a(this.f4889a, installReferrerClient2);
                    }
                });
                return;
            }
            if (i == 1) {
                C1169b.this.f4840d.getLogger().debug(C1169b.this.f4840d.getAccountId(), "Install Referrer data not set, connection to Play Store unavailable");
            } else {
                if (i != 2) {
                    return;
                }
                C1169b.this.f4840d.getLogger().debug(C1169b.this.f4840d.getAccountId(), "Install Referrer data not set, API not supported by Play Store on device");
            }
        }
    }

    public C1169b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, wk0 wk0Var, qs9 qs9Var, ske0 ske0Var, yfb0 yfb0Var, vg2 vg2Var, InAppController inAppController, ak2 ak2Var, tt3 tt3Var, n95 n95Var, InboxV2Bridge inboxV2Bridge) {
        this.f4841e = context;
        this.f4840d = cleverTapInstanceConfig;
        this.f4837a = wk0Var;
        this.f4842f = qs9Var;
        this.f4845i = ske0Var;
        this.f4844h = yfb0Var;
        this.f4839c = vg2Var;
        this.f4843g = inAppController;
        this.f4838b = ak2Var;
        this.f4846j = tt3Var;
        this.f4847k = n95Var;
        this.f4848l = inboxV2Bridge;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m5930a(C1169b c1169b) {
        Utils.m5905b(c1169b.f4841e, c1169b.f4840d, c1169b.f4847k);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m5937j() {
        this.f4840d.getLogger().verbose(this.f4840d.getAccountId(), "Starting to handle install referrer");
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.f4841e).build();
            installReferrerClientBuild.startConnection(new c(installReferrerClientBuild));
        } catch (Throwable th) {
            this.f4840d.getLogger().verbose(this.f4840d.getAccountId(), "Google Play Install Referrer's InstallReferrerClient Class not found - " + th.getLocalizedMessage() + " \n Please add implementation 'com.android.installreferrer:installreferrer:2.1' to your build.gradle");
        }
    }

    /* JADX INFO: renamed from: h */
    public void m5938h() {
        qs9.m176165L(false);
        this.f4845i.m184592f(System.currentTimeMillis());
        this.f4840d.getLogger().verbose(this.f4840d.getAccountId(), "App in background");
        this.f4846j.m190592d().m6946g("activityPaused", new a());
    }

    /* JADX INFO: renamed from: i */
    public void m5939i(Activity activity) {
        this.f4840d.getLogger().verbose(this.f4840d.getAccountId(), "App in foreground");
        this.f4845i.m184588a();
        if (!this.f4842f.m176225y()) {
            this.f4837a.m203620E();
            this.f4837a.mo168499a();
            this.f4848l.m6729d(FetchTrigger.SYSTEM, null);
            this.f4844h.m214531J();
            this.f4846j.m190592d().m6946g("HandlingInstallReferrer", new b());
            this.f4846j.m190589a().m6946g("CleanUpOldGIFs", new Callable() { // from class: com.clevertap.android.sdk.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1169b.m5930a(this.f4836a);
                }
            });
            try {
                this.f4839c.mo100737k();
            } catch (IllegalStateException e) {
                this.f4840d.getLogger().verbose(this.f4840d.getAccountId(), e.getLocalizedMessage());
            } catch (Exception unused) {
                this.f4840d.getLogger().verbose(this.f4840d.getAccountId(), "Failed to trigger location");
            }
        }
        this.f4838b.mo97099f();
        this.f4843g.m6269d0();
    }

    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x000a A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0002, B:8:0x0018, B:10:0x001e, B:12:0x0026, B:5:0x000a), top: B:20:0x0002 }] */
    /* JADX INFO: renamed from: k */
    public void m5940k(Bundle bundle, Uri uri, String str) {
        if (str == null) {
            try {
                if (!this.f4840d.isDefaultInstance()) {
                    if (!this.f4840d.getAccountId().equals(str)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                Logger.m5873v("Throwable - " + th.getLocalizedMessage());
                return;
            }
        } else if (!this.f4840d.getAccountId().equals(str)) {
            return;
        }
        if (bundle != null && !bundle.isEmpty() && bundle.containsKey(Constants.NOTIFICATION_TAG)) {
            this.f4837a.m203627L(bundle);
        }
        if (uri != null) {
            try {
                this.f4837a.m203622G(uri, false);
            } catch (Throwable unused) {
            }
        }
    }
}

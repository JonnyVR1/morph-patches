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
import p153l.bu9;
import p153l.ch2;
import p153l.cob0;
import p153l.ik2;
import p153l.oa5;
import p153l.sk0;
import p153l.su3;
import p153l.v5g0;
import p153l.vo50;
import p153l.xse0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.b */
/* JADX INFO: loaded from: classes.dex */
class C1192b {

    /* JADX INFO: renamed from: a */
    private final sk0 f4874a;

    /* JADX INFO: renamed from: b */
    private final ik2 f4875b;

    /* JADX INFO: renamed from: c */
    private final ch2 f4876c;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f4877d;

    /* JADX INFO: renamed from: e */
    private final Context f4878e;

    /* JADX INFO: renamed from: f */
    private final bu9 f4879f;

    /* JADX INFO: renamed from: g */
    private final InAppController f4880g;

    /* JADX INFO: renamed from: h */
    private final cob0 f4881h;

    /* JADX INFO: renamed from: i */
    private final xse0 f4882i;

    /* JADX INFO: renamed from: j */
    private final su3 f4883j;

    /* JADX INFO: renamed from: k */
    private final oa5 f4884k;

    /* JADX INFO: renamed from: l */
    private final InboxV2Bridge f4885l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.b$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (!C1192b.this.f4879f.m106491v()) {
                return null;
            }
            try {
                v5g0.m199861r(C1192b.this.f4878e, C1192b.this.f4877d.getAccountId(), Constants.LAST_SESSION_EPOCH, iCurrentTimeMillis);
                C1192b.this.f4877d.getLogger().verbose(C1192b.this.f4877d.getAccountId(), "Updated session time: " + iCurrentTimeMillis);
                return null;
            } catch (Throwable th) {
                C1192b.this.f4877d.getLogger().verbose(C1192b.this.f4877d.getAccountId(), "Failed to update session time time: " + th.getMessage());
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
            if (C1192b.this.f4879f.m106445E() || !C1192b.this.f4879f.m106443C()) {
                return null;
            }
            C1192b.this.m5991j();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.b$c */
    public class c implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InstallReferrerClient f4888a;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.b$c$a */
        public class a implements Callable<Void> {
            public a() {
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                C1192b.this.m5991j();
                return null;
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.b$c$b */
        public class b implements Callable<Void> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InstallReferrerClient f4891a;

            public b(InstallReferrerClient installReferrerClient) {
                this.f4891a = installReferrerClient;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                this.f4891a.endConnection();
                return null;
            }
        }

        public c(InstallReferrerClient installReferrerClient) {
            this.f4888a = installReferrerClient;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ReferrerDetails m5997a(c cVar, InstallReferrerClient installReferrerClient) {
            cVar.getClass();
            try {
                return installReferrerClient.getInstallReferrer();
            } catch (RemoteException e) {
                C1192b.this.f4877d.getLogger().debug(C1192b.this.f4877d.getAccountId(), "Remote exception caused by Google Play Install Referrer library - " + e.getMessage());
                installReferrerClient.endConnection();
                C1192b.this.f4879f.m106466b0(false);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m5998b(c cVar, InstallReferrerClient installReferrerClient, ReferrerDetails referrerDetails) {
            cVar.getClass();
            try {
                String installReferrer = referrerDetails.getInstallReferrer();
                C1192b.this.f4879f.m106477h0(referrerDetails.getReferrerClickTimestampSeconds());
                C1192b.this.f4879f.m106452N(referrerDetails.getInstallBeginTimestampSeconds());
                C1192b.this.f4874a.m186382K(installReferrer);
                C1192b.this.f4879f.m106466b0(true);
                C1192b.this.f4877d.getLogger().debug(C1192b.this.f4877d.getAccountId(), "Install Referrer data set [Referrer URL-" + installReferrer + Constants.AES_SUFFIX);
            } catch (NullPointerException e) {
                C1192b.this.f4877d.getLogger().debug(C1192b.this.f4877d.getAccountId(), "Install referrer client null pointer exception caused by Google Play Install Referrer library - " + e.getMessage());
                C1192b.this.f4883j.m187988b().m7000g("EndReferrerConnection", cVar.new b(installReferrerClient));
                C1192b.this.f4879f.m106466b0(false);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            if (C1192b.this.f4879f.m106445E()) {
                return;
            }
            C1192b.this.f4883j.m187990d().m7000g("RetryInstallReferrer", new a());
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                Task taskM187990d = C1192b.this.f4883j.m187990d();
                final InstallReferrerClient installReferrerClient = this.f4888a;
                taskM187990d.m6999f(new vo50() { // from class: com.clevertap.android.sdk.c
                    @Override // p153l.vo50
                    public final void onSuccess(Object obj) {
                        C1192b.c.m5998b(this.f4897a, installReferrerClient, (ReferrerDetails) obj);
                    }
                });
                final InstallReferrerClient installReferrerClient2 = this.f4888a;
                taskM187990d.m7000g("ActivityLifeCycleManager#getInstallReferrer", new Callable() { // from class: com.clevertap.android.sdk.d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C1192b.c.m5997a(this.f4926a, installReferrerClient2);
                    }
                });
                return;
            }
            if (i == 1) {
                C1192b.this.f4877d.getLogger().debug(C1192b.this.f4877d.getAccountId(), "Install Referrer data not set, connection to Play Store unavailable");
            } else {
                if (i != 2) {
                    return;
                }
                C1192b.this.f4877d.getLogger().debug(C1192b.this.f4877d.getAccountId(), "Install Referrer data not set, API not supported by Play Store on device");
            }
        }
    }

    public C1192b(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, sk0 sk0Var, bu9 bu9Var, xse0 xse0Var, cob0 cob0Var, ch2 ch2Var, InAppController inAppController, ik2 ik2Var, su3 su3Var, oa5 oa5Var, InboxV2Bridge inboxV2Bridge) {
        this.f4878e = context;
        this.f4877d = cleverTapInstanceConfig;
        this.f4874a = sk0Var;
        this.f4879f = bu9Var;
        this.f4882i = xse0Var;
        this.f4881h = cob0Var;
        this.f4876c = ch2Var;
        this.f4880g = inAppController;
        this.f4875b = ik2Var;
        this.f4883j = su3Var;
        this.f4884k = oa5Var;
        this.f4885l = inboxV2Bridge;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m5984a(C1192b c1192b) {
        Utils.m5959b(c1192b.f4878e, c1192b.f4877d, c1192b.f4884k);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m5991j() {
        this.f4877d.getLogger().verbose(this.f4877d.getAccountId(), "Starting to handle install referrer");
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this.f4878e).build();
            installReferrerClientBuild.startConnection(new c(installReferrerClientBuild));
        } catch (Throwable th) {
            this.f4877d.getLogger().verbose(this.f4877d.getAccountId(), "Google Play Install Referrer's InstallReferrerClient Class not found - " + th.getLocalizedMessage() + " \n Please add implementation 'com.android.installreferrer:installreferrer:2.1' to your build.gradle");
        }
    }

    /* JADX INFO: renamed from: h */
    public void m5992h() {
        bu9.m106432L(false);
        this.f4882i.m212971f(System.currentTimeMillis());
        this.f4877d.getLogger().verbose(this.f4877d.getAccountId(), "App in background");
        this.f4883j.m187990d().m7000g("activityPaused", new a());
    }

    /* JADX INFO: renamed from: i */
    public void m5993i(Activity activity) {
        this.f4877d.getLogger().verbose(this.f4877d.getAccountId(), "App in foreground");
        this.f4882i.m212967a();
        if (!this.f4879f.m106492y()) {
            this.f4874a.m186376E();
            this.f4874a.mo186393a();
            this.f4885l.m6783d(FetchTrigger.SYSTEM, null);
            this.f4881h.m111620J();
            this.f4883j.m187990d().m7000g("HandlingInstallReferrer", new b());
            this.f4883j.m187987a().m7000g("CleanUpOldGIFs", new Callable() { // from class: com.clevertap.android.sdk.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1192b.m5984a(this.f4873a);
                }
            });
            try {
                this.f4876c.mo96517k();
            } catch (IllegalStateException e) {
                this.f4877d.getLogger().verbose(this.f4877d.getAccountId(), e.getLocalizedMessage());
            } catch (Exception unused) {
                this.f4877d.getLogger().verbose(this.f4877d.getAccountId(), "Failed to trigger location");
            }
        }
        this.f4875b.mo140248f();
        this.f4880g.m6323d0();
    }

    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x000a A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0002, B:8:0x0018, B:10:0x001e, B:12:0x0026, B:5:0x000a), top: B:20:0x0002 }] */
    /* JADX INFO: renamed from: k */
    public void m5994k(Bundle bundle, Uri uri, String str) {
        if (str == null) {
            try {
                if (!this.f4877d.isDefaultInstance()) {
                    if (!this.f4877d.getAccountId().equals(str)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                Logger.m5927v("Throwable - " + th.getLocalizedMessage());
                return;
            }
        } else if (!this.f4877d.getAccountId().equals(str)) {
            return;
        }
        if (bundle != null && !bundle.isEmpty() && bundle.containsKey(Constants.NOTIFICATION_TAG)) {
            this.f4874a.m186383L(bundle);
        }
        if (uri != null) {
            try {
                this.f4874a.m186378G(uri, false);
            } catch (Throwable unused) {
            }
        }
    }
}

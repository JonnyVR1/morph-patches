package com.google.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import p149l.aag0;
import p149l.fg3;
import p149l.ge2;
import p149l.ia80;
import p149l.qu40;
import p149l.ubr;
import p149l.vbr;

/* JADX INFO: renamed from: com.google.android.vending.licensing.b */
/* JADX INFO: loaded from: classes7.dex */
public class ServiceConnectionC2637b implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public static final SecureRandom f10589j = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public ILicensingService f10590a;

    /* JADX INFO: renamed from: b */
    public PublicKey f10591b;

    /* JADX INFO: renamed from: c */
    public final Context f10592c;

    /* JADX INFO: renamed from: d */
    public final ia80 f10593d;

    /* JADX INFO: renamed from: e */
    public Handler f10594e;

    /* JADX INFO: renamed from: f */
    public final String f10595f;

    /* JADX INFO: renamed from: g */
    public final String f10596g;

    /* JADX INFO: renamed from: h */
    public final Set<vbr> f10597h = new HashSet();

    /* JADX INFO: renamed from: i */
    public final Queue<vbr> f10598i = new LinkedList();

    /* JADX INFO: renamed from: com.google.android.vending.licensing.b$a */
    public class a extends InterfaceC2636a.a {

        /* JADX INFO: renamed from: a */
        public final vbr f10599a;

        /* JADX INFO: renamed from: b */
        public Runnable f10600b;

        /* JADX INFO: renamed from: com.google.android.vending.licensing.b$a$a, reason: collision with other inner class name */
        public class RunnableC22675a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ServiceConnectionC2637b f10602a;

            public RunnableC22675a(ServiceConnectionC2637b serviceConnectionC2637b) {
                this.f10602a = serviceConnectionC2637b;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                ServiceConnectionC2637b.this.m15399l(aVar.f10599a);
                a aVar2 = a.this;
                ServiceConnectionC2637b.this.m15397h(aVar2.f10599a);
            }
        }

        /* JADX INFO: renamed from: com.google.android.vending.licensing.b$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10604a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f10605b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f10606c;

            public b(int i, String str, String str2) {
                this.f10604a = i;
                this.f10605b = str;
                this.f10606c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ServiceConnectionC2637b.this.f10597h.contains(a.this.f10599a)) {
                    a.this.m15403P3();
                    a.this.f10599a.m197733g(ServiceConnectionC2637b.this.f10591b, this.f10604a, this.f10605b, this.f10606c);
                    a aVar = a.this;
                    ServiceConnectionC2637b.this.m15397h(aVar.f10599a);
                }
            }
        }

        public a(vbr vbrVar) {
            this.f10599a = vbrVar;
            this.f10600b = new RunnableC22675a(ServiceConnectionC2637b.this);
            m15404m4();
        }

        /* JADX INFO: renamed from: P3 */
        public final void m15403P3() {
            ServiceConnectionC2637b.this.f10594e.removeCallbacks(this.f10600b);
        }

        @Override // com.google.android.vending.licensing.InterfaceC2636a
        /* JADX INFO: renamed from: g2 */
        public void mo15386g2(int i, String str, String str2) {
            ServiceConnectionC2637b.this.f10594e.post(new b(i, str, str2));
        }

        /* JADX INFO: renamed from: m4 */
        public final void m15404m4() {
            ServiceConnectionC2637b.this.f10594e.postDelayed(this.f10600b, 10000L);
        }
    }

    public ServiceConnectionC2637b(Context context, ia80 ia80Var, String str) {
        this.f10592c = context;
        this.f10593d = ia80Var;
        this.f10591b = m15393j(str);
        String packageName = context.getPackageName();
        this.f10595f = packageName;
        this.f10596g = m15394k(context, packageName);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f10594e = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: j */
    public static PublicKey m15393j(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(ge2.m125600a(str)));
        } catch (Base64DecoderException e) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            fg3.m121203a(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            aag0.m95543a(e2);
            return null;
        } catch (InvalidKeySpecException e3) {
            Log.e("LicenseChecker", "Invalid key specification.");
            fg3.m121203a(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m15394k(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m15395f(ubr ubrVar) {
        try {
            if (this.f10593d.mo135138b()) {
                ubrVar.mo81517a(256);
            } else {
                vbr vbrVar = new vbr(this.f10593d, new qu40(), ubrVar, m15398i(), this.f10595f, this.f10596g);
                if (this.f10590a == null) {
                    try {
                        Intent intent = new Intent(new String(ge2.m125600a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                        intent.setPackage("com.android.vending");
                        if (this.f10592c.bindService(intent, this, 1)) {
                            this.f10598i.offer(vbrVar);
                        } else {
                            Log.e("LicenseChecker", "Could not bind to service.");
                            m15399l(vbrVar);
                        }
                    } catch (Base64DecoderException e) {
                        e.printStackTrace();
                    } catch (SecurityException unused) {
                        ubrVar.mo81519c(6);
                    }
                } else {
                    this.f10598i.offer(vbrVar);
                    m15400m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15396g() {
        if (this.f10590a != null) {
            try {
                this.f10592c.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f10590a = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m15397h(vbr vbrVar) {
        this.f10597h.remove(vbrVar);
        if (this.f10597h.isEmpty()) {
            m15396g();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m15398i() {
        return f10589j.nextInt();
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m15399l(vbr vbrVar) {
        try {
            this.f10593d.mo135137a(291, null);
            if (this.f10593d.mo135138b()) {
                vbrVar.m197727a().mo81517a(291);
            } else {
                vbrVar.m197727a().mo81518b(291);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15400m() {
        while (true) {
            vbr vbrVarPoll = this.f10598i.poll();
            if (vbrVarPoll == null) {
                return;
            }
            try {
                vbrVarPoll.m197729c();
                this.f10590a.mo15384p3(vbrVarPoll.m197728b(), vbrVarPoll.m197729c(), new a(vbrVarPoll));
                this.f10597h.add(vbrVarPoll);
            } catch (RemoteException unused) {
                m15399l(vbrVarPoll);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10590a = ILicensingService.AbstractBinderC2635a.m15385O(iBinder);
        m15400m();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        this.f10590a = null;
    }
}

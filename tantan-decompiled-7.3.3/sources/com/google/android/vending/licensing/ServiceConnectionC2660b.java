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
import p153l.f350;
import p153l.iig0;
import p153l.ne2;
import p153l.oi80;
import p153l.tg3;
import p153l.wdr;
import p153l.xdr;

/* JADX INFO: renamed from: com.google.android.vending.licensing.b */
/* JADX INFO: loaded from: classes7.dex */
public class ServiceConnectionC2660b implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public static final SecureRandom f10626j = new SecureRandom();

    /* JADX INFO: renamed from: a */
    public ILicensingService f10627a;

    /* JADX INFO: renamed from: b */
    public PublicKey f10628b;

    /* JADX INFO: renamed from: c */
    public final Context f10629c;

    /* JADX INFO: renamed from: d */
    public final oi80 f10630d;

    /* JADX INFO: renamed from: e */
    public Handler f10631e;

    /* JADX INFO: renamed from: f */
    public final String f10632f;

    /* JADX INFO: renamed from: g */
    public final String f10633g;

    /* JADX INFO: renamed from: h */
    public final Set<xdr> f10634h = new HashSet();

    /* JADX INFO: renamed from: i */
    public final Queue<xdr> f10635i = new LinkedList();

    /* JADX INFO: renamed from: com.google.android.vending.licensing.b$a */
    public class a extends InterfaceC2659a.a {

        /* JADX INFO: renamed from: a */
        public final xdr f10636a;

        /* JADX INFO: renamed from: b */
        public Runnable f10637b;

        /* JADX INFO: renamed from: com.google.android.vending.licensing.b$a$a, reason: collision with other inner class name */
        public class RunnableC22791a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ServiceConnectionC2660b f10639a;

            public RunnableC22791a(ServiceConnectionC2660b serviceConnectionC2660b) {
                this.f10639a = serviceConnectionC2660b;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                ServiceConnectionC2660b.this.m15453l(aVar.f10636a);
                a aVar2 = a.this;
                ServiceConnectionC2660b.this.m15451h(aVar2.f10636a);
            }
        }

        /* JADX INFO: renamed from: com.google.android.vending.licensing.b$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10641a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f10642b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f10643c;

            public b(int i, String str, String str2) {
                this.f10641a = i;
                this.f10642b = str;
                this.f10643c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ServiceConnectionC2660b.this.f10634h.contains(a.this.f10636a)) {
                    a.this.m15457P3();
                    a.this.f10636a.m210478g(ServiceConnectionC2660b.this.f10628b, this.f10641a, this.f10642b, this.f10643c);
                    a aVar = a.this;
                    ServiceConnectionC2660b.this.m15451h(aVar.f10636a);
                }
            }
        }

        public a(xdr xdrVar) {
            this.f10636a = xdrVar;
            this.f10637b = new RunnableC22791a(ServiceConnectionC2660b.this);
            m15458m4();
        }

        /* JADX INFO: renamed from: P3 */
        public final void m15457P3() {
            ServiceConnectionC2660b.this.f10631e.removeCallbacks(this.f10637b);
        }

        @Override // com.google.android.vending.licensing.InterfaceC2659a
        /* JADX INFO: renamed from: g2 */
        public void mo15440g2(int i, String str, String str2) {
            ServiceConnectionC2660b.this.f10631e.post(new b(i, str, str2));
        }

        /* JADX INFO: renamed from: m4 */
        public final void m15458m4() {
            ServiceConnectionC2660b.this.f10631e.postDelayed(this.f10637b, 10000L);
        }
    }

    public ServiceConnectionC2660b(Context context, oi80 oi80Var, String str) {
        this.f10629c = context;
        this.f10630d = oi80Var;
        this.f10628b = m15447j(str);
        String packageName = context.getPackageName();
        this.f10632f = packageName;
        this.f10633g = m15448k(context, packageName);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f10631e = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: j */
    public static PublicKey m15447j(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(ne2.m162807a(str)));
        } catch (Base64DecoderException e) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            tg3.m191013a(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            iig0.m140070a(e2);
            return null;
        } catch (InvalidKeySpecException e3) {
            Log.e("LicenseChecker", "Invalid key specification.");
            tg3.m191013a(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m15448k(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m15449f(wdr wdrVar) {
        try {
            if (this.f10630d.mo161040b()) {
                wdrVar.mo82700a(256);
            } else {
                xdr xdrVar = new xdr(this.f10630d, new f350(), wdrVar, m15452i(), this.f10632f, this.f10633g);
                if (this.f10627a == null) {
                    try {
                        Intent intent = new Intent(new String(ne2.m162807a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=")));
                        intent.setPackage("com.android.vending");
                        if (this.f10629c.bindService(intent, this, 1)) {
                            this.f10635i.offer(xdrVar);
                        } else {
                            Log.e("LicenseChecker", "Could not bind to service.");
                            m15453l(xdrVar);
                        }
                    } catch (Base64DecoderException e) {
                        e.printStackTrace();
                    } catch (SecurityException unused) {
                        wdrVar.mo82702c(6);
                    }
                } else {
                    this.f10635i.offer(xdrVar);
                    m15454m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15450g() {
        if (this.f10627a != null) {
            try {
                this.f10629c.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f10627a = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m15451h(xdr xdrVar) {
        this.f10634h.remove(xdrVar);
        if (this.f10634h.isEmpty()) {
            m15450g();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m15452i() {
        return f10626j.nextInt();
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m15453l(xdr xdrVar) {
        try {
            this.f10630d.mo161039a(291, null);
            if (this.f10630d.mo161040b()) {
                xdrVar.m210472a().mo82700a(291);
            } else {
                xdrVar.m210472a().mo82701b(291);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15454m() {
        while (true) {
            xdr xdrVarPoll = this.f10635i.poll();
            if (xdrVarPoll == null) {
                return;
            }
            try {
                xdrVarPoll.m210474c();
                this.f10627a.mo15438p3(xdrVarPoll.m210473b(), xdrVarPoll.m210474c(), new a(xdrVarPoll));
                this.f10634h.add(xdrVarPoll);
            } catch (RemoteException unused) {
                m15453l(xdrVarPoll);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10627a = ILicensingService.AbstractBinderC2658a.m15439O(iBinder);
        m15454m();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        this.f10627a = null;
    }
}

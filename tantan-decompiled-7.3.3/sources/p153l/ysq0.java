package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
class ysq0 implements zsq0 {

    /* JADX INFO: renamed from: h */
    private static boolean f201429h;

    /* JADX INFO: renamed from: a */
    private Context f201430a;

    /* JADX INFO: renamed from: b */
    private ServiceConnection f201431b;

    /* JADX INFO: renamed from: c */
    private volatile int f201432c = 0;

    /* JADX INFO: renamed from: d */
    private volatile String f201433d = null;

    /* JADX INFO: renamed from: e */
    private volatile boolean f201434e = false;

    /* JADX INFO: renamed from: f */
    private volatile String f201435f = null;

    /* JADX INFO: renamed from: g */
    private final Object f201436g = new Object();

    /* JADX INFO: renamed from: l.ysq0$c */
    public static class C21678c {
        /* JADX INFO: renamed from: a */
        public static String m217271a(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: b */
        public static boolean m217272b(IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public ysq0(Context context) {
        this.f201430a = context;
        m217265d();
    }

    /* JADX INFO: renamed from: d */
    private void m217265d() {
        boolean zBindService;
        this.f201431b = new ServiceConnectionC21677b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            zBindService = this.f201430a.bindService(intent, this.f201431b, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f201432c = zBindService ? 1 : 2;
    }

    /* JADX INFO: renamed from: e */
    private void m217266e(String str) {
        if (this.f201432c != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f201436g) {
            try {
                ouq0.m169393m("huawei's " + str + " wait...");
                this.f201436g.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m217268g(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
            f201429h = packageInfo.versionCode >= 20602000;
            return z;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m217270i() {
        ServiceConnection serviceConnection = this.f201431b;
        if (serviceConnection != null) {
            try {
                this.f201430a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public String mo100236a() {
        m217266e("getOAID");
        return this.f201433d;
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public boolean mo100237a() {
        return f201429h;
    }

    /* JADX INFO: renamed from: l.ysq0$b */
    public class ServiceConnectionC21677b implements ServiceConnection {

        /* JADX INFO: renamed from: l.ysq0$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ IBinder f201438a;

            public a(IBinder iBinder) {
                this.f201438a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ysq0.this.f201433d = C21678c.m217271a(this.f201438a);
                    ysq0.this.f201434e = C21678c.m217272b(this.f201438a);
                    ysq0.this.m217270i();
                    ysq0.this.f201432c = 2;
                    synchronized (ysq0.this.f201436g) {
                        try {
                            ysq0.this.f201436g.notifyAll();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    ysq0.this.m217270i();
                    ysq0.this.f201432c = 2;
                    synchronized (ysq0.this.f201436g) {
                        try {
                            ysq0.this.f201436g.notifyAll();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (Throwable th) {
                    ysq0.this.m217270i();
                    ysq0.this.f201432c = 2;
                    synchronized (ysq0.this.f201436g) {
                        try {
                            ysq0.this.f201436g.notifyAll();
                        } catch (Exception unused4) {
                        }
                        throw th;
                    }
                }
            }
        }

        private ServiceConnectionC21677b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new a(iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

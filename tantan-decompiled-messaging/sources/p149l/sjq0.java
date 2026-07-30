package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
class sjq0 implements tjq0 {

    /* JADX INFO: renamed from: h */
    private static boolean f164887h;

    /* JADX INFO: renamed from: a */
    private Context f164888a;

    /* JADX INFO: renamed from: b */
    private ServiceConnection f164889b;

    /* JADX INFO: renamed from: c */
    private volatile int f164890c = 0;

    /* JADX INFO: renamed from: d */
    private volatile String f164891d = null;

    /* JADX INFO: renamed from: e */
    private volatile boolean f164892e = false;

    /* JADX INFO: renamed from: f */
    private volatile String f164893f = null;

    /* JADX INFO: renamed from: g */
    private final Object f164894g = new Object();

    /* JADX INFO: renamed from: l.sjq0$c */
    public static class C19966c {
        /* JADX INFO: renamed from: a */
        public static String m184546a(IBinder iBinder) {
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
        public static boolean m184547b(IBinder iBinder) {
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

    public sjq0(Context context) {
        this.f164888a = context;
        m184540d();
    }

    /* JADX INFO: renamed from: d */
    private void m184540d() {
        boolean zBindService;
        this.f164889b = new ServiceConnectionC19965b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            zBindService = this.f164888a.bindService(intent, this.f164889b, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f164890c = zBindService ? 1 : 2;
    }

    /* JADX INFO: renamed from: e */
    private void m184541e(String str) {
        if (this.f164890c != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f164894g) {
            try {
                ilq0.m137040m("huawei's " + str + " wait...");
                this.f164894g.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m184543g(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
            f164887h = packageInfo.versionCode >= 20602000;
            return z;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m184545i() {
        ServiceConnection serviceConnection = this.f164889b;
        if (serviceConnection != null) {
            try {
                this.f164888a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public String mo97174a() {
        m184541e("getOAID");
        return this.f164891d;
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public boolean mo97175a() {
        return f164887h;
    }

    /* JADX INFO: renamed from: l.sjq0$b */
    public class ServiceConnectionC19965b implements ServiceConnection {

        /* JADX INFO: renamed from: l.sjq0$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ IBinder f164896a;

            public a(IBinder iBinder) {
                this.f164896a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    sjq0.this.f164891d = C19966c.m184546a(this.f164896a);
                    sjq0.this.f164892e = C19966c.m184547b(this.f164896a);
                    sjq0.this.m184545i();
                    sjq0.this.f164890c = 2;
                    synchronized (sjq0.this.f164894g) {
                        try {
                            sjq0.this.f164894g.notifyAll();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    sjq0.this.m184545i();
                    sjq0.this.f164890c = 2;
                    synchronized (sjq0.this.f164894g) {
                        try {
                            sjq0.this.f164894g.notifyAll();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (Throwable th) {
                    sjq0.this.m184545i();
                    sjq0.this.f164890c = 2;
                    synchronized (sjq0.this.f164894g) {
                        try {
                            sjq0.this.f164894g.notifyAll();
                        } catch (Exception unused4) {
                        }
                        throw th;
                    }
                }
            }
        }

        private ServiceConnectionC19965b() {
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

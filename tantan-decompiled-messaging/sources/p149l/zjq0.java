package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
class zjq0 implements tjq0 {

    /* JADX INFO: renamed from: f */
    private static boolean f203450f;

    /* JADX INFO: renamed from: a */
    private Context f203451a;

    /* JADX INFO: renamed from: b */
    private ServiceConnection f203452b;

    /* JADX INFO: renamed from: c */
    private volatile int f203453c = 0;

    /* JADX INFO: renamed from: d */
    private volatile C21718b f203454d = null;

    /* JADX INFO: renamed from: e */
    private final Object f203455e = new Object();

    /* JADX INFO: renamed from: l.zjq0$b */
    public class C21718b {

        /* JADX INFO: renamed from: a */
        String f203456a;

        /* JADX INFO: renamed from: b */
        String f203457b;

        /* JADX INFO: renamed from: c */
        String f203458c;

        /* JADX INFO: renamed from: d */
        String f203459d;

        private C21718b() {
            this.f203456a = null;
            this.f203457b = null;
            this.f203458c = null;
            this.f203459d = null;
        }
    }

    /* JADX INFO: renamed from: l.zjq0$d */
    public static class C21720d {
        /* JADX INFO: renamed from: a */
        public static String m219146a(IBinder iBinder, String str, String str2, String str3) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public zjq0(Context context) {
        this.f203451a = context;
        m219140g();
    }

    /* JADX INFO: renamed from: g */
    private void m219140g() {
        boolean zBindService;
        this.f203452b = new ServiceConnectionC21719c();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            zBindService = this.f203451a.bindService(intent, this.f203452b, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f203453c = zBindService ? 1 : 2;
    }

    /* JADX INFO: renamed from: h */
    private void m219141h(String str) {
        if (this.f203453c != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f203455e) {
            try {
                ilq0.m137040m("oppo's " + str + " wait...");
                this.f203455e.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m219143j(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f203450f = longVersionCode >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public String m219144k() {
        try {
            Signature[] signatureArr = this.f203451a.getPackageManager().getPackageInfo(this.f203451a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m219145l() {
        ServiceConnection serviceConnection = this.f203452b;
        if (serviceConnection != null) {
            try {
                this.f203451a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public String mo97174a() {
        m219141h("getOAID");
        if (this.f203454d == null) {
            return null;
        }
        return this.f203454d.f203457b;
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public boolean mo97175a() {
        return f203450f;
    }

    /* JADX INFO: renamed from: l.zjq0$c */
    public class ServiceConnectionC21719c implements ServiceConnection {

        /* JADX INFO: renamed from: l.zjq0$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ IBinder f203462a;

            public a(IBinder iBinder) {
                this.f203462a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String packageName = zjq0.this.f203451a.getPackageName();
                    String strM219144k = zjq0.this.m219144k();
                    C21718b c21718b = new C21718b();
                    c21718b.f203457b = C21720d.m219146a(this.f203462a, packageName, strM219144k, "OUID");
                    zjq0.this.f203454d = c21718b;
                    zjq0.this.m219145l();
                    zjq0.this.f203453c = 2;
                    synchronized (zjq0.this.f203455e) {
                        try {
                            zjq0.this.f203455e.notifyAll();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    zjq0.this.m219145l();
                    zjq0.this.f203453c = 2;
                    synchronized (zjq0.this.f203455e) {
                        try {
                            zjq0.this.f203455e.notifyAll();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (Throwable th) {
                    zjq0.this.m219145l();
                    zjq0.this.f203453c = 2;
                    synchronized (zjq0.this.f203455e) {
                        try {
                            zjq0.this.f203455e.notifyAll();
                        } catch (Exception unused4) {
                        }
                        throw th;
                    }
                }
            }
        }

        private ServiceConnectionC21719c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (zjq0.this.f203454d != null) {
                return;
            }
            new Thread(new a(iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

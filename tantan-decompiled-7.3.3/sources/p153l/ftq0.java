package p153l;

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
class ftq0 implements zsq0 {

    /* JADX INFO: renamed from: f */
    private static boolean f100788f;

    /* JADX INFO: renamed from: a */
    private Context f100789a;

    /* JADX INFO: renamed from: b */
    private ServiceConnection f100790b;

    /* JADX INFO: renamed from: c */
    private volatile int f100791c = 0;

    /* JADX INFO: renamed from: d */
    private volatile C17073b f100792d = null;

    /* JADX INFO: renamed from: e */
    private final Object f100793e = new Object();

    /* JADX INFO: renamed from: l.ftq0$b */
    public class C17073b {

        /* JADX INFO: renamed from: a */
        String f100794a;

        /* JADX INFO: renamed from: b */
        String f100795b;

        /* JADX INFO: renamed from: c */
        String f100796c;

        /* JADX INFO: renamed from: d */
        String f100797d;

        private C17073b() {
            this.f100794a = null;
            this.f100795b = null;
            this.f100796c = null;
            this.f100797d = null;
        }
    }

    /* JADX INFO: renamed from: l.ftq0$d */
    public static class C17075d {
        /* JADX INFO: renamed from: a */
        public static String m127398a(IBinder iBinder, String str, String str2, String str3) {
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

    public ftq0(Context context) {
        this.f100789a = context;
        m127392g();
    }

    /* JADX INFO: renamed from: g */
    private void m127392g() {
        boolean zBindService;
        this.f100790b = new ServiceConnectionC17074c();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        try {
            zBindService = this.f100789a.bindService(intent, this.f100790b, 1);
        } catch (Exception unused) {
            zBindService = false;
        }
        this.f100791c = zBindService ? 1 : 2;
    }

    /* JADX INFO: renamed from: h */
    private void m127393h(String str) {
        if (this.f100791c != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f100793e) {
            try {
                ouq0.m169393m("oppo's " + str + " wait...");
                this.f100793e.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m127395j(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f100788f = longVersionCode >= 1;
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
    public String m127396k() {
        try {
            Signature[] signatureArr = this.f100789a.getPackageManager().getPackageInfo(this.f100789a.getPackageName(), 64).signatures;
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
    public void m127397l() {
        ServiceConnection serviceConnection = this.f100790b;
        if (serviceConnection != null) {
            try {
                this.f100789a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public String mo100236a() {
        m127393h("getOAID");
        if (this.f100792d == null) {
            return null;
        }
        return this.f100792d.f100795b;
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public boolean mo100237a() {
        return f100788f;
    }

    /* JADX INFO: renamed from: l.ftq0$c */
    public class ServiceConnectionC17074c implements ServiceConnection {

        /* JADX INFO: renamed from: l.ftq0$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ IBinder f100800a;

            public a(IBinder iBinder) {
                this.f100800a = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String packageName = ftq0.this.f100789a.getPackageName();
                    String strM127396k = ftq0.this.m127396k();
                    C17073b c17073b = new C17073b();
                    c17073b.f100795b = C17075d.m127398a(this.f100800a, packageName, strM127396k, "OUID");
                    ftq0.this.f100792d = c17073b;
                    ftq0.this.m127397l();
                    ftq0.this.f100791c = 2;
                    synchronized (ftq0.this.f100793e) {
                        try {
                            ftq0.this.f100793e.notifyAll();
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    ftq0.this.m127397l();
                    ftq0.this.f100791c = 2;
                    synchronized (ftq0.this.f100793e) {
                        try {
                            ftq0.this.f100793e.notifyAll();
                        } catch (Exception unused3) {
                        }
                    }
                } catch (Throwable th) {
                    ftq0.this.m127397l();
                    ftq0.this.f100791c = 2;
                    synchronized (ftq0.this.f100793e) {
                        try {
                            ftq0.this.f100793e.notifyAll();
                        } catch (Exception unused4) {
                        }
                        throw th;
                    }
                }
            }
        }

        private ServiceConnectionC17074c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ftq0.this.f100792d != null) {
                return;
            }
            new Thread(new a(iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

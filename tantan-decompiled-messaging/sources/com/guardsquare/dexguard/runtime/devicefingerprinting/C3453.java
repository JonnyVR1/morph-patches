package com.guardsquare.dexguard.runtime.devicefingerprinting;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.LinkedBlockingQueue;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.AlertDescription;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.Ι */
/* JADX INFO: loaded from: classes7.dex */
final class C3453 {

    /* JADX INFO: renamed from: ˋ */
    private static int f11806 = 0;

    /* JADX INFO: renamed from: ॱ */
    private static int f11808 = 1;

    /* JADX INFO: renamed from: ˏ */
    private static final byte[] f11807 = {42, 97, -55, 88, -12, 11, -13, 4, 7, 6, 55, -52, -11, 2, -5, Tnaf.POW_2_WIDTH, -8, -5, 71, -20, -43, 2, -5, Tnaf.POW_2_WIDTH, -18, 5, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -50, -12, 11, -13, 4, 7, 6, 55, -56, -5, -5, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -50, -12, 11, -13, 4, 7, 6, 55, -56, -5, -5, 70, -50, -2, -14, 70, -58, 6, 0, -8, -5, 12, 4, -2, 5, -12, 69, PSSSigner.TRAILER_IMPLICIT, 15, -12, -3, 14, 7, -1, 56, -36, 0, 20, -16, -1, -11, 3, 64, -50, -12, 11, -13, 4, 7, 6, 55, -71, 18, -8, 11, -4, -4, 8, 3, -14, 37, -16, -1, -7, 11, -5, 3, 25, -19, -12, 14, -5, 3, -12};

    /* JADX INFO: renamed from: ˊ */
    private static int f11805 = 130;

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.Ι$ı, reason: contains not printable characters */
    public static class C22687 implements IInterface {

        /* JADX INFO: renamed from: ˋ */
        private static int f11809 = 0;

        /* JADX INFO: renamed from: ˎ */
        private static final byte[] f11810 = {30, 53, -82, 52, -17, -3, HttpTokens.COLON, -62, -13, -5, 3, -10, 2, 50, -56, -18, 5, -19, -2, 1, 0, 49, -62, -11, -11, 64, -56, -8, -20, 64, -64, 0, -6, -14, -11, 6, -2, -8, -1, -18, Utf8.REPLACEMENT_BYTE, -64, -10, -11, 10, -18, -1, 8, -16, 57, -32, 3, -40, -23, 12, -18, -7, 6, -15, 5, -10, 2, 25, -32, 12, -23, -18, -9, 8, 1, -7};

        /* JADX INFO: renamed from: ॱ */
        private static int f11811 = 1;

        /* JADX INFO: renamed from: ˏ */
        private IBinder f11812;

        public C22687(IBinder iBinder) {
            this.f11812 = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            int i = (f11809 + 111) % 128;
            f11811 = i;
            IBinder iBinder = this.f11812;
            f11809 = ((i & 41) + (i | 41)) % 128;
            return iBinder;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0050 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:3:0x0010, B:9:0x004c, B:11:0x0050, B:14:0x0065, B:15:0x0074, B:20:0x0081, B:21:0x0091), top: B:26:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0065 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #0 {all -> 0x007f, blocks: (B:3:0x0010, B:9:0x004c, B:11:0x0050, B:14:0x0065, B:15:0x0074, B:20:0x0081, B:21:0x0091), top: B:26:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0081 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #0 {all -> 0x007f, blocks: (B:3:0x0010, B:9:0x004c, B:11:0x0050, B:14:0x0065, B:15:0x0074, B:20:0x0081, B:21:0x0091), top: B:26:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0091 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:3:0x0010, B:9:0x004c, B:11:0x0050, B:14:0x0065, B:15:0x0074, B:20:0x0081, B:21:0x0091), top: B:26:0x0010 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:23:0x00a9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x0091
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: ˏ */
        public final java.lang.String m17458() throws android.os.RemoteException {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3453.C22687.m17458():java.lang.String");
        }
    }

    /* JADX INFO: renamed from: ˎ */
    public static String m17456(Context context) throws Throwable {
        f11808 = (f11806 + 33) % 128;
        try {
            byte[] bArr = f11807;
            ((PackageManager) Class.forName(m17457((short) 28, AlertDescription.certificate_unobtainable, bArr[75])).getMethod(m17457((short) 34, bArr[75], bArr[27]), null).invoke(context, null)).getPackageInfo(m17457((byte) (f11805 >>> 2), bArr[109], bArr[31]), 0);
            Intent intent = new Intent(m17457(bArr[75], (byte) (-bArr[84]), bArr[31]));
            byte b = bArr[3];
            intent.setPackage(m17457((short) 29, (byte) ((b ^ 1) + ((b & 1) << 1)), bArr[31]));
            ServiceConnectionC22688 serviceConnectionC22688 = new ServiceConnectionC22688((byte) 0);
            try {
                if (context.bindService(intent, serviceConnectionC22688, 1)) {
                    String strM17458 = new C22687(serviceConnectionC22688.m17459()).m17458();
                    context.unbindService(serviceConnectionC22688);
                    f11806 = (f11808 + 93) % 128;
                    return strM17458;
                }
                context.unbindService(serviceConnectionC22688);
                int i = (f11806 + 11) % 128;
                f11808 = i;
                int i2 = i + 99;
                f11806 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 75 / 0;
                }
                return null;
            } catch (Throwable th) {
                context.unbindService(serviceConnectionC22688);
                throw th;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e A[PHI: r1 r6 r7 r8
      0x002e: PHI (r1v3 int) = (r1v2 int), (r1v12 int) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r6v2 int) = (r6v1 int), (r6v13 int) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r7v2 byte[]) = (r7v1 byte[]), (r7v10 byte[]) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r8v3 byte[]) = (r8v2 byte[]), (r8v11 byte[]) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e A[PHI: r1 r3 r6 r7 r8
      0x001e: PHI (r1v10 int) = (r1v2 int), (r1v12 int) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r3v8 int) = (r3v0 int), (r3v11 int) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r6v11 int) = (r6v1 int), (r6v13 int) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r7v9 byte[]) = (r7v1 byte[]), (r7v10 byte[]) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r8v10 byte[]) = (r8v2 byte[]), (r8v11 byte[]) binds: [B:9:0x002c, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ॱ */
    private static String m17457(short s, short s2, short s3) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        int i4;
        int i5 = f11806;
        int i6 = i5 + 119;
        f11808 = i6 % 128;
        if (i6 % 2 == 0) {
            i = 20 % s;
            i2 = 40 << s2;
            bArr = f11807;
            i3 = (3 % s3) + 106;
            bArr2 = new byte[i];
            if (bArr == null) {
                f11808 = (i5 + 27) % 128;
                int i7 = i;
                i3 = (i7 - i2) + 1;
                i2 = i2;
                bArr = bArr;
                bArr2 = bArr2;
                i4 = 0;
                i = i7;
            } else {
                i4 = 0;
            }
        } else {
            i = 51 - s;
            i2 = 114 - s2;
            bArr = f11807;
            i3 = (s3 * 2) + 97;
            bArr2 = new byte[i];
            if (bArr == null) {
                f11808 = (i5 + 27) % 128;
                int i8 = i;
                i3 = (i8 - i2) + 1;
                i2 = i2;
                bArr = bArr;
                bArr2 = bArr2;
                i4 = 0;
                i = i8;
            } else {
                i4 = 0;
            }
        }
        while (true) {
            bArr2[i4] = (byte) i3;
            int i9 = i4 + 1;
            if (i9 == i) {
                return new String(bArr2, 0).intern();
            }
            int i10 = i2 + 1;
            byte[] bArr3 = bArr;
            int i11 = i;
            byte[] bArr4 = bArr2;
            i3 = (i3 - bArr[i10]) + 1;
            i2 = i10;
            bArr = bArr3;
            bArr2 = bArr4;
            i4 = i9;
            i = i11;
        }
    }

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.Ι$ɩ, reason: contains not printable characters */
    public static class ServiceConnectionC22688 implements ServiceConnection {

        /* JADX INFO: renamed from: ˋ */
        private static int f11813 = 0;

        /* JADX INFO: renamed from: ˏ */
        private static int f11814 = 1;

        /* JADX INFO: renamed from: ˊ */
        private final LinkedBlockingQueue<IBinder> f11815;

        private ServiceConnectionC22688() {
            this.f11815 = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            int i = f11814 + 17;
            f11813 = i % 128;
            int i2 = i % 2;
            LinkedBlockingQueue<IBinder> linkedBlockingQueue = this.f11815;
            try {
                if (i2 == 0) {
                    linkedBlockingQueue.put(iBinder);
                } else {
                    linkedBlockingQueue.put(iBinder);
                    throw null;
                }
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            int i = f11813;
            int i2 = (i ^ 117) + ((i & 117) << 1);
            f11814 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: ˋ */
        public final IBinder m17459() throws InterruptedException {
            int i = f11814 + 109;
            f11813 = i % 128;
            int i2 = i % 2;
            IBinder iBinderTake = this.f11815.take();
            if (i2 != 0) {
                throw null;
            }
            int i3 = f11814;
            f11813 = ((i3 ^ 5) + ((i3 & 5) << 1)) % 128;
            return iBinderTake;
        }

        public /* synthetic */ ServiceConnectionC22688(byte b) {
            this();
        }
    }
}

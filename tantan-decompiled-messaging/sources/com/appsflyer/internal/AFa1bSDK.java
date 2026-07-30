package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.qkq0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFa1bSDK {

    public static final class AFa1uSDK {
        private final boolean getCurrencyIso4217Code;
        public final String getRevenue;

        public AFa1uSDK(String str, boolean z) {
            this.getRevenue = str;
            this.getCurrencyIso4217Code = z;
        }

        public final boolean getCurrencyIso4217Code() {
            return this.getCurrencyIso4217Code;
        }
    }

    public static final class AFa1zSDK implements IInterface {
        private final IBinder getMediationNetwork;

        public AFa1zSDK(IBinder iBinder) {
            this.getMediationNetwork = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getMediationNetwork;
        }

        public final String getCurrencyIso4217Code() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getMediationNetwork.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean getMediationNetwork() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.getMediationNetwork.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static AFa1uSDK getRevenue(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            qkq0.m175383a("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1ySDK aFa1ySDK = new AFa1ySDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1ySDK, 1)) {
                context.unbindService(aFa1ySDK);
                rhg0.m179353a("Google Play connection failed");
                return null;
            }
            if (aFa1ySDK.getRevenue) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1ySDK.getRevenue = true;
            IBinder iBinderPoll = aFa1ySDK.getMonetizationNetwork.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1zSDK aFa1zSDK = new AFa1zSDK(iBinderPoll);
            AFa1uSDK aFa1uSDK = new AFa1uSDK(aFa1zSDK.getCurrencyIso4217Code(), aFa1zSDK.getMediationNetwork());
            context.unbindService(aFa1ySDK);
            return aFa1uSDK;
        } catch (Throwable th) {
            context.unbindService(aFa1ySDK);
            throw th;
        }
    }

    public static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> getMonetizationNetwork;
        boolean getRevenue;

        private AFa1ySDK() {
            this.getMonetizationNetwork = new LinkedBlockingQueue<>(1);
            this.getRevenue = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.getMonetizationNetwork.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ AFa1ySDK(byte b) {
            this();
        }
    }
}

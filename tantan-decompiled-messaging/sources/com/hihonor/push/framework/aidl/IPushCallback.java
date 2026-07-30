package com.hihonor.push.framework.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public interface IPushCallback extends IInterface {

    public static class Default implements IPushCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.hihonor.push.framework.aidl.IPushCallback
        public void onResult(DataBuffer dataBuffer) {
        }
    }

    public static abstract class Stub extends Binder implements IPushCallback {
        private static final String DESCRIPTOR = "com.hihonor.push.framework.aidl.IPushCallback";
        public static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IPushCallback {
            public static IPushCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.hihonor.push.framework.aidl.IPushCallback
            public void onResult(DataBuffer dataBuffer) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (dataBuffer != null) {
                        parcelObtain.writeInt(1);
                        dataBuffer.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onResult(dataBuffer);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPushCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPushCallback)) ? new Proxy(iBinder) : (IPushCallback) iInterfaceQueryLocalInterface;
        }

        public static IPushCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPushCallback iPushCallback) {
            if (Proxy.sDefaultImpl != null) {
                qkq0.m175383a("setDefaultImpl() called twice");
                return false;
            }
            if (iPushCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPushCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onResult(parcel.readInt() != 0 ? DataBuffer.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(DataBuffer dataBuffer);
}

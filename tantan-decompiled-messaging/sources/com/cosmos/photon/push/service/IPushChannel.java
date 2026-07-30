package com.cosmos.photon.push.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IPushChannel extends IInterface {

    public static class Default implements IPushChannel {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.cosmos.photon.push.service.IPushChannel
        public Bundle executeAction(Bundle bundle, String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IPushChannel {
        private static final String DESCRIPTOR = "com.cosmos.photon.push.service.IPushChannel";
        static final int TRANSACTION_executeAction = 1;

        public static class Proxy implements IPushChannel {
            public static IPushChannel sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.cosmos.photon.push.service.IPushChannel
            public Bundle executeAction(Bundle bundle, String str) throws RemoteException {
                Bundle bundleExecuteAction;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        bundleExecuteAction = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        bundleExecuteAction = Stub.getDefaultImpl().executeAction(bundle, str);
                    }
                    return bundleExecuteAction;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPushChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPushChannel)) ? new Proxy(iBinder) : (IPushChannel) iInterfaceQueryLocalInterface;
        }

        public static IPushChannel getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPushChannel iPushChannel) {
            if (Proxy.sDefaultImpl != null || iPushChannel == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPushChannel;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            Bundle bundleExecuteAction = executeAction(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            parcel2.writeNoException();
            if (bundleExecuteAction != null) {
                parcel2.writeInt(1);
                bundleExecuteAction.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    Bundle executeAction(Bundle bundle, String str) throws RemoteException;
}

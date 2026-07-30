package com.huawei.multimedia.liteav.audioengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface IHwAudioKaraokeFeature extends IInterface {

    public static abstract class Stub extends Binder implements IHwAudioKaraokeFeature {
        private static final String DESCRIPTOR = "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature";
        static final int TRANSACTION_enableKaraokeFeature = 2;
        static final int TRANSACTION_getKaraokeLatency = 3;
        static final int TRANSACTION_init = 5;
        static final int TRANSACTION_isKaraokeFeatureSupport = 1;
        static final int TRANSACTION_setParameter = 4;

        public static class Proxy implements IHwAudioKaraokeFeature {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioKaraokeFeature
            public int enableKaraokeFeature(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioKaraokeFeature
            public int getKaraokeLatency() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioKaraokeFeature
            public void init(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioKaraokeFeature
            public boolean isKaraokeFeatureSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioKaraokeFeature
            public int setParameter(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IHwAudioKaraokeFeature asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHwAudioKaraokeFeature)) ? new Proxy(iBinder) : (IHwAudioKaraokeFeature) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsKaraokeFeatureSupport = isKaraokeFeatureSupport();
                parcel2.writeNoException();
                parcel2.writeInt(zIsKaraokeFeatureSupport ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                int iEnableKaraokeFeature = enableKaraokeFeature(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(iEnableKaraokeFeature);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                int karaokeLatency = getKaraokeLatency();
                parcel2.writeNoException();
                parcel2.writeInt(karaokeLatency);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                int parameter = setParameter(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(parameter);
                return true;
            }
            if (i != 5) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            init(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    int enableKaraokeFeature(boolean z) throws RemoteException;

    int getKaraokeLatency() throws RemoteException;

    void init(String str) throws RemoteException;

    boolean isKaraokeFeatureSupport() throws RemoteException;

    int setParameter(String str, int i) throws RemoteException;
}

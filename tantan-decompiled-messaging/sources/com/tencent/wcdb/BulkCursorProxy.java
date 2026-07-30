package com.tencent.wcdb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class BulkCursorProxy implements IBulkCursor {
    private Bundle mExtras = null;
    private IBinder mRemote;

    public BulkCursorProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void close() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
            DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void deactivate() throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
            this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
            DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public Bundle getExtras() throws RemoteException {
        if (this.mExtras == null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
                this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                DatabaseUtils.readExceptionFromParcel(parcelObtain2);
                this.mExtras = parcelObtain2.readBundle(BulkCursorProxy.class.getClassLoader());
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
        return this.mExtras;
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public CursorWindow getWindow(int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
            parcelObtain.writeInt(i);
            this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
            DatabaseUtils.readExceptionFromParcel(parcelObtain2);
            return parcelObtain2.readInt() == 1 ? CursorWindow.newFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public void onMove(int i) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
            parcelObtain.writeInt(i);
            this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
            DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public int requery(IContentObserver iContentObserver) throws RemoteException {
        int i;
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
            parcelObtain.writeStrongInterface(iContentObserver);
            boolean zTransact = this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
            DatabaseUtils.readExceptionFromParcel(parcelObtain2);
            if (zTransact) {
                int i2 = parcelObtain2.readInt();
                this.mExtras = parcelObtain2.readBundle(BulkCursorProxy.class.getClassLoader());
                i = i2;
            } else {
                i = -1;
            }
            return i;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // com.tencent.wcdb.IBulkCursor
    public Bundle respond(Bundle bundle) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IBulkCursor.descriptor);
            parcelObtain.writeBundle(bundle);
            this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
            DatabaseUtils.readExceptionFromParcel(parcelObtain2);
            return parcelObtain2.readBundle(BulkCursorProxy.class.getClassLoader());
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}

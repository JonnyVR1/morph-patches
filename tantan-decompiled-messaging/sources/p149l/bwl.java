package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
class bwl implements dwl {

    /* JADX INFO: renamed from: a */
    private IBinder f77628a;

    public bwl(IBinder iBinder) {
        this.f77628a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f77628a;
    }

    @Override // p149l.dwl
    /* JADX INFO: renamed from: i3 */
    public void mo104159i3(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.mcs.aidl.IMcsSdkService");
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f77628a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

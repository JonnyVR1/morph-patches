package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
class tyl implements vyl {

    /* JADX INFO: renamed from: a */
    private IBinder f176685a;

    public tyl(IBinder iBinder) {
        this.f176685a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f176685a;
    }

    @Override // p153l.vyl
    /* JADX INFO: renamed from: i3 */
    public void mo193597i3(Bundle bundle) {
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
            this.f176685a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

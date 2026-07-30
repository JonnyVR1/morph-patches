package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0035a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.a$a */
    public static abstract class a extends Binder implements InterfaceC0035a {

        /* JADX INFO: renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        public static class C22765a implements InterfaceC0035a {

            /* JADX INFO: renamed from: a */
            public IBinder f54a;

            public C22765a(IBinder iBinder) {
                this.f54a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f54a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC0035a m147O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0035a)) ? new C22765a(iBinder) : (InterfaceC0035a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    onEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo88w1();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo102l8(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo89x5(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo85Q0(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo87q7(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo84N6(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo86n6(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo104u0(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo103o7(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo101d7(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo100P5(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo99M0();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    void mo99M0() throws RemoteException;

    /* JADX INFO: renamed from: N6 */
    void mo84N6(Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: P5 */
    void mo100P5(int i) throws RemoteException;

    /* JADX INFO: renamed from: Q0 */
    void mo85Q0(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    /* JADX INFO: renamed from: d7 */
    void mo101d7(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: l8 */
    void mo102l8(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* JADX INFO: renamed from: n6 */
    void mo86n6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* JADX INFO: renamed from: o7 */
    void mo103o7(boolean z) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: q7 */
    void mo87q7(CharSequence charSequence) throws RemoteException;

    /* JADX INFO: renamed from: u0 */
    void mo104u0(int i) throws RemoteException;

    /* JADX INFO: renamed from: w1 */
    void mo88w1() throws RemoteException;

    /* JADX INFO: renamed from: x5 */
    void mo89x5(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;
}

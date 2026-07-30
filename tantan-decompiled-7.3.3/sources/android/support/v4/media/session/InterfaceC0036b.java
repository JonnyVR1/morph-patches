package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.media.session.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0036b extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC0036b {

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C22766a implements InterfaceC0036b {

            /* JADX INFO: renamed from: b */
            public static InterfaceC0036b f55b;

            /* JADX INFO: renamed from: a */
            public IBinder f56a;

            public C22766a(IBinder iBinder) {
                this.f56a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0036b
            /* JADX INFO: renamed from: C2 */
            public void mo150C2(InterfaceC0035a interfaceC0035a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC0035a != null ? interfaceC0035a.asBinder() : null);
                    if (this.f56a.transact(3, parcelObtain, parcelObtain2, 0) || a.m185P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m185P2().mo150C2(interfaceC0035a);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f56a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* JADX INFO: renamed from: O */
        public static InterfaceC0036b m184O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0036b)) ? new C22766a(iBinder) : (InterfaceC0036b) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static InterfaceC0036b m185P2() {
            return C22766a.f55b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m163P1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM178r5 = m178r5(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zM178r5 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo150C2(InterfaceC0035a.a.m147O(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m171e3(InterfaceC0035a.a.m147O(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM160M2 = m160M2();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM160M2 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strM177o2 = m177o2();
                    parcel2.writeNoException();
                    parcel2.writeString(strM177o2);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentM155H0 = m155H0();
                    parcel2.writeNoException();
                    if (pendingIntentM155H0 != null) {
                        parcel2.writeInt(1);
                        pendingIntentM155H0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long flags = getFlags();
                    parcel2.writeNoException();
                    parcel2.writeLong(flags);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo parcelableVolumeInfoM174g4 = m174g4();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoM174g4 != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoM174g4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m179r7(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m183y6(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m170c1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m172f5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m175h5(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m173f6(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m169a7();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m164Q1();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m182w6(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m148A0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    if (metadata != null) {
                        parcel2.writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    if (playbackState != null) {
                        parcel2.writeInt(1);
                        playbackState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> listM162N7 = m162N7();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listM162N7);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceM167a3 = m167a3();
                    parcel2.writeNoException();
                    if (charSequenceM167a3 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceM167a3, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iM161M4 = m161M4();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM161M4);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m165V0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m156H6(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m154F0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int repeatMode = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM152D0 = m152D0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM152D0 ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m166Y1(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m151C6(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m181w5(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m149A6(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m157J1(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM158K1 = m158K1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM158K1 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m153E3(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iM159K5 = m159K5();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM159K5);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m176i6(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleM168a5 = m168a5();
                    parcel2.writeNoException();
                    if (bundleM168a5 != null) {
                        parcel2.writeInt(1);
                        bundleM168a5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m180u1(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    void m148A0(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: A6 */
    void m149A6(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: C2 */
    void mo150C2(InterfaceC0035a interfaceC0035a) throws RemoteException;

    /* JADX INFO: renamed from: C6 */
    void m151C6(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: D0 */
    boolean m152D0() throws RemoteException;

    /* JADX INFO: renamed from: E3 */
    void m153E3(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: F0 */
    void m154F0(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: H0 */
    PendingIntent m155H0() throws RemoteException;

    /* JADX INFO: renamed from: H6 */
    void m156H6(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: J1 */
    void m157J1(int i) throws RemoteException;

    /* JADX INFO: renamed from: K1 */
    boolean m158K1() throws RemoteException;

    /* JADX INFO: renamed from: K5 */
    int m159K5() throws RemoteException;

    /* JADX INFO: renamed from: M2 */
    boolean m160M2() throws RemoteException;

    /* JADX INFO: renamed from: M4 */
    int m161M4() throws RemoteException;

    /* JADX INFO: renamed from: N7 */
    List<MediaSessionCompat.QueueItem> m162N7() throws RemoteException;

    /* JADX INFO: renamed from: P1 */
    void m163P1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* JADX INFO: renamed from: Q1 */
    void m164Q1() throws RemoteException;

    /* JADX INFO: renamed from: V0 */
    void m165V0(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Y1 */
    void m166Y1(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: a3 */
    CharSequence m167a3() throws RemoteException;

    /* JADX INFO: renamed from: a5 */
    Bundle m168a5() throws RemoteException;

    /* JADX INFO: renamed from: a7 */
    void m169a7() throws RemoteException;

    /* JADX INFO: renamed from: c1 */
    void m170c1(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: e3 */
    void m171e3(InterfaceC0035a interfaceC0035a) throws RemoteException;

    /* JADX INFO: renamed from: f5 */
    void m172f5(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: f6 */
    void m173f6(long j) throws RemoteException;

    /* JADX INFO: renamed from: g4 */
    ParcelableVolumeInfo m174g4() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    long getFlags() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    String getTag() throws RemoteException;

    /* JADX INFO: renamed from: h5 */
    void m175h5(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: i6 */
    void m176i6(int i) throws RemoteException;

    void next() throws RemoteException;

    /* JADX INFO: renamed from: o2 */
    String m177o2() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    /* JADX INFO: renamed from: r5 */
    boolean m178r5(KeyEvent keyEvent) throws RemoteException;

    /* JADX INFO: renamed from: r7 */
    void m179r7(int i, int i2, String str) throws RemoteException;

    void seekTo(long j) throws RemoteException;

    void setPlaybackSpeed(float f) throws RemoteException;

    void setRepeatMode(int i) throws RemoteException;

    void stop() throws RemoteException;

    /* JADX INFO: renamed from: u1 */
    void m180u1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: w5 */
    void m181w5(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* JADX INFO: renamed from: w6 */
    void m182w6(RatingCompat ratingCompat) throws RemoteException;

    /* JADX INFO: renamed from: y6 */
    void m183y6(int i, int i2, String str) throws RemoteException;
}

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
public interface InterfaceC0035b extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.b$a */
    public static abstract class a extends Binder implements InterfaceC0035b {

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        public static class C22651a implements InterfaceC0035b {

            /* JADX INFO: renamed from: b */
            public static InterfaceC0035b f55b;

            /* JADX INFO: renamed from: a */
            public IBinder f56a;

            public C22651a(IBinder iBinder) {
                this.f56a = iBinder;
            }

            @Override // android.support.v4.media.session.InterfaceC0035b
            /* JADX INFO: renamed from: C2 */
            public void mo149C2(InterfaceC0034a interfaceC0034a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(interfaceC0034a != null ? interfaceC0034a.asBinder() : null);
                    if (this.f56a.transact(3, parcelObtain, parcelObtain2, 0) || a.m184P2() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m184P2().mo149C2(interfaceC0034a);
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
        public static InterfaceC0035b m183O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0035b)) ? new C22651a(iBinder) : (InterfaceC0035b) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: P2 */
        public static InterfaceC0035b m184P2() {
            return C22651a.f55b;
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
                    m162P1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM177r5 = m177r5(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zM177r5 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo149C2(InterfaceC0034a.a.m146O(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m170e3(InterfaceC0034a.a.m146O(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM159M2 = m159M2();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM159M2 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strM176o2 = m176o2();
                    parcel2.writeNoException();
                    parcel2.writeString(strM176o2);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentM154H0 = m154H0();
                    parcel2.writeNoException();
                    if (pendingIntentM154H0 != null) {
                        parcel2.writeInt(1);
                        pendingIntentM154H0.writeToParcel(parcel2, 1);
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
                    ParcelableVolumeInfo parcelableVolumeInfoM173g4 = m173g4();
                    parcel2.writeNoException();
                    if (parcelableVolumeInfoM173g4 != null) {
                        parcel2.writeInt(1);
                        parcelableVolumeInfoM173g4.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m178r7(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m182y6(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m169c1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m171f5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m174h5(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m172f6(parcel.readLong());
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
                    m168a7();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m163Q1();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    seekTo(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m181w6(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m147A0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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
                    List<MediaSessionCompat.QueueItem> listM161N7 = m161N7();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listM161N7);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceM166a3 = m166a3();
                    parcel2.writeNoException();
                    if (charSequenceM166a3 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(charSequenceM166a3, parcel2, 1);
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
                    int iM160M4 = m160M4();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM160M4);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m164V0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m155H6(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m153F0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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
                    boolean zM151D0 = m151D0();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM151D0 ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m165Y1(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m150C6(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m180w5(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m148A6(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m156J1(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zM157K1 = m157K1();
                    parcel2.writeNoException();
                    parcel2.writeInt(zM157K1 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m152E3(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iM158K5 = m158K5();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM158K5);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m175i6(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    setPlaybackSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleM167a5 = m167a5();
                    parcel2.writeNoException();
                    if (bundleM167a5 != null) {
                        parcel2.writeInt(1);
                        bundleM167a5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m179u1(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    void m147A0(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: A6 */
    void m148A6(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: C2 */
    void mo149C2(InterfaceC0034a interfaceC0034a) throws RemoteException;

    /* JADX INFO: renamed from: C6 */
    void m150C6(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* JADX INFO: renamed from: D0 */
    boolean m151D0() throws RemoteException;

    /* JADX INFO: renamed from: E3 */
    void m152E3(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: F0 */
    void m153F0(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: H0 */
    PendingIntent m154H0() throws RemoteException;

    /* JADX INFO: renamed from: H6 */
    void m155H6(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: J1 */
    void m156J1(int i) throws RemoteException;

    /* JADX INFO: renamed from: K1 */
    boolean m157K1() throws RemoteException;

    /* JADX INFO: renamed from: K5 */
    int m158K5() throws RemoteException;

    /* JADX INFO: renamed from: M2 */
    boolean m159M2() throws RemoteException;

    /* JADX INFO: renamed from: M4 */
    int m160M4() throws RemoteException;

    /* JADX INFO: renamed from: N7 */
    List<MediaSessionCompat.QueueItem> m161N7() throws RemoteException;

    /* JADX INFO: renamed from: P1 */
    void m162P1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* JADX INFO: renamed from: Q1 */
    void m163Q1() throws RemoteException;

    /* JADX INFO: renamed from: V0 */
    void m164V0(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: Y1 */
    void m165Y1(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: a3 */
    CharSequence m166a3() throws RemoteException;

    /* JADX INFO: renamed from: a5 */
    Bundle m167a5() throws RemoteException;

    /* JADX INFO: renamed from: a7 */
    void m168a7() throws RemoteException;

    /* JADX INFO: renamed from: c1 */
    void m169c1(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: e3 */
    void m170e3(InterfaceC0034a interfaceC0034a) throws RemoteException;

    /* JADX INFO: renamed from: f5 */
    void m171f5(String str, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: f6 */
    void m172f6(long j) throws RemoteException;

    /* JADX INFO: renamed from: g4 */
    ParcelableVolumeInfo m173g4() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    long getFlags() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    String getTag() throws RemoteException;

    /* JADX INFO: renamed from: h5 */
    void m174h5(Uri uri, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: i6 */
    void m175i6(int i) throws RemoteException;

    void next() throws RemoteException;

    /* JADX INFO: renamed from: o2 */
    String m176o2() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    /* JADX INFO: renamed from: r5 */
    boolean m177r5(KeyEvent keyEvent) throws RemoteException;

    /* JADX INFO: renamed from: r7 */
    void m178r7(int i, int i2, String str) throws RemoteException;

    void seekTo(long j) throws RemoteException;

    void setPlaybackSpeed(float f) throws RemoteException;

    void setRepeatMode(int i) throws RemoteException;

    void stop() throws RemoteException;

    /* JADX INFO: renamed from: u1 */
    void m179u1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* JADX INFO: renamed from: w5 */
    void m180w5(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* JADX INFO: renamed from: w6 */
    void m181w6(RatingCompat ratingCompat) throws RemoteException;

    /* JADX INFO: renamed from: y6 */
    void m182y6(int i, int i2, String str) throws RemoteException;
}

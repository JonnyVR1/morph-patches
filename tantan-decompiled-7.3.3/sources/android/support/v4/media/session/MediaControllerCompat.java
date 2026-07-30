package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p153l.cg60;
import p153l.wg3;
import p153l.wi3;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0024b f36a;

    /* JADX INFO: renamed from: b */
    public final MediaSessionCompat.Token f37b;

    /* JADX INFO: renamed from: c */
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<AbstractC0023a, Boolean> f38c = new ConcurrentHashMap<>();

    @RequiresApi(21)
    public static class MediaControllerImplApi21 implements InterfaceC0024b {

        /* JADX INFO: renamed from: a */
        public final MediaController f39a;

        /* JADX INFO: renamed from: b */
        public final Object f40b = new Object();

        /* JADX INFO: renamed from: c */
        @GuardedBy("mLock")
        public final List<AbstractC0023a> f41c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public HashMap<AbstractC0023a, BinderC0022a> f42d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public final MediaSessionCompat.Token f43e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> mMediaControllerImpl;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f40b) {
                    mediaControllerImplApi21.f43e.m120e(InterfaceC0036b.a.m184O(wi3.m206546a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f43e.m121f(cg60.m109685b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.m81b();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class BinderC0022a extends AbstractC0023a.b {
            public BinderC0022a(AbstractC0023a abstractC0023a) {
                super(abstractC0023a);
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: N6 */
            public void mo84N6(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: Q0 */
            public void mo85Q0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: n6 */
            public void mo86n6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: q7 */
            public void mo87q7(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: w1 */
            public void mo88w1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: x5 */
            public void mo89x5(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f43e = token;
            this.f39a = new MediaController(context, (MediaSession.Token) token.m119d());
            if (token.m118c() == null) {
                m82c();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0024b
        /* JADX INFO: renamed from: a */
        public boolean mo80a(KeyEvent keyEvent) {
            return this.f39a.dispatchMediaButtonEvent(keyEvent);
        }

        @GuardedBy("mLock")
        /* JADX INFO: renamed from: b */
        public void m81b() {
            if (this.f43e.m118c() == null) {
                return;
            }
            for (AbstractC0023a abstractC0023a : this.f41c) {
                BinderC0022a binderC0022a = new BinderC0022a(abstractC0023a);
                this.f42d.put(abstractC0023a, binderC0022a);
                abstractC0023a.f45b = binderC0022a;
                try {
                    this.f43e.m118c().mo150C2(binderC0022a);
                    abstractC0023a.m98i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f41c.clear();
        }

        /* JADX INFO: renamed from: c */
        public final void m82c() {
            m83d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* JADX INFO: renamed from: d */
        public void m83d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f39a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0023a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public final MediaController.Callback f44a = new a(this);

        /* JADX INFO: renamed from: b */
        public InterfaceC0035a f45b;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        @RequiresApi(21)
        public static class a extends MediaController.Callback {

            /* JADX INFO: renamed from: a */
            public final WeakReference<AbstractC0023a> f46a;

            public a(AbstractC0023a abstractC0023a) {
                this.f46a = new WeakReference<>(abstractC0023a);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m90a(new C0025c(playbackInfo.getPlaybackType(), AudioAttributesCompat.m3127c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m105a(bundle);
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m91b(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m92c(MediaMetadataCompat.m74a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a == null || abstractC0023a.f45b != null) {
                    return;
                }
                abstractC0023a.m93d(PlaybackStateCompat.m126a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m94e(MediaSessionCompat.QueueItem.m109b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m95f(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m96g();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m105a(bundle);
                AbstractC0023a abstractC0023a = this.f46a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m97h(str, bundle);
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class b extends InterfaceC0035a.a {

            /* JADX INFO: renamed from: a */
            public final WeakReference<AbstractC0023a> f47a;

            public b(AbstractC0023a abstractC0023a) {
                this.f47a = new WeakReference<>(abstractC0023a);
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: M0 */
            public void mo99M0() throws RemoteException {
                AbstractC0023a abstractC0023a = this.f47a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m98i(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: P5 */
            public void mo100P5(int i) throws RemoteException {
                AbstractC0023a abstractC0023a = this.f47a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m98i(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: d7 */
            public void mo101d7(boolean z) throws RemoteException {
                AbstractC0023a abstractC0023a = this.f47a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m98i(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: l8 */
            public void mo102l8(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                AbstractC0023a abstractC0023a = this.f47a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m98i(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: o7 */
            public void mo103o7(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                AbstractC0023a abstractC0023a = this.f47a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m98i(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0035a
            /* JADX INFO: renamed from: u0 */
            public void mo104u0(int i) throws RemoteException {
                AbstractC0023a abstractC0023a = this.f47a.get();
                if (abstractC0023a != null) {
                    abstractC0023a.m98i(9, Integer.valueOf(i), null);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m90a(C0025c c0025c) {
        }

        /* JADX INFO: renamed from: b */
        public void m91b(Bundle bundle) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m98i(8, null, null);
        }

        /* JADX INFO: renamed from: c */
        public void m92c(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* JADX INFO: renamed from: d */
        public void m93d(PlaybackStateCompat playbackStateCompat) {
        }

        /* JADX INFO: renamed from: e */
        public void m94e(List<MediaSessionCompat.QueueItem> list) {
        }

        /* JADX INFO: renamed from: f */
        public void m95f(CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: g */
        public void m96g() {
        }

        /* JADX INFO: renamed from: h */
        public void m97h(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: i */
        public void m98i(int i, Object obj, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public interface InterfaceC0024b {
        /* JADX INFO: renamed from: a */
        boolean mo80a(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public static final class C0025c {

        /* JADX INFO: renamed from: a */
        public final int f48a;

        /* JADX INFO: renamed from: b */
        public final AudioAttributesCompat f49b;

        /* JADX INFO: renamed from: c */
        public final int f50c;

        /* JADX INFO: renamed from: d */
        public final int f51d;

        /* JADX INFO: renamed from: e */
        public final int f52e;

        public C0025c(int i, @NonNull AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f48a = i;
            this.f49b = audioAttributesCompat;
            this.f50c = i2;
            this.f51d = i3;
            this.f52e = i4;
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token == null) {
            wg3.m206174a("sessionToken must not be null");
            throw null;
        }
        this.f37b = token;
        this.f36a = new MediaControllerImplApi21(context, token);
    }

    /* JADX INFO: renamed from: a */
    public boolean m79a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f36a.mo80a(keyEvent);
        }
        wg3.m206174a("KeyEvent may not be null");
        return false;
    }
}

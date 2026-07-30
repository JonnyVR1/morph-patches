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
import p149l.ig3;
import p149l.ii3;
import p149l.x760;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0023b f36a;

    /* JADX INFO: renamed from: b */
    public final MediaSessionCompat.Token f37b;

    /* JADX INFO: renamed from: c */
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<AbstractC0022a, Boolean> f38c = new ConcurrentHashMap<>();

    @RequiresApi(21)
    public static class MediaControllerImplApi21 implements InterfaceC0023b {

        /* JADX INFO: renamed from: a */
        public final MediaController f39a;

        /* JADX INFO: renamed from: b */
        public final Object f40b = new Object();

        /* JADX INFO: renamed from: c */
        @GuardedBy("mLock")
        public final List<AbstractC0022a> f41c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public HashMap<AbstractC0022a, BinderC0021a> f42d = new HashMap<>();

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
                    mediaControllerImplApi21.f43e.m119e(InterfaceC0035b.a.m183O(ii3.m136329a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f43e.m120f(x760.m207241b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.m80b();
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class BinderC0021a extends AbstractC0022a.b {
            public BinderC0021a(AbstractC0022a abstractC0022a) {
                super(abstractC0022a);
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: N6 */
            public void mo83N6(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: Q0 */
            public void mo84Q0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: n6 */
            public void mo85n6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: q7 */
            public void mo86q7(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: w1 */
            public void mo87w1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: x5 */
            public void mo88x5(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f43e = token;
            this.f39a = new MediaController(context, (MediaSession.Token) token.m118d());
            if (token.m117c() == null) {
                m81c();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.InterfaceC0023b
        /* JADX INFO: renamed from: a */
        public boolean mo79a(KeyEvent keyEvent) {
            return this.f39a.dispatchMediaButtonEvent(keyEvent);
        }

        @GuardedBy("mLock")
        /* JADX INFO: renamed from: b */
        public void m80b() {
            if (this.f43e.m117c() == null) {
                return;
            }
            for (AbstractC0022a abstractC0022a : this.f41c) {
                BinderC0021a binderC0021a = new BinderC0021a(abstractC0022a);
                this.f42d.put(abstractC0022a, binderC0021a);
                abstractC0022a.f45b = binderC0021a;
                try {
                    this.f43e.m117c().mo149C2(binderC0021a);
                    abstractC0022a.m97i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f41c.clear();
        }

        /* JADX INFO: renamed from: c */
        public final void m81c() {
            m82d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* JADX INFO: renamed from: d */
        public void m82d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f39a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0022a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public final MediaController.Callback f44a = new a(this);

        /* JADX INFO: renamed from: b */
        public InterfaceC0034a f45b;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        @RequiresApi(21)
        public static class a extends MediaController.Callback {

            /* JADX INFO: renamed from: a */
            public final WeakReference<AbstractC0022a> f46a;

            public a(AbstractC0022a abstractC0022a) {
                this.f46a = new WeakReference<>(abstractC0022a);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m89a(new C0024c(playbackInfo.getPlaybackType(), AudioAttributesCompat.m3126c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m104a(bundle);
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m90b(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m91c(MediaMetadataCompat.m73a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a == null || abstractC0022a.f45b != null) {
                    return;
                }
                abstractC0022a.m92d(PlaybackStateCompat.m125a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m93e(MediaSessionCompat.QueueItem.m108b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m94f(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m95g();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m104a(bundle);
                AbstractC0022a abstractC0022a = this.f46a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m96h(str, bundle);
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class b extends InterfaceC0034a.a {

            /* JADX INFO: renamed from: a */
            public final WeakReference<AbstractC0022a> f47a;

            public b(AbstractC0022a abstractC0022a) {
                this.f47a = new WeakReference<>(abstractC0022a);
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: M0 */
            public void mo98M0() throws RemoteException {
                AbstractC0022a abstractC0022a = this.f47a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m97i(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: P5 */
            public void mo99P5(int i) throws RemoteException {
                AbstractC0022a abstractC0022a = this.f47a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m97i(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: d7 */
            public void mo100d7(boolean z) throws RemoteException {
                AbstractC0022a abstractC0022a = this.f47a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m97i(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: l8 */
            public void mo101l8(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                AbstractC0022a abstractC0022a = this.f47a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m97i(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: o7 */
            public void mo102o7(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                AbstractC0022a abstractC0022a = this.f47a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m97i(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0034a
            /* JADX INFO: renamed from: u0 */
            public void mo103u0(int i) throws RemoteException {
                AbstractC0022a abstractC0022a = this.f47a.get();
                if (abstractC0022a != null) {
                    abstractC0022a.m97i(9, Integer.valueOf(i), null);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m89a(C0024c c0024c) {
        }

        /* JADX INFO: renamed from: b */
        public void m90b(Bundle bundle) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m97i(8, null, null);
        }

        /* JADX INFO: renamed from: c */
        public void m91c(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* JADX INFO: renamed from: d */
        public void m92d(PlaybackStateCompat playbackStateCompat) {
        }

        /* JADX INFO: renamed from: e */
        public void m93e(List<MediaSessionCompat.QueueItem> list) {
        }

        /* JADX INFO: renamed from: f */
        public void m94f(CharSequence charSequence) {
        }

        /* JADX INFO: renamed from: g */
        public void m95g() {
        }

        /* JADX INFO: renamed from: h */
        public void m96h(String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: i */
        public void m97i(int i, Object obj, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public interface InterfaceC0023b {
        /* JADX INFO: renamed from: a */
        boolean mo79a(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    public static final class C0024c {

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

        public C0024c(int i, @NonNull AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f48a = i;
            this.f49b = audioAttributesCompat;
            this.f50c = i2;
            this.f51d = i3;
            this.f52e = i4;
        }
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        if (token == null) {
            ig3.m135964a("sessionToken must not be null");
            throw null;
        }
        this.f37b = token;
        this.f36a = new MediaControllerImplApi21(context, token);
    }

    /* JADX INFO: renamed from: a */
    public boolean m78a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f36a.mo79a(keyEvent);
        }
        ig3.m135964a("KeyEvent may not be null");
        return false;
    }
}

package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.InterfaceC0035b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p149l.e01;
import p149l.ig3;
import p149l.ii3;
import p149l.wgx;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: b */
    public static final boolean f0b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0006f f1a;

    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final AbstractC0004d mCallback;
        private final Bundle mExtras;

        @Override // android.support.v4.os.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo3a(int i, Bundle bundle) {
            if (this.mCallback == null) {
                return;
            }
            MediaSessionCompat.m104a(bundle);
            if (i == -1) {
                this.mCallback.m18a(this.mAction, this.mExtras, bundle);
                return;
            }
            if (i == 0) {
                this.mCallback.m20c(this.mAction, this.mExtras, bundle);
            } else if (i == 1) {
                this.mCallback.m19b(this.mAction, this.mExtras, bundle);
            } else {
                Objects.toString(this.mExtras);
                Objects.toString(bundle);
            }
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        private final AbstractC0005e mCallback;
        private final String mMediaId;

        @Override // android.support.v4.os.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo3a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m105c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.mCallback.m21a(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.m22b((MediaItem) parcelable);
            } else {
                this.mCallback.m21a(this.mMediaId);
            }
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        private final AbstractC0011k mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        @Override // android.support.v4.os.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo3a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m105c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                this.mCallback.m28a(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray == null) {
                this.mCallback.m28a(this.mQuery, this.mExtras);
                return;
            }
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            this.mCallback.m29b(this.mQuery, this.mExtras, arrayList);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$a */
    @RequiresApi(21)
    public static class C0001a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static MediaDescription m8a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m9b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class HandlerC0002b extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<InterfaceC0010j> f2a;

        /* JADX INFO: renamed from: b */
        public WeakReference<Messenger> f3b;

        public HandlerC0002b(InterfaceC0010j interfaceC0010j) {
            this.f2a = new WeakReference<>(interfaceC0010j);
        }

        /* JADX INFO: renamed from: a */
        public void m10a(Messenger messenger) {
            this.f3b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f3b;
            if (weakReference == null || weakReference.get() == null || this.f2a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.m104a(data);
            InterfaceC0010j interfaceC0010j = this.f2a.get();
            Messenger messenger = this.f3b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m104a(bundle);
                    interfaceC0010j.mo27h(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else {
                    if (i == 2) {
                        interfaceC0010j.mo25d(messenger);
                        return;
                    }
                    if (i != 3) {
                        message.toString();
                        return;
                    }
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m104a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.m104a(bundle3);
                    interfaceC0010j.mo26e(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    interfaceC0010j.mo25d(messenger);
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0003c {

        /* JADX INFO: renamed from: a */
        public final MediaBrowser.ConnectionCallback f4a = new a();

        /* JADX INFO: renamed from: b */
        public b f5b;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        @RequiresApi(21)
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = C0003c.this.f5b;
                if (bVar != null) {
                    bVar.mo16f();
                }
                C0003c.this.mo11a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = C0003c.this.f5b;
                if (bVar != null) {
                    bVar.mo17g();
                }
                C0003c.this.mo12b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = C0003c.this.f5b;
                if (bVar != null) {
                    bVar.mo15c();
                }
                C0003c.this.mo13c();
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        public interface b {
            /* JADX INFO: renamed from: c */
            void mo15c();

            /* JADX INFO: renamed from: f */
            void mo16f();

            /* JADX INFO: renamed from: g */
            void mo17g();
        }

        /* JADX INFO: renamed from: a */
        public void mo11a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo12b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo13c() {
        }

        /* JADX INFO: renamed from: d */
        public void m14d(b bVar) {
            this.f5b = bVar;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class AbstractC0004d {
        /* JADX INFO: renamed from: a */
        public void m18a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* JADX INFO: renamed from: b */
        public void m19b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* JADX INFO: renamed from: c */
        public void m20c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static abstract class AbstractC0005e {

        /* JADX INFO: renamed from: a */
        public final MediaBrowser.ItemCallback f7a = new a();

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$e$a */
        @RequiresApi(23)
        public class a extends MediaBrowser.ItemCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(@NonNull String str) {
                AbstractC0005e.this.m21a(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                AbstractC0005e.this.m22b(MediaItem.m4a(mediaItem));
            }
        }

        /* JADX INFO: renamed from: a */
        public void m21a(@NonNull String str) {
        }

        /* JADX INFO: renamed from: b */
        public void m22b(MediaItem mediaItem) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public interface InterfaceC0006f {
        /* JADX INFO: renamed from: a */
        void mo23a();

        @NonNull
        /* JADX INFO: renamed from: b */
        MediaSessionCompat.Token mo24b();

        void disconnect();
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$g */
    @RequiresApi(21)
    public static class C0007g implements InterfaceC0006f, InterfaceC0010j, C0003c.b {

        /* JADX INFO: renamed from: a */
        public final Context f9a;

        /* JADX INFO: renamed from: b */
        public final MediaBrowser f10b;

        /* JADX INFO: renamed from: c */
        public final Bundle f11c;

        /* JADX INFO: renamed from: d */
        public final HandlerC0002b f12d = new HandlerC0002b(this);

        /* JADX INFO: renamed from: e */
        public final e01<String, C0013m> f13e = new e01<>();

        /* JADX INFO: renamed from: f */
        public int f14f;

        /* JADX INFO: renamed from: g */
        public C0012l f15g;

        /* JADX INFO: renamed from: h */
        public Messenger f16h;

        /* JADX INFO: renamed from: i */
        public MediaSessionCompat.Token f17i;

        /* JADX INFO: renamed from: j */
        public Bundle f18j;

        public C0007g(Context context, ComponentName componentName, C0003c c0003c, Bundle bundle) {
            this.f9a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f11c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            c0003c.m14d(this);
            this.f10b = new MediaBrowser(context, componentName, c0003c.f4a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0006f
        /* JADX INFO: renamed from: a */
        public void mo23a() {
            this.f10b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0006f
        @NonNull
        /* JADX INFO: renamed from: b */
        public MediaSessionCompat.Token mo24b() {
            if (this.f17i == null) {
                this.f17i = MediaSessionCompat.Token.m115a(this.f10b.getSessionToken());
            }
            return this.f17i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0003c.b
        /* JADX INFO: renamed from: c */
        public void mo15c() {
            this.f15g = null;
            this.f16h = null;
            this.f17i = null;
            this.f12d.m10a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0010j
        /* JADX INFO: renamed from: d */
        public void mo25d(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0006f
        public void disconnect() {
            Messenger messenger;
            C0012l c0012l = this.f15g;
            if (c0012l != null && (messenger = this.f16h) != null) {
                try {
                    c0012l.m32c(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f10b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0010j
        /* JADX INFO: renamed from: e */
        public void mo26e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f16h != messenger) {
                return;
            }
            C0013m c0013m = this.f13e.get(str);
            if (c0013m == null) {
                boolean z = MediaBrowserCompat.f0b;
                return;
            }
            AbstractC0014n abstractC0014nM33a = c0013m.m33a(bundle);
            if (abstractC0014nM33a != null) {
                if (bundle == null) {
                    if (list == null) {
                        abstractC0014nM33a.m38c(str);
                        return;
                    }
                    this.f18j = bundle2;
                    abstractC0014nM33a.m36a(str, list);
                    this.f18j = null;
                    return;
                }
                if (list == null) {
                    abstractC0014nM33a.m39d(str, bundle);
                    return;
                }
                this.f18j = bundle2;
                abstractC0014nM33a.m37b(str, list, bundle);
                this.f18j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0003c.b
        /* JADX INFO: renamed from: f */
        public void mo16f() {
            try {
                Bundle extras = this.f10b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f14f = extras.getInt("extra_service_version", 0);
                IBinder iBinderM136329a = ii3.m136329a(extras, "extra_messenger");
                if (iBinderM136329a != null) {
                    this.f15g = new C0012l(iBinderM136329a, this.f11c);
                    Messenger messenger = new Messenger(this.f12d);
                    this.f16h = messenger;
                    this.f12d.m10a(messenger);
                    try {
                        this.f15g.m30a(this.f9a, this.f16h);
                    } catch (RemoteException unused) {
                    }
                }
                InterfaceC0035b interfaceC0035bM183O = InterfaceC0035b.a.m183O(ii3.m136329a(extras, "extra_session_binder"));
                if (interfaceC0035bM183O != null) {
                    this.f17i = MediaSessionCompat.Token.m116b(this.f10b.getSessionToken(), interfaceC0035bM183O);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0003c.b
        /* JADX INFO: renamed from: g */
        public void mo17g() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0010j
        /* JADX INFO: renamed from: h */
        public void mo27h(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$h */
    @RequiresApi(23)
    public static class C0008h extends C0007g {
        public C0008h(Context context, ComponentName componentName, C0003c c0003c, Bundle bundle) {
            super(context, componentName, c0003c, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$i */
    @RequiresApi(26)
    public static class C0009i extends C0008h {
        public C0009i(Context context, ComponentName componentName, C0003c c0003c, Bundle bundle) {
            super(context, componentName, c0003c, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public interface InterfaceC0010j {
        /* JADX INFO: renamed from: d */
        void mo25d(Messenger messenger);

        /* JADX INFO: renamed from: e */
        void mo26e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* JADX INFO: renamed from: h */
        void mo27h(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class AbstractC0011k {
        /* JADX INFO: renamed from: a */
        public void m28a(@NonNull String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: b */
        public void m29b(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static class C0012l {

        /* JADX INFO: renamed from: a */
        public Messenger f19a;

        /* JADX INFO: renamed from: b */
        public Bundle f20b;

        public C0012l(IBinder iBinder, Bundle bundle) {
            this.f19a = new Messenger(iBinder);
            this.f20b = bundle;
        }

        /* JADX INFO: renamed from: a */
        public void m30a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f20b);
            m31b(6, bundle, messenger);
        }

        /* JADX INFO: renamed from: b */
        public final void m31b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f19a.send(messageObtain);
        }

        /* JADX INFO: renamed from: c */
        public void m32c(Messenger messenger) throws RemoteException {
            m31b(7, null, messenger);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$m */
    public static class C0013m {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC0014n> f21a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<Bundle> f22b = new ArrayList();

        /* JADX INFO: renamed from: a */
        public AbstractC0014n m33a(Bundle bundle) {
            for (int i = 0; i < this.f22b.size(); i++) {
                if (wgx.m203086a(this.f22b.get(i), bundle)) {
                    return this.f21a.get(i);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public List<AbstractC0014n> m34b() {
            return this.f21a;
        }

        /* JADX INFO: renamed from: c */
        public List<Bundle> m35c() {
            return this.f22b;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class AbstractC0014n {

        /* JADX INFO: renamed from: a */
        public final MediaBrowser.SubscriptionCallback f23a;

        /* JADX INFO: renamed from: b */
        public final IBinder f24b = new Binder();

        /* JADX INFO: renamed from: c */
        public WeakReference<C0013m> f25c;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        @RequiresApi(21)
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            /* JADX INFO: renamed from: a */
            public List<MediaItem> m40a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<C0013m> weakReference = AbstractC0014n.this.f25c;
                C0013m c0013m = weakReference == null ? null : weakReference.get();
                if (c0013m == null) {
                    AbstractC0014n.this.m36a(str, MediaItem.m5b(list));
                    return;
                }
                List<MediaItem> listM5b = MediaItem.m5b(list);
                List<AbstractC0014n> listM34b = c0013m.m34b();
                List<Bundle> listM35c = c0013m.m35c();
                for (int i = 0; i < listM34b.size(); i++) {
                    Bundle bundle = listM35c.get(i);
                    AbstractC0014n abstractC0014n = AbstractC0014n.this;
                    if (bundle == null) {
                        abstractC0014n.m36a(str, listM5b);
                    } else {
                        abstractC0014n.m37b(str, m40a(listM5b, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str) {
                AbstractC0014n.this.m38c(str);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        @RequiresApi(26)
        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.m104a(bundle);
                AbstractC0014n.this.m37b(str, MediaItem.m5b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.m104a(bundle);
                AbstractC0014n.this.m39d(str, bundle);
            }
        }

        public AbstractC0014n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f23a = new b();
            } else {
                this.f23a = new a();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m36a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        /* JADX INFO: renamed from: b */
        public void m37b(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        /* JADX INFO: renamed from: c */
        public void m38c(@NonNull String str) {
        }

        /* JADX INFO: renamed from: d */
        public void m39d(@NonNull String str, @NonNull Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0003c c0003c, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1a = new C0009i(context, componentName, c0003c, bundle);
        } else {
            this.f1a = new C0008h(context, componentName, c0003c, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m0a() {
        this.f1a.mo23a();
    }

    /* JADX INFO: renamed from: b */
    public void m1b() {
        this.f1a.disconnect();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public MediaSessionCompat.Token m2c() {
        return this.f1a.mo24b();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0000a();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C0000a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                ig3.m135964a("description cannot be null");
                throw null;
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.m43c())) {
                ig3.m135964a("description must have a non-empty media id");
                throw null;
            }
            this.mFlags = i;
            this.mDescription = mediaDescriptionCompat;
        }

        /* JADX INFO: renamed from: a */
        public static MediaItem m4a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m41a(C0001a.m8a(mediaItem)), C0001a.m9b(mediaItem));
        }

        /* JADX INFO: renamed from: b */
        public static List<MediaItem> m5b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m4a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "MediaItem{mFlags=" + this.mFlags + ", mDescription=" + this.mDescription + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}

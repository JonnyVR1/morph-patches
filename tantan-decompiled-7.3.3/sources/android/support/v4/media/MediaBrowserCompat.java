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
import android.support.v4.media.session.InterfaceC0036b;
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
import p153l.l01;
import p153l.tpx;
import p153l.wg3;
import p153l.wi3;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: b */
    public static final boolean f0b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0007f f1a;

    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String mAction;
        private final AbstractC0005d mCallback;
        private final Bundle mExtras;

        @Override // android.support.v4.os.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo4a(int i, Bundle bundle) {
            if (this.mCallback == null) {
                return;
            }
            MediaSessionCompat.m105a(bundle);
            if (i == -1) {
                this.mCallback.m19a(this.mAction, this.mExtras, bundle);
                return;
            }
            if (i == 0) {
                this.mCallback.m21c(this.mAction, this.mExtras, bundle);
            } else if (i == 1) {
                this.mCallback.m20b(this.mAction, this.mExtras, bundle);
            } else {
                Objects.toString(this.mExtras);
                Objects.toString(bundle);
            }
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        private final AbstractC0006e mCallback;
        private final String mMediaId;

        @Override // android.support.v4.os.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo4a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m106c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.mCallback.m22a(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.mCallback.m23b((MediaItem) parcelable);
            } else {
                this.mCallback.m22a(this.mMediaId);
            }
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        private final AbstractC0012k mCallback;
        private final Bundle mExtras;
        private final String mQuery;

        @Override // android.support.v4.os.ResultReceiver
        /* JADX INFO: renamed from: a */
        public void mo4a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m106c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                this.mCallback.m29a(this.mQuery, this.mExtras);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray == null) {
                this.mCallback.m29a(this.mQuery, this.mExtras);
                return;
            }
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            this.mCallback.m30b(this.mQuery, this.mExtras, arrayList);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$a */
    @RequiresApi(21)
    public static class C0002a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static MediaDescription m9a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m10b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class HandlerC0003b extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<InterfaceC0011j> f2a;

        /* JADX INFO: renamed from: b */
        public WeakReference<Messenger> f3b;

        public HandlerC0003b(InterfaceC0011j interfaceC0011j) {
            this.f2a = new WeakReference<>(interfaceC0011j);
        }

        /* JADX INFO: renamed from: a */
        public void m11a(Messenger messenger) {
            this.f3b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f3b;
            if (weakReference == null || weakReference.get() == null || this.f2a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.m105a(data);
            InterfaceC0011j interfaceC0011j = this.f2a.get();
            Messenger messenger = this.f3b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m105a(bundle);
                    interfaceC0011j.mo28h(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else {
                    if (i == 2) {
                        interfaceC0011j.mo26d(messenger);
                        return;
                    }
                    if (i != 3) {
                        message.toString();
                        return;
                    }
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m105a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.m105a(bundle3);
                    interfaceC0011j.mo27e(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    interfaceC0011j.mo26d(messenger);
                }
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0004c {

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
                b bVar = C0004c.this.f5b;
                if (bVar != null) {
                    bVar.mo17f();
                }
                C0004c.this.mo12a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = C0004c.this.f5b;
                if (bVar != null) {
                    bVar.mo18g();
                }
                C0004c.this.mo13b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = C0004c.this.f5b;
                if (bVar != null) {
                    bVar.mo16c();
                }
                C0004c.this.mo14c();
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        public interface b {
            /* JADX INFO: renamed from: c */
            void mo16c();

            /* JADX INFO: renamed from: f */
            void mo17f();

            /* JADX INFO: renamed from: g */
            void mo18g();
        }

        /* JADX INFO: renamed from: a */
        public void mo12a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo13b() {
        }

        /* JADX INFO: renamed from: c */
        public void mo14c() {
        }

        /* JADX INFO: renamed from: d */
        public void m15d(b bVar) {
            this.f5b = bVar;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class AbstractC0005d {
        /* JADX INFO: renamed from: a */
        public void m19a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* JADX INFO: renamed from: b */
        public void m20b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* JADX INFO: renamed from: c */
        public void m21c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static abstract class AbstractC0006e {

        /* JADX INFO: renamed from: a */
        public final MediaBrowser.ItemCallback f7a = new a();

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$e$a */
        @RequiresApi(23)
        public class a extends MediaBrowser.ItemCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(@NonNull String str) {
                AbstractC0006e.this.m22a(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                AbstractC0006e.this.m23b(MediaItem.m5a(mediaItem));
            }
        }

        /* JADX INFO: renamed from: a */
        public void m22a(@NonNull String str) {
        }

        /* JADX INFO: renamed from: b */
        public void m23b(MediaItem mediaItem) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public interface InterfaceC0007f {
        /* JADX INFO: renamed from: a */
        void mo24a();

        @NonNull
        /* JADX INFO: renamed from: b */
        MediaSessionCompat.Token mo25b();

        void disconnect();
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$g */
    @RequiresApi(21)
    public static class C0008g implements InterfaceC0007f, InterfaceC0011j, C0004c.b {

        /* JADX INFO: renamed from: a */
        public final Context f9a;

        /* JADX INFO: renamed from: b */
        public final MediaBrowser f10b;

        /* JADX INFO: renamed from: c */
        public final Bundle f11c;

        /* JADX INFO: renamed from: d */
        public final HandlerC0003b f12d = new HandlerC0003b(this);

        /* JADX INFO: renamed from: e */
        public final l01<String, C0014m> f13e = new l01<>();

        /* JADX INFO: renamed from: f */
        public int f14f;

        /* JADX INFO: renamed from: g */
        public C0013l f15g;

        /* JADX INFO: renamed from: h */
        public Messenger f16h;

        /* JADX INFO: renamed from: i */
        public MediaSessionCompat.Token f17i;

        /* JADX INFO: renamed from: j */
        public Bundle f18j;

        public C0008g(Context context, ComponentName componentName, C0004c c0004c, Bundle bundle) {
            this.f9a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f11c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            c0004c.m15d(this);
            this.f10b = new MediaBrowser(context, componentName, c0004c.f4a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0007f
        /* JADX INFO: renamed from: a */
        public void mo24a() {
            this.f10b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0007f
        @NonNull
        /* JADX INFO: renamed from: b */
        public MediaSessionCompat.Token mo25b() {
            if (this.f17i == null) {
                this.f17i = MediaSessionCompat.Token.m116a(this.f10b.getSessionToken());
            }
            return this.f17i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0004c.b
        /* JADX INFO: renamed from: c */
        public void mo16c() {
            this.f15g = null;
            this.f16h = null;
            this.f17i = null;
            this.f12d.m11a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0011j
        /* JADX INFO: renamed from: d */
        public void mo26d(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0007f
        public void disconnect() {
            Messenger messenger;
            C0013l c0013l = this.f15g;
            if (c0013l != null && (messenger = this.f16h) != null) {
                try {
                    c0013l.m33c(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f10b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0011j
        /* JADX INFO: renamed from: e */
        public void mo27e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f16h != messenger) {
                return;
            }
            C0014m c0014m = this.f13e.get(str);
            if (c0014m == null) {
                boolean z = MediaBrowserCompat.f0b;
                return;
            }
            AbstractC0015n abstractC0015nM34a = c0014m.m34a(bundle);
            if (abstractC0015nM34a != null) {
                if (bundle == null) {
                    if (list == null) {
                        abstractC0015nM34a.m39c(str);
                        return;
                    }
                    this.f18j = bundle2;
                    abstractC0015nM34a.m37a(str, list);
                    this.f18j = null;
                    return;
                }
                if (list == null) {
                    abstractC0015nM34a.m40d(str, bundle);
                    return;
                }
                this.f18j = bundle2;
                abstractC0015nM34a.m38b(str, list, bundle);
                this.f18j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0004c.b
        /* JADX INFO: renamed from: f */
        public void mo17f() {
            try {
                Bundle extras = this.f10b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f14f = extras.getInt("extra_service_version", 0);
                IBinder iBinderM206546a = wi3.m206546a(extras, "extra_messenger");
                if (iBinderM206546a != null) {
                    this.f15g = new C0013l(iBinderM206546a, this.f11c);
                    Messenger messenger = new Messenger(this.f12d);
                    this.f16h = messenger;
                    this.f12d.m11a(messenger);
                    try {
                        this.f15g.m31a(this.f9a, this.f16h);
                    } catch (RemoteException unused) {
                    }
                }
                InterfaceC0036b interfaceC0036bM184O = InterfaceC0036b.a.m184O(wi3.m206546a(extras, "extra_session_binder"));
                if (interfaceC0036bM184O != null) {
                    this.f17i = MediaSessionCompat.Token.m117b(this.f10b.getSessionToken(), interfaceC0036bM184O);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0004c.b
        /* JADX INFO: renamed from: g */
        public void mo18g() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.InterfaceC0011j
        /* JADX INFO: renamed from: h */
        public void mo28h(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$h */
    @RequiresApi(23)
    public static class C0009h extends C0008g {
        public C0009h(Context context, ComponentName componentName, C0004c c0004c, Bundle bundle) {
            super(context, componentName, c0004c, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$i */
    @RequiresApi(26)
    public static class C0010i extends C0009h {
        public C0010i(Context context, ComponentName componentName, C0004c c0004c, Bundle bundle) {
            super(context, componentName, c0004c, bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public interface InterfaceC0011j {
        /* JADX INFO: renamed from: d */
        void mo26d(Messenger messenger);

        /* JADX INFO: renamed from: e */
        void mo27e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* JADX INFO: renamed from: h */
        void mo28h(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class AbstractC0012k {
        /* JADX INFO: renamed from: a */
        public void m29a(@NonNull String str, Bundle bundle) {
        }

        /* JADX INFO: renamed from: b */
        public void m30b(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static class C0013l {

        /* JADX INFO: renamed from: a */
        public Messenger f19a;

        /* JADX INFO: renamed from: b */
        public Bundle f20b;

        public C0013l(IBinder iBinder, Bundle bundle) {
            this.f19a = new Messenger(iBinder);
            this.f20b = bundle;
        }

        /* JADX INFO: renamed from: a */
        public void m31a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f20b);
            m32b(6, bundle, messenger);
        }

        /* JADX INFO: renamed from: b */
        public final void m32b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f19a.send(messageObtain);
        }

        /* JADX INFO: renamed from: c */
        public void m33c(Messenger messenger) throws RemoteException {
            m32b(7, null, messenger);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$m */
    public static class C0014m {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC0015n> f21a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<Bundle> f22b = new ArrayList();

        /* JADX INFO: renamed from: a */
        public AbstractC0015n m34a(Bundle bundle) {
            for (int i = 0; i < this.f22b.size(); i++) {
                if (tpx.m192215a(this.f22b.get(i), bundle)) {
                    return this.f21a.get(i);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public List<AbstractC0015n> m35b() {
            return this.f21a;
        }

        /* JADX INFO: renamed from: c */
        public List<Bundle> m36c() {
            return this.f22b;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class AbstractC0015n {

        /* JADX INFO: renamed from: a */
        public final MediaBrowser.SubscriptionCallback f23a;

        /* JADX INFO: renamed from: b */
        public final IBinder f24b = new Binder();

        /* JADX INFO: renamed from: c */
        public WeakReference<C0014m> f25c;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        @RequiresApi(21)
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            /* JADX INFO: renamed from: a */
            public List<MediaItem> m41a(List<MediaItem> list, Bundle bundle) {
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
                WeakReference<C0014m> weakReference = AbstractC0015n.this.f25c;
                C0014m c0014m = weakReference == null ? null : weakReference.get();
                if (c0014m == null) {
                    AbstractC0015n.this.m37a(str, MediaItem.m6b(list));
                    return;
                }
                List<MediaItem> listM6b = MediaItem.m6b(list);
                List<AbstractC0015n> listM35b = c0014m.m35b();
                List<Bundle> listM36c = c0014m.m36c();
                for (int i = 0; i < listM35b.size(); i++) {
                    Bundle bundle = listM36c.get(i);
                    AbstractC0015n abstractC0015n = AbstractC0015n.this;
                    if (bundle == null) {
                        abstractC0015n.m37a(str, listM6b);
                    } else {
                        abstractC0015n.m38b(str, m41a(listM6b, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str) {
                AbstractC0015n.this.m39c(str);
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
                MediaSessionCompat.m105a(bundle);
                AbstractC0015n.this.m38b(str, MediaItem.m6b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.m105a(bundle);
                AbstractC0015n.this.m40d(str, bundle);
            }
        }

        public AbstractC0015n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f23a = new b();
            } else {
                this.f23a = new a();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m37a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        /* JADX INFO: renamed from: b */
        public void m38b(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        /* JADX INFO: renamed from: c */
        public void m39c(@NonNull String str) {
        }

        /* JADX INFO: renamed from: d */
        public void m40d(@NonNull String str, @NonNull Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0004c c0004c, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1a = new C0010i(context, componentName, c0004c, bundle);
        } else {
            this.f1a = new C0009h(context, componentName, c0004c, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1a() {
        this.f1a.mo24a();
    }

    /* JADX INFO: renamed from: b */
    public void m2b() {
        this.f1a.disconnect();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public MediaSessionCompat.Token m3c() {
        return this.f1a.mo25b();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0001a();
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public class C0001a implements Parcelable.Creator<MediaItem> {
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
                wg3.m206174a("description cannot be null");
                throw null;
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.m44c())) {
                wg3.m206174a("description must have a non-empty media id");
                throw null;
            }
            this.mFlags = i;
            this.mDescription = mediaDescriptionCompat;
        }

        /* JADX INFO: renamed from: a */
        public static MediaItem m5a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m42a(C0002a.m9a(mediaItem)), C0002a.m10b(mediaItem));
        }

        /* JADX INFO: renamed from: b */
        public static List<MediaItem> m6b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m5a(it.next()));
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

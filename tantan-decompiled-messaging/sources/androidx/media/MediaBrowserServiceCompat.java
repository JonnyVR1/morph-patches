package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.InterfaceC0035b;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p149l.e01;
import p149l.hjd0;
import p149l.ig3;
import p149l.ii3;
import p149l.j760;
import p149l.j850;
import p149l.jwx;
import p149l.qkq0;
import p149l.rad0;
import p149l.rkq0;
import p149l.wgx;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    private static final float EPSILON = 1.0E-5f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_MEDIA_ITEM = "media_item";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_SEARCH_RESULTS = "search_results";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_OK = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    C0513f mCurConnection;
    private InterfaceC0514g mImpl;
    MediaSessionCompat.Token mSession;
    static final String TAG = "MBServiceCompat";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    final C0513f mConnectionFromFwk = new C0513f("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<C0513f> mPendingConnections = new ArrayList<>();
    final e01<IBinder, C0513f> mConnections = new e01<>();
    final HandlerC0521n mHandler = new HandlerC0521n();

    @RequiresApi(21)
    public class MediaBrowserServiceImplApi21 implements InterfaceC0514g {

        /* JADX INFO: renamed from: a */
        public final List<Bundle> f2391a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public MediaBrowserService f2392b;

        /* JADX INFO: renamed from: c */
        public Messenger f2393c;

        @RequiresApi(21)
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            public MediaBrowserServiceApi21(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.m104a(bundle);
                C0512e c0512eM3141l = MediaBrowserServiceImplApi21.this.m3141l(str, i, bundle == null ? null : new Bundle(bundle));
                if (c0512eM3141l == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c0512eM3141l.f2427a, c0512eM3141l.f2428b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi21.this.m3142m(str, new C0517j<>(result));
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a */
        public class RunnableC0502a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f2396a;

            public RunnableC0502a(MediaSessionCompat.Token token) {
                this.f2396a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceImplApi21.this.m3143n(this.f2396a);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b */
        public class C0503b extends C0516i<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0517j f2398f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0503b(Object obj, C0517j c0517j) {
                super(obj);
                this.f2398f = c0517j;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0516i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo3144d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f2398f.m3166b(arrayList);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c */
        public class RunnableC0504c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f2400a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f2401b;

            public RunnableC0504c(String str, Bundle bundle) {
                this.f2400a = str;
                this.f2401b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                while (it.hasNext()) {
                    MediaBrowserServiceImplApi21.this.m3139j(MediaBrowserServiceCompat.this.mConnections.get(it.next()), this.f2400a, this.f2401b);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d */
        public class RunnableC0505d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jwx f2403a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2404b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f2405c;

            public RunnableC0505d(jwx jwxVar, String str, Bundle bundle) {
                this.f2403a = jwxVar;
                this.f2404b = str;
                this.f2405c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                    C0513f c0513fM130827m = MediaBrowserServiceCompat.this.mConnections.m130827m(i);
                    if (c0513fM130827m.f2432d.equals(this.f2403a)) {
                        MediaBrowserServiceImplApi21.this.m3139j(c0513fM130827m, this.f2404b, this.f2405c);
                    }
                }
            }
        }

        public MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: b */
        public jwx mo3131b() {
            C0513f c0513f = MediaBrowserServiceCompat.this.mCurConnection;
            if (c0513f != null) {
                return c0513f.f2432d;
            }
            qkq0.m175383a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: c */
        public Bundle mo3132c() {
            if (this.f2393c == null) {
                return null;
            }
            C0513f c0513f = MediaBrowserServiceCompat.this.mCurConnection;
            if (c0513f == null) {
                qkq0.m175383a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (c0513f.f2433e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.f2433e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: d */
        public IBinder mo3133d(Intent intent) {
            return this.f2392b.onBind(intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: e */
        public void mo3134e(jwx jwxVar, String str, Bundle bundle) {
            m3138i(jwxVar, str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: f */
        public void mo3135f(String str, Bundle bundle) {
            mo3140k(str, bundle);
            m3137h(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: g */
        public void mo3136g(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.m3180a(new RunnableC0502a(token));
        }

        /* JADX INFO: renamed from: h */
        public void m3137h(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new RunnableC0504c(str, bundle));
        }

        /* JADX INFO: renamed from: i */
        public void m3138i(jwx jwxVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new RunnableC0505d(jwxVar, str, bundle));
        }

        /* JADX INFO: renamed from: j */
        public void m3139j(C0513f c0513f, String str, Bundle bundle) {
            List<j760<IBinder, Bundle>> list = c0513f.f2435g.get(str);
            if (list != null) {
                for (j760<IBinder, Bundle> j760Var : list) {
                    if (wgx.m203087b(bundle, j760Var.f116565b)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, c0513f, j760Var.f116565b, bundle);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void mo3140k(String str, Bundle bundle) {
            this.f2392b.notifyChildrenChanged(str);
        }

        /* JADX INFO: renamed from: l */
        public C0512e m3141l(String str, int i, Bundle bundle) {
            Bundle bundleM3158c;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundleM3158c = null;
            } else {
                bundle.remove("extra_client_version");
                this.f2393c = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                bundleM3158c = new Bundle();
                bundleM3158c.putInt("extra_service_version", 2);
                ii3.m136330b(bundleM3158c, "extra_messenger", this.f2393c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.mSession;
                if (token != null) {
                    InterfaceC0035b interfaceC0035bM117c = token.m117c();
                    ii3.m136330b(bundleM3158c, "extra_session_binder", interfaceC0035bM117c == null ? null : interfaceC0035bM117c.asBinder());
                } else {
                    this.f2391a.add(bundleM3158c);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            C0513f c0513f = MediaBrowserServiceCompat.this.new C0513f(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = c0513f;
            C0512e c0512eOnGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.mCurConnection = null;
            if (c0512eOnGetRoot == null) {
                return null;
            }
            if (this.f2393c != null) {
                mediaBrowserServiceCompat2.mPendingConnections.add(c0513f);
            }
            if (bundleM3158c == null) {
                bundleM3158c = c0512eOnGetRoot.m3158c();
            } else if (c0512eOnGetRoot.m3158c() != null) {
                bundleM3158c.putAll(c0512eOnGetRoot.m3158c());
            }
            return new C0512e(c0512eOnGetRoot.m3159d(), bundleM3158c);
        }

        /* JADX INFO: renamed from: m */
        public void m3142m(String str, C0517j<List<Parcel>> c0517j) {
            C0503b c0503b = new C0503b(str, c0517j);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, c0503b);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        /* JADX INFO: renamed from: n */
        public void m3143n(MediaSessionCompat.Token token) {
            if (!this.f2391a.isEmpty()) {
                InterfaceC0035b interfaceC0035bM117c = token.m117c();
                if (interfaceC0035bM117c != null) {
                    Iterator<Bundle> it = this.f2391a.iterator();
                    while (it.hasNext()) {
                        ii3.m136330b(it.next(), "extra_session_binder", interfaceC0035bM117c.asBinder());
                    }
                }
                this.f2391a.clear();
            }
            this.f2392b.setSessionToken((MediaSession.Token) token.m118d());
        }
    }

    @RequiresApi(23)
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {

        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            public MediaBrowserServiceApi23(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                MediaBrowserServiceImplApi23.this.m3147o(str, new C0517j<>(result));
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a */
        public class C0506a extends C0516i<MediaBrowserCompat.MediaItem> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0517j f2409f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0506a(Object obj, C0517j c0517j) {
                super(obj);
                this.f2409f = c0517j;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0516i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo3144d(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f2409f.m3166b(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.f2409f.m3166b(parcelObtain);
            }
        }

        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: a */
        public void mo3146a() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.f2392b = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }

        /* JADX INFO: renamed from: o */
        public void m3147o(String str, C0517j<Parcel> c0517j) {
            C0506a c0506a = new C0506a(str, c0517j);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadItem(str, c0506a);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }
    }

    @RequiresApi(26)
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m104a(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                mediaBrowserServiceImplApi26.m3149p(str, new C0517j<>(result), bundle);
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a */
        public class C0507a extends C0516i<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0517j f2413f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Bundle f2414g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0507a(Object obj, C0517j c0517j, Bundle bundle) {
                super(obj);
                this.f2413f = c0517j;
                this.f2414g = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0516i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo3144d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f2413f.m3166b(null);
                    return;
                }
                if ((m3160a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, this.f2414g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f2413f.m3166b(arrayList);
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: a */
        public void mo3146a() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.f2392b = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: c */
        public Bundle mo3132c() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            C0513f c0513f = mediaBrowserServiceCompat.mCurConnection;
            if (c0513f == null) {
                qkq0.m175383a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (c0513f == mediaBrowserServiceCompat.mConnectionFromFwk) {
                return this.f2392b.getBrowserRootHints();
            }
            if (c0513f.f2433e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.f2433e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        /* JADX INFO: renamed from: k */
        public void mo3140k(String str, Bundle bundle) {
            if (bundle != null) {
                this.f2392b.notifyChildrenChanged(str, bundle);
            } else {
                super.mo3140k(str, bundle);
            }
        }

        /* JADX INFO: renamed from: p */
        public void m3149p(String str, C0517j<List<Parcel>> c0517j, Bundle bundle) {
            C0507a c0507a = new C0507a(str, c0517j, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, c0507a, bundle);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public class C0508a extends C0516i<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C0513f f2416f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f2417g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Bundle f2418h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Bundle f2419i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0508a(Object obj, C0513f c0513f, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f2416f = c0513f;
            this.f2417g = str;
            this.f2418h = bundle;
            this.f2419i = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0516i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3144d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
            C0513f c0513f = MediaBrowserServiceCompat.this.mConnections.get(this.f2416f.f2434f.asBinder());
            C0513f c0513f2 = this.f2416f;
            if (c0513f != c0513f2) {
                if (MediaBrowserServiceCompat.DEBUG) {
                    String str = c0513f2.f2429a;
                }
            } else {
                if ((m3160a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, this.f2418h);
                }
                try {
                    this.f2416f.f2434f.mo3176a(this.f2417g, list, this.f2418h, this.f2419i);
                } catch (RemoteException unused) {
                    String str2 = this.f2416f.f2429a;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C0509b extends C0516i<MediaBrowserCompat.MediaItem> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ResultReceiver f2421f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0509b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2421f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0516i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3144d(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
            if ((m3160a() & 2) != 0) {
                this.f2421f.m185b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
            this.f2421f.m185b(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public class C0510c extends C0516i<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ResultReceiver f2423f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0510c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2423f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0516i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3144d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
            if ((m3160a() & 4) != 0 || list == null) {
                this.f2423f.m185b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f2423f.m185b(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C0511d extends C0516i<Bundle> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ResultReceiver f2425f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0511d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2425f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0516i
        /* JADX INFO: renamed from: c */
        public void mo3154c(@Nullable Bundle bundle) {
            this.f2425f.m185b(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0516i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3144d(@Nullable Bundle bundle) {
            this.f2425f.m185b(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0512e {

        /* JADX INFO: renamed from: a */
        public final String f2427a;

        /* JADX INFO: renamed from: b */
        public final Bundle f2428b;

        public C0512e(@NonNull String str, @Nullable Bundle bundle) {
            if (str == null) {
                ig3.m135964a("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
                throw null;
            }
            this.f2427a = str;
            this.f2428b = bundle;
        }

        /* JADX INFO: renamed from: c */
        public Bundle m3158c() {
            return this.f2428b;
        }

        /* JADX INFO: renamed from: d */
        public String m3159d() {
            return this.f2427a;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C0513f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public final String f2429a;

        /* JADX INFO: renamed from: b */
        public final int f2430b;

        /* JADX INFO: renamed from: c */
        public final int f2431c;

        /* JADX INFO: renamed from: d */
        public final jwx f2432d;

        /* JADX INFO: renamed from: e */
        public final Bundle f2433e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC0519l f2434f;

        /* JADX INFO: renamed from: g */
        public final HashMap<String, List<j760<IBinder, Bundle>>> f2435g = new HashMap<>();

        /* JADX INFO: renamed from: h */
        public C0512e f2436h;

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f = C0513f.this;
                MediaBrowserServiceCompat.this.mConnections.remove(c0513f.f2434f.asBinder());
            }
        }

        public C0513f(String str, int i, int i2, Bundle bundle, InterfaceC0519l interfaceC0519l) {
            this.f2429a = str;
            this.f2430b = i;
            this.f2431c = i2;
            this.f2432d = new jwx(str, i, i2);
            this.f2433e = bundle;
            this.f2434f = interfaceC0519l;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new a());
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public interface InterfaceC0514g {
        /* JADX INFO: renamed from: a */
        void mo3146a();

        /* JADX INFO: renamed from: b */
        jwx mo3131b();

        /* JADX INFO: renamed from: c */
        Bundle mo3132c();

        /* JADX INFO: renamed from: d */
        IBinder mo3133d(Intent intent);

        /* JADX INFO: renamed from: e */
        void mo3134e(jwx jwxVar, String str, Bundle bundle);

        /* JADX INFO: renamed from: f */
        void mo3135f(String str, Bundle bundle);

        /* JADX INFO: renamed from: g */
        void mo3136g(MediaSessionCompat.Token token);
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$h */
    @RequiresApi(28)
    public class C0515h extends MediaBrowserServiceImplApi26 {
        public C0515h() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.InterfaceC0514g
        /* JADX INFO: renamed from: b */
        public jwx mo3131b() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            C0513f c0513f = mediaBrowserServiceCompat.mCurConnection;
            if (c0513f != null) {
                return c0513f == mediaBrowserServiceCompat.mConnectionFromFwk ? new jwx(this.f2392b.getCurrentBrowserInfo()) : c0513f.f2432d;
            }
            qkq0.m175383a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public static class C0516i<T> {

        /* JADX INFO: renamed from: a */
        public final Object f2440a;

        /* JADX INFO: renamed from: b */
        public boolean f2441b;

        /* JADX INFO: renamed from: c */
        public boolean f2442c;

        /* JADX INFO: renamed from: d */
        public boolean f2443d;

        /* JADX INFO: renamed from: e */
        public int f2444e;

        public C0516i(Object obj) {
            this.f2440a = obj;
        }

        /* JADX INFO: renamed from: a */
        public int m3160a() {
            return this.f2444e;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3161b() {
            return this.f2441b || this.f2442c || this.f2443d;
        }

        /* JADX INFO: renamed from: c */
        public void mo3154c(@Nullable Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f2440a);
        }

        /* JADX INFO: renamed from: d */
        public void mo3144d(@Nullable T t) {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public void m3162e(@Nullable Bundle bundle) {
            if (this.f2442c || this.f2443d) {
                j850.m140190a("sendError() called when either sendResult() or sendError() had already been called for: ", this.f2440a);
            } else {
                this.f2443d = true;
                mo3154c(bundle);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m3163f(@Nullable T t) {
            if (this.f2442c || this.f2443d) {
                j850.m140190a("sendResult() called when either sendResult() or sendError() had already been called for: ", this.f2440a);
            } else {
                this.f2442c = true;
                mo3144d(t);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3164g(int i) {
            this.f2444e = i;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$j */
    @RequiresApi(21)
    public static class C0517j<T> {

        /* JADX INFO: renamed from: a */
        public MediaBrowserService.Result f2445a;

        public C0517j(MediaBrowserService.Result result) {
            this.f2445a = result;
        }

        /* JADX INFO: renamed from: a */
        public List<MediaBrowser.MediaItem> m3165a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public void m3166b(T t) {
            if (t instanceof List) {
                this.f2445a.sendResult(m3165a((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                this.f2445a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.f2445a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k */
    public class C0518k {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2447a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2448b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f2449c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f2450d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Bundle f2451e;

            public a(InterfaceC0519l interfaceC0519l, String str, int i, int i2, Bundle bundle) {
                this.f2447a = interfaceC0519l;
                this.f2448b = str;
                this.f2449c = i;
                this.f2450d = i2;
                this.f2451e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2447a.asBinder();
                MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                C0513f c0513f = MediaBrowserServiceCompat.this.new C0513f(this.f2448b, this.f2449c, this.f2450d, this.f2451e, this.f2447a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = c0513f;
                C0512e c0512eOnGetRoot = mediaBrowserServiceCompat.onGetRoot(this.f2448b, this.f2450d, this.f2451e);
                c0513f.f2436h = c0512eOnGetRoot;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.mCurConnection = null;
                if (c0512eOnGetRoot == null) {
                    try {
                        this.f2447a.mo3177b();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.mConnections.put(iBinderAsBinder, c0513f);
                    iBinderAsBinder.linkToDeath(c0513f, 0);
                    if (MediaBrowserServiceCompat.this.mSession != null) {
                        this.f2447a.mo3178c(c0513f.f2436h.m3159d(), MediaBrowserServiceCompat.this.mSession, c0513f.f2436h.m3158c());
                    }
                } catch (RemoteException unused2) {
                    MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2453a;

            public b(InterfaceC0519l interfaceC0519l) {
                this.f2453a = interfaceC0519l;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513fRemove = MediaBrowserServiceCompat.this.mConnections.remove(this.f2453a.asBinder());
                if (c0513fRemove != null) {
                    c0513fRemove.f2434f.asBinder().unlinkToDeath(c0513fRemove, 0);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2455a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2456b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ IBinder f2457c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Bundle f2458d;

            public c(InterfaceC0519l interfaceC0519l, String str, IBinder iBinder, Bundle bundle) {
                this.f2455a = interfaceC0519l;
                this.f2456b = str;
                this.f2457c = iBinder;
                this.f2458d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f = MediaBrowserServiceCompat.this.mConnections.get(this.f2455a.asBinder());
                if (c0513f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.addSubscription(this.f2456b, c0513f, this.f2457c, this.f2458d);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2460a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2461b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ IBinder f2462c;

            public d(InterfaceC0519l interfaceC0519l, String str, IBinder iBinder) {
                this.f2460a = interfaceC0519l;
                this.f2461b = str;
                this.f2462c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f = MediaBrowserServiceCompat.this.mConnections.get(this.f2460a.asBinder());
                if (c0513f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.removeSubscription(this.f2461b, c0513f, this.f2462c);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2464a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2465b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ResultReceiver f2466c;

            public e(InterfaceC0519l interfaceC0519l, String str, ResultReceiver resultReceiver) {
                this.f2464a = interfaceC0519l;
                this.f2465b = str;
                this.f2466c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f = MediaBrowserServiceCompat.this.mConnections.get(this.f2464a.asBinder());
                if (c0513f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.performLoadItem(this.f2465b, c0513f, this.f2466c);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2468a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f2469b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f2470c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f2471d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Bundle f2472e;

            public f(InterfaceC0519l interfaceC0519l, int i, String str, int i2, Bundle bundle) {
                this.f2468a = interfaceC0519l;
                this.f2469b = i;
                this.f2470c = str;
                this.f2471d = i2;
                this.f2472e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f;
                IBinder iBinderAsBinder = this.f2468a.asBinder();
                MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                Iterator<C0513f> it = MediaBrowserServiceCompat.this.mPendingConnections.iterator();
                while (true) {
                    c0513f = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C0513f next = it.next();
                    if (next.f2431c == this.f2469b) {
                        c0513f = (TextUtils.isEmpty(this.f2470c) || this.f2471d <= 0) ? MediaBrowserServiceCompat.this.new C0513f(next.f2429a, next.f2430b, next.f2431c, this.f2472e, this.f2468a) : null;
                        it.remove();
                        break;
                    }
                }
                if (c0513f == null) {
                    c0513f = MediaBrowserServiceCompat.this.new C0513f(this.f2470c, this.f2471d, this.f2469b, this.f2472e, this.f2468a);
                }
                MediaBrowserServiceCompat.this.mConnections.put(iBinderAsBinder, c0513f);
                try {
                    iBinderAsBinder.linkToDeath(c0513f, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$g */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2474a;

            public g(InterfaceC0519l interfaceC0519l) {
                this.f2474a = interfaceC0519l;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2474a.asBinder();
                C0513f c0513fRemove = MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                if (c0513fRemove != null) {
                    iBinderAsBinder.unlinkToDeath(c0513fRemove, 0);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2476a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2477b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f2478c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ResultReceiver f2479d;

            public h(InterfaceC0519l interfaceC0519l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2476a = interfaceC0519l;
                this.f2477b = str;
                this.f2478c = bundle;
                this.f2479d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f = MediaBrowserServiceCompat.this.mConnections.get(this.f2476a.asBinder());
                if (c0513f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.performSearch(this.f2477b, this.f2478c, c0513f, this.f2479d);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0519l f2481a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2482b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f2483c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ResultReceiver f2484d;

            public i(InterfaceC0519l interfaceC0519l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2481a = interfaceC0519l;
                this.f2482b = str;
                this.f2483c = bundle;
                this.f2484d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0513f c0513f = MediaBrowserServiceCompat.this.mConnections.get(this.f2481a.asBinder());
                if (c0513f == null) {
                    Objects.toString(this.f2483c);
                } else {
                    MediaBrowserServiceCompat.this.performCustomAction(this.f2482b, this.f2483c, c0513f, this.f2484d);
                }
            }
        }

        public C0518k() {
        }

        /* JADX INFO: renamed from: a */
        public void m3167a(String str, IBinder iBinder, Bundle bundle, InterfaceC0519l interfaceC0519l) {
            MediaBrowserServiceCompat.this.mHandler.m3180a(new c(interfaceC0519l, str, iBinder, bundle));
        }

        /* JADX INFO: renamed from: b */
        public void m3168b(String str, int i2, int i3, Bundle bundle, InterfaceC0519l interfaceC0519l) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i3)) {
                MediaBrowserServiceCompat.this.mHandler.m3180a(new a(interfaceC0519l, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        /* JADX INFO: renamed from: c */
        public void m3169c(InterfaceC0519l interfaceC0519l) {
            MediaBrowserServiceCompat.this.mHandler.m3180a(new b(interfaceC0519l));
        }

        /* JADX INFO: renamed from: d */
        public void m3170d(String str, ResultReceiver resultReceiver, InterfaceC0519l interfaceC0519l) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.m3180a(new e(interfaceC0519l, str, resultReceiver));
        }

        /* JADX INFO: renamed from: e */
        public void m3171e(InterfaceC0519l interfaceC0519l, String str, int i2, int i3, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.m3180a(new f(interfaceC0519l, i3, str, i2, bundle));
        }

        /* JADX INFO: renamed from: f */
        public void m3172f(String str, IBinder iBinder, InterfaceC0519l interfaceC0519l) {
            MediaBrowserServiceCompat.this.mHandler.m3180a(new d(interfaceC0519l, str, iBinder));
        }

        /* JADX INFO: renamed from: g */
        public void m3173g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC0519l interfaceC0519l) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.m3180a(new h(interfaceC0519l, str, bundle, resultReceiver));
        }

        /* JADX INFO: renamed from: h */
        public void m3174h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC0519l interfaceC0519l) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.m3180a(new i(interfaceC0519l, str, bundle, resultReceiver));
        }

        /* JADX INFO: renamed from: i */
        public void m3175i(InterfaceC0519l interfaceC0519l) {
            MediaBrowserServiceCompat.this.mHandler.m3180a(new g(interfaceC0519l));
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public interface InterfaceC0519l {
        /* JADX INFO: renamed from: a */
        void mo3176a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* JADX INFO: renamed from: b */
        void mo3177b() throws RemoteException;

        /* JADX INFO: renamed from: c */
        void mo3178c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0520m implements InterfaceC0519l {

        /* JADX INFO: renamed from: a */
        public final Messenger f2486a;

        public C0520m(Messenger messenger) {
            this.f2486a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0519l
        /* JADX INFO: renamed from: a */
        public void mo3176a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m3179d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0519l
        public IBinder asBinder() {
            return this.f2486a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0519l
        /* JADX INFO: renamed from: b */
        public void mo3177b() throws RemoteException {
            m3179d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0519l
        /* JADX INFO: renamed from: c */
        public void mo3178c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m3179d(1, bundle2);
        }

        /* JADX INFO: renamed from: d */
        public final void m3179d(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f2486a.send(messageObtain);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$n */
    public final class HandlerC0521n extends Handler {

        /* JADX INFO: renamed from: a */
        public final C0518k f2487a;

        public HandlerC0521n() {
            this.f2487a = MediaBrowserServiceCompat.this.new C0518k();
        }

        /* JADX INFO: renamed from: a */
        public void m3180a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m104a(bundle);
                    this.f2487a.m3168b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0520m(message.replyTo));
                    break;
                case 2:
                    this.f2487a.m3169c(new C0520m(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m104a(bundle2);
                    this.f2487a.m3167a(data.getString("data_media_item_id"), ii3.m136329a(data, "data_callback_token"), bundle2, new C0520m(message.replyTo));
                    break;
                case 4:
                    this.f2487a.m3172f(data.getString("data_media_item_id"), ii3.m136329a(data, "data_callback_token"), new C0520m(message.replyTo));
                    break;
                case 5:
                    this.f2487a.m3170d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C0520m(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m104a(bundle3);
                    this.f2487a.m3171e(new C0520m(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.f2487a.m3175i(new C0520m(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m104a(bundle4);
                    this.f2487a.m3173g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0520m(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m104a(bundle5);
                    this.f2487a.m3174h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0520m(message.replyTo));
                    break;
                default:
                    message.toString();
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void addSubscription(String str, C0513f c0513f, IBinder iBinder, Bundle bundle) {
        List<j760<IBinder, Bundle>> arrayList = c0513f.f2435g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (j760<IBinder, Bundle> j760Var : arrayList) {
            if (iBinder == j760Var.f116564a && wgx.m203086a(bundle, j760Var.f116565b)) {
                return;
            }
        }
        arrayList.add(new j760<>(iBinder, bundle));
        c0513f.f2435g.put(str, arrayList);
        performLoadChildren(str, c0513f, bundle, null);
        this.mCurConnection = c0513f;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.mo3132c();
    }

    @NonNull
    public final jwx getCurrentBrowserInfo() {
        return this.mImpl.mo3131b();
    }

    @Nullable
    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void notifyChildrenChanged(@NonNull jwx jwxVar, @NonNull String str, @NonNull Bundle bundle) {
        if (jwxVar == null) {
            ig3.m135964a("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            ig3.m135964a("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.mo3134e(jwxVar, str, bundle);
        } else {
            ig3.m135964a("options cannot be null in notifyChildrenChanged");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mImpl.mo3133d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new C0515h();
        } else if (i >= 26) {
            this.mImpl = new MediaBrowserServiceImplApi26();
        } else {
            this.mImpl = new MediaBrowserServiceImplApi23();
        }
        this.mImpl.mo3146a();
    }

    public void onCustomAction(@NonNull String str, Bundle bundle, @NonNull C0516i<Bundle> c0516i) {
        c0516i.m3162e(null);
    }

    @Nullable
    public abstract C0512e onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull C0516i<List<MediaBrowserCompat.MediaItem>> c0516i);

    public void onLoadChildren(@NonNull String str, @NonNull C0516i<List<MediaBrowserCompat.MediaItem>> c0516i, @NonNull Bundle bundle) {
        c0516i.m3164g(1);
        onLoadChildren(str, c0516i);
    }

    public void onLoadItem(String str, @NonNull C0516i<MediaBrowserCompat.MediaItem> c0516i) {
        c0516i.m3164g(2);
        c0516i.m3163f(null);
    }

    public void onSearch(@NonNull String str, Bundle bundle, @NonNull C0516i<List<MediaBrowserCompat.MediaItem>> c0516i) {
        c0516i.m3164g(4);
        c0516i.m3163f(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSubscribe(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onUnsubscribe(String str) {
    }

    public void performCustomAction(String str, Bundle bundle, C0513f c0513f, ResultReceiver resultReceiver) {
        C0511d c0511d = new C0511d(str, resultReceiver);
        this.mCurConnection = c0513f;
        onCustomAction(str, bundle, c0511d);
        this.mCurConnection = null;
        if (c0511d.m3161b()) {
            return;
        }
        hjd0.m131368a("onCustomAction must call detach() or sendResult() or sendError() before returning for action=", str, " extras=", bundle);
    }

    public void performLoadChildren(String str, C0513f c0513f, Bundle bundle, Bundle bundle2) {
        C0508a c0508a = new C0508a(str, c0513f, str, bundle, bundle2);
        this.mCurConnection = c0513f;
        if (bundle == null) {
            onLoadChildren(str, c0508a);
        } else {
            onLoadChildren(str, c0508a, bundle);
        }
        this.mCurConnection = null;
        if (c0508a.m3161b()) {
            return;
        }
        rad0.m178492a("onLoadChildren must call detach() or sendResult() before returning for package=", c0513f.f2429a, " id=", str);
    }

    public void performLoadItem(String str, C0513f c0513f, ResultReceiver resultReceiver) {
        C0509b c0509b = new C0509b(str, resultReceiver);
        this.mCurConnection = c0513f;
        onLoadItem(str, c0509b);
        this.mCurConnection = null;
        if (c0509b.m3161b()) {
            return;
        }
        rkq0.m179764a("onLoadItem must call detach() or sendResult() before returning for id=", str);
    }

    public void performSearch(String str, Bundle bundle, C0513f c0513f, ResultReceiver resultReceiver) {
        C0510c c0510c = new C0510c(str, resultReceiver);
        this.mCurConnection = c0513f;
        onSearch(str, bundle, c0510c);
        this.mCurConnection = null;
        if (c0510c.m3161b()) {
            return;
        }
        rkq0.m179764a("onSearch must call detach() or sendResult() before returning for query=", str);
    }

    public boolean removeSubscription(String str, C0513f c0513f, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<j760<IBinder, Bundle>> list = c0513f.f2435g.get(str);
                if (list != null) {
                    Iterator<j760<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f116564a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        c0513f.f2435g.remove(str);
                    }
                }
            } else if (c0513f.f2435g.remove(str) != null) {
                z = true;
            }
            this.mCurConnection = c0513f;
            onUnsubscribe(str);
            this.mCurConnection = null;
            return z;
        } catch (Throwable th) {
            this.mCurConnection = c0513f;
            onUnsubscribe(str);
            this.mCurConnection = null;
            throw th;
        }
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            ig3.m135964a("Session token may not be null");
        } else if (this.mSession != null) {
            qkq0.m175383a("The session token has already been set");
        } else {
            this.mSession = token;
            this.mImpl.mo3136g(token);
        }
    }

    public void notifyChildrenChanged(@NonNull String str, @NonNull Bundle bundle) {
        if (str == null) {
            ig3.m135964a("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.mo3135f(str, bundle);
        } else {
            ig3.m135964a("options cannot be null in notifyChildrenChanged");
        }
    }

    public void notifyChildrenChanged(@NonNull String str) {
        if (str != null) {
            this.mImpl.mo3135f(str, null);
        } else {
            ig3.m135964a("parentId cannot be null in notifyChildrenChanged");
        }
    }
}

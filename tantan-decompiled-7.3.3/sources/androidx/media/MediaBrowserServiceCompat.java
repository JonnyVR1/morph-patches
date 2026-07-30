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
import android.support.v4.media.session.InterfaceC0036b;
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
import p153l.g5y;
import p153l.krd0;
import p153l.l01;
import p153l.pf60;
import p153l.qg50;
import p153l.tpx;
import p153l.uid0;
import p153l.wg3;
import p153l.wi3;
import p153l.wtq0;
import p153l.xtq0;

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
    C0514f mCurConnection;
    private InterfaceC0515g mImpl;
    MediaSessionCompat.Token mSession;
    static final String TAG = "MBServiceCompat";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    final C0514f mConnectionFromFwk = new C0514f("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<C0514f> mPendingConnections = new ArrayList<>();
    final l01<IBinder, C0514f> mConnections = new l01<>();
    final HandlerC0522n mHandler = new HandlerC0522n();

    @RequiresApi(21)
    public class MediaBrowserServiceImplApi21 implements InterfaceC0515g {

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
                MediaSessionCompat.m105a(bundle);
                C0513e c0513eM3142l = MediaBrowserServiceImplApi21.this.m3142l(str, i, bundle == null ? null : new Bundle(bundle));
                if (c0513eM3142l == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(c0513eM3142l.f2427a, c0513eM3142l.f2428b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi21.this.m3143m(str, new C0518j<>(result));
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$a */
        public class RunnableC0503a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ MediaSessionCompat.Token f2396a;

            public RunnableC0503a(MediaSessionCompat.Token token) {
                this.f2396a = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaBrowserServiceImplApi21.this.m3144n(this.f2396a);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$b */
        public class C0504b extends C0517i<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0518j f2398f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0504b(Object obj, C0518j c0518j) {
                super(obj);
                this.f2398f = c0518j;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0517i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo3145d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
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
                this.f2398f.m3167b(arrayList);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$c */
        public class RunnableC0505c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f2400a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Bundle f2401b;

            public RunnableC0505c(String str, Bundle bundle) {
                this.f2400a = str;
                this.f2401b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = MediaBrowserServiceCompat.this.mConnections.keySet().iterator();
                while (it.hasNext()) {
                    MediaBrowserServiceImplApi21.this.m3140j(MediaBrowserServiceCompat.this.mConnections.get(it.next()), this.f2400a, this.f2401b);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$d */
        public class RunnableC0506d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g5y f2403a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2404b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f2405c;

            public RunnableC0506d(g5y g5yVar, String str, Bundle bundle) {
                this.f2403a = g5yVar;
                this.f2404b = str;
                this.f2405c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                    C0514f c0514fM168583m = MediaBrowserServiceCompat.this.mConnections.m168583m(i);
                    if (c0514fM168583m.f2432d.equals(this.f2403a)) {
                        MediaBrowserServiceImplApi21.this.m3140j(c0514fM168583m, this.f2404b, this.f2405c);
                    }
                }
            }
        }

        public MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: b */
        public g5y mo3132b() {
            C0514f c0514f = MediaBrowserServiceCompat.this.mCurConnection;
            if (c0514f != null) {
                return c0514f.f2432d;
            }
            wtq0.m207906a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: c */
        public Bundle mo3133c() {
            if (this.f2393c == null) {
                return null;
            }
            C0514f c0514f = MediaBrowserServiceCompat.this.mCurConnection;
            if (c0514f == null) {
                wtq0.m207906a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (c0514f.f2433e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.f2433e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: d */
        public IBinder mo3134d(Intent intent) {
            return this.f2392b.onBind(intent);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: e */
        public void mo3135e(g5y g5yVar, String str, Bundle bundle) {
            m3139i(g5yVar, str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: f */
        public void mo3136f(String str, Bundle bundle) {
            mo3141k(str, bundle);
            m3138h(str, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: g */
        public void mo3137g(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.m3181a(new RunnableC0503a(token));
        }

        /* JADX INFO: renamed from: h */
        public void m3138h(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new RunnableC0505c(str, bundle));
        }

        /* JADX INFO: renamed from: i */
        public void m3139i(g5y g5yVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new RunnableC0506d(g5yVar, str, bundle));
        }

        /* JADX INFO: renamed from: j */
        public void m3140j(C0514f c0514f, String str, Bundle bundle) {
            List<pf60<IBinder, Bundle>> list = c0514f.f2435g.get(str);
            if (list != null) {
                for (pf60<IBinder, Bundle> pf60Var : list) {
                    if (tpx.m192216b(bundle, pf60Var.f152157b)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, c0514f, pf60Var.f152157b, bundle);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void mo3141k(String str, Bundle bundle) {
            this.f2392b.notifyChildrenChanged(str);
        }

        /* JADX INFO: renamed from: l */
        public C0513e m3142l(String str, int i, Bundle bundle) {
            Bundle bundleM3159c;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundleM3159c = null;
            } else {
                bundle.remove("extra_client_version");
                this.f2393c = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                bundleM3159c = new Bundle();
                bundleM3159c.putInt("extra_service_version", 2);
                wi3.m206547b(bundleM3159c, "extra_messenger", this.f2393c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.mSession;
                if (token != null) {
                    InterfaceC0036b interfaceC0036bM118c = token.m118c();
                    wi3.m206547b(bundleM3159c, "extra_session_binder", interfaceC0036bM118c == null ? null : interfaceC0036bM118c.asBinder());
                } else {
                    this.f2391a.add(bundleM3159c);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            C0514f c0514f = MediaBrowserServiceCompat.this.new C0514f(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = c0514f;
            C0513e c0513eOnGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.mCurConnection = null;
            if (c0513eOnGetRoot == null) {
                return null;
            }
            if (this.f2393c != null) {
                mediaBrowserServiceCompat2.mPendingConnections.add(c0514f);
            }
            if (bundleM3159c == null) {
                bundleM3159c = c0513eOnGetRoot.m3159c();
            } else if (c0513eOnGetRoot.m3159c() != null) {
                bundleM3159c.putAll(c0513eOnGetRoot.m3159c());
            }
            return new C0513e(c0513eOnGetRoot.m3160d(), bundleM3159c);
        }

        /* JADX INFO: renamed from: m */
        public void m3143m(String str, C0518j<List<Parcel>> c0518j) {
            C0504b c0504b = new C0504b(str, c0518j);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, c0504b);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }

        /* JADX INFO: renamed from: n */
        public void m3144n(MediaSessionCompat.Token token) {
            if (!this.f2391a.isEmpty()) {
                InterfaceC0036b interfaceC0036bM118c = token.m118c();
                if (interfaceC0036bM118c != null) {
                    Iterator<Bundle> it = this.f2391a.iterator();
                    while (it.hasNext()) {
                        wi3.m206547b(it.next(), "extra_session_binder", interfaceC0036bM118c.asBinder());
                    }
                }
                this.f2391a.clear();
            }
            this.f2392b.setSessionToken((MediaSession.Token) token.m119d());
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
                MediaBrowserServiceImplApi23.this.m3148o(str, new C0518j<>(result));
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$a */
        public class C0507a extends C0517i<MediaBrowserCompat.MediaItem> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0518j f2409f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0507a(Object obj, C0518j c0518j) {
                super(obj);
                this.f2409f = c0518j;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0517i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo3145d(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f2409f.m3167b(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.f2409f.m3167b(parcelObtain);
            }
        }

        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: a */
        public void mo3147a() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.f2392b = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }

        /* JADX INFO: renamed from: o */
        public void m3148o(String str, C0518j<Parcel> c0518j) {
            C0507a c0507a = new C0507a(str, c0518j);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadItem(str, c0507a);
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
                MediaSessionCompat.m105a(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
                mediaBrowserServiceImplApi26.m3150p(str, new C0518j<>(result), bundle);
                MediaBrowserServiceCompat.this.mCurConnection = null;
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$a */
        public class C0508a extends C0517i<List<MediaBrowserCompat.MediaItem>> {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C0518j f2413f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Bundle f2414g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0508a(Object obj, C0518j c0518j, Bundle bundle) {
                super(obj);
                this.f2413f = c0518j;
                this.f2414g = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C0517i
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void mo3145d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f2413f.m3167b(null);
                    return;
                }
                if ((m3161a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, this.f2414g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f2413f.m3167b(arrayList);
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: a */
        public void mo3147a() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.f2392b = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: c */
        public Bundle mo3133c() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            C0514f c0514f = mediaBrowserServiceCompat.mCurConnection;
            if (c0514f == null) {
                wtq0.m207906a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (c0514f == mediaBrowserServiceCompat.mConnectionFromFwk) {
                return this.f2392b.getBrowserRootHints();
            }
            if (c0514f.f2433e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.f2433e);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        /* JADX INFO: renamed from: k */
        public void mo3141k(String str, Bundle bundle) {
            if (bundle != null) {
                this.f2392b.notifyChildrenChanged(str, bundle);
            } else {
                super.mo3141k(str, bundle);
            }
        }

        /* JADX INFO: renamed from: p */
        public void m3150p(String str, C0518j<List<Parcel>> c0518j, Bundle bundle) {
            C0508a c0508a = new C0508a(str, c0518j, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = mediaBrowserServiceCompat.mConnectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, c0508a, bundle);
            MediaBrowserServiceCompat.this.mCurConnection = null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$a */
    public class C0509a extends C0517i<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C0514f f2416f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f2417g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Bundle f2418h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Bundle f2419i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0509a(Object obj, C0514f c0514f, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f2416f = c0514f;
            this.f2417g = str;
            this.f2418h = bundle;
            this.f2419i = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0517i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3145d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
            C0514f c0514f = MediaBrowserServiceCompat.this.mConnections.get(this.f2416f.f2434f.asBinder());
            C0514f c0514f2 = this.f2416f;
            if (c0514f != c0514f2) {
                if (MediaBrowserServiceCompat.DEBUG) {
                    String str = c0514f2.f2429a;
                }
            } else {
                if ((m3161a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, this.f2418h);
                }
                try {
                    this.f2416f.f2434f.mo3177a(this.f2417g, list, this.f2418h, this.f2419i);
                } catch (RemoteException unused) {
                    String str2 = this.f2416f.f2429a;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$b */
    public class C0510b extends C0517i<MediaBrowserCompat.MediaItem> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ResultReceiver f2421f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0510b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2421f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0517i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3145d(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
            if ((m3161a() & 2) != 0) {
                this.f2421f.m186b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
            this.f2421f.m186b(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$c */
    public class C0511c extends C0517i<List<MediaBrowserCompat.MediaItem>> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ResultReceiver f2423f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0511c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2423f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0517i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3145d(@Nullable List<MediaBrowserCompat.MediaItem> list) {
            if ((m3161a() & 4) != 0 || list == null) {
                this.f2423f.m186b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f2423f.m186b(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$d */
    public class C0512d extends C0517i<Bundle> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ResultReceiver f2425f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0512d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2425f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0517i
        /* JADX INFO: renamed from: c */
        public void mo3155c(@Nullable Bundle bundle) {
            this.f2425f.m186b(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C0517i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo3145d(@Nullable Bundle bundle) {
            this.f2425f.m186b(0, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$e */
    public static final class C0513e {

        /* JADX INFO: renamed from: a */
        public final String f2427a;

        /* JADX INFO: renamed from: b */
        public final Bundle f2428b;

        public C0513e(@NonNull String str, @Nullable Bundle bundle) {
            if (str == null) {
                wg3.m206174a("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
                throw null;
            }
            this.f2427a = str;
            this.f2428b = bundle;
        }

        /* JADX INFO: renamed from: c */
        public Bundle m3159c() {
            return this.f2428b;
        }

        /* JADX INFO: renamed from: d */
        public String m3160d() {
            return this.f2427a;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$f */
    public class C0514f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public final String f2429a;

        /* JADX INFO: renamed from: b */
        public final int f2430b;

        /* JADX INFO: renamed from: c */
        public final int f2431c;

        /* JADX INFO: renamed from: d */
        public final g5y f2432d;

        /* JADX INFO: renamed from: e */
        public final Bundle f2433e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC0520l f2434f;

        /* JADX INFO: renamed from: g */
        public final HashMap<String, List<pf60<IBinder, Bundle>>> f2435g = new HashMap<>();

        /* JADX INFO: renamed from: h */
        public C0513e f2436h;

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f = C0514f.this;
                MediaBrowserServiceCompat.this.mConnections.remove(c0514f.f2434f.asBinder());
            }
        }

        public C0514f(String str, int i, int i2, Bundle bundle, InterfaceC0520l interfaceC0520l) {
            this.f2429a = str;
            this.f2430b = i;
            this.f2431c = i2;
            this.f2432d = new g5y(str, i, i2);
            this.f2433e = bundle;
            this.f2434f = interfaceC0520l;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new a());
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$g */
    public interface InterfaceC0515g {
        /* JADX INFO: renamed from: a */
        void mo3147a();

        /* JADX INFO: renamed from: b */
        g5y mo3132b();

        /* JADX INFO: renamed from: c */
        Bundle mo3133c();

        /* JADX INFO: renamed from: d */
        IBinder mo3134d(Intent intent);

        /* JADX INFO: renamed from: e */
        void mo3135e(g5y g5yVar, String str, Bundle bundle);

        /* JADX INFO: renamed from: f */
        void mo3136f(String str, Bundle bundle);

        /* JADX INFO: renamed from: g */
        void mo3137g(MediaSessionCompat.Token token);
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$h */
    @RequiresApi(28)
    public class C0516h extends MediaBrowserServiceImplApi26 {
        public C0516h() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.InterfaceC0515g
        /* JADX INFO: renamed from: b */
        public g5y mo3132b() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            C0514f c0514f = mediaBrowserServiceCompat.mCurConnection;
            if (c0514f != null) {
                return c0514f == mediaBrowserServiceCompat.mConnectionFromFwk ? new g5y(this.f2392b.getCurrentBrowserInfo()) : c0514f.f2432d;
            }
            wtq0.m207906a("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$i */
    public static class C0517i<T> {

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

        public C0517i(Object obj) {
            this.f2440a = obj;
        }

        /* JADX INFO: renamed from: a */
        public int m3161a() {
            return this.f2444e;
        }

        /* JADX INFO: renamed from: b */
        public boolean m3162b() {
            return this.f2441b || this.f2442c || this.f2443d;
        }

        /* JADX INFO: renamed from: c */
        public void mo3155c(@Nullable Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f2440a);
        }

        /* JADX INFO: renamed from: d */
        public void mo3145d(@Nullable T t) {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public void m3163e(@Nullable Bundle bundle) {
            if (this.f2442c || this.f2443d) {
                qg50.m176437a("sendError() called when either sendResult() or sendError() had already been called for: ", this.f2440a);
            } else {
                this.f2443d = true;
                mo3155c(bundle);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m3164f(@Nullable T t) {
            if (this.f2442c || this.f2443d) {
                qg50.m176437a("sendResult() called when either sendResult() or sendError() had already been called for: ", this.f2440a);
            } else {
                this.f2442c = true;
                mo3145d(t);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3165g(int i) {
            this.f2444e = i;
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$j */
    @RequiresApi(21)
    public static class C0518j<T> {

        /* JADX INFO: renamed from: a */
        public MediaBrowserService.Result f2445a;

        public C0518j(MediaBrowserService.Result result) {
            this.f2445a = result;
        }

        /* JADX INFO: renamed from: a */
        public List<MediaBrowser.MediaItem> m3166a(List<Parcel> list) {
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
        public void m3167b(T t) {
            if (t instanceof List) {
                this.f2445a.sendResult(m3166a((List) t));
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
    public class C0519k {

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2447a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2448b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f2449c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f2450d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Bundle f2451e;

            public a(InterfaceC0520l interfaceC0520l, String str, int i, int i2, Bundle bundle) {
                this.f2447a = interfaceC0520l;
                this.f2448b = str;
                this.f2449c = i;
                this.f2450d = i2;
                this.f2451e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2447a.asBinder();
                MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                C0514f c0514f = MediaBrowserServiceCompat.this.new C0514f(this.f2448b, this.f2449c, this.f2450d, this.f2451e, this.f2447a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.mCurConnection = c0514f;
                C0513e c0513eOnGetRoot = mediaBrowserServiceCompat.onGetRoot(this.f2448b, this.f2450d, this.f2451e);
                c0514f.f2436h = c0513eOnGetRoot;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.mCurConnection = null;
                if (c0513eOnGetRoot == null) {
                    try {
                        this.f2447a.mo3178b();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.mConnections.put(iBinderAsBinder, c0514f);
                    iBinderAsBinder.linkToDeath(c0514f, 0);
                    if (MediaBrowserServiceCompat.this.mSession != null) {
                        this.f2447a.mo3179c(c0514f.f2436h.m3160d(), MediaBrowserServiceCompat.this.mSession, c0514f.f2436h.m3159c());
                    }
                } catch (RemoteException unused2) {
                    MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2453a;

            public b(InterfaceC0520l interfaceC0520l) {
                this.f2453a = interfaceC0520l;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514fRemove = MediaBrowserServiceCompat.this.mConnections.remove(this.f2453a.asBinder());
                if (c0514fRemove != null) {
                    c0514fRemove.f2434f.asBinder().unlinkToDeath(c0514fRemove, 0);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2455a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2456b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ IBinder f2457c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Bundle f2458d;

            public c(InterfaceC0520l interfaceC0520l, String str, IBinder iBinder, Bundle bundle) {
                this.f2455a = interfaceC0520l;
                this.f2456b = str;
                this.f2457c = iBinder;
                this.f2458d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f = MediaBrowserServiceCompat.this.mConnections.get(this.f2455a.asBinder());
                if (c0514f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.addSubscription(this.f2456b, c0514f, this.f2457c, this.f2458d);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2460a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2461b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ IBinder f2462c;

            public d(InterfaceC0520l interfaceC0520l, String str, IBinder iBinder) {
                this.f2460a = interfaceC0520l;
                this.f2461b = str;
                this.f2462c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f = MediaBrowserServiceCompat.this.mConnections.get(this.f2460a.asBinder());
                if (c0514f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.removeSubscription(this.f2461b, c0514f, this.f2462c);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2464a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2465b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ResultReceiver f2466c;

            public e(InterfaceC0520l interfaceC0520l, String str, ResultReceiver resultReceiver) {
                this.f2464a = interfaceC0520l;
                this.f2465b = str;
                this.f2466c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f = MediaBrowserServiceCompat.this.mConnections.get(this.f2464a.asBinder());
                if (c0514f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.performLoadItem(this.f2465b, c0514f, this.f2466c);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2468a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f2469b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f2470c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f2471d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Bundle f2472e;

            public f(InterfaceC0520l interfaceC0520l, int i, String str, int i2, Bundle bundle) {
                this.f2468a = interfaceC0520l;
                this.f2469b = i;
                this.f2470c = str;
                this.f2471d = i2;
                this.f2472e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f;
                IBinder iBinderAsBinder = this.f2468a.asBinder();
                MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                Iterator<C0514f> it = MediaBrowserServiceCompat.this.mPendingConnections.iterator();
                while (true) {
                    c0514f = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C0514f next = it.next();
                    if (next.f2431c == this.f2469b) {
                        c0514f = (TextUtils.isEmpty(this.f2470c) || this.f2471d <= 0) ? MediaBrowserServiceCompat.this.new C0514f(next.f2429a, next.f2430b, next.f2431c, this.f2472e, this.f2468a) : null;
                        it.remove();
                        break;
                    }
                }
                if (c0514f == null) {
                    c0514f = MediaBrowserServiceCompat.this.new C0514f(this.f2470c, this.f2471d, this.f2469b, this.f2472e, this.f2468a);
                }
                MediaBrowserServiceCompat.this.mConnections.put(iBinderAsBinder, c0514f);
                try {
                    iBinderAsBinder.linkToDeath(c0514f, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$g */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2474a;

            public g(InterfaceC0520l interfaceC0520l) {
                this.f2474a = interfaceC0520l;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2474a.asBinder();
                C0514f c0514fRemove = MediaBrowserServiceCompat.this.mConnections.remove(iBinderAsBinder);
                if (c0514fRemove != null) {
                    iBinderAsBinder.unlinkToDeath(c0514fRemove, 0);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2476a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2477b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f2478c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ResultReceiver f2479d;

            public h(InterfaceC0520l interfaceC0520l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2476a = interfaceC0520l;
                this.f2477b = str;
                this.f2478c = bundle;
                this.f2479d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f = MediaBrowserServiceCompat.this.mConnections.get(this.f2476a.asBinder());
                if (c0514f == null) {
                    return;
                }
                MediaBrowserServiceCompat.this.performSearch(this.f2477b, this.f2478c, c0514f, this.f2479d);
            }
        }

        /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$k$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0520l f2481a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f2482b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Bundle f2483c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ResultReceiver f2484d;

            public i(InterfaceC0520l interfaceC0520l, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2481a = interfaceC0520l;
                this.f2482b = str;
                this.f2483c = bundle;
                this.f2484d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0514f c0514f = MediaBrowserServiceCompat.this.mConnections.get(this.f2481a.asBinder());
                if (c0514f == null) {
                    Objects.toString(this.f2483c);
                } else {
                    MediaBrowserServiceCompat.this.performCustomAction(this.f2482b, this.f2483c, c0514f, this.f2484d);
                }
            }
        }

        public C0519k() {
        }

        /* JADX INFO: renamed from: a */
        public void m3168a(String str, IBinder iBinder, Bundle bundle, InterfaceC0520l interfaceC0520l) {
            MediaBrowserServiceCompat.this.mHandler.m3181a(new c(interfaceC0520l, str, iBinder, bundle));
        }

        /* JADX INFO: renamed from: b */
        public void m3169b(String str, int i2, int i3, Bundle bundle, InterfaceC0520l interfaceC0520l) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i3)) {
                MediaBrowserServiceCompat.this.mHandler.m3181a(new a(interfaceC0520l, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        /* JADX INFO: renamed from: c */
        public void m3170c(InterfaceC0520l interfaceC0520l) {
            MediaBrowserServiceCompat.this.mHandler.m3181a(new b(interfaceC0520l));
        }

        /* JADX INFO: renamed from: d */
        public void m3171d(String str, ResultReceiver resultReceiver, InterfaceC0520l interfaceC0520l) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.m3181a(new e(interfaceC0520l, str, resultReceiver));
        }

        /* JADX INFO: renamed from: e */
        public void m3172e(InterfaceC0520l interfaceC0520l, String str, int i2, int i3, Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.m3181a(new f(interfaceC0520l, i3, str, i2, bundle));
        }

        /* JADX INFO: renamed from: f */
        public void m3173f(String str, IBinder iBinder, InterfaceC0520l interfaceC0520l) {
            MediaBrowserServiceCompat.this.mHandler.m3181a(new d(interfaceC0520l, str, iBinder));
        }

        /* JADX INFO: renamed from: g */
        public void m3174g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC0520l interfaceC0520l) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.m3181a(new h(interfaceC0520l, str, bundle, resultReceiver));
        }

        /* JADX INFO: renamed from: h */
        public void m3175h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC0520l interfaceC0520l) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.mHandler.m3181a(new i(interfaceC0520l, str, bundle, resultReceiver));
        }

        /* JADX INFO: renamed from: i */
        public void m3176i(InterfaceC0520l interfaceC0520l) {
            MediaBrowserServiceCompat.this.mHandler.m3181a(new g(interfaceC0520l));
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$l */
    public interface InterfaceC0520l {
        /* JADX INFO: renamed from: a */
        void mo3177a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* JADX INFO: renamed from: b */
        void mo3178b() throws RemoteException;

        /* JADX INFO: renamed from: c */
        void mo3179c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$m */
    public static class C0521m implements InterfaceC0520l {

        /* JADX INFO: renamed from: a */
        public final Messenger f2486a;

        public C0521m(Messenger messenger) {
            this.f2486a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0520l
        /* JADX INFO: renamed from: a */
        public void mo3177a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m3180d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0520l
        public IBinder asBinder() {
            return this.f2486a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0520l
        /* JADX INFO: renamed from: b */
        public void mo3178b() throws RemoteException {
            m3180d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC0520l
        /* JADX INFO: renamed from: c */
        public void mo3179c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m3180d(1, bundle2);
        }

        /* JADX INFO: renamed from: d */
        public final void m3180d(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f2486a.send(messageObtain);
        }
    }

    /* JADX INFO: renamed from: androidx.media.MediaBrowserServiceCompat$n */
    public final class HandlerC0522n extends Handler {

        /* JADX INFO: renamed from: a */
        public final C0519k f2487a;

        public HandlerC0522n() {
            this.f2487a = MediaBrowserServiceCompat.this.new C0519k();
        }

        /* JADX INFO: renamed from: a */
        public void m3181a(Runnable runnable) {
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
                    MediaSessionCompat.m105a(bundle);
                    this.f2487a.m3169b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C0521m(message.replyTo));
                    break;
                case 2:
                    this.f2487a.m3170c(new C0521m(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m105a(bundle2);
                    this.f2487a.m3168a(data.getString("data_media_item_id"), wi3.m206546a(data, "data_callback_token"), bundle2, new C0521m(message.replyTo));
                    break;
                case 4:
                    this.f2487a.m3173f(data.getString("data_media_item_id"), wi3.m206546a(data, "data_callback_token"), new C0521m(message.replyTo));
                    break;
                case 5:
                    this.f2487a.m3171d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C0521m(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m105a(bundle3);
                    this.f2487a.m3172e(new C0521m(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.f2487a.m3176i(new C0521m(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m105a(bundle4);
                    this.f2487a.m3174g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0521m(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m105a(bundle5);
                    this.f2487a.m3175h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0521m(message.replyTo));
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

    public void addSubscription(String str, C0514f c0514f, IBinder iBinder, Bundle bundle) {
        List<pf60<IBinder, Bundle>> arrayList = c0514f.f2435g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (pf60<IBinder, Bundle> pf60Var : arrayList) {
            if (iBinder == pf60Var.f152156a && tpx.m192215a(bundle, pf60Var.f152157b)) {
                return;
            }
        }
        arrayList.add(new pf60<>(iBinder, bundle));
        c0514f.f2435g.put(str, arrayList);
        performLoadChildren(str, c0514f, bundle, null);
        this.mCurConnection = c0514f;
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
        return this.mImpl.mo3133c();
    }

    @NonNull
    public final g5y getCurrentBrowserInfo() {
        return this.mImpl.mo3132b();
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
    public void notifyChildrenChanged(@NonNull g5y g5yVar, @NonNull String str, @NonNull Bundle bundle) {
        if (g5yVar == null) {
            wg3.m206174a("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            wg3.m206174a("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.mo3135e(g5yVar, str, bundle);
        } else {
            wg3.m206174a("options cannot be null in notifyChildrenChanged");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mImpl.mo3134d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mImpl = new C0516h();
        } else if (i >= 26) {
            this.mImpl = new MediaBrowserServiceImplApi26();
        } else {
            this.mImpl = new MediaBrowserServiceImplApi23();
        }
        this.mImpl.mo3147a();
    }

    public void onCustomAction(@NonNull String str, Bundle bundle, @NonNull C0517i<Bundle> c0517i) {
        c0517i.m3163e(null);
    }

    @Nullable
    public abstract C0513e onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull C0517i<List<MediaBrowserCompat.MediaItem>> c0517i);

    public void onLoadChildren(@NonNull String str, @NonNull C0517i<List<MediaBrowserCompat.MediaItem>> c0517i, @NonNull Bundle bundle) {
        c0517i.m3165g(1);
        onLoadChildren(str, c0517i);
    }

    public void onLoadItem(String str, @NonNull C0517i<MediaBrowserCompat.MediaItem> c0517i) {
        c0517i.m3165g(2);
        c0517i.m3164f(null);
    }

    public void onSearch(@NonNull String str, Bundle bundle, @NonNull C0517i<List<MediaBrowserCompat.MediaItem>> c0517i) {
        c0517i.m3165g(4);
        c0517i.m3164f(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSubscribe(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onUnsubscribe(String str) {
    }

    public void performCustomAction(String str, Bundle bundle, C0514f c0514f, ResultReceiver resultReceiver) {
        C0512d c0512d = new C0512d(str, resultReceiver);
        this.mCurConnection = c0514f;
        onCustomAction(str, bundle, c0512d);
        this.mCurConnection = null;
        if (c0512d.m3162b()) {
            return;
        }
        krd0.m151025a("onCustomAction must call detach() or sendResult() or sendError() before returning for action=", str, " extras=", bundle);
    }

    public void performLoadChildren(String str, C0514f c0514f, Bundle bundle, Bundle bundle2) {
        C0509a c0509a = new C0509a(str, c0514f, str, bundle, bundle2);
        this.mCurConnection = c0514f;
        if (bundle == null) {
            onLoadChildren(str, c0509a);
        } else {
            onLoadChildren(str, c0509a, bundle);
        }
        this.mCurConnection = null;
        if (c0509a.m3162b()) {
            return;
        }
        uid0.m196153a("onLoadChildren must call detach() or sendResult() before returning for package=", c0514f.f2429a, " id=", str);
    }

    public void performLoadItem(String str, C0514f c0514f, ResultReceiver resultReceiver) {
        C0510b c0510b = new C0510b(str, resultReceiver);
        this.mCurConnection = c0514f;
        onLoadItem(str, c0510b);
        this.mCurConnection = null;
        if (c0510b.m3162b()) {
            return;
        }
        xtq0.m213103a("onLoadItem must call detach() or sendResult() before returning for id=", str);
    }

    public void performSearch(String str, Bundle bundle, C0514f c0514f, ResultReceiver resultReceiver) {
        C0511c c0511c = new C0511c(str, resultReceiver);
        this.mCurConnection = c0514f;
        onSearch(str, bundle, c0511c);
        this.mCurConnection = null;
        if (c0511c.m3162b()) {
            return;
        }
        xtq0.m213103a("onSearch must call detach() or sendResult() before returning for query=", str);
    }

    public boolean removeSubscription(String str, C0514f c0514f, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<pf60<IBinder, Bundle>> list = c0514f.f2435g.get(str);
                if (list != null) {
                    Iterator<pf60<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f152156a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        c0514f.f2435g.remove(str);
                    }
                }
            } else if (c0514f.f2435g.remove(str) != null) {
                z = true;
            }
            this.mCurConnection = c0514f;
            onUnsubscribe(str);
            this.mCurConnection = null;
            return z;
        } catch (Throwable th) {
            this.mCurConnection = c0514f;
            onUnsubscribe(str);
            this.mCurConnection = null;
            throw th;
        }
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            wg3.m206174a("Session token may not be null");
        } else if (this.mSession != null) {
            wtq0.m207906a("The session token has already been set");
        } else {
            this.mSession = token;
            this.mImpl.mo3137g(token);
        }
    }

    public void notifyChildrenChanged(@NonNull String str, @NonNull Bundle bundle) {
        if (str == null) {
            wg3.m206174a("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.mo3136f(str, bundle);
        } else {
            wg3.m206174a("options cannot be null in notifyChildrenChanged");
        }
    }

    public void notifyChildrenChanged(@NonNull String str) {
        if (str != null) {
            this.mImpl.mo3136f(str, null);
        } else {
            wg3.m206174a("parentId cannot be null in notifyChildrenChanged");
        }
    }
}

package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.FacebookException;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004).1\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'R\u001e\u0010-\u001a\u0004\u0018\u00010(8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020%038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104¨\u00066"}, m87232d2 = {"Ll/ufm;", "", "<init>", "()V", "Ll/him;", SocialConstants.TYPE_REQUEST, "", "f", "(Ll/him;)V", "", Constants.INAPP_DATA_TAG, "(Ll/him;)Z", "Ll/ufm$d;", Constants.KEY_KEY, "allowCachedRedirects", "g", "(Ll/him;Ll/ufm$d;Z)V", "h", "(Ll/him;Ll/ufm$d;)V", "Ll/eaq0;", "workQueue", "Ljava/lang/Runnable;", "workItem", RXScreenCaptureService.KEY_INDEX, "(Ll/him;Ll/ufm$d;Ll/eaq0;Ljava/lang/Runnable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Landroid/graphics/Bitmap;", "bitmap", "isCachedRedirect", "k", "(Ll/ufm$d;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/ufm$d;Z)V", "e", "(Ll/ufm$d;)V", "Ll/ufm$c;", "m", "(Ll/ufm$d;)Ll/ufm$c;", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "j", "()Landroid/os/Handler;", "handler", "b", "Ll/eaq0;", "downloadQueue", "c", "cacheReadQueue", "", "Ljava/util/Map;", "pendingRequests", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ufm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Handler handler;

    @NotNull
    public static final ufm INSTANCE = new ufm();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final eaq0 downloadQueue = new eaq0(8, null, 2, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final eaq0 cacheReadQueue = new eaq0(2, null, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<C20422d, C20421c> pendingRequests = new HashMap();

    /* JADX INFO: renamed from: l.ufm$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/ufm$a;", "Ljava/lang/Runnable;", "Ll/ufm$d;", Constants.KEY_KEY, "", "allowCachedRedirects", "<init>", "(Ll/ufm$d;Z)V", "", "run", "()V", "a", "Ll/ufm$d;", "b", "Z", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class RunnableC20419a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C20422d key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean allowCachedRedirects;

        public RunnableC20419a(@NotNull C20422d c20422d, boolean z) {
            c20422d.getClass();
            this.key = c20422d;
            this.allowCachedRedirects = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                ufm.INSTANCE.m193397l(this.key, this.allowCachedRedirects);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ufm$b */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/ufm$b;", "Ljava/lang/Runnable;", "Ll/ufm$d;", Constants.KEY_KEY, "<init>", "(Ll/ufm$d;)V", "", "run", "()V", "a", "Ll/ufm$d;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class RunnableC20420b implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C20422d key;

        public RunnableC20420b(@NotNull C20422d c20422d) {
            c20422d.getClass();
            this.key = c20422d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                ufm.INSTANCE.m193391e(this.key);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.ufm$c */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/ufm$c;", "", "Ll/him;", SocialConstants.TYPE_REQUEST, "<init>", "(Ll/him;)V", "a", "Ll/him;", "()Ll/him;", "e", "Ll/eaq0$b;", "b", "Ll/eaq0$b;", "()Ll/eaq0$b;", "f", "(Ll/eaq0$b;)V", "workItem", "", "c", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "isCancelled", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @VisibleForTesting(otherwise = 2)
    public static final class C20421c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public him request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public eaq0.InterfaceC16564b workItem;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean isCancelled;

        public C20421c(@NotNull him himVar) {
            himVar.getClass();
            this.request = himVar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final him getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final eaq0.InterfaceC16564b getWorkItem() {
            return this.workItem;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsCancelled() {
            return this.isCancelled;
        }

        /* JADX INFO: renamed from: d */
        public final void m193402d(boolean z) {
            this.isCancelled = z;
        }

        /* JADX INFO: renamed from: e */
        public final void m193403e(@NotNull him himVar) {
            himVar.getClass();
            this.request = himVar;
        }

        /* JADX INFO: renamed from: f */
        public final void m193404f(@Nullable eaq0.InterfaceC16564b interfaceC16564b) {
            this.workItem = interfaceC16564b;
        }
    }

    /* JADX INFO: renamed from: l.ufm$d */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/ufm$d;", "", "Landroid/net/Uri;", "uri", "tag", "<init>", "(Landroid/net/Uri;Ljava/lang/Object;)V", "", "hashCode", "()I", "o", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @VisibleForTesting(otherwise = 2)
    public static final class C20422d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Uri uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Object tag;

        public C20422d(@NotNull Uri uri, @NotNull Object obj) {
            uri.getClass();
            obj.getClass();
            this.uri = uri;
            this.tag = obj;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getTag() {
            return this.tag;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public boolean equals(@Nullable Object o) {
            if (o != null && (o instanceof C20422d)) {
                C20422d c20422d = (C20422d) o;
                if (c20422d.uri == this.uri && c20422d.tag == this.tag) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((1073 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m193386a(him himVar, Exception exc, boolean z, Bitmap bitmap, him.InterfaceC17326b interfaceC17326b) {
        himVar.getClass();
        interfaceC17326b.mo9205a(new jim(himVar, exc, z, bitmap));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m193389d(@NotNull him request) {
        boolean z;
        request.getClass();
        C20422d c20422d = new C20422d(request.getImageUri(), request.getCallerTag());
        Map<C20422d, C20421c> map = pendingRequests;
        synchronized (map) {
            try {
                C20421c c20421c = map.get(c20422d);
                if (c20421c != null) {
                    eaq0.InterfaceC16564b workItem = c20421c.getWorkItem();
                    z = true;
                    if (workItem == null || !workItem.cancel()) {
                        c20421c.m193402d(true);
                    } else {
                        map.remove(c20422d);
                    }
                } else {
                    z = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m193390f(@Nullable him request) {
        if (request == null) {
            return;
        }
        C20422d c20422d = new C20422d(request.getImageUri(), request.getCallerTag());
        Map<C20422d, C20421c> map = pendingRequests;
        synchronized (map) {
            try {
                C20421c c20421c = map.get(c20422d);
                if (c20421c != null) {
                    c20421c.m193403e(request);
                    c20421c.m193402d(false);
                    eaq0.InterfaceC16564b workItem = c20421c.getWorkItem();
                    if (workItem != null) {
                        workItem.mo115430a();
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    INSTANCE.m193392g(request, c20422d, request.getAllowCachedRedirects());
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX INFO: renamed from: e */
    public final void m193391e(C20422d key) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        Exception facebookException;
        InputStream inputStreamM146096c;
        Bitmap bitmapDecodeStream;
        ?? r1 = 0;
        InputStream inputStream = null;
        r1 = 0;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(key.getUri().toString()).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    ?? responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField("location");
                                    if (!C1657e.m8832c0(headerField)) {
                                        Uri uri = Uri.parse(headerField);
                                        ovj0.m166197a(key.getUri(), uri);
                                        C20421c c20421cM193398m = m193398m(key);
                                        if (c20421cM193398m != null && !c20421cM193398m.getIsCancelled()) {
                                            him request = c20421cM193398m.getRequest();
                                            uri.getClass();
                                            m193392g(request, new C20422d(uri, key.getTag()), false);
                                        }
                                    }
                                    z = false;
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                } catch (IOException e) {
                                    e = e;
                                    z = false;
                                    r4 = 0;
                                    C1657e.m8843j(r4);
                                    C1657e.m8858r(httpURLConnection);
                                    facebookException = e;
                                }
                            } else {
                                inputStreamM146096c = httpURLConnection.getErrorStream();
                                StringBuilder sb = new StringBuilder();
                                if (inputStreamM146096c != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamM146096c);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i = inputStreamReader.read(cArr, 0, 128);
                                        if (i <= 0) {
                                            break;
                                        } else {
                                            sb.append(cArr, 0, i);
                                        }
                                    }
                                    C1657e.m8843j(inputStreamReader);
                                } else {
                                    sb.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb.toString());
                                bitmapDecodeStream = null;
                            }
                            C1657e.m8843j(inputStream);
                            C1657e.m8858r(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z) {
                                m193396k(key, facebookException, bitmap, false);
                            }
                        }
                        inputStreamM146096c = kim.m146096c(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM146096c);
                        facebookException = null;
                        inputStream = inputStreamM146096c;
                        C1657e.m8843j(inputStream);
                        C1657e.m8858r(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e2) {
                        e = e2;
                        r4 = responseCode;
                        C1657e.m8843j(r4);
                        C1657e.m8858r(httpURLConnection);
                        facebookException = e;
                    } catch (Throwable th) {
                        th = th;
                        r1 = responseCode;
                        C1657e.m8843j(r1);
                        C1657e.m8858r(httpURLConnection);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = null;
            r4 = 0;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        if (z) {
            m193396k(key, facebookException, bitmap, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m193392g(him request, C20422d key, boolean allowCachedRedirects) {
        m193394i(request, key, cacheReadQueue, new RunnableC20419a(key, allowCachedRedirects));
    }

    /* JADX INFO: renamed from: h */
    public final void m193393h(him request, C20422d key) {
        m193394i(request, key, downloadQueue, new RunnableC20420b(key));
    }

    /* JADX INFO: renamed from: i */
    public final void m193394i(him request, C20422d key, eaq0 workQueue, Runnable workItem) {
        Map<C20422d, C20421c> map = pendingRequests;
        synchronized (map) {
            C20421c c20421c = new C20421c(request);
            map.put(key, c20421c);
            c20421c.m193404f(eaq0.m115423f(workQueue, workItem, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized Handler m193395j() {
        try {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return handler;
    }

    /* JADX INFO: renamed from: k */
    public final void m193396k(C20422d key, final Exception error, final Bitmap bitmap, final boolean isCachedRedirect) {
        Handler handlerM193395j;
        C20421c c20421cM193398m = m193398m(key);
        if (c20421cM193398m == null || c20421cM193398m.getIsCancelled()) {
            return;
        }
        final him request = c20421cM193398m.getRequest();
        final him.InterfaceC17326b callback = request != null ? request.getCallback() : null;
        if (callback == null || (handlerM193395j = m193395j()) == null) {
            return;
        }
        handlerM193395j.post(new Runnable() { // from class: l.tfm
            @Override // java.lang.Runnable
            public final void run() {
                ufm.m193386a(request, error, isCachedRedirect, bitmap, callback);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m193397l(C20422d key, boolean allowCachedRedirects) {
        InputStream inputStreamM146095b;
        Uri uriM166199c;
        boolean z = false;
        if (!allowCachedRedirects || (uriM166199c = ovj0.m166199c(key.getUri())) == null) {
            inputStreamM146095b = null;
        } else {
            inputStreamM146095b = kim.m146095b(uriM166199c);
            if (inputStreamM146095b != null) {
                z = true;
            }
        }
        if (!z) {
            inputStreamM146095b = kim.m146095b(key.getUri());
        }
        if (inputStreamM146095b != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM146095b);
            C1657e.m8843j(inputStreamM146095b);
            m193396k(key, null, bitmapDecodeStream, z);
            return;
        }
        C20421c c20421cM193398m = m193398m(key);
        him request = c20421cM193398m != null ? c20421cM193398m.getRequest() : null;
        if (c20421cM193398m == null || c20421cM193398m.getIsCancelled() || request == null) {
            return;
        }
        m193393h(request, key);
    }

    /* JADX INFO: renamed from: m */
    public final C20421c m193398m(C20422d key) {
        C20421c c20421cRemove;
        Map<C20422d, C20421c> map = pendingRequests;
        synchronized (map) {
            c20421cRemove = map.remove(key);
        }
        return c20421cRemove;
    }
}

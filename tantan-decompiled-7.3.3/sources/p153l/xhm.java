package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.FacebookException;
import com.facebook.internal.C1680e;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004).1\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'R\u001e\u0010-\u001a\u0004\u0018\u00010(8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020%038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104¨\u00066"}, m88121d2 = {"Ll/xhm;", "", "<init>", "()V", "Ll/kkm;", SocialConstants.TYPE_REQUEST, "", "f", "(Ll/kkm;)V", "", Constants.INAPP_DATA_TAG, "(Ll/kkm;)Z", "Ll/xhm$d;", Constants.KEY_KEY, "allowCachedRedirects", "g", "(Ll/kkm;Ll/xhm$d;Z)V", "h", "(Ll/kkm;Ll/xhm$d;)V", "Ll/jjq0;", "workQueue", "Ljava/lang/Runnable;", "workItem", RXScreenCaptureService.KEY_INDEX, "(Ll/kkm;Ll/xhm$d;Ll/jjq0;Ljava/lang/Runnable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Landroid/graphics/Bitmap;", "bitmap", "isCachedRedirect", "k", "(Ll/xhm$d;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/xhm$d;Z)V", "e", "(Ll/xhm$d;)V", "Ll/xhm$c;", "m", "(Ll/xhm$d;)Ll/xhm$c;", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "j", "()Landroid/os/Handler;", "handler", "b", "Ll/jjq0;", "downloadQueue", "c", "cacheReadQueue", "", "Ljava/util/Map;", "pendingRequests", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xhm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static Handler handler;

    @NotNull
    public static final xhm INSTANCE = new xhm();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jjq0 downloadQueue = new jjq0(8, null, 2, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final jjq0 cacheReadQueue = new jjq0(2, null, 2, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<C21337d, C21336c> pendingRequests = new HashMap();

    /* JADX INFO: renamed from: l.xhm$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/xhm$a;", "Ljava/lang/Runnable;", "Ll/xhm$d;", Constants.KEY_KEY, "", "allowCachedRedirects", "<init>", "(Ll/xhm$d;Z)V", "", "run", "()V", "a", "Ll/xhm$d;", "b", "Z", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class RunnableC21334a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C21337d key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean allowCachedRedirects;

        public RunnableC21334a(@NotNull C21337d c21337d, boolean z) {
            c21337d.getClass();
            this.key = c21337d;
            this.allowCachedRedirects = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                xhm.INSTANCE.m211062l(this.key, this.allowCachedRedirects);
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xhm$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/xhm$b;", "Ljava/lang/Runnable;", "Ll/xhm$d;", Constants.KEY_KEY, "<init>", "(Ll/xhm$d;)V", "", "run", "()V", "a", "Ll/xhm$d;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class RunnableC21335b implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C21337d key;

        public RunnableC21335b(@NotNull C21337d c21337d) {
            c21337d.getClass();
            this.key = c21337d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                xhm.INSTANCE.m211056e(this.key);
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.xhm$c */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m88121d2 = {"Ll/xhm$c;", "", "Ll/kkm;", SocialConstants.TYPE_REQUEST, "<init>", "(Ll/kkm;)V", "a", "Ll/kkm;", "()Ll/kkm;", "e", "Ll/jjq0$b;", "b", "Ll/jjq0$b;", "()Ll/jjq0$b;", "f", "(Ll/jjq0$b;)V", "workItem", "", "c", "Z", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "isCancelled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @VisibleForTesting(otherwise = 2)
    public static final class C21336c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public kkm request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public jjq0.InterfaceC17963b workItem;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean isCancelled;

        public C21336c(@NotNull kkm kkmVar) {
            kkmVar.getClass();
            this.request = kkmVar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final kkm getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final jjq0.InterfaceC17963b getWorkItem() {
            return this.workItem;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsCancelled() {
            return this.isCancelled;
        }

        /* JADX INFO: renamed from: d */
        public final void m211067d(boolean z) {
            this.isCancelled = z;
        }

        /* JADX INFO: renamed from: e */
        public final void m211068e(@NotNull kkm kkmVar) {
            kkmVar.getClass();
            this.request = kkmVar;
        }

        /* JADX INFO: renamed from: f */
        public final void m211069f(@Nullable jjq0.InterfaceC17963b interfaceC17963b) {
            this.workItem = interfaceC17963b;
        }
    }

    /* JADX INFO: renamed from: l.xhm$d */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/xhm$d;", "", "Landroid/net/Uri;", "uri", "tag", "<init>", "(Landroid/net/Uri;Ljava/lang/Object;)V", "", "hashCode", "()I", "o", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @VisibleForTesting(otherwise = 2)
    public static final class C21337d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Uri uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Object tag;

        public C21337d(@NotNull Uri uri, @NotNull Object obj) {
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
            if (o != null && (o instanceof C21337d)) {
                C21337d c21337d = (C21337d) o;
                if (c21337d.uri == this.uri && c21337d.tag == this.tag) {
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
    public static void m211051a(kkm kkmVar, Exception exc, boolean z, Bitmap bitmap, kkm.InterfaceC18196b interfaceC18196b) {
        kkmVar.getClass();
        interfaceC18196b.mo9259a(new mkm(kkmVar, exc, z, bitmap));
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m211054d(@NotNull kkm request) {
        boolean z;
        request.getClass();
        C21337d c21337d = new C21337d(request.getImageUri(), request.getCallerTag());
        Map<C21337d, C21336c> map = pendingRequests;
        synchronized (map) {
            try {
                C21336c c21336c = map.get(c21337d);
                if (c21336c != null) {
                    jjq0.InterfaceC17963b workItem = c21336c.getWorkItem();
                    z = true;
                    if (workItem == null || !workItem.cancel()) {
                        c21336c.m211067d(true);
                    } else {
                        map.remove(c21337d);
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
    public static final void m211055f(@Nullable kkm request) {
        if (request == null) {
            return;
        }
        C21337d c21337d = new C21337d(request.getImageUri(), request.getCallerTag());
        Map<C21337d, C21336c> map = pendingRequests;
        synchronized (map) {
            try {
                C21336c c21336c = map.get(c21337d);
                if (c21336c != null) {
                    c21336c.m211068e(request);
                    c21336c.m211067d(false);
                    jjq0.InterfaceC17963b workItem = c21336c.getWorkItem();
                    if (workItem != null) {
                        workItem.mo145106a();
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    INSTANCE.m211057g(request, c21337d, request.getAllowCachedRedirects());
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
    public final void m211056e(C21337d key) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        Exception facebookException;
        InputStream inputStreamM163660c;
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
                                    if (!C1680e.m8886c0(headerField)) {
                                        Uri uri = Uri.parse(headerField);
                                        s4k0.m184564a(key.getUri(), uri);
                                        C21336c c21336cM211063m = m211063m(key);
                                        if (c21336cM211063m != null && !c21336cM211063m.getIsCancelled()) {
                                            kkm request = c21336cM211063m.getRequest();
                                            uri.getClass();
                                            m211057g(request, new C21337d(uri, key.getTag()), false);
                                        }
                                    }
                                    z = false;
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                } catch (IOException e) {
                                    e = e;
                                    z = false;
                                    r4 = 0;
                                    C1680e.m8897j(r4);
                                    C1680e.m8912r(httpURLConnection);
                                    facebookException = e;
                                }
                            } else {
                                inputStreamM163660c = httpURLConnection.getErrorStream();
                                StringBuilder sb = new StringBuilder();
                                if (inputStreamM163660c != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamM163660c);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i = inputStreamReader.read(cArr, 0, 128);
                                        if (i <= 0) {
                                            break;
                                        } else {
                                            sb.append(cArr, 0, i);
                                        }
                                    }
                                    C1680e.m8897j(inputStreamReader);
                                } else {
                                    sb.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb.toString());
                                bitmapDecodeStream = null;
                            }
                            C1680e.m8897j(inputStream);
                            C1680e.m8912r(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z) {
                                m211061k(key, facebookException, bitmap, false);
                            }
                        }
                        inputStreamM163660c = nkm.m163660c(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM163660c);
                        facebookException = null;
                        inputStream = inputStreamM163660c;
                        C1680e.m8897j(inputStream);
                        C1680e.m8912r(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e2) {
                        e = e2;
                        r4 = responseCode;
                        C1680e.m8897j(r4);
                        C1680e.m8912r(httpURLConnection);
                        facebookException = e;
                    } catch (Throwable th) {
                        th = th;
                        r1 = responseCode;
                        C1680e.m8897j(r1);
                        C1680e.m8912r(httpURLConnection);
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
            m211061k(key, facebookException, bitmap, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m211057g(kkm request, C21337d key, boolean allowCachedRedirects) {
        m211059i(request, key, cacheReadQueue, new RunnableC21334a(key, allowCachedRedirects));
    }

    /* JADX INFO: renamed from: h */
    public final void m211058h(kkm request, C21337d key) {
        m211059i(request, key, downloadQueue, new RunnableC21335b(key));
    }

    /* JADX INFO: renamed from: i */
    public final void m211059i(kkm request, C21337d key, jjq0 workQueue, Runnable workItem) {
        Map<C21337d, C21336c> map = pendingRequests;
        synchronized (map) {
            C21336c c21336c = new C21336c(request);
            map.put(key, c21336c);
            c21336c.m211069f(jjq0.m145099f(workQueue, workItem, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized Handler m211060j() {
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
    public final void m211061k(C21337d key, final Exception error, final Bitmap bitmap, final boolean isCachedRedirect) {
        Handler handlerM211060j;
        C21336c c21336cM211063m = m211063m(key);
        if (c21336cM211063m == null || c21336cM211063m.getIsCancelled()) {
            return;
        }
        final kkm request = c21336cM211063m.getRequest();
        final kkm.InterfaceC18196b callback = request != null ? request.getCallback() : null;
        if (callback == null || (handlerM211060j = m211060j()) == null) {
            return;
        }
        handlerM211060j.post(new Runnable() { // from class: l.whm
            @Override // java.lang.Runnable
            public final void run() {
                xhm.m211051a(request, error, isCachedRedirect, bitmap, callback);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m211062l(C21337d key, boolean allowCachedRedirects) {
        InputStream inputStreamM163659b;
        Uri uriM184566c;
        boolean z = false;
        if (!allowCachedRedirects || (uriM184566c = s4k0.m184566c(key.getUri())) == null) {
            inputStreamM163659b = null;
        } else {
            inputStreamM163659b = nkm.m163659b(uriM184566c);
            if (inputStreamM163659b != null) {
                z = true;
            }
        }
        if (!z) {
            inputStreamM163659b = nkm.m163659b(key.getUri());
        }
        if (inputStreamM163659b != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamM163659b);
            C1680e.m8897j(inputStreamM163659b);
            m211061k(key, null, bitmapDecodeStream, z);
            return;
        }
        C21336c c21336cM211063m = m211063m(key);
        kkm request = c21336cM211063m != null ? c21336cM211063m.getRequest() : null;
        if (c21336cM211063m == null || c21336cM211063m.getIsCancelled() || request == null) {
            return;
        }
        m211058h(request, key);
    }

    /* JADX INFO: renamed from: m */
    public final C21336c m211063m(C21337d key) {
        C21336c c21336cRemove;
        Map<C21337d, C21336c> map = pendingRequests;
        synchronized (map) {
            c21336cRemove = map.remove(key);
        }
        return c21336cRemove;
    }
}

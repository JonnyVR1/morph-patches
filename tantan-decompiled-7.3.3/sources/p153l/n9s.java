package p153l;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u001aR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,¨\u00061"}, m88121d2 = {"Ll/n9s;", "", "<init>", "()V", "", "resourceUrl", "Ll/w8e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "n", "(Ljava/lang/String;Ll/w8e;)Z", "Ll/f9e;", "resourceLoaderInfo", "", BaseSei.f14626Z, "(Ll/f9e;Ll/w8e;)V", "url", c4s.C_ZONE, "(Ljava/lang/String;Ll/w8e;)V", "Lcom/p1/mobile/putong/ui/download/DownloadTask;", "downloadTask", "Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", "A", "(Lcom/p1/mobile/putong/ui/download/DownloadTask;Lcom/p1/mobile/putong/live/base/data/Priority;)V", "o", "(Ljava/lang/String;)V", "task", "u", "(Lcom/p1/mobile/putong/ui/download/DownloadTask;)V", "msg", "q", "(Ljava/lang/String;Ljava/lang/String;)V", "", "progress", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;I)V", "Ljava/io/File;", "file", "w", "(Ljava/lang/String;Ljava/io/File;)V", "D", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "mDownloadingMap", "b", "mDownloadTaskMap", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class n9s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<n9s> f140936c = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.b9s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n9s.m162007c();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, f9e> mDownloadingMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, DownloadTask> mDownloadTaskMap = new ConcurrentHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final n9s m162004B() {
        return INSTANCE.m162034a();
    }

    /* JADX INFO: renamed from: b */
    public static void m162006b(n9s n9sVar, DownloadTask downloadTask, Integer num) {
        String strM80806x = downloadTask.m80806x();
        strM80806x.getClass();
        num.getClass();
        n9sVar.m162030s(strM80806x, num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static n9s m162007c() {
        return new n9s();
    }

    /* JADX INFO: renamed from: d */
    public static void m162008d(n9s n9sVar, f9e f9eVar, String str, DownloadTask downloadTask, File file) {
        if (xgt.m210942f(file)) {
            String strM80806x = downloadTask.m80806x();
            strM80806x.getClass();
            file.getClass();
            n9sVar.m162032w(strM80806x, file);
            return;
        }
        String strM80806x2 = downloadTask.m80806x();
        strM80806x2.getClass();
        n9sVar.m162029q(strM80806x2, "DownloadFail: file not exit!!!");
        if (TextUtils.isEmpty(f9eVar.m124642i())) {
            return;
        }
        rre.m182728H(f9eVar.m124642i(), str, "", "file");
    }

    /* JADX INFO: renamed from: f */
    public static void m162010f(n9s n9sVar, DownloadTask downloadTask) {
        downloadTask.getClass();
        n9sVar.m162031u(downloadTask);
    }

    /* JADX INFO: renamed from: h */
    public static void m162012h(n9s n9sVar, DownloadTask downloadTask) {
        String strM80806x = downloadTask.m80806x();
        strM80806x.getClass();
        n9sVar.m162028o(strM80806x);
    }

    /* JADX INFO: renamed from: l */
    public static void m162016l(n9s n9sVar, f9e f9eVar, String str, DownloadTask downloadTask, Throwable th) {
        String strM80806x = downloadTask.m80806x();
        strM80806x.getClass();
        n9sVar.m162029q(strM80806x, "DownloadFail: " + th.getMessage());
        if (TextUtils.isEmpty(f9eVar.m124642i())) {
            return;
        }
        rre.m182728H(f9eVar.m124642i(), str, "", "download");
    }

    /* JADX INFO: renamed from: p */
    public static final void m162018p(f9e f9eVar, n9s n9sVar, String str) {
        Iterator<T> it = f9eVar.m124644k().iterator();
        while (it.hasNext()) {
            ((w8e) it.next()).onCancel();
        }
        n9sVar.m162026D(str);
    }

    /* JADX INFO: renamed from: r */
    public static final void m162019r(f9e f9eVar, n9s n9sVar, String str, String str2) {
        Iterator<T> it = f9eVar.m124644k().iterator();
        while (it.hasNext()) {
            ((w8e) it.next()).onFailed(str2);
        }
        n9sVar.m162026D(str);
    }

    /* JADX INFO: renamed from: t */
    public static final void m162020t(f9e f9eVar, int i) {
        Iterator<T> it = f9eVar.m124644k().iterator();
        while (it.hasNext()) {
            ((w8e) it.next()).mo76400b(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m162021v(f9e f9eVar) {
        Iterator<T> it = f9eVar.m124644k().iterator();
        while (it.hasNext()) {
            ((w8e) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m162022x(f9e f9eVar, n9s n9sVar, String str, File file) {
        Iterator<T> it = f9eVar.m124644k().iterator();
        while (it.hasNext()) {
            ((w8e) it.next()).mo75431a(file);
        }
        n9sVar.m162026D(str);
    }

    /* JADX INFO: renamed from: y */
    public static final void m162023y(f9e f9eVar, n9s n9sVar, String str, File file) {
        Iterator<T> it = f9eVar.m124644k().iterator();
        while (it.hasNext()) {
            ((w8e) it.next()).mo75431a(file);
        }
        n9sVar.m162026D(str);
    }

    /* JADX INFO: renamed from: A */
    public final void m162024A(DownloadTask downloadTask, Priority priority) {
        if (downloadTask != null) {
            if (TEnum.equals(priority, "IMMEDIATE")) {
                C13274a.m80837u().m80849p(downloadTask);
            } else {
                C13274a.m80837u().m80848o(downloadTask);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m162025C(@NotNull String url, @NotNull w8e listener) {
        ArrayList<w8e> arrayListM124644k;
        url.getClass();
        listener.getClass();
        f9e f9eVar = this.mDownloadingMap.get(url);
        if (f9eVar == null || (arrayListM124644k = f9eVar.m124644k()) == null) {
            return;
        }
        arrayListM124644k.remove(listener);
    }

    /* JADX INFO: renamed from: D */
    public final void m162026D(String url) {
        this.mDownloadTaskMap.remove(url);
        this.mDownloadingMap.remove(url);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m162027n(@NotNull String resourceUrl, @NotNull w8e listener) {
        resourceUrl.getClass();
        listener.getClass();
        f9e f9eVar = this.mDownloadingMap.get(resourceUrl);
        if (f9eVar == null) {
            return false;
        }
        f9eVar.m124640g(listener);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m162028o(final String resourceUrl) {
        final f9e f9eVar = this.mDownloadingMap.get(resourceUrl);
        if (f9eVar != null) {
            l51.m152887G(new Runnable() { // from class: l.d9s
                @Override // java.lang.Runnable
                public final void run() {
                    n9s.m162018p(f9eVar, this, resourceUrl);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m162029q(final String resourceUrl, final String msg) {
        final f9e f9eVar = this.mDownloadingMap.get(resourceUrl);
        if (f9eVar != null) {
            l51.m152887G(new Runnable() { // from class: l.j9s
                @Override // java.lang.Runnable
                public final void run() {
                    n9s.m162019r(f9eVar, this, resourceUrl, msg);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m162030s(String resourceUrl, final int progress) {
        final f9e f9eVar = this.mDownloadingMap.get(resourceUrl);
        if (f9eVar != null) {
            l51.m152887G(new Runnable() { // from class: l.k9s
                @Override // java.lang.Runnable
                public final void run() {
                    n9s.m162020t(f9eVar, progress);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m162031u(DownloadTask task) {
        final f9e f9eVar = this.mDownloadingMap.get(task.m80806x());
        if (f9eVar != null) {
            l51.m152887G(new Runnable() { // from class: l.l9s
                @Override // java.lang.Runnable
                public final void run() {
                    n9s.m162021v(f9eVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m162032w(final String resourceUrl, final File file) {
        final f9e f9eVar = this.mDownloadingMap.get(resourceUrl);
        if (f9eVar != null) {
            if (yj5.m216388a(f9eVar.m124643j())) {
                l51.m152887G(new Runnable() { // from class: l.m9s
                    @Override // java.lang.Runnable
                    public final void run() {
                        n9s.m162022x(f9eVar, this, resourceUrl, file);
                    }
                });
                return;
            }
            rcj<String, File, File> rcjVarM124643j = f9eVar.m124643j();
            rcjVarM124643j.getClass();
            if (xgt.m210942f(rcjVarM124643j.call(resourceUrl, file))) {
                l51.m152887G(new Runnable() { // from class: l.c9s
                    @Override // java.lang.Runnable
                    public final void run() {
                        n9s.m162023y(f9eVar, this, resourceUrl, file);
                    }
                });
            } else {
                m162029q(resourceUrl, "DownloadFail : file not exit after interceptor!! ");
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m162033z(@NotNull final f9e resourceLoaderInfo, @Nullable w8e listener) {
        resourceLoaderInfo.getClass();
        final String strM124646m = resourceLoaderInfo.m124646m();
        f9e f9eVar = this.mDownloadingMap.get(strM124646m);
        if (f9eVar == null) {
            f9eVar = resourceLoaderInfo;
        }
        DownloadTask downloadTask = this.mDownloadTaskMap.get(strM124646m);
        if (listener != null) {
            f9eVar.m124640g(listener);
        }
        if (yj5.m216388a(downloadTask)) {
            DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(strM124646m).m80819k(new y8e()).m80823o(resourceLoaderInfo.m124641h()).m80817i(new y20() { // from class: l.e9s
                @Override // p153l.y20
                public final void call(Object obj) {
                    n9s.m162010f(this.f92693a, (DownloadTask) obj);
                }
            }).m80815g(new z20() { // from class: l.f9s
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    n9s.m162006b(this.f97908a, (DownloadTask) obj, (Integer) obj2);
                }
            }).m80812d(new y20() { // from class: l.g9s
                @Override // p153l.y20
                public final void call(Object obj) {
                    n9s.m162012h(this.f102879a, (DownloadTask) obj);
                }
            }).m80818j(new z20() { // from class: l.h9s
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    n9s.m162008d(this.f108431a, resourceLoaderInfo, strM124646m, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.i9s
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    n9s.m162016l(this.f113501a, resourceLoaderInfo, strM124646m, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80809a();
            this.mDownloadTaskMap.put(strM124646m, downloadTaskM80809a);
            m162024A(downloadTaskM80809a, resourceLoaderInfo.m124645l());
        } else {
            downloadTask.getClass();
            if (downloadTask.m80802t() == 0) {
                m162024A(downloadTask, resourceLoaderInfo.m124645l());
            }
        }
        this.mDownloadingMap.put(strM124646m, f9eVar);
    }

    /* JADX INFO: renamed from: l.n9s$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m88121d2 = {"Ll/n9s$a;", "", "<init>", "()V", "Ll/n9s;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Ll/n9s;", "getInstance$annotations", "instance", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final n9s m162034a() {
            return (n9s) n9s.f140936c.getValue();
        }

        public Companion() {
        }
    }
}

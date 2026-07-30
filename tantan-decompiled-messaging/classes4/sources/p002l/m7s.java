package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.Priority;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
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
import l.e30;
import l.e51;
import l.f30;
import l.j7e;
import l.qib0;
import l.wet;
import l.x9j;
import l.xi5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u001aR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,¨\u00061"}, d2 = {"Ll/m7s;", "", "<init>", "()V", "", "resourceUrl", "Ll/h7e;", "listener", "", "n", "(Ljava/lang/String;Ll/h7e;)Z", "Ll/q7e;", "resourceLoaderInfo", "", "z", "(Ll/q7e;Ll/h7e;)V", "url", "C", "(Ljava/lang/String;Ll/h7e;)V", "Lcom/p1/mobile/putong/ui/download/DownloadTask;", "downloadTask", "Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", "A", "(Lcom/p1/mobile/putong/ui/download/DownloadTask;Lcom/p1/mobile/putong/live/base/data/Priority;)V", "o", "(Ljava/lang/String;)V", "task", "u", "(Lcom/p1/mobile/putong/ui/download/DownloadTask;)V", "msg", "q", "(Ljava/lang/String;Ljava/lang/String;)V", "", "progress", "s", "(Ljava/lang/String;I)V", "Ljava/io/File;", "file", "w", "(Ljava/lang/String;Ljava/io/File;)V", "D", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "mDownloadingMap", "b", "mDownloadTaskMap", "Companion", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class m7s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<m7s> f15264c = LazyKt__LazyJVMKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.a7s
        public final Object invoke() {
            return m7s.m17732c();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, q7e> mDownloadingMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, DownloadTask> mDownloadTaskMap = new ConcurrentHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: B */
    public static final m7s m17729B() {
        return INSTANCE.m17759a();
    }

    /* JADX INFO: renamed from: b */
    public static void m17731b(m7s m7sVar, DownloadTask downloadTask, Integer num) {
        String strX = downloadTask.x();
        strX.getClass();
        num.getClass();
        m7sVar.m17755s(strX, num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static m7s m17732c() {
        return new m7s();
    }

    /* JADX INFO: renamed from: d */
    public static void m17733d(m7s m7sVar, q7e q7eVar, String str, DownloadTask downloadTask, File file) {
        if (wet.f(file)) {
            String strX = downloadTask.x();
            strX.getClass();
            file.getClass();
            m7sVar.m17757w(strX, file);
            return;
        }
        String strX2 = downloadTask.x();
        strX2.getClass();
        m7sVar.m17754q(strX2, "DownloadFail: file not exit!!!");
        if (TextUtils.isEmpty(q7eVar.m21042i())) {
            return;
        }
        nqe.m18945H(q7eVar.m21042i(), str, "", "file");
    }

    /* JADX INFO: renamed from: f */
    public static void m17735f(m7s m7sVar, DownloadTask downloadTask) {
        downloadTask.getClass();
        m7sVar.m17756u(downloadTask);
    }

    /* JADX INFO: renamed from: h */
    public static void m17737h(m7s m7sVar, DownloadTask downloadTask) {
        String strX = downloadTask.x();
        strX.getClass();
        m7sVar.m17753o(strX);
    }

    /* JADX INFO: renamed from: l */
    public static void m17741l(m7s m7sVar, q7e q7eVar, String str, DownloadTask downloadTask, Throwable th) {
        String strX = downloadTask.x();
        strX.getClass();
        m7sVar.m17754q(strX, "DownloadFail: " + th.getMessage());
        if (TextUtils.isEmpty(q7eVar.m21042i())) {
            return;
        }
        nqe.m18945H(q7eVar.m21042i(), str, "", "download");
    }

    /* JADX INFO: renamed from: p */
    public static final void m17743p(q7e q7eVar, m7s m7sVar, String str) {
        Iterator<T> it = q7eVar.m21044k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).onCancel();
        }
        m7sVar.m17751D(str);
    }

    /* JADX INFO: renamed from: r */
    public static final void m17744r(q7e q7eVar, m7s m7sVar, String str, String str2) {
        Iterator<T> it = q7eVar.m21044k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).onFailed(str2);
        }
        m7sVar.m17751D(str);
    }

    /* JADX INFO: renamed from: t */
    public static final void m17745t(q7e q7eVar, int i) {
        Iterator<T> it = q7eVar.m21044k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).mo8833b(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m17746v(q7e q7eVar) {
        Iterator<T> it = q7eVar.m21044k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m17747x(q7e q7eVar, m7s m7sVar, String str, File file) {
        Iterator<T> it = q7eVar.m21044k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).mo7819a(file);
        }
        m7sVar.m17751D(str);
    }

    /* JADX INFO: renamed from: y */
    public static final void m17748y(q7e q7eVar, m7s m7sVar, String str, File file) {
        Iterator<T> it = q7eVar.m21044k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).mo7819a(file);
        }
        m7sVar.m17751D(str);
    }

    /* JADX INFO: renamed from: A */
    public final void m17749A(DownloadTask downloadTask, Priority priority) {
        if (downloadTask != null) {
            if (TEnum.equals(priority, "IMMEDIATE")) {
                a.u().p(downloadTask);
            } else {
                a.u().o(downloadTask);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m17750C(@NotNull String url, @NotNull h7e listener) {
        ArrayList<h7e> arrayListM21044k;
        url.getClass();
        listener.getClass();
        q7e q7eVar = this.mDownloadingMap.get(url);
        if (q7eVar == null || (arrayListM21044k = q7eVar.m21044k()) == null) {
            return;
        }
        arrayListM21044k.remove(listener);
    }

    /* JADX INFO: renamed from: D */
    public final void m17751D(String url) {
        this.mDownloadTaskMap.remove(url);
        this.mDownloadingMap.remove(url);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m17752n(@NotNull String resourceUrl, @NotNull h7e listener) {
        resourceUrl.getClass();
        listener.getClass();
        q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar == null) {
            return false;
        }
        q7eVar.m21040g(listener);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m17753o(final String resourceUrl) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            e51.G(new Runnable() { // from class: l.c7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m17743p(q7eVar, this, resourceUrl);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m17754q(final String resourceUrl, final String msg) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            e51.G(new Runnable() { // from class: l.i7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m17744r(q7eVar, this, resourceUrl, msg);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m17755s(String resourceUrl, final int progress) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            e51.G(new Runnable() { // from class: l.j7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m17745t(q7eVar, progress);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m17756u(DownloadTask task) {
        final q7e q7eVar = this.mDownloadingMap.get(task.x());
        if (q7eVar != null) {
            e51.G(new Runnable() { // from class: l.k7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m17746v(q7eVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m17757w(final String resourceUrl, final File file) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            if (xi5.a(q7eVar.m21043j())) {
                e51.G(new Runnable() { // from class: l.l7s
                    @Override // java.lang.Runnable
                    public final void run() {
                        m7s.m17747x(q7eVar, this, resourceUrl, file);
                    }
                });
                return;
            }
            x9j<String, File, File> x9jVarM21043j = q7eVar.m21043j();
            x9jVarM21043j.getClass();
            if (wet.f((File) x9jVarM21043j.call(resourceUrl, file))) {
                e51.G(new Runnable() { // from class: l.b7s
                    @Override // java.lang.Runnable
                    public final void run() {
                        m7s.m17748y(q7eVar, this, resourceUrl, file);
                    }
                });
            } else {
                m17754q(resourceUrl, "DownloadFail : file not exit after interceptor!! ");
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m17758z(@NotNull final q7e resourceLoaderInfo, @Nullable h7e listener) {
        resourceLoaderInfo.getClass();
        final String strM21046m = resourceLoaderInfo.m21046m();
        q7e q7eVar = this.mDownloadingMap.get(strM21046m);
        if (q7eVar == null) {
            q7eVar = resourceLoaderInfo;
        }
        DownloadTask downloadTask = this.mDownloadTaskMap.get(strM21046m);
        if (listener != null) {
            q7eVar.m21040g(listener);
        }
        if (xi5.a(downloadTask)) {
            DownloadTask downloadTaskA = new DownloadTask.b(qib0.H.getDownloadHttp()).q(strM21046m).k(new j7e()).o(resourceLoaderInfo.m21041h()).i(new e30() { // from class: l.d7s
                public final void call(Object obj) {
                    m7s.m17735f(this.f9091a, (DownloadTask) obj);
                }
            }).g(new f30() { // from class: l.e7s
                public final void call(Object obj, Object obj2) {
                    m7s.m17731b(this.f9621a, (DownloadTask) obj, (Integer) obj2);
                }
            }).d(new e30() { // from class: l.f7s
                public final void call(Object obj) {
                    m7s.m17737h(this.f10182a, (DownloadTask) obj);
                }
            }).j(new f30() { // from class: l.g7s
                public final void call(Object obj, Object obj2) {
                    m7s.m17733d(this.f11301a, resourceLoaderInfo, strM21046m, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.h7s
                public final void call(Object obj, Object obj2) {
                    m7s.m17741l(this.f11930a, resourceLoaderInfo, strM21046m, (DownloadTask) obj, (Throwable) obj2);
                }
            }).a();
            this.mDownloadTaskMap.put(strM21046m, downloadTaskA);
            m17749A(downloadTaskA, resourceLoaderInfo.m21045l());
        } else {
            downloadTask.getClass();
            if (downloadTask.t() == 0) {
                m17749A(downloadTask, resourceLoaderInfo.m21045l());
            }
        }
        this.mDownloadingMap.put(strM21046m, q7eVar);
    }

    /* JADX INFO: renamed from: l.m7s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ll/m7s$a;", "", "<init>", "()V", "Ll/m7s;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Ll/m7s;", "getInstance$annotations", "instance", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final m7s m17759a() {
            return (m7s) m7s.f15264c.getValue();
        }

        public Companion() {
        }
    }
}

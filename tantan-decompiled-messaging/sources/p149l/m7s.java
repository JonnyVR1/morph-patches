package p149l;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
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
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u001aR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,¨\u00061"}, m87232d2 = {"Ll/m7s;", "", "<init>", "()V", "", "resourceUrl", "Ll/h7e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "n", "(Ljava/lang/String;Ll/h7e;)Z", "Ll/q7e;", "resourceLoaderInfo", "", BaseSei.f13932Z, "(Ll/q7e;Ll/h7e;)V", "url", b2s.C_ZONE, "(Ljava/lang/String;Ll/h7e;)V", "Lcom/p1/mobile/putong/ui/download/DownloadTask;", "downloadTask", "Lcom/p1/mobile/putong/live/base/data/Priority;", "priority", "A", "(Lcom/p1/mobile/putong/ui/download/DownloadTask;Lcom/p1/mobile/putong/live/base/data/Priority;)V", "o", "(Ljava/lang/String;)V", "task", "u", "(Lcom/p1/mobile/putong/ui/download/DownloadTask;)V", "msg", "q", "(Ljava/lang/String;Ljava/lang/String;)V", "", "progress", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;I)V", "Ljava/io/File;", "file", "w", "(Ljava/lang/String;Ljava/io/File;)V", "D", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "mDownloadingMap", "b", "mDownloadTaskMap", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class m7s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<m7s> f131841c = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.a7s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m7s.m153389c();
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
    public static final m7s m153386B() {
        return INSTANCE.m153416a();
    }

    /* JADX INFO: renamed from: b */
    public static void m153388b(m7s m7sVar, DownloadTask downloadTask, Integer num) {
        String strM79623x = downloadTask.m79623x();
        strM79623x.getClass();
        num.getClass();
        m7sVar.m153412s(strM79623x, num.intValue());
    }

    /* JADX INFO: renamed from: c */
    public static m7s m153389c() {
        return new m7s();
    }

    /* JADX INFO: renamed from: d */
    public static void m153390d(m7s m7sVar, q7e q7eVar, String str, DownloadTask downloadTask, File file) {
        if (wet.m202927f(file)) {
            String strM79623x = downloadTask.m79623x();
            strM79623x.getClass();
            file.getClass();
            m7sVar.m153414w(strM79623x, file);
            return;
        }
        String strM79623x2 = downloadTask.m79623x();
        strM79623x2.getClass();
        m7sVar.m153411q(strM79623x2, "DownloadFail: file not exit!!!");
        if (TextUtils.isEmpty(q7eVar.m173243i())) {
            return;
        }
        nqe.m160594H(q7eVar.m173243i(), str, "", "file");
    }

    /* JADX INFO: renamed from: f */
    public static void m153392f(m7s m7sVar, DownloadTask downloadTask) {
        downloadTask.getClass();
        m7sVar.m153413u(downloadTask);
    }

    /* JADX INFO: renamed from: h */
    public static void m153394h(m7s m7sVar, DownloadTask downloadTask) {
        String strM79623x = downloadTask.m79623x();
        strM79623x.getClass();
        m7sVar.m153410o(strM79623x);
    }

    /* JADX INFO: renamed from: l */
    public static void m153398l(m7s m7sVar, q7e q7eVar, String str, DownloadTask downloadTask, Throwable th) {
        String strM79623x = downloadTask.m79623x();
        strM79623x.getClass();
        m7sVar.m153411q(strM79623x, "DownloadFail: " + th.getMessage());
        if (TextUtils.isEmpty(q7eVar.m173243i())) {
            return;
        }
        nqe.m160594H(q7eVar.m173243i(), str, "", "download");
    }

    /* JADX INFO: renamed from: p */
    public static final void m153400p(q7e q7eVar, m7s m7sVar, String str) {
        Iterator<T> it = q7eVar.m173245k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).onCancel();
        }
        m7sVar.m153408D(str);
    }

    /* JADX INFO: renamed from: r */
    public static final void m153401r(q7e q7eVar, m7s m7sVar, String str, String str2) {
        Iterator<T> it = q7eVar.m173245k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).onFailed(str2);
        }
        m7sVar.m153408D(str);
    }

    /* JADX INFO: renamed from: t */
    public static final void m153402t(q7e q7eVar, int i) {
        Iterator<T> it = q7eVar.m173245k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).mo75217b(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m153403v(q7e q7eVar) {
        Iterator<T> it = q7eVar.m173245k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m153404x(q7e q7eVar, m7s m7sVar, String str, File file) {
        Iterator<T> it = q7eVar.m173245k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).mo74248a(file);
        }
        m7sVar.m153408D(str);
    }

    /* JADX INFO: renamed from: y */
    public static final void m153405y(q7e q7eVar, m7s m7sVar, String str, File file) {
        Iterator<T> it = q7eVar.m173245k().iterator();
        while (it.hasNext()) {
            ((h7e) it.next()).mo74248a(file);
        }
        m7sVar.m153408D(str);
    }

    /* JADX INFO: renamed from: A */
    public final void m153406A(DownloadTask downloadTask, Priority priority) {
        if (downloadTask != null) {
            if (TEnum.equals(priority, "IMMEDIATE")) {
                C13111a.m79654u().m79666p(downloadTask);
            } else {
                C13111a.m79654u().m79665o(downloadTask);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m153407C(@NotNull String url, @NotNull h7e listener) {
        ArrayList<h7e> arrayListM173245k;
        url.getClass();
        listener.getClass();
        q7e q7eVar = this.mDownloadingMap.get(url);
        if (q7eVar == null || (arrayListM173245k = q7eVar.m173245k()) == null) {
            return;
        }
        arrayListM173245k.remove(listener);
    }

    /* JADX INFO: renamed from: D */
    public final void m153408D(String url) {
        this.mDownloadTaskMap.remove(url);
        this.mDownloadingMap.remove(url);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m153409n(@NotNull String resourceUrl, @NotNull h7e listener) {
        resourceUrl.getClass();
        listener.getClass();
        q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar == null) {
            return false;
        }
        q7eVar.m173241g(listener);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m153410o(final String resourceUrl) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            e51.m114742G(new Runnable() { // from class: l.c7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m153400p(q7eVar, this, resourceUrl);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m153411q(final String resourceUrl, final String msg) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            e51.m114742G(new Runnable() { // from class: l.i7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m153401r(q7eVar, this, resourceUrl, msg);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m153412s(String resourceUrl, final int progress) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            e51.m114742G(new Runnable() { // from class: l.j7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m153402t(q7eVar, progress);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m153413u(DownloadTask task) {
        final q7e q7eVar = this.mDownloadingMap.get(task.m79623x());
        if (q7eVar != null) {
            e51.m114742G(new Runnable() { // from class: l.k7s
                @Override // java.lang.Runnable
                public final void run() {
                    m7s.m153403v(q7eVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m153414w(final String resourceUrl, final File file) {
        final q7e q7eVar = this.mDownloadingMap.get(resourceUrl);
        if (q7eVar != null) {
            if (xi5.m208914a(q7eVar.m173244j())) {
                e51.m114742G(new Runnable() { // from class: l.l7s
                    @Override // java.lang.Runnable
                    public final void run() {
                        m7s.m153404x(q7eVar, this, resourceUrl, file);
                    }
                });
                return;
            }
            x9j<String, File, File> x9jVarM173244j = q7eVar.m173244j();
            x9jVarM173244j.getClass();
            if (wet.m202927f(x9jVarM173244j.call(resourceUrl, file))) {
                e51.m114742G(new Runnable() { // from class: l.b7s
                    @Override // java.lang.Runnable
                    public final void run() {
                        m7s.m153405y(q7eVar, this, resourceUrl, file);
                    }
                });
            } else {
                m153411q(resourceUrl, "DownloadFail : file not exit after interceptor!! ");
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m153415z(@NotNull final q7e resourceLoaderInfo, @Nullable h7e listener) {
        resourceLoaderInfo.getClass();
        final String strM173247m = resourceLoaderInfo.m173247m();
        q7e q7eVar = this.mDownloadingMap.get(strM173247m);
        if (q7eVar == null) {
            q7eVar = resourceLoaderInfo;
        }
        DownloadTask downloadTask = this.mDownloadTaskMap.get(strM173247m);
        if (listener != null) {
            q7eVar.m173241g(listener);
        }
        if (xi5.m208914a(downloadTask)) {
            DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(strM173247m).m79636k(new j7e()).m79640o(resourceLoaderInfo.m173242h()).m79634i(new e30() { // from class: l.d7s
                @Override // p149l.e30
                public final void call(Object obj) {
                    m7s.m153392f(this.f84786a, (DownloadTask) obj);
                }
            }).m79632g(new f30() { // from class: l.e7s
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    m7s.m153388b(this.f89746a, (DownloadTask) obj, (Integer) obj2);
                }
            }).m79629d(new e30() { // from class: l.f7s
                @Override // p149l.e30
                public final void call(Object obj) {
                    m7s.m153394h(this.f96281a, (DownloadTask) obj);
                }
            }).m79635j(new f30() { // from class: l.g7s
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    m7s.m153390d(this.f101429a, resourceLoaderInfo, strM173247m, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.h7s
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    m7s.m153398l(this.f106332a, resourceLoaderInfo, strM173247m, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79626a();
            this.mDownloadTaskMap.put(strM173247m, downloadTaskM79626a);
            m153406A(downloadTaskM79626a, resourceLoaderInfo.m173246l());
        } else {
            downloadTask.getClass();
            if (downloadTask.m79619t() == 0) {
                m153406A(downloadTask, resourceLoaderInfo.m173246l());
            }
        }
        this.mDownloadingMap.put(strM173247m, q7eVar);
    }

    /* JADX INFO: renamed from: l.m7s$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m87232d2 = {"Ll/m7s$a;", "", "<init>", "()V", "Ll/m7s;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Ll/m7s;", "getInstance$annotations", "instance", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final m7s m153416a() {
            return (m7s) m7s.f131841c.getValue();
        }

        public Companion() {
        }
    }
}

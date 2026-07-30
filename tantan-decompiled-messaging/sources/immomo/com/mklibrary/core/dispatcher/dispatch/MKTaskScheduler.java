package immomo.com.mklibrary.core.dispatcher.dispatch;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.MMDispatchers;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b0g0;
import p149l.chw;
import p149l.cn5;
import p149l.j6f;
import p149l.jh3;
import p149l.ln5;
import p149l.ppb;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\u001cJ!\u0010$\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u0014J!\u0010)\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010*R>\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,0+j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,`-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0004048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0004048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, m87232d2 = {"Limmomo/com/mklibrary/core/dispatcher/dispatch/MKTaskScheduler;", "", "<init>", "()V", "Ll/chw;", "checkTask", "", "b", "(Ll/chw;)Z", "", "checkTasks", "", "idByLevel", "k", "(Ljava/util/List;Ljava/lang/String;)Z", "forceUpload", "", Constants.INAPP_DATA_TAG, "(Z)V", "p", "()Z", RXScreenCaptureService.KEY_INDEX, "", "h", "()I", "j", "task", "a", "(Ll/chw;)V", "Ll/ppb;", "g", "()Ll/ppb;", "mkBaseTask", "m", "sid", "loadUrl", "o", "(Ljava/lang/String;Ljava/lang/String;)V", "n", "(Ljava/lang/String;)V", "c", BLiveStormDanmakuGiftResourceType.f44444l, "(ZLjava/lang/String;)V", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getRenderingPageTask", "()Ljava/util/LinkedHashMap;", "setRenderingPageTask", "(Ljava/util/LinkedHashMap;)V", "renderingPageTask", "", "Ljava/util/List;", "getReadyTasks", "()Ljava/util/List;", "setReadyTasks", "(Ljava/util/List;)V", "readyTasks", "getRunningTasks", "setRunningTasks", "runningTasks", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isNeedSortTask", "Ll/ln5;", "e", "Ll/ln5;", "job", "Lkotlin/coroutines/CoroutineContext;", "f", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class MKTaskScheduler {
    public static final MKTaskScheduler INSTANCE = new MKTaskScheduler();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static volatile LinkedHashMap<String, Long> renderingPageTask = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static volatile List<chw> readyTasks = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static volatile List<chw> runningTasks = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static AtomicBoolean isNeedSortTask = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final ln5 job = JobKt__JobKt.m93616b(null, 1, null);

    /* JADX INFO: renamed from: immomo.com.mklibrary.core.dispatcher.dispatch.MKTaskScheduler$a */
    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class C14922a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return cn5.m107733d(Integer.valueOf(((chw) t2).mo107003h()), Integer.valueOf(((chw) t).mo107003h()));
        }
    }

    private MKTaskScheduler() {
    }

    /* JADX INFO: renamed from: b */
    private final boolean m87125b(chw checkTask) {
        if (checkTask != null) {
            String strMo106999d = checkTask.mo106999d();
            if (checkTask.mo106998c() == 0) {
                return true;
            }
            MKTaskScheduler mKTaskScheduler = INSTANCE;
            if (!mKTaskScheduler.m87132k(runningTasks, strMo106999d) && !mKTaskScheduler.m87132k(readyTasks, strMo106999d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private final synchronized void m87126d(boolean forceUpload) {
        try {
            if (!m87135c() || forceUpload) {
                if (m87130i() && !m87133p()) {
                    ArrayList arrayList = new ArrayList();
                    if (isNeedSortTask.get()) {
                        List<chw> list = readyTasks;
                        if (list.size() > 1) {
                            CollectionsKt.sortWith(list, new C14922a());
                        }
                        isNeedSortTask.set(false);
                    }
                    Iterator<chw> it = readyTasks.iterator();
                    while (it.hasNext() && !m87133p()) {
                        chw next = it.next();
                        arrayList.add(next);
                        runningTasks.add(next);
                    }
                    readyTasks.removeAll(arrayList);
                    if (arrayList.size() > 0) {
                        jh3.m141367d(m87136g(), MMDispatchers.INSTANCE.m18429b(), null, new MKTaskScheduler$excTasks$2(arrayList, null), 2, null);
                    }
                }
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKTaskExecutor", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m87127e(MKTaskScheduler mKTaskScheduler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mKTaskScheduler.m87126d(z);
    }

    /* JADX INFO: renamed from: f */
    private final CoroutineContext m87128f() {
        return MMDispatchers.INSTANCE.m18428a().plus(job);
    }

    /* JADX INFO: renamed from: h */
    private final int m87129h() {
        return runningTasks.size();
    }

    /* JADX INFO: renamed from: i */
    private final boolean m87130i() {
        return readyTasks.size() > 0;
    }

    /* JADX INFO: renamed from: j */
    private final boolean m87131j() {
        return renderingPageTask.size() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
    /* JADX INFO: renamed from: k */
    private final boolean m87132k(List<? extends chw> checkTasks, String idByLevel) {
        for (Object obj : checkTasks) {
            if (b0g0.m99768a(((chw) obj).mo106999d(), idByLevel)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m87133p() {
        return m87129h() >= 5;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m87134a(@Nullable chw task) {
        if (task != null) {
            try {
                if (INSTANCE.m87125b(task)) {
                    if (readyTasks.size() > 0 && task.mo107003h() > ((chw) CollectionsKt.last((List) readyTasks)).mo107003h()) {
                        isNeedSortTask.set(true);
                    }
                    readyTasks.add(task);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m87135c() {
        try {
            if (m87131j()) {
                Iterator<Map.Entry<String, Long>> it = renderingPageTask.entrySet().iterator();
                while (it.hasNext()) {
                    if (SystemClock.uptimeMillis() - it.next().getValue().longValue() > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return m87131j();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final ppb m87136g() {
        return C15424f.m94055a(m87128f());
    }

    /* JADX INFO: renamed from: l */
    public final void m87137l(boolean forceUpload, @Nullable String sid) {
        m87139n(sid);
        m87126d(forceUpload);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m87138m(@Nullable chw mkBaseTask) {
        if (mkBaseTask != null) {
            try {
                mkBaseTask.mo107005j();
                if (runningTasks.contains(mkBaseTask)) {
                    runningTasks.remove(mkBaseTask);
                }
                m87127e(INSTANCE, false, 1, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m87139n(@Nullable String sid) {
        if (sid != null) {
            if (INSTANCE.m87131j()) {
                renderingPageTask.remove(sid);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m87140o(@Nullable String sid, @Nullable String loadUrl) {
        if (sid != null) {
            try {
                if ((!StringsKt.m93438e0(sid)) && loadUrl != null && (!StringsKt.m93438e0(loadUrl)) && (C15386d.m93483J(loadUrl, "https://", false, 2, null) || C15386d.m93483J(loadUrl, "http://", false, 2, null))) {
                    renderingPageTask.put(sid, Long.valueOf(SystemClock.uptimeMillis()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

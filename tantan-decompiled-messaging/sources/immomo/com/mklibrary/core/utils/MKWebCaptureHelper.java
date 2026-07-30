package immomo.com.mklibrary.core.utils;

import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmutil.task.MMDispatchers;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b0g0;
import p149l.cn5;
import p149l.j6f;
import p149l.jh3;
import p149l.ln5;
import p149l.mei;
import p149l.ohw;
import p149l.ox50;
import p149l.pgw;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m87232d2 = {"Limmomo/com/mklibrary/core/utils/MKWebCaptureHelper;", "", "<init>", "()V", "", "m", "Limmomo/com/mklibrary/core/base/ui/MKWebView;", "mkWebView", "", "url", "g", "(Limmomo/com/mklibrary/core/base/ui/MKWebView;Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f44444l, "(Limmomo/com/mklibrary/core/base/ui/MKWebView;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isReleasedCaptureTask", "b", "isLoadedCaptureTask", "Ll/ln5;", "c", "Ll/ln5;", "curCaptureJob", "Lkotlin/coroutines/CoroutineContext;", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/coroutines/CoroutineContext;", "captureCoroutineContext", "Companion", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class MKWebCaptureHelper {

    /* JADX INFO: renamed from: f */
    private static long f63306f;

    /* JADX INFO: renamed from: g */
    private static int f63307g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AtomicBoolean isReleasedCaptureTask = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AtomicBoolean isLoadedCaptureTask = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ln5 curCaptureJob = JobKt__JobKt.m93616b(null, 1, null);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    private static long f63305e = 2592000000L;

    /* JADX INFO: renamed from: h */
    @NotNull
    private static final ln5 f63308h = JobKt__JobKt.m93616b(null, 1, null);

    /* JADX INFO: renamed from: d */
    private static boolean f63304d = mei.m154193C();

    static {
        f63306f = 524288000L;
        f63307g = 50;
        f63307g = mei.m154194D();
        f63306f = ((long) (mei.m154195E() * 1024)) * 1024;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m87166f() {
        INSTANCE.m87176b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m87167h(@NotNull String str, int i) {
        INSTANCE.m87179f(str, i);
    }

    /* JADX INFO: renamed from: i */
    private final CoroutineContext m87168i() {
        return MMDispatchers.INSTANCE.m18429b().plus(this.curCaptureJob);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m87169j(@Nullable String str) {
        return INSTANCE.m87182i(str);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m87170k() {
        return f63304d;
    }

    /* JADX INFO: renamed from: m */
    private final void m87171m() {
        try {
            if (this.isLoadedCaptureTask.get()) {
                ln5 ln5Var = this.curCaptureJob;
                if (ln5Var.isCancelled()) {
                    return;
                }
                InterfaceC15486o.a.m94245a(ln5Var, null, 1, null);
                MDLog.m7395i("MKWebCaptureHelper", "释放releaseCaptureTask");
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKWebCaptureHelper", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m87172g(@Nullable MKWebView mkWebView, @Nullable String url) {
        if (mkWebView == null || url == null) {
            return;
        }
        try {
            if (f63304d && !this.isLoadedCaptureTask.get() && !this.isReleasedCaptureTask.get() && C15386d.m93483J(url, "http", false, 2, null) && StringsKt.m93412P(url, "_capture", false, 2, null)) {
                MDLog.m7395i("MKWebCaptureHelper", url);
                WeakReference weakReference = new WeakReference(mkWebView);
                if (this.curCaptureJob.isCancelled()) {
                    return;
                }
                this.isLoadedCaptureTask.set(true);
                jh3.m141367d(C15424f.m94055a(m87168i()), null, null, new MKWebCaptureHelper$checkLoad$1(this, url, weakReference, mkWebView, null), 3, null);
            }
        } catch (Throwable th) {
            MDLog.printErrStackTrace("MKWebCaptureHelper", th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m87173l(@Nullable MKWebView mkWebView) {
        if (f63304d && mkWebView != null) {
            this.isReleasedCaptureTask.set(true);
            if (!mkWebView.m87088s0()) {
                m87171m();
            }
            if (mkWebView.m87088s0()) {
                mkWebView.setLoadedCapture(false);
                if (mkWebView.getForeground() != null) {
                    jh3.m141367d(C15424f.m94055a(INSTANCE.m87181h()), MMDispatchers.INSTANCE.m18428a(), null, new MKWebCaptureHelper$onRelease$1(mkWebView, null), 2, null);
                }
            }
        }
    }

    @Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0003J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0003J%\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0003R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010#R\u0014\u0010-\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010#R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010#R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010#¨\u00060"}, m87232d2 = {"Limmomo/com/mklibrary/core/utils/MKWebCaptureHelper$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "c", "(Ljava/io/File;)Z", "", "url", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ljava/lang/String;", "", "type", "", "f", "(Ljava/lang/String;I)V", "e", "g", "()Ljava/io/File;", Constants.INAPP_DATA_TAG, "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "b", "Ll/ln5;", "job", "Ll/ln5;", "j", "()Ll/ln5;", "Lkotlin/coroutines/CoroutineContext;", "h", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "FILE_PNG", "Ljava/lang/String;", "", "FILE_SIZE_LIMIT", "J", "FILE_TIME_LIMIT", "MAX_FILE_COUNT", "I", "MAX_FILE_COUNT_DELETE", "NO_MEDIA_FILE", "TAG", "TAG_CAPTURE", "TYPE_FULL", "TYPE_HOST", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: immomo.com.mklibrary.core.utils.MKWebCaptureHelper$Companion$a */
        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m87233k = 3, m87234mv = {1, 1, 16})
        public static final class C14924a<T> implements Comparator<T> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return cn5.m107733d(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t).lastModified()));
            }
        }

        /* JADX INFO: renamed from: immomo.com.mklibrary.core.utils.MKWebCaptureHelper$Companion$b */
        @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m87232d2 = {"<anonymous>", "", Careers.f38732it, "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, m87233k = 3, m87234mv = {1, 1, 16})
        public static final class C14925b implements FileFilter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Ref.LongRef f63312a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Ref.IntRef f63313b;

            public C14925b(Ref.LongRef longRef, Ref.IntRef intRef) {
                this.f63312a = longRef;
                this.f63313b = intRef;
            }

            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                file.getClass();
                boolean z = file.isFile() && !Intrinsics.m87488d(".nomedia", file.getName());
                if (file.isDirectory()) {
                    com.immomo.mmutil.FileUtil.m18406c(file);
                    return z;
                }
                if (z) {
                    this.f63312a.element += file.length();
                    this.f63313b.element++;
                    if (MKWebCaptureHelper.INSTANCE.m87175c(file) && file.exists()) {
                        file.delete();
                        this.f63313b.element--;
                        return false;
                    }
                }
                return z;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final boolean m87175c(File file) {
            return file == null || System.currentTimeMillis() - file.lastModified() > MKWebCaptureHelper.f63305e;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m87176b() {
            try {
                File fileM87180g = m87180g();
                if (fileM87180g != null && fileM87180g.exists()) {
                    Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = 0L;
                    Ref.IntRef intRef = new Ref.IntRef();
                    int i = 0;
                    intRef.element = 0;
                    File[] fileArrListFiles = fileM87180g.listFiles(new C14925b(longRef, intRef));
                    if (fileArrListFiles != null) {
                        if (!(fileArrListFiles.length == 0) && (longRef.element > MKWebCaptureHelper.f63306f || intRef.element > MKWebCaptureHelper.f63307g)) {
                            List mutableList = ArraysKt.toMutableList(fileArrListFiles);
                            if (mutableList.size() > 1) {
                                CollectionsKt.sortWith(mutableList, new C14924a());
                            }
                            if (5 < intRef.element) {
                                for (int size = mutableList.size() - 1; size >= 0; size--) {
                                    File file = (File) mutableList.get(size);
                                    file.getClass();
                                    if (!file.isDirectory() && !Intrinsics.m87488d(".nomedia", file.getName()) && file.exists()) {
                                        file.delete();
                                        MDLog.m7395i("MKWebCaptureHelper", String.valueOf(file.lastModified()) + " 删除文件=" + file.getName());
                                        i++;
                                        if (i >= 5) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m87177d();
            } catch (Throwable th) {
                MDLog.printErrStackTrace("MKWebCaptureHelper", th);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m87177d() {
            File fileM87180g = m87180g();
            if (fileM87180g != null) {
                File file = new File(fileM87180g, ".nomedia");
                if (file.exists()) {
                    return;
                }
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    MDLog.printErrStackTrace("MKWebCaptureHelper", e);
                }
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final void m87178e() {
            File fileM87180g = m87180g();
            if (fileM87180g != null) {
                com.immomo.mmutil.FileUtil.m18406c(fileM87180g);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m87179f(@NotNull String url, int type) {
            url.getClass();
            jh3.m141367d(C15424f.m94055a(m87181h()), null, null, new MKWebCaptureHelper$Companion$deleteCache$1(url, type, null), 3, null);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: g */
        public final File m87180g() {
            return ohw.m164471i();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final CoroutineContext m87181h() {
            return MMDispatchers.INSTANCE.m18429b().plus(MKWebCaptureHelper.INSTANCE.m87183j());
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m87182i(@Nullable String url) {
            List listSplit$default;
            if (url == null || (listSplit$default = StringsKt.split$default(url, new String[]{"?"}, false, 0, 6, null)) == null) {
                return "";
            }
            Object[] array = listSplit$default.toArray(new String[0]);
            if (array != null) {
                String str = ((String[]) array)[0];
                return str != null ? str : "";
            }
            ox50.m166495a("null cannot be cast to non-null type kotlin.Array<T>");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final ln5 m87183j() {
            return MKWebCaptureHelper.f63308h;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: k */
        public final File m87184k(@Nullable String url, @Nullable String type) {
            File fileM87180g;
            File fileM87180g2;
            if (type != null) {
                int iHashCode = type.hashCode();
                if (iHashCode != 49) {
                    if (iHashCode == 50 && type.equals("2") && (fileM87180g2 = m87180g()) != null) {
                        String strM87182i = MKWebCaptureHelper.INSTANCE.m87182i(url);
                        if (b0g0.m99771d(strM87182i)) {
                            return new File(fileM87180g2, pgw.m168922f(strM87182i) + ".png_");
                        }
                    }
                    return null;
                }
                if (type.equals("1") && (fileM87180g = m87180g()) != null) {
                    return new File(fileM87180g, pgw.m168922f(url) + ".png_");
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

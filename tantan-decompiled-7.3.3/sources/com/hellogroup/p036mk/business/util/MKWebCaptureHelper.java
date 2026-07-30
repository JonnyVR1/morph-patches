package com.hellogroup.p036mk.business.util;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.common.thread.MMDispatchers;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;
import p153l.ckw;
import p153l.go5;
import p153l.i8g0;
import p153l.jzv;
import p153l.oiw;
import p153l.p7f;
import p153l.po5;
import p153l.xh3;
import p153l.yfi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m88121d2 = {"Lcom/hellogroup/mk/business/util/MKWebCaptureHelper;", "", "<init>", "()V", "", "k", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "url", "g", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Ljava/lang/String;)V", "j", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isReleasedCaptureTask", "b", "isLoadedCaptureTask", "Ll/po5;", "c", "Ll/po5;", "curCaptureJob", "Lkotlin/coroutines/CoroutineContext;", "h", "()Lkotlin/coroutines/CoroutineContext;", "captureCoroutineContext", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKWebCaptureHelper {

    /* JADX INFO: renamed from: f */
    private static long f12301f;

    /* JADX INFO: renamed from: g */
    private static int f12302g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AtomicBoolean isReleasedCaptureTask = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AtomicBoolean isLoadedCaptureTask = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private po5 curCaptureJob = JobKt__JobKt.m94507b(null, 1, null);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    private static long f12300e = 2592000000L;

    /* JADX INFO: renamed from: h */
    @NotNull
    private static final po5 f12303h = JobKt__JobKt.m94507b(null, 1, null);

    /* JADX INFO: renamed from: d */
    private static boolean f12299d = yfi.m215610z();

    static {
        f12301f = 524288000L;
        f12302g = 50;
        f12302g = yfi.m215583A();
        f12301f = ((long) (yfi.m215584B() * 1024)) * 1024;
    }

    /* JADX INFO: renamed from: h */
    private final CoroutineContext m18211h() {
        return MMDispatchers.INSTANCE.m17548b().plus(this.curCaptureJob);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m18212i() {
        return f12299d;
    }

    /* JADX INFO: renamed from: k */
    private final void m18213k() {
        try {
            if (this.isLoadedCaptureTask.get()) {
                po5 po5Var = this.curCaptureJob;
                if (po5Var.isCancelled()) {
                    return;
                }
                InterfaceC15593o.a.m95138a(po5Var, null, 1, null);
                jzv.m147732e("MKWebCaptureHelper", "释放releaseCaptureTask");
            }
        } catch (Throwable th) {
            jzv.m147730c("MKWebCaptureHelper", "", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18214g(@Nullable MKWebView mkWebView, @Nullable String url) {
        if (mkWebView == null || url == null) {
            return;
        }
        try {
            if (f12299d && !this.isLoadedCaptureTask.get() && !this.isReleasedCaptureTask.get() && C15493d.m94374J(url, "http", false, 2, null) && StringsKt.m94303P(url, "_capture", false, 2, null)) {
                jzv.m147732e("MKWebCaptureHelper", url);
                WeakReference weakReference = new WeakReference(mkWebView);
                if (this.curCaptureJob.isCancelled()) {
                    return;
                }
                this.isLoadedCaptureTask.set(true);
                xh3.m210980d(C15531f.m94947a(m18211h()), null, null, new MKWebCaptureHelper$checkLoad$1(this, url, weakReference, mkWebView, null), 3, null);
            }
        } catch (Throwable th) {
            jzv.m147730c("MKWebCaptureHelper", "", th);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m18215j(@Nullable MKWebView mkWebView) {
        if (f12299d && mkWebView != null) {
            this.isReleasedCaptureTask.set(true);
            if (!mkWebView.m17909O0()) {
                m18213k();
            }
            if (mkWebView.m17909O0()) {
                mkWebView.setLoadedCapture(false);
                if (mkWebView.getForeground() != null) {
                    xh3.m210980d(C15531f.m94947a(INSTANCE.m18223h()), MMDispatchers.INSTANCE.m17547a(), null, new MKWebCaptureHelper$onRelease$1(mkWebView, null), 2, null);
                }
            }
        }
    }

    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0003J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0003J%\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0003R(\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00106\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010*¨\u00067"}, m88121d2 = {"Lcom/hellogroup/mk/business/util/MKWebCaptureHelper$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "c", "(Ljava/io/File;)Z", "", "url", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ljava/lang/String;", "", "type", "", "f", "(Ljava/lang/String;I)V", "e", "g", "()Ljava/io/File;", Constants.INAPP_DATA_TAG, "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "b", "isScreenShotEnable", "Z", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", "setScreenShotEnable", "(Z)V", "isScreenShotEnable$annotations", "Ll/po5;", "job", "Ll/po5;", "j", "()Ll/po5;", "Lkotlin/coroutines/CoroutineContext;", "h", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "FILE_PNG", "Ljava/lang/String;", "", "FILE_SIZE_LIMIT", "J", "FILE_TIME_LIMIT", "MAX_FILE_COUNT", "I", "MAX_FILE_COUNT_DELETE", "NO_MEDIA_FILE", "TAG", "TAG_CAPTURE", "TYPE_FULL", "TYPE_HOST", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.hellogroup.mk.business.util.MKWebCaptureHelper$Companion$a */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class C3566a<T> implements Comparator<T> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return go5.m131087d(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t).lastModified()));
            }
        }

        /* JADX INFO: renamed from: com.hellogroup.mk.business.util.MKWebCaptureHelper$Companion$b */
        @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, m88122k = 3, m88123mv = {1, 1, 16})
        public static final class C3567b implements FileFilter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Ref.LongRef f12307a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Ref.IntRef f12308b;

            public C3567b(Ref.LongRef longRef, Ref.IntRef intRef) {
                this.f12307a = longRef;
                this.f12308b = intRef;
            }

            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                file.getClass();
                boolean z = file.isFile() && !Intrinsics.m88377d(".nomedia", file.getName());
                if (file.isDirectory()) {
                    FileUtil.m17527k(file);
                    return z;
                }
                if (z) {
                    this.f12307a.element += file.length();
                    this.f12308b.element++;
                    if (MKWebCaptureHelper.INSTANCE.m18217c(file) && file.exists()) {
                        file.delete();
                        this.f12308b.element--;
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
        public final boolean m18217c(File file) {
            return file == null || System.currentTimeMillis() - file.lastModified() > MKWebCaptureHelper.f12300e;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m18218b() {
            try {
                File fileM18222g = m18222g();
                if (fileM18222g != null && fileM18222g.exists()) {
                    Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = 0L;
                    Ref.IntRef intRef = new Ref.IntRef();
                    int i = 0;
                    intRef.element = 0;
                    File[] fileArrListFiles = fileM18222g.listFiles(new C3567b(longRef, intRef));
                    if (fileArrListFiles != null) {
                        if (!(fileArrListFiles.length == 0) && (longRef.element > MKWebCaptureHelper.f12301f || intRef.element > MKWebCaptureHelper.f12302g)) {
                            List mutableList = ArraysKt.toMutableList(fileArrListFiles);
                            if (mutableList.size() > 1) {
                                CollectionsKt.sortWith(mutableList, new C3566a());
                            }
                            if (5 < intRef.element) {
                                for (int size = mutableList.size() - 1; size >= 0; size--) {
                                    File file = (File) mutableList.get(size);
                                    file.getClass();
                                    if (!file.isDirectory() && !Intrinsics.m88377d(".nomedia", file.getName()) && file.exists()) {
                                        file.delete();
                                        jzv.m147732e("MKWebCaptureHelper", String.valueOf(file.lastModified()) + " 删除文件=" + file.getName());
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
                m18219d();
            } catch (Throwable th) {
                jzv.m147730c("MKWebCaptureHelper", "", th);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m18219d() {
            File fileM18222g = m18222g();
            if (fileM18222g != null) {
                File file = new File(fileM18222g, ".nomedia");
                if (file.exists()) {
                    return;
                }
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    jzv.m147730c("MKWebCaptureHelper", "", e);
                }
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final void m18220e() {
            File fileM18222g = m18222g();
            if (fileM18222g != null) {
                FileUtil.m17527k(fileM18222g);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m18221f(@NotNull String url, int type) {
            url.getClass();
            xh3.m210980d(C15531f.m94947a(m18223h()), null, null, new MKWebCaptureHelper$Companion$deleteCache$1(url, type, null), 3, null);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: g */
        public final File m18222g() {
            return ckw.m110399h();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final CoroutineContext m18223h() {
            return MMDispatchers.INSTANCE.m17548b().plus(MKWebCaptureHelper.INSTANCE.m18225j());
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final String m18224i(@Nullable String url) {
            List listSplit$default;
            if (url == null || (listSplit$default = StringsKt.split$default(url, new String[]{"?"}, false, 0, 6, null)) == null) {
                return "";
            }
            Object[] array = listSplit$default.toArray(new String[0]);
            if (array != null) {
                String str = ((String[]) array)[0];
                return str != null ? str : "";
            }
            C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final po5 m18225j() {
            return MKWebCaptureHelper.f12303h;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: k */
        public final File m18226k(@Nullable String url, @Nullable String type) {
            File fileM18222g;
            File fileM18222g2;
            if (type != null) {
                int iHashCode = type.hashCode();
                if (iHashCode != 49) {
                    if (iHashCode == 50 && type.equals("2") && (fileM18222g2 = m18222g()) != null) {
                        String strM18224i = MKWebCaptureHelper.INSTANCE.m18224i(url);
                        if (i8g0.m139002d(strM18224i)) {
                            return new File(fileM18222g2, oiw.m167803f(strM18224i) + ".png_");
                        }
                    }
                    return null;
                }
                if (type.equals("1") && (fileM18222g = m18222g()) != null) {
                    return new File(fileM18222g, oiw.m167803f(url) + ".png_");
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m18227l() {
            return MKWebCaptureHelper.f12299d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

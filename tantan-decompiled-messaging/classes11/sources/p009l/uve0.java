package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.sharedlibrary.loader.Abi;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import com.tantanapp.sharedlibrary.loader.a;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.f30;
import l.mr4;
import l.nxc0;
import l.qib0;
import l.rhi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u0004\u0012\u00020\u00060\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll/uve0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)V", "Lcom/tantanapp/sharedlibrary/loader/Abi;", "b", "(Landroid/content/Context;)Lcom/tantanapp/sharedlibrary/loader/Abi;", "", "g", "()Z", "Lcom/tantanapp/sharedlibrary/loader/a$a;", "c", "()Lcom/tantanapp/sharedlibrary/loader/a$a;", "Lcom/tantanapp/sharedlibrary/loader/a$b;", "d", "()Lcom/tantanapp/sharedlibrary/loader/a$b;", "Lkotlin/Function1;", "Lkotlin/Function0;", "f", "()Lkotlin/jvm/functions/Function1;", "", "a", "[B", "obbSalt", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uve0 {

    @NotNull
    public static final uve0 INSTANCE = new uve0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final byte[] obbSalt = {18, 22, -31, -11, -54, 18, -101, -32, 43, 2, -8, -4, 9, 5, -106, -17, 33, 44, 3, 1};

    /* JADX INFO: renamed from: l.uve0$a */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/uve0$a", "Lcom/tantanapp/sharedlibrary/loader/a$a;", "", "url", "path", "fileName", "Lkotlin/Function1;", "Ll/nxc0;", "", "callback", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1222a implements a.a {
        /* JADX INFO: renamed from: b */
        public static void m23170b(File file, File file2, Function1 function1, DownloadTask downloadTask, File file3) {
            if (file.renameTo(file2)) {
                function1.invoke(nxc0.Companion.d());
                return;
            }
            file2.delete();
            file.delete();
            function1.invoke(nxc0.Companion.a("download rename failed"));
        }

        /* JADX INFO: renamed from: c */
        public static void m23171c(File file, File file2, Function1 function1, DownloadTask downloadTask, Throwable th) {
            rhi.m(file.getAbsolutePath());
            rhi.m(file2.getAbsolutePath());
            nxc0.a aVar = nxc0.Companion;
            th.getClass();
            function1.invoke(aVar.b(th));
        }

        /* JADX INFO: renamed from: d */
        public static void m23172d(Function1 function1, DownloadTask downloadTask) {
            function1.invoke(nxc0.Companion.a("download onCancel"));
        }

        /* JADX INFO: renamed from: a */
        public void m23173a(String url, String path, String fileName, final Function1<? super nxc0<Unit>, Unit> callback) {
            url.getClass();
            path.getClass();
            fileName.getClass();
            callback.getClass();
            final File file = new File(path, fileName);
            final File file2 = new File(path, fileName + ".tmp");
            C0513a.m9975u().m9987p(new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(url).m9960n(file2).m9966t(true).m9956j(new f30() { // from class: l.rve0
                public final void call(Object obj, Object obj2) {
                    uve0.C1222a.m23170b(file2, file, callback, (DownloadTask) obj, (File) obj2);
                }
            }).m9952f(new f30() { // from class: l.sve0
                public final void call(Object obj, Object obj2) {
                    uve0.C1222a.m23171c(file, file2, callback, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m9950d(new e30() { // from class: l.tve0
                public final void call(Object obj) {
                    uve0.C1222a.m23172d(callback, (DownloadTask) obj);
                }
            }).m9947a());
        }
    }

    /* JADX INFO: renamed from: l.uve0$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"l/uve0$b", "Lcom/tantanapp/sharedlibrary/loader/a$b;", "", "business", "module", "", "throwable", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1223b implements a.b {
        /* JADX INFO: renamed from: a */
        public void m23174a(String business, String module, Throwable throwable) {
            business.getClass();
            module.getClass();
            throwable.getClass();
            CrashHelper.c(new Throwable("[SharedLibraryLoader]: business=" + business + ", module=" + module, throwable));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Unit m23163a(Function0 function0) {
        function0.getClass();
        function0.invoke();
        return Unit.INSTANCE;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m23164e(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        uve0 uve0Var = INSTANCE;
        SharedLibraryLoader.Companion.b(new a(applicationContext, uve0Var.m23165b(context), uve0Var.m23169g(), obbSalt, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2dm1hLmK8aeC9bgNHPiN9IrgcW6i0GuGzvYaFlo+VHqWI4bY+yPzCipQgQCEGmQt7jrKXpBQtx9oAIoXA1XUFYUSY9ExCLDJog0vw1oYm7rI78JhlUaIjozR+SN579RzHRfW4OGknfoe3+PoeVOfcYsLDQeflXFKNHmzQ5qrCjfpE5Qvw3Ow2rY/qX8dGEO0VXfdRLWXxp8R4Zngc+muShISrd6+LrpRZogSd0OEz2XyC3xANEvepge8KBl5r8at/HbG7PPXsYvnD6LvCF+d/ZcoYmc6fyldY+YAV+S7oMxaT9/pbu2Bh1uXHX2ByCIEZzN6jmF5yG88Fm5Q9pbD8wIDAQAB", g050.m14713b(), uve0Var.m23166c(), uve0Var.m23167d(), uve0Var.m23168f()));
    }

    /* JADX INFO: renamed from: b */
    public final Abi m23165b(Context context) {
        return dt3.m13469a(context) ? Abi.ARM_64 : Abi.ARM_32;
    }

    /* JADX INFO: renamed from: c */
    public final a.a m23166c() {
        return new C1222a();
    }

    /* JADX INFO: renamed from: d */
    public final a.b m23167d() {
        return new C1223b();
    }

    /* JADX INFO: renamed from: f */
    public final Function1<Function0<Unit>, Unit> m23168f() {
        return new Function1() { // from class: l.qve0
            public final Object invoke(Object obj) {
                return uve0.m23163a((Function0) obj);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public final boolean m23169g() {
        return Intrinsics.d(mr4.b(), "googleplay");
    }
}

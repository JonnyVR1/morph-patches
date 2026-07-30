package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.sharedlibrary.loader.Abi;
import com.tantanapp.sharedlibrary.loader.C13846a;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u0004\u0012\u00020\u00060\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/b4f0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)V", "Lcom/tantanapp/sharedlibrary/loader/Abi;", "b", "(Landroid/content/Context;)Lcom/tantanapp/sharedlibrary/loader/Abi;", "", "g", "()Z", "Lcom/tantanapp/sharedlibrary/loader/a$a;", "c", "()Lcom/tantanapp/sharedlibrary/loader/a$a;", "Lcom/tantanapp/sharedlibrary/loader/a$b;", Constants.INAPP_DATA_TAG, "()Lcom/tantanapp/sharedlibrary/loader/a$b;", "Lkotlin/Function1;", "Lkotlin/Function0;", "f", "()Lkotlin/jvm/functions/Function1;", "", "a", "[B", "obbSalt", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class b4f0 {

    @NotNull
    public static final b4f0 INSTANCE = new b4f0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final byte[] obbSalt = {18, 22, -31, -11, -54, 18, -101, -32, 43, 2, -8, -4, 9, 5, -106, -17, 33, 44, 3, 1};

    /* JADX INFO: renamed from: l.b4f0$a */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/b4f0$a", "Lcom/tantanapp/sharedlibrary/loader/a$a;", "", "url", "path", "fileName", "Lkotlin/Function1;", "Ll/q5d0;", "", "callback", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15924a implements C13846a.a {
        /* JADX INFO: renamed from: b */
        public static void m102462b(File file, File file2, Function1 function1, DownloadTask downloadTask, File file3) {
            if (file.renameTo(file2)) {
                function1.invoke(q5d0.INSTANCE.m175357d());
                return;
            }
            file2.delete();
            file.delete();
            function1.invoke(q5d0.INSTANCE.m175354a("download rename failed"));
        }

        /* JADX INFO: renamed from: c */
        public static void m102463c(File file, File file2, Function1 function1, DownloadTask downloadTask, Throwable th) {
            oki.m168025m(file.getAbsolutePath());
            oki.m168025m(file2.getAbsolutePath());
            q5d0.Companion companion = q5d0.INSTANCE;
            th.getClass();
            function1.invoke(companion.m175355b(th));
        }

        /* JADX INFO: renamed from: d */
        public static void m102464d(Function1 function1, DownloadTask downloadTask) {
            function1.invoke(q5d0.INSTANCE.m175354a("download onCancel"));
        }

        @Override // com.tantanapp.sharedlibrary.loader.C13846a.a
        /* JADX INFO: renamed from: a */
        public void mo82671a(String url, String path, String fileName, final Function1<? super q5d0<Unit>, Unit> callback) {
            url.getClass();
            path.getClass();
            fileName.getClass();
            callback.getClass();
            final File file = new File(path, fileName);
            final File file2 = new File(path, fileName + ".tmp");
            C13274a.m80837u().m80849p(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(url).m80822n(file2).m80828t(true).m80818j(new z20() { // from class: l.y3f0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    b4f0.C15924a.m102462b(file2, file, callback, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.z3f0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    b4f0.C15924a.m102463c(file, file2, callback, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80812d(new y20() { // from class: l.a4f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    b4f0.C15924a.m102464d(callback, (DownloadTask) obj);
                }
            }).m80809a());
        }
    }

    /* JADX INFO: renamed from: l.b4f0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/b4f0$b", "Lcom/tantanapp/sharedlibrary/loader/a$b;", "", "business", "module", "", "throwable", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15925b implements C13846a.b {
        @Override // com.tantanapp.sharedlibrary.loader.C13846a.b
        /* JADX INFO: renamed from: a */
        public void mo82672a(String business, String module, Throwable throwable) {
            business.getClass();
            module.getClass();
            throwable.getClass();
            CrashHelper.m82479c(new Throwable("[SharedLibraryLoader]: business=" + business + ", module=" + module, throwable));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Unit m102455a(Function0 function0) {
        function0.getClass();
        function0.invoke();
        return Unit.INSTANCE;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m102456e(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        b4f0 b4f0Var = INSTANCE;
        SharedLibraryLoader.INSTANCE.m82653b(new C13846a(applicationContext, b4f0Var.m102457b(context), b4f0Var.m102461g(), obbSalt, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2dm1hLmK8aeC9bgNHPiN9IrgcW6i0GuGzvYaFlo+VHqWI4bY+yPzCipQgQCEGmQt7jrKXpBQtx9oAIoXA1XUFYUSY9ExCLDJog0vw1oYm7rI78JhlUaIjozR+SN579RzHRfW4OGknfoe3+PoeVOfcYsLDQeflXFKNHmzQ5qrCjfpE5Qvw3Ow2rY/qX8dGEO0VXfdRLWXxp8R4Zngc+muShISrd6+LrpRZogSd0OEz2XyC3xANEvepge8KBl5r8at/HbG7PPXsYvnD6LvCF+d/ZcoYmc6fyldY+YAV+S7oMxaT9/pbu2Bh1uXHX2ByCIEZzN6jmF5yG88Fm5Q9pbD8wIDAQAB", v850.m200289b(), b4f0Var.m102458c(), b4f0Var.m102459d(), b4f0Var.m102460f()));
    }

    /* JADX INFO: renamed from: b */
    public final Abi m102457b(Context context) {
        return cu3.m112649a(context) ? Abi.ARM_64 : Abi.ARM_32;
    }

    /* JADX INFO: renamed from: c */
    public final C13846a.a m102458c() {
        return new C15924a();
    }

    /* JADX INFO: renamed from: d */
    public final C13846a.b m102459d() {
        return new C15925b();
    }

    /* JADX INFO: renamed from: f */
    public final Function1<Function0<Unit>, Unit> m102460f() {
        return new Function1() { // from class: l.x3f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b4f0.m102455a((Function0) obj);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public final boolean m102461g() {
        return Intrinsics.m88377d(ls4.m155671b(), "googleplay");
    }
}

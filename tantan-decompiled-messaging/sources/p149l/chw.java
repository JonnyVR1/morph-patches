package p149l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import immomo.com.mklibrary.core.dispatcher.dispatch.MKTaskScheduler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J+\u0010\u001c\u001a\u001e\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00130\u0013\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00060\u00060\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0012R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m87232d2 = {"Ll/chw;", "", "", "c", "()I", "h", "", "getUrl", "()Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "k", Constants.INAPP_DATA_TAG, "Ll/n400;", "callback", "", "o", "(Ll/n400;)V", "b", "()V", "", "f", "()Z", "Landroid/util/Pair;", "interceptor", "a", "(Ll/n400;Landroid/util/Pair;)V", "n", "kotlin.jvm.PlatformType", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroid/util/Pair;", "g", "m", "()Ll/n400;", "j", "Ll/dhw;", "e", "()Ll/dhw;", "mkBaseTaskRequest", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public interface chw {
    /* JADX INFO: renamed from: a */
    void mo106996a(@Nullable n400 callback, @NotNull Pair<Boolean, String> interceptor);

    /* JADX INFO: renamed from: b */
    void mo106997b();

    /* JADX INFO: renamed from: c */
    int mo106998c();

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo106999d();

    @NotNull
    /* JADX INFO: renamed from: e */
    dhw getMkBaseTaskRequest();

    /* JADX INFO: renamed from: f */
    boolean mo107001f();

    /* JADX INFO: renamed from: g */
    void mo107002g();

    @Nullable
    String getUrl();

    /* JADX INFO: renamed from: h */
    int mo107003h();

    @Nullable
    /* JADX INFO: renamed from: i */
    String mo107004i();

    /* JADX INFO: renamed from: j */
    void mo107005j();

    @Nullable
    /* JADX INFO: renamed from: k */
    String mo107006k();

    @NotNull
    /* JADX INFO: renamed from: l */
    Pair<Boolean, String> mo107007l();

    @Nullable
    /* JADX INFO: renamed from: m */
    n400 mo107008m();

    /* JADX INFO: renamed from: n */
    void mo107009n();

    /* JADX INFO: renamed from: o */
    void mo107010o(@Nullable n400 callback);

    /* JADX INFO: renamed from: l.chw$a */
    @Metadata(m87230bv = {1, 0, 3}, m87233k = 3, m87234mv = {1, 1, 16})
    public static final class C16158a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static String m107011a(chw chwVar) {
            return chwVar.getMkBaseTaskRequest().getBid();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static n400 m107012b(chw chwVar) {
            return chwVar.getMkBaseTaskRequest().m111833c();
        }

        /* JADX INFO: renamed from: c */
        public static int m107013c(chw chwVar) {
            return chwVar.getMkBaseTaskRequest().getLevelType();
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public static String m107014d(chw chwVar) {
            int iMo106998c = chwVar.mo106998c();
            if (iMo106998c == 1) {
                return chwVar.getUrl();
            }
            if (iMo106998c == 2) {
                return chwVar.mo107004i();
            }
            if (iMo106998c == 3) {
                return chwVar.mo107006k();
            }
            if (iMo106998c != 101) {
                return null;
            }
            return "single_web_config";
        }

        /* JADX INFO: renamed from: e */
        public static int m107015e(chw chwVar) {
            return chwVar.getMkBaseTaskRequest().getTaskPriority();
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public static String m107016f(chw chwVar) {
            return chwVar.getMkBaseTaskRequest().getSid();
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static String m107017g(chw chwVar) {
            return chwVar.getMkBaseTaskRequest().getUrl();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public static Pair<Boolean, String> m107018h(chw chwVar) {
            return new Pair<>(Boolean.FALSE, "");
        }

        /* JADX INFO: renamed from: i */
        public static void m107019i(chw chwVar) {
            MKTaskScheduler.INSTANCE.m87138m(chwVar);
        }

        /* JADX INFO: renamed from: k */
        public static void m107021k(chw chwVar, @Nullable n400 n400Var, @NotNull Pair<Boolean, String> pair) {
            pair.getClass();
            chwVar.mo107002g();
            if (n400Var != null) {
                Object obj = pair.second;
                obj.getClass();
                n400Var.m157792a(chwVar, (String) obj);
            }
            chwVar.mo107009n();
        }

        /* JADX INFO: renamed from: l */
        public static void m107022l(chw chwVar) {
            chwVar.getMkBaseTaskRequest().m111831a(null);
        }

        /* JADX INFO: renamed from: m */
        public static void m107023m(chw chwVar) {
            n400 n400VarMo107008m = chwVar.mo107008m();
            if (n400VarMo107008m != null) {
                n400VarMo107008m.m157793b(chwVar);
            }
            Pair<Boolean, String> pairMo107007l = chwVar.mo107007l();
            if (((Boolean) pairMo107007l.first).booleanValue()) {
                chwVar.mo106996a(chwVar.mo107008m(), pairMo107007l);
                return;
            }
            try {
                chwVar.mo107010o(chwVar.mo107008m());
                if (chwVar.mo107001f()) {
                    return;
                }
                chwVar.mo107009n();
            } catch (Throwable th) {
                try {
                    n400 n400VarMo107008m2 = chwVar.mo107008m();
                    if (n400VarMo107008m2 != null) {
                        n400VarMo107008m2.m157794c(chwVar, th);
                    }
                } finally {
                    if (!chwVar.mo107001f()) {
                        chwVar.mo107009n();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m107020j(chw chwVar) {
        }
    }
}

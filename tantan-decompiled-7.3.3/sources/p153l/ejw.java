package p153l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.core.dispatcher.dispatch.MKTaskScheduler;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J+\u0010\u001c\u001a\u001e\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00130\u0013\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00060\u00060\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0012J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0012R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m88121d2 = {"Ll/ejw;", "", "", "c", "()I", "h", "", "getUrl", "()Ljava/lang/String;", "getBid", "j", Constants.INAPP_DATA_TAG, "Ll/cd00;", "callback", "", "n", "(Ll/cd00;)V", "b", "()V", "", "f", "()Z", "Landroid/util/Pair;", "interceptor", "a", "(Ll/cd00;Landroid/util/Pair;)V", "m", "kotlin.jvm.PlatformType", "k", "()Landroid/util/Pair;", "g", BLiveStormDanmakuGiftResourceType.f45292l, "()Ll/cd00;", RXScreenCaptureService.KEY_INDEX, "Ll/fjw;", "e", "()Ll/fjw;", "mkBaseTaskRequest", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface ejw {
    /* JADX INFO: renamed from: a */
    void mo18403a(@Nullable cd00 callback, @NotNull Pair<Boolean, String> interceptor);

    /* JADX INFO: renamed from: b */
    void mo18404b();

    /* JADX INFO: renamed from: c */
    int mo18405c();

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo18406d();

    @NotNull
    /* JADX INFO: renamed from: e */
    fjw mo18407e();

    /* JADX INFO: renamed from: f */
    boolean mo18408f();

    /* JADX INFO: renamed from: g */
    void mo18409g();

    @Nullable
    String getBid();

    @Nullable
    String getUrl();

    /* JADX INFO: renamed from: h */
    int mo18410h();

    /* JADX INFO: renamed from: i */
    void mo18411i();

    @Nullable
    /* JADX INFO: renamed from: j */
    String mo18412j();

    @NotNull
    /* JADX INFO: renamed from: k */
    Pair<Boolean, String> mo18413k();

    @Nullable
    /* JADX INFO: renamed from: l */
    cd00 mo18414l();

    /* JADX INFO: renamed from: m */
    void mo18415m();

    /* JADX INFO: renamed from: n */
    void mo18416n(@Nullable cd00 callback);

    /* JADX INFO: renamed from: l.ejw$a */
    @Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C16785a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static String m120988a(ejw ejwVar) {
            return ejwVar.mo18407e().getBid();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static cd00 m120989b(ejw ejwVar) {
            return ejwVar.mo18407e().m125919c();
        }

        /* JADX INFO: renamed from: c */
        public static int m120990c(ejw ejwVar) {
            return ejwVar.mo18407e().getLevelType();
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public static String m120991d(ejw ejwVar) {
            int iMo18405c = ejwVar.mo18405c();
            if (iMo18405c == 1) {
                return ejwVar.getUrl();
            }
            if (iMo18405c == 2) {
                return ejwVar.getBid();
            }
            if (iMo18405c == 3) {
                return ejwVar.mo18412j();
            }
            if (iMo18405c != 101) {
                return null;
            }
            return "single_web_config";
        }

        /* JADX INFO: renamed from: e */
        public static int m120992e(ejw ejwVar) {
            return ejwVar.mo18407e().getTaskPriority();
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public static String m120993f(ejw ejwVar) {
            return ejwVar.mo18407e().getSid();
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public static String m120994g(ejw ejwVar) {
            return ejwVar.mo18407e().getUrl();
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public static Pair<Boolean, String> m120995h(ejw ejwVar) {
            return new Pair<>(Boolean.FALSE, "");
        }

        /* JADX INFO: renamed from: i */
        public static void m120996i(ejw ejwVar) {
            MKTaskScheduler.INSTANCE.m18400m(ejwVar);
        }

        /* JADX INFO: renamed from: k */
        public static void m120998k(ejw ejwVar, @Nullable cd00 cd00Var, @NotNull Pair<Boolean, String> pair) {
            pair.getClass();
            ejwVar.mo18409g();
            if (cd00Var != null) {
                Object obj = pair.second;
                obj.getClass();
                cd00Var.m109083a(ejwVar, (String) obj);
            }
            ejwVar.mo18415m();
        }

        /* JADX INFO: renamed from: l */
        public static void m120999l(ejw ejwVar) {
            ejwVar.mo18407e().m125917a(null);
        }

        /* JADX INFO: renamed from: m */
        public static void m121000m(ejw ejwVar) {
            cd00 cd00VarMo18414l = ejwVar.mo18414l();
            if (cd00VarMo18414l != null) {
                cd00VarMo18414l.m109084b(ejwVar);
            }
            Pair<Boolean, String> pairMo18413k = ejwVar.mo18413k();
            if (((Boolean) pairMo18413k.first).booleanValue()) {
                ejwVar.mo18403a(ejwVar.mo18414l(), pairMo18413k);
                return;
            }
            try {
                ejwVar.mo18416n(ejwVar.mo18414l());
                if (ejwVar.mo18408f()) {
                    return;
                }
                ejwVar.mo18415m();
            } catch (Throwable th) {
                try {
                    cd00 cd00VarMo18414l2 = ejwVar.mo18414l();
                    if (cd00VarMo18414l2 != null) {
                        cd00VarMo18414l2.m109085c(ejwVar, th);
                    }
                } finally {
                    if (!ejwVar.mo18408f()) {
                        ejwVar.mo18415m();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m120997j(ejw ejwVar) {
        }
    }
}

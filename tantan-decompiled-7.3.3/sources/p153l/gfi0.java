package p153l;

import android.app.Application;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.hellogroup.common.file.FileUtil;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.p036mk.business.MKConfigSetter;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bR\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/gfi0;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "g", "(Landroid/app/Application;)V", "Ll/ddi0;", "httpRequester", "Ll/zei0;", "router", "e", "(Landroid/app/Application;Ll/ddi0;Ll/zei0;)V", "f", "h", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "INTL_HOST", "b", "BASE_HOST", "c", "GET_WEB_CONFIG_URL", Constants.INAPP_DATA_TAG, "CHECKUPDATE_URL", "", "Z", "hadInit", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gfi0 {

    @NotNull
    public static final gfi0 INSTANCE = new gfi0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String INTL_HOST = "https://intl-fep-api.tantanapp.com";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String BASE_HOST = "https://intl-fep-api.tantanapp.com";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String GET_WEB_CONFIG_URL = "https://intl-fep-api.tantanapp.com/v4/config/ext/getWebConfig";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String CHECKUPDATE_URL = "https://intl-fep-api.tantanapp.com/v4/config/ext/checkUpdate";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static volatile boolean hadInit;

    /* JADX INFO: renamed from: l.gfi0$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JA\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJK\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"l/gfi0$a", "Ll/rk20;", "", "url", "", CommandMessage.PARAMS, "headers", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "Ljava/io/File;", FirebaseAnalytics.Param.DESTINATION, "", "b", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;Ljava/util/Map;)Z", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17204a implements rk20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ddi0 f103937a;

        public C17204a(ddi0 ddi0Var) {
            this.f103937a = ddi0Var;
        }

        @Override // p153l.rk20
        /* JADX INFO: renamed from: a */
        public String mo130066a(String url, Map<String, String> params, Map<String, String> headers) throws IOException {
            url.getClass();
            params.getClass();
            pl80 pl80VarMo115351g = this.f103937a.mo115351g(MapsKt.toMutableMap(params));
            String bodyString = this.f103937a.mo115354j(url, pl80VarMo115351g.m172800b(), headers, null, pl80VarMo115351g.m172799a()).getBodyString();
            return bodyString == null ? "" : bodyString;
        }

        @Override // p153l.rk20
        /* JADX INFO: renamed from: b */
        public boolean mo130067b(String url, File destination, Map<String, String> params, Map<String, String> headers) throws Exception {
            url.getClass();
            destination.getClass();
            this.f103937a.mo115345a(url, destination, params != null ? MapsKt.toMutableMap(params) : null, headers != null ? MapsKt.toMutableMap(headers) : null);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.gfi0$b */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/gfi0$b", "Ll/pyj0;", "Ljava/io/File;", "source", FirebaseAnalytics.Param.DESTINATION, "Lkotlin/Function1;", "", "", "onError", "", "a", "(Ljava/io/File;Ljava/io/File;Lkotlin/jvm/functions/Function1;)Z", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C17205b implements pyj0 {
        @Override // p153l.pyj0
        /* JADX INFO: renamed from: a */
        public boolean mo130068a(File source, File destination, Function1<? super Throwable, Unit> onError) {
            source.getClass();
            destination.getClass();
            onError.getClass();
            try {
                Result.Companion companion = Result.INSTANCE;
                FileUtil.m17538v(source.getAbsolutePath(), destination.getAbsolutePath());
                return true;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(Result.m225066constructorimpl(ResultKt.m88127a(th)));
                if (thM225069exceptionOrNullimpl == null) {
                    return false;
                }
                onError.invoke(thM225069exceptionOrNullimpl);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: l.gfi0$c */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/gfi0$c", "Ll/pkw;", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "reporter", "Ll/kkw;", NotificationCompat.CATEGORY_EVENT, "", "a", "(Lcom/hellogroup/mk/core/log/core/MKLogReporter;Ll/kkw;)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C17206c implements pkw {
        @Override // p153l.pkw
        /* JADX INFO: renamed from: a */
        public void mo130069a(MKLogReporter reporter, kkw event) {
            reporter.getClass();
            event.getClass();
            fzv fzvVarM128341f = event.getCom.p1.mobile.putong.core.data.UserBanAppealSwitch.offline java.lang.String() ? eqw.m122068a("tantan").m128340e(event.getSecondBiz()).m128341f(event.getThirdBiz()) : oqw.m168849a("tantan").m128340e(event.getSecondBiz()).m128341f(event.getThirdBiz());
            Map<String, Object> mapM150332b = event.m150332b();
            if (mapM150332b != null) {
                if (mapM150332b.isEmpty()) {
                    mapM150332b = null;
                }
                if (mapM150332b != null) {
                    for (Map.Entry<String, Object> entry : mapM150332b.entrySet()) {
                        fzvVarM128341f.m128336a(new mqw(entry.getKey(), entry.getValue()));
                    }
                }
            }
            Map<String, Object> mapM150331a = event.m150331a();
            if (mapM150331a != null) {
                Map<String, Object> map = mapM150331a.isEmpty() ? null : mapM150331a;
                if (map != null) {
                    for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                        fzvVarM128341f.m128337b(new mqw(entry2.getKey(), entry2.getValue()));
                    }
                }
            }
            fzvVarM128341f.m128336a(new mqw("ttt_channel", "1"));
            fzvVarM128341f.m128338c();
        }
    }

    /* JADX INFO: renamed from: l.gfi0$d */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"l/gfi0$d", "Ll/pzl;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17207d implements pzl {
    }

    /* JADX INFO: renamed from: l.gfi0$e */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/gfi0$e", "Ll/tof0;", "", "h", "()Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17208e extends tof0 {
        @Override // p153l.tof0
        /* JADX INFO: renamed from: h */
        public String mo130070h() {
            if (!NullChecker.m82486a(uqb0.f180397c0) || !uqb0.f180397c0.signedIn_()) {
                return "";
            }
            String strUserId = uqb0.f180397c0.userId();
            strUserId.getClass();
            return strUserId;
        }
    }

    /* JADX INFO: renamed from: l.gfi0$f */
    @Metadata(m88120d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"l/gfi0$f", "Ll/xxl;", "", "url", "", "header", "Ljava/io/File;", "file", "", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Z", "", "postData", "b", "(Ljava/lang/String;Ljava/util/Map;[B)Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C17209f implements xxl {
        @Override // p153l.xxl
        /* JADX INFO: renamed from: a */
        public boolean mo130071a(String url, Map<String, String> header, File file) {
            url.getClass();
            file.getClass();
            try {
                new ddi0().mo115346b(url, null, new File[]{file}, null, header != null ? new HashMap(header) : null);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // p153l.xxl
        /* JADX INFO: renamed from: b */
        public String mo130072b(String url, Map<String, String> header, byte[] postData) {
            url.getClass();
            postData.getClass();
            try {
                return new ddi0().mo115354j(url, postData, header != null ? new HashMap(header) : null, null, OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE).getBodyString();
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Double m130058a() {
        Location locationM80048q;
        AbstractC13226a abstractC13226a = uqb0.f180370E;
        return Double.valueOf((abstractC13226a == null || (locationM80048q = abstractC13226a.m80048q()) == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : locationM80048q.m80014u());
    }

    /* JADX INFO: renamed from: b */
    public static String m130059b() {
        return (NullChecker.m82486a(uqb0.f180397c0) && uqb0.f180397c0.signedIn_()) ? uqb0.f180397c0.userId() : "1";
    }

    /* JADX INFO: renamed from: c */
    public static Double m130060c() {
        Location locationM80048q;
        AbstractC13226a abstractC13226a = uqb0.f180370E;
        return Double.valueOf((abstractC13226a == null || (locationM80048q = abstractC13226a.m80048q()) == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : locationM80048q.m80016x());
    }

    /* JADX INFO: renamed from: d */
    public static String m130061d() {
        String country = Locale.getDefault().getCountry();
        return country == null ? "" : country;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m130062g(@NotNull Application application) {
        application.getClass();
        if (hadInit) {
            return;
        }
        hadInit = true;
        lv0.m155975e(application);
        FileUtil.m17536t(FileUtil.StorageMode.SDCARD_INNER);
        gfi0 gfi0Var = INSTANCE;
        gfi0Var.m130065h(application);
        ddi0 ddi0Var = new ddi0();
        zei0 zei0Var = new zei0(ddi0Var);
        gfi0Var.m130063e(application, ddi0Var, zei0Var);
        gfi0Var.m130064f();
        MKConfigSetter.INSTANCE.m17765d(application, zei0Var);
        vlg.INSTANCE.m201623a(new C17207d());
    }

    /* JADX INFO: renamed from: e */
    public final void m130063e(Application application, ddi0 httpRequester, zei0 router) {
        try {
            FepManager.INSTANCE.m17610a().m17602y(application, false, new fgi(new wfi(String.valueOf(uqb0.f180415t), "intltantan", new Function0() { // from class: l.cfi0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return gfi0.m130059b();
                }
            }, new Function0() { // from class: l.dfi0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return gfi0.m130061d();
                }
            }, new Function0() { // from class: l.efi0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return gfi0.m130060c();
                }
            }, new Function0() { // from class: l.ffi0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return gfi0.m130058a();
                }
            }), GET_WEB_CONFIG_URL, router.getMkSdcardPath() + File.separator + "mkHome", CHECKUPDATE_URL, null, 16, null), new qhi(new C17204a(httpRequester), new C17205b()));
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m130064f() {
        try {
            MKCoreLogManager.m18432j(new MKLogReporter(new okw(false, false, false, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 15, null), new C17206c()));
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m130065h(Application application) {
        eqw.m122069b(application, new fqw.C17036a().m126801a("tantan").m126807g("a45d4c0e-b117-3f").m126805e(false).m126804d(new C17208e()).m126803c(new qai0("tantan"), new qai0("momo-basic"), new qai0("momo-web")).m126806f(new C17209f()).m126802b());
    }
}

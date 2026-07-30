package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\bJ\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J%\u00109\u001a\u0004\u0018\u00010\r2\b\u00107\u001a\u0004\u0018\u00010\r2\b\u00108\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010;R\u0017\u0010>\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u000f¨\u0006?"}, m88121d2 = {"Ll/zei0;", "Ll/ojw;", "Ll/ivl;", "httpRequester", "<init>", "(Ll/ivl;)V", "", BaseSei.f14624X, "()Z", "h", "Ll/kw5;", "j", "()Ll/kw5;", "", "b", "()Ljava/lang/String;", "Ll/to2;", "c", "()Ll/to2;", BaseSei.f14626Z, "()Ll/ivl;", "Ll/elw;", "f", "()Ll/elw;", "Landroid/content/Context;", "context", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "webViewHelper", "", "a", "(Landroid/content/Context;Lcom/hellogroup/mk/business/base/ui/MKWebView;Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;)V", "Ll/oxl;", "p", "()Ll/oxl;", "Ll/lxl;", "q", "()Ll/lxl;", "Ll/i5m;", Constants.KEY_T, "()Ll/i5m;", "Ll/yym;", "o", "()Ll/yym;", "Ll/nvl;", ResourceDirection.f39656v, "()Ll/nvl;", "Ll/g4k;", "n", "()Ll/g4k;", BaseSei.f14625Y, "Ll/url;", "k", "()Ll/url;", "url", "h5Url", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ll/ivl;", "Ljava/lang/String;", "I", "mkSdcardPath", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class zei0 extends ojw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ivl httpRequester;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String mkSdcardPath;

    /* JADX INFO: renamed from: l.zei0$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/zei0$a", "Ll/elw;", "Ll/ujw;", "b", "()Ll/ujw;", "", "a", "()Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21795a implements elw {
        @Override // p153l.elw
        /* JADX INFO: renamed from: a */
        public String mo121294a() {
            return "momoKit/1.0.0 WebView momoWebView/8.29 tantan-android/" + uqb0.f180413s + " tribe-android";
        }

        @Override // p153l.elw
        /* JADX INFO: renamed from: b */
        public ujw mo121295b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: l.zei0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/zei0$b", "Ll/url;", "", "originHost", "Landroid/net/Uri;", "uri", "a", "(Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21796b implements url {
        @Override // p153l.url
        @SuppressLint({"LogUseError"})
        /* JADX INFO: renamed from: a */
        public String mo197629a(String originHost, Uri uri) {
            return lhl.INSTANCE.m154219l(uri, originHost);
        }
    }

    /* JADX INFO: renamed from: l.zei0$c */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/zei0$c", "Ll/cpf0;", "", "c", "()Z", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21797c extends cpf0 {
        @Override // p153l.cpf0, p153l.yym
        /* JADX INFO: renamed from: c */
        public boolean mo111756c() {
            return true;
        }
    }

    public zei0(@NotNull ivl ivlVar) {
        ivlVar.getClass();
        this.httpRequester = ivlVar;
        String absolutePath = App.f16088e.getFilesDir().getAbsolutePath();
        absolutePath.getClass();
        this.mkSdcardPath = absolutePath;
    }

    /* JADX INFO: renamed from: B */
    public static String m219485B() {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static String m219486C() {
        return (NullChecker.m82486a(uqb0.f180397c0) && uqb0.f180397c0.signedIn_()) ? uqb0.f180397c0.userId() : "1";
    }

    /* JADX INFO: renamed from: D */
    public static String m219487D() {
        return "";
    }

    /* JADX INFO: renamed from: E */
    public static String m219488E() {
        return "";
    }

    /* JADX INFO: renamed from: F */
    public static String m219489F() {
        return uqb0.f180413s;
    }

    /* JADX INFO: renamed from: G */
    public static Integer m219490G() {
        return Integer.valueOf(uqb0.f180415t);
    }

    /* JADX INFO: renamed from: H */
    public static String m219491H() {
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getMkSdcardPath() {
        return this.mkSdcardPath;
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo167943b() {
        return "tantan";
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: c */
    public to2 mo167944c() {
        return new to2(new Function0() { // from class: l.sei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219486C();
            }
        }, new Function0() { // from class: l.tei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219491H();
            }
        }, new Function0() { // from class: l.uei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219488E();
            }
        }, new Function0() { // from class: l.vei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219487D();
            }
        }, new Function0() { // from class: l.wei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219489F();
            }
        }, new Function0() { // from class: l.xei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219490G();
            }
        }, new Function0() { // from class: l.yei0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zei0.m219485B();
            }
        });
    }

    @Override // p153l.ojw
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo167945d(@Nullable String url, @Nullable String h5Url) {
        lhl lhlVar = lhl.INSTANCE;
        if (!lhlVar.m154215h(h5Url)) {
            return super.mo167945d(url, h5Url);
        }
        if (url == null) {
            url = "";
        }
        return lhlVar.m154220m(url);
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: f */
    public elw mo167947f() {
        return new C21795a();
    }

    @Override // p153l.ojw
    /* JADX INFO: renamed from: h */
    public boolean mo167949h() {
        return false;
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: j */
    public kw5 mo167951j() {
        return new kw5(this.mkSdcardPath, "mkHome");
    }

    @Override // p153l.ojw
    @Nullable
    /* JADX INFO: renamed from: k */
    public url mo167952k() {
        return new C21796b();
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: n */
    public g4k mo167955n() {
        return new h4k();
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: o */
    public yym mo167956o() {
        return new C21797c();
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: p */
    public oxl mo167957p() {
        return new bfi0();
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: q */
    public lxl mo167958q() {
        return new afi0();
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: t */
    public i5m mo167961t() {
        return new dgi0();
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: v */
    public nvl mo167963v() {
        return new hdi0();
    }

    @Override // p153l.ojw
    /* JADX INFO: renamed from: x */
    public boolean mo167965x() {
        return false;
    }

    @Override // p153l.ojw
    /* JADX INFO: renamed from: y */
    public boolean mo167966y() {
        return false;
    }

    @Override // p153l.ojw
    @NotNull
    /* JADX INFO: renamed from: z, reason: from getter */
    public ivl getHttpRequester() {
        return this.httpRequester;
    }

    @Override // p153l.ojw
    /* JADX INFO: renamed from: a */
    public void mo167942a(@Nullable Context context, @Nullable MKWebView mkWebView, @Nullable MKWebViewHelper webViewHelper) {
    }
}

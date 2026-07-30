package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import immomo.com.mklibrary.core.dispatcher.dispatch.MKTaskScheduler;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/giw;", "", "<init>", "()V", "", "url", "bid", "Ll/n400;", "callback", "", "b", "(Ljava/lang/String;Ljava/lang/String;Ll/n400;)V", "f", "(Ll/n400;)V", "Ll/gxv;", "logRequest", "logLevel", Constants.INAPP_DATA_TAG, "(Ll/gxv;Ljava/lang/String;)V", "", "h", "()Z", "sid", "forceUpload", "j", "(Ljava/lang/String;Z)V", "loadUrl", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Z", "getRequestDispatchEnable", "setRequestDispatchEnable", "(Z)V", "requestDispatchEnable", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class giw {
    public static final giw INSTANCE = new giw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean requestDispatchEnable = mei.m154216v();

    private giw() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m126404c(giw giwVar, String str, String str2, n400 n400Var, int i, Object obj) {
        if ((i & 4) != 0) {
            n400Var = null;
        }
        giwVar.m126408b(str, str2, n400Var);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m126405g(giw giwVar, n400 n400Var, int i, Object obj) {
        if ((i & 1) != 0) {
            n400Var = null;
        }
        giwVar.m126411f(n400Var);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m126406k(giw giwVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        giwVar.m126414j(str, z);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: a */
    public final void m126407a(@Nullable String str, @Nullable String str2) {
        m126404c(this, str, str2, null, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b */
    public final void m126408b(@Nullable String url, @Nullable String bid, @Nullable n400 callback) {
        if (!m126412h()) {
            yhw.m214862s().m214867j(bid, url, vei.m198184a(url, bid));
            return;
        }
        dhw dhwVar = new dhw();
        dhwVar.m111841k(url);
        dhwVar.m111838h(bid);
        dhwVar.m111831a(callback);
        dhwVar.m111839i(2);
        dhwVar.m111840j(500);
        MKTaskScheduler.INSTANCE.m87134a(diw.INSTANCE.m111929a(dhwVar));
    }

    /* JADX INFO: renamed from: d */
    public final void m126409d(@Nullable gxv logRequest, @NotNull String logLevel) {
        logLevel.getClass();
        if (m126412h()) {
            MKTaskScheduler mKTaskScheduler = MKTaskScheduler.INSTANCE;
            if (mKTaskScheduler.m87135c()) {
                aiw aiwVar = new aiw();
                aiwVar.m96941m(logRequest);
                aiwVar.m111839i(0);
                aiwVar.m111840j(100);
                mKTaskScheduler.m87134a(eiw.INSTANCE.m116724a(aiwVar));
                return;
            }
        }
        if (logRequest != null) {
            logRequest.m128647c();
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m126410e() {
        m126405g(this, null, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: f */
    public final void m126411f(@Nullable n400 callback) {
        if (!m126412h()) {
            vei.m198186e().m198194k("open_mk_url");
            return;
        }
        dhw dhwVar = new dhw();
        dhwVar.m111831a(callback);
        dhwVar.m111839i(101);
        dhwVar.m111840j(1000);
        MKTaskScheduler.INSTANCE.m87134a(fiw.INSTANCE.m121562a(dhwVar));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m126412h() {
        return requestDispatchEnable;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: i */
    public final void m126413i(@Nullable String str) {
        m126406k(this, str, false, 2, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public final void m126414j(@Nullable String sid, boolean forceUpload) {
        if (m126412h()) {
            MKTaskScheduler.INSTANCE.m87137l(forceUpload, sid);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m126415l(@Nullable String sid, @Nullable String loadUrl) {
        if (m126412h()) {
            MKTaskScheduler.INSTANCE.m87140o(sid, loadUrl);
        }
    }
}

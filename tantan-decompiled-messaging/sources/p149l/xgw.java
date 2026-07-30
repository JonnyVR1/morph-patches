package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.immomo.hdata.android.MDevice;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.MDDNSEntrance;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class xgw {

    /* JADX INFO: renamed from: a */
    public static String f192801a = "";

    /* JADX INFO: renamed from: b */
    public static boolean f192802b = true;

    /* JADX INFO: renamed from: c */
    public static C22392a<roj0> f192803c = C22392a.m221512b();

    static {
        try {
            f192802b = RemoteConfig.m79298x().m79330s("android_momosec_config");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m208701c(String str, String str2, String str3, roj0 roj0Var) {
        try {
            MDevice.collect(str, str2, str3, mr4.f135329a, rb20.m178555d(), "tantan#tantantribe", new C21145b());
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m208702d(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        if (f192802b) {
            if ("launch".equals(str) || GameIdentity.guest.equals(str)) {
                Act.foreground().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ugw
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xgw.m208703e(str, str2, str3);
                    }
                }));
            } else {
                m208703e(str, str2, str3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m208703e(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        f192803c.observeOn(Schedulers.m221493io()).subscribe(mkd0.m154955G(new e30() { // from class: l.vgw
            @Override // p149l.e30
            public final void call(Object obj) {
                xgw.m208701c(str, str3, str2, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static void m208704f() {
        try {
            MDevice.getMMuidV3(qib0.f154714c0.userId(), new C21144a());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m208705g() {
        String strM184159d = sh50.m184159d();
        if (!TextUtils.isEmpty(strM184159d)) {
            return strM184159d;
        }
        String strM144241b = k200.m144241b();
        if (!TextUtils.isEmpty(strM144241b)) {
            return strM144241b;
        }
        return System.currentTimeMillis() + "";
    }

    /* JADX INFO: renamed from: h */
    public static void m208706h() {
        m208702d(GameIdentity.guest, "a6fd94677fded2e38b978b5d530506aa", m208705g());
    }

    /* JADX INFO: renamed from: i */
    public static void m208707i() {
        MDevice.init(App.f15369e, new MDevice.Config() { // from class: l.wgw
            @Override // com.immomo.hdata.android.MDevice.Config
            public final MDDNSEntrance getDnsInstance() {
                return DNSManager.getInstance(oph0.f144999b);
            }
        });
        f192803c.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: j */
    public static void m208708j(String str) {
        f192801a = str;
        m208702d("launch", qib0.f154714c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: k */
    public static void m208709k(String str) {
        f192801a = str;
        m208702d("login", qib0.f154714c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: l */
    public static void m208710l() {
        m208702d(ChannelConstant.Action.AIDL_ACTION_LOGOUT, "a6fd94677fded2e38b978b5d530506aa", f192801a);
    }

    /* JADX INFO: renamed from: m */
    public static void m208711m() {
        m208702d("picture_verification", qib0.f154714c0.accessToken(), f192801a);
    }

    /* JADX INFO: renamed from: n */
    public static void m208712n(String str) {
        f192801a = str;
        m208702d("register", qib0.f154714c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: l.xgw$a */
    public class C21144a implements MDevice.MmuidCallBack {
        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetComplete(String str) {
        }

        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetError(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.xgw$b */
    public class C21145b implements x4j0 {
        @Override // p149l.x4j0
        /* JADX INFO: renamed from: a */
        public void mo206987a(String str, String str2) {
        }
    }
}

package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.immomo.hdata.android.MDevice;
import com.immomo.mmdns.DNSManager;
import com.immomo.mmdns.MDDNSEntrance;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class wiw {

    /* JADX INFO: renamed from: a */
    public static String f189398a = "";

    /* JADX INFO: renamed from: b */
    public static boolean f189399b = true;

    /* JADX INFO: renamed from: c */
    public static C22507a<uxj0> f189400c = C22507a.m222758b();

    static {
        try {
            f189399b = RemoteConfig.m80481x().m80513s("android_momosec_config");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m206602c(String str, String str2, String str3, uxj0 uxj0Var) {
        try {
            MDevice.collect(str, str2, str3, ls4.f133389a, ak20.m98544d(), "tantan#tantantribe", new C21126b());
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m206603d(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        if (f189399b) {
            if ("launch".equals(str) || GameIdentity.guest.equals(str)) {
                Act.foreground().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.tiw
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        wiw.m206604e(str, str2, str3);
                    }
                }));
            } else {
                m206604e(str, str2, str3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m206604e(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        f189400c.observeOn(Schedulers.m222739io()).subscribe(psd0.m173596G(new y20() { // from class: l.uiw
            @Override // p153l.y20
            public final void call(Object obj) {
                wiw.m206602c(str, str3, str2, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public static void m206605f() {
        try {
            MDevice.getMMuidV3(uqb0.f180397c0.userId(), new C21125a());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m206606g() {
        String strM217001d = yp50.m217001d();
        if (!TextUtils.isEmpty(strM217001d)) {
            return strM217001d;
        }
        String strM134333b = hb00.m134333b();
        if (!TextUtils.isEmpty(strM134333b)) {
            return strM134333b;
        }
        return System.currentTimeMillis() + "";
    }

    /* JADX INFO: renamed from: h */
    public static void m206607h() {
        m206603d(GameIdentity.guest, "a6fd94677fded2e38b978b5d530506aa", m206606g());
    }

    /* JADX INFO: renamed from: i */
    public static void m206608i() {
        MDevice.init(App.f16088e, new MDevice.Config() { // from class: l.viw
            @Override // com.immomo.hdata.android.MDevice.Config
            public final MDDNSEntrance getDnsInstance() {
                return DNSManager.getInstance(vxh0.f186261b);
            }
        });
        f189400c.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: j */
    public static void m206609j(String str) {
        f189398a = str;
        m206603d("launch", uqb0.f180397c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: k */
    public static void m206610k(String str) {
        f189398a = str;
        m206603d("login", uqb0.f180397c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: l */
    public static void m206611l() {
        m206603d(ChannelConstant.Action.AIDL_ACTION_LOGOUT, "a6fd94677fded2e38b978b5d530506aa", f189398a);
    }

    /* JADX INFO: renamed from: m */
    public static void m206612m() {
        m206603d("picture_verification", uqb0.f180397c0.accessToken(), f189398a);
    }

    /* JADX INFO: renamed from: n */
    public static void m206613n(String str) {
        f189398a = str;
        m206603d("register", uqb0.f180397c0.accessToken(), str);
    }

    /* JADX INFO: renamed from: l.wiw$a */
    public class C21125a implements MDevice.MmuidCallBack {
        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetComplete(String str) {
        }

        @Override // com.immomo.hdata.android.MDevice.MmuidCallBack
        public void onMMUIDGetError(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: l.wiw$b */
    public class C21126b implements bej0 {
        @Override // p153l.bej0
        /* JADX INFO: renamed from: a */
        public void mo103704a(String str, String str2) {
        }
    }
}

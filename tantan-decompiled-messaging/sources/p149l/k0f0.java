package p149l;

import android.content.Context;
import android.text.TextUtils;
import cn.shuzilm.core.Listener;
import cn.shuzilm.core.Main;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class k0f0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f120481a;

    /* JADX INFO: renamed from: b */
    public uqd0 f120482b;

    /* JADX INFO: renamed from: l.k0f0$a */
    public static class C17899a {

        /* JADX INFO: renamed from: a */
        public static final k0f0 f120483a = new k0f0();
    }

    public k0f0() {
        this.f120481a = false;
        this.f120482b = new uqd0("shuzilm", "");
    }

    /* JADX INFO: renamed from: f */
    public static k0f0 m144032f() {
        return C17899a.f120483a;
    }

    /* JADX INFO: renamed from: d */
    public final String m144033d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m144034e(d30 d30Var) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public String m144035g() {
        return TextUtils.isEmpty(this.f120482b.get()) ? "" : this.f120482b.get();
    }

    /* JADX INFO: renamed from: h */
    public final String m144036h(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return m144033d(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public void m144037i(final Context context) {
        if (RemoteConfig.m79298x().m79330s("shumeng_init")) {
            x8i0.m207417a(new Runnable() { // from class: l.h0f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105214a.m144040l(context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m144038j(Context context) {
        if (this.f120481a) {
            return;
        }
        Main.init(context, "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAL4szl55NvT7HnkNUx+cajHpmP4Faq20eof6TQf9Vcfh5aQ6kuZevv6sdALJFFfrUgROjGQI0Y4eobL2x7uetKcCAwEAAQ==");
        if (uel.INSTANCE.m193266b()) {
            Main.setConfig("url", "pco-sm-log.tantantribe.com");
        } else {
            Main.setConfig("url", "pco-sm-log.tantanapp.com");
        }
        Main.setConfig("pkglist", "1");
        Main.setConfig("cdlmt", "1");
        Main.setConfig("bluetooth", "1");
        Main.setConfig(PlaceTypes.STORAGE, "1");
        this.f120481a = true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m144039k(Context context) {
        m144038j(context);
        yl5 yl5Var = qib0.f154714c0;
        if (yl5Var == null || !yl5Var.signedIn_()) {
            m144045q(context);
        } else {
            m144044p(context);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m144040l(final Context context) {
        m144034e(new d30() { // from class: l.i0f0
            @Override // p149l.d30
            public final void call() {
                this.f110322a.m144039k(context);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m144041m(String str) {
        this.f120482b.put(str);
    }

    /* JADX INFO: renamed from: n */
    public String m144042n(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            return String.format("{\"public_uid\": \"%s\", \"sha256\": \"%s\"}", str, m144036h(str3));
        }
        return String.format("{\"public_uid\": \"%s\", \"sha256\": \"%s\"}", str, m144036h(str2 + str3));
    }

    /* JADX INFO: renamed from: o */
    public final void m144043o(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(this.f120482b.get())) {
            Main.getQueryID(App.f15369e, "", str, 1, new Listener() { // from class: l.j0f0
                @Override // cn.shuzilm.core.Listener
                public final void handler(String str2) {
                    this.f115673a.m144041m(str2);
                }
            });
        }
        Main.report(context, "", str);
    }

    /* JADX INFO: renamed from: p */
    public final void m144044p(Context context) {
        User userQueryMe = qib0.f154714c0.queryMe();
        m144043o(context, m144042n(userQueryMe == null ? "" : userQueryMe.publicId, qib0.f154714c0.accessToken(), "2918efe07"), true);
    }

    /* JADX INFO: renamed from: q */
    public final void m144045q(Context context) {
        m144043o(context, m144042n("", "", "2918efe07"), false);
    }
}

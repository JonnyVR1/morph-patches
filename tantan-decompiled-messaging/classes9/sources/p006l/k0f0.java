package p006l;

import android.content.Context;
import android.text.TextUtils;
import cn.shuzilm.core.Listener;
import cn.shuzilm.core.Main;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.security.MessageDigest;
import l.d30;
import l.uqd0;
import l.x8i0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k0f0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f15530a;

    /* JADX INFO: renamed from: b */
    public uqd0 f15531b;

    /* JADX INFO: renamed from: l.k0f0$a */
    public static class C0912a {

        /* JADX INFO: renamed from: a */
        public static final k0f0 f15532a = new k0f0();
    }

    public k0f0() {
        this.f15530a = false;
        this.f15531b = new uqd0("shuzilm", "");
    }

    /* JADX INFO: renamed from: f */
    public static k0f0 m17882f() {
        return C0912a.f15532a;
    }

    /* JADX INFO: renamed from: d */
    public final String m17883d(byte[] bArr) {
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
    public final void m17884e(d30 d30Var) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public String m17885g() {
        return TextUtils.isEmpty((CharSequence) this.f15531b.get()) ? "" : (String) this.f15531b.get();
    }

    /* JADX INFO: renamed from: h */
    public final String m17886h(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return m17883d(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public void m17887i(final Context context) {
        if (RemoteConfig.x().s("shumeng_init")) {
            x8i0.a(new Runnable() { // from class: l.h0f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13622a.m17890l(context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m17888j(Context context) {
        if (this.f15530a) {
            return;
        }
        Main.init(context, "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAL4szl55NvT7HnkNUx+cajHpmP4Faq20eof6TQf9Vcfh5aQ6kuZevv6sdALJFFfrUgROjGQI0Y4eobL2x7uetKcCAwEAAQ==");
        if (uel.INSTANCE.m25199b()) {
            Main.setConfig("url", "pco-sm-log.tantantribe.com");
        } else {
            Main.setConfig("url", "pco-sm-log.tantanapp.com");
        }
        Main.setConfig("pkglist", "1");
        Main.setConfig("cdlmt", "1");
        Main.setConfig("bluetooth", "1");
        Main.setConfig("storage", "1");
        this.f15530a = true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m17889k(Context context) {
        m17888j(context);
        yl5 yl5Var = qib0.f19805c0;
        if (yl5Var == null || !yl5Var.signedIn_()) {
            m17895q(context);
        } else {
            m17894p(context);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m17890l(final Context context) {
        m17884e(new d30() { // from class: l.i0f0
            public final void call() {
                this.f14182a.m17889k(context);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m17891m(String str) {
        this.f15531b.put(str);
    }

    /* JADX INFO: renamed from: n */
    public String m17892n(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            return String.format("{\"public_uid\": \"%s\", \"sha256\": \"%s\"}", str, m17886h(str3));
        }
        return String.format("{\"public_uid\": \"%s\", \"sha256\": \"%s\"}", str, m17886h(str2 + str3));
    }

    /* JADX INFO: renamed from: o */
    public final void m17893o(Context context, String str, boolean z) {
        if (TextUtils.isEmpty((CharSequence) this.f15531b.get())) {
            Main.getQueryID(App.e, "", str, 1, new Listener() { // from class: l.j0f0
                public final void handler(String str2) {
                    this.f14916a.m17891m(str2);
                }
            });
        }
        Main.report(context, "", str);
    }

    /* JADX INFO: renamed from: p */
    public final void m17894p(Context context) {
        User userQueryMe = qib0.f19805c0.queryMe();
        m17893o(context, m17892n(userQueryMe == null ? "" : userQueryMe.publicId, qib0.f19805c0.accessToken(), "2918efe07"), true);
    }

    /* JADX INFO: renamed from: q */
    public final void m17895q(Context context) {
        m17893o(context, m17892n("", "", "2918efe07"), false);
    }
}

package p153l;

import android.content.Context;
import android.text.TextUtils;
import cn.shuzilm.core.Listener;
import cn.shuzilm.core.Main;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class r8f0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f161705a;

    /* JADX INFO: renamed from: b */
    public wyd0 f161706b;

    /* JADX INFO: renamed from: l.r8f0$a */
    public static class C19789a {

        /* JADX INFO: renamed from: a */
        public static final r8f0 f161707a = new r8f0();
    }

    public r8f0() {
        this.f161705a = false;
        this.f161706b = new wyd0("shuzilm", "");
    }

    /* JADX INFO: renamed from: f */
    public static r8f0 m180187f() {
        return C19789a.f161707a;
    }

    /* JADX INFO: renamed from: d */
    public final String m180188d(byte[] bArr) {
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
    public final void m180189e(x20 x20Var) {
        x20Var.call();
    }

    /* JADX INFO: renamed from: g */
    public String m180190g() {
        return TextUtils.isEmpty(this.f161706b.get()) ? "" : this.f161706b.get();
    }

    /* JADX INFO: renamed from: h */
    public final String m180191h(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            return m180188d(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public void m180192i(final Context context) {
        if (RemoteConfig.m80481x().m80513s("shumeng_init")) {
            xhi0.m211045a(new Runnable() { // from class: l.o8f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145408a.m180195l(context);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m180193j(Context context) {
        if (this.f161705a) {
            return;
        }
        Main.init(context, "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAL4szl55NvT7HnkNUx+cajHpmP4Faq20eof6TQf9Vcfh5aQ6kuZevv6sdALJFFfrUgROjGQI0Y4eobL2x7uetKcCAwEAAQ==");
        if (lhl.INSTANCE.m154211d()) {
            Main.setConfig("url", "pco-sm-log.tantantribe.com");
        } else {
            Main.setConfig("url", "pco-sm-log.tantanapp.com");
        }
        Main.setConfig("pkglist", "1");
        Main.setConfig("cdlmt", "1");
        Main.setConfig("bluetooth", "1");
        Main.setConfig(PlaceTypes.STORAGE, "1");
        this.f161705a = true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m180194k(Context context) {
        m180193j(context);
        bn5 bn5Var = uqb0.f180397c0;
        if (bn5Var == null || !bn5Var.signedIn_()) {
            m180200q(context);
        } else {
            m180199p(context);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m180195l(final Context context) {
        m180189e(new x20() { // from class: l.p8f0
            @Override // p153l.x20
            public final void call() {
                this.f151023a.m180194k(context);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m180196m(String str) {
        this.f161706b.put(str);
    }

    /* JADX INFO: renamed from: n */
    public String m180197n(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            return String.format("{\"public_uid\": \"%s\", \"sha256\": \"%s\"}", str, m180191h(str3));
        }
        return String.format("{\"public_uid\": \"%s\", \"sha256\": \"%s\"}", str, m180191h(str2 + str3));
    }

    /* JADX INFO: renamed from: o */
    public final void m180198o(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(this.f161706b.get())) {
            Main.getQueryID(App.f16088e, "", str, 1, new Listener() { // from class: l.q8f0
                @Override // cn.shuzilm.core.Listener
                public final void handler(String str2) {
                    this.f156107a.m180196m(str2);
                }
            });
        }
        Main.report(context, "", str);
    }

    /* JADX INFO: renamed from: p */
    public final void m180199p(Context context) {
        User userQueryMe = uqb0.f180397c0.queryMe();
        m180198o(context, m180197n(userQueryMe == null ? "" : userQueryMe.publicId, uqb0.f180397c0.accessToken(), "2918efe07"), true);
    }

    /* JADX INFO: renamed from: q */
    public final void m180200q(Context context) {
        m180198o(context, m180197n("", "", "2918efe07"), false);
    }
}

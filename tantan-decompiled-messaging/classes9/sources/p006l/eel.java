package p006l;

import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import l.deb0;
import l.du2;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.uqd0;
import org.json.JSONObject;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class eel extends deb0 {

    /* JADX INFO: renamed from: f */
    public static final uqd0 f11108f = new uqd0("honor_push_sp", "");

    /* JADX INFO: renamed from: g */
    public static final hpd0 f11109g = new hpd0("honor_push_open_sp", Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public static volatile eel f11110h;

    /* JADX INFO: renamed from: d */
    public final a<String> f11111d = a.b();

    /* JADX INFO: renamed from: e */
    public boolean f11112e = false;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m14488m(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            f11109g.put(Boolean.valueOf(m14490o()));
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14490o() {
        String strF = RemoteConfig.x().F("honor_push_config");
        if (TextUtils.isEmpty(strF)) {
            return false;
        }
        try {
            return new JSONObject(strF).optBoolean("use_honor_push");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static eel m14491p() {
        if (f11110h == null) {
            synchronized (eel.class) {
                try {
                    if (f11110h == null) {
                        f11110h = new eel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11110h;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m14492q() {
        return !TextUtils.isEmpty((CharSequence) f11108f.get());
    }

    /* JADX INFO: renamed from: r */
    public static boolean m14493r() {
        return ((Boolean) f11109g.get()).booleanValue() && m14494s();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m14494s() {
        return com.immomo.push.thirdparty.honor.a.a(App.e);
    }

    /* JADX INFO: renamed from: v */
    public static void m14495v() {
        if (m14494s()) {
            RemoteConfig.Y().subscribe(mkd0.G(new e30() { // from class: l.bel
                public final void call(Object obj) {
                    eel.m14488m((RemoteConfig.ConfigStep) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m14496a(Intent intent) {
        String stringExtra = intent.getStringExtra("custom");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        return c(stringExtra, true);
    }

    /* JADX INFO: renamed from: e */
    public String m14497e() {
        return "honor";
    }

    /* JADX INFO: renamed from: i */
    public void m14498i() {
        if (this.f11112e) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f11112e) {
                    this.f11112e = true;
                    du2.a("[common][push]", "Honor Push start!");
                    this.f11111d.subscribe(mkd0.H(new e30() { // from class: l.cel
                        public final void call(Object obj) {
                            this.f9614a.m14499t((String) obj);
                        }
                    }, new e30() { // from class: l.del
                        public final void call(Object obj) {
                            this.f10361a.m14500u((Throwable) obj);
                        }
                    }));
                    String str = (String) f11108f.get();
                    if (!TextUtils.isEmpty(str)) {
                        this.f11111d.onNext(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m14499t(String str) {
        h(str);
        f(true);
        f11108f.put(str);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m14500u(Throwable th) {
        h((String) null);
        f(false);
        this.f11112e = false;
    }

    /* JADX INFO: renamed from: w */
    public void m14501w(String str) {
        if (TextUtils.equals(str, (CharSequence) this.f11111d.e())) {
            return;
        }
        this.f11111d.onNext(str);
    }
}

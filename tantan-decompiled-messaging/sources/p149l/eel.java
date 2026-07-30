package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.immomo.push.thirdparty.honor.C3965a;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import org.json.JSONObject;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class eel extends deb0 {

    /* JADX INFO: renamed from: f */
    public static final uqd0 f90746f = new uqd0("honor_push_sp", "");

    /* JADX INFO: renamed from: g */
    public static final hpd0 f90747g = new hpd0("honor_push_open_sp", Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public static volatile eel f90748h;

    /* JADX INFO: renamed from: d */
    public final C22392a<String> f90749d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public boolean f90750e = false;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m115972m(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            f90747g.put(Boolean.valueOf(m115974o()));
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m115974o() {
        String strM79302F = RemoteConfig.m79298x().m79302F("honor_push_config");
        if (TextUtils.isEmpty(strM79302F)) {
            return false;
        }
        try {
            return new JSONObject(strM79302F).optBoolean("use_honor_push");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static eel m115975p() {
        if (f90748h == null) {
            synchronized (eel.class) {
                try {
                    if (f90748h == null) {
                        f90748h = new eel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f90748h;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m115976q() {
        return !TextUtils.isEmpty(f90746f.get());
    }

    /* JADX INFO: renamed from: r */
    public static boolean m115977r() {
        return f90747g.get().booleanValue() && m115978s();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m115978s() {
        return C3965a.m19456a(App.f15369e);
    }

    /* JADX INFO: renamed from: v */
    public static void m115979v() {
        if (m115978s()) {
            RemoteConfig.m79284Y().subscribe(mkd0.m154955G(new e30() { // from class: l.bel
                @Override // p149l.e30
                public final void call(Object obj) {
                    eel.m115972m((RemoteConfig.ConfigStep) obj);
                }
            }));
        }
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: a */
    public boolean mo81431a(Intent intent) {
        String stringExtra = intent.getStringExtra("custom");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        return m111182c(stringExtra, true);
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: e */
    public String mo81432e() {
        return HardwareEarMonitorUtils.MANUFACTURER_HONOR;
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: i */
    public void mo81433i() {
        if (this.f90750e) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f90750e) {
                    this.f90750e = true;
                    du2.m113670a("[common][push]", "Honor Push start!");
                    this.f90749d.subscribe(mkd0.m154956H(new e30() { // from class: l.cel
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f80474a.m115980t((String) obj);
                        }
                    }, new e30() { // from class: l.del
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f85804a.m115981u((Throwable) obj);
                        }
                    }));
                    String str = f90746f.get();
                    if (!TextUtils.isEmpty(str)) {
                        this.f90749d.onNext(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m115980t(String str) {
        m111186h(str);
        m111184f(true);
        f90746f.put(str);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m115981u(Throwable th) {
        m111186h(null);
        m111184f(false);
        this.f90750e = false;
    }

    /* JADX INFO: renamed from: w */
    public void m115982w(String str) {
        if (TextUtils.equals(str, this.f90749d.m221515e())) {
            return;
        }
        this.f90749d.onNext(str);
    }
}

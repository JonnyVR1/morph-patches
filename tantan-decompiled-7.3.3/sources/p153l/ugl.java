package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.immomo.push.thirdparty.honor.C4116a;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import org.json.JSONObject;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class ugl extends hmb0 {

    /* JADX INFO: renamed from: f */
    public static final wyd0 f178910f = new wyd0("honor_push_sp", "");

    /* JADX INFO: renamed from: g */
    public static final jxd0 f178911g = new jxd0("honor_push_open_sp", Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public static volatile ugl f178912h;

    /* JADX INFO: renamed from: d */
    public final C22507a<String> f178913d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public boolean f178914e = false;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m195922m(RemoteConfig.ConfigStep configStep) {
        if (configStep == RemoteConfig.ConfigStep.USER) {
            f178911g.put(Boolean.valueOf(m195924o()));
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m195924o() {
        String strM80485F = RemoteConfig.m80481x().m80485F("honor_push_config");
        if (TextUtils.isEmpty(strM80485F)) {
            return false;
        }
        try {
            return new JSONObject(strM80485F).optBoolean("use_honor_push");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static ugl m195925p() {
        if (f178912h == null) {
            synchronized (ugl.class) {
                try {
                    if (f178912h == null) {
                        f178912h = new ugl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178912h;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m195926q() {
        return !TextUtils.isEmpty(f178910f.get());
    }

    /* JADX INFO: renamed from: r */
    public static boolean m195927r() {
        return f178911g.get().booleanValue() && m195928s();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m195928s() {
        return C4116a.m20455a(App.f16088e);
    }

    /* JADX INFO: renamed from: v */
    public static void m195929v() {
        if (m195928s()) {
            RemoteConfig.m80467Y().subscribe(psd0.m173596G(new y20() { // from class: l.rgl
                @Override // p153l.y20
                public final void call(Object obj) {
                    ugl.m195922m((RemoteConfig.ConfigStep) obj);
                }
            }));
        }
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: a */
    public boolean mo82614a(Intent intent) {
        String stringExtra = intent.getStringExtra("custom");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        return m135827c(stringExtra, true);
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: e */
    public String mo82615e() {
        return HardwareEarMonitorUtils.MANUFACTURER_HONOR;
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: i */
    public void mo82616i() {
        if (this.f178914e) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f178914e) {
                    this.f178914e = true;
                    tu2.m192703a("[common][push]", "Honor Push start!");
                    this.f178913d.subscribe(psd0.m173597H(new y20() { // from class: l.sgl
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f167889a.m195930t((String) obj);
                        }
                    }, new y20() { // from class: l.tgl
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f174100a.m195931u((Throwable) obj);
                        }
                    }));
                    String str = f178910f.get();
                    if (!TextUtils.isEmpty(str)) {
                        this.f178913d.onNext(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m195930t(String str) {
        m135831h(str);
        m135829f(true);
        f178910f.put(str);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m195931u(Throwable th) {
        m135831h(null);
        m135829f(false);
        this.f178914e = false;
    }

    /* JADX INFO: renamed from: w */
    public void m195932w(String str) {
        if (TextUtils.equals(str, this.f178913d.m222761e())) {
            return;
        }
        this.f178913d.onNext(str);
    }
}

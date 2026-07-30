package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class sj20 {

    /* JADX INFO: renamed from: d */
    public static qif0<sj20> f164776d = new C19954a();

    /* JADX INFO: renamed from: a */
    public final String f164777a;

    /* JADX INFO: renamed from: b */
    public final int f164778b;

    /* JADX INFO: renamed from: c */
    public final boolean f164779c;

    /* JADX INFO: renamed from: l.sj20$a */
    public class C19954a extends qif0<sj20> {
        @Override // p149l.qif0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public sj20 mo79337a() {
            return new sj20();
        }
    }

    /* JADX INFO: renamed from: l.sj20$b */
    public class C19955b extends qif0<sj20> {
        public C19955b() {
        }

        @Override // p149l.qif0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public sj20 mo79337a() {
            return new sj20();
        }
    }

    public sj20() {
        String strM34748B = CoreModule.f17545c.f19598Q1.f20117R.m34748B();
        int iM34753G = CoreModule.f17545c.f19598Q1.f20117R.m34753G();
        this.f164779c = CoreModule.f17545c.f19598Q1.f20117R.m34758L();
        if (TextUtils.isEmpty(strM34748B)) {
            this.f164777a = null;
            this.f164778b = -1;
        } else {
            this.f164777a = strM34748B;
            this.f164778b = iM34753G;
        }
    }

    /* JADX INFO: renamed from: a */
    public static sj20 m184407a() {
        return f164776d.m174875b();
    }

    /* JADX INFO: renamed from: b */
    public boolean m184408b() {
        return m184411e() && this.f164778b == 1;
    }

    /* JADX INFO: renamed from: c */
    public boolean m184409c() {
        return m184411e() && this.f164778b == 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m184410d() {
        return l9b.m149014W(24, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: e */
    public boolean m184411e() {
        return TextUtils.equals(this.f164777a, HardwareEarMonitorUtils.MANUFACTURER_HUAWEI);
    }

    /* JADX INFO: renamed from: f */
    public boolean m184412f() {
        return this.f164779c && m184410d();
    }

    /* JADX INFO: renamed from: g */
    public void m184413g() {
        f164776d = new C19955b();
    }
}

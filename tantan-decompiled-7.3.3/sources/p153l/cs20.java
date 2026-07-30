package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class cs20 {

    /* JADX INFO: renamed from: d */
    public static zqf0<cs20> f83393d = new C16346a();

    /* JADX INFO: renamed from: a */
    public final String f83394a;

    /* JADX INFO: renamed from: b */
    public final int f83395b;

    /* JADX INFO: renamed from: c */
    public final boolean f83396c;

    /* JADX INFO: renamed from: l.cs20$a */
    public class C16346a extends zqf0<cs20> {
        @Override // p153l.zqf0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public cs20 mo80520a() {
            return new cs20();
        }
    }

    /* JADX INFO: renamed from: l.cs20$b */
    public class C16347b extends zqf0<cs20> {
        public C16347b() {
        }

        @Override // p153l.zqf0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public cs20 mo80520a() {
            return new cs20();
        }
    }

    public cs20() {
        String strM35751B = CoreModule.f18264c.f20340Q1.f20859R.m35751B();
        int iM35756G = CoreModule.f18264c.f20340Q1.f20859R.m35756G();
        this.f83396c = CoreModule.f18264c.f20340Q1.f20859R.m35761L();
        if (TextUtils.isEmpty(strM35751B)) {
            this.f83394a = null;
            this.f83395b = -1;
        } else {
            this.f83394a = strM35751B;
            this.f83395b = iM35756G;
        }
    }

    /* JADX INFO: renamed from: a */
    public static cs20 m112113a() {
        return f83393d.m221013b();
    }

    /* JADX INFO: renamed from: b */
    public boolean m112114b() {
        return m112117e() && this.f83395b == 1;
    }

    /* JADX INFO: renamed from: c */
    public boolean m112115c() {
        return m112117e() && this.f83395b == 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m112116d() {
        return yab.m214866W(24, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: e */
    public boolean m112117e() {
        return TextUtils.equals(this.f83394a, HardwareEarMonitorUtils.MANUFACTURER_HUAWEI);
    }

    /* JADX INFO: renamed from: f */
    public boolean m112118f() {
        return this.f83396c && m112116d();
    }

    /* JADX INFO: renamed from: g */
    public void m112119g() {
        f83393d = new C16347b();
    }
}

package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import java.util.concurrent.TimeUnit;
import l.l9b;
import l.qif0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sj20 {

    /* JADX INFO: renamed from: d */
    public static qif0<sj20> f21349d = new C1263a();

    /* JADX INFO: renamed from: a */
    public final String f21350a;

    /* JADX INFO: renamed from: b */
    public final int f21351b;

    /* JADX INFO: renamed from: c */
    public final boolean f21352c;

    /* JADX INFO: renamed from: l.sj20$a */
    public class C1263a extends qif0<sj20> {
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public sj20 m23821a() {
            return new sj20();
        }
    }

    /* JADX INFO: renamed from: l.sj20$b */
    public class C1264b extends qif0<sj20> {
        public C1264b() {
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public sj20 m23823a() {
            return new sj20();
        }
    }

    public sj20() {
        String strM6685B = CoreModule.f1534c.f3587Q1.f4106R.m6685B();
        int iM6690G = CoreModule.f1534c.f3587Q1.f4106R.m6690G();
        this.f21352c = CoreModule.f1534c.f3587Q1.f4106R.m6695L();
        if (TextUtils.isEmpty(strM6685B)) {
            this.f21350a = null;
            this.f21351b = -1;
        } else {
            this.f21350a = strM6685B;
            this.f21351b = iM6690G;
        }
    }

    /* JADX INFO: renamed from: a */
    public static sj20 m23814a() {
        return (sj20) f21349d.b();
    }

    /* JADX INFO: renamed from: b */
    public boolean m23815b() {
        return m23818e() && this.f21351b == 1;
    }

    /* JADX INFO: renamed from: c */
    public boolean m23816c() {
        return m23818e() && this.f21351b == 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m23817d() {
        return l9b.W(24, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: e */
    public boolean m23818e() {
        return TextUtils.equals(this.f21350a, "huawei");
    }

    /* JADX INFO: renamed from: f */
    public boolean m23819f() {
        return this.f21352c && m23817d();
    }

    /* JADX INFO: renamed from: g */
    public void m23820g() {
        f21349d = new C1264b();
    }
}

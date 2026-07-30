package com.p000p1.mobile.putong.core.newui.messages;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.messages.C0304a;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import l.b0d0;
import l.gr9;
import l.hpd0;
import l.k250;
import l.nkp;
import l.qib0;
import l.r70;
import l.u59;
import l.upa;
import l.vwb;
import l.w9j;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0304a {

    /* JADX INFO: renamed from: f */
    public static hpd0 f4077f = new hpd0("open_fill_info_debug", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public final ConversationsList f4079b;

    /* JADX INFO: renamed from: c */
    public final ConversationsList.C0294e f4080c;

    /* JADX INFO: renamed from: d */
    public final int f4081d;

    /* JADX INFO: renamed from: a */
    public final List<a> f4078a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f4082e = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo5970a();
    }

    public C0304a(ConversationsList conversationsList, ConversationsList.C0294e c0294e, int i) {
        this.f4079b = conversationsList;
        this.f4080c = c0294e;
        this.f4081d = i;
        m5964n();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m5950b() {
        return 48;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m5951c() {
        return 47;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m5952d() {
        return 15;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m5953e() {
        return 15;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m5954f() {
        return 13;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m5955g() {
        return 48;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m5956h() {
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m5957p(String str) {
        return m5958q(str, true);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m5958q(String str, boolean z) {
        if (!upa.b2()) {
            return false;
        }
        long jLongValue = ((Long) CoreModule.c.f0.H0.get()).longValue();
        long jLongValue2 = ((Long) CoreModule.c.f0.I0.get()).longValue();
        String str2 = (String) CoreModule.c.f0.J0.get();
        long jM18550o = mqi0.m18550o();
        return jLongValue > 0 && !(((Boolean) CoreModule.c.f0.K0.get()).booleanValue() && z) && jM18550o >= jLongValue && jLongValue2 > jM18550o && !TextUtils.isEmpty(str) && str2.equals(str) && CoreModule.c.f0.Xe(str) == null;
    }

    /* JADX INFO: renamed from: i */
    public final void m5959i(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5960j(long j) {
        long j2;
        if (j <= 3) {
            return true;
        }
        int i = 0;
        int i2 = 1;
        while (true) {
            j2 = i2;
            if (j2 >= j) {
                break;
            }
            int i3 = i + i2;
            i = i2;
            i2 = i3;
        }
        return j2 == j;
    }

    /* JADX INFO: renamed from: k */
    public int m5961k() {
        if (this.f4082e) {
            return this.f4078a.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m5962l(int i) {
        if (i < m5961k()) {
            return this.f4078a.get(i).mo5970a();
        }
        k250.a("not a function item in position ", i);
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final long m5963m(double d) {
        long jM18550o = mqi0.m18550o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((long) d);
        m5959i(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM18550o);
        m5959i(calendar2);
        return ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000) + 1;
    }

    /* JADX INFO: renamed from: n */
    public void m5964n() {
        if (this.f4079b.f3897h1) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        boolean zM5540H1 = this.f4079b.m5540H1();
        List<a> list = this.f4078a;
        if (!zM5540H1) {
            list.clear();
            if (u59.h() && NullChecker.a(userP9) && !userP9.isVIP() && this.f4079b.f3890a1) {
                m5967s(true);
                this.f4078a.add(new a() { // from class: l.v66
                    @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                    /* JADX INFO: renamed from: a */
                    public final int mo5970a() {
                        return C0304a.m5952d();
                    }
                });
                return;
            }
            return;
        }
        list.clear();
        m5966r();
        if (m5957p((String) CoreModule.c.f0.J0.get())) {
            this.f4078a.add(new a() { // from class: l.w66
                @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                /* JADX INFO: renamed from: a */
                public final int mo5970a() {
                    return C0304a.m5954f();
                }
            });
        }
        if (u59.h() && NullChecker.a(userP9) && !userP9.isVIP() && r70.g().f() && this.f4079b.f3890a1 && (IntlCountryCodeController.m() || m5969u(userP9.createdTime))) {
            this.f4078a.add(new a() { // from class: l.x66
                @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                /* JADX INFO: renamed from: a */
                public final int mo5970a() {
                    return C0304a.m5953e();
                }
            });
        }
        if (CoreModule.Q().m9019M6().m12084c() && qib0.b0.c.m9051g9()) {
            this.f4078a.add(new a() { // from class: l.y66
                @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                /* JADX INFO: renamed from: a */
                public final int mo5970a() {
                    return C0304a.m5951c();
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m5965o(final int i) {
        return vwb.G(this.f4078a, new w9j() { // from class: l.z66
            public final Object call(Object obj) {
                return Boolean.valueOf(((C0304a.a) obj).mo5970a() == i);
            }
        }) != -1;
    }

    /* JADX INFO: renamed from: r */
    public final void m5966r() {
        boolean zC0 = b0d0.c0();
        if (gr9.c() && CoreModule.c.n1.E3()) {
            this.f4078a.add(new a() { // from class: l.a76
                @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                /* JADX INFO: renamed from: a */
                public final int mo5970a() {
                    return C0304a.m5950b();
                }
            });
            return;
        }
        if (this.f4079b.m5540H1() && nkp.d(this.f4081d) && !zC0) {
            this.f4078a.add(new a() { // from class: l.b76
                @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                /* JADX INFO: renamed from: a */
                public final int mo5970a() {
                    return C0304a.m5956h();
                }
            });
        } else {
            if (!gr9.c() || CoreModule.c.n1.G3().e() == null || TextUtils.isEmpty(((VisitorDoorInfo) CoreModule.c.n1.G3().e()).userID)) {
                return;
            }
            this.f4078a.add(new a() { // from class: l.c76
                @Override // com.p000p1.mobile.putong.core.newui.messages.C0304a.a
                /* JADX INFO: renamed from: a */
                public final int mo5970a() {
                    return C0304a.m5955g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m5967s(boolean z) {
        this.f4082e = z;
    }

    /* JADX INFO: renamed from: t */
    public void m5968t() {
        this.f4078a.clear();
        m5966r();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5969u(double d) {
        return m5960j(m5963m(d));
    }
}

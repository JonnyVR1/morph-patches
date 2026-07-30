package com.p051p1.mobile.putong.core.newui.messages;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p153l.d79;
import p153l.e8d0;
import p153l.gra;
import p153l.jxd0;
import p153l.jyb;
import p153l.n70;
import p153l.nmp;
import p153l.pzi0;
import p153l.qcj;
import p153l.rs9;
import p153l.uqb0;
import p153l.za50;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8291a {

    /* JADX INFO: renamed from: f */
    public static jxd0 f26041f = new jxd0("open_fill_info_debug", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public final ConversationsList f26043b;

    /* JADX INFO: renamed from: c */
    public final ConversationsList.C8281e f26044c;

    /* JADX INFO: renamed from: d */
    public final int f26045d;

    /* JADX INFO: renamed from: a */
    public final List<a> f26042a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f26046e = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo42855a();
    }

    public C8291a(ConversationsList conversationsList, ConversationsList.C8281e c8281e, int i) {
        this.f26043b = conversationsList;
        this.f26044c = c8281e;
        this.f26045d = i;
        m42849n();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m42835b() {
        return 48;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m42836c() {
        return 47;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m42837d() {
        return 15;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m42838e() {
        return 15;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m42839f() {
        return 13;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m42840g() {
        return 48;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m42841h() {
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m42842p(String str) {
        return m42843q(str, true);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m42843q(String str, boolean z) {
        if (!gra.m131661b2()) {
            return false;
        }
        long jLongValue = CoreModule.f18264c.f20384f0.f20604H0.get().longValue();
        long jLongValue2 = CoreModule.f18264c.f20384f0.f20607I0.get().longValue();
        String str2 = CoreModule.f18264c.f20384f0.f20610J0.get();
        long jM174454o = pzi0.m174454o();
        return jLongValue > 0 && !(CoreModule.f18264c.f20384f0.f20613K0.get().booleanValue() && z) && jM174454o >= jLongValue && jLongValue2 > jM174454o && !TextUtils.isEmpty(str) && str2.equals(str) && CoreModule.f18264c.f20384f0.m33859Xe(str) == null;
    }

    /* JADX INFO: renamed from: i */
    public final void m42844i(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m42845j(long j) {
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
    public int m42846k() {
        if (this.f26046e) {
            return this.f26042a.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m42847l(int i) {
        if (i < m42846k()) {
            return this.f26042a.get(i).mo42855a();
        }
        za50.m219101a("not a function item in position ", i);
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final long m42848m(double d) {
        long jM174454o = pzi0.m174454o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((long) d);
        m42844i(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM174454o);
        m42844i(calendar2);
        return ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000) + 1;
    }

    /* JADX INFO: renamed from: n */
    public void m42849n() {
        if (this.f26043b.f25861h1) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        boolean zM42445H1 = this.f26043b.m42445H1();
        List<a> list = this.f26042a;
        if (!zM42445H1) {
            list.clear();
            if (d79.m114680h() && NullChecker.m82486a(userM116600p9) && !userM116600p9.isVIP() && this.f26043b.f25854a1) {
                m42852s(true);
                this.f26042a.add(new a() { // from class: l.a86
                    @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                    /* JADX INFO: renamed from: a */
                    public final int mo42855a() {
                        return C8291a.m42837d();
                    }
                });
                return;
            }
            return;
        }
        list.clear();
        m42851r();
        if (m42842p(CoreModule.f18264c.f20384f0.f20610J0.get())) {
            this.f26042a.add(new a() { // from class: l.b86
                @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                /* JADX INFO: renamed from: a */
                public final int mo42855a() {
                    return C8291a.m42839f();
                }
            });
        }
        if (d79.m114680h() && NullChecker.m82486a(userM116600p9) && !userM116600p9.isVIP() && n70.m161856g().m161857f() && this.f26043b.f25854a1 && (IntlCountryCodeController.m29116m() || m42854u(userM116600p9.createdTime))) {
            this.f26042a.add(new a() { // from class: l.c86
                @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                /* JADX INFO: renamed from: a */
                public final int mo42855a() {
                    return C8291a.m42838e();
                }
            });
        }
        if (CoreModule.m30934Q().mo68412M6().mo127332c() && uqb0.f180396b0.f170326c.mo68449g9()) {
            this.f26042a.add(new a() { // from class: l.d86
                @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                /* JADX INFO: renamed from: a */
                public final int mo42855a() {
                    return C8291a.m42836c();
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m42850o(final int i) {
        return jyb.m147476G(this.f26042a, new qcj() { // from class: l.e86
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C8291a.a) obj).mo42855a() == i);
            }
        }) != -1;
    }

    /* JADX INFO: renamed from: r */
    public final void m42851r() {
        boolean zM119812c0 = e8d0.m119812c0();
        if (rs9.m182934c() && CoreModule.f18264c.f20409n1.getShowVisitorConversation()) {
            this.f26042a.add(new a() { // from class: l.f86
                @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                /* JADX INFO: renamed from: a */
                public final int mo42855a() {
                    return C8291a.m42835b();
                }
            });
            return;
        }
        if (this.f26043b.m42445H1() && nmp.m163835d(this.f26045d) && !zM119812c0) {
            this.f26042a.add(new a() { // from class: l.g86
                @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                /* JADX INFO: renamed from: a */
                public final int mo42855a() {
                    return C8291a.m42841h();
                }
            });
        } else {
            if (!rs9.m182934c() || CoreModule.f18264c.f20409n1.m35271G3().m222761e() == null || TextUtils.isEmpty(CoreModule.f18264c.f20409n1.m35271G3().m222761e().userID)) {
                return;
            }
            this.f26042a.add(new a() { // from class: l.h86
                @Override // com.p051p1.mobile.putong.core.newui.messages.C8291a.a
                /* JADX INFO: renamed from: a */
                public final int mo42855a() {
                    return C8291a.m42840g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m42852s(boolean z) {
        this.f26046e = z;
    }

    /* JADX INFO: renamed from: t */
    public void m42853t() {
        this.f26042a.clear();
        m42851r();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m42854u(double d) {
        return m42845j(m42848m(d));
    }
}

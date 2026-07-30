package com.p046p1.mobile.putong.core.newui.messages;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p149l.b0d0;
import p149l.gr9;
import p149l.hpd0;
import p149l.k250;
import p149l.mqi0;
import p149l.nkp;
import p149l.qib0;
import p149l.r70;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8140a {

    /* JADX INFO: renamed from: f */
    public static hpd0 f25299f = new hpd0("open_fill_info_debug", Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public final ConversationsList f25301b;

    /* JADX INFO: renamed from: c */
    public final ConversationsList.C8130e f25302c;

    /* JADX INFO: renamed from: d */
    public final int f25303d;

    /* JADX INFO: renamed from: a */
    public final List<a> f25300a = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f25304e = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo41844a();
    }

    public C8140a(ConversationsList conversationsList, ConversationsList.C8130e c8130e, int i) {
        this.f25301b = conversationsList;
        this.f25302c = c8130e;
        this.f25303d = i;
        m41838n();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m41824b() {
        return 48;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m41825c() {
        return 47;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m41826d() {
        return 15;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m41827e() {
        return 15;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m41828f() {
        return 13;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m41829g() {
        return 48;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m41830h() {
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m41831p(String str) {
        return m41832q(str, true);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m41832q(String str, boolean z) {
        if (!upa.m194730b2()) {
            return false;
        }
        long jLongValue = CoreModule.f17545c.f19642f0.f19862H0.get().longValue();
        long jLongValue2 = CoreModule.f17545c.f19642f0.f19865I0.get().longValue();
        String str2 = CoreModule.f17545c.f19642f0.f19868J0.get();
        long jM155944o = mqi0.m155944o();
        return jLongValue > 0 && !(CoreModule.f17545c.f19642f0.f19871K0.get().booleanValue() && z) && jM155944o >= jLongValue && jLongValue2 > jM155944o && !TextUtils.isEmpty(str) && str2.equals(str) && CoreModule.f17545c.f19642f0.m32856Xe(str) == null;
    }

    /* JADX INFO: renamed from: i */
    public final void m41833i(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m41834j(long j) {
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
    public int m41835k() {
        if (this.f25304e) {
            return this.f25300a.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m41836l(int i) {
        if (i < m41835k()) {
            return this.f25300a.get(i).mo41844a();
        }
        k250.m144273a("not a function item in position ", i);
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final long m41837m(double d) {
        long jM155944o = mqi0.m155944o();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((long) d);
        m41833i(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jM155944o);
        m41833i(calendar2);
        return ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000) + 1;
    }

    /* JADX INFO: renamed from: n */
    public void m41838n() {
        if (this.f25301b.f25119h1) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        boolean zM41434H1 = this.f25301b.m41434H1();
        List<a> list = this.f25300a;
        if (!zM41434H1) {
            list.clear();
            if (u59.m191830h() && NullChecker.m81303a(userM169527p9) && !userM169527p9.isVIP() && this.f25301b.f25112a1) {
                m41841s(true);
                this.f25300a.add(new a() { // from class: l.v66
                    @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                    /* JADX INFO: renamed from: a */
                    public final int mo41844a() {
                        return C8140a.m41826d();
                    }
                });
                return;
            }
            return;
        }
        list.clear();
        m41840r();
        if (m41831p(CoreModule.f17545c.f19642f0.f19868J0.get())) {
            this.f25300a.add(new a() { // from class: l.w66
                @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                /* JADX INFO: renamed from: a */
                public final int mo41844a() {
                    return C8140a.m41828f();
                }
            });
        }
        if (u59.m191830h() && NullChecker.m81303a(userM169527p9) && !userM169527p9.isVIP() && r70.m178118g().m178119f() && this.f25301b.f25112a1 && (IntlCountryCodeController.m28117m() || m41843u(userM169527p9.createdTime))) {
            this.f25300a.add(new a() { // from class: l.x66
                @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                /* JADX INFO: renamed from: a */
                public final int mo41844a() {
                    return C8140a.m41827e();
                }
            });
        }
        if (CoreModule.m29936Q().mo67229M6().mo102418c() && qib0.f154713b0.f139232c.mo67266g9()) {
            this.f25300a.add(new a() { // from class: l.y66
                @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                /* JADX INFO: renamed from: a */
                public final int mo41844a() {
                    return C8140a.m41825c();
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m41839o(final int i) {
        return vwb.m200293G(this.f25300a, new w9j() { // from class: l.z66
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C8140a.a) obj).mo41844a() == i);
            }
        }) != -1;
    }

    /* JADX INFO: renamed from: r */
    public final void m41840r() {
        boolean zM99748c0 = b0d0.m99748c0();
        if (gr9.m127678c() && CoreModule.f17545c.f19667n1.getShowVisitorConversation()) {
            this.f25300a.add(new a() { // from class: l.a76
                @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                /* JADX INFO: renamed from: a */
                public final int mo41844a() {
                    return C8140a.m41824b();
                }
            });
            return;
        }
        if (this.f25301b.m41434H1() && nkp.m159985d(this.f25303d) && !zM99748c0) {
            this.f25300a.add(new a() { // from class: l.b76
                @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                /* JADX INFO: renamed from: a */
                public final int mo41844a() {
                    return C8140a.m41830h();
                }
            });
        } else {
            if (!gr9.m127678c() || CoreModule.f17545c.f19667n1.m34268G3().m221515e() == null || TextUtils.isEmpty(CoreModule.f17545c.f19667n1.m34268G3().m221515e().userID)) {
                return;
            }
            this.f25300a.add(new a() { // from class: l.c76
                @Override // com.p046p1.mobile.putong.core.newui.messages.C8140a.a
                /* JADX INFO: renamed from: a */
                public final int mo41844a() {
                    return C8140a.m41829g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m41841s(boolean z) {
        this.f25304e = z;
    }

    /* JADX INFO: renamed from: t */
    public void m41842t() {
        this.f25300a.clear();
        m41840r();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m41843u(double d) {
        return m41834j(m41837m(d));
    }
}

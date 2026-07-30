package com.xiaomi.push.service;

import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import com.xiaomi.push.C14780i;
import com.xiaomi.push.C14785j;
import com.xiaomi.push.EnumC14733ei;
import java.util.Date;
import p149l.aqq0;
import p149l.atq0;
import p149l.cqq0;
import p149l.fqq0;
import p149l.gqq0;
import p149l.hqq0;
import p149l.ilq0;
import p149l.iqq0;
import p149l.jqq0;
import p149l.jtq0;
import p149l.mnq0;
import p149l.psq0;
import p149l.qrq0;
import p149l.rnq0;
import p149l.yoq0;
import p149l.ysq0;
import p149l.zsq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ak */
/* JADX INFO: loaded from: classes2.dex */
public class C14840ak {

    /* JADX INFO: renamed from: a */
    private XMPushService f62876a;

    public C14840ak(XMPushService xMPushService) {
        this.f62876a = xMPushService;
    }

    /* JADX INFO: renamed from: c */
    private void m86500c(qrq0 qrq0Var) {
        C14842am.b bVarM86508a;
        String strM176082F = qrq0Var.m176082F();
        String string = Integer.toString(qrq0Var.m176083a());
        if (TextUtils.isEmpty(strM176082F) || TextUtils.isEmpty(string) || (bVarM86508a = C14842am.m86505a().m86508a(string, strM176082F)) == null) {
            return;
        }
        jtq0.m143168j(this.f62876a, bVarM86508a.f62890a, qrq0Var.mo176104x(), true, true, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public void m86501a(atq0 atq0Var) {
        if (!"5".equals(atq0Var.m98867m())) {
            m86499b(atq0Var);
        }
        String strM98867m = atq0Var.m98867m();
        if (TextUtils.isEmpty(strM98867m)) {
            strM98867m = "1";
            atq0Var.m98870p("1");
        }
        String str = strM98867m;
        if (str.equals("0")) {
            ilq0.m137040m("Received wrong packet with chid = 0 : " + atq0Var.mo85578d());
        }
        if (atq0Var instanceof C14785j) {
            ysq0 ysq0VarM98861f = atq0Var.m98861f("kick");
            if (ysq0VarM98861f != null) {
                String strM98869o = atq0Var.m98869o();
                String strM215924d = ysq0VarM98861f.m215924d("type");
                String strM215924d2 = ysq0VarM98861f.m215924d(Reason.TYPE);
                ilq0.m137040m("kicked by server, chid=" + str + " res=" + C14842am.b.m86522a(strM98869o) + " type=" + strM215924d + " reason=" + strM215924d2);
                if (!"wait".equals(strM215924d)) {
                    this.f62876a.m86349a(str, strM98869o, 3, strM215924d2, strM215924d);
                    C14842am.m86505a().m86518a(str, strM98869o);
                    return;
                }
                C14842am.b bVarM86508a = C14842am.m86505a().m86508a(str, strM98869o);
                if (bVarM86508a != null) {
                    this.f62876a.m86348a(bVarM86508a);
                    bVarM86508a.m86533a(C14842am.c.unbind, 3, 0, strM215924d2, strM215924d);
                    return;
                }
                return;
            }
        } else if (atq0Var instanceof zsq0) {
            zsq0 zsq0Var = (zsq0) atq0Var;
            if ("redir".equals(zsq0Var.m220057B())) {
                ysq0 ysq0VarM98861f2 = zsq0Var.m98861f("hosts");
                if (ysq0VarM98861f2 != null) {
                    m86498a(ysq0VarM98861f2);
                    return;
                }
                return;
            }
        }
        this.f62876a.m86357b().m86666a(this.f62876a, str, atq0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m86503b(qrq0 qrq0Var) {
        String strM176085c = qrq0Var.m176085c();
        if (qrq0Var.m176083a() == 0) {
            if ("PING".equals(strM176085c)) {
                byte[] bArrM176096p = qrq0Var.m176096p();
                if (bArrM176096p != null && bArrM176096p.length > 0) {
                    iqq0 iqq0VarM137784o = iqq0.m137784o(bArrM176096p);
                    if (iqq0VarM137784o.m137791q()) {
                        C14853ax.m86571a().m86586a(iqq0VarM137784o.m137786k());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f62876a.getPackageName())) {
                    this.f62876a.m86342a();
                }
                if ("1".equals(qrq0Var.m176080D())) {
                    ilq0.m137040m("received a server ping");
                } else {
                    C14780i.m86252j();
                }
                this.f62876a.m86358b();
                return;
            }
            if (!"SYNC".equals(strM176085c)) {
                if ("NOTIFY".equals(qrq0Var.m176085c())) {
                    gqq0 gqq0VarM127622n = gqq0.m127622n(qrq0Var.m176096p());
                    ilq0.m137040m("notify by server err = " + gqq0VarM127622n.m127629q() + " desc = " + gqq0VarM127622n.m127623j());
                    return;
                }
                return;
            }
            if ("CONF".equals(qrq0Var.m176100t())) {
                C14853ax.m86571a().m86586a(aqq0.m98325m(qrq0Var.m176096p()));
                return;
            }
            if (TextUtils.equals("U", qrq0Var.m176100t())) {
                jqq0 jqq0VarM142831q = jqq0.m142831q(qrq0Var.m176096p());
                yoq0.m215531c(this.f62876a).m215539f(jqq0VarM142831q.m142836k(), jqq0VarM142831q.m142844t(), new Date(jqq0VarM142831q.m142835j()), new Date(jqq0VarM142831q.m142843s()), jqq0VarM142831q.m142848x() * 1024, jqq0VarM142831q.m142832A());
                qrq0 qrq0Var2 = new qrq0();
                qrq0Var2.m176088h(0);
                qrq0Var2.m176092l(qrq0Var.m176085c(), "UCA");
                qrq0Var2.m176091k(qrq0Var.m176080D());
                XMPushService xMPushService = this.f62876a;
                xMPushService.m86345a(new C14852aw(xMPushService, qrq0Var2));
                return;
            }
            if (TextUtils.equals("P", qrq0Var.m176100t())) {
                hqq0 hqq0VarM132500m = hqq0.m132500m(qrq0Var.m176096p());
                qrq0 qrq0Var3 = new qrq0();
                qrq0Var3.m176088h(0);
                qrq0Var3.m176092l(qrq0Var.m176085c(), "PCA");
                qrq0Var3.m176091k(qrq0Var.m176080D());
                hqq0 hqq0Var = new hqq0();
                if (hqq0VarM132500m.m132504n()) {
                    hqq0Var.m132502k(hqq0VarM132500m.m132501j());
                }
                qrq0Var3.m176094n(hqq0Var.m215761h(), null);
                XMPushService xMPushService2 = this.f62876a;
                xMPushService2.m86345a(new C14852aw(xMPushService2, qrq0Var3));
                ilq0.m137040m("ACK msgP: id = " + qrq0Var.m176080D());
                return;
            }
            return;
        }
        String string = Integer.toString(qrq0Var.m176083a());
        if ("SECMSG".equals(qrq0Var.m176085c())) {
            if (!qrq0Var.m176095o()) {
                this.f62876a.m86357b().m86667a(this.f62876a, string, qrq0Var);
                return;
            }
            ilq0.m137040m("Recv SECMSG errCode = " + qrq0Var.m176098r() + " errStr = " + qrq0Var.m176106z());
            return;
        }
        if (!"BIND".equals(strM176085c)) {
            if ("KICK".equals(strM176085c)) {
                fqq0 fqq0VarM122730m = fqq0.m122730m(qrq0Var.m176096p());
                String strM176082F = qrq0Var.m176082F();
                String strM122731j = fqq0VarM122730m.m122731j();
                String strM122735o = fqq0VarM122730m.m122735o();
                ilq0.m137040m("kicked by server, chid=" + string + " res= " + C14842am.b.m86522a(strM176082F) + " type=" + strM122731j + " reason=" + strM122735o);
                if (!"wait".equals(strM122731j)) {
                    this.f62876a.m86349a(string, strM176082F, 3, strM122735o, strM122731j);
                    C14842am.m86505a().m86518a(string, strM176082F);
                    return;
                }
                C14842am.b bVarM86508a = C14842am.m86505a().m86508a(string, strM176082F);
                if (bVarM86508a != null) {
                    this.f62876a.m86348a(bVarM86508a);
                    bVarM86508a.m86533a(C14842am.c.unbind, 3, 0, strM122735o, strM122731j);
                    return;
                }
                return;
            }
            return;
        }
        cqq0 cqq0VarM108290n = cqq0.m108290n(qrq0Var.m176096p());
        String strM176082F2 = qrq0Var.m176082F();
        C14842am.b bVarM86508a2 = C14842am.m86505a().m86508a(string, strM176082F2);
        if (bVarM86508a2 == null) {
            return;
        }
        if (cqq0VarM108290n.m108295o()) {
            ilq0.m137040m("SMACK: channel bind succeeded, chid=" + qrq0Var.m176083a());
            bVarM86508a2.m86533a(C14842am.c.binded, 1, 0, (String) null, (String) null);
            return;
        }
        String strM108291j = cqq0VarM108290n.m108291j();
        if ("auth".equals(strM108291j)) {
            if ("invalid-sig".equals(cqq0VarM108290n.m108296p())) {
                ilq0.m137040m("SMACK: bind error invalid-sig token = " + bVarM86508a2.f62896c + " sec = " + bVarM86508a2.f62901h);
                C14780i.m86246d(0, EnumC14733ei.BIND_INVALID_SIG.m85528a(), 1, null, 0);
            }
            bVarM86508a2.m86533a(C14842am.c.unbind, 1, 5, cqq0VarM108290n.m108296p(), strM108291j);
            C14842am.m86505a().m86518a(string, strM176082F2);
        } else if ("cancel".equals(strM108291j)) {
            bVarM86508a2.m86533a(C14842am.c.unbind, 1, 7, cqq0VarM108290n.m108296p(), strM108291j);
            C14842am.m86505a().m86518a(string, strM176082F2);
        } else if ("wait".equals(strM108291j)) {
            this.f62876a.m86348a(bVarM86508a2);
            bVarM86508a2.m86533a(C14842am.c.unbind, 1, 7, cqq0VarM108290n.m108296p(), strM108291j);
        }
        ilq0.m137040m("SMACK: channel bind failed, chid=" + string + " reason=" + cqq0VarM108290n.m108296p());
    }

    /* JADX INFO: renamed from: a */
    public void m86502a(qrq0 qrq0Var) {
        if (5 != qrq0Var.m176083a()) {
            m86500c(qrq0Var);
        }
        try {
            m86503b(qrq0Var);
        } catch (Exception e) {
            ilq0.m137042o("handle Blob chid = " + qrq0Var.m176083a() + " cmd = " + qrq0Var.m176085c() + " packetid = " + qrq0Var.m176080D() + " failure ", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86498a(ysq0 ysq0Var) {
        String strM215928k = ysq0Var.m215928k();
        if (TextUtils.isEmpty(strM215928k)) {
            return;
        }
        String[] strArrSplit = strM215928k.split(Constants.PACKNAME_END);
        mnq0 mnq0VarM180134a = rnq0.m180126a().m180134a(psq0.m171238a(), false);
        if (mnq0VarM180134a == null || strArrSplit.length <= 0) {
            return;
        }
        mnq0VarM180134a.m155548o(strArrSplit);
        this.f62876a.m86344a(20, (Exception) null);
        this.f62876a.m86352a(true);
    }

    /* JADX INFO: renamed from: b */
    private void m86499b(atq0 atq0Var) {
        C14842am.b bVarM86508a;
        String strM98869o = atq0Var.m98869o();
        String strM98867m = atq0Var.m98867m();
        if (TextUtils.isEmpty(strM98869o) || TextUtils.isEmpty(strM98867m) || (bVarM86508a = C14842am.m86505a().m86508a(strM98867m, strM98869o)) == null) {
            return;
        }
        jtq0.m143168j(this.f62876a, bVarM86508a.f62890a, jtq0.m143160b(atq0Var.mo85578d()), true, true, System.currentTimeMillis());
    }
}

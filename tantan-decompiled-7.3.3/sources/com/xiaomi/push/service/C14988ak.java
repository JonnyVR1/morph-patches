package com.xiaomi.push.service;

import android.text.TextUtils;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.data.Reason;
import com.xiaomi.push.C14928i;
import com.xiaomi.push.C14933j;
import com.xiaomi.push.EnumC14881ei;
import java.util.Date;
import p153l.e2r0;
import p153l.eyq0;
import p153l.f2r0;
import p153l.g2r0;
import p153l.gzq0;
import p153l.izq0;
import p153l.lzq0;
import p153l.mzq0;
import p153l.nzq0;
import p153l.ouq0;
import p153l.ozq0;
import p153l.p2r0;
import p153l.pzq0;
import p153l.swq0;
import p153l.v1r0;
import p153l.w0r0;
import p153l.xwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ak */
/* JADX INFO: loaded from: classes2.dex */
public class C14988ak {

    /* JADX INFO: renamed from: a */
    private XMPushService f63723a;

    public C14988ak(XMPushService xMPushService) {
        this.f63723a = xMPushService;
    }

    /* JADX INFO: renamed from: c */
    private void m87671c(w0r0 w0r0Var) {
        C14990am.b bVarM87679a;
        String strM204319F = w0r0Var.m204319F();
        String string = Integer.toString(w0r0Var.m204320a());
        if (TextUtils.isEmpty(strM204319F) || TextUtils.isEmpty(string) || (bVarM87679a = C14990am.m87676a().m87679a(string, strM204319F)) == null) {
            return;
        }
        p2r0.m170392j(this.f63723a, bVarM87679a.f63737a, w0r0Var.mo107636x(), true, true, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public void m87672a(g2r0 g2r0Var) {
        if (!"5".equals(g2r0Var.m128649m())) {
            m87670b(g2r0Var);
        }
        String strM128649m = g2r0Var.m128649m();
        if (TextUtils.isEmpty(strM128649m)) {
            strM128649m = "1";
            g2r0Var.m128652p("1");
        }
        String str = strM128649m;
        if (str.equals("0")) {
            ouq0.m169393m("Received wrong packet with chid = 0 : " + g2r0Var.mo86749d());
        }
        if (g2r0Var instanceof C14933j) {
            e2r0 e2r0VarM128643f = g2r0Var.m128643f("kick");
            if (e2r0VarM128643f != null) {
                String strM128651o = g2r0Var.m128651o();
                String strM119159d = e2r0VarM128643f.m119159d("type");
                String strM119159d2 = e2r0VarM128643f.m119159d(Reason.TYPE);
                ouq0.m169393m("kicked by server, chid=" + str + " res=" + C14990am.b.m87693a(strM128651o) + " type=" + strM119159d + " reason=" + strM119159d2);
                if (!"wait".equals(strM119159d)) {
                    this.f63723a.m87520a(str, strM128651o, 3, strM119159d2, strM119159d);
                    C14990am.m87676a().m87689a(str, strM128651o);
                    return;
                }
                C14990am.b bVarM87679a = C14990am.m87676a().m87679a(str, strM128651o);
                if (bVarM87679a != null) {
                    this.f63723a.m87519a(bVarM87679a);
                    bVarM87679a.m87704a(C14990am.c.unbind, 3, 0, strM119159d2, strM119159d);
                    return;
                }
                return;
            }
        } else if (g2r0Var instanceof f2r0) {
            f2r0 f2r0Var = (f2r0) g2r0Var;
            if ("redir".equals(f2r0Var.m123650B())) {
                e2r0 e2r0VarM128643f2 = f2r0Var.m128643f("hosts");
                if (e2r0VarM128643f2 != null) {
                    m87669a(e2r0VarM128643f2);
                    return;
                }
                return;
            }
        }
        this.f63723a.m87528b().m87837a(this.f63723a, str, g2r0Var);
    }

    /* JADX INFO: renamed from: b */
    public void m87674b(w0r0 w0r0Var) {
        String strM204322c = w0r0Var.m204322c();
        if (w0r0Var.m204320a() == 0) {
            if ("PING".equals(strM204322c)) {
                byte[] bArrM204332p = w0r0Var.m204332p();
                if (bArrM204332p != null && bArrM204332p.length > 0) {
                    ozq0 ozq0VarM169990o = ozq0.m169990o(bArrM204332p);
                    if (ozq0VarM169990o.m169997q()) {
                        C15001ax.m87742a().m87757a(ozq0VarM169990o.m169992k());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f63723a.getPackageName())) {
                    this.f63723a.m87513a();
                }
                if ("1".equals(w0r0Var.m204317D())) {
                    ouq0.m169393m("received a server ping");
                } else {
                    C14928i.m87423j();
                }
                this.f63723a.m87529b();
                return;
            }
            if (!"SYNC".equals(strM204322c)) {
                if ("NOTIFY".equals(w0r0Var.m204322c())) {
                    mzq0 mzq0VarM160920n = mzq0.m160920n(w0r0Var.m204332p());
                    ouq0.m169393m("notify by server err = " + mzq0VarM160920n.m160927q() + " desc = " + mzq0VarM160920n.m160921j());
                    return;
                }
                return;
            }
            if ("CONF".equals(w0r0Var.m204336t())) {
                C15001ax.m87742a().m87757a(gzq0.m133108m(w0r0Var.m204332p()));
                return;
            }
            if (TextUtils.equals("U", w0r0Var.m204336t())) {
                pzq0 pzq0VarM174573q = pzq0.m174573q(w0r0Var.m204332p());
                eyq0.m123217c(this.f63723a).m123225f(pzq0VarM174573q.m174578k(), pzq0VarM174573q.m174586t(), new Date(pzq0VarM174573q.m174577j()), new Date(pzq0VarM174573q.m174585s()), pzq0VarM174573q.m174590x() * 1024, pzq0VarM174573q.m174574A());
                w0r0 w0r0Var2 = new w0r0();
                w0r0Var2.m204324h(0);
                w0r0Var2.m204328l(w0r0Var.m204322c(), "UCA");
                w0r0Var2.m204327k(w0r0Var.m204317D());
                XMPushService xMPushService = this.f63723a;
                xMPushService.m87516a(new C15000aw(xMPushService, w0r0Var2));
                return;
            }
            if (TextUtils.equals("P", w0r0Var.m204336t())) {
                nzq0 nzq0VarM165392m = nzq0.m165392m(w0r0Var.m204332p());
                w0r0 w0r0Var3 = new w0r0();
                w0r0Var3.m204324h(0);
                w0r0Var3.m204328l(w0r0Var.m204322c(), "PCA");
                w0r0Var3.m204327k(w0r0Var.m204317D());
                nzq0 nzq0Var = new nzq0();
                if (nzq0VarM165392m.m165396n()) {
                    nzq0Var.m165394k(nzq0VarM165392m.m165393j());
                }
                w0r0Var3.m204330n(nzq0Var.m118923h(), null);
                XMPushService xMPushService2 = this.f63723a;
                xMPushService2.m87516a(new C15000aw(xMPushService2, w0r0Var3));
                ouq0.m169393m("ACK msgP: id = " + w0r0Var.m204317D());
                return;
            }
            return;
        }
        String string = Integer.toString(w0r0Var.m204320a());
        if ("SECMSG".equals(w0r0Var.m204322c())) {
            if (!w0r0Var.m204331o()) {
                this.f63723a.m87528b().m87838a(this.f63723a, string, w0r0Var);
                return;
            }
            ouq0.m169393m("Recv SECMSG errCode = " + w0r0Var.m204334r() + " errStr = " + w0r0Var.m204341z());
            return;
        }
        if (!"BIND".equals(strM204322c)) {
            if ("KICK".equals(strM204322c)) {
                lzq0 lzq0VarM156465m = lzq0.m156465m(w0r0Var.m204332p());
                String strM204319F = w0r0Var.m204319F();
                String strM156466j = lzq0VarM156465m.m156466j();
                String strM156470o = lzq0VarM156465m.m156470o();
                ouq0.m169393m("kicked by server, chid=" + string + " res= " + C14990am.b.m87693a(strM204319F) + " type=" + strM156466j + " reason=" + strM156470o);
                if (!"wait".equals(strM156466j)) {
                    this.f63723a.m87520a(string, strM204319F, 3, strM156470o, strM156466j);
                    C14990am.m87676a().m87689a(string, strM204319F);
                    return;
                }
                C14990am.b bVarM87679a = C14990am.m87676a().m87679a(string, strM204319F);
                if (bVarM87679a != null) {
                    this.f63723a.m87519a(bVarM87679a);
                    bVarM87679a.m87704a(C14990am.c.unbind, 3, 0, strM156470o, strM156466j);
                    return;
                }
                return;
            }
            return;
        }
        izq0 izq0VarM142817n = izq0.m142817n(w0r0Var.m204332p());
        String strM204319F2 = w0r0Var.m204319F();
        C14990am.b bVarM87679a2 = C14990am.m87676a().m87679a(string, strM204319F2);
        if (bVarM87679a2 == null) {
            return;
        }
        if (izq0VarM142817n.m142822o()) {
            ouq0.m169393m("SMACK: channel bind succeeded, chid=" + w0r0Var.m204320a());
            bVarM87679a2.m87704a(C14990am.c.binded, 1, 0, (String) null, (String) null);
            return;
        }
        String strM142818j = izq0VarM142817n.m142818j();
        if ("auth".equals(strM142818j)) {
            if ("invalid-sig".equals(izq0VarM142817n.m142823p())) {
                ouq0.m169393m("SMACK: bind error invalid-sig token = " + bVarM87679a2.f63743c + " sec = " + bVarM87679a2.f63748h);
                C14928i.m87417d(0, EnumC14881ei.BIND_INVALID_SIG.m86699a(), 1, null, 0);
            }
            bVarM87679a2.m87704a(C14990am.c.unbind, 1, 5, izq0VarM142817n.m142823p(), strM142818j);
            C14990am.m87676a().m87689a(string, strM204319F2);
        } else if ("cancel".equals(strM142818j)) {
            bVarM87679a2.m87704a(C14990am.c.unbind, 1, 7, izq0VarM142817n.m142823p(), strM142818j);
            C14990am.m87676a().m87689a(string, strM204319F2);
        } else if ("wait".equals(strM142818j)) {
            this.f63723a.m87519a(bVarM87679a2);
            bVarM87679a2.m87704a(C14990am.c.unbind, 1, 7, izq0VarM142817n.m142823p(), strM142818j);
        }
        ouq0.m169393m("SMACK: channel bind failed, chid=" + string + " reason=" + izq0VarM142817n.m142823p());
    }

    /* JADX INFO: renamed from: a */
    public void m87673a(w0r0 w0r0Var) {
        if (5 != w0r0Var.m204320a()) {
            m87671c(w0r0Var);
        }
        try {
            m87674b(w0r0Var);
        } catch (Exception e) {
            ouq0.m169395o("handle Blob chid = " + w0r0Var.m204320a() + " cmd = " + w0r0Var.m204322c() + " packetid = " + w0r0Var.m204317D() + " failure ", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87669a(e2r0 e2r0Var) {
        String strM119163k = e2r0Var.m119163k();
        if (TextUtils.isEmpty(strM119163k)) {
            return;
        }
        String[] strArrSplit = strM119163k.split(Constants.PACKNAME_END);
        swq0 swq0VarM213403a = xwq0.m213395a().m213403a(v1r0.m199051a(), false);
        if (swq0VarM213403a == null || strArrSplit.length <= 0) {
            return;
        }
        swq0VarM213403a.m188348o(strArrSplit);
        this.f63723a.m87515a(20, (Exception) null);
        this.f63723a.m87523a(true);
    }

    /* JADX INFO: renamed from: b */
    private void m87670b(g2r0 g2r0Var) {
        C14990am.b bVarM87679a;
        String strM128651o = g2r0Var.m128651o();
        String strM128649m = g2r0Var.m128649m();
        if (TextUtils.isEmpty(strM128651o) || TextUtils.isEmpty(strM128649m) || (bVarM87679a = C14990am.m87676a().m87679a(strM128649m, strM128651o)) == null) {
            return;
        }
        p2r0.m170392j(this.f63723a, bVarM87679a.f63737a, p2r0.m170384b(g2r0Var.mo86749d()), true, true, System.currentTimeMillis());
    }
}

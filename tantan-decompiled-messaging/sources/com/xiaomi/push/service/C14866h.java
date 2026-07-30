package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14738fq;
import com.xiaomi.push.C14785j;
import java.util.Collection;
import java.util.Iterator;
import p149l.atq0;
import p149l.fvq0;
import p149l.ilq0;
import p149l.qrq0;
import p149l.zsq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.h */
/* JADX INFO: loaded from: classes2.dex */
public class C14866h {

    /* JADX INFO: renamed from: a */
    private C14880u f63045a = new C14880u();

    /* JADX INFO: renamed from: a */
    public void m86667a(XMPushService xMPushService, String str, qrq0 qrq0Var) {
        C14842am.b bVarM86661a = m86661a(qrq0Var);
        if (bVarM86661a == null) {
            ilq0.m137025B("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f63045a.m86819a(xMPushService, qrq0Var, bVarM86661a);
            return;
        }
        String str2 = bVarM86661a.f62890a;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", qrq0Var.m176097q(bVarM86661a.f62901h));
        intent.putExtra(AbstractC14843an.f62927J, bVarM86661a.f62902i);
        intent.putExtra(AbstractC14843an.f62919B, bVarM86661a.f62901h);
        if (AbstractC14863e.m86637a(qrq0Var)) {
            intent.putExtra("ext_downward_pkt_id", qrq0Var.m176080D());
        }
        if (bVarM86661a.f62884a != null) {
            try {
                bVarM86661a.f62884a.send(Message.obtain(null, 17, intent));
                ilq0.m137040m("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                bVarM86661a.f62884a = null;
                String str3 = bVarM86661a.f62894b;
                ilq0.m137040m("peer may died: ".concat(str3.substring(str3.lastIndexOf(64))));
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        ilq0.m137040m(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVarM86661a.f62900g, bVarM86661a.f62890a, qrq0Var.m176080D()));
        if (AbstractC14863e.m86637a(qrq0Var)) {
            C14849at.m86559a().m86562a(qrq0Var.m176080D(), SystemClock.elapsedRealtime());
        }
        m86659a(xMPushService, intent, bVarM86661a);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public void m86665a(Context context, C14842am.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.f62900g)) {
            this.f63045a.m86817a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f62890a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f62900g);
        intent.putExtra(AbstractC14843an.f62954s, bVar.f62894b);
        intent.putExtra(AbstractC14843an.f62927J, bVar.f62902i);
        ilq0.m137040m(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.f62900g, bVar.f62890a, Boolean.valueOf(z), Integer.valueOf(i)));
        m86659a(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public void m86663a(Context context, C14842am.b bVar, int i) {
        if ("5".equalsIgnoreCase(bVar.f62900g)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f62890a);
        intent.putExtra(AbstractC14843an.f62957v, bVar.f62900g);
        intent.putExtra("ext_reason", i);
        intent.putExtra(AbstractC14843an.f62954s, bVar.f62894b);
        intent.putExtra(AbstractC14843an.f62927J, bVar.f62902i);
        if (bVar.f62884a != null && Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(bVar.f62900g)) {
            try {
                bVar.f62884a.send(Message.obtain(null, 17, intent));
                return;
            } catch (RemoteException unused) {
                bVar.f62884a = null;
                String str = bVar.f62894b;
                ilq0.m137040m("peer may died: ".concat(str.substring(str.lastIndexOf(64))));
                return;
            }
        }
        ilq0.m137040m(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.f62900g, bVar.f62890a, Integer.valueOf(i)));
        m86659a(context, intent, bVar);
    }

    /* JADX INFO: renamed from: a */
    public void m86666a(XMPushService xMPushService, String str, atq0 atq0Var) {
        String str2;
        C14842am.b bVarM86660a = m86660a(atq0Var);
        if (bVarM86660a == null) {
            ilq0.m137025B("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f63045a.m86818a(xMPushService, atq0Var, bVarM86660a);
            return;
        }
        String str3 = bVarM86660a.f62890a;
        if (atq0Var instanceof zsq0) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (atq0Var instanceof C14785j) {
            str2 = "com.xiaomi.push.new_iq";
        } else if (atq0Var instanceof C14738fq) {
            str2 = "com.xiaomi.push.new_pres";
        } else {
            ilq0.m137025B("unknown packet type, drop it");
            return;
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", atq0Var.mo85577a());
        intent.putExtra(AbstractC14843an.f62927J, bVarM86660a.f62902i);
        intent.putExtra(AbstractC14843an.f62919B, bVarM86660a.f62901h);
        ilq0.m137040m(String.format("[Bcst] notify packet arrival. %s,%s,%s", bVarM86660a.f62900g, bVarM86660a.f62890a, atq0Var.m98866l()));
        if ("3".equalsIgnoreCase(str)) {
            intent.putExtra(AbstractC14843an.f62958w, atq0Var.f71670j);
            intent.putExtra(AbstractC14843an.f62959x, System.currentTimeMillis());
        }
        m86659a(xMPushService, intent, bVarM86660a);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public void m86662a(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.service_started");
            if (fvq0.m123364r()) {
                intent.addFlags(16777216);
            }
            ilq0.m137040m("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
            intent.setPackage("com.android.mms");
            context.sendBroadcast(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public C14842am.b m86660a(atq0 atq0Var) {
        Collection<C14842am.b> collectionM86510a = C14842am.m86505a().m86510a(atq0Var.m98867m());
        if (collectionM86510a.isEmpty()) {
            return null;
        }
        Iterator<C14842am.b> it = collectionM86510a.iterator();
        if (collectionM86510a.size() == 1) {
            return it.next();
        }
        String strM98871q = atq0Var.m98871q();
        String strM98869o = atq0Var.m98869o();
        while (it.hasNext()) {
            C14842am.b next = it.next();
            if (TextUtils.equals(strM98871q, next.f62894b) || TextUtils.equals(strM98869o, next.f62894b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C14842am.b m86661a(qrq0 qrq0Var) {
        Collection<C14842am.b> collectionM86510a = C14842am.m86505a().m86510a(Integer.toString(qrq0Var.m176083a()));
        if (collectionM86510a.isEmpty()) {
            return null;
        }
        Iterator<C14842am.b> it = collectionM86510a.iterator();
        if (collectionM86510a.size() == 1) {
            return it.next();
        }
        String strM176082F = qrq0Var.m176082F();
        while (it.hasNext()) {
            C14842am.b next = it.next();
            if (TextUtils.equals(strM176082F, next.f62894b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m86664a(Context context, C14842am.b bVar, String str, String str2) {
        if (bVar == null) {
            ilq0.m137025B("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(bVar.f62900g)) {
            ilq0.m137025B("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f62890a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f62900g);
        intent.putExtra(AbstractC14843an.f62954s, bVar.f62894b);
        intent.putExtra(AbstractC14843an.f62927J, bVar.f62902i);
        ilq0.m137040m(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.f62900g, bVar.f62890a, str2));
        m86659a(context, intent, bVar);
    }

    /* JADX INFO: renamed from: a */
    private static void m86659a(Context context, Intent intent, C14842am.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, m86658a(bVar));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m86658a(C14842am.b bVar) {
        boolean zEquals = Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(bVar.f62900g);
        String str = bVar.f62890a;
        if (!zEquals) {
            return str + ".permission.MIPUSH_RECEIVE";
        }
        return str + ".permission.MIMC_RECEIVE";
    }
}

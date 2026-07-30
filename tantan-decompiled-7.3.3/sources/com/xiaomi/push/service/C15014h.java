package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14886fq;
import com.xiaomi.push.C14933j;
import java.util.Collection;
import java.util.Iterator;
import p153l.f2r0;
import p153l.g2r0;
import p153l.l4r0;
import p153l.ouq0;
import p153l.w0r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.h */
/* JADX INFO: loaded from: classes2.dex */
public class C15014h {

    /* JADX INFO: renamed from: a */
    private C15028u f63892a = new C15028u();

    /* JADX INFO: renamed from: a */
    public void m87838a(XMPushService xMPushService, String str, w0r0 w0r0Var) {
        C14990am.b bVarM87832a = m87832a(w0r0Var);
        if (bVarM87832a == null) {
            ouq0.m169378B("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f63892a.m87990a(xMPushService, w0r0Var, bVarM87832a);
            return;
        }
        String str2 = bVarM87832a.f63737a;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", w0r0Var.m204333q(bVarM87832a.f63748h));
        intent.putExtra(AbstractC14991an.f63774J, bVarM87832a.f63749i);
        intent.putExtra(AbstractC14991an.f63766B, bVarM87832a.f63748h);
        if (AbstractC15011e.m87808a(w0r0Var)) {
            intent.putExtra("ext_downward_pkt_id", w0r0Var.m204317D());
        }
        if (bVarM87832a.f63731a != null) {
            try {
                bVarM87832a.f63731a.send(Message.obtain(null, 17, intent));
                ouq0.m169393m("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                bVarM87832a.f63731a = null;
                String str3 = bVarM87832a.f63741b;
                ouq0.m169393m("peer may died: ".concat(str3.substring(str3.lastIndexOf(64))));
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        ouq0.m169393m(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVarM87832a.f63747g, bVarM87832a.f63737a, w0r0Var.m204317D()));
        if (AbstractC15011e.m87808a(w0r0Var)) {
            C14997at.m87730a().m87733a(w0r0Var.m204317D(), SystemClock.elapsedRealtime());
        }
        m87830a(xMPushService, intent, bVarM87832a);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public void m87836a(Context context, C14990am.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.f63747g)) {
            this.f63892a.m87988a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f63737a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f63747g);
        intent.putExtra(AbstractC14991an.f63801s, bVar.f63741b);
        intent.putExtra(AbstractC14991an.f63774J, bVar.f63749i);
        ouq0.m169393m(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.f63747g, bVar.f63737a, Boolean.valueOf(z), Integer.valueOf(i)));
        m87830a(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public void m87834a(Context context, C14990am.b bVar, int i) {
        if ("5".equalsIgnoreCase(bVar.f63747g)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f63737a);
        intent.putExtra(AbstractC14991an.f63804v, bVar.f63747g);
        intent.putExtra("ext_reason", i);
        intent.putExtra(AbstractC14991an.f63801s, bVar.f63741b);
        intent.putExtra(AbstractC14991an.f63774J, bVar.f63749i);
        if (bVar.f63731a != null && Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(bVar.f63747g)) {
            try {
                bVar.f63731a.send(Message.obtain(null, 17, intent));
                return;
            } catch (RemoteException unused) {
                bVar.f63731a = null;
                String str = bVar.f63741b;
                ouq0.m169393m("peer may died: ".concat(str.substring(str.lastIndexOf(64))));
                return;
            }
        }
        ouq0.m169393m(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.f63747g, bVar.f63737a, Integer.valueOf(i)));
        m87830a(context, intent, bVar);
    }

    /* JADX INFO: renamed from: a */
    public void m87837a(XMPushService xMPushService, String str, g2r0 g2r0Var) {
        String str2;
        C14990am.b bVarM87831a = m87831a(g2r0Var);
        if (bVarM87831a == null) {
            ouq0.m169378B("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.f63892a.m87989a(xMPushService, g2r0Var, bVarM87831a);
            return;
        }
        String str3 = bVarM87831a.f63737a;
        if (g2r0Var instanceof f2r0) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (g2r0Var instanceof C14933j) {
            str2 = "com.xiaomi.push.new_iq";
        } else if (g2r0Var instanceof C14886fq) {
            str2 = "com.xiaomi.push.new_pres";
        } else {
            ouq0.m169378B("unknown packet type, drop it");
            return;
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", g2r0Var.mo86748a());
        intent.putExtra(AbstractC14991an.f63774J, bVarM87831a.f63749i);
        intent.putExtra(AbstractC14991an.f63766B, bVarM87831a.f63748h);
        ouq0.m169393m(String.format("[Bcst] notify packet arrival. %s,%s,%s", bVarM87831a.f63747g, bVarM87831a.f63737a, g2r0Var.m128648l()));
        if ("3".equalsIgnoreCase(str)) {
            intent.putExtra(AbstractC14991an.f63805w, g2r0Var.f101883j);
            intent.putExtra(AbstractC14991an.f63806x, System.currentTimeMillis());
        }
        m87830a(xMPushService, intent, bVarM87831a);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a */
    public void m87833a(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.service_started");
            if (l4r0.m152833r()) {
                intent.addFlags(16777216);
            }
            ouq0.m169393m("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
            intent.setPackage("com.android.mms");
            context.sendBroadcast(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public C14990am.b m87831a(g2r0 g2r0Var) {
        Collection<C14990am.b> collectionM87681a = C14990am.m87676a().m87681a(g2r0Var.m128649m());
        if (collectionM87681a.isEmpty()) {
            return null;
        }
        Iterator<C14990am.b> it = collectionM87681a.iterator();
        if (collectionM87681a.size() == 1) {
            return it.next();
        }
        String strM128653q = g2r0Var.m128653q();
        String strM128651o = g2r0Var.m128651o();
        while (it.hasNext()) {
            C14990am.b next = it.next();
            if (TextUtils.equals(strM128653q, next.f63741b) || TextUtils.equals(strM128651o, next.f63741b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C14990am.b m87832a(w0r0 w0r0Var) {
        Collection<C14990am.b> collectionM87681a = C14990am.m87676a().m87681a(Integer.toString(w0r0Var.m204320a()));
        if (collectionM87681a.isEmpty()) {
            return null;
        }
        Iterator<C14990am.b> it = collectionM87681a.iterator();
        if (collectionM87681a.size() == 1) {
            return it.next();
        }
        String strM204319F = w0r0Var.m204319F();
        while (it.hasNext()) {
            C14990am.b next = it.next();
            if (TextUtils.equals(strM204319F, next.f63741b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m87835a(Context context, C14990am.b bVar, String str, String str2) {
        if (bVar == null) {
            ouq0.m169378B("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(bVar.f63747g)) {
            ouq0.m169378B("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f63737a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f63747g);
        intent.putExtra(AbstractC14991an.f63801s, bVar.f63741b);
        intent.putExtra(AbstractC14991an.f63774J, bVar.f63749i);
        ouq0.m169393m(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.f63747g, bVar.f63737a, str2));
        m87830a(context, intent, bVar);
    }

    /* JADX INFO: renamed from: a */
    private static void m87830a(Context context, Intent intent, C14990am.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, m87829a(bVar));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m87829a(C14990am.b bVar) {
        boolean zEquals = Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(bVar.f63747g);
        String str = bVar.f63737a;
        if (!zEquals) {
            return str + ".permission.MIPUSH_RECEIVE";
        }
        return str + ".permission.MIMC_RECEIVE";
    }
}

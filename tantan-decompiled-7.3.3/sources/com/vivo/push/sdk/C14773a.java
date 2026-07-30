package com.vivo.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.vivo.push.AbstractC14771q;
import com.vivo.push.C14756e;
import com.vivo.push.p116b.C14706x;
import com.vivo.push.p117c.C14713d;
import com.vivo.push.util.C14780a;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14799t;
import com.vivo.push.util.C14800u;
import com.vivo.push.util.C14805z;
import com.vivo.push.util.ContextDelegate;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.sdk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14773a extends AbstractC14771q {

    /* JADX INFO: renamed from: c */
    private static C14773a f61928c;

    /* JADX INFO: renamed from: e */
    private static final List<Integer> f61929e = Arrays.asList(3);

    /* JADX INFO: renamed from: d */
    private String f61930d;

    /* JADX INFO: renamed from: f */
    private String f61931f = "";

    private C14773a() {
    }

    /* JADX INFO: renamed from: a */
    private static String m86113a(Context context, String str, String str2) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || listQueryBroadcastReceivers.size() <= 0) {
                    return null;
                }
                return listQueryBroadcastReceivers.get(0).activityInfo.name;
            } catch (Exception e) {
                C14795p.m86179a("CommandWorker", "error  " + e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private boolean m86115c(Intent intent) {
        String strM86236c = C14805z.m86236c(this.f61919a, "com.vivo.pushservice");
        C14795p.m86192d("CommandWorker", " 配置的验签参数 = ".concat(String.valueOf(strM86236c)));
        if (!TextUtils.equals(strM86236c, "1")) {
            return true;
        }
        String stringExtra = intent.getStringExtra("security_avoid_pull_rsa");
        String stringExtra2 = intent.getStringExtra("security_avoid_rsa_public_key");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            C14795p.m86179a("CommandWorker", "!decrypt.equals, so securityContent == " + stringExtra + " or publickKey isempty ");
            return false;
        }
        try {
            if (C14713d.m85964a(this.f61919a).m85965a().mo85963a("com.vivo.pushservice".getBytes("UTF-8"), C14800u.m86214a(stringExtra2), Base64.decode(stringExtra, 2))) {
                C14795p.m86192d("CommandWorker", " RSA验签通过  ");
                return true;
            }
        } catch (Exception e) {
            C14795p.m86179a("CommandWorker", "checkIntentIsSecurity Exception: " + e.getMessage());
        }
        C14795p.m86192d("CommandWorker", " RSA验签 不通过  ");
        return false;
    }

    /* JADX INFO: renamed from: d */
    private int m86116d(Intent intent) {
        if (!TextUtils.isEmpty(this.f61931f) && this.f61931f.contains("CommandService") && (intent == null || !m86114b(intent) || !m86115c(intent))) {
            C14795p.m86179a("CommandWorker", " !checkIntentIsSecurity(intent)");
            return 2151;
        }
        String packageName = this.f61919a.getPackageName();
        try {
            String stringExtra = intent.getStringExtra("command_type");
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                int intExtra = intent.getIntExtra(CommandMessage.COMMAND, -1);
                if (intExtra < 0) {
                    intExtra = intent.getIntExtra(FirebaseAnalytics.Param.METHOD, -1);
                }
                if (f61929e.contains(Integer.valueOf(intExtra)) && C14799t.m86206c(this.f61919a, packageName) && !C14799t.m86205c(this.f61919a)) {
                    C14795p.m86179a("CommandWorker", "METHOD_ON_MESSAGE is not support");
                    return 2153;
                }
                String action = intent.getAction();
                if (!TextUtils.isEmpty(this.f61930d)) {
                    return 0;
                }
                String strM86113a = m86113a(this.f61919a, packageName, action);
                this.f61930d = strM86113a;
                if (!TextUtils.isEmpty(strM86113a)) {
                    return 0;
                }
                C14795p.m86192d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                intent.setPackage(packageName);
                this.f61919a.sendBroadcast(intent);
                return 2152;
            }
            C14795p.m86179a("CommandWorker", "commandTypeStr is not satisfy == ".concat(String.valueOf(stringExtra)));
            return 2151;
        } catch (Exception e) {
            C14795p.m86181a("CommandWorker", e);
            return 0;
        }
    }

    @Override // com.vivo.push.AbstractC14771q
    /* JADX INFO: renamed from: b */
    public final void mo86110b(Message message) {
        Context context;
        Intent intent = (Intent) message.obj;
        if (intent == null || (context = this.f61919a) == null) {
            C14795p.m86192d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f61919a);
            return;
        }
        String packageName = context.getPackageName();
        int iM86116d = m86116d(intent);
        if (iM86116d <= 0) {
            try {
                Class<?> cls = Class.forName(this.f61930d);
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                Method method = cls.getMethod("onReceive", Context.class, Intent.class);
                intent.setClassName(packageName, this.f61930d);
                method.invoke(objNewInstance, ContextDelegate.getContext(this.f61919a).getApplicationContext(), intent);
                return;
            } catch (Exception e) {
                C14795p.m86187b("CommandWorker", "reflect e: ", e);
                return;
            }
        }
        C14706x c14706x = new C14706x(iM86116d);
        HashMap<String, String> map = new HashMap<>();
        Bundle extras = intent.getExtras();
        map.put(com.heytap.mcssdk.mode.Message.MESSAGE_ID, String.valueOf(extras != null ? extras.getLong("notify_id", 404000044642424832L) : 404000044642424832L));
        String strM86232b = C14805z.m86232b(this.f61919a, packageName);
        if (!TextUtils.isEmpty(strM86232b)) {
            map.put("remoteAppId", strM86232b);
        }
        c14706x.m85955a(map);
        C14756e.m86032a().m86049a(c14706x);
    }

    /* JADX INFO: renamed from: a */
    public final void m86118a(String str) {
        this.f61931f = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m86117a(Intent intent) {
        if (intent != null && this.f61919a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            m86109a(messageObtain);
        } else {
            C14795p.m86192d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f61919a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14773a m86112a() {
        try {
            if (f61928c == null) {
                f61928c = new C14773a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61928c;
    }

    /* JADX INFO: renamed from: b */
    public final void m86119b() {
        this.f61930d = null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m86114b(Intent intent) {
        String stringExtra = intent.getStringExtra("security_avoid_pull");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                String strM86127b = C14780a.m86123a(this.f61919a).m86127b(stringExtra);
                if ("com.vivo.pushservice".equals(strM86127b)) {
                    return true;
                }
                C14795p.m86179a("CommandWorker", "!decrypt.equals, so decrypt == ".concat(String.valueOf(strM86127b)));
                return false;
            } catch (Exception e) {
                C14795p.m86179a("CommandWorker", "checkIntentIsSecurity Exception: " + e.getMessage());
                return false;
            }
        }
        C14795p.m86179a("CommandWorker", "checkIntentIsSecurityTextUtils.isEmpty");
        return true;
    }
}

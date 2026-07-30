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
import com.vivo.push.AbstractC14623q;
import com.vivo.push.C14608e;
import com.vivo.push.p111b.C14558x;
import com.vivo.push.p112c.C14565d;
import com.vivo.push.util.C14632a;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14651t;
import com.vivo.push.util.C14652u;
import com.vivo.push.util.C14657z;
import com.vivo.push.util.ContextDelegate;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.sdk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14625a extends AbstractC14623q {

    /* JADX INFO: renamed from: c */
    private static C14625a f61081c;

    /* JADX INFO: renamed from: e */
    private static final List<Integer> f61082e = Arrays.asList(3);

    /* JADX INFO: renamed from: d */
    private String f61083d;

    /* JADX INFO: renamed from: f */
    private String f61084f = "";

    private C14625a() {
    }

    /* JADX INFO: renamed from: a */
    private static String m84942a(Context context, String str, String str2) {
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
                C14647p.m85008a("CommandWorker", "error  " + e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private boolean m84944c(Intent intent) {
        String strM85065c = C14657z.m85065c(this.f61072a, "com.vivo.pushservice");
        C14647p.m85021d("CommandWorker", " 配置的验签参数 = ".concat(String.valueOf(strM85065c)));
        if (!TextUtils.equals(strM85065c, "1")) {
            return true;
        }
        String stringExtra = intent.getStringExtra("security_avoid_pull_rsa");
        String stringExtra2 = intent.getStringExtra("security_avoid_rsa_public_key");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            C14647p.m85008a("CommandWorker", "!decrypt.equals, so securityContent == " + stringExtra + " or publickKey isempty ");
            return false;
        }
        try {
            if (C14565d.m84793a(this.f61072a).m84794a().mo84792a("com.vivo.pushservice".getBytes("UTF-8"), C14652u.m85043a(stringExtra2), Base64.decode(stringExtra, 2))) {
                C14647p.m85021d("CommandWorker", " RSA验签通过  ");
                return true;
            }
        } catch (Exception e) {
            C14647p.m85008a("CommandWorker", "checkIntentIsSecurity Exception: " + e.getMessage());
        }
        C14647p.m85021d("CommandWorker", " RSA验签 不通过  ");
        return false;
    }

    /* JADX INFO: renamed from: d */
    private int m84945d(Intent intent) {
        if (!TextUtils.isEmpty(this.f61084f) && this.f61084f.contains("CommandService") && (intent == null || !m84943b(intent) || !m84944c(intent))) {
            C14647p.m85008a("CommandWorker", " !checkIntentIsSecurity(intent)");
            return 2151;
        }
        String packageName = this.f61072a.getPackageName();
        try {
            String stringExtra = intent.getStringExtra("command_type");
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                int intExtra = intent.getIntExtra(CommandMessage.COMMAND, -1);
                if (intExtra < 0) {
                    intExtra = intent.getIntExtra(FirebaseAnalytics.Param.METHOD, -1);
                }
                if (f61082e.contains(Integer.valueOf(intExtra)) && C14651t.m85035c(this.f61072a, packageName) && !C14651t.m85034c(this.f61072a)) {
                    C14647p.m85008a("CommandWorker", "METHOD_ON_MESSAGE is not support");
                    return 2153;
                }
                String action = intent.getAction();
                if (!TextUtils.isEmpty(this.f61083d)) {
                    return 0;
                }
                String strM84942a = m84942a(this.f61072a, packageName, action);
                this.f61083d = strM84942a;
                if (!TextUtils.isEmpty(strM84942a)) {
                    return 0;
                }
                C14647p.m85021d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                intent.setPackage(packageName);
                this.f61072a.sendBroadcast(intent);
                return 2152;
            }
            C14647p.m85008a("CommandWorker", "commandTypeStr is not satisfy == ".concat(String.valueOf(stringExtra)));
            return 2151;
        } catch (Exception e) {
            C14647p.m85010a("CommandWorker", e);
            return 0;
        }
    }

    @Override // com.vivo.push.AbstractC14623q
    /* JADX INFO: renamed from: b */
    public final void mo84939b(Message message) {
        Context context;
        Intent intent = (Intent) message.obj;
        if (intent == null || (context = this.f61072a) == null) {
            C14647p.m85021d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f61072a);
            return;
        }
        String packageName = context.getPackageName();
        int iM84945d = m84945d(intent);
        if (iM84945d <= 0) {
            try {
                Class<?> cls = Class.forName(this.f61083d);
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                Method method = cls.getMethod("onReceive", Context.class, Intent.class);
                intent.setClassName(packageName, this.f61083d);
                method.invoke(objNewInstance, ContextDelegate.getContext(this.f61072a).getApplicationContext(), intent);
                return;
            } catch (Exception e) {
                C14647p.m85016b("CommandWorker", "reflect e: ", e);
                return;
            }
        }
        C14558x c14558x = new C14558x(iM84945d);
        HashMap<String, String> map = new HashMap<>();
        Bundle extras = intent.getExtras();
        map.put(com.heytap.mcssdk.mode.Message.MESSAGE_ID, String.valueOf(extras != null ? extras.getLong("notify_id", 404000044642424832L) : 404000044642424832L));
        String strM85061b = C14657z.m85061b(this.f61072a, packageName);
        if (!TextUtils.isEmpty(strM85061b)) {
            map.put("remoteAppId", strM85061b);
        }
        c14558x.m84784a(map);
        C14608e.m84861a().m84878a(c14558x);
    }

    /* JADX INFO: renamed from: a */
    public final void m84947a(String str) {
        this.f61084f = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m84946a(Intent intent) {
        if (intent != null && this.f61072a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            m84938a(messageObtain);
        } else {
            C14647p.m85021d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f61072a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14625a m84941a() {
        try {
            if (f61081c == null) {
                f61081c = new C14625a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f61081c;
    }

    /* JADX INFO: renamed from: b */
    public final void m84948b() {
        this.f61083d = null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m84943b(Intent intent) {
        String stringExtra = intent.getStringExtra("security_avoid_pull");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                String strM84956b = C14632a.m84952a(this.f61072a).m84956b(stringExtra);
                if ("com.vivo.pushservice".equals(strM84956b)) {
                    return true;
                }
                C14647p.m85008a("CommandWorker", "!decrypt.equals, so decrypt == ".concat(String.valueOf(strM84956b)));
                return false;
            } catch (Exception e) {
                C14647p.m85008a("CommandWorker", "checkIntentIsSecurity Exception: " + e.getMessage());
                return false;
            }
        }
        C14647p.m85008a("CommandWorker", "checkIntentIsSecurityTextUtils.isEmpty");
        return true;
    }
}

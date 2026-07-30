package com.xiaomi.push.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14738fq;
import com.xiaomi.push.C14785j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import p149l.fvq0;
import p149l.gkq0;
import p149l.gxq0;
import p149l.htq0;
import p149l.ilq0;
import p149l.nwq0;
import p149l.sqq0;
import p149l.ysq0;
import p149l.zsq0;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceClient {

    /* JADX INFO: renamed from: a */
    private static ServiceClient f62738a;

    /* JADX INFO: renamed from: a */
    private static String f62739a;

    /* JADX INFO: renamed from: a */
    private Context f62742a;

    /* JADX INFO: renamed from: a */
    private boolean f62745a;

    /* JADX INFO: renamed from: b */
    private Messenger f62746b;

    /* JADX INFO: renamed from: b */
    private static String f62740b = htq0.m132932a(5) + "-";

    /* JADX INFO: renamed from: a */
    private static long f62737a = 0;

    /* JADX INFO: renamed from: a */
    private Messenger f62743a = null;

    /* JADX INFO: renamed from: a */
    private final BroadcastReceiver f62741a = new BroadcastReceiver() { // from class: com.xiaomi.push.service.ServiceClient.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            gkq0.m126689r();
        }
    };

    /* JADX INFO: renamed from: a */
    private List<Message> f62744a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private boolean f62747b = false;

    private ServiceClient(Context context) {
        this.f62745a = false;
        Context applicationContext = context.getApplicationContext();
        this.f62742a = applicationContext;
        nwq0.m161882e(applicationContext);
        m86289a(this.f62742a);
        if (m86292a()) {
            ilq0.m137053z("use miui push service");
            this.f62745a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86291a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(AbstractC14843an.f62954s, str);
        intent.putExtra(AbstractC14843an.f62957v, str2);
        intent.putExtra(AbstractC14843an.f62961z, str3);
        intent.putExtra(AbstractC14843an.f62919B, str5);
        intent.putExtra(AbstractC14843an.f62918A, str4);
        intent.putExtra(AbstractC14843an.f62920C, z);
        intent.putExtra(AbstractC14843an.f62927J, f62739a);
        intent.putExtra(AbstractC14843an.f62931N, this.f62743a);
        if (map != null && map.size() > 0) {
            String strM86285a = m86285a(map);
            if (!TextUtils.isEmpty(strM86285a)) {
                intent.putExtra(AbstractC14843an.f62921D, strM86285a);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String strM86285a2 = m86285a(map2);
        if (TextUtils.isEmpty(strM86285a2)) {
            return;
        }
        intent.putExtra(AbstractC14843an.f62922E, strM86285a2);
    }

    /* JADX INFO: renamed from: b */
    private void m86294b() {
        this.f62742a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f62742a, (Class<?>) XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (f62738a == null) {
            f62738a = new ServiceClient(context);
        }
        return f62738a;
    }

    public static String getSession() {
        return f62739a;
    }

    public static void setSession(String str) {
        f62739a = str;
    }

    public boolean batchSendMessage(zsq0[] zsq0VarArr, boolean z) {
        if (!gkq0.m126691t(this.f62742a)) {
            return false;
        }
        Intent intentM86280a = m86280a();
        int length = zsq0VarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < zsq0VarArr.length; i++) {
            String strM185610a = sqq0.m185610a();
            if (!TextUtils.isEmpty(strM185610a)) {
                ysq0 ysq0Var = new ysq0(Constants.PARAM_PLATFORM_ID, null, null, null);
                ysq0 ysq0Var2 = new ysq0("sent", null, null, null);
                ysq0Var2.m215925f(strM185610a);
                ysq0Var.m215926g(ysq0Var2);
                zsq0VarArr[i].m98864i(ysq0Var);
            }
            ilq0.m137053z("SEND:" + zsq0VarArr[i].mo85578d());
            bundleArr[i] = zsq0VarArr[i].mo85577a();
        }
        if (length <= 0) {
            return false;
        }
        intentM86280a.setAction(AbstractC14843an.f62942g);
        intentM86280a.putExtra(AbstractC14843an.f62927J, f62739a);
        intentM86280a.putExtra("ext_packets", bundleArr);
        intentM86280a.putExtra("ext_encrypt", z);
        return startServiceSafely(intentM86280a);
    }

    public void checkAlive() {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(intentM86280a);
    }

    public boolean closeChannel(String str, String str2) {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62944i);
        intentM86280a.putExtra(AbstractC14843an.f62957v, str);
        intentM86280a.putExtra(AbstractC14843an.f62954s, str2);
        return startServiceSafely(intentM86280a);
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62945j);
        m86291a(intentM86280a, str, str2, str3, str4, str5, z, map, map2);
        return startServiceSafely(intentM86280a);
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f62745a;
    }

    public boolean notifyMessage(Bundle bundle, String str, String str2) {
        if (bundle == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ilq0.m137040m("Failed to notify message: bundle|userId|chid may be empty");
            return false;
        }
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62950o);
        intentM86280a.putExtras(bundle);
        ilq0.m137027D("notify: chid=" + str2 + " bundle:" + bundle);
        return startServiceSafely(intentM86280a);
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z) {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62939d);
        m86291a(intentM86280a, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(intentM86280a);
        return 0;
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62946k);
        m86291a(intentM86280a, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(intentM86280a);
    }

    public boolean sendIQ(C14785j c14785j) {
        if (!gkq0.m126691t(this.f62742a)) {
            return false;
        }
        Intent intentM86280a = m86280a();
        Bundle bundleMo85577a = c14785j.mo85577a();
        if (bundleMo85577a == null) {
            return false;
        }
        ilq0.m137053z("SEND:" + c14785j.mo85578d());
        intentM86280a.setAction(AbstractC14843an.f62941f);
        intentM86280a.putExtra(AbstractC14843an.f62927J, f62739a);
        intentM86280a.putExtra("ext_packet", bundleMo85577a);
        return startServiceSafely(intentM86280a);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String strSubstring;
        if (!gkq0.m126691t(this.f62742a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ilq0.m137040m("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62940e);
        intentM86280a.putExtra(AbstractC14843an.f62927J, f62739a);
        intentM86280a.putExtra("ext_raw_packet", bArr);
        int iIndexOf = str.indexOf("@");
        String strSubstring2 = null;
        String strSubstring3 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iIndexOf + 1, iLastIndexOf);
            strSubstring = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = null;
        }
        intentM86280a.putExtra(AbstractC14843an.f62954s, strSubstring3);
        intentM86280a.putExtra(AbstractC14843an.f62955t, strSubstring2);
        intentM86280a.putExtra(AbstractC14843an.f62956u, strSubstring);
        StringBuilder sb = new StringBuilder();
        sb.append(f62740b);
        long j = f62737a;
        f62737a = 1 + j;
        sb.append(j);
        String string = sb.toString();
        intentM86280a.putExtra("ext_pkt_id", string);
        intentM86280a.putExtra("ext_chid", str2);
        ilq0.m137027D("SEND: chid=" + str2 + ", packetId=" + string);
        return startServiceSafely(intentM86280a);
    }

    public boolean sendPresence(C14738fq c14738fq) {
        if (!gkq0.m126691t(this.f62742a)) {
            return false;
        }
        Intent intentM86280a = m86280a();
        Bundle bundleMo85577a = c14738fq.mo85577a();
        if (bundleMo85577a == null) {
            return false;
        }
        ilq0.m137053z("SEND:" + c14738fq.mo85578d());
        intentM86280a.setAction(AbstractC14843an.f62943h);
        intentM86280a.putExtra(AbstractC14843an.f62927J, f62739a);
        intentM86280a.putExtra("ext_packet", bundleMo85577a);
        return startServiceSafely(intentM86280a);
    }

    public void setMessenger(Messenger messenger) {
        this.f62743a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (fvq0.m123355i() || Build.VERSION.SDK_INT < 26) {
                this.f62742a.startService(intent);
                return true;
            }
            m86290a(intent);
            return true;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62947l);
        if (map != null) {
            String strM86285a = m86285a(map);
            if (!TextUtils.isEmpty(strM86285a)) {
                intentM86280a.putExtra(AbstractC14843an.f62921D, strM86285a);
            }
        }
        if (map2 != null) {
            String strM86285a2 = m86285a(map2);
            if (!TextUtils.isEmpty(strM86285a2)) {
                intentM86280a.putExtra(AbstractC14843an.f62922E, strM86285a2);
            }
        }
        intentM86280a.putExtra(AbstractC14843an.f62957v, str);
        startServiceSafely(intentM86280a);
    }

    public boolean closeChannel(String str) {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62944i);
        intentM86280a.putExtra(AbstractC14843an.f62957v, str);
        return startServiceSafely(intentM86280a);
    }

    public boolean closeChannel() {
        Intent intentM86280a = m86280a();
        intentM86280a.setAction(AbstractC14843an.f62944i);
        return startServiceSafely(intentM86280a);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        resetConnection(str, str2, str3, str4, str5, z, m86287a(list), m86287a(list2));
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z, m86287a(list), m86287a(list2));
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return openChannel(str, str2, str3, str4, str5, m86287a(list), m86287a(list2), z);
    }

    @Deprecated
    public void updateChannelInfo(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        updateChannelInfo(str, m86287a(list), m86287a(list2));
    }

    /* JADX INFO: renamed from: a */
    private void m86289a(Context context) {
        try {
            gkq0.m126675d(context);
        } catch (Throwable th) {
            ilq0.m137040m("add network status listener failed:" + th);
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m86287a(List<NameValuePair> list) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                if (nameValuePair != null) {
                    map.put(nameValuePair.getName(), nameValuePair.getValue());
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private String m86285a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            if (i < map.size()) {
                sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private boolean m86292a() {
        if (gxq0.f104916b) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f62742a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m86284a() {
        try {
            if (this.f62742a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                return "com.xiaomi.push.service.XMPushService";
            }
            return "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    /* JADX INFO: renamed from: a */
    private Intent m86280a() {
        if (isMiuiPushServiceEnabled()) {
            Intent intent = new Intent();
            intent.setPackage("com.xiaomi.xmsf");
            intent.setClassName("com.xiaomi.xmsf", m86284a());
            intent.putExtra(AbstractC14843an.f62923F, this.f62742a.getPackageName());
            m86288a();
            return intent;
        }
        Intent intent2 = new Intent(this.f62742a, (Class<?>) XMPushService.class);
        intent2.putExtra(AbstractC14843an.f62923F, this.f62742a.getPackageName());
        m86294b();
        return intent2;
    }

    /* JADX INFO: renamed from: a */
    private void m86288a() {
        this.f62742a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f62742a, (Class<?>) XMPushService.class), 2, 1);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m86290a(Intent intent) {
        try {
            if (this.f62747b) {
                Message messageM86281a = m86281a(intent);
                if (this.f62744a.size() >= 50) {
                    this.f62744a.remove(0);
                }
                this.f62744a.add(messageM86281a);
                return;
            }
            if (this.f62746b == null) {
                this.f62742a.bindService(intent, new ServiceConnection() { // from class: com.xiaomi.push.service.ServiceClient.2
                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        synchronized (ServiceClient.this) {
                            ServiceClient.this.f62746b = new Messenger(iBinder);
                            ServiceClient.this.f62747b = false;
                            Iterator it = ServiceClient.this.f62744a.iterator();
                            while (it.hasNext()) {
                                try {
                                    ServiceClient.this.f62746b.send((Message) it.next());
                                } catch (RemoteException e) {
                                    ilq0.m137044q(e);
                                }
                            }
                            ServiceClient.this.f62744a.clear();
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                        ServiceClient.this.f62746b = null;
                        ServiceClient.this.f62747b = false;
                    }
                }, 1);
                this.f62747b = true;
                this.f62744a.clear();
                this.f62744a.add(m86281a(intent));
            } else {
                try {
                    this.f62746b.send(m86281a(intent));
                } catch (RemoteException unused) {
                    this.f62746b = null;
                    this.f62747b = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private Message m86281a(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    public boolean sendMessage(zsq0 zsq0Var, boolean z) {
        if (!gkq0.m126691t(this.f62742a)) {
            return false;
        }
        Intent intentM86280a = m86280a();
        String strM185610a = sqq0.m185610a();
        if (!TextUtils.isEmpty(strM185610a)) {
            ysq0 ysq0Var = new ysq0(Constants.PARAM_PLATFORM_ID, null, null, null);
            ysq0 ysq0Var2 = new ysq0("sent", null, null, null);
            ysq0Var2.m215925f(strM185610a);
            ysq0Var.m215926g(ysq0Var2);
            zsq0Var.m98864i(ysq0Var);
        }
        Bundle bundleMo85577a = zsq0Var.mo85577a();
        if (bundleMo85577a == null) {
            return false;
        }
        ilq0.m137053z("SEND:" + zsq0Var.mo85578d());
        intentM86280a.setAction(AbstractC14843an.f62940e);
        intentM86280a.putExtra(AbstractC14843an.f62927J, f62739a);
        intentM86280a.putExtra("ext_packet", bundleMo85577a);
        intentM86280a.putExtra("ext_encrypt", z);
        return startServiceSafely(intentM86280a);
    }
}

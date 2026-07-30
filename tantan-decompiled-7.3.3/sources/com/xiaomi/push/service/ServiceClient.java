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
import com.xiaomi.push.C14886fq;
import com.xiaomi.push.C14933j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import p153l.e2r0;
import p153l.f2r0;
import p153l.l4r0;
import p153l.m6r0;
import p153l.mtq0;
import p153l.n2r0;
import p153l.ouq0;
import p153l.t5r0;
import p153l.yzq0;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceClient {

    /* JADX INFO: renamed from: a */
    private static ServiceClient f63585a;

    /* JADX INFO: renamed from: a */
    private static String f63586a;

    /* JADX INFO: renamed from: a */
    private Context f63589a;

    /* JADX INFO: renamed from: a */
    private boolean f63592a;

    /* JADX INFO: renamed from: b */
    private Messenger f63593b;

    /* JADX INFO: renamed from: b */
    private static String f63587b = n2r0.m161248a(5) + "-";

    /* JADX INFO: renamed from: a */
    private static long f63584a = 0;

    /* JADX INFO: renamed from: a */
    private Messenger f63590a = null;

    /* JADX INFO: renamed from: a */
    private final BroadcastReceiver f63588a = new BroadcastReceiver() { // from class: com.xiaomi.push.service.ServiceClient.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            mtq0.m160042r();
        }
    };

    /* JADX INFO: renamed from: a */
    private List<Message> f63591a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private boolean f63594b = false;

    private ServiceClient(Context context) {
        this.f63592a = false;
        Context applicationContext = context.getApplicationContext();
        this.f63589a = applicationContext;
        t5r0.m189421e(applicationContext);
        m87460a(this.f63589a);
        if (m87463a()) {
            ouq0.m169406z("use miui push service");
            this.f63592a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87462a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(AbstractC14991an.f63801s, str);
        intent.putExtra(AbstractC14991an.f63804v, str2);
        intent.putExtra(AbstractC14991an.f63808z, str3);
        intent.putExtra(AbstractC14991an.f63766B, str5);
        intent.putExtra(AbstractC14991an.f63765A, str4);
        intent.putExtra(AbstractC14991an.f63767C, z);
        intent.putExtra(AbstractC14991an.f63774J, f63586a);
        intent.putExtra(AbstractC14991an.f63778N, this.f63590a);
        if (map != null && map.size() > 0) {
            String strM87456a = m87456a(map);
            if (!TextUtils.isEmpty(strM87456a)) {
                intent.putExtra(AbstractC14991an.f63768D, strM87456a);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String strM87456a2 = m87456a(map2);
        if (TextUtils.isEmpty(strM87456a2)) {
            return;
        }
        intent.putExtra(AbstractC14991an.f63769E, strM87456a2);
    }

    /* JADX INFO: renamed from: b */
    private void m87465b() {
        this.f63589a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f63589a, (Class<?>) XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (f63585a == null) {
            f63585a = new ServiceClient(context);
        }
        return f63585a;
    }

    public static String getSession() {
        return f63586a;
    }

    public static void setSession(String str) {
        f63586a = str;
    }

    public boolean batchSendMessage(f2r0[] f2r0VarArr, boolean z) {
        if (!mtq0.m160044t(this.f63589a)) {
            return false;
        }
        Intent intentM87451a = m87451a();
        int length = f2r0VarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < f2r0VarArr.length; i++) {
            String strM218026a = yzq0.m218026a();
            if (!TextUtils.isEmpty(strM218026a)) {
                e2r0 e2r0Var = new e2r0(Constants.PARAM_PLATFORM_ID, null, null, null);
                e2r0 e2r0Var2 = new e2r0("sent", null, null, null);
                e2r0Var2.m119160f(strM218026a);
                e2r0Var.m119161g(e2r0Var2);
                f2r0VarArr[i].m128646i(e2r0Var);
            }
            ouq0.m169406z("SEND:" + f2r0VarArr[i].mo86749d());
            bundleArr[i] = f2r0VarArr[i].mo86748a();
        }
        if (length <= 0) {
            return false;
        }
        intentM87451a.setAction(AbstractC14991an.f63789g);
        intentM87451a.putExtra(AbstractC14991an.f63774J, f63586a);
        intentM87451a.putExtra("ext_packets", bundleArr);
        intentM87451a.putExtra("ext_encrypt", z);
        return startServiceSafely(intentM87451a);
    }

    public void checkAlive() {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(intentM87451a);
    }

    public boolean closeChannel(String str, String str2) {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63791i);
        intentM87451a.putExtra(AbstractC14991an.f63804v, str);
        intentM87451a.putExtra(AbstractC14991an.f63801s, str2);
        return startServiceSafely(intentM87451a);
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63792j);
        m87462a(intentM87451a, str, str2, str3, str4, str5, z, map, map2);
        return startServiceSafely(intentM87451a);
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f63592a;
    }

    public boolean notifyMessage(Bundle bundle, String str, String str2) {
        if (bundle == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ouq0.m169393m("Failed to notify message: bundle|userId|chid may be empty");
            return false;
        }
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63797o);
        intentM87451a.putExtras(bundle);
        ouq0.m169380D("notify: chid=" + str2 + " bundle:" + bundle);
        return startServiceSafely(intentM87451a);
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z) {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63786d);
        m87462a(intentM87451a, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(intentM87451a);
        return 0;
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63793k);
        m87462a(intentM87451a, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(intentM87451a);
    }

    public boolean sendIQ(C14933j c14933j) {
        if (!mtq0.m160044t(this.f63589a)) {
            return false;
        }
        Intent intentM87451a = m87451a();
        Bundle bundleMo86748a = c14933j.mo86748a();
        if (bundleMo86748a == null) {
            return false;
        }
        ouq0.m169406z("SEND:" + c14933j.mo86749d());
        intentM87451a.setAction(AbstractC14991an.f63788f);
        intentM87451a.putExtra(AbstractC14991an.f63774J, f63586a);
        intentM87451a.putExtra("ext_packet", bundleMo86748a);
        return startServiceSafely(intentM87451a);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String strSubstring;
        if (!mtq0.m160044t(this.f63589a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ouq0.m169393m("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63787e);
        intentM87451a.putExtra(AbstractC14991an.f63774J, f63586a);
        intentM87451a.putExtra("ext_raw_packet", bArr);
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
        intentM87451a.putExtra(AbstractC14991an.f63801s, strSubstring3);
        intentM87451a.putExtra(AbstractC14991an.f63802t, strSubstring2);
        intentM87451a.putExtra(AbstractC14991an.f63803u, strSubstring);
        StringBuilder sb = new StringBuilder();
        sb.append(f63587b);
        long j = f63584a;
        f63584a = 1 + j;
        sb.append(j);
        String string = sb.toString();
        intentM87451a.putExtra("ext_pkt_id", string);
        intentM87451a.putExtra("ext_chid", str2);
        ouq0.m169380D("SEND: chid=" + str2 + ", packetId=" + string);
        return startServiceSafely(intentM87451a);
    }

    public boolean sendPresence(C14886fq c14886fq) {
        if (!mtq0.m160044t(this.f63589a)) {
            return false;
        }
        Intent intentM87451a = m87451a();
        Bundle bundleMo86748a = c14886fq.mo86748a();
        if (bundleMo86748a == null) {
            return false;
        }
        ouq0.m169406z("SEND:" + c14886fq.mo86749d());
        intentM87451a.setAction(AbstractC14991an.f63790h);
        intentM87451a.putExtra(AbstractC14991an.f63774J, f63586a);
        intentM87451a.putExtra("ext_packet", bundleMo86748a);
        return startServiceSafely(intentM87451a);
    }

    public void setMessenger(Messenger messenger) {
        this.f63590a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (l4r0.m152824i() || Build.VERSION.SDK_INT < 26) {
                this.f63589a.startService(intent);
                return true;
            }
            m87461a(intent);
            return true;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63794l);
        if (map != null) {
            String strM87456a = m87456a(map);
            if (!TextUtils.isEmpty(strM87456a)) {
                intentM87451a.putExtra(AbstractC14991an.f63768D, strM87456a);
            }
        }
        if (map2 != null) {
            String strM87456a2 = m87456a(map2);
            if (!TextUtils.isEmpty(strM87456a2)) {
                intentM87451a.putExtra(AbstractC14991an.f63769E, strM87456a2);
            }
        }
        intentM87451a.putExtra(AbstractC14991an.f63804v, str);
        startServiceSafely(intentM87451a);
    }

    public boolean closeChannel(String str) {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63791i);
        intentM87451a.putExtra(AbstractC14991an.f63804v, str);
        return startServiceSafely(intentM87451a);
    }

    public boolean closeChannel() {
        Intent intentM87451a = m87451a();
        intentM87451a.setAction(AbstractC14991an.f63791i);
        return startServiceSafely(intentM87451a);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        resetConnection(str, str2, str3, str4, str5, z, m87458a(list), m87458a(list2));
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z, m87458a(list), m87458a(list2));
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return openChannel(str, str2, str3, str4, str5, m87458a(list), m87458a(list2), z);
    }

    @Deprecated
    public void updateChannelInfo(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        updateChannelInfo(str, m87458a(list), m87458a(list2));
    }

    /* JADX INFO: renamed from: a */
    private void m87460a(Context context) {
        try {
            mtq0.m160028d(context);
        } catch (Throwable th) {
            ouq0.m169393m("add network status listener failed:" + th);
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m87458a(List<NameValuePair> list) {
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
    private String m87456a(Map<String, String> map) {
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
    private boolean m87463a() {
        if (m6r0.f135025b) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f63589a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m87455a() {
        try {
            if (this.f63589a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                return "com.xiaomi.push.service.XMPushService";
            }
            return "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    /* JADX INFO: renamed from: a */
    private Intent m87451a() {
        if (isMiuiPushServiceEnabled()) {
            Intent intent = new Intent();
            intent.setPackage("com.xiaomi.xmsf");
            intent.setClassName("com.xiaomi.xmsf", m87455a());
            intent.putExtra(AbstractC14991an.f63770F, this.f63589a.getPackageName());
            m87459a();
            return intent;
        }
        Intent intent2 = new Intent(this.f63589a, (Class<?>) XMPushService.class);
        intent2.putExtra(AbstractC14991an.f63770F, this.f63589a.getPackageName());
        m87465b();
        return intent2;
    }

    /* JADX INFO: renamed from: a */
    private void m87459a() {
        this.f63589a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f63589a, (Class<?>) XMPushService.class), 2, 1);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m87461a(Intent intent) {
        try {
            if (this.f63594b) {
                Message messageM87452a = m87452a(intent);
                if (this.f63591a.size() >= 50) {
                    this.f63591a.remove(0);
                }
                this.f63591a.add(messageM87452a);
                return;
            }
            if (this.f63593b == null) {
                this.f63589a.bindService(intent, new ServiceConnection() { // from class: com.xiaomi.push.service.ServiceClient.2
                    @Override // android.content.ServiceConnection
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        synchronized (ServiceClient.this) {
                            ServiceClient.this.f63593b = new Messenger(iBinder);
                            ServiceClient.this.f63594b = false;
                            Iterator it = ServiceClient.this.f63591a.iterator();
                            while (it.hasNext()) {
                                try {
                                    ServiceClient.this.f63593b.send((Message) it.next());
                                } catch (RemoteException e) {
                                    ouq0.m169397q(e);
                                }
                            }
                            ServiceClient.this.f63591a.clear();
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public void onServiceDisconnected(ComponentName componentName) {
                        ServiceClient.this.f63593b = null;
                        ServiceClient.this.f63594b = false;
                    }
                }, 1);
                this.f63594b = true;
                this.f63591a.clear();
                this.f63591a.add(m87452a(intent));
            } else {
                try {
                    this.f63593b.send(m87452a(intent));
                } catch (RemoteException unused) {
                    this.f63593b = null;
                    this.f63594b = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private Message m87452a(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    public boolean sendMessage(f2r0 f2r0Var, boolean z) {
        if (!mtq0.m160044t(this.f63589a)) {
            return false;
        }
        Intent intentM87451a = m87451a();
        String strM218026a = yzq0.m218026a();
        if (!TextUtils.isEmpty(strM218026a)) {
            e2r0 e2r0Var = new e2r0(Constants.PARAM_PLATFORM_ID, null, null, null);
            e2r0 e2r0Var2 = new e2r0("sent", null, null, null);
            e2r0Var2.m119160f(strM218026a);
            e2r0Var.m119161g(e2r0Var2);
            f2r0Var.m128646i(e2r0Var);
        }
        Bundle bundleMo86748a = f2r0Var.mo86748a();
        if (bundleMo86748a == null) {
            return false;
        }
        ouq0.m169406z("SEND:" + f2r0Var.mo86749d());
        intentM87451a.setAction(AbstractC14991an.f63787e);
        intentM87451a.putExtra(AbstractC14991an.f63774J, f63586a);
        intentM87451a.putExtra("ext_packet", bundleMo86748a);
        intentM87451a.putExtra("ext_encrypt", z);
        return startServiceSafely(intentM87451a);
    }
}
